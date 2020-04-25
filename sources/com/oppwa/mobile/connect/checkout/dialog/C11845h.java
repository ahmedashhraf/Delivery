package com.oppwa.mobile.connect.checkout.dialog;

import android.annotation.TargetApi;
import android.app.DialogFragment;
import android.app.KeyguardManager;
import android.hardware.fingerprint.FingerprintManager;
import android.hardware.fingerprint.FingerprintManager.AuthenticationCallback;
import android.hardware.fingerprint.FingerprintManager.AuthenticationResult;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.oppwa.mobile.connect.C11771R;

@TargetApi(23)
/* renamed from: com.oppwa.mobile.connect.checkout.dialog.h */
public class C11845h extends DialogFragment {

    /* renamed from: W */
    static String f34235W = "com.oppwa.mobile.connect.checkout.dialog.EXTRA_TITLE";
    /* access modifiers changed from: private */

    /* renamed from: N */
    public TextView f34236N;

    /* renamed from: O */
    private Button f34237O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public KeyguardManager f34238P;

    /* renamed from: Q */
    private FingerprintManager f34239Q;

    /* renamed from: R */
    private CancellationSignal f34240R;

    /* renamed from: S */
    private AuthenticationCallback f34241S = new C11846a();

    /* renamed from: T */
    private Runnable f34242T = new C11847b();
    /* access modifiers changed from: private */

    /* renamed from: U */
    public String f34243U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public boolean f34244V;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C11917x0 f34245a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public ImageView f34246b;

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.h$a */
    class C11846a extends AuthenticationCallback {
        C11846a() {
        }

        public void onAuthenticationError(int i, CharSequence charSequence) {
            super.onAuthenticationError(i, charSequence);
            if (!C11845h.this.f34244V) {
                C11845h.this.m53280a(charSequence);
            }
        }

        public void onAuthenticationFailed() {
            super.onAuthenticationFailed();
            C11845h.this.m53289d();
        }

        public void onAuthenticationHelp(int i, CharSequence charSequence) {
            super.onAuthenticationHelp(i, charSequence);
            C11845h.this.m53285b(charSequence);
        }

        public void onAuthenticationSucceeded(AuthenticationResult authenticationResult) {
            super.onAuthenticationSucceeded(authenticationResult);
            C11845h.this.m53291e();
        }
    }

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.h$b */
    class C11847b implements Runnable {
        C11847b() {
        }

        public void run() {
            if (C11845h.this.isAdded()) {
                C11845h.this.f34246b.setImageResource(C11771R.C11774drawable.ic_fingerprint);
                C11845h.this.f34236N.setText(C11771R.string.checkout_fingerprint_touch_sensor);
                C11845h.this.f34236N.setTextColor(C11845h.this.getResources().getColor(C11771R.C11773color.checkout_text_color_hint, null));
            }
        }
    }

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.h$c */
    class C11848c implements OnClickListener {
        C11848c() {
        }

        public void onClick(View view) {
            if (C11845h.this.f34245a != null) {
                C11845h.this.f34245a.mo40500c();
            }
            C11845h.this.dismiss();
        }
    }

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.h$d */
    class C11849d implements Runnable {
        C11849d() {
        }

        public void run() {
            if (C11845h.this.f34245a != null) {
                C11845h.this.f34245a.mo40502e();
                C11845h.this.dismiss();
            }
        }
    }

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.h$e */
    class C11850e implements OnClickListener {
        C11850e() {
        }

        public void onClick(View view) {
            C11845h.this.getActivity().startActivityForResult(C11845h.this.f34238P.createConfirmDeviceCredentialIntent(C11845h.this.f34243U, C11845h.this.getString(C11771R.string.checkout_auth_confirm_payment)), 700);
            C11845h.this.dismiss();
        }
    }

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.h$f */
    class C11851f implements Runnable {
        C11851f() {
        }

        public void run() {
            if (C11845h.this.f34245a != null) {
                C11845h.this.f34245a.mo40501d();
                C11845h.this.dismiss();
            }
        }
    }

    /* renamed from: a */
    public static C11845h m53277a(String str) {
        Bundle bundle = new Bundle();
        bundle.putString(f34235W, str);
        C11845h hVar = new C11845h();
        hVar.setArguments(bundle);
        return hVar;
    }

    /* renamed from: a */
    private void m53278a() {
        setStyle(1, VERSION.SDK_INT >= 21 ? 16974393 : 16973939);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m53280a(CharSequence charSequence) {
        this.f34246b.setImageResource(C11771R.C11774drawable.opp_ic_fingerprint_error);
        this.f34236N.setText(charSequence);
        this.f34236N.setTextColor(getResources().getColor(C11771R.C11773color.checkout_helper_text_color, null));
        this.f34236N.removeCallbacks(this.f34242T);
        this.f34236N.postDelayed(new C11849d(), 1500);
    }

    /* renamed from: b */
    private void m53282b() {
        if (this.f34239Q != null) {
            this.f34240R = new CancellationSignal();
            if (getActivity().checkSelfPermission("android.permission.USE_FINGERPRINT") == 0) {
                this.f34239Q.authenticate(null, this.f34240R, 0, this.f34241S, null);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m53285b(CharSequence charSequence) {
        this.f34246b.setImageResource(C11771R.C11774drawable.opp_ic_fingerprint_error);
        this.f34236N.setText(charSequence);
        this.f34236N.setTextColor(getResources().getColor(C11771R.C11773color.checkout_helper_text_color, null));
        this.f34236N.removeCallbacks(this.f34242T);
        this.f34236N.postDelayed(this.f34242T, 1500);
    }

    /* renamed from: c */
    private void m53286c() {
        this.f34244V = true;
        this.f34240R.cancel();
        this.f34240R = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m53289d() {
        this.f34246b.setImageResource(C11771R.C11774drawable.opp_ic_fingerprint_error);
        this.f34236N.setText(C11771R.string.checkout_fingerprint_not_recognized);
        this.f34236N.setTextColor(getResources().getColor(C11771R.C11773color.checkout_helper_text_color, null));
        this.f34236N.removeCallbacks(this.f34242T);
        this.f34236N.postDelayed(this.f34242T, 1500);
        if (this.f34237O.getVisibility() == 8) {
            this.f34237O.setVisibility(0);
            this.f34237O.setOnClickListener(new C11850e());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m53291e() {
        this.f34246b.setImageResource(C11771R.C11774drawable.opp_ic_fingerprint_success);
        this.f34236N.setText(C11771R.string.checkout_fingerprint_success);
        this.f34236N.setTextColor(getResources().getColor(C11771R.C11773color.success_color, null));
        this.f34236N.removeCallbacks(this.f34242T);
        this.f34236N.postDelayed(new C11851f(), 1500);
    }

    /* renamed from: a */
    public void mo40475a(C11917x0 x0Var) {
        this.f34245a = x0Var;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        setCancelable(false);
        m53278a();
        this.f34243U = getArguments().getString(f34235W);
        this.f34238P = (KeyguardManager) getActivity().getSystemService("keyguard");
        this.f34239Q = (FingerprintManager) getActivity().getSystemService("fingerprint");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C11771R.layout.opp_dialog_fingerprint_auth, viewGroup, false);
    }

    public void onPause() {
        super.onPause();
        m53286c();
    }

    public void onResume() {
        super.onResume();
        m53282b();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f34246b = (ImageView) view.findViewById(C11771R.C11775id.fingerprint_icon);
        this.f34236N = (TextView) view.findViewById(C11771R.C11775id.fingerprint_status);
        this.f34237O = (Button) view.findViewById(C11771R.C11775id.enter_pin_button);
        ((Button) view.findViewById(C11771R.C11775id.cancel_button)).setOnClickListener(new C11848c());
    }
}
