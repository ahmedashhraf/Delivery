package com.instabug.chat.p359b;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.instabug.chat.cache.ChatsCacheManager;
import com.instabug.chat.eventbus.C9414a;
import com.instabug.chat.eventbus.ChatTriggeringEventBus;
import com.instabug.chat.model.Attachment;
import com.instabug.chat.model.Chat;
import com.instabug.chat.model.Message;
import com.instabug.chat.model.Message.C9419b;
import com.instabug.chat.model.Message.MessageState;
import com.instabug.chat.network.InstabugMessageUploaderService;
import com.instabug.chat.p361ui.C9456b;
import com.instabug.library.core.eventbus.ScreenRecordingEventBus;
import com.instabug.library.core.eventbus.VideoProcessingServiceEventBus;
import com.instabug.library.internal.storage.cache.InMemoryCache;
import com.instabug.library.internal.video.InternalScreenRecordHelper;
import com.instabug.library.internal.video.ScreenRecordEvent;
import com.instabug.library.internal.video.VideoProcessingService.Action;
import com.instabug.library.tracking.InstabugInternalTrackingDelegate;
import com.instabug.library.util.InstabugDateFormatter;
import com.instabug.library.util.InstabugSDKLogger;
import java.util.ArrayList;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12331g;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.chat.b.a */
/* compiled from: ExternalScreenRecordHelper */
public class C9400a {

    /* renamed from: e */
    private static C9400a f24886e;

    /* renamed from: f */
    private static transient /* synthetic */ boolean[] f24887f;

    /* renamed from: a */
    private String f24888a;

    /* renamed from: b */
    private String f24889b;

    /* renamed from: c */
    private C12314c f24890c;

    /* renamed from: d */
    private C12314c f24891d;

    /* renamed from: com.instabug.chat.b.a$a */
    /* compiled from: ExternalScreenRecordHelper */
    class C9401a implements C12331g<ScreenRecordEvent> {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f24892b;

        /* renamed from: a */
        final /* synthetic */ C9400a f24893a;

        C9401a(C9400a aVar) {
            boolean[] a = m43973a();
            this.f24893a = aVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m43973a() {
            boolean[] zArr = f24892b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(8599890346881084849L, "com/instabug/chat/screenrecording/ExternalScreenRecordHelper$1", 12);
            f24892b = a;
            return a;
        }

        /* renamed from: a */
        public void mo33843a(ScreenRecordEvent screenRecordEvent) {
            boolean[] a = m43973a();
            if (screenRecordEvent.getStatus() == 1) {
                a[1] = true;
                C9400a.m43957a(this.f24893a, screenRecordEvent.getVideoUri());
                a[2] = true;
                C9400a.m43956a(this.f24893a);
                a[3] = true;
            } else if (screenRecordEvent.getStatus() == 0) {
                a[4] = true;
                C9400a.m43958a(this.f24893a, screenRecordEvent);
                a[5] = true;
            } else if (screenRecordEvent.getStatus() != 2) {
                a[6] = true;
            } else {
                a[7] = true;
                C9400a.m43964b(this.f24893a);
                a[8] = true;
                C9400a.m43956a(this.f24893a);
                a[9] = true;
            }
            a[10] = true;
        }

        /* renamed from: c */
        public /* synthetic */ void mo33410c(Object obj) throws Exception {
            boolean[] a = m43973a();
            mo33843a((ScreenRecordEvent) obj);
            a[11] = true;
        }
    }

    /* renamed from: com.instabug.chat.b.a$b */
    /* compiled from: ExternalScreenRecordHelper */
    class C9402b implements C12331g<Action> {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f24894b;

        /* renamed from: a */
        final /* synthetic */ C9400a f24895a;

        C9402b(C9400a aVar) {
            boolean[] a = m43976a();
            this.f24895a = aVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m43976a() {
            boolean[] zArr = f24894b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-8551898429125481035L, "com/instabug/chat/screenrecording/ExternalScreenRecordHelper$2", 6);
            f24894b = a;
            return a;
        }

        /* renamed from: a */
        public void mo33844a(Action action) {
            boolean[] a = m43976a();
            if (C9400a.m43966c(this.f24895a) == null) {
                a[1] = true;
            } else {
                a[2] = true;
                C9400a.m43956a(this.f24895a);
                a[3] = true;
            }
            a[4] = true;
        }

        /* renamed from: c */
        public /* synthetic */ void mo33410c(Object obj) throws Exception {
            boolean[] a = m43976a();
            mo33844a((Action) obj);
            a[5] = true;
        }
    }

    /* renamed from: com.instabug.chat.b.a$c */
    /* compiled from: ExternalScreenRecordHelper */
    class C9403c implements C12331g<C9414a> {

        /* renamed from: N */
        private static transient /* synthetic */ boolean[] f24896N;

        /* renamed from: a */
        final /* synthetic */ String f24897a;

        /* renamed from: b */
        final /* synthetic */ C9400a f24898b;

        C9403c(C9400a aVar, String str) {
            boolean[] a = m43979a();
            this.f24898b = aVar;
            this.f24897a = str;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m43979a() {
            boolean[] zArr = f24896N;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(3595344919501430251L, "com/instabug/chat/screenrecording/ExternalScreenRecordHelper$3", 6);
            f24896N = a;
            return a;
        }

        /* renamed from: a */
        public void mo33845a(C9414a aVar) {
            boolean[] a = m43979a();
            if (!this.f24897a.equalsIgnoreCase(aVar.mo33859a())) {
                a[1] = true;
            } else {
                a[2] = true;
                C9400a.m43959a(this.f24898b, aVar.mo33860b());
                a[3] = true;
            }
            a[4] = true;
        }

        /* renamed from: c */
        public /* synthetic */ void mo33410c(Object obj) throws Exception {
            boolean[] a = m43979a();
            mo33845a((C9414a) obj);
            a[5] = true;
        }
    }

    public C9400a() {
        m43970e()[0] = true;
    }

    /* renamed from: a */
    static /* synthetic */ void m43956a(C9400a aVar) {
        boolean[] e = m43970e();
        aVar.m43969d();
        e[102] = true;
    }

    /* renamed from: b */
    static /* synthetic */ void m43964b(C9400a aVar) {
        boolean[] e = m43970e();
        aVar.m43967c();
        e[104] = true;
    }

    /* renamed from: c */
    static /* synthetic */ C12314c m43966c(C9400a aVar) {
        boolean[] e = m43970e();
        C12314c cVar = aVar.f24890c;
        e[105] = true;
        return cVar;
    }

    /* renamed from: d */
    private void m43969d() {
        boolean[] e = m43970e();
        if (this.f24890c.mo41878d()) {
            e[94] = true;
        } else {
            e[95] = true;
            this.f24890c.dispose();
            e[96] = true;
        }
        if (this.f24891d.mo41878d()) {
            e[97] = true;
        } else {
            e[98] = true;
            this.f24891d.dispose();
            e[99] = true;
        }
        e[100] = true;
    }

    /* renamed from: e */
    private static /* synthetic */ boolean[] m43970e() {
        boolean[] zArr = f24887f;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-3796568739028374294L, "com/instabug/chat/screenrecording/ExternalScreenRecordHelper", 107);
        f24887f = a;
        return a;
    }

    /* renamed from: a */
    static /* synthetic */ void m43957a(C9400a aVar, Uri uri) {
        boolean[] e = m43970e();
        aVar.m43955a(uri);
        e[101] = true;
    }

    /* renamed from: b */
    public static C9400a m43963b() {
        boolean[] e = m43970e();
        if (f24886e != null) {
            e[1] = true;
        } else {
            e[2] = true;
            f24886e = new C9400a();
            e[3] = true;
        }
        C9400a aVar = f24886e;
        e[4] = true;
        return aVar;
    }

    /* renamed from: c */
    private void m43968c(String str) {
        boolean[] e = m43970e();
        this.f24889b = str;
        e[46] = true;
    }

    /* renamed from: a */
    static /* synthetic */ void m43958a(C9400a aVar, ScreenRecordEvent screenRecordEvent) {
        boolean[] e = m43970e();
        aVar.m43961a(screenRecordEvent);
        e[103] = true;
    }

    /* renamed from: a */
    static /* synthetic */ void m43959a(C9400a aVar, String str) {
        boolean[] e = m43970e();
        aVar.m43965b(str);
        e[106] = true;
    }

    /* renamed from: c */
    private void m43967c() {
        boolean[] e = m43970e();
        Chat chat = ChatsCacheManager.getChat(this.f24888a);
        if (chat != null) {
            e[78] = true;
            ArrayList a = chat.mo33883a();
            e[79] = true;
            int i = 0;
            e[80] = true;
            while (true) {
                if (i >= a.size()) {
                    e[81] = true;
                    break;
                }
                e[82] = true;
                Message message = (Message) a.get(i);
                e[83] = true;
                StringBuilder sb = new StringBuilder();
                sb.append("getting message with ID: ");
                sb.append(message.mo33908a());
                InstabugSDKLogger.m46622d(this, sb.toString());
                e[84] = true;
                if (message.mo33908a().equals(this.f24889b)) {
                    e[85] = true;
                    a.remove(message);
                    e[86] = true;
                    break;
                }
                i++;
                e[87] = true;
            }
            InMemoryCache cache = ChatsCacheManager.getCache();
            if (cache == null) {
                e[88] = true;
            } else {
                e[89] = true;
                cache.put(chat.getId(), chat);
                e[90] = true;
            }
            InstabugSDKLogger.m46622d(this, "video message is removed from this chat");
            e[91] = true;
        } else {
            InstabugSDKLogger.m46623e(this, "Hanging Chat is null and can't remove video message");
            e[92] = true;
        }
        e[93] = true;
    }

    /* renamed from: b */
    private void m43965b(String str) {
        boolean[] e = m43970e();
        this.f24888a = str;
        e[13] = true;
    }

    /* renamed from: a */
    public void mo33841a(String str) {
        boolean[] e = m43970e();
        this.f24888a = str;
        e[5] = true;
        InternalScreenRecordHelper.getInstance().init();
        e[6] = true;
        C12314c cVar = this.f24890c;
        if (cVar == null) {
            e[7] = true;
        } else if (!cVar.mo41878d()) {
            e[8] = true;
            VideoProcessingServiceEventBus.getInstance().subscribe(new C9402b(this));
            e[11] = true;
            this.f24891d = ChatTriggeringEventBus.getInstance().subscribe(new C9403c(this, str));
            e[12] = true;
        } else {
            e[9] = true;
        }
        this.f24890c = ScreenRecordingEventBus.getInstance().subscribe(new C9401a(this));
        e[10] = true;
        VideoProcessingServiceEventBus.getInstance().subscribe(new C9402b(this));
        e[11] = true;
        this.f24891d = ChatTriggeringEventBus.getInstance().subscribe(new C9403c(this, str));
        e[12] = true;
    }

    /* renamed from: a */
    public boolean mo33842a() {
        boolean[] e = m43970e();
        boolean isRecording = InternalScreenRecordHelper.getInstance().isRecording();
        e[14] = true;
        return isRecording;
    }

    /* renamed from: a */
    private void m43961a(ScreenRecordEvent screenRecordEvent) {
        boolean[] e = m43970e();
        Uri videoUri = screenRecordEvent.getVideoUri();
        e[15] = true;
        m43962a(this.f24888a, videoUri);
        e[16] = true;
        Activity currentActivity = InstabugInternalTrackingDelegate.getInstance().getCurrentActivity();
        if (currentActivity == null) {
            e[17] = true;
        } else {
            e[18] = true;
            Intent a = C9456b.m44298a(currentActivity, this.f24888a);
            e[19] = true;
            currentActivity.startActivity(a);
            e[20] = true;
        }
        e[21] = true;
    }

    /* renamed from: a */
    private void m43962a(String str, Uri uri) {
        boolean[] e = m43970e();
        Message c = new Message().mo33912c(str);
        e[22] = true;
        Message b = c.mo33913d("").mo33909b(InstabugDateFormatter.getCurrentUTCTimeStampInSeconds());
        e[23] = true;
        Message a = b.mo33901a(InstabugDateFormatter.getCurrentUTCTimeStampInSeconds());
        C9419b bVar = C9419b.INBOUND;
        e[24] = true;
        Message a2 = a.mo33904a(bVar);
        if (uri == null) {
            e[25] = true;
        } else {
            e[26] = true;
            Attachment attachment = new Attachment();
            e[27] = true;
            attachment.setName(uri.getLastPathSegment());
            e[28] = true;
            attachment.setLocalPath(uri.getPath());
            e[29] = true;
            attachment.setType("video");
            e[30] = true;
            attachment.setState("offline");
            e[31] = true;
            attachment.setVideoEncoded(false);
            e[32] = true;
            StringBuilder sb = new StringBuilder();
            sb.append("Adding hanging message with ID: ");
            sb.append(a2.mo33908a());
            InstabugSDKLogger.m46625i(this, sb.toString());
            e[33] = true;
            m43968c(a2.mo33908a());
            e[34] = true;
            a2.mo33903a(MessageState.STAY_OFFLINE);
            e[35] = true;
            a2.mo33926l().add(attachment);
            e[36] = true;
        }
        Chat chat = ChatsCacheManager.getChat(str);
        e[37] = true;
        if (chat == null) {
            e[38] = true;
        } else if (chat.mo33883a() == null) {
            e[39] = true;
        } else {
            e[40] = true;
            chat.mo33883a().add(a2);
            e[41] = true;
            InMemoryCache cache = ChatsCacheManager.getCache();
            if (cache == null) {
                e[42] = true;
            } else {
                e[43] = true;
                cache.put(chat.getId(), chat);
                e[44] = true;
            }
        }
        e[45] = true;
    }

    /* renamed from: a */
    private void m43955a(Uri uri) {
        boolean[] e = m43970e();
        Chat chat = ChatsCacheManager.getChat(this.f24888a);
        if (chat != null) {
            e[47] = true;
            ArrayList a = chat.mo33883a();
            String str = this.f24889b;
            e[48] = true;
            int i = 0;
            e[49] = true;
            while (i < a.size()) {
                e[50] = true;
                Message message = (Message) a.get(i);
                e[51] = true;
                StringBuilder sb = new StringBuilder();
                sb.append("getting message with ID: ");
                sb.append(message.mo33908a());
                InstabugSDKLogger.m46622d(this, sb.toString());
                e[52] = true;
                if (!message.mo33908a().equals(str)) {
                    e[53] = true;
                } else {
                    e[54] = true;
                    m43960a(message, uri);
                    e[55] = true;
                    message.mo33903a(MessageState.READY_TO_BE_SENT);
                    e[56] = true;
                }
                i++;
                e[57] = true;
            }
            InMemoryCache cache = ChatsCacheManager.getCache();
            if (cache == null) {
                e[58] = true;
            } else {
                e[59] = true;
                cache.put(chat.getId(), chat);
                e[60] = true;
            }
            InstabugSDKLogger.m46622d(this, "video is encoded and updated in its message");
            e[61] = true;
            Activity currentActivity = InstabugInternalTrackingDelegate.getInstance().getCurrentActivity();
            if (currentActivity == null) {
                e[62] = true;
            } else {
                e[63] = true;
                currentActivity.startService(new Intent(currentActivity, InstabugMessageUploaderService.class));
                e[64] = true;
            }
            e[65] = true;
        } else {
            InstabugSDKLogger.m46623e(this, "Hanging Chat is null and can't be updated");
            e[66] = true;
        }
        e[67] = true;
    }

    /* renamed from: a */
    private void m43960a(Message message, Uri uri) {
        boolean[] e = m43970e();
        ArrayList<Attachment> l = message.mo33926l();
        e[68] = true;
        e[69] = true;
        for (Attachment attachment : l) {
            e[70] = true;
            if (attachment.getType().equals("video")) {
                e[71] = true;
                InstabugSDKLogger.m46622d(this, "Setting attachment type to Video");
                e[72] = true;
                attachment.setName(uri.getLastPathSegment());
                e[73] = true;
                attachment.setLocalPath(uri.getPath());
                e[74] = true;
                attachment.setVideoEncoded(true);
                e[75] = true;
                return;
            }
            e[76] = true;
        }
        e[77] = true;
    }
}
