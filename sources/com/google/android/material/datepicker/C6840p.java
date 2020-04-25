package com.google.android.material.datepicker;

import android.annotation.TargetApi;
import android.content.res.Resources;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import com.bogdwellers.pinchtozoom.C2945d;
import com.fasterxml.jackson.core.p162w.C3868i;
import com.google.android.material.C5582R;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: com.google.android.material.datepicker.p */
/* compiled from: UtcDates */
class C6840p {

    /* renamed from: a */
    static final String f19049a = "UTC";

    private C6840p() {
    }

    /* renamed from: a */
    static Calendar m32686a(Calendar calendar) {
        Calendar b = m32691b(calendar);
        Calendar h = m32703h();
        h.set(b.get(1), b.get(2), b.get(5));
        return h;
    }

    /* renamed from: b */
    static Calendar m32691b(@C0195i0 Calendar calendar) {
        Calendar instance = Calendar.getInstance(m32697e());
        if (calendar == null) {
            instance.clear();
        } else {
            instance.setTimeInMillis(calendar.getTimeInMillis());
        }
        return instance;
    }

    /* renamed from: c */
    static DateFormat m32692c() {
        return m32696e(Locale.getDefault());
    }

    /* renamed from: d */
    static SimpleDateFormat m32695d() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(((SimpleDateFormat) DateFormat.getDateInstance(3, Locale.getDefault())).toLocalizedPattern().replaceAll("\\s+", ""), Locale.getDefault());
        simpleDateFormat.setTimeZone(m32697e());
        simpleDateFormat.setLenient(false);
        return simpleDateFormat;
    }

    /* renamed from: e */
    private static TimeZone m32697e() {
        return TimeZone.getTimeZone(f19049a);
    }

    /* renamed from: f */
    static Calendar m32699f() {
        return m32686a(Calendar.getInstance());
    }

    @TargetApi(24)
    /* renamed from: g */
    private static android.icu.util.TimeZone m32701g() {
        return android.icu.util.TimeZone.getTimeZone(f19049a);
    }

    /* renamed from: h */
    static Calendar m32703h() {
        return m32691b((Calendar) null);
    }

    /* renamed from: i */
    static SimpleDateFormat m32704i() {
        return m32702h(Locale.getDefault());
    }

    /* renamed from: c */
    static DateFormat m32693c(Locale locale) {
        return m32684a(0, locale);
    }

    /* renamed from: e */
    static DateFormat m32696e(Locale locale) {
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) m32694d(locale);
        simpleDateFormat.applyPattern(m32688b(simpleDateFormat.toPattern()));
        return simpleDateFormat;
    }

    @TargetApi(24)
    /* renamed from: f */
    static android.icu.text.DateFormat m32698f(Locale locale) {
        return m32680a("yMMMd", locale);
    }

    @TargetApi(24)
    /* renamed from: g */
    static android.icu.text.DateFormat m32700g(Locale locale) {
        return m32680a("yMMMEd", locale);
    }

    /* renamed from: h */
    private static SimpleDateFormat m32702h(Locale locale) {
        return m32690b("MMMM, yyyy", locale);
    }

    /* renamed from: b */
    private static SimpleDateFormat m32690b(String str, Locale locale) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(m32697e());
        return simpleDateFormat;
    }

    @TargetApi(24)
    /* renamed from: b */
    static android.icu.text.DateFormat m32687b(Locale locale) {
        return m32680a("MMMEd", locale);
    }

    /* renamed from: a */
    static long m32679a(long j) {
        Calendar h = m32703h();
        h.setTimeInMillis(j);
        return m32686a(h).getTimeInMillis();
    }

    /* renamed from: b */
    static DateFormat m32689b() {
        return m32694d(Locale.getDefault());
    }

    /* renamed from: d */
    static DateFormat m32694d(Locale locale) {
        return m32684a(2, locale);
    }

    @C0193h0
    /* renamed from: b */
    private static String m32688b(@C0193h0 String str) {
        int a = m32678a(str, "yY", 1, 0);
        if (a >= str.length()) {
            return str;
        }
        String str2 = "EMd";
        int a2 = m32678a(str, str2, 1, a);
        if (a2 < str.length()) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(",");
            str2 = sb.toString();
        }
        return str.replace(str.substring(m32678a(str, str2, -1, a) + 1, a2), C3868i.f12248b).trim();
    }

    @TargetApi(24)
    /* renamed from: a */
    private static android.icu.text.DateFormat m32680a(String str, Locale locale) {
        android.icu.text.DateFormat instanceForSkeleton = android.icu.text.DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(m32701g());
        return instanceForSkeleton;
    }

    /* renamed from: a */
    private static DateFormat m32684a(int i, Locale locale) {
        DateFormat dateInstance = DateFormat.getDateInstance(i, locale);
        dateInstance.setTimeZone(m32697e());
        return dateInstance;
    }

    /* renamed from: a */
    static String m32682a(Resources resources, SimpleDateFormat simpleDateFormat) {
        String localizedPattern = simpleDateFormat.toLocalizedPattern();
        return localizedPattern.replaceAll(C2945d.f10439h, resources.getString(C5582R.string.mtrl_picker_text_input_day_abbr)).replaceAll("M", resources.getString(C5582R.string.mtrl_picker_text_input_month_abbr)).replaceAll("y", resources.getString(C5582R.string.mtrl_picker_text_input_year_abbr));
    }

    /* renamed from: a */
    static SimpleDateFormat m32685a(String str) {
        return m32690b(str, Locale.getDefault());
    }

    @TargetApi(24)
    /* renamed from: a */
    static android.icu.text.DateFormat m32681a(Locale locale) {
        return m32680a("MMMd", locale);
    }

    /* renamed from: a */
    static DateFormat m32683a() {
        return m32693c(Locale.getDefault());
    }

    /* renamed from: a */
    private static int m32678a(@C0193h0 String str, @C0193h0 String str2, int i, int i2) {
        while (i2 >= 0 && i2 < str.length() && str2.indexOf(str.charAt(i2)) == -1) {
            if (str.charAt(i2) == '\'') {
                do {
                    i2 += i;
                    if (i2 < 0 || i2 >= str.length()) {
                        break;
                    }
                } while (str.charAt(i2) != '\'');
            }
            i2 += i;
        }
        return i2;
    }
}
