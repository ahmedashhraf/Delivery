package com.mrsool.utils;

import android.text.InputFilter;
import android.text.Spanned;

/* renamed from: com.mrsool.utils.k */
/* compiled from: DecimalDigitsInputFilter1 */
public class C11647k implements InputFilter {

    /* renamed from: a */
    private final int f33480a;

    public C11647k(int i) {
        this.f33480a = i;
    }

    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        int length = spanned.length();
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                i5 = -1;
                break;
            }
            char charAt = spanned.charAt(i5);
            if (charAt == '.' || charAt == ',') {
                break;
            }
            i5++;
        }
        if (i5 >= 0) {
            String str = "";
            if (charSequence.equals(".") || charSequence.equals(",") || (i4 > i5 && length - i5 > this.f33480a)) {
                return str;
            }
        }
        return null;
    }
}
