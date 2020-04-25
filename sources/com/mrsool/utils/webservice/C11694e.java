package com.mrsool.utils.webservice;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.gson.C8775f;
import com.mrsool.bean.messages;
import com.mrsool.p426z.C11764a;
import com.mrsool.p426z.C11764a.C11768d;
import com.mrsool.p426z.C11769b;
import com.mrsool.p426z.C11770c;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C5880q;
import com.mrsool.utils.C5887x;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.jivesoftware.smack.ConnectionConfiguration.SecurityMode;
import org.jivesoftware.smack.ConnectionListener;
import org.jivesoftware.smack.ReconnectionManager;
import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.SmackException.NotConnectedException;
import org.jivesoftware.smack.StanzaListener;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smack.chat.Chat;
import org.jivesoftware.smack.chat.ChatManager;
import org.jivesoftware.smack.chat.ChatManagerListener;
import org.jivesoftware.smack.chat.ChatMessageListener;
import org.jivesoftware.smack.filter.MessageTypeFilter;
import org.jivesoftware.smack.p557sm.StreamManagementException.StreamManagementNotEnabledException;
import org.jivesoftware.smack.packet.DefaultExtensionElement;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.packet.Message.Type;
import org.jivesoftware.smack.packet.Presence;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smack.provider.ProviderManager;
import org.jivesoftware.smack.tcp.XMPPTCPConnection;
import org.jivesoftware.smack.tcp.XMPPTCPConnectionConfiguration;
import org.jivesoftware.smack.tcp.XMPPTCPConnectionConfiguration.Builder;
import org.jivesoftware.smack.util.TLSUtils;
import org.jivesoftware.smackx.chatstates.ChatState;
import org.jivesoftware.smackx.chatstates.packet.ChatStateExtension;
import org.jivesoftware.smackx.delay.packet.DelayInformation;
import org.jivesoftware.smackx.disco.ServiceDiscoveryManager;
import org.jivesoftware.smackx.iqregister.AccountManager;
import org.jivesoftware.smackx.offline.OfflineMessageManager;
import org.jivesoftware.smackx.offline.packet.OfflineMessageRequest;
import org.jivesoftware.smackx.ping.PingFailedListener;
import org.jivesoftware.smackx.ping.PingManager;
import org.jivesoftware.smackx.ping.android.ServerPingWithAlarmManager;
import org.jivesoftware.smackx.receipts.DeliveryReceipt;
import org.jivesoftware.smackx.receipts.DeliveryReceipt.Provider;
import org.jivesoftware.smackx.receipts.DeliveryReceiptManager;
import org.jivesoftware.smackx.receipts.DeliveryReceiptManager.AutoReceiptMode;
import org.jivesoftware.smackx.receipts.DeliveryReceiptRequest;
import org.jivesoftware.smackx.receipts.ReceiptReceivedListener;
import org.jivesoftware.smackx.xdata.Form;
import org.jivesoftware.smackx.xevent.DefaultMessageEventRequestListener;
import org.jivesoftware.smackx.xevent.MessageEventManager;
import org.jivesoftware.smackx.xevent.MessageEventNotificationListener;
import org.jivesoftware.smackx.xevent.packet.MessageEvent;
import org.jivesoftware.smackx.xevent.provider.MessageEventProvider;
import org.json.JSONException;
import org.json.JSONObject;
import p053b.p072g.p073b.C2128a;

/* renamed from: com.mrsool.utils.webservice.e */
/* compiled from: XmppUtil */
public enum C11694e implements ConnectionListener {
    INSTANCE;
    
    public static String HOST = null;
    public static Boolean IS_TLS = null;
    public static int PORT = 0;
    public static String SERVICE = null;
    public static final int TIME_DELAY_RECONNECTION = 7;
    public static final String XMPP_RESOURCE = "Android";
    private static final String XMPP_TAG = "XMPP";
    private static volatile C11694e XmppUtil;
    private Builder conf;
    public XMPPTCPConnection connection;
    public final DefaultMessageEventRequestListener defaultMessageEventRequestListener;
    C8775f gson;
    C11708n mChatManagerListener;
    private ConnectionListener mConnectionListener;
    /* access modifiers changed from: private */
    public Context mContext;
    DeliveryReceiptManager mDeliveryReceiptManager;
    C11709o mMessageListener;
    private PingManager mPingManager;
    DefaultMessageEventRequestListener m_DefaultMessageEventRequestListener;
    MessageEventNotificationListener m_messageEventNotificationListener;
    private MessageEventManager messageEventManager;
    C11712p mnListner;
    private Intent notificationIntent;
    /* access modifiers changed from: private */
    public C5887x objUtils;
    private String orderIdNS;
    private String orderIdelementName;
    private String password;
    private List<C11764a> pendingMessages;
    private int reconnectToast;
    private ReconnectionManager reconnectionManager;
    private String statusNS;
    private String statuselementName;
    private String username;

    /* renamed from: com.mrsool.utils.webservice.e$a */
    /* compiled from: XmppUtil */
    class C11695a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Message f33873a;

        /* renamed from: b */
        final /* synthetic */ String f33874b;

        C11695a(Message message, String str) {
            this.f33873a = message;
            this.f33874b = str;
        }

        public void run() {
            String str = "";
            try {
                Message message = new Message(this.f33873a.getFrom(), Type.normal);
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(this.f33873a.getStanzaId());
                message.setBody(sb.toString());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(this.f33874b);
                message.setThread(sb2.toString());
                message.setStanzaId(this.f33873a.getStanzaId());
                message.addExtension(new DeliveryReceipt(this.f33873a.getStanzaId()));
                C11694e.this.connection.sendStanza(message);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.mrsool.utils.webservice.e$b */
    /* compiled from: XmppUtil */
    class C11696b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f33876a;

        /* renamed from: b */
        final /* synthetic */ String f33877b;

        C11696b(String str, String str2) {
            this.f33876a = str;
            this.f33877b = str2;
        }

        public void run() {
            try {
                if (C11694e.this.mo40215k()) {
                    Message message = new Message(this.f33876a, Type.normal);
                    message.setBody("all seen");
                    message.setSubject("seen");
                    StringBuilder sb = new StringBuilder();
                    sb.append("");
                    sb.append(this.f33877b);
                    message.setThread(sb.toString());
                    message.addExtension(new DeliveryReceipt(message.getStanzaId()));
                    C11694e.this.connection.sendStanza(message);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.mrsool.utils.webservice.e$c */
    /* compiled from: XmppUtil */
    class C11697c implements MessageEventNotificationListener {
        C11697c() {
        }

        public void cancelledNotification(String str, String str2) {
        }

        public void composingNotification(String str, String str2) {
        }

        public void deliveredNotification(String str, String str2) {
            System.out.println("deliveredNotification");
        }

        public void displayedNotification(String str, String str2) {
        }

        public void offlineNotification(String str, String str2) {
        }
    }

    /* renamed from: com.mrsool.utils.webservice.e$d */
    /* compiled from: XmppUtil */
    class C11698d extends DefaultMessageEventRequestListener {
        C11698d() {
        }

        public void composingNotificationRequested(String str, String str2, MessageEventManager messageEventManager) {
            super.composingNotificationRequested(str, str2, messageEventManager);
        }

        public void deliveredNotificationRequested(String str, String str2, MessageEventManager messageEventManager) {
            try {
                super.deliveredNotificationRequested(str, str2, messageEventManager);
            } catch (NotConnectedException e) {
                e.printStackTrace();
            }
        }

        public void displayedNotificationRequested(String str, String str2, MessageEventManager messageEventManager) {
            super.displayedNotificationRequested(str, str2, messageEventManager);
        }

        public void offlineNotificationRequested(String str, String str2, MessageEventManager messageEventManager) {
            super.offlineNotificationRequested(str, str2, messageEventManager);
        }
    }

    /* renamed from: com.mrsool.utils.webservice.e$e */
    /* compiled from: XmppUtil */
    class C11699e implements StanzaListener {
        C11699e() {
        }

        public void processPacket(Stanza stanza) {
            Message message = (Message) stanza;
            StringBuilder sb = new StringBuilder();
            sb.append("packet =>");
            sb.append(message);
            C5880q.m25751b(sb.toString());
            DelayInformation delayInformation = (DelayInformation) message.getExtension(DelayInformation.ELEMENT, DelayInformation.NAMESPACE);
            if (delayInformation != null) {
                Date stamp = delayInformation.getStamp();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("offline message is :");
                sb2.append(message);
                sb2.append("\n date is :");
                sb2.append(stamp);
                sb2.append(" \n Constant.shouldIgnoreOfflineMessage :");
                sb2.append(C11644i.f33201U);
                C5880q.m25751b(sb2.toString());
                if (C11644i.f33201U) {
                    return;
                }
            }
            C11694e.this.m52671a(stanza);
            C11644i.f33201U = false;
            if (message.getType() != Type.chat || message.getBody() == null) {
                Type type = message.getType();
                Type type2 = Type.normal;
                String str = C11644i.f33386p4;
                if (type == type2) {
                    if (message.getSubject() == null) {
                        C11694e.this.m52670a(message);
                    } else if (message.getSubject().equalsIgnoreCase("warn")) {
                        C11694e.this.objUtils.mo23473E(str);
                    } else {
                        C11694e.this.m52674b(message);
                    }
                } else if (message.getType() == Type.headline) {
                    C11694e.this.objUtils.mo23473E(str);
                }
            } else {
                messages messages = (messages) C11694e.this.gson.mo32314a(message.getBody(), messages.class);
                try {
                    if (C11694e.this.objUtils == null) {
                        C11694e.this.objUtils = new C5887x(C11694e.this.mContext);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Message is :");
                sb3.append(messages.getTxContent());
                C5880q.m25751b(sb3.toString());
                C11694e.this.m52665a(messages, message);
            }
        }
    }

    /* renamed from: com.mrsool.utils.webservice.e$f */
    /* compiled from: XmppUtil */
    class C11700f implements ReceiptReceivedListener {
        C11700f() {
        }

        public void onReceiptReceived(String str, String str2, String str3, Stanza stanza) {
            StringBuilder sb = new StringBuilder();
            sb.append("onReceiptReceived: from: ");
            sb.append(str);
            sb.append(" to: ");
            sb.append(str2);
            sb.append(" deliveryReceiptId: ");
            sb.append(str3);
            sb.append(" stanza: ");
            sb.append(stanza);
            C5880q.m25750a(sb.toString());
        }
    }

    /* renamed from: com.mrsool.utils.webservice.e$g */
    /* compiled from: XmppUtil */
    class C11701g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Message f33882a;

        C11701g(Message message) {
            this.f33882a = message;
        }

        public void run() {
            if (C11644i.f33226X0 && C11644i.f33194T0.equalsIgnoreCase(this.f33882a.getThread())) {
                Intent intent = new Intent(C11644i.f33133L3);
                intent.putExtra("stanzaId", this.f33882a.getBody().toString());
                C2128a.m11089a(C11694e.this.mContext).mo9219a(intent);
            }
        }
    }

    /* renamed from: com.mrsool.utils.webservice.e$h */
    /* compiled from: XmppUtil */
    class C11702h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Message f33884a;

        C11702h(Message message) {
            this.f33884a = message;
        }

        public void run() {
            if (C11644i.f33226X0 && C11644i.f33194T0.equalsIgnoreCase(this.f33884a.getThread())) {
                Intent intent = new Intent(C11644i.f33125K3);
                intent.putExtra("stanzaId", this.f33884a.getBody().toString());
                StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(this.f33884a.getSubject());
                intent.putExtra("subject", sb.toString());
                intent.putExtra("toId", this.f33884a.getTo());
                C2128a.m11089a(C11694e.this.mContext).mo9219a(intent);
            }
        }
    }

    /* renamed from: com.mrsool.utils.webservice.e$i */
    /* compiled from: XmppUtil */
    class C11703i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ messages f33887a;

        /* renamed from: b */
        final /* synthetic */ Message f33888b;

        C11703i(messages messages, Message message) {
            this.f33887a = messages;
            this.f33888b = message;
        }

        public void run() {
            if ((C11644i.f33226X0 && C11644i.f33194T0.equalsIgnoreCase(this.f33887a.getiToOrderID())) || C11694e.this.objUtils.mo23583b(C11694e.this.mContext)) {
                Intent intent = new Intent(C11644i.f33117J3);
                intent.putExtra(C11644i.f33274c6, this.f33887a);
                intent.putExtra("stanzaId", this.f33888b.getStanzaId());
                C2128a.m11089a(C11694e.this.mContext).mo9219a(intent);
                C11694e.this.mo40198a(this.f33888b, this.f33887a.getiToOrderID());
            } else if (C11644i.f33269c1 && !C11644i.f33226X0 && !C11644i.f33234Y0 && !C11644i.f33242Z0 && C11644i.f33251a1) {
                try {
                    C11694e.this.objUtils.mo23617f0();
                    C11694e.this.objUtils.mo23658s(this.f33887a.getOrderId() != null ? this.f33887a.getOrderId() : this.f33887a.getiToOrderID());
                    C11694e.this.objUtils.mo23473E(C11644i.f33237Y3);
                    C11694e.this.objUtils.mo23473E(C11644i.f33245Z3);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: com.mrsool.utils.webservice.e$j */
    /* compiled from: XmppUtil */
    class C11704j implements ReceiptReceivedListener {
        C11704j() {
        }

        public void onReceiptReceived(String str, String str2, String str3, Stanza stanza) {
            C5880q.m25751b("onReceiptReceived");
        }
    }

    /* renamed from: com.mrsool.utils.webservice.e$k */
    /* compiled from: XmppUtil */
    class C11705k implements PingFailedListener {
        C11705k() {
        }

        public void pingFailed() {
            C11694e.this.objUtils.mo23627i("error in ping");
        }
    }

    /* renamed from: com.mrsool.utils.webservice.e$l */
    /* compiled from: XmppUtil */
    class C11706l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ messages f33891a;

        C11706l(messages messages) {
            this.f33891a = messages;
        }

        public void run() {
            String str = "show";
            try {
                if (C11694e.this.mo40215k()) {
                    Message message = new Message(this.f33891a.getiToUserId(), Type.headline);
                    message.setBody(str);
                    message.setSubject(str);
                    StringBuilder sb = new StringBuilder();
                    sb.append("");
                    sb.append(this.f33891a.getOrderId());
                    message.setThread(sb.toString());
                    message.addExtension(new DeliveryReceipt(message.getStanzaId()));
                    C11694e.this.connection.sendStanza(message);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.mrsool.utils.webservice.e$m */
    /* compiled from: XmppUtil */
    class C11707m extends DefaultMessageEventRequestListener {
        C11707m() {
        }

        public void composingNotificationRequested(String str, String str2, MessageEventManager messageEventManager) {
            super.composingNotificationRequested(str, str2, messageEventManager);
            if (str != null) {
                try {
                    if (C11694e.this.mo40216p()) {
                        messageEventManager.sendComposingNotification(str, str2);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        public void deliveredNotificationRequested(String str, String str2, MessageEventManager messageEventManager) {
            try {
                C5880q.m25751b("deliveredNotificationRequested");
                if (str != null && C11694e.this.mo40216p()) {
                    super.deliveredNotificationRequested(str, str2, messageEventManager);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void displayedNotificationRequested(String str, String str2, MessageEventManager messageEventManager) {
            super.displayedNotificationRequested(str, str2, messageEventManager);
            try {
                C5880q.m25751b("displayedNotificationRequested");
                if (str != null && C11694e.this.mo40216p()) {
                    messageEventManager.sendDisplayedNotification(str, str2);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void offlineNotificationRequested(String str, String str2, MessageEventManager messageEventManager) {
            super.offlineNotificationRequested(str, str2, messageEventManager);
        }
    }

    /* renamed from: com.mrsool.utils.webservice.e$n */
    /* compiled from: XmppUtil */
    private class C11708n implements ChatManagerListener {
        private C11708n() {
        }

        public void chatCreated(Chat chat, boolean z) {
            chat.addMessageListener(C11694e.this.mMessageListener);
        }

        /* synthetic */ C11708n(C11694e eVar, C11699e eVar2) {
            this();
        }
    }

    /* renamed from: com.mrsool.utils.webservice.e$o */
    /* compiled from: XmppUtil */
    private class C11709o implements ChatMessageListener {

        /* renamed from: com.mrsool.utils.webservice.e$o$a */
        /* compiled from: XmppUtil */
        class C11710a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Message f33896a;

            C11710a(Message message) {
                this.f33896a = message;
            }

            public void run() {
                if (C11644i.f33226X0 && C11644i.f33194T0.equalsIgnoreCase(this.f33896a.getThread())) {
                    Intent intent = new Intent(C11644i.f33133L3);
                    intent.putExtra("stanzaId", this.f33896a.getBody().toString());
                    C2128a.m11089a(C11694e.this.mContext).mo9219a(intent);
                }
            }
        }

        /* renamed from: com.mrsool.utils.webservice.e$o$b */
        /* compiled from: XmppUtil */
        class C11711b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Message f33898a;

            C11711b(Message message) {
                this.f33898a = message;
            }

            public void run() {
                StringBuilder sb = new StringBuilder();
                sb.append("Message Received::");
                sb.append(this.f33898a.getStanzaId());
                sb.append("::Thred::");
                sb.append(this.f33898a.getThread());
                C5880q.m25751b(sb.toString());
                if (C11644i.f33226X0 && C11644i.f33194T0.equalsIgnoreCase(this.f33898a.getThread())) {
                    Intent intent = new Intent(C11644i.f33125K3);
                    intent.putExtra("stanzaId", this.f33898a.getBody().toString());
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("");
                    sb2.append(this.f33898a.getSubject());
                    intent.putExtra("subject", sb2.toString());
                    intent.putExtra("toId", this.f33898a.getTo());
                    C2128a.m11089a(C11694e.this.mContext).mo9219a(intent);
                }
            }
        }

        public C11709o(Context context) {
        }

        /* renamed from: a */
        private void m52701a(Message message) {
            new Handler(Looper.getMainLooper()).post(new C11711b(message));
        }

        /* renamed from: b */
        private void m52702b(Message message) {
            new Handler(Looper.getMainLooper()).post(new C11710a(message));
        }

        public void processMessage(Chat chat, Message message) {
            StringBuilder sb = new StringBuilder();
            sb.append("MyXMPP_MESSAGE_LISTENERXmpp message received: '");
            sb.append(message);
            C5880q.m25751b(sb.toString());
            if (C11694e.this.objUtils == null) {
                C11694e eVar = C11694e.this;
                eVar.objUtils = new C5887x(eVar.mContext);
            }
            if (message.getType() == Type.chat && message.getBody() != null) {
                messages messages = (messages) C11694e.this.gson.mo32314a(message.getBody(), messages.class);
                try {
                    if (C11694e.this.objUtils == null) {
                        C11694e.this.objUtils = new C5887x(C11694e.this.mContext);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else if (message.getType() == Type.normal) {
                if (message.getSubject() == null) {
                    m52701a(message);
                } else {
                    C5880q.m25751b("Seen");
                    m52702b(message);
                }
            }
            if (message.getType() == Type.normal && message.getBody() != null && message.getSubject() != null && message.getSubject().equalsIgnoreCase("warn")) {
                C2128a.m11089a(C11694e.this.mContext).mo9219a(new Intent(C11644i.f33386p4));
            }
        }
    }

    /* renamed from: com.mrsool.utils.webservice.e$p */
    /* compiled from: XmppUtil */
    private class C11712p implements StanzaListener {
        public C11712p(Context context) {
        }

        public void processPacket(Stanza stanza) throws NotConnectedException {
        }
    }

    static {
        XmppUtil = null;
        SERVICE = C11644i.f33322i0;
        HOST = C11644i.f33331j0;
        PORT = Integer.parseInt(C11644i.f33340k0);
        IS_TLS = C11644i.f33349l0;
    }

    /* renamed from: s */
    private void m52675s() {
        this.mPingManager = PingManager.getInstanceFor(this.connection);
        this.mPingManager.setPingInterval(120);
        this.mPingManager.registerPingFailedListener(new C11705k());
    }

    /* renamed from: t */
    private int m52676t() {
        String valueOf = String.valueOf(new Date().getTime());
        return Integer.valueOf(valueOf.substring(valueOf.length() - 5)).intValue();
    }

    /* renamed from: u */
    public static C11694e m52677u() {
        return INSTANCE;
    }

    /* renamed from: v */
    private void m52678v() {
    }

    /* renamed from: w */
    private void m52679w() {
        if (this.pendingMessages.size() > 0 && mo40213h() && mo40215k()) {
            for (int i = 0; i < this.pendingMessages.size(); i++) {
                C5880q.m25751b("Message send from pending");
                try {
                    this.connection.sendStanza((Stanza) this.pendingMessages.get(i));
                } catch (NotConnectedException e) {
                    e.printStackTrace();
                }
                this.pendingMessages.remove(i);
            }
        }
    }

    public void authenticated(XMPPConnection xMPPConnection, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("XmppUtil authenticated=====connected:");
        sb.append(mo40216p());
        sb.append("authenticated:");
        sb.append(mo40215k());
        C5880q.m25751b(sb.toString());
        m52675s();
        if (!z) {
            try {
                this.connection.setUseStreamManagement(true);
                this.connection.setUseStreamManagementResumption(true);
                XMPPTCPConnection.setUseStreamManagementDefault(true);
                XMPPTCPConnection.setUseStreamManagementResumptionDefault(true);
                this.connection.sendSmAcknowledgement();
                this.connection.requestSmAcknowledgement();
            } catch (NotConnectedException | StreamManagementNotEnabledException e) {
                e.printStackTrace();
            }
        }
        new C5887x(this.mContext).mo23473E(C11644i.f33353l4);
    }

    /* renamed from: c */
    public boolean mo40202c(String str, String str2) {
        C5880q.m25751b("XmppUtil register");
        try {
            if (mo40216p()) {
                AccountManager.getInstance(this.connection).createAccount(str, str2);
                StringBuilder sb = new StringBuilder();
                sb.append(" Account created successfully :");
                sb.append(str);
                C5880q.m25751b(sb.toString());
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            try {
                this.objUtils.mo23610e(e.getMessage());
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public void connected(XMPPConnection xMPPConnection) {
        StringBuilder sb = new StringBuilder();
        sb.append("XmppUtil connected=====connected:");
        sb.append(mo40216p());
        sb.append("authenticated:");
        sb.append(mo40215k());
        C5880q.m25751b(sb.toString());
        C11644i.f33201U = false;
        C5887x xVar = new C5887x(this.mContext);
        xVar.mo23627i("Connected");
        xVar.mo23473E(C11644i.f33353l4);
    }

    public void connectionClosed() {
        StringBuilder sb = new StringBuilder();
        sb.append("XmppUtil connectionClosedconnected:");
        sb.append(mo40216p());
        sb.append("authenticated:");
        sb.append(mo40215k());
        C5880q.m25751b(sb.toString());
        try {
            if (Looper.myLooper() == null) {
                Looper.prepare();
            }
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("XmppUtilUtils : connectToXmpp looperexception:");
            sb2.append(e.getMessage());
            C5880q.m25751b(sb2.toString());
        }
        C5887x xVar = new C5887x(this.mContext);
        xVar.mo23473E(C11644i.f33353l4);
        xVar.mo23627i("connectionClosed");
        mo40209e();
    }

    public void connectionClosedOnError(Exception exc) {
        this.reconnectToast++;
        try {
            if (exc.getMessage().equalsIgnoreCase("SSL/TLS required by client but not supported by server")) {
                return;
            }
        } catch (Exception unused) {
        }
        StringBuilder sb = new StringBuilder();
        sb.append("XmppUtil connectionClosedOnError======exception:");
        sb.append(exc.getMessage());
        String str = "connected:";
        sb.append(str);
        sb.append(mo40216p());
        String str2 = "authenticated:";
        sb.append(str2);
        sb.append(mo40215k());
        C5880q.m25751b(sb.toString());
        mo40209e();
        C5887x xVar = new C5887x(this.mContext);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("connectionClosedOnError======exception:");
        sb2.append(exc.getMessage());
        sb2.append(str);
        sb2.append(mo40216p());
        sb2.append(str2);
        sb2.append(mo40215k());
        xVar.mo23627i(sb2.toString());
        if (xVar.mo23620g()) {
            xVar.mo23626i();
        }
        xVar.mo23473E(C11644i.f33353l4);
    }

    /* renamed from: d */
    public void mo40207d() {
        C5880q.m25751b("XmppUtil LoginOrRegister");
        try {
            if (this.username != null && !mo40215k() && !mo40201b(this.username, this.password)) {
                mo40202c(this.username, this.password);
                if (!mo40215k()) {
                    mo40201b(this.username, this.password);
                }
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("XmppUtil LoginOrRegisterexception:");
            sb.append(e.getMessage());
            C5880q.m25751b(sb.toString());
            try {
                this.objUtils.mo23610e(e.getMessage());
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: e */
    public synchronized void mo40209e() {
        if (this.connection != null) {
            if (this.mConnectionListener != null) {
                this.connection.removeConnectionListener(this.mConnectionListener);
            }
            if (this.connection.isConnected()) {
                try {
                    this.connection.disconnect(new Presence(Presence.Type.unavailable));
                    C11644i.f33201U = false;
                } catch (Exception e) {
                    try {
                        e.printStackTrace();
                        C5887x xVar = this.objUtils;
                        StringBuilder sb = new StringBuilder();
                        sb.append(" error while disconnect :: ");
                        sb.append(e.getMessage());
                        xVar.mo23627i(sb.toString());
                    } catch (Throwable th) {
                        this.connection = null;
                        throw th;
                    }
                }
                this.connection = null;
            }
        }
        this.mConnectionListener = null;
        this.reconnectionManager = null;
    }

    /* renamed from: f */
    public void mo40210f() {
        C5880q.m25751b("XmppUtil disconnect");
        C5887x xVar = new C5887x(this.mContext);
        xVar.mo23627i("disconnected");
        xVar.mo23473E(C11644i.f33353l4);
    }

    /* renamed from: g */
    public XMPPTCPConnection mo40212g() {
        return this.connection;
    }

    /* renamed from: h */
    public boolean mo40213h() {
        return mo40214j();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public boolean mo40214j() {
        XMPPTCPConnection xMPPTCPConnection = this.connection;
        if (xMPPTCPConnection != null) {
            return xMPPTCPConnection.isConnected();
        }
        return false;
    }

    /* renamed from: k */
    public boolean mo40215k() {
        return mo40216p() && this.connection.isAuthenticated();
    }

    /* renamed from: p */
    public boolean mo40216p() {
        XMPPTCPConnection xMPPTCPConnection = this.connection;
        return xMPPTCPConnection != null && xMPPTCPConnection.isConnected();
    }

    /* renamed from: q */
    public void mo40217q() throws IOException, XMPPException, SmackException {
        this.connection.login(this.username, this.password, "Android");
        DeliveryReceiptManager.getInstanceFor(this.connection).setAutoReceiptMode(AutoReceiptMode.always);
        DeliveryReceiptManager.getInstanceFor(this.connection).addReceiptReceivedListener(C11770c.m52917a());
        MessageEventManager.getInstanceFor(this.connection).addMessageEventNotificationListener(C11769b.m52915a());
    }

    /* renamed from: r */
    public int mo40218r() {
        try {
            Form formFrom = Form.getFormFrom(ServiceDiscoveryManager.getInstanceFor(this.connection).discoverInfo(null, OfflineMessageRequest.NAMESPACE));
            if (formFrom != null) {
                return Integer.parseInt(formFrom.getField("number_of_messages").getValues().toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public void reconnectingIn(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("XmppUtil reconnectingIn=== =seconds:");
        sb.append(i);
        C5880q.m25751b(sb.toString());
    }

    public void reconnectionFailed(Exception exc) {
        StringBuilder sb = new StringBuilder();
        sb.append("XmppUtil reconnectionFailed=====exception:");
        sb.append(exc.getMessage());
        sb.append("connected:");
        sb.append(mo40216p());
        sb.append("authenticated:");
        sb.append(mo40215k());
        C5880q.m25751b(sb.toString());
        mo40209e();
        new C5887x(this.mContext).mo23473E(C11644i.f33353l4);
    }

    public void reconnectionSuccessful() {
        StringBuilder sb = new StringBuilder();
        sb.append("XmppUtil reconnectionSuccessful====connected:");
        sb.append(mo40216p());
        sb.append("authenticated:");
        sb.append(mo40215k());
        C5880q.m25751b(sb.toString());
        if (mo40216p() && !mo40215k()) {
            mo40207d();
        }
        new C5887x(this.mContext).mo23473E(C11644i.f33353l4);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m52674b(Message message) {
        new Handler(Looper.getMainLooper()).post(new C11701g(message));
    }

    /* renamed from: b */
    public boolean mo40201b(String str, String str2) {
        C5880q.m25751b("XmppUtil login");
        try {
            if (mo40216p()) {
                if (!this.connection.isAuthenticated()) {
                    try {
                        this.connection.login(str, str2);
                    } catch (Exception e) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("xmpp login error is : ");
                        sb.append(e.getMessage());
                        C5880q.m25751b(sb.toString());
                        e.printStackTrace();
                    }
                }
                if (this.connection.isAuthenticated()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("XmppUtil logged in as=====user:");
                    sb2.append(this.connection.getUser());
                    C5880q.m25751b(sb2.toString());
                    ChatManager.getInstanceFor(this.connection).addChatListener(this.mChatManagerListener);
                    MessageEventManager.getInstanceFor(this.connection).addMessageEventNotificationListener(this.m_messageEventNotificationListener);
                    MessageEventManager.getInstanceFor(this.connection).addMessageEventRequestListener(this.m_DefaultMessageEventRequestListener);
                    DeliveryReceiptManager instanceFor = DeliveryReceiptManager.getInstanceFor(this.connection);
                    instanceFor.setAutoReceiptMode(AutoReceiptMode.always);
                    instanceFor.addReceiptReceivedListener(new C11704j());
                    MessageEventManager.getInstanceFor(this.connection).addMessageEventNotificationListener(C11769b.m52915a());
                    C5880q.m25751b("Listner added successfully");
                    C5887x xVar = new C5887x(this.mContext);
                    if (C11644i.f33193T) {
                        xVar.mo23473E(C11644i.f33353l4);
                    }
                    xVar.mo23473E(C11644i.f33142M4);
                    return true;
                }
            }
        } catch (Exception e2) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("xmpputil login Failed to login as ");
            sb3.append(str);
            sb3.append("and");
            sb3.append(e2.getMessage());
            C5880q.m25751b(sb3.toString());
            C5887x xVar2 = this.objUtils;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Failed to login as : ");
            sb4.append(e2.getMessage());
            xVar2.mo23627i(sb4.toString());
            e2.printStackTrace();
        }
        return false;
    }

    /* renamed from: f */
    public void mo40211f(String str, String str2) {
        new Thread(new C11696b(str, str2)).start();
    }

    /* renamed from: a */
    public void mo40196a(Context context) {
        this.mContext = context;
    }

    /* renamed from: a */
    public void mo40197a(Context context, String str, String str2, ConnectionListener connectionListener) throws IOException, XMPPException, SmackException, NoSuchAlgorithmException, KeyManagementException {
        C5880q.m25751b("XmppUtil :connect");
        this.mChatManagerListener = new C11708n(this, null);
        this.mContext = context;
        this.username = str;
        this.password = str2;
        this.mMessageListener = new C11709o(this.mContext);
        this.mnListner = new C11712p(this.mContext);
        this.gson = new C8775f();
        if (!TextUtils.isEmpty(C11644i.f33322i0) && !TextUtils.isEmpty(C11644i.f33331j0) && !TextUtils.isEmpty(C11644i.f33340k0)) {
            if (!mo40213h()) {
                if (this.conf == null) {
                    this.conf = XMPPTCPConnectionConfiguration.builder();
                }
                this.conf.setHost(C11644i.f33331j0);
                this.conf.setPort(Integer.parseInt(C11644i.f33340k0));
                this.conf.setServiceName(C11644i.f33322i0);
                this.conf.setCompressionEnabled(false);
                this.conf.setSecurityMode(C11644i.f33349l0.booleanValue() ? SecurityMode.required : SecurityMode.disabled);
                TLSUtils.acceptAllCertificates(this.conf);
                ProviderManager.addExtensionProvider(DeliveryReceipt.ELEMENT, DeliveryReceipt.NAMESPACE, new Provider());
                ProviderManager.addExtensionProvider("request", new DeliveryReceiptRequest().getNamespace(), new DeliveryReceiptRequest.Provider());
                ProviderManager.addExtensionProvider("x", new MessageEvent().getNamespace(), new MessageEventProvider());
                mo40209e();
                this.mConnectionListener = connectionListener;
                this.connection = new XMPPTCPConnection(this.conf.build());
                this.connection.setUseStreamManagement(true);
                this.connection.setUseStreamManagementResumption(true);
                this.reconnectionManager = ReconnectionManager.getInstanceFor(this.connection);
                this.reconnectionManager.disableAutomaticReconnection();
                try {
                    this.reconnectionManager.setFixedDelay(7);
                } catch (Exception unused) {
                }
                ServerPingWithAlarmManager.getInstanceFor(this.connection).setEnabled(true);
                this.connection.addSyncStanzaListener(new C11699e(), MessageTypeFilter.CHAT);
                this.connection.setPacketReplyTimeout(60000);
                this.connection.connect();
                this.connection.addConnectionListener(this);
                MessageEventManager.getInstanceFor(this.connection).addMessageEventRequestListener(this.defaultMessageEventRequestListener);
                DeliveryReceiptManager.getInstanceFor(this.connection).addReceiptReceivedListener(new C11700f());
                if (mo40216p() && !mo40215k()) {
                    mo40207d();
                }
            } else if (!mo40215k()) {
                mo40207d();
            }
        }
    }

    /* renamed from: d */
    public String mo40206d(String str, String str2) {
        String str3 = "";
        C11764a aVar = new C11764a();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("@");
        sb.append(SERVICE);
        aVar.setTo(sb.toString());
        aVar.mo40273a(C11768d.headline);
        aVar.mo40274a(str2);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", "headline");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str3);
            sb2.append(str2);
            jSONObject.put("iOrderID", sb2.toString());
            jSONObject.put("FromeView", str3);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        aVar.setBody(jSONObject.toString());
        try {
            if (this.connection.isAuthenticated()) {
                C5880q.m25751b("sent stanza");
                this.connection.sendStanza(aVar);
            } else {
                mo40207d();
            }
        } catch (NotConnectedException unused) {
            C5880q.m25751b("xmpp.SendMessage() msg Not sent!-Not Connected!");
        } catch (Exception e2) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("xmpp.SendMessage()-Exce msg Not sent!");
            sb3.append(e2.getMessage());
            C5880q.m25751b(sb3.toString());
        }
        return aVar.getStanzaId();
    }

    /* renamed from: e */
    public String mo40208e(String str, String str2) {
        String str3 = "";
        if (this.objUtils == null) {
            this.objUtils = new C5887x(this.mContext);
        }
        C11764a aVar = new C11764a();
        StringBuilder sb = new StringBuilder();
        sb.append(this.objUtils.mo23476G());
        String str4 = "@";
        sb.append(str4);
        sb.append(SERVICE);
        aVar.setFrom(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(str4);
        sb2.append(SERVICE);
        aVar.setTo(sb2.toString());
        aVar.mo40273a(C11768d.headline);
        aVar.mo40274a(str2);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", "headline");
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str3);
            sb3.append(str2);
            jSONObject.put("iOrderID", sb3.toString());
            jSONObject.put("FromeView", "Show");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        aVar.setBody(jSONObject.toString());
        try {
            if (this.connection.isAuthenticated()) {
                C5880q.m25751b("sent stanza");
                this.connection.sendStanza(aVar);
            } else {
                mo40207d();
            }
        } catch (NotConnectedException unused) {
            C5880q.m25751b("xmpp.SendMessage() msg Not sent!-Not Connected!");
        } catch (Exception e2) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("xmpp.SendMessage()-Exce msg Not sent!");
            sb4.append(e2.getMessage());
            C5880q.m25751b(sb4.toString());
        }
        return str3;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m52670a(Message message) {
        new Handler(Looper.getMainLooper()).post(new C11702h(message));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m52665a(messages messages, Message message) {
        new Handler(Looper.getMainLooper()).post(new C11703i(messages, message));
    }

    /* renamed from: a */
    public String mo40195a(messages messages, String str) {
        String str2 = "audio";
        String a = this.gson.mo32317a((Object) messages);
        C11764a aVar = new C11764a();
        aVar.setBody(a);
        StringBuilder sb = new StringBuilder();
        sb.append(messages.getiFromUserId());
        String str3 = "@";
        sb.append(str3);
        sb.append(SERVICE);
        aVar.setFrom(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(messages.getiToUserId());
        sb2.append(str3);
        sb2.append(SERVICE);
        aVar.setTo(sb2.toString());
        aVar.mo40273a(C11768d.chat);
        aVar.mo40274a(messages.getOrderId());
        try {
            if (this.connection.isAuthenticated()) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Message send:");
                sb3.append(messages.getTxContent());
                C5880q.m25751b(sb3.toString());
                this.connection.sendStanza(aVar);
            } else {
                if (messages.getvType().equalsIgnoreCase(str2)) {
                    if (this.pendingMessages == null) {
                        this.pendingMessages = new ArrayList();
                    }
                    this.pendingMessages.add(aVar);
                }
                C5880q.m25751b("LoginOrRegister()");
                mo40207d();
            }
        } catch (NotConnectedException unused) {
            C5880q.m25751b("xmpp.SendMessage() msg Not sent!-Not Connected!");
            if (messages.getvType().equalsIgnoreCase(str2)) {
                if (this.pendingMessages == null) {
                    this.pendingMessages = new ArrayList();
                }
                this.pendingMessages.add(aVar);
            }
        } catch (Exception e) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("xmpp.SendMessage()-Exce msg Not sent!");
            sb4.append(e.getMessage());
            C5880q.m25751b(sb4.toString());
            if (messages.getvType().equalsIgnoreCase(str2)) {
                if (this.pendingMessages == null) {
                    this.pendingMessages = new ArrayList();
                }
                this.pendingMessages.add(aVar);
            }
        }
        return aVar.getStanzaId();
    }

    /* renamed from: a */
    public String mo40194a(messages messages) {
        if (this.objUtils == null) {
            this.objUtils = new C5887x(this.mContext);
        }
        String a = this.gson.mo32317a((Object) messages);
        C11764a aVar = new C11764a();
        aVar.setBody(a);
        aVar.setSubject("warn");
        StringBuilder sb = new StringBuilder();
        sb.append(this.objUtils.mo23476G());
        String str = "@";
        sb.append(str);
        sb.append(SERVICE);
        aVar.setFrom(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(messages.getiToUserId());
        sb2.append(str);
        sb2.append(SERVICE);
        aVar.setTo(sb2.toString());
        aVar.mo40273a(C11768d.normal);
        aVar.mo40274a(messages.getOrderId());
        try {
            if (this.connection.isAuthenticated()) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Message send in warnig: ");
                sb3.append(aVar.toString());
                C5880q.m25751b(sb3.toString());
                this.connection.sendStanza(aVar);
            } else {
                mo40207d();
            }
        } catch (NotConnectedException unused) {
            C5880q.m25751b("xmpp.SendMessage() msg Not sent!-Not Connected!");
        } catch (Exception e) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("xmpp.SendMessage()-Exce msg Not sent!");
            sb4.append(e.getMessage());
            C5880q.m25751b(sb4.toString());
        }
        new Thread(new C11706l(messages)).start();
        return aVar.getStanzaId();
    }

    /* renamed from: a */
    public void mo40198a(Message message, String str) {
        new Thread(new C11695a(message, str)).start();
    }

    /* renamed from: a */
    public static void m52669a(XMPPConnection xMPPConnection, Context context) throws Exception {
        OfflineMessageManager offlineMessageManager = new OfflineMessageManager(xMPPConnection);
        if (!offlineMessageManager.supportsFlexibleRetrieval()) {
            C5880q.m25751b("Offline messages not supported");
            return;
        }
        if (offlineMessageManager.getMessageCount() == 0) {
            C5880q.m25751b("No offline messages found on server");
        } else {
            for (Message message : offlineMessageManager.getMessages()) {
                message.getFrom();
                String body = message.getBody();
                if (body != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Retrieved offline message from ");
                    sb.append(body);
                    C5880q.m25751b(sb.toString());
                }
            }
            offlineMessageManager.deleteMessages();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m52671a(Stanza stanza) {
        Message message = (Message) stanza;
        if (message.getBody() == null && message.getSubject() == null) {
            if (C11644i.f33194T0.equalsIgnoreCase((String) m52664a(message, this.orderIdNS, this.orderIdelementName))) {
                String xmlStringBuilder = message.toXML().toString();
                String str = (String) m52664a(message, this.statusNS, this.statuselementName);
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                if (xmlStringBuilder.contains(ChatState.composing.toString()) || xmlStringBuilder.contains(ChatState.paused.toString())) {
                    Intent intent = new Intent(C11644i.f33158O4);
                    StringBuilder sb = new StringBuilder();
                    String str2 = "";
                    sb.append(str2);
                    sb.append(C11713f.COMPOSING.ordinal());
                    String str3 = "status";
                    if (sb.toString().equalsIgnoreCase(str)) {
                        intent.putExtra(str3, C11713f.COMPOSING.ordinal());
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str2);
                        sb2.append(C11713f.COMPOSING_PAUSED.ordinal());
                        if (sb2.toString().equalsIgnoreCase(str)) {
                            intent.putExtra(str3, C11713f.COMPOSING_PAUSED.ordinal());
                        } else {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(str2);
                            sb3.append(C11713f.RECORDING.ordinal());
                            if (sb3.toString().equalsIgnoreCase(str)) {
                                intent.putExtra(str3, C11713f.RECORDING.ordinal());
                            } else {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append(str2);
                                sb4.append(C11713f.RECORDING_PAUSED.ordinal());
                                if (sb4.toString().equalsIgnoreCase(str)) {
                                    intent.putExtra(str3, C11713f.RECORDING_PAUSED.ordinal());
                                }
                            }
                        }
                    }
                    C2128a.m11089a(this.mContext).mo9219a(intent);
                }
            }
        }
    }

    /* renamed from: a */
    private Object m52664a(Message message, String str, String str2) {
        try {
            DefaultExtensionElement defaultExtensionElement = (DefaultExtensionElement) message.getExtension(str);
            if (defaultExtensionElement != null) {
                return defaultExtensionElement.getValue(str2);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: a */
    public void mo40199a(ChatState chatState, String str, int i) {
        String str2 = "@";
        try {
            if (mo40213h() && mo40215k()) {
                if (this.objUtils == null) {
                    this.objUtils = new C5887x(this.mContext);
                }
                Message message = new Message();
                message.setBody(null);
                message.setThread(null);
                message.setType(Type.chat);
                message.setSubject(null);
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(str2);
                sb.append(SERVICE);
                message.setTo(sb.toString());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.objUtils.mo23476G());
                sb2.append(str2);
                sb2.append(SERVICE);
                message.setFrom(sb2.toString());
                DefaultExtensionElement defaultExtensionElement = new DefaultExtensionElement(this.orderIdelementName, this.orderIdNS);
                String str3 = this.orderIdelementName;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("");
                sb3.append(C11644i.f33194T0);
                defaultExtensionElement.setValue(str3, sb3.toString());
                message.addExtension(defaultExtensionElement);
                DefaultExtensionElement defaultExtensionElement2 = new DefaultExtensionElement(this.statuselementName, this.statusNS);
                defaultExtensionElement2.setValue(this.statuselementName, String.valueOf(i));
                message.addExtension(defaultExtensionElement2);
                message.addExtension(new ChatStateExtension(chatState));
                this.connection.sendStanza(message);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
