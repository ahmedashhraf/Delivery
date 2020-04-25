package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0198k;
import androidx.annotation.C0216r0;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.p034l.C0962e0;
import androidx.core.widget.C1120m;
import com.google.android.material.C5582R;
import com.google.android.material.p179a.C5587a;
import com.google.android.material.p179a.C5588b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.material.textfield.f */
/* compiled from: IndicatorViewController */
final class C7099f {

    /* renamed from: A */
    static final int f20126A = 2;

    /* renamed from: B */
    private static final int f20127B = 0;

    /* renamed from: C */
    private static final int f20128C = 1;

    /* renamed from: D */
    private static final int f20129D = 2;

    /* renamed from: w */
    private static final int f20130w = 217;

    /* renamed from: x */
    private static final int f20131x = 167;

    /* renamed from: y */
    static final int f20132y = 0;

    /* renamed from: z */
    static final int f20133z = 1;

    /* renamed from: a */
    private final Context f20134a;
    @C0193h0

    /* renamed from: b */
    private final TextInputLayout f20135b;

    /* renamed from: c */
    private LinearLayout f20136c;

    /* renamed from: d */
    private int f20137d;

    /* renamed from: e */
    private FrameLayout f20138e;

    /* renamed from: f */
    private int f20139f;
    /* access modifiers changed from: private */
    @C0195i0

    /* renamed from: g */
    public Animator f20140g;

    /* renamed from: h */
    private final float f20141h = ((float) this.f20134a.getResources().getDimensionPixelSize(C5582R.dimen.design_textinput_caption_translate_y));
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f20142i;

    /* renamed from: j */
    private int f20143j;
    @C0195i0

    /* renamed from: k */
    private CharSequence f20144k;

    /* renamed from: l */
    private boolean f20145l;
    /* access modifiers changed from: private */
    @C0195i0

    /* renamed from: m */
    public TextView f20146m;
    @C0195i0

    /* renamed from: n */
    private CharSequence f20147n;

    /* renamed from: o */
    private int f20148o;
    @C0195i0

    /* renamed from: p */
    private ColorStateList f20149p;

    /* renamed from: q */
    private CharSequence f20150q;

    /* renamed from: r */
    private boolean f20151r;
    @C0195i0

    /* renamed from: s */
    private TextView f20152s;

    /* renamed from: t */
    private int f20153t;
    @C0195i0

    /* renamed from: u */
    private ColorStateList f20154u;

    /* renamed from: v */
    private Typeface f20155v;

    /* renamed from: com.google.android.material.textfield.f$a */
    /* compiled from: IndicatorViewController */
    class C7100a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ int f20156a;

        /* renamed from: b */
        final /* synthetic */ TextView f20157b;

        /* renamed from: c */
        final /* synthetic */ int f20158c;

        /* renamed from: d */
        final /* synthetic */ TextView f20159d;

        C7100a(int i, TextView textView, int i2, TextView textView2) {
            this.f20156a = i;
            this.f20157b = textView;
            this.f20158c = i2;
            this.f20159d = textView2;
        }

        public void onAnimationEnd(Animator animator) {
            C7099f.this.f20142i = this.f20156a;
            C7099f.this.f20140g = null;
            TextView textView = this.f20157b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f20158c == 1 && C7099f.this.f20146m != null) {
                    C7099f.this.f20146m.setText(null);
                }
            }
            TextView textView2 = this.f20159d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f20159d.setAlpha(1.0f);
            }
        }

        public void onAnimationStart(Animator animator) {
            TextView textView = this.f20159d;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    public C7099f(@C0193h0 TextInputLayout textInputLayout) {
        this.f20134a = textInputLayout.getContext();
        this.f20135b = textInputLayout;
    }

    @C0195i0
    /* renamed from: d */
    private TextView m34194d(int i) {
        if (i == 1) {
            return this.f20146m;
        }
        if (i != 2) {
            return null;
        }
        return this.f20152s;
    }

    /* renamed from: e */
    private boolean m34195e(int i) {
        if (i != 1 || this.f20146m == null || TextUtils.isEmpty(this.f20144k)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    private boolean m34196f(int i) {
        return i == 2 && this.f20152s != null && !TextUtils.isEmpty(this.f20150q);
    }

    /* renamed from: r */
    private boolean m34197r() {
        return (this.f20136c == null || this.f20135b.getEditText() == null) ? false : true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo28433a(int i) {
        return i == 0 || i == 1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo28438b(CharSequence charSequence) {
        mo28434b();
        this.f20144k = charSequence;
        this.f20146m.setText(charSequence);
        if (this.f20142i != 1) {
            this.f20143j = 1;
        }
        m34189a(this.f20142i, this.f20143j, m34193a(this.f20146m, charSequence));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo28441c(CharSequence charSequence) {
        mo28434b();
        this.f20150q = charSequence;
        this.f20152s.setText(charSequence);
        if (this.f20142i != 2) {
            this.f20143j = 2;
        }
        m34189a(this.f20142i, this.f20143j, m34193a(this.f20152s, charSequence));
    }

    /* access modifiers changed from: 0000 */
    @C0198k
    /* renamed from: g */
    public int mo28446g() {
        TextView textView = this.f20146m;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* access modifiers changed from: 0000 */
    @C0195i0
    /* renamed from: h */
    public ColorStateList mo28447h() {
        TextView textView = this.f20146m;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public CharSequence mo28448i() {
        return this.f20150q;
    }

    /* access modifiers changed from: 0000 */
    @C0195i0
    /* renamed from: j */
    public ColorStateList mo28449j() {
        TextView textView = this.f20152s;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    @C0198k
    /* renamed from: k */
    public int mo28450k() {
        TextView textView = this.f20152s;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public boolean mo28451l() {
        return m34196f(this.f20142i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public boolean mo28452m() {
        return m34196f(this.f20143j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public void mo28453n() {
        this.f20144k = null;
        mo28434b();
        if (this.f20142i == 1) {
            if (!this.f20151r || TextUtils.isEmpty(this.f20150q)) {
                this.f20143j = 0;
            } else {
                this.f20143j = 2;
            }
        }
        m34189a(this.f20142i, this.f20143j, m34193a(this.f20146m, (CharSequence) null));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public void mo28454o() {
        mo28434b();
        if (this.f20142i == 2) {
            this.f20143j = 0;
        }
        m34189a(this.f20142i, this.f20143j, m34193a(this.f20152s, (CharSequence) null));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public boolean mo28455p() {
        return this.f20145l;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public boolean mo28456q() {
        return this.f20151r;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo28443d() {
        return m34195e(this.f20143j);
    }

    /* access modifiers changed from: 0000 */
    @C0195i0
    /* renamed from: e */
    public CharSequence mo28444e() {
        return this.f20147n;
    }

    /* access modifiers changed from: 0000 */
    @C0195i0
    /* renamed from: f */
    public CharSequence mo28445f() {
        return this.f20144k;
    }

    /* renamed from: a */
    private boolean m34193a(@C0195i0 TextView textView, @C0195i0 CharSequence charSequence) {
        return C0962e0.m5540n0(this.f20135b) && this.f20135b.isEnabled() && (this.f20143j != this.f20142i || textView == null || !TextUtils.equals(textView.getText(), charSequence));
    }

    /* renamed from: a */
    private void m34189a(int i, int i2, boolean z) {
        boolean z2 = z;
        if (i != i2) {
            if (z2) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.f20140g = animatorSet;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = arrayList;
                int i3 = i;
                int i4 = i2;
                m34192a(arrayList2, this.f20151r, this.f20152s, 2, i3, i4);
                m34192a(arrayList2, this.f20145l, this.f20146m, 1, i3, i4);
                C5588b.m24253a(animatorSet, arrayList);
                C7100a aVar = new C7100a(i2, m34194d(i), i, m34194d(i2));
                animatorSet.addListener(aVar);
                animatorSet.start();
            } else {
                m34188a(i, i2);
            }
            this.f20135b.mo28316q();
            this.f20135b.mo28248b(z2);
            this.f20135b.mo28317r();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo28434b() {
        Animator animator = this.f20140g;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo28442c() {
        return m34195e(this.f20142i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo28440c(@C0216r0 int i) {
        this.f20153t = i;
        TextView textView = this.f20152s;
        if (textView != null) {
            C1120m.m6391e(textView, i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo28437b(TextView textView, int i) {
        if (this.f20136c != null) {
            if (mo28433a(i)) {
                FrameLayout frameLayout = this.f20138e;
                if (frameLayout != null) {
                    this.f20139f--;
                    m34190a((ViewGroup) frameLayout, this.f20139f);
                    this.f20138e.removeView(textView);
                    this.f20137d--;
                    m34190a((ViewGroup) this.f20136c, this.f20137d);
                }
            }
            this.f20136c.removeView(textView);
            this.f20137d--;
            m34190a((ViewGroup) this.f20136c, this.f20137d);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo28439b(boolean z) {
        if (this.f20151r != z) {
            mo28434b();
            if (z) {
                this.f20152s = new AppCompatTextView(this.f20134a);
                this.f20152s.setId(C5582R.C5586id.textinput_helper_text);
                if (VERSION.SDK_INT >= 17) {
                    this.f20152s.setTextAlignment(5);
                }
                Typeface typeface = this.f20155v;
                if (typeface != null) {
                    this.f20152s.setTypeface(typeface);
                }
                this.f20152s.setVisibility(4);
                C0962e0.m5527k((View) this.f20152s, 1);
                mo28440c(this.f20153t);
                mo28436b(this.f20154u);
                mo28430a(this.f20152s, 1);
            } else {
                mo28454o();
                mo28437b(this.f20152s, 1);
                this.f20152s = null;
                this.f20135b.mo28316q();
                this.f20135b.mo28317r();
            }
            this.f20151r = z;
        }
    }

    /* renamed from: a */
    private void m34188a(int i, int i2) {
        if (i != i2) {
            if (i2 != 0) {
                TextView d = m34194d(i2);
                if (d != null) {
                    d.setVisibility(0);
                    d.setAlpha(1.0f);
                }
            }
            if (i != 0) {
                TextView d2 = m34194d(i);
                if (d2 != null) {
                    d2.setVisibility(4);
                    if (i == 1) {
                        d2.setText(null);
                    }
                }
            }
            this.f20142i = i2;
        }
    }

    /* renamed from: a */
    private void m34192a(@C0193h0 List<Animator> list, boolean z, @C0195i0 TextView textView, int i, int i2, int i3) {
        if (textView != null && z) {
            if (i == i3 || i == i2) {
                list.add(m34186a(textView, i3 == i));
                if (i3 == i) {
                    list.add(m34185a(textView));
                }
            }
        }
    }

    /* renamed from: a */
    private ObjectAnimator m34186a(TextView textView, boolean z) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, new float[]{z ? 1.0f : 0.0f});
        ofFloat.setDuration(167);
        ofFloat.setInterpolator(C5587a.f15929a);
        return ofFloat;
    }

    /* renamed from: a */
    private ObjectAnimator m34185a(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, new float[]{-this.f20141h, 0.0f});
        ofFloat.setDuration(217);
        ofFloat.setInterpolator(C5587a.f15932d);
        return ofFloat;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo28427a() {
        if (m34197r()) {
            C0962e0.m5473b(this.f20136c, C0962e0.m5405I(this.f20135b.getEditText()), 0, C0962e0.m5404H(this.f20135b.getEditText()), 0);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo28435b(@C0216r0 int i) {
        this.f20148o = i;
        TextView textView = this.f20146m;
        if (textView != null) {
            this.f20135b.mo28240a(textView, i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo28436b(@C0195i0 ColorStateList colorStateList) {
        this.f20154u = colorStateList;
        TextView textView = this.f20152s;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo28430a(TextView textView, int i) {
        if (this.f20136c == null && this.f20138e == null) {
            this.f20136c = new LinearLayout(this.f20134a);
            this.f20136c.setOrientation(0);
            this.f20135b.addView(this.f20136c, -1, -2);
            this.f20138e = new FrameLayout(this.f20134a);
            this.f20136c.addView(this.f20138e, new LayoutParams(0, -2, 1.0f));
            if (this.f20135b.getEditText() != null) {
                mo28427a();
            }
        }
        if (mo28433a(i)) {
            this.f20138e.setVisibility(0);
            this.f20138e.addView(textView);
            this.f20139f++;
        } else {
            this.f20136c.addView(textView, new LayoutParams(-2, -2));
        }
        this.f20136c.setVisibility(0);
        this.f20137d++;
    }

    /* renamed from: a */
    private void m34190a(@C0193h0 ViewGroup viewGroup, int i) {
        if (i == 0) {
            viewGroup.setVisibility(8);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo28432a(boolean z) {
        if (this.f20145l != z) {
            mo28434b();
            if (z) {
                this.f20146m = new AppCompatTextView(this.f20134a);
                this.f20146m.setId(C5582R.C5586id.textinput_error);
                if (VERSION.SDK_INT >= 17) {
                    this.f20146m.setTextAlignment(5);
                }
                Typeface typeface = this.f20155v;
                if (typeface != null) {
                    this.f20146m.setTypeface(typeface);
                }
                mo28435b(this.f20148o);
                mo28428a(this.f20149p);
                mo28431a(this.f20147n);
                this.f20146m.setVisibility(4);
                C0962e0.m5527k((View) this.f20146m, 1);
                mo28430a(this.f20146m, 0);
            } else {
                mo28453n();
                mo28437b(this.f20146m, 0);
                this.f20146m = null;
                this.f20135b.mo28316q();
                this.f20135b.mo28317r();
            }
            this.f20145l = z;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo28429a(Typeface typeface) {
        if (typeface != this.f20155v) {
            this.f20155v = typeface;
            m34191a(this.f20146m, typeface);
            m34191a(this.f20152s, typeface);
        }
    }

    /* renamed from: a */
    private void m34191a(@C0195i0 TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo28428a(@C0195i0 ColorStateList colorStateList) {
        this.f20149p = colorStateList;
        TextView textView = this.f20146m;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo28431a(@C0195i0 CharSequence charSequence) {
        this.f20147n = charSequence;
        TextView textView = this.f20146m;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }
}
