package com.mrsool.p423v;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout.LayoutParams;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0712c;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0716g;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.AppBarLayout.Behavior;
import com.google.android.material.appbar.AppBarLayout.C5607e;
import com.google.android.material.appbar.C5608a;
import com.google.android.material.appbar.C5608a.C5611c;

@TargetApi(19)
/* renamed from: com.mrsool.v.k */
/* compiled from: StatusBarCompatKitKat */
class C11731k {

    /* renamed from: a */
    private static final String f33939a = "statusBarView";

    /* renamed from: b */
    private static final String f33940b = "marginAdded";

    /* renamed from: com.mrsool.v.k$a */
    /* compiled from: StatusBarCompatKitKat */
    static class C11732a implements C5607e {

        /* renamed from: a */
        final /* synthetic */ C5608a f33941a;

        /* renamed from: b */
        final /* synthetic */ View f33942b;

        C11732a(C5608a aVar, View view) {
            this.f33941a = aVar;
            this.f33942b = view;
        }

        /* renamed from: a */
        public void mo22154a(AppBarLayout appBarLayout, int i) {
            if (Math.abs(i) > appBarLayout.getHeight() - this.f33941a.getScrimVisibleHeightTrigger()) {
                if (this.f33942b.getAlpha() == 0.0f) {
                    this.f33942b.animate().cancel();
                    this.f33942b.animate().alpha(1.0f).setDuration(this.f33941a.getScrimAnimationDuration()).start();
                }
            } else if (this.f33942b.getAlpha() == 1.0f) {
                this.f33942b.animate().cancel();
                this.f33942b.animate().alpha(0.0f).setDuration(this.f33941a.getScrimAnimationDuration()).start();
            }
        }
    }

    C11731k() {
    }

    /* renamed from: a */
    private static int m52803a(Context context) {
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelOffset(identifier);
        }
        return 0;
    }

    /* renamed from: b */
    private static void m52810b(View view, int i) {
        if (view != null) {
            if (f33940b.equals(view.getTag())) {
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                layoutParams.topMargin -= i;
                view.setLayoutParams(layoutParams);
                view.setTag(null);
            }
        }
    }

    /* renamed from: a */
    private static View m52804a(Activity activity, int i, int i2) {
        ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
        View view = new View(activity);
        LayoutParams layoutParams = new LayoutParams(-1, i2);
        layoutParams.gravity = 48;
        view.setLayoutParams(layoutParams);
        view.setBackgroundColor(i);
        view.setTag(f33939a);
        viewGroup.addView(view);
        return view;
    }

    /* renamed from: b */
    static void m52809b(Activity activity) {
        activity.getWindow().addFlags(67108864);
        View childAt = ((ViewGroup) activity.findViewById(16908290)).getChildAt(0);
        m52805a(activity);
        m52810b(childAt, m52803a((Context) activity));
        if (childAt != null) {
            childAt.setFitsSystemWindows(false);
        }
    }

    /* renamed from: a */
    private static void m52805a(Activity activity) {
        ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
        View findViewWithTag = viewGroup.findViewWithTag(f33939a);
        if (findViewWithTag != null) {
            viewGroup.removeView(findViewWithTag);
        }
    }

    /* renamed from: a */
    private static void m52808a(View view, int i) {
        if (view != null) {
            Object tag = view.getTag();
            String str = f33940b;
            if (!str.equals(tag)) {
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                layoutParams.topMargin += i;
                view.setLayoutParams(layoutParams);
                view.setTag(str);
            }
        }
    }

    /* renamed from: a */
    static void m52806a(Activity activity, int i) {
        Window window = activity.getWindow();
        window.addFlags(67108864);
        View childAt = ((ViewGroup) window.findViewById(16908290)).getChildAt(0);
        int a = m52803a((Context) activity);
        m52805a(activity);
        m52804a(activity, i, a);
        m52808a(childAt, a);
        if (childAt != null) {
            childAt.setFitsSystemWindows(false);
        }
    }

    /* renamed from: a */
    static void m52807a(Activity activity, AppBarLayout appBarLayout, C5608a aVar, Toolbar toolbar, int i) {
        Window window = activity.getWindow();
        window.addFlags(67108864);
        View childAt = ((ViewGroup) window.findViewById(16908290)).getChildAt(0);
        childAt.setFitsSystemWindows(false);
        ((View) appBarLayout.getParent()).setFitsSystemWindows(false);
        appBarLayout.setFitsSystemWindows(false);
        aVar.setFitsSystemWindows(false);
        aVar.getChildAt(0).setFitsSystemWindows(false);
        toolbar.setFitsSystemWindows(false);
        if (toolbar.getTag() == null) {
            C5611c cVar = (C5611c) toolbar.getLayoutParams();
            int a = m52803a((Context) activity);
            cVar.height += a;
            toolbar.setLayoutParams(cVar);
            toolbar.setPadding(toolbar.getPaddingLeft(), toolbar.getPaddingTop() + a, toolbar.getPaddingRight(), toolbar.getPaddingBottom());
            toolbar.setTag(Boolean.valueOf(true));
        }
        int a2 = m52803a((Context) activity);
        m52805a(activity);
        m52810b(childAt, a2);
        View a3 = m52804a(activity, i, a2);
        C0712c d = ((C0716g) appBarLayout.getLayoutParams()).mo4027d();
        if (d == null || !(d instanceof Behavior)) {
            a3.setAlpha(0.0f);
        } else if (Math.abs(((Behavior) d).mo22147c()) > appBarLayout.getHeight() - aVar.getScrimVisibleHeightTrigger()) {
            a3.setAlpha(1.0f);
        } else {
            a3.setAlpha(0.0f);
        }
        appBarLayout.mo22072a((C5607e) new C11732a(aVar, a3));
    }
}
