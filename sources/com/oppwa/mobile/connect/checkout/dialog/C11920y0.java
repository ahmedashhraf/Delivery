package com.oppwa.mobile.connect.checkout.dialog;

import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.y0 */
abstract class C11920y0 implements TextWatcher {

    /* renamed from: N */
    private int f34394N;

    /* renamed from: a */
    boolean f34395a = false;

    /* renamed from: b */
    private InputFilter[] f34396b = new InputFilter[0];

    C11920y0() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Editable mo40458a(Editable editable);

    public void afterTextChanged(Editable editable) {
        if (this.f34395a) {
            this.f34395a = false;
            this.f34394N = editable.length();
        } else if (editable.length() - this.f34394N == -1) {
            this.f34394N = editable.length();
            mo40462b(editable);
        } else {
            this.f34394N = editable.length();
            InputFilter[] filters = editable.getFilters();
            editable.setFilters(this.f34396b);
            mo40458a(editable).setFilters(filters);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo40462b(Editable editable);

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
