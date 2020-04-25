package p076c.p082c.p083a.p108y.p110j;

import android.widget.ImageView;
import p076c.p082c.p083a.p088u.p098k.p100g.C2449b;
import p076c.p082c.p083a.p108y.p109i.C2535c;

/* renamed from: c.c.a.y.j.e */
/* compiled from: GlideDrawableImageViewTarget */
public class C2552e extends C2553f<C2449b> {

    /* renamed from: T */
    private static final float f9633T = 0.05f;

    /* renamed from: R */
    private int f9634R;

    /* renamed from: S */
    private C2449b f9635S;

    public C2552e(ImageView imageView) {
        this(imageView, -1);
    }

    public void onStart() {
        C2449b bVar = this.f9635S;
        if (bVar != null) {
            bVar.start();
        }
    }

    public void onStop() {
        C2449b bVar = this.f9635S;
        if (bVar != null) {
            bVar.stop();
        }
    }

    public C2552e(ImageView imageView, int i) {
        super(imageView);
        this.f9634R = i;
    }

    /* renamed from: a */
    public void mo9404a(C2449b bVar, C2535c<? super C2449b> cVar) {
        if (!bVar.mo9863b()) {
            float intrinsicWidth = ((float) bVar.getIntrinsicWidth()) / ((float) bVar.getIntrinsicHeight());
            if (Math.abs((((float) ((ImageView) this.f9653b).getWidth()) / ((float) ((ImageView) this.f9653b).getHeight())) - 1.0f) <= f9633T && Math.abs(intrinsicWidth - 1.0f) <= f9633T) {
                bVar = new C2559l(bVar, ((ImageView) this.f9653b).getWidth());
            }
        }
        super.mo9404a(bVar, cVar);
        this.f9635S = bVar;
        bVar.mo9862b(this.f9634R);
        bVar.start();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo10023a(C2449b bVar) {
        ((ImageView) this.f9653b).setImageDrawable(bVar);
    }
}
