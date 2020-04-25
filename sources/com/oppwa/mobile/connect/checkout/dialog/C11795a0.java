package com.oppwa.mobile.connect.checkout.dialog;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.C0195i0;
import com.google.android.material.textfield.TextInputLayout;
import com.oppwa.mobile.connect.C11771R;
import com.oppwa.mobile.connect.checkout.dialog.C11887q.C11889b;
import com.oppwa.mobile.connect.checkout.meta.CheckoutSettings;
import com.oppwa.mobile.connect.payment.BrandsValidation;
import com.oppwa.mobile.connect.payment.CheckoutInfo;
import com.oppwa.mobile.connect.payment.PaymentParams;
import com.oppwa.mobile.connect.payment.token.Token;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.a0 */
public abstract class C11795a0 extends C11799b implements C11889b {

    /* renamed from: P */
    protected CheckoutSettings f34111P;

    /* renamed from: Q */
    protected CheckoutInfo f34112Q;

    /* renamed from: R */
    protected BrandsValidation f34113R;

    /* renamed from: S */
    protected String f34114S;

    /* renamed from: T */
    protected Token f34115T;

    /* renamed from: U */
    protected String f34116U;

    /* renamed from: V */
    protected TextView f34117V;

    /* renamed from: W */
    protected ImageView f34118W;

    /* renamed from: X */
    protected Button f34119X;

    /* renamed from: Y */
    protected ProgressBar f34120Y;

    /* renamed from: Z */
    protected boolean f34121Z;

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.a0$a */
    class C11796a implements OnClickListener {
        C11796a() {
        }

        public void onClick(View view) {
            C11795a0.this.getActivity().onBackPressed();
        }
    }

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.a0$b */
    class C11797b implements OnClickListener {
        C11797b() {
        }

        public void onClick(View view) {
            PaymentParams d = C11795a0.this.mo40404d();
            C11795a0 a0Var = C11795a0.this;
            if (a0Var.f34130a != null && d != null) {
                C11795a0.this.f34130a.mo40383a(d, a0Var.f34115T != null);
            }
        }
    }

    /* renamed from: a */
    private void m53061a(View view) {
        this.f34119X = (Button) view.findViewById(C11771R.C11775id.payment_button);
        if (!this.f34111P.mo40671J() || this.f34112Q == null) {
            this.f34119X.setText(getString(C11771R.string.checkout_layout_text_pay));
        } else {
            String string = getString(C11771R.string.checkout_layout_text_pay_amount);
            String a = C11868k0.m53354a(this.f34112Q.mo40837a(), this.f34112Q.mo40840c());
            this.f34119X.setText(String.format(string, new Object[]{a}));
        }
        this.f34119X.setOnClickListener(new C11797b());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo40401a(TextInputLayout textInputLayout, TextView textView) {
        textInputLayout.setError(null);
        if (textView.getVisibility() == 4) {
            textView.startAnimation(AnimationUtils.loadAnimation(getContext(), C11771R.anim.opp_helper_in));
            textView.setVisibility(0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo40402a(TextInputLayout textInputLayout, TextView textView, String str) {
        textInputLayout.setError(str);
        textView.setVisibility(4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo40403c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract PaymentParams mo40404d();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo40405d(int i) {
        TextView textView = this.f34117V;
        if (textView == null) {
            mo40410b(i);
        } else {
            textView.setText(i);
        }
    }

    /* renamed from: e */
    public void mo40406e(String str) {
        if (this.f34114S.equals(str)) {
            this.f34118W.setImageBitmap(C11883p.m53431a().mo40531a(str));
            this.f34120Y.setVisibility(8);
        }
    }

    public void onCreate(@C0195i0 Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f34111P = (CheckoutSettings) arguments.getParcelable(CheckoutActivity.f34061b0);
            this.f34112Q = (CheckoutInfo) arguments.getParcelable("com.oppwa.mobile.connect.checkout.dialog.EXTRA_CHECKOUT_INFO");
            this.f34113R = (BrandsValidation) arguments.getParcelable("com.oppwa.mobile.connect.checkout.dialog.EXTRA_BRANDS_VALIDATION");
            this.f34114S = arguments.getString(CheckoutActivity.f34075p0);
            this.f34115T = (Token) arguments.getParcelable("com.oppwa.mobile.connect.checkout.dialog.EXTRA_TOKEN");
            this.f34116U = arguments.getString("com.oppwa.mobile.connect.checkout.dialog.EXTRA_PROVIDER_MODE");
            this.f34121Z = arguments.getBoolean("com.oppwa.mobile.connect.checkout.dialog.EXTRA_SKIP_PAYMENT_METHOD_SELECTION_SCREEN");
        }
    }

    public void onStart() {
        super.onStart();
        C11887q.m53456a((Context) getActivity()).mo40545a((C11889b) this);
    }

    public void onStop() {
        super.onStop();
        C11887q.m53456a((Context) getActivity()).mo40548b((C11889b) this);
        mo40403c();
    }

    public void onViewCreated(View view, @C0195i0 Bundle bundle) {
        super.onViewCreated(view, bundle);
        mo40410b(C11771R.string.checkout_payment_details);
        m53061a(view);
        this.f34120Y = (ProgressBar) view.findViewById(C11771R.C11775id.loading_panel);
        this.f34120Y.setVisibility(0);
        this.f34117V = (TextView) view.findViewById(C11771R.C11775id.payment_info_title);
        this.f34118W = (ImageView) view.findViewById(C11771R.C11775id.logo);
        if (this.f34118W != null) {
            Bitmap a = C11887q.m53456a((Context) getActivity()).mo40544a(this.f34114S);
            if (a != null) {
                this.f34118W.setImageBitmap(a);
                this.f34120Y.setVisibility(8);
            }
        }
        if (!this.f34121Z) {
            this.f34128N.setVisibility(0);
            this.f34128N.setOnClickListener(new C11796a());
        }
    }
}
