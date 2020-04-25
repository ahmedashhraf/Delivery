package com.google.android.material.p302m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Handler;
import android.text.TextPaint;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.C0216r0;
import androidx.annotation.C0217s;
import androidx.annotation.C0224v0;
import androidx.core.content.p020h.C0874g;
import androidx.core.content.p020h.C0874g.C0875a;
import androidx.core.p034l.C0962e0;
import com.google.android.material.C5582R;

@C0207n0({C0208a.LIBRARY_GROUP})
/* renamed from: com.google.android.material.m.d */
/* compiled from: TextAppearance */
public class C6953d {

    /* renamed from: p */
    private static final String f19440p = "TextAppearance";

    /* renamed from: q */
    private static final int f19441q = 1;

    /* renamed from: r */
    private static final int f19442r = 2;

    /* renamed from: s */
    private static final int f19443s = 3;

    /* renamed from: a */
    public final float f19444a;
    @C0195i0

    /* renamed from: b */
    public final ColorStateList f19445b;
    @C0195i0

    /* renamed from: c */
    public final ColorStateList f19446c;
    @C0195i0

    /* renamed from: d */
    public final ColorStateList f19447d;

    /* renamed from: e */
    public final int f19448e;

    /* renamed from: f */
    public final int f19449f;
    @C0195i0

    /* renamed from: g */
    public final String f19450g;

    /* renamed from: h */
    public final boolean f19451h;
    @C0195i0

    /* renamed from: i */
    public final ColorStateList f19452i;

    /* renamed from: j */
    public final float f19453j;

    /* renamed from: k */
    public final float f19454k;

    /* renamed from: l */
    public final float f19455l;
    @C0217s

    /* renamed from: m */
    private final int f19456m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public boolean f19457n = false;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public Typeface f19458o;

    /* renamed from: com.google.android.material.m.d$a */
    /* compiled from: TextAppearance */
    class C6954a extends C0875a {

        /* renamed from: a */
        final /* synthetic */ C6957f f19459a;

        C6954a(C6957f fVar) {
            this.f19459a = fVar;
        }

        /* renamed from: a */
        public void mo2978a(@C0193h0 Typeface typeface) {
            C6953d dVar = C6953d.this;
            dVar.f19458o = Typeface.create(typeface, dVar.f19448e);
            C6953d.this.f19457n = true;
            this.f19459a.mo22819a(C6953d.this.f19458o, false);
        }

        /* renamed from: a */
        public void mo2977a(int i) {
            C6953d.this.f19457n = true;
            this.f19459a.mo22818a(i);
        }
    }

    /* renamed from: com.google.android.material.m.d$b */
    /* compiled from: TextAppearance */
    class C6955b extends C6957f {

        /* renamed from: a */
        final /* synthetic */ TextPaint f19461a;

        /* renamed from: b */
        final /* synthetic */ C6957f f19462b;

        C6955b(TextPaint textPaint, C6957f fVar) {
            this.f19461a = textPaint;
            this.f19462b = fVar;
        }

        /* renamed from: a */
        public void mo22819a(@C0193h0 Typeface typeface, boolean z) {
            C6953d.this.mo27695a(this.f19461a, typeface);
            this.f19462b.mo22819a(typeface, z);
        }

        /* renamed from: a */
        public void mo22818a(int i) {
            this.f19462b.mo22818a(i);
        }
    }

    public C6953d(@C0193h0 Context context, @C0216r0 int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C5582R.styleable.TextAppearance);
        this.f19444a = obtainStyledAttributes.getDimension(C5582R.styleable.TextAppearance_android_textSize, 0.0f);
        this.f19445b = C6952c.m33332a(context, obtainStyledAttributes, C5582R.styleable.TextAppearance_android_textColor);
        this.f19446c = C6952c.m33332a(context, obtainStyledAttributes, C5582R.styleable.TextAppearance_android_textColorHint);
        this.f19447d = C6952c.m33332a(context, obtainStyledAttributes, C5582R.styleable.TextAppearance_android_textColorLink);
        this.f19448e = obtainStyledAttributes.getInt(C5582R.styleable.TextAppearance_android_textStyle, 0);
        this.f19449f = obtainStyledAttributes.getInt(C5582R.styleable.TextAppearance_android_typeface, 1);
        int a = C6952c.m33331a(obtainStyledAttributes, C5582R.styleable.TextAppearance_fontFamily, C5582R.styleable.TextAppearance_android_fontFamily);
        this.f19456m = obtainStyledAttributes.getResourceId(a, 0);
        this.f19450g = obtainStyledAttributes.getString(a);
        this.f19451h = obtainStyledAttributes.getBoolean(C5582R.styleable.TextAppearance_textAllCaps, false);
        this.f19452i = C6952c.m33332a(context, obtainStyledAttributes, C5582R.styleable.TextAppearance_android_shadowColor);
        this.f19453j = obtainStyledAttributes.getFloat(C5582R.styleable.TextAppearance_android_shadowDx, 0.0f);
        this.f19454k = obtainStyledAttributes.getFloat(C5582R.styleable.TextAppearance_android_shadowDy, 0.0f);
        this.f19455l = obtainStyledAttributes.getFloat(C5582R.styleable.TextAppearance_android_shadowRadius, 0.0f);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: b */
    private void m33339b() {
        if (this.f19458o == null) {
            String str = this.f19450g;
            if (str != null) {
                this.f19458o = Typeface.create(str, this.f19448e);
            }
        }
        if (this.f19458o == null) {
            int i = this.f19449f;
            if (i == 1) {
                this.f19458o = Typeface.SANS_SERIF;
            } else if (i == 2) {
                this.f19458o = Typeface.SERIF;
            } else if (i != 3) {
                this.f19458o = Typeface.DEFAULT;
            } else {
                this.f19458o = Typeface.MONOSPACE;
            }
            this.f19458o = Typeface.create(this.f19458o, this.f19448e);
        }
    }

    /* renamed from: c */
    public void mo27697c(@C0193h0 Context context, @C0193h0 TextPaint textPaint, @C0193h0 C6957f fVar) {
        if (C6956e.m33352a()) {
            mo27695a(textPaint, mo27692a(context));
        } else {
            mo27693a(context, textPaint, fVar);
        }
    }

    @C0193h0
    @C0224v0
    /* renamed from: a */
    public Typeface mo27692a(@C0193h0 Context context) {
        if (this.f19457n) {
            return this.f19458o;
        }
        if (!context.isRestricted()) {
            try {
                this.f19458o = C0874g.m5051a(context, this.f19456m);
                if (this.f19458o != null) {
                    this.f19458o = Typeface.create(this.f19458o, this.f19448e);
                }
            } catch (NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception unused2) {
                StringBuilder sb = new StringBuilder();
                sb.append("Error loading font ");
                sb.append(this.f19450g);
                sb.toString();
            }
        }
        m33339b();
        this.f19457n = true;
        return this.f19458o;
    }

    /* renamed from: b */
    public void mo27696b(@C0193h0 Context context, @C0193h0 TextPaint textPaint, @C0193h0 C6957f fVar) {
        mo27697c(context, textPaint, fVar);
        ColorStateList colorStateList = this.f19445b;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : C0962e0.f4343t);
        float f = this.f19455l;
        float f2 = this.f19453j;
        float f3 = this.f19454k;
        ColorStateList colorStateList2 = this.f19452i;
        textPaint.setShadowLayer(f, f2, f3, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    /* renamed from: a */
    public void mo27694a(@C0193h0 Context context, @C0193h0 C6957f fVar) {
        if (C6956e.m33352a()) {
            mo27692a(context);
        } else {
            m33339b();
        }
        if (this.f19456m == 0) {
            this.f19457n = true;
        }
        if (this.f19457n) {
            fVar.mo22819a(this.f19458o, true);
            return;
        }
        try {
            C0874g.m5056a(context, this.f19456m, (C0875a) new C6954a(fVar), (Handler) null);
        } catch (NotFoundException unused) {
            this.f19457n = true;
            fVar.mo22818a(1);
        } catch (Exception unused2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error loading font ");
            sb.append(this.f19450g);
            sb.toString();
            this.f19457n = true;
            fVar.mo22818a(-3);
        }
    }

    /* renamed from: a */
    public void mo27693a(@C0193h0 Context context, @C0193h0 TextPaint textPaint, @C0193h0 C6957f fVar) {
        mo27695a(textPaint, mo27691a());
        mo27694a(context, (C6957f) new C6955b(textPaint, fVar));
    }

    /* renamed from: a */
    public Typeface mo27691a() {
        m33339b();
        return this.f19458o;
    }

    /* renamed from: a */
    public void mo27695a(@C0193h0 TextPaint textPaint, @C0193h0 Typeface typeface) {
        textPaint.setTypeface(typeface);
        int style = (typeface.getStyle() ^ -1) & this.f19448e;
        textPaint.setFakeBoldText((style & 1) != 0);
        textPaint.setTextSkewX((style & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f19444a);
    }
}
