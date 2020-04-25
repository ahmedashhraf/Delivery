package com.instabug.library.internal.video;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.hardware.display.VirtualDisplay;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.util.DisplayMetrics;
import android.view.Surface;
import android.view.WindowManager;
import com.google.android.gms.common.util.C4494m;
import com.instabug.library.internal.storage.AttachmentManager;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.util.InstabugSDKLogger;
import java.io.File;
import java.io.IOException;
import p205i.p471b.p472a.p473a.p474c.C13938g;

@TargetApi(21)
/* renamed from: com.instabug.library.internal.video.b */
/* compiled from: RecordingSession */
final class C9860b {

    /* renamed from: l */
    private static transient /* synthetic */ boolean[] f26130l;

    /* renamed from: a */
    private final Context f26131a;

    /* renamed from: b */
    private final C9863c f26132b;

    /* renamed from: c */
    private final int f26133c;

    /* renamed from: d */
    private final Intent f26134d;

    /* renamed from: e */
    private final File f26135e;

    /* renamed from: f */
    private final MediaProjectionManager f26136f;

    /* renamed from: g */
    private MediaRecorder f26137g;

    /* renamed from: h */
    private MediaProjection f26138h;

    /* renamed from: i */
    private VirtualDisplay f26139i;

    /* renamed from: j */
    private String f26140j;

    /* renamed from: k */
    private boolean f26141k;

    /* renamed from: com.instabug.library.internal.video.b$a */
    /* compiled from: RecordingSession */
    class C9861a implements Runnable {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f26142b;

        /* renamed from: a */
        final /* synthetic */ C9860b f26143a;

        C9861a(C9860b bVar) {
            boolean[] a = m45923a();
            this.f26143a = bVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45923a() {
            boolean[] zArr = f26142b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-7544727832208358057L, "com/instabug/library/internal/video/RecordingSession$1", 6);
            f26142b = a;
            return a;
        }

        public void run() {
            boolean[] a = m45923a();
            File file = new File(C9860b.m45913a(this.f26143a));
            a[1] = true;
            if (!file.delete()) {
                a[2] = true;
            } else {
                a[3] = true;
                InstabugSDKLogger.m46622d(this, "Screen recording file deleted");
                a[4] = true;
            }
            a[5] = true;
        }
    }

    /* renamed from: com.instabug.library.internal.video.b$b */
    /* compiled from: RecordingSession */
    class C9862b implements Runnable {

        /* renamed from: N */
        private static transient /* synthetic */ boolean[] f26144N;

        /* renamed from: a */
        final /* synthetic */ int f26145a;

        /* renamed from: b */
        final /* synthetic */ C9860b f26146b;

        C9862b(C9860b bVar, int i) {
            boolean[] a = m45924a();
            this.f26146b = bVar;
            this.f26145a = i;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45924a() {
            boolean[] zArr = f26144N;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(8635707007292577872L, "com/instabug/library/internal/video/RecordingSession$2", 8);
            f26144N = a;
            return a;
        }

        public void run() {
            boolean[] a = m45924a();
            try {
                File file = new File(C9860b.m45913a(this.f26146b));
                C9860b bVar = this.f26146b;
                a[1] = true;
                File autoScreenRecordingFile = AttachmentManager.getAutoScreenRecordingFile(C9860b.m45914b(bVar));
                int i = this.f26145a;
                a[2] = true;
                File startTrim = InstabugVideoUtils.startTrim(file, autoScreenRecordingFile, i);
                a[3] = true;
                InternalAutoScreenRecorderHelper.getInstance().setAutoScreenRecordingFile(startTrim);
                a[4] = true;
            } catch (IOException | IllegalArgumentException e) {
                a[5] = true;
                e.printStackTrace();
                a[6] = true;
            }
            a[7] = true;
        }
    }

    /* renamed from: com.instabug.library.internal.video.b$c */
    /* compiled from: RecordingSession */
    interface C9863c {
        /* renamed from: c */
        void mo35059c();

        /* renamed from: d */
        void mo35060d();
    }

    /* renamed from: com.instabug.library.internal.video.b$d */
    /* compiled from: RecordingSession */
    static final class C9864d {

        /* renamed from: e */
        private static transient /* synthetic */ boolean[] f26147e;

        /* renamed from: a */
        final int f26148a;

        /* renamed from: b */
        final int f26149b;

        /* renamed from: c */
        final int f26150c;

        /* renamed from: d */
        final int f26151d;

        C9864d(int i, int i2, int i3, int i4) {
            boolean[] a = m45927a();
            this.f26148a = i;
            this.f26149b = i2;
            this.f26150c = i3;
            this.f26151d = i4;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45927a() {
            boolean[] zArr = f26147e;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(6323427873460817066L, "com/instabug/library/internal/video/RecordingSession$RecordingInfo", 1);
            f26147e = a;
            return a;
        }
    }

    C9860b(Context context, C9863c cVar, int i, Intent intent) {
        boolean[] g = m45918g();
        this.f26131a = context;
        this.f26132b = cVar;
        this.f26133c = i;
        this.f26134d = intent;
        g[0] = true;
        this.f26135e = AttachmentManager.getAutoScreenRecordingVideosDirectory(context);
        g[1] = true;
        this.f26136f = (MediaProjectionManager) context.getSystemService("media_projection");
        g[2] = true;
        m45916e();
        g[3] = true;
    }

    /* renamed from: a */
    static /* synthetic */ String m45913a(C9860b bVar) {
        boolean[] g = m45918g();
        String str = bVar.f26140j;
        g[89] = true;
        return str;
    }

    /* renamed from: b */
    static /* synthetic */ Context m45914b(C9860b bVar) {
        boolean[] g = m45918g();
        Context context = bVar.f26131a;
        g[90] = true;
        return context;
    }

    /* renamed from: d */
    private C9864d m45915d() {
        boolean z;
        CamcorderProfile camcorderProfile;
        int i;
        int i2;
        int i3;
        boolean[] g = m45918g();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        g[4] = true;
        WindowManager windowManager = (WindowManager) this.f26131a.getSystemService("window");
        g[5] = true;
        windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        int i4 = displayMetrics.widthPixels;
        int i5 = displayMetrics.heightPixels;
        int i6 = displayMetrics.densityDpi;
        g[6] = true;
        if (this.f26131a.getResources().getConfiguration().orientation == 2) {
            g[7] = true;
            z = true;
        } else {
            g[8] = true;
            z = false;
        }
        g[9] = true;
        if (CamcorderProfile.hasProfile(1007)) {
            g[10] = true;
            camcorderProfile = CamcorderProfile.get(1007);
            g[11] = true;
        } else {
            camcorderProfile = CamcorderProfile.get(0);
            g[12] = true;
        }
        if (camcorderProfile != null) {
            i = camcorderProfile.videoFrameWidth;
            g[13] = true;
        } else {
            g[14] = true;
            i = -1;
        }
        if (camcorderProfile != null) {
            int i7 = camcorderProfile.videoFrameHeight;
            g[15] = true;
            i2 = i7;
        } else {
            g[16] = true;
            i2 = -1;
        }
        if (camcorderProfile != null) {
            int i8 = camcorderProfile.videoFrameRate;
            g[17] = true;
            i3 = i8;
        } else {
            g[18] = true;
            i3 = 30;
        }
        g[19] = true;
        C9864d a = m45912a(i4, i5, i6, z, i, i2, i3, 50);
        g[20] = true;
        return a;
    }

    /* renamed from: e */
    private void m45916e() {
        boolean[] g = m45918g();
        if (this.f26135e.exists()) {
            g[21] = true;
        } else if (this.f26135e.mkdirs()) {
            g[22] = true;
        } else {
            g[23] = true;
            InstabugSDKLogger.m46622d(this, "Unable to create output directory.\nCannot record screen.");
            g[24] = true;
            return;
        }
        C9864d d = m45915d();
        g[25] = true;
        this.f26137g = new MediaRecorder();
        g[26] = true;
        this.f26137g.setVideoSource(2);
        g[27] = true;
        this.f26137g.setOutputFormat(2);
        g[28] = true;
        this.f26137g.setVideoFrameRate(d.f26150c);
        g[29] = true;
        this.f26137g.setVideoEncoder(2);
        g[30] = true;
        this.f26137g.setVideoSize(d.f26148a, d.f26149b);
        g[31] = true;
        this.f26137g.setVideoEncodingBitRate(C4494m.f13757j);
        g[32] = true;
        this.f26140j = AttachmentManager.getAutoScreenRecordingFile(this.f26131a).getAbsolutePath();
        g[33] = true;
        this.f26137g.setOutputFile(this.f26140j);
        try {
            g[34] = true;
            this.f26137g.prepare();
            this.f26138h = this.f26136f.getMediaProjection(this.f26133c, this.f26134d);
            g[37] = true;
            Surface surface = this.f26137g.getSurface();
            MediaProjection mediaProjection = this.f26138h;
            int i = d.f26148a;
            int i2 = d.f26149b;
            int i3 = d.f26151d;
            g[38] = true;
            this.f26139i = mediaProjection.createVirtualDisplay(SettingsManager.INSTABUG_SHARED_PREF_NAME, i, i2, i3, 2, surface, null, null);
            g[39] = true;
            this.f26137g.start();
            this.f26141k = true;
            g[40] = true;
            this.f26132b.mo35060d();
            g[41] = true;
            InstabugSDKLogger.m46625i(this, "Screen recording started");
            g[42] = true;
        } catch (IOException e) {
            g[35] = true;
            RuntimeException runtimeException = new RuntimeException("Unable to prepare MediaRecorder.", e);
            g[36] = true;
            throw runtimeException;
        }
    }

    /* renamed from: f */
    private void m45917f() {
        Throwable th;
        boolean[] g = m45918g();
        if (this.f26141k) {
            boolean z = false;
            this.f26141k = false;
            try {
                g[45] = true;
                this.f26138h.stop();
                g[46] = true;
                this.f26137g.stop();
                g[47] = true;
                this.f26137g.reset();
                try {
                    g[48] = true;
                    try {
                        this.f26132b.mo35059c();
                        g[49] = true;
                        this.f26137g.release();
                        g[62] = true;
                        this.f26139i.release();
                        g[63] = true;
                        InstabugSDKLogger.m46622d(this, "Screen recording stopped");
                        g[64] = true;
                    } catch (RuntimeException e) {
                        g[50] = true;
                        throw e;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    z = true;
                    try {
                        g[57] = true;
                        this.f26132b.mo35059c();
                        g[58] = true;
                    } catch (RuntimeException e2) {
                        if (!z) {
                            g[59] = true;
                        } else {
                            g[60] = true;
                            throw e2;
                        }
                    }
                    g[61] = true;
                    throw th;
                }
            } catch (RuntimeException unused) {
                g[52] = true;
                this.f26137g.reset();
                g[53] = true;
                try {
                    this.f26132b.mo35059c();
                    g[54] = true;
                } catch (RuntimeException e3) {
                    g[55] = true;
                    throw e3;
                }
            } catch (Throwable th22) {
                th = th22;
                z = true;
                try {
                    g[57] = true;
                    this.f26132b.mo35059c();
                    g[58] = true;
                } catch (RuntimeException e22) {
                    if (!z) {
                        g[59] = true;
                    } else {
                        g[60] = true;
                        throw e22;
                    }
                }
                g[61] = true;
                throw th;
            }
        } else {
            g[43] = true;
            IllegalStateException illegalStateException = new IllegalStateException("Not running.");
            g[44] = true;
            throw illegalStateException;
        }
    }

    /* renamed from: g */
    private static /* synthetic */ boolean[] m45918g() {
        boolean[] zArr = f26130l;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-1205843848176330713L, "com/instabug/library/internal/video/RecordingSession", 91);
        f26130l = a;
        return a;
    }

    /* renamed from: c */
    public void mo35104c() {
        boolean[] g = m45918g();
        InternalAutoScreenRecorderHelper.getInstance().setAutoScreenRecordingFile(new File(this.f26140j));
        g[86] = true;
    }

    /* renamed from: a */
    static C9864d m45912a(int i, int i2, int i3, boolean z, int i4, int i5, int i6, int i7) {
        int i8;
        boolean[] g = m45918g();
        int i9 = (i * i7) / 100;
        int i10 = (i2 * i7) / 100;
        if (i4 != -1) {
            g[65] = true;
        } else if (i5 != -1) {
            g[66] = true;
        } else {
            g[67] = true;
            C9864d dVar = new C9864d(i9, i10, i6, i3);
            g[68] = true;
            return dVar;
        }
        if (z) {
            g[69] = true;
            i8 = i4;
        } else {
            g[70] = true;
            i8 = i5;
        }
        if (z) {
            g[71] = true;
            i4 = i5;
        } else {
            g[72] = true;
        }
        if (i8 < i9) {
            g[73] = true;
        } else if (i4 < i10) {
            g[74] = true;
        } else {
            g[75] = true;
            C9864d dVar2 = new C9864d(i9, i10, i6, i3);
            g[76] = true;
            return dVar2;
        }
        if (z) {
            i8 = (i9 * i4) / i10;
            g[77] = true;
        } else {
            i4 = (i10 * i8) / i9;
            g[78] = true;
        }
        C9864d dVar3 = new C9864d(i8, i4, i6, i3);
        g[79] = true;
        return dVar3;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo35103b() {
        boolean[] g = m45918g();
        Thread thread = new Thread(new C9861a(this));
        g[84] = true;
        thread.start();
        g[85] = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo35101a() {
        boolean[] g = m45918g();
        if (!this.f26141k) {
            g[80] = true;
        } else {
            g[81] = true;
            m45917f();
            g[82] = true;
        }
        g[83] = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo35102a(int i) {
        boolean[] g = m45918g();
        Thread thread = new Thread(new C9862b(this, i));
        g[87] = true;
        thread.start();
        g[88] = true;
    }
}
