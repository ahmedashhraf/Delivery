package androidx.core.p034l;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import androidx.annotation.C0193h0;

/* renamed from: androidx.core.l.y */
/* compiled from: OneShotPreDrawListener */
public final class C1055y implements OnPreDrawListener, OnAttachStateChangeListener {

    /* renamed from: N */
    private final Runnable f4697N;

    /* renamed from: a */
    private final View f4698a;

    /* renamed from: b */
    private ViewTreeObserver f4699b;

    private C1055y(View view, Runnable runnable) {
        this.f4698a = view;
        this.f4699b = view.getViewTreeObserver();
        this.f4697N = runnable;
    }

    @C0193h0
    /* renamed from: a */
    public static C1055y m6136a(@C0193h0 View view, @C0193h0 Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        } else if (runnable != null) {
            C1055y yVar = new C1055y(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(yVar);
            view.addOnAttachStateChangeListener(yVar);
            return yVar;
        } else {
            throw new NullPointerException("runnable == null");
        }
    }

    public boolean onPreDraw() {
        mo5194a();
        this.f4697N.run();
        return true;
    }

    public void onViewAttachedToWindow(View view) {
        this.f4699b = view.getViewTreeObserver();
    }

    public void onViewDetachedFromWindow(View view) {
        mo5194a();
    }

    /* renamed from: a */
    public void mo5194a() {
        if (this.f4699b.isAlive()) {
            this.f4699b.removeOnPreDrawListener(this);
        } else {
            this.f4698a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f4698a.removeOnAttachStateChangeListener(this);
    }
}
