package com.skyfishjy.library;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import java.util.ArrayList;
import java.util.Iterator;

public class RippleBackground extends RelativeLayout {

    /* renamed from: c0 */
    private static final int f34741c0 = 6;

    /* renamed from: d0 */
    private static final int f34742d0 = 3000;

    /* renamed from: e0 */
    private static final float f34743e0 = 6.0f;

    /* renamed from: f0 */
    private static final int f34744f0 = 0;

    /* renamed from: N */
    private float f34745N;

    /* renamed from: O */
    private int f34746O;

    /* renamed from: P */
    private int f34747P;

    /* renamed from: Q */
    private int f34748Q;

    /* renamed from: R */
    private float f34749R;

    /* renamed from: S */
    private int f34750S;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public Paint f34751T;

    /* renamed from: U */
    private boolean f34752U = false;

    /* renamed from: V */
    private AnimatorSet f34753V;

    /* renamed from: W */
    private ArrayList<Animator> f34754W;

    /* renamed from: a */
    private int f34755a;

    /* renamed from: a0 */
    private LayoutParams f34756a0;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public float f34757b;

    /* renamed from: b0 */
    private ArrayList<C12054a> f34758b0 = new ArrayList<>();

    /* renamed from: com.skyfishjy.library.RippleBackground$a */
    private class C12054a extends View {
        public C12054a(Context context) {
            super(context);
            setVisibility(4);
        }

        /* access modifiers changed from: protected */
        public void onDraw(Canvas canvas) {
            float min = (float) (Math.min(getWidth(), getHeight()) / 2);
            canvas.drawCircle(min, min, min - RippleBackground.this.f34757b, RippleBackground.this.f34751T);
        }
    }

    public RippleBackground(Context context) {
        super(context);
    }

    /* renamed from: c */
    public void mo41219c() {
        if (mo41217a()) {
            this.f34753V.end();
            this.f34752U = false;
        }
    }

    /* renamed from: a */
    private void m54426a(Context context, AttributeSet attributeSet) {
        if (!isInEditMode()) {
            if (attributeSet != null) {
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C12051R.styleable.RippleBackground);
                this.f34755a = obtainStyledAttributes.getColor(C12051R.styleable.RippleBackground_rb_color, getResources().getColor(C12051R.C12052color.rippelColor));
                this.f34757b = obtainStyledAttributes.getDimension(C12051R.styleable.RippleBackground_rb_strokeWidth, getResources().getDimension(C12051R.dimen.rippleStrokeWidth));
                this.f34745N = obtainStyledAttributes.getDimension(C12051R.styleable.RippleBackground_rb_radius, getResources().getDimension(C12051R.dimen.rippleRadius));
                this.f34746O = obtainStyledAttributes.getInt(C12051R.styleable.RippleBackground_rb_duration, 3000);
                this.f34747P = obtainStyledAttributes.getInt(C12051R.styleable.RippleBackground_rb_rippleAmount, 6);
                this.f34749R = obtainStyledAttributes.getFloat(C12051R.styleable.RippleBackground_rb_scale, f34743e0);
                this.f34750S = obtainStyledAttributes.getInt(C12051R.styleable.RippleBackground_rb_type, 0);
                obtainStyledAttributes.recycle();
                this.f34748Q = this.f34746O / this.f34747P;
                this.f34751T = new Paint();
                this.f34751T.setAntiAlias(true);
                if (this.f34750S == 0) {
                    this.f34757b = 0.0f;
                    this.f34751T.setStyle(Style.FILL);
                } else {
                    this.f34751T.setStyle(Style.STROKE);
                }
                this.f34751T.setColor(this.f34755a);
                float f = this.f34745N;
                float f2 = this.f34757b;
                this.f34756a0 = new LayoutParams((int) ((f + f2) * 2.0f), (int) ((f + f2) * 2.0f));
                this.f34756a0.addRule(13, -1);
                this.f34753V = new AnimatorSet();
                this.f34753V.setDuration((long) this.f34746O);
                this.f34753V.setInterpolator(new AccelerateDecelerateInterpolator());
                this.f34754W = new ArrayList<>();
                for (int i = 0; i < this.f34747P; i++) {
                    C12054a aVar = new C12054a(getContext());
                    addView(aVar, this.f34756a0);
                    this.f34758b0.add(aVar);
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(aVar, "ScaleX", new float[]{1.0f, this.f34749R});
                    ofFloat.setRepeatCount(-1);
                    ofFloat.setRepeatMode(1);
                    ofFloat.setStartDelay((long) (this.f34748Q * i));
                    this.f34754W.add(ofFloat);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(aVar, "ScaleY", new float[]{1.0f, this.f34749R});
                    ofFloat2.setRepeatCount(-1);
                    ofFloat2.setRepeatMode(1);
                    ofFloat2.setStartDelay((long) (this.f34748Q * i));
                    this.f34754W.add(ofFloat2);
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(aVar, "Alpha", new float[]{1.0f, 0.0f});
                    ofFloat3.setRepeatCount(-1);
                    ofFloat3.setRepeatMode(1);
                    ofFloat3.setStartDelay((long) (this.f34748Q * i));
                    this.f34754W.add(ofFloat3);
                }
                this.f34753V.playTogether(this.f34754W);
                return;
            }
            throw new IllegalArgumentException("Attributes should be provided to this view,");
        }
    }

    /* renamed from: b */
    public void mo41218b() {
        if (!mo41217a()) {
            Iterator it = this.f34758b0.iterator();
            while (it.hasNext()) {
                ((C12054a) it.next()).setVisibility(0);
            }
            this.f34753V.start();
            this.f34752U = true;
        }
    }

    public RippleBackground(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m54426a(context, attributeSet);
    }

    public RippleBackground(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m54426a(context, attributeSet);
    }

    /* renamed from: a */
    public boolean mo41217a() {
        return this.f34752U;
    }
}
