package com.oppwa.mobile.connect.checkout.dialog;

import android.text.InputFilter;
import android.text.Spanned;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.m0 */
class C11873m0 implements InputFilter {

    /* renamed from: a */
    private boolean f34293a;

    C11873m0(boolean z) {
        this.f34293a = z;
    }

    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        while (i < i2) {
            char charAt = charSequence.charAt(i);
            String str = "";
            if (!this.f34293a && charAt == ' ') {
                return str;
            }
            if (charAt != ' ' && !Character.isLetterOrDigit(charAt)) {
                return str;
            }
            i++;
        }
        return null;
    }
}
