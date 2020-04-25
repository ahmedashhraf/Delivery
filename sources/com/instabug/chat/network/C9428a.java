package com.instabug.chat.network;

import android.content.Context;
import com.facebook.common.util.UriUtil;
import com.instabug.chat.cache.ChatsCacheManager;
import com.instabug.chat.eventbus.C9414a;
import com.instabug.chat.eventbus.ChatTimeUpdatedEventBus;
import com.instabug.chat.eventbus.ChatTriggeringEventBus;
import com.instabug.chat.model.Attachment;
import com.instabug.chat.model.Chat;
import com.instabug.chat.model.Chat.ChatState;
import com.instabug.chat.model.Message;
import com.instabug.chat.model.Message.MessageState;
import com.instabug.chat.settings.C9441a;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.internal.storage.cache.InMemoryCache;
import com.instabug.library.model.State;
import com.instabug.library.model.State.StateItem;
import com.instabug.library.network.NetworkManager;
import com.instabug.library.network.NetworkManager.RequestType;
import com.instabug.library.network.Request;
import com.instabug.library.network.Request.Callbacks;
import com.instabug.library.network.Request.Endpoint;
import com.instabug.library.network.Request.FileToUpload;
import com.instabug.library.network.Request.RequestMethod;
import com.instabug.library.network.RequestResponse;
import com.instabug.library.util.InstabugDateFormatter;
import com.instabug.library.util.InstabugSDKLogger;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p195e.p196a.C12280i0;
import p195e.p196a.C5923b0;
import p195e.p196a.C5926g0;
import p195e.p196a.p441d1.C12228b;
import p195e.p196a.p467z0.C13787e;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.chat.network.a */
/* compiled from: MessageUploaderHelper */
public class C9428a {

    /* renamed from: b */
    private static transient /* synthetic */ boolean[] f24970b;

    /* renamed from: a */
    private Context f24971a;

    /* renamed from: com.instabug.chat.network.a$a */
    /* compiled from: MessageUploaderHelper */
    class C9429a implements Callbacks<String, Throwable> {

        /* renamed from: c */
        private static transient /* synthetic */ boolean[] f24972c;

        /* renamed from: a */
        final /* synthetic */ Chat f24973a;

        /* renamed from: b */
        final /* synthetic */ C9428a f24974b;

        C9429a(C9428a aVar, Chat chat) {
            boolean[] a = m44135a();
            this.f24974b = aVar;
            this.f24973a = chat;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m44135a() {
            boolean[] zArr = f24972c;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-5174928511050244493L, "com/instabug/chat/network/MessageUploaderHelper$1", 20);
            f24972c = a;
            return a;
        }

        /* renamed from: a */
        public void mo33984a(String str) {
            boolean[] a = m44135a();
            C9428a aVar = this.f24974b;
            StringBuilder sb = new StringBuilder();
            sb.append("triggering chat ");
            Chat chat = this.f24973a;
            a[1] = true;
            sb.append(chat.toString());
            sb.append(" triggeredChatId: ");
            sb.append(str);
            String sb2 = sb.toString();
            a[2] = true;
            InstabugSDKLogger.m46626v(aVar, sb2);
            a[3] = true;
            String id = this.f24973a.getId();
            a[4] = true;
            ChatTriggeringEventBus.getInstance().post(new C9414a(id, str));
            a[5] = true;
            C9428a aVar2 = this.f24974b;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Updating local chat with id: ");
            sb3.append(id);
            sb3.append(", with synced chat with id: ");
            sb3.append(str);
            InstabugSDKLogger.m46626v(aVar2, sb3.toString());
            a[6] = true;
            this.f24973a.mo33884b(str);
            a[7] = true;
            this.f24973a.mo33879a(ChatState.LOGS_READY_TO_BE_UPLOADED);
            a[8] = true;
            InMemoryCache cache = ChatsCacheManager.getCache();
            if (cache == null) {
                a[9] = true;
            } else {
                a[10] = true;
                cache.delete(id);
                a[11] = true;
                cache.put(this.f24973a.getId(), this.f24973a);
                a[12] = true;
            }
            ChatsCacheManager.saveCacheToDisk();
            a[13] = true;
            C9428a.m44130a(this.f24974b, this.f24973a);
            a[14] = true;
        }

        public /* synthetic */ void onFailed(Object obj) {
            boolean[] a = m44135a();
            mo33985a((Throwable) obj);
            a[18] = true;
        }

        public /* synthetic */ void onSucceeded(Object obj) {
            boolean[] a = m44135a();
            mo33984a((String) obj);
            a[19] = true;
        }

        /* renamed from: a */
        public void mo33985a(Throwable th) {
            boolean[] a = m44135a();
            C9428a aVar = this.f24974b;
            StringBuilder sb = new StringBuilder();
            sb.append("Something went wrong while triggering offline chat with id: ");
            Chat chat = this.f24973a;
            a[15] = true;
            sb.append(chat.getId());
            String sb2 = sb.toString();
            a[16] = true;
            InstabugSDKLogger.m46624e(aVar, sb2, th);
            a[17] = true;
        }
    }

    /* renamed from: com.instabug.chat.network.a$b */
    /* compiled from: MessageUploaderHelper */
    class C9430b implements Callbacks<String, Throwable> {

        /* renamed from: c */
        private static transient /* synthetic */ boolean[] f24975c;

        /* renamed from: a */
        final /* synthetic */ Message f24976a;

        /* renamed from: b */
        final /* synthetic */ C9428a f24977b;

        C9430b(C9428a aVar, Message message) {
            boolean[] a = m44138a();
            this.f24977b = aVar;
            this.f24976a = message;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m44138a() {
            boolean[] zArr = f24975c;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-7153966270066499385L, "com/instabug/chat/network/MessageUploaderHelper$2", 39);
            f24975c = a;
            return a;
        }

        /* renamed from: a */
        public void mo33986a(String str) {
            boolean[] a = m44138a();
            C9428a aVar = this.f24977b;
            StringBuilder sb = new StringBuilder();
            sb.append("Send message response: ");
            sb.append(str);
            InstabugSDKLogger.m46626v(aVar, sb.toString());
            a[1] = true;
            if (str == null) {
                a[2] = true;
            } else if (str.equals("")) {
                a[3] = true;
            } else if (str.equals("null")) {
                a[4] = true;
            } else {
                a[5] = true;
                Chat chat = ChatsCacheManager.getChat(this.f24976a.mo33914d());
                if (chat != null) {
                    a[6] = true;
                    chat.mo33883a().remove(this.f24976a);
                    a[7] = true;
                    this.f24976a.mo33910b(str);
                    a[8] = true;
                    if (this.f24976a.mo33926l().size() == 0) {
                        a[9] = true;
                        this.f24976a.mo33903a(MessageState.READY_TO_BE_SYNCED);
                        a[10] = true;
                    } else {
                        this.f24976a.mo33903a(MessageState.SENT);
                        a[11] = true;
                    }
                    C9428a aVar2 = this.f24977b;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Caching sent message:");
                    Message message = this.f24976a;
                    a[12] = true;
                    sb2.append(message.toString());
                    String sb3 = sb2.toString();
                    a[13] = true;
                    InstabugSDKLogger.m46626v(aVar2, sb3);
                    a[14] = true;
                    chat.mo33883a().add(this.f24976a);
                    a[15] = true;
                    InMemoryCache cache = ChatsCacheManager.getCache();
                    if (cache == null) {
                        a[16] = true;
                    } else {
                        a[17] = true;
                        cache.put(chat.getId(), chat);
                        a[18] = true;
                    }
                    ChatsCacheManager.saveCacheToDisk();
                    a[19] = true;
                    if (this.f24976a.mo33926l().size() != 0) {
                        a[20] = true;
                        try {
                            C9428a.m44131a(this.f24977b, this.f24976a);
                            a[28] = true;
                        } catch (FileNotFoundException | JSONException e) {
                            a[29] = true;
                            C9428a aVar3 = this.f24977b;
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("Something went wrong while uploading messageattach attachments ");
                            a[30] = true;
                            sb4.append(e.getMessage());
                            String sb5 = sb4.toString();
                            a[31] = true;
                            InstabugSDKLogger.m46626v(aVar3, sb5);
                            a[32] = true;
                        }
                    } else {
                        a[21] = true;
                        Calendar instance = Calendar.getInstance(Locale.ENGLISH);
                        a[22] = true;
                        long time = instance.getTime().getTime();
                        a[23] = true;
                        C9441a.m44183a(time);
                        a[24] = true;
                        ChatTimeUpdatedEventBus instance2 = ChatTimeUpdatedEventBus.getInstance();
                        a[25] = true;
                        long currentUTCTimeStampInMiliSeconds = InstabugDateFormatter.getCurrentUTCTimeStampInMiliSeconds();
                        a[26] = true;
                        instance2.post(Long.valueOf(currentUTCTimeStampInMiliSeconds));
                        a[27] = true;
                    }
                    a[33] = true;
                } else {
                    InstabugSDKLogger.m46623e(this, "Chat is null so can't remove message from it");
                    a[34] = true;
                }
            }
            a[35] = true;
        }

        public /* synthetic */ void onFailed(Object obj) {
            boolean[] a = m44138a();
            mo33987a((Throwable) obj);
            a[37] = true;
        }

        public /* synthetic */ void onSucceeded(Object obj) {
            boolean[] a = m44138a();
            mo33986a((String) obj);
            a[38] = true;
        }

        /* renamed from: a */
        public void mo33987a(Throwable th) {
            boolean[] a = m44138a();
            InstabugSDKLogger.m46624e(this.f24977b, "Something went wrong while uploading cached message", th);
            a[36] = true;
        }
    }

    /* renamed from: com.instabug.chat.network.a$c */
    /* compiled from: MessageUploaderHelper */
    class C9431c implements Callbacks<Boolean, Message> {

        /* renamed from: c */
        private static transient /* synthetic */ boolean[] f24978c;

        /* renamed from: a */
        final /* synthetic */ Message f24979a;

        /* renamed from: b */
        final /* synthetic */ C9428a f24980b;

        C9431c(C9428a aVar, Message message) {
            boolean[] a = m44141a();
            this.f24980b = aVar;
            this.f24979a = message;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m44141a() {
            boolean[] zArr = f24978c;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(3555939689483047146L, "com/instabug/chat/network/MessageUploaderHelper$3", 29);
            f24978c = a;
            return a;
        }

        /* renamed from: a */
        public void mo33989a(Boolean bool) {
            boolean[] a = m44141a();
            InstabugSDKLogger.m46626v(this.f24980b, "Message attachments uploaded successfully");
            a[1] = true;
            Chat chat = ChatsCacheManager.getChat(this.f24979a.mo33914d());
            if (chat != null) {
                a[2] = true;
                chat.mo33883a().remove(this.f24979a);
                a[3] = true;
                this.f24979a.mo33903a(MessageState.READY_TO_BE_SYNCED);
                a[4] = true;
                int i = 0;
                a[5] = true;
                while (i < this.f24979a.mo33926l().size()) {
                    a[6] = true;
                    ArrayList l = this.f24979a.mo33926l();
                    a[7] = true;
                    Attachment attachment = (Attachment) l.get(i);
                    a[8] = true;
                    attachment.setState(Attachment.STATE_SYNCED);
                    i++;
                    a[9] = true;
                }
                C9428a aVar = this.f24980b;
                StringBuilder sb = new StringBuilder();
                sb.append("Caching sent message:");
                Message message = this.f24979a;
                a[10] = true;
                sb.append(message.toString());
                String sb2 = sb.toString();
                a[11] = true;
                InstabugSDKLogger.m46626v(aVar, sb2);
                a[12] = true;
                chat.mo33883a().add(this.f24979a);
                a[13] = true;
                InMemoryCache cache = ChatsCacheManager.getCache();
                if (cache == null) {
                    a[14] = true;
                } else {
                    a[15] = true;
                    cache.put(chat.getId(), chat);
                    a[16] = true;
                }
                ChatsCacheManager.saveCacheToDisk();
                a[17] = true;
                Date time = Calendar.getInstance(Locale.ENGLISH).getTime();
                a[18] = true;
                long time2 = time.getTime();
                a[19] = true;
                C9441a.m44183a(time2);
                a[20] = true;
                ChatTimeUpdatedEventBus instance = ChatTimeUpdatedEventBus.getInstance();
                a[21] = true;
                long currentUTCTimeStampInMiliSeconds = InstabugDateFormatter.getCurrentUTCTimeStampInMiliSeconds();
                a[22] = true;
                instance.post(Long.valueOf(currentUTCTimeStampInMiliSeconds));
                a[23] = true;
            } else {
                InstabugSDKLogger.m46623e(this, "Chat is null so can't remove message from it");
                a[24] = true;
            }
            a[25] = true;
        }

        public /* synthetic */ void onFailed(Object obj) {
            boolean[] a = m44141a();
            mo33988a((Message) obj);
            a[27] = true;
        }

        public /* synthetic */ void onSucceeded(Object obj) {
            boolean[] a = m44141a();
            mo33989a((Boolean) obj);
            a[28] = true;
        }

        /* renamed from: a */
        public void mo33988a(Message message) {
            boolean[] a = m44141a();
            C9428a aVar = this.f24980b;
            StringBuilder sb = new StringBuilder();
            sb.append("Something went wrong while uploading message attachments, Message: ");
            sb.append(this.f24979a);
            InstabugSDKLogger.m46623e(aVar, sb.toString());
            a[26] = true;
        }
    }

    /* renamed from: com.instabug.chat.network.a$d */
    /* compiled from: MessageUploaderHelper */
    class C9432d implements Callbacks<Boolean, Chat> {

        /* renamed from: c */
        private static transient /* synthetic */ boolean[] f24981c;

        /* renamed from: a */
        final /* synthetic */ Chat f24982a;

        /* renamed from: b */
        final /* synthetic */ C9428a f24983b;

        C9432d(C9428a aVar, Chat chat) {
            boolean[] a = m44144a();
            this.f24983b = aVar;
            this.f24982a = chat;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m44144a() {
            boolean[] zArr = f24981c;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(450429377417305731L, "com/instabug/chat/network/MessageUploaderHelper$4", 7);
            f24981c = a;
            return a;
        }

        /* renamed from: a */
        public void mo33991a(Boolean bool) {
            boolean[] a = m44144a();
            InstabugSDKLogger.m46622d(this.f24983b, "chat logs uploaded successfully, change its state");
            a[1] = true;
            this.f24982a.mo33879a(ChatState.SENT);
            a[2] = true;
            ChatsCacheManager.saveCacheToDisk();
            a[3] = true;
        }

        public /* synthetic */ void onFailed(Object obj) {
            boolean[] a = m44144a();
            mo33990a((Chat) obj);
            a[5] = true;
        }

        public /* synthetic */ void onSucceeded(Object obj) {
            boolean[] a = m44144a();
            mo33991a((Boolean) obj);
            a[6] = true;
        }

        /* renamed from: a */
        public void mo33990a(Chat chat) {
            boolean[] a = m44144a();
            InstabugSDKLogger.m46622d(this.f24983b, "Something went wrong while uploading chat logs");
            a[4] = true;
        }
    }

    /* renamed from: com.instabug.chat.network.a$e */
    /* compiled from: MessagingService */
    public class C9433e {

        /* renamed from: b */
        private static C9433e f24984b;

        /* renamed from: c */
        private static transient /* synthetic */ boolean[] f24985c;

        /* renamed from: a */
        private NetworkManager f24986a = new NetworkManager();

        /* renamed from: com.instabug.chat.network.a$e$a */
        /* compiled from: MessagingService */
        class C9434a extends C13787e<RequestResponse> {

            /* renamed from: O */
            private static transient /* synthetic */ boolean[] f24987O;

            /* renamed from: N */
            final /* synthetic */ C9433e f24988N;

            /* renamed from: b */
            final /* synthetic */ Callbacks f24989b;

            C9434a(C9433e eVar, Callbacks callbacks) {
                boolean[] c = m44155c();
                this.f24988N = eVar;
                this.f24989b = callbacks;
                c[0] = true;
            }

            /* renamed from: c */
            private static /* synthetic */ boolean[] m44155c() {
                boolean[] zArr = f24987O;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(1189290587138924021L, "com/instabug/chat/network/service/MessagingService$1", 20);
                f24987O = a;
                return a;
            }

            /* renamed from: a */
            public /* synthetic */ void mo33453a(Object obj) {
                boolean[] c = m44155c();
                mo33998a((RequestResponse) obj);
                c[19] = true;
            }

            /* renamed from: b */
            public void mo33575b() {
                boolean[] c = m44155c();
                InstabugSDKLogger.m46626v(this, "triggeringChatRequest started");
                c[1] = true;
            }

            public void onComplete() {
                boolean[] c = m44155c();
                InstabugSDKLogger.m46626v(this, "triggeringChatRequest completed");
                c[2] = true;
            }

            public void onError(Throwable th) {
                boolean[] c = m44155c();
                StringBuilder sb = new StringBuilder();
                sb.append("triggeringChatRequest got error: ");
                sb.append(th.getMessage());
                InstabugSDKLogger.m46626v(this, sb.toString());
                c[3] = true;
                this.f24989b.onFailed(th);
                c[4] = true;
            }

            /* renamed from: a */
            public void mo33998a(RequestResponse requestResponse) {
                boolean[] c = m44155c();
                StringBuilder sb = new StringBuilder();
                sb.append("triggeringChatRequest onNext, Response code: ");
                c[5] = true;
                sb.append(requestResponse.getResponseCode());
                sb.append("Response body: ");
                c[6] = true;
                sb.append(requestResponse.getResponseBody());
                String sb2 = sb.toString();
                c[7] = true;
                InstabugSDKLogger.m46626v(this, sb2);
                c[8] = true;
                if (requestResponse.getResponseCode() == 200) {
                    try {
                        c[9] = true;
                        Callbacks callbacks = this.f24989b;
                        c[10] = true;
                        String string = new JSONObject((String) requestResponse.getResponseBody()).getString("chat_number");
                        c[11] = true;
                        callbacks.onSucceeded(string);
                        c[12] = true;
                    } catch (JSONException e) {
                        c[13] = true;
                        e.printStackTrace();
                        c[14] = true;
                    }
                } else {
                    Callbacks callbacks2 = this.f24989b;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Triggering chat got error with response code:");
                    c[15] = true;
                    sb3.append(requestResponse.getResponseCode());
                    Throwable th = new Throwable(sb3.toString());
                    c[16] = true;
                    callbacks2.onFailed(th);
                    c[17] = true;
                }
                c[18] = true;
            }
        }

        /* renamed from: com.instabug.chat.network.a$e$b */
        /* compiled from: MessagingService */
        class C9435b extends C13787e<RequestResponse> {

            /* renamed from: O */
            private static transient /* synthetic */ boolean[] f24990O;

            /* renamed from: N */
            final /* synthetic */ C9433e f24991N;

            /* renamed from: b */
            final /* synthetic */ Callbacks f24992b;

            C9435b(C9433e eVar, Callbacks callbacks) {
                boolean[] c = m44159c();
                this.f24991N = eVar;
                this.f24992b = callbacks;
                c[0] = true;
            }

            /* renamed from: c */
            private static /* synthetic */ boolean[] m44159c() {
                boolean[] zArr = f24990O;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(8591773059366968240L, "com/instabug/chat/network/service/MessagingService$2", 20);
                f24990O = a;
                return a;
            }

            /* renamed from: a */
            public /* synthetic */ void mo33453a(Object obj) {
                boolean[] c = m44159c();
                mo33999a((RequestResponse) obj);
                c[19] = true;
            }

            /* renamed from: b */
            public void mo33575b() {
                boolean[] c = m44159c();
                InstabugSDKLogger.m46626v(this, "sendMessage request started");
                c[1] = true;
            }

            public void onComplete() {
                boolean[] c = m44159c();
                InstabugSDKLogger.m46626v(this, "sendMessage request completed");
                c[2] = true;
            }

            public void onError(Throwable th) {
                boolean[] c = m44159c();
                StringBuilder sb = new StringBuilder();
                sb.append("sendMessage request got error: ");
                sb.append(th.getMessage());
                InstabugSDKLogger.m46626v(this, sb.toString());
                c[3] = true;
                this.f24992b.onFailed(th);
                c[4] = true;
            }

            /* renamed from: a */
            public void mo33999a(RequestResponse requestResponse) {
                boolean[] c = m44159c();
                StringBuilder sb = new StringBuilder();
                sb.append("sendMessage request onNext, Response code: ");
                c[5] = true;
                sb.append(requestResponse.getResponseCode());
                sb.append("Response body: ");
                c[6] = true;
                sb.append(requestResponse.getResponseBody());
                String sb2 = sb.toString();
                c[7] = true;
                InstabugSDKLogger.m46626v(this, sb2);
                c[8] = true;
                if (requestResponse.getResponseCode() == 200) {
                    try {
                        c[9] = true;
                        Callbacks callbacks = this.f24992b;
                        c[10] = true;
                        String string = new JSONObject((String) requestResponse.getResponseBody()).getString("message_id");
                        c[11] = true;
                        callbacks.onSucceeded(string);
                        c[12] = true;
                    } catch (JSONException e) {
                        c[13] = true;
                        InstabugSDKLogger.m46624e(this, "Sending message got error", e);
                        c[14] = true;
                    }
                } else {
                    Callbacks callbacks2 = this.f24992b;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Sending message got error with response code:");
                    c[15] = true;
                    sb3.append(requestResponse.getResponseCode());
                    Throwable th = new Throwable(sb3.toString());
                    c[16] = true;
                    callbacks2.onFailed(th);
                    c[17] = true;
                }
                c[18] = true;
            }
        }

        /* renamed from: com.instabug.chat.network.a$e$c */
        /* compiled from: MessagingService */
        class C9436c extends C13787e<RequestResponse> {

            /* renamed from: P */
            private static transient /* synthetic */ boolean[] f24993P;

            /* renamed from: N */
            final /* synthetic */ Message f24994N;

            /* renamed from: O */
            final /* synthetic */ C9433e f24995O;

            /* renamed from: b */
            final /* synthetic */ Callbacks f24996b;

            C9436c(C9433e eVar, Callbacks callbacks, Message message) {
                boolean[] c = m44163c();
                this.f24995O = eVar;
                this.f24996b = callbacks;
                this.f24994N = message;
                c[0] = true;
            }

            /* renamed from: c */
            private static /* synthetic */ boolean[] m44163c() {
                boolean[] zArr = f24993P;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(2855573023728132806L, "com/instabug/chat/network/service/MessagingService$3", 13);
                f24993P = a;
                return a;
            }

            /* renamed from: a */
            public /* synthetic */ void mo33453a(Object obj) {
                boolean[] c = m44163c();
                mo34000a((RequestResponse) obj);
                c[12] = true;
            }

            /* renamed from: b */
            public void mo33575b() {
                boolean[] c = m44163c();
                InstabugSDKLogger.m46626v(this, "uploadingMessageAttachmentRequest started");
                c[1] = true;
            }

            public void onComplete() {
                boolean[] c = m44163c();
                InstabugSDKLogger.m46626v(this, "uploadingMessageAttachmentRequest completed");
                c[2] = true;
                this.f24996b.onSucceeded(Boolean.valueOf(true));
                c[3] = true;
            }

            public void onError(Throwable th) {
                boolean[] c = m44163c();
                StringBuilder sb = new StringBuilder();
                sb.append("uploadingMessageAttachmentRequest got error: ");
                c[4] = true;
                sb.append(th.getMessage());
                String sb2 = sb.toString();
                c[5] = true;
                InstabugSDKLogger.m46626v(this, sb2);
                c[6] = true;
                this.f24996b.onFailed(this.f24994N);
                c[7] = true;
            }

            /* renamed from: a */
            public void mo34000a(RequestResponse requestResponse) {
                boolean[] c = m44163c();
                StringBuilder sb = new StringBuilder();
                sb.append("uploadingMessageAttachmentRequest onNext, Response code: ");
                c[8] = true;
                sb.append(requestResponse.getResponseCode());
                sb.append(", Response body: ");
                c[9] = true;
                sb.append(requestResponse.getResponseBody());
                String sb2 = sb.toString();
                c[10] = true;
                InstabugSDKLogger.m46626v(this, sb2);
                c[11] = true;
            }
        }

        /* renamed from: com.instabug.chat.network.a$e$d */
        /* compiled from: MessagingService */
        class C9437d extends C13787e<RequestResponse> {

            /* renamed from: O */
            private static transient /* synthetic */ boolean[] f24997O;

            /* renamed from: N */
            final /* synthetic */ C9433e f24998N;

            /* renamed from: b */
            final /* synthetic */ Callbacks f24999b;

            C9437d(C9433e eVar, Callbacks callbacks) {
                boolean[] c = m44167c();
                this.f24998N = eVar;
                this.f24999b = callbacks;
                c[0] = true;
            }

            /* renamed from: c */
            private static /* synthetic */ boolean[] m44167c() {
                boolean[] zArr = f24997O;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(-8841332683830196965L, "com/instabug/chat/network/service/MessagingService$4", 11);
                f24997O = a;
                return a;
            }

            /* renamed from: a */
            public /* synthetic */ void mo33453a(Object obj) {
                boolean[] c = m44167c();
                mo34001a((RequestResponse) obj);
                c[10] = true;
            }

            /* renamed from: b */
            public void mo33575b() {
                boolean[] c = m44167c();
                InstabugSDKLogger.m46626v(this, "syncMessages request started");
                c[1] = true;
            }

            public void onComplete() {
                boolean[] c = m44167c();
                InstabugSDKLogger.m46626v(this, "syncMessages request completed");
                c[2] = true;
            }

            public void onError(Throwable th) {
                boolean[] c = m44167c();
                StringBuilder sb = new StringBuilder();
                sb.append("syncMessages request got error: ");
                sb.append(th.getMessage());
                InstabugSDKLogger.m46626v(this, sb.toString());
                c[3] = true;
                this.f24999b.onFailed(th);
                c[4] = true;
            }

            /* renamed from: a */
            public void mo34001a(RequestResponse requestResponse) {
                boolean[] c = m44167c();
                StringBuilder sb = new StringBuilder();
                sb.append("syncMessages request onNext, Response code: ");
                c[5] = true;
                sb.append(requestResponse.getResponseCode());
                sb.append("Response body: ");
                c[6] = true;
                sb.append(requestResponse.getResponseBody());
                String sb2 = sb.toString();
                c[7] = true;
                InstabugSDKLogger.m46626v(this, sb2);
                c[8] = true;
                this.f24999b.onSucceeded(requestResponse);
                c[9] = true;
            }
        }

        /* renamed from: com.instabug.chat.network.a$e$e */
        /* compiled from: MessagingService */
        class C9438e extends C13787e<RequestResponse> {

            /* renamed from: P */
            private static transient /* synthetic */ boolean[] f25000P;

            /* renamed from: N */
            final /* synthetic */ Chat f25001N;

            /* renamed from: O */
            final /* synthetic */ C9433e f25002O;

            /* renamed from: b */
            final /* synthetic */ Callbacks f25003b;

            C9438e(C9433e eVar, Callbacks callbacks, Chat chat) {
                boolean[] c = m44171c();
                this.f25002O = eVar;
                this.f25003b = callbacks;
                this.f25001N = chat;
                c[0] = true;
            }

            /* renamed from: c */
            private static /* synthetic */ boolean[] m44171c() {
                boolean[] zArr = f25000P;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(-3805993112738409000L, "com/instabug/chat/network/service/MessagingService$5", 11);
                f25000P = a;
                return a;
            }

            /* renamed from: a */
            public /* synthetic */ void mo33453a(Object obj) {
                boolean[] c = m44171c();
                mo34002a((RequestResponse) obj);
                c[10] = true;
            }

            /* renamed from: b */
            public void mo33575b() {
                boolean[] c = m44171c();
                InstabugSDKLogger.m46622d(this, "uploading chat logs started");
                c[1] = true;
            }

            public void onComplete() {
                boolean[] c = m44171c();
                InstabugSDKLogger.m46622d(this, "uploading chat logs completed");
                c[6] = true;
                this.f25003b.onSucceeded(Boolean.valueOf(true));
                c[7] = true;
            }

            public void onError(Throwable th) {
                boolean[] c = m44171c();
                StringBuilder sb = new StringBuilder();
                sb.append("uploading chat logs got error: ");
                sb.append(th.getMessage());
                InstabugSDKLogger.m46622d(this, sb.toString());
                c[8] = true;
                this.f25003b.onFailed(this.f25001N);
                c[9] = true;
            }

            /* renamed from: a */
            public void mo34002a(RequestResponse requestResponse) {
                boolean[] c = m44171c();
                StringBuilder sb = new StringBuilder();
                sb.append("uploading chat logs onNext, Response code: ");
                c[2] = true;
                sb.append(requestResponse.getResponseCode());
                sb.append("Response body: ");
                c[3] = true;
                sb.append(requestResponse.getResponseBody());
                String sb2 = sb.toString();
                c[4] = true;
                InstabugSDKLogger.m46626v(this, sb2);
                c[5] = true;
            }
        }

        /* renamed from: com.instabug.chat.network.a$e$f */
        /* compiled from: MessagingService */
        class C9439f extends C13787e<RequestResponse> {

            /* renamed from: O */
            private static transient /* synthetic */ boolean[] f25004O;

            /* renamed from: N */
            final /* synthetic */ C9433e f25005N;

            /* renamed from: b */
            final /* synthetic */ Callbacks f25006b;

            C9439f(C9433e eVar, Callbacks callbacks) {
                boolean[] c = m44175c();
                this.f25005N = eVar;
                this.f25006b = callbacks;
                c[0] = true;
            }

            /* renamed from: c */
            private static /* synthetic */ boolean[] m44175c() {
                boolean[] zArr = f25004O;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(-5851485174201139611L, "com/instabug/chat/network/service/MessagingService$6", 23);
                f25004O = a;
                return a;
            }

            /* renamed from: a */
            public /* synthetic */ void mo33453a(Object obj) {
                boolean[] c = m44175c();
                mo34003a((RequestResponse) obj);
                c[22] = true;
            }

            /* renamed from: b */
            public void mo33575b() {
                boolean[] c = m44175c();
                InstabugSDKLogger.m46622d(this, "sending push notification token started");
                c[1] = true;
            }

            public void onComplete() {
                boolean[] c = m44175c();
                InstabugSDKLogger.m46622d(this, "sending push notification token completed");
                c[17] = true;
            }

            public void onError(Throwable th) {
                boolean[] c = m44175c();
                StringBuilder sb = new StringBuilder();
                sb.append("sending push notification token got error: ");
                c[18] = true;
                sb.append(th.getMessage());
                String sb2 = sb.toString();
                c[19] = true;
                InstabugSDKLogger.m46622d(this, sb2);
                c[20] = true;
                this.f25006b.onFailed(th);
                c[21] = true;
            }

            /* renamed from: a */
            public void mo34003a(RequestResponse requestResponse) {
                boolean[] c = m44175c();
                StringBuilder sb = new StringBuilder();
                sb.append("sending push notification token onNext, Response code: ");
                c[2] = true;
                sb.append(requestResponse.getResponseCode());
                sb.append("Response body: ");
                c[3] = true;
                sb.append(requestResponse.getResponseBody());
                String sb2 = sb.toString();
                c[4] = true;
                InstabugSDKLogger.m46626v(this, sb2);
                c[5] = true;
                if (requestResponse.getResponseCode() == 200) {
                    try {
                        c[6] = true;
                        Callbacks callbacks = this.f25006b;
                        c[7] = true;
                        String string = new JSONObject((String) requestResponse.getResponseBody()).getString("status");
                        c[8] = true;
                        callbacks.onSucceeded(string);
                        c[9] = true;
                    } catch (JSONException e) {
                        c[10] = true;
                        e.printStackTrace();
                        c[11] = true;
                        this.f25006b.onFailed(e);
                        c[12] = true;
                    }
                } else {
                    Callbacks callbacks2 = this.f25006b;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("sending push notification token got error with response code: ");
                    c[13] = true;
                    sb3.append(requestResponse.getResponseCode());
                    Throwable th = new Throwable(sb3.toString());
                    c[14] = true;
                    callbacks2.onFailed(th);
                    c[15] = true;
                }
                c[16] = true;
            }
        }

        private C9433e() {
            boolean[] b = m44148b();
            b[0] = true;
            b[1] = true;
        }

        /* renamed from: a */
        public static C9433e m44147a() {
            boolean[] b = m44148b();
            if (f24984b != null) {
                b[3] = true;
            } else {
                b[4] = true;
                f24984b = new C9433e();
                b[5] = true;
            }
            C9433e eVar = f24984b;
            b[6] = true;
            return eVar;
        }

        /* renamed from: b */
        private static /* synthetic */ boolean[] m44148b() {
            boolean[] zArr = f24985c;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(7874779915961365600L, "com/instabug/chat/network/service/MessagingService", 93);
            f24985c = a;
            return a;
        }

        /* renamed from: b */
        public void mo33997b(Context context, Message message, Callbacks<Boolean, Message> callbacks) throws JSONException {
            boolean[] b = m44148b();
            StringBuilder sb = new StringBuilder();
            sb.append("Uploading message attachments, Message: ");
            sb.append(message.mo33916e());
            InstabugSDKLogger.m46626v(this, sb.toString());
            b[31] = true;
            ArrayList arrayList = new ArrayList(message.mo33926l().size());
            b[32] = true;
            b[33] = true;
            int i = 0;
            while (i < message.mo33926l().size()) {
                b[34] = true;
                Attachment attachment = (Attachment) message.mo33926l().get(i);
                b[35] = true;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Uploading attachment with type: ");
                sb2.append(attachment.getType());
                InstabugSDKLogger.m46626v(this, sb2.toString());
                b[36] = true;
                Request buildRequest = this.f24986a.buildRequest(context, Endpoint.AddMessageAttachment, RequestMethod.Post, RequestType.MULTI_PART);
                b[37] = true;
                String replaceAll = buildRequest.mo35539d().replaceAll(":chat_number", message.mo33914d());
                b[38] = true;
                buildRequest.mo35535b(replaceAll);
                b[39] = true;
                String replaceAll2 = buildRequest.mo35539d().replaceAll(":message_id", String.valueOf(message.mo33908a()));
                b[40] = true;
                buildRequest.mo35535b(replaceAll2);
                b[41] = true;
                buildRequest.mo35528a("metadata[file_type]", attachment.getType());
                b[42] = true;
                if (!attachment.getType().equals("audio")) {
                    b[43] = true;
                } else {
                    b[44] = true;
                    buildRequest.mo35528a("metadata[duration]", attachment.getDuration());
                    b[45] = true;
                }
                b[46] = true;
                FileToUpload fileToUpload = new FileToUpload(UriUtil.LOCAL_FILE_SCHEME, attachment.getName(), attachment.getLocalPath(), attachment.getFileType());
                b[47] = true;
                buildRequest.mo35526a(fileToUpload);
                b[48] = true;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Uploading attachment with name: ");
                sb3.append(attachment.getName());
                sb3.append(" path: ");
                b[49] = true;
                sb3.append(attachment.getLocalPath());
                sb3.append(" file type: ");
                b[50] = true;
                sb3.append(attachment.getFileType());
                String sb4 = sb3.toString();
                b[51] = true;
                InstabugSDKLogger.m46626v(this, sb4);
                b[52] = true;
                arrayList.add(this.f24986a.doRequest(buildRequest));
                i++;
                b[53] = true;
            }
            C5923b0 a = C5923b0.m26115a((Iterable<? extends C5926g0<? extends T>>) arrayList, 1);
            C9436c cVar = new C9436c(this, callbacks, message);
            b[54] = true;
            a.mo23893a((C12280i0<? super T>) cVar);
            b[55] = true;
        }

        /* renamed from: a */
        public void mo33995a(Context context, State state, Callbacks<String, Throwable> callbacks) throws JSONException {
            boolean[] b = m44148b();
            InstabugSDKLogger.m46626v(this, "trigger chat");
            b[7] = true;
            Request buildRequest = this.f24986a.buildRequest(context, Endpoint.TriggerChat, RequestMethod.Post);
            b[8] = true;
            ArrayList stateItems = state.getStateItems();
            b[9] = true;
            b[10] = true;
            int i = 0;
            while (i < state.getStateItems().size()) {
                b[11] = true;
                StringBuilder sb = new StringBuilder();
                sb.append("Chat State Key: ");
                sb.append(((StateItem) stateItems.get(i)).getKey());
                sb.append(", Chat State value: ");
                b[12] = true;
                sb.append(((StateItem) stateItems.get(i)).getValue());
                String sb2 = sb.toString();
                b[13] = true;
                InstabugSDKLogger.m46626v(this, sb2);
                b[14] = true;
                String key = ((StateItem) state.getStateItems().get(i)).getKey();
                b[15] = true;
                Object value = ((StateItem) state.getStateItems().get(i)).getValue();
                b[16] = true;
                buildRequest.mo35536b(key, value);
                i++;
                b[17] = true;
            }
            this.f24986a.doRequest(buildRequest).mo23893a((C12280i0<? super T>) new C9434a<Object>(this, callbacks));
            b[18] = true;
        }

        /* renamed from: a */
        public void mo33994a(Context context, Message message, Callbacks<String, Throwable> callbacks) throws JSONException {
            boolean[] b = m44148b();
            InstabugSDKLogger.m46626v(this, "Sending message");
            b[19] = true;
            Request buildRequest = this.f24986a.buildRequest(context, Endpoint.SendMessage, RequestMethod.Post);
            b[20] = true;
            String d = buildRequest.mo35539d();
            b[21] = true;
            String replaceAll = d.replaceAll(":chat_number", message.mo33914d());
            b[22] = true;
            buildRequest.mo35535b(replaceAll);
            b[23] = true;
            JSONObject jSONObject = new JSONObject();
            b[24] = true;
            JSONObject put = jSONObject.put("body", message.mo33916e());
            b[25] = true;
            JSONObject put2 = put.put("messaged_at", message.mo33921h());
            b[26] = true;
            JSONObject put3 = put2.put("email", InstabugCore.getIdentifiedUserEmail());
            b[27] = true;
            JSONObject put4 = put3.put("name", InstabugCore.getIdentifiedUsername());
            b[28] = true;
            buildRequest.mo35528a("message", put4);
            b[29] = true;
            this.f24986a.doRequest(buildRequest).mo23893a((C12280i0<? super T>) new C9435b<Object>(this, callbacks));
            b[30] = true;
        }

        /* renamed from: a */
        public void mo33992a(Context context, long j, int i, JSONArray jSONArray, Callbacks<RequestResponse, Throwable> callbacks) throws JSONException {
            boolean[] b = m44148b();
            InstabugSDKLogger.m46626v(this, "Syncing messages with server");
            b[56] = true;
            Request buildRequest = this.f24986a.buildRequest(context, Endpoint.SyncChats, RequestMethod.Post);
            if (j == 0) {
                b[57] = true;
            } else {
                b[58] = true;
                String formatUTCDate = InstabugDateFormatter.formatUTCDate(j);
                b[59] = true;
                buildRequest.mo35528a("last_message_messaged_at", formatUTCDate);
                b[60] = true;
            }
            buildRequest.mo35528a("messages_count", Integer.valueOf(i));
            b[61] = true;
            if (jSONArray == null) {
                b[62] = true;
            } else if (jSONArray.length() == 0) {
                b[63] = true;
            } else {
                b[64] = true;
                buildRequest.mo35528a("read_messages", jSONArray);
                b[65] = true;
            }
            this.f24986a.doRequest(buildRequest).mo23950c(C12228b.m55094b()).mo23893a((C12280i0<? super T>) new C9437d<Object>(this, callbacks));
            b[66] = true;
        }

        /* renamed from: a */
        public void mo33993a(Context context, Chat chat, Callbacks<Boolean, Chat> callbacks) {
            boolean[] b = m44148b();
            try {
                Request buildRequest = this.f24986a.buildRequest(context, Endpoint.chatLogs, RequestMethod.Post);
                b[67] = true;
                b[68] = true;
                String id = chat.getId();
                b[69] = true;
                buildRequest.mo35535b(buildRequest.mo35539d().replaceAll(":chat_token", id));
                b[70] = true;
                if (chat.getState() == null) {
                    b[71] = true;
                } else {
                    b[72] = true;
                    ArrayList logsItems = chat.getState().getLogsItems();
                    b[73] = true;
                    Iterator it = logsItems.iterator();
                    b[74] = true;
                    while (it.hasNext()) {
                        StateItem stateItem = (StateItem) it.next();
                        b[76] = true;
                        if (stateItem.getKey().equals(State.KEY_VISUAL_USER_STEPS)) {
                            b[77] = true;
                        } else {
                            b[78] = true;
                            if (stateItem.getKey().equals(State.KEY_SESSIONS_PROFILER)) {
                                b[79] = true;
                            } else {
                                b[80] = true;
                                String key = stateItem.getKey();
                                b[81] = true;
                                Object value = stateItem.getValue();
                                b[82] = true;
                                buildRequest.mo35536b(key, value);
                                b[83] = true;
                            }
                        }
                        b[84] = true;
                    }
                    b[75] = true;
                }
                this.f24986a.doRequest(buildRequest).mo23893a((C12280i0<? super T>) new C9438e<Object>(this, callbacks, chat));
                b[85] = true;
            } catch (JSONException e) {
                b[86] = true;
                StringBuilder sb = new StringBuilder();
                sb.append("uploading chat logs got Json error: ");
                sb.append(e.getMessage());
                InstabugSDKLogger.m46622d(this, sb.toString());
                b[87] = true;
                callbacks.onFailed(chat);
                b[88] = true;
            }
            b[89] = true;
        }

        /* renamed from: a */
        public void mo33996a(Context context, String str, Callbacks<String, Throwable> callbacks) throws JSONException {
            boolean[] b = m44148b();
            Request buildRequest = this.f24986a.buildRequest(context, Endpoint.PushToken, RequestMethod.Post);
            b[90] = true;
            buildRequest.mo35536b("push_token", str);
            b[91] = true;
            this.f24986a.doRequest(buildRequest).mo23893a((C12280i0<? super T>) new C9439f<Object>(this, callbacks));
            b[92] = true;
        }
    }

    public C9428a(Context context) {
        boolean[] b = m44132b();
        this.f24971a = context;
        b[0] = true;
    }

    /* renamed from: a */
    static /* synthetic */ void m44130a(C9428a aVar, Chat chat) {
        boolean[] b = m44132b();
        aVar.m44128a(chat);
        b[46] = true;
    }

    /* renamed from: b */
    private static /* synthetic */ boolean[] m44132b() {
        boolean[] zArr = f24970b;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-8229423695197038893L, "com/instabug/chat/network/MessageUploaderHelper", 48);
        f24970b = a;
        return a;
    }

    /* renamed from: a */
    static /* synthetic */ void m44131a(C9428a aVar, Message message) throws JSONException, FileNotFoundException {
        boolean[] b = m44132b();
        aVar.m44129a(message);
        b[47] = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo33982a() throws IOException, JSONException {
        boolean[] b = m44132b();
        List offlineChats = ChatsCacheManager.getOfflineChats();
        b[1] = true;
        StringBuilder sb = new StringBuilder();
        sb.append("Found ");
        sb.append(offlineChats.size());
        sb.append(" offline chats in cache");
        InstabugSDKLogger.m46626v(this, sb.toString());
        b[2] = true;
        b[3] = true;
        for (Chat chat : ChatsCacheManager.getOfflineChats()) {
            b[4] = true;
            if (!chat.mo33885d().equals(ChatState.READY_TO_BE_SENT)) {
                b[5] = true;
            } else {
                b[6] = true;
                if (chat.mo33883a().size() <= 0) {
                    b[7] = true;
                } else {
                    b[8] = true;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Uploading offline Chat: ");
                    sb2.append(chat);
                    InstabugSDKLogger.m46626v(this, sb2.toString());
                    b[9] = true;
                    C9433e.m44147a().mo33995a(this.f24971a, chat.getState(), (Callbacks<String, Throwable>) new C9429a<String,Throwable>(this, chat));
                    b[10] = true;
                    b[17] = true;
                }
            }
            if (!chat.mo33885d().equals(ChatState.LOGS_READY_TO_BE_UPLOADED)) {
                b[11] = true;
            } else {
                b[12] = true;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("chat: ");
                b[13] = true;
                sb3.append(chat.toString());
                sb3.append(" already uploaded but has unsent logs, uploading now");
                String sb4 = sb3.toString();
                b[14] = true;
                InstabugSDKLogger.m46622d(this, sb4);
                b[15] = true;
                m44128a(chat);
                b[16] = true;
            }
            b[17] = true;
        }
        b[18] = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo33983a(List<Message> list) throws IOException, JSONException {
        boolean[] b = m44132b();
        StringBuilder sb = new StringBuilder();
        sb.append("Found ");
        sb.append(list.size());
        sb.append(" offline messages in cache");
        InstabugSDKLogger.m46626v(this, sb.toString());
        b[19] = true;
        b[20] = true;
        int i = 0;
        while (i < list.size()) {
            b[21] = true;
            Message message = (Message) list.get(i);
            b[22] = true;
            if (message.mo33925k() == MessageState.READY_TO_BE_SENT) {
                b[23] = true;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Uploading message: ");
                sb2.append(list.get(i));
                InstabugSDKLogger.m46626v(this, sb2.toString());
                b[24] = true;
                C9433e.m44147a().mo33994a(this.f24971a, message, (Callbacks<String, Throwable>) new C9430b<String,Throwable>(this, message));
                b[25] = true;
            } else if (message.mo33925k() != MessageState.SENT) {
                b[26] = true;
            } else {
                b[27] = true;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Uploading message's attachments : ");
                b[28] = true;
                sb3.append(list.get(i));
                String sb4 = sb3.toString();
                b[29] = true;
                InstabugSDKLogger.m46626v(this, sb4);
                try {
                    b[30] = true;
                    m44129a(message);
                    b[31] = true;
                } catch (FileNotFoundException | JSONException e) {
                    b[32] = true;
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Something went wrong while uploading message attachments ");
                    b[33] = true;
                    sb5.append(e.getMessage());
                    String sb6 = sb5.toString();
                    b[34] = true;
                    InstabugSDKLogger.m46626v(this, sb6);
                    b[35] = true;
                }
            }
            i++;
            b[36] = true;
        }
        b[37] = true;
    }

    /* renamed from: a */
    private void m44129a(Message message) throws JSONException, FileNotFoundException {
        boolean[] b = m44132b();
        StringBuilder sb = new StringBuilder();
        sb.append("Found ");
        sb.append(message.mo33926l().size());
        sb.append(" attachments related to message: ");
        b[38] = true;
        sb.append(message.mo33916e());
        String sb2 = sb.toString();
        b[39] = true;
        InstabugSDKLogger.m46626v(this, sb2);
        b[40] = true;
        C9433e.m44147a().mo33997b(this.f24971a, message, new C9431c(this, message));
        b[41] = true;
    }

    /* renamed from: a */
    private void m44128a(Chat chat) {
        boolean[] b = m44132b();
        StringBuilder sb = new StringBuilder();
        sb.append("START uploading all logs related to this chat id = ");
        b[42] = true;
        sb.append(chat.getId());
        String sb2 = sb.toString();
        b[43] = true;
        InstabugSDKLogger.m46622d(this, sb2);
        b[44] = true;
        C9433e.m44147a().mo33993a(this.f24971a, chat, (Callbacks<Boolean, Chat>) new C9432d<Boolean,Chat>(this, chat));
        b[45] = true;
    }
}
