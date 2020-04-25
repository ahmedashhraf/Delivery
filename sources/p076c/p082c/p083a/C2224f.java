package p076c.p082c.p083a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.animation.Animation;
import android.widget.ImageView;
import com.bumptech.glide.load.resource.bitmap.C2964e;
import java.io.File;
import p076c.p082c.p083a.p088u.C2271b;
import p076c.p082c.p083a.p088u.C2272c;
import p076c.p082c.p083a.p088u.C2274e;
import p076c.p082c.p083a.p088u.C2275f;
import p076c.p082c.p083a.p088u.C2276g;
import p076c.p082c.p083a.p088u.p090i.C2302c;
import p076c.p082c.p083a.p088u.p095j.C2400g;
import p076c.p082c.p083a.p088u.p098k.p100g.C2449b;
import p076c.p082c.p083a.p088u.p098k.p103j.C2477a;
import p076c.p082c.p083a.p088u.p098k.p103j.C2484f;
import p076c.p082c.p083a.p088u.p098k.p104k.C2491f;
import p076c.p082c.p083a.p105v.C2502g;
import p076c.p082c.p083a.p105v.C2510m;
import p076c.p082c.p083a.p107x.C2521f;
import p076c.p082c.p083a.p108y.C2529f;
import p076c.p082c.p083a.p108y.p109i.C2532a;
import p076c.p082c.p083a.p108y.p109i.C2537d;
import p076c.p082c.p083a.p108y.p109i.C2545h.C2546a;
import p076c.p082c.p083a.p108y.p110j.C2561m;

/* renamed from: c.c.a.f */
/* compiled from: DrawableRequestBuilder */
public class C2224f<ModelType> extends C2226h<ModelType, C2400g, C2477a, C2449b> implements C2207a, C2223e {
    C2224f(Context context, Class<ModelType> cls, C2521f<ModelType, C2400g, C2477a, C2449b> fVar, C2232l lVar, C2510m mVar, C2502g gVar) {
        super(context, cls, fVar, C2449b.class, lVar, mVar, gVar);
        m11490c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo9438f() {
        m11481b();
    }

    /* renamed from: e */
    public C2224f<ModelType> m11500e(int i) {
        super.mo9436e(i);
        return this;
    }

    /* renamed from: g */
    public C2224f<ModelType> m11504g() {
        super.mo9439g();
        return this;
    }

    /* renamed from: h */
    public C2224f<ModelType> m11506h() {
        super.mo9440h();
        return this;
    }

    public C2224f<ModelType> clone() {
        return (C2224f) super.clone();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo9437e() {
        m11496d();
    }

    /* renamed from: c */
    public final C2224f<ModelType> m11490c() {
        super.mo9457a((C2537d<TranscodeType>) new C2532a<TranscodeType>());
        return this;
    }

    /* renamed from: d */
    public C2224f<ModelType> m11496d() {
        return m11472a((C2276g<C2477a>[]) new C2276g[]{this.f8791N.mo9482g()});
    }

    /* renamed from: c */
    public C2224f<ModelType> m11492c(Drawable drawable) {
        super.mo9430c(drawable);
        return this;
    }

    /* renamed from: d */
    public C2224f<ModelType> m11497d(int i) {
        super.mo9433d(i);
        return this;
    }

    /* renamed from: c */
    public C2224f<ModelType> m11491c(int i) {
        super.mo9429c(i);
        return this;
    }

    /* renamed from: d */
    public C2224f<ModelType> m11498d(int i, int i2) {
        super.mo9434d(i, i2);
        return this;
    }

    /* renamed from: b */
    public C2224f<ModelType> m11482b(float f) {
        super.mo9425b(f);
        return this;
    }

    /* renamed from: b */
    public C2224f<ModelType> m11486b(C2274e<C2400g, C2477a> eVar) {
        super.mo9428b(eVar);
        return this;
    }

    /* renamed from: b */
    public C2224f<ModelType> m11481b() {
        return m11472a((C2276g<C2477a>[]) new C2276g[]{this.f8791N.mo9483h()});
    }

    /* renamed from: b */
    public C2224f<ModelType> mo9455b(C2276g<Bitmap>... gVarArr) {
        C2484f[] fVarArr = new C2484f[gVarArr.length];
        for (int i = 0; i < gVarArr.length; i++) {
            fVarArr[i] = new C2484f(this.f8791N.mo9480e(), gVarArr[i]);
        }
        return m11472a((C2276g<C2477a>[]) fVarArr);
    }

    /* renamed from: b */
    public C2224f<ModelType> m11484b(int i, int i2) {
        super.mo9457a((C2537d<TranscodeType>) new C2532a<TranscodeType>(this.f8806b, i, i2));
        return this;
    }

    /* renamed from: b */
    public C2224f<ModelType> m11483b(int i) {
        super.mo9426b(i);
        return this;
    }

    /* renamed from: b */
    public C2224f<ModelType> m11485b(Drawable drawable) {
        super.mo9427b(drawable);
        return this;
    }

    /* renamed from: a */
    public C2224f<ModelType> mo9453a(C2224f<?> fVar) {
        super.mo9409a((C2226h<?, ?, ?, TranscodeType>) fVar);
        return this;
    }

    /* renamed from: a */
    public C2224f<ModelType> m11460a(C2226h<?, ?, ?, C2449b> hVar) {
        super.mo9409a(hVar);
        return this;
    }

    /* renamed from: a */
    public C2224f<ModelType> m11455a(float f) {
        super.mo9405a(f);
        return this;
    }

    /* renamed from: a */
    public C2224f<ModelType> m11464a(C2274e<File, C2477a> eVar) {
        super.mo9414a(eVar);
        return this;
    }

    /* renamed from: a */
    public C2224f<ModelType> m11465a(C2275f<C2477a> fVar) {
        super.mo9415a(fVar);
        return this;
    }

    /* renamed from: a */
    public C2224f<ModelType> m11461a(C2244p pVar) {
        super.mo9410a(pVar);
        return this;
    }

    /* renamed from: a */
    public C2224f<ModelType> mo9454a(C2964e... eVarArr) {
        return mo9455b((C2276g<Bitmap>[]) eVarArr);
    }

    /* renamed from: a */
    public C2224f<ModelType> m11472a(C2276g<C2477a>... gVarArr) {
        super.mo9422a((C2276g<ResourceType>[]) gVarArr);
        return this;
    }

    /* renamed from: a */
    public C2224f<ModelType> m11467a(C2491f<C2477a, C2449b> fVar) {
        super.mo9417a(fVar);
        return this;
    }

    /* renamed from: a */
    public C2224f<ModelType> m11456a(int i) {
        super.mo9457a((C2537d<TranscodeType>) new C2532a<TranscodeType>(i));
        return this;
    }

    @Deprecated
    /* renamed from: a */
    public C2224f<ModelType> m11459a(Animation animation, int i) {
        super.mo9457a((C2537d<TranscodeType>) new C2532a<TranscodeType>(animation, i));
        return this;
    }

    /* renamed from: a */
    public C2224f<ModelType> m11469a(C2546a aVar) {
        super.mo9419a(aVar);
        return this;
    }

    @Deprecated
    /* renamed from: a */
    public C2224f<ModelType> m11458a(Animation animation) {
        super.mo9407a(animation);
        return this;
    }

    /* renamed from: a */
    public C2224f<ModelType> m11457a(Drawable drawable) {
        super.mo9406a(drawable);
        return this;
    }

    /* renamed from: a */
    public C2224f<ModelType> m11468a(C2529f<? super ModelType, C2449b> fVar) {
        super.mo9418a(fVar);
        return this;
    }

    /* renamed from: a */
    public C2224f<ModelType> m11466a(C2302c cVar) {
        super.mo9416a(cVar);
        return this;
    }

    /* renamed from: a */
    public C2224f<ModelType> m11471a(boolean z) {
        super.mo9421a(z);
        return this;
    }

    /* renamed from: a */
    public C2224f<ModelType> m11462a(C2271b<C2400g> bVar) {
        super.mo9412a(bVar);
        return this;
    }

    /* renamed from: a */
    public C2224f<ModelType> m11463a(C2272c cVar) {
        super.mo9413a(cVar);
        return this;
    }

    /* renamed from: a */
    public C2224f<ModelType> m11470a(ModelType modeltype) {
        super.mo9420a(modeltype);
        return this;
    }

    /* renamed from: a */
    public C2561m<C2449b> mo9424a(ImageView imageView) {
        return super.mo9424a(imageView);
    }
}
