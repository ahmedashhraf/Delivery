package androidx.dynamicanimation.p041a;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.View;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.C0215r;
import androidx.core.p034l.C0962e0;
import androidx.dynamicanimation.p041a.C1328b;
import java.util.ArrayList;

/* renamed from: androidx.dynamicanimation.a.b */
/* compiled from: DynamicAnimation */
public abstract class C1328b<T extends C1328b<T>> implements C1322b {

    /* renamed from: A */
    public static final float f5269A = 1.0f;

    /* renamed from: B */
    public static final float f5270B = 0.1f;

    /* renamed from: C */
    public static final float f5271C = 0.00390625f;

    /* renamed from: D */
    public static final float f5272D = 0.002f;

    /* renamed from: E */
    private static final float f5273E = Float.MAX_VALUE;

    /* renamed from: F */
    private static final float f5274F = 0.75f;

    /* renamed from: m */
    public static final C1347s f5275m = new C1335g("translationX");

    /* renamed from: n */
    public static final C1347s f5276n = new C1336h("translationY");

    /* renamed from: o */
    public static final C1347s f5277o = new C1337i("translationZ");

    /* renamed from: p */
    public static final C1347s f5278p = new C1338j("scaleX");

    /* renamed from: q */
    public static final C1347s f5279q = new C1339k("scaleY");

    /* renamed from: r */
    public static final C1347s f5280r = new C1340l("rotation");

    /* renamed from: s */
    public static final C1347s f5281s = new C1341m("rotationX");

    /* renamed from: t */
    public static final C1347s f5282t = new C1342n("rotationY");

    /* renamed from: u */
    public static final C1347s f5283u = new C1343o("x");

    /* renamed from: v */
    public static final C1347s f5284v = new C1329a("y");

    /* renamed from: w */
    public static final C1347s f5285w = new C1330b("z");

    /* renamed from: x */
    public static final C1347s f5286x = new C1331c("alpha");

    /* renamed from: y */
    public static final C1347s f5287y = new C1332d("scrollX");

    /* renamed from: z */
    public static final C1347s f5288z = new C1333e("scrollY");

    /* renamed from: a */
    float f5289a;

    /* renamed from: b */
    float f5290b;

    /* renamed from: c */
    boolean f5291c;

    /* renamed from: d */
    final Object f5292d;

    /* renamed from: e */
    final C1350d f5293e;

    /* renamed from: f */
    boolean f5294f;

    /* renamed from: g */
    float f5295g;

    /* renamed from: h */
    float f5296h;

    /* renamed from: i */
    private long f5297i;

    /* renamed from: j */
    private float f5298j;

    /* renamed from: k */
    private final ArrayList<C1345q> f5299k;

    /* renamed from: l */
    private final ArrayList<C1346r> f5300l;

    /* renamed from: androidx.dynamicanimation.a.b$a */
    /* compiled from: DynamicAnimation */
    static class C1329a extends C1347s {
        C1329a(String str) {
            super(str, null);
        }

        /* renamed from: a */
        public void mo5823a(View view, float f) {
            view.setY(f);
        }

        /* renamed from: a */
        public float mo5821a(View view) {
            return view.getY();
        }
    }

    /* renamed from: androidx.dynamicanimation.a.b$b */
    /* compiled from: DynamicAnimation */
    static class C1330b extends C1347s {
        C1330b(String str) {
            super(str, null);
        }

        /* renamed from: a */
        public void mo5823a(View view, float f) {
            C0962e0.m5542o(view, f);
        }

        /* renamed from: a */
        public float mo5821a(View view) {
            return C0962e0.m5422Z(view);
        }
    }

    /* renamed from: androidx.dynamicanimation.a.b$c */
    /* compiled from: DynamicAnimation */
    static class C1331c extends C1347s {
        C1331c(String str) {
            super(str, null);
        }

        /* renamed from: a */
        public void mo5823a(View view, float f) {
            view.setAlpha(f);
        }

        /* renamed from: a */
        public float mo5821a(View view) {
            return view.getAlpha();
        }
    }

    /* renamed from: androidx.dynamicanimation.a.b$d */
    /* compiled from: DynamicAnimation */
    static class C1332d extends C1347s {
        C1332d(String str) {
            super(str, null);
        }

        /* renamed from: a */
        public void mo5823a(View view, float f) {
            view.setScrollX((int) f);
        }

        /* renamed from: a */
        public float mo5821a(View view) {
            return (float) view.getScrollX();
        }
    }

    /* renamed from: androidx.dynamicanimation.a.b$e */
    /* compiled from: DynamicAnimation */
    static class C1333e extends C1347s {
        C1333e(String str) {
            super(str, null);
        }

        /* renamed from: a */
        public void mo5823a(View view, float f) {
            view.setScrollY((int) f);
        }

        /* renamed from: a */
        public float mo5821a(View view) {
            return (float) view.getScrollY();
        }
    }

    /* renamed from: androidx.dynamicanimation.a.b$f */
    /* compiled from: DynamicAnimation */
    class C1334f extends C1350d {

        /* renamed from: b */
        final /* synthetic */ C1352e f5301b;

        C1334f(String str, C1352e eVar) {
            this.f5301b = eVar;
            super(str);
        }

        /* renamed from: a */
        public float mo5821a(Object obj) {
            return this.f5301b.mo5860a();
        }

        /* renamed from: a */
        public void mo5823a(Object obj, float f) {
            this.f5301b.mo5861a(f);
        }
    }

    /* renamed from: androidx.dynamicanimation.a.b$g */
    /* compiled from: DynamicAnimation */
    static class C1335g extends C1347s {
        C1335g(String str) {
            super(str, null);
        }

        /* renamed from: a */
        public void mo5823a(View view, float f) {
            view.setTranslationX(f);
        }

        /* renamed from: a */
        public float mo5821a(View view) {
            return view.getTranslationX();
        }
    }

    /* renamed from: androidx.dynamicanimation.a.b$h */
    /* compiled from: DynamicAnimation */
    static class C1336h extends C1347s {
        C1336h(String str) {
            super(str, null);
        }

        /* renamed from: a */
        public void mo5823a(View view, float f) {
            view.setTranslationY(f);
        }

        /* renamed from: a */
        public float mo5821a(View view) {
            return view.getTranslationY();
        }
    }

    /* renamed from: androidx.dynamicanimation.a.b$i */
    /* compiled from: DynamicAnimation */
    static class C1337i extends C1347s {
        C1337i(String str) {
            super(str, null);
        }

        /* renamed from: a */
        public void mo5823a(View view, float f) {
            C0962e0.m5530l(view, f);
        }

        /* renamed from: a */
        public float mo5821a(View view) {
            return C0962e0.m5418V(view);
        }
    }

    /* renamed from: androidx.dynamicanimation.a.b$j */
    /* compiled from: DynamicAnimation */
    static class C1338j extends C1347s {
        C1338j(String str) {
            super(str, null);
        }

        /* renamed from: a */
        public void mo5823a(View view, float f) {
            view.setScaleX(f);
        }

        /* renamed from: a */
        public float mo5821a(View view) {
            return view.getScaleX();
        }
    }

    /* renamed from: androidx.dynamicanimation.a.b$k */
    /* compiled from: DynamicAnimation */
    static class C1339k extends C1347s {
        C1339k(String str) {
            super(str, null);
        }

        /* renamed from: a */
        public void mo5823a(View view, float f) {
            view.setScaleY(f);
        }

        /* renamed from: a */
        public float mo5821a(View view) {
            return view.getScaleY();
        }
    }

    /* renamed from: androidx.dynamicanimation.a.b$l */
    /* compiled from: DynamicAnimation */
    static class C1340l extends C1347s {
        C1340l(String str) {
            super(str, null);
        }

        /* renamed from: a */
        public void mo5823a(View view, float f) {
            view.setRotation(f);
        }

        /* renamed from: a */
        public float mo5821a(View view) {
            return view.getRotation();
        }
    }

    /* renamed from: androidx.dynamicanimation.a.b$m */
    /* compiled from: DynamicAnimation */
    static class C1341m extends C1347s {
        C1341m(String str) {
            super(str, null);
        }

        /* renamed from: a */
        public void mo5823a(View view, float f) {
            view.setRotationX(f);
        }

        /* renamed from: a */
        public float mo5821a(View view) {
            return view.getRotationX();
        }
    }

    /* renamed from: androidx.dynamicanimation.a.b$n */
    /* compiled from: DynamicAnimation */
    static class C1342n extends C1347s {
        C1342n(String str) {
            super(str, null);
        }

        /* renamed from: a */
        public void mo5823a(View view, float f) {
            view.setRotationY(f);
        }

        /* renamed from: a */
        public float mo5821a(View view) {
            return view.getRotationY();
        }
    }

    /* renamed from: androidx.dynamicanimation.a.b$o */
    /* compiled from: DynamicAnimation */
    static class C1343o extends C1347s {
        C1343o(String str) {
            super(str, null);
        }

        /* renamed from: a */
        public void mo5823a(View view, float f) {
            view.setX(f);
        }

        /* renamed from: a */
        public float mo5821a(View view) {
            return view.getX();
        }
    }

    /* renamed from: androidx.dynamicanimation.a.b$p */
    /* compiled from: DynamicAnimation */
    static class C1344p {

        /* renamed from: a */
        float f5303a;

        /* renamed from: b */
        float f5304b;

        C1344p() {
        }
    }

    /* renamed from: androidx.dynamicanimation.a.b$q */
    /* compiled from: DynamicAnimation */
    public interface C1345q {
        /* renamed from: a */
        void mo5850a(C1328b bVar, boolean z, float f, float f2);
    }

    /* renamed from: androidx.dynamicanimation.a.b$r */
    /* compiled from: DynamicAnimation */
    public interface C1346r {
        /* renamed from: a */
        void mo5851a(C1328b bVar, float f, float f2);
    }

    /* renamed from: androidx.dynamicanimation.a.b$s */
    /* compiled from: DynamicAnimation */
    public static abstract class C1347s extends C1350d<View> {
        /* synthetic */ C1347s(String str, C1335g gVar) {
            this(str);
        }

        private C1347s(String str) {
            super(str);
        }
    }

    C1328b(C1352e eVar) {
        this.f5289a = 0.0f;
        this.f5290b = Float.MAX_VALUE;
        this.f5291c = false;
        this.f5294f = false;
        this.f5295g = Float.MAX_VALUE;
        this.f5296h = -this.f5295g;
        this.f5297i = 0;
        this.f5299k = new ArrayList<>();
        this.f5300l = new ArrayList<>();
        this.f5292d = null;
        this.f5293e = new C1334f("FloatValueHolder", eVar);
        this.f5298j = 1.0f;
    }

    /* renamed from: g */
    private void mo5863g() {
        if (!this.f5294f) {
            this.f5294f = true;
            if (!this.f5291c) {
                this.f5290b = mo5852f();
            }
            float f = this.f5290b;
            if (f > this.f5295g || f < this.f5296h) {
                throw new IllegalArgumentException("Starting value need to be in between min value and max value");
            }
            C1320a.m7008d().mo5794a(this, 0);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract float mo5801a(float f, float f2);

    /* renamed from: a */
    public T mo5802a(float f) {
        this.f5295g = f;
        return this;
    }

    /* renamed from: b */
    public T mo5807b(float f) {
        this.f5296h = f;
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract boolean mo5810b(float f, float f2);

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract boolean mo5811b(long j);

    /* renamed from: c */
    public T mo5813c(@C0215r(from = 0.0d, fromInclusive = false) float f) {
        if (f > 0.0f) {
            this.f5298j = f;
            mo5819g(f * 0.75f);
            return this;
        }
        throw new IllegalArgumentException("Minimum visible change must be positive.");
    }

    /* renamed from: d */
    public boolean mo5815d() {
        return this.f5294f;
    }

    /* renamed from: e */
    public T mo5816e(float f) {
        this.f5290b = f;
        this.f5291c = true;
        return this;
    }

    /* renamed from: f */
    public T mo5818f(float f) {
        this.f5289a = f;
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public abstract void mo5819g(float f);

    /* renamed from: f */
    private float mo5852f() {
        return this.f5293e.mo5821a(this.f5292d);
    }

    /* renamed from: a */
    public T mo5803a(C1345q qVar) {
        if (!this.f5299k.contains(qVar)) {
            this.f5299k.add(qVar);
        }
        return this;
    }

    /* renamed from: b */
    public void mo5808b(C1345q qVar) {
        m7020a(this.f5299k, (T) qVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo5814d(float f) {
        this.f5293e.mo5823a(this.f5292d, f);
        for (int i = 0; i < this.f5300l.size(); i++) {
            if (this.f5300l.get(i) != null) {
                ((C1346r) this.f5300l.get(i)).mo5851a(this, this.f5290b, this.f5289a);
            }
        }
        m7019a(this.f5300l);
    }

    /* renamed from: b */
    public void mo5809b(C1346r rVar) {
        m7020a(this.f5300l, (T) rVar);
    }

    /* renamed from: e */
    public void mo5817e() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        } else if (!this.f5294f) {
            mo5863g();
        }
    }

    /* renamed from: a */
    public T mo5804a(C1346r rVar) {
        if (!mo5815d()) {
            if (!this.f5300l.contains(rVar)) {
                this.f5300l.add(rVar);
            }
            return this;
        }
        throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
    }

    /* renamed from: b */
    public float mo5806b() {
        return this.f5298j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public float mo5812c() {
        return this.f5298j * 0.75f;
    }

    /* renamed from: a */
    private static <T> void m7019a(ArrayList<T> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    /* renamed from: a */
    private static <T> void m7020a(ArrayList<T> arrayList, T t) {
        int indexOf = arrayList.indexOf(t);
        if (indexOf >= 0) {
            arrayList.set(indexOf, null);
        }
    }

    /* renamed from: a */
    public void mo5805a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
        } else if (this.f5294f) {
            m7021a(true);
        }
    }

    <K> C1328b(K k, C1350d<K> dVar) {
        this.f5289a = 0.0f;
        this.f5290b = Float.MAX_VALUE;
        this.f5291c = false;
        this.f5294f = false;
        this.f5295g = Float.MAX_VALUE;
        this.f5296h = -this.f5295g;
        this.f5297i = 0;
        this.f5299k = new ArrayList<>();
        this.f5300l = new ArrayList<>();
        this.f5292d = k;
        this.f5293e = dVar;
        C1350d dVar2 = this.f5293e;
        if (dVar2 == f5280r || dVar2 == f5281s || dVar2 == f5282t) {
            this.f5298j = 0.1f;
        } else if (dVar2 == f5286x) {
            this.f5298j = 0.00390625f;
        } else if (dVar2 == f5278p || dVar2 == f5279q) {
            this.f5298j = 0.00390625f;
        } else {
            this.f5298j = 1.0f;
        }
    }

    @C0207n0({C0208a.LIBRARY})
    /* renamed from: a */
    public boolean mo5797a(long j) {
        long j2 = this.f5297i;
        if (j2 == 0) {
            this.f5297i = j;
            mo5814d(this.f5290b);
            return false;
        }
        long j3 = j - j2;
        this.f5297i = j;
        boolean b = mo5811b(j3);
        this.f5290b = Math.min(this.f5290b, this.f5295g);
        this.f5290b = Math.max(this.f5290b, this.f5296h);
        mo5814d(this.f5290b);
        if (b) {
            m7021a(false);
        }
        return b;
    }

    /* renamed from: a */
    private void m7021a(boolean z) {
        this.f5294f = false;
        C1320a.m7008d().mo5793a((C1322b) this);
        this.f5297i = 0;
        this.f5291c = false;
        for (int i = 0; i < this.f5299k.size(); i++) {
            if (this.f5299k.get(i) != null) {
                ((C1345q) this.f5299k.get(i)).mo5850a(this, z, this.f5290b, this.f5289a);
            }
        }
        m7019a(this.f5299k);
    }
}
