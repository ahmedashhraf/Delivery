package com.instabug.chat.model;

import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.chat.model.c */
/* compiled from: NotificationMessage */
public class C9425c {

    /* renamed from: d */
    private static transient /* synthetic */ boolean[] f24958d;

    /* renamed from: a */
    private String f24959a;

    /* renamed from: b */
    private String f24960b;

    /* renamed from: c */
    private String f24961c;

    public C9425c() {
        m44106d()[0] = true;
    }

    /* renamed from: d */
    private static /* synthetic */ boolean[] m44106d() {
        boolean[] zArr = f24958d;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(7473518351651874990L, "com/instabug/chat/model/NotificationMessage", 7);
        f24958d = a;
        return a;
    }

    /* renamed from: a */
    public String mo33966a() {
        boolean[] d = m44106d();
        String str = this.f24959a;
        d[1] = true;
        return str;
    }

    /* renamed from: b */
    public String mo33968b() {
        boolean[] d = m44106d();
        String str = this.f24960b;
        d[3] = true;
        return str;
    }

    /* renamed from: c */
    public String mo33970c() {
        boolean[] d = m44106d();
        String str = this.f24961c;
        d[5] = true;
        return str;
    }

    /* renamed from: a */
    public void mo33967a(String str) {
        boolean[] d = m44106d();
        this.f24959a = str;
        d[2] = true;
    }

    /* renamed from: b */
    public void mo33969b(String str) {
        boolean[] d = m44106d();
        this.f24960b = str;
        d[4] = true;
    }

    /* renamed from: c */
    public void mo33971c(String str) {
        boolean[] d = m44106d();
        this.f24961c = str;
        d[6] = true;
    }
}
