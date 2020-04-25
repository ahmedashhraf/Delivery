package p076c.p082c.p083a;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.ParcelFileDescriptor;
import android.view.animation.Animation;
import android.widget.ImageView;
import com.bumptech.glide.load.resource.bitmap.C2964e;
import com.bumptech.glide.load.resource.bitmap.C2966g;
import com.bumptech.glide.load.resource.bitmap.C2971i;
import com.bumptech.glide.load.resource.bitmap.C2976m;
import com.bumptech.glide.load.resource.bitmap.C2979p;
import com.bumptech.glide.load.resource.bitmap.C2981r;
import java.io.File;
import java.io.InputStream;
import p076c.p082c.p083a.p088u.C2270a;
import p076c.p082c.p083a.p088u.C2271b;
import p076c.p082c.p083a.p088u.C2272c;
import p076c.p082c.p083a.p088u.C2274e;
import p076c.p082c.p083a.p088u.C2275f;
import p076c.p082c.p083a.p088u.C2276g;
import p076c.p082c.p083a.p088u.p090i.C2302c;
import p076c.p082c.p083a.p088u.p090i.p091n.C2330c;
import p076c.p082c.p083a.p088u.p095j.C2400g;
import p076c.p082c.p083a.p088u.p098k.p101h.C2452c;
import p076c.p082c.p083a.p088u.p098k.p104k.C2491f;
import p076c.p082c.p083a.p107x.C2521f;
import p076c.p082c.p083a.p108y.C2529f;
import p076c.p082c.p083a.p108y.p109i.C2545h.C2546a;
import p076c.p082c.p083a.p108y.p110j.C2561m;

/* renamed from: c.c.a.b */
/* compiled from: BitmapRequestBuilder */
public class C2220b<ModelType, TranscodeType> extends C2226h<ModelType, C2400g, Bitmap, TranscodeType> implements C2207a {

    /* renamed from: o0 */
    private final C2330c f8779o0;

    /* renamed from: p0 */
    private C2966g f8780p0 = C2966g.f10504d;

    /* renamed from: q0 */
    private C2270a f8781q0;

    /* renamed from: r0 */
    private C2274e<InputStream, Bitmap> f8782r0;

    /* renamed from: s0 */
    private C2274e<ParcelFileDescriptor, Bitmap> f8783s0;

    C2220b(C2521f<ModelType, C2400g, Bitmap, TranscodeType> fVar, Class<TranscodeType> cls, C2226h<ModelType, ?, ?, ?> hVar) {
        super(fVar, cls, hVar);
        this.f8779o0 = hVar.f8791N.mo9480e();
        this.f8781q0 = hVar.f8791N.mo9481f();
        this.f8782r0 = new C2979p(this.f8779o0, this.f8781q0);
        this.f8783s0 = new C2971i(this.f8779o0, this.f8781q0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo9438f() {
        m11397b();
    }

    /* renamed from: j */
    public C2220b<ModelType, TranscodeType> mo9441j() {
        return m11355a(C2966g.f10504d);
    }

    /* renamed from: k */
    public C2220b<ModelType, TranscodeType> mo9442k() {
        return m11355a(C2966g.f10506f);
    }

    /* renamed from: l */
    public C2220b<ModelType, TranscodeType> mo9443l() {
        return m11355a(C2966g.f10505e);
    }

    /* renamed from: e */
    public C2220b<ModelType, TranscodeType> m11415e(int i) {
        super.mo9436e(i);
        return this;
    }

    /* renamed from: g */
    public C2220b<ModelType, TranscodeType> m11419g() {
        super.mo9439g();
        return this;
    }

    /* renamed from: h */
    public C2220b<ModelType, TranscodeType> m11421h() {
        super.mo9440h();
        return this;
    }

    /* renamed from: c */
    public C2220b<ModelType, TranscodeType> mo9431c(C2274e<InputStream, Bitmap> eVar) {
        this.f8782r0 = eVar;
        super.mo9428b((C2274e<DataType, ResourceType>) new C2976m<DataType,ResourceType>(eVar, this.f8783s0));
        return this;
    }

    public C2220b<ModelType, TranscodeType> clone() {
        return (C2220b) super.clone();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo9437e() {
        m11411d();
    }

    /* renamed from: d */
    public C2220b<ModelType, TranscodeType> mo9435d(C2274e<ParcelFileDescriptor, Bitmap> eVar) {
        this.f8783s0 = eVar;
        super.mo9428b((C2274e<DataType, ResourceType>) new C2976m<DataType,ResourceType>(this.f8782r0, eVar));
        return this;
    }

    /* renamed from: c */
    public C2220b<ModelType, TranscodeType> m11406c(Drawable drawable) {
        super.mo9430c(drawable);
        return this;
    }

    /* renamed from: b */
    public C2220b<ModelType, TranscodeType> m11398b(float f) {
        super.mo9425b(f);
        return this;
    }

    /* renamed from: c */
    public C2220b<ModelType, TranscodeType> m11405c(int i) {
        super.mo9429c(i);
        return this;
    }

    /* renamed from: d */
    public C2220b<ModelType, TranscodeType> m11411d() {
        return mo9423a(this.f8791N.mo9477c());
    }

    /* renamed from: b */
    public C2220b<ModelType, TranscodeType> m11401b(C2274e<C2400g, Bitmap> eVar) {
        super.mo9428b(eVar);
        return this;
    }

    /* renamed from: d */
    public C2220b<ModelType, TranscodeType> m11412d(int i) {
        super.mo9433d(i);
        return this;
    }

    /* renamed from: b */
    public C2220b<ModelType, TranscodeType> m11397b() {
        return mo9423a(this.f8791N.mo9479d());
    }

    /* renamed from: d */
    public C2220b<ModelType, TranscodeType> m11413d(int i, int i2) {
        super.mo9434d(i, i2);
        return this;
    }

    /* renamed from: b */
    public C2220b<ModelType, TranscodeType> m11399b(int i) {
        super.mo9426b(i);
        return this;
    }

    /* renamed from: b */
    public C2220b<ModelType, TranscodeType> m11400b(Drawable drawable) {
        super.mo9427b(drawable);
        return this;
    }

    /* renamed from: a */
    private C2220b<ModelType, TranscodeType> m11355a(C2966g gVar) {
        this.f8780p0 = gVar;
        this.f8782r0 = new C2979p(gVar, this.f8779o0, this.f8781q0);
        super.mo9428b((C2274e<DataType, ResourceType>) new C2976m<DataType,ResourceType>(this.f8782r0, this.f8783s0));
        return this;
    }

    /* renamed from: a */
    public C2220b<ModelType, TranscodeType> mo9408a(C2220b<?, TranscodeType> bVar) {
        super.mo9409a((C2226h<?, ?, ?, TranscodeType>) bVar);
        return this;
    }

    /* renamed from: a */
    public C2220b<ModelType, TranscodeType> m11375a(float f) {
        super.mo9405a(f);
        return this;
    }

    /* renamed from: a */
    public C2220b<ModelType, TranscodeType> m11382a(C2274e<File, Bitmap> eVar) {
        super.mo9414a(eVar);
        return this;
    }

    /* renamed from: a */
    public C2220b<ModelType, TranscodeType> m11383a(C2275f<Bitmap> fVar) {
        super.mo9415a(fVar);
        return this;
    }

    /* renamed from: a */
    public C2220b<ModelType, TranscodeType> mo9411a(C2270a aVar) {
        this.f8781q0 = aVar;
        this.f8782r0 = new C2979p(this.f8780p0, this.f8779o0, aVar);
        this.f8783s0 = new C2971i(new C2981r(), this.f8779o0, aVar);
        super.mo9414a((C2274e<File, ResourceType>) new C2452c<File,ResourceType>(new C2979p(this.f8780p0, this.f8779o0, aVar)));
        super.mo9428b((C2274e<DataType, ResourceType>) new C2976m<DataType,ResourceType>(this.f8782r0, this.f8783s0));
        return this;
    }

    /* renamed from: a */
    public C2220b<ModelType, TranscodeType> m11379a(C2244p pVar) {
        super.mo9410a(pVar);
        return this;
    }

    /* renamed from: a */
    public C2220b<ModelType, TranscodeType> mo9423a(C2964e... eVarArr) {
        super.mo9422a((C2276g<ResourceType>[]) eVarArr);
        return this;
    }

    /* renamed from: a */
    public C2220b<ModelType, TranscodeType> m11390a(C2276g<Bitmap>... gVarArr) {
        super.mo9422a((C2276g<ResourceType>[]) gVarArr);
        return this;
    }

    /* renamed from: a */
    public C2220b<ModelType, TranscodeType> m11385a(C2491f<Bitmap, TranscodeType> fVar) {
        super.mo9417a(fVar);
        return this;
    }

    @Deprecated
    /* renamed from: a */
    public C2220b<ModelType, TranscodeType> m11377a(Animation animation) {
        super.mo9407a(animation);
        return this;
    }

    /* renamed from: a */
    public C2220b<ModelType, TranscodeType> m11387a(C2546a aVar) {
        super.mo9419a(aVar);
        return this;
    }

    /* renamed from: a */
    public C2220b<ModelType, TranscodeType> m11376a(Drawable drawable) {
        super.mo9406a(drawable);
        return this;
    }

    /* renamed from: a */
    public C2220b<ModelType, TranscodeType> m11386a(C2529f<? super ModelType, TranscodeType> fVar) {
        super.mo9418a(fVar);
        return this;
    }

    /* renamed from: a */
    public C2220b<ModelType, TranscodeType> m11389a(boolean z) {
        super.mo9421a(z);
        return this;
    }

    /* renamed from: a */
    public C2220b<ModelType, TranscodeType> m11384a(C2302c cVar) {
        super.mo9416a(cVar);
        return this;
    }

    /* renamed from: a */
    public C2220b<ModelType, TranscodeType> m11378a(C2226h<?, ?, ?, TranscodeType> hVar) {
        super.mo9409a(hVar);
        return this;
    }

    /* renamed from: a */
    public C2220b<ModelType, TranscodeType> m11380a(C2271b<C2400g> bVar) {
        super.mo9412a(bVar);
        return this;
    }

    /* renamed from: a */
    public C2220b<ModelType, TranscodeType> m11381a(C2272c cVar) {
        super.mo9413a(cVar);
        return this;
    }

    /* renamed from: a */
    public C2220b<ModelType, TranscodeType> m11388a(ModelType modeltype) {
        super.mo9420a(modeltype);
        return this;
    }

    /* renamed from: a */
    public C2561m<TranscodeType> mo9424a(ImageView imageView) {
        return super.mo9424a(imageView);
    }
}
