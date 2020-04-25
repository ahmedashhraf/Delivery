package com.oppwa.mobile.connect.checkout.dialog;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import androidx.fragment.app.C1376c;
import androidx.fragment.app.C1406n;
import androidx.fragment.app.Fragment;
import com.oppwa.mobile.connect.C11771R;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.r0 */
class C11896r0 {

    /* renamed from: f */
    private static final int f34347f = C11771R.C11775id.container;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C1376c f34348a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public View f34349b;

    /* renamed from: c */
    private int f34350c;

    /* renamed from: d */
    private int f34351d;

    /* renamed from: e */
    private boolean f34352e = false;

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.r0$a */
    class C11897a implements Runnable {

        /* renamed from: com.oppwa.mobile.connect.checkout.dialog.r0$a$a */
        class C11898a implements Runnable {
            C11898a() {
            }

            public void run() {
                C11896r0.this.f34348a.finish();
            }
        }

        C11897a() {
        }

        public void run() {
            C11896r0 r0Var = C11896r0.this;
            r0Var.m53494a(r0Var.f34349b.getHeight(), 0);
            new Handler().postDelayed(new C11898a(), 500);
        }
    }

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.r0$b */
    class C11899b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ValueAnimator f34355a;

        C11899b(ValueAnimator valueAnimator) {
            this.f34355a = valueAnimator;
        }

        public void run() {
            this.f34355a.start();
        }
    }

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.r0$c */
    class C11900c implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ ValueAnimator f34357a;

        C11900c(ValueAnimator valueAnimator) {
            this.f34357a = valueAnimator;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) this.f34357a.getAnimatedValue()).intValue();
            LayoutParams layoutParams = C11896r0.this.f34349b.getLayoutParams();
            layoutParams.height = intValue;
            C11896r0.this.f34349b.setLayoutParams(layoutParams);
        }
    }

    C11896r0(C1376c cVar) {
        this.f34348a = cVar;
        this.f34349b = cVar.findViewById(f34347f);
        this.f34350c = m53499g();
        double d = (double) this.f34350c;
        Double.isNaN(d);
        this.f34351d = (int) ((d * 60.0d) / 100.0d);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m53494a(int i, int i2) {
        if (this.f34349b.getHeight() != i2) {
            this.f34348a.runOnUiThread(new C11899b(m53497b(i, i2)));
        }
    }

    /* renamed from: a */
    private void m53495a(Fragment fragment, boolean z) {
        C1406n a = this.f34348a.getSupportFragmentManager().mo6224a();
        a.mo6405b(f34347f, fragment);
        a.mo6392a(C11771R.anim.opp_fragment_in, C11771R.anim.opp_fragment_out);
        if (!z) {
            a.mo6401a((String) null);
        }
        a.mo6097e();
    }

    /* renamed from: b */
    private ValueAnimator m53497b(int i, int i2) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
        ofInt.addUpdateListener(new C11900c(ofInt));
        ofInt.setDuration(500);
        return ofInt;
    }

    /* renamed from: g */
    private int m53499g() {
        WindowManager windowManager = (WindowManager) this.f34348a.getSystemService("window");
        if (windowManager == null) {
            return 0;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    /* renamed from: h */
    private Fragment m53500h() {
        return this.f34348a.getSupportFragmentManager().mo6221a(f34347f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo40561a(Fragment fragment, boolean z, boolean z2) {
        m53495a(fragment, z2);
        m53494a(0, z ? this.f34350c : this.f34351d);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo40562a(boolean z) {
        this.f34352e = z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo40563a() {
        return this.f34352e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo40564b(Fragment fragment, boolean z, boolean z2) {
        m53495a(fragment, z2);
        if (z) {
            mo40567d();
        } else {
            mo40568e();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo40565b() {
        return (m53500h() instanceof C11806c0) || (m53500h() instanceof C11907u) || this.f34352e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo40566c() {
        return m53500h() != null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo40567d() {
        m53494a(this.f34349b.getHeight(), this.f34350c);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo40568e() {
        m53494a(this.f34349b.getHeight(), this.f34351d);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo40569f() {
        if (this.f34349b == null) {
            this.f34348a.finish();
        } else {
            this.f34348a.runOnUiThread(new C11897a());
        }
    }
}
