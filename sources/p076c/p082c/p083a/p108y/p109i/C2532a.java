package p076c.p082c.p083a.p108y.p109i;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;

/* renamed from: c.c.a.y.i.a */
/* compiled from: DrawableCrossFadeFactory */
public class C2532a<T extends Drawable> implements C2537d<T> {

    /* renamed from: e */
    private static final int f9608e = 300;

    /* renamed from: a */
    private final C2542g<T> f9609a;

    /* renamed from: b */
    private final int f9610b;

    /* renamed from: c */
    private C2534b<T> f9611c;

    /* renamed from: d */
    private C2534b<T> f9612d;

    /* renamed from: c.c.a.y.i.a$a */
    /* compiled from: DrawableCrossFadeFactory */
    private static class C2533a implements C2541a {

        /* renamed from: a */
        private final int f9613a;

        C2533a(int i) {
            this.f9613a = i;
        }

        public Animation build() {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration((long) this.f9613a);
            return alphaAnimation;
        }
    }

    public C2532a() {
        this(300);
    }

    /* renamed from: b */
    private C2535c<T> m12589b() {
        if (this.f9612d == null) {
            this.f9612d = new C2534b<>(this.f9609a.mo10013a(false, false), this.f9610b);
        }
        return this.f9612d;
    }

    /* renamed from: a */
    public C2535c<T> mo10013a(boolean z, boolean z2) {
        if (z) {
            return C2538e.m12597b();
        }
        if (z2) {
            return m12588a();
        }
        return m12589b();
    }

    public C2532a(int i) {
        this(new C2542g<>((C2541a) new C2533a(i)), i);
    }

    public C2532a(Context context, int i, int i2) {
        this(new C2542g<>(context, i), i2);
    }

    public C2532a(Animation animation, int i) {
        this(new C2542g<>(animation), i);
    }

    /* renamed from: a */
    private C2535c<T> m12588a() {
        if (this.f9611c == null) {
            this.f9611c = new C2534b<>(this.f9609a.mo10013a(false, true), this.f9610b);
        }
        return this.f9611c;
    }

    C2532a(C2542g<T> gVar, int i) {
        this.f9609a = gVar;
        this.f9610b = i;
    }
}
