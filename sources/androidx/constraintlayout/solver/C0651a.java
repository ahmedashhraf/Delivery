package androidx.constraintlayout.solver;

import androidx.constraintlayout.solver.C0660g.C0662b;
import com.fasterxml.jackson.core.p162w.C3868i;
import java.io.PrintStream;
import java.util.Arrays;

/* renamed from: androidx.constraintlayout.solver.a */
/* compiled from: ArrayLinkedVariables */
public class C0651a {

    /* renamed from: l */
    private static final boolean f2565l = false;

    /* renamed from: m */
    private static final int f2566m = -1;

    /* renamed from: n */
    private static final boolean f2567n = false;

    /* renamed from: a */
    int f2568a = 0;

    /* renamed from: b */
    private final C0652b f2569b;

    /* renamed from: c */
    private final Cache f2570c;

    /* renamed from: d */
    private int f2571d = 8;

    /* renamed from: e */
    private C0660g f2572e = null;

    /* renamed from: f */
    private int[] f2573f;

    /* renamed from: g */
    private int[] f2574g;

    /* renamed from: h */
    private float[] f2575h;

    /* renamed from: i */
    private int f2576i;

    /* renamed from: j */
    private int f2577j;

    /* renamed from: k */
    private boolean f2578k;

    C0651a(C0652b bVar, Cache cache) {
        int i = this.f2571d;
        this.f2573f = new int[i];
        this.f2574g = new int[i];
        this.f2575h = new float[i];
        this.f2576i = -1;
        this.f2577j = -1;
        this.f2578k = false;
        this.f2569b = bVar;
        this.f2570c = cache;
    }

    /* renamed from: a */
    public final void mo3414a(C0660g gVar, float f) {
        if (f == 0.0f) {
            mo3406a(gVar, true);
            return;
        }
        int i = this.f2576i;
        if (i == -1) {
            this.f2576i = 0;
            float[] fArr = this.f2575h;
            int i2 = this.f2576i;
            fArr[i2] = f;
            this.f2573f[i2] = gVar.f2655b;
            this.f2574g[i2] = -1;
            gVar.f2663j++;
            gVar.mo3495a(this.f2569b);
            this.f2568a++;
            if (!this.f2578k) {
                this.f2577j++;
                int i3 = this.f2577j;
                int[] iArr = this.f2573f;
                if (i3 >= iArr.length) {
                    this.f2578k = true;
                    this.f2577j = iArr.length - 1;
                }
            }
            return;
        }
        int i4 = 0;
        int i5 = -1;
        while (i != -1 && i4 < this.f2568a) {
            int[] iArr2 = this.f2573f;
            int i6 = iArr2[i];
            int i7 = gVar.f2655b;
            if (i6 == i7) {
                this.f2575h[i] = f;
                return;
            }
            if (iArr2[i] < i7) {
                i5 = i;
            }
            i = this.f2574g[i];
            i4++;
        }
        int i8 = this.f2577j;
        int i9 = i8 + 1;
        if (this.f2578k) {
            int[] iArr3 = this.f2573f;
            if (iArr3[i8] != -1) {
                i8 = iArr3.length;
            }
        } else {
            i8 = i9;
        }
        int[] iArr4 = this.f2573f;
        if (i8 >= iArr4.length && this.f2568a < iArr4.length) {
            int i10 = 0;
            while (true) {
                int[] iArr5 = this.f2573f;
                if (i10 >= iArr5.length) {
                    break;
                } else if (iArr5[i10] == -1) {
                    i8 = i10;
                    break;
                } else {
                    i10++;
                }
            }
        }
        int[] iArr6 = this.f2573f;
        if (i8 >= iArr6.length) {
            i8 = iArr6.length;
            this.f2571d *= 2;
            this.f2578k = false;
            this.f2577j = i8 - 1;
            this.f2575h = Arrays.copyOf(this.f2575h, this.f2571d);
            this.f2573f = Arrays.copyOf(this.f2573f, this.f2571d);
            this.f2574g = Arrays.copyOf(this.f2574g, this.f2571d);
        }
        this.f2573f[i8] = gVar.f2655b;
        this.f2575h[i8] = f;
        if (i5 != -1) {
            int[] iArr7 = this.f2574g;
            iArr7[i8] = iArr7[i5];
            iArr7[i5] = i8;
        } else {
            this.f2574g[i8] = this.f2576i;
            this.f2576i = i8;
        }
        gVar.f2663j++;
        gVar.mo3495a(this.f2569b);
        this.f2568a++;
        if (!this.f2578k) {
            this.f2577j++;
        }
        if (this.f2568a >= this.f2573f.length) {
            this.f2578k = true;
        }
        int i11 = this.f2577j;
        int[] iArr8 = this.f2573f;
        if (i11 >= iArr8.length) {
            this.f2578k = true;
            this.f2577j = iArr8.length - 1;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final float mo3417b(int i) {
        int i2 = this.f2576i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f2568a) {
            if (i3 == i) {
                return this.f2575h[i2];
            }
            i2 = this.f2574g[i2];
            i3++;
        }
        return 0.0f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public C0660g mo3420c() {
        C0660g gVar = this.f2572e;
        if (gVar != null) {
            return gVar;
        }
        int i = this.f2576i;
        int i2 = 0;
        C0660g gVar2 = null;
        while (i != -1 && i2 < this.f2568a) {
            if (this.f2575h[i] < 0.0f) {
                C0660g gVar3 = this.f2570c.mIndexedVariables[this.f2573f[i]];
                if (gVar2 == null || gVar2.f2657d < gVar3.f2657d) {
                    gVar2 = gVar3;
                }
            }
            i = this.f2574g[i];
            i2++;
        }
        return gVar2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo3421d() {
        int i = this.f2576i;
        int i2 = 0;
        while (i != -1 && i2 < this.f2568a) {
            if (this.f2575h[i] > 0.0f) {
                return true;
            }
            i = this.f2574g[i];
            i2++;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo3422e() {
        int i = this.f2576i;
        int i2 = 0;
        while (i != -1 && i2 < this.f2568a) {
            float[] fArr = this.f2575h;
            fArr[i] = fArr[i] * -1.0f;
            i = this.f2574g[i];
            i2++;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public int mo3423f() {
        return (this.f2573f.length * 4 * 3) + 0 + 36;
    }

    public String toString() {
        int i = this.f2576i;
        String str = "";
        int i2 = 0;
        while (i != -1 && i2 < this.f2568a) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" -> ");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            sb3.append(this.f2575h[i]);
            sb3.append(" : ");
            String sb4 = sb3.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(sb4);
            sb5.append(this.f2570c.mIndexedVariables[this.f2573f[i]]);
            str = sb5.toString();
            i = this.f2574g[i];
            i2++;
        }
        return str;
    }

    /* renamed from: b */
    public final float mo3418b(C0660g gVar) {
        int i = this.f2576i;
        int i2 = 0;
        while (i != -1 && i2 < this.f2568a) {
            if (this.f2573f[i] == gVar.f2655b) {
                return this.f2575h[i];
            }
            i = this.f2574g[i];
            i2++;
        }
        return 0.0f;
    }

    /* renamed from: b */
    public void mo3419b() {
        int i = this.f2568a;
        System.out.print("{ ");
        for (int i2 = 0; i2 < i; i2++) {
            C0660g a = mo3407a(i2);
            if (a != null) {
                PrintStream printStream = System.out;
                StringBuilder sb = new StringBuilder();
                sb.append(a);
                sb.append(" = ");
                sb.append(mo3417b(i2));
                sb.append(C3868i.f12248b);
                printStream.print(sb.toString());
            }
        }
        System.out.println(" }");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo3415a(C0660g gVar, float f, boolean z) {
        if (f != 0.0f) {
            int i = this.f2576i;
            if (i == -1) {
                this.f2576i = 0;
                float[] fArr = this.f2575h;
                int i2 = this.f2576i;
                fArr[i2] = f;
                this.f2573f[i2] = gVar.f2655b;
                this.f2574g[i2] = -1;
                gVar.f2663j++;
                gVar.mo3495a(this.f2569b);
                this.f2568a++;
                if (!this.f2578k) {
                    this.f2577j++;
                    int i3 = this.f2577j;
                    int[] iArr = this.f2573f;
                    if (i3 >= iArr.length) {
                        this.f2578k = true;
                        this.f2577j = iArr.length - 1;
                    }
                }
                return;
            }
            int i4 = 0;
            int i5 = -1;
            while (i != -1 && i4 < this.f2568a) {
                int[] iArr2 = this.f2573f;
                int i6 = iArr2[i];
                int i7 = gVar.f2655b;
                if (i6 == i7) {
                    float[] fArr2 = this.f2575h;
                    fArr2[i] = fArr2[i] + f;
                    if (fArr2[i] == 0.0f) {
                        if (i == this.f2576i) {
                            this.f2576i = this.f2574g[i];
                        } else {
                            int[] iArr3 = this.f2574g;
                            iArr3[i5] = iArr3[i];
                        }
                        if (z) {
                            gVar.mo3499b(this.f2569b);
                        }
                        if (this.f2578k) {
                            this.f2577j = i;
                        }
                        gVar.f2663j--;
                        this.f2568a--;
                    }
                    return;
                }
                if (iArr2[i] < i7) {
                    i5 = i;
                }
                i = this.f2574g[i];
                i4++;
            }
            int i8 = this.f2577j;
            int i9 = i8 + 1;
            if (this.f2578k) {
                int[] iArr4 = this.f2573f;
                if (iArr4[i8] != -1) {
                    i8 = iArr4.length;
                }
            } else {
                i8 = i9;
            }
            int[] iArr5 = this.f2573f;
            if (i8 >= iArr5.length && this.f2568a < iArr5.length) {
                int i10 = 0;
                while (true) {
                    int[] iArr6 = this.f2573f;
                    if (i10 >= iArr6.length) {
                        break;
                    } else if (iArr6[i10] == -1) {
                        i8 = i10;
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            int[] iArr7 = this.f2573f;
            if (i8 >= iArr7.length) {
                i8 = iArr7.length;
                this.f2571d *= 2;
                this.f2578k = false;
                this.f2577j = i8 - 1;
                this.f2575h = Arrays.copyOf(this.f2575h, this.f2571d);
                this.f2573f = Arrays.copyOf(this.f2573f, this.f2571d);
                this.f2574g = Arrays.copyOf(this.f2574g, this.f2571d);
            }
            this.f2573f[i8] = gVar.f2655b;
            this.f2575h[i8] = f;
            if (i5 != -1) {
                int[] iArr8 = this.f2574g;
                iArr8[i8] = iArr8[i5];
                iArr8[i5] = i8;
            } else {
                this.f2574g[i8] = this.f2576i;
                this.f2576i = i8;
            }
            gVar.f2663j++;
            gVar.mo3495a(this.f2569b);
            this.f2568a++;
            if (!this.f2578k) {
                this.f2577j++;
            }
            int i11 = this.f2577j;
            int[] iArr9 = this.f2573f;
            if (i11 >= iArr9.length) {
                this.f2578k = true;
                this.f2577j = iArr9.length - 1;
            }
        }
    }

    /* renamed from: a */
    public final float mo3406a(C0660g gVar, boolean z) {
        if (this.f2572e == gVar) {
            this.f2572e = null;
        }
        int i = this.f2576i;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f2568a) {
            if (this.f2573f[i] == gVar.f2655b) {
                if (i == this.f2576i) {
                    this.f2576i = this.f2574g[i];
                } else {
                    int[] iArr = this.f2574g;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    gVar.mo3499b(this.f2569b);
                }
                gVar.f2663j--;
                this.f2568a--;
                this.f2573f[i] = -1;
                if (this.f2578k) {
                    this.f2577j = i;
                }
                return this.f2575h[i];
            }
            i2++;
            i3 = i;
            i = this.f2574g[i];
        }
        return 0.0f;
    }

    /* renamed from: a */
    public final void mo3410a() {
        int i = this.f2576i;
        int i2 = 0;
        while (i != -1 && i2 < this.f2568a) {
            C0660g gVar = this.f2570c.mIndexedVariables[this.f2573f[i]];
            if (gVar != null) {
                gVar.mo3499b(this.f2569b);
            }
            i = this.f2574g[i];
            i2++;
        }
        this.f2576i = -1;
        this.f2577j = -1;
        this.f2578k = false;
        this.f2568a = 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo3416a(C0660g gVar) {
        int i = this.f2576i;
        if (i == -1) {
            return false;
        }
        int i2 = 0;
        while (i != -1 && i2 < this.f2568a) {
            if (this.f2573f[i] == gVar.f2655b) {
                return true;
            }
            i = this.f2574g[i];
            i2++;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3411a(float f) {
        int i = this.f2576i;
        int i2 = 0;
        while (i != -1 && i2 < this.f2568a) {
            float[] fArr = this.f2575h;
            fArr[i] = fArr[i] / f;
            i = this.f2574g[i];
            i2++;
        }
    }

    /* renamed from: a */
    private boolean m3508a(C0660g gVar, C0654d dVar) {
        return gVar.f2663j <= 1;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x008f A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.constraintlayout.solver.C0660g mo3408a(androidx.constraintlayout.solver.C0654d r15) {
        /*
            r14 = this;
            int r0 = r14.f2576i
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = r1
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
        L_0x000a:
            r9 = -1
            if (r0 == r9) goto L_0x0097
            int r9 = r14.f2568a
            if (r2 >= r9) goto L_0x0097
            float[] r9 = r14.f2575h
            r10 = r9[r0]
            r11 = 981668463(0x3a83126f, float:0.001)
            androidx.constraintlayout.solver.Cache r12 = r14.f2570c
            androidx.constraintlayout.solver.g[] r12 = r12.mIndexedVariables
            int[] r13 = r14.f2573f
            r13 = r13[r0]
            r12 = r12[r13]
            int r13 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r13 >= 0) goto L_0x0035
            r11 = -1165815185(0xffffffffba83126f, float:-0.001)
            int r11 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r11 <= 0) goto L_0x0041
            r9[r0] = r3
            androidx.constraintlayout.solver.b r9 = r14.f2569b
            r12.mo3499b(r9)
            goto L_0x0040
        L_0x0035:
            int r11 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r11 >= 0) goto L_0x0041
            r9[r0] = r3
            androidx.constraintlayout.solver.b r9 = r14.f2569b
            r12.mo3499b(r9)
        L_0x0040:
            r10 = 0
        L_0x0041:
            r9 = 1
            int r11 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r11 == 0) goto L_0x008f
            androidx.constraintlayout.solver.g$b r11 = r12.f2660g
            androidx.constraintlayout.solver.g$b r13 = androidx.constraintlayout.solver.C0660g.C0662b.UNRESTRICTED
            if (r11 != r13) goto L_0x006b
            if (r4 != 0) goto L_0x0056
            boolean r4 = r14.m3508a(r12, r15)
        L_0x0052:
            r6 = r4
            r5 = r10
            r4 = r12
            goto L_0x008f
        L_0x0056:
            int r11 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r11 <= 0) goto L_0x005f
            boolean r4 = r14.m3508a(r12, r15)
            goto L_0x0052
        L_0x005f:
            if (r6 != 0) goto L_0x008f
            boolean r11 = r14.m3508a(r12, r15)
            if (r11 == 0) goto L_0x008f
            r5 = r10
            r4 = r12
            r6 = 1
            goto L_0x008f
        L_0x006b:
            if (r4 != 0) goto L_0x008f
            int r11 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r11 >= 0) goto L_0x008f
            if (r1 != 0) goto L_0x007b
            boolean r1 = r14.m3508a(r12, r15)
        L_0x0077:
            r8 = r1
            r7 = r10
            r1 = r12
            goto L_0x008f
        L_0x007b:
            int r11 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r11 <= 0) goto L_0x0084
            boolean r1 = r14.m3508a(r12, r15)
            goto L_0x0077
        L_0x0084:
            if (r8 != 0) goto L_0x008f
            boolean r11 = r14.m3508a(r12, r15)
            if (r11 == 0) goto L_0x008f
            r7 = r10
            r1 = r12
            r8 = 1
        L_0x008f:
            int[] r9 = r14.f2574g
            r0 = r9[r0]
            int r2 = r2 + 1
            goto L_0x000a
        L_0x0097:
            if (r4 == 0) goto L_0x009a
            return r4
        L_0x009a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.C0651a.mo3408a(androidx.constraintlayout.solver.d):androidx.constraintlayout.solver.g");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo3412a(C0652b bVar, C0652b bVar2, boolean z) {
        int i = this.f2576i;
        while (true) {
            int i2 = 0;
            while (i != -1 && i2 < this.f2568a) {
                int i3 = this.f2573f[i];
                C0660g gVar = bVar2.f2581a;
                if (i3 == gVar.f2655b) {
                    float f = this.f2575h[i];
                    mo3406a(gVar, z);
                    C0651a aVar = bVar2.f2584d;
                    int i4 = aVar.f2576i;
                    int i5 = 0;
                    while (i4 != -1 && i5 < aVar.f2568a) {
                        mo3415a(this.f2570c.mIndexedVariables[aVar.f2573f[i4]], aVar.f2575h[i4] * f, z);
                        i4 = aVar.f2574g[i4];
                        i5++;
                    }
                    bVar.f2582b += bVar2.f2582b * f;
                    if (z) {
                        bVar2.f2581a.mo3499b(bVar);
                    }
                    i = this.f2576i;
                } else {
                    i = this.f2574g[i];
                    i2++;
                }
            }
            return;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3413a(C0652b bVar, C0652b[] bVarArr) {
        int i = this.f2576i;
        while (true) {
            int i2 = 0;
            while (i != -1 && i2 < this.f2568a) {
                C0660g gVar = this.f2570c.mIndexedVariables[this.f2573f[i]];
                if (gVar.f2656c != -1) {
                    float f = this.f2575h[i];
                    mo3406a(gVar, true);
                    C0652b bVar2 = bVarArr[gVar.f2656c];
                    if (!bVar2.f2585e) {
                        C0651a aVar = bVar2.f2584d;
                        int i3 = aVar.f2576i;
                        int i4 = 0;
                        while (i3 != -1 && i4 < aVar.f2568a) {
                            mo3415a(this.f2570c.mIndexedVariables[aVar.f2573f[i3]], aVar.f2575h[i3] * f, true);
                            i3 = aVar.f2574g[i3];
                            i4++;
                        }
                    }
                    bVar.f2582b += bVar2.f2582b * f;
                    bVar2.f2581a.mo3499b(bVar);
                    i = this.f2576i;
                } else {
                    i = this.f2574g[i];
                    i2++;
                }
            }
            return;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0660g mo3409a(boolean[] zArr, C0660g gVar) {
        int i = this.f2576i;
        int i2 = 0;
        C0660g gVar2 = null;
        float f = 0.0f;
        while (i != -1 && i2 < this.f2568a) {
            if (this.f2575h[i] < 0.0f) {
                C0660g gVar3 = this.f2570c.mIndexedVariables[this.f2573f[i]];
                if ((zArr == null || !zArr[gVar3.f2655b]) && gVar3 != gVar) {
                    C0662b bVar = gVar3.f2660g;
                    if (bVar == C0662b.SLACK || bVar == C0662b.ERROR) {
                        float f2 = this.f2575h[i];
                        if (f2 < f) {
                            gVar2 = gVar3;
                            f = f2;
                        }
                    }
                }
            }
            i = this.f2574g[i];
            i2++;
        }
        return gVar2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C0660g mo3407a(int i) {
        int i2 = this.f2576i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f2568a) {
            if (i3 == i) {
                return this.f2570c.mIndexedVariables[this.f2573f[i2]];
            }
            i2 = this.f2574g[i2];
            i3++;
        }
        return null;
    }
}
