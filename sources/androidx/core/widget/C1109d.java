package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;

/* renamed from: androidx.core.widget.d */
/* compiled from: ContentLoadingProgressBar */
public class C1109d extends ProgressBar {

    /* renamed from: R */
    private static final int f4910R = 500;

    /* renamed from: S */
    private static final int f4911S = 500;

    /* renamed from: N */
    boolean f4912N;

    /* renamed from: O */
    boolean f4913O;

    /* renamed from: P */
    private final Runnable f4914P;

    /* renamed from: Q */
    private final Runnable f4915Q;

    /* renamed from: a */
    long f4916a;

    /* renamed from: b */
    boolean f4917b;

    /* renamed from: androidx.core.widget.d$a */
    /* compiled from: ContentLoadingProgressBar */
    class C1110a implements Runnable {
        C1110a() {
        }

        public void run() {
            C1109d dVar = C1109d.this;
            dVar.f4917b = false;
            dVar.f4916a = -1;
            dVar.setVisibility(8);
        }
    }

    /* renamed from: androidx.core.widget.d$b */
    /* compiled from: ContentLoadingProgressBar */
    class C1111b implements Runnable {
        C1111b() {
        }

        public void run() {
            C1109d dVar = C1109d.this;
            dVar.f4912N = false;
            if (!dVar.f4913O) {
                dVar.f4916a = System.currentTimeMillis();
                C1109d.this.setVisibility(0);
            }
        }
    }

    public C1109d(@C0193h0 Context context) {
        this(context, null);
    }

    /* renamed from: c */
    private void m6321c() {
        removeCallbacks(this.f4914P);
        removeCallbacks(this.f4915Q);
    }

    /* renamed from: a */
    public synchronized void mo5355a() {
        this.f4913O = true;
        removeCallbacks(this.f4915Q);
        this.f4912N = false;
        long currentTimeMillis = System.currentTimeMillis() - this.f4916a;
        if (currentTimeMillis < 500) {
            if (this.f4916a != -1) {
                if (!this.f4917b) {
                    postDelayed(this.f4914P, 500 - currentTimeMillis);
                    this.f4917b = true;
                }
            }
        }
        setVisibility(8);
    }

    /* renamed from: b */
    public synchronized void mo5356b() {
        this.f4916a = -1;
        this.f4913O = false;
        removeCallbacks(this.f4914P);
        this.f4917b = false;
        if (!this.f4912N) {
            postDelayed(this.f4915Q, 500);
            this.f4912N = true;
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m6321c();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m6321c();
    }

    public C1109d(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f4916a = -1;
        this.f4917b = false;
        this.f4912N = false;
        this.f4913O = false;
        this.f4914P = new C1110a();
        this.f4915Q = new C1111b();
    }
}
