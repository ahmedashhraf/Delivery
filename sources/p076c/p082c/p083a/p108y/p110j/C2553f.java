package p076c.p082c.p083a.p108y.p110j;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import p076c.p082c.p083a.p108y.p109i.C2535c;
import p076c.p082c.p083a.p108y.p109i.C2535c.C2536a;

/* renamed from: c.c.a.y.j.f */
/* compiled from: ImageViewTarget */
public abstract class C2553f<Z> extends C2562n<ImageView, Z> implements C2536a {
    public C2553f(ImageView imageView) {
        super(imageView);
    }

    /* renamed from: a */
    public void mo9486a(Drawable drawable) {
        ((ImageView) this.f9653b).setImageDrawable(drawable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo10023a(Z z);

    /* renamed from: b */
    public Drawable mo10017b() {
        return ((ImageView) this.f9653b).getDrawable();
    }

    public void setDrawable(Drawable drawable) {
        ((ImageView) this.f9653b).setImageDrawable(drawable);
    }

    /* renamed from: a */
    public void mo9487a(Exception exc, Drawable drawable) {
        ((ImageView) this.f9653b).setImageDrawable(drawable);
    }

    /* renamed from: b */
    public void mo9488b(Drawable drawable) {
        ((ImageView) this.f9653b).setImageDrawable(drawable);
    }

    /* renamed from: a */
    public void mo9404a(Z z, C2535c<? super Z> cVar) {
        if (cVar == null || !cVar.mo10016a(z, this)) {
            mo10023a(z);
        }
    }
}
