package com.instabug.bug;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.instabug.bug.C9238a.C9244f;
import com.instabug.bug.OnSdkDismissedCallback.DismissType;
import com.instabug.bug.model.Bug;
import com.instabug.bug.model.Bug.BugState;
import com.instabug.bug.model.Bug.C9274a;
import com.instabug.bug.model.C9278b;
import com.instabug.bug.network.C9288c;
import com.instabug.bug.settings.C9291a;
import com.instabug.chat.synchronization.SynchronizationManager;
import com.instabug.library.Feature;
import com.instabug.library.Feature.State;
import com.instabug.library.Instabug;
import com.instabug.library.OnSdkDismissCallback;
import com.instabug.library.OnSdkDismissCallback.ReportType;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.internal.storage.AttachmentsUtility;
import com.instabug.library.internal.storage.DiskUtils;
import com.instabug.library.internal.storage.cache.UserAttributesCacheManager;
import com.instabug.library.internal.storage.executor.WriteOperationExecutor;
import com.instabug.library.internal.storage.operation.WriteStateToFileDiskOperation;
import com.instabug.library.logging.InstabugLog;
import com.instabug.library.logging.InstabugUserEventLogger;
import com.instabug.library.model.Attachment;
import com.instabug.library.model.Attachment.Type;
import com.instabug.library.model.Report;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.user.UserEvent;
import com.instabug.library.util.BitmapUtils;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.ReportHelper;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map.Entry;
import org.json.JSONArray;
import org.json.JSONException;
import p053b.p072g.p073b.C2128a;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.bug.f */
/* compiled from: LiveBugManager */
public class C9254f {

    /* renamed from: d */
    private static C9254f f24469d = new C9254f();

    /* renamed from: e */
    private static transient /* synthetic */ boolean[] f24470e;

    /* renamed from: a */
    private Bug f24471a;

    /* renamed from: b */
    private boolean f24472b;

    /* renamed from: c */
    private DismissType f24473c = null;

    /* renamed from: com.instabug.bug.f$a */
    /* compiled from: LiveBugManager */
    class C9255a implements Runnable {

        /* renamed from: N */
        private static transient /* synthetic */ boolean[] f24474N;

        /* renamed from: a */
        final /* synthetic */ Context f24475a;

        /* renamed from: b */
        final /* synthetic */ C9254f f24476b;

        /* renamed from: com.instabug.bug.f$a$a */
        /* compiled from: LiveBugManager */
        class C9256a implements Runnable {

            /* renamed from: b */
            private static transient /* synthetic */ boolean[] f24477b;

            /* renamed from: a */
            final /* synthetic */ C9255a f24478a;

            C9256a(C9255a aVar) {
                boolean[] a = m43276a();
                this.f24478a = aVar;
                a[0] = true;
            }

            /* renamed from: a */
            private static /* synthetic */ boolean[] m43276a() {
                boolean[] zArr = f24477b;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(2534048469161816162L, "com/instabug/bug/LiveBugManager$1$1", 4);
                f24477b = a;
                return a;
            }

            public void run() {
                boolean[] a = m43276a();
                C9254f.m43250b(this.f24478a.f24476b);
                a[1] = true;
                this.f24478a.f24476b.mo33425a();
                a[2] = true;
                C9254f.m43252c(this.f24478a.f24476b);
                a[3] = true;
            }
        }

        C9255a(C9254f fVar, Context context) {
            boolean[] a = m43275a();
            this.f24476b = fVar;
            this.f24475a = context;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m43275a() {
            boolean[] zArr = f24474N;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-4966999836818189990L, "com/instabug/bug/LiveBugManager$1", 25);
            f24474N = a;
            return a;
        }

        public void run() {
            Class<C9254f> cls = C9254f.class;
            boolean[] a = m43275a();
            C9254f.m43249a(this.f24476b, this.f24475a);
            a[1] = true;
            C9254f.m43251b(this.f24476b, this.f24475a);
            a[2] = true;
            this.f24476b.mo33438f();
            a[3] = true;
            this.f24476b.mo33429a(DismissType.SUBMIT);
            try {
                a[4] = true;
                File createStateTextFile = DiskUtils.createStateTextFile(this.f24475a);
                a[5] = true;
                DiskUtils with = DiskUtils.with(this.f24475a);
                C9254f fVar = this.f24476b;
                a[6] = true;
                WriteOperationExecutor writeOperation = with.writeOperation(new WriteStateToFileDiskOperation(createStateTextFile, C9254f.m43248a(fVar).getState().toJson()));
                a[7] = true;
                Uri execute = writeOperation.execute();
                a[8] = true;
                C9254f.m43248a(this.f24476b).getState().setUri(execute);
                a[9] = true;
                if (!this.f24476b.mo33434c().hasVideo()) {
                    a[10] = true;
                } else {
                    if (!this.f24476b.mo33434c().hasVideo()) {
                        a[11] = true;
                    } else if (!this.f24476b.mo33434c().isVideoEncoded()) {
                        a[12] = true;
                    } else {
                        a[13] = true;
                    }
                    C9244f.m43202a(this.f24476b.mo33434c().mo33499a(BugState.WAITING_VIDEO));
                    a[17] = true;
                    a[18] = true;
                    Looper.prepare();
                    a[23] = true;
                    new Handler(Looper.getMainLooper()).post(new C9256a(this));
                    a[24] = true;
                }
                InstabugSDKLogger.m46622d("LiveBugManager", "Sending bug..");
                a[14] = true;
                C9244f.m43202a(this.f24476b.mo33434c().mo33499a(BugState.READY_TO_BE_SENT));
                a[15] = true;
                C9254f.m43256i();
                a[16] = true;
                a[18] = true;
            } catch (JSONException e) {
                a[19] = true;
                InstabugSDKLogger.m46623e(cls, e.toString());
                a[20] = true;
            } catch (IOException e2) {
                a[21] = true;
                InstabugSDKLogger.m46624e(cls, e2.getClass().getSimpleName(), e2);
                a[22] = true;
            }
            Looper.prepare();
            a[23] = true;
            new Handler(Looper.getMainLooper()).post(new C9256a(this));
            a[24] = true;
        }
    }

    static {
        boolean[] l = m43259l();
        l[102] = true;
    }

    private C9254f() {
        boolean[] l = m43259l();
        l[0] = true;
    }

    /* renamed from: a */
    static /* synthetic */ Bug m43248a(C9254f fVar) {
        boolean[] l = m43259l();
        Bug bug = fVar.f24471a;
        l[99] = true;
        return bug;
    }

    /* renamed from: b */
    static /* synthetic */ void m43250b(C9254f fVar) {
        boolean[] l = m43259l();
        fVar.m43258k();
        l[100] = true;
    }

    /* renamed from: c */
    static /* synthetic */ void m43252c(C9254f fVar) {
        boolean[] l = m43259l();
        fVar.m43257j();
        l[101] = true;
    }

    /* renamed from: h */
    public static C9254f m43255h() {
        boolean[] l = m43259l();
        C9254f fVar = f24469d;
        l[1] = true;
        return fVar;
    }

    /* renamed from: i */
    public static void m43256i() {
        boolean[] l = m43259l();
        InstabugSDKLogger.m46622d(C9254f.class, "sending bug report to the server");
        l[95] = true;
        C9288c.m43461a(Instabug.getApplicationContext());
        l[96] = true;
    }

    /* renamed from: j */
    private void m43257j() {
        boolean[] l = m43259l();
        SynchronizationManager.getInstance().sync();
        l[41] = true;
    }

    /* renamed from: k */
    private void m43258k() {
        boolean[] l = m43259l();
        C9291a r = C9291a.m43476r();
        l[80] = true;
        if (r.mo33615h() != null) {
            l[81] = true;
            OnSdkDismissCallback h = r.mo33615h();
            l[82] = true;
            OnSdkDismissCallback.DismissType a = C9238a.m43165a(m43255h().mo33436d());
            l[83] = true;
            ReportType a2 = C9238a.m43166a(m43255h().mo33434c().mo33514e());
            l[84] = true;
            h.call(a, a2);
            l[85] = true;
            return;
        }
        if (r.mo33613f() == null) {
            l[86] = true;
        } else {
            l[87] = true;
            OnSdkDismissedCallback f = r.mo33613f();
            DismissType d = mo33436d();
            l[88] = true;
            C9278b e = mo33434c().mo33514e();
            l[89] = true;
            f.onSdkDismissed(d, e);
            l[90] = true;
        }
        l[91] = true;
    }

    /* renamed from: l */
    private static /* synthetic */ boolean[] m43259l() {
        boolean[] zArr = f24470e;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-1471617763156343239L, "com/instabug/bug/LiveBugManager", 103);
        f24470e = a;
        return a;
    }

    /* renamed from: d */
    public DismissType mo33436d() {
        boolean[] l = m43259l();
        DismissType dismissType = this.f24473c;
        l[23] = true;
        return dismissType;
    }

    /* renamed from: e */
    public boolean mo33437e() {
        boolean[] l = m43259l();
        boolean z = this.f24472b;
        l[24] = true;
        return z;
    }

    /* renamed from: f */
    public void mo33438f() {
        boolean[] l = m43259l();
        if (this.f24471a.getState() == null) {
            l[42] = true;
        } else {
            l[43] = true;
            if (InstabugCore.getFeatureState(Feature.USER_EVENTS) != State.ENABLED) {
                l[44] = true;
            } else {
                try {
                    l[45] = true;
                    com.instabug.library.model.State state = this.f24471a.getState();
                    JSONArray json = UserEvent.toJson(InstabugUserEventLogger.getInstance().getUserEvents());
                    l[46] = true;
                    String jSONArray = json.toString();
                    l[47] = true;
                    state.setUserEvents(jSONArray);
                    l[48] = true;
                } catch (JSONException e) {
                    l[49] = true;
                    InstabugSDKLogger.m46624e(this, "Got error while parsing user events logs", e);
                    l[50] = true;
                }
            }
            if (SettingsManager.getInstance().getOnReportCreatedListener() != null) {
                l[51] = true;
            } else {
                l[52] = true;
                this.f24471a.getState().setTags(InstabugCore.getTagsAsString());
                l[53] = true;
                this.f24471a.getState().setUserAttributes(UserAttributesCacheManager.getUserAttributes());
                l[54] = true;
                if (InstabugCore.getFeatureState(Feature.USER_DATA) != State.ENABLED) {
                    l[55] = true;
                } else {
                    l[56] = true;
                    this.f24471a.getState().setUserData(InstabugCore.getUserData());
                    l[57] = true;
                }
                if (InstabugCore.getFeatureState(Feature.INSTABUG_LOGS) != State.ENABLED) {
                    l[58] = true;
                } else {
                    l[59] = true;
                    this.f24471a.getState().setInstabugLog(InstabugLog.getLogs());
                    l[60] = true;
                }
            }
        }
        l[61] = true;
    }

    /* renamed from: g */
    public void mo33439g() {
        boolean[] l = m43259l();
        mo33431a(true);
        l[92] = true;
        mo33429a(DismissType.ADD_ATTACHMENT);
        l[93] = true;
        m43258k();
        l[94] = true;
    }

    /* renamed from: a */
    static /* synthetic */ void m43249a(C9254f fVar, Context context) {
        boolean[] l = m43259l();
        fVar.m43254e(context);
        l[97] = true;
    }

    /* renamed from: b */
    static /* synthetic */ void m43251b(C9254f fVar, Context context) {
        boolean[] l = m43259l();
        fVar.m43253d(context);
        l[98] = true;
    }

    /* renamed from: d */
    private void m43253d(Context context) {
        boolean[] l = m43259l();
        List<Attachment> g = mo33434c().mo33519g();
        l[62] = true;
        l[63] = true;
        for (Attachment attachment : g) {
            l[64] = true;
            if (attachment.getType().equals(Type.IMAGE)) {
                l[65] = true;
            } else {
                Type type = attachment.getType();
                Type type2 = Type.MAIN_SCREENSHOT;
                l[66] = true;
                if (!type.equals(type2)) {
                    l[67] = true;
                } else {
                    try {
                        l[68] = true;
                    } catch (Exception e) {
                        l[71] = true;
                        e.printStackTrace();
                        l[72] = true;
                        InstabugSDKLogger.m46623e(C9254f.class, "Failed to compress MAIN_SCREENSHOT or IMAGE & save original as it is");
                        l[73] = true;
                    }
                }
                l[74] = true;
            }
            File attachmentFile = AttachmentsUtility.getAttachmentFile(context, attachment.getName());
            l[69] = true;
            BitmapUtils.compressBitmapAndSave(attachmentFile);
            l[70] = true;
            l[74] = true;
        }
        l[75] = true;
    }

    /* renamed from: e */
    private void m43254e(Context context) {
        boolean[] l = m43259l();
        l[76] = true;
        for (Entry entry : InstabugCore.getExtraAttachmentFiles().entrySet()) {
            l[77] = true;
            mo33428a(context, (Uri) entry.getKey(), (String) entry.getValue(), Type.ATTACHMENT_FILE);
            l[78] = true;
        }
        l[79] = true;
    }

    /* renamed from: c */
    public Bug mo33434c() {
        boolean[] l = m43259l();
        Bug bug = this.f24471a;
        l[12] = true;
        return bug;
    }

    /* renamed from: a */
    public void mo33430a(Bug bug) {
        boolean[] l = m43259l();
        this.f24471a = bug;
        this.f24472b = false;
        this.f24473c = DismissType.CANCEL;
        l[2] = true;
    }

    /* renamed from: b */
    public void mo33432b() {
        boolean[] l = m43259l();
        Bug bug = this.f24471a;
        if (bug == null) {
            l[4] = true;
        } else if (bug.mo33519g() == null) {
            l[5] = true;
        } else {
            l[6] = true;
            l[7] = true;
            for (Attachment attachment : this.f24471a.mo33519g()) {
                l[9] = true;
                DiskUtils.deleteFile(attachment.getLocalPath());
                l[10] = true;
            }
            l[8] = true;
        }
        mo33425a();
        l[11] = true;
    }

    /* renamed from: c */
    public void mo33435c(Context context) {
        boolean[] l = m43259l();
        SettingsManager instance = SettingsManager.getInstance();
        l[26] = true;
        if (instance.getOnReportCreatedListener() == null) {
            l[27] = true;
        } else {
            l[28] = true;
            Report report = new Report();
            l[29] = true;
            instance.getOnReportCreatedListener().onReportCreated(report);
            l[30] = true;
            if (m43255h().mo33434c() == null) {
                l[31] = true;
            } else {
                l[32] = true;
                ReportHelper.update(m43255h().mo33434c().getState(), report);
                l[33] = true;
            }
        }
        if (instance.getPreReportRunnable() == null) {
            l[34] = true;
        } else {
            try {
                l[35] = true;
                instance.getPreReportRunnable().run();
                l[36] = true;
            } catch (Exception e) {
                l[37] = true;
                InstabugSDKLogger.m46624e("LiveBugManager", "Pre sending runnable failed to run.", e);
                l[38] = true;
            }
        }
        Thread thread = new Thread(new C9255a(this, context));
        l[39] = true;
        thread.start();
        l[40] = true;
    }

    /* renamed from: a */
    public void mo33425a() {
        boolean[] l = m43259l();
        this.f24471a = null;
        l[3] = true;
    }

    /* renamed from: a */
    public void mo33426a(Context context) {
        boolean[] l = m43259l();
        if (this.f24471a != null) {
            l[13] = true;
        } else {
            l[14] = true;
            mo33430a(new C9274a().mo33536a(context));
            l[15] = true;
        }
        l[16] = true;
    }

    /* renamed from: b */
    public void mo33433b(Context context) {
        boolean[] l = m43259l();
        C2128a.m11089a(context).mo9219a(new Intent("refresh.attachments"));
        l[21] = true;
    }

    /* renamed from: a */
    public void mo33427a(Context context, Uri uri) {
        boolean[] l = m43259l();
        mo33428a(context, uri, null, Type.IMAGE);
        l[17] = true;
    }

    /* renamed from: a */
    public void mo33428a(Context context, Uri uri, String str, Type type) {
        boolean[] l = m43259l();
        Uri newFileAttachmentUri = AttachmentsUtility.getNewFileAttachmentUri(context, uri, str);
        l[18] = true;
        mo33434c().mo33498a(newFileAttachmentUri, type);
        l[19] = true;
        mo33433b(context);
        l[20] = true;
    }

    /* renamed from: a */
    public void mo33429a(DismissType dismissType) {
        boolean[] l = m43259l();
        this.f24473c = dismissType;
        l[22] = true;
    }

    /* renamed from: a */
    public void mo33431a(boolean z) {
        boolean[] l = m43259l();
        this.f24472b = z;
        l[25] = true;
    }
}
