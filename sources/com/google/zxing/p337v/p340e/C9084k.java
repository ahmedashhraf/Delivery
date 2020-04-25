package com.google.zxing.p337v.p340e;

import com.google.zxing.C8975e;
import org.apache.http.C15470v;
import org.jcodec.codecs.mjpeg.JpegConst;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

/* renamed from: com.google.zxing.v.e.k */
/* compiled from: SymbolInfo */
public class C9084k {

    /* renamed from: i */
    static final C9084k[] f23791i;

    /* renamed from: j */
    private static C9084k[] f23792j;

    /* renamed from: a */
    private final boolean f23793a;

    /* renamed from: b */
    private final int f23794b;

    /* renamed from: c */
    private final int f23795c;

    /* renamed from: d */
    public final int f23796d;

    /* renamed from: e */
    public final int f23797e;

    /* renamed from: f */
    private final int f23798f;

    /* renamed from: g */
    private final int f23799g;

    /* renamed from: h */
    private final int f23800h;

    static {
        C9084k kVar = new C9084k(false, 3, 5, 8, 8, 1);
        C9084k kVar2 = new C9084k(false, 5, 7, 10, 10, 1);
        C9084k kVar3 = new C9084k(true, 5, 7, 16, 6, 1);
        C9084k kVar4 = new C9084k(false, 8, 10, 12, 12, 1);
        C9084k kVar5 = new C9084k(true, 10, 11, 14, 6, 2);
        C9084k kVar6 = new C9084k(false, 12, 12, 14, 14, 1);
        C9084k kVar7 = new C9084k(true, 16, 14, 24, 10, 1);
        C9084k kVar8 = new C9084k(false, 18, 14, 16, 16, 1);
        C9084k kVar9 = new C9084k(false, 22, 18, 18, 18, 1);
        C9084k kVar10 = new C9084k(true, 22, 18, 16, 10, 2);
        C9084k kVar11 = new C9084k(false, 30, 20, 20, 20, 1);
        C9084k kVar12 = new C9084k(true, 32, 24, 16, 14, 2);
        C9084k kVar13 = new C9084k(false, 36, 24, 22, 22, 1);
        C9084k kVar14 = new C9084k(false, 44, 28, 24, 24, 1);
        C9084k kVar15 = new C9084k(true, 49, 28, 22, 14, 2);
        C9084k kVar16 = new C9084k(false, 62, 36, 14, 14, 4);
        C9084k kVar17 = new C9084k(false, 86, 42, 16, 16, 4);
        C9084k kVar18 = new C9084k(false, 114, 48, 18, 18, 4);
        C9084k kVar19 = new C9084k(false, C13959t.f40902g2, 56, 20, 20, 4);
        C9084k kVar20 = new C9084k(false, C13959t.f40808K2, 68, 22, 22, 4);
        C9084k kVar21 = new C9084k(false, 204, 84, 24, 24, 4, 102, 42);
        C9084k kVar22 = new C9084k(false, 280, 112, 14, 14, 16, C13959t.f40882c2, 56);
        C9084k kVar23 = new C9084k(false, 368, C13959t.f40902g2, 16, 16, 16, 92, 36);
        C9084k kVar24 = new C9084k(false, 456, 192, 18, 18, 16, 114, 48);
        C9084k kVar25 = new C9084k(false, 576, JpegConst.APP0, 20, 20, 16, C13959t.f40902g2, 56);
        C9084k kVar26 = new C9084k(false, 696, 272, 22, 22, 16, C13959t.f40808K2, 68);
        C9084k kVar27 = new C9084k(false, 816, 336, 24, 24, 16, C13959t.f40863Y1, 56);
        C9084k kVar28 = new C9084k(false, 1050, C15470v.f44638A, 18, 18, 36, 175, 68);
        C9084k kVar29 = new C9084k(false, 1304, 496, 20, 20, 36, C13959t.f40981z2, 62);
        C9084k[] kVarArr = {kVar, kVar2, kVar3, kVar4, kVar5, kVar6, kVar7, kVar8, kVar9, kVar10, kVar11, kVar12, kVar13, kVar14, kVar15, kVar16, kVar17, kVar18, kVar19, kVar20, kVar21, kVar22, kVar23, kVar24, kVar25, kVar26, kVar27, kVar28, kVar29, new C9077d()};
        f23791i = kVarArr;
        f23792j = kVarArr;
    }

    public C9084k(boolean z, int i, int i2, int i3, int i4, int i5) {
        this(z, i, i2, i3, i4, i5, i, i2);
    }

    /* renamed from: a */
    public static void m42515a(C9084k[] kVarArr) {
        f23792j = kVarArr;
    }

    /* renamed from: c */
    public static C9084k m42516c(int i) {
        return m42513a(i, C9085l.FORCE_NONE, true);
    }

    /* renamed from: i */
    private int m42517i() {
        int i = this.f23798f;
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (!(i == 2 || i == 4)) {
                if (i == 16) {
                    return 4;
                }
                if (i == 36) {
                    return 6;
                }
                throw new IllegalStateException("Cannot handle this number of data regions");
            }
        }
        return i2;
    }

    /* renamed from: j */
    private int m42518j() {
        int i = this.f23798f;
        if (i == 1 || i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 36) {
            return 6;
        }
        throw new IllegalStateException("Cannot handle this number of data regions");
    }

    /* renamed from: b */
    public final int mo33095b() {
        return this.f23794b;
    }

    /* renamed from: d */
    public int mo33069d() {
        return this.f23794b / this.f23799g;
    }

    /* renamed from: e */
    public final int mo33098e() {
        return m42518j() * this.f23797e;
    }

    /* renamed from: f */
    public final int mo33099f() {
        return m42517i() * this.f23796d;
    }

    /* renamed from: g */
    public final int mo33100g() {
        return mo33098e() + (m42518j() << 1);
    }

    /* renamed from: h */
    public final int mo33101h() {
        return mo33099f() + (m42517i() << 1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f23793a ? "Rectangular Symbol:" : "Square Symbol:");
        sb.append(" data region ");
        sb.append(this.f23796d);
        sb.append('x');
        sb.append(this.f23797e);
        sb.append(", symbol size ");
        sb.append(mo33101h());
        sb.append('x');
        sb.append(mo33100g());
        sb.append(", symbol data size ");
        sb.append(mo33099f());
        sb.append('x');
        sb.append(mo33098e());
        sb.append(", codewords ");
        sb.append(this.f23794b);
        sb.append('+');
        sb.append(this.f23795c);
        return sb.toString();
    }

    C9084k(boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f23793a = z;
        this.f23794b = i;
        this.f23795c = i2;
        this.f23796d = i3;
        this.f23797e = i4;
        this.f23798f = i5;
        this.f23799g = i6;
        this.f23800h = i7;
    }

    /* renamed from: a */
    public static C9084k m42511a(int i, C9085l lVar) {
        return m42513a(i, lVar, true);
    }

    /* renamed from: b */
    public final int mo33096b(int i) {
        return this.f23800h;
    }

    /* renamed from: c */
    public final int mo33097c() {
        return this.f23795c;
    }

    /* renamed from: a */
    public static C9084k m42514a(int i, boolean z, boolean z2) {
        return m42513a(i, z ? C9085l.FORCE_NONE : C9085l.FORCE_SQUARE, z2);
    }

    /* renamed from: a */
    private static C9084k m42513a(int i, C9085l lVar, boolean z) {
        return m42512a(i, lVar, null, null, z);
    }

    /* renamed from: a */
    public static C9084k m42512a(int i, C9085l lVar, C8975e eVar, C8975e eVar2, boolean z) {
        C9084k[] kVarArr;
        for (C9084k kVar : f23792j) {
            if ((lVar != C9085l.FORCE_SQUARE || !kVar.f23793a) && ((lVar != C9085l.FORCE_RECTANGLE || kVar.f23793a) && ((eVar == null || (kVar.mo33101h() >= eVar.mo32799b() && kVar.mo33100g() >= eVar.mo32798a())) && ((eVar2 == null || (kVar.mo33101h() <= eVar2.mo32799b() && kVar.mo33100g() <= eVar2.mo32798a())) && i <= kVar.f23794b)))) {
                return kVar;
            }
        }
        if (!z) {
            return null;
        }
        StringBuilder sb = new StringBuilder("Can't find a symbol arrangement that matches the message. Data codewords: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public int mo33094a() {
        return this.f23794b + this.f23795c;
    }

    /* renamed from: a */
    public int mo33068a(int i) {
        return this.f23799g;
    }
}
