package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build.VERSION;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnTouchListener;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.AutoCompleteTextView.OnDismissListener;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.appcompat.p006a.p007a.C0242a;
import androidx.core.p034l.C0962e0;
import androidx.core.p034l.p035o0.C1016d;
import com.google.android.material.C5582R;
import com.google.android.material.p179a.C5587a;
import com.google.android.material.p185e.C5713a;
import com.google.android.material.p187p.C6978j;
import com.google.android.material.p187p.C6986o;
import com.google.android.material.textfield.TextInputLayout.C7073e;
import com.google.android.material.textfield.TextInputLayout.C7074h;

/* renamed from: com.google.android.material.textfield.d */
/* compiled from: DropdownMenuEndIconDelegate */
class C7087d extends C7098e {

    /* renamed from: o */
    private static final boolean f20097o = (VERSION.SDK_INT >= 21);

    /* renamed from: p */
    private static final int f20098p = 50;

    /* renamed from: q */
    private static final int f20099q = 67;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final TextWatcher f20100d = new C7088a();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C7073e f20101e = new C7090b(this.f20123a);

    /* renamed from: f */
    private final C7074h f20102f = new C7091c();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f20103g = false;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f20104h = false;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public long f20105i = Long.MAX_VALUE;

    /* renamed from: j */
    private StateListDrawable f20106j;

    /* renamed from: k */
    private C6978j f20107k;
    /* access modifiers changed from: private */
    @C0195i0

    /* renamed from: l */
    public AccessibilityManager f20108l;

    /* renamed from: m */
    private ValueAnimator f20109m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public ValueAnimator f20110n;

    /* renamed from: com.google.android.material.textfield.d$a */
    /* compiled from: DropdownMenuEndIconDelegate */
    class C7088a implements TextWatcher {

        /* renamed from: com.google.android.material.textfield.d$a$a */
        /* compiled from: DropdownMenuEndIconDelegate */
        class C7089a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ AutoCompleteTextView f20112a;

            C7089a(AutoCompleteTextView autoCompleteTextView) {
                this.f20112a = autoCompleteTextView;
            }

            public void run() {
                boolean isPopupShowing = this.f20112a.isPopupShowing();
                C7087d.this.m34160b(isPopupShowing);
                C7087d.this.f20103g = isPopupShowing;
            }
        }

        C7088a() {
        }

        public void afterTextChanged(Editable editable) {
            C7087d dVar = C7087d.this;
            AutoCompleteTextView a = dVar.m34149a(dVar.f20123a.getEditText());
            a.post(new C7089a(a));
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.google.android.material.textfield.d$b */
    /* compiled from: DropdownMenuEndIconDelegate */
    class C7090b extends C7073e {
        C7090b(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        /* renamed from: a */
        public void mo4749a(View view, @C0193h0 C1016d dVar) {
            super.mo4749a(view, dVar);
            dVar.mo4937a((CharSequence) Spinner.class.getName());
            if (dVar.mo4943a0()) {
                dVar.mo4969d((CharSequence) null);
            }
        }

        /* renamed from: c */
        public void mo4754c(View view, @C0193h0 AccessibilityEvent accessibilityEvent) {
            super.mo4754c(view, accessibilityEvent);
            C7087d dVar = C7087d.this;
            AutoCompleteTextView a = dVar.m34149a(dVar.f20123a.getEditText());
            if (accessibilityEvent.getEventType() == 1 && C7087d.this.f20108l.isTouchExplorationEnabled()) {
                C7087d.this.m34168d(a);
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.d$c */
    /* compiled from: DropdownMenuEndIconDelegate */
    class C7091c implements C7074h {
        C7091c() {
        }

        /* renamed from: a */
        public void mo28400a(@C0193h0 TextInputLayout textInputLayout) {
            AutoCompleteTextView a = C7087d.this.m34149a(textInputLayout.getEditText());
            C7087d.this.m34157b(a);
            C7087d.this.m34152a(a);
            C7087d.this.m34165c(a);
            a.setThreshold(0);
            a.removeTextChangedListener(C7087d.this.f20100d);
            a.addTextChangedListener(C7087d.this.f20100d);
            textInputLayout.setErrorIconDrawable((Drawable) null);
            textInputLayout.setTextInputAccessibilityDelegate(C7087d.this.f20101e);
            textInputLayout.setEndIconVisible(true);
        }
    }

    /* renamed from: com.google.android.material.textfield.d$d */
    /* compiled from: DropdownMenuEndIconDelegate */
    class C7092d implements OnClickListener {
        C7092d() {
        }

        public void onClick(View view) {
            C7087d.this.m34168d((AutoCompleteTextView) C7087d.this.f20123a.getEditText());
        }
    }

    /* renamed from: com.google.android.material.textfield.d$e */
    /* compiled from: DropdownMenuEndIconDelegate */
    class C7093e implements OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ AutoCompleteTextView f20117a;

        C7093e(AutoCompleteTextView autoCompleteTextView) {
            this.f20117a = autoCompleteTextView;
        }

        public boolean onTouch(@C0193h0 View view, @C0193h0 MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                if (C7087d.this.m34170d()) {
                    C7087d.this.f20103g = false;
                }
                C7087d.this.m34168d(this.f20117a);
                view.performClick();
            }
            return false;
        }
    }

    /* renamed from: com.google.android.material.textfield.d$f */
    /* compiled from: DropdownMenuEndIconDelegate */
    class C7094f implements OnFocusChangeListener {
        C7094f() {
        }

        public void onFocusChange(View view, boolean z) {
            C7087d.this.f20123a.setEndIconActivated(z);
            if (!z) {
                C7087d.this.m34160b(false);
                C7087d.this.f20103g = false;
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.d$g */
    /* compiled from: DropdownMenuEndIconDelegate */
    class C7095g implements OnDismissListener {
        C7095g() {
        }

        public void onDismiss() {
            C7087d.this.f20103g = true;
            C7087d.this.f20105i = System.currentTimeMillis();
            C7087d.this.m34160b(false);
        }
    }

    /* renamed from: com.google.android.material.textfield.d$h */
    /* compiled from: DropdownMenuEndIconDelegate */
    class C7096h extends AnimatorListenerAdapter {
        C7096h() {
        }

        public void onAnimationEnd(Animator animator) {
            C7087d dVar = C7087d.this;
            dVar.f20125c.setChecked(dVar.f20104h);
            C7087d.this.f20110n.start();
        }
    }

    /* renamed from: com.google.android.material.textfield.d$i */
    /* compiled from: DropdownMenuEndIconDelegate */
    class C7097i implements AnimatorUpdateListener {
        C7097i() {
        }

        public void onAnimationUpdate(@C0193h0 ValueAnimator valueAnimator) {
            C7087d.this.f20125c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    C7087d(@C0193h0 TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo28415a(int i) {
        return i != 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo28416b() {
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m34165c(@C0193h0 AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.setOnTouchListener(new C7093e(autoCompleteTextView));
        autoCompleteTextView.setOnFocusChangeListener(new C7094f());
        if (f20097o) {
            autoCompleteTextView.setOnDismissListener(new C7095g());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m34168d(@C0195i0 AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView != null) {
            if (m34170d()) {
                this.f20103g = false;
            }
            if (!this.f20103g) {
                if (f20097o) {
                    m34160b(!this.f20104h);
                } else {
                    this.f20104h = !this.f20104h;
                    this.f20125c.toggle();
                }
                if (this.f20104h) {
                    autoCompleteTextView.requestFocus();
                    autoCompleteTextView.showDropDown();
                } else {
                    autoCompleteTextView.dismissDropDown();
                }
            } else {
                this.f20103g = false;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m34157b(@C0193h0 AutoCompleteTextView autoCompleteTextView) {
        if (f20097o) {
            int boxBackgroundMode = this.f20123a.getBoxBackgroundMode();
            if (boxBackgroundMode == 2) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.f20107k);
            } else if (boxBackgroundMode == 1) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.f20106j);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo28402a() {
        float dimensionPixelOffset = (float) this.f20124b.getResources().getDimensionPixelOffset(C5582R.dimen.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = (float) this.f20124b.getResources().getDimensionPixelOffset(C5582R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = this.f20124b.getResources().getDimensionPixelOffset(C5582R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        C6978j a = m34151a(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        C6978j a2 = m34151a(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.f20107k = a;
        this.f20106j = new StateListDrawable();
        this.f20106j.addState(new int[]{16842922}, a);
        this.f20106j.addState(new int[0], a2);
        this.f20123a.setEndIconDrawable(C0242a.m1109c(this.f20124b, f20097o ? C5582R.C5585drawable.mtrl_dropdown_arrow : C5582R.C5585drawable.mtrl_ic_arrow_drop_down));
        TextInputLayout textInputLayout = this.f20123a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(C5582R.string.exposed_dropdown_menu_content_description));
        this.f20123a.setEndIconOnClickListener(new C7092d());
        this.f20123a.mo28241a(this.f20102f);
        m34164c();
        C0962e0.m5531l((View) this.f20125c, 2);
        this.f20108l = (AccessibilityManager) this.f20124b.getSystemService("accessibility");
    }

    /* renamed from: c */
    private void m34164c() {
        this.f20110n = m34148a(67, 0.0f, 1.0f);
        this.f20109m = m34148a(50, 1.0f, 0.0f);
        this.f20109m.addListener(new C7096h());
    }

    /* renamed from: b */
    private void m34158b(@C0193h0 AutoCompleteTextView autoCompleteTextView, int i, int[][] iArr, @C0193h0 C6978j jVar) {
        LayerDrawable layerDrawable;
        int a = C5713a.m25190a((View) autoCompleteTextView, C5582R.attr.colorSurface);
        C6978j jVar2 = new C6978j(jVar.getShapeAppearanceModel());
        int a2 = C5713a.m25187a(i, a, 0.1f);
        jVar2.mo27790a(new ColorStateList(iArr, new int[]{a2, 0}));
        if (f20097o) {
            jVar2.setTint(a);
            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{a2, a});
            C6978j jVar3 = new C6978j(jVar.getShapeAppearanceModel());
            jVar3.setTint(-1);
            layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, jVar2, jVar3), jVar});
        } else {
            layerDrawable = new LayerDrawable(new Drawable[]{jVar2, jVar});
        }
        C0962e0.m5440a((View) autoCompleteTextView, (Drawable) layerDrawable);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public boolean m34170d() {
        long currentTimeMillis = System.currentTimeMillis() - this.f20105i;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m34160b(boolean z) {
        if (this.f20104h != z) {
            this.f20104h = z;
            this.f20110n.cancel();
            this.f20109m.start();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m34152a(@C0193h0 AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView.getKeyListener() == null) {
            int boxBackgroundMode = this.f20123a.getBoxBackgroundMode();
            C6978j boxBackground = this.f20123a.getBoxBackground();
            int a = C5713a.m25190a((View) autoCompleteTextView, C5582R.attr.colorControlHighlight);
            int[][] iArr = {new int[]{16842919}, new int[0]};
            if (boxBackgroundMode == 2) {
                m34158b(autoCompleteTextView, a, iArr, boxBackground);
            } else if (boxBackgroundMode == 1) {
                m34153a(autoCompleteTextView, a, iArr, boxBackground);
            }
        }
    }

    /* renamed from: a */
    private void m34153a(@C0193h0 AutoCompleteTextView autoCompleteTextView, int i, int[][] iArr, @C0193h0 C6978j jVar) {
        int boxBackgroundColor = this.f20123a.getBoxBackgroundColor();
        int[] iArr2 = {C5713a.m25187a(i, boxBackgroundColor, 0.1f), boxBackgroundColor};
        if (f20097o) {
            C0962e0.m5440a((View) autoCompleteTextView, (Drawable) new RippleDrawable(new ColorStateList(iArr, iArr2), jVar, jVar));
            return;
        }
        C6978j jVar2 = new C6978j(jVar.getShapeAppearanceModel());
        jVar2.mo27790a(new ColorStateList(iArr, iArr2));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{jVar, jVar2});
        int I = C0962e0.m5405I(autoCompleteTextView);
        int paddingTop = autoCompleteTextView.getPaddingTop();
        int H = C0962e0.m5404H(autoCompleteTextView);
        int paddingBottom = autoCompleteTextView.getPaddingBottom();
        C0962e0.m5440a((View) autoCompleteTextView, (Drawable) layerDrawable);
        C0962e0.m5473b(autoCompleteTextView, I, paddingTop, H, paddingBottom);
    }

    /* renamed from: a */
    private C6978j m34151a(float f, float f2, float f3, int i) {
        C6986o a = C6986o.m33529n().mo27891d(f).mo27897e(f).mo27879b(f2).mo27885c(f2).mo27878a();
        C6978j a2 = C6978j.m33431a(this.f20124b, f3);
        a2.setShapeAppearanceModel(a);
        a2.mo27787a(0, i, 0, i);
        return a2;
    }

    /* access modifiers changed from: private */
    @C0193h0
    /* renamed from: a */
    public AutoCompleteTextView m34149a(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    /* renamed from: a */
    private ValueAnimator m34148a(int i, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C5587a.f15929a);
        ofFloat.setDuration((long) i);
        ofFloat.addUpdateListener(new C7097i());
        return ofFloat;
    }
}
