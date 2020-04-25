package com.instabug.bug.p355b;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.C0224v0;
import com.instabug.bug.C9238a.C9244f;
import com.instabug.bug.C9249c;
import com.instabug.bug.C9254f;
import com.instabug.bug.model.Bug;
import com.instabug.bug.model.Bug.BugState;
import com.instabug.library.core.eventbus.ScreenRecordingEventBus;
import com.instabug.library.core.eventbus.VideoProcessingServiceEventBus;
import com.instabug.library.internal.storage.cache.AttachmentsDbHelper;
import com.instabug.library.internal.storage.cache.p389db.InstabugDbContract.AttachmentEntry;
import com.instabug.library.internal.storage.cache.p389db.InstabugDbContract.BugEntry;
import com.instabug.library.internal.video.InternalScreenRecordHelper;
import com.instabug.library.internal.video.ScreenRecordEvent;
import com.instabug.library.internal.video.VideoProcessingService.Action;
import com.instabug.library.model.Attachment;
import com.instabug.library.model.Attachment.Type;
import com.instabug.library.tracking.InstabugInternalTrackingDelegate;
import com.instabug.library.util.InstabugSDKLogger;
import java.util.ArrayList;
import java.util.List;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12331g;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.bug.b.b */
/* compiled from: ExternalScreenRecordHelper */
public class C9246b {

    /* renamed from: b */
    private static C9246b f24455b;

    /* renamed from: c */
    private static transient /* synthetic */ boolean[] f24456c;

    /* renamed from: a */
    private C12314c f24457a;

    /* renamed from: com.instabug.bug.b.b$a */
    /* compiled from: ExternalScreenRecordHelper */
    class C9247a implements C12331g<ScreenRecordEvent> {

        /* renamed from: N */
        private static transient /* synthetic */ boolean[] f24458N;

        /* renamed from: a */
        final /* synthetic */ String f24459a;

        /* renamed from: b */
        final /* synthetic */ C9246b f24460b;

        C9247a(C9246b bVar, String str) {
            boolean[] a = m43221a();
            this.f24460b = bVar;
            this.f24459a = str;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m43221a() {
            boolean[] zArr = f24458N;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(5520400779314255181L, "com/instabug/bug/screenrecording/ExternalScreenRecordHelper$1", 39);
            f24458N = a;
            return a;
        }

        /* renamed from: a */
        public void mo33423a(ScreenRecordEvent screenRecordEvent) {
            boolean[] a = m43221a();
            int status = screenRecordEvent.getStatus();
            String str = BugEntry.COLUMN_BUG_STATE;
            if (status == 1) {
                a[1] = true;
                InstabugSDKLogger.m46625i(this.f24460b, "ENCODED EVENT RECEIVED");
                String str2 = this.f24459a;
                if (str2 == null) {
                    a[2] = true;
                } else {
                    a[3] = true;
                    ArrayList retrieve = AttachmentsDbHelper.retrieve(str2);
                    a[4] = true;
                    if (retrieve.size() <= 0) {
                        a[5] = true;
                    } else {
                        a[6] = true;
                        C9246b bVar = this.f24460b;
                        Attachment a2 = bVar.mo33418a((List<Attachment>) retrieve);
                        a[7] = true;
                        String path = screenRecordEvent.getVideoUri().getPath();
                        String str3 = this.f24459a;
                        a[8] = true;
                        bVar.mo33420a(a2, path, str3);
                        a[9] = true;
                        ContentValues contentValues = new ContentValues();
                        a[10] = true;
                        contentValues.put(str, BugState.READY_TO_BE_SENT.name());
                        a[11] = true;
                        C9244f.m43205a(this.f24459a, contentValues);
                        a[12] = true;
                        C9254f.m43256i();
                        a[13] = true;
                    }
                }
                C9246b.m43209a(this.f24460b);
                a[14] = true;
            } else if (screenRecordEvent.getStatus() == 0) {
                a[15] = true;
                this.f24460b.mo33419a(screenRecordEvent);
                a[16] = true;
                C9246b.m43211b(this.f24460b);
                a[17] = true;
            } else if (screenRecordEvent.getStatus() != 2) {
                a[18] = true;
            } else {
                String str4 = this.f24459a;
                if (str4 == null) {
                    a[19] = true;
                } else {
                    a[20] = true;
                    ArrayList retrieve2 = AttachmentsDbHelper.retrieve(str4);
                    a[21] = true;
                    if (retrieve2.size() <= 0) {
                        a[22] = true;
                    } else {
                        a[23] = true;
                        Attachment a3 = this.f24460b.mo33418a((List<Attachment>) retrieve2);
                        a[24] = true;
                        if (a3 == null) {
                            a[25] = true;
                        } else if (a3.getId() == -1) {
                            a[26] = true;
                        } else {
                            a[27] = true;
                            AttachmentsDbHelper.delete(a3.getId());
                            a[28] = true;
                            ContentValues contentValues2 = new ContentValues();
                            a[32] = true;
                            contentValues2.put(str, BugState.READY_TO_BE_SENT.name());
                            a[33] = true;
                            C9244f.m43205a(this.f24459a, contentValues2);
                            a[34] = true;
                            C9254f.m43256i();
                            a[35] = true;
                        }
                        if (a3 == null) {
                            a[29] = true;
                        } else {
                            a[30] = true;
                            AttachmentsDbHelper.delete(a3.getName(), this.f24459a);
                            a[31] = true;
                        }
                        ContentValues contentValues22 = new ContentValues();
                        a[32] = true;
                        contentValues22.put(str, BugState.READY_TO_BE_SENT.name());
                        a[33] = true;
                        C9244f.m43205a(this.f24459a, contentValues22);
                        a[34] = true;
                        C9254f.m43256i();
                        a[35] = true;
                    }
                }
                C9246b.m43209a(this.f24460b);
                a[36] = true;
            }
            a[37] = true;
        }

        /* renamed from: c */
        public /* synthetic */ void mo33410c(Object obj) throws Exception {
            boolean[] a = m43221a();
            mo33423a((ScreenRecordEvent) obj);
            a[38] = true;
        }
    }

    /* renamed from: com.instabug.bug.b.b$b */
    /* compiled from: ExternalScreenRecordHelper */
    class C9248b implements C12331g<Action> {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f24461b;

        /* renamed from: a */
        final /* synthetic */ C9246b f24462a;

        C9248b(C9246b bVar) {
            boolean[] a = m43224a();
            this.f24462a = bVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m43224a() {
            boolean[] zArr = f24461b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(8947773044935948853L, "com/instabug/bug/screenrecording/ExternalScreenRecordHelper$2", 6);
            f24461b = a;
            return a;
        }

        /* renamed from: a */
        public void mo33424a(Action action) {
            boolean[] a = m43224a();
            if (C9246b.m43212c(this.f24462a) == null) {
                a[1] = true;
            } else {
                a[2] = true;
                C9246b.m43209a(this.f24462a);
                a[3] = true;
            }
            a[4] = true;
        }

        /* renamed from: c */
        public /* synthetic */ void mo33410c(Object obj) throws Exception {
            boolean[] a = m43224a();
            mo33424a((Action) obj);
            a[5] = true;
        }
    }

    public C9246b() {
        m43215e()[0] = true;
    }

    /* renamed from: a */
    static /* synthetic */ void m43209a(C9246b bVar) {
        boolean[] e = m43215e();
        bVar.m43214d();
        e[52] = true;
    }

    /* renamed from: b */
    static /* synthetic */ void m43211b(C9246b bVar) {
        boolean[] e = m43215e();
        bVar.m43213c();
        e[53] = true;
    }

    /* renamed from: c */
    static /* synthetic */ C12314c m43212c(C9246b bVar) {
        boolean[] e = m43215e();
        C12314c cVar = bVar.f24457a;
        e[54] = true;
        return cVar;
    }

    /* renamed from: d */
    private void m43214d() {
        boolean[] e = m43215e();
        if (this.f24457a.mo41878d()) {
            e[48] = true;
        } else {
            e[49] = true;
            this.f24457a.dispose();
            e[50] = true;
        }
        e[51] = true;
    }

    /* renamed from: e */
    private static /* synthetic */ boolean[] m43215e() {
        boolean[] zArr = f24456c;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(504460687219102018L, "com/instabug/bug/screenrecording/ExternalScreenRecordHelper", 55);
        f24456c = a;
        return a;
    }

    /* renamed from: b */
    public static C9246b m43210b() {
        boolean[] e = m43215e();
        if (f24455b != null) {
            e[1] = true;
        } else {
            e[2] = true;
            f24455b = new C9246b();
            e[3] = true;
        }
        C9246b bVar = f24455b;
        e[4] = true;
        return bVar;
    }

    /* renamed from: c */
    private void m43213c() {
        boolean[] e = m43215e();
        Activity currentActivity = InstabugInternalTrackingDelegate.getInstance().getCurrentActivity();
        if (currentActivity == null) {
            e[41] = true;
        } else {
            e[42] = true;
            Context applicationContext = currentActivity.getApplicationContext();
            e[43] = true;
            Intent c = C9249c.m43231c(applicationContext);
            e[44] = true;
            currentActivity.startActivity(c);
            e[45] = true;
        }
        e[46] = true;
    }

    /* renamed from: a */
    public void mo33421a(String str) {
        boolean[] e = m43215e();
        InternalScreenRecordHelper.getInstance().init();
        e[5] = true;
        C12314c cVar = this.f24457a;
        if (cVar == null) {
            e[6] = true;
        } else if (!cVar.mo41878d()) {
            e[7] = true;
            VideoProcessingServiceEventBus.getInstance().subscribe(new C9248b(this));
            e[10] = true;
        } else {
            e[8] = true;
        }
        this.f24457a = ScreenRecordingEventBus.getInstance().subscribe(new C9247a(this, str));
        e[9] = true;
        VideoProcessingServiceEventBus.getInstance().subscribe(new C9248b(this));
        e[10] = true;
    }

    /* access modifiers changed from: 0000 */
    @C0224v0
    /* renamed from: a */
    public void mo33419a(ScreenRecordEvent screenRecordEvent) {
        boolean[] e = m43215e();
        Bug c = C9254f.m43255h().mo33434c();
        e[11] = true;
        Uri videoUri = screenRecordEvent.getVideoUri();
        Type type = Type.VIDEO;
        e[12] = true;
        c.mo33498a(videoUri, type);
        e[13] = true;
        C9254f.m43255h().mo33434c().mo33499a(BugState.WAITING_VIDEO);
        e[14] = true;
    }

    /* renamed from: a */
    public void mo33420a(Attachment attachment, String str, String str2) {
        boolean[] e = m43215e();
        attachment.setLocalPath(str);
        e[15] = true;
        attachment.setVideoEncoded(true);
        e[16] = true;
        ContentValues contentValues = new ContentValues();
        e[17] = true;
        contentValues.put(AttachmentEntry.COLUMN_LOCALE_PATH, str);
        e[18] = true;
        contentValues.put(AttachmentEntry.COLUMN_VIDEO_ENCODED, Boolean.valueOf(true));
        e[19] = true;
        if (attachment.getId() != -1) {
            e[20] = true;
            AttachmentsDbHelper.update(attachment.getId(), contentValues);
            e[21] = true;
        } else {
            AttachmentsDbHelper.update(attachment.getName(), str2, contentValues);
            e[22] = true;
        }
        e[23] = true;
    }

    /* access modifiers changed from: 0000 */
    @C0224v0
    /* renamed from: a */
    public Attachment mo33418a(List<Attachment> list) {
        boolean[] e = m43215e();
        int size = list.size() - 1;
        e[35] = true;
        while (size >= 0) {
            e[36] = true;
            Attachment attachment = (Attachment) list.get(size);
            e[37] = true;
            if (attachment.getType() == Type.VIDEO) {
                e[38] = true;
                return attachment;
            }
            size--;
            e[39] = true;
        }
        e[40] = true;
        return null;
    }

    /* renamed from: a */
    public boolean mo33422a() {
        boolean[] e = m43215e();
        boolean isRecording = InternalScreenRecordHelper.getInstance().isRecording();
        e[47] = true;
        return isRecording;
    }
}
