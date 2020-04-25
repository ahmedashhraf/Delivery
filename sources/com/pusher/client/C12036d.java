package com.pusher.client;

import java.net.Proxy;

/* renamed from: com.pusher.client.d */
/* compiled from: PusherOptions */
public class C12036d {

    /* renamed from: i */
    private static final String f34674i = "@version@";

    /* renamed from: j */
    private static final String f34675j = "0.0.0-dev";

    /* renamed from: k */
    public static final String f34676k = m54297f();

    /* renamed from: l */
    private static final String f34677l;

    /* renamed from: m */
    private static final String f34678m = "ws";

    /* renamed from: n */
    private static final String f34679n = "wss";

    /* renamed from: o */
    private static final int f34680o = 80;

    /* renamed from: p */
    private static final int f34681p = 443;

    /* renamed from: q */
    private static final String f34682q = "pusher.com";

    /* renamed from: r */
    private static final long f34683r = 120000;

    /* renamed from: s */
    private static final long f34684s = 30000;

    /* renamed from: a */
    private String f34685a = "ws.pusherapp.com";

    /* renamed from: b */
    private int f34686b = 80;

    /* renamed from: c */
    private int f34687c = 443;

    /* renamed from: d */
    private boolean f34688d = true;

    /* renamed from: e */
    private long f34689e = f34683r;

    /* renamed from: f */
    private long f34690f = 30000;

    /* renamed from: g */
    private C11993a f34691g;

    /* renamed from: h */
    private Proxy f34692h = Proxy.NO_PROXY;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append("?client=java-client&protocol=5&version=");
        sb.append(f34676k);
        f34677l = sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r0 != null) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r0.close();
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m54297f() {
        /*
            r0 = 0
            java.util.Properties r1 = new java.util.Properties     // Catch:{ Exception -> 0x003e, all -> 0x0037 }
            r1.<init>()     // Catch:{ Exception -> 0x003e, all -> 0x0037 }
            java.lang.Class<com.pusher.client.d> r2 = com.pusher.client.C12036d.class
            java.lang.String r3 = "/pusher.properties"
            java.io.InputStream r0 = r2.getResourceAsStream(r3)     // Catch:{ Exception -> 0x003e, all -> 0x0037 }
            r1.load(r0)     // Catch:{ Exception -> 0x003e, all -> 0x0037 }
            java.lang.String r2 = "version"
            java.lang.Object r1 = r1.get(r2)     // Catch:{ Exception -> 0x003e, all -> 0x0037 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x003e, all -> 0x0037 }
            java.lang.String r2 = "@version@"
            boolean r2 = r1.equals(r2)     // Catch:{ Exception -> 0x003e, all -> 0x0037 }
            if (r2 == 0) goto L_0x0023
            java.lang.String r1 = "0.0.0-dev"
        L_0x0023:
            if (r1 == 0) goto L_0x0031
            int r2 = r1.length()     // Catch:{ Exception -> 0x003e, all -> 0x0037 }
            if (r2 <= 0) goto L_0x0031
            if (r0 == 0) goto L_0x0030
            r0.close()     // Catch:{ IOException -> 0x0030 }
        L_0x0030:
            return r1
        L_0x0031:
            if (r0 == 0) goto L_0x0041
        L_0x0033:
            r0.close()     // Catch:{ IOException -> 0x0041 }
            goto L_0x0041
        L_0x0037:
            r1 = move-exception
            if (r0 == 0) goto L_0x003d
            r0.close()     // Catch:{ IOException -> 0x003d }
        L_0x003d:
            throw r1
        L_0x003e:
            if (r0 == 0) goto L_0x0041
            goto L_0x0033
        L_0x0041:
            java.lang.String r0 = "0.0.0"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pusher.client.C12036d.m54297f():java.lang.String");
    }

    /* renamed from: a */
    public C12036d mo41167a(boolean z) {
        this.f34688d = z;
        return this;
    }

    /* renamed from: b */
    public C11993a mo41169b() {
        return this.f34691g;
    }

    /* renamed from: c */
    public C12036d mo41174c(String str) {
        this.f34685a = str;
        return this;
    }

    /* renamed from: d */
    public Proxy mo41175d() {
        return this.f34692h;
    }

    /* renamed from: e */
    public boolean mo41176e() {
        return this.f34688d;
    }

    /* renamed from: a */
    public C12036d mo41165a(C11993a aVar) {
        this.f34691g = aVar;
        return this;
    }

    /* renamed from: b */
    public C12036d mo41170b(int i) {
        this.f34687c = i;
        return this;
    }

    /* renamed from: c */
    public long mo41173c() {
        return this.f34690f;
    }

    /* renamed from: a */
    public C12036d mo41163a(int i) {
        this.f34686b = i;
        return this;
    }

    /* renamed from: b */
    public C12036d mo41172b(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("ws-");
        sb.append(str);
        sb.append(".");
        sb.append(f34682q);
        this.f34685a = sb.toString();
        this.f34686b = 80;
        this.f34687c = 443;
        return this;
    }

    /* renamed from: a */
    public C12036d mo41164a(long j) {
        if (j >= 1000) {
            this.f34689e = j;
            return this;
        }
        throw new IllegalArgumentException("Activity timeout must be at least 1,000ms (and is recommended to be much higher)");
    }

    /* renamed from: a */
    public long mo41162a() {
        return this.f34689e;
    }

    /* renamed from: b */
    public C12036d mo41171b(long j) {
        if (j >= 1000) {
            this.f34690f = j;
            return this;
        }
        throw new IllegalArgumentException("Pong timeout must be at least 1,000ms (and is recommended to be much higher)");
    }

    /* renamed from: a */
    public String mo41168a(String str) {
        Object[] objArr = new Object[5];
        objArr[0] = this.f34688d ? f34679n : f34678m;
        objArr[1] = this.f34685a;
        objArr[2] = Integer.valueOf(this.f34688d ? this.f34687c : this.f34686b);
        objArr[3] = str;
        objArr[4] = f34677l;
        return String.format("%s://%s:%s/app/%s%s", objArr);
    }

    /* renamed from: a */
    public C12036d mo41166a(Proxy proxy) {
        if (proxy != null) {
            this.f34692h = proxy;
            return this;
        }
        throw new IllegalArgumentException("proxy must not be null (instead use Proxy.NO_PROXY)");
    }
}
