package org.jivesoftware.smack.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import org.jivesoftware.smack.AbstractConnectionListener;
import org.jivesoftware.smack.AbstractXMPPConnection;
import org.jivesoftware.smack.ConnectionConfiguration.SecurityMode;
import org.jivesoftware.smack.ConnectionCreationListener;
import org.jivesoftware.smack.SmackConfiguration;
import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.SmackException.AlreadyConnectedException;
import org.jivesoftware.smack.SmackException.AlreadyLoggedInException;
import org.jivesoftware.smack.SmackException.ConnectionException;
import org.jivesoftware.smack.SmackException.NoResponseException;
import org.jivesoftware.smack.SmackException.NotConnectedException;
import org.jivesoftware.smack.SmackException.SecurityRequiredByClientException;
import org.jivesoftware.smack.SmackException.SecurityRequiredByServerException;
import org.jivesoftware.smack.SmackException.SecurityRequiredException;
import org.jivesoftware.smack.StanzaListener;
import org.jivesoftware.smack.SynchronizationPoint;
import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smack.XMPPException.StreamErrorException;
import org.jivesoftware.smack.compress.packet.Compress;
import org.jivesoftware.smack.compress.packet.Compress.Feature;
import org.jivesoftware.smack.compression.XMPPInputOutputStream;
import org.jivesoftware.smack.filter.StanzaFilter;
import org.jivesoftware.smack.p557sm.SMUtils;
import org.jivesoftware.smack.p557sm.StreamManagementException.StreamManagementCounterError;
import org.jivesoftware.smack.p557sm.StreamManagementException.StreamManagementNotEnabledException;
import org.jivesoftware.smack.p557sm.packet.StreamManagement;
import org.jivesoftware.smack.p557sm.packet.StreamManagement.AckAnswer;
import org.jivesoftware.smack.p557sm.packet.StreamManagement.AckRequest;
import org.jivesoftware.smack.p557sm.packet.StreamManagement.Enable;
import org.jivesoftware.smack.p557sm.packet.StreamManagement.Resume;
import org.jivesoftware.smack.p557sm.packet.StreamManagement.StreamManagementFeature;
import org.jivesoftware.smack.p557sm.predicates.Predicate;
import org.jivesoftware.smack.packet.Element;
import org.jivesoftware.smack.packet.PlainStreamElement;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smack.packet.StartTls;
import org.jivesoftware.smack.packet.StreamOpen;
import org.jivesoftware.smack.tcp.XMPPTCPConnectionConfiguration.Builder;
import org.jivesoftware.smack.util.ArrayBlockingQueueWithShutdown;
import org.jivesoftware.smack.util.Async;
import org.jivesoftware.smack.util.PacketParserUtils;
import org.jivesoftware.smack.util.StringUtils;
import org.jivesoftware.smack.util.dns.HostAddress;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p205i.p486d.p487a.C14055b;

public class XMPPTCPConnection extends AbstractXMPPConnection {
    /* access modifiers changed from: private */
    public static final Logger LOGGER = Logger.getLogger(XMPPTCPConnection.class.getName());
    private static final int QUEUE_SIZE = 500;
    private static BundleAndDeferCallback defaultBundleAndDeferCallback;
    private static boolean useSmDefault = false;
    private static boolean useSmResumptionDefault = true;
    /* access modifiers changed from: private */
    public BundleAndDeferCallback bundleAndDeferCallback;
    /* access modifiers changed from: private */
    public long clientHandledStanzasCount;
    /* access modifiers changed from: private */
    public final SynchronizationPoint<XMPPException> compressSyncPoint;
    /* access modifiers changed from: private */
    public final XMPPTCPConnectionConfiguration config;
    private boolean disconnectedButResumeable;
    /* access modifiers changed from: private */
    public final SynchronizationPoint<Exception> initalOpenStreamSend;
    private final SynchronizationPoint<XMPPException> maybeCompressFeaturesReceived;
    protected PacketReader packetReader;
    protected PacketWriter packetWriter;
    private final Set<StanzaFilter> requestAckPredicates;
    private long serverHandledStanzasCount;
    private int smClientMaxResumptionTime;
    /* access modifiers changed from: private */
    public final SynchronizationPoint<XMPPException> smEnabledSyncPoint;
    /* access modifiers changed from: private */
    public final SynchronizationPoint<XMPPException> smResumedSyncPoint;
    /* access modifiers changed from: private */
    public int smServerMaxResumptimTime;
    /* access modifiers changed from: private */
    public String smSessionId;
    /* access modifiers changed from: private */
    public boolean smWasEnabledAtLeastOnce;
    private Socket socket;
    private volatile boolean socketClosed;
    /* access modifiers changed from: private */
    public final Collection<StanzaListener> stanzaAcknowledgedListeners;
    /* access modifiers changed from: private */
    public final Map<String, StanzaListener> stanzaIdAcknowledgedListeners;
    /* access modifiers changed from: private */
    public BlockingQueue<Stanza> unacknowledgedStanzas;
    private boolean useSm;
    private boolean useSmResumption;
    private boolean usingTLS;

    protected class PacketReader {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        /* access modifiers changed from: private */
        public volatile boolean done;
        XmlPullParser parser;

        protected PacketReader() {
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Removed duplicated region for block: B:124:0x02ee A[Catch:{ all -> 0x0389, Exception -> 0x032b, Exception -> 0x03be }] */
        /* JADX WARNING: Removed duplicated region for block: B:164:0x0317 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void parsePackets() {
            /*
                r9 = this;
                java.lang.String r0 = ""
                org.jivesoftware.smack.tcp.XMPPTCPConnection r1 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this     // Catch:{ Exception -> 0x03be }
                org.jivesoftware.smack.SynchronizationPoint r1 = r1.initalOpenStreamSend     // Catch:{ Exception -> 0x03be }
                r1.checkIfSuccessOrWait()     // Catch:{ Exception -> 0x03be }
                org.xmlpull.v1.XmlPullParser r1 = r9.parser     // Catch:{ Exception -> 0x03be }
                int r1 = r1.getEventType()     // Catch:{ Exception -> 0x03be }
            L_0x0011:
                boolean r2 = r9.done     // Catch:{ Exception -> 0x03be }
                if (r2 != 0) goto L_0x03d0
                r2 = 1
                if (r1 == r2) goto L_0x03b6
                java.lang.String r3 = "stream"
                r4 = 3
                r5 = 2
                if (r1 == r5) goto L_0x0035
                if (r1 == r4) goto L_0x0022
                goto L_0x03ae
            L_0x0022:
                org.xmlpull.v1.XmlPullParser r1 = r9.parser     // Catch:{ Exception -> 0x03be }
                java.lang.String r1 = r1.getName()     // Catch:{ Exception -> 0x03be }
                boolean r1 = r1.equals(r3)     // Catch:{ Exception -> 0x03be }
                if (r1 == 0) goto L_0x03ae
                org.jivesoftware.smack.tcp.XMPPTCPConnection r1 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this     // Catch:{ Exception -> 0x03be }
                r1.disconnect()     // Catch:{ Exception -> 0x03be }
                goto L_0x03ae
            L_0x0035:
                org.xmlpull.v1.XmlPullParser r1 = r9.parser     // Catch:{ Exception -> 0x03be }
                java.lang.String r1 = r1.getName()     // Catch:{ Exception -> 0x03be }
                int r6 = r1.hashCode()     // Catch:{ Exception -> 0x03be }
                r7 = 0
                r8 = -1
                switch(r6) {
                    case -1867169789: goto L_0x00e7;
                    case -1609594047: goto L_0x00dc;
                    case -1281977283: goto L_0x00d1;
                    case -1276666629: goto L_0x00c7;
                    case -1086574198: goto L_0x00bd;
                    case -891990144: goto L_0x00b5;
                    case -369449087: goto L_0x00aa;
                    case -309519186: goto L_0x00a0;
                    case -290659267: goto L_0x0096;
                    case 97: goto L_0x008b;
                    case 114: goto L_0x007f;
                    case 3368: goto L_0x0074;
                    case 96784904: goto L_0x0069;
                    case 954925063: goto L_0x005e;
                    case 1097547223: goto L_0x0052;
                    case 1402633315: goto L_0x0046;
                    default: goto L_0x0044;
                }     // Catch:{ Exception -> 0x03be }
            L_0x0044:
                goto L_0x00f2
            L_0x0046:
                java.lang.String r3 = "challenge"
                boolean r3 = r1.equals(r3)     // Catch:{ Exception -> 0x03be }
                if (r3 == 0) goto L_0x00f2
                r3 = 8
                goto L_0x00f3
            L_0x0052:
                java.lang.String r3 = "resumed"
                boolean r3 = r1.equals(r3)     // Catch:{ Exception -> 0x03be }
                if (r3 == 0) goto L_0x00f2
                r3 = 13
                goto L_0x00f3
            L_0x005e:
                java.lang.String r3 = "message"
                boolean r3 = r1.equals(r3)     // Catch:{ Exception -> 0x03be }
                if (r3 == 0) goto L_0x00f2
                r3 = 0
                goto L_0x00f3
            L_0x0069:
                java.lang.String r3 = "error"
                boolean r3 = r1.equals(r3)     // Catch:{ Exception -> 0x03be }
                if (r3 == 0) goto L_0x00f2
                r3 = 4
                goto L_0x00f3
            L_0x0074:
                java.lang.String r3 = "iq"
                boolean r3 = r1.equals(r3)     // Catch:{ Exception -> 0x03be }
                if (r3 == 0) goto L_0x00f2
                r3 = 1
                goto L_0x00f3
            L_0x007f:
                java.lang.String r3 = "r"
                boolean r3 = r1.equals(r3)     // Catch:{ Exception -> 0x03be }
                if (r3 == 0) goto L_0x00f2
                r3 = 15
                goto L_0x00f3
            L_0x008b:
                java.lang.String r3 = "a"
                boolean r3 = r1.equals(r3)     // Catch:{ Exception -> 0x03be }
                if (r3 == 0) goto L_0x00f2
                r3 = 14
                goto L_0x00f3
            L_0x0096:
                java.lang.String r3 = "features"
                boolean r3 = r1.equals(r3)     // Catch:{ Exception -> 0x03be }
                if (r3 == 0) goto L_0x00f2
                r3 = 5
                goto L_0x00f3
            L_0x00a0:
                java.lang.String r3 = "proceed"
                boolean r3 = r1.equals(r3)     // Catch:{ Exception -> 0x03be }
                if (r3 == 0) goto L_0x00f2
                r3 = 6
                goto L_0x00f3
            L_0x00aa:
                java.lang.String r3 = "compressed"
                boolean r3 = r1.equals(r3)     // Catch:{ Exception -> 0x03be }
                if (r3 == 0) goto L_0x00f2
                r3 = 10
                goto L_0x00f3
            L_0x00b5:
                boolean r3 = r1.equals(r3)     // Catch:{ Exception -> 0x03be }
                if (r3 == 0) goto L_0x00f2
                r3 = 3
                goto L_0x00f3
            L_0x00bd:
                java.lang.String r3 = "failure"
                boolean r3 = r1.equals(r3)     // Catch:{ Exception -> 0x03be }
                if (r3 == 0) goto L_0x00f2
                r3 = 7
                goto L_0x00f3
            L_0x00c7:
                java.lang.String r3 = "presence"
                boolean r3 = r1.equals(r3)     // Catch:{ Exception -> 0x03be }
                if (r3 == 0) goto L_0x00f2
                r3 = 2
                goto L_0x00f3
            L_0x00d1:
                java.lang.String r3 = "failed"
                boolean r3 = r1.equals(r3)     // Catch:{ Exception -> 0x03be }
                if (r3 == 0) goto L_0x00f2
                r3 = 12
                goto L_0x00f3
            L_0x00dc:
                java.lang.String r3 = "enabled"
                boolean r3 = r1.equals(r3)     // Catch:{ Exception -> 0x03be }
                if (r3 == 0) goto L_0x00f2
                r3 = 11
                goto L_0x00f3
            L_0x00e7:
                java.lang.String r3 = "success"
                boolean r3 = r1.equals(r3)     // Catch:{ Exception -> 0x03be }
                if (r3 == 0) goto L_0x00f2
                r3 = 9
                goto L_0x00f3
            L_0x00f2:
                r3 = -1
            L_0x00f3:
                r4 = 0
                switch(r3) {
                    case 0: goto L_0x0372;
                    case 1: goto L_0x0372;
                    case 2: goto L_0x0372;
                    case 3: goto L_0x034f;
                    case 4: goto L_0x0343;
                    case 5: goto L_0x033b;
                    case 6: goto L_0x031f;
                    case 7: goto L_0x02b4;
                    case 8: goto L_0x02a3;
                    case 9: goto L_0x0288;
                    case 10: goto L_0x0273;
                    case 11: goto L_0x020b;
                    case 12: goto L_0x01b6;
                    case 13: goto L_0x0131;
                    case 14: goto L_0x0120;
                    case 15: goto L_0x00fd;
                    default: goto L_0x00f7;
                }     // Catch:{ Exception -> 0x03be }
            L_0x00f7:
                java.util.logging.Logger r2 = org.jivesoftware.smack.tcp.XMPPTCPConnection.LOGGER     // Catch:{ Exception -> 0x03be }
                goto L_0x039a
            L_0x00fd:
                org.xmlpull.v1.XmlPullParser r1 = r9.parser     // Catch:{ Exception -> 0x03be }
                org.jivesoftware.smack.p557sm.provider.ParseStreamManagement.ackRequest(r1)     // Catch:{ Exception -> 0x03be }
                org.jivesoftware.smack.tcp.XMPPTCPConnection r1 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this     // Catch:{ Exception -> 0x03be }
                org.jivesoftware.smack.SynchronizationPoint r1 = r1.smEnabledSyncPoint     // Catch:{ Exception -> 0x03be }
                boolean r1 = r1.wasSuccessful()     // Catch:{ Exception -> 0x03be }
                if (r1 == 0) goto L_0x0115
                org.jivesoftware.smack.tcp.XMPPTCPConnection r1 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this     // Catch:{ Exception -> 0x03be }
                r1.sendSmAcknowledgementInternal()     // Catch:{ Exception -> 0x03be }
                goto L_0x03ae
            L_0x0115:
                java.util.logging.Logger r1 = org.jivesoftware.smack.tcp.XMPPTCPConnection.LOGGER     // Catch:{ Exception -> 0x03be }
                java.lang.String r2 = "SM Ack Request received while SM is not enabled"
                r1.warning(r2)     // Catch:{ Exception -> 0x03be }
                goto L_0x03ae
            L_0x0120:
                org.xmlpull.v1.XmlPullParser r1 = r9.parser     // Catch:{ Exception -> 0x03be }
                org.jivesoftware.smack.sm.packet.StreamManagement$AckAnswer r1 = org.jivesoftware.smack.p557sm.provider.ParseStreamManagement.ackAnswer(r1)     // Catch:{ Exception -> 0x03be }
                org.jivesoftware.smack.tcp.XMPPTCPConnection r2 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this     // Catch:{ Exception -> 0x03be }
                long r3 = r1.getHandledCount()     // Catch:{ Exception -> 0x03be }
                r2.processHandledCount(r3)     // Catch:{ Exception -> 0x03be }
                goto L_0x03ae
            L_0x0131:
                org.xmlpull.v1.XmlPullParser r1 = r9.parser     // Catch:{ Exception -> 0x03be }
                org.jivesoftware.smack.sm.packet.StreamManagement$Resumed r1 = org.jivesoftware.smack.p557sm.provider.ParseStreamManagement.resumed(r1)     // Catch:{ Exception -> 0x03be }
                org.jivesoftware.smack.tcp.XMPPTCPConnection r2 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this     // Catch:{ Exception -> 0x03be }
                java.lang.String r2 = r2.smSessionId     // Catch:{ Exception -> 0x03be }
                java.lang.String r3 = r1.getPrevId()     // Catch:{ Exception -> 0x03be }
                boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x03be }
                if (r2 == 0) goto L_0x01a6
                org.jivesoftware.smack.tcp.XMPPTCPConnection r2 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this     // Catch:{ Exception -> 0x03be }
                org.jivesoftware.smack.SynchronizationPoint r2 = r2.smResumedSyncPoint     // Catch:{ Exception -> 0x03be }
                r2.reportSuccess()     // Catch:{ Exception -> 0x03be }
                org.jivesoftware.smack.tcp.XMPPTCPConnection r2 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this     // Catch:{ Exception -> 0x03be }
                org.jivesoftware.smack.SynchronizationPoint r2 = r2.smEnabledSyncPoint     // Catch:{ Exception -> 0x03be }
                r2.reportSuccess()     // Catch:{ Exception -> 0x03be }
                org.jivesoftware.smack.tcp.XMPPTCPConnection r2 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this     // Catch:{ Exception -> 0x03be }
                long r3 = r1.getHandledCount()     // Catch:{ Exception -> 0x03be }
                r2.processHandledCount(r3)     // Catch:{ Exception -> 0x03be }
                java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ Exception -> 0x03be }
                org.jivesoftware.smack.tcp.XMPPTCPConnection r2 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this     // Catch:{ Exception -> 0x03be }
                java.util.concurrent.BlockingQueue r2 = r2.unacknowledgedStanzas     // Catch:{ Exception -> 0x03be }
                int r2 = r2.size()     // Catch:{ Exception -> 0x03be }
                r1.<init>(r2)     // Catch:{ Exception -> 0x03be }
                org.jivesoftware.smack.tcp.XMPPTCPConnection r2 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this     // Catch:{ Exception -> 0x03be }
                java.util.concurrent.BlockingQueue r2 = r2.unacknowledgedStanzas     // Catch:{ Exception -> 0x03be }
                r2.drainTo(r1)     // Catch:{ Exception -> 0x03be }
                java.util.Iterator r2 = r1.iterator()     // Catch:{ Exception -> 0x03be }
            L_0x017e:
                boolean r3 = r2.hasNext()     // Catch:{ Exception -> 0x03be }
                if (r3 == 0) goto L_0x0190
                java.lang.Object r3 = r2.next()     // Catch:{ Exception -> 0x03be }
                org.jivesoftware.smack.packet.Stanza r3 = (org.jivesoftware.smack.packet.Stanza) r3     // Catch:{ Exception -> 0x03be }
                org.jivesoftware.smack.tcp.XMPPTCPConnection r4 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this     // Catch:{ Exception -> 0x03be }
                r4.sendStanzaInternal(r3)     // Catch:{ Exception -> 0x03be }
                goto L_0x017e
            L_0x0190:
                boolean r1 = r1.isEmpty()     // Catch:{ Exception -> 0x03be }
                if (r1 != 0) goto L_0x019b
                org.jivesoftware.smack.tcp.XMPPTCPConnection r1 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this     // Catch:{ Exception -> 0x03be }
                r1.requestSmAcknowledgementInternal()     // Catch:{ Exception -> 0x03be }
            L_0x019b:
                java.util.logging.Logger r1 = org.jivesoftware.smack.tcp.XMPPTCPConnection.LOGGER     // Catch:{ Exception -> 0x03be }
                java.lang.String r2 = "Stream Management (XEP-198): Stream resumed"
                r1.fine(r2)     // Catch:{ Exception -> 0x03be }
                goto L_0x03ae
            L_0x01a6:
                org.jivesoftware.smack.sm.StreamManagementException$StreamIdDoesNotMatchException r0 = new org.jivesoftware.smack.sm.StreamManagementException$StreamIdDoesNotMatchException     // Catch:{ Exception -> 0x03be }
                org.jivesoftware.smack.tcp.XMPPTCPConnection r2 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this     // Catch:{ Exception -> 0x03be }
                java.lang.String r2 = r2.smSessionId     // Catch:{ Exception -> 0x03be }
                java.lang.String r1 = r1.getPrevId()     // Catch:{ Exception -> 0x03be }
                r0.<init>(r2, r1)     // Catch:{ Exception -> 0x03be }
                throw r0     // Catch:{ Exception -> 0x03be }
            L_0x01b6:
                org.xmlpull.v1.XmlPullParser r1 = r9.parser     // Catch:{ Exception -> 0x03be }
                org.jivesoftware.smack.sm.packet.StreamManagement$Failed r1 = org.jivesoftware.smack.p557sm.provider.ParseStreamManagement.failed(r1)     // Catch:{ Exception -> 0x03be }
                org.jivesoftware.smack.packet.XMPPError r2 = new org.jivesoftware.smack.packet.XMPPError     // Catch:{ Exception -> 0x03be }
                org.jivesoftware.smack.packet.XMPPError$Condition r1 = r1.getXMPPErrorCondition()     // Catch:{ Exception -> 0x03be }
                r2.<init>(r1)     // Catch:{ Exception -> 0x03be }
                org.jivesoftware.smack.XMPPException$XMPPErrorException r1 = new org.jivesoftware.smack.XMPPException$XMPPErrorException     // Catch:{ Exception -> 0x03be }
                java.lang.String r3 = "Stream Management failed"
                r1.<init>(r3, r2)     // Catch:{ Exception -> 0x03be }
                org.jivesoftware.smack.tcp.XMPPTCPConnection r2 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this     // Catch:{ Exception -> 0x03be }
                org.jivesoftware.smack.SynchronizationPoint r2 = r2.smResumedSyncPoint     // Catch:{ Exception -> 0x03be }
                boolean r2 = r2.requestSent()     // Catch:{ Exception -> 0x03be }
                if (r2 == 0) goto L_0x01e3
                org.jivesoftware.smack.tcp.XMPPTCPConnection r2 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this     // Catch:{ Exception -> 0x03be }
                org.jivesoftware.smack.SynchronizationPoint r2 = r2.smResumedSyncPoint     // Catch:{ Exception -> 0x03be }
                r2.reportFailure(r1)     // Catch:{ Exception -> 0x03be }
                goto L_0x03ae
            L_0x01e3:
                org.jivesoftware.smack.tcp.XMPPTCPConnection r2 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this     // Catch:{ Exception -> 0x03be }
                org.jivesoftware.smack.SynchronizationPoint r2 = r2.smEnabledSyncPoint     // Catch:{ Exception -> 0x03be }
                boolean r2 = r2.requestSent()     // Catch:{ Exception -> 0x03be }
                if (r2 == 0) goto L_0x0203
                org.jivesoftware.smack.tcp.XMPPTCPConnection r2 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this     // Catch:{ Exception -> 0x03be }
                org.jivesoftware.smack.SynchronizationPoint r2 = r2.smEnabledSyncPoint     // Catch:{ Exception -> 0x03be }
                r2.reportFailure(r1)     // Catch:{ Exception -> 0x03be }
                org.jivesoftware.smack.tcp.XMPPTCPConnection r1 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this     // Catch:{ Exception -> 0x03be }
                org.jivesoftware.smack.SynchronizationPoint r1 = r1.lastFeaturesReceived     // Catch:{ Exception -> 0x03be }
                r1.reportSuccess()     // Catch:{ Exception -> 0x03be }
                goto L_0x03ae
            L_0x0203:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x03be }
                java.lang.String r1 = "Failed element received but SM was not previously enabled"
                r0.<init>(r1)     // Catch:{ Exception -> 0x03be }
                throw r0     // Catch:{ Exception -> 0x03be }
            L_0x020b:
                org.xmlpull.v1.XmlPullParser r1 = r9.parser     // Catch:{ Exception -> 0x03be }
                org.jivesoftware.smack.sm.packet.StreamManagement$Enabled r1 = org.jivesoftware.smack.p557sm.provider.ParseStreamManagement.enabled(r1)     // Catch:{ Exception -> 0x03be }
                boolean r3 = r1.isResumeSet()     // Catch:{ Exception -> 0x03be }
                if (r3 == 0) goto L_0x024e
                org.jivesoftware.smack.tcp.XMPPTCPConnection r3 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this     // Catch:{ Exception -> 0x03be }
                java.lang.String r4 = r1.getId()     // Catch:{ Exception -> 0x03be }
                r3.smSessionId = r4     // Catch:{ Exception -> 0x03be }
                org.jivesoftware.smack.tcp.XMPPTCPConnection r3 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this     // Catch:{ Exception -> 0x03be }
                java.lang.String r3 = r3.smSessionId     // Catch:{ Exception -> 0x03be }
                boolean r3 = org.jivesoftware.smack.util.StringUtils.isNullOrEmpty(r3)     // Catch:{ Exception -> 0x03be }
                if (r3 != 0) goto L_0x0236
                org.jivesoftware.smack.tcp.XMPPTCPConnection r3 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this     // Catch:{ Exception -> 0x03be }
                int r1 = r1.getMaxResumptionTime()     // Catch:{ Exception -> 0x03be }
                r3.smServerMaxResumptimTime = r1     // Catch:{ Exception -> 0x03be }
                goto L_0x0253
            L_0x0236:
                org.jivesoftware.smack.XMPPException$XMPPErrorException r0 = new org.jivesoftware.smack.XMPPException$XMPPErrorException     // Catch:{ Exception -> 0x03be }
                java.lang.String r1 = "Stream Management 'enabled' element with resume attribute but without session id received"
                org.jivesoftware.smack.packet.XMPPError r2 = new org.jivesoftware.smack.packet.XMPPError     // Catch:{ Exception -> 0x03be }
                org.jivesoftware.smack.packet.XMPPError$Condition r3 = org.jivesoftware.smack.packet.XMPPError.Condition.bad_request     // Catch:{ Exception -> 0x03be }
                r2.<init>(r3)     // Catch:{ Exception -> 0x03be }
                r0.<init>(r1, r2)     // Catch:{ Exception -> 0x03be }
                org.jivesoftware.smack.tcp.XMPPTCPConnection r1 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this     // Catch:{ Exception -> 0x03be }
                org.jivesoftware.smack.SynchronizationPoint r1 = r1.smEnabledSyncPoint     // Catch:{ Exception -> 0x03be }
                r1.reportFailure(r0)     // Catch:{ Exception -> 0x03be }
                throw r0     // Catch:{ Exception -> 0x03be }
            L_0x024e:
                org.jivesoftware.smack.tcp.XMPPTCPConnection r1 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this     // Catch:{ Exception -> 0x03be }
                r1.smSessionId = r4     // Catch:{ Exception -> 0x03be }
            L_0x0253:
                org.jivesoftware.smack.tcp.XMPPTCPConnection r1 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this     // Catch:{ Exception -> 0x03be }
                r3 = 0
                r1.clientHandledStanzasCount = r3     // Catch:{ Exception -> 0x03be }
                org.jivesoftware.smack.tcp.XMPPTCPConnection r1 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this     // Catch:{ Exception -> 0x03be }
                r1.smWasEnabledAtLeastOnce = r2     // Catch:{ Exception -> 0x03be }
                org.jivesoftware.smack.tcp.XMPPTCPConnection r1 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this     // Catch:{ Exception -> 0x03be }
                org.jivesoftware.smack.SynchronizationPoint r1 = r1.smEnabledSyncPoint     // Catch:{ Exception -> 0x03be }
                r1.reportSuccess()     // Catch:{ Exception -> 0x03be }
                java.util.logging.Logger r1 = org.jivesoftware.smack.tcp.XMPPTCPConnection.LOGGER     // Catch:{ Exception -> 0x03be }
                java.lang.String r2 = "Stream Management (XEP-198): succesfully enabled"
                r1.fine(r2)     // Catch:{ Exception -> 0x03be }
                goto L_0x03ae
            L_0x0273:
                org.jivesoftware.smack.tcp.XMPPTCPConnection r1 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this     // Catch:{ Exception -> 0x03be }
                r1.initReaderAndWriter()     // Catch:{ Exception -> 0x03be }
                org.jivesoftware.smack.tcp.XMPPTCPConnection r1 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this     // Catch:{ Exception -> 0x03be }
                r1.openStream()     // Catch:{ Exception -> 0x03be }
                org.jivesoftware.smack.tcp.XMPPTCPConnection r1 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this     // Catch:{ Exception -> 0x03be }
                org.jivesoftware.smack.SynchronizationPoint r1 = r1.compressSyncPoint     // Catch:{ Exception -> 0x03be }
                r1.reportSuccess()     // Catch:{ Exception -> 0x03be }
                goto L_0x03ae
            L_0x0288:
                org.jivesoftware.smack.sasl.packet.SaslStreamElements$Success r1 = new org.jivesoftware.smack.sasl.packet.SaslStreamElements$Success     // Catch:{ Exception -> 0x03be }
                org.xmlpull.v1.XmlPullParser r2 = r9.parser     // Catch:{ Exception -> 0x03be }
                java.lang.String r2 = r2.nextText()     // Catch:{ Exception -> 0x03be }
                r1.<init>(r2)     // Catch:{ Exception -> 0x03be }
                org.jivesoftware.smack.tcp.XMPPTCPConnection r2 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this     // Catch:{ Exception -> 0x03be }
                r2.openStream()     // Catch:{ Exception -> 0x03be }
                org.jivesoftware.smack.tcp.XMPPTCPConnection r2 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this     // Catch:{ Exception -> 0x03be }
                org.jivesoftware.smack.SASLAuthentication r2 = r2.getSASLAuthentication()     // Catch:{ Exception -> 0x03be }
                r2.authenticated(r1)     // Catch:{ Exception -> 0x03be }
                goto L_0x03ae
            L_0x02a3:
                org.xmlpull.v1.XmlPullParser r1 = r9.parser     // Catch:{ Exception -> 0x03be }
                java.lang.String r1 = r1.nextText()     // Catch:{ Exception -> 0x03be }
                org.jivesoftware.smack.tcp.XMPPTCPConnection r2 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this     // Catch:{ Exception -> 0x03be }
                org.jivesoftware.smack.SASLAuthentication r2 = r2.getSASLAuthentication()     // Catch:{ Exception -> 0x03be }
                r2.challengeReceived(r1)     // Catch:{ Exception -> 0x03be }
                goto L_0x03ae
            L_0x02b4:
                org.xmlpull.v1.XmlPullParser r1 = r9.parser     // Catch:{ Exception -> 0x03be }
                java.lang.String r1 = r1.getNamespace(r4)     // Catch:{ Exception -> 0x03be }
                int r3 = r1.hashCode()     // Catch:{ Exception -> 0x03be }
                r6 = -1570142914(0xffffffffa269853e, float:-3.1647926E-18)
                if (r3 == r6) goto L_0x02e1
                r6 = 919182852(0x36c99e04, float:6.0086622E-6)
                if (r3 == r6) goto L_0x02d8
                r6 = 2117926358(0x7e3cfdd6, float:6.2803214E37)
                if (r3 == r6) goto L_0x02ce
                goto L_0x02eb
            L_0x02ce:
                java.lang.String r3 = "http://jabber.org/protocol/compress"
                boolean r1 = r1.equals(r3)     // Catch:{ Exception -> 0x03be }
                if (r1 == 0) goto L_0x02eb
                r7 = 1
                goto L_0x02ec
            L_0x02d8:
                java.lang.String r3 = "urn:ietf:params:xml:ns:xmpp-tls"
                boolean r1 = r1.equals(r3)     // Catch:{ Exception -> 0x03be }
                if (r1 == 0) goto L_0x02eb
                goto L_0x02ec
            L_0x02e1:
                java.lang.String r3 = "urn:ietf:params:xml:ns:xmpp-sasl"
                boolean r1 = r1.equals(r3)     // Catch:{ Exception -> 0x03be }
                if (r1 == 0) goto L_0x02eb
                r7 = 2
                goto L_0x02ec
            L_0x02eb:
                r7 = -1
            L_0x02ec:
                if (r7 == 0) goto L_0x0317
                if (r7 == r2) goto L_0x0305
                if (r7 == r5) goto L_0x02f4
                goto L_0x03ae
            L_0x02f4:
                org.xmlpull.v1.XmlPullParser r1 = r9.parser     // Catch:{ Exception -> 0x03be }
                org.jivesoftware.smack.sasl.packet.SaslStreamElements$SASLFailure r1 = org.jivesoftware.smack.util.PacketParserUtils.parseSASLFailure(r1)     // Catch:{ Exception -> 0x03be }
                org.jivesoftware.smack.tcp.XMPPTCPConnection r2 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this     // Catch:{ Exception -> 0x03be }
                org.jivesoftware.smack.SASLAuthentication r2 = r2.getSASLAuthentication()     // Catch:{ Exception -> 0x03be }
                r2.authenticationFailed(r1)     // Catch:{ Exception -> 0x03be }
                goto L_0x03ae
            L_0x0305:
                org.jivesoftware.smack.tcp.XMPPTCPConnection r1 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this     // Catch:{ Exception -> 0x03be }
                org.jivesoftware.smack.SynchronizationPoint r1 = r1.compressSyncPoint     // Catch:{ Exception -> 0x03be }
                org.jivesoftware.smack.XMPPException$XMPPErrorException r2 = new org.jivesoftware.smack.XMPPException$XMPPErrorException     // Catch:{ Exception -> 0x03be }
                java.lang.String r3 = "Could not establish compression"
                r2.<init>(r3, r4)     // Catch:{ Exception -> 0x03be }
                r1.reportFailure(r2)     // Catch:{ Exception -> 0x03be }
                goto L_0x03ae
            L_0x0317:
                org.jivesoftware.smack.XMPPException$XMPPErrorException r0 = new org.jivesoftware.smack.XMPPException$XMPPErrorException     // Catch:{ Exception -> 0x03be }
                java.lang.String r1 = "TLS negotiation has failed"
                r0.<init>(r1, r4)     // Catch:{ Exception -> 0x03be }
                throw r0     // Catch:{ Exception -> 0x03be }
            L_0x031f:
                org.jivesoftware.smack.tcp.XMPPTCPConnection r1 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this     // Catch:{ Exception -> 0x032b }
                r1.proceedTLSReceived()     // Catch:{ Exception -> 0x032b }
                org.jivesoftware.smack.tcp.XMPPTCPConnection r1 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this     // Catch:{ Exception -> 0x032b }
                r1.openStream()     // Catch:{ Exception -> 0x032b }
                goto L_0x03ae
            L_0x032b:
                r0 = move-exception
                org.jivesoftware.smack.tcp.XMPPTCPConnection r1 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this     // Catch:{ Exception -> 0x03be }
                org.jivesoftware.smack.SynchronizationPoint r1 = r1.saslFeatureReceived     // Catch:{ Exception -> 0x03be }
                org.jivesoftware.smack.SmackException r2 = new org.jivesoftware.smack.SmackException     // Catch:{ Exception -> 0x03be }
                r2.<init>(r0)     // Catch:{ Exception -> 0x03be }
                r1.reportFailure(r2)     // Catch:{ Exception -> 0x03be }
                throw r0     // Catch:{ Exception -> 0x03be }
            L_0x033b:
                org.jivesoftware.smack.tcp.XMPPTCPConnection r1 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this     // Catch:{ Exception -> 0x03be }
                org.xmlpull.v1.XmlPullParser r2 = r9.parser     // Catch:{ Exception -> 0x03be }
                r1.parseFeatures(r2)     // Catch:{ Exception -> 0x03be }
                goto L_0x03ae
            L_0x0343:
                org.jivesoftware.smack.XMPPException$StreamErrorException r0 = new org.jivesoftware.smack.XMPPException$StreamErrorException     // Catch:{ Exception -> 0x03be }
                org.xmlpull.v1.XmlPullParser r1 = r9.parser     // Catch:{ Exception -> 0x03be }
                org.jivesoftware.smack.packet.StreamError r1 = org.jivesoftware.smack.util.PacketParserUtils.parseStreamError(r1)     // Catch:{ Exception -> 0x03be }
                r0.<init>(r1)     // Catch:{ Exception -> 0x03be }
                throw r0     // Catch:{ Exception -> 0x03be }
            L_0x034f:
                java.lang.String r1 = "jabber:client"
                org.xmlpull.v1.XmlPullParser r2 = r9.parser     // Catch:{ Exception -> 0x03be }
                java.lang.String r2 = r2.getNamespace(r4)     // Catch:{ Exception -> 0x03be }
                boolean r1 = r1.equals(r2)     // Catch:{ Exception -> 0x03be }
                if (r1 == 0) goto L_0x03ae
                org.jivesoftware.smack.tcp.XMPPTCPConnection r1 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this     // Catch:{ Exception -> 0x03be }
                org.xmlpull.v1.XmlPullParser r2 = r9.parser     // Catch:{ Exception -> 0x03be }
                java.lang.String r3 = "id"
                java.lang.String r2 = r2.getAttributeValue(r0, r3)     // Catch:{ Exception -> 0x03be }
                r1.streamId = r2     // Catch:{ Exception -> 0x03be }
                org.xmlpull.v1.XmlPullParser r1 = r9.parser     // Catch:{ Exception -> 0x03be }
                java.lang.String r2 = "from"
                r1.getAttributeValue(r0, r2)     // Catch:{ Exception -> 0x03be }
                goto L_0x03ae
            L_0x0372:
                org.jivesoftware.smack.tcp.XMPPTCPConnection r1 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this     // Catch:{ all -> 0x0389 }
                org.xmlpull.v1.XmlPullParser r2 = r9.parser     // Catch:{ all -> 0x0389 }
                r1.parseAndProcessStanza(r2)     // Catch:{ all -> 0x0389 }
                org.jivesoftware.smack.tcp.XMPPTCPConnection r1 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this     // Catch:{ Exception -> 0x03be }
                org.jivesoftware.smack.tcp.XMPPTCPConnection r2 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this     // Catch:{ Exception -> 0x03be }
                long r2 = r2.clientHandledStanzasCount     // Catch:{ Exception -> 0x03be }
                long r2 = org.jivesoftware.smack.p557sm.SMUtils.incrementHeight(r2)     // Catch:{ Exception -> 0x03be }
                r1.clientHandledStanzasCount = r2     // Catch:{ Exception -> 0x03be }
                goto L_0x03ae
            L_0x0389:
                r0 = move-exception
                org.jivesoftware.smack.tcp.XMPPTCPConnection r1 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this     // Catch:{ Exception -> 0x03be }
                org.jivesoftware.smack.tcp.XMPPTCPConnection r2 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this     // Catch:{ Exception -> 0x03be }
                long r2 = r2.clientHandledStanzasCount     // Catch:{ Exception -> 0x03be }
                long r2 = org.jivesoftware.smack.p557sm.SMUtils.incrementHeight(r2)     // Catch:{ Exception -> 0x03be }
                r1.clientHandledStanzasCount = r2     // Catch:{ Exception -> 0x03be }
                throw r0     // Catch:{ Exception -> 0x03be }
            L_0x039a:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03be }
                r3.<init>()     // Catch:{ Exception -> 0x03be }
                java.lang.String r4 = "Unknown top level stream element: "
                r3.append(r4)     // Catch:{ Exception -> 0x03be }
                r3.append(r1)     // Catch:{ Exception -> 0x03be }
                java.lang.String r1 = r3.toString()     // Catch:{ Exception -> 0x03be }
                r2.warning(r1)     // Catch:{ Exception -> 0x03be }
            L_0x03ae:
                org.xmlpull.v1.XmlPullParser r1 = r9.parser     // Catch:{ Exception -> 0x03be }
                int r1 = r1.next()     // Catch:{ Exception -> 0x03be }
                goto L_0x0011
            L_0x03b6:
                org.jivesoftware.smack.SmackException r0 = new org.jivesoftware.smack.SmackException     // Catch:{ Exception -> 0x03be }
                java.lang.String r1 = "Parser got END_DOCUMENT event. This could happen e.g. if the server closed the connection without sending a closing stream element"
                r0.<init>(r1)     // Catch:{ Exception -> 0x03be }
                throw r0     // Catch:{ Exception -> 0x03be }
            L_0x03be:
                r0 = move-exception
                boolean r1 = r9.done
                if (r1 != 0) goto L_0x03d0
                org.jivesoftware.smack.tcp.XMPPTCPConnection r1 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this
                boolean r1 = r1.isSocketClosed()
                if (r1 != 0) goto L_0x03d0
                org.jivesoftware.smack.tcp.XMPPTCPConnection r1 = org.jivesoftware.smack.tcp.XMPPTCPConnection.this
                r1.notifyConnectionError(r0)
            L_0x03d0:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smack.tcp.XMPPTCPConnection.PacketReader.parsePackets():void");
        }

        /* access modifiers changed from: 0000 */
        public void init() {
            this.done = false;
            C156341 r0 = new Runnable() {
                public void run() {
                    PacketReader.this.parsePackets();
                }
            };
            StringBuilder sb = new StringBuilder();
            sb.append("Smack Packet Reader (");
            sb.append(XMPPTCPConnection.this.getConnectionCounter());
            sb.append(")");
            Async.m68711go(r0, sb.toString());
        }

        /* access modifiers changed from: 0000 */
        public void shutdown() {
            this.done = true;
        }
    }

    protected class PacketWriter {
        public static final int QUEUE_SIZE = 500;
        private volatile boolean instantShutdown;
        private final ArrayBlockingQueueWithShutdown<Element> queue = new ArrayBlockingQueueWithShutdown<>(500, true);
        private boolean shouldBundleAndDefer;
        protected SynchronizationPoint<NoResponseException> shutdownDone = new SynchronizationPoint<>(XMPPTCPConnection.this);
        protected volatile Long shutdownTimestamp = null;

        protected PacketWriter() {
        }

        /* access modifiers changed from: private */
        public boolean done() {
            return this.shutdownTimestamp != null;
        }

        private void drainWriterQueueToUnacknowledgedStanzas() {
            ArrayList<Element> arrayList = new ArrayList<>(this.queue.size());
            this.queue.drainTo(arrayList);
            for (Element element : arrayList) {
                if (element instanceof Stanza) {
                    XMPPTCPConnection.this.unacknowledgedStanzas.add((Stanza) element);
                }
            }
        }

        private Element nextStreamElement() {
            if (this.queue.isEmpty()) {
                this.shouldBundleAndDefer = true;
            }
            try {
                return (Element) this.queue.take();
            } catch (InterruptedException e) {
                if (this.queue.isShutdown()) {
                    return null;
                }
                XMPPTCPConnection.LOGGER.log(Level.WARNING, "Packet writer thread was interrupted. Don't do that. Use disconnect() instead.", e);
                return null;
            }
        }

        /* access modifiers changed from: private */
        public void writePackets() {
            try {
                XMPPTCPConnection.this.openStream();
                XMPPTCPConnection.this.initalOpenStreamSend.reportSuccess();
                while (!done()) {
                    Element nextStreamElement = nextStreamElement();
                    if (nextStreamElement != null) {
                        BundleAndDeferCallback access$3000 = XMPPTCPConnection.this.bundleAndDeferCallback;
                        if (access$3000 != null && XMPPTCPConnection.this.isAuthenticated() && this.shouldBundleAndDefer) {
                            this.shouldBundleAndDefer = false;
                            AtomicBoolean atomicBoolean = new AtomicBoolean();
                            int bundleAndDeferMillis = access$3000.getBundleAndDeferMillis(new BundleAndDefer(atomicBoolean));
                            if (bundleAndDeferMillis > 0) {
                                long j = (long) bundleAndDeferMillis;
                                long currentTimeMillis = System.currentTimeMillis();
                                synchronized (atomicBoolean) {
                                    long j2 = j;
                                    while (!atomicBoolean.get() && j2 > 0) {
                                        atomicBoolean.wait(j2);
                                        j2 = j - (System.currentTimeMillis() - currentTimeMillis);
                                    }
                                }
                            }
                        }
                        Stanza stanza = null;
                        if (nextStreamElement instanceof Stanza) {
                            stanza = (Stanza) nextStreamElement;
                        } else if (nextStreamElement instanceof Enable) {
                            XMPPTCPConnection.this.unacknowledgedStanzas = new ArrayBlockingQueue(500);
                        }
                        if (!(XMPPTCPConnection.this.unacknowledgedStanzas == null || stanza == null)) {
                            if (((double) XMPPTCPConnection.this.unacknowledgedStanzas.size()) == 400.0d) {
                                XMPPTCPConnection.this.writer.write(AckRequest.INSTANCE.toXML().toString());
                                XMPPTCPConnection.this.writer.flush();
                            }
                            XMPPTCPConnection.this.unacknowledgedStanzas.put(stanza);
                        }
                        XMPPTCPConnection.this.writer.write(nextStreamElement.toXML().toString());
                        if (this.queue.isEmpty()) {
                            XMPPTCPConnection.this.writer.flush();
                        }
                        if (stanza != null) {
                            XMPPTCPConnection.this.firePacketSendingListeners(stanza);
                        }
                    }
                }
                if (!this.instantShutdown) {
                    while (!this.queue.isEmpty()) {
                        try {
                            XMPPTCPConnection.this.writer.write(((Element) this.queue.remove()).toXML().toString());
                        } catch (Exception e) {
                            XMPPTCPConnection.LOGGER.log(Level.WARNING, "Exception flushing queue during shutdown, ignore and continue", e);
                        }
                    }
                    XMPPTCPConnection.this.writer.flush();
                    try {
                        XMPPTCPConnection.this.writer.write("</stream:stream>");
                        XMPPTCPConnection.this.writer.flush();
                    } catch (Exception e2) {
                        XMPPTCPConnection.LOGGER.log(Level.WARNING, "Exception writing closing stream element", e2);
                    }
                    this.queue.clear();
                } else if (this.instantShutdown && XMPPTCPConnection.this.isSmEnabled()) {
                    drainWriterQueueToUnacknowledgedStanzas();
                }
                try {
                    XMPPTCPConnection.this.writer.close();
                } catch (Exception unused) {
                }
            } catch (InterruptedException e3) {
                throw new IllegalStateException(e3);
            } catch (Exception e4) {
                try {
                    if (done() || XMPPTCPConnection.this.isSocketClosed()) {
                        XMPPTCPConnection.LOGGER.log(Level.FINE, "Ignoring Exception in writePackets()", e4);
                    } else {
                        XMPPTCPConnection.this.notifyConnectionError(e4);
                    }
                } catch (Throwable th) {
                    XMPPTCPConnection.LOGGER.fine("Reporting shutdownDone success in writer thread");
                    this.shutdownDone.reportSuccess();
                    throw th;
                }
            }
            XMPPTCPConnection.LOGGER.fine("Reporting shutdownDone success in writer thread");
            this.shutdownDone.reportSuccess();
        }

        /* access modifiers changed from: 0000 */
        public void init() {
            this.shutdownDone.init();
            this.shutdownTimestamp = null;
            if (XMPPTCPConnection.this.unacknowledgedStanzas != null) {
                drainWriterQueueToUnacknowledgedStanzas();
            }
            this.queue.start();
            C156351 r0 = new Runnable() {
                public void run() {
                    PacketWriter.this.writePackets();
                }
            };
            StringBuilder sb = new StringBuilder();
            sb.append("Smack Packet Writer (");
            sb.append(XMPPTCPConnection.this.getConnectionCounter());
            sb.append(")");
            Async.m68711go(r0, sb.toString());
        }

        /* access modifiers changed from: protected */
        public void sendStreamElement(Element element) throws NotConnectedException {
            throwNotConnectedExceptionIfDoneAndResumptionNotPossible();
            boolean z = false;
            while (!z) {
                try {
                    this.queue.put(element);
                    z = true;
                } catch (InterruptedException e) {
                    throwNotConnectedExceptionIfDoneAndResumptionNotPossible();
                    XMPPTCPConnection.LOGGER.log(Level.WARNING, "Sending thread was interrupted", e);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public void shutdown(boolean z) {
            this.instantShutdown = z;
            this.shutdownTimestamp = Long.valueOf(System.currentTimeMillis());
            this.queue.shutdown();
            try {
                this.shutdownDone.checkIfSuccessOrWait();
            } catch (NoResponseException e) {
                XMPPTCPConnection.LOGGER.log(Level.WARNING, "shutdownDone was not marked as successful by the writer thread", e);
            }
        }

        /* access modifiers changed from: protected */
        public void throwNotConnectedExceptionIfDoneAndResumptionNotPossible() throws NotConnectedException {
            if (done() && !XMPPTCPConnection.this.isSmResumptionPossible()) {
                throw new NotConnectedException();
            }
        }
    }

    public XMPPTCPConnection(XMPPTCPConnectionConfiguration xMPPTCPConnectionConfiguration) {
        super(xMPPTCPConnectionConfiguration);
        this.disconnectedButResumeable = false;
        this.socketClosed = false;
        this.usingTLS = false;
        this.initalOpenStreamSend = new SynchronizationPoint<>(this);
        this.maybeCompressFeaturesReceived = new SynchronizationPoint<>(this);
        this.compressSyncPoint = new SynchronizationPoint<>(this);
        this.bundleAndDeferCallback = defaultBundleAndDeferCallback;
        this.smResumedSyncPoint = new SynchronizationPoint<>(this);
        this.smEnabledSyncPoint = new SynchronizationPoint<>(this);
        this.smClientMaxResumptionTime = -1;
        this.smServerMaxResumptimTime = -1;
        this.useSm = useSmDefault;
        this.useSmResumption = useSmResumptionDefault;
        this.serverHandledStanzasCount = 0;
        this.clientHandledStanzasCount = 0;
        this.smWasEnabledAtLeastOnce = false;
        this.stanzaAcknowledgedListeners = new ConcurrentLinkedQueue();
        this.stanzaIdAcknowledgedListeners = new ConcurrentHashMap();
        this.requestAckPredicates = new LinkedHashSet();
        this.config = xMPPTCPConnectionConfiguration;
        addConnectionListener(new AbstractConnectionListener() {
            public void connectionClosedOnError(Exception exc) {
                if (exc instanceof StreamErrorException) {
                    XMPPTCPConnection.this.dropSmState();
                }
            }
        });
    }

    private void connectUsingConfiguration() throws IOException, ConnectionException {
        Iterator it;
        List populateHostAddresses = populateHostAddresses();
        SocketFactory socketFactory = this.config.getSocketFactory();
        if (socketFactory == null) {
            socketFactory = SocketFactory.getDefault();
        }
        for (HostAddress hostAddress : this.hostAddresses) {
            String fqdn = hostAddress.getFQDN();
            int port = hostAddress.getPort();
            this.socket = socketFactory.createSocket();
            try {
                it = Arrays.asList(InetAddress.getAllByName(fqdn)).iterator();
                if (it.hasNext()) {
                    while (it.hasNext()) {
                        InetAddress inetAddress = (InetAddress) it.next();
                        StringBuilder sb = new StringBuilder();
                        sb.append(inetAddress);
                        sb.append(" at port ");
                        sb.append(port);
                        String sb2 = sb.toString();
                        Logger logger = LOGGER;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Trying to establish TCP connection to ");
                        sb3.append(sb2);
                        logger.finer(sb3.toString());
                        this.socket.connect(new InetSocketAddress(inetAddress, port), this.config.getConnectTimeout());
                        Logger logger2 = LOGGER;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Established TCP connection to ");
                        sb4.append(sb2);
                        logger2.finer(sb4.toString());
                        this.host = fqdn;
                        this.port = port;
                        return;
                    }
                    continue;
                } else {
                    LOGGER.warning("InetAddress.getAllByName() returned empty result array.");
                    throw new UnknownHostException(fqdn);
                }
            } catch (Exception e) {
                if (!it.hasNext()) {
                    throw e;
                }
            } catch (Exception e2) {
                hostAddress.setException(e2);
                populateHostAddresses.add(hostAddress);
            }
        }
        throw ConnectionException.from(populateHostAddresses);
    }

    /* access modifiers changed from: private */
    public void dropSmState() {
        this.smSessionId = null;
        this.unacknowledgedStanzas = null;
    }

    private void initConnection() throws IOException {
        boolean z = this.packetReader == null || this.packetWriter == null;
        this.compressionHandler = null;
        initReaderAndWriter();
        if (z) {
            this.packetWriter = new PacketWriter();
            this.packetReader = new PacketReader();
            if (this.config.isDebuggerEnabled()) {
                addAsyncStanzaListener(this.debugger.getReaderListener(), null);
                if (this.debugger.getWriterListener() != null) {
                    addPacketSendingListener(this.debugger.getWriterListener(), null);
                }
            }
        }
        this.packetWriter.init();
        this.packetReader.init();
        if (z) {
            for (ConnectionCreationListener connectionCreated : AbstractXMPPConnection.getConnectionCreationListeners()) {
                connectionCreated.connectionCreated(this);
            }
        }
    }

    /* access modifiers changed from: private */
    public void initReaderAndWriter() throws IOException {
        InputStream inputStream = this.socket.getInputStream();
        OutputStream outputStream = this.socket.getOutputStream();
        XMPPInputOutputStream xMPPInputOutputStream = this.compressionHandler;
        if (xMPPInputOutputStream != null) {
            inputStream = xMPPInputOutputStream.getInputStream(inputStream);
            outputStream = this.compressionHandler.getOutputStream(outputStream);
        }
        String str = "UTF-8";
        this.writer = new OutputStreamWriter(outputStream, str);
        this.reader = new BufferedReader(new InputStreamReader(inputStream, str));
        initDebugger();
    }

    private XMPPInputOutputStream maybeGetCompressionHandler() {
        Feature feature = (Feature) getFeature(Feature.ELEMENT, "http://jabber.org/protocol/compress");
        if (feature == null) {
            return null;
        }
        for (XMPPInputOutputStream xMPPInputOutputStream : SmackConfiguration.getCompresionHandlers()) {
            if (feature.getMethods().contains(xMPPInputOutputStream.getCompressionMethod())) {
                return xMPPInputOutputStream;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void notifyConnectionError(java.lang.Exception r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            org.jivesoftware.smack.tcp.XMPPTCPConnection$PacketReader r0 = r1.packetReader     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x000d
            org.jivesoftware.smack.tcp.XMPPTCPConnection$PacketReader r0 = r1.packetReader     // Catch:{ all -> 0x0024 }
            boolean r0 = r0.done     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x001a
        L_0x000d:
            org.jivesoftware.smack.tcp.XMPPTCPConnection$PacketWriter r0 = r1.packetWriter     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0022
            org.jivesoftware.smack.tcp.XMPPTCPConnection$PacketWriter r0 = r1.packetWriter     // Catch:{ all -> 0x0024 }
            boolean r0 = r0.done()     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x001a
            goto L_0x0022
        L_0x001a:
            r1.instantShutdown()     // Catch:{ all -> 0x0024 }
            r1.callConnectionClosedOnErrorListener(r2)     // Catch:{ all -> 0x0024 }
            monitor-exit(r1)
            return
        L_0x0022:
            monitor-exit(r1)
            return
        L_0x0024:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smack.tcp.XMPPTCPConnection.notifyConnectionError(java.lang.Exception):void");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00e3 A[SYNTHETIC, Splitter:B:20:0x00e3] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00e7 A[Catch:{ NullPointerException -> 0x00f6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0168  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void proceedTLSReceived() throws java.security.NoSuchAlgorithmException, java.security.cert.CertificateException, java.io.IOException, java.security.KeyStoreException, java.security.NoSuchProviderException, java.security.UnrecoverableKeyException, java.security.KeyManagementException, org.jivesoftware.smack.SmackException {
        /*
            r8 = this;
            org.jivesoftware.smack.tcp.XMPPTCPConnectionConfiguration r0 = r8.config
            javax.net.ssl.SSLContext r0 = r0.getCustomSSLContext()
            org.jivesoftware.smack.tcp.XMPPTCPConnectionConfiguration r1 = r8.config
            javax.security.auth.callback.CallbackHandler r1 = r1.getCallbackHandler()
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0012
            goto L_0x00f6
        L_0x0012:
            if (r0 != 0) goto L_0x00f6
            org.jivesoftware.smack.tcp.XMPPTCPConnectionConfiguration r1 = r8.config
            java.lang.String r1 = r1.getKeystoreType()
            java.lang.String r4 = "NONE"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x0026
        L_0x0022:
            r1 = r3
            r4 = r1
            goto L_0x00db
        L_0x0026:
            org.jivesoftware.smack.tcp.XMPPTCPConnectionConfiguration r1 = r8.config
            java.lang.String r1 = r1.getKeystoreType()
            java.lang.String r4 = "PKCS11"
            boolean r1 = r1.equals(r4)
            r5 = 0
            if (r1 == 0) goto L_0x0092
            java.lang.String r1 = "sun.security.pkcs11.SunPKCS11"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ Exception -> 0x0022 }
            java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0022 }
            java.lang.Class<java.io.InputStream> r7 = java.io.InputStream.class
            r6[r5] = r7     // Catch:{ Exception -> 0x0022 }
            java.lang.reflect.Constructor r1 = r1.getConstructor(r6)     // Catch:{ Exception -> 0x0022 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0022 }
            r6.<init>()     // Catch:{ Exception -> 0x0022 }
            java.lang.String r7 = "name = SmartCard\nlibrary = "
            r6.append(r7)     // Catch:{ Exception -> 0x0022 }
            org.jivesoftware.smack.tcp.XMPPTCPConnectionConfiguration r7 = r8.config     // Catch:{ Exception -> 0x0022 }
            java.lang.String r7 = r7.getPKCS11Library()     // Catch:{ Exception -> 0x0022 }
            r6.append(r7)     // Catch:{ Exception -> 0x0022 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x0022 }
            java.io.ByteArrayInputStream r7 = new java.io.ByteArrayInputStream     // Catch:{ Exception -> 0x0022 }
            byte[] r6 = r6.getBytes()     // Catch:{ Exception -> 0x0022 }
            r7.<init>(r6)     // Catch:{ Exception -> 0x0022 }
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0022 }
            r6[r5] = r7     // Catch:{ Exception -> 0x0022 }
            java.lang.Object r1 = r1.newInstance(r6)     // Catch:{ Exception -> 0x0022 }
            java.security.Provider r1 = (java.security.Provider) r1     // Catch:{ Exception -> 0x0022 }
            java.security.Security.addProvider(r1)     // Catch:{ Exception -> 0x0022 }
            java.security.KeyStore r1 = java.security.KeyStore.getInstance(r4, r1)     // Catch:{ Exception -> 0x0022 }
            javax.security.auth.callback.PasswordCallback r4 = new javax.security.auth.callback.PasswordCallback     // Catch:{ Exception -> 0x0022 }
            java.lang.String r6 = "PKCS11 Password: "
            r4.<init>(r6, r5)     // Catch:{ Exception -> 0x0022 }
            org.jivesoftware.smack.tcp.XMPPTCPConnectionConfiguration r6 = r8.config     // Catch:{ Exception -> 0x0022 }
            javax.security.auth.callback.CallbackHandler r6 = r6.getCallbackHandler()     // Catch:{ Exception -> 0x0022 }
            javax.security.auth.callback.Callback[] r7 = new javax.security.auth.callback.Callback[r2]     // Catch:{ Exception -> 0x0022 }
            r7[r5] = r4     // Catch:{ Exception -> 0x0022 }
            r6.handle(r7)     // Catch:{ Exception -> 0x0022 }
            char[] r5 = r4.getPassword()     // Catch:{ Exception -> 0x0022 }
            r1.load(r3, r5)     // Catch:{ Exception -> 0x0022 }
            goto L_0x00db
        L_0x0092:
            org.jivesoftware.smack.tcp.XMPPTCPConnectionConfiguration r1 = r8.config
            java.lang.String r1 = r1.getKeystoreType()
            java.lang.String r4 = "Apple"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x00ab
            java.lang.String r1 = "KeychainStore"
            java.security.KeyStore r1 = java.security.KeyStore.getInstance(r1, r4)
            r1.load(r3, r3)
            r4 = r3
            goto L_0x00db
        L_0x00ab:
            org.jivesoftware.smack.tcp.XMPPTCPConnectionConfiguration r1 = r8.config
            java.lang.String r1 = r1.getKeystoreType()
            java.security.KeyStore r1 = java.security.KeyStore.getInstance(r1)
            javax.security.auth.callback.PasswordCallback r4 = new javax.security.auth.callback.PasswordCallback     // Catch:{ Exception -> 0x0022 }
            java.lang.String r6 = "Keystore Password: "
            r4.<init>(r6, r5)     // Catch:{ Exception -> 0x0022 }
            org.jivesoftware.smack.tcp.XMPPTCPConnectionConfiguration r6 = r8.config     // Catch:{ Exception -> 0x0022 }
            javax.security.auth.callback.CallbackHandler r6 = r6.getCallbackHandler()     // Catch:{ Exception -> 0x0022 }
            javax.security.auth.callback.Callback[] r7 = new javax.security.auth.callback.Callback[r2]     // Catch:{ Exception -> 0x0022 }
            r7[r5] = r4     // Catch:{ Exception -> 0x0022 }
            r6.handle(r7)     // Catch:{ Exception -> 0x0022 }
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0022 }
            org.jivesoftware.smack.tcp.XMPPTCPConnectionConfiguration r6 = r8.config     // Catch:{ Exception -> 0x0022 }
            java.lang.String r6 = r6.getKeystorePath()     // Catch:{ Exception -> 0x0022 }
            r5.<init>(r6)     // Catch:{ Exception -> 0x0022 }
            char[] r6 = r4.getPassword()     // Catch:{ Exception -> 0x0022 }
            r1.load(r5, r6)     // Catch:{ Exception -> 0x0022 }
        L_0x00db:
            java.lang.String r5 = "SunX509"
            javax.net.ssl.KeyManagerFactory r5 = javax.net.ssl.KeyManagerFactory.getInstance(r5)
            if (r4 != 0) goto L_0x00e7
            r5.init(r1, r3)     // Catch:{ NullPointerException -> 0x00f6 }
            goto L_0x00f1
        L_0x00e7:
            char[] r6 = r4.getPassword()     // Catch:{ NullPointerException -> 0x00f6 }
            r5.init(r1, r6)     // Catch:{ NullPointerException -> 0x00f6 }
            r4.clearPassword()     // Catch:{ NullPointerException -> 0x00f6 }
        L_0x00f1:
            javax.net.ssl.KeyManager[] r1 = r5.getKeyManagers()     // Catch:{ NullPointerException -> 0x00f6 }
            goto L_0x00f7
        L_0x00f6:
            r1 = r3
        L_0x00f7:
            if (r0 != 0) goto L_0x0107
            java.lang.String r0 = "TLS"
            javax.net.ssl.SSLContext r0 = javax.net.ssl.SSLContext.getInstance(r0)
            java.security.SecureRandom r4 = new java.security.SecureRandom
            r4.<init>()
            r0.init(r1, r3, r4)
        L_0x0107:
            java.net.Socket r1 = r8.socket
            javax.net.ssl.SSLSocketFactory r0 = r0.getSocketFactory()
            java.lang.String r3 = r8.host
            int r4 = r1.getPort()
            java.net.Socket r0 = r0.createSocket(r1, r3, r4, r2)
            r8.socket = r0
            r8.initReaderAndWriter()
            java.net.Socket r0 = r8.socket
            javax.net.ssl.SSLSocket r0 = (javax.net.ssl.SSLSocket) r0
            org.jivesoftware.smack.tcp.XMPPTCPConnectionConfiguration r1 = r8.config
            java.lang.String[] r1 = r1.getEnabledSSLProtocols()
            org.jivesoftware.smack.tcp.XMPPTCPConnectionConfiguration r3 = r8.config
            java.lang.String[] r3 = r3.getEnabledSSLCiphers()
            org.jivesoftware.smack.util.TLSUtils.setEnabledProtocolsAndCiphers(r0, r1, r3)
            r0.startHandshake()
            org.jivesoftware.smack.ConnectionConfiguration r1 = r8.getConfiguration()
            javax.net.ssl.HostnameVerifier r1 = r1.getHostnameVerifier()
            if (r1 == 0) goto L_0x0168
            java.lang.String r3 = r8.getServiceName()
            javax.net.ssl.SSLSession r0 = r0.getSession()
            boolean r0 = r1.verify(r3, r0)
            if (r0 == 0) goto L_0x014d
            r8.usingTLS = r2
            return
        L_0x014d:
            java.security.cert.CertificateException r0 = new java.security.cert.CertificateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Hostname verification of certificate failed. Certificate does not authenticate "
            r1.append(r2)
            java.lang.String r2 = r8.getServiceName()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0168:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No HostnameVerifier set. Use connectionConfiguration.setHostnameVerifier() to configure."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smack.tcp.XMPPTCPConnection.proceedTLSReceived():void");
    }

    /* access modifiers changed from: private */
    public void processHandledCount(long j) throws StreamManagementCounterError {
        long calculateDelta = SMUtils.calculateDelta(j, this.serverHandledStanzasCount);
        final ArrayList arrayList = new ArrayList(calculateDelta <= 2147483647L ? (int) calculateDelta : Integer.MAX_VALUE);
        long j2 = 0;
        while (j2 < calculateDelta) {
            Stanza stanza = (Stanza) this.unacknowledgedStanzas.poll();
            if (stanza != null) {
                arrayList.add(stanza);
                j2++;
            } else {
                StreamManagementCounterError streamManagementCounterError = new StreamManagementCounterError(j, this.serverHandledStanzasCount, calculateDelta, arrayList);
                throw streamManagementCounterError;
            }
        }
        boolean z = true;
        if (this.stanzaAcknowledgedListeners.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                String stanzaId = ((Stanza) it.next()).getStanzaId();
                if (stanzaId != null && this.stanzaIdAcknowledgedListeners.containsKey(stanzaId)) {
                    break;
                }
            }
        }
        if (z) {
            asyncGo(new Runnable() {
                public void run() {
                    String str;
                    for (Stanza stanza : arrayList) {
                        Iterator it = XMPPTCPConnection.this.stanzaAcknowledgedListeners.iterator();
                        while (true) {
                            str = "Received not connected exception";
                            if (!it.hasNext()) {
                                break;
                            }
                            try {
                                ((StanzaListener) it.next()).processPacket(stanza);
                            } catch (NotConnectedException e) {
                                XMPPTCPConnection.LOGGER.log(Level.FINER, str, e);
                            }
                        }
                        String stanzaId = stanza.getStanzaId();
                        if (!StringUtils.isNullOrEmpty(stanzaId)) {
                            StanzaListener stanzaListener = (StanzaListener) XMPPTCPConnection.this.stanzaIdAcknowledgedListeners.remove(stanzaId);
                            if (stanzaListener != null) {
                                try {
                                    stanzaListener.processPacket(stanza);
                                } catch (NotConnectedException e2) {
                                    XMPPTCPConnection.LOGGER.log(Level.FINER, str, e2);
                                }
                            }
                        }
                    }
                }
            });
        }
        this.serverHandledStanzasCount = j;
    }

    /* access modifiers changed from: private */
    public void requestSmAcknowledgementInternal() throws NotConnectedException {
        this.packetWriter.sendStreamElement(AckRequest.INSTANCE);
    }

    /* access modifiers changed from: private */
    public void sendSmAcknowledgementInternal() throws NotConnectedException {
        this.packetWriter.sendStreamElement(new AckAnswer(this.clientHandledStanzasCount));
    }

    public static void setDefaultBundleAndDeferCallback(BundleAndDeferCallback bundleAndDeferCallback2) {
        defaultBundleAndDeferCallback = bundleAndDeferCallback2;
    }

    public static void setUseStreamManagementDefault(boolean z) {
        useSmDefault = z;
    }

    @Deprecated
    public static void setUseStreamManagementResumptiodDefault(boolean z) {
        setUseStreamManagementResumptionDefault(z);
    }

    public static void setUseStreamManagementResumptionDefault(boolean z) {
        if (z) {
            setUseStreamManagementDefault(z);
        }
        useSmResumptionDefault = z;
    }

    private void useCompression() throws NotConnectedException, NoResponseException, XMPPException {
        this.maybeCompressFeaturesReceived.checkIfSuccessOrWait();
        XMPPInputOutputStream maybeGetCompressionHandler = maybeGetCompressionHandler();
        this.compressionHandler = maybeGetCompressionHandler;
        if (maybeGetCompressionHandler != null) {
            this.compressSyncPoint.sendAndWaitForResponseOrThrow(new Compress(this.compressionHandler.getCompressionMethod()));
        } else {
            LOGGER.warning("Could not enable compression because no matching handler/method pair was found");
        }
    }

    public boolean addRequestAckPredicate(StanzaFilter stanzaFilter) {
        boolean add;
        synchronized (this.requestAckPredicates) {
            add = this.requestAckPredicates.add(stanzaFilter);
        }
        return add;
    }

    public void addStanzaAcknowledgedListener(StanzaListener stanzaListener) {
        this.stanzaAcknowledgedListeners.add(stanzaListener);
    }

    public StanzaListener addStanzaIdAcknowledgedListener(final String str, StanzaListener stanzaListener) throws StreamManagementNotEnabledException {
        if (this.smWasEnabledAtLeastOnce) {
            schedule(new Runnable() {
                public void run() {
                    XMPPTCPConnection.this.stanzaIdAcknowledgedListeners.remove(str);
                }
            }, (long) Math.min(getMaxSmResumptionTime(), 43200), TimeUnit.SECONDS);
            return (StanzaListener) this.stanzaIdAcknowledgedListeners.put(str, stanzaListener);
        }
        throw new StreamManagementNotEnabledException();
    }

    /* access modifiers changed from: protected */
    public void afterFeaturesReceived() throws SecurityRequiredException, NotConnectedException {
        StartTls startTls = (StartTls) getFeature(StartTls.ELEMENT, StartTls.NAMESPACE);
        if (startTls != null) {
            if (startTls.required() && this.config.getSecurityMode() == SecurityMode.disabled) {
                notifyConnectionError(new SecurityRequiredByServerException());
                return;
            } else if (this.config.getSecurityMode() != SecurityMode.disabled) {
                send(new StartTls());
            }
        }
        if (!isSecureConnection() && startTls == null && getConfiguration().getSecurityMode() == SecurityMode.required) {
            throw new SecurityRequiredByClientException();
        }
        if (getSASLAuthentication().authenticationSuccessful()) {
            this.maybeCompressFeaturesReceived.reportSuccess();
        }
    }

    /* access modifiers changed from: protected */
    public void afterSuccessfulLogin(boolean z) throws NotConnectedException {
        this.disconnectedButResumeable = false;
        super.afterSuccessfulLogin(z);
    }

    /* access modifiers changed from: protected */
    public void connectInternal() throws SmackException, IOException, XMPPException {
        connectUsingConfiguration();
        this.socketClosed = false;
        initConnection();
        this.saslFeatureReceived.checkIfSuccessOrWaitOrThrow();
        this.connected = true;
        callConnectionConnectedListener();
        if (this.wasAuthenticated) {
            login();
            notifyReconnection();
        }
    }

    public int getMaxSmResumptionTime() {
        int i = this.smClientMaxResumptionTime;
        int i2 = Integer.MAX_VALUE;
        if (i <= 0) {
            i = Integer.MAX_VALUE;
        }
        int i3 = this.smServerMaxResumptimTime;
        if (i3 > 0) {
            i2 = i3;
        }
        return Math.min(i, i2);
    }

    public synchronized void instantShutdown() {
        shutdown(true);
    }

    public boolean isDisconnectedButSmResumptionPossible() {
        return this.disconnectedButResumeable && isSmResumptionPossible();
    }

    public boolean isSecureConnection() {
        return this.usingTLS;
    }

    public boolean isSmAvailable() {
        return hasFeature(StreamManagementFeature.ELEMENT, StreamManagement.NAMESPACE);
    }

    public boolean isSmEnabled() {
        return this.smEnabledSyncPoint.wasSuccessful();
    }

    public boolean isSmResumptionPossible() {
        if (this.smSessionId == null) {
            return false;
        }
        Long l = this.packetWriter.shutdownTimestamp;
        if (l == null) {
            return true;
        }
        if (System.currentTimeMillis() > l.longValue() + (((long) getMaxSmResumptionTime()) * 1000)) {
            return false;
        }
        return true;
    }

    public boolean isSocketClosed() {
        return this.socketClosed;
    }

    public boolean isUsingCompression() {
        return this.compressionHandler != null && this.compressSyncPoint.wasSuccessful();
    }

    public synchronized void loginAnonymously() throws XMPPException, SmackException, IOException {
        this.saslFeatureReceived.checkIfSuccessOrWaitOrThrow();
        if (this.saslAuthentication.hasAnonymousAuthentication()) {
            this.saslAuthentication.authenticateAnonymously();
            if (this.config.isCompressionEnabled()) {
                useCompression();
            }
            bindResourceAndEstablishSession(null);
            afterSuccessfulLogin(false);
        } else {
            throw new SmackException("No anonymous SASL authentication mechanism available");
        }
    }

    /* access modifiers changed from: protected */
    public synchronized void loginNonAnonymously(String str, String str2, String str3) throws XMPPException, SmackException, IOException {
        if (this.saslAuthentication.hasNonAnonymousAuthentication()) {
            if (str2 != null) {
                this.saslAuthentication.authenticate(str, str2, str3);
            } else {
                this.saslAuthentication.authenticate(str3, this.config.getCallbackHandler());
            }
            if (this.config.isCompressionEnabled()) {
                useCompression();
            }
            if (isSmResumptionPossible()) {
                this.smResumedSyncPoint.sendAndWaitForResponse(new Resume(this.clientHandledStanzasCount, this.smSessionId));
                if (this.smResumedSyncPoint.wasSuccessful()) {
                    afterSuccessfulLogin(true);
                    return;
                }
                LOGGER.fine("Stream resumption failed, continuing with normal stream establishment process");
            }
            LinkedList<Stanza> linkedList = new LinkedList<>();
            if (this.unacknowledgedStanzas != null) {
                this.unacknowledgedStanzas.drainTo(linkedList);
                dropSmState();
            }
            bindResourceAndEstablishSession(str3);
            if (isSmAvailable() && this.useSm) {
                this.serverHandledStanzasCount = 0;
                this.smEnabledSyncPoint.sendAndWaitForResponseOrThrow(new Enable(this.useSmResumption, this.smClientMaxResumptionTime));
                synchronized (this.requestAckPredicates) {
                    if (this.requestAckPredicates.isEmpty()) {
                        this.requestAckPredicates.add(Predicate.forMessagesOrAfter5Stanzas());
                    }
                }
            }
            for (Stanza sendStanzaInternal : linkedList) {
                sendStanzaInternal(sendStanzaInternal);
            }
            afterSuccessfulLogin(false);
            return;
        }
        throw new SmackException("No non-anonymous SASL authentication mechanism available");
    }

    /* access modifiers changed from: 0000 */
    public void openStream() throws SmackException {
        String serviceName = getServiceName();
        CharSequence username = this.config.getUsername();
        send(new StreamOpen(serviceName, username != null ? C14055b.m60636a(username, (CharSequence) serviceName) : null, getStreamId()));
        try {
            this.packetReader.parser = PacketParserUtils.newXmppParser(this.reader);
        } catch (XmlPullParserException e) {
            throw new SmackException((Throwable) e);
        }
    }

    public void removeAllRequestAckPredicates() {
        synchronized (this.requestAckPredicates) {
            this.requestAckPredicates.clear();
        }
    }

    public void removeAllStanzaAcknowledgedListeners() {
        this.stanzaAcknowledgedListeners.clear();
    }

    public void removeAllStanzaIdAcknowledgedListeners() {
        this.stanzaIdAcknowledgedListeners.clear();
    }

    public boolean removeRequestAckPredicate(StanzaFilter stanzaFilter) {
        boolean remove;
        synchronized (this.requestAckPredicates) {
            remove = this.requestAckPredicates.remove(stanzaFilter);
        }
        return remove;
    }

    public boolean removeStanzaAcknowledgedListener(StanzaListener stanzaListener) {
        return this.stanzaAcknowledgedListeners.remove(stanzaListener);
    }

    public StanzaListener removeStanzaIdAcknowledgedListener(String str) {
        return (StanzaListener) this.stanzaIdAcknowledgedListeners.remove(str);
    }

    public void requestSmAcknowledgement() throws StreamManagementNotEnabledException, NotConnectedException {
        if (isSmEnabled()) {
            requestSmAcknowledgementInternal();
            return;
        }
        throw new StreamManagementNotEnabledException();
    }

    public void send(PlainStreamElement plainStreamElement) throws NotConnectedException {
        this.packetWriter.sendStreamElement(plainStreamElement);
    }

    public void sendSmAcknowledgement() throws StreamManagementNotEnabledException, NotConnectedException {
        if (isSmEnabled()) {
            sendSmAcknowledgementInternal();
            return;
        }
        throw new StreamManagementNotEnabledException();
    }

    /* access modifiers changed from: protected */
    public void sendStanzaInternal(Stanza stanza) throws NotConnectedException {
        this.packetWriter.sendStreamElement(stanza);
        if (isSmEnabled()) {
            for (StanzaFilter accept : this.requestAckPredicates) {
                if (accept.accept(stanza)) {
                    requestSmAcknowledgementInternal();
                    return;
                }
            }
        }
    }

    public void setBundleandDeferCallback(BundleAndDeferCallback bundleAndDeferCallback2) {
        this.bundleAndDeferCallback = bundleAndDeferCallback2;
    }

    public void setPreferredResumptionTime(int i) {
        this.smClientMaxResumptionTime = i;
    }

    public void setUseStreamManagement(boolean z) {
        this.useSm = z;
    }

    public void setUseStreamManagementResumption(boolean z) {
        if (z) {
            setUseStreamManagement(z);
        }
        this.useSmResumption = z;
    }

    /* access modifiers changed from: protected */
    public void setWriter(Writer writer) {
        this.writer = writer;
    }

    /* access modifiers changed from: protected */
    public void shutdown() {
        if (isSmEnabled()) {
            try {
                sendSmAcknowledgementInternal();
            } catch (NotConnectedException e) {
                LOGGER.log(Level.FINE, "Can not send final SM ack as connection is not connected", e);
            }
        }
        shutdown(false);
    }

    public boolean streamWasResumed() {
        return this.smResumedSyncPoint.wasSuccessful();
    }

    /* access modifiers changed from: protected */
    public void throwAlreadyConnectedExceptionIfAppropriate() throws AlreadyConnectedException {
        if (isConnected() && !this.disconnectedButResumeable) {
            throw new AlreadyConnectedException();
        }
    }

    /* access modifiers changed from: protected */
    public void throwAlreadyLoggedInExceptionIfAppropriate() throws AlreadyLoggedInException {
        if (isAuthenticated() && !this.disconnectedButResumeable) {
            throw new AlreadyLoggedInException();
        }
    }

    /* access modifiers changed from: protected */
    public void throwNotConnectedExceptionIfAppropriate() throws NotConnectedException {
        PacketWriter packetWriter2 = this.packetWriter;
        if (packetWriter2 != null) {
            packetWriter2.throwNotConnectedExceptionIfDoneAndResumptionNotPossible();
            return;
        }
        throw new NotConnectedException();
    }

    private void shutdown(boolean z) {
        if (!this.disconnectedButResumeable) {
            PacketReader packetReader2 = this.packetReader;
            if (packetReader2 != null) {
                packetReader2.shutdown();
            }
            PacketWriter packetWriter2 = this.packetWriter;
            if (packetWriter2 != null) {
                packetWriter2.shutdown(z);
            }
            this.socketClosed = true;
            try {
                this.socket.close();
            } catch (Exception e) {
                LOGGER.log(Level.WARNING, "shutdown", e);
            }
            setWasAuthenticated();
            if (!isSmResumptionPossible() || !z) {
                this.disconnectedButResumeable = false;
                this.smSessionId = null;
            } else {
                this.disconnectedButResumeable = true;
            }
            this.authenticated = false;
            this.connected = false;
            this.usingTLS = false;
            this.reader = null;
            this.writer = null;
            this.maybeCompressFeaturesReceived.init();
            this.compressSyncPoint.init();
            this.smResumedSyncPoint.init();
            this.smEnabledSyncPoint.init();
            this.initalOpenStreamSend.init();
        }
    }

    public XMPPTCPConnection(CharSequence charSequence, String str) {
        this(C14055b.m60647g(charSequence.toString()), str, C14055b.m60646f(charSequence.toString()));
    }

    public XMPPTCPConnection(CharSequence charSequence, String str, String str2) {
        this(((Builder) ((Builder) XMPPTCPConnectionConfiguration.builder().setUsernameAndPassword(charSequence, str)).setServiceName(str2)).build());
    }
}
