package com.clevertap.android.sdk;

import android.graphics.Color;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.LinearLayout.LayoutParams;

/* renamed from: com.clevertap.android.sdk.n */
/* compiled from: CTInAppBasePartialNativeFragment */
public abstract class C3138n extends C3128l implements OnTouchListener, OnLongClickListener {

    /* renamed from: S */
    View f11209S;

    /* renamed from: T */
    final GestureDetector f11210T = new GestureDetector(new C3140b());

    /* renamed from: com.clevertap.android.sdk.n$b */
    /* compiled from: CTInAppBasePartialNativeFragment */
    private class C3140b extends SimpleOnGestureListener {

        /* renamed from: a */
        private final int f11212a;

        /* renamed from: b */
        private final int f11213b;

        /* renamed from: com.clevertap.android.sdk.n$b$a */
        /* compiled from: CTInAppBasePartialNativeFragment */
        class C3141a implements AnimationListener {
            C3141a() {
            }

            public void onAnimationEnd(Animation animation) {
                C3138n.this.mo12298b((Bundle) null);
            }

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
            }
        }

        private C3140b() {
            this.f11212a = 120;
            this.f11213b = 200;
        }

        /* renamed from: a */
        private boolean m15066a(MotionEvent motionEvent, MotionEvent motionEvent2, boolean z) {
            TranslateAnimation translateAnimation;
            AnimationSet animationSet = new AnimationSet(true);
            if (z) {
                translateAnimation = new TranslateAnimation(0.0f, (float) C3138n.this.mo12291a(50), 0.0f, 0.0f);
            } else {
                translateAnimation = new TranslateAnimation(0.0f, (float) (-C3138n.this.mo12291a(50)), 0.0f, 0.0f);
            }
            animationSet.addAnimation(translateAnimation);
            animationSet.addAnimation(new AlphaAnimation(1.0f, 0.0f));
            animationSet.setDuration(300);
            animationSet.setFillAfter(true);
            animationSet.setFillEnabled(true);
            animationSet.setAnimationListener(new C3141a());
            C3138n.this.f11209S.startAnimation(animationSet);
            return true;
        }

        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (motionEvent.getX() - motionEvent2.getX() > 120.0f && Math.abs(f) > 200.0f) {
                return m15066a(motionEvent, motionEvent2, false);
            }
            if (motionEvent2.getX() - motionEvent.getX() <= 120.0f || Math.abs(f) <= 200.0f) {
                return false;
            }
            return m15066a(motionEvent, motionEvent2, true);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12402a(Button button, CTInAppNotificationButton cTInAppNotificationButton, CTInAppNotification cTInAppNotification, int i) {
        if (cTInAppNotificationButton != null) {
            button.setTag(Integer.valueOf(i));
            button.setVisibility(0);
            button.setText(cTInAppNotificationButton.mo11979l());
            button.setTextColor(Color.parseColor(cTInAppNotificationButton.mo11980m()));
            button.setBackgroundColor(Color.parseColor(cTInAppNotificationButton.mo11966b()));
            button.setOnClickListener(new C3108a());
            return;
        }
        button.setVisibility(8);
    }

    public boolean onLongClick(View view) {
        return true;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f11210T.onTouchEvent(motionEvent) || motionEvent.getAction() == 2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12401a(Button button, Button button2) {
        button2.setVisibility(8);
        button.setLayoutParams(new LayoutParams(0, -1, 2.0f));
        button2.setLayoutParams(new LayoutParams(0, -1, 0.0f));
    }
}
