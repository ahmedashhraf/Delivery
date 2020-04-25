package com.google.android.material.p187p;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Region.Op;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import androidx.annotation.C0188f;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0198k;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.C0216r0;
import androidx.annotation.C0237z;
import androidx.core.graphics.drawable.C0897e;
import androidx.core.p033k.C0937e;
import com.google.android.material.C5582R;
import com.google.android.material.p185e.C5713a;
import com.google.android.material.p187p.C6986o.C6989c;
import com.google.android.material.p187p.C6990p.C6991a;
import com.google.android.material.p298h.C6883a;
import com.google.android.material.p304o.C6967b;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: com.google.android.material.p.j */
/* compiled from: MaterialShapeDrawable */
public class C6978j extends Drawable implements C0897e, C7003s {

    /* renamed from: h0 */
    private static final float f19541h0 = 0.75f;

    /* renamed from: i0 */
    private static final float f19542i0 = 0.25f;

    /* renamed from: j0 */
    public static final int f19543j0 = 0;

    /* renamed from: k0 */
    public static final int f19544k0 = 1;

    /* renamed from: l0 */
    public static final int f19545l0 = 2;

    /* renamed from: m0 */
    private static final Paint f19546m0 = new Paint(1);
    /* access modifiers changed from: private */

    /* renamed from: N */
    public final C7001h[] f19547N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public boolean f19548O;

    /* renamed from: P */
    private final Matrix f19549P;

    /* renamed from: Q */
    private final Path f19550Q;

    /* renamed from: R */
    private final Path f19551R;

    /* renamed from: S */
    private final RectF f19552S;

    /* renamed from: T */
    private final RectF f19553T;

    /* renamed from: U */
    private final Region f19554U;

    /* renamed from: V */
    private final Region f19555V;

    /* renamed from: W */
    private C6986o f19556W;

    /* renamed from: X */
    private final Paint f19557X;

    /* renamed from: Y */
    private final Paint f19558Y;

    /* renamed from: Z */
    private final C6967b f19559Z;

    /* renamed from: a */
    private C6981d f19560a;
    @C0193h0

    /* renamed from: a0 */
    private final C6991a f19561a0;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C7001h[] f19562b;

    /* renamed from: b0 */
    private final C6990p f19563b0;
    @C0195i0

    /* renamed from: c0 */
    private PorterDuffColorFilter f19564c0;
    @C0195i0

    /* renamed from: d0 */
    private PorterDuffColorFilter f19565d0;
    @C0195i0

    /* renamed from: e0 */
    private Rect f19566e0;
    @C0193h0

    /* renamed from: f0 */
    private final RectF f19567f0;

    /* renamed from: g0 */
    private boolean f19568g0;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.p.j$c */
    /* compiled from: MaterialShapeDrawable */
    public @interface C5718c {
    }

    /* renamed from: com.google.android.material.p.j$a */
    /* compiled from: MaterialShapeDrawable */
    class C6979a implements C6991a {
        C6979a() {
        }

        /* renamed from: a */
        public void mo27847a(@C0193h0 C6993q qVar, Matrix matrix, int i) {
            C6978j.this.f19562b[i] = qVar.mo27906a(matrix);
        }

        /* renamed from: b */
        public void mo27848b(@C0193h0 C6993q qVar, Matrix matrix, int i) {
            C6978j.this.f19547N[i] = qVar.mo27906a(matrix);
        }
    }

    /* renamed from: com.google.android.material.p.j$b */
    /* compiled from: MaterialShapeDrawable */
    class C6980b implements C6989c {

        /* renamed from: a */
        final /* synthetic */ float f19570a;

        C6980b(float f) {
            this.f19570a = f;
        }

        @C0193h0
        /* renamed from: a */
        public C6971d mo27849a(@C0193h0 C6971d dVar) {
            return dVar instanceof C6984m ? dVar : new C6970b(this.f19570a, dVar);
        }
    }

    /* renamed from: com.google.android.material.p.j$d */
    /* compiled from: MaterialShapeDrawable */
    static final class C6981d extends ConstantState {
        @C0193h0

        /* renamed from: a */
        public C6986o f19572a;
        @C0195i0

        /* renamed from: b */
        public C6883a f19573b;
        @C0195i0

        /* renamed from: c */
        public ColorFilter f19574c;
        @C0195i0

        /* renamed from: d */
        public ColorStateList f19575d = null;
        @C0195i0

        /* renamed from: e */
        public ColorStateList f19576e = null;
        @C0195i0

        /* renamed from: f */
        public ColorStateList f19577f = null;
        @C0195i0

        /* renamed from: g */
        public ColorStateList f19578g = null;
        @C0195i0

        /* renamed from: h */
        public Mode f19579h = Mode.SRC_IN;
        @C0195i0

        /* renamed from: i */
        public Rect f19580i = null;

        /* renamed from: j */
        public float f19581j = 1.0f;

        /* renamed from: k */
        public float f19582k = 1.0f;

        /* renamed from: l */
        public float f19583l;

        /* renamed from: m */
        public int f19584m = 255;

        /* renamed from: n */
        public float f19585n = 0.0f;

        /* renamed from: o */
        public float f19586o = 0.0f;

        /* renamed from: p */
        public float f19587p = 0.0f;

        /* renamed from: q */
        public int f19588q = 0;

        /* renamed from: r */
        public int f19589r = 0;

        /* renamed from: s */
        public int f19590s = 0;

        /* renamed from: t */
        public int f19591t = 0;

        /* renamed from: u */
        public boolean f19592u = false;

        /* renamed from: v */
        public Style f19593v = Style.FILL_AND_STROKE;

        public C6981d(C6986o oVar, C6883a aVar) {
            this.f19572a = oVar;
            this.f19573b = aVar;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        @C0193h0
        public Drawable newDrawable() {
            C6978j jVar = new C6978j(this, null);
            jVar.f19548O = true;
            return jVar;
        }

        public C6981d(@C0193h0 C6981d dVar) {
            this.f19572a = dVar.f19572a;
            this.f19573b = dVar.f19573b;
            this.f19583l = dVar.f19583l;
            this.f19574c = dVar.f19574c;
            this.f19575d = dVar.f19575d;
            this.f19576e = dVar.f19576e;
            this.f19579h = dVar.f19579h;
            this.f19578g = dVar.f19578g;
            this.f19584m = dVar.f19584m;
            this.f19581j = dVar.f19581j;
            this.f19590s = dVar.f19590s;
            this.f19588q = dVar.f19588q;
            this.f19592u = dVar.f19592u;
            this.f19582k = dVar.f19582k;
            this.f19585n = dVar.f19585n;
            this.f19586o = dVar.f19586o;
            this.f19587p = dVar.f19587p;
            this.f19589r = dVar.f19589r;
            this.f19591t = dVar.f19591t;
            this.f19577f = dVar.f19577f;
            this.f19593v = dVar.f19593v;
            Rect rect = dVar.f19580i;
            if (rect != null) {
                this.f19580i = new Rect(rect);
            }
        }
    }

    /* synthetic */ C6978j(C6981d dVar, C6979a aVar) {
        this(dVar);
    }

    /* renamed from: E */
    private void mo22862E() {
        this.f19556W = getShapeAppearanceModel().mo27858a((C6989c) new C6980b(-mo22866G()));
        this.f19563b0.mo27902a(this.f19556W, this.f19560a.f19582k, mo22864F(), this.f19551R);
    }

    @C0193h0
    /* renamed from: F */
    private RectF mo22864F() {
        this.f19553T.set(mo27808d());
        float G = mo22866G();
        this.f19553T.inset(G, G);
        return this.f19553T;
    }

    /* renamed from: G */
    private float mo22866G() {
        if (mo22872J()) {
            return this.f19558Y.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    /* renamed from: H */
    private boolean mo22868H() {
        C6981d dVar = this.f19560a;
        int i = dVar.f19588q;
        if (i == 1 || dVar.f19589r <= 0 || (i != 2 && !mo22876L())) {
            return false;
        }
        return true;
    }

    /* renamed from: I */
    private boolean mo22870I() {
        Style style = this.f19560a.f19593v;
        return style == Style.FILL_AND_STROKE || style == Style.FILL;
    }

    /* renamed from: J */
    private boolean mo22872J() {
        Style style = this.f19560a.f19593v;
        return (style == Style.FILL_AND_STROKE || style == Style.STROKE) && this.f19558Y.getStrokeWidth() > 0.0f;
    }

    /* renamed from: K */
    private void mo22874K() {
        super.invalidateSelf();
    }

    /* renamed from: L */
    private boolean mo22876L() {
        return VERSION.SDK_INT < 21 || (!mo27781C() && !this.f19550Q.isConvex() && VERSION.SDK_INT < 29);
    }

    /* renamed from: M */
    private boolean mo22878M() {
        PorterDuffColorFilter porterDuffColorFilter = this.f19564c0;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f19565d0;
        C6981d dVar = this.f19560a;
        this.f19564c0 = m33428a(dVar.f19578g, dVar.f19579h, this.f19557X, true);
        C6981d dVar2 = this.f19560a;
        this.f19565d0 = m33428a(dVar2.f19577f, dVar2.f19579h, this.f19558Y, false);
        C6981d dVar3 = this.f19560a;
        if (dVar3.f19592u) {
            this.f19559Z.mo27759a(dVar3.f19578g.getColorForState(getState(), 0));
        }
        if (!C0937e.m5328a(porterDuffColorFilter, this.f19564c0) || !C0937e.m5328a(porterDuffColorFilter2, this.f19565d0)) {
            return true;
        }
        return false;
    }

    /* renamed from: N */
    private void mo22880N() {
        float z = mo27846z();
        this.f19560a.f19589r = (int) Math.ceil((double) (0.75f * z));
        this.f19560a.f19590s = (int) Math.ceil((double) (z * f19542i0));
        mo22878M();
        mo22874K();
    }

    /* renamed from: b */
    private static int m33437b(int i, int i2) {
        return (i * (i2 + (i2 >>> 7))) >>> 8;
    }

    @C0198k
    /* renamed from: h */
    private int mo22929h(@C0198k int i) {
        float z = mo27846z() + mo27826i();
        C6883a aVar = this.f19560a.f19573b;
        return aVar != null ? aVar.mo27483b(i, z) : i;
    }

    /* renamed from: A */
    public boolean mo27779A() {
        C6883a aVar = this.f19560a.f19573b;
        return aVar != null && aVar.mo27486c();
    }

    /* renamed from: B */
    public boolean mo27780B() {
        return this.f19560a.f19573b != null;
    }

    @C0207n0({C0208a.LIBRARY_GROUP})
    /* renamed from: C */
    public boolean mo27781C() {
        return this.f19560a.f19572a.mo27859a(mo27808d());
    }

    @Deprecated
    /* renamed from: D */
    public boolean mo27782D() {
        int i = this.f19560a.f19588q;
        return i == 0 || i == 2;
    }

    /* renamed from: c */
    public void mo27806c(ColorStateList colorStateList) {
        this.f19560a.f19577f = colorStateList;
        mo22878M();
        mo22874K();
    }

    /* access modifiers changed from: protected */
    @C0193h0
    /* renamed from: d */
    public RectF mo27808d() {
        this.f19552S.set(getBounds());
        return this.f19552S;
    }

    public void draw(@C0193h0 Canvas canvas) {
        this.f19557X.setColorFilter(this.f19564c0);
        int alpha = this.f19557X.getAlpha();
        this.f19557X.setAlpha(m33437b(alpha, this.f19560a.f19584m));
        this.f19558Y.setColorFilter(this.f19565d0);
        this.f19558Y.setStrokeWidth(this.f19560a.f19583l);
        int alpha2 = this.f19558Y.getAlpha();
        this.f19558Y.setAlpha(m33437b(alpha2, this.f19560a.f19584m));
        if (this.f19548O) {
            mo22862E();
            m33440b(mo27808d(), this.f19550Q);
            this.f19548O = false;
        }
        m33443d(canvas);
        if (mo22870I()) {
            m33439b(canvas);
        }
        if (mo22872J()) {
            m33442c(canvas);
        }
        this.f19557X.setAlpha(alpha);
        this.f19558Y.setAlpha(alpha2);
    }

    /* renamed from: e */
    public float mo27812e() {
        return this.f19560a.f19586o;
    }

    @C0195i0
    /* renamed from: f */
    public ColorStateList mo27815f() {
        return this.f19560a.f19575d;
    }

    /* renamed from: g */
    public void mo27820g(@C0198k int i) {
        mo27806c(ColorStateList.valueOf(i));
    }

    @C0195i0
    public ConstantState getConstantState() {
        return this.f19560a;
    }

    public int getOpacity() {
        return -3;
    }

    @TargetApi(21)
    public void getOutline(@C0193h0 Outline outline) {
        if (this.f19560a.f19588q != 2) {
            if (mo27781C()) {
                outline.setRoundRect(getBounds(), mo27843w());
                return;
            }
            m33440b(mo27808d(), this.f19550Q);
            if (this.f19550Q.isConvex() || VERSION.SDK_INT >= 29) {
                outline.setConvexPath(this.f19550Q);
            }
        }
    }

    public boolean getPadding(@C0193h0 Rect rect) {
        Rect rect2 = this.f19566e0;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @C0193h0
    public C6986o getShapeAppearanceModel() {
        return this.f19560a.f19572a;
    }

    public Region getTransparentRegion() {
        this.f19554U.set(getBounds());
        m33440b(mo27808d(), this.f19550Q);
        this.f19555V.setPath(this.f19550Q, this.f19554U);
        this.f19554U.op(this.f19555V, Op.DIFFERENCE);
        return this.f19554U;
    }

    /* renamed from: i */
    public float mo27826i() {
        return this.f19560a.f19585n;
    }

    public void invalidateSelf() {
        this.f19548O = true;
        super.invalidateSelf();
    }

    public boolean isStateful() {
        if (!super.isStateful()) {
            ColorStateList colorStateList = this.f19560a.f19578g;
            if (colorStateList == null || !colorStateList.isStateful()) {
                ColorStateList colorStateList2 = this.f19560a.f19577f;
                if (colorStateList2 == null || !colorStateList2.isStateful()) {
                    ColorStateList colorStateList3 = this.f19560a.f19576e;
                    if (colorStateList3 == null || !colorStateList3.isStateful()) {
                        ColorStateList colorStateList4 = this.f19560a.f19575d;
                        if (colorStateList4 == null || !colorStateList4.isStateful()) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    /* renamed from: j */
    public float mo27828j() {
        return this.f19560a.f19581j;
    }

    /* renamed from: k */
    public int mo27829k() {
        return this.f19560a.f19591t;
    }

    /* renamed from: l */
    public int mo27830l() {
        return this.f19560a.f19588q;
    }

    @Deprecated
    /* renamed from: m */
    public int mo27831m() {
        return (int) mo27812e();
    }

    @C0193h0
    public Drawable mutate() {
        this.f19560a = new C6981d(this.f19560a);
        return this;
    }

    /* renamed from: n */
    public int mo27833n() {
        C6981d dVar = this.f19560a;
        double d = (double) dVar.f19590s;
        double sin = Math.sin(Math.toRadians((double) dVar.f19591t));
        Double.isNaN(d);
        return (int) (d * sin);
    }

    /* renamed from: o */
    public int mo27834o() {
        C6981d dVar = this.f19560a;
        double d = (double) dVar.f19590s;
        double cos = Math.cos(Math.toRadians((double) dVar.f19591t));
        Double.isNaN(d);
        return (int) (d * cos);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f19548O = true;
        super.onBoundsChange(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean z = mo22902a(iArr) || mo22878M();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    /* renamed from: p */
    public int mo27836p() {
        return this.f19560a.f19589r;
    }

    @C0207n0({C0208a.LIBRARY_GROUP})
    /* renamed from: q */
    public int mo27837q() {
        return this.f19560a.f19590s;
    }

    @Deprecated
    @C0195i0
    /* renamed from: r */
    public C7002r mo27838r() {
        C6986o shapeAppearanceModel = getShapeAppearanceModel();
        if (shapeAppearanceModel instanceof C7002r) {
            return (C7002r) shapeAppearanceModel;
        }
        return null;
    }

    @C0195i0
    /* renamed from: s */
    public ColorStateList mo27839s() {
        return this.f19560a.f19576e;
    }

    public void setAlpha(@C0237z(from = 0, mo691to = 255) int i) {
        C6981d dVar = this.f19560a;
        if (dVar.f19584m != i) {
            dVar.f19584m = i;
            mo22874K();
        }
    }

    public void setColorFilter(@C0195i0 ColorFilter colorFilter) {
        this.f19560a.f19574c = colorFilter;
        mo22874K();
    }

    public void setShapeAppearanceModel(@C0193h0 C6986o oVar) {
        this.f19560a.f19572a = oVar;
        invalidateSelf();
    }

    public void setTint(@C0198k int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(@C0195i0 ColorStateList colorStateList) {
        this.f19560a.f19578g = colorStateList;
        mo22878M();
        mo22874K();
    }

    public void setTintMode(@C0195i0 Mode mode) {
        C6981d dVar = this.f19560a;
        if (dVar.f19579h != mode) {
            dVar.f19579h = mode;
            mo22878M();
            mo22874K();
        }
    }

    @C0195i0
    /* renamed from: t */
    public ColorStateList mo27840t() {
        return this.f19560a.f19577f;
    }

    /* renamed from: u */
    public float mo27841u() {
        return this.f19560a.f19583l;
    }

    @C0195i0
    /* renamed from: v */
    public ColorStateList mo27842v() {
        return this.f19560a.f19578g;
    }

    /* renamed from: w */
    public float mo27843w() {
        return this.f19560a.f19572a.mo27868j().mo27763a(mo27808d());
    }

    /* renamed from: x */
    public float mo27844x() {
        return this.f19560a.f19572a.mo27870l().mo27763a(mo27808d());
    }

    /* renamed from: y */
    public float mo27845y() {
        return this.f19560a.f19587p;
    }

    /* renamed from: z */
    public float mo27846z() {
        return mo27812e() + mo27845y();
    }

    public C6978j() {
        this(new C6986o());
    }

    @C0193h0
    /* renamed from: b */
    public static C6978j m33438b(Context context) {
        return m33431a(context, 0.0f);
    }

    @Deprecated
    /* renamed from: e */
    public void mo27814e(int i) {
        this.f19560a.f19589r = i;
    }

    /* renamed from: f */
    public void mo27816f(float f) {
        this.f19560a.f19583l = f;
        invalidateSelf();
    }

    /* renamed from: g */
    public float mo27818g() {
        return this.f19560a.f19582k;
    }

    public C6978j(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet, @C0188f int i, @C0216r0 int i2) {
        this(C6986o.m33526a(context, attributeSet, i, i2).mo27878a());
    }

    @C0193h0
    /* renamed from: a */
    public static C6978j m33431a(Context context, float f) {
        int a = C5713a.m25189a(context, C5582R.attr.colorSurface, C6978j.class.getSimpleName());
        C6978j jVar = new C6978j();
        jVar.mo27789a(context);
        jVar.mo27790a(ColorStateList.valueOf(a));
        jVar.mo27799b(f);
        return jVar;
    }

    /* renamed from: b */
    public void mo27801b(@C0195i0 ColorStateList colorStateList) {
        C6981d dVar = this.f19560a;
        if (dVar.f19576e != colorStateList) {
            dVar.f19576e = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: d */
    public void mo27809d(float f) {
        C6981d dVar = this.f19560a;
        if (dVar.f19585n != f) {
            dVar.f19585n = f;
            mo22880N();
        }
    }

    /* renamed from: e */
    public void mo27813e(float f) {
        C6981d dVar = this.f19560a;
        if (dVar.f19581j != f) {
            dVar.f19581j = f;
            invalidateSelf();
        }
    }

    /* renamed from: g */
    public void mo27819g(float f) {
        C6981d dVar = this.f19560a;
        if (dVar.f19587p != f) {
            dVar.f19587p = f;
            mo22880N();
        }
    }

    @Deprecated
    public C6978j(@C0193h0 C7002r rVar) {
        this((C6986o) rVar);
    }

    /* renamed from: c */
    public void mo27805c(int i) {
        C6981d dVar = this.f19560a;
        if (dVar.f19588q != i) {
            dVar.f19588q = i;
            mo22874K();
        }
    }

    @C0207n0({C0208a.LIBRARY_GROUP})
    /* renamed from: f */
    public void mo27817f(int i) {
        C6981d dVar = this.f19560a;
        if (dVar.f19590s != i) {
            dVar.f19590s = i;
            mo22874K();
        }
    }

    /* renamed from: h */
    public void mo27825h(float f) {
        mo27819g(f - mo27812e());
    }

    public C6978j(@C0193h0 C6986o oVar) {
        this(new C6981d(oVar, null));
    }

    /* renamed from: h */
    public Style mo27824h() {
        return this.f19560a.f19593v;
    }

    private C6978j(@C0193h0 C6981d dVar) {
        this.f19562b = new C7001h[4];
        this.f19547N = new C7001h[4];
        this.f19549P = new Matrix();
        this.f19550Q = new Path();
        this.f19551R = new Path();
        this.f19552S = new RectF();
        this.f19553T = new RectF();
        this.f19554U = new Region();
        this.f19555V = new Region();
        this.f19557X = new Paint(1);
        this.f19558Y = new Paint(1);
        this.f19559Z = new C6967b();
        this.f19563b0 = new C6990p();
        this.f19567f0 = new RectF();
        this.f19568g0 = true;
        this.f19560a = dVar;
        this.f19558Y.setStyle(Style.STROKE);
        this.f19557X.setStyle(Style.FILL);
        f19546m0.setColor(-1);
        f19546m0.setXfermode(new PorterDuffXfermode(Mode.DST_OUT));
        mo22878M();
        mo22902a(getState());
        this.f19561a0 = new C6979a();
    }

    /* renamed from: e */
    private void m33444e(@C0193h0 Canvas canvas) {
        int n = mo27833n();
        int o = mo27834o();
        if (VERSION.SDK_INT < 21 && this.f19568g0) {
            Rect clipBounds = canvas.getClipBounds();
            int i = this.f19560a.f19589r;
            clipBounds.inset(-i, -i);
            clipBounds.offset(n, o);
            canvas.clipRect(clipBounds, Op.REPLACE);
        }
        canvas.translate((float) n, (float) o);
    }

    /* renamed from: b */
    public void mo27799b(float f) {
        C6981d dVar = this.f19560a;
        if (dVar.f19586o != f) {
            dVar.f19586o = f;
            mo22880N();
        }
    }

    @Deprecated
    /* renamed from: d */
    public void mo27810d(int i) {
        mo27799b((float) i);
    }

    @Deprecated
    /* renamed from: c */
    public void mo27807c(boolean z) {
        mo27805c(z ^ true ? 1 : 0);
    }

    /* renamed from: d */
    public void mo27811d(boolean z) {
        C6981d dVar = this.f19560a;
        if (dVar.f19592u != z) {
            dVar.f19592u = z;
            invalidateSelf();
        }
    }

    /* renamed from: c */
    public void mo27804c(float f) {
        C6981d dVar = this.f19560a;
        if (dVar.f19582k != f) {
            dVar.f19582k = f;
            this.f19548O = true;
            invalidateSelf();
        }
    }

    @C0207n0({C0208a.LIBRARY_GROUP})
    /* renamed from: b */
    public void mo27802b(boolean z) {
        this.f19568g0 = z;
    }

    /* renamed from: d */
    private void m33443d(@C0193h0 Canvas canvas) {
        if (mo22868H()) {
            canvas.save();
            m33444e(canvas);
            if (!this.f19568g0) {
                m33432a(canvas);
                canvas.restore();
                return;
            }
            int width = (int) (this.f19567f0.width() - ((float) getBounds().width()));
            int height = (int) (this.f19567f0.height() - ((float) getBounds().height()));
            Bitmap createBitmap = Bitmap.createBitmap(((int) this.f19567f0.width()) + (this.f19560a.f19589r * 2) + width, ((int) this.f19567f0.height()) + (this.f19560a.f19589r * 2) + height, Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap);
            float f = (float) ((getBounds().left - this.f19560a.f19589r) - width);
            float f2 = (float) ((getBounds().top - this.f19560a.f19589r) - height);
            canvas2.translate(-f, -f2);
            m33432a(canvas2);
            canvas.drawBitmap(createBitmap, f, f2, null);
            createBitmap.recycle();
            canvas.restore();
        }
    }

    @Deprecated
    /* renamed from: a */
    public void mo27795a(@C0193h0 C7002r rVar) {
        setShapeAppearanceModel(rVar);
    }

    /* renamed from: b */
    public void mo27800b(int i) {
        C6981d dVar = this.f19560a;
        if (dVar.f19591t != i) {
            dVar.f19591t = i;
            mo22874K();
        }
    }

    /* renamed from: a */
    public void mo27790a(@C0195i0 ColorStateList colorStateList) {
        C6981d dVar = this.f19560a;
        if (dVar.f19575d != colorStateList) {
            dVar.f19575d = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: c */
    private void m33442c(@C0193h0 Canvas canvas) {
        m33433a(canvas, this.f19558Y, this.f19551R, this.f19556W, mo22864F());
    }

    /* renamed from: b */
    private void m33439b(@C0193h0 Canvas canvas) {
        m33433a(canvas, this.f19557X, this.f19550Q, this.f19560a.f19572a, mo27808d());
    }

    /* renamed from: b */
    private void m33440b(@C0193h0 RectF rectF, @C0193h0 Path path) {
        mo27793a(rectF, path);
        if (this.f19560a.f19581j != 1.0f) {
            this.f19549P.reset();
            Matrix matrix = this.f19549P;
            float f = this.f19560a.f19581j;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f19549P);
        }
        path.computeBounds(this.f19567f0, true);
    }

    /* renamed from: a */
    public void mo27784a(float f, @C0198k int i) {
        mo27816f(f);
        mo27801b(ColorStateList.valueOf(i));
    }

    /* renamed from: c */
    public float mo27803c() {
        return this.f19560a.f19572a.mo27863e().mo27763a(mo27808d());
    }

    /* renamed from: a */
    public void mo27785a(float f, @C0195i0 ColorStateList colorStateList) {
        mo27816f(f);
        mo27801b(colorStateList);
    }

    /* renamed from: a */
    public void mo27783a(float f) {
        setShapeAppearanceModel(this.f19560a.f19572a.mo27856a(f));
    }

    /* renamed from: a */
    public void mo27794a(@C0193h0 C6971d dVar) {
        setShapeAppearanceModel(this.f19560a.f19572a.mo27857a(dVar));
    }

    /* renamed from: a */
    public boolean mo27797a(int i, int i2) {
        return getTransparentRegion().contains(i, i2);
    }

    /* renamed from: a */
    public void mo27787a(int i, int i2, int i3, int i4) {
        C6981d dVar = this.f19560a;
        if (dVar.f19580i == null) {
            dVar.f19580i = new Rect();
        }
        this.f19560a.f19580i.set(i, i2, i3, i4);
        this.f19566e0 = this.f19560a.f19580i;
        invalidateSelf();
    }

    /* renamed from: b */
    public float mo27798b() {
        return this.f19560a.f19572a.mo27861c().mo27763a(mo27808d());
    }

    /* renamed from: a */
    public void mo27789a(Context context) {
        this.f19560a.f19573b = new C6883a(context);
        mo22880N();
    }

    @C0207n0({C0208a.LIBRARY_GROUP})
    /* renamed from: a */
    public void mo27796a(boolean z) {
        this.f19563b0.mo27904a(z);
    }

    /* renamed from: a */
    public void mo27786a(int i) {
        this.f19559Z.mo27759a(i);
        this.f19560a.f19592u = false;
        mo22874K();
    }

    /* renamed from: a */
    public void mo27792a(Style style) {
        this.f19560a.f19593v = style;
        mo22874K();
    }

    /* access modifiers changed from: protected */
    @C0207n0({C0208a.LIBRARY_GROUP})
    /* renamed from: a */
    public void mo27791a(@C0193h0 Canvas canvas, @C0193h0 Paint paint, @C0193h0 Path path, @C0193h0 RectF rectF) {
        m33433a(canvas, paint, path, this.f19560a.f19572a, rectF);
    }

    /* renamed from: a */
    private void m33433a(@C0193h0 Canvas canvas, @C0193h0 Paint paint, @C0193h0 Path path, @C0193h0 C6986o oVar, @C0193h0 RectF rectF) {
        if (oVar.mo27859a(rectF)) {
            float a = oVar.mo27870l().mo27763a(rectF);
            canvas.drawRoundRect(rectF, a, a, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    /* renamed from: a */
    private void m33432a(@C0193h0 Canvas canvas) {
        if (this.f19560a.f19590s != 0) {
            canvas.drawPath(this.f19550Q, this.f19559Z.mo27758a());
        }
        for (int i = 0; i < 4; i++) {
            this.f19562b[i].mo27919a(this.f19559Z, this.f19560a.f19589r, canvas);
            this.f19547N[i].mo27919a(this.f19559Z, this.f19560a.f19589r, canvas);
        }
        if (this.f19568g0) {
            int n = mo27833n();
            int o = mo27834o();
            canvas.translate((float) (-n), (float) (-o));
            canvas.drawPath(this.f19550Q, f19546m0);
            canvas.translate((float) n, (float) o);
        }
    }

    @Deprecated
    /* renamed from: a */
    public void mo27788a(int i, int i2, @C0193h0 Path path) {
        mo27793a(new RectF(0.0f, 0.0f, (float) i, (float) i2), path);
    }

    /* access modifiers changed from: protected */
    @C0207n0({C0208a.LIBRARY_GROUP})
    /* renamed from: a */
    public final void mo27793a(@C0193h0 RectF rectF, @C0193h0 Path path) {
        C6990p pVar = this.f19563b0;
        C6981d dVar = this.f19560a;
        C6986o oVar = dVar.f19572a;
        float f = dVar.f19582k;
        pVar.mo27903a(oVar, f, rectF, this.f19561a0, path);
    }

    @C0193h0
    /* renamed from: a */
    private PorterDuffColorFilter m33428a(@C0195i0 ColorStateList colorStateList, @C0195i0 Mode mode, @C0193h0 Paint paint, boolean z) {
        if (colorStateList == null || mode == null) {
            return m33430a(paint, z);
        }
        return m33429a(colorStateList, mode, z);
    }

    @C0195i0
    /* renamed from: a */
    private PorterDuffColorFilter m33430a(@C0193h0 Paint paint, boolean z) {
        if (z) {
            int color = paint.getColor();
            int h = mo22929h(color);
            if (h != color) {
                return new PorterDuffColorFilter(h, Mode.SRC_IN);
            }
        }
        return null;
    }

    @C0193h0
    /* renamed from: a */
    private PorterDuffColorFilter m33429a(@C0193h0 ColorStateList colorStateList, @C0193h0 Mode mode, boolean z) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = mo22929h(colorForState);
        }
        return new PorterDuffColorFilter(colorForState, mode);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean mo22902a(int[] r5) {
        /*
            r4 = this;
            com.google.android.material.p.j$d r0 = r4.f19560a
            android.content.res.ColorStateList r0 = r0.f19575d
            r1 = 1
            if (r0 == 0) goto L_0x001e
            android.graphics.Paint r0 = r4.f19557X
            int r0 = r0.getColor()
            com.google.android.material.p.j$d r2 = r4.f19560a
            android.content.res.ColorStateList r2 = r2.f19575d
            int r2 = r2.getColorForState(r5, r0)
            if (r0 == r2) goto L_0x001e
            android.graphics.Paint r0 = r4.f19557X
            r0.setColor(r2)
            r0 = 1
            goto L_0x001f
        L_0x001e:
            r0 = 0
        L_0x001f:
            com.google.android.material.p.j$d r2 = r4.f19560a
            android.content.res.ColorStateList r2 = r2.f19576e
            if (r2 == 0) goto L_0x003b
            android.graphics.Paint r2 = r4.f19558Y
            int r2 = r2.getColor()
            com.google.android.material.p.j$d r3 = r4.f19560a
            android.content.res.ColorStateList r3 = r3.f19576e
            int r5 = r3.getColorForState(r5, r2)
            if (r2 == r5) goto L_0x003b
            android.graphics.Paint r0 = r4.f19558Y
            r0.setColor(r5)
            r0 = 1
        L_0x003b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.p187p.C6978j.mo22902a(int[]):boolean");
    }
}
