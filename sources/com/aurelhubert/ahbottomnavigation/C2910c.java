package com.aurelhubert.ahbottomnavigation;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.C0198k;
import androidx.core.graphics.drawable.C0892a;
import org.jcodec.codecs.common.biari.MQEncoder;

/* renamed from: com.aurelhubert.ahbottomnavigation.c */
/* compiled from: AHHelper */
public class C2910c {

    /* renamed from: com.aurelhubert.ahbottomnavigation.c$a */
    /* compiled from: AHHelper */
    static class C2911a implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ View f10345a;

        C2911a(View view) {
            this.f10345a = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (this.f10345a.getLayoutParams() instanceof MarginLayoutParams) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f10345a.getLayoutParams();
                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, (int) floatValue, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                this.f10345a.requestLayout();
            }
        }
    }

    /* renamed from: com.aurelhubert.ahbottomnavigation.c$b */
    /* compiled from: AHHelper */
    static class C2912b implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ View f10346a;

        C2912b(View view) {
            this.f10346a = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (this.f10346a.getLayoutParams() instanceof MarginLayoutParams) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f10346a.getLayoutParams();
                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, (int) floatValue);
                this.f10346a.requestLayout();
            }
        }
    }

    /* renamed from: com.aurelhubert.ahbottomnavigation.c$c */
    /* compiled from: AHHelper */
    static class C2913c implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ View f10347a;

        C2913c(View view) {
            this.f10347a = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (this.f10347a.getLayoutParams() instanceof MarginLayoutParams) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f10347a.getLayoutParams();
                marginLayoutParams.setMargins((int) floatValue, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                this.f10347a.requestLayout();
            }
        }
    }

    /* renamed from: com.aurelhubert.ahbottomnavigation.c$d */
    /* compiled from: AHHelper */
    static class C2914d implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ TextView f10348a;

        C2914d(TextView textView) {
            this.f10348a = textView;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f10348a.setTextSize(0, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.aurelhubert.ahbottomnavigation.c$e */
    /* compiled from: AHHelper */
    static class C2915e implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ View f10349a;

        C2915e(View view) {
            this.f10349a = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f10349a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.aurelhubert.ahbottomnavigation.c$f */
    /* compiled from: AHHelper */
    static class C2916f implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ TextView f10350a;

        C2916f(TextView textView) {
            this.f10350a = textView;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f10350a.setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* renamed from: com.aurelhubert.ahbottomnavigation.c$g */
    /* compiled from: AHHelper */
    static class C2917g implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ View f10351a;

        C2917g(View view) {
            this.f10351a = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f10351a.setBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* renamed from: com.aurelhubert.ahbottomnavigation.c$h */
    /* compiled from: AHHelper */
    static class C2918h implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ ImageView f10352a;

        /* renamed from: b */
        final /* synthetic */ Drawable f10353b;

        /* renamed from: c */
        final /* synthetic */ boolean f10354c;

        C2918h(ImageView imageView, Drawable drawable, boolean z) {
            this.f10352a = imageView;
            this.f10353b = drawable;
            this.f10354c = z;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f10352a.setImageDrawable(C2910c.m13933a(this.f10353b, ((Integer) valueAnimator.getAnimatedValue()).intValue(), this.f10354c));
            this.f10352a.requestLayout();
        }
    }

    /* renamed from: com.aurelhubert.ahbottomnavigation.c$i */
    /* compiled from: AHHelper */
    static class C2919i implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ View f10355a;

        C2919i(View view) {
            this.f10355a = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            LayoutParams layoutParams = this.f10355a.getLayoutParams();
            layoutParams.width = Math.round(((Float) valueAnimator.getAnimatedValue()).floatValue());
            this.f10355a.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: a */
    public static Drawable m13933a(Drawable drawable, @C0198k int i, boolean z) {
        if (z) {
            drawable.clearColorFilter();
            drawable.setColorFilter(i, Mode.SRC_IN);
            drawable.invalidateSelf();
            return drawable;
        }
        Drawable mutate = C0892a.m5161i(drawable).mutate();
        C0892a.m5154b(mutate, i);
        return mutate;
    }

    /* renamed from: b */
    public static void m13941b(View view, int i, int i2) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{(float) i, (float) i2});
        ofFloat.setDuration(150);
        ofFloat.addUpdateListener(new C2911a(view));
        ofFloat.start();
    }

    /* renamed from: c */
    public static void m13944c(View view, @C0198k int i, @C0198k int i2) {
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
        ofObject.setDuration(150);
        ofObject.addUpdateListener(new C2917g(view));
        ofObject.start();
    }

    /* renamed from: b */
    public static void m13940b(View view, float f, float f2) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, f2});
        ofFloat.setDuration(150);
        ofFloat.addUpdateListener(new C2919i(view));
        ofFloat.start();
    }

    /* renamed from: c */
    public static Activity m13943c(Context context) {
        while (!(context instanceof Activity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return (Activity) context;
    }

    /* renamed from: a */
    public static void m13937a(View view, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{(float) i, (float) i2});
        ofFloat.setDuration((long) i3);
        ofFloat.addUpdateListener(new C2912b(view));
        ofFloat.start();
    }

    /* renamed from: b */
    public static boolean m13942b(Context context) {
        return (m13943c(context).getWindow().getAttributes().flags & MQEncoder.CARRY_MASK) == 134217728;
    }

    /* renamed from: a */
    public static void m13936a(View view, int i, int i2) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{(float) i, (float) i2});
        ofFloat.setDuration(150);
        ofFloat.addUpdateListener(new C2913c(view));
        ofFloat.start();
    }

    /* renamed from: a */
    public static void m13938a(TextView textView, float f, float f2) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, f2});
        ofFloat.setDuration(150);
        ofFloat.addUpdateListener(new C2914d(textView));
        ofFloat.start();
    }

    /* renamed from: a */
    public static void m13935a(View view, float f, float f2) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, f2});
        ofFloat.setDuration(150);
        ofFloat.addUpdateListener(new C2915e(view));
        ofFloat.start();
    }

    /* renamed from: a */
    public static void m13939a(TextView textView, @C0198k int i, @C0198k int i2) {
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
        ofObject.setDuration(150);
        ofObject.addUpdateListener(new C2916f(textView));
        ofObject.start();
    }

    /* renamed from: a */
    public static void m13934a(Context context, Drawable drawable, ImageView imageView, @C0198k int i, @C0198k int i2, boolean z) {
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
        ofObject.setDuration(150);
        ofObject.addUpdateListener(new C2918h(imageView, drawable, z));
        ofObject.start();
    }

    /* renamed from: a */
    public static int m13932a(Context context) {
        if (VERSION.SDK_INT >= 17) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            Window window = m13943c(context).getWindow();
            window.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            int i = displayMetrics.heightPixels;
            window.getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
            int i2 = displayMetrics.heightPixels;
            if (i2 > i) {
                return i2 - i;
            }
        }
        return 0;
    }
}
