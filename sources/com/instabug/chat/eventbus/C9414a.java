package com.instabug.chat.eventbus;

import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.chat.eventbus.a */
/* compiled from: TriggeredChat */
public class C9414a {

    /* renamed from: c */
    private static transient /* synthetic */ boolean[] f24914c;

    /* renamed from: a */
    private String f24915a;

    /* renamed from: b */
    private String f24916b;

    public C9414a(String str, String str2) {
        boolean[] c = m44014c();
        this.f24915a = str;
        this.f24916b = str2;
        c[0] = true;
    }

    /* renamed from: c */
    private static /* synthetic */ boolean[] m44014c() {
        boolean[] zArr = f24914c;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-5626135348652872755L, "com/instabug/chat/eventbus/TriggeredChat", 3);
        f24914c = a;
        return a;
    }

    /* renamed from: a */
    public String mo33859a() {
        boolean[] c = m44014c();
        String str = this.f24915a;
        c[1] = true;
        return str;
    }

    /* renamed from: b */
    public String mo33860b() {
        boolean[] c = m44014c();
        String str = this.f24916b;
        c[2] = true;
        return str;
    }
}
