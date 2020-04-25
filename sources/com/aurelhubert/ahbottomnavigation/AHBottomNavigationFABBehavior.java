package com.aurelhubert.ahbottomnavigation;

import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0712c;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar.SnackbarLayout;

public class AHBottomNavigationFABBehavior extends C0712c<FloatingActionButton> {

    /* renamed from: a */
    private int f10324a = 0;

    /* renamed from: b */
    private long f10325b = 0;

    public AHBottomNavigationFABBehavior(int i) {
        this.f10324a = i;
    }

    /* renamed from: a */
    public boolean mo3999a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
        if (view != null && (view instanceof SnackbarLayout)) {
            return true;
        }
        if (view == null || !(view instanceof AHBottomNavigation)) {
            return super.mo3999a(coordinatorLayout, floatingActionButton, view);
        }
        return true;
    }

    /* renamed from: b */
    public boolean mo4004b(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
        m13899a(floatingActionButton, view);
        return super.mo4004b(coordinatorLayout, floatingActionButton, view);
    }

    /* renamed from: a */
    private void m13899a(FloatingActionButton floatingActionButton, View view) {
        if (floatingActionButton != null && view != null && (view instanceof SnackbarLayout)) {
            this.f10325b = System.currentTimeMillis();
            floatingActionButton.setY(view.getY() - ((float) ((MarginLayoutParams) floatingActionButton.getLayoutParams()).bottomMargin));
        } else if (floatingActionButton != null && view != null && (view instanceof AHBottomNavigation) && System.currentTimeMillis() - this.f10325b >= 30) {
            floatingActionButton.setY(view.getY() - ((float) ((MarginLayoutParams) floatingActionButton.getLayoutParams()).bottomMargin));
        }
    }
}
