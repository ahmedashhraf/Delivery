package p076c.p082c.p083a.p088u.p098k.p100g;

import android.graphics.drawable.Drawable;
import p076c.p082c.p083a.p088u.p090i.C2322l;

/* renamed from: c.c.a.u.k.g.a */
/* compiled from: DrawableResource */
public abstract class C2448a<T extends Drawable> implements C2322l<T> {

    /* renamed from: a */
    protected final T f9412a;

    public C2448a(T t) {
        if (t != null) {
            this.f9412a = t;
            return;
        }
        throw new NullPointerException("Drawable must not be null!");
    }

    public final T get() {
        return this.f9412a.getConstantState().newDrawable();
    }
}
