package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0198k;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.core.p027g.C0890a;
import androidx.core.p031j.C0919f;
import androidx.core.p034l.C0962e0;
import androidx.core.p034l.C0984g;
import com.google.android.material.p179a.C5587a;
import com.google.android.material.p302m.C6949a;
import com.google.android.material.p302m.C6949a.C6950a;
import com.google.android.material.p302m.C6953d;
import com.google.android.material.p302m.C6957f;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

@C0207n0({C0208a.LIBRARY_GROUP})
/* renamed from: com.google.android.material.internal.a */
/* compiled from: CollapsingTextHelper */
public final class C6893a {

    /* renamed from: V */
    private static final boolean f19251V = (VERSION.SDK_INT < 18);

    /* renamed from: W */
    private static final boolean f19252W = false;
    @C0193h0

    /* renamed from: X */
    private static final Paint f19253X = null;

    /* renamed from: A */
    private boolean f19254A;
    @C0195i0

    /* renamed from: B */
    private Bitmap f19255B;

    /* renamed from: C */
    private Paint f19256C;

    /* renamed from: D */
    private float f19257D;

    /* renamed from: E */
    private float f19258E;

    /* renamed from: F */
    private float f19259F;

    /* renamed from: G */
    private float f19260G;

    /* renamed from: H */
    private int[] f19261H;

    /* renamed from: I */
    private boolean f19262I;
    @C0193h0

    /* renamed from: J */
    private final TextPaint f19263J;
    @C0193h0

    /* renamed from: K */
    private final TextPaint f19264K;

    /* renamed from: L */
    private TimeInterpolator f19265L;

    /* renamed from: M */
    private TimeInterpolator f19266M;

    /* renamed from: N */
    private float f19267N;

    /* renamed from: O */
    private float f19268O;

    /* renamed from: P */
    private float f19269P;

    /* renamed from: Q */
    private ColorStateList f19270Q;

    /* renamed from: R */
    private float f19271R;

    /* renamed from: S */
    private float f19272S;

    /* renamed from: T */
    private float f19273T;

    /* renamed from: U */
    private ColorStateList f19274U;

    /* renamed from: a */
    private final View f19275a;

    /* renamed from: b */
    private boolean f19276b;

    /* renamed from: c */
    private float f19277c;
    @C0193h0

    /* renamed from: d */
    private final Rect f19278d;
    @C0193h0

    /* renamed from: e */
    private final Rect f19279e;
    @C0193h0

    /* renamed from: f */
    private final RectF f19280f;

    /* renamed from: g */
    private int f19281g = 16;

    /* renamed from: h */
    private int f19282h = 16;

    /* renamed from: i */
    private float f19283i = 15.0f;

    /* renamed from: j */
    private float f19284j = 15.0f;

    /* renamed from: k */
    private ColorStateList f19285k;

    /* renamed from: l */
    private ColorStateList f19286l;

    /* renamed from: m */
    private float f19287m;

    /* renamed from: n */
    private float f19288n;

    /* renamed from: o */
    private float f19289o;

    /* renamed from: p */
    private float f19290p;

    /* renamed from: q */
    private float f19291q;

    /* renamed from: r */
    private float f19292r;

    /* renamed from: s */
    private Typeface f19293s;

    /* renamed from: t */
    private Typeface f19294t;

    /* renamed from: u */
    private Typeface f19295u;

    /* renamed from: v */
    private C6949a f19296v;

    /* renamed from: w */
    private C6949a f19297w;
    @C0195i0

    /* renamed from: x */
    private CharSequence f19298x;
    @C0195i0

    /* renamed from: y */
    private CharSequence f19299y;

    /* renamed from: z */
    private boolean f19300z;

    /* renamed from: com.google.android.material.internal.a$a */
    /* compiled from: CollapsingTextHelper */
    class C6894a implements C6950a {
        C6894a() {
        }

        /* renamed from: a */
        public void mo27572a(Typeface typeface) {
            C6893a.this.mo27542a(typeface);
        }
    }

    /* renamed from: com.google.android.material.internal.a$b */
    /* compiled from: CollapsingTextHelper */
    class C6895b implements C6950a {
        C6895b() {
        }

        /* renamed from: a */
        public void mo27572a(Typeface typeface) {
            C6893a.this.mo27552b(typeface);
        }
    }

    static {
        Paint paint = f19253X;
        if (paint != null) {
            paint.setAntiAlias(true);
            f19253X.setColor(-65281);
        }
    }

    public C6893a(View view) {
        this.f19275a = view;
        this.f19263J = new TextPaint(C13959t.f40835R1);
        this.f19264K = new TextPaint(this.f19263J);
        this.f19279e = new Rect();
        this.f19278d = new Rect();
        this.f19280f = new RectF();
    }

    /* renamed from: e */
    private boolean m33103e(Typeface typeface) {
        C6949a aVar = this.f19296v;
        if (aVar != null) {
            aVar.mo27690a();
        }
        if (this.f19294t == typeface) {
            return false;
        }
        this.f19294t = typeface;
        return true;
    }

    /* renamed from: r */
    private void m33106r() {
        float f = this.f19260G;
        m33102e(this.f19284j);
        CharSequence charSequence = this.f19299y;
        float f2 = 0.0f;
        float measureText = charSequence != null ? this.f19263J.measureText(charSequence, 0, charSequence.length()) : 0.0f;
        int a = C0984g.m5636a(this.f19282h, this.f19300z ? 1 : 0);
        int i = a & 112;
        if (i == 48) {
            this.f19288n = ((float) this.f19279e.top) - this.f19263J.ascent();
        } else if (i != 80) {
            this.f19288n = ((float) this.f19279e.centerY()) + (((this.f19263J.descent() - this.f19263J.ascent()) / 2.0f) - this.f19263J.descent());
        } else {
            this.f19288n = (float) this.f19279e.bottom;
        }
        int i2 = a & C0984g.f4396d;
        if (i2 == 1) {
            this.f19290p = ((float) this.f19279e.centerX()) - (measureText / 2.0f);
        } else if (i2 != 5) {
            this.f19290p = (float) this.f19279e.left;
        } else {
            this.f19290p = ((float) this.f19279e.right) - measureText;
        }
        m33102e(this.f19283i);
        CharSequence charSequence2 = this.f19299y;
        if (charSequence2 != null) {
            f2 = this.f19263J.measureText(charSequence2, 0, charSequence2.length());
        }
        int a2 = C0984g.m5636a(this.f19281g, this.f19300z ? 1 : 0);
        int i3 = a2 & 112;
        if (i3 == 48) {
            this.f19287m = ((float) this.f19278d.top) - this.f19263J.ascent();
        } else if (i3 != 80) {
            this.f19287m = ((float) this.f19278d.centerY()) + (((this.f19263J.descent() - this.f19263J.ascent()) / 2.0f) - this.f19263J.descent());
        } else {
            this.f19287m = (float) this.f19278d.bottom;
        }
        int i4 = a2 & C0984g.f4396d;
        if (i4 == 1) {
            this.f19289o = ((float) this.f19278d.centerX()) - (f2 / 2.0f);
        } else if (i4 != 5) {
            this.f19289o = (float) this.f19278d.left;
        } else {
            this.f19289o = ((float) this.f19278d.right) - f2;
        }
        m33108t();
        m33105g(f);
    }

    /* renamed from: s */
    private void m33107s() {
        m33100d(this.f19277c);
    }

    /* renamed from: t */
    private void m33108t() {
        Bitmap bitmap = this.f19255B;
        if (bitmap != null) {
            bitmap.recycle();
            this.f19255B = null;
        }
    }

    /* renamed from: u */
    private void m33109u() {
        if (this.f19255B == null && !this.f19278d.isEmpty() && !TextUtils.isEmpty(this.f19299y)) {
            m33100d(0.0f);
            this.f19257D = this.f19263J.ascent();
            this.f19258E = this.f19263J.descent();
            TextPaint textPaint = this.f19263J;
            CharSequence charSequence = this.f19299y;
            int round = Math.round(textPaint.measureText(charSequence, 0, charSequence.length()));
            int round2 = Math.round(this.f19258E - this.f19257D);
            if (round > 0 && round2 > 0) {
                this.f19255B = Bitmap.createBitmap(round, round2, Config.ARGB_8888);
                Canvas canvas = new Canvas(this.f19255B);
                CharSequence charSequence2 = this.f19299y;
                canvas.drawText(charSequence2, 0, charSequence2.length(), 0.0f, ((float) round2) - this.f19263J.descent(), this.f19263J);
                if (this.f19256C == null) {
                    this.f19256C = new Paint(3);
                }
            }
        }
    }

    @C0198k
    /* renamed from: v */
    private int m33110v() {
        return m33099c(this.f19285k);
    }

    /* renamed from: a */
    public void mo27537a(TimeInterpolator timeInterpolator) {
        this.f19265L = timeInterpolator;
        mo27571q();
    }

    /* renamed from: b */
    public void mo27549b(TimeInterpolator timeInterpolator) {
        this.f19266M = timeInterpolator;
        mo27571q();
    }

    /* renamed from: c */
    public int mo27553c() {
        return this.f19282h;
    }

    /* renamed from: d */
    public float mo27557d() {
        m33093a(this.f19264K);
        return -this.f19264K.ascent();
    }

    /* renamed from: f */
    public Typeface mo27560f() {
        Typeface typeface = this.f19293s;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    @C0198k
    /* renamed from: g */
    public int mo27561g() {
        return m33099c(this.f19286l);
    }

    /* renamed from: h */
    public ColorStateList mo27562h() {
        return this.f19285k;
    }

    /* renamed from: i */
    public int mo27563i() {
        return this.f19281g;
    }

    /* renamed from: j */
    public float mo27564j() {
        m33097b(this.f19264K);
        return -this.f19264K.ascent();
    }

    /* renamed from: k */
    public float mo27565k() {
        return this.f19283i;
    }

    /* renamed from: l */
    public Typeface mo27566l() {
        Typeface typeface = this.f19294t;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    /* renamed from: m */
    public float mo27567m() {
        return this.f19277c;
    }

    @C0195i0
    /* renamed from: n */
    public CharSequence mo27568n() {
        return this.f19298x;
    }

    /* renamed from: o */
    public final boolean mo27569o() {
        ColorStateList colorStateList = this.f19286l;
        if (colorStateList == null || !colorStateList.isStateful()) {
            ColorStateList colorStateList2 = this.f19285k;
            if (colorStateList2 == null || !colorStateList2.isStateful()) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public void mo27570p() {
        this.f19276b = this.f19279e.width() > 0 && this.f19279e.height() > 0 && this.f19278d.width() > 0 && this.f19278d.height() > 0;
    }

    /* renamed from: q */
    public void mo27571q() {
        if (this.f19275a.getHeight() > 0 && this.f19275a.getWidth() > 0) {
            m33106r();
            m33107s();
        }
    }

    /* renamed from: f */
    private void m33104f(float f) {
        this.f19280f.left = m33090a((float) this.f19278d.left, (float) this.f19279e.left, f, this.f19265L);
        this.f19280f.top = m33090a(this.f19287m, this.f19288n, f, this.f19265L);
        this.f19280f.right = m33090a((float) this.f19278d.right, (float) this.f19279e.right, f, this.f19265L);
        this.f19280f.bottom = m33090a((float) this.f19278d.bottom, (float) this.f19279e.bottom, f, this.f19265L);
    }

    /* renamed from: g */
    private void m33105g(float f) {
        m33102e(f);
        this.f19254A = f19251V && this.f19259F != 1.0f;
        if (this.f19254A) {
            m33109u();
        }
        C0962e0.m5561u0(this.f19275a);
    }

    /* renamed from: c */
    public void mo27555c(int i) {
        C6953d dVar = new C6953d(this.f19275a.getContext(), i);
        ColorStateList colorStateList = dVar.f19445b;
        if (colorStateList != null) {
            this.f19285k = colorStateList;
        }
        float f = dVar.f19444a;
        if (f != 0.0f) {
            this.f19283i = f;
        }
        ColorStateList colorStateList2 = dVar.f19452i;
        if (colorStateList2 != null) {
            this.f19274U = colorStateList2;
        }
        this.f19272S = dVar.f19453j;
        this.f19273T = dVar.f19454k;
        this.f19271R = dVar.f19455l;
        C6949a aVar = this.f19296v;
        if (aVar != null) {
            aVar.mo27690a();
        }
        this.f19296v = new C6949a(new C6895b(), dVar.mo27691a());
        dVar.mo27694a(this.f19275a.getContext(), (C6957f) this.f19296v);
        mo27571q();
    }

    /* renamed from: a */
    public void mo27534a(float f) {
        if (this.f19284j != f) {
            this.f19284j = f;
            mo27571q();
        }
    }

    /* renamed from: b */
    public void mo27546b(float f) {
        if (this.f19283i != f) {
            this.f19283i = f;
            mo27571q();
        }
    }

    /* renamed from: d */
    public void mo27558d(int i) {
        if ((8388615 & i) == 0) {
            i |= C0984g.f4394b;
        }
        if (this.f19281g != i) {
            this.f19281g = i;
            mo27571q();
        }
    }

    /* renamed from: e */
    public float mo27559e() {
        return this.f19284j;
    }

    /* renamed from: d */
    private boolean m33101d(Typeface typeface) {
        C6949a aVar = this.f19297w;
        if (aVar != null) {
            aVar.mo27690a();
        }
        if (this.f19293s == typeface) {
            return false;
        }
        this.f19293s = typeface;
        return true;
    }

    /* renamed from: e */
    private void m33102e(float f) {
        boolean z;
        float f2;
        boolean z2;
        if (this.f19298x != null) {
            float width = (float) this.f19279e.width();
            float width2 = (float) this.f19278d.width();
            boolean z3 = true;
            if (m33094a(f, this.f19284j)) {
                float f3 = this.f19284j;
                this.f19259F = 1.0f;
                Typeface typeface = this.f19295u;
                Typeface typeface2 = this.f19293s;
                if (typeface != typeface2) {
                    this.f19295u = typeface2;
                    z2 = true;
                } else {
                    z2 = false;
                }
                f2 = f3;
                z = z2;
            } else {
                f2 = this.f19283i;
                Typeface typeface3 = this.f19295u;
                Typeface typeface4 = this.f19294t;
                if (typeface3 != typeface4) {
                    this.f19295u = typeface4;
                    z = true;
                } else {
                    z = false;
                }
                if (m33094a(f, this.f19283i)) {
                    this.f19259F = 1.0f;
                } else {
                    this.f19259F = f / this.f19283i;
                }
                float f4 = this.f19284j / this.f19283i;
                width = width2 * f4 > width ? Math.min(width / f4, width2) : width2;
            }
            if (width > 0.0f) {
                z = this.f19260G != f2 || this.f19262I || z;
                this.f19260G = f2;
                this.f19262I = false;
            }
            if (this.f19299y == null || z) {
                this.f19263J.setTextSize(this.f19260G);
                this.f19263J.setTypeface(this.f19295u);
                TextPaint textPaint = this.f19263J;
                if (this.f19259F == 1.0f) {
                    z3 = false;
                }
                textPaint.setLinearText(z3);
                CharSequence ellipsize = TextUtils.ellipsize(this.f19298x, this.f19263J, width, TruncateAt.END);
                if (!TextUtils.equals(ellipsize, this.f19299y)) {
                    this.f19299y = ellipsize;
                    this.f19300z = m33098b(this.f19299y);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo27538a(ColorStateList colorStateList) {
        if (this.f19286l != colorStateList) {
            this.f19286l = colorStateList;
            mo27571q();
        }
    }

    /* renamed from: b */
    public void mo27550b(ColorStateList colorStateList) {
        if (this.f19285k != colorStateList) {
            this.f19285k = colorStateList;
            mo27571q();
        }
    }

    /* renamed from: a */
    public void mo27536a(int i, int i2, int i3, int i4) {
        if (!m33095a(this.f19279e, i, i2, i3, i4)) {
            this.f19279e.set(i, i2, i3, i4);
            this.f19262I = true;
            mo27570p();
        }
    }

    /* renamed from: b */
    public void mo27548b(int i, int i2, int i3, int i4) {
        if (!m33095a(this.f19278d, i, i2, i3, i4)) {
            this.f19278d.set(i, i2, i3, i4);
            this.f19262I = true;
            mo27570p();
        }
    }

    /* renamed from: d */
    private void m33100d(float f) {
        m33104f(f);
        this.f19291q = m33090a(this.f19289o, this.f19290p, f, this.f19265L);
        this.f19292r = m33090a(this.f19287m, this.f19288n, f, this.f19265L);
        m33105g(m33090a(this.f19283i, this.f19284j, f, this.f19266M));
        if (this.f19286l != this.f19285k) {
            this.f19263J.setColor(m33092a(m33110v(), mo27561g(), f));
        } else {
            this.f19263J.setColor(mo27561g());
        }
        this.f19263J.setShadowLayer(m33090a(this.f19271R, this.f19267N, f, (TimeInterpolator) null), m33090a(this.f19272S, this.f19268O, f, (TimeInterpolator) null), m33090a(this.f19273T, this.f19269P, f, (TimeInterpolator) null), m33092a(m33099c(this.f19274U), m33099c(this.f19270Q), f));
        C0962e0.m5561u0(this.f19275a);
    }

    /* renamed from: a */
    public void mo27540a(@C0193h0 Rect rect) {
        mo27536a(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: b */
    public void mo27551b(@C0193h0 Rect rect) {
        mo27548b(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: b */
    private float m33096b(@C0193h0 RectF rectF, int i, int i2) {
        if (i2 == 17 || (i2 & 7) == 1) {
            return (((float) i) / 2.0f) + (mo27533a() / 2.0f);
        }
        if ((i2 & C0984g.f4395c) == 8388613 || (i2 & 5) == 5) {
            return this.f19300z ? rectF.left + mo27533a() : (float) this.f19279e.right;
        }
        return this.f19300z ? (float) this.f19279e.right : rectF.left + mo27533a();
    }

    /* renamed from: a */
    public void mo27541a(@C0193h0 RectF rectF, int i, int i2) {
        this.f19300z = m33098b(this.f19298x);
        rectF.left = m33091a(i, i2);
        rectF.top = (float) this.f19279e.top;
        rectF.right = m33096b(rectF, i, i2);
        rectF.bottom = ((float) this.f19279e.top) + mo27557d();
    }

    /* renamed from: b */
    private void m33097b(@C0193h0 TextPaint textPaint) {
        textPaint.setTextSize(this.f19283i);
        textPaint.setTypeface(this.f19294t);
    }

    /* renamed from: c */
    public void mo27556c(Typeface typeface) {
        boolean d = m33101d(typeface);
        boolean e = m33103e(typeface);
        if (d || e) {
            mo27571q();
        }
    }

    /* renamed from: a */
    private float m33091a(int i, int i2) {
        if (i2 == 17 || (i2 & 7) == 1) {
            return (((float) i) / 2.0f) - (mo27533a() / 2.0f);
        }
        if ((i2 & C0984g.f4395c) == 8388613 || (i2 & 5) == 5) {
            return this.f19300z ? (float) this.f19279e.left : ((float) this.f19279e.right) - mo27533a();
        }
        return this.f19300z ? ((float) this.f19279e.right) - mo27533a() : (float) this.f19279e.left;
    }

    /* renamed from: b */
    public void mo27547b(int i) {
        if ((8388615 & i) == 0) {
            i |= C0984g.f4394b;
        }
        if (this.f19282h != i) {
            this.f19282h = i;
            mo27571q();
        }
    }

    /* renamed from: c */
    public void mo27554c(float f) {
        float a = C0890a.m5109a(f, 0.0f, 1.0f);
        if (a != this.f19277c) {
            this.f19277c = a;
            m33107s();
        }
    }

    /* renamed from: a */
    public float mo27533a() {
        if (this.f19298x == null) {
            return 0.0f;
        }
        m33093a(this.f19264K);
        TextPaint textPaint = this.f19264K;
        CharSequence charSequence = this.f19298x;
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    /* renamed from: b */
    public void mo27552b(Typeface typeface) {
        if (m33103e(typeface)) {
            mo27571q();
        }
    }

    /* renamed from: b */
    private boolean m33098b(@C0193h0 CharSequence charSequence) {
        boolean z = true;
        if (C0962e0.m5566x(this.f19275a) != 1) {
            z = false;
        }
        return (z ? C0919f.f4193d : C0919f.f4192c).mo4722a(charSequence, 0, charSequence.length());
    }

    /* renamed from: a */
    private void m33093a(@C0193h0 TextPaint textPaint) {
        textPaint.setTextSize(this.f19284j);
        textPaint.setTypeface(this.f19293s);
    }

    @C0198k
    /* renamed from: c */
    private int m33099c(@C0195i0 ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f19261H;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    /* renamed from: a */
    public void mo27535a(int i) {
        C6953d dVar = new C6953d(this.f19275a.getContext(), i);
        ColorStateList colorStateList = dVar.f19445b;
        if (colorStateList != null) {
            this.f19286l = colorStateList;
        }
        float f = dVar.f19444a;
        if (f != 0.0f) {
            this.f19284j = f;
        }
        ColorStateList colorStateList2 = dVar.f19452i;
        if (colorStateList2 != null) {
            this.f19270Q = colorStateList2;
        }
        this.f19268O = dVar.f19453j;
        this.f19269P = dVar.f19454k;
        this.f19267N = dVar.f19455l;
        C6949a aVar = this.f19297w;
        if (aVar != null) {
            aVar.mo27690a();
        }
        this.f19297w = new C6949a(new C6894a(), dVar.mo27691a());
        dVar.mo27694a(this.f19275a.getContext(), (C6957f) this.f19297w);
        mo27571q();
    }

    /* renamed from: b */
    public ColorStateList mo27545b() {
        return this.f19286l;
    }

    /* renamed from: a */
    public void mo27542a(Typeface typeface) {
        if (m33101d(typeface)) {
            mo27571q();
        }
    }

    /* renamed from: a */
    public final boolean mo27544a(int[] iArr) {
        this.f19261H = iArr;
        if (!mo27569o()) {
            return false;
        }
        mo27571q();
        return true;
    }

    /* renamed from: a */
    public void mo27539a(@C0193h0 Canvas canvas) {
        float f;
        int save = canvas.save();
        if (this.f19299y != null && this.f19276b) {
            float f2 = this.f19291q;
            float f3 = this.f19292r;
            boolean z = this.f19254A && this.f19255B != null;
            if (z) {
                f = this.f19257D * this.f19259F;
            } else {
                f = this.f19263J.ascent() * this.f19259F;
                this.f19263J.descent();
            }
            if (z) {
                f3 += f;
            }
            float f4 = f3;
            float f5 = this.f19259F;
            if (f5 != 1.0f) {
                canvas.scale(f5, f5, f2, f4);
            }
            if (z) {
                canvas.drawBitmap(this.f19255B, f2, f4, this.f19256C);
            } else {
                CharSequence charSequence = this.f19299y;
                canvas.drawText(charSequence, 0, charSequence.length(), f2, f4, this.f19263J);
            }
        }
        canvas.restoreToCount(save);
    }

    /* renamed from: a */
    public void mo27543a(@C0195i0 CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.f19298x, charSequence)) {
            this.f19298x = charSequence;
            this.f19299y = null;
            m33108t();
            mo27571q();
        }
    }

    /* renamed from: a */
    private static boolean m33094a(float f, float f2) {
        return Math.abs(f - f2) < 0.001f;
    }

    /* renamed from: a */
    private static int m33092a(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((((float) Color.alpha(i)) * f2) + (((float) Color.alpha(i2)) * f)), (int) ((((float) Color.red(i)) * f2) + (((float) Color.red(i2)) * f)), (int) ((((float) Color.green(i)) * f2) + (((float) Color.green(i2)) * f)), (int) ((((float) Color.blue(i)) * f2) + (((float) Color.blue(i2)) * f)));
    }

    /* renamed from: a */
    private static float m33090a(float f, float f2, float f3, @C0195i0 TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return C5587a.m24251a(f, f2, f3);
    }

    /* renamed from: a */
    private static boolean m33095a(@C0193h0 Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }
}
