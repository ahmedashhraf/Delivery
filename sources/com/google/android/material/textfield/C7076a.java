package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.widget.EditText;
import androidx.annotation.C0193h0;
import androidx.appcompat.p006a.p007a.C0242a;
import com.google.android.material.C5582R;
import com.google.android.material.p179a.C5587a;
import com.google.android.material.textfield.TextInputLayout.C7074h;

/* renamed from: com.google.android.material.textfield.a */
/* compiled from: ClearTextEndIconDelegate */
class C7076a extends C7098e {

    /* renamed from: h */
    private static final int f20079h = 100;

    /* renamed from: i */
    private static final int f20080i = 150;

    /* renamed from: j */
    private static final float f20081j = 0.8f;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final TextWatcher f20082d = new C7077a();

    /* renamed from: e */
    private final C7074h f20083e = new C7078b();

    /* renamed from: f */
    private AnimatorSet f20084f;

    /* renamed from: g */
    private ValueAnimator f20085g;

    /* renamed from: com.google.android.material.textfield.a$a */
    /* compiled from: ClearTextEndIconDelegate */
    class C7077a implements TextWatcher {
        C7077a() {
        }

        public void afterTextChanged(@C0193h0 Editable editable) {
            if (C7076a.this.f20123a.getSuffixText() == null) {
                C7076a.this.m34130b(C7076a.m34131b(editable));
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.google.android.material.textfield.a$b */
    /* compiled from: ClearTextEndIconDelegate */
    class C7078b implements C7074h {

        /* renamed from: com.google.android.material.textfield.a$b$a */
        /* compiled from: ClearTextEndIconDelegate */
        class C7079a implements OnFocusChangeListener {
            C7079a() {
            }

            public void onFocusChange(View view, boolean z) {
                boolean z2 = true;
                boolean z3 = !TextUtils.isEmpty(((EditText) view).getText());
                C7076a aVar = C7076a.this;
                if (!z3 || !z) {
                    z2 = false;
                }
                aVar.m34130b(z2);
            }
        }

        C7078b() {
        }

        /* renamed from: a */
        public void mo28400a(@C0193h0 TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(C7076a.m34131b(editText.getText()));
            textInputLayout.setEndIconCheckable(false);
            editText.setOnFocusChangeListener(new C7079a());
            editText.removeTextChangedListener(C7076a.this.f20082d);
            editText.addTextChangedListener(C7076a.this.f20082d);
        }
    }

    /* renamed from: com.google.android.material.textfield.a$c */
    /* compiled from: ClearTextEndIconDelegate */
    class C7080c implements OnClickListener {
        C7080c() {
        }

        public void onClick(View view) {
            C7076a.this.f20123a.getEditText().setText(null);
        }
    }

    /* renamed from: com.google.android.material.textfield.a$d */
    /* compiled from: ClearTextEndIconDelegate */
    class C7081d extends AnimatorListenerAdapter {
        C7081d() {
        }

        public void onAnimationStart(Animator animator) {
            C7076a.this.f20123a.setEndIconVisible(true);
        }
    }

    /* renamed from: com.google.android.material.textfield.a$e */
    /* compiled from: ClearTextEndIconDelegate */
    class C7082e extends AnimatorListenerAdapter {
        C7082e() {
        }

        public void onAnimationEnd(Animator animator) {
            C7076a.this.f20123a.setEndIconVisible(false);
        }
    }

    /* renamed from: com.google.android.material.textfield.a$f */
    /* compiled from: ClearTextEndIconDelegate */
    class C7083f implements AnimatorUpdateListener {
        C7083f() {
        }

        public void onAnimationUpdate(@C0193h0 ValueAnimator valueAnimator) {
            C7076a.this.f20125c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.textfield.a$g */
    /* compiled from: ClearTextEndIconDelegate */
    class C7084g implements AnimatorUpdateListener {
        C7084g() {
        }

        public void onAnimationUpdate(@C0193h0 ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C7076a.this.f20125c.setScaleX(floatValue);
            C7076a.this.f20125c.setScaleY(floatValue);
        }
    }

    C7076a(@C0193h0 TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m34130b(boolean z) {
        boolean z2 = this.f20123a.mo28256f() == z;
        if (z) {
            this.f20085g.cancel();
            this.f20084f.start();
            if (z2) {
                this.f20084f.end();
                return;
            }
            return;
        }
        this.f20084f.cancel();
        this.f20085g.start();
        if (z2) {
            this.f20085g.end();
        }
    }

    /* renamed from: c */
    private ValueAnimator m34132c() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f20081j, 1.0f});
        ofFloat.setInterpolator(C5587a.f15932d);
        ofFloat.setDuration(150);
        ofFloat.addUpdateListener(new C7084g());
        return ofFloat;
    }

    /* renamed from: d */
    private void m34133d() {
        ValueAnimator c = m34132c();
        ValueAnimator a = m34126a(0.0f, 1.0f);
        this.f20084f = new AnimatorSet();
        this.f20084f.playTogether(new Animator[]{c, a});
        this.f20084f.addListener(new C7081d());
        this.f20085g = m34126a(1.0f, 0.0f);
        this.f20085g.addListener(new C7082e());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo28402a() {
        this.f20123a.setEndIconDrawable(C0242a.m1109c(this.f20124b, C5582R.C5585drawable.mtrl_ic_cancel));
        TextInputLayout textInputLayout = this.f20123a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(C5582R.string.clear_text_end_icon_content_description));
        this.f20123a.setEndIconOnClickListener(new C7080c());
        this.f20123a.mo28241a(this.f20083e);
        m34133d();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static boolean m34131b(@C0193h0 Editable editable) {
        return editable.length() > 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo28403a(boolean z) {
        if (this.f20123a.getSuffixText() != null) {
            m34130b(z);
        }
    }

    /* renamed from: a */
    private ValueAnimator m34126a(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C5587a.f15929a);
        ofFloat.setDuration(100);
        ofFloat.addUpdateListener(new C7083f());
        return ofFloat;
    }
}
