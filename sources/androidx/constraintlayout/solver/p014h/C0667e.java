package androidx.constraintlayout.solver.p014h;

import androidx.constraintlayout.solver.C0660g;
import androidx.constraintlayout.solver.C0660g.C0662b;
import androidx.constraintlayout.solver.Cache;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: androidx.constraintlayout.solver.h.e */
/* compiled from: ConstraintAnchor */
public class C0667e {

    /* renamed from: k */
    private static final boolean f2690k = false;

    /* renamed from: l */
    public static final int f2691l = 0;

    /* renamed from: m */
    public static final int f2692m = 1;

    /* renamed from: n */
    public static final int f2693n = 2;

    /* renamed from: o */
    private static final int f2694o = -1;

    /* renamed from: a */
    private C0688o f2695a = new C0688o(this);

    /* renamed from: b */
    final C0677h f2696b;

    /* renamed from: c */
    final C0671d f2697c;

    /* renamed from: d */
    C0667e f2698d;

    /* renamed from: e */
    public int f2699e = 0;

    /* renamed from: f */
    int f2700f = -1;

    /* renamed from: g */
    private C0670c f2701g = C0670c.NONE;

    /* renamed from: h */
    private C0669b f2702h = C0669b.RELAXED;

    /* renamed from: i */
    private int f2703i = 0;

    /* renamed from: j */
    C0660g f2704j;

    /* renamed from: androidx.constraintlayout.solver.h.e$a */
    /* compiled from: ConstraintAnchor */
    static /* synthetic */ class C0668a {

        /* renamed from: a */
        static final /* synthetic */ int[] f2705a = new int[C0671d.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                androidx.constraintlayout.solver.h.e$d[] r0 = androidx.constraintlayout.solver.p014h.C0667e.C0671d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2705a = r0
                int[] r0 = f2705a     // Catch:{ NoSuchFieldError -> 0x0014 }
                androidx.constraintlayout.solver.h.e$d r1 = androidx.constraintlayout.solver.p014h.C0667e.C0671d.CENTER     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f2705a     // Catch:{ NoSuchFieldError -> 0x001f }
                androidx.constraintlayout.solver.h.e$d r1 = androidx.constraintlayout.solver.p014h.C0667e.C0671d.LEFT     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f2705a     // Catch:{ NoSuchFieldError -> 0x002a }
                androidx.constraintlayout.solver.h.e$d r1 = androidx.constraintlayout.solver.p014h.C0667e.C0671d.RIGHT     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f2705a     // Catch:{ NoSuchFieldError -> 0x0035 }
                androidx.constraintlayout.solver.h.e$d r1 = androidx.constraintlayout.solver.p014h.C0667e.C0671d.TOP     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f2705a     // Catch:{ NoSuchFieldError -> 0x0040 }
                androidx.constraintlayout.solver.h.e$d r1 = androidx.constraintlayout.solver.p014h.C0667e.C0671d.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f2705a     // Catch:{ NoSuchFieldError -> 0x004b }
                androidx.constraintlayout.solver.h.e$d r1 = androidx.constraintlayout.solver.p014h.C0667e.C0671d.BASELINE     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f2705a     // Catch:{ NoSuchFieldError -> 0x0056 }
                androidx.constraintlayout.solver.h.e$d r1 = androidx.constraintlayout.solver.p014h.C0667e.C0671d.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                int[] r0 = f2705a     // Catch:{ NoSuchFieldError -> 0x0062 }
                androidx.constraintlayout.solver.h.e$d r1 = androidx.constraintlayout.solver.p014h.C0667e.C0671d.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f2705a     // Catch:{ NoSuchFieldError -> 0x006e }
                androidx.constraintlayout.solver.h.e$d r1 = androidx.constraintlayout.solver.p014h.C0667e.C0671d.NONE     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.p014h.C0667e.C0668a.<clinit>():void");
        }
    }

    /* renamed from: androidx.constraintlayout.solver.h.e$b */
    /* compiled from: ConstraintAnchor */
    public enum C0669b {
        RELAXED,
        STRICT
    }

    /* renamed from: androidx.constraintlayout.solver.h.e$c */
    /* compiled from: ConstraintAnchor */
    public enum C0670c {
        NONE,
        STRONG,
        WEAK
    }

    /* renamed from: androidx.constraintlayout.solver.h.e$d */
    /* compiled from: ConstraintAnchor */
    public enum C0671d {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public C0667e(C0677h hVar, C0671d dVar) {
        this.f2696b = hVar;
        this.f2697c = dVar;
    }

    /* renamed from: a */
    public void mo3523a(Cache cache) {
        C0660g gVar = this.f2704j;
        if (gVar == null) {
            this.f2704j = new C0660g(C0662b.UNRESTRICTED, (String) null);
        } else {
            gVar.mo3500c();
        }
    }

    /* renamed from: b */
    public C0669b mo3533b() {
        return this.f2702h;
    }

    /* renamed from: c */
    public int mo3536c() {
        if (this.f2696b.mo3592T() == 8) {
            return 0;
        }
        if (this.f2700f > -1) {
            C0667e eVar = this.f2698d;
            if (eVar != null && eVar.f2696b.mo3592T() == 8) {
                return this.f2700f;
            }
        }
        return this.f2699e;
    }

    /* renamed from: d */
    public final C0667e mo3539d() {
        switch (C0668a.f2705a[this.f2697c.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f2696b.f2827w;
            case 3:
                return this.f2696b.f2823u;
            case 4:
                return this.f2696b.f2829x;
            case 5:
                return this.f2696b.f2825v;
            default:
                throw new AssertionError(this.f2697c.name());
        }
    }

    /* renamed from: e */
    public C0677h mo3540e() {
        return this.f2696b;
    }

    /* renamed from: f */
    public int mo3541f() {
        switch (C0668a.f2705a[this.f2697c.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return 2;
            case 6:
                return 1;
            case 7:
            case 8:
            case 9:
                return 0;
            default:
                throw new AssertionError(this.f2697c.name());
        }
    }

    /* renamed from: g */
    public C0688o mo3542g() {
        return this.f2695a;
    }

    /* renamed from: h */
    public int mo3543h() {
        switch (C0668a.f2705a[this.f2697c.ordinal()]) {
            case 1:
                return 3;
            case 2:
            case 3:
                return 1;
            case 4:
            case 5:
                return 0;
            case 6:
                return 2;
            case 7:
                return 0;
            case 8:
                return 1;
            case 9:
                return 0;
            default:
                throw new AssertionError(this.f2697c.name());
        }
    }

    /* renamed from: i */
    public C0660g mo3544i() {
        return this.f2704j;
    }

    /* renamed from: j */
    public C0670c mo3545j() {
        return this.f2701g;
    }

    /* renamed from: k */
    public C0667e mo3546k() {
        return this.f2698d;
    }

    /* renamed from: l */
    public C0671d mo3547l() {
        return this.f2697c;
    }

    /* renamed from: m */
    public boolean mo3548m() {
        return this.f2698d != null;
    }

    /* renamed from: n */
    public boolean mo3549n() {
        switch (C0668a.f2705a[this.f2697c.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            case 2:
            case 3:
            case 4:
            case 5:
                return true;
            default:
                throw new AssertionError(this.f2697c.name());
        }
    }

    /* renamed from: o */
    public boolean mo3550o() {
        switch (C0668a.f2705a[this.f2697c.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 7:
                return false;
            case 4:
            case 5:
            case 6:
            case 8:
            case 9:
                return true;
            default:
                throw new AssertionError(this.f2697c.name());
        }
    }

    /* renamed from: p */
    public void mo3551p() {
        this.f2698d = null;
        this.f2699e = 0;
        this.f2700f = -1;
        this.f2701g = C0670c.STRONG;
        this.f2703i = 0;
        this.f2702h = C0669b.RELAXED;
        this.f2695a.mo3768e();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2696b.mo3662h());
        sb.append(":");
        sb.append(this.f2697c.toString());
        return sb.toString();
    }

    /* renamed from: b */
    public void mo3534b(int i) {
        if (mo3548m()) {
            this.f2700f = i;
        }
    }

    /* renamed from: a */
    public void mo3524a(C0669b bVar) {
        this.f2702h = bVar;
    }

    /* renamed from: b */
    public boolean mo3535b(C0667e eVar) {
        C0671d dVar = this.f2697c;
        if (dVar == C0671d.CENTER) {
            return false;
        }
        if (dVar == eVar.mo3547l()) {
            return true;
        }
        switch (C0668a.f2705a[this.f2697c.ordinal()]) {
            case 1:
            case 6:
            case 9:
                return false;
            case 2:
                int i = C0668a.f2705a[eVar.mo3547l().ordinal()];
                if (i == 3 || i == 7) {
                    return true;
                }
                return false;
            case 3:
                int i2 = C0668a.f2705a[eVar.mo3547l().ordinal()];
                if (i2 == 2 || i2 == 7) {
                    return true;
                }
                return false;
            case 4:
                int i3 = C0668a.f2705a[eVar.mo3547l().ordinal()];
                if (i3 == 5 || i3 == 8) {
                    return true;
                }
                return false;
            case 5:
                int i4 = C0668a.f2705a[eVar.mo3547l().ordinal()];
                if (i4 == 4 || i4 == 8) {
                    return true;
                }
                return false;
            case 7:
                int i5 = C0668a.f2705a[eVar.mo3547l().ordinal()];
                if (i5 == 2 || i5 == 3) {
                    return true;
                }
                return false;
            case 8:
                int i6 = C0668a.f2705a[eVar.mo3547l().ordinal()];
                if (i6 == 4 || i6 == 5) {
                    return true;
                }
                return false;
            default:
                throw new AssertionError(this.f2697c.name());
        }
    }

    /* renamed from: a */
    public int mo3521a() {
        return this.f2703i;
    }

    /* renamed from: a */
    public void mo3522a(int i) {
        this.f2703i = i;
    }

    /* renamed from: c */
    public boolean mo3538c(C0667e eVar) {
        boolean z = false;
        if (eVar == null) {
            return false;
        }
        C0671d l = eVar.mo3547l();
        C0671d dVar = this.f2697c;
        if (l != dVar) {
            switch (C0668a.f2705a[dVar.ordinal()]) {
                case 1:
                    if (!(l == C0671d.BASELINE || l == C0671d.CENTER_X || l == C0671d.CENTER_Y)) {
                        z = true;
                    }
                    return z;
                case 2:
                case 3:
                    boolean z2 = l == C0671d.LEFT || l == C0671d.RIGHT;
                    if (eVar.mo3540e() instanceof C0683k) {
                        z2 = z2 || l == C0671d.CENTER_X;
                    }
                    return z2;
                case 4:
                case 5:
                    boolean z3 = l == C0671d.TOP || l == C0671d.BOTTOM;
                    if (eVar.mo3540e() instanceof C0683k) {
                        z3 = z3 || l == C0671d.CENTER_Y;
                    }
                    return z3;
                case 6:
                case 7:
                case 8:
                case 9:
                    return false;
                default:
                    throw new AssertionError(this.f2697c.name());
            }
        } else if (dVar != C0671d.BASELINE || (eVar.mo3540e().mo3598Z() && mo3540e().mo3598Z())) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public boolean mo3530a(C0667e eVar, int i, C0670c cVar, int i2) {
        return mo3529a(eVar, i, -1, cVar, i2, false);
    }

    /* renamed from: a */
    public boolean mo3529a(C0667e eVar, int i, int i2, C0670c cVar, int i3, boolean z) {
        if (eVar == null) {
            this.f2698d = null;
            this.f2699e = 0;
            this.f2700f = -1;
            this.f2701g = C0670c.NONE;
            this.f2703i = 2;
            return true;
        } else if (!z && !mo3538c(eVar)) {
            return false;
        } else {
            this.f2698d = eVar;
            if (i > 0) {
                this.f2699e = i;
            } else {
                this.f2699e = 0;
            }
            this.f2700f = i2;
            this.f2701g = cVar;
            this.f2703i = i3;
            return true;
        }
    }

    /* renamed from: c */
    public void mo3537c(int i) {
        if (mo3548m()) {
            this.f2699e = i;
        }
    }

    /* renamed from: a */
    public boolean mo3528a(C0667e eVar, int i, int i2) {
        return mo3529a(eVar, i, -1, C0670c.STRONG, i2, false);
    }

    /* renamed from: a */
    public boolean mo3527a(C0667e eVar, int i) {
        return mo3529a(eVar, i, -1, C0670c.STRONG, 0, false);
    }

    /* renamed from: a */
    public boolean mo3526a(C0667e eVar) {
        C0671d l = eVar.mo3547l();
        C0671d dVar = this.f2697c;
        boolean z = true;
        if (l == dVar) {
            return true;
        }
        switch (C0668a.f2705a[dVar.ordinal()]) {
            case 1:
                if (l == C0671d.BASELINE) {
                    z = false;
                }
                return z;
            case 2:
            case 3:
            case 7:
                if (!(l == C0671d.LEFT || l == C0671d.RIGHT || l == C0671d.CENTER_X)) {
                    z = false;
                }
                return z;
            case 4:
            case 5:
            case 6:
            case 8:
                if (!(l == C0671d.TOP || l == C0671d.BOTTOM || l == C0671d.CENTER_Y || l == C0671d.BASELINE)) {
                    z = false;
                }
                return z;
            case 9:
                return false;
            default:
                throw new AssertionError(this.f2697c.name());
        }
    }

    /* renamed from: a */
    public void mo3525a(C0670c cVar) {
        if (mo3548m()) {
            this.f2701g = cVar;
        }
    }

    /* renamed from: a */
    public boolean mo3532a(C0677h hVar, C0667e eVar) {
        return mo3531a(hVar);
    }

    /* renamed from: a */
    public boolean mo3531a(C0677h hVar) {
        if (m3662a(hVar, new HashSet<>())) {
            return false;
        }
        C0677h G = mo3540e().mo3580G();
        if (G == hVar || hVar.mo3580G() == G) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private boolean m3662a(C0677h hVar, HashSet<C0677h> hashSet) {
        if (hashSet.contains(hVar)) {
            return false;
        }
        hashSet.add(hVar);
        if (hVar == mo3540e()) {
            return true;
        }
        ArrayList c = hVar.mo3637c();
        int size = c.size();
        for (int i = 0; i < size; i++) {
            C0667e eVar = (C0667e) c.get(i);
            if (eVar.mo3526a(this) && eVar.mo3548m() && m3662a(eVar.mo3546k().mo3540e(), hashSet)) {
                return true;
            }
        }
        return false;
    }
}
