package com.mrsool.shop;

import android.app.Dialog;
import android.os.Bundle;
import android.os.Handler;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.app.C0295d;
import com.airbnb.lottie.LottieAnimationView;
import com.mrsool.C10232R;
import com.mrsool.utils.AppSingleton;
import com.mrsool.utils.C5887x;

public class PromotionalOfferActivity extends C0295d implements OnClickListener {

    /* renamed from: N */
    private TextView f31101N;

    /* renamed from: O */
    private Dialog f31102O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public TextView f31103P;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public LottieAnimationView f31104Q;

    /* renamed from: R */
    private LinearLayout f31105R;

    /* renamed from: S */
    private ScrollView f31106S;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public int f31107T;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public int f31108U;

    /* renamed from: V */
    private int f31109V;

    /* renamed from: W */
    private int f31110W;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C5887x f31111a;

    /* renamed from: b */
    private AppSingleton f31112b;

    /* renamed from: com.mrsool.shop.PromotionalOfferActivity$a */
    class C11209a implements Runnable {
        C11209a() {
        }

        public void run() {
            try {
                PromotionalOfferActivity.this.f31107T = PromotionalOfferActivity.this.f31104Q.getHeight();
                PromotionalOfferActivity.this.f31108U = PromotionalOfferActivity.this.f31104Q.getWidth();
                TextView d = PromotionalOfferActivity.this.f31103P;
                double c = (double) PromotionalOfferActivity.this.f31108U;
                Double.isNaN(c);
                int i = (int) (c * 0.16d);
                double a = (double) PromotionalOfferActivity.this.f31107T;
                Double.isNaN(a);
                int i2 = (int) (a * 0.1d);
                double c2 = (double) PromotionalOfferActivity.this.f31108U;
                Double.isNaN(c2);
                d.setPadding(i, i2, (int) (c2 * 0.3d), 0);
                double a2 = (double) PromotionalOfferActivity.this.f31107T;
                Double.isNaN(a2);
                PromotionalOfferActivity.this.f31103P.setLayoutParams(new LayoutParams(-1, (int) (a2 * 0.5d)));
                PromotionalOfferActivity.this.f31111a.mo23559a(true, PromotionalOfferActivity.this.f31103P);
            } catch (Exception unused) {
            }
        }
    }

    private void initViews() {
        this.f31111a = new C5887x(this);
        this.f31112b = (AppSingleton) getApplicationContext();
        this.f31101N = (TextView) findViewById(C10232R.C10236id.tvOk);
        this.f31101N.setOnClickListener(this);
        this.f31103P = (TextView) findViewById(C10232R.C10236id.tvContent);
        this.f31104Q = (LottieAnimationView) findViewById(C10232R.C10236id.laEnvelop);
        this.f31103P.setVisibility(4);
        this.f31103P.setMovementMethod(new ScrollingMovementMethod());
        try {
            new Handler().postDelayed(new C11209a(), 1000);
            this.f31103P.setText(this.f31112b.f16955b.getPromotion().getContent());
        } catch (Exception unused) {
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
        try {
            if (!this.f31111a.mo23504Z().booleanValue()) {
                this.f31111a.mo23614f(this.f31112b.f16955b.getPromotion().getPromotionId());
            }
        } catch (Exception unused) {
        }
        overridePendingTransition(17432576, 17432577);
    }

    public void onClick(View view) {
        if (view.getId() == C10232R.C10236id.tvOk) {
            onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C10232R.layout.activity_promotional_offer2);
        initViews();
    }
}
