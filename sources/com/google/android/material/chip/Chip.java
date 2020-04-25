package com.google.android.material.chip;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewOutlineProvider;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckBox;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.TextView.BufferType;
import androidx.annotation.C0180b;
import androidx.annotation.C0192h;
import androidx.annotation.C0193h0;
import androidx.annotation.C0194i;
import androidx.annotation.C0195i0;
import androidx.annotation.C0199k0;
import androidx.annotation.C0202m;
import androidx.annotation.C0209o;
import androidx.annotation.C0211p;
import androidx.annotation.C0213q;
import androidx.annotation.C0214q0;
import androidx.annotation.C0216r0;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.p034l.C0947a;
import androidx.core.p034l.C0962e0;
import androidx.core.p034l.p035o0.C1016d;
import androidx.core.p034l.p035o0.C1016d.C1017a;
import androidx.customview.p039a.C1130a;
import com.fasterxml.jackson.core.p162w.C3868i;
import com.google.android.material.C5582R;
import com.google.android.material.chip.C5694a.C5695a;
import com.google.android.material.internal.C6928p;
import com.google.android.material.internal.C6936w;
import com.google.android.material.p179a.C5594h;
import com.google.android.material.p187p.C6978j;
import com.google.android.material.p187p.C6982k;
import com.google.android.material.p187p.C6986o;
import com.google.android.material.p187p.C7003s;
import com.google.android.material.p302m.C6952c;
import com.google.android.material.p302m.C6953d;
import com.google.android.material.p302m.C6957f;
import com.google.android.material.p303n.C6961b;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public class Chip extends AppCompatCheckBox implements C5695a, C7003s {

    /* renamed from: h0 */
    private static final String f16433h0 = "Chip";

    /* renamed from: i0 */
    private static final int f16434i0 = 0;

    /* renamed from: j0 */
    private static final int f16435j0 = 1;
    /* access modifiers changed from: private */

    /* renamed from: k0 */
    public static final Rect f16436k0 = new Rect();

    /* renamed from: l0 */
    private static final int[] f16437l0 = {16842913};

    /* renamed from: m0 */
    private static final int[] f16438m0 = {16842911};

    /* renamed from: n0 */
    private static final String f16439n0 = "http://schemas.android.com/apk/res/android";

    /* renamed from: o0 */
    private static final int f16440o0 = 48;

    /* renamed from: p0 */
    private static final String f16441p0 = "android.widget.Button";

    /* renamed from: q0 */
    private static final String f16442q0 = "android.widget.CompoundButton";

    /* renamed from: r0 */
    private static final String f16443r0 = "android.view.View";
    /* access modifiers changed from: private */
    @C0195i0

    /* renamed from: O */
    public C5694a f16444O;
    @C0195i0

    /* renamed from: P */
    private InsetDrawable f16445P;
    @C0195i0

    /* renamed from: Q */
    private RippleDrawable f16446Q;
    /* access modifiers changed from: private */
    @C0195i0

    /* renamed from: R */
    public OnClickListener f16447R;
    @C0195i0

    /* renamed from: S */
    private OnCheckedChangeListener f16448S;

    /* renamed from: T */
    private boolean f16449T;

    /* renamed from: U */
    private boolean f16450U;

    /* renamed from: V */
    private boolean f16451V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public boolean f16452W;

    /* renamed from: a0 */
    private boolean f16453a0;

    /* renamed from: b0 */
    private int f16454b0;
    @C0211p(unit = 1)

    /* renamed from: c0 */
    private int f16455c0;
    @C0193h0

    /* renamed from: d0 */
    private final C5688c f16456d0;

    /* renamed from: e0 */
    private final Rect f16457e0;

    /* renamed from: f0 */
    private final RectF f16458f0;

    /* renamed from: g0 */
    private final C6957f f16459g0;

    /* renamed from: com.google.android.material.chip.Chip$a */
    class C5686a extends C6957f {
        C5686a() {
        }

        /* renamed from: a */
        public void mo22818a(int i) {
        }

        /* renamed from: a */
        public void mo22819a(@C0193h0 Typeface typeface, boolean z) {
            Chip chip = Chip.this;
            chip.setText(chip.f16444O.mo22984u0() ? Chip.this.f16444O.mo22919f0() : Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    /* renamed from: com.google.android.material.chip.Chip$b */
    class C5687b extends ViewOutlineProvider {
        C5687b() {
        }

        @TargetApi(21)
        public void getOutline(View view, @C0193h0 Outline outline) {
            if (Chip.this.f16444O != null) {
                Chip.this.f16444O.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    /* renamed from: com.google.android.material.chip.Chip$c */
    private class C5688c extends C1130a {
        C5688c(Chip chip) {
            super(chip);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo5389a(float f, float f2) {
            return (!Chip.this.m24935n() || !Chip.this.getCloseIconTouchBounds().contains(f, f2)) ? 0 : 1;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo5396a(@C0193h0 List<Integer> list) {
            list.add(Integer.valueOf(0));
            if (Chip.this.m24935n() && Chip.this.mo22715h() && Chip.this.f16447R != null) {
                list.add(Integer.valueOf(1));
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo5393a(int i, boolean z) {
            if (i == 1) {
                Chip.this.f16452W = z;
                Chip.this.refreshDrawableState();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo5392a(int i, @C0193h0 C1016d dVar) {
            CharSequence charSequence = "";
            if (i == 1) {
                CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
                if (closeIconContentDescription != null) {
                    dVar.mo4948b(closeIconContentDescription);
                } else {
                    CharSequence text = Chip.this.getText();
                    Context context = Chip.this.getContext();
                    int i2 = C5582R.string.mtrl_chip_close_icon_content_description;
                    Object[] objArr = new Object[1];
                    if (TextUtils.isEmpty(text)) {
                        text = charSequence;
                    }
                    objArr[0] = text;
                    dVar.mo4948b((CharSequence) context.getString(i2, objArr).trim());
                }
                dVar.mo4957c(Chip.this.getCloseIconTouchBoundsInt());
                dVar.mo4935a(C1017a.f4617k);
                dVar.mo5006j(Chip.this.isEnabled());
                return;
            }
            dVar.mo4948b(charSequence);
            dVar.mo4957c(Chip.f16436k0);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo5395a(@C0193h0 C1016d dVar) {
            dVar.mo4962c(Chip.this.mo22678b());
            dVar.mo4976e(Chip.this.isClickable());
            if (Chip.this.mo22678b() || Chip.this.isClickable()) {
                dVar.mo4937a((CharSequence) Chip.this.mo22678b() ? Chip.f16442q0 : Chip.f16441p0);
            } else {
                dVar.mo4937a((CharSequence) Chip.f16443r0);
            }
            CharSequence text = Chip.this.getText();
            if (VERSION.SDK_INT >= 23) {
                dVar.mo4997h(text);
            } else {
                dVar.mo4948b(text);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo5399a(int i, int i2, Bundle bundle) {
            if (i2 == 16) {
                if (i == 0) {
                    return Chip.this.performClick();
                }
                if (i == 1) {
                    return Chip.this.mo22716i();
                }
            }
            return false;
        }
    }

    public Chip(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: private */
    @C0193h0
    public RectF getCloseIconTouchBounds() {
        this.f16458f0.setEmpty();
        if (m24935n()) {
            this.f16444O.mo22904b(this.f16458f0);
        }
        return this.f16458f0;
    }

    /* access modifiers changed from: private */
    @C0193h0
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f16457e0.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f16457e0;
    }

    @C0195i0
    private C6953d getTextAppearance() {
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            return aVar.mo22922g0();
        }
        return null;
    }

    @C0193h0
    /* renamed from: l */
    private int[] m24933l() {
        int i = 0;
        int i2 = isEnabled() ? 1 : 0;
        if (this.f16452W) {
            i2++;
        }
        if (this.f16451V) {
            i2++;
        }
        if (this.f16450U) {
            i2++;
        }
        if (isChecked()) {
            i2++;
        }
        int[] iArr = new int[i2];
        if (isEnabled()) {
            iArr[0] = 16842910;
            i = 1;
        }
        if (this.f16452W) {
            iArr[i] = 16842908;
            i++;
        }
        if (this.f16451V) {
            iArr[i] = 16843623;
            i++;
        }
        if (this.f16450U) {
            iArr[i] = 16842919;
            i++;
        }
        if (isChecked()) {
            iArr[i] = 16842913;
        }
        return iArr;
    }

    /* renamed from: m */
    private void m24934m() {
        if (getBackgroundDrawable() == this.f16445P && this.f16444O.getCallback() == null) {
            this.f16444O.setCallback(this.f16445P);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public boolean m24935n() {
        C5694a aVar = this.f16444O;
        return (aVar == null || aVar.mo22885R() == null) ? false : true;
    }

    /* renamed from: o */
    private void m24936o() {
        if (VERSION.SDK_INT >= 21) {
            setOutlineProvider(new C5687b());
        }
    }

    /* renamed from: p */
    private void m24937p() {
        if (this.f16445P != null) {
            this.f16445P = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            m24939r();
        }
    }

    /* renamed from: q */
    private void m24938q() {
        if (!m24935n() || !mo22715h() || this.f16447R == null) {
            C0962e0.m5443a((View) this, (C0947a) null);
        } else {
            C0962e0.m5443a((View) this, (C0947a) this.f16456d0);
        }
    }

    /* renamed from: r */
    private void m24939r() {
        if (C6961b.f19468a) {
            m24940s();
            return;
        }
        this.f16444O.mo22953m(true);
        C0962e0.m5440a((View) this, getBackgroundDrawable());
        m24941t();
        m24934m();
    }

    /* renamed from: s */
    private void m24940s() {
        this.f16446Q = new RippleDrawable(C6961b.m33359b(this.f16444O.mo22912d0()), getBackgroundDrawable(), null);
        this.f16444O.mo22953m(false);
        C0962e0.m5440a((View) this, (Drawable) this.f16446Q);
        m24941t();
    }

    private void setCloseIconHovered(boolean z) {
        if (this.f16451V != z) {
            this.f16451V = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.f16450U != z) {
            this.f16450U = z;
            refreshDrawableState();
        }
    }

    /* renamed from: t */
    private void m24941t() {
        if (!TextUtils.isEmpty(getText())) {
            C5694a aVar = this.f16444O;
            if (aVar != null) {
                int J = (int) (aVar.mo22872J() + this.f16444O.mo22932h0() + this.f16444O.mo22864F());
                int O = (int) (this.f16444O.mo22882O() + this.f16444O.mo22936i0() + this.f16444O.mo22862E());
                if (this.f16445P != null) {
                    Rect rect = new Rect();
                    StringBuilder sb = new StringBuilder();
                    sb.append("padding: ");
                    sb.append(rect.left);
                    sb.append(C3868i.f12248b);
                    sb.append(rect.right);
                    sb.toString();
                    this.f16445P.getPadding(rect);
                    if (C0962e0.m5566x(this) == 1) {
                        J += rect.right;
                    } else {
                        O += rect.left;
                    }
                }
                C0962e0.m5473b(this, O, getPaddingTop(), J, getPaddingBottom());
            }
        }
    }

    /* renamed from: u */
    private void m24942u() {
        TextPaint paint = getPaint();
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        C6953d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.mo27696b(getContext(), paint, this.f16459g0);
        }
    }

    /* access modifiers changed from: protected */
    public boolean dispatchHoverEvent(@C0193h0 MotionEvent motionEvent) {
        return m24925a(motionEvent) || this.f16456d0.mo5401a(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f16456d0.mo5400a(keyEvent) || this.f16456d0.mo5408d() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C5694a aVar = this.f16444O;
        if ((aVar == null || !aVar.mo22968q0()) ? false : this.f16444O.mo22902a(m24933l())) {
            invalidate();
        }
    }

    /* renamed from: f */
    public boolean mo22684f() {
        C5694a aVar = this.f16444O;
        return aVar != null && aVar.mo22960o0();
    }

    @Deprecated
    /* renamed from: g */
    public boolean mo22685g() {
        return mo22715h();
    }

    @C0195i0
    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f16445P;
        return insetDrawable == null ? this.f16444O : insetDrawable;
    }

    @C0195i0
    public Drawable getCheckedIcon() {
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            return aVar.mo22866G();
        }
        return null;
    }

    @C0195i0
    public ColorStateList getChipBackgroundColor() {
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            return aVar.mo22868H();
        }
        return null;
    }

    public float getChipCornerRadius() {
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            return aVar.mo22870I();
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f16444O;
    }

    public float getChipEndPadding() {
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            return aVar.mo22872J();
        }
        return 0.0f;
    }

    @C0195i0
    public Drawable getChipIcon() {
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            return aVar.mo22874K();
        }
        return null;
    }

    public float getChipIconSize() {
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            return aVar.mo22876L();
        }
        return 0.0f;
    }

    @C0195i0
    public ColorStateList getChipIconTint() {
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            return aVar.mo22878M();
        }
        return null;
    }

    public float getChipMinHeight() {
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            return aVar.mo22880N();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            return aVar.mo22882O();
        }
        return 0.0f;
    }

    @C0195i0
    public ColorStateList getChipStrokeColor() {
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            return aVar.mo22883P();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            return aVar.mo22884Q();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    @C0195i0
    public Drawable getCloseIcon() {
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            return aVar.mo22885R();
        }
        return null;
    }

    @C0195i0
    public CharSequence getCloseIconContentDescription() {
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            return aVar.mo22886S();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            return aVar.mo22887T();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            return aVar.mo22888U();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            return aVar.mo22889V();
        }
        return 0.0f;
    }

    @C0195i0
    public ColorStateList getCloseIconTint() {
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            return aVar.mo22891X();
        }
        return null;
    }

    @C0195i0
    public TruncateAt getEllipsize() {
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            return aVar.mo22892Y();
        }
        return null;
    }

    public void getFocusedRect(@C0193h0 Rect rect) {
        if (this.f16456d0.mo5408d() == 1 || this.f16456d0.mo5402b() == 1) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    @C0195i0
    public C5594h getHideMotionSpec() {
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            return aVar.mo22893Z();
        }
        return null;
    }

    public float getIconEndPadding() {
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            return aVar.mo22903a0();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            return aVar.mo22908b0();
        }
        return 0.0f;
    }

    @C0195i0
    public ColorStateList getRippleColor() {
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            return aVar.mo22912d0();
        }
        return null;
    }

    @C0193h0
    public C6986o getShapeAppearanceModel() {
        return this.f16444O.getShapeAppearanceModel();
    }

    @C0195i0
    public C5594h getShowMotionSpec() {
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            return aVar.mo22916e0();
        }
        return null;
    }

    public float getTextEndPadding() {
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            return aVar.mo22932h0();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            return aVar.mo22936i0();
        }
        return 0.0f;
    }

    /* renamed from: h */
    public boolean mo22715h() {
        C5694a aVar = this.f16444O;
        return aVar != null && aVar.mo22971r0();
    }

    @C0194i
    /* renamed from: i */
    public boolean mo22716i() {
        boolean z = false;
        playSoundEffect(0);
        OnClickListener onClickListener = this.f16447R;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z = true;
        }
        this.f16456d0.mo5404b(1, 1);
        return z;
    }

    /* renamed from: j */
    public boolean mo22717j() {
        return this.f16453a0;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C6982k.m33515a((View) this, (C6978j) this.f16444O);
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, f16437l0);
        }
        if (mo22678b()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, f16438m0);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        this.f16456d0.mo5397a(z, i, rect);
    }

    public boolean onHoverEvent(@C0193h0 MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    public void onInitializeAccessibilityNodeInfo(@C0193h0 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (mo22678b() || isClickable()) {
            accessibilityNodeInfo.setClassName(mo22678b() ? f16442q0 : f16441p0);
        } else {
            accessibilityNodeInfo.setClassName(f16443r0);
        }
        accessibilityNodeInfo.setCheckable(mo22678b());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @TargetApi(24)
    @C0195i0
    public PointerIcon onResolvePointerIcon(@C0193h0 MotionEvent motionEvent, int i) {
        if (!getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) {
            return null;
        }
        return PointerIcon.getSystemIcon(getContext(), 1002);
    }

    @TargetApi(17)
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.f16454b0 != i) {
            this.f16454b0 = i;
            m24941t();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r0 != 3) goto L_0x0040;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0043  */
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(@androidx.annotation.C0193h0 android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0039
            if (r0 == r3) goto L_0x002b
            r4 = 2
            if (r0 == r4) goto L_0x0021
            r1 = 3
            if (r0 == r1) goto L_0x0034
            goto L_0x0040
        L_0x0021:
            boolean r0 = r5.f16450U
            if (r0 == 0) goto L_0x0040
            if (r1 != 0) goto L_0x003e
            r5.setCloseIconPressed(r2)
            goto L_0x003e
        L_0x002b:
            boolean r0 = r5.f16450U
            if (r0 == 0) goto L_0x0034
            r5.mo22716i()
            r0 = 1
            goto L_0x0035
        L_0x0034:
            r0 = 0
        L_0x0035:
            r5.setCloseIconPressed(r2)
            goto L_0x0041
        L_0x0039:
            if (r1 == 0) goto L_0x0040
            r5.setCloseIconPressed(r3)
        L_0x003e:
            r0 = 1
            goto L_0x0041
        L_0x0040:
            r0 = 0
        L_0x0041:
            if (r0 != 0) goto L_0x0049
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L_0x004a
        L_0x0049:
            r2 = 1
        L_0x004a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f16446Q) {
            super.setBackground(drawable);
        }
    }

    public void setBackgroundColor(int i) {
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f16446Q) {
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundResource(int i) {
    }

    public void setBackgroundTintList(@C0195i0 ColorStateList colorStateList) {
    }

    public void setBackgroundTintMode(@C0195i0 Mode mode) {
    }

    public void setCheckable(boolean z) {
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            aVar.mo22915e(z);
        }
    }

    public void setCheckableResource(@C0192h int i) {
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            aVar.mo22929h(i);
        }
    }

    public void setChecked(boolean z) {
        C5694a aVar = this.f16444O;
        if (aVar == null) {
            this.f16449T = z;
        } else if (aVar.mo22946k0()) {
            boolean isChecked = isChecked();
            super.setChecked(z);
            if (isChecked != z) {
                OnCheckedChangeListener onCheckedChangeListener = this.f16448S;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(this, z);
                }
            }
        }
    }

    public void setCheckedIcon(@C0195i0 Drawable drawable) {
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            aVar.mo22896a(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(@C0192h int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(@C0213q int i) {
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            aVar.mo22940j(i);
        }
    }

    public void setCheckedIconVisible(@C0192h int i) {
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            aVar.mo22944k(i);
        }
    }

    public void setChipBackgroundColor(@C0195i0 ColorStateList colorStateList) {
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            aVar.mo22911d(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(@C0202m int i) {
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            aVar.mo22948l(i);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            aVar.mo22933i(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(@C0209o int i) {
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            aVar.mo22952m(i);
        }
    }

    public void setChipDrawable(@C0193h0 C5694a aVar) {
        C5694a aVar2 = this.f16444O;
        if (aVar2 != aVar) {
            m24927b(aVar2);
            this.f16444O = aVar;
            this.f16444O.mo22949l(false);
            m24924a(this.f16444O);
            mo22677a(this.f16455c0);
        }
    }

    public void setChipEndPadding(float f) {
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            aVar.mo22939j(f);
        }
    }

    public void setChipEndPaddingResource(@C0209o int i) {
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            aVar.mo22956n(i);
        }
    }

    public void setChipIcon(@C0195i0 Drawable drawable) {
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            aVar.mo22905b(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(@C0192h int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(@C0213q int i) {
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            aVar.mo22964p(i);
        }
    }

    public void setChipIconSize(float f) {
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            aVar.mo22943k(f);
        }
    }

    public void setChipIconSizeResource(@C0209o int i) {
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            aVar.mo22967q(i);
        }
    }

    public void setChipIconTint(@C0195i0 ColorStateList colorStateList) {
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            aVar.mo22914e(colorStateList);
        }
    }

    public void setChipIconTintResource(@C0202m int i) {
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            aVar.mo22970r(i);
        }
    }

    public void setChipIconVisible(@C0192h int i) {
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            aVar.mo22973s(i);
        }
    }

    public void setChipMinHeight(float f) {
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            aVar.mo22947l(f);
        }
    }

    public void setChipMinHeightResource(@C0209o int i) {
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            aVar.mo22980t(i);
        }
    }

    public void setChipStartPadding(float f) {
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            aVar.mo22951m(f);
        }
    }

    public void setChipStartPaddingResource(@C0209o int i) {
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            aVar.mo22983u(i);
        }
    }

    public void setChipStrokeColor(@C0195i0 ColorStateList colorStateList) {
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            aVar.mo22917f(colorStateList);
        }
    }

    public void setChipStrokeColorResource(@C0202m int i) {
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            aVar.mo22986v(i);
        }
    }

    public void setChipStrokeWidth(float f) {
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            aVar.mo22955n(f);
        }
    }

    public void setChipStrokeWidthResource(@C0209o int i) {
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            aVar.mo22987w(i);
        }
    }

    @Deprecated
    public void setChipText(@C0195i0 CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(@C0214q0 int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(@C0195i0 Drawable drawable) {
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            aVar.mo22909c(drawable);
        }
        m24938q();
    }

    public void setCloseIconContentDescription(@C0195i0 CharSequence charSequence) {
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            aVar.mo22901a(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(@C0192h int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            aVar.mo22958o(f);
        }
    }

    public void setCloseIconEndPaddingResource(@C0209o int i) {
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            aVar.mo22989y(i);
        }
    }

    public void setCloseIconResource(@C0213q int i) {
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            aVar.mo22990z(i);
        }
        m24938q();
    }

    public void setCloseIconSize(float f) {
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            aVar.mo22963p(f);
        }
    }

    public void setCloseIconSizeResource(@C0209o int i) {
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            aVar.mo22858A(i);
        }
    }

    public void setCloseIconStartPadding(float f) {
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            aVar.mo22966q(f);
        }
    }

    public void setCloseIconStartPaddingResource(@C0209o int i) {
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            aVar.mo22859B(i);
        }
    }

    public void setCloseIconTint(@C0195i0 ColorStateList colorStateList) {
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            aVar.mo22920g(colorStateList);
        }
    }

    public void setCloseIconTintResource(@C0202m int i) {
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            aVar.mo22860C(i);
        }
    }

    public void setCloseIconVisible(@C0192h int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    public void setCompoundDrawables(@C0195i0 Drawable drawable, @C0195i0 Drawable drawable2, @C0195i0 Drawable drawable3, @C0195i0 Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelative(@C0195i0 Drawable drawable, @C0195i0 Drawable drawable2, @C0195i0 Drawable drawable3, @C0195i0 Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @RequiresApi(21)
    public void setElevation(float f) {
        super.setElevation(f);
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            aVar.mo27799b(f);
        }
    }

    public void setEllipsize(TruncateAt truncateAt) {
        if (this.f16444O != null) {
            if (truncateAt != TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                C5694a aVar = this.f16444O;
                if (aVar != null) {
                    aVar.mo22897a(truncateAt);
                }
                return;
            }
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.f16453a0 = z;
        mo22677a(this.f16455c0);
    }

    public void setGravity(int i) {
        if (i == 8388627) {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(@C0195i0 C5594h hVar) {
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            aVar.mo22898a(hVar);
        }
    }

    public void setHideMotionSpecResource(@C0180b int i) {
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            aVar.mo22863E(i);
        }
    }

    public void setIconEndPadding(float f) {
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            aVar.mo22969r(f);
        }
    }

    public void setIconEndPaddingResource(@C0209o int i) {
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            aVar.mo22865F(i);
        }
    }

    public void setIconStartPadding(float f) {
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            aVar.mo22972s(f);
        }
    }

    public void setIconStartPaddingResource(@C0209o int i) {
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            aVar.mo22867G(i);
        }
    }

    public void setLayoutDirection(int i) {
        if (this.f16444O != null && VERSION.SDK_INT >= 17) {
            super.setLayoutDirection(i);
        }
    }

    public void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxWidth(@C0199k0 int i) {
        super.setMaxWidth(i);
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            aVar.mo22869H(i);
        }
    }

    public void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    /* access modifiers changed from: 0000 */
    public void setOnCheckedChangeListenerInternal(OnCheckedChangeListener onCheckedChangeListener) {
        this.f16448S = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(OnClickListener onClickListener) {
        this.f16447R = onClickListener;
        m24938q();
    }

    public void setRippleColor(@C0195i0 ColorStateList colorStateList) {
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            aVar.mo22930h(colorStateList);
        }
        if (!this.f16444O.mo22942j0()) {
            m24940s();
        }
    }

    public void setRippleColorResource(@C0202m int i) {
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            aVar.mo22871I(i);
            if (!this.f16444O.mo22942j0()) {
                m24940s();
            }
        }
    }

    public void setShapeAppearanceModel(@C0193h0 C6986o oVar) {
        this.f16444O.setShapeAppearanceModel(oVar);
    }

    public void setShowMotionSpec(@C0195i0 C5594h hVar) {
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            aVar.mo22906b(hVar);
        }
    }

    public void setShowMotionSpecResource(@C0180b int i) {
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            aVar.mo22873J(i);
        }
    }

    public void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(z);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setText(CharSequence charSequence, BufferType bufferType) {
        if (this.f16444O != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            super.setText(this.f16444O.mo22984u0() ? null : charSequence, bufferType);
            C5694a aVar = this.f16444O;
            if (aVar != null) {
                aVar.mo22907b(charSequence);
            }
        }
    }

    public void setTextAppearance(@C0195i0 C6953d dVar) {
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            aVar.mo22900a(dVar);
        }
        m24942u();
    }

    public void setTextAppearanceResource(@C0216r0 int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            aVar.mo22979t(f);
        }
    }

    public void setTextEndPaddingResource(@C0209o int i) {
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            aVar.mo22877L(i);
        }
    }

    public void setTextStartPadding(float f) {
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            aVar.mo22982u(f);
        }
    }

    public void setTextStartPaddingResource(@C0209o int i) {
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            aVar.mo22881N(i);
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5582R.attr.chipStyle);
    }

    /* renamed from: b */
    private void m24927b(@C0195i0 C5694a aVar) {
        if (aVar != null) {
            aVar.mo22899a((C5695a) null);
        }
    }

    @Deprecated
    /* renamed from: c */
    public boolean mo22679c() {
        return mo22680d();
    }

    /* renamed from: d */
    public boolean mo22680d() {
        C5694a aVar = this.f16444O;
        return aVar != null && aVar.mo22954m0();
    }

    @Deprecated
    /* renamed from: e */
    public boolean mo22683e() {
        return mo22684f();
    }

    public void setCloseIconVisible(boolean z) {
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            aVar.mo22945k(z);
        }
        m24938q();
    }

    public Chip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f16457e0 = new Rect();
        this.f16458f0 = new RectF();
        this.f16459g0 = new C5686a();
        m24923a(attributeSet);
        C5694a a = C5694a.m24981a(context, attributeSet, i, C5582R.style.Widget_MaterialComponents_Chip_Action);
        m24922a(context, attributeSet, i);
        setChipDrawable(a);
        a.mo27799b(C0962e0.m5551r(this));
        TypedArray c = C6928p.m33264c(context, attributeSet, C5582R.styleable.Chip, i, C5582R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        if (VERSION.SDK_INT < 23) {
            setTextColor(C6952c.m33332a(context, c, C5582R.styleable.Chip_android_textColor));
        }
        boolean hasValue = c.hasValue(C5582R.styleable.Chip_shapeAppearance);
        c.recycle();
        this.f16456d0 = new C5688c(this);
        m24938q();
        if (!hasValue) {
            m24936o();
        }
        setChecked(this.f16449T);
        setText(a.mo22919f0());
        setEllipsize(a.mo22892Y());
        setIncludeFontPadding(false);
        m24942u();
        if (!this.f16444O.mo22984u0()) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        m24941t();
        if (mo22717j()) {
            setMinHeight(this.f16455c0);
        }
        this.f16454b0 = C0962e0.m5566x(this);
    }

    /* renamed from: a */
    private void m24922a(Context context, @C0195i0 AttributeSet attributeSet, int i) {
        TypedArray c = C6928p.m33264c(context, attributeSet, C5582R.styleable.Chip, i, C5582R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        this.f16453a0 = c.getBoolean(C5582R.styleable.Chip_ensureMinTouchTargetSize, false);
        this.f16455c0 = (int) Math.ceil((double) c.getDimension(C5582R.styleable.Chip_chipMinTouchTargetSize, (float) Math.ceil((double) C6936w.m33292a(getContext(), 48))));
        c.recycle();
    }

    /* renamed from: b */
    public boolean mo22678b() {
        C5694a aVar = this.f16444O;
        return aVar != null && aVar.mo22946k0();
    }

    public void setCheckedIconVisible(boolean z) {
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            aVar.mo22921g(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            aVar.mo22935i(z);
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(@C0195i0 Drawable drawable, @C0195i0 Drawable drawable2, @C0195i0 Drawable drawable3, @C0195i0 Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(@C0195i0 Drawable drawable, @C0195i0 Drawable drawable2, @C0195i0 Drawable drawable3, @C0195i0 Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            aVar.mo22875K(i);
        }
        m24942u();
    }

    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        C5694a aVar = this.f16444O;
        if (aVar != null) {
            aVar.mo22875K(i);
        }
        m24942u();
    }

    /* renamed from: a */
    private void m24923a(@C0195i0 AttributeSet attributeSet) {
        if (attributeSet != null) {
            String str = f16439n0;
            String attributeValue = attributeSet.getAttributeValue(str, "background");
            if (attributeSet.getAttributeValue(str, "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue(str, "drawableStart") == null) {
                String str2 = "Please set end drawable using R.attr#closeIcon.";
                if (attributeSet.getAttributeValue(str, "drawableEnd") != null) {
                    throw new UnsupportedOperationException(str2);
                } else if (attributeSet.getAttributeValue(str, "drawableRight") != null) {
                    throw new UnsupportedOperationException(str2);
                } else if (attributeSet.getAttributeBooleanValue(str, "singleLine", true) && attributeSet.getAttributeIntValue(str, "lines", 1) == 1 && attributeSet.getAttributeIntValue(str, "minLines", 1) == 1 && attributeSet.getAttributeIntValue(str, "maxLines", 1) == 1) {
                    int attributeIntValue = attributeSet.getAttributeIntValue(str, "gravity", 8388627);
                } else {
                    throw new UnsupportedOperationException("Chip does not support multi-line text");
                }
            } else {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            }
        }
    }

    /* renamed from: a */
    private void m24924a(@C0193h0 C5694a aVar) {
        aVar.mo22899a((C5695a) this);
    }

    /* renamed from: a */
    public void mo22676a() {
        mo22677a(this.f16455c0);
        requestLayout();
        if (VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    @SuppressLint({"PrivateApi"})
    /* renamed from: a */
    private boolean m24925a(@C0193h0 MotionEvent motionEvent) {
        Class<C1130a> cls = C1130a.class;
        if (motionEvent.getAction() == 10) {
            try {
                Field declaredField = cls.getDeclaredField("m");
                declaredField.setAccessible(true);
                if (((Integer) declaredField.get(this.f16456d0)).intValue() != Integer.MIN_VALUE) {
                    Method declaredMethod = cls.getDeclaredMethod("j", new Class[]{Integer.TYPE});
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(this.f16456d0, new Object[]{Integer.valueOf(Integer.MIN_VALUE)});
                    return true;
                }
            } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo22677a(@C0211p int i) {
        this.f16455c0 = i;
        int i2 = 0;
        if (!mo22717j()) {
            if (this.f16445P != null) {
                m24937p();
            } else {
                m24939r();
            }
            return false;
        }
        int max = Math.max(0, i - this.f16444O.getIntrinsicHeight());
        int max2 = Math.max(0, i - this.f16444O.getIntrinsicWidth());
        if (max2 > 0 || max > 0) {
            int i3 = max2 > 0 ? max2 / 2 : 0;
            if (max > 0) {
                i2 = max / 2;
            }
            if (this.f16445P != null) {
                Rect rect = new Rect();
                this.f16445P.getPadding(rect);
                if (rect.top == i2 && rect.bottom == i2 && rect.left == i3 && rect.right == i3) {
                    m24939r();
                    return true;
                }
            }
            if (VERSION.SDK_INT >= 16) {
                if (getMinHeight() != i) {
                    setMinHeight(i);
                }
                if (getMinWidth() != i) {
                    setMinWidth(i);
                }
            } else {
                setMinHeight(i);
                setMinWidth(i);
            }
            m24921a(i3, i2, i3, i2);
            m24939r();
            return true;
        }
        if (this.f16445P != null) {
            m24937p();
        } else {
            m24939r();
        }
        return false;
    }

    /* renamed from: a */
    private void m24921a(int i, int i2, int i3, int i4) {
        InsetDrawable insetDrawable = new InsetDrawable(this.f16444O, i, i2, i3, i4);
        this.f16445P = insetDrawable;
    }
}
