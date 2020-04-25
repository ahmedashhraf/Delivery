package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.NotFoundException;
import android.graphics.PorterDuff.Mode;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.widget.TextView;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.appcompat.C0238R;
import androidx.core.content.p020h.C0874g.C0875a;
import androidx.core.widget.C1107b;
import java.lang.ref.WeakReference;

/* renamed from: androidx.appcompat.widget.v */
/* compiled from: AppCompatTextHelper */
class C0554v {

    /* renamed from: n */
    private static final int f2222n = -1;

    /* renamed from: o */
    private static final int f2223o = 1;

    /* renamed from: p */
    private static final int f2224p = 2;

    /* renamed from: q */
    private static final int f2225q = 3;

    /* renamed from: a */
    private final TextView f2226a;

    /* renamed from: b */
    private C0545r0 f2227b;

    /* renamed from: c */
    private C0545r0 f2228c;

    /* renamed from: d */
    private C0545r0 f2229d;

    /* renamed from: e */
    private C0545r0 f2230e;

    /* renamed from: f */
    private C0545r0 f2231f;

    /* renamed from: g */
    private C0545r0 f2232g;

    /* renamed from: h */
    private C0545r0 f2233h;
    @C0193h0

    /* renamed from: i */
    private final C0558w f2234i;

    /* renamed from: j */
    private int f2235j = 0;

    /* renamed from: k */
    private int f2236k = -1;

    /* renamed from: l */
    private Typeface f2237l;

    /* renamed from: m */
    private boolean f2238m;

    /* renamed from: androidx.appcompat.widget.v$a */
    /* compiled from: AppCompatTextHelper */
    private static class C0555a extends C0875a {

        /* renamed from: a */
        private final WeakReference<C0554v> f2239a;

        /* renamed from: b */
        private final int f2240b;

        /* renamed from: c */
        private final int f2241c;

        /* renamed from: androidx.appcompat.widget.v$a$a */
        /* compiled from: AppCompatTextHelper */
        private class C0556a implements Runnable {

            /* renamed from: a */
            private final WeakReference<C0554v> f2243a;

            /* renamed from: b */
            private final Typeface f2244b;

            C0556a(@C0193h0 WeakReference<C0554v> weakReference, @C0193h0 Typeface typeface) {
                this.f2243a = weakReference;
                this.f2244b = typeface;
            }

            public void run() {
                C0554v vVar = (C0554v) this.f2243a.get();
                if (vVar != null) {
                    vVar.mo2961a(this.f2244b);
                }
            }
        }

        C0555a(@C0193h0 C0554v vVar, int i, int i2) {
            this.f2239a = new WeakReference<>(vVar);
            this.f2240b = i;
            this.f2241c = i2;
        }

        /* renamed from: a */
        public void mo2977a(int i) {
        }

        /* renamed from: a */
        public void mo2978a(@C0193h0 Typeface typeface) {
            C0554v vVar = (C0554v) this.f2239a.get();
            if (vVar != null) {
                if (VERSION.SDK_INT >= 28) {
                    int i = this.f2240b;
                    if (i != -1) {
                        typeface = Typeface.create(typeface, i, (this.f2241c & 2) != 0);
                    }
                }
                vVar.mo2963a((Runnable) new C0556a(this.f2239a, typeface));
            }
        }
    }

    C0554v(TextView textView) {
        this.f2226a = textView;
        this.f2234i = new C0558w(this.f2226a);
    }

    /* renamed from: l */
    private void m3005l() {
        C0545r0 r0Var = this.f2233h;
        this.f2227b = r0Var;
        this.f2228c = r0Var;
        this.f2229d = r0Var;
        this.f2230e = r0Var;
        this.f2231f = r0Var;
        this.f2232g = r0Var;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0117  */
    @android.annotation.SuppressLint({"NewApi"})
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2962a(android.util.AttributeSet r19, int r20) {
        /*
            r18 = this;
            r7 = r18
            r0 = r19
            r1 = r20
            android.widget.TextView r2 = r7.f2226a
            android.content.Context r2 = r2.getContext()
            androidx.appcompat.widget.i r3 = androidx.appcompat.widget.C0510i.m2770b()
            int[] r4 = androidx.appcompat.C0238R.styleable.AppCompatTextHelper
            r5 = 0
            androidx.appcompat.widget.t0 r4 = androidx.appcompat.widget.C0549t0.m2910a(r2, r0, r4, r1, r5)
            int r6 = androidx.appcompat.C0238R.styleable.AppCompatTextHelper_android_textAppearance
            r8 = -1
            int r6 = r4.mo2888g(r6, r8)
            int r9 = androidx.appcompat.C0238R.styleable.AppCompatTextHelper_android_drawableLeft
            boolean r9 = r4.mo2892j(r9)
            if (r9 == 0) goto L_0x0032
            int r9 = androidx.appcompat.C0238R.styleable.AppCompatTextHelper_android_drawableLeft
            int r9 = r4.mo2888g(r9, r5)
            androidx.appcompat.widget.r0 r9 = m3000a(r2, r3, r9)
            r7.f2227b = r9
        L_0x0032:
            int r9 = androidx.appcompat.C0238R.styleable.AppCompatTextHelper_android_drawableTop
            boolean r9 = r4.mo2892j(r9)
            if (r9 == 0) goto L_0x0046
            int r9 = androidx.appcompat.C0238R.styleable.AppCompatTextHelper_android_drawableTop
            int r9 = r4.mo2888g(r9, r5)
            androidx.appcompat.widget.r0 r9 = m3000a(r2, r3, r9)
            r7.f2228c = r9
        L_0x0046:
            int r9 = androidx.appcompat.C0238R.styleable.AppCompatTextHelper_android_drawableRight
            boolean r9 = r4.mo2892j(r9)
            if (r9 == 0) goto L_0x005a
            int r9 = androidx.appcompat.C0238R.styleable.AppCompatTextHelper_android_drawableRight
            int r9 = r4.mo2888g(r9, r5)
            androidx.appcompat.widget.r0 r9 = m3000a(r2, r3, r9)
            r7.f2229d = r9
        L_0x005a:
            int r9 = androidx.appcompat.C0238R.styleable.AppCompatTextHelper_android_drawableBottom
            boolean r9 = r4.mo2892j(r9)
            if (r9 == 0) goto L_0x006e
            int r9 = androidx.appcompat.C0238R.styleable.AppCompatTextHelper_android_drawableBottom
            int r9 = r4.mo2888g(r9, r5)
            androidx.appcompat.widget.r0 r9 = m3000a(r2, r3, r9)
            r7.f2230e = r9
        L_0x006e:
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 17
            if (r9 < r10) goto L_0x009c
            int r9 = androidx.appcompat.C0238R.styleable.AppCompatTextHelper_android_drawableStart
            boolean r9 = r4.mo2892j(r9)
            if (r9 == 0) goto L_0x0088
            int r9 = androidx.appcompat.C0238R.styleable.AppCompatTextHelper_android_drawableStart
            int r9 = r4.mo2888g(r9, r5)
            androidx.appcompat.widget.r0 r9 = m3000a(r2, r3, r9)
            r7.f2231f = r9
        L_0x0088:
            int r9 = androidx.appcompat.C0238R.styleable.AppCompatTextHelper_android_drawableEnd
            boolean r9 = r4.mo2892j(r9)
            if (r9 == 0) goto L_0x009c
            int r9 = androidx.appcompat.C0238R.styleable.AppCompatTextHelper_android_drawableEnd
            int r9 = r4.mo2888g(r9, r5)
            androidx.appcompat.widget.r0 r9 = m3000a(r2, r3, r9)
            r7.f2232g = r9
        L_0x009c:
            r4.mo2887f()
            android.widget.TextView r4 = r7.f2226a
            android.text.method.TransformationMethod r4 = r4.getTransformationMethod()
            boolean r4 = r4 instanceof android.text.method.PasswordTransformationMethod
            r9 = 26
            r11 = 23
            if (r6 == r8) goto L_0x0130
            int[] r13 = androidx.appcompat.C0238R.styleable.TextAppearance
            androidx.appcompat.widget.t0 r6 = androidx.appcompat.widget.C0549t0.m2908a(r2, r6, r13)
            if (r4 != 0) goto L_0x00c6
            int r13 = androidx.appcompat.C0238R.styleable.TextAppearance_textAllCaps
            boolean r13 = r6.mo2892j(r13)
            if (r13 == 0) goto L_0x00c6
            int r13 = androidx.appcompat.C0238R.styleable.TextAppearance_textAllCaps
            boolean r13 = r6.mo2871a(r13, r5)
            r14 = r13
            r13 = 1
            goto L_0x00c8
        L_0x00c6:
            r13 = 0
            r14 = 0
        L_0x00c8:
            r7.m3001a(r2, r6)
            int r15 = android.os.Build.VERSION.SDK_INT
            if (r15 >= r11) goto L_0x0105
            int r15 = androidx.appcompat.C0238R.styleable.TextAppearance_android_textColor
            boolean r15 = r6.mo2892j(r15)
            if (r15 == 0) goto L_0x00de
            int r15 = androidx.appcompat.C0238R.styleable.TextAppearance_android_textColor
            android.content.res.ColorStateList r15 = r6.mo2868a(r15)
            goto L_0x00df
        L_0x00de:
            r15 = 0
        L_0x00df:
            int r10 = androidx.appcompat.C0238R.styleable.TextAppearance_android_textColorHint
            boolean r10 = r6.mo2892j(r10)
            if (r10 == 0) goto L_0x00ee
            int r10 = androidx.appcompat.C0238R.styleable.TextAppearance_android_textColorHint
            android.content.res.ColorStateList r10 = r6.mo2868a(r10)
            goto L_0x00ef
        L_0x00ee:
            r10 = 0
        L_0x00ef:
            int r12 = androidx.appcompat.C0238R.styleable.TextAppearance_android_textColorLink
            boolean r12 = r6.mo2892j(r12)
            if (r12 == 0) goto L_0x0103
            int r12 = androidx.appcompat.C0238R.styleable.TextAppearance_android_textColorLink
            android.content.res.ColorStateList r12 = r6.mo2868a(r12)
            r17 = r15
            r15 = r12
            r12 = r17
            goto L_0x0108
        L_0x0103:
            r12 = r15
            goto L_0x0107
        L_0x0105:
            r10 = 0
            r12 = 0
        L_0x0107:
            r15 = 0
        L_0x0108:
            int r8 = androidx.appcompat.C0238R.styleable.TextAppearance_textLocale
            boolean r8 = r6.mo2892j(r8)
            if (r8 == 0) goto L_0x0117
            int r8 = androidx.appcompat.C0238R.styleable.TextAppearance_textLocale
            java.lang.String r8 = r6.mo2886f(r8)
            goto L_0x0118
        L_0x0117:
            r8 = 0
        L_0x0118:
            int r11 = android.os.Build.VERSION.SDK_INT
            if (r11 < r9) goto L_0x012b
            int r11 = androidx.appcompat.C0238R.styleable.TextAppearance_fontVariationSettings
            boolean r11 = r6.mo2892j(r11)
            if (r11 == 0) goto L_0x012b
            int r11 = androidx.appcompat.C0238R.styleable.TextAppearance_fontVariationSettings
            java.lang.String r11 = r6.mo2886f(r11)
            goto L_0x012c
        L_0x012b:
            r11 = 0
        L_0x012c:
            r6.mo2887f()
            goto L_0x0137
        L_0x0130:
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
        L_0x0137:
            int[] r6 = androidx.appcompat.C0238R.styleable.TextAppearance
            androidx.appcompat.widget.t0 r6 = androidx.appcompat.widget.C0549t0.m2910a(r2, r0, r6, r1, r5)
            if (r4 != 0) goto L_0x014e
            int r9 = androidx.appcompat.C0238R.styleable.TextAppearance_textAllCaps
            boolean r9 = r6.mo2892j(r9)
            if (r9 == 0) goto L_0x014e
            int r9 = androidx.appcompat.C0238R.styleable.TextAppearance_textAllCaps
            boolean r14 = r6.mo2871a(r9, r5)
            r13 = 1
        L_0x014e:
            int r9 = android.os.Build.VERSION.SDK_INT
            r5 = 23
            if (r9 >= r5) goto L_0x017e
            int r5 = androidx.appcompat.C0238R.styleable.TextAppearance_android_textColor
            boolean r5 = r6.mo2892j(r5)
            if (r5 == 0) goto L_0x0162
            int r5 = androidx.appcompat.C0238R.styleable.TextAppearance_android_textColor
            android.content.res.ColorStateList r12 = r6.mo2868a(r5)
        L_0x0162:
            int r5 = androidx.appcompat.C0238R.styleable.TextAppearance_android_textColorHint
            boolean r5 = r6.mo2892j(r5)
            if (r5 == 0) goto L_0x0170
            int r5 = androidx.appcompat.C0238R.styleable.TextAppearance_android_textColorHint
            android.content.res.ColorStateList r10 = r6.mo2868a(r5)
        L_0x0170:
            int r5 = androidx.appcompat.C0238R.styleable.TextAppearance_android_textColorLink
            boolean r5 = r6.mo2892j(r5)
            if (r5 == 0) goto L_0x017e
            int r5 = androidx.appcompat.C0238R.styleable.TextAppearance_android_textColorLink
            android.content.res.ColorStateList r15 = r6.mo2868a(r5)
        L_0x017e:
            int r5 = androidx.appcompat.C0238R.styleable.TextAppearance_textLocale
            boolean r5 = r6.mo2892j(r5)
            if (r5 == 0) goto L_0x018c
            int r5 = androidx.appcompat.C0238R.styleable.TextAppearance_textLocale
            java.lang.String r8 = r6.mo2886f(r5)
        L_0x018c:
            int r5 = android.os.Build.VERSION.SDK_INT
            r9 = 26
            if (r5 < r9) goto L_0x01a0
            int r5 = androidx.appcompat.C0238R.styleable.TextAppearance_fontVariationSettings
            boolean r5 = r6.mo2892j(r5)
            if (r5 == 0) goto L_0x01a0
            int r5 = androidx.appcompat.C0238R.styleable.TextAppearance_fontVariationSettings
            java.lang.String r11 = r6.mo2886f(r5)
        L_0x01a0:
            int r5 = android.os.Build.VERSION.SDK_INT
            r9 = 28
            if (r5 < r9) goto L_0x01c1
            int r5 = androidx.appcompat.C0238R.styleable.TextAppearance_android_textSize
            boolean r5 = r6.mo2892j(r5)
            if (r5 == 0) goto L_0x01c1
            int r5 = androidx.appcompat.C0238R.styleable.TextAppearance_android_textSize
            r9 = -1
            int r5 = r6.mo2876c(r5, r9)
            if (r5 != 0) goto L_0x01c1
            android.widget.TextView r5 = r7.f2226a
            r9 = 0
            r16 = r3
            r3 = 0
            r5.setTextSize(r3, r9)
            goto L_0x01c3
        L_0x01c1:
            r16 = r3
        L_0x01c3:
            r7.m3001a(r2, r6)
            r6.mo2887f()
            if (r12 == 0) goto L_0x01d0
            android.widget.TextView r3 = r7.f2226a
            r3.setTextColor(r12)
        L_0x01d0:
            if (r10 == 0) goto L_0x01d7
            android.widget.TextView r3 = r7.f2226a
            r3.setHintTextColor(r10)
        L_0x01d7:
            if (r15 == 0) goto L_0x01de
            android.widget.TextView r3 = r7.f2226a
            r3.setLinkTextColor(r15)
        L_0x01de:
            if (r4 != 0) goto L_0x01e5
            if (r13 == 0) goto L_0x01e5
            r7.mo2964a(r14)
        L_0x01e5:
            android.graphics.Typeface r3 = r7.f2237l
            if (r3 == 0) goto L_0x01fb
            int r4 = r7.f2236k
            r5 = -1
            if (r4 != r5) goto L_0x01f6
            android.widget.TextView r4 = r7.f2226a
            int r5 = r7.f2235j
            r4.setTypeface(r3, r5)
            goto L_0x01fb
        L_0x01f6:
            android.widget.TextView r4 = r7.f2226a
            r4.setTypeface(r3)
        L_0x01fb:
            if (r11 == 0) goto L_0x0202
            android.widget.TextView r3 = r7.f2226a
            r3.setFontVariationSettings(r11)
        L_0x0202:
            if (r8 == 0) goto L_0x022c
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 24
            if (r3 < r4) goto L_0x0214
            android.widget.TextView r3 = r7.f2226a
            android.os.LocaleList r4 = android.os.LocaleList.forLanguageTags(r8)
            r3.setTextLocales(r4)
            goto L_0x022c
        L_0x0214:
            r4 = 21
            if (r3 < r4) goto L_0x022c
            r3 = 44
            int r3 = r8.indexOf(r3)
            r4 = 0
            java.lang.String r3 = r8.substring(r4, r3)
            android.widget.TextView r4 = r7.f2226a
            java.util.Locale r3 = java.util.Locale.forLanguageTag(r3)
            r4.setTextLocale(r3)
        L_0x022c:
            androidx.appcompat.widget.w r3 = r7.f2234i
            r3.mo2985a(r0, r1)
            boolean r1 = androidx.core.widget.C1107b.f4906c
            if (r1 == 0) goto L_0x0272
            androidx.appcompat.widget.w r1 = r7.f2234i
            int r1 = r1.mo2992f()
            if (r1 == 0) goto L_0x0272
            androidx.appcompat.widget.w r1 = r7.f2234i
            int[] r1 = r1.mo2991e()
            int r3 = r1.length
            if (r3 <= 0) goto L_0x0272
            android.widget.TextView r3 = r7.f2226a
            int r3 = r3.getAutoSizeStepGranularity()
            float r3 = (float) r3
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x026c
            android.widget.TextView r1 = r7.f2226a
            androidx.appcompat.widget.w r3 = r7.f2234i
            int r3 = r3.mo2989c()
            androidx.appcompat.widget.w r4 = r7.f2234i
            int r4 = r4.mo2987b()
            androidx.appcompat.widget.w r5 = r7.f2234i
            int r5 = r5.mo2990d()
            r6 = 0
            r1.setAutoSizeTextTypeUniformWithConfiguration(r3, r4, r5, r6)
            goto L_0x0272
        L_0x026c:
            r6 = 0
            android.widget.TextView r3 = r7.f2226a
            r3.setAutoSizeTextTypeUniformWithPresetSizes(r1, r6)
        L_0x0272:
            int[] r1 = androidx.appcompat.C0238R.styleable.AppCompatTextView
            androidx.appcompat.widget.t0 r8 = androidx.appcompat.widget.C0549t0.m2909a(r2, r0, r1)
            int r0 = androidx.appcompat.C0238R.styleable.AppCompatTextView_drawableLeftCompat
            r1 = -1
            int r0 = r8.mo2888g(r0, r1)
            r3 = r16
            if (r0 == r1) goto L_0x0289
            android.graphics.drawable.Drawable r0 = r3.mo2670a(r2, r0)
            r4 = r0
            goto L_0x028a
        L_0x0289:
            r4 = 0
        L_0x028a:
            int r0 = androidx.appcompat.C0238R.styleable.AppCompatTextView_drawableTopCompat
            int r0 = r8.mo2888g(r0, r1)
            if (r0 == r1) goto L_0x0298
            android.graphics.drawable.Drawable r0 = r3.mo2670a(r2, r0)
            r5 = r0
            goto L_0x0299
        L_0x0298:
            r5 = 0
        L_0x0299:
            int r0 = androidx.appcompat.C0238R.styleable.AppCompatTextView_drawableRightCompat
            int r0 = r8.mo2888g(r0, r1)
            if (r0 == r1) goto L_0x02a7
            android.graphics.drawable.Drawable r0 = r3.mo2670a(r2, r0)
            r6 = r0
            goto L_0x02a8
        L_0x02a7:
            r6 = 0
        L_0x02a8:
            int r0 = androidx.appcompat.C0238R.styleable.AppCompatTextView_drawableBottomCompat
            int r0 = r8.mo2888g(r0, r1)
            if (r0 == r1) goto L_0x02b6
            android.graphics.drawable.Drawable r0 = r3.mo2670a(r2, r0)
            r9 = r0
            goto L_0x02b7
        L_0x02b6:
            r9 = 0
        L_0x02b7:
            int r0 = androidx.appcompat.C0238R.styleable.AppCompatTextView_drawableStartCompat
            int r0 = r8.mo2888g(r0, r1)
            if (r0 == r1) goto L_0x02c5
            android.graphics.drawable.Drawable r0 = r3.mo2670a(r2, r0)
            r10 = r0
            goto L_0x02c6
        L_0x02c5:
            r10 = 0
        L_0x02c6:
            int r0 = androidx.appcompat.C0238R.styleable.AppCompatTextView_drawableEndCompat
            int r0 = r8.mo2888g(r0, r1)
            if (r0 == r1) goto L_0x02d4
            android.graphics.drawable.Drawable r0 = r3.mo2670a(r2, r0)
            r11 = r0
            goto L_0x02d5
        L_0x02d4:
            r11 = 0
        L_0x02d5:
            r0 = r18
            r1 = r4
            r2 = r5
            r3 = r6
            r4 = r9
            r5 = r10
            r6 = r11
            r0.m3002a(r1, r2, r3, r4, r5, r6)
            int r0 = androidx.appcompat.C0238R.styleable.AppCompatTextView_drawableTint
            boolean r0 = r8.mo2892j(r0)
            if (r0 == 0) goto L_0x02f3
            int r0 = androidx.appcompat.C0238R.styleable.AppCompatTextView_drawableTint
            android.content.res.ColorStateList r0 = r8.mo2868a(r0)
            android.widget.TextView r1 = r7.f2226a
            androidx.core.widget.C1120m.m6374a(r1, r0)
        L_0x02f3:
            int r0 = androidx.appcompat.C0238R.styleable.AppCompatTextView_drawableTintMode
            boolean r0 = r8.mo2892j(r0)
            if (r0 == 0) goto L_0x030d
            int r0 = androidx.appcompat.C0238R.styleable.AppCompatTextView_drawableTintMode
            r1 = -1
            int r0 = r8.mo2880d(r0, r1)
            r2 = 0
            android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.C0469a0.m2594a(r0, r2)
            android.widget.TextView r2 = r7.f2226a
            androidx.core.widget.C1120m.m6375a(r2, r0)
            goto L_0x030e
        L_0x030d:
            r1 = -1
        L_0x030e:
            int r0 = androidx.appcompat.C0238R.styleable.AppCompatTextView_firstBaselineToTopHeight
            int r0 = r8.mo2876c(r0, r1)
            int r2 = androidx.appcompat.C0238R.styleable.AppCompatTextView_lastBaselineToBottomHeight
            int r2 = r8.mo2876c(r2, r1)
            int r3 = androidx.appcompat.C0238R.styleable.AppCompatTextView_lineHeight
            int r3 = r8.mo2876c(r3, r1)
            r8.mo2887f()
            if (r0 == r1) goto L_0x032a
            android.widget.TextView r4 = r7.f2226a
            androidx.core.widget.C1120m.m6383b(r4, r0)
        L_0x032a:
            if (r2 == r1) goto L_0x0331
            android.widget.TextView r0 = r7.f2226a
            androidx.core.widget.C1120m.m6387c(r0, r2)
        L_0x0331:
            if (r3 == r1) goto L_0x0338
            android.widget.TextView r0 = r7.f2226a
            androidx.core.widget.C1120m.m6388d(r0, r3)
        L_0x0338:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0554v.mo2962a(android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: 0000 */
    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: b */
    public void mo2967b() {
        this.f2234i.mo2981a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo2968c() {
        return this.f2234i.mo2987b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public int mo2969d() {
        return this.f2234i.mo2989c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public int mo2970e() {
        return this.f2234i.mo2990d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public int[] mo2971f() {
        return this.f2234i.mo2991e();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public int mo2972g() {
        return this.f2234i.mo2992f();
    }

    /* access modifiers changed from: 0000 */
    @C0195i0
    /* renamed from: h */
    public ColorStateList mo2973h() {
        C0545r0 r0Var = this.f2233h;
        if (r0Var != null) {
            return r0Var.f2179a;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    @C0195i0
    /* renamed from: i */
    public Mode mo2974i() {
        C0545r0 r0Var = this.f2233h;
        if (r0Var != null) {
            return r0Var.f2180b;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: j */
    public boolean mo2975j() {
        return this.f2234i.mo2993g();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public void mo2976k() {
        mo2954a();
    }

    /* renamed from: b */
    private void m3004b(int i, float f) {
        this.f2234i.mo2983a(i, f);
    }

    @C0207n0({C0208a.LIBRARY})
    /* renamed from: a */
    public void mo2961a(@C0193h0 Typeface typeface) {
        if (this.f2238m) {
            this.f2226a.setTypeface(typeface);
            this.f2237l = typeface;
        }
    }

    @C0207n0({C0208a.LIBRARY})
    /* renamed from: a */
    public void mo2963a(@C0193h0 Runnable runnable) {
        this.f2226a.post(runnable);
    }

    /* renamed from: a */
    private void m3001a(Context context, C0549t0 t0Var) {
        this.f2235j = t0Var.mo2880d(C0238R.styleable.TextAppearance_android_textStyle, this.f2235j);
        boolean z = false;
        if (VERSION.SDK_INT >= 28) {
            this.f2236k = t0Var.mo2880d(C0238R.styleable.TextAppearance_android_textFontWeight, -1);
            if (this.f2236k != -1) {
                this.f2235j = (this.f2235j & 2) | 0;
            }
        }
        if (t0Var.mo2892j(C0238R.styleable.TextAppearance_android_fontFamily) || t0Var.mo2892j(C0238R.styleable.TextAppearance_fontFamily)) {
            this.f2237l = null;
            int i = t0Var.mo2892j(C0238R.styleable.TextAppearance_fontFamily) ? C0238R.styleable.TextAppearance_fontFamily : C0238R.styleable.TextAppearance_android_fontFamily;
            int i2 = this.f2236k;
            int i3 = this.f2235j;
            if (!context.isRestricted()) {
                try {
                    Typeface a = t0Var.mo2869a(i, this.f2235j, (C0875a) new C0555a(this, i2, i3));
                    if (a != null) {
                        if (VERSION.SDK_INT < 28 || this.f2236k == -1) {
                            this.f2237l = a;
                        } else {
                            this.f2237l = Typeface.create(Typeface.create(a, 0), this.f2236k, (this.f2235j & 2) != 0);
                        }
                    }
                    this.f2238m = this.f2237l == null;
                } catch (NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f2237l == null) {
                String f = t0Var.mo2886f(i);
                if (f != null) {
                    if (VERSION.SDK_INT < 28 || this.f2236k == -1) {
                        this.f2237l = Typeface.create(f, this.f2235j);
                    } else {
                        Typeface create = Typeface.create(f, 0);
                        int i4 = this.f2236k;
                        if ((this.f2235j & 2) != 0) {
                            z = true;
                        }
                        this.f2237l = Typeface.create(create, i4, z);
                    }
                }
            }
            return;
        }
        if (t0Var.mo2892j(C0238R.styleable.TextAppearance_android_typeface)) {
            this.f2238m = false;
            int d = t0Var.mo2880d(C0238R.styleable.TextAppearance_android_typeface, 1);
            if (d == 1) {
                this.f2237l = Typeface.SANS_SERIF;
            } else if (d == 2) {
                this.f2237l = Typeface.SERIF;
            } else if (d == 3) {
                this.f2237l = Typeface.MONOSPACE;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2958a(Context context, int i) {
        C0549t0 a = C0549t0.m2908a(context, i, C0238R.styleable.TextAppearance);
        if (a.mo2892j(C0238R.styleable.TextAppearance_textAllCaps)) {
            mo2964a(a.mo2871a(C0238R.styleable.TextAppearance_textAllCaps, false));
        }
        if (VERSION.SDK_INT < 23 && a.mo2892j(C0238R.styleable.TextAppearance_android_textColor)) {
            ColorStateList a2 = a.mo2868a(C0238R.styleable.TextAppearance_android_textColor);
            if (a2 != null) {
                this.f2226a.setTextColor(a2);
            }
        }
        if (a.mo2892j(C0238R.styleable.TextAppearance_android_textSize) && a.mo2876c(C0238R.styleable.TextAppearance_android_textSize, -1) == 0) {
            this.f2226a.setTextSize(0, 0.0f);
        }
        m3001a(context, a);
        if (VERSION.SDK_INT >= 26 && a.mo2892j(C0238R.styleable.TextAppearance_fontVariationSettings)) {
            String f = a.mo2886f(C0238R.styleable.TextAppearance_fontVariationSettings);
            if (f != null) {
                this.f2226a.setFontVariationSettings(f);
            }
        }
        a.mo2887f();
        Typeface typeface = this.f2237l;
        if (typeface != null) {
            this.f2226a.setTypeface(typeface, this.f2235j);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2964a(boolean z) {
        this.f2226a.setAllCaps(z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2954a() {
        if (!(this.f2227b == null && this.f2228c == null && this.f2229d == null && this.f2230e == null)) {
            Drawable[] compoundDrawables = this.f2226a.getCompoundDrawables();
            m3003a(compoundDrawables[0], this.f2227b);
            m3003a(compoundDrawables[1], this.f2228c);
            m3003a(compoundDrawables[2], this.f2229d);
            m3003a(compoundDrawables[3], this.f2230e);
        }
        if (VERSION.SDK_INT < 17) {
            return;
        }
        if (this.f2231f != null || this.f2232g != null) {
            Drawable[] compoundDrawablesRelative = this.f2226a.getCompoundDrawablesRelative();
            m3003a(compoundDrawablesRelative[0], this.f2231f);
            m3003a(compoundDrawablesRelative[2], this.f2232g);
        }
    }

    /* renamed from: a */
    private void m3003a(Drawable drawable, C0545r0 r0Var) {
        if (drawable != null && r0Var != null) {
            C0510i.m2769a(drawable, r0Var, this.f2226a.getDrawableState());
        }
    }

    /* renamed from: a */
    private static C0545r0 m3000a(Context context, C0510i iVar, int i) {
        ColorStateList b = iVar.mo2675b(context, i);
        if (b == null) {
            return null;
        }
        C0545r0 r0Var = new C0545r0();
        r0Var.f2182d = true;
        r0Var.f2179a = b;
        return r0Var;
    }

    /* access modifiers changed from: 0000 */
    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: a */
    public void mo2965a(boolean z, int i, int i2, int i3, int i4) {
        if (!C1107b.f4906c) {
            mo2967b();
        }
    }

    /* access modifiers changed from: 0000 */
    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: a */
    public void mo2956a(int i, float f) {
        if (!C1107b.f4906c && !mo2975j()) {
            m3004b(i, f);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2955a(int i) {
        this.f2234i.mo2988b(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2957a(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        this.f2234i.mo2984a(i, i2, i3, i4);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2966a(@C0193h0 int[] iArr, int i) throws IllegalArgumentException {
        this.f2234i.mo2986a(iArr, i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2959a(@C0195i0 ColorStateList colorStateList) {
        if (this.f2233h == null) {
            this.f2233h = new C0545r0();
        }
        C0545r0 r0Var = this.f2233h;
        r0Var.f2179a = colorStateList;
        r0Var.f2182d = colorStateList != null;
        m3005l();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2960a(@C0195i0 Mode mode) {
        if (this.f2233h == null) {
            this.f2233h = new C0545r0();
        }
        C0545r0 r0Var = this.f2233h;
        r0Var.f2180b = mode;
        r0Var.f2181c = mode != null;
        m3005l();
    }

    /* renamed from: a */
    private void m3002a(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (VERSION.SDK_INT >= 17 && (drawable5 != null || drawable6 != null)) {
            Drawable[] compoundDrawablesRelative = this.f2226a.getCompoundDrawablesRelative();
            TextView textView = this.f2226a;
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
        } else if (!(drawable == null && drawable2 == null && drawable3 == null && drawable4 == null)) {
            if (VERSION.SDK_INT >= 17) {
                Drawable[] compoundDrawablesRelative2 = this.f2226a.getCompoundDrawablesRelative();
                if (!(compoundDrawablesRelative2[0] == null && compoundDrawablesRelative2[2] == null)) {
                    TextView textView2 = this.f2226a;
                    Drawable drawable7 = compoundDrawablesRelative2[0];
                    if (drawable2 == null) {
                        drawable2 = compoundDrawablesRelative2[1];
                    }
                    Drawable drawable8 = compoundDrawablesRelative2[2];
                    if (drawable4 == null) {
                        drawable4 = compoundDrawablesRelative2[3];
                    }
                    textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, drawable8, drawable4);
                    return;
                }
            }
            Drawable[] compoundDrawables = this.f2226a.getCompoundDrawables();
            TextView textView3 = this.f2226a;
            if (drawable == null) {
                drawable = compoundDrawables[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawables[1];
            }
            if (drawable3 == null) {
                drawable3 = compoundDrawables[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawables[3];
            }
            textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }
    }
}
