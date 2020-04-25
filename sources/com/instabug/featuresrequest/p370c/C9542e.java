package com.instabug.featuresrequest.p370c;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.featuresrequest.c.e */
/* compiled from: FormatterUtils */
public class C9542e {

    /* renamed from: a */
    private static transient /* synthetic */ boolean[] f25237a;

    /* renamed from: a */
    public static String m44639a(String str) {
        boolean[] a = m44640a();
        DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getInstance(Locale.getDefault());
        a[1] = true;
        DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
        a[2] = true;
        decimalFormatSymbols.setGroupingSeparator(',');
        a[3] = true;
        decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
        a[4] = true;
        String format = decimalFormat.format((long) Integer.parseInt(str));
        a[5] = true;
        return format;
    }

    /* renamed from: a */
    private static /* synthetic */ boolean[] m44640a() {
        boolean[] zArr = f25237a;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-9176681749430743553L, "com/instabug/featuresrequest/utils/FormatterUtils", 6);
        f25237a = a;
        return a;
    }
}
