package androidx.constraintlayout.solver;

import androidx.constraintlayout.solver.C0660g.C0662b;

/* renamed from: androidx.constraintlayout.solver.b */
/* compiled from: ArrayRow */
public class C0652b implements C0655a {

    /* renamed from: f */
    private static final boolean f2579f = false;

    /* renamed from: g */
    private static final float f2580g = 0.001f;

    /* renamed from: a */
    C0660g f2581a = null;

    /* renamed from: b */
    float f2582b = 0.0f;

    /* renamed from: c */
    boolean f2583c = false;

    /* renamed from: d */
    public final C0651a f2584d;

    /* renamed from: e */
    boolean f2585e = false;

    public C0652b(Cache cache) {
        this.f2584d = new C0651a(this, cache);
    }

    /* renamed from: a */
    public C0652b mo3430a(C0660g gVar, C0660g gVar2, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f2582b = (float) i;
        }
        if (!z) {
            this.f2584d.mo3414a(gVar, -1.0f);
            this.f2584d.mo3414a(gVar2, 1.0f);
        } else {
            this.f2584d.mo3414a(gVar, 1.0f);
            this.f2584d.mo3414a(gVar2, -1.0f);
        }
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo3443b() {
        C0660g gVar = this.f2581a;
        return gVar != null && (gVar.f2660g == C0662b.UNRESTRICTED || this.f2582b >= 0.0f);
    }

    /* renamed from: c */
    public void mo3447c() {
        this.f2581a = null;
        this.f2584d.mo3410a();
        this.f2582b = 0.0f;
        this.f2585e = false;
    }

    public void clear() {
        this.f2584d.mo3410a();
        this.f2581a = null;
        this.f2582b = 0.0f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public int mo3449d() {
        return (this.f2581a != null ? 4 : 0) + 4 + 4 + this.f2584d.mo3423f();
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00d0  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo3451e() {
        /*
            r9 = this;
            androidx.constraintlayout.solver.g r0 = r9.f2581a
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0018
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "0"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L_0x0029
        L_0x0018:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            androidx.constraintlayout.solver.g r1 = r9.f2581a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L_0x0029:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " = "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r1 = r9.f2582b
            r2 = 0
            r3 = 1
            r4 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x0056
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r9.f2582b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 1
            goto L_0x0057
        L_0x0056:
            r1 = 0
        L_0x0057:
            androidx.constraintlayout.solver.a r5 = r9.f2584d
            int r5 = r5.f2568a
        L_0x005b:
            if (r2 >= r5) goto L_0x00ec
            androidx.constraintlayout.solver.a r6 = r9.f2584d
            androidx.constraintlayout.solver.g r6 = r6.mo3407a(r2)
            if (r6 != 0) goto L_0x0067
            goto L_0x00e8
        L_0x0067:
            androidx.constraintlayout.solver.a r7 = r9.f2584d
            float r7 = r7.mo3417b(r2)
            int r8 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r8 != 0) goto L_0x0073
            goto L_0x00e8
        L_0x0073:
            java.lang.String r6 = r6.toString()
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L_0x0091
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 >= 0) goto L_0x00ba
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "- "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x00b8
        L_0x0091:
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 <= 0) goto L_0x00a7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " + "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x00ba
        L_0x00a7:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " - "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x00b8:
            float r7 = r7 * r8
        L_0x00ba:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x00d0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            goto L_0x00e7
        L_0x00d0:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L_0x00e7:
            r1 = 1
        L_0x00e8:
            int r2 = r2 + 1
            goto L_0x005b
        L_0x00ec:
            if (r1 != 0) goto L_0x00ff
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "0.0"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x00ff:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.C0652b.mo3451e():java.lang.String");
    }

    public C0660g getKey() {
        return this.f2581a;
    }

    public boolean isEmpty() {
        return this.f2581a == null && this.f2582b == 0.0f && this.f2584d.f2568a == 0;
    }

    public String toString() {
        return mo3451e();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo3444b(C0660g gVar) {
        return this.f2584d.mo3416a(gVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C0652b mo3440b(C0660g gVar, int i) {
        this.f2581a = gVar;
        float f = (float) i;
        gVar.f2658e = f;
        this.f2582b = f;
        this.f2585e = true;
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo3450d(C0660g gVar) {
        C0660g gVar2 = this.f2581a;
        if (gVar2 != null) {
            this.f2584d.mo3414a(gVar2, -1.0f);
            this.f2581a = null;
        }
        float a = this.f2584d.mo3406a(gVar, true) * -1.0f;
        this.f2581a = gVar;
        if (a != 1.0f) {
            this.f2582b /= a;
            this.f2584d.mo3411a(a);
        }
    }

    /* renamed from: c */
    public C0652b mo3445c(C0660g gVar, int i) {
        if (i < 0) {
            this.f2582b = (float) (i * -1);
            this.f2584d.mo3414a(gVar, 1.0f);
        } else {
            this.f2582b = (float) i;
            this.f2584d.mo3414a(gVar, -1.0f);
        }
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0652b mo3428a(C0660g gVar, int i) {
        this.f2584d.mo3414a(gVar, (float) i);
        return this;
    }

    /* renamed from: a */
    public C0652b mo3433a(C0660g gVar, C0660g gVar2, C0660g gVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f2582b = (float) i;
        }
        if (!z) {
            this.f2584d.mo3414a(gVar, -1.0f);
            this.f2584d.mo3414a(gVar2, 1.0f);
            this.f2584d.mo3414a(gVar3, 1.0f);
        } else {
            this.f2584d.mo3414a(gVar, 1.0f);
            this.f2584d.mo3414a(gVar2, -1.0f);
            this.f2584d.mo3414a(gVar3, -1.0f);
        }
        return this;
    }

    /* renamed from: b */
    public C0652b mo3441b(C0660g gVar, C0660g gVar2, C0660g gVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f2582b = (float) i;
        }
        if (!z) {
            this.f2584d.mo3414a(gVar, -1.0f);
            this.f2584d.mo3414a(gVar2, 1.0f);
            this.f2584d.mo3414a(gVar3, -1.0f);
        } else {
            this.f2584d.mo3414a(gVar, 1.0f);
            this.f2584d.mo3414a(gVar2, -1.0f);
            this.f2584d.mo3414a(gVar3, 1.0f);
        }
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public C0660g mo3446c(C0660g gVar) {
        return this.f2584d.mo3409a((boolean[]) null, gVar);
    }

    /* renamed from: a */
    public C0652b mo3429a(C0660g gVar, int i, C0660g gVar2) {
        this.f2582b = (float) i;
        this.f2584d.mo3414a(gVar, -1.0f);
        return this;
    }

    /* renamed from: b */
    public C0652b mo3442b(C0660g gVar, C0660g gVar2, C0660g gVar3, C0660g gVar4, float f) {
        this.f2584d.mo3414a(gVar3, 0.5f);
        this.f2584d.mo3414a(gVar4, 0.5f);
        this.f2584d.mo3414a(gVar, -0.5f);
        this.f2584d.mo3414a(gVar2, -0.5f);
        this.f2582b = -f;
        return this;
    }

    /* renamed from: a */
    public C0652b mo3426a(float f, float f2, float f3, C0660g gVar, C0660g gVar2, C0660g gVar3, C0660g gVar4) {
        this.f2582b = 0.0f;
        if (f2 == 0.0f || f == f3) {
            this.f2584d.mo3414a(gVar, 1.0f);
            this.f2584d.mo3414a(gVar2, -1.0f);
            this.f2584d.mo3414a(gVar4, 1.0f);
            this.f2584d.mo3414a(gVar3, -1.0f);
        } else if (f == 0.0f) {
            this.f2584d.mo3414a(gVar, 1.0f);
            this.f2584d.mo3414a(gVar2, -1.0f);
        } else if (f3 == 0.0f) {
            this.f2584d.mo3414a(gVar3, 1.0f);
            this.f2584d.mo3414a(gVar4, -1.0f);
        } else {
            float f4 = (f / f2) / (f3 / f2);
            this.f2584d.mo3414a(gVar, 1.0f);
            this.f2584d.mo3414a(gVar2, -1.0f);
            this.f2584d.mo3414a(gVar4, f4);
            this.f2584d.mo3414a(gVar3, -f4);
        }
        return this;
    }

    /* renamed from: a */
    public C0652b mo3425a(float f, float f2, float f3, C0660g gVar, int i, C0660g gVar2, int i2, C0660g gVar3, int i3, C0660g gVar4, int i4) {
        if (f2 == 0.0f || f == f3) {
            this.f2582b = (float) (((-i) - i2) + i3 + i4);
            this.f2584d.mo3414a(gVar, 1.0f);
            this.f2584d.mo3414a(gVar2, -1.0f);
            this.f2584d.mo3414a(gVar4, 1.0f);
            this.f2584d.mo3414a(gVar3, -1.0f);
        } else {
            float f4 = (f / f2) / (f3 / f2);
            this.f2582b = ((float) ((-i) - i2)) + (((float) i3) * f4) + (((float) i4) * f4);
            this.f2584d.mo3414a(gVar, 1.0f);
            this.f2584d.mo3414a(gVar2, -1.0f);
            this.f2584d.mo3414a(gVar4, f4);
            this.f2584d.mo3414a(gVar3, -f4);
        }
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0652b mo3431a(C0660g gVar, C0660g gVar2, int i, float f, C0660g gVar3, C0660g gVar4, int i2) {
        if (gVar2 == gVar3) {
            this.f2584d.mo3414a(gVar, 1.0f);
            this.f2584d.mo3414a(gVar4, 1.0f);
            this.f2584d.mo3414a(gVar2, -2.0f);
            return this;
        }
        if (f == 0.5f) {
            this.f2584d.mo3414a(gVar, 1.0f);
            this.f2584d.mo3414a(gVar2, -1.0f);
            this.f2584d.mo3414a(gVar3, -1.0f);
            this.f2584d.mo3414a(gVar4, 1.0f);
            if (i > 0 || i2 > 0) {
                this.f2582b = (float) ((-i) + i2);
            }
        } else if (f <= 0.0f) {
            this.f2584d.mo3414a(gVar, -1.0f);
            this.f2584d.mo3414a(gVar2, 1.0f);
            this.f2582b = (float) i;
        } else if (f >= 1.0f) {
            this.f2584d.mo3414a(gVar3, -1.0f);
            this.f2584d.mo3414a(gVar4, 1.0f);
            this.f2582b = (float) i2;
        } else {
            float f2 = 1.0f - f;
            this.f2584d.mo3414a(gVar, f2 * 1.0f);
            this.f2584d.mo3414a(gVar2, f2 * -1.0f);
            this.f2584d.mo3414a(gVar3, -1.0f * f);
            this.f2584d.mo3414a(gVar4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                this.f2582b = (((float) (-i)) * f2) + (((float) i2) * f);
            }
        }
        return this;
    }

    /* renamed from: a */
    public C0652b mo3427a(C0654d dVar, int i) {
        this.f2584d.mo3414a(dVar.mo3459a(i, "ep"), 1.0f);
        this.f2584d.mo3414a(dVar.mo3459a(i, "em"), -1.0f);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0652b mo3432a(C0660g gVar, C0660g gVar2, C0660g gVar3, float f) {
        this.f2584d.mo3414a(gVar, -1.0f);
        this.f2584d.mo3414a(gVar2, 1.0f - f);
        this.f2584d.mo3414a(gVar3, f);
        return this;
    }

    /* renamed from: a */
    public C0652b mo3434a(C0660g gVar, C0660g gVar2, C0660g gVar3, C0660g gVar4, float f) {
        this.f2584d.mo3414a(gVar, -1.0f);
        this.f2584d.mo3414a(gVar2, 1.0f);
        this.f2584d.mo3414a(gVar3, f);
        this.f2584d.mo3414a(gVar4, -f);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3436a() {
        float f = this.f2582b;
        if (f < 0.0f) {
            this.f2582b = f * -1.0f;
            this.f2584d.mo3422e();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo3439a(C0654d dVar) {
        boolean z;
        C0660g a = this.f2584d.mo3408a(dVar);
        if (a == null) {
            z = true;
        } else {
            mo3450d(a);
            z = false;
        }
        if (this.f2584d.f2568a == 0) {
            this.f2585e = true;
        }
        return z;
    }

    /* renamed from: a */
    public C0660g mo3435a(C0654d dVar, boolean[] zArr) {
        return this.f2584d.mo3409a(zArr, (C0660g) null);
    }

    /* renamed from: a */
    public void mo3437a(C0655a aVar) {
        if (aVar instanceof C0652b) {
            C0652b bVar = (C0652b) aVar;
            this.f2581a = null;
            this.f2584d.mo3410a();
            int i = 0;
            while (true) {
                C0651a aVar2 = bVar.f2584d;
                if (i < aVar2.f2568a) {
                    this.f2584d.mo3415a(aVar2.mo3407a(i), bVar.f2584d.mo3417b(i), true);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo3438a(C0660g gVar) {
        int i = gVar.f2657d;
        float f = 1.0f;
        if (i != 1) {
            if (i == 2) {
                f = 1000.0f;
            } else if (i == 3) {
                f = 1000000.0f;
            } else if (i == 4) {
                f = 1.0E9f;
            } else if (i == 5) {
                f = 1.0E12f;
            }
        }
        this.f2584d.mo3414a(gVar, f);
    }
}
