package androidx.constraintlayout.solver.p014h;

import java.util.Arrays;

/* renamed from: androidx.constraintlayout.solver.h.l */
/* compiled from: Helper */
public class C0685l extends C0677h {

    /* renamed from: c1 */
    protected C0677h[] f2891c1 = new C0677h[4];

    /* renamed from: d1 */
    protected int f2892d1 = 0;

    /* renamed from: f */
    public void mo3751f(C0677h hVar) {
        int i = this.f2892d1 + 1;
        C0677h[] hVarArr = this.f2891c1;
        if (i > hVarArr.length) {
            this.f2891c1 = (C0677h[]) Arrays.copyOf(hVarArr, hVarArr.length * 2);
        }
        C0677h[] hVarArr2 = this.f2891c1;
        int i2 = this.f2892d1;
        hVarArr2[i2] = hVar;
        this.f2892d1 = i2 + 1;
    }

    /* renamed from: r0 */
    public void mo3742r0() {
        this.f2892d1 = 0;
    }
}
