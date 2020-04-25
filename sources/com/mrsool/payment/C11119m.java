package com.mrsool.payment;

import android.text.TextUtils;
import java.util.Calendar;

/* renamed from: com.mrsool.payment.m */
/* compiled from: DateValidator */
public class C11119m {

    /* renamed from: b */
    public static final int f30790b = 20;

    /* renamed from: c */
    private static final C11119m f30791c = new C11119m(Calendar.getInstance());

    /* renamed from: a */
    private final Calendar f30792a;

    protected C11119m(Calendar calendar) {
        this.f30792a = calendar;
    }

    /* renamed from: b */
    public static boolean m50478b(String str, String str2) {
        return f30791c.mo38925a(str, str2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo38925a(String str, String str2) {
        int i;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && TextUtils.isDigitsOnly(str) && TextUtils.isDigitsOnly(str2)) {
            int parseInt = Integer.parseInt(str);
            if (parseInt >= 1 && parseInt <= 12) {
                int b = m50477b();
                int length = str2.length();
                if (length == 2) {
                    i = Integer.parseInt(str2);
                } else if (length == 4) {
                    i = Integer.parseInt(str2.substring(2));
                }
                if (i == b && parseInt < m50476a()) {
                    return false;
                }
                if ((i >= b || (i + 100) - b <= 20) && i <= b + 20) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    /* renamed from: b */
    private int m50477b() {
        return this.f30792a.get(1) % 100;
    }

    /* renamed from: a */
    private int m50476a() {
        return this.f30792a.get(2) + 1;
    }
}
