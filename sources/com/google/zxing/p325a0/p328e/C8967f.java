package com.google.zxing.p325a0.p328e;

import com.google.zxing.p325a0.p326c.C8945f;
import com.google.zxing.p325a0.p326c.C8947h;
import com.google.zxing.p325a0.p326c.C8949j;

/* renamed from: com.google.zxing.a0.e.f */
/* compiled from: QRCode */
public final class C8967f {

    /* renamed from: f */
    public static final int f23445f = 8;

    /* renamed from: a */
    private C8947h f23446a;

    /* renamed from: b */
    private C8945f f23447b;

    /* renamed from: c */
    private C8949j f23448c;

    /* renamed from: d */
    private int f23449d = -1;

    /* renamed from: e */
    private C8962b f23450e;

    /* renamed from: b */
    public static boolean m41886b(int i) {
        return i >= 0 && i < 8;
    }

    /* renamed from: a */
    public C8945f mo32747a() {
        return this.f23447b;
    }

    /* renamed from: b */
    public int mo32753b() {
        return this.f23449d;
    }

    /* renamed from: c */
    public C8962b mo32754c() {
        return this.f23450e;
    }

    /* renamed from: d */
    public C8947h mo32755d() {
        return this.f23446a;
    }

    /* renamed from: e */
    public C8949j mo32756e() {
        return this.f23448c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(200);
        sb.append("<<\n");
        sb.append(" mode: ");
        sb.append(this.f23446a);
        sb.append("\n ecLevel: ");
        sb.append(this.f23447b);
        sb.append("\n version: ");
        sb.append(this.f23448c);
        sb.append("\n maskPattern: ");
        sb.append(this.f23449d);
        if (this.f23450e == null) {
            sb.append("\n matrix: null\n");
        } else {
            sb.append("\n matrix:\n");
            sb.append(this.f23450e);
        }
        sb.append(">>\n");
        return sb.toString();
    }

    /* renamed from: a */
    public void mo32750a(C8947h hVar) {
        this.f23446a = hVar;
    }

    /* renamed from: a */
    public void mo32749a(C8945f fVar) {
        this.f23447b = fVar;
    }

    /* renamed from: a */
    public void mo32751a(C8949j jVar) {
        this.f23448c = jVar;
    }

    /* renamed from: a */
    public void mo32748a(int i) {
        this.f23449d = i;
    }

    /* renamed from: a */
    public void mo32752a(C8962b bVar) {
        this.f23450e = bVar;
    }
}
