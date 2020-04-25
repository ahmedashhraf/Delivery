package org.jivesoftware.smackx.receipts;

import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Logger;
import org.jivesoftware.smack.ConnectionCreationListener;
import org.jivesoftware.smack.Manager;
import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.SmackException.NotConnectedException;
import org.jivesoftware.smack.StanzaListener;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPConnectionRegistry;
import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smack.filter.AndFilter;
import org.jivesoftware.smack.filter.MessageTypeFilter;
import org.jivesoftware.smack.filter.MessageWithBodiesFilter;
import org.jivesoftware.smack.filter.NotFilter;
import org.jivesoftware.smack.filter.StanzaExtensionFilter;
import org.jivesoftware.smack.filter.StanzaFilter;
import org.jivesoftware.smack.filter.StanzaTypeFilter;
import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smack.roster.Roster;
import org.jivesoftware.smack.util.StringUtils;
import org.jivesoftware.smackx.disco.ServiceDiscoveryManager;

public class DeliveryReceiptManager extends Manager {
    private static final StanzaListener AUTO_ADD_DELIVERY_RECEIPT_REQUESTS_LISTENER = new StanzaListener() {
        public void processPacket(Stanza stanza) throws NotConnectedException {
            DeliveryReceiptRequest.addTo((Message) stanza);
        }
    };
    /* access modifiers changed from: private */
    public static final Logger LOGGER = Logger.getLogger(DeliveryReceiptManager.class.getName());
    private static final StanzaFilter MESSAGES_TO_REQUEST_RECEIPTS_FOR;
    private static final StanzaFilter MESSAGES_WITH_DELIVERY_RECEIPT;
    private static final StanzaFilter MESSAGES_WITH_DEVLIERY_RECEIPT_REQUEST = new AndFilter(StanzaTypeFilter.MESSAGE, new StanzaExtensionFilter((ExtensionElement) new DeliveryReceiptRequest()));
    private static AutoReceiptMode defaultAutoReceiptMode = AutoReceiptMode.ifIsSubscribed;
    private static Map<XMPPConnection, DeliveryReceiptManager> instances = new WeakHashMap();
    /* access modifiers changed from: private */
    public AutoReceiptMode autoReceiptMode = defaultAutoReceiptMode;
    /* access modifiers changed from: private */
    public final Set<ReceiptReceivedListener> receiptReceivedListeners = new CopyOnWriteArraySet();

    /* renamed from: org.jivesoftware.smackx.receipts.DeliveryReceiptManager$5 */
    static /* synthetic */ class C157255 {

        /* renamed from: $SwitchMap$org$jivesoftware$smackx$receipts$DeliveryReceiptManager$AutoReceiptMode */
        static final /* synthetic */ int[] f45014xc3f23bee = new int[AutoReceiptMode.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                org.jivesoftware.smackx.receipts.DeliveryReceiptManager$AutoReceiptMode[] r0 = org.jivesoftware.smackx.receipts.DeliveryReceiptManager.AutoReceiptMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f45014xc3f23bee = r0
                int[] r0 = f45014xc3f23bee     // Catch:{ NoSuchFieldError -> 0x0014 }
                org.jivesoftware.smackx.receipts.DeliveryReceiptManager$AutoReceiptMode r1 = org.jivesoftware.smackx.receipts.DeliveryReceiptManager.AutoReceiptMode.disabled     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f45014xc3f23bee     // Catch:{ NoSuchFieldError -> 0x001f }
                org.jivesoftware.smackx.receipts.DeliveryReceiptManager$AutoReceiptMode r1 = org.jivesoftware.smackx.receipts.DeliveryReceiptManager.AutoReceiptMode.ifIsSubscribed     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f45014xc3f23bee     // Catch:{ NoSuchFieldError -> 0x002a }
                org.jivesoftware.smackx.receipts.DeliveryReceiptManager$AutoReceiptMode r1 = org.jivesoftware.smackx.receipts.DeliveryReceiptManager.AutoReceiptMode.always     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smackx.receipts.DeliveryReceiptManager.C157255.<clinit>():void");
        }
    }

    public enum AutoReceiptMode {
        disabled,
        ifIsSubscribed,
        always
    }

    static {
        String str = DeliveryReceipt.NAMESPACE;
        String str2 = DeliveryReceipt.ELEMENT;
        MESSAGES_WITH_DELIVERY_RECEIPT = new AndFilter(StanzaTypeFilter.MESSAGE, new StanzaExtensionFilter(str2, str));
        XMPPConnectionRegistry.addConnectionCreationListener(new ConnectionCreationListener() {
            public void connectionCreated(XMPPConnection xMPPConnection) {
                DeliveryReceiptManager.getInstanceFor(xMPPConnection);
            }
        });
        MESSAGES_TO_REQUEST_RECEIPTS_FOR = new AndFilter(MessageTypeFilter.NORMAL_OR_CHAT_OR_HEADLINE, new NotFilter(new StanzaExtensionFilter(str2, str)), MessageWithBodiesFilter.INSTANCE);
    }

    private DeliveryReceiptManager(XMPPConnection xMPPConnection) {
        super(xMPPConnection);
        ServiceDiscoveryManager.getInstanceFor(xMPPConnection).addFeature(DeliveryReceipt.NAMESPACE);
        xMPPConnection.addAsyncStanzaListener(new StanzaListener() {
            public void processPacket(Stanza stanza) throws NotConnectedException {
                DeliveryReceipt from = DeliveryReceipt.from((Message) stanza);
                for (ReceiptReceivedListener onReceiptReceived : DeliveryReceiptManager.this.receiptReceivedListeners) {
                    onReceiptReceived.onReceiptReceived(stanza.getFrom(), stanza.getTo(), from.getId(), stanza);
                }
            }
        }, MESSAGES_WITH_DELIVERY_RECEIPT);
        xMPPConnection.addAsyncStanzaListener(new StanzaListener() {
            public void processPacket(Stanza stanza) throws NotConnectedException {
                String from = stanza.getFrom();
                XMPPConnection access$100 = DeliveryReceiptManager.this.connection();
                int i = C157255.f45014xc3f23bee[DeliveryReceiptManager.this.autoReceiptMode.ordinal()];
                if (i != 1 && (i != 2 || Roster.getInstanceFor(access$100).isSubscribedToMyPresence(from))) {
                    Message message = (Message) stanza;
                    Message receiptMessageFor = DeliveryReceiptManager.receiptMessageFor(message);
                    if (receiptMessageFor == null) {
                        Logger access$300 = DeliveryReceiptManager.LOGGER;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Received message stanza with receipt request from '");
                        sb.append(from);
                        sb.append("' without a stanza ID set. Message: ");
                        sb.append(message);
                        access$300.warning(sb.toString());
                        return;
                    }
                    access$100.sendStanza(receiptMessageFor);
                }
            }
        }, MESSAGES_WITH_DEVLIERY_RECEIPT_REQUEST);
    }

    @Deprecated
    public static String addDeliveryReceiptRequest(Message message) {
        return DeliveryReceiptRequest.addTo(message);
    }

    public static synchronized DeliveryReceiptManager getInstanceFor(XMPPConnection xMPPConnection) {
        DeliveryReceiptManager deliveryReceiptManager;
        synchronized (DeliveryReceiptManager.class) {
            deliveryReceiptManager = (DeliveryReceiptManager) instances.get(xMPPConnection);
            if (deliveryReceiptManager == null) {
                deliveryReceiptManager = new DeliveryReceiptManager(xMPPConnection);
                instances.put(xMPPConnection, deliveryReceiptManager);
            }
        }
        return deliveryReceiptManager;
    }

    public static boolean hasDeliveryReceiptRequest(Message message) {
        return DeliveryReceiptRequest.from(message) != null;
    }

    public static Message receiptMessageFor(Message message) {
        String stanzaId = message.getStanzaId();
        if (StringUtils.isNullOrEmpty(stanzaId)) {
            return null;
        }
        Message message2 = new Message(message.getFrom(), message.getType());
        message2.addExtension(new DeliveryReceipt(stanzaId));
        return message2;
    }

    public static void setDefaultAutoReceiptMode(AutoReceiptMode autoReceiptMode2) {
        defaultAutoReceiptMode = autoReceiptMode2;
    }

    public void addReceiptReceivedListener(ReceiptReceivedListener receiptReceivedListener) {
        this.receiptReceivedListeners.add(receiptReceivedListener);
    }

    public void autoAddDeliveryReceiptRequests() {
        connection().addPacketInterceptor(AUTO_ADD_DELIVERY_RECEIPT_REQUESTS_LISTENER, MESSAGES_TO_REQUEST_RECEIPTS_FOR);
    }

    public void dontAutoAddDeliveryReceiptRequests() {
        connection().removePacketInterceptor(AUTO_ADD_DELIVERY_RECEIPT_REQUESTS_LISTENER);
    }

    public AutoReceiptMode getAutoReceiptMode() {
        return this.autoReceiptMode;
    }

    public boolean isSupported(String str) throws SmackException, XMPPException {
        return ServiceDiscoveryManager.getInstanceFor(connection()).supportsFeature(str, DeliveryReceipt.NAMESPACE);
    }

    public void removeReceiptReceivedListener(ReceiptReceivedListener receiptReceivedListener) {
        this.receiptReceivedListeners.remove(receiptReceivedListener);
    }

    public void setAutoReceiptMode(AutoReceiptMode autoReceiptMode2) {
        this.autoReceiptMode = autoReceiptMode2;
    }
}
