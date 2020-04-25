package com.google.zxing.p346y.p347c0.p348g.p349e;

import androidx.recyclerview.widget.C1744m.C1750f;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.p335u.C9043a;
import kotlin.p217i1.C14662d0;
import org.jcodec.codecs.mjpeg.JpegConst;

/* renamed from: com.google.zxing.y.c0.g.e.s */
/* compiled from: GeneralAppIdDecoder */
final class C9136s {

    /* renamed from: a */
    private final C9043a f23960a;

    /* renamed from: b */
    private final C9129m f23961b = new C9129m();

    /* renamed from: c */
    private final StringBuilder f23962c = new StringBuilder();

    C9136s(C9043a aVar) {
        this.f23960a = aVar;
    }

    /* renamed from: b */
    private C9132o m42701b() throws FormatException {
        boolean z;
        C9128l lVar;
        do {
            int a = this.f23961b.mo33168a();
            if (this.f23961b.mo33171b()) {
                lVar = m42698a();
                z = lVar.mo33167b();
            } else if (this.f23961b.mo33172c()) {
                lVar = m42702c();
                z = lVar.mo33167b();
            } else {
                lVar = m42704d();
                z = lVar.mo33167b();
            }
            if (!(a != this.f23961b.mo33168a()) && !z) {
                break;
            }
        } while (!z);
        return lVar.mo33166a();
    }

    /* renamed from: c */
    private C9133p m42703c(int i) throws FormatException {
        int i2 = i + 7;
        if (i2 > this.f23960a.mo32979d()) {
            int a = mo33189a(i, 4);
            if (a == 0) {
                return new C9133p(this.f23960a.mo32979d(), 10, 10);
            }
            return new C9133p(this.f23960a.mo32979d(), a - 1, 10);
        }
        int a2 = mo33189a(i, 7) - 8;
        return new C9133p(i2, a2 / 11, a2 % 11);
    }

    /* renamed from: d */
    private C9128l m42704d() throws FormatException {
        C9132o oVar;
        while (m42710i(this.f23961b.mo33168a())) {
            C9133p c = m42703c(this.f23961b.mo33168a());
            this.f23961b.mo33170b(c.mo33188a());
            if (c.mo33186f()) {
                if (c.mo33187g()) {
                    oVar = new C9132o(this.f23961b.mo33168a(), this.f23962c.toString());
                } else {
                    oVar = new C9132o(this.f23961b.mo33168a(), this.f23962c.toString(), c.mo33183c());
                }
                return new C9128l(oVar, true);
            }
            this.f23962c.append(c.mo33182b());
            if (c.mo33187g()) {
                return new C9128l(new C9132o(this.f23961b.mo33168a(), this.f23962c.toString()), true);
            }
            this.f23962c.append(c.mo33183c());
        }
        if (m42707f(this.f23961b.mo33168a())) {
            this.f23961b.mo33174e();
            this.f23961b.mo33169a(4);
        }
        return new C9128l(false);
    }

    /* renamed from: e */
    private boolean m42706e(int i) {
        if (i + 1 > this.f23960a.mo32979d()) {
            return false;
        }
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = i2 + i;
            if (i3 >= this.f23960a.mo32979d()) {
                break;
            }
            if (i2 == 2) {
                if (!this.f23960a.mo32974b(i + 2)) {
                    return false;
                }
            } else if (this.f23960a.mo32974b(i3)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    private boolean m42707f(int i) {
        if (i + 1 > this.f23960a.mo32979d()) {
            return false;
        }
        int i2 = 0;
        while (i2 < 4) {
            int i3 = i2 + i;
            if (i3 >= this.f23960a.mo32979d()) {
                break;
            } else if (this.f23960a.mo32974b(i3)) {
                return false;
            } else {
                i2++;
            }
        }
        return true;
    }

    /* renamed from: g */
    private boolean m42708g(int i) {
        if (i + 5 > this.f23960a.mo32979d()) {
            return false;
        }
        int a = mo33189a(i, 5);
        if (a >= 5 && a < 16) {
            return true;
        }
        if (i + 6 > this.f23960a.mo32979d()) {
            return false;
        }
        int a2 = mo33189a(i, 6);
        if (a2 < 16 || a2 >= 63) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    private boolean m42709h(int i) {
        if (i + 5 > this.f23960a.mo32979d()) {
            return false;
        }
        int a = mo33189a(i, 5);
        if (a >= 5 && a < 16) {
            return true;
        }
        if (i + 7 > this.f23960a.mo32979d()) {
            return false;
        }
        int a2 = mo33189a(i, 7);
        if (a2 >= 64 && a2 < 116) {
            return true;
        }
        if (i + 8 > this.f23960a.mo32979d()) {
            return false;
        }
        int a3 = mo33189a(i, 8);
        if (a3 < 232 || a3 >= 253) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    private boolean m42710i(int i) {
        if (i + 7 <= this.f23960a.mo32979d()) {
            int i2 = i;
            while (true) {
                int i3 = i + 3;
                if (i2 >= i3) {
                    return this.f23960a.mo32974b(i3);
                }
                if (this.f23960a.mo32974b(i2)) {
                    return true;
                }
                i2++;
            }
        } else if (i + 4 <= this.f23960a.mo32979d()) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo33191a(StringBuilder sb, int i) throws NotFoundException, FormatException {
        String str = null;
        while (true) {
            C9132o a = mo33190a(i, str);
            String a2 = C9135r.m42695a(a.mo33179b());
            if (a2 != null) {
                sb.append(a2);
            }
            String valueOf = a.mo33181d() ? String.valueOf(a.mo33180c()) : null;
            if (i == a.mo33188a()) {
                return sb.toString();
            }
            i = a.mo33188a();
            str = valueOf;
        }
    }

    /* renamed from: c */
    private C9128l m42702c() throws FormatException {
        while (m42709h(this.f23961b.mo33168a())) {
            C9131n b = m42700b(this.f23961b.mo33168a());
            this.f23961b.mo33170b(b.mo33188a());
            if (b.mo33178c()) {
                return new C9128l(new C9132o(this.f23961b.mo33168a(), this.f23962c.toString()), true);
            }
            this.f23962c.append(b.mo33177b());
        }
        if (m42705d(this.f23961b.mo33168a())) {
            this.f23961b.mo33169a(3);
            this.f23961b.mo33176g();
        } else if (m42706e(this.f23961b.mo33168a())) {
            if (this.f23961b.mo33168a() + 5 < this.f23960a.mo32979d()) {
                this.f23961b.mo33169a(5);
            } else {
                this.f23961b.mo33170b(this.f23960a.mo32979d());
            }
            this.f23961b.mo33174e();
        }
        return new C9128l(false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo33189a(int i, int i2) {
        return m42697a(this.f23960a, i, i2);
    }

    /* renamed from: a */
    static int m42697a(C9043a aVar, int i, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            if (aVar.mo32974b(i + i4)) {
                i3 |= 1 << ((i2 - i4) - 1);
            }
        }
        return i3;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C9132o mo33190a(int i, String str) throws FormatException {
        this.f23962c.setLength(0);
        if (str != null) {
            this.f23962c.append(str);
        }
        this.f23961b.mo33170b(i);
        C9132o b = m42701b();
        if (b == null || !b.mo33181d()) {
            return new C9132o(this.f23961b.mo33168a(), this.f23962c.toString());
        }
        return new C9132o(this.f23961b.mo33168a(), this.f23962c.toString(), b.mo33180c());
    }

    /* renamed from: b */
    private C9131n m42700b(int i) throws FormatException {
        char c;
        int a = mo33189a(i, 5);
        if (a == 15) {
            return new C9131n(i + 5, C14662d0.f42851b);
        }
        if (a >= 5 && a < 15) {
            return new C9131n(i + 5, (char) ((a + 48) - 5));
        }
        int a2 = mo33189a(i, 7);
        if (a2 >= 64 && a2 < 90) {
            return new C9131n(i + 7, (char) (a2 + 1));
        }
        if (a2 >= 90 && a2 < 116) {
            return new C9131n(i + 7, (char) (a2 + 7));
        }
        switch (mo33189a(i, 8)) {
            case JpegConst.APP8 /*232*/:
                c = '!';
                break;
            case JpegConst.APP9 /*233*/:
                c = C14662d0.f42850a;
                break;
            case JpegConst.APPA /*234*/:
                c = '%';
                break;
            case JpegConst.APPB /*235*/:
                c = C14662d0.f42852c;
                break;
            case JpegConst.APPC /*236*/:
                c = '\'';
                break;
            case JpegConst.APPD /*237*/:
                c = '(';
                break;
            case JpegConst.APPE /*238*/:
                c = ')';
                break;
            case JpegConst.APPF /*239*/:
                c = '*';
                break;
            case 240:
                c = '+';
                break;
            case 241:
                c = ',';
                break;
            case 242:
                c = '-';
                break;
            case 243:
                c = '.';
                break;
            case 244:
                c = '/';
                break;
            case 245:
                c = ':';
                break;
            case 246:
                c = ';';
                break;
            case 247:
                c = C14662d0.f42853d;
                break;
            case 248:
                c = '=';
                break;
            case 249:
                c = C14662d0.f42854e;
                break;
            case C1750f.f6813c /*250*/:
                c = '?';
                break;
            case 251:
                c = '_';
                break;
            case 252:
                c = ' ';
                break;
            default:
                throw FormatException.m41710a();
        }
        return new C9131n(i + 8, c);
    }

    /* renamed from: a */
    private C9128l m42698a() {
        while (m42708g(this.f23961b.mo33168a())) {
            C9131n a = m42699a(this.f23961b.mo33168a());
            this.f23961b.mo33170b(a.mo33188a());
            if (a.mo33178c()) {
                return new C9128l(new C9132o(this.f23961b.mo33168a(), this.f23962c.toString()), true);
            }
            this.f23962c.append(a.mo33177b());
        }
        if (m42705d(this.f23961b.mo33168a())) {
            this.f23961b.mo33169a(3);
            this.f23961b.mo33176g();
        } else if (m42706e(this.f23961b.mo33168a())) {
            if (this.f23961b.mo33168a() + 5 < this.f23960a.mo32979d()) {
                this.f23961b.mo33169a(5);
            } else {
                this.f23961b.mo33170b(this.f23960a.mo32979d());
            }
            this.f23961b.mo33175f();
        }
        return new C9128l(false);
    }

    /* renamed from: d */
    private boolean m42705d(int i) {
        int i2 = i + 3;
        if (i2 > this.f23960a.mo32979d()) {
            return false;
        }
        while (i < i2) {
            if (this.f23960a.mo32974b(i)) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* renamed from: a */
    private C9131n m42699a(int i) {
        char c;
        int a = mo33189a(i, 5);
        if (a == 15) {
            return new C9131n(i + 5, C14662d0.f42851b);
        }
        if (a >= 5 && a < 15) {
            return new C9131n(i + 5, (char) ((a + 48) - 5));
        }
        int a2 = mo33189a(i, 6);
        if (a2 >= 32 && a2 < 58) {
            return new C9131n(i + 6, (char) (a2 + 33));
        }
        switch (a2) {
            case 58:
                c = '*';
                break;
            case 59:
                c = ',';
                break;
            case 60:
                c = '-';
                break;
            case 61:
                c = '.';
                break;
            case 62:
                c = '/';
                break;
            default:
                StringBuilder sb = new StringBuilder("Decoding invalid alphanumeric value: ");
                sb.append(a2);
                throw new IllegalStateException(sb.toString());
        }
        return new C9131n(i + 6, c);
    }
}
