package androidx.dynamicanimation.p041a;

import android.os.Looper;
import android.util.AndroidRuntimeException;

/* renamed from: androidx.dynamicanimation.a.g */
/* compiled from: SpringAnimation */
public final class C1354g extends C1328b<C1354g> {

    /* renamed from: J */
    private static final float f5314J = Float.MAX_VALUE;

    /* renamed from: G */
    private C1355h f5315G = null;

    /* renamed from: H */
    private float f5316H = Float.MAX_VALUE;

    /* renamed from: I */
    private boolean f5317I = false;

    public C1354g(C1352e eVar) {
        super(eVar);
    }

    /* renamed from: i */
    private void m7131i() {
        C1355h hVar = this.f5315G;
        if (hVar != null) {
            double b = (double) hVar.mo5870b();
            if (b > ((double) this.f5295g)) {
                throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
            } else if (b < ((double) this.f5296h)) {
                throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
            }
        } else {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
    }

    /* renamed from: a */
    public C1354g mo5862a(C1355h hVar) {
        this.f5315G = hVar;
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo5811b(long j) {
        if (this.f5317I) {
            float f = this.f5316H;
            if (f != Float.MAX_VALUE) {
                this.f5315G.mo5871b(f);
                this.f5316H = Float.MAX_VALUE;
            }
            this.f5290b = this.f5315G.mo5870b();
            this.f5289a = 0.0f;
            this.f5317I = false;
            return true;
        }
        if (this.f5316H != Float.MAX_VALUE) {
            this.f5315G.mo5870b();
            long j2 = j / 2;
            C1344p a = this.f5315G.mo5867a((double) this.f5290b, (double) this.f5289a, j2);
            this.f5315G.mo5871b(this.f5316H);
            this.f5316H = Float.MAX_VALUE;
            C1344p a2 = this.f5315G.mo5867a((double) a.f5303a, (double) a.f5304b, j2);
            this.f5290b = a2.f5303a;
            this.f5289a = a2.f5304b;
        } else {
            C1344p a3 = this.f5315G.mo5867a((double) this.f5290b, (double) this.f5289a, j);
            this.f5290b = a3.f5303a;
            this.f5289a = a3.f5304b;
        }
        this.f5290b = Math.max(this.f5290b, this.f5296h);
        this.f5290b = Math.min(this.f5290b, this.f5295g);
        if (!mo5810b(this.f5290b, this.f5289a)) {
            return false;
        }
        this.f5290b = this.f5315G.mo5870b();
        this.f5289a = 0.0f;
        return true;
    }

    /* renamed from: e */
    public void mo5817e() {
        m7131i();
        this.f5315G.mo5869a((double) mo5812c());
        super.mo5817e();
    }

    /* renamed from: f */
    public boolean mo5852f() {
        return this.f5315G.f5329b > 0.0d;
    }

    /* renamed from: g */
    public C1355h mo5863g() {
        return this.f5315G;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo5819g(float f) {
    }

    /* renamed from: h */
    public void mo5865h(float f) {
        if (mo5815d()) {
            this.f5316H = f;
            return;
        }
        if (this.f5315G == null) {
            this.f5315G = new C1355h(f);
        }
        this.f5315G.mo5871b(f);
        mo5817e();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public float mo5801a(float f, float f2) {
        return this.f5315G.mo5858b(f, f2);
    }

    public <K> C1354g(K k, C1350d<K> dVar) {
        super(k, dVar);
    }

    /* renamed from: h */
    public void mo5864h() {
        if (!mo5852f()) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        } else if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        } else if (this.f5294f) {
            this.f5317I = true;
        }
    }

    public <K> C1354g(K k, C1350d<K> dVar, float f) {
        super(k, dVar);
        this.f5315G = new C1355h(f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo5810b(float f, float f2) {
        return this.f5315G.mo5857a(f, f2);
    }
}
