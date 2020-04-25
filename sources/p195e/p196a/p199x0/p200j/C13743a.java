package p195e.p196a.p199x0.p200j;

import p195e.p196a.C12280i0;
import p195e.p196a.p449w0.C12328d;
import p195e.p196a.p449w0.C12342r;
import p205i.p211e.C14062c;

/* renamed from: e.a.x0.j.a */
/* compiled from: AppendOnlyLinkedArrayList */
public class C13743a<T> {

    /* renamed from: a */
    final int f39795a;

    /* renamed from: b */
    final Object[] f39796b;

    /* renamed from: c */
    Object[] f39797c = this.f39796b;

    /* renamed from: d */
    int f39798d;

    /* renamed from: e.a.x0.j.a$a */
    /* compiled from: AppendOnlyLinkedArrayList */
    public interface C13744a<T> extends C12342r<T> {
        /* renamed from: b */
        boolean mo41812b(T t);
    }

    public C13743a(int i) {
        this.f39795a = i;
        this.f39796b = new Object[(i + 1)];
    }

    /* renamed from: a */
    public void mo43135a(T t) {
        int i = this.f39795a;
        int i2 = this.f39798d;
        if (i2 == i) {
            Object[] objArr = new Object[(i + 1)];
            this.f39797c[i] = objArr;
            this.f39797c = objArr;
            i2 = 0;
        }
        this.f39797c[i2] = t;
        this.f39798d = i2 + 1;
    }

    /* renamed from: b */
    public void mo43139b(T t) {
        this.f39796b[0] = t;
    }

    /* renamed from: a */
    public void mo43134a(C13744a<? super T> aVar) {
        int i = this.f39795a;
        for (Object[] objArr = this.f39796b; objArr != null; objArr = objArr[i]) {
            int i2 = 0;
            while (i2 < i) {
                Object[] objArr2 = objArr[i2];
                if (objArr2 == null) {
                    continue;
                    break;
                } else if (!aVar.mo41812b(objArr2)) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public <U> boolean mo43138a(C14062c<? super U> cVar) {
        Object[] objArr = this.f39796b;
        int i = this.f39795a;
        while (true) {
            int i2 = 0;
            if (objArr == null) {
                return false;
            }
            while (i2 < i) {
                Object[] objArr2 = objArr[i2];
                if (objArr2 == null) {
                    continue;
                    break;
                } else if (C13761q.m58748b((Object) objArr2, cVar)) {
                    return true;
                } else {
                    i2++;
                }
            }
            objArr = objArr[i];
        }
    }

    /* renamed from: a */
    public <U> boolean mo43137a(C12280i0<? super U> i0Var) {
        Object[] objArr = this.f39796b;
        int i = this.f39795a;
        while (true) {
            int i2 = 0;
            if (objArr == null) {
                return false;
            }
            while (i2 < i) {
                Object[] objArr2 = objArr[i2];
                if (objArr2 == null) {
                    continue;
                    break;
                } else if (C13761q.m58747b((Object) objArr2, i0Var)) {
                    return true;
                } else {
                    i2++;
                }
            }
            objArr = objArr[i];
        }
    }

    /* renamed from: a */
    public <S> void mo43136a(S s, C12328d<? super S, ? super T> dVar) throws Exception {
        Object[] objArr = this.f39796b;
        int i = this.f39795a;
        while (true) {
            int i2 = 0;
            while (i2 < i) {
                Object[] objArr2 = objArr[i2];
                if (objArr2 != null && !dVar.mo42089a(s, objArr2)) {
                    i2++;
                } else {
                    return;
                }
            }
            objArr = objArr[i];
        }
    }
}
