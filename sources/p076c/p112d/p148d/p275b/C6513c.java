package p076c.p112d.p148d.p275b;

import com.google.common.base.C7397x;
import java.util.Map;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b
@C2775a
/* renamed from: c.d.d.b.c */
/* compiled from: ArrayBasedUnicodeEscaper */
public abstract class C6513c extends C6526i {

    /* renamed from: c */
    private final char[][] f18218c;

    /* renamed from: d */
    private final int f18219d;

    /* renamed from: e */
    private final int f18220e;

    /* renamed from: f */
    private final int f18221f;

    /* renamed from: g */
    private final char f18222g;

    /* renamed from: h */
    private final char f18223h;

    protected C6513c(Map<Character, String> map, int i, int i2, @C5952h String str) {
        this(C6512b.m30979a(map), i, i2, str);
    }

    /* renamed from: a */
    public final String mo26396a(String str) {
        C7397x.m35664a(str);
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if ((charAt < this.f18219d && this.f18218c[charAt] != null) || charAt > this.f18223h || charAt < this.f18222g) {
                return mo26415a(str, i);
            }
        }
        return str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract char[] mo26402b(int i);

    protected C6513c(C6512b bVar, int i, int i2, @C5952h String str) {
        C7397x.m35664a(bVar);
        this.f18218c = bVar.mo26399a();
        this.f18219d = this.f18218c.length;
        if (i2 < i) {
            i2 = -1;
            i = Integer.MAX_VALUE;
        }
        this.f18220e = i;
        this.f18221f = i2;
        if (i >= 55296) {
            this.f18222g = 65535;
            this.f18223h = 0;
            return;
        }
        this.f18222g = (char) i;
        this.f18223h = (char) Math.min(i2, 55295);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo26400a(CharSequence charSequence, int i, int i2) {
        while (i < i2) {
            char charAt = charSequence.charAt(i);
            if ((charAt < this.f18219d && this.f18218c[charAt] != null) || charAt > this.f18223h || charAt < this.f18222g) {
                break;
            }
            i++;
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final char[] mo26401a(int i) {
        if (i < this.f18219d) {
            char[] cArr = this.f18218c[i];
            if (cArr != null) {
                return cArr;
            }
        }
        if (i < this.f18220e || i > this.f18221f) {
            return mo26402b(i);
        }
        return null;
    }
}
