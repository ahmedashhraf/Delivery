package com.instabug.library.annotation.p380a;

import android.graphics.Path;
import com.instabug.library.annotation.p380a.C9742e.C9743a;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.annotation.a.c */
/* compiled from: PathRecognizer */
public class C9739c {

    /* renamed from: a */
    private static transient /* synthetic */ boolean[] f25826a;

    /* renamed from: com.instabug.library.annotation.a.c$a */
    /* compiled from: PathRecognizer */
    public static class C9740a {

        /* renamed from: d */
        private static transient /* synthetic */ boolean[] f25827d;

        /* renamed from: a */
        public C9743a f25828a;

        /* renamed from: b */
        public int f25829b;

        /* renamed from: c */
        public float f25830c;

        public C9740a() {
            m45399a()[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45399a() {
            boolean[] zArr = f25827d;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(4455338881352545183L, "com/instabug/library/annotation/recognition/PathRecognizer$Recognition", 1);
            f25827d = a;
            return a;
        }
    }

    public C9739c() {
        m45397a()[0] = true;
    }

    /* renamed from: a */
    private static /* synthetic */ boolean[] m45397a() {
        boolean[] zArr = f25826a;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(272278096974530386L, "com/instabug/library/annotation/recognition/PathRecognizer", 27);
        f25826a = a;
        return a;
    }

    /* renamed from: a */
    public C9740a mo34759a(Path path) {
        boolean[] a = m45397a();
        C9740a aVar = new C9740a();
        a[1] = true;
        C9737a aVar2 = new C9737a(path);
        a[2] = true;
        C9745g a2 = aVar2.mo34758a(C9743a.OVAL);
        a[3] = true;
        C9745g a3 = aVar2.mo34757a();
        a[4] = true;
        C9745g a4 = aVar2.mo34758a(C9743a.RECT);
        float f = a3.f25837N;
        if (f <= a4.f25837N) {
            a[5] = true;
        } else if (f <= a2.f25837N) {
            a[6] = true;
        } else {
            if (a3.f25840Q > 0.5f) {
                a[7] = true;
            } else if (a3.f25841R > 0.5f) {
                a[8] = true;
            } else {
                if (a3.f25846W < 100.0f) {
                    a[10] = true;
                    if (Math.abs(a3.f25843T - a3.f25845V) >= 10) {
                        a[11] = true;
                    } else {
                        int i = a3.f25844U - a3.f25842S;
                        a[12] = true;
                        if (Math.abs(i) >= 10) {
                            a[13] = true;
                        } else {
                            aVar.f25828a = C9743a.LINE;
                            a[14] = true;
                            aVar.f25829b = a3.f25848b;
                            a[16] = true;
                        }
                    }
                    aVar.f25828a = C9743a.ARROW;
                    a[15] = true;
                    aVar.f25829b = a3.f25848b;
                    a[16] = true;
                } else {
                    aVar.f25828a = C9743a.NONE;
                    a[17] = true;
                }
                a[26] = true;
                return aVar;
            }
            aVar.f25828a = C9743a.NONE;
            a[9] = true;
            a[26] = true;
            return aVar;
        }
        if (a4.f25837N > a2.f25837N) {
            if (a4.f25840Q > 0.5f) {
                a[18] = true;
            } else if (a4.f25841R > 0.5f) {
                a[19] = true;
            } else {
                aVar.f25828a = C9743a.RECT;
                aVar.f25829b = a4.f25848b;
                aVar.f25830c = a4.f25839P;
                a[21] = true;
            }
            aVar.f25828a = C9743a.NONE;
            a[20] = true;
        } else {
            if (a2.f25840Q > 0.5f) {
                a[22] = true;
            } else if (a2.f25841R > 0.5f) {
                a[23] = true;
            } else {
                aVar.f25828a = C9743a.OVAL;
                aVar.f25829b = a2.f25848b;
                aVar.f25830c = a2.f25839P;
                a[25] = true;
            }
            aVar.f25828a = C9743a.NONE;
            a[24] = true;
        }
        a[26] = true;
        return aVar;
    }
}
