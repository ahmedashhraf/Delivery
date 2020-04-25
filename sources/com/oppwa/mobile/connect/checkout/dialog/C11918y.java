package com.oppwa.mobile.connect.checkout.dialog;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import com.oppwa.mobile.connect.C11771R;
import com.oppwa.mobile.connect.checkout.meta.CheckoutSettings;
import com.oppwa.mobile.connect.payment.token.Token;

@Deprecated
/* renamed from: com.oppwa.mobile.connect.checkout.dialog.y */
public abstract class C11918y extends Fragment implements OnClickListener {

    /* renamed from: Q */
    public static final String f34384Q = "CHECKOUT_SETTINGS";

    /* renamed from: R */
    public static final String f34385R = "PAYMENT_METHOD";

    /* renamed from: S */
    public static final String f34386S = "TOKEN";

    /* renamed from: N */
    protected Token f34387N;

    /* renamed from: O */
    protected boolean f34388O;

    /* renamed from: P */
    protected Button f34389P;

    /* renamed from: a */
    protected CheckoutSettings f34390a;

    /* renamed from: b */
    protected String f34391b;

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.y$a */
    protected class C11919a implements TextWatcher {

        /* renamed from: a */
        private View f34392a;

        public C11919a(View view) {
            this.f34392a = view;
        }

        public void afterTextChanged(Editable editable) {
            if (this.f34392a != null) {
                if (editable.length() == 0 && this.f34392a.getVisibility() != 4) {
                    this.f34392a.startAnimation(AnimationUtils.loadAnimation(C11918y.this.getActivity(), C11771R.anim.opp_hide_label));
                    this.f34392a.setVisibility(4);
                } else if (editable.length() > 0 && this.f34392a.getVisibility() != 0) {
                    this.f34392a.startAnimation(AnimationUtils.loadAnimation(C11918y.this.getActivity(), C11771R.anim.opp_show_label));
                    this.f34392a.setVisibility(0);
                }
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo40607c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo40608d();

    public void onClick(View view) {
        mo40608d();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f34390a = (CheckoutSettings) arguments.getParcelable(f34384Q);
            this.f34391b = arguments.getString(f34385R);
            String str = f34386S;
            if (arguments.containsKey(str)) {
                this.f34387N = (Token) arguments.getParcelable(str);
            }
        }
    }

    public void onPause() {
        super.onPause();
        this.f34388O = true;
        mo40607c();
    }

    public void onResume() {
        super.onResume();
        this.f34388O = false;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f34389P.setOnClickListener(this);
    }
}
