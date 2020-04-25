package com.instabug.survey.p400ui;

import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.survey.ui.f */
/* compiled from: SurveysAnimations */
public class C10158f {

    /* renamed from: a */
    private static transient /* synthetic */ boolean[] f27056a;

    /* renamed from: a */
    public static void m47216a(ImageView imageView) {
        boolean[] a = m47217a();
        AnimationSet animationSet = new AnimationSet(true);
        a[1] = true;
        TranslateAnimation translateAnimation = new TranslateAnimation(-30.0f, imageView.getTranslationX(), 0.0f, 0.0f);
        a[2] = true;
        translateAnimation.setDuration(300);
        a[3] = true;
        translateAnimation.setFillAfter(true);
        a[4] = true;
        animationSet.addAnimation(translateAnimation);
        a[5] = true;
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        a[6] = true;
        alphaAnimation.setDuration(200);
        a[7] = true;
        alphaAnimation.setFillAfter(true);
        a[8] = true;
        animationSet.addAnimation(alphaAnimation);
        a[9] = true;
        imageView.startAnimation(animationSet);
        a[10] = true;
        imageView.setVisibility(0);
        a[11] = true;
    }

    /* renamed from: a */
    private static /* synthetic */ boolean[] m47217a() {
        boolean[] zArr = f27056a;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-872502403256030384L, "com/instabug/survey/ui/SurveysAnimations", 23);
        f27056a = a;
        return a;
    }

    /* renamed from: b */
    public static void m47218b(ImageView imageView) {
        boolean[] a = m47217a();
        AnimationSet animationSet = new AnimationSet(true);
        a[12] = true;
        TranslateAnimation translateAnimation = new TranslateAnimation(imageView.getTranslationX(), -30.0f, 0.0f, 0.0f);
        a[13] = true;
        translateAnimation.setDuration(300);
        a[14] = true;
        translateAnimation.setFillAfter(false);
        a[15] = true;
        animationSet.addAnimation(translateAnimation);
        a[16] = true;
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        a[17] = true;
        alphaAnimation.setDuration(200);
        a[18] = true;
        alphaAnimation.setFillAfter(true);
        a[19] = true;
        animationSet.addAnimation(alphaAnimation);
        a[20] = true;
        imageView.startAnimation(animationSet);
        a[21] = true;
        imageView.setVisibility(4);
        a[22] = true;
    }
}
