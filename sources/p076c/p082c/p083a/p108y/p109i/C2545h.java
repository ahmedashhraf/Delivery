package p076c.p082c.p083a.p108y.p109i;

import android.view.View;
import p076c.p082c.p083a.p108y.p109i.C2535c.C2536a;

/* renamed from: c.c.a.y.i.h */
/* compiled from: ViewPropertyAnimation */
public class C2545h<R> implements C2535c<R> {

    /* renamed from: a */
    private final C2546a f9624a;

    /* renamed from: c.c.a.y.i.h$a */
    /* compiled from: ViewPropertyAnimation */
    public interface C2546a {
        /* renamed from: a */
        void mo10020a(View view);
    }

    public C2545h(C2546a aVar) {
        this.f9624a = aVar;
    }

    /* renamed from: a */
    public boolean mo10016a(R r, C2536a aVar) {
        if (aVar.getView() != null) {
            this.f9624a.mo10020a(aVar.getView());
        }
        return false;
    }
}
