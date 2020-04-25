package androidx.core.p031j;

import android.text.SpannableStringBuilder;
import com.google.common.base.C5785c;
import java.util.Locale;
import kotlin.p217i1.C14662d0;

/* renamed from: androidx.core.j.a */
/* compiled from: BidiFormatter */
public final class C0908a {

    /* renamed from: d */
    static final C0918e f4129d = C0919f.f4192c;

    /* renamed from: e */
    private static final char f4130e = '‪';

    /* renamed from: f */
    private static final char f4131f = '‫';

    /* renamed from: g */
    private static final char f4132g = '‬';

    /* renamed from: h */
    private static final char f4133h = '‎';

    /* renamed from: i */
    private static final char f4134i = '‏';

    /* renamed from: j */
    private static final String f4135j = Character.toString(f4133h);

    /* renamed from: k */
    private static final String f4136k = Character.toString(f4134i);

    /* renamed from: l */
    private static final String f4137l = "";

    /* renamed from: m */
    private static final int f4138m = 2;

    /* renamed from: n */
    private static final int f4139n = 2;

    /* renamed from: o */
    static final C0908a f4140o = new C0908a(false, 2, f4129d);

    /* renamed from: p */
    static final C0908a f4141p = new C0908a(true, 2, f4129d);

    /* renamed from: q */
    private static final int f4142q = -1;

    /* renamed from: r */
    private static final int f4143r = 0;

    /* renamed from: s */
    private static final int f4144s = 1;

    /* renamed from: a */
    private final boolean f4145a;

    /* renamed from: b */
    private final int f4146b;

    /* renamed from: c */
    private final C0918e f4147c;

    /* renamed from: androidx.core.j.a$a */
    /* compiled from: BidiFormatter */
    public static final class C0909a {

        /* renamed from: a */
        private boolean f4148a;

        /* renamed from: b */
        private int f4149b;

        /* renamed from: c */
        private C0918e f4150c;

        public C0909a() {
            m5237c(C0908a.m5219b(Locale.getDefault()));
        }

        /* renamed from: b */
        private static C0908a m5236b(boolean z) {
            return z ? C0908a.f4141p : C0908a.f4140o;
        }

        /* renamed from: c */
        private void m5237c(boolean z) {
            this.f4148a = z;
            this.f4150c = C0908a.f4129d;
            this.f4149b = 2;
        }

        /* renamed from: a */
        public C0909a mo4687a(boolean z) {
            if (z) {
                this.f4149b |= 2;
            } else {
                this.f4149b &= -3;
            }
            return this;
        }

        public C0909a(boolean z) {
            m5237c(z);
        }

        /* renamed from: a */
        public C0909a mo4686a(C0918e eVar) {
            this.f4150c = eVar;
            return this;
        }

        /* renamed from: a */
        public C0908a mo4688a() {
            if (this.f4149b == 2 && this.f4150c == C0908a.f4129d) {
                return m5236b(this.f4148a);
            }
            return new C0908a(this.f4148a, this.f4149b, this.f4150c);
        }

        public C0909a(Locale locale) {
            m5237c(C0908a.m5219b(locale));
        }
    }

    /* renamed from: androidx.core.j.a$b */
    /* compiled from: BidiFormatter */
    private static class C0910b {

        /* renamed from: f */
        private static final int f4151f = 1792;

        /* renamed from: g */
        private static final byte[] f4152g = new byte[f4151f];

        /* renamed from: a */
        private final CharSequence f4153a;

        /* renamed from: b */
        private final boolean f4154b;

        /* renamed from: c */
        private final int f4155c;

        /* renamed from: d */
        private int f4156d;

        /* renamed from: e */
        private char f4157e;

        static {
            for (int i = 0; i < f4151f; i++) {
                f4152g[i] = Character.getDirectionality(i);
            }
        }

        C0910b(CharSequence charSequence, boolean z) {
            this.f4153a = charSequence;
            this.f4154b = z;
            this.f4155c = charSequence.length();
        }

        /* renamed from: a */
        private static byte m5241a(char c) {
            return c < f4151f ? f4152g[c] : Character.getDirectionality(c);
        }

        /* renamed from: e */
        private byte m5242e() {
            char c;
            int i = this.f4156d;
            do {
                int i2 = this.f4156d;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f4153a;
                int i3 = i2 - 1;
                this.f4156d = i3;
                this.f4157e = charSequence.charAt(i3);
                c = this.f4157e;
                if (c == '&') {
                    return C5785c.f16695n;
                }
            } while (c != ';');
            this.f4156d = i;
            this.f4157e = ';';
            return 13;
        }

        /* renamed from: f */
        private byte m5243f() {
            char charAt;
            do {
                int i = this.f4156d;
                if (i >= this.f4155c) {
                    break;
                }
                CharSequence charSequence = this.f4153a;
                this.f4156d = i + 1;
                charAt = charSequence.charAt(i);
                this.f4157e = charAt;
            } while (charAt != ';');
            return C5785c.f16695n;
        }

        /* renamed from: g */
        private byte m5244g() {
            char charAt;
            int i = this.f4156d;
            while (true) {
                int i2 = this.f4156d;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f4153a;
                int i3 = i2 - 1;
                this.f4156d = i3;
                this.f4157e = charSequence.charAt(i3);
                char c = this.f4157e;
                if (c == '<') {
                    return C5785c.f16695n;
                }
                if (c == '>') {
                    break;
                } else if (c == '\"' || c == '\'') {
                    char c2 = this.f4157e;
                    do {
                        int i4 = this.f4156d;
                        if (i4 <= 0) {
                            break;
                        }
                        CharSequence charSequence2 = this.f4153a;
                        int i5 = i4 - 1;
                        this.f4156d = i5;
                        charAt = charSequence2.charAt(i5);
                        this.f4157e = charAt;
                    } while (charAt != c2);
                }
            }
            this.f4156d = i;
            this.f4157e = C14662d0.f42854e;
            return 13;
        }

        /* renamed from: h */
        private byte m5245h() {
            char charAt;
            int i = this.f4156d;
            while (true) {
                int i2 = this.f4156d;
                if (i2 < this.f4155c) {
                    CharSequence charSequence = this.f4153a;
                    this.f4156d = i2 + 1;
                    this.f4157e = charSequence.charAt(i2);
                    char c = this.f4157e;
                    if (c == '>') {
                        return C5785c.f16695n;
                    }
                    if (c == '\"' || c == '\'') {
                        char c2 = this.f4157e;
                        do {
                            int i3 = this.f4156d;
                            if (i3 >= this.f4155c) {
                                break;
                            }
                            CharSequence charSequence2 = this.f4153a;
                            this.f4156d = i3 + 1;
                            charAt = charSequence2.charAt(i3);
                            this.f4157e = charAt;
                        } while (charAt != c2);
                    }
                } else {
                    this.f4156d = i;
                    this.f4157e = C14662d0.f42853d;
                    return 13;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public byte mo4690b() {
            this.f4157e = this.f4153a.charAt(this.f4156d);
            if (Character.isHighSurrogate(this.f4157e)) {
                int codePointAt = Character.codePointAt(this.f4153a, this.f4156d);
                this.f4156d += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.f4156d++;
            byte a = m5241a(this.f4157e);
            if (this.f4154b) {
                char c = this.f4157e;
                if (c == '<') {
                    a = m5245h();
                } else if (c == '&') {
                    a = m5243f();
                }
            }
            return a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public int mo4691c() {
            this.f4156d = 0;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (this.f4156d < this.f4155c && i == 0) {
                byte b = mo4690b();
                if (b != 0) {
                    if (b == 1 || b == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (b != 9) {
                        switch (b) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                continue;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                continue;
                            case 18:
                                i3--;
                                i2 = 0;
                                continue;
                        }
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
            if (i == 0) {
                return 0;
            }
            if (i2 != 0) {
                return i2;
            }
            while (this.f4156d > 0) {
                switch (mo4689a()) {
                    case 14:
                    case 15:
                        if (i == i3) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i == i3) {
                            return 1;
                        }
                        break;
                    case 18:
                        i3++;
                        continue;
                }
                i3--;
            }
            return 0;
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x002b, code lost:
            r2 = r2 - 1;
         */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo4692d() {
            /*
                r7 = this;
                int r0 = r7.f4155c
                r7.f4156d = r0
                r0 = 0
                r1 = 0
                r2 = 0
            L_0x0007:
                int r3 = r7.f4156d
                if (r3 <= 0) goto L_0x003b
                byte r3 = r7.mo4689a()
                r4 = -1
                if (r3 == 0) goto L_0x0034
                r5 = 1
                if (r3 == r5) goto L_0x002e
                r6 = 2
                if (r3 == r6) goto L_0x002e
                r6 = 9
                if (r3 == r6) goto L_0x0007
                switch(r3) {
                    case 14: goto L_0x0028;
                    case 15: goto L_0x0028;
                    case 16: goto L_0x0025;
                    case 17: goto L_0x0025;
                    case 18: goto L_0x0022;
                    default: goto L_0x001f;
                }
            L_0x001f:
                if (r1 != 0) goto L_0x0007
                goto L_0x0039
            L_0x0022:
                int r2 = r2 + 1
                goto L_0x0007
            L_0x0025:
                if (r1 != r2) goto L_0x002b
                return r5
            L_0x0028:
                if (r1 != r2) goto L_0x002b
                return r4
            L_0x002b:
                int r2 = r2 + -1
                goto L_0x0007
            L_0x002e:
                if (r2 != 0) goto L_0x0031
                return r5
            L_0x0031:
                if (r1 != 0) goto L_0x0007
                goto L_0x0039
            L_0x0034:
                if (r2 != 0) goto L_0x0037
                return r4
            L_0x0037:
                if (r1 != 0) goto L_0x0007
            L_0x0039:
                r1 = r2
                goto L_0x0007
            L_0x003b:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.p031j.C0908a.C0910b.mo4692d():int");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public byte mo4689a() {
            this.f4157e = this.f4153a.charAt(this.f4156d - 1);
            if (Character.isLowSurrogate(this.f4157e)) {
                int codePointBefore = Character.codePointBefore(this.f4153a, this.f4156d);
                this.f4156d -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f4156d--;
            byte a = m5241a(this.f4157e);
            if (this.f4154b) {
                char c = this.f4157e;
                if (c == '>') {
                    a = m5244g();
                } else if (c == ';') {
                    a = m5242e();
                }
            }
            return a;
        }
    }

    C0908a(boolean z, int i, C0918e eVar) {
        this.f4145a = z;
        this.f4146b = i;
        this.f4147c = eVar;
    }

    /* renamed from: a */
    public static C0908a m5217a(boolean z) {
        return new C0909a(z).mo4688a();
    }

    /* renamed from: c */
    public static C0908a m5221c() {
        return new C0909a().mo4688a();
    }

    /* renamed from: d */
    private static int m5223d(CharSequence charSequence) {
        return new C0910b(charSequence, false).mo4692d();
    }

    /* renamed from: b */
    public boolean mo4685b() {
        return this.f4145a;
    }

    /* renamed from: a */
    public static C0908a m5216a(Locale locale) {
        return new C0909a(locale).mo4688a();
    }

    /* renamed from: b */
    private String m5218b(CharSequence charSequence, C0918e eVar) {
        boolean a = eVar.mo4722a(charSequence, 0, charSequence.length());
        if (this.f4145a || (!a && m5223d(charSequence) != 1)) {
            return (!this.f4145a || (a && m5223d(charSequence) != -1)) ? "" : f4136k;
        }
        return f4135j;
    }

    /* renamed from: c */
    private String m5222c(CharSequence charSequence, C0918e eVar) {
        boolean a = eVar.mo4722a(charSequence, 0, charSequence.length());
        if (this.f4145a || (!a && m5220c(charSequence) != 1)) {
            return (!this.f4145a || (a && m5220c(charSequence) != -1)) ? "" : f4136k;
        }
        return f4135j;
    }

    /* renamed from: a */
    public boolean mo4680a() {
        return (this.f4146b & 2) != 0;
    }

    /* renamed from: a */
    public boolean mo4682a(String str) {
        return mo4681a((CharSequence) str);
    }

    /* renamed from: a */
    public boolean mo4681a(CharSequence charSequence) {
        return this.f4147c.mo4722a(charSequence, 0, charSequence.length());
    }

    /* renamed from: a */
    public String mo4678a(String str, C0918e eVar, boolean z) {
        if (str == null) {
            return null;
        }
        return mo4675a((CharSequence) str, eVar, z).toString();
    }

    /* renamed from: c */
    private static int m5220c(CharSequence charSequence) {
        return new C0910b(charSequence, false).mo4691c();
    }

    /* renamed from: a */
    public CharSequence mo4675a(CharSequence charSequence, C0918e eVar, boolean z) {
        if (charSequence == null) {
            return null;
        }
        boolean a = eVar.mo4722a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (mo4680a() && z) {
            spannableStringBuilder.append(m5222c(charSequence, a ? C0919f.f4191b : C0919f.f4190a));
        }
        if (a != this.f4145a) {
            spannableStringBuilder.append(a ? f4131f : f4130e);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(f4132g);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            spannableStringBuilder.append(m5218b(charSequence, a ? C0919f.f4191b : C0919f.f4190a));
        }
        return spannableStringBuilder;
    }

    /* renamed from: b */
    public String mo4684b(String str) {
        return mo4678a(str, this.f4147c, true);
    }

    /* renamed from: b */
    public CharSequence mo4683b(CharSequence charSequence) {
        return mo4675a(charSequence, this.f4147c, true);
    }

    /* renamed from: b */
    static boolean m5219b(Locale locale) {
        return C0926g.m5287b(locale) == 1;
    }

    /* renamed from: a */
    public String mo4677a(String str, C0918e eVar) {
        return mo4678a(str, eVar, true);
    }

    /* renamed from: a */
    public CharSequence mo4674a(CharSequence charSequence, C0918e eVar) {
        return mo4675a(charSequence, eVar, true);
    }

    /* renamed from: a */
    public String mo4679a(String str, boolean z) {
        return mo4678a(str, this.f4147c, z);
    }

    /* renamed from: a */
    public CharSequence mo4676a(CharSequence charSequence, boolean z) {
        return mo4675a(charSequence, this.f4147c, z);
    }
}
