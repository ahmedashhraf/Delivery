package com.oppwa.mobile.connect.checkout.dialog;

import android.app.Fragment;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import com.google.android.gms.tasks.C5547e;
import com.oppwa.mobile.connect.checkout.meta.CheckoutPaymentMethod;
import com.oppwa.mobile.connect.checkout.meta.CheckoutSettings;
import com.oppwa.mobile.connect.exception.PaymentException;
import com.oppwa.mobile.connect.exception.PaymentProviderNotInitializedException;
import com.oppwa.mobile.connect.payment.PaymentParamsBrand;
import com.oppwa.mobile.connect.provider.C11977a.C11978a;
import com.oppwa.mobile.connect.service.C11991a;
import java.util.Arrays;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.v */
public class C11910v extends Fragment {

    /* renamed from: b */
    public static final String f34372b = "CARD";

    /* renamed from: a */
    private C11879o0 f34373a;

    /* renamed from: a */
    public static void m53548a(Context context, C11978a aVar, Integer[] numArr, C5547e<Boolean> eVar) throws PaymentProviderNotInitializedException {
        C11862j.m53333a(context, aVar, Arrays.asList(numArr), eVar);
    }

    @Deprecated
    /* renamed from: b */
    public static void m53549b(Context context, C11978a aVar, Integer[] numArr, C5547e<Boolean> eVar) throws PaymentProviderNotInitializedException {
        C11862j.m53333a(context, aVar, Arrays.asList(numArr), eVar);
    }

    /* renamed from: a */
    public String mo40578a() {
        return this.f34373a.mo40524f();
    }

    @Deprecated
    /* renamed from: a */
    public void mo40579a(Intent intent) {
    }

    /* renamed from: a */
    public void mo40580a(C11914w wVar) {
        this.f34373a.mo40515a(wVar);
    }

    /* renamed from: a */
    public void mo40581a(CheckoutPaymentMethod checkoutPaymentMethod) {
        mo40585a(checkoutPaymentMethod.mo40646j().mo40908j());
    }

    /* renamed from: a */
    public void mo40582a(CheckoutSettings checkoutSettings) throws PaymentException {
        this.f34373a.mo40516a(checkoutSettings);
    }

    /* renamed from: a */
    public void mo40583a(CheckoutSettings checkoutSettings, ComponentName componentName) throws PaymentException {
        this.f34373a.mo40517a(checkoutSettings, componentName);
    }

    @Deprecated
    /* renamed from: a */
    public void mo40584a(C11991a aVar, CheckoutSettings checkoutSettings) throws PaymentException {
        this.f34373a.mo40518a(aVar, checkoutSettings);
    }

    /* renamed from: a */
    public void mo40585a(String str) {
        this.f34373a.mo40519a(str);
    }

    /* renamed from: b */
    public ImageButton mo40586b() {
        return this.f34373a.mo40525g();
    }

    /* renamed from: c */
    public CheckoutPaymentMethod mo40587c() {
        return CheckoutPaymentMethod.m53648a(PaymentParamsBrand.m53895c(this.f34373a.mo40524f()));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        this.f34373a = new C11879o0((Fragment) this);
        this.f34373a.mo40513a();
        this.f34373a.mo40520b();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f34373a.mo40512a(layoutInflater, viewGroup);
    }

    public void onDetach() {
        super.onDetach();
        this.f34373a.mo40521c();
    }

    public void onStart() {
        super.onStart();
        this.f34373a.mo40522d();
    }

    public void onStop() {
        super.onStop();
        this.f34373a.mo40523e();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f34373a.mo40514a(view);
    }
}
