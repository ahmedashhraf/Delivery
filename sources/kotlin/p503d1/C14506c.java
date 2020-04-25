package kotlin.p503d1;

import kotlin.p214b1.p216u.C14445h0;
import kotlin.p505f1.C14557l;
import p205i.p209c.p210a.C6003d;
import p205i.p209c.p210a.C6004e;

/* renamed from: kotlin.d1.c */
/* compiled from: ObservableProperty.kt */
public abstract class C14506c<T> implements C14508e<Object, T> {

    /* renamed from: a */
    private T f42660a;

    public C14506c(T t) {
        this.f42660a = t;
    }

    /* renamed from: a */
    public T mo45679a(@C6004e Object obj, @C6003d C14557l<?> lVar) {
        C14445h0.m62478f(lVar, "property");
        return this.f42660a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo45677a(@C6003d C14557l<?> lVar, T t, T t2) {
        C14445h0.m62478f(lVar, "property");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo45678b(@C6003d C14557l<?> lVar, T t, T t2) {
        C14445h0.m62478f(lVar, "property");
        return true;
    }

    /* renamed from: a */
    public void mo45680a(@C6004e Object obj, @C6003d C14557l<?> lVar, T t) {
        C14445h0.m62478f(lVar, "property");
        T t2 = this.f42660a;
        if (mo45678b(lVar, t2, t)) {
            this.f42660a = t;
            mo45677a(lVar, t2, t);
        }
    }
}
