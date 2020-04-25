package p076c.p082c.p083a.p084a0;

import android.view.View;
import java.util.Arrays;
import p076c.p082c.p083a.C2236n.C2240d;
import p076c.p082c.p083a.p108y.p109i.C2535c;
import p076c.p082c.p083a.p108y.p110j.C2558k;
import p076c.p082c.p083a.p108y.p110j.C2562n;

/* renamed from: c.c.a.a0.j */
/* compiled from: ViewPreloadSizeProvider */
public class C2218j<T> implements C2240d<T>, C2558k {

    /* renamed from: a */
    private int[] f8777a;

    /* renamed from: b */
    private C2219a f8778b;

    /* renamed from: c.c.a.a0.j$a */
    /* compiled from: ViewPreloadSizeProvider */
    private static final class C2219a extends C2562n<View, Object> {
        public C2219a(View view, C2558k kVar) {
            super(view);
            mo9506a(kVar);
        }

        /* renamed from: a */
        public void mo9404a(Object obj, C2535c cVar) {
        }
    }

    public C2218j() {
    }

    /* renamed from: a */
    public int[] mo9380a(T t, int i, int i2) {
        int[] iArr = this.f8777a;
        if (iArr == null) {
            return null;
        }
        return Arrays.copyOf(iArr, iArr.length);
    }

    public C2218j(View view) {
        mo9403a(view);
    }

    /* renamed from: a */
    public void mo9402a(int i, int i2) {
        this.f8777a = new int[]{i, i2};
        this.f8778b = null;
    }

    /* renamed from: a */
    public void mo9403a(View view) {
        if (this.f8777a == null && this.f8778b == null) {
            this.f8778b = new C2219a(view, this);
        }
    }
}
