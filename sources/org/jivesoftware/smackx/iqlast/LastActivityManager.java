package org.jivesoftware.smackx.iqlast;

import java.util.Map;
import java.util.WeakHashMap;
import org.jivesoftware.smack.ConnectionCreationListener;
import org.jivesoftware.smack.Manager;
import org.jivesoftware.smack.SmackException.NoResponseException;
import org.jivesoftware.smack.SmackException.NotConnectedException;
import org.jivesoftware.smack.StanzaListener;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPConnectionRegistry;
import org.jivesoftware.smack.XMPPException.XMPPErrorException;
import org.jivesoftware.smack.filter.StanzaTypeFilter;
import org.jivesoftware.smack.iqrequest.AbstractIqRequestHandler;
import org.jivesoftware.smack.iqrequest.IQRequestHandler;
import org.jivesoftware.smack.packet.C15617IQ;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.packet.Message.Type;
import org.jivesoftware.smack.packet.Presence;
import org.jivesoftware.smack.packet.Presence.Mode;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smack.packet.XMPPError;
import org.jivesoftware.smack.packet.XMPPError.Condition;
import org.jivesoftware.smackx.disco.ServiceDiscoveryManager;
import org.jivesoftware.smackx.iqlast.packet.LastActivity;

public class LastActivityManager extends Manager {
    private static boolean enabledPerDefault = true;
    private static final Map<XMPPConnection, LastActivityManager> instances = new WeakHashMap();
    /* access modifiers changed from: private */
    public boolean enabled = false;
    private volatile long lastMessageSent;

    /* renamed from: org.jivesoftware.smackx.iqlast.LastActivityManager$5 */
    static /* synthetic */ class C156915 {
        static final /* synthetic */ int[] $SwitchMap$org$jivesoftware$smack$packet$Presence$Mode = new int[Mode.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                org.jivesoftware.smack.packet.Presence$Mode[] r0 = org.jivesoftware.smack.packet.Presence.Mode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$org$jivesoftware$smack$packet$Presence$Mode = r0
                int[] r0 = $SwitchMap$org$jivesoftware$smack$packet$Presence$Mode     // Catch:{ NoSuchFieldError -> 0x0014 }
                org.jivesoftware.smack.packet.Presence$Mode r1 = org.jivesoftware.smack.packet.Presence.Mode.available     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$org$jivesoftware$smack$packet$Presence$Mode     // Catch:{ NoSuchFieldError -> 0x001f }
                org.jivesoftware.smack.packet.Presence$Mode r1 = org.jivesoftware.smack.packet.Presence.Mode.chat     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smackx.iqlast.LastActivityManager.C156915.<clinit>():void");
        }
    }

    static {
        XMPPConnectionRegistry.addConnectionCreationListener(new ConnectionCreationListener() {
            public void connectionCreated(XMPPConnection xMPPConnection) {
                LastActivityManager.getInstanceFor(xMPPConnection);
            }
        });
    }

    private LastActivityManager(XMPPConnection xMPPConnection) {
        super(xMPPConnection);
        xMPPConnection.addPacketSendingListener(new StanzaListener() {
            public void processPacket(Stanza stanza) {
                Mode mode = ((Presence) stanza).getMode();
                if (mode != null) {
                    int i = C156915.$SwitchMap$org$jivesoftware$smack$packet$Presence$Mode[mode.ordinal()];
                    if (i == 1 || i == 2) {
                        LastActivityManager.this.resetIdleTime();
                    }
                }
            }
        }, StanzaTypeFilter.PRESENCE);
        xMPPConnection.addPacketSendingListener(new StanzaListener() {
            public void processPacket(Stanza stanza) {
                if (((Message) stanza).getType() != Type.error) {
                    LastActivityManager.this.resetIdleTime();
                }
            }
        }, StanzaTypeFilter.MESSAGE);
        C156904 r2 = new AbstractIqRequestHandler("query", LastActivity.NAMESPACE, C15617IQ.Type.get, IQRequestHandler.Mode.async) {
            public C15617IQ handleIQRequest(C15617IQ iq) {
                if (!LastActivityManager.this.enabled) {
                    return C15617IQ.createErrorResponse(iq, new XMPPError(Condition.not_acceptable));
                }
                LastActivity lastActivity = new LastActivity();
                lastActivity.setType(C15617IQ.Type.result);
                lastActivity.setTo(iq.getFrom());
                lastActivity.setFrom(iq.getTo());
                lastActivity.setStanzaId(iq.getStanzaId());
                lastActivity.setLastActivity(LastActivityManager.this.getIdleTime());
                return lastActivity;
            }
        };
        xMPPConnection.registerIQRequestHandler(r2);
        if (enabledPerDefault) {
            enable();
        }
        resetIdleTime();
        instances.put(xMPPConnection, this);
    }

    /* access modifiers changed from: private */
    public long getIdleTime() {
        return (System.currentTimeMillis() - this.lastMessageSent) / 1000;
    }

    public static synchronized LastActivityManager getInstanceFor(XMPPConnection xMPPConnection) {
        LastActivityManager lastActivityManager;
        synchronized (LastActivityManager.class) {
            lastActivityManager = (LastActivityManager) instances.get(xMPPConnection);
            if (lastActivityManager == null) {
                lastActivityManager = new LastActivityManager(xMPPConnection);
            }
        }
        return lastActivityManager;
    }

    /* access modifiers changed from: private */
    public void resetIdleTime() {
        this.lastMessageSent = System.currentTimeMillis();
    }

    public static void setEnabledPerDefault(boolean z) {
        enabledPerDefault = z;
    }

    public synchronized void disable() {
        ServiceDiscoveryManager.getInstanceFor(connection()).removeFeature(LastActivity.NAMESPACE);
        this.enabled = false;
    }

    public synchronized void enable() {
        ServiceDiscoveryManager.getInstanceFor(connection()).addFeature(LastActivity.NAMESPACE);
        this.enabled = true;
    }

    public LastActivity getLastActivity(String str) throws NoResponseException, XMPPErrorException, NotConnectedException {
        return (LastActivity) connection().createPacketCollectorAndSend(new LastActivity(str)).nextResultOrThrow();
    }

    public boolean isLastActivitySupported(String str) throws NoResponseException, XMPPErrorException, NotConnectedException {
        return ServiceDiscoveryManager.getInstanceFor(connection()).supportsFeature(str, LastActivity.NAMESPACE);
    }
}
