package p076c.p112d.p148d.p275b;

import com.google.common.base.C7397x;
import java.util.HashMap;
import java.util.Map;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b
@C2775a
/* renamed from: c.d.d.b.g */
/* compiled from: Escapers */
public final class C6519g {

    /* renamed from: a */
    private static final C6517f f18231a = new C6520a();

    /* renamed from: c.d.d.b.g$a */
    /* compiled from: Escapers */
    static class C6520a extends C6514d {
        C6520a() {
        }

        /* renamed from: a */
        public String mo26396a(String str) {
            return (String) C7397x.m35664a(str);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public char[] mo26397a(char c) {
            return null;
        }
    }

    /* renamed from: c.d.d.b.g$b */
    /* compiled from: Escapers */
    static class C6521b extends C6526i {

        /* renamed from: c */
        final /* synthetic */ C6514d f18232c;

        C6521b(C6514d dVar) {
            this.f18232c = dVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public char[] mo26401a(int i) {
            if (i < 65536) {
                return this.f18232c.mo26397a((char) i);
            }
            char[] cArr = new char[2];
            Character.toChars(i, cArr, 0);
            char[] a = this.f18232c.mo26397a(cArr[0]);
            char[] a2 = this.f18232c.mo26397a(cArr[1]);
            if (a == null && a2 == null) {
                return null;
            }
            int length = a != null ? a.length : 1;
            char[] cArr2 = new char[((a2 != null ? a2.length : 1) + length)];
            if (a != null) {
                for (int i2 = 0; i2 < a.length; i2++) {
                    cArr2[i2] = a[i2];
                }
            } else {
                cArr2[0] = cArr[0];
            }
            if (a2 != null) {
                for (int i3 = 0; i3 < a2.length; i3++) {
                    cArr2[length + i3] = a2[i3];
                }
            } else {
                cArr2[length] = cArr[1];
            }
            return cArr2;
        }
    }

    @C2775a
    /* renamed from: c.d.d.b.g$c */
    /* compiled from: Escapers */
    public static final class C6522c {

        /* renamed from: a */
        private final Map<Character, String> f18233a;

        /* renamed from: b */
        private char f18234b;

        /* renamed from: c */
        private char f18235c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public String f18236d;

        /* renamed from: c.d.d.b.g$c$a */
        /* compiled from: Escapers */
        class C6523a extends C6511a {

            /* renamed from: g */
            private final char[] f18237g;

            C6523a(Map map, char c, char c2) {
                super(map, c, c2);
                this.f18237g = C6522c.this.f18236d != null ? C6522c.this.f18236d.toCharArray() : null;
            }

            /* access modifiers changed from: protected */
            /* renamed from: b */
            public char[] mo26398b(char c) {
                return this.f18237g;
            }
        }

        /* synthetic */ C6522c(C6520a aVar) {
            this();
        }

        private C6522c() {
            this.f18233a = new HashMap();
            this.f18234b = 0;
            this.f18235c = 65535;
            this.f18236d = null;
        }

        /* renamed from: a */
        public C6522c mo26411a(char c, char c2) {
            this.f18234b = c;
            this.f18235c = c2;
            return this;
        }

        /* renamed from: a */
        public C6522c mo26413a(@C5952h String str) {
            this.f18236d = str;
            return this;
        }

        /* renamed from: a */
        public C6522c mo26412a(char c, String str) {
            C7397x.m35664a(str);
            this.f18233a.put(Character.valueOf(c), str);
            return this;
        }

        /* renamed from: a */
        public C6517f mo26410a() {
            return new C6523a(this.f18233a, this.f18234b, this.f18235c);
        }
    }

    private C6519g() {
    }

    /* renamed from: a */
    public static C6522c m30999a() {
        return new C6522c(null);
    }

    /* renamed from: b */
    public static C6517f m31005b() {
        return f18231a;
    }

    /* renamed from: a */
    static C6526i m31001a(C6517f fVar) {
        C7397x.m35664a(fVar);
        if (fVar instanceof C6526i) {
            return (C6526i) fVar;
        }
        if (fVar instanceof C6514d) {
            return m31000a((C6514d) fVar);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot create a UnicodeEscaper from: ");
        sb.append(fVar.getClass().getName());
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public static String m31002a(C6514d dVar, char c) {
        return m31004a(dVar.mo26397a(c));
    }

    /* renamed from: a */
    public static String m31003a(C6526i iVar, int i) {
        return m31004a(iVar.mo26401a(i));
    }

    /* renamed from: a */
    private static String m31004a(char[] cArr) {
        if (cArr == null) {
            return null;
        }
        return new String(cArr);
    }

    /* renamed from: a */
    private static C6526i m31000a(C6514d dVar) {
        return new C6521b(dVar);
    }
}
