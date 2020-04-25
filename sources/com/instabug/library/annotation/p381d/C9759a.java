package com.instabug.library.annotation.p381d;

import java.io.Serializable;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.annotation.d.a */
/* compiled from: AspectRatioCalculator */
public class C9759a implements Serializable {

    /* renamed from: P */
    private static transient /* synthetic */ boolean[] f25893P;

    /* renamed from: N */
    private float f25894N = 0.0f;

    /* renamed from: O */
    private float f25895O = 0.0f;

    /* renamed from: a */
    private float f25896a = 0.0f;

    /* renamed from: b */
    private float f25897b = 0.0f;

    public C9759a() {
        boolean[] e = m45503e();
        e[0] = true;
    }

    /* renamed from: e */
    private static /* synthetic */ boolean[] m45503e() {
        boolean[] zArr = f25893P;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-1217145017610308600L, "com/instabug/library/annotation/utility/AspectRatioCalculator", 19);
        f25893P = a;
        return a;
    }

    /* renamed from: a */
    public float mo34800a() {
        float f;
        boolean[] e = m45503e();
        float f2 = this.f25894N;
        if (f2 == 0.0f) {
            e[1] = true;
        } else {
            float f3 = this.f25896a;
            if (f3 == 0.0f) {
                e[2] = true;
            } else {
                f = f2 / f3;
                e[4] = true;
                e[5] = true;
                return f;
            }
        }
        f = 1.0f;
        e[3] = true;
        e[5] = true;
        return f;
    }

    /* renamed from: b */
    public void mo34802b(float f) {
        boolean[] e = m45503e();
        this.f25897b = f;
        e[14] = true;
    }

    /* renamed from: c */
    public void mo34803c(float f) {
        boolean[] e = m45503e();
        mo34801a(this.f25894N);
        this.f25894N = f;
        e[16] = true;
    }

    /* renamed from: d */
    public float mo34804d() {
        float f;
        boolean[] e = m45503e();
        float f2 = this.f25895O;
        if (f2 == 0.0f) {
            e[6] = true;
        } else {
            float f3 = this.f25897b;
            if (f3 == 0.0f) {
                e[7] = true;
            } else {
                f = f2 / f3;
                e[9] = true;
                e[10] = true;
                return f;
            }
        }
        f = 1.0f;
        e[8] = true;
        e[10] = true;
        return f;
    }

    /* renamed from: a */
    public void mo34801a(float f) {
        boolean[] e = m45503e();
        this.f25896a = f;
        e[12] = true;
    }

    /* renamed from: d */
    public void mo34805d(float f) {
        boolean[] e = m45503e();
        mo34802b(this.f25895O);
        this.f25895O = f;
        e[18] = true;
    }
}
