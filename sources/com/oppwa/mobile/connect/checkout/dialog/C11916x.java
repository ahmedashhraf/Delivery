package com.oppwa.mobile.connect.checkout.dialog;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.fragment.app.Fragment;
import com.google.android.gms.tasks.C5547e;
import com.oppwa.mobile.connect.checkout.meta.CheckoutSettings;
import com.oppwa.mobile.connect.exception.PaymentException;
import com.oppwa.mobile.connect.exception.PaymentProviderNotInitializedException;
import com.oppwa.mobile.connect.provider.C11977a.C11978a;
import com.oppwa.mobile.connect.service.C11991a;
import java.util.Arrays;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.x */
public class C11916x extends Fragment {

    /* renamed from: b */
    public static final String f34382b = "CARD";

    /* renamed from: a */
    private C11879o0 f34383a;

    /* renamed from: a */
    public static void m53579a(Context context, C11978a aVar, Integer[] numArr, C5547e<Boolean> eVar) throws PaymentProviderNotInitializedException {
        C11862j.m53333a(context, aVar, Arrays.asList(numArr), eVar);
    }

    @Deprecated
    /* renamed from: b */
    public static void m53580b(Context context, C11978a aVar, Integer[] numArr, C5547e<Boolean> eVar) throws PaymentProviderNotInitializedException {
        C11862j.m53333a(context, aVar, Arrays.asList(numArr), eVar);
    }

    @Deprecated
    /* renamed from: a */
    public void mo40599a(Intent intent) {
    }

    /* renamed from: a */
    public void mo40600a(C11914w wVar) {
        this.f34383a.mo40515a(wVar);
    }

    /* renamed from: a */
    public void mo40601a(CheckoutSettings checkoutSettings) throws PaymentException {
        this.f34383a.mo40516a(checkoutSettings);
    }

    /* renamed from: a */
    public void mo40602a(CheckoutSettings checkoutSettings, ComponentName componentName) throws PaymentException {
        this.f34383a.mo40517a(checkoutSettings, componentName);
    }

    @Deprecated
    /* renamed from: a */
    public void mo40603a(C11991a aVar, CheckoutSettings checkoutSettings) throws PaymentException {
        this.f34383a.mo40518a(aVar, checkoutSettings);
    }

    /* renamed from: g */
    public void mo40604g(String str) {
        this.f34383a.mo40519a(str);
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        this.f34383a = new C11879o0((Fragment) this);
        this.f34383a.mo40513a();
        this.f34383a.mo40520b();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f34383a.mo40512a(layoutInflater, viewGroup);
    }

    public void onDetach() {
        super.onDetach();
        this.f34383a.mo40521c();
    }

    public void onStart() {
        super.onStart();
        this.f34383a.mo40522d();
    }

    public void onStop() {
        super.onStop();
        this.f34383a.mo40523e();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f34383a.mo40514a(view);
    }

    /* renamed from: w */
    public String mo40605w() {
        return this.f34383a.mo40524f();
    }

    /* renamed from: x */
    public ImageButton mo40606x() {
        return this.f34383a.mo40525g();
    }
}
