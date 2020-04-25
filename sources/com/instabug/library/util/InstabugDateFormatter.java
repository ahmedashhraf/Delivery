package com.instabug.library.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class InstabugDateFormatter {
    private static transient /* synthetic */ boolean[] $jacocoData;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(2083354520676575530L, "com/instabug/library/util/InstabugDateFormatter", 28);
        $jacocoData = a;
        return a;
    }

    public InstabugDateFormatter() {
        $jacocoInit()[0] = true;
    }

    public static Date convertUnixTimeToDate(long j) {
        boolean[] $jacocoInit = $jacocoInit();
        Calendar instance = Calendar.getInstance();
        $jacocoInit[15] = true;
        instance.setTimeInMillis(j);
        $jacocoInit[16] = true;
        Date time = instance.getTime();
        $jacocoInit[17] = true;
        return time;
    }

    public static String convertUnixTimeToFormattedDate(long j) {
        boolean[] $jacocoInit = $jacocoInit();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        $jacocoInit[12] = true;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        $jacocoInit[13] = true;
        String format = simpleDateFormat.format(convertUnixTimeToDate(j));
        $jacocoInit[14] = true;
        return format;
    }

    public static String formatConversationLastMessageDate(long j) {
        boolean[] $jacocoInit = $jacocoInit();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMM", Locale.US);
        $jacocoInit[20] = true;
        String format = simpleDateFormat.format(Long.valueOf(j * 1000));
        $jacocoInit[21] = true;
        return format;
    }

    public static String formatMessageDate(long j) {
        boolean[] $jacocoInit = $jacocoInit();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM HH:mm", Locale.US);
        $jacocoInit[18] = true;
        String format = simpleDateFormat.format(Long.valueOf(j * 1000));
        $jacocoInit[19] = true;
        return format;
    }

    public static String formatUTCDate(long j) {
        boolean[] $jacocoInit = $jacocoInit();
        Calendar instance = Calendar.getInstance();
        $jacocoInit[7] = true;
        instance.setTimeInMillis(j * 1000);
        $jacocoInit[8] = true;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        $jacocoInit[9] = true;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        $jacocoInit[10] = true;
        String format = simpleDateFormat.format(instance.getTime());
        $jacocoInit[11] = true;
        return format;
    }

    public static String getCurrentDateAsString() {
        boolean[] $jacocoInit = $jacocoInit();
        Calendar instance = Calendar.getInstance();
        $jacocoInit[3] = true;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        $jacocoInit[4] = true;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        $jacocoInit[5] = true;
        String format = simpleDateFormat.format(instance.getTime());
        $jacocoInit[6] = true;
        return format;
    }

    public static long getCurrentUTCTimeStampInMiliSeconds() {
        boolean[] $jacocoInit = $jacocoInit();
        long currentTimeMillis = System.currentTimeMillis();
        $jacocoInit[2] = true;
        return currentTimeMillis;
    }

    public static long getCurrentUTCTimeStampInSeconds() {
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        $jacocoInit()[1] = true;
        return currentTimeMillis;
    }

    public static Date getDate(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        $jacocoInit[23] = true;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        try {
            $jacocoInit[24] = true;
            Date parse = simpleDateFormat.parse(str);
            $jacocoInit[25] = true;
            return parse;
        } catch (ParseException e) {
            $jacocoInit[26] = true;
            e.printStackTrace();
            $jacocoInit[27] = true;
            return null;
        }
    }

    public static Date getStandardizedDate(Date date) {
        boolean[] $jacocoInit = $jacocoInit();
        Date date2 = new Date(date.getTime());
        $jacocoInit[22] = true;
        return date2;
    }
}
