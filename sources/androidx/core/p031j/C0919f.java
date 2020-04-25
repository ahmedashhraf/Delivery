package androidx.core.p031j;

import java.nio.CharBuffer;
import java.util.Locale;

/* renamed from: androidx.core.j.f */
/* compiled from: TextDirectionHeuristicsCompat */
public final class C0919f {

    /* renamed from: a */
    public static final C0918e f4190a = new C0924e(null, false);

    /* renamed from: b */
    public static final C0918e f4191b = new C0924e(null, true);

    /* renamed from: c */
    public static final C0918e f4192c = new C0924e(C0921b.f4201a, false);

    /* renamed from: d */
    public static final C0918e f4193d = new C0924e(C0921b.f4201a, true);

    /* renamed from: e */
    public static final C0918e f4194e = new C0924e(C0920a.f4199b, false);

    /* renamed from: f */
    public static final C0918e f4195f = C0925f.f4204b;

    /* renamed from: g */
    private static final int f4196g = 0;

    /* renamed from: h */
    private static final int f4197h = 1;

    /* renamed from: i */
    private static final int f4198i = 2;

    /* renamed from: androidx.core.j.f$a */
    /* compiled from: TextDirectionHeuristicsCompat */
    private static class C0920a implements C0922c {

        /* renamed from: b */
        static final C0920a f4199b = new C0920a(true);

        /* renamed from: a */
        private final boolean f4200a;

        private C0920a(boolean z) {
            this.f4200a = z;
        }

        /* renamed from: a */
        public int mo4724a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            boolean z = false;
            while (i < i3) {
                int a = C0919f.m5274a(Character.getDirectionality(charSequence.charAt(i)));
                if (a != 0) {
                    if (a != 1) {
                        continue;
                        i++;
                    } else if (!this.f4200a) {
                        return 1;
                    }
                } else if (this.f4200a) {
                    return 0;
                }
                z = true;
                i++;
            }
            if (z) {
                return this.f4200a ? 1 : 0;
            }
            return 2;
        }
    }

    /* renamed from: androidx.core.j.f$b */
    /* compiled from: TextDirectionHeuristicsCompat */
    private static class C0921b implements C0922c {

        /* renamed from: a */
        static final C0921b f4201a = new C0921b();

        private C0921b() {
        }

        /* renamed from: a */
        public int mo4724a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            int i4 = 2;
            while (i < i3 && i4 == 2) {
                i4 = C0919f.m5275b(Character.getDirectionality(charSequence.charAt(i)));
                i++;
            }
            return i4;
        }
    }

    /* renamed from: androidx.core.j.f$c */
    /* compiled from: TextDirectionHeuristicsCompat */
    private interface C0922c {
        /* renamed from: a */
        int mo4724a(CharSequence charSequence, int i, int i2);
    }

    /* renamed from: androidx.core.j.f$d */
    /* compiled from: TextDirectionHeuristicsCompat */
    private static abstract class C0923d implements C0918e {

        /* renamed from: a */
        private final C0922c f4202a;

        C0923d(C0922c cVar) {
            this.f4202a = cVar;
        }

        /* renamed from: b */
        private boolean m5279b(CharSequence charSequence, int i, int i2) {
            int a = this.f4202a.mo4724a(charSequence, i, i2);
            if (a == 0) {
                return true;
            }
            if (a != 1) {
                return mo4725a();
            }
            return false;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract boolean mo4725a();

        /* renamed from: a */
        public boolean mo4723a(char[] cArr, int i, int i2) {
            return mo4722a((CharSequence) CharBuffer.wrap(cArr), i, i2);
        }

        /* renamed from: a */
        public boolean mo4722a(CharSequence charSequence, int i, int i2) {
            if (charSequence == null || i < 0 || i2 < 0 || charSequence.length() - i2 < i) {
                throw new IllegalArgumentException();
            } else if (this.f4202a == null) {
                return mo4725a();
            } else {
                return m5279b(charSequence, i, i2);
            }
        }
    }

    /* renamed from: androidx.core.j.f$e */
    /* compiled from: TextDirectionHeuristicsCompat */
    private static class C0924e extends C0923d {

        /* renamed from: b */
        private final boolean f4203b;

        C0924e(C0922c cVar, boolean z) {
            super(cVar);
            this.f4203b = z;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo4725a() {
            return this.f4203b;
        }
    }

    /* renamed from: androidx.core.j.f$f */
    /* compiled from: TextDirectionHeuristicsCompat */
    private static class C0925f extends C0923d {

        /* renamed from: b */
        static final C0925f f4204b = new C0925f();

        C0925f() {
            super(null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo4725a() {
            return C0926g.m5287b(Locale.getDefault()) == 1;
        }
    }

    private C0919f() {
    }

    /* renamed from: a */
    static int m5274a(int i) {
        if (i != 0) {
            return (i == 1 || i == 2) ? 0 : 2;
        }
        return 1;
    }

    /* renamed from: b */
    static int m5275b(int i) {
        if (i != 0) {
            if (!(i == 1 || i == 2)) {
                switch (i) {
                    case 14:
                    case 15:
                        break;
                    case 16:
                    case 17:
                        break;
                    default:
                        return 2;
                }
            }
            return 0;
        }
        return 1;
    }
}
