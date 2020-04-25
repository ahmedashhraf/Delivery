package com.instabug.library.invocation.p390a;

import android.app.Activity;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.FileObserver;
import android.os.Handler;
import com.instabug.library.core.eventbus.SessionStateEventBus;
import com.instabug.library.invocation.C9909b;
import com.instabug.library.invocation.InstabugInvocationEvent;
import com.instabug.library.invocation.InvocationManager;
import com.instabug.library.model.Session.SessionState;
import com.instabug.library.tracking.InstabugInternalTrackingDelegate;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.PermissionsUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import p195e.p196a.p449w0.C12331g;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.invocation.a.d */
/* compiled from: ScreenshotGestureInvoker */
public class C9902d implements C9882a<Void> {

    /* renamed from: N */
    private static transient /* synthetic */ boolean[] f26330N;

    /* renamed from: a */
    private boolean f26331a = true;

    /* renamed from: b */
    private List<C9904b> f26332b;

    /* renamed from: com.instabug.library.invocation.a.d$a */
    /* compiled from: ScreenshotGestureInvoker */
    class C9903a implements C12331g<SessionState> {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f26333b;

        /* renamed from: a */
        final /* synthetic */ C9902d f26334a;

        C9903a(C9902d dVar) {
            boolean[] a = m46100a();
            this.f26334a = dVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m46100a() {
            boolean[] zArr = f26333b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(7570529348142516058L, "com/instabug/library/invocation/invoker/ScreenshotGestureInvoker$1", 6);
            f26333b = a;
            return a;
        }

        /* renamed from: a */
        public void mo35210a(SessionState sessionState) {
            boolean[] a = m46100a();
            if (!sessionState.equals(SessionState.START)) {
                a[1] = true;
            } else {
                a[2] = true;
                C9902d.m46093a(this.f26334a, true);
                a[3] = true;
            }
            a[4] = true;
        }

        /* renamed from: c */
        public /* synthetic */ void mo33410c(Object obj) throws Exception {
            boolean[] a = m46100a();
            mo35210a((SessionState) obj);
            a[5] = true;
        }
    }

    /* renamed from: com.instabug.library.invocation.a.d$b */
    /* compiled from: ScreenshotGestureInvoker */
    private static class C9904b extends FileObserver {

        /* renamed from: g */
        private static transient /* synthetic */ boolean[] f26335g;

        /* renamed from: a */
        private String f26336a;

        /* renamed from: b */
        private long f26337b;

        /* renamed from: c */
        private final Handler f26338c = new Handler();

        /* renamed from: d */
        private Runnable f26339d;

        /* renamed from: e */
        private C9909b f26340e;

        /* renamed from: f */
        private String f26341f;

        /* renamed from: com.instabug.library.invocation.a.d$b$a */
        /* compiled from: ScreenshotGestureInvoker */
        class C9905a implements Runnable {

            /* renamed from: b */
            private static transient /* synthetic */ boolean[] f26342b;

            /* renamed from: a */
            final /* synthetic */ C9904b f26343a;

            C9905a(C9904b bVar) {
                boolean[] a = m46112a();
                this.f26343a = bVar;
                a[0] = true;
            }

            /* renamed from: a */
            private static /* synthetic */ boolean[] m46112a() {
                boolean[] zArr = f26342b;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(-4066484063484520257L, "com/instabug/library/invocation/invoker/ScreenshotGestureInvoker$ScreenshotDirectoryObserver$1", 24);
                f26342b = a;
                return a;
            }

            public void run() {
                boolean[] a = m46112a();
                File file = new File(C9904b.m46103a(this.f26343a));
                a[1] = true;
                if (file.listFiles() == null) {
                    a[2] = true;
                } else {
                    a[3] = true;
                    StringBuilder sb = new StringBuilder();
                    sb.append("The path is directory: ");
                    a[4] = true;
                    sb.append(file.isDirectory());
                    String sb2 = sb.toString();
                    a[5] = true;
                    InstabugSDKLogger.m46622d(this, sb2);
                    a[6] = true;
                    if (!file.isDirectory()) {
                        a[7] = true;
                    } else {
                        a[8] = true;
                        File[] listFiles = file.listFiles();
                        if (listFiles == null) {
                            a[9] = true;
                        } else {
                            int length = listFiles.length;
                            int i = 0;
                            a[10] = true;
                            while (i < length) {
                                File file2 = listFiles[i];
                                a[12] = true;
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("File name: ");
                                sb3.append(file2.getName());
                                sb3.append("File last modified: ");
                                a[13] = true;
                                sb3.append(file2.lastModified());
                                String sb4 = sb3.toString();
                                a[14] = true;
                                InstabugSDKLogger.m46622d(this, sb4);
                                a[15] = true;
                                if (!C9904b.m46104a(this.f26343a, file2.getName())) {
                                    a[16] = true;
                                } else {
                                    a[17] = true;
                                    StringBuilder sb5 = new StringBuilder();
                                    sb5.append("Screenshot taken: ");
                                    a[18] = true;
                                    sb5.append(file2.getPath());
                                    sb5.append(", invoking SDK");
                                    String sb6 = sb5.toString();
                                    a[19] = true;
                                    InstabugSDKLogger.m46622d(this, sb6);
                                    a[20] = true;
                                    C9904b.m46106b(this.f26343a).onInvocationRequested(Uri.fromFile(file2));
                                    a[21] = true;
                                }
                                i++;
                                a[22] = true;
                            }
                            a[11] = true;
                        }
                    }
                }
                C9904b.m46109d(this.f26343a).postDelayed(C9904b.m46107c(this.f26343a), 1000);
                a[23] = true;
            }
        }

        C9904b(String str, C9909b bVar) {
            boolean[] c = m46108c();
            super(str);
            this.f26336a = str;
            c[0] = true;
            this.f26340e = bVar;
            c[1] = true;
        }

        /* renamed from: a */
        static /* synthetic */ String m46103a(C9904b bVar) {
            boolean[] c = m46108c();
            String str = bVar.f26336a;
            c[40] = true;
            return str;
        }

        /* renamed from: b */
        static /* synthetic */ C9909b m46106b(C9904b bVar) {
            boolean[] c = m46108c();
            C9909b bVar2 = bVar.f26340e;
            c[42] = true;
            return bVar2;
        }

        /* renamed from: c */
        static /* synthetic */ Runnable m46107c(C9904b bVar) {
            boolean[] c = m46108c();
            Runnable runnable = bVar.f26339d;
            c[43] = true;
            return runnable;
        }

        /* renamed from: c */
        private static /* synthetic */ boolean[] m46108c() {
            boolean[] zArr = f26335g;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-1778920775119163769L, "com/instabug/library/invocation/invoker/ScreenshotGestureInvoker$ScreenshotDirectoryObserver", 45);
            f26335g = a;
            return a;
        }

        /* renamed from: d */
        static /* synthetic */ Handler m46109d(C9904b bVar) {
            boolean[] c = m46108c();
            Handler handler = bVar.f26338c;
            c[44] = true;
            return handler;
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x004e  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0051  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0073  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0078  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onEvent(int r8, java.lang.String r9) {
            /*
                r7 = this;
                boolean[] r0 = m46108c()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Event:"
                r1.append(r2)
                r1.append(r8)
                java.lang.String r2 = "\t"
                r1.append(r2)
                r1.append(r9)
                java.lang.String r1 = r1.toString()
                com.instabug.library.util.InstabugSDKLogger.m46625i(r7, r1)
                r1 = 1
                if (r9 != 0) goto L_0x0030
                r8 = 2
                r0[r8] = r1
                java.lang.String r8 = "Ignore this event."
                com.instabug.library.util.InstabugSDKLogger.m46625i(r7, r8)
                r8 = 3
                r0[r8] = r1
                goto L_0x00c7
            L_0x0030:
                r2 = 256(0x100, float:3.59E-43)
                if (r8 != r2) goto L_0x0038
                r2 = 4
                r0[r2] = r1
                goto L_0x0043
            L_0x0038:
                r2 = 32
                if (r8 == r2) goto L_0x0040
                r2 = 5
                r0[r2] = r1
                goto L_0x0048
            L_0x0040:
                r2 = 6
                r0[r2] = r1
            L_0x0043:
                r7.f26341f = r9
                r2 = 7
                r0[r2] = r1
            L_0x0048:
                r2 = 16
                r3 = 8
                if (r8 != r3) goto L_0x0051
                r0[r3] = r1
                goto L_0x006d
            L_0x0051:
                if (r8 == r2) goto L_0x0058
                r8 = 9
                r0[r8] = r1
                goto L_0x00c7
            L_0x0058:
                java.lang.String r8 = r7.f26341f
                r3 = 10
                r0[r3] = r1
                boolean r8 = r8.equals(r9)
                if (r8 != 0) goto L_0x0069
                r8 = 11
                r0[r8] = r1
                goto L_0x00c7
            L_0x0069:
                r8 = 12
                r0[r8] = r1
            L_0x006d:
                boolean r8 = r7.m46105a(r9)
                if (r8 != 0) goto L_0x0078
                r8 = 13
                r0[r8] = r1
                goto L_0x00c7
            L_0x0078:
                r8 = 14
                r0[r8] = r1
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r3 = "Screenshot taken: "
                r8.append(r3)
                java.lang.String r3 = r7.f26336a
                r8.append(r3)
                java.lang.String r3 = "/"
                r8.append(r3)
                r8.append(r9)
                java.lang.String r4 = ", invoking SDK"
                r8.append(r4)
                java.lang.String r8 = r8.toString()
                com.instabug.library.util.InstabugSDKLogger.m46622d(r7, r8)
                r8 = 15
                r0[r8] = r1
                com.instabug.library.invocation.b r8 = r7.f26340e
                java.io.File r4 = new java.io.File
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = r7.f26336a
                r5.append(r6)
                r5.append(r3)
                r5.append(r9)
                java.lang.String r9 = r5.toString()
                r4.<init>(r9)
                android.net.Uri r9 = android.net.Uri.fromFile(r4)
                r8.onInvocationRequested(r9)
                r0[r2] = r1
            L_0x00c7:
                r8 = 17
                r0[r8] = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.invocation.p390a.C9902d.C9904b.onEvent(int, java.lang.String):void");
        }

        public void startWatching() {
            boolean[] c = m46108c();
            this.f26339d = new C9905a(this);
            c[26] = true;
            this.f26338c.post(this.f26339d);
            c[27] = true;
        }

        public void stopWatching() {
            boolean[] c = m46108c();
            this.f26338c.removeCallbacks(this.f26339d);
            c[28] = true;
        }

        /* renamed from: a */
        static /* synthetic */ boolean m46104a(C9904b bVar, String str) {
            boolean[] c = m46108c();
            boolean a = bVar.m46105a(str);
            c[41] = true;
            return a;
        }

        /* renamed from: b */
        public void mo35212b() {
            boolean[] c = m46108c();
            if (VERSION.SDK_INT == 23) {
                c[22] = true;
                stopWatching();
                c[23] = true;
            } else {
                super.stopWatching();
                c[24] = true;
            }
            c[25] = true;
        }

        /* renamed from: a */
        public void mo35211a() {
            boolean[] c = m46108c();
            if (VERSION.SDK_INT == 23) {
                c[18] = true;
                startWatching();
                c[19] = true;
            } else {
                super.startWatching();
                c[20] = true;
            }
            c[21] = true;
        }

        /* renamed from: a */
        private boolean m46105a(String str) {
            boolean[] c = m46108c();
            if (!str.toLowerCase().contains("screenshot")) {
                c[29] = true;
            } else {
                c[30] = true;
                StringBuilder sb = new StringBuilder();
                sb.append(this.f26336a);
                sb.append("/");
                sb.append(str);
                File file = new File(sb.toString());
                c[31] = true;
                if (this.f26337b == file.lastModified()) {
                    c[32] = true;
                    return false;
                }
                this.f26337b = file.lastModified();
                c[33] = true;
                long currentTimeMillis = System.currentTimeMillis() - this.f26337b;
                c[34] = true;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Difference time between file lastUpdate and currentTime: ");
                sb2.append(currentTimeMillis);
                InstabugSDKLogger.m46622d(this, sb2.toString());
                if (VERSION.SDK_INT != 23) {
                    c[35] = true;
                    return true;
                } else if (currentTimeMillis >= 1800) {
                    c[36] = true;
                } else {
                    c[37] = true;
                    InstabugSDKLogger.m46622d(this, "Send event to listener.");
                    c[38] = true;
                    return true;
                }
            }
            c[39] = true;
            return false;
        }
    }

    public C9902d(C9909b bVar) {
        boolean[] g = m46097g();
        g[0] = true;
        this.f26332b = new ArrayList();
        g[1] = true;
        this.f26332b.add(new C9904b(m46091a(Environment.DIRECTORY_PICTURES), bVar));
        g[2] = true;
        this.f26332b.add(new C9904b(m46091a(Environment.DIRECTORY_DCIM), bVar));
        g[3] = true;
        m46096f();
        g[4] = true;
    }

    /* renamed from: a */
    static /* synthetic */ boolean m46093a(C9902d dVar, boolean z) {
        boolean[] g = m46097g();
        dVar.f26331a = z;
        g[44] = true;
        return z;
    }

    /* renamed from: b */
    private boolean m46094b() {
        boolean z;
        boolean[] g = m46097g();
        Activity currentActivity = InstabugInternalTrackingDelegate.getInstance().getCurrentActivity();
        g[18] = true;
        if (currentActivity == null) {
            g[19] = true;
        } else if (!PermissionsUtils.isPermissionGranted(currentActivity, "android.permission.WRITE_EXTERNAL_STORAGE")) {
            g[20] = true;
        } else {
            g[21] = true;
            z = true;
            g[23] = true;
            return z;
        }
        z = false;
        g[22] = true;
        g[23] = true;
        return z;
    }

    /* renamed from: e */
    private void m46095e() {
        boolean[] g = m46097g();
        InstabugInvocationEvent[] currentInstabugInvocationEvents = InvocationManager.getInstance().getCurrentInstabugInvocationEvents();
        int length = currentInstabugInvocationEvents.length;
        g[33] = true;
        int i = 0;
        while (i < length) {
            InstabugInvocationEvent instabugInvocationEvent = currentInstabugInvocationEvents[i];
            if (instabugInvocationEvent == InstabugInvocationEvent.SCREENSHOT_GESTURE) {
                g[35] = true;
            } else if (instabugInvocationEvent == InstabugInvocationEvent.SCREENSHOT) {
                g[36] = true;
            } else {
                i++;
                g[40] = true;
            }
            Activity currentActivity = InstabugInternalTrackingDelegate.getInstance().getCurrentActivity();
            if (currentActivity == null) {
                g[37] = true;
            } else {
                g[38] = true;
                PermissionsUtils.requestPermission(currentActivity, "android.permission.WRITE_EXTERNAL_STORAGE", 1, (Runnable) null, (Runnable) null);
                this.f26331a = false;
                g[39] = true;
            }
            g[41] = true;
        }
        g[34] = true;
        g[41] = true;
    }

    /* renamed from: f */
    private void m46096f() {
        boolean[] g = m46097g();
        SessionStateEventBus.getInstance().subscribe(new C9903a(this));
        g[42] = true;
    }

    /* renamed from: g */
    private static /* synthetic */ boolean[] m46097g() {
        boolean[] zArr = f26330N;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(6972694799073895754L, "com/instabug/library/invocation/invoker/ScreenshotGestureInvoker", 45);
        f26330N = a;
        return a;
    }

    /* renamed from: c */
    public void mo35184c() {
        boolean[] g = m46097g();
        g[24] = true;
        for (C9904b bVar : this.f26332b) {
            g[25] = true;
            bVar.mo35212b();
            g[26] = true;
        }
        g[27] = true;
    }

    /* renamed from: d */
    public void mo35185d() {
        boolean[] g = m46097g();
        if (!this.f26331a) {
            g[5] = true;
        } else if (m46094b()) {
            g[6] = true;
        } else {
            g[7] = true;
            m46095e();
            g[8] = true;
            g[10] = true;
        }
        m46092a();
        g[9] = true;
        g[10] = true;
    }

    /* renamed from: a */
    private void m46092a() {
        boolean[] g = m46097g();
        if (!m46094b()) {
            g[11] = true;
        } else {
            g[12] = true;
            g[13] = true;
            for (C9904b bVar : this.f26332b) {
                g[15] = true;
                bVar.mo35211a();
                g[16] = true;
            }
            g[14] = true;
        }
        g[17] = true;
    }

    /* renamed from: a */
    private String m46091a(String str) {
        boolean[] g = m46097g();
        g[29] = true;
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(str);
        g[30] = true;
        File file = new File(externalStoragePublicDirectory, "Screenshots");
        g[31] = true;
        String absolutePath = file.getAbsolutePath();
        g[32] = true;
        return absolutePath;
    }
}
