package com.mrsool.p423v;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ImageView;

/* renamed from: com.mrsool.v.c */
/* compiled from: GenericTextWatcher */
public class C11719c implements TextWatcher {

    /* renamed from: N */
    private EditText f33925N;

    /* renamed from: O */
    private ImageView f33926O;

    /* renamed from: a */
    private C11737m f33927a;

    /* renamed from: b */
    private EditText f33928b;

    public C11719c(EditText editText, EditText editText2, ImageView imageView, C11737m mVar) {
        this.f33927a = mVar;
        this.f33928b = editText;
        this.f33925N = editText2;
        this.f33926O = imageView;
    }

    public void afterTextChanged(Editable editable) {
        this.f33927a.mo38070a(this.f33928b, this.f33925N, this.f33926O, editable);
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f33927a.mo38071a(this.f33928b, this.f33925N, this.f33926O, charSequence, i, i2, i3);
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f33927a.mo38072b(this.f33928b, this.f33925N, this.f33926O, charSequence, i, i2, i3);
    }
}
