package com.mrsool.p423v;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0712c;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0716g;
import androidx.core.p034l.C0962e0;
import androidx.core.p034l.C1006n0;
import androidx.core.p034l.C1054x;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.AppBarLayout.Behavior;
import com.google.android.material.appbar.AppBarLayout.C5607e;
import com.google.android.material.appbar.C5608a;
import com.google.android.material.appbar.C5608a.C5611c;

@TargetApi(21)
/* renamed from: com.mrsool.v.l */
/* compiled from: StatusBarCompatLollipop */
class C11733l {

    /* renamed from: a */
    private static ValueAnimator f33943a;

    /* renamed from: com.mrsool.v.l$a */
    /* compiled from: StatusBarCompatLollipop */
    static class C11734a implements C1054x {
        C11734a() {
        }

        /* renamed from: a */
        public C1006n0 mo860a(View view, C1006n0 n0Var) {
            return n0Var;
        }
    }

    /* renamed from: com.mrsool.v.l$b */
    /* compiled from: StatusBarCompatLollipop */
    static class C11735b implements C5607e {

        /* renamed from: a */
        final /* synthetic */ C5608a f33944a;

        /* renamed from: b */
        final /* synthetic */ Window f33945b;

        /* renamed from: c */
        final /* synthetic */ int f33946c;

        C11735b(C5608a aVar, Window window, int i) {
            this.f33944a = aVar;
            this.f33945b = window;
            this.f33946c = i;
        }

        /* renamed from: a */
        public void mo22154a(AppBarLayout appBarLayout, int i) {
            if (Math.abs(i) > appBarLayout.getHeight() - this.f33944a.getScrimVisibleHeightTrigger()) {
                if (this.f33945b.getStatusBarColor() != this.f33946c) {
                    C11733l.m52813a(this.f33945b.getStatusBarColor(), this.f33946c, this.f33944a.getScrimAnimationDuration(), this.f33945b);
                }
            } else if (this.f33945b.getStatusBarColor() != 0) {
                C11733l.m52813a(this.f33945b.getStatusBarColor(), 0, this.f33944a.getScrimAnimationDuration(), this.f33945b);
            }
        }
    }

    /* renamed from: com.mrsool.v.l$c */
    /* compiled from: StatusBarCompatLollipop */
    static class C11736c implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ Window f33947a;

        C11736c(Window window) {
            this.f33947a = window;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            Window window = this.f33947a;
            if (window != null) {
                window.setStatusBarColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }
    }

    C11733l() {
    }

    /* renamed from: a */
    private static int m52812a(Context context) {
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelOffset(identifier);
        }
        return 0;
    }

    /* renamed from: a */
    static void m52814a(Activity activity, int i) {
        Window window = activity.getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(i);
        window.getDecorView().setSystemUiVisibility(0);
        View childAt = ((ViewGroup) window.findViewById(16908290)).getChildAt(0);
        if (childAt != null) {
            childAt.setFitsSystemWindows(false);
            C0962e0.m5563v0(childAt);
        }
    }

    /* renamed from: a */
    static void m52816a(Activity activity, boolean z) {
        Window window = activity.getWindow();
        window.addFlags(Integer.MIN_VALUE);
        if (z) {
            window.clearFlags(67108864);
            window.setStatusBarColor(0);
            window.getDecorView().setSystemUiVisibility(1280);
        } else {
            window.addFlags(67108864);
            window.getDecorView().setSystemUiVisibility(0);
        }
        View childAt = ((ViewGroup) window.findViewById(16908290)).getChildAt(0);
        if (childAt != null) {
            childAt.setFitsSystemWindows(false);
            C0962e0.m5563v0(childAt);
        }
    }

    /* renamed from: a */
    static void m52815a(Activity activity, AppBarLayout appBarLayout, C5608a aVar, Toolbar toolbar, int i) {
        Window window = activity.getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
        window.getDecorView().setSystemUiVisibility(0);
        C0962e0.m5448a((View) aVar, (C1054x) new C11734a());
        View childAt = ((ViewGroup) window.findViewById(16908290)).getChildAt(0);
        if (childAt != null) {
            childAt.setFitsSystemWindows(false);
            C0962e0.m5563v0(childAt);
        }
        ((View) appBarLayout.getParent()).setFitsSystemWindows(false);
        appBarLayout.setFitsSystemWindows(false);
        toolbar.setFitsSystemWindows(false);
        if (toolbar.getTag() == null) {
            C5611c cVar = (C5611c) toolbar.getLayoutParams();
            int a = m52812a(activity);
            cVar.height += a;
            toolbar.setLayoutParams(cVar);
            toolbar.setPadding(toolbar.getPaddingLeft(), toolbar.getPaddingTop() + a, toolbar.getPaddingRight(), toolbar.getPaddingBottom());
            toolbar.setTag(Boolean.valueOf(true));
        }
        C0712c d = ((C0716g) appBarLayout.getLayoutParams()).mo4027d();
        if (d == null || !(d instanceof Behavior)) {
            window.setStatusBarColor(0);
        } else if (Math.abs(((Behavior) d).mo22147c()) > appBarLayout.getHeight() - aVar.getScrimVisibleHeightTrigger()) {
            window.setStatusBarColor(i);
        } else {
            window.setStatusBarColor(0);
        }
        aVar.setFitsSystemWindows(false);
        appBarLayout.mo22072a((C5607e) new C11735b(aVar, window, i));
        aVar.getChildAt(0).setFitsSystemWindows(false);
        aVar.setStatusBarScrimColor(i);
    }

    /* renamed from: a */
    static void m52813a(int i, int i2, long j, Window window) {
        ValueAnimator valueAnimator = f33943a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        f33943a = ValueAnimator.ofArgb(new int[]{i, i2}).setDuration(j);
        f33943a.addUpdateListener(new C11736c(window));
        f33943a.start();
    }
}
