package com.google.zxing;

import com.google.zxing.p335u.p336m.C9055a;

/* renamed from: com.google.zxing.p */
/* compiled from: ResultPoint */
public class C8987p {

    /* renamed from: a */
    private final float f23500a;

    /* renamed from: b */
    private final float f23501b;

    public C8987p(float f, float f2) {
        this.f23500a = f;
        this.f23501b = f2;
    }

    /* renamed from: a */
    public final float mo32830a() {
        return this.f23500a;
    }

    /* renamed from: b */
    public final float mo32831b() {
        return this.f23501b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C8987p) {
            C8987p pVar = (C8987p) obj;
            if (this.f23500a == pVar.f23500a && this.f23501b == pVar.f23501b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f23500a) * 31) + Float.floatToIntBits(this.f23501b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.f23500a);
        sb.append(',');
        sb.append(this.f23501b);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: a */
    public static void m41992a(C8987p[] pVarArr) {
        C8987p pVar;
        C8987p pVar2;
        C8987p pVar3;
        float a = m41990a(pVarArr[0], pVarArr[1]);
        float a2 = m41990a(pVarArr[1], pVarArr[2]);
        float a3 = m41990a(pVarArr[0], pVarArr[2]);
        if (a2 >= a && a2 >= a3) {
            pVar3 = pVarArr[0];
            pVar2 = pVarArr[1];
            pVar = pVarArr[2];
        } else if (a3 < a2 || a3 < a) {
            pVar3 = pVarArr[2];
            pVar2 = pVarArr[0];
            pVar = pVarArr[1];
        } else {
            pVar3 = pVarArr[1];
            pVar2 = pVarArr[0];
            pVar = pVarArr[2];
        }
        if (m41991a(pVar2, pVar3, pVar) < 0.0f) {
            C8987p pVar4 = pVar;
            pVar = pVar2;
            pVar2 = pVar4;
        }
        pVarArr[0] = pVar2;
        pVarArr[1] = pVar3;
        pVarArr[2] = pVar;
    }

    /* renamed from: a */
    public static float m41990a(C8987p pVar, C8987p pVar2) {
        return C9055a.m42368a(pVar.f23500a, pVar.f23501b, pVar2.f23500a, pVar2.f23501b);
    }

    /* renamed from: a */
    private static float m41991a(C8987p pVar, C8987p pVar2, C8987p pVar3) {
        float f = pVar2.f23500a;
        float f2 = pVar2.f23501b;
        return ((pVar3.f23500a - f) * (pVar.f23501b - f2)) - ((pVar3.f23501b - f2) * (pVar.f23500a - f));
    }
}
