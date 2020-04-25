package com.instabug.library.internal.video;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Handler;
import com.amplitude.api.C2876e;
import com.instabug.library.C9794d;
import com.instabug.library.C9794d.C9795a;
import com.instabug.library.Instabug;
import com.instabug.library.internal.media.C9832a;
import com.instabug.library.internal.storage.AttachmentsUtility;
import com.instabug.library.internal.storage.DiskUtils;
import com.instabug.library.invocation.InvocationManager;
import com.instabug.library.screenshot.C9980a;
import com.instabug.library.tracking.InstabugInternalTrackingDelegate;
import com.instabug.library.util.C10023d;
import com.instabug.library.util.InstabugSDKLogger;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.File;
import p205i.p471b.p472a.p473a.p474c.C13938g;

@SuppressFBWarnings({"RV_RETURN_VALUE_IGNORED_BAD_PRACTICE"})
/* renamed from: com.instabug.library.internal.video.c */
/* compiled from: VideoFrameSnapper */
public class C9865c {

    /* renamed from: g */
    private static C9865c f26152g;

    /* renamed from: h */
    private static transient /* synthetic */ boolean[] f26153h;

    /* renamed from: a */
    private C9867b f26154a;

    /* renamed from: b */
    private boolean f26155b = false;

    /* renamed from: c */
    private Handler f26156c;

    /* renamed from: d */
    private Runnable f26157d;

    /* renamed from: e */
    private C9832a f26158e;

    /* renamed from: f */
    private String f26159f;

    /* renamed from: com.instabug.library.internal.video.c$a */
    /* compiled from: VideoFrameSnapper */
    class C9866a implements Runnable {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f26160b;

        /* renamed from: a */
        final /* synthetic */ C9865c f26161a;

        C9866a(C9865c cVar) {
            boolean[] a = m45937a();
            this.f26161a = cVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45937a() {
            boolean[] zArr = f26160b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(8411410142742509629L, "com/instabug/library/internal/video/VideoFrameSnapper$1", 3);
            f26160b = a;
            return a;
        }

        public void run() {
            boolean[] a = m45937a();
            InstabugSDKLogger.m46625i(this, "Time limit has been reached, stopping recording");
            a[1] = true;
            InternalScreenRecordHelper.getInstance().stop();
            a[2] = true;
        }
    }

    /* renamed from: com.instabug.library.internal.video.c$b */
    /* compiled from: VideoFrameSnapper */
    private class C9867b extends AsyncTask<Void, Void, Void> {

        /* renamed from: f */
        private static transient /* synthetic */ boolean[] f26162f;

        /* renamed from: a */
        private boolean f26163a = false;

        /* renamed from: b */
        private C9869c f26164b;

        /* renamed from: c */
        private Handler f26165c;

        /* renamed from: d */
        private C9795a[] f26166d = null;

        /* renamed from: e */
        final /* synthetic */ C9865c f26167e;

        /* renamed from: com.instabug.library.internal.video.c$b$a */
        /* compiled from: VideoFrameSnapper */
        class C9868a implements Runnable {

            /* renamed from: b */
            private static transient /* synthetic */ boolean[] f26168b;

            /* renamed from: a */
            final /* synthetic */ C9867b f26169a;

            C9868a(C9867b bVar) {
                boolean[] a = m45949a();
                this.f26169a = bVar;
                a[0] = true;
            }

            /* renamed from: a */
            private static /* synthetic */ boolean[] m45949a() {
                boolean[] zArr = f26168b;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(-3068857588252822912L, "com/instabug/library/internal/video/VideoFrameSnapper$SnapperTask$1", 13);
                f26168b = a;
                return a;
            }

            public void run() {
                boolean[] a = m45949a();
                if (C9867b.m45938a(this.f26169a)) {
                    a[1] = true;
                    C9867b.m45940b(this.f26169a).removeCallbacks(this);
                    a[2] = true;
                    if (!this.f26169a.isCancelled()) {
                        a[3] = true;
                        C9867b.m45942c(this.f26169a).onFramesCapturingFinished(C9865c.m45928a(this.f26169a.f26167e));
                        a[4] = true;
                    } else {
                        this.f26169a.onCancelled();
                        a[5] = true;
                    }
                } else {
                    C9867b.m45939a(this.f26169a, C9794d.m45671b().mo34922a());
                    a[6] = true;
                    C9867b bVar = this.f26169a;
                    bVar.f26167e.mo35110a(C9867b.m45944d(bVar));
                    a[7] = true;
                    C9867b.m45946e(this.f26169a);
                    a[8] = true;
                    if (this.f26169a.isCancelled()) {
                        a[9] = true;
                    } else {
                        a[10] = true;
                        C9867b.m45940b(this.f26169a).postDelayed(this, 125);
                        a[11] = true;
                    }
                }
                a[12] = true;
            }
        }

        public C9867b(C9865c cVar, C9869c cVar2) {
            boolean[] d = m45945d();
            this.f26167e = cVar;
            this.f26164b = cVar2;
            d[0] = true;
            this.f26165c = new Handler();
            d[1] = true;
        }

        /* renamed from: a */
        static /* synthetic */ boolean m45938a(C9867b bVar) {
            boolean[] d = m45945d();
            boolean z = bVar.f26163a;
            d[22] = true;
            return z;
        }

        /* renamed from: b */
        static /* synthetic */ Handler m45940b(C9867b bVar) {
            boolean[] d = m45945d();
            Handler handler = bVar.f26165c;
            d[23] = true;
            return handler;
        }

        /* renamed from: c */
        static /* synthetic */ C9869c m45942c(C9867b bVar) {
            boolean[] d = m45945d();
            C9869c cVar = bVar.f26164b;
            d[24] = true;
            return cVar;
        }

        /* renamed from: d */
        static /* synthetic */ C9795a[] m45944d(C9867b bVar) {
            boolean[] d = m45945d();
            C9795a[] aVarArr = bVar.f26166d;
            d[26] = true;
            return aVarArr;
        }

        /* renamed from: d */
        private static /* synthetic */ boolean[] m45945d() {
            boolean[] zArr = f26162f;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-8542785188964173203L, "com/instabug/library/internal/video/VideoFrameSnapper$SnapperTask", 28);
            f26162f = a;
            return a;
        }

        /* renamed from: e */
        static /* synthetic */ void m45946e(C9867b bVar) {
            boolean[] d = m45945d();
            bVar.m45943c();
            d[27] = true;
        }

        public /* synthetic */ Object doInBackground(Object[] objArr) {
            boolean[] d = m45945d();
            Void a = mo35114a((Void[]) objArr);
            d[21] = true;
            return a;
        }

        /* access modifiers changed from: protected */
        public void onCancelled() {
            boolean[] d = m45945d();
            super.onCancelled();
            d[8] = true;
            InstabugSDKLogger.m46625i(this, "Cancelling video recording");
            d[9] = true;
            m45941b();
            d[10] = true;
            InvocationManager.getInstance().handle(null);
            d[11] = true;
            InvocationManager.getInstance().sleep();
            d[12] = true;
        }

        /* renamed from: a */
        static /* synthetic */ C9795a[] m45939a(C9867b bVar, C9795a[] aVarArr) {
            boolean[] d = m45945d();
            bVar.f26166d = aVarArr;
            d[25] = true;
            return aVarArr;
        }

        /* renamed from: b */
        private void m45941b() {
            boolean[] d = m45945d();
            File videoRecordingFramesDirectory = AttachmentsUtility.getVideoRecordingFramesDirectory(Instabug.getApplicationContext());
            d[13] = true;
            File[] listFiles = videoRecordingFramesDirectory.listFiles();
            if (listFiles == null) {
                d[14] = true;
            } else {
                int length = listFiles.length;
                int i = 0;
                d[15] = true;
                while (i < length) {
                    File file = listFiles[i];
                    d[17] = true;
                    file.delete();
                    i++;
                    d[18] = true;
                }
                d[16] = true;
            }
            InstabugSDKLogger.m46622d(this, "Video frames are removed");
            d[19] = true;
        }

        /* renamed from: c */
        private void m45943c() {
            boolean[] d = m45945d();
            this.f26166d = null;
            d[20] = true;
        }

        /* renamed from: a */
        public Void mo35114a(Void... voidArr) {
            boolean[] d = m45945d();
            StringBuilder sb = new StringBuilder();
            sb.append("Video recording status: ");
            sb.append(String.valueOf(isCancelled()));
            InstabugSDKLogger.m46625i(this, sb.toString());
            d[2] = true;
            if (isCancelled()) {
                d[3] = true;
            } else {
                d[4] = true;
                this.f26165c.post(new C9868a(this));
                d[5] = true;
            }
            d[6] = true;
            return null;
        }

        /* renamed from: a */
        public void mo35115a() {
            boolean[] d = m45945d();
            this.f26163a = true;
            d[7] = true;
        }
    }

    /* renamed from: com.instabug.library.internal.video.c$c */
    /* compiled from: VideoFrameSnapper */
    public interface C9869c {
        void onFramesCapturingFinished(String str);
    }

    public C9865c() {
        boolean[] e = m45930e();
        e[4] = true;
        this.f26156c = new Handler();
        e[5] = true;
        this.f26157d = new C9866a(this);
        e[6] = true;
    }

    /* renamed from: a */
    static /* synthetic */ String m45928a(C9865c cVar) {
        boolean[] e = m45930e();
        String str = cVar.f26159f;
        e[48] = true;
        return str;
    }

    /* renamed from: d */
    public static C9865c m45929d() {
        boolean[] e = m45930e();
        if (f26152g != null) {
            e[0] = true;
        } else {
            e[1] = true;
            f26152g = new C9865c();
            e[2] = true;
        }
        C9865c cVar = f26152g;
        e[3] = true;
        return cVar;
    }

    /* renamed from: e */
    private static /* synthetic */ boolean[] m45930e() {
        boolean[] zArr = f26153h;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(841615203409875999L, "com/instabug/library/internal/video/VideoFrameSnapper", 49);
        f26153h = a;
        return a;
    }

    /* renamed from: b */
    public void mo35111b() {
        boolean z;
        boolean[] e = m45930e();
        StringBuilder sb = new StringBuilder();
        sb.append("Frame Snapper: ");
        if (this.f26154a != null) {
            e[30] = true;
            z = true;
        } else {
            e[31] = true;
            z = false;
        }
        sb.append(String.valueOf(z));
        InstabugSDKLogger.m46625i(this, sb.toString());
        C9867b bVar = this.f26154a;
        if (bVar == null) {
            e[32] = true;
        } else {
            e[33] = true;
            bVar.cancel(true);
            e[34] = true;
            this.f26154a.mo35115a();
            e[35] = true;
            mo35109a(false);
            e[36] = true;
            this.f26156c.removeCallbacks(this.f26157d);
            C9832a aVar = this.f26158e;
            if (aVar == null) {
                e[37] = true;
            } else {
                e[38] = true;
                aVar.mo34968b();
                e[39] = true;
            }
            File file = new File(this.f26159f);
            e[40] = true;
            file.delete();
            e[41] = true;
        }
        e[42] = true;
    }

    /* renamed from: c */
    public boolean mo35112c() {
        boolean[] e = m45930e();
        boolean z = this.f26155b;
        e[43] = true;
        return z;
    }

    /* renamed from: a */
    public void mo35108a(C9869c cVar) {
        boolean[] e = m45930e();
        this.f26154a = new C9867b(this, cVar);
        e[7] = true;
        this.f26154a.execute(new Void[0]);
        e[8] = true;
        mo35109a(true);
        e[9] = true;
        this.f26156c.postDelayed(this.f26157d, C2876e.f10137n);
        e[10] = true;
        if (C10023d.m46636a()) {
            e[11] = true;
            InstabugSDKLogger.m46625i(this, "Audio permission granted");
            e[12] = true;
            File instabugDirectory = DiskUtils.getInstabugDirectory(Instabug.getApplicationContext());
            e[13] = true;
            StringBuilder sb = new StringBuilder();
            sb.append("audioMessage_");
            e[14] = true;
            sb.append(String.valueOf(System.currentTimeMillis()));
            sb.append(".mp4");
            File file = new File(instabugDirectory, sb.toString());
            e[15] = true;
            this.f26159f = file.getAbsolutePath();
            e[16] = true;
            this.f26158e = new C9832a(this.f26159f);
            e[17] = true;
            C10023d.m46635a(Instabug.getApplicationContext());
            e[18] = true;
            this.f26158e.mo34967a();
            e[19] = true;
        } else {
            InstabugSDKLogger.m46623e(this, "Audio permission is not granted");
            e[20] = true;
        }
        e[21] = true;
    }

    /* renamed from: a */
    public void mo35107a() {
        boolean[] e = m45930e();
        C9867b bVar = this.f26154a;
        if (bVar == null) {
            e[22] = true;
        } else {
            e[23] = true;
            bVar.mo35115a();
            e[24] = true;
            mo35109a(false);
            e[25] = true;
            this.f26156c.removeCallbacks(this.f26157d);
            C9832a aVar = this.f26158e;
            if (aVar == null) {
                e[26] = true;
            } else {
                e[27] = true;
                aVar.mo34968b();
                e[28] = true;
            }
        }
        e[29] = true;
    }

    /* renamed from: a */
    public void mo35109a(boolean z) {
        boolean[] e = m45930e();
        this.f26155b = z;
        e[44] = true;
    }

    /* renamed from: a */
    public void mo35110a(C9795a[] aVarArr) {
        boolean[] e = m45930e();
        InstabugInternalTrackingDelegate instance = InstabugInternalTrackingDelegate.getInstance();
        e[45] = true;
        Activity targetActivity = instance.getTargetActivity();
        e[46] = true;
        C9980a.m46397a(targetActivity, aVarArr);
        e[47] = true;
    }
}
