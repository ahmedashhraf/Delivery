package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout.C0694a;

/* renamed from: androidx.constraintlayout.widget.c */
/* compiled from: Constraints */
public class C0702c extends ViewGroup {

    /* renamed from: b */
    public static final String f3296b = "Constraints";

    /* renamed from: a */
    C0699b f3297a;

    /* renamed from: androidx.constraintlayout.widget.c$a */
    /* compiled from: Constraints */
    public static class C0703a extends C0694a {

        /* renamed from: F0 */
        public float f3298F0;

        /* renamed from: G0 */
        public boolean f3299G0;

        /* renamed from: H0 */
        public float f3300H0;

        /* renamed from: I0 */
        public float f3301I0;

        /* renamed from: J0 */
        public float f3302J0;

        /* renamed from: K0 */
        public float f3303K0;

        /* renamed from: L0 */
        public float f3304L0;

        /* renamed from: M0 */
        public float f3305M0;

        /* renamed from: N0 */
        public float f3306N0;

        /* renamed from: O0 */
        public float f3307O0;

        /* renamed from: P0 */
        public float f3308P0;

        /* renamed from: Q0 */
        public float f3309Q0;

        /* renamed from: R0 */
        public float f3310R0;

        public C0703a(int i, int i2) {
            super(i, i2);
            this.f3298F0 = 1.0f;
            this.f3299G0 = false;
            this.f3300H0 = 0.0f;
            this.f3301I0 = 0.0f;
            this.f3302J0 = 0.0f;
            this.f3303K0 = 0.0f;
            this.f3304L0 = 1.0f;
            this.f3305M0 = 1.0f;
            this.f3306N0 = 0.0f;
            this.f3307O0 = 0.0f;
            this.f3308P0 = 0.0f;
            this.f3309Q0 = 0.0f;
            this.f3310R0 = 0.0f;
        }

        public C0703a(C0703a aVar) {
            super((C0694a) aVar);
            this.f3298F0 = 1.0f;
            this.f3299G0 = false;
            this.f3300H0 = 0.0f;
            this.f3301I0 = 0.0f;
            this.f3302J0 = 0.0f;
            this.f3303K0 = 0.0f;
            this.f3304L0 = 1.0f;
            this.f3305M0 = 1.0f;
            this.f3306N0 = 0.0f;
            this.f3307O0 = 0.0f;
            this.f3308P0 = 0.0f;
            this.f3309Q0 = 0.0f;
            this.f3310R0 = 0.0f;
        }

        public C0703a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3298F0 = 1.0f;
            this.f3299G0 = false;
            this.f3300H0 = 0.0f;
            this.f3301I0 = 0.0f;
            this.f3302J0 = 0.0f;
            this.f3303K0 = 0.0f;
            this.f3304L0 = 1.0f;
            this.f3305M0 = 1.0f;
            this.f3306N0 = 0.0f;
            this.f3307O0 = 0.0f;
            this.f3308P0 = 0.0f;
            this.f3309Q0 = 0.0f;
            this.f3310R0 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0696R.styleable.ConstraintSet);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0696R.styleable.ConstraintSet_android_alpha) {
                    this.f3298F0 = obtainStyledAttributes.getFloat(index, this.f3298F0);
                } else if (index == C0696R.styleable.ConstraintSet_android_elevation) {
                    this.f3300H0 = obtainStyledAttributes.getFloat(index, this.f3300H0);
                    this.f3299G0 = true;
                } else if (index == C0696R.styleable.ConstraintSet_android_rotationX) {
                    this.f3302J0 = obtainStyledAttributes.getFloat(index, this.f3302J0);
                } else if (index == C0696R.styleable.ConstraintSet_android_rotationY) {
                    this.f3303K0 = obtainStyledAttributes.getFloat(index, this.f3303K0);
                } else if (index == C0696R.styleable.ConstraintSet_android_rotation) {
                    this.f3301I0 = obtainStyledAttributes.getFloat(index, this.f3301I0);
                } else if (index == C0696R.styleable.ConstraintSet_android_scaleX) {
                    this.f3304L0 = obtainStyledAttributes.getFloat(index, this.f3304L0);
                } else if (index == C0696R.styleable.ConstraintSet_android_scaleY) {
                    this.f3305M0 = obtainStyledAttributes.getFloat(index, this.f3305M0);
                } else if (index == C0696R.styleable.ConstraintSet_android_transformPivotX) {
                    this.f3306N0 = obtainStyledAttributes.getFloat(index, this.f3306N0);
                } else if (index == C0696R.styleable.ConstraintSet_android_transformPivotY) {
                    this.f3307O0 = obtainStyledAttributes.getFloat(index, this.f3307O0);
                } else if (index == C0696R.styleable.ConstraintSet_android_translationX) {
                    this.f3308P0 = obtainStyledAttributes.getFloat(index, this.f3308P0);
                } else if (index == C0696R.styleable.ConstraintSet_android_translationY) {
                    this.f3309Q0 = obtainStyledAttributes.getFloat(index, this.f3309Q0);
                } else if (index == C0696R.styleable.ConstraintSet_android_translationZ) {
                    this.f3308P0 = obtainStyledAttributes.getFloat(index, this.f3310R0);
                }
            }
        }
    }

    public C0702c(Context context) {
        super(context);
        super.setVisibility(8);
    }

    /* renamed from: a */
    private void m4096a(AttributeSet attributeSet) {
    }

    public C0699b getConstraintSet() {
        if (this.f3297a == null) {
            this.f3297a = new C0699b();
        }
        this.f3297a.mo3861a(this);
        return this.f3297a;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    /* access modifiers changed from: protected */
    public C0703a generateDefaultLayoutParams() {
        return new C0703a(-2, -2);
    }

    public C0703a generateLayoutParams(AttributeSet attributeSet) {
        return new C0703a(getContext(), attributeSet);
    }

    public C0702c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m4096a(attributeSet);
        super.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return new C0694a(layoutParams);
    }

    public C0702c(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m4096a(attributeSet);
        super.setVisibility(8);
    }
}
