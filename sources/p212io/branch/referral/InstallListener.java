package p212io.branch.referral;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;

/* renamed from: io.branch.referral.InstallListener */
public class InstallListener extends BroadcastReceiver {

    /* renamed from: a */
    private static String f41457a = "bnc_no_value";

    /* renamed from: b */
    private static C6008b f41458b;

    /* renamed from: c */
    private static boolean f41459c;

    /* renamed from: d */
    private static boolean f41460d;

    /* renamed from: e */
    static boolean f41461e;

    /* renamed from: io.branch.referral.InstallListener$b */
    interface C6008b {
        /* renamed from: a */
        void mo24744a();
    }

    /* renamed from: io.branch.referral.InstallListener$a */
    static class C14101a implements Runnable {
        C14101a() {
        }

        public void run() {
            InstallListener.m60989e();
        }
    }

    /* renamed from: io.branch.referral.InstallListener$c */
    private static class C14102c {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public Object f41462a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public Context f41463b;

        /* renamed from: io.branch.referral.InstallListener$c$a */
        class C14103a implements InstallReferrerStateListener {
            C14103a() {
            }

            /* renamed from: a */
            public void mo44591a(int i) {
                long j;
                long j2;
                String str;
                if (i == 0) {
                    try {
                        if (C14102c.this.f41462a != null) {
                            ReferrerDetails installReferrer = ((InstallReferrerClient) C14102c.this.f41462a).getInstallReferrer();
                            if (installReferrer != null) {
                                String installReferrer2 = installReferrer.getInstallReferrer();
                                long referrerClickTimestampSeconds = installReferrer.getReferrerClickTimestampSeconds();
                                j = installReferrer.getInstallBeginTimestampSeconds();
                                j2 = referrerClickTimestampSeconds;
                                str = installReferrer2;
                            } else {
                                j = 0;
                                str = null;
                                j2 = 0;
                            }
                            InstallListener.m60985b(C14102c.this.f41463b, str, j2, j);
                        }
                    } catch (RemoteException e) {
                        C14204x.m61509d("BranchSDK", e.getMessage());
                        InstallListener.m60988d();
                    }
                } else if (i == 1) {
                    InstallListener.m60988d();
                } else if (i == 2) {
                    InstallListener.m60988d();
                }
            }

            /* renamed from: a */
            public void mo44590a() {
                InstallListener.m60988d();
            }
        }

        /* synthetic */ C14102c(Context context, C14101a aVar) {
            this(context);
        }

        private C14102c(Context context) {
            this.f41463b = context;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public boolean m60990a() {
            try {
                InstallReferrerClient build = InstallReferrerClient.newBuilder(this.f41463b).build();
                this.f41462a = build;
                build.startConnection(new C14103a());
                return true;
            } catch (Throwable th) {
                C14204x.m61509d("BranchSDK", th.getMessage());
                return false;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0052 A[Catch:{ UnsupportedEncodingException -> 0x00de, IllegalArgumentException -> 0x00dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0061 A[SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m60987c(android.content.Context r6, java.lang.String r7, long r8, long r10) {
        /*
            java.lang.String r0 = "="
            java.lang.String r1 = "UTF-8"
            io.branch.referral.x r6 = p212io.branch.referral.C14204x.m61505a(r6)
            r2 = 0
            int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0013
            java.lang.String r4 = "bnc_referrer_click_ts"
            r6.mo44948a(r4, r8)
        L_0x0013:
            int r8 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r8 <= 0) goto L_0x001c
            java.lang.String r8 = "bnc_install_begin_ts"
            r6.mo44948a(r8, r10)
        L_0x001c:
            if (r7 == 0) goto L_0x00e7
            java.lang.String r7 = java.net.URLDecoder.decode(r7, r1)     // Catch:{ UnsupportedEncodingException -> 0x00de, IllegalArgumentException -> 0x00dc }
            java.util.HashMap r8 = new java.util.HashMap     // Catch:{ UnsupportedEncodingException -> 0x00de, IllegalArgumentException -> 0x00dc }
            r8.<init>()     // Catch:{ UnsupportedEncodingException -> 0x00de, IllegalArgumentException -> 0x00dc }
            java.lang.String r9 = "&"
            java.lang.String[] r9 = r7.split(r9)     // Catch:{ UnsupportedEncodingException -> 0x00de, IllegalArgumentException -> 0x00dc }
            int r10 = r9.length     // Catch:{ UnsupportedEncodingException -> 0x00de, IllegalArgumentException -> 0x00dc }
            r11 = 0
            r2 = 0
        L_0x0030:
            if (r2 >= r10) goto L_0x0064
            r3 = r9[r2]     // Catch:{ UnsupportedEncodingException -> 0x00de, IllegalArgumentException -> 0x00dc }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ UnsupportedEncodingException -> 0x00de, IllegalArgumentException -> 0x00dc }
            if (r4 != 0) goto L_0x0061
            boolean r4 = r3.contains(r0)     // Catch:{ UnsupportedEncodingException -> 0x00de, IllegalArgumentException -> 0x00dc }
            java.lang.String r5 = "-"
            if (r4 != 0) goto L_0x0049
            boolean r4 = r3.contains(r5)     // Catch:{ UnsupportedEncodingException -> 0x00de, IllegalArgumentException -> 0x00dc }
            if (r4 == 0) goto L_0x0049
            goto L_0x004a
        L_0x0049:
            r5 = r0
        L_0x004a:
            java.lang.String[] r3 = r3.split(r5)     // Catch:{ UnsupportedEncodingException -> 0x00de, IllegalArgumentException -> 0x00dc }
            int r4 = r3.length     // Catch:{ UnsupportedEncodingException -> 0x00de, IllegalArgumentException -> 0x00dc }
            r5 = 1
            if (r4 <= r5) goto L_0x0061
            r4 = r3[r11]     // Catch:{ UnsupportedEncodingException -> 0x00de, IllegalArgumentException -> 0x00dc }
            java.lang.String r4 = java.net.URLDecoder.decode(r4, r1)     // Catch:{ UnsupportedEncodingException -> 0x00de, IllegalArgumentException -> 0x00dc }
            r3 = r3[r5]     // Catch:{ UnsupportedEncodingException -> 0x00de, IllegalArgumentException -> 0x00dc }
            java.lang.String r3 = java.net.URLDecoder.decode(r3, r1)     // Catch:{ UnsupportedEncodingException -> 0x00de, IllegalArgumentException -> 0x00dc }
            r8.put(r4, r3)     // Catch:{ UnsupportedEncodingException -> 0x00de, IllegalArgumentException -> 0x00dc }
        L_0x0061:
            int r2 = r2 + 1
            goto L_0x0030
        L_0x0064:
            io.branch.referral.s$a r9 = p212io.branch.referral.C14168s.C14169a.LinkClickID     // Catch:{ UnsupportedEncodingException -> 0x00de, IllegalArgumentException -> 0x00dc }
            java.lang.String r9 = r9.mo44764d()     // Catch:{ UnsupportedEncodingException -> 0x00de, IllegalArgumentException -> 0x00dc }
            boolean r9 = r8.containsKey(r9)     // Catch:{ UnsupportedEncodingException -> 0x00de, IllegalArgumentException -> 0x00dc }
            if (r9 == 0) goto L_0x0083
            io.branch.referral.s$a r9 = p212io.branch.referral.C14168s.C14169a.LinkClickID     // Catch:{ UnsupportedEncodingException -> 0x00de, IllegalArgumentException -> 0x00dc }
            java.lang.String r9 = r9.mo44764d()     // Catch:{ UnsupportedEncodingException -> 0x00de, IllegalArgumentException -> 0x00dc }
            java.lang.Object r9 = r8.get(r9)     // Catch:{ UnsupportedEncodingException -> 0x00de, IllegalArgumentException -> 0x00dc }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ UnsupportedEncodingException -> 0x00de, IllegalArgumentException -> 0x00dc }
            f41457a = r9     // Catch:{ UnsupportedEncodingException -> 0x00de, IllegalArgumentException -> 0x00dc }
            java.lang.String r9 = f41457a     // Catch:{ UnsupportedEncodingException -> 0x00de, IllegalArgumentException -> 0x00dc }
            r6.mo45006w(r9)     // Catch:{ UnsupportedEncodingException -> 0x00de, IllegalArgumentException -> 0x00dc }
        L_0x0083:
            io.branch.referral.s$a r9 = p212io.branch.referral.C14168s.C14169a.IsFullAppConv     // Catch:{ UnsupportedEncodingException -> 0x00de, IllegalArgumentException -> 0x00dc }
            java.lang.String r9 = r9.mo44764d()     // Catch:{ UnsupportedEncodingException -> 0x00de, IllegalArgumentException -> 0x00dc }
            boolean r9 = r8.containsKey(r9)     // Catch:{ UnsupportedEncodingException -> 0x00de, IllegalArgumentException -> 0x00dc }
            if (r9 == 0) goto L_0x00bd
            io.branch.referral.s$a r9 = p212io.branch.referral.C14168s.C14169a.ReferringLink     // Catch:{ UnsupportedEncodingException -> 0x00de, IllegalArgumentException -> 0x00dc }
            java.lang.String r9 = r9.mo44764d()     // Catch:{ UnsupportedEncodingException -> 0x00de, IllegalArgumentException -> 0x00dc }
            boolean r9 = r8.containsKey(r9)     // Catch:{ UnsupportedEncodingException -> 0x00de, IllegalArgumentException -> 0x00dc }
            if (r9 == 0) goto L_0x00bd
            io.branch.referral.s$a r9 = p212io.branch.referral.C14168s.C14169a.IsFullAppConv     // Catch:{ UnsupportedEncodingException -> 0x00de, IllegalArgumentException -> 0x00dc }
            java.lang.String r9 = r9.mo44764d()     // Catch:{ UnsupportedEncodingException -> 0x00de, IllegalArgumentException -> 0x00dc }
            java.lang.Object r9 = r8.get(r9)     // Catch:{ UnsupportedEncodingException -> 0x00de, IllegalArgumentException -> 0x00dc }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ UnsupportedEncodingException -> 0x00de, IllegalArgumentException -> 0x00dc }
            boolean r9 = java.lang.Boolean.parseBoolean(r9)     // Catch:{ UnsupportedEncodingException -> 0x00de, IllegalArgumentException -> 0x00dc }
            r6.mo44957b(r9)     // Catch:{ UnsupportedEncodingException -> 0x00de, IllegalArgumentException -> 0x00dc }
            io.branch.referral.s$a r9 = p212io.branch.referral.C14168s.C14169a.ReferringLink     // Catch:{ UnsupportedEncodingException -> 0x00de, IllegalArgumentException -> 0x00dc }
            java.lang.String r9 = r9.mo44764d()     // Catch:{ UnsupportedEncodingException -> 0x00de, IllegalArgumentException -> 0x00dc }
            java.lang.Object r9 = r8.get(r9)     // Catch:{ UnsupportedEncodingException -> 0x00de, IllegalArgumentException -> 0x00dc }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ UnsupportedEncodingException -> 0x00de, IllegalArgumentException -> 0x00dc }
            r6.mo44980j(r9)     // Catch:{ UnsupportedEncodingException -> 0x00de, IllegalArgumentException -> 0x00dc }
        L_0x00bd:
            io.branch.referral.s$a r9 = p212io.branch.referral.C14168s.C14169a.GoogleSearchInstallReferrer     // Catch:{ UnsupportedEncodingException -> 0x00de, IllegalArgumentException -> 0x00dc }
            java.lang.String r9 = r9.mo44764d()     // Catch:{ UnsupportedEncodingException -> 0x00de, IllegalArgumentException -> 0x00dc }
            boolean r9 = r8.containsKey(r9)     // Catch:{ UnsupportedEncodingException -> 0x00de, IllegalArgumentException -> 0x00dc }
            if (r9 == 0) goto L_0x00e7
            io.branch.referral.s$a r9 = p212io.branch.referral.C14168s.C14169a.GoogleSearchInstallReferrer     // Catch:{ UnsupportedEncodingException -> 0x00de, IllegalArgumentException -> 0x00dc }
            java.lang.String r9 = r9.mo44764d()     // Catch:{ UnsupportedEncodingException -> 0x00de, IllegalArgumentException -> 0x00dc }
            java.lang.Object r8 = r8.get(r9)     // Catch:{ UnsupportedEncodingException -> 0x00de, IllegalArgumentException -> 0x00dc }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ UnsupportedEncodingException -> 0x00de, IllegalArgumentException -> 0x00dc }
            r6.mo44994q(r8)     // Catch:{ UnsupportedEncodingException -> 0x00de, IllegalArgumentException -> 0x00dc }
            r6.mo44992p(r7)     // Catch:{ UnsupportedEncodingException -> 0x00de, IllegalArgumentException -> 0x00dc }
            goto L_0x00e7
        L_0x00dc:
            r6 = move-exception
            goto L_0x00e0
        L_0x00de:
            r6 = move-exception
            goto L_0x00e4
        L_0x00e0:
            r6.printStackTrace()
            goto L_0x00e7
        L_0x00e4:
            r6.printStackTrace()
        L_0x00e7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p212io.branch.referral.InstallListener.m60987c(android.content.Context, java.lang.String, long, long):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static void m60988d() {
        f41460d = false;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static void m60989e() {
        f41461e = true;
        C6008b bVar = f41458b;
        if (bVar != null) {
            bVar.mo24744a();
            f41458b = null;
            f41461e = false;
            f41459c = false;
            f41460d = false;
        }
    }

    public void onReceive(Context context, Intent intent) {
        m60987c(context, intent.getStringExtra("referrer"), 0, 0);
        if (f41459c && !f41460d) {
            m60989e();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m60985b(Context context, String str, long j, long j2) {
        m60987c(context, str, j, j2);
        if (f41459c) {
            m60989e();
        }
    }

    /* renamed from: a */
    public static void m60982a(Context context, long j, C6008b bVar) {
        f41458b = bVar;
        if (f41461e) {
            m60989e();
            return;
        }
        f41459c = true;
        f41460d = new C14102c(context, null).m60990a();
        new Handler().postDelayed(new C14101a(), j);
    }

    /* renamed from: c */
    public static String m60986c() {
        return f41457a;
    }
}
