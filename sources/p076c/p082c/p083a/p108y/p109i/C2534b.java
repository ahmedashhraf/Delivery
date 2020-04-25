package p076c.p082c.p083a.p108y.p109i;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import p076c.p082c.p083a.p108y.p109i.C2535c.C2536a;

/* renamed from: c.c.a.y.i.b */
/* compiled from: DrawableCrossFadeViewAnimation */
public class C2534b<T extends Drawable> implements C2535c<T> {

    /* renamed from: a */
    private final C2535c<T> f9614a;

    /* renamed from: b */
    private final int f9615b;

    public C2534b(C2535c<T> cVar, int i) {
        this.f9614a = cVar;
        this.f9615b = i;
    }

    /* renamed from: a */
    public boolean mo10016a(T t, C2536a aVar) {
        Drawable b = aVar.mo10017b();
        if (b != null) {
            TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{b, t});
            transitionDrawable.setCrossFadeEnabled(true);
            transitionDrawable.startTransition(this.f9615b);
            aVar.setDrawable(transitionDrawable);
            return true;
        }
        this.f9614a.mo10016a(t, aVar);
        return false;
    }
}
