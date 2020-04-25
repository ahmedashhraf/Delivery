package com.mrsool.utils;

import android.text.InputFilter;
import android.text.Spanned;

/* renamed from: com.mrsool.utils.o */
/* compiled from: InputFilterMinMax */
public class C11651o implements InputFilter {

    /* renamed from: a */
    private int f33484a;

    /* renamed from: b */
    private int f33485b;

    public C11651o(int i, int i2) {
        this.f33484a = i;
        this.f33485b = i2;
    }

    /* renamed from: a */
    private boolean m52501a(int i, int i2, int i3) {
        if (i2 > i) {
            if (i3 >= i && i3 <= i2) {
                return true;
            }
        } else if (i3 >= i2 && i3 <= i) {
            return true;
        }
        return false;
    }

    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(spanned.toString());
            sb.append(charSequence.toString());
            if (m52501a(this.f33484a, this.f33485b, Integer.parseInt(sb.toString()))) {
                return null;
            }
        } catch (NumberFormatException unused) {
        }
        return "";
    }

    public C11651o(String str, String str2) {
        this.f33484a = Integer.parseInt(str);
        this.f33485b = Integer.parseInt(str2);
    }
}
