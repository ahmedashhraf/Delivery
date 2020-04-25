package org.jivesoftware.smack;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jivesoftware.smack.PacketCollector.Configuration;
import org.jivesoftware.smack.SmackException.AlreadyConnectedException;
import org.jivesoftware.smack.SmackException.AlreadyLoggedInException;
import org.jivesoftware.smack.SmackException.NoResponseException;
import org.jivesoftware.smack.SmackException.NotConnectedException;
import org.jivesoftware.smack.SmackException.ResourceBindingNotOfferedException;
import org.jivesoftware.smack.SmackException.SecurityRequiredException;
import org.jivesoftware.smack.XMPPConnection.FromMode;
import org.jivesoftware.smack.XMPPException.XMPPErrorException;
import org.jivesoftware.smack.compression.XMPPInputOutputStream;
import org.jivesoftware.smack.debugger.SmackDebugger;
import org.jivesoftware.smack.filter.IQReplyFilter;
import org.jivesoftware.smack.filter.StanzaFilter;
import org.jivesoftware.smack.filter.StanzaIdFilter;
import org.jivesoftware.smack.iqrequest.IQRequestHandler;
import org.jivesoftware.smack.iqrequest.IQRequestHandler.Mode;
import org.jivesoftware.smack.packet.Bind;
import org.jivesoftware.smack.packet.C15617IQ;
import org.jivesoftware.smack.packet.C15617IQ.Type;
import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.packet.PlainStreamElement;
import org.jivesoftware.smack.packet.Presence;
import org.jivesoftware.smack.packet.Session;
import org.jivesoftware.smack.packet.Session.Feature;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smack.packet.XMPPError;
import org.jivesoftware.smack.packet.XMPPError.Condition;
import org.jivesoftware.smack.parsing.ParsingExceptionCallback;
import org.jivesoftware.smack.parsing.UnparsablePacket;
import org.jivesoftware.smack.util.BoundedThreadPoolExecutor;
import org.jivesoftware.smack.util.DNSUtil;
import org.jivesoftware.smack.util.Objects;
import org.jivesoftware.smack.util.PacketParserUtils;
import org.jivesoftware.smack.util.ParserUtils;
import org.jivesoftware.smack.util.SmackExecutorThreadFactory;
import org.jivesoftware.smack.util.StringUtils;
import org.jivesoftware.smack.util.dns.HostAddress;
import org.xmlpull.v1.XmlPullParser;
import p205i.p486d.p487a.C14055b;

public abstract class AbstractXMPPConnection implements XMPPConnection {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    /* access modifiers changed from: private */
    public static final Logger LOGGER = Logger.getLogger(AbstractXMPPConnection.class.getName());
    private static final AtomicInteger connectionCounter = new AtomicInteger(0);
    private static boolean replyToUnknownIqDefault = true;
    private final Map<StanzaListener, ListenerWrapper> asyncRecvListeners = new LinkedHashMap();
    protected boolean authenticated;
    private final ExecutorService cachedExecutorService;
    private final Collection<PacketCollector> collectors = new ConcurrentLinkedQueue();
    protected XMPPInputOutputStream compressionHandler;
    protected final ConnectionConfiguration config;
    protected boolean connected = false;
    protected final int connectionCounterValue = connectionCounter.getAndIncrement();
    protected final Set<ConnectionListener> connectionListeners = new CopyOnWriteArraySet();
    protected final Lock connectionLock = new ReentrantLock();
    protected SmackDebugger debugger = null;
    private final BoundedThreadPoolExecutor executorService;
    private FromMode fromMode = FromMode.OMITTED;
    private final Map<String, IQRequestHandler> getIqRequestHandler;
    protected String host;
    protected List<HostAddress> hostAddresses;
    private final Map<StanzaListener, InterceptorWrapper> interceptors = new HashMap();
    /* access modifiers changed from: protected */
    public final SynchronizationPoint<Exception> lastFeaturesReceived = new SynchronizationPoint<>(this);
    private long lastStanzaReceived;
    private long packetReplyTimeout = ((long) SmackConfiguration.getDefaultPacketReplyTimeout());
    private ParsingExceptionCallback parsingExceptionCallback = SmackConfiguration.getDefaultParsingExceptionCallback();
    protected int port;
    protected Reader reader;
    private final ScheduledExecutorService removeCallbacksService;
    private boolean replyToUnkownIq;
    protected SASLAuthentication saslAuthentication = new SASLAuthentication(this);
    /* access modifiers changed from: protected */
    public final SynchronizationPoint<SmackException> saslFeatureReceived = new SynchronizationPoint<>(this);
    private final Map<StanzaListener, ListenerWrapper> sendListeners = new HashMap();
    private String serviceName;
    private final Map<String, IQRequestHandler> setIqRequestHandler;
    private final ExecutorService singleThreadedExecutorService;
    protected final Map<String, ExtensionElement> streamFeatures = new HashMap();
    /* access modifiers changed from: protected */
    public String streamId;
    private final Map<StanzaListener, ListenerWrapper> syncRecvListeners = new LinkedHashMap();
    private String usedPassword;
    private String usedResource;
    private String usedUsername;
    protected String user;
    protected boolean wasAuthenticated;
    /* access modifiers changed from: protected */
    public Writer writer;

    /* renamed from: org.jivesoftware.smack.AbstractXMPPConnection$9 */
    static /* synthetic */ class C156019 {
        static final /* synthetic */ int[] $SwitchMap$org$jivesoftware$smack$XMPPConnection$FromMode = new int[FromMode.values().length];

        /* renamed from: $SwitchMap$org$jivesoftware$smack$iqrequest$IQRequestHandler$Mode */
        static final /* synthetic */ int[] f44972xdbd7d2a3 = new int[Mode.values().length];
        static final /* synthetic */ int[] $SwitchMap$org$jivesoftware$smack$packet$IQ$Type = new int[Type.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|5|6|7|9|10|11|12|13|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0032 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0059 */
        static {
            /*
                org.jivesoftware.smack.iqrequest.IQRequestHandler$Mode[] r0 = org.jivesoftware.smack.iqrequest.IQRequestHandler.Mode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f44972xdbd7d2a3 = r0
                r0 = 1
                int[] r1 = f44972xdbd7d2a3     // Catch:{ NoSuchFieldError -> 0x0014 }
                org.jivesoftware.smack.iqrequest.IQRequestHandler$Mode r2 = org.jivesoftware.smack.iqrequest.IQRequestHandler.Mode.sync     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                r1 = 2
                int[] r2 = f44972xdbd7d2a3     // Catch:{ NoSuchFieldError -> 0x001f }
                org.jivesoftware.smack.iqrequest.IQRequestHandler$Mode r3 = org.jivesoftware.smack.iqrequest.IQRequestHandler.Mode.async     // Catch:{ NoSuchFieldError -> 0x001f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                org.jivesoftware.smack.packet.IQ$Type[] r2 = org.jivesoftware.smack.packet.C15617IQ.Type.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                $SwitchMap$org$jivesoftware$smack$packet$IQ$Type = r2
                int[] r2 = $SwitchMap$org$jivesoftware$smack$packet$IQ$Type     // Catch:{ NoSuchFieldError -> 0x0032 }
                org.jivesoftware.smack.packet.IQ$Type r3 = org.jivesoftware.smack.packet.C15617IQ.Type.set     // Catch:{ NoSuchFieldError -> 0x0032 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0032 }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                int[] r2 = $SwitchMap$org$jivesoftware$smack$packet$IQ$Type     // Catch:{ NoSuchFieldError -> 0x003c }
                org.jivesoftware.smack.packet.IQ$Type r3 = org.jivesoftware.smack.packet.C15617IQ.Type.get     // Catch:{ NoSuchFieldError -> 0x003c }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x003c }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x003c }
            L_0x003c:
                org.jivesoftware.smack.XMPPConnection$FromMode[] r2 = org.jivesoftware.smack.XMPPConnection.FromMode.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                $SwitchMap$org$jivesoftware$smack$XMPPConnection$FromMode = r2
                int[] r2 = $SwitchMap$org$jivesoftware$smack$XMPPConnection$FromMode     // Catch:{ NoSuchFieldError -> 0x004f }
                org.jivesoftware.smack.XMPPConnection$FromMode r3 = org.jivesoftware.smack.XMPPConnection.FromMode.OMITTED     // Catch:{ NoSuchFieldError -> 0x004f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x004f }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x004f }
            L_0x004f:
                int[] r0 = $SwitchMap$org$jivesoftware$smack$XMPPConnection$FromMode     // Catch:{ NoSuchFieldError -> 0x0059 }
                org.jivesoftware.smack.XMPPConnection$FromMode r2 = org.jivesoftware.smack.XMPPConnection.FromMode.USER     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                int[] r0 = $SwitchMap$org$jivesoftware$smack$XMPPConnection$FromMode     // Catch:{ NoSuchFieldError -> 0x0064 }
                org.jivesoftware.smack.XMPPConnection$FromMode r1 = org.jivesoftware.smack.XMPPConnection.FromMode.UNCHANGED     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smack.AbstractXMPPConnection.C156019.<clinit>():void");
        }
    }

    protected static class InterceptorWrapper {
        private final StanzaFilter packetFilter;
        private final StanzaListener packetInterceptor;

        public InterceptorWrapper(StanzaListener stanzaListener, StanzaFilter stanzaFilter) {
            this.packetInterceptor = stanzaListener;
            this.packetFilter = stanzaFilter;
        }

        public boolean filterMatches(Stanza stanza) {
            StanzaFilter stanzaFilter = this.packetFilter;
            return stanzaFilter == null || stanzaFilter.accept(stanza);
        }

        public StanzaListener getInterceptor() {
            return this.packetInterceptor;
        }
    }

    private class ListenerNotification implements Runnable {
        private final Stanza packet;

        public ListenerNotification(Stanza stanza) {
            this.packet = stanza;
        }

        public void run() {
            AbstractXMPPConnection.this.invokePacketCollectorsAndNotifyRecvListeners(this.packet);
        }
    }

    protected static class ListenerWrapper {
        private final StanzaFilter packetFilter;
        private final StanzaListener packetListener;

        public ListenerWrapper(StanzaListener stanzaListener, StanzaFilter stanzaFilter) {
            this.packetListener = stanzaListener;
            this.packetFilter = stanzaFilter;
        }

        public boolean filterMatches(Stanza stanza) {
            StanzaFilter stanzaFilter = this.packetFilter;
            return stanzaFilter == null || stanzaFilter.accept(stanza);
        }

        public StanzaListener getListener() {
            return this.packetListener;
        }
    }

    static {
        SmackConfiguration.getVersion();
    }

    protected AbstractXMPPConnection(ConnectionConfiguration connectionConfiguration) {
        BoundedThreadPoolExecutor boundedThreadPoolExecutor = new BoundedThreadPoolExecutor(1, 1, 0, TimeUnit.SECONDS, 100, new SmackExecutorThreadFactory(this.connectionCounterValue, "Incoming Processor"));
        this.executorService = boundedThreadPoolExecutor;
        this.removeCallbacksService = Executors.newSingleThreadScheduledExecutor(new SmackExecutorThreadFactory(this.connectionCounterValue, "Remove Callbacks"));
        this.cachedExecutorService = Executors.newCachedThreadPool(new SmackExecutorThreadFactory(this.connectionCounterValue, "Cached Executor"));
        this.singleThreadedExecutorService = Executors.newSingleThreadExecutor(new SmackExecutorThreadFactory(getConnectionCounter(), "Single Threaded Executor"));
        this.authenticated = false;
        this.wasAuthenticated = false;
        this.setIqRequestHandler = new HashMap();
        this.getIqRequestHandler = new HashMap();
        this.replyToUnkownIq = replyToUnknownIqDefault;
        this.config = connectionConfiguration;
    }

    private void addStreamFeature(ExtensionElement extensionElement) {
        this.streamFeatures.put(C14055b.m60641b(extensionElement.getElementName(), extensionElement.getNamespace()), extensionElement);
    }

    private void firePacketInterceptors(Stanza stanza) {
        LinkedList<StanzaListener> linkedList = new LinkedList<>();
        synchronized (this.interceptors) {
            for (InterceptorWrapper interceptorWrapper : this.interceptors.values()) {
                if (interceptorWrapper.filterMatches(stanza)) {
                    linkedList.add(interceptorWrapper.getInterceptor());
                }
            }
        }
        for (StanzaListener processPacket : linkedList) {
            try {
                processPacket.processPacket(stanza);
            } catch (Exception e) {
                LOGGER.log(Level.SEVERE, "Packet interceptor threw exception", e);
            }
        }
    }

    protected static Collection<ConnectionCreationListener> getConnectionCreationListeners() {
        return XMPPConnectionRegistry.getConnectionCreationListeners();
    }

    public static void setReplyToUnknownIqDefault(boolean z) {
        replyToUnknownIqDefault = z;
    }

    public void addAsyncStanzaListener(StanzaListener stanzaListener, StanzaFilter stanzaFilter) {
        if (stanzaListener != null) {
            ListenerWrapper listenerWrapper = new ListenerWrapper(stanzaListener, stanzaFilter);
            synchronized (this.asyncRecvListeners) {
                this.asyncRecvListeners.put(stanzaListener, listenerWrapper);
            }
            return;
        }
        throw new NullPointerException("Packet listener is null.");
    }

    public void addConnectionListener(ConnectionListener connectionListener) {
        if (connectionListener != null) {
            this.connectionListeners.add(connectionListener);
        }
    }

    public void addOneTimeSyncCallback(final StanzaListener stanzaListener, StanzaFilter stanzaFilter) {
        final C155997 r0 = new StanzaListener() {
            public void processPacket(Stanza stanza) throws NotConnectedException {
                try {
                    stanzaListener.processPacket(stanza);
                } finally {
                    AbstractXMPPConnection.this.removeSyncStanzaListener(this);
                }
            }
        };
        addSyncStanzaListener(r0, stanzaFilter);
        this.removeCallbacksService.schedule(new Runnable() {
            public void run() {
                AbstractXMPPConnection.this.removeSyncStanzaListener(r0);
            }
        }, getPacketReplyTimeout(), TimeUnit.MILLISECONDS);
    }

    public void addPacketInterceptor(StanzaListener stanzaListener, StanzaFilter stanzaFilter) {
        if (stanzaListener != null) {
            InterceptorWrapper interceptorWrapper = new InterceptorWrapper(stanzaListener, stanzaFilter);
            synchronized (this.interceptors) {
                this.interceptors.put(stanzaListener, interceptorWrapper);
            }
            return;
        }
        throw new NullPointerException("Packet interceptor is null.");
    }

    @Deprecated
    public void addPacketListener(StanzaListener stanzaListener, StanzaFilter stanzaFilter) {
        addAsyncStanzaListener(stanzaListener, stanzaFilter);
    }

    public void addPacketSendingListener(StanzaListener stanzaListener, StanzaFilter stanzaFilter) {
        if (stanzaListener != null) {
            ListenerWrapper listenerWrapper = new ListenerWrapper(stanzaListener, stanzaFilter);
            synchronized (this.sendListeners) {
                this.sendListeners.put(stanzaListener, listenerWrapper);
            }
            return;
        }
        throw new NullPointerException("Packet listener is null.");
    }

    public void addSyncStanzaListener(StanzaListener stanzaListener, StanzaFilter stanzaFilter) {
        if (stanzaListener != null) {
            ListenerWrapper listenerWrapper = new ListenerWrapper(stanzaListener, stanzaFilter);
            synchronized (this.syncRecvListeners) {
                this.syncRecvListeners.put(stanzaListener, listenerWrapper);
            }
            return;
        }
        throw new NullPointerException("Packet listener is null.");
    }

    /* access modifiers changed from: protected */
    public void afterFeaturesReceived() throws SecurityRequiredException, NotConnectedException {
    }

    /* access modifiers changed from: protected */
    public void afterSuccessfulLogin(boolean z) throws NotConnectedException {
        this.authenticated = true;
        if (this.config.isDebuggerEnabled()) {
            SmackDebugger smackDebugger = this.debugger;
            if (smackDebugger != null) {
                smackDebugger.userHasLogged(this.user);
            }
        }
        callConnectionAuthenticatedListener(z);
        if (this.config.isSendPresence() && !z) {
            sendStanza(new Presence(Presence.Type.available));
        }
    }

    /* access modifiers changed from: protected */
    public final void asyncGo(Runnable runnable) {
        this.cachedExecutorService.execute(runnable);
    }

    /* access modifiers changed from: protected */
    public void bindResourceAndEstablishSession(String str) throws XMPPErrorException, IOException, SmackException {
        LOGGER.finer("Waiting for last features to be received before continuing with resource binding");
        this.lastFeaturesReceived.checkIfSuccessOrWait();
        if (hasFeature(Bind.ELEMENT, Bind.NAMESPACE)) {
            Bind newSet = Bind.newSet(str);
            this.user = ((Bind) createPacketCollectorAndSend(new StanzaIdFilter((Stanza) newSet), newSet).nextResultOrThrow()).getJid();
            this.serviceName = C14055b.m60646f(this.user);
            Feature feature = (Feature) getFeature("session", Session.NAMESPACE);
            if (feature != null && !feature.isOptional() && !getConfiguration().isLegacySessionDisabled()) {
                Session session = new Session();
                createPacketCollectorAndSend(new StanzaIdFilter((Stanza) session), session).nextResultOrThrow();
                return;
            }
            return;
        }
        throw new ResourceBindingNotOfferedException();
    }

    /* access modifiers changed from: protected */
    public void callConnectionAuthenticatedListener(boolean z) {
        for (ConnectionListener authenticated2 : this.connectionListeners) {
            try {
                authenticated2.authenticated(this, z);
            } catch (Exception e) {
                LOGGER.log(Level.SEVERE, "Exception in authenticated listener", e);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void callConnectionClosedListener() {
        for (ConnectionListener connectionClosed : this.connectionListeners) {
            try {
                connectionClosed.connectionClosed();
            } catch (Exception e) {
                LOGGER.log(Level.SEVERE, "Error in listener while closing connection", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void callConnectionClosedOnErrorListener(Exception exc) {
        LOGGER.log(Level.WARNING, "Connection closed with error", exc);
        for (ConnectionListener connectionClosedOnError : this.connectionListeners) {
            try {
                connectionClosedOnError.connectionClosedOnError(exc);
            } catch (Exception e) {
                LOGGER.log(Level.SEVERE, "Error in listener while closing connection", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void callConnectionConnectedListener() {
        for (ConnectionListener connected2 : this.connectionListeners) {
            connected2.connected(this);
        }
    }

    public synchronized AbstractXMPPConnection connect() throws SmackException, IOException, XMPPException {
        throwAlreadyConnectedExceptionIfAppropriate();
        this.saslAuthentication.init();
        this.saslFeatureReceived.init();
        this.lastFeaturesReceived.init();
        this.streamId = null;
        connectInternal();
        return this;
    }

    /* access modifiers changed from: protected */
    public abstract void connectInternal() throws SmackException, IOException, XMPPException;

    public PacketCollector createPacketCollector(StanzaFilter stanzaFilter) {
        return createPacketCollector(PacketCollector.newConfiguration().setStanzaFilter(stanzaFilter));
    }

    public PacketCollector createPacketCollectorAndSend(C15617IQ iq) throws NotConnectedException {
        return createPacketCollectorAndSend(new IQReplyFilter(iq, this), iq);
    }

    public void disconnect() {
        try {
            disconnect(new Presence(Presence.Type.unavailable));
        } catch (NotConnectedException e) {
            LOGGER.log(Level.FINEST, "Connection is already disconnected", e);
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        Logger logger = LOGGER;
        StringBuilder sb = new StringBuilder();
        sb.append("finalizing XMPPConnection ( ");
        sb.append(getConnectionCounter());
        sb.append("): Shutting down executor services");
        logger.fine(sb.toString());
        try {
            this.executorService.shutdownNow();
            this.cachedExecutorService.shutdown();
            this.removeCallbacksService.shutdownNow();
            this.singleThreadedExecutorService.shutdownNow();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
        super.finalize();
    }

    /* access modifiers changed from: protected */
    public void firePacketSendingListeners(final Stanza stanza) {
        final LinkedList linkedList = new LinkedList();
        synchronized (this.sendListeners) {
            for (ListenerWrapper listenerWrapper : this.sendListeners.values()) {
                if (listenerWrapper.filterMatches(stanza)) {
                    linkedList.add(listenerWrapper.getListener());
                }
            }
        }
        if (!linkedList.isEmpty()) {
            asyncGo(new Runnable() {
                public void run() {
                    for (StanzaListener processPacket : linkedList) {
                        try {
                            processPacket.processPacket(stanza);
                        } catch (Exception e) {
                            AbstractXMPPConnection.LOGGER.log(Level.WARNING, "Sending listener threw exception", e);
                        }
                    }
                }
            });
        }
    }

    public ConnectionConfiguration getConfiguration() {
        return this.config;
    }

    public int getConnectionCounter() {
        return this.connectionCounterValue;
    }

    /* access modifiers changed from: protected */
    public Lock getConnectionLock() {
        return this.connectionLock;
    }

    public <F extends ExtensionElement> F getFeature(String str, String str2) {
        return (ExtensionElement) this.streamFeatures.get(C14055b.m60641b(str, str2));
    }

    public FromMode getFromMode() {
        return this.fromMode;
    }

    public String getHost() {
        return this.host;
    }

    public long getLastStanzaReceived() {
        return this.lastStanzaReceived;
    }

    public long getPacketReplyTimeout() {
        return this.packetReplyTimeout;
    }

    public ParsingExceptionCallback getParsingExceptionCallback() {
        return this.parsingExceptionCallback;
    }

    public int getPort() {
        return this.port;
    }

    /* access modifiers changed from: protected */
    public SASLAuthentication getSASLAuthentication() {
        return this.saslAuthentication;
    }

    public String getServiceName() {
        String str = this.serviceName;
        if (str != null) {
            return str;
        }
        return this.config.getServiceName();
    }

    public String getStreamId() {
        if (!isConnected()) {
            return null;
        }
        return this.streamId;
    }

    public final String getUser() {
        return this.user;
    }

    public boolean hasFeature(String str, String str2) {
        return getFeature(str, str2) != null;
    }

    /* access modifiers changed from: protected */
    public void initDebugger() {
        if (this.reader == null || this.writer == null) {
            throw new NullPointerException("Reader or writer isn't initialized.");
        } else if (this.config.isDebuggerEnabled()) {
            if (this.debugger == null) {
                this.debugger = SmackConfiguration.createDebugger(this, this.writer, this.reader);
            }
            SmackDebugger smackDebugger = this.debugger;
            if (smackDebugger == null) {
                LOGGER.severe("Debugging enabled but could not find debugger class");
                return;
            }
            this.reader = smackDebugger.newConnectionReader(this.reader);
            this.writer = this.debugger.newConnectionWriter(this.writer);
        }
    }

    /* access modifiers changed from: protected */
    public void invokePacketCollectorsAndNotifyRecvListeners(final Stanza stanza) {
        final IQRequestHandler iQRequestHandler;
        if (stanza instanceof C15617IQ) {
            final C15617IQ iq = (C15617IQ) stanza;
            Type type = iq.getType();
            int i = C156019.$SwitchMap$org$jivesoftware$smack$packet$IQ$Type[type.ordinal()];
            if (i == 1 || i == 2) {
                String b = C14055b.m60641b(iq.getChildElementName(), iq.getChildElementNamespace());
                int i2 = C156019.$SwitchMap$org$jivesoftware$smack$packet$IQ$Type[type.ordinal()];
                if (i2 == 1) {
                    synchronized (this.setIqRequestHandler) {
                        iQRequestHandler = (IQRequestHandler) this.setIqRequestHandler.get(b);
                    }
                } else if (i2 == 2) {
                    synchronized (this.getIqRequestHandler) {
                        iQRequestHandler = (IQRequestHandler) this.getIqRequestHandler.get(b);
                    }
                } else {
                    throw new IllegalStateException("Should only encounter IQ type 'get' or 'set'");
                }
                if (iQRequestHandler != null) {
                    ExecutorService executorService2 = null;
                    int i3 = C156019.f44972xdbd7d2a3[iQRequestHandler.getMode().ordinal()];
                    if (i3 == 1) {
                        executorService2 = this.singleThreadedExecutorService;
                    } else if (i3 == 2) {
                        executorService2 = this.cachedExecutorService;
                    }
                    executorService2.execute(new Runnable() {
                        public void run() {
                            C15617IQ handleIQRequest = iQRequestHandler.handleIQRequest(iq);
                            if (handleIQRequest != null) {
                                try {
                                    AbstractXMPPConnection.this.sendStanza(handleIQRequest);
                                } catch (NotConnectedException e) {
                                    AbstractXMPPConnection.LOGGER.log(Level.WARNING, "NotConnectedException while sending response to IQ request", e);
                                }
                            }
                        }
                    });
                    return;
                } else if (this.replyToUnkownIq) {
                    try {
                        sendStanza(C15617IQ.createErrorResponse(iq, new XMPPError(Condition.feature_not_implemented)));
                    } catch (NotConnectedException e) {
                        LOGGER.log(Level.WARNING, "NotConnectedException while sending error IQ to unkown IQ request", e);
                    }
                } else {
                    return;
                }
            }
        }
        final LinkedList<StanzaListener> linkedList = new LinkedList<>();
        synchronized (this.asyncRecvListeners) {
            for (ListenerWrapper listenerWrapper : this.asyncRecvListeners.values()) {
                if (listenerWrapper.filterMatches(stanza)) {
                    linkedList.add(listenerWrapper.getListener());
                }
            }
        }
        for (final StanzaListener stanzaListener : linkedList) {
            asyncGo(new Runnable() {
                public void run() {
                    try {
                        stanzaListener.processPacket(stanza);
                    } catch (Exception e) {
                        AbstractXMPPConnection.LOGGER.log(Level.SEVERE, "Exception in async packet listener", e);
                    }
                }
            });
        }
        for (PacketCollector processPacket : this.collectors) {
            processPacket.processPacket(stanza);
        }
        linkedList.clear();
        synchronized (this.syncRecvListeners) {
            for (ListenerWrapper listenerWrapper2 : this.syncRecvListeners.values()) {
                if (listenerWrapper2.filterMatches(stanza)) {
                    linkedList.add(listenerWrapper2.getListener());
                }
            }
        }
        this.singleThreadedExecutorService.execute(new Runnable() {
            public void run() {
                for (StanzaListener processPacket : linkedList) {
                    try {
                        processPacket.processPacket(stanza);
                    } catch (NotConnectedException e) {
                        AbstractXMPPConnection.LOGGER.log(Level.WARNING, "Got not connected exception, aborting", e);
                        return;
                    } catch (Exception e2) {
                        AbstractXMPPConnection.LOGGER.log(Level.SEVERE, "Exception in packet listener", e2);
                    }
                }
            }
        });
    }

    public final boolean isAnonymous() {
        return this.config.getUsername() == null && this.usedUsername == null && !this.config.allowNullOrEmptyUsername;
    }

    public final boolean isAuthenticated() {
        return this.authenticated;
    }

    public final boolean isConnected() {
        return this.connected;
    }

    public abstract boolean isSecureConnection();

    public abstract boolean isUsingCompression();

    public synchronized void login() throws XMPPException, SmackException, IOException {
        if (isAnonymous()) {
            throwNotConnectedExceptionIfAppropriate("Did you call connect() before login()?");
            throwAlreadyLoggedInExceptionIfAppropriate();
            loginAnonymously();
        } else {
            login(this.usedUsername != null ? this.usedUsername : this.config.getUsername(), this.usedPassword != null ? this.usedPassword : this.config.getPassword(), this.usedResource != null ? this.usedResource : this.config.getResource());
        }
    }

    /* access modifiers changed from: protected */
    public abstract void loginAnonymously() throws XMPPException, SmackException, IOException;

    /* access modifiers changed from: protected */
    public abstract void loginNonAnonymously(String str, String str2, String str3) throws XMPPException, SmackException, IOException;

    /* access modifiers changed from: protected */
    public void notifyReconnection() {
        for (ConnectionListener reconnectionSuccessful : this.connectionListeners) {
            try {
                reconnectionSuccessful.reconnectionSuccessful();
            } catch (Exception e) {
                LOGGER.log(Level.WARNING, "notifyReconnection()", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void parseAndProcessStanza(XmlPullParser xmlPullParser) throws Exception {
        Stanza stanza;
        ParserUtils.assertAtStartTag(xmlPullParser);
        int depth = xmlPullParser.getDepth();
        try {
            stanza = PacketParserUtils.parseStanza(xmlPullParser);
        } catch (Exception e) {
            UnparsablePacket unparsablePacket = new UnparsablePacket(PacketParserUtils.parseContentDepth(xmlPullParser, depth), e);
            ParsingExceptionCallback parsingExceptionCallback2 = getParsingExceptionCallback();
            if (parsingExceptionCallback2 != null) {
                parsingExceptionCallback2.handleUnparsablePacket(unparsablePacket);
            }
            stanza = null;
        }
        ParserUtils.assertAtEndTag(xmlPullParser);
        if (stanza != null) {
            processPacket(stanza);
        }
    }

    /* access modifiers changed from: protected */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void parseFeatures(org.xmlpull.v1.XmlPullParser r15) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, org.jivesoftware.smack.SmackException {
        /*
            r14 = this;
            java.util.Map<java.lang.String, org.jivesoftware.smack.packet.ExtensionElement> r0 = r14.streamFeatures
            r0.clear()
            int r0 = r15.getDepth()
        L_0x0009:
            int r1 = r15.next()
            java.lang.String r2 = "compression"
            java.lang.String r3 = "starttls"
            java.lang.String r4 = "bind"
            java.lang.String r5 = "mechanisms"
            r6 = 3
            r7 = 2
            if (r1 != r7) goto L_0x0099
            int r8 = r15.getDepth()
            int r9 = r0 + 1
            if (r8 != r9) goto L_0x0099
            r1 = 0
            java.lang.String r8 = r15.getName()
            java.lang.String r9 = r15.getNamespace()
            r10 = -1
            int r11 = r8.hashCode()
            r12 = 4
            r13 = 1
            switch(r11) {
                case -676919238: goto L_0x0057;
                case 3023933: goto L_0x004f;
                case 1316817241: goto L_0x0047;
                case 1431984486: goto L_0x003f;
                case 1984987798: goto L_0x0035;
                default: goto L_0x0034;
            }
        L_0x0034:
            goto L_0x005f
        L_0x0035:
            java.lang.String r2 = "session"
            boolean r2 = r8.equals(r2)
            if (r2 == 0) goto L_0x005f
            r2 = 3
            goto L_0x0060
        L_0x003f:
            boolean r2 = r8.equals(r2)
            if (r2 == 0) goto L_0x005f
            r2 = 4
            goto L_0x0060
        L_0x0047:
            boolean r2 = r8.equals(r3)
            if (r2 == 0) goto L_0x005f
            r2 = 0
            goto L_0x0060
        L_0x004f:
            boolean r2 = r8.equals(r4)
            if (r2 == 0) goto L_0x005f
            r2 = 2
            goto L_0x0060
        L_0x0057:
            boolean r2 = r8.equals(r5)
            if (r2 == 0) goto L_0x005f
            r2 = 1
            goto L_0x0060
        L_0x005f:
            r2 = -1
        L_0x0060:
            if (r2 == 0) goto L_0x008e
            if (r2 == r13) goto L_0x0084
            if (r2 == r7) goto L_0x0081
            if (r2 == r6) goto L_0x007c
            if (r2 == r12) goto L_0x0077
            org.jivesoftware.smack.provider.ExtensionElementProvider r2 = org.jivesoftware.smack.provider.ProviderManager.getStreamFeatureProvider(r8, r9)
            if (r2 == 0) goto L_0x0092
            org.jivesoftware.smack.packet.Element r1 = r2.parse(r15)
            org.jivesoftware.smack.packet.ExtensionElement r1 = (org.jivesoftware.smack.packet.ExtensionElement) r1
            goto L_0x0092
        L_0x0077:
            org.jivesoftware.smack.compress.packet.Compress$Feature r1 = org.jivesoftware.smack.util.PacketParserUtils.parseCompressionFeature(r15)
            goto L_0x0092
        L_0x007c:
            org.jivesoftware.smack.packet.Session$Feature r1 = org.jivesoftware.smack.util.PacketParserUtils.parseSessionFeature(r15)
            goto L_0x0092
        L_0x0081:
            org.jivesoftware.smack.packet.Bind$Feature r1 = org.jivesoftware.smack.packet.Bind.Feature.INSTANCE
            goto L_0x0092
        L_0x0084:
            org.jivesoftware.smack.packet.Mechanisms r1 = new org.jivesoftware.smack.packet.Mechanisms
            java.util.Collection r2 = org.jivesoftware.smack.util.PacketParserUtils.parseMechanisms(r15)
            r1.<init>(r2)
            goto L_0x0092
        L_0x008e:
            org.jivesoftware.smack.packet.StartTls r1 = org.jivesoftware.smack.util.PacketParserUtils.parseStartTlsFeature(r15)
        L_0x0092:
            if (r1 == 0) goto L_0x0009
            r14.addStreamFeature(r1)
            goto L_0x0009
        L_0x0099:
            if (r1 != r6) goto L_0x0009
            int r1 = r15.getDepth()
            if (r1 != r0) goto L_0x0009
            java.lang.String r15 = "urn:ietf:params:xml:ns:xmpp-sasl"
            boolean r15 = r14.hasFeature(r5, r15)
            if (r15 == 0) goto L_0x00c0
            java.lang.String r15 = "urn:ietf:params:xml:ns:xmpp-tls"
            boolean r15 = r14.hasFeature(r3, r15)
            if (r15 == 0) goto L_0x00bb
            org.jivesoftware.smack.ConnectionConfiguration r15 = r14.config
            org.jivesoftware.smack.ConnectionConfiguration$SecurityMode r15 = r15.getSecurityMode()
            org.jivesoftware.smack.ConnectionConfiguration$SecurityMode r0 = org.jivesoftware.smack.ConnectionConfiguration.SecurityMode.disabled
            if (r15 != r0) goto L_0x00c0
        L_0x00bb:
            org.jivesoftware.smack.SynchronizationPoint<org.jivesoftware.smack.SmackException> r15 = r14.saslFeatureReceived
            r15.reportSuccess()
        L_0x00c0:
            java.lang.String r15 = "urn:ietf:params:xml:ns:xmpp-bind"
            boolean r15 = r14.hasFeature(r4, r15)
            if (r15 == 0) goto L_0x00dd
            java.lang.String r15 = "http://jabber.org/protocol/compress"
            boolean r15 = r14.hasFeature(r2, r15)
            if (r15 == 0) goto L_0x00d8
            org.jivesoftware.smack.ConnectionConfiguration r15 = r14.config
            boolean r15 = r15.isCompressionEnabled()
            if (r15 != 0) goto L_0x00dd
        L_0x00d8:
            org.jivesoftware.smack.SynchronizationPoint<java.lang.Exception> r15 = r14.lastFeaturesReceived
            r15.reportSuccess()
        L_0x00dd:
            r14.afterFeaturesReceived()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smack.AbstractXMPPConnection.parseFeatures(org.xmlpull.v1.XmlPullParser):void");
    }

    /* access modifiers changed from: protected */
    public List<HostAddress> populateHostAddresses() {
        LinkedList linkedList = new LinkedList();
        ConnectionConfiguration connectionConfiguration = this.config;
        if (connectionConfiguration.host != null) {
            this.hostAddresses = new ArrayList(1);
            ConnectionConfiguration connectionConfiguration2 = this.config;
            this.hostAddresses.add(new HostAddress(connectionConfiguration2.host, connectionConfiguration2.port));
        } else {
            this.hostAddresses = DNSUtil.resolveXMPPDomain(connectionConfiguration.serviceName, linkedList);
        }
        return linkedList;
    }

    /* access modifiers changed from: protected */
    public void processPacket(Stanza stanza) throws InterruptedException {
        this.lastStanzaReceived = System.currentTimeMillis();
        this.executorService.executeBlocking(new ListenerNotification(stanza));
    }

    public IQRequestHandler registerIQRequestHandler(IQRequestHandler iQRequestHandler) {
        IQRequestHandler iQRequestHandler2;
        IQRequestHandler iQRequestHandler3;
        String b = C14055b.m60641b(iQRequestHandler.getElement(), iQRequestHandler.getNamespace());
        int i = C156019.$SwitchMap$org$jivesoftware$smack$packet$IQ$Type[iQRequestHandler.getType().ordinal()];
        if (i == 1) {
            synchronized (this.setIqRequestHandler) {
                iQRequestHandler2 = (IQRequestHandler) this.setIqRequestHandler.put(b, iQRequestHandler);
            }
            return iQRequestHandler2;
        } else if (i == 2) {
            synchronized (this.getIqRequestHandler) {
                iQRequestHandler3 = (IQRequestHandler) this.getIqRequestHandler.put(b, iQRequestHandler);
            }
            return iQRequestHandler3;
        } else {
            throw new IllegalArgumentException("Only IQ type of 'get' and 'set' allowed");
        }
    }

    public boolean removeAsyncStanzaListener(StanzaListener stanzaListener) {
        boolean z;
        synchronized (this.asyncRecvListeners) {
            z = this.asyncRecvListeners.remove(stanzaListener) != null;
        }
        return z;
    }

    public void removeConnectionListener(ConnectionListener connectionListener) {
        this.connectionListeners.remove(connectionListener);
    }

    public void removePacketCollector(PacketCollector packetCollector) {
        this.collectors.remove(packetCollector);
    }

    public void removePacketInterceptor(StanzaListener stanzaListener) {
        synchronized (this.interceptors) {
            this.interceptors.remove(stanzaListener);
        }
    }

    @Deprecated
    public boolean removePacketListener(StanzaListener stanzaListener) {
        return removeAsyncStanzaListener(stanzaListener);
    }

    public void removePacketSendingListener(StanzaListener stanzaListener) {
        synchronized (this.sendListeners) {
            this.sendListeners.remove(stanzaListener);
        }
    }

    public boolean removeSyncStanzaListener(StanzaListener stanzaListener) {
        boolean z;
        synchronized (this.syncRecvListeners) {
            z = this.syncRecvListeners.remove(stanzaListener) != null;
        }
        return z;
    }

    /* access modifiers changed from: protected */
    public final ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.removeCallbacksService.schedule(runnable, j, timeUnit);
    }

    public abstract void send(PlainStreamElement plainStreamElement) throws NotConnectedException;

    public void sendIqWithResponseCallback(C15617IQ iq, StanzaListener stanzaListener) throws NotConnectedException {
        sendIqWithResponseCallback(iq, stanzaListener, null);
    }

    @Deprecated
    public void sendPacket(Stanza stanza) throws NotConnectedException {
        sendStanza(stanza);
    }

    public void sendStanza(Stanza stanza) throws NotConnectedException {
        Objects.requireNonNull(stanza, "Packet must not be null");
        throwNotConnectedExceptionIfAppropriate();
        int i = C156019.$SwitchMap$org$jivesoftware$smack$XMPPConnection$FromMode[this.fromMode.ordinal()];
        if (i == 1) {
            stanza.setFrom(null);
        } else if (i == 2) {
            stanza.setFrom(getUser());
        }
        firePacketInterceptors(stanza);
        sendStanzaInternal(stanza);
    }

    /* access modifiers changed from: protected */
    public abstract void sendStanzaInternal(Stanza stanza) throws NotConnectedException;

    public void sendStanzaWithResponseCallback(Stanza stanza, StanzaFilter stanzaFilter, StanzaListener stanzaListener) throws NotConnectedException {
        sendStanzaWithResponseCallback(stanza, stanzaFilter, stanzaListener, null);
    }

    public void setFromMode(FromMode fromMode2) {
        this.fromMode = fromMode2;
    }

    public void setPacketReplyTimeout(long j) {
        this.packetReplyTimeout = j;
    }

    public void setParsingExceptionCallback(ParsingExceptionCallback parsingExceptionCallback2) {
        this.parsingExceptionCallback = parsingExceptionCallback2;
    }

    public void setReplyToUnknownIq(boolean z) {
        this.replyToUnkownIq = z;
    }

    /* access modifiers changed from: protected */
    public void setWasAuthenticated() {
        if (!this.wasAuthenticated) {
            this.wasAuthenticated = this.authenticated;
        }
    }

    /* access modifiers changed from: protected */
    public abstract void shutdown();

    /* access modifiers changed from: protected */
    public void throwAlreadyConnectedExceptionIfAppropriate() throws AlreadyConnectedException {
        if (isConnected()) {
            throw new AlreadyConnectedException();
        }
    }

    /* access modifiers changed from: protected */
    public void throwAlreadyLoggedInExceptionIfAppropriate() throws AlreadyLoggedInException {
        if (isAuthenticated()) {
            throw new AlreadyLoggedInException();
        }
    }

    /* access modifiers changed from: protected */
    public void throwNotConnectedExceptionIfAppropriate() throws NotConnectedException {
        throwNotConnectedExceptionIfAppropriate(null);
    }

    public final IQRequestHandler unregisterIQRequestHandler(IQRequestHandler iQRequestHandler) {
        return unregisterIQRequestHandler(iQRequestHandler.getElement(), iQRequestHandler.getNamespace(), iQRequestHandler.getType());
    }

    public void sendIqWithResponseCallback(C15617IQ iq, StanzaListener stanzaListener, ExceptionCallback exceptionCallback) throws NotConnectedException {
        sendIqWithResponseCallback(iq, stanzaListener, exceptionCallback, getPacketReplyTimeout());
    }

    public void sendStanzaWithResponseCallback(Stanza stanza, StanzaFilter stanzaFilter, StanzaListener stanzaListener, ExceptionCallback exceptionCallback) throws NotConnectedException {
        sendStanzaWithResponseCallback(stanza, stanzaFilter, stanzaListener, exceptionCallback, getPacketReplyTimeout());
    }

    /* access modifiers changed from: protected */
    public void throwNotConnectedExceptionIfAppropriate(String str) throws NotConnectedException {
        if (!isConnected()) {
            throw new NotConnectedException(str);
        }
    }

    public IQRequestHandler unregisterIQRequestHandler(String str, String str2, Type type) {
        IQRequestHandler iQRequestHandler;
        IQRequestHandler iQRequestHandler2;
        String b = C14055b.m60641b(str, str2);
        int i = C156019.$SwitchMap$org$jivesoftware$smack$packet$IQ$Type[type.ordinal()];
        if (i == 1) {
            synchronized (this.setIqRequestHandler) {
                iQRequestHandler = (IQRequestHandler) this.setIqRequestHandler.remove(b);
            }
            return iQRequestHandler;
        } else if (i == 2) {
            synchronized (this.getIqRequestHandler) {
                iQRequestHandler2 = (IQRequestHandler) this.getIqRequestHandler.remove(b);
            }
            return iQRequestHandler2;
        } else {
            throw new IllegalArgumentException("Only IQ type of 'get' and 'set' allowed");
        }
    }

    public PacketCollector createPacketCollector(Configuration configuration) {
        PacketCollector packetCollector = new PacketCollector(this, configuration);
        this.collectors.add(packetCollector);
        return packetCollector;
    }

    public PacketCollector createPacketCollectorAndSend(StanzaFilter stanzaFilter, Stanza stanza) throws NotConnectedException {
        PacketCollector createPacketCollector = createPacketCollector(stanzaFilter);
        try {
            sendStanza(stanza);
            return createPacketCollector;
        } catch (RuntimeException | NotConnectedException e) {
            createPacketCollector.cancel();
            throw e;
        }
    }

    public synchronized void disconnect(Presence presence) throws NotConnectedException {
        sendStanza(presence);
        shutdown();
        callConnectionClosedListener();
    }

    public void sendIqWithResponseCallback(C15617IQ iq, StanzaListener stanzaListener, ExceptionCallback exceptionCallback, long j) throws NotConnectedException {
        sendStanzaWithResponseCallback(iq, new IQReplyFilter(iq, this), stanzaListener, exceptionCallback, j);
    }

    public void sendStanzaWithResponseCallback(Stanza stanza, final StanzaFilter stanzaFilter, final StanzaListener stanzaListener, final ExceptionCallback exceptionCallback, long j) throws NotConnectedException {
        Objects.requireNonNull(stanza, "stanza must not be null");
        Objects.requireNonNull(stanzaFilter, "replyFilter must not be null");
        Objects.requireNonNull(stanzaListener, "callback must not be null");
        final C155975 r0 = new StanzaListener() {
            public void processPacket(Stanza stanza) throws NotConnectedException {
                try {
                    XMPPErrorException.ifHasErrorThenThrow(stanza);
                    stanzaListener.processPacket(stanza);
                } catch (XMPPErrorException e) {
                    if (exceptionCallback != null) {
                        exceptionCallback.processException(e);
                    }
                } catch (Throwable th) {
                    AbstractXMPPConnection.this.removeAsyncStanzaListener(this);
                    throw th;
                }
                AbstractXMPPConnection.this.removeAsyncStanzaListener(this);
            }
        };
        this.removeCallbacksService.schedule(new Runnable() {
            public void run() {
                if (AbstractXMPPConnection.this.removeAsyncStanzaListener(r0)) {
                    ExceptionCallback exceptionCallback = exceptionCallback;
                    if (exceptionCallback != null) {
                        exceptionCallback.processException(NoResponseException.newWith((XMPPConnection) AbstractXMPPConnection.this, stanzaFilter));
                    }
                }
            }
        }, j, TimeUnit.MILLISECONDS);
        addAsyncStanzaListener(r0, stanzaFilter);
        sendStanza(stanza);
    }

    public synchronized void login(CharSequence charSequence, String str) throws XMPPException, SmackException, IOException {
        login(charSequence, str, this.config.getResource());
    }

    public synchronized void login(CharSequence charSequence, String str, String str2) throws XMPPException, SmackException, IOException {
        if (!this.config.allowNullOrEmptyUsername) {
            StringUtils.requireNotNullOrEmpty(charSequence, "Username must not be null or empty");
        }
        throwNotConnectedExceptionIfAppropriate();
        throwAlreadyLoggedInExceptionIfAppropriate();
        this.usedUsername = charSequence != null ? charSequence.toString() : null;
        this.usedPassword = str;
        this.usedResource = str2;
        loginNonAnonymously(this.usedUsername, this.usedPassword, this.usedResource);
    }
}
