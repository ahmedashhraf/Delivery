package com.instabug.library.annotation.p380a;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import p205i.p471b.p472a.p473a.p474c.C13938g;

@SuppressFBWarnings({"EQ_COMPARETO_USE_OBJECT_EQUALS", "UUF_UNUSED_FIELD", "URF_UNREAD_FIELD"})
/* renamed from: com.instabug.library.annotation.a.g */
/* compiled from: Weight */
public class C9745g implements Comparable<C9745g> {

    /* renamed from: X */
    private static transient /* synthetic */ boolean[] f25836X;

    /* renamed from: N */
    float f25837N;

    /* renamed from: O */
    float f25838O;

    /* renamed from: P */
    float f25839P;

    /* renamed from: Q */
    float f25840Q;

    /* renamed from: R */
    float f25841R;

    /* renamed from: S */
    int f25842S;

    /* renamed from: T */
    int f25843T;

    /* renamed from: U */
    int f25844U;

    /* renamed from: V */
    int f25845V;

    /* renamed from: W */
    float f25846W;

    /* renamed from: a */
    int f25847a;

    /* renamed from: b */
    int f25848b;

    /* renamed from: com.instabug.library.annotation.a.g$a */
    /* compiled from: Weight */
    public enum C9746a {
        LEFT,
        TOP,
        RIGHT,
        BOTTOM;

        static {
            boolean[] d;
            d[3] = true;
        }
    }

    public C9745g() {
        m45405c()[0] = true;
    }

    /* renamed from: c */
    private static /* synthetic */ boolean[] m45405c() {
        boolean[] zArr = f25836X;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(5354173172155524598L, "com/instabug/library/annotation/recognition/Weight", 9);
        f25836X = a;
        return a;
    }

    /* renamed from: a */
    public int mo34760a(C9745g gVar) {
        boolean[] c = m45405c();
        int i = gVar.f25847a;
        int i2 = this.f25847a;
        if (i > i2) {
            c[5] = true;
            return -1;
        } else if (i < i2) {
            c[6] = true;
            return 1;
        } else {
            c[7] = true;
            return 0;
        }
    }

    /* renamed from: b */
    public C9746a mo34761b() {
        boolean[] c = m45405c();
        if (this.f25845V > this.f25843T) {
            C9746a aVar = C9746a.BOTTOM;
            c[1] = true;
            return aVar;
        }
        C9746a aVar2 = C9746a.TOP;
        c[2] = true;
        return aVar2;
    }

    public /* synthetic */ int compareTo(Object obj) {
        boolean[] c = m45405c();
        int a = mo34760a((C9745g) obj);
        c[8] = true;
        return a;
    }
}
