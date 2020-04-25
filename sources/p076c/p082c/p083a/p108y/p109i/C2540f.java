package p076c.p082c.p083a.p108y.p109i;

import android.view.View;
import android.view.animation.Animation;
import p076c.p082c.p083a.p108y.p109i.C2535c.C2536a;

/* renamed from: c.c.a.y.i.f */
/* compiled from: ViewAnimation */
public class C2540f<R> implements C2535c<R> {

    /* renamed from: a */
    private final C2541a f9618a;

    /* renamed from: c.c.a.y.i.f$a */
    /* compiled from: ViewAnimation */
    interface C2541a {
        Animation build();
    }

    C2540f(C2541a aVar) {
        this.f9618a = aVar;
    }

    /* renamed from: a */
    public boolean mo10016a(R r, C2536a aVar) {
        View view = aVar.getView();
        if (view != null) {
            view.clearAnimation();
            view.startAnimation(this.f9618a.build());
        }
        return false;
    }
}
