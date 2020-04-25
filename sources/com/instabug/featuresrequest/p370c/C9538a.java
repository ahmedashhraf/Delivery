package com.instabug.featuresrequest.p370c;

import android.content.Context;
import android.content.res.Resources;
import com.instabug.featuresrequest.C9525R;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.featuresrequest.c.a */
/* compiled from: DateUtils */
public class C9538a {

    /* renamed from: a */
    private static transient /* synthetic */ boolean[] f25233a;

    /* renamed from: a */
    public static String m44630a(Context context, long j) {
        boolean[] a = m44631a();
        Date date = new Date(j);
        a[1] = true;
        DateFormat dateInstance = DateFormat.getDateInstance(2);
        a[2] = true;
        if (!Locale.getDefault().getISO3Language().equals(Locale.ENGLISH.getISO3Language())) {
            a[3] = true;
            String format = dateInstance.format(date);
            a[4] = true;
            return format;
        }
        Date date2 = new Date();
        a[5] = true;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(date2.getTime() - date.getTime());
        a[6] = true;
        long minutes = TimeUnit.MILLISECONDS.toMinutes(date2.getTime() - date.getTime());
        a[7] = true;
        long hours = TimeUnit.MILLISECONDS.toHours(date2.getTime() - date.getTime());
        a[8] = true;
        long days = TimeUnit.MILLISECONDS.toDays(date2.getTime() - date.getTime());
        if (seconds < 60) {
            a[9] = true;
            String string = context.getString(C9525R.string.feature_request_str_just_now);
            a[10] = true;
            return string;
        }
        Context context2 = context;
        if (minutes < 60) {
            a[11] = true;
            Resources resources = context.getResources();
            int i = C9525R.plurals.instabug_feature_rq_str_minutes_ago;
            int i2 = (int) minutes;
            a[12] = true;
            Object[] objArr = {Long.valueOf(minutes)};
            a[13] = true;
            String quantityString = resources.getQuantityString(i, i2, objArr);
            a[14] = true;
            return quantityString;
        } else if (hours < 24) {
            a[15] = true;
            Resources resources2 = context.getResources();
            int i3 = C9525R.plurals.instabug_feature_rq_str_hours_ago;
            int i4 = (int) hours;
            a[16] = true;
            Object[] objArr2 = {Long.valueOf(hours)};
            a[17] = true;
            String quantityString2 = resources2.getQuantityString(i3, i4, objArr2);
            a[18] = true;
            return quantityString2;
        } else if (days < 7) {
            a[19] = true;
            Resources resources3 = context.getResources();
            int i5 = C9525R.plurals.instabug_feature_rq_str_days_ago;
            int i6 = (int) days;
            a[20] = true;
            Object[] objArr3 = {Long.valueOf(days)};
            a[21] = true;
            String quantityString3 = resources3.getQuantityString(i5, i6, objArr3);
            a[22] = true;
            return quantityString3;
        } else {
            String format2 = dateInstance.format(date);
            a[23] = true;
            return format2;
        }
    }

    /* renamed from: a */
    private static /* synthetic */ boolean[] m44631a() {
        boolean[] zArr = f25233a;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-2676737846909000995L, "com/instabug/featuresrequest/utils/DateUtils", 24);
        f25233a = a;
        return a;
    }
}
