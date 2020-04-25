package com.instabug.library.model;

import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.model.d */
/* compiled from: UserTrackingStep */
public class C9953d {

    /* renamed from: g */
    private static transient /* synthetic */ boolean[] f26458g;

    /* renamed from: a */
    private long f26459a;

    /* renamed from: b */
    private String f26460b;

    /* renamed from: c */
    private C9954a f26461c;

    /* renamed from: d */
    private String f26462d;

    /* renamed from: e */
    private String f26463e;

    /* renamed from: f */
    private String f26464f;

    /* renamed from: com.instabug.library.model.d$a */
    /* compiled from: UserTrackingStep */
    public enum C9954a {
        UNKNOWN,
        APPLICATION_CREATED,
        ACTIVITY_CREATED,
        ACTIVITY_STARTED,
        ACTIVITY_RESUMED,
        ACTIVITY_PAUSED,
        ACTIVITY_STOPPED,
        ACTIVITY_DESTROYED,
        OPEN_DIALOG,
        FRAGMENT_ATTACHED,
        FRAGMENT_VIEW_CREATED,
        FRAGMENT_STARTED,
        FRAGMENT_RESUMED,
        FRAGMENT_PAUSED,
        FRAGMENT_STOPPED,
        FRAGMENT_DETACHED,
        FRAGMENT_VISIBILITY_CHANGED,
        SHAKE,
        TAP,
        DOUBLE_TAP,
        LONG_PRESS,
        FLING,
        SCROLL,
        SWIPE,
        PINCH;

        static {
            boolean[] d;
            d[6] = true;
        }
    }

    public C9953d() {
        m46290g()[0] = true;
    }

    /* renamed from: g */
    private static /* synthetic */ boolean[] m46290g() {
        boolean[] zArr = f26458g;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-5161236261289744654L, "com/instabug/library/model/UserTrackingStep", 14);
        f26458g = a;
        return a;
    }

    /* renamed from: a */
    public long mo35495a() {
        boolean[] g = m46290g();
        long j = this.f26459a;
        g[1] = true;
        return j;
    }

    /* renamed from: b */
    public String mo35499b() {
        boolean[] g = m46290g();
        String str = this.f26460b;
        g[3] = true;
        return str;
    }

    /* renamed from: c */
    public C9954a mo35501c() {
        boolean[] g = m46290g();
        C9954a aVar = this.f26461c;
        g[5] = true;
        return aVar;
    }

    /* renamed from: d */
    public String mo35503d() {
        boolean[] g = m46290g();
        String str = this.f26462d;
        g[7] = true;
        return str;
    }

    /* renamed from: e */
    public String mo35505e() {
        boolean[] g = m46290g();
        String str = this.f26463e;
        g[9] = true;
        return str;
    }

    /* renamed from: f */
    public String mo35506f() {
        boolean[] g = m46290g();
        String str = this.f26464f;
        g[11] = true;
        return str;
    }

    /* renamed from: a */
    public C9953d mo35496a(long j) {
        boolean[] g = m46290g();
        this.f26459a = j;
        g[2] = true;
        return this;
    }

    /* renamed from: b */
    public void mo35500b(String str) {
        boolean[] g = m46290g();
        this.f26462d = str;
        g[8] = true;
    }

    /* renamed from: c */
    public void mo35502c(String str) {
        boolean[] g = m46290g();
        this.f26463e = str;
        g[10] = true;
    }

    /* renamed from: d */
    public void mo35504d(String str) {
        boolean[] g = m46290g();
        this.f26464f = str;
        g[12] = true;
    }

    /* renamed from: a */
    public C9953d mo35498a(String str) {
        boolean[] g = m46290g();
        this.f26460b = str;
        g[4] = true;
        return this;
    }

    /* renamed from: a */
    public C9953d mo35497a(C9954a aVar) {
        boolean[] g = m46290g();
        this.f26461c = aVar;
        g[6] = true;
        return this;
    }
}
