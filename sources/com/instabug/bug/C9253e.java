package com.instabug.bug;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.instabug.bug.model.C9278b;
import com.instabug.bug.network.InstabugBugsUploaderService;
import com.instabug.bug.settings.C9291a;
import com.instabug.library.OnSdkDismissCallback;
import com.instabug.library.OnSdkDismissCallback.DismissType;
import com.instabug.library.OnSdkDismissCallback.ReportType;
import com.instabug.library.tracking.InstabugInternalTrackingDelegate;
import com.instabug.library.util.InstabugSDKLogger;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.bug.e */
/* compiled from: CoreEventsHandler */
public class C9253e {

    /* renamed from: a */
    private static transient /* synthetic */ boolean[] f24468a;

    public C9253e() {
        m43247g()[0] = true;
    }

    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m43240a(android.content.Context r6, com.instabug.library.core.eventbus.coreeventbus.SDKCoreEvent r7) {
        /*
            boolean[] r0 = m43247g()
            java.lang.Class<com.instabug.bug.e> r1 = com.instabug.bug.C9253e.class
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "receive new core event: "
            r2.append(r3)
            r3 = 1
            r0[r3] = r3
            java.lang.String r4 = r7.toString()
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r4 = 2
            r0[r4] = r3
            com.instabug.library.util.InstabugSDKLogger.m46626v(r1, r2)
            r1 = 3
            r0[r1] = r3
            java.lang.String r2 = r7.getType()
            int r5 = r2.hashCode()
            switch(r5) {
                case 3599307: goto L_0x006c;
                case 1738700944: goto L_0x005b;
                case 1843485230: goto L_0x0048;
                case 1984987798: goto L_0x0036;
                default: goto L_0x0032;
            }
        L_0x0032:
            r2 = 4
            r0[r2] = r3
            goto L_0x007f
        L_0x0036:
            java.lang.String r5 = "session"
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L_0x0042
            r2 = 7
            r0[r2] = r3
            goto L_0x007f
        L_0x0042:
            r2 = 8
            r0[r2] = r3
            r2 = 1
            goto L_0x0080
        L_0x0048:
            java.lang.String r5 = "network"
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L_0x0055
            r2 = 11
            r0[r2] = r3
            goto L_0x007f
        L_0x0055:
            r2 = 12
            r0[r2] = r3
            r2 = 3
            goto L_0x0080
        L_0x005b:
            java.lang.String r5 = "invocation"
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L_0x0067
            r2 = 5
            r0[r2] = r3
            goto L_0x007f
        L_0x0067:
            r2 = 0
            r5 = 6
            r0[r5] = r3
            goto L_0x0080
        L_0x006c:
            java.lang.String r5 = "user"
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L_0x0079
            r2 = 9
            r0[r2] = r3
            goto L_0x007f
        L_0x0079:
            r2 = 10
            r0[r2] = r3
            r2 = 2
            goto L_0x0080
        L_0x007f:
            r2 = -1
        L_0x0080:
            if (r2 == 0) goto L_0x00ee
            if (r2 == r3) goto L_0x00ca
            if (r2 == r4) goto L_0x00ad
            if (r2 == r1) goto L_0x008e
            r6 = 13
            r0[r6] = r3
            goto L_0x0126
        L_0x008e:
            java.lang.String r7 = r7.getValue()
            java.lang.String r1 = "activated"
            boolean r7 = r7.equals(r1)
            if (r7 != 0) goto L_0x00a0
            r6 = 27
            r0[r6] = r3
            goto L_0x0126
        L_0x00a0:
            r7 = 28
            r0[r7] = r3
            m43239a(r6)
            r6 = 29
            r0[r6] = r3
            goto L_0x0126
        L_0x00ad:
            java.lang.String r6 = r7.getValue()
            java.lang.String r7 = "logged_out"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x00be
            r6 = 24
            r0[r6] = r3
            goto L_0x0126
        L_0x00be:
            r6 = 25
            r0[r6] = r3
            m43244d()
            r6 = 26
            r0[r6] = r3
            goto L_0x0126
        L_0x00ca:
            java.lang.String r7 = r7.getValue()
            java.lang.String r1 = "started"
            boolean r7 = r7.equals(r1)
            if (r7 != 0) goto L_0x00db
            r6 = 20
            r0[r6] = r3
            goto L_0x0126
        L_0x00db:
            r7 = 21
            r0[r7] = r3
            m43242b(r6)
            r7 = 22
            r0[r7] = r3
            com.instabug.bug.view.actionList.service.ReportCategoriesService.m43584a(r6)
            r6 = 23
            r0[r6] = r3
            goto L_0x0126
        L_0x00ee:
            java.lang.String r6 = r7.getValue()
            java.lang.String r1 = "invoked"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x00ff
            r6 = 14
            r0[r6] = r3
            goto L_0x010a
        L_0x00ff:
            r6 = 15
            r0[r6] = r3
            m43241b()
            r6 = 16
            r0[r6] = r3
        L_0x010a:
            java.lang.String r6 = r7.getValue()
            java.lang.String r7 = "dismissed"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x011b
            r6 = 17
            r0[r6] = r3
            goto L_0x0126
        L_0x011b:
            r6 = 18
            r0[r6] = r3
            m43238a()
            r6 = 19
            r0[r6] = r3
        L_0x0126:
            r6 = 30
            r0[r6] = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.bug.C9253e.m43240a(android.content.Context, com.instabug.library.core.eventbus.coreeventbus.SDKCoreEvent):void");
    }

    /* renamed from: b */
    private static void m43242b(Context context) {
        boolean[] g = m43247g();
        if (context == null) {
            g[32] = true;
        } else {
            g[33] = true;
            InstabugBugsUploaderService.m43419a(context, new Intent(context, InstabugBugsUploaderService.class));
            g[34] = true;
        }
        g[35] = true;
    }

    /* renamed from: c */
    private static void m43243c() {
        boolean[] g = m43247g();
        C9254f.m43255h().mo33432b();
        g[46] = true;
    }

    /* renamed from: d */
    private static void m43244d() {
        boolean[] g = m43247g();
        m43245e();
        g[47] = true;
    }

    /* renamed from: e */
    private static void m43245e() {
        boolean[] g = m43247g();
        C9291a.m43476r().mo33593a(0);
        g[48] = true;
    }

    /* renamed from: f */
    private static void m43246f() {
        boolean[] g = m43247g();
        if (C9291a.m43476r().mo33615h() != null) {
            g[49] = true;
            if (C9254f.m43255h().mo33434c() == null) {
                g[50] = true;
            } else {
                g[51] = true;
                OnSdkDismissCallback h = C9291a.m43476r().mo33615h();
                g[52] = true;
                DismissType a = C9238a.m43165a(C9254f.m43255h().mo33436d());
                g[53] = true;
                ReportType a2 = C9238a.m43166a(C9254f.m43255h().mo33434c().mo33514e());
                g[54] = true;
                h.call(a, a2);
                g[55] = true;
            }
            g[56] = true;
            return;
        }
        if (C9291a.m43476r().mo33613f() == null) {
            g[57] = true;
        } else {
            g[58] = true;
            OnSdkDismissedCallback f = C9291a.m43476r().mo33613f();
            g[59] = true;
            OnSdkDismissedCallback.DismissType d = C9254f.m43255h().mo33436d();
            g[60] = true;
            C9278b e = C9254f.m43255h().mo33434c().mo33514e();
            g[61] = true;
            f.onSdkDismissed(d, e);
            g[62] = true;
        }
        g[63] = true;
    }

    /* renamed from: g */
    private static /* synthetic */ boolean[] m43247g() {
        boolean[] zArr = f24468a;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(1676078709570285123L, "com/instabug/bug/CoreEventsHandler", 64);
        f24468a = a;
        return a;
    }

    /* renamed from: b */
    private static void m43241b() {
        m43247g()[36] = true;
    }

    /* renamed from: a */
    private static void m43239a(Context context) {
        boolean[] g = m43247g();
        m43242b(context);
        g[31] = true;
    }

    /* renamed from: a */
    public static void m43238a() {
        boolean[] g = m43247g();
        InstabugSDKLogger.m46622d(C9253e.class, "SDK dismissed Handle sdk dismissing");
        g[37] = true;
        m43246f();
        g[38] = true;
        m43243c();
        g[39] = true;
        InstabugInternalTrackingDelegate instance = InstabugInternalTrackingDelegate.getInstance();
        g[40] = true;
        Activity targetActivity = instance.getTargetActivity();
        if (targetActivity == null) {
            g[41] = true;
        } else {
            g[42] = true;
            Intent d = C9249c.m43232d(InstabugInternalTrackingDelegate.getInstance().getCurrentActivity());
            g[43] = true;
            targetActivity.startActivity(d);
            g[44] = true;
        }
        g[45] = true;
    }
}
