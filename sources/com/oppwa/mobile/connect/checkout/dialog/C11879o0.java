package com.oppwa.mobile.connect.checkout.dialog;

import android.app.Activity;
import android.app.Fragment;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.IBinder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import androidx.annotation.C0195i0;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.mrsool.chat.C10526n.C10527a;
import com.oppwa.mobile.connect.C11771R;
import com.oppwa.mobile.connect.checkout.dialog.C11887q.C11889b;
import com.oppwa.mobile.connect.checkout.meta.CheckoutSecurityPolicyMode;
import com.oppwa.mobile.connect.checkout.meta.CheckoutSettings;
import com.oppwa.mobile.connect.exception.ErrorCode;
import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.exception.PaymentException;
import com.oppwa.mobile.connect.payment.BrandsValidation;
import com.oppwa.mobile.connect.payment.CheckoutInfo;
import com.oppwa.mobile.connect.payment.ImagesRequest;
import com.oppwa.mobile.connect.provider.C11977a.C11978a;
import com.oppwa.mobile.connect.provider.C11980c;
import com.oppwa.mobile.connect.provider.Transaction;
import com.oppwa.mobile.connect.service.C11991a;
import com.oppwa.mobile.connect.service.ConnectService;
import java.util.LinkedHashSet;
import java.util.Set;
import p076c.p112d.p113a.p114a.p127g.C2676a;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.o0 */
class C11879o0 implements C11889b, C11980c {

    /* renamed from: N */
    protected C11991a f34300N;

    /* renamed from: O */
    private Fragment f34301O;

    /* renamed from: P */
    private androidx.fragment.app.Fragment f34302P;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public String f34303Q;

    /* renamed from: R */
    private ComponentName f34304R;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public ImageButton f34305S;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public ProgressBar f34306T;

    /* renamed from: U */
    private View f34307U;

    /* renamed from: V */
    private String f34308V;

    /* renamed from: W */
    private C11914w f34309W = C11914w.STANDALONE;
    /* access modifiers changed from: private */

    /* renamed from: X */
    public CheckoutSettings f34310X;

    /* renamed from: Y */
    private ServiceConnection f34311Y = new C11880a();

    /* renamed from: a */
    protected Activity f34312a;

    /* renamed from: b */
    protected C11863j0 f34313b;

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.o0$a */
    class C11880a implements ServiceConnection {
        C11880a() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C11879o0 o0Var = C11879o0.this;
            o0Var.f34300N = (C11991a) iBinder;
            String[] strArr = {o0Var.f34303Q};
            try {
                if (!C11879o0.this.f34300N.mo41076b()) {
                    C11879o0.this.f34300N.mo41074b(C11879o0.this.f34310X != null ? C11879o0.this.f34310X.mo40735y() : C11978a.LIVE);
                }
                if (C11879o0.this.m53389a(C11879o0.this.f34305S) || !C11887q.m53456a((Context) C11879o0.this.m53407p()).mo40547a() || C11915w0.m53573a((Context) C11879o0.this.m53407p(), C11879o0.this.f34303Q) != null) {
                    C11879o0.this.m53387a(C11887q.m53456a((Context) C11879o0.this.m53407p()).mo40544a(C11879o0.this.f34303Q));
                    return;
                }
                C11879o0.this.f34305S.setClickable(false);
                C11879o0.this.f34300N.mo41069a((C11980c) C11879o0.this);
                C11879o0.this.f34300N.mo41072a(strArr);
            } catch (Exception unused) {
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            C11879o0.this.f34300N = null;
        }
    }

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.o0$b */
    class C11881b implements OnClickListener {
        C11881b() {
        }

        public void onClick(View view) {
            C11879o0.this.f34305S.callOnClick();
        }
    }

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.o0$c */
    class C11882c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Bitmap f34316a;

        C11882c(Bitmap bitmap) {
            this.f34316a = bitmap;
        }

        public void run() {
            C11879o0 o0Var = C11879o0.this;
            if (!o0Var.m53389a(o0Var.f34305S)) {
                if (this.f34316a != null) {
                    C11879o0.this.f34305S.setImageBitmap(this.f34316a);
                } else {
                    return;
                }
            }
            C11879o0.this.f34306T.setVisibility(8);
        }
    }

    C11879o0(Fragment fragment) {
        this.f34301O = fragment;
    }

    C11879o0(androidx.fragment.app.Fragment fragment) {
        this.f34302P = fragment;
    }

    /* renamed from: a */
    private void m53386a(Activity activity) {
        try {
            C2676a.m13028a(activity);
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException e) {
            this.f34308V = e.getMessage();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m53387a(Bitmap bitmap) {
        try {
            m53407p().runOnUiThread(new C11882c(bitmap));
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m53389a(ImageButton imageButton) {
        if (C10527a.f28541b.equals(this.f34303Q) && this.f34309W.equals(C11914w.STANDALONE)) {
            return true;
        }
        Drawable drawable = imageButton.getDrawable();
        boolean z = drawable != null;
        if (z && (drawable instanceof BitmapDrawable)) {
            z = ((BitmapDrawable) drawable).getBitmap() != null;
        }
        return z;
    }

    /* renamed from: b */
    private void m53392b(CheckoutSettings checkoutSettings) throws PaymentException {
        if (checkoutSettings != null) {
            this.f34310X = checkoutSettings;
            m53402k();
            return;
        }
        throw new PaymentException(PaymentError.m53763i());
    }

    /* renamed from: b */
    private void m53393b(@C0195i0 ImagesRequest imagesRequest) {
        C11887q.m53456a((Context) m53407p()).mo40546a(imagesRequest);
        m53387a(C11887q.m53456a((Context) m53407p()).mo40544a(this.f34303Q));
        this.f34300N.mo41075b((C11980c) this);
        this.f34305S.setClickable(true);
    }

    /* renamed from: c */
    private void m53395c(CheckoutSettings checkoutSettings) {
        Set u = checkoutSettings.mo40730u();
        if (u == null || u.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (!this.f34303Q.equals("CARD")) {
                linkedHashSet.add(this.f34303Q);
            }
            checkoutSettings.mo40688a((Set<String>) linkedHashSet);
        }
    }

    /* renamed from: d */
    private void m53397d(CheckoutSettings checkoutSettings) {
        Activity p = m53407p();
        if (p != null) {
            Intent a = checkoutSettings.mo40674a((Context) m53407p(), this.f34304R);
            a.putExtra(CheckoutActivity.f34063d0, this.f34303Q);
            p.startActivityForResult(a, 242);
        }
    }

    /* renamed from: h */
    private void m53399h() {
        this.f34305S.setVisibility(0);
        this.f34307U.setVisibility(8);
        this.f34307U.setOnClickListener(null);
        this.f34305S.setBackgroundResource(C11771R.C11774drawable.opp_btn_background_payment);
    }

    /* renamed from: i */
    private void m53400i() {
        if (this.f34309W.equals(C11914w.STANDALONE)) {
            m53401j();
            return;
        }
        m53399h();
        this.f34305S.setBackground(null);
    }

    /* renamed from: j */
    private void m53401j() {
        this.f34307U.setVisibility(0);
        this.f34305S.setVisibility(8);
        this.f34305S.setBackground(null);
        this.f34307U.setOnClickListener(new C11881b());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0064, code lost:
        if ("KLARNA_INVOICE".equals(r4.f34303Q) != false) goto L_0x0066;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m53402k() throws com.oppwa.mobile.connect.exception.PaymentException {
        /*
            r4 = this;
            android.app.Activity r0 = r4.m53407p()
            com.oppwa.mobile.connect.checkout.meta.CheckoutSettings r1 = r4.f34310X
            java.lang.String r1 = r1.mo40717i()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r4.f34303Q
            r2.append(r3)
            java.lang.String r3 = " Drop-in Button"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.oppwa.mobile.connect.checkout.meta.CheckoutSettings r3 = r4.f34310X
            com.oppwa.mobile.connect.provider.a$a r3 = r3.mo40735y()
            com.oppwa.mobile.connect.p427b.C11778a.m52935b(r0, r1, r2, r3)
            java.lang.String r0 = r4.f34308V
            if (r0 == 0) goto L_0x003f
            android.app.Activity r0 = r4.m53407p()
            com.oppwa.mobile.connect.checkout.meta.CheckoutSettings r1 = r4.f34310X
            java.lang.String r1 = r1.mo40717i()
            java.lang.String r2 = r4.f34308V
            com.oppwa.mobile.connect.checkout.meta.CheckoutSettings r3 = r4.f34310X
            com.oppwa.mobile.connect.provider.a$a r3 = r3.mo40735y()
            com.oppwa.mobile.connect.p427b.C11778a.m52927a(r0, r1, r2, r3)
        L_0x003f:
            java.lang.String r0 = r4.f34303Q
            if (r0 == 0) goto L_0x0074
            java.lang.String r1 = "GOOGLEPAY"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004f
            r4.m53404m()
            goto L_0x0069
        L_0x004f:
            r4.m53403l()
            java.lang.String r0 = r4.f34303Q
            java.lang.String r1 = "KLARNA_INSTALLMENTS"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0066
            java.lang.String r0 = r4.f34303Q
            java.lang.String r1 = "KLARNA_INVOICE"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0069
        L_0x0066:
            r4.m53405n()
        L_0x0069:
            com.oppwa.mobile.connect.checkout.meta.CheckoutSettings r0 = r4.f34310X
            r4.m53395c(r0)
            com.oppwa.mobile.connect.checkout.meta.CheckoutSettings r0 = r4.f34310X
            r4.m53397d(r0)
            return
        L_0x0074:
            com.oppwa.mobile.connect.exception.PaymentException r0 = new com.oppwa.mobile.connect.exception.PaymentException
            com.oppwa.mobile.connect.exception.PaymentError r1 = new com.oppwa.mobile.connect.exception.PaymentError
            com.oppwa.mobile.connect.exception.ErrorCode r2 = com.oppwa.mobile.connect.exception.ErrorCode.ERROR_CODE_PAYMENT_PARAMS_PAYMENT_BRAND_INVALID
            java.lang.String r3 = "The payment brand is null."
            r1.<init>(r2, r3)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.oppwa.mobile.connect.checkout.dialog.C11879o0.m53402k():void");
    }

    /* renamed from: l */
    private void m53403l() throws PaymentException {
        if (this.f34310X.mo40675a(this.f34303Q) == CheckoutSecurityPolicyMode.DEVICE_AUTH_REQUIRED && !this.f34313b.mo40498a()) {
            throw new PaymentException(PaymentError.m53765k());
        }
    }

    /* renamed from: m */
    private void m53404m() throws PaymentException {
        if (!C11825d1.f34192c) {
            throw new PaymentException(new PaymentError(ErrorCode.ERROR_CODE_PAYMENT_METHOD_NOT_AVAILABLE, "The play-services-wallet library is not available."));
        }
    }

    /* renamed from: n */
    private void m53405n() throws PaymentException {
        String o = this.f34310X.mo40723o();
        if (o != null && !C11802b1.m53074a(o)) {
            throw new PaymentException(new PaymentError(ErrorCode.ERROR_CODE_PAYMENT_METHOD_NOT_AVAILABLE, "Klarna country is not supported."));
        }
    }

    /* renamed from: o */
    private void m53406o() {
        Fragment fragment = this.f34301O;
        if (fragment != null) {
            fragment.setRetainInstance(true);
            return;
        }
        androidx.fragment.app.Fragment fragment2 = this.f34302P;
        if (fragment2 != null) {
            fragment2.setRetainInstance(true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public Activity m53407p() {
        Fragment fragment = this.f34301O;
        if (fragment != null) {
            return fragment.getActivity();
        }
        androidx.fragment.app.Fragment fragment2 = this.f34302P;
        if (fragment2 != null) {
            return fragment2.getActivity();
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public View mo40512a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(C11771R.layout.opp_fragment_payment_button, viewGroup);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo40513a() {
        m53406o();
        this.f34313b = new C11863j0(m53407p(), this.f34310X);
        m53386a(m53407p());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo40514a(View view) {
        this.f34306T = (ProgressBar) view.findViewById(C11771R.C11775id.loading_panel);
        this.f34306T.setVisibility(8);
        this.f34305S = (ImageButton) view.findViewById(C11771R.C11775id.payment_button);
        this.f34305S.setBackground(null);
        this.f34307U = view.findViewById(C11771R.C11775id.pay_with_google_layout);
    }

    /* renamed from: a */
    public void mo40515a(C11914w wVar) {
        this.f34309W = wVar;
    }

    /* renamed from: a */
    public void mo40516a(CheckoutSettings checkoutSettings) throws PaymentException {
        m53392b(checkoutSettings);
    }

    /* renamed from: a */
    public void mo40517a(CheckoutSettings checkoutSettings, ComponentName componentName) throws PaymentException {
        this.f34304R = componentName;
        m53392b(checkoutSettings);
    }

    /* renamed from: a */
    public void mo38838a(PaymentError paymentError) {
    }

    /* renamed from: a */
    public void mo38839a(BrandsValidation brandsValidation) {
    }

    /* renamed from: a */
    public void mo38840a(CheckoutInfo checkoutInfo) {
    }

    /* renamed from: a */
    public void mo38841a(ImagesRequest imagesRequest) {
        if (imagesRequest.mo40877a(this.f34303Q)) {
            m53393b(imagesRequest);
        }
    }

    /* renamed from: a */
    public void mo38842a(Transaction transaction) {
    }

    /* renamed from: a */
    public void mo38843a(Transaction transaction, PaymentError paymentError) {
    }

    @Deprecated
    /* renamed from: a */
    public void mo40518a(C11991a aVar, CheckoutSettings checkoutSettings) throws PaymentException {
        if (this.f34300N == null) {
            this.f34300N = aVar;
        }
        m53392b(checkoutSettings);
    }

    /* renamed from: a */
    public void mo40519a(String str) {
        this.f34306T.setVisibility(0);
        boolean equals = "PAYWITHGOOGLE".equals(str);
        String str2 = C10527a.f28541b;
        if (equals) {
            str = str2;
        }
        this.f34303Q = str;
        if (str2.equals(str)) {
            m53400i();
        } else {
            m53399h();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo40520b() {
        this.f34312a = m53407p();
    }

    /* renamed from: b */
    public void mo38844b(PaymentError paymentError) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo40521c() {
        this.f34312a = null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo40522d() {
        Activity activity = this.f34312a;
        if (activity != null) {
            Intent intent = new Intent(activity, ConnectService.class);
            this.f34312a.startService(intent);
            this.f34312a.bindService(intent, this.f34311Y, 1);
            C11887q.m53456a((Context) m53407p()).mo40545a((C11889b) this);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo40523e() {
        if (this.f34312a != null) {
            C11887q.m53456a((Context) m53407p()).mo40548b((C11889b) this);
            Intent intent = new Intent(this.f34312a, ConnectService.class);
            this.f34312a.unbindService(this.f34311Y);
            this.f34312a.stopService(intent);
        }
    }

    /* renamed from: e */
    public void mo40406e(String str) {
        if (this.f34303Q.equals(str)) {
            m53387a(C11883p.m53431a().mo40531a(str));
        }
    }

    /* renamed from: f */
    public String mo40524f() {
        return this.f34303Q;
    }

    /* renamed from: g */
    public ImageButton mo40525g() {
        return this.f34305S;
    }

    /* renamed from: q */
    public void mo38850q() {
        m53393b((ImagesRequest) null);
    }
}
