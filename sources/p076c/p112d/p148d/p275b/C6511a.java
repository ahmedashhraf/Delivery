package p076c.p112d.p148d.p275b;

import com.google.common.base.C7397x;
import java.util.Map;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2776b;

@C2776b
@C2775a
/* renamed from: c.d.d.b.a */
/* compiled from: ArrayBasedCharEscaper */
public abstract class C6511a extends C6514d {

    /* renamed from: c */
    private final char[][] f18212c;

    /* renamed from: d */
    private final int f18213d;

    /* renamed from: e */
    private final char f18214e;

    /* renamed from: f */
    private final char f18215f;

    protected C6511a(Map<Character, String> map, char c, char c2) {
        this(C6512b.m30979a(map), c, c2);
    }

    /* renamed from: a */
    public final String mo26396a(String str) {
        C7397x.m35664a(str);
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if ((charAt < this.f18213d && this.f18212c[charAt] != null) || charAt > this.f18215f || charAt < this.f18214e) {
                return mo26403a(str, i);
            }
        }
        return str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract char[] mo26398b(char c);

    protected C6511a(C6512b bVar, char c, char c2) {
        C7397x.m35664a(bVar);
        this.f18212c = bVar.mo26399a();
        this.f18213d = this.f18212c.length;
        if (c2 < c) {
            c2 = 0;
            c = 65535;
        }
        this.f18214e = c;
        this.f18215f = c2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final char[] mo26397a(char c) {
        if (c < this.f18213d) {
            char[] cArr = this.f18212c[c];
            if (cArr != null) {
                return cArr;
            }
        }
        if (c < this.f18214e || c > this.f18215f) {
            return mo26398b(c);
        }
        return null;
    }
}
