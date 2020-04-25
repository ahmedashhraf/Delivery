package androidx.browser.browseractions;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.MotionEvent;
import android.view.View;
import p053b.p065e.p066b.p067a.C2118c;

/* renamed from: androidx.browser.browseractions.c */
/* compiled from: BrowserActionsFallbackMenuDialog */
class C0611c extends Dialog {

    /* renamed from: N */
    private static final long f2410N = 150;

    /* renamed from: b */
    private static final long f2411b = 250;

    /* renamed from: a */
    private final View f2412a;

    /* renamed from: androidx.browser.browseractions.c$a */
    /* compiled from: BrowserActionsFallbackMenuDialog */
    class C0612a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f2413a;

        C0612a(boolean z) {
            this.f2413a = z;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f2413a) {
                C0611c.super.dismiss();
            }
        }
    }

    C0611c(Context context, View view) {
        super(context);
        this.f2412a = view;
    }

    public void dismiss() {
        m3243a(false);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        dismiss();
        return true;
    }

    public void show() {
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        m3243a(true);
        super.show();
    }

    /* renamed from: a */
    private void m3243a(boolean z) {
        float f = 0.0f;
        float f2 = z ? 0.0f : 1.0f;
        if (z) {
            f = 1.0f;
        }
        long j = z ? f2411b : 150;
        this.f2412a.setScaleX(f2);
        this.f2412a.setScaleY(f2);
        this.f2412a.animate().scaleX(f).scaleY(f).setDuration(j).setInterpolator(new C2118c()).setListener(new C0612a(z)).start();
    }
}
