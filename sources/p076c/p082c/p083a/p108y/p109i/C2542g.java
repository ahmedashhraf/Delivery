package p076c.p082c.p083a.p108y.p109i;

import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

/* renamed from: c.c.a.y.i.g */
/* compiled from: ViewAnimationFactory */
public class C2542g<R> implements C2537d<R> {

    /* renamed from: a */
    private final C2541a f9619a;

    /* renamed from: b */
    private C2535c<R> f9620b;

    /* renamed from: c.c.a.y.i.g$a */
    /* compiled from: ViewAnimationFactory */
    private static class C2543a implements C2541a {

        /* renamed from: a */
        private final Animation f9621a;

        public C2543a(Animation animation) {
            this.f9621a = animation;
        }

        public Animation build() {
            return this.f9621a;
        }
    }

    /* renamed from: c.c.a.y.i.g$b */
    /* compiled from: ViewAnimationFactory */
    private static class C2544b implements C2541a {

        /* renamed from: a */
        private final Context f9622a;

        /* renamed from: b */
        private final int f9623b;

        public C2544b(Context context, int i) {
            this.f9622a = context.getApplicationContext();
            this.f9623b = i;
        }

        public Animation build() {
            return AnimationUtils.loadAnimation(this.f9622a, this.f9623b);
        }
    }

    public C2542g(Animation animation) {
        this((C2541a) new C2543a(animation));
    }

    /* renamed from: a */
    public C2535c<R> mo10013a(boolean z, boolean z2) {
        if (z || !z2) {
            return C2538e.m12597b();
        }
        if (this.f9620b == null) {
            this.f9620b = new C2540f(this.f9619a);
        }
        return this.f9620b;
    }

    public C2542g(Context context, int i) {
        this((C2541a) new C2544b(context, i));
    }

    C2542g(C2541a aVar) {
        this.f9619a = aVar;
    }
}
