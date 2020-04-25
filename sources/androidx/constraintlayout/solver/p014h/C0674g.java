package androidx.constraintlayout.solver.p014h;

import androidx.constraintlayout.solver.C0654d;
import androidx.constraintlayout.solver.p014h.C0667e.C0670c;
import androidx.constraintlayout.solver.p014h.C0667e.C0671d;
import androidx.constraintlayout.solver.p014h.C0677h.C0680c;
import java.util.ArrayList;

/* renamed from: androidx.constraintlayout.solver.h.g */
/* compiled from: ConstraintTableLayout */
public class C0674g extends C0681i {

    /* renamed from: N1 */
    public static final int f2707N1 = 0;

    /* renamed from: O1 */
    public static final int f2708O1 = 1;

    /* renamed from: P1 */
    public static final int f2709P1 = 2;

    /* renamed from: Q1 */
    private static final int f2710Q1 = 3;

    /* renamed from: E1 */
    private boolean f2711E1 = true;

    /* renamed from: F1 */
    private int f2712F1 = 0;

    /* renamed from: G1 */
    private int f2713G1 = 0;

    /* renamed from: H1 */
    private int f2714H1 = 8;

    /* renamed from: I1 */
    private ArrayList<C0676b> f2715I1 = new ArrayList<>();

    /* renamed from: J1 */
    private ArrayList<C0675a> f2716J1 = new ArrayList<>();

    /* renamed from: K1 */
    private ArrayList<C0683k> f2717K1 = new ArrayList<>();

    /* renamed from: L1 */
    private ArrayList<C0683k> f2718L1 = new ArrayList<>();

    /* renamed from: M1 */
    private C0654d f2719M1 = null;

    /* renamed from: androidx.constraintlayout.solver.h.g$a */
    /* compiled from: ConstraintTableLayout */
    class C0675a {

        /* renamed from: a */
        C0677h f2720a;

        /* renamed from: b */
        C0677h f2721b;

        /* renamed from: c */
        int f2722c;

        C0675a() {
        }
    }

    /* renamed from: androidx.constraintlayout.solver.h.g$b */
    /* compiled from: ConstraintTableLayout */
    class C0676b {

        /* renamed from: a */
        C0677h f2724a;

        /* renamed from: b */
        C0677h f2725b;

        /* renamed from: c */
        int f2726c = 1;

        /* renamed from: d */
        int f2727d;

        C0676b() {
        }
    }

    public C0674g() {
    }

    /* renamed from: Q0 */
    private void m3695Q0() {
        int size = this.f2944c1.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C0677h hVar = (C0677h) this.f2944c1.get(i2);
            int g = i + hVar.mo3658g();
            int i3 = this.f2712F1;
            int i4 = g % i3;
            C0675a aVar = (C0675a) this.f2716J1.get(g / i3);
            C0676b bVar = (C0676b) this.f2715I1.get(i4);
            C0677h hVar2 = bVar.f2724a;
            C0677h hVar3 = bVar.f2725b;
            C0677h hVar4 = aVar.f2720a;
            C0677h hVar5 = aVar.f2721b;
            hVar.mo3599a(C0671d.LEFT).mo3527a(hVar2.mo3599a(C0671d.LEFT), this.f2714H1);
            if (hVar3 instanceof C0683k) {
                hVar.mo3599a(C0671d.RIGHT).mo3527a(hVar3.mo3599a(C0671d.LEFT), this.f2714H1);
            } else {
                hVar.mo3599a(C0671d.RIGHT).mo3527a(hVar3.mo3599a(C0671d.RIGHT), this.f2714H1);
            }
            int i5 = bVar.f2726c;
            if (i5 == 1) {
                hVar.mo3599a(C0671d.LEFT).mo3525a(C0670c.STRONG);
                hVar.mo3599a(C0671d.RIGHT).mo3525a(C0670c.WEAK);
            } else if (i5 == 2) {
                hVar.mo3599a(C0671d.LEFT).mo3525a(C0670c.WEAK);
                hVar.mo3599a(C0671d.RIGHT).mo3525a(C0670c.STRONG);
            } else if (i5 == 3) {
                hVar.mo3617a(C0680c.MATCH_CONSTRAINT);
            }
            hVar.mo3599a(C0671d.TOP).mo3527a(hVar4.mo3599a(C0671d.TOP), this.f2714H1);
            if (hVar5 instanceof C0683k) {
                hVar.mo3599a(C0671d.BOTTOM).mo3527a(hVar5.mo3599a(C0671d.TOP), this.f2714H1);
            } else {
                hVar.mo3599a(C0671d.BOTTOM).mo3527a(hVar5.mo3599a(C0671d.BOTTOM), this.f2714H1);
            }
            i = g + 1;
        }
    }

    /* renamed from: R0 */
    private void m3696R0() {
        this.f2716J1.clear();
        float f = 100.0f / ((float) this.f2713G1);
        C0677h hVar = this;
        float f2 = f;
        int i = 0;
        while (i < this.f2713G1) {
            C0675a aVar = new C0675a();
            aVar.f2720a = hVar;
            if (i < this.f2713G1 - 1) {
                C0683k kVar = new C0683k();
                kVar.mo3739D(0);
                kVar.mo3652e((C0677h) this);
                kVar.mo3736B((int) f2);
                f2 += f;
                aVar.f2721b = kVar;
                this.f2718L1.add(kVar);
            } else {
                aVar.f2721b = this;
            }
            C0677h hVar2 = aVar.f2721b;
            this.f2716J1.add(aVar);
            i++;
            hVar = hVar2;
        }
        m3698T0();
    }

    /* renamed from: S0 */
    private void m3697S0() {
        this.f2715I1.clear();
        float f = 100.0f / ((float) this.f2712F1);
        int i = 0;
        C0677h hVar = this;
        float f2 = f;
        while (i < this.f2712F1) {
            C0676b bVar = new C0676b();
            bVar.f2724a = hVar;
            if (i < this.f2712F1 - 1) {
                C0683k kVar = new C0683k();
                kVar.mo3739D(1);
                kVar.mo3652e((C0677h) this);
                kVar.mo3736B((int) f2);
                f2 += f;
                bVar.f2725b = kVar;
                this.f2717K1.add(kVar);
            } else {
                bVar.f2725b = this;
            }
            C0677h hVar2 = bVar.f2725b;
            this.f2715I1.add(bVar);
            i++;
            hVar = hVar2;
        }
        m3698T0();
    }

    /* renamed from: T0 */
    private void m3698T0() {
        if (this.f2719M1 != null) {
            int size = this.f2717K1.size();
            for (int i = 0; i < size; i++) {
                C0683k kVar = (C0683k) this.f2717K1.get(i);
                C0654d dVar = this.f2719M1;
                StringBuilder sb = new StringBuilder();
                sb.append(mo3662h());
                sb.append(".VG");
                sb.append(i);
                kVar.mo3567a(dVar, sb.toString());
            }
            int size2 = this.f2718L1.size();
            for (int i2 = 0; i2 < size2; i2++) {
                C0683k kVar2 = (C0683k) this.f2718L1.get(i2);
                C0654d dVar2 = this.f2719M1;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(mo3662h());
                sb2.append(".HG");
                sb2.append(i2);
                kVar2.mo3567a(dVar2, sb2.toString());
            }
        }
    }

    /* renamed from: A0 */
    public boolean mo3553A0() {
        return true;
    }

    /* renamed from: B */
    public void mo3554B(int i) {
        C0676b bVar = (C0676b) this.f2715I1.get(i);
        int i2 = bVar.f2726c;
        if (i2 == 0) {
            bVar.f2726c = 2;
        } else if (i2 == 1) {
            bVar.f2726c = 0;
        } else if (i2 == 2) {
            bVar.f2726c = 1;
        }
        m3695Q0();
    }

    /* renamed from: C */
    public String mo3555C(int i) {
        int i2 = ((C0676b) this.f2715I1.get(i)).f2726c;
        if (i2 == 1) {
            return "L";
        }
        if (i2 == 0) {
            return "C";
        }
        if (i2 == 3) {
            return "F";
        }
        return i2 == 2 ? "R" : "!";
    }

    /* renamed from: D */
    public void mo3556D(int i) {
        if (this.f2711E1 && this.f2712F1 != i) {
            this.f2712F1 = i;
            m3697S0();
            mo3566P0();
        }
    }

    /* renamed from: E */
    public void mo3557E(int i) {
        if (!this.f2711E1 && this.f2712F1 != i) {
            this.f2713G1 = i;
            m3696R0();
            mo3566P0();
        }
    }

    /* renamed from: F */
    public void mo3558F(int i) {
        if (i > 1) {
            this.f2714H1 = i;
        }
    }

    /* renamed from: J0 */
    public void mo3559J0() {
        int size = this.f2717K1.size();
        for (int i = 0; i < size; i++) {
            ((C0683k) this.f2717K1.get(i)).mo3737B0();
        }
        int size2 = this.f2718L1.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((C0683k) this.f2718L1.get(i2)).mo3737B0();
        }
    }

    /* renamed from: K0 */
    public String mo3560K0() {
        int size = this.f2715I1.size();
        String str = "";
        for (int i = 0; i < size; i++) {
            int i2 = ((C0676b) this.f2715I1.get(i)).f2726c;
            if (i2 == 1) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("L");
                str = sb.toString();
            } else if (i2 == 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append("C");
                str = sb2.toString();
            } else if (i2 == 3) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append("F");
                str = sb3.toString();
            } else if (i2 == 2) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append("R");
                str = sb4.toString();
            }
        }
        return str;
    }

    /* renamed from: L0 */
    public int mo3561L0() {
        return this.f2712F1;
    }

    /* renamed from: M0 */
    public int mo3562M0() {
        return this.f2713G1;
    }

    /* renamed from: N0 */
    public int mo3563N0() {
        return this.f2714H1;
    }

    /* renamed from: O */
    public String mo3564O() {
        return "ConstraintTableLayout";
    }

    /* renamed from: O0 */
    public boolean mo3565O0() {
        return this.f2711E1;
    }

    /* renamed from: P0 */
    public void mo3566P0() {
        int size = this.f2944c1.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((C0677h) this.f2944c1.get(i2)).mo3658g();
        }
        int i3 = size + i;
        if (this.f2711E1) {
            if (this.f2712F1 == 0) {
                mo3556D(1);
            }
            int i4 = this.f2712F1;
            int i5 = i3 / i4;
            if (i4 * i5 < i3) {
                i5++;
            }
            if (this.f2713G1 != i5 || this.f2717K1.size() != this.f2712F1 - 1) {
                this.f2713G1 = i5;
                m3696R0();
            } else {
                return;
            }
        } else {
            if (this.f2713G1 == 0) {
                mo3557E(1);
            }
            int i6 = this.f2713G1;
            int i7 = i3 / i6;
            if (i6 * i7 < i3) {
                i7++;
            }
            if (this.f2712F1 != i7 || this.f2718L1.size() != this.f2713G1 - 1) {
                this.f2712F1 = i7;
                m3697S0();
            } else {
                return;
            }
        }
        m3695Q0();
    }

    /* renamed from: a */
    public void mo3505a(C0654d dVar) {
        super.mo3505a(dVar);
        int size = this.f2944c1.size();
        if (size != 0) {
            mo3566P0();
            if (dVar == this.f2843e1) {
                int size2 = this.f2717K1.size();
                int i = 0;
                while (true) {
                    boolean z = true;
                    if (i >= size2) {
                        break;
                    }
                    C0683k kVar = (C0683k) this.f2717K1.get(i);
                    if (mo3698u() != C0680c.WRAP_CONTENT) {
                        z = false;
                    }
                    kVar.mo3740c(z);
                    kVar.mo3505a(dVar);
                    i++;
                }
                int size3 = this.f2718L1.size();
                for (int i2 = 0; i2 < size3; i2++) {
                    C0683k kVar2 = (C0683k) this.f2718L1.get(i2);
                    kVar2.mo3740c(mo3591S() == C0680c.WRAP_CONTENT);
                    kVar2.mo3505a(dVar);
                }
                for (int i3 = 0; i3 < size; i3++) {
                    ((C0677h) this.f2944c1.get(i3)).mo3505a(dVar);
                }
            }
        }
    }

    /* renamed from: c */
    public void mo3568c(C0654d dVar) {
        super.mo3568c(dVar);
        if (dVar == this.f2843e1) {
            int size = this.f2717K1.size();
            for (int i = 0; i < size; i++) {
                ((C0683k) this.f2717K1.get(i)).mo3568c(dVar);
            }
            int size2 = this.f2718L1.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((C0683k) this.f2718L1.get(i2)).mo3568c(dVar);
            }
        }
    }

    /* renamed from: d */
    public void mo3570d(boolean z) {
        this.f2711E1 = z;
    }

    /* renamed from: j */
    public void mo3571j(int i, int i2) {
        if (i < this.f2715I1.size()) {
            ((C0676b) this.f2715I1.get(i)).f2726c = i2;
            m3695Q0();
        }
    }

    /* renamed from: v0 */
    public ArrayList<C0683k> mo3572v0() {
        return this.f2718L1;
    }

    /* renamed from: y0 */
    public ArrayList<C0683k> mo3573y0() {
        return this.f2717K1;
    }

    /* renamed from: d */
    public void mo3569d(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == 'L') {
                mo3571j(i, 1);
            } else if (charAt == 'C') {
                mo3571j(i, 0);
            } else if (charAt == 'F') {
                mo3571j(i, 3);
            } else if (charAt == 'R') {
                mo3571j(i, 2);
            } else {
                mo3571j(i, 0);
            }
        }
    }

    public C0674g(int i, int i2, int i3, int i4) {
        super(i, i2, i3, i4);
    }

    /* renamed from: a */
    public void mo3567a(C0654d dVar, String str) {
        this.f2719M1 = dVar;
        super.mo3567a(dVar, str);
        m3698T0();
    }

    public C0674g(int i, int i2) {
        super(i, i2);
    }
}
