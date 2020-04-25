package org.apache.http.impl.cookie;

import java.lang.ref.SoftReference;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import org.apache.http.p224d0.C6144b;

@C6144b
/* renamed from: org.apache.http.impl.cookie.p */
/* compiled from: DateUtils */
public final class C15410p {

    /* renamed from: a */
    public static final String f44536a = "EEE, dd MMM yyyy HH:mm:ss zzz";

    /* renamed from: b */
    public static final String f44537b = "EEEE, dd-MMM-yy HH:mm:ss zzz";

    /* renamed from: c */
    public static final String f44538c = "EEE MMM d HH:mm:ss yyyy";

    /* renamed from: d */
    private static final String[] f44539d = {f44537b, "EEE, dd MMM yyyy HH:mm:ss zzz", f44538c};

    /* renamed from: e */
    private static final Date f44540e;

    /* renamed from: f */
    public static final TimeZone f44541f = TimeZone.getTimeZone("GMT");

    /* renamed from: org.apache.http.impl.cookie.p$a */
    /* compiled from: DateUtils */
    static final class C15411a {

        /* renamed from: a */
        private static final ThreadLocal<SoftReference<Map<String, SimpleDateFormat>>> f44542a = new C15412a();

        /* renamed from: org.apache.http.impl.cookie.p$a$a */
        /* compiled from: DateUtils */
        static class C15412a extends ThreadLocal<SoftReference<Map<String, SimpleDateFormat>>> {
            C15412a() {
            }

            /* access modifiers changed from: protected */
            public SoftReference<Map<String, SimpleDateFormat>> initialValue() {
                return new SoftReference<>(new HashMap());
            }
        }

        C15411a() {
        }

        /* renamed from: a */
        public static SimpleDateFormat m68327a(String str) {
            Map map = (Map) ((SoftReference) f44542a.get()).get();
            if (map == null) {
                map = new HashMap();
                f44542a.set(new SoftReference(map));
            }
            SimpleDateFormat simpleDateFormat = (SimpleDateFormat) map.get(str);
            if (simpleDateFormat != null) {
                return simpleDateFormat;
            }
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(str, Locale.US);
            simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("GMT"));
            map.put(str, simpleDateFormat2);
            return simpleDateFormat2;
        }
    }

    static {
        Calendar instance = Calendar.getInstance();
        instance.setTimeZone(f44541f);
        instance.set(2000, 0, 1, 0, 0, 0);
        instance.set(14, 0);
        f44540e = instance.getTime();
    }

    private C15410p() {
    }

    /* renamed from: a */
    public static Date m68324a(String str) throws DateParseException {
        return m68326a(str, null, null);
    }

    /* renamed from: a */
    public static Date m68325a(String str, String[] strArr) throws DateParseException {
        return m68326a(str, strArr, null);
    }

    /* renamed from: a */
    public static Date m68326a(String str, String[] strArr, Date date) throws DateParseException {
        if (str != null) {
            if (strArr == null) {
                strArr = f44539d;
            }
            if (date == null) {
                date = f44540e;
            }
            if (str.length() > 1) {
                String str2 = "'";
                if (str.startsWith(str2) && str.endsWith(str2)) {
                    str = str.substring(1, str.length() - 1);
                }
            }
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                SimpleDateFormat a = C15411a.m68327a(strArr[i]);
                a.set2DigitYearStart(date);
                try {
                    return a.parse(str);
                } catch (ParseException unused) {
                    i++;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to parse the date ");
            sb.append(str);
            throw new DateParseException(sb.toString());
        }
        throw new IllegalArgumentException("dateValue is null");
    }

    /* renamed from: a */
    public static String m68322a(Date date) {
        return m68323a(date, "EEE, dd MMM yyyy HH:mm:ss zzz");
    }

    /* renamed from: a */
    public static String m68323a(Date date, String str) {
        if (date == null) {
            throw new IllegalArgumentException("date is null");
        } else if (str != null) {
            return C15411a.m68327a(str).format(date);
        } else {
            throw new IllegalArgumentException("pattern is null");
        }
    }
}
