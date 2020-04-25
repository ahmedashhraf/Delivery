package com.instabug.chat;

import android.content.Context;
import android.content.Intent;
import com.instabug.chat.cache.C9409a;
import com.instabug.chat.network.InstabugMessageUploaderService;
import com.instabug.chat.settings.C9441a;
import com.instabug.chat.synchronization.SynchronizationManager;
import com.instabug.library.Feature;
import com.instabug.library.Feature.State;
import com.instabug.library.core.InstabugCore;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.chat.c */
/* compiled from: CoreEventsHandler */
class C9404c {

    /* renamed from: a */
    private static transient /* synthetic */ boolean[] f24899a;

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006a, code lost:
        r3 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006b, code lost:
        if (r3 == 0) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006d, code lost:
        if (r3 == 1) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006f, code lost:
        if (r3 == 2) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0071, code lost:
        if (r3 == 3) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0073, code lost:
        r0[12] = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0083, code lost:
        if (r8.getValue().equals("activated") != false) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0085, code lost:
        r0[31] = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008b, code lost:
        r0[32] = true;
        m43988c(r7);
        r0[33] = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a2, code lost:
        if (r8.getValue().equals(com.instabug.library.core.eventbus.coreeventbus.SDKCoreEvent.User.VALUE_LOGGED_IN) != false) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a4, code lost:
        r0[25] = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a9, code lost:
        r0[26] = true;
        m43982a();
        r0[27] = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00be, code lost:
        if (r8.getValue().equals(com.instabug.library.core.eventbus.coreeventbus.SDKCoreEvent.User.VALUE_LOGGED_OUT) != false) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c0, code lost:
        r0[28] = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c6, code lost:
        r0[29] = true;
        m43985b();
        r0[30] = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00dd, code lost:
        if (r8.getValue().equals(com.instabug.library.core.eventbus.coreeventbus.SDKCoreEvent.Session.VALUE_STARTED) != false) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00df, code lost:
        r0[19] = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e4, code lost:
        r0[20] = true;
        m43983a(r7);
        r0[21] = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f9, code lost:
        if (r8.getValue().equals(com.instabug.library.core.eventbus.coreeventbus.SDKCoreEvent.Session.VALUE_FINISHED) != false) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00fb, code lost:
        r0[22] = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0100, code lost:
        r0[23] = true;
        m43986b(r7);
        r0[24] = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0116, code lost:
        if (r8.getValue().equals(com.instabug.library.core.eventbus.coreeventbus.SDKCoreEvent.Invocation.VALUE_INVOKED) != false) goto L_0x011d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0118, code lost:
        r0[13] = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x011d, code lost:
        r0[14] = true;
        m43987c();
        r0[15] = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0132, code lost:
        if (r8.getValue().equals(com.instabug.library.core.eventbus.coreeventbus.SDKCoreEvent.Invocation.VALUE_DISMISSED) != false) goto L_0x0139;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0134, code lost:
        r0[16] = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0139, code lost:
        r0[17] = true;
        m43989d();
        r0[18] = true;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m43984a(android.content.Context r7, com.instabug.library.core.eventbus.coreeventbus.SDKCoreEvent r8) {
        /*
            boolean[] r0 = m43993g()
            boolean r1 = m43992f()
            r2 = 1
            if (r1 != 0) goto L_0x000f
            r0[r2] = r2
            goto L_0x0144
        L_0x000f:
            r1 = 2
            r0[r1] = r2
            java.lang.String r3 = r8.getType()
            r4 = -1
            int r5 = r3.hashCode()
            r6 = 3
            switch(r5) {
                case 3599307: goto L_0x0057;
                case 1738700944: goto L_0x0046;
                case 1843485230: goto L_0x0033;
                case 1984987798: goto L_0x0022;
                default: goto L_0x001f;
            }
        L_0x001f:
            r0[r6] = r2
            goto L_0x006a
        L_0x0022:
            java.lang.String r5 = "session"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x002e
            r3 = 6
            r0[r3] = r2
            goto L_0x006a
        L_0x002e:
            r3 = 7
            r0[r3] = r2
            r3 = 1
            goto L_0x006b
        L_0x0033:
            java.lang.String r5 = "network"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0040
            r3 = 10
            r0[r3] = r2
            goto L_0x006a
        L_0x0040:
            r3 = 11
            r0[r3] = r2
            r3 = 3
            goto L_0x006b
        L_0x0046:
            java.lang.String r5 = "invocation"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0052
            r3 = 4
            r0[r3] = r2
            goto L_0x006a
        L_0x0052:
            r3 = 0
            r4 = 5
            r0[r4] = r2
            goto L_0x006b
        L_0x0057:
            java.lang.String r5 = "user"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0064
            r3 = 8
            r0[r3] = r2
            goto L_0x006a
        L_0x0064:
            r3 = 9
            r0[r3] = r2
            r3 = 2
            goto L_0x006b
        L_0x006a:
            r3 = -1
        L_0x006b:
            if (r3 == 0) goto L_0x010c
            if (r3 == r2) goto L_0x00d3
            if (r3 == r1) goto L_0x0098
            if (r3 == r6) goto L_0x0079
            r7 = 12
            r0[r7] = r2
            goto L_0x0144
        L_0x0079:
            java.lang.String r8 = r8.getValue()
            java.lang.String r1 = "activated"
            boolean r8 = r8.equals(r1)
            if (r8 != 0) goto L_0x008b
            r7 = 31
            r0[r7] = r2
            goto L_0x0144
        L_0x008b:
            r8 = 32
            r0[r8] = r2
            m43988c(r7)
            r7 = 33
            r0[r7] = r2
            goto L_0x0144
        L_0x0098:
            java.lang.String r7 = r8.getValue()
            java.lang.String r1 = "logged_in"
            boolean r7 = r7.equals(r1)
            if (r7 != 0) goto L_0x00a9
            r7 = 25
            r0[r7] = r2
            goto L_0x00b4
        L_0x00a9:
            r7 = 26
            r0[r7] = r2
            m43982a()
            r7 = 27
            r0[r7] = r2
        L_0x00b4:
            java.lang.String r7 = r8.getValue()
            java.lang.String r8 = "logged_out"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x00c6
            r7 = 28
            r0[r7] = r2
            goto L_0x0144
        L_0x00c6:
            r7 = 29
            r0[r7] = r2
            m43985b()
            r7 = 30
            r0[r7] = r2
            goto L_0x0144
        L_0x00d3:
            java.lang.String r1 = r8.getValue()
            java.lang.String r3 = "started"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x00e4
            r1 = 19
            r0[r1] = r2
            goto L_0x00ef
        L_0x00e4:
            r1 = 20
            r0[r1] = r2
            m43983a(r7)
            r1 = 21
            r0[r1] = r2
        L_0x00ef:
            java.lang.String r8 = r8.getValue()
            java.lang.String r1 = "finished"
            boolean r8 = r8.equals(r1)
            if (r8 != 0) goto L_0x0100
            r7 = 22
            r0[r7] = r2
            goto L_0x0144
        L_0x0100:
            r8 = 23
            r0[r8] = r2
            m43986b(r7)
            r7 = 24
            r0[r7] = r2
            goto L_0x0144
        L_0x010c:
            java.lang.String r7 = r8.getValue()
            java.lang.String r1 = "invoked"
            boolean r7 = r7.equals(r1)
            if (r7 != 0) goto L_0x011d
            r7 = 13
            r0[r7] = r2
            goto L_0x0128
        L_0x011d:
            r7 = 14
            r0[r7] = r2
            m43987c()
            r7 = 15
            r0[r7] = r2
        L_0x0128:
            java.lang.String r7 = r8.getValue()
            java.lang.String r8 = "dismissed"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x0139
            r7 = 16
            r0[r7] = r2
            goto L_0x0144
        L_0x0139:
            r7 = 17
            r0[r7] = r2
            m43989d()
            r7 = 18
            r0[r7] = r2
        L_0x0144:
            r7 = 34
            r0[r7] = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.chat.C9404c.m43984a(android.content.Context, com.instabug.library.core.eventbus.coreeventbus.SDKCoreEvent):void");
    }

    /* renamed from: b */
    private static void m43986b(Context context) {
        boolean[] g = m43993g();
        C9409a.m44004b();
        g[38] = true;
        m43990d(context);
        g[39] = true;
        SynchronizationManager.getInstance().stop();
        g[40] = true;
    }

    /* renamed from: c */
    private static void m43988c(Context context) {
        boolean[] g = m43993g();
        C9409a.m44004b();
        g[43] = true;
        m43990d(context);
        g[44] = true;
        SynchronizationManager.getInstance().sync();
        g[45] = true;
    }

    /* renamed from: d */
    private static void m43989d() {
        m43993g()[47] = true;
    }

    /* renamed from: e */
    private static void m43991e() {
        boolean[] g = m43993g();
        C9441a.m44183a(0);
        g[50] = true;
    }

    /* renamed from: f */
    private static boolean m43992f() {
        boolean z;
        boolean[] g = m43993g();
        if (InstabugCore.getFeatureState(Feature.IN_APP_MESSAGING) == State.ENABLED) {
            g[51] = true;
            z = true;
        } else {
            z = false;
            g[52] = true;
        }
        g[53] = true;
        return z;
    }

    /* renamed from: g */
    private static /* synthetic */ boolean[] m43993g() {
        boolean[] zArr = f24899a;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(8901517290022771146L, "com/instabug/chat/CoreEventsHandler", 54);
        f24899a = a;
        return a;
    }

    /* renamed from: d */
    private static void m43990d(Context context) {
        boolean[] g = m43993g();
        Intent intent = new Intent(context, InstabugMessageUploaderService.class);
        g[48] = true;
        InstabugMessageUploaderService.m44120a(context, intent);
        g[49] = true;
    }

    /* renamed from: b */
    private static void m43985b() {
        boolean[] g = m43993g();
        m43991e();
        g[42] = true;
    }

    /* renamed from: c */
    private static void m43987c() {
        m43993g()[46] = true;
    }

    /* renamed from: a */
    private static void m43983a(Context context) {
        boolean[] g = m43993g();
        C9409a.m44003a(context);
        g[35] = true;
        m43990d(context);
        g[36] = true;
        SynchronizationManager.getInstance().sync();
        g[37] = true;
    }

    /* renamed from: a */
    private static void m43982a() {
        boolean[] g = m43993g();
        SynchronizationManager.getInstance().sync();
        g[41] = true;
    }
}
