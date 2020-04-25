package p212io.branch.referral;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnKeyListener;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.WindowManager.LayoutParams;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;

/* renamed from: io.branch.referral.a */
/* compiled from: AnimatedDialog */
public class C14113a extends Dialog {

    /* renamed from: a */
    private boolean f41497a;

    /* renamed from: b */
    private final boolean f41498b;

    /* renamed from: io.branch.referral.a$a */
    /* compiled from: AnimatedDialog */
    class C14114a implements OnKeyListener {
        C14114a() {
        }

        public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            if (i == 4) {
                C14113a.this.m61019b();
            }
            return true;
        }
    }

    /* renamed from: io.branch.referral.a$b */
    /* compiled from: AnimatedDialog */
    class C14115b implements AnimationListener {
        C14115b() {
        }

        public void onAnimationEnd(Animation animation) {
            C14113a.this.dismiss();
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    public C14113a(Context context, boolean z) {
        super(context);
        this.f41497a = false;
        this.f41498b = z;
        m61017a(context);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m61019b() {
        if (!this.f41497a) {
            this.f41497a = true;
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
            translateAnimation.setDuration(500);
            translateAnimation.setInterpolator(new DecelerateInterpolator());
            ((ViewGroup) getWindow().getDecorView()).getChildAt(0).startAnimation(translateAnimation);
            translateAnimation.setAnimationListener(new C14115b());
        }
    }

    /* renamed from: c */
    private void m61020c() {
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        translateAnimation.setDuration(500);
        translateAnimation.setInterpolator(new AccelerateInterpolator());
        ((ViewGroup) getWindow().getDecorView()).getChildAt(0).startAnimation(translateAnimation);
        super.show();
    }

    public void cancel() {
        m61019b();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f41498b) {
            LayoutParams attributes = getWindow().getAttributes();
            attributes.width = -1;
            getWindow().setAttributes(attributes);
        }
    }

    public void setContentView(int i) {
        mo44606a();
        super.setContentView(i);
    }

    public void show() {
        m61020c();
    }

    /* renamed from: a */
    private void m61017a(Context context) {
        mo44606a();
        setOnKeyListener(new C14114a());
    }

    /* renamed from: a */
    public void mo44606a() {
        requestWindowFeature(1);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        getWindow().addFlags(2);
        getWindow().addFlags(1024);
        LayoutParams layoutParams = new LayoutParams();
        layoutParams.copyFrom(getWindow().getAttributes());
        layoutParams.width = -1;
        layoutParams.height = -1;
        layoutParams.gravity = 80;
        layoutParams.dimAmount = 0.8f;
        getWindow().setAttributes(layoutParams);
        getWindow().setWindowAnimations(17432578);
        setCanceledOnTouchOutside(true);
    }

    public C14113a(Context context, int i) {
        super(context, i);
        this.f41497a = false;
        this.f41498b = false;
        m61017a(context);
    }
}
