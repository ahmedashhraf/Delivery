package org.jivesoftware.smackx.commands;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jivesoftware.smack.ConnectionCreationListener;
import org.jivesoftware.smack.Manager;
import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.SmackException.NoResponseException;
import org.jivesoftware.smack.SmackException.NotConnectedException;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPConnectionRegistry;
import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smack.XMPPException.XMPPErrorException;
import org.jivesoftware.smack.iqrequest.AbstractIqRequestHandler;
import org.jivesoftware.smack.iqrequest.IQRequestHandler.Mode;
import org.jivesoftware.smack.packet.C15617IQ;
import org.jivesoftware.smack.packet.C15617IQ.Type;
import org.jivesoftware.smack.packet.XMPPError;
import org.jivesoftware.smack.packet.XMPPError.Condition;
import org.jivesoftware.smack.util.StringUtils;
import org.jivesoftware.smackx.commands.AdHocCommand.Action;
import org.jivesoftware.smackx.commands.AdHocCommand.SpecificErrorCondition;
import org.jivesoftware.smackx.commands.AdHocCommand.Status;
import org.jivesoftware.smackx.commands.packet.AdHocCommandData;
import org.jivesoftware.smackx.commands.packet.AdHocCommandData.SpecificError;
import org.jivesoftware.smackx.disco.AbstractNodeInformationProvider;
import org.jivesoftware.smackx.disco.ServiceDiscoveryManager;
import org.jivesoftware.smackx.disco.packet.DiscoverInfo.Identity;
import org.jivesoftware.smackx.disco.packet.DiscoverItems;
import org.jivesoftware.smackx.disco.packet.DiscoverItems.Item;
import org.jivesoftware.smackx.xdata.Form;

public class AdHocCommandManager extends Manager {
    /* access modifiers changed from: private */
    public static final Logger LOGGER = Logger.getLogger(AdHocCommandManager.class.getName());
    public static final String NAMESPACE = "http://jabber.org/protocol/commands";
    private static final int SESSION_TIMEOUT = 120;
    private static Map<XMPPConnection, AdHocCommandManager> instances = new WeakHashMap();
    private final Map<String, AdHocCommandInfo> commands = new ConcurrentHashMap();
    /* access modifiers changed from: private */
    public final Map<String, LocalCommand> executingCommands = new ConcurrentHashMap();
    private final ServiceDiscoveryManager serviceDiscoveryManager;
    private Thread sessionsSweeper;

    private static class AdHocCommandInfo {
        private LocalCommandFactory factory;
        private String name;
        private String node;
        private String ownerJID;

        public AdHocCommandInfo(String str, String str2, String str3, LocalCommandFactory localCommandFactory) {
            this.node = str;
            this.name = str2;
            this.ownerJID = str3;
            this.factory = localCommandFactory;
        }

        public LocalCommand getCommandInstance() throws InstantiationException, IllegalAccessException {
            return this.factory.getInstance();
        }

        public String getName() {
            return this.name;
        }

        public String getNode() {
            return this.node;
        }

        public String getOwnerJID() {
            return this.ownerJID;
        }
    }

    static {
        XMPPConnectionRegistry.addConnectionCreationListener(new ConnectionCreationListener() {
            public void connectionCreated(XMPPConnection xMPPConnection) {
                AdHocCommandManager.getAddHocCommandsManager(xMPPConnection);
            }
        });
    }

    private AdHocCommandManager(XMPPConnection xMPPConnection) {
        super(xMPPConnection);
        this.serviceDiscoveryManager = ServiceDiscoveryManager.getInstanceFor(xMPPConnection);
        String str = "http://jabber.org/protocol/commands";
        ServiceDiscoveryManager.getInstanceFor(xMPPConnection).addFeature(str);
        ServiceDiscoveryManager.getInstanceFor(xMPPConnection).setNodeInformationProvider(str, new AbstractNodeInformationProvider() {
            public List<Item> getNodeItems() {
                ArrayList arrayList = new ArrayList();
                for (AdHocCommandInfo adHocCommandInfo : AdHocCommandManager.this.getRegisteredCommands()) {
                    Item item = new Item(adHocCommandInfo.getOwnerJID());
                    item.setName(adHocCommandInfo.getName());
                    item.setNode(adHocCommandInfo.getNode());
                    arrayList.add(item);
                }
                return arrayList;
            }
        });
        C156703 r3 = new AbstractIqRequestHandler(AdHocCommandData.ELEMENT, "http://jabber.org/protocol/commands", Type.set, Mode.async) {
            public C15617IQ handleIQRequest(C15617IQ iq) {
                try {
                    return AdHocCommandManager.this.processAdHocCommand((AdHocCommandData) iq);
                } catch (NoResponseException | NotConnectedException e) {
                    AdHocCommandManager.LOGGER.log(Level.INFO, "processAdHocCommand threw exceptino", e);
                    return null;
                }
            }
        };
        xMPPConnection.registerIQRequestHandler(r3);
        this.sessionsSweeper = null;
    }

    public static synchronized AdHocCommandManager getAddHocCommandsManager(XMPPConnection xMPPConnection) {
        AdHocCommandManager adHocCommandManager;
        synchronized (AdHocCommandManager.class) {
            adHocCommandManager = (AdHocCommandManager) instances.get(xMPPConnection);
            if (adHocCommandManager == null) {
                adHocCommandManager = new AdHocCommandManager(xMPPConnection);
                instances.put(xMPPConnection, adHocCommandManager);
            }
        }
        return adHocCommandManager;
    }

    /* access modifiers changed from: private */
    public Collection<AdHocCommandInfo> getRegisteredCommands() {
        return this.commands.values();
    }

    private LocalCommand newInstanceOfCmd(String str, String str2) throws XMPPErrorException {
        AdHocCommandInfo adHocCommandInfo = (AdHocCommandInfo) this.commands.get(str);
        try {
            LocalCommand commandInstance = adHocCommandInfo.getCommandInstance();
            commandInstance.setSessionID(str2);
            commandInstance.setName(adHocCommandInfo.getName());
            commandInstance.setNode(adHocCommandInfo.getNode());
            return commandInstance;
        } catch (InstantiationException unused) {
            throw new XMPPErrorException(new XMPPError(Condition.internal_server_error));
        } catch (IllegalAccessException unused2) {
            throw new XMPPErrorException(new XMPPError(Condition.internal_server_error));
        }
    }

    /* access modifiers changed from: private */
    public C15617IQ processAdHocCommand(AdHocCommandData adHocCommandData) throws NoResponseException, NotConnectedException {
        AdHocCommandData adHocCommandData2 = new AdHocCommandData();
        adHocCommandData2.setTo(adHocCommandData.getFrom());
        adHocCommandData2.setStanzaId(adHocCommandData.getStanzaId());
        adHocCommandData2.setNode(adHocCommandData.getNode());
        adHocCommandData2.setId(adHocCommandData.getTo());
        String sessionID = adHocCommandData.getSessionID();
        String node = adHocCommandData.getNode();
        if (sessionID != null) {
            LocalCommand localCommand = (LocalCommand) this.executingCommands.get(sessionID);
            if (localCommand == null) {
                return respondError(adHocCommandData2, Condition.bad_request, SpecificErrorCondition.badSessionid);
            }
            if (System.currentTimeMillis() - localCommand.getCreationDate() > 120000) {
                this.executingCommands.remove(sessionID);
                return respondError(adHocCommandData2, Condition.not_allowed, SpecificErrorCondition.sessionExpired);
            }
            synchronized (localCommand) {
                Action action = adHocCommandData.getAction();
                if (action == null || !action.equals(Action.unknown)) {
                    if (action == null || Action.execute.equals(action)) {
                        action = localCommand.getExecuteAction();
                    }
                    if (!localCommand.isValidAction(action)) {
                        C15617IQ respondError = respondError(adHocCommandData2, Condition.bad_request, SpecificErrorCondition.badAction);
                        return respondError;
                    }
                    try {
                        adHocCommandData2.setType(Type.result);
                        localCommand.setData(adHocCommandData2);
                        if (Action.next.equals(action)) {
                            localCommand.incrementStage();
                            localCommand.next(new Form(adHocCommandData.getForm()));
                            if (localCommand.isLastStage()) {
                                adHocCommandData2.setStatus(Status.completed);
                            } else {
                                adHocCommandData2.setStatus(Status.executing);
                            }
                        } else if (Action.complete.equals(action)) {
                            localCommand.incrementStage();
                            localCommand.complete(new Form(adHocCommandData.getForm()));
                            adHocCommandData2.setStatus(Status.completed);
                            this.executingCommands.remove(sessionID);
                        } else if (Action.prev.equals(action)) {
                            localCommand.decrementStage();
                            localCommand.prev();
                        } else if (Action.cancel.equals(action)) {
                            localCommand.cancel();
                            adHocCommandData2.setStatus(Status.canceled);
                            this.executingCommands.remove(sessionID);
                        }
                        return adHocCommandData2;
                    } catch (XMPPErrorException e) {
                        XMPPError xMPPError = e.getXMPPError();
                        if (XMPPError.Type.CANCEL.equals(xMPPError.getType())) {
                            adHocCommandData2.setStatus(Status.canceled);
                            this.executingCommands.remove(sessionID);
                        }
                        return respondError(adHocCommandData2, xMPPError);
                    }
                } else {
                    C15617IQ respondError2 = respondError(adHocCommandData2, Condition.bad_request, SpecificErrorCondition.malformedAction);
                    return respondError2;
                }
            }
        } else if (!this.commands.containsKey(node)) {
            return respondError(adHocCommandData2, Condition.item_not_found);
        } else {
            String randomString = StringUtils.randomString(15);
            try {
                LocalCommand newInstanceOfCmd = newInstanceOfCmd(node, randomString);
                adHocCommandData2.setType(Type.result);
                newInstanceOfCmd.setData(adHocCommandData2);
                if (!newInstanceOfCmd.hasPermission(adHocCommandData.getFrom())) {
                    return respondError(adHocCommandData2, Condition.forbidden);
                }
                Action action2 = adHocCommandData.getAction();
                if (action2 != null && action2.equals(Action.unknown)) {
                    return respondError(adHocCommandData2, Condition.bad_request, SpecificErrorCondition.malformedAction);
                }
                if (action2 != null && !action2.equals(Action.execute)) {
                    return respondError(adHocCommandData2, Condition.bad_request, SpecificErrorCondition.badAction);
                }
                newInstanceOfCmd.incrementStage();
                newInstanceOfCmd.execute();
                if (newInstanceOfCmd.isLastStage()) {
                    adHocCommandData2.setStatus(Status.completed);
                } else {
                    adHocCommandData2.setStatus(Status.executing);
                    this.executingCommands.put(randomString, newInstanceOfCmd);
                    if (this.sessionsSweeper == null) {
                        this.sessionsSweeper = new Thread(new Runnable() {
                            public void run() {
                                while (true) {
                                    for (String str : AdHocCommandManager.this.executingCommands.keySet()) {
                                        LocalCommand localCommand = (LocalCommand) AdHocCommandManager.this.executingCommands.get(str);
                                        if (localCommand != null) {
                                            if (System.currentTimeMillis() - localCommand.getCreationDate() > 240000) {
                                                AdHocCommandManager.this.executingCommands.remove(str);
                                            }
                                        }
                                    }
                                    try {
                                        Thread.sleep(1000);
                                    } catch (InterruptedException unused) {
                                    }
                                }
                            }
                        });
                        this.sessionsSweeper.setDaemon(true);
                        this.sessionsSweeper.start();
                    }
                }
                return adHocCommandData2;
            } catch (XMPPErrorException e2) {
                XMPPError xMPPError2 = e2.getXMPPError();
                if (XMPPError.Type.CANCEL.equals(xMPPError2.getType())) {
                    adHocCommandData2.setStatus(Status.canceled);
                    this.executingCommands.remove(randomString);
                }
                return respondError(adHocCommandData2, xMPPError2);
            }
        }
    }

    private C15617IQ respondError(AdHocCommandData adHocCommandData, Condition condition) {
        return respondError(adHocCommandData, new XMPPError(condition));
    }

    public DiscoverItems discoverCommands(String str) throws XMPPException, SmackException {
        return this.serviceDiscoveryManager.discoverItems(str, "http://jabber.org/protocol/commands");
    }

    public RemoteCommand getRemoteCommand(String str, String str2) {
        return new RemoteCommand(connection(), str2, str);
    }

    public void publishCommands(String str) throws XMPPException, SmackException {
        DiscoverItems discoverItems = new DiscoverItems();
        for (AdHocCommandInfo adHocCommandInfo : getRegisteredCommands()) {
            Item item = new Item(adHocCommandInfo.getOwnerJID());
            item.setName(adHocCommandInfo.getName());
            item.setNode(adHocCommandInfo.getNode());
            discoverItems.addItem(item);
        }
        this.serviceDiscoveryManager.publishItems(str, "http://jabber.org/protocol/commands", discoverItems);
    }

    public void registerCommand(String str, String str2, final Class<? extends LocalCommand> cls) {
        registerCommand(str, str2, (LocalCommandFactory) new LocalCommandFactory() {
            public LocalCommand getInstance() throws InstantiationException, IllegalAccessException {
                return (LocalCommand) cls.newInstance();
            }
        });
    }

    private static C15617IQ respondError(AdHocCommandData adHocCommandData, Condition condition, SpecificErrorCondition specificErrorCondition) {
        return respondError(adHocCommandData, new XMPPError(condition, new SpecificError(specificErrorCondition)));
    }

    public void registerCommand(String str, final String str2, LocalCommandFactory localCommandFactory) {
        this.commands.put(str, new AdHocCommandInfo(str, str2, connection().getUser(), localCommandFactory));
        this.serviceDiscoveryManager.setNodeInformationProvider(str, new AbstractNodeInformationProvider() {
            public List<String> getNodeFeatures() {
                ArrayList arrayList = new ArrayList();
                arrayList.add("http://jabber.org/protocol/commands");
                arrayList.add("jabber:x:data");
                return arrayList;
            }

            public List<Identity> getNodeIdentities() {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new Identity("automation", str2, "command-node"));
                return arrayList;
            }
        });
    }

    private static C15617IQ respondError(AdHocCommandData adHocCommandData, XMPPError xMPPError) {
        adHocCommandData.setType(Type.error);
        adHocCommandData.setError(xMPPError);
        return adHocCommandData;
    }
}
