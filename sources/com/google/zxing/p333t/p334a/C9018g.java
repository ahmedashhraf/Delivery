package com.google.zxing.p333t.p334a;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.zxing.t.a.g */
/* compiled from: CalendarParsedResult */
public final class C9018g extends C9033q {

    /* renamed from: m */
    private static final Pattern f23587m = Pattern.compile("P(?:(\\d+)W)?(?:(\\d+)D)?(?:T(?:(\\d+)H)?(?:(\\d+)M)?(?:(\\d+)S)?)?");

    /* renamed from: n */
    private static final long[] f23588n = {604800000, 86400000, 3600000, 60000, 1000};

    /* renamed from: o */
    private static final Pattern f23589o = Pattern.compile("[0-9]{8}(T[0-9]{6}Z?)?");

    /* renamed from: b */
    private final String f23590b;

    /* renamed from: c */
    private final Date f23591c;

    /* renamed from: d */
    private final boolean f23592d;

    /* renamed from: e */
    private final Date f23593e;

    /* renamed from: f */
    private final boolean f23594f;

    /* renamed from: g */
    private final String f23595g;

    /* renamed from: h */
    private final String f23596h;

    /* renamed from: i */
    private final String[] f23597i;

    /* renamed from: j */
    private final String f23598j;

    /* renamed from: k */
    private final double f23599k;

    /* renamed from: l */
    private final double f23600l;

    public C9018g(String str, String str2, String str3, String str4, String str5, String str6, String[] strArr, String str7, double d, double d2) {
        Date date;
        super(C9034r.CALENDAR);
        this.f23590b = str;
        try {
            this.f23591c = m42144a(str2);
            if (str3 == null) {
                long a = m42142a((CharSequence) str4);
                if (a < 0) {
                    date = null;
                } else {
                    date = new Date(this.f23591c.getTime() + a);
                }
                this.f23593e = date;
            } else {
                try {
                    this.f23593e = m42144a(str3);
                } catch (ParseException e) {
                    throw new IllegalArgumentException(e.toString());
                }
            }
            boolean z = false;
            this.f23592d = str2.length() == 8;
            if (str3 != null && str3.length() == 8) {
                z = true;
            }
            this.f23594f = z;
            this.f23595g = str5;
            this.f23596h = str6;
            this.f23597i = strArr;
            this.f23598j = str7;
            this.f23599k = d;
            this.f23600l = d2;
        } catch (ParseException e2) {
            throw new IllegalArgumentException(e2.toString());
        }
    }

    /* renamed from: n */
    private static DateFormat m42145n() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.ENGLISH);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }

    /* renamed from: o */
    private static DateFormat m42146o() {
        return new SimpleDateFormat("yyyyMMdd'T'HHmmss", Locale.ENGLISH);
    }

    /* renamed from: a */
    public String mo32877a() {
        StringBuilder sb = new StringBuilder(100);
        C9033q.m42236a(this.f23590b, sb);
        C9033q.m42236a(m42143a(this.f23592d, this.f23591c), sb);
        C9033q.m42236a(m42143a(this.f23594f, this.f23593e), sb);
        C9033q.m42236a(this.f23595g, sb);
        C9033q.m42236a(this.f23596h, sb);
        C9033q.m42237a(this.f23597i, sb);
        C9033q.m42236a(this.f23598j, sb);
        return sb.toString();
    }

    /* renamed from: c */
    public String[] mo32899c() {
        return this.f23597i;
    }

    /* renamed from: d */
    public String mo32900d() {
        return this.f23598j;
    }

    /* renamed from: e */
    public Date mo32901e() {
        return this.f23593e;
    }

    /* renamed from: f */
    public double mo32902f() {
        return this.f23599k;
    }

    /* renamed from: g */
    public String mo32903g() {
        return this.f23595g;
    }

    /* renamed from: h */
    public double mo32904h() {
        return this.f23600l;
    }

    /* renamed from: i */
    public String mo32905i() {
        return this.f23596h;
    }

    /* renamed from: j */
    public Date mo32906j() {
        return this.f23591c;
    }

    /* renamed from: k */
    public String mo32907k() {
        return this.f23590b;
    }

    /* renamed from: l */
    public boolean mo32908l() {
        return this.f23594f;
    }

    /* renamed from: m */
    public boolean mo32909m() {
        return this.f23592d;
    }

    /* renamed from: a */
    private static Date m42144a(String str) throws ParseException {
        Date date;
        if (!f23589o.matcher(str).matches()) {
            throw new ParseException(str, 0);
        } else if (str.length() == 8) {
            return m42145n().parse(str);
        } else {
            if (str.length() == 16 && str.charAt(15) == 'Z') {
                Date parse = m42146o().parse(str.substring(0, 15));
                GregorianCalendar gregorianCalendar = new GregorianCalendar();
                long time = parse.getTime() + ((long) gregorianCalendar.get(15));
                gregorianCalendar.setTime(new Date(time));
                date = new Date(time + ((long) gregorianCalendar.get(16)));
            } else {
                date = m42146o().parse(str);
            }
            return date;
        }
    }

    /* renamed from: a */
    private static String m42143a(boolean z, Date date) {
        DateFormat dateFormat;
        if (date == null) {
            return null;
        }
        if (z) {
            dateFormat = DateFormat.getDateInstance(2);
        } else {
            dateFormat = DateFormat.getDateTimeInstance(2, 2);
        }
        return dateFormat.format(date);
    }

    /* renamed from: a */
    private static long m42142a(CharSequence charSequence) {
        if (charSequence == null) {
            return -1;
        }
        Matcher matcher = f23587m.matcher(charSequence);
        if (!matcher.matches()) {
            return -1;
        }
        long j = 0;
        int i = 0;
        while (i < f23588n.length) {
            int i2 = i + 1;
            String group = matcher.group(i2);
            if (group != null) {
                j += f23588n[i] * ((long) Integer.parseInt(group));
            }
            i = i2;
        }
        return j;
    }
}
