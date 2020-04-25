package p205i.p486d.p487a;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p053b.p063d.p064b.C2108a;

/* renamed from: i.d.a.a */
/* compiled from: XmppDateTime */
public class C14051a {

    /* renamed from: a */
    private static final C14053b f41285a = C14053b.XEP_0082_DATE_PROFILE;

    /* renamed from: b */
    private static final Pattern f41286b = Pattern.compile("^\\d+-\\d+-\\d+$");

    /* renamed from: c */
    private static final C14053b f41287c = C14053b.XEP_0082_TIME_MILLIS_ZONE_PROFILE;

    /* renamed from: d */
    private static final Pattern f41288d = Pattern.compile("^(\\d+:){2}\\d+.\\d+(Z|([+-](\\d+:\\d+)))$");

    /* renamed from: e */
    private static final C14053b f41289e = C14053b.XEP_0082_TIME_MILLIS_PROFILE;

    /* renamed from: f */
    private static final Pattern f41290f = Pattern.compile("^(\\d+:){2}\\d+.\\d+$");

    /* renamed from: g */
    private static final C14053b f41291g = C14053b.XEP_0082_TIME_ZONE_PROFILE;

    /* renamed from: h */
    private static final Pattern f41292h = Pattern.compile("^(\\d+:){2}\\d+(Z|([+-](\\d+:\\d+)))$");

    /* renamed from: i */
    private static final C14053b f41293i = C14053b.XEP_0082_TIME_PROFILE;

    /* renamed from: j */
    private static final Pattern f41294j = Pattern.compile("^(\\d+:){2}\\d+$");

    /* renamed from: k */
    private static final C14053b f41295k = C14053b.XEP_0082_DATETIME_MILLIS_PROFILE;

    /* renamed from: l */
    private static final Pattern f41296l = Pattern.compile("^\\d+(-\\d+){2}+T(\\d+:){2}\\d+.\\d+(Z|([+-](\\d+:\\d+)))?$");

    /* renamed from: m */
    private static final C14053b f41297m = C14053b.XEP_0082_DATETIME_PROFILE;

    /* renamed from: n */
    private static final Pattern f41298n = Pattern.compile("^\\d+(-\\d+){2}+T(\\d+:){2}\\d+(Z|([+-](\\d+:\\d+)))?$");

    /* renamed from: o */
    private static final DateFormat f41299o = new SimpleDateFormat("yyyyMMdd'T'HH:mm:ss");

    /* renamed from: p */
    private static final DateFormat f41300p = new SimpleDateFormat("yyyyMd'T'HH:mm:ss");

    /* renamed from: q */
    private static final DateFormat f41301q = new SimpleDateFormat("yyyyMdd'T'HH:mm:ss");

    /* renamed from: r */
    private static final DateFormat f41302r = new SimpleDateFormat("yyyyMMd'T'HH:mm:ss");

    /* renamed from: s */
    private static final Pattern f41303s = Pattern.compile("^\\d+T\\d+:\\d+:\\d+$");

    /* renamed from: t */
    private static final List<C14054c> f41304t = new ArrayList();

    /* renamed from: u */
    private static final Pattern f41305u = Pattern.compile(".*\\.(\\d{1,})(Z|((\\+|-)\\d{4}))");

    /* renamed from: i.d.a.a$a */
    /* compiled from: XmppDateTime */
    static class C14052a implements Comparator<Calendar> {

        /* renamed from: a */
        final /* synthetic */ Calendar f41306a;

        C14052a(Calendar calendar) {
            this.f41306a = calendar;
        }

        /* renamed from: a */
        public int compare(Calendar calendar, Calendar calendar2) {
            return new Long(this.f41306a.getTimeInMillis() - calendar.getTimeInMillis()).compareTo(new Long(this.f41306a.getTimeInMillis() - calendar2.getTimeInMillis()));
        }
    }

    /* renamed from: i.d.a.a$b */
    /* compiled from: XmppDateTime */
    public enum C14053b {
        XEP_0082_DATE_PROFILE("yyyy-MM-dd"),
        XEP_0082_DATETIME_PROFILE("yyyy-MM-dd'T'HH:mm:ssZ"),
        XEP_0082_DATETIME_MILLIS_PROFILE("yyyy-MM-dd'T'HH:mm:ss.SSSZ"),
        XEP_0082_TIME_PROFILE("hh:mm:ss"),
        XEP_0082_TIME_ZONE_PROFILE("hh:mm:ssZ"),
        XEP_0082_TIME_MILLIS_PROFILE("hh:mm:ss.SSS"),
        XEP_0082_TIME_MILLIS_ZONE_PROFILE("hh:mm:ss.SSSZ"),
        XEP_0091_DATETIME("yyyyMMdd'T'HH:mm:ss");
        
        private final boolean CONVERT_TIMEZONE;
        private final DateFormat FORMATTER;
        private final String FORMAT_STRING;
        private final boolean HANDLE_MILLIS;

        private C14053b(String str) {
            this.FORMAT_STRING = str;
            this.FORMATTER = new SimpleDateFormat(this.FORMAT_STRING);
            this.FORMATTER.setTimeZone(TimeZone.getTimeZone("UTC"));
            boolean z = true;
            if (str.charAt(str.length() - 1) != 'Z') {
                z = false;
            }
            this.CONVERT_TIMEZONE = z;
            this.HANDLE_MILLIS = str.contains("SSS");
        }

        /* renamed from: a */
        public String mo44382a(Date date) {
            String format;
            synchronized (this.FORMATTER) {
                format = this.FORMATTER.format(date);
            }
            return this.CONVERT_TIMEZONE ? C14051a.m60628b(format) : format;
        }

        /* renamed from: b */
        public Date mo44383b(String str) throws ParseException {
            Date parse;
            if (this.CONVERT_TIMEZONE) {
                str = C14051a.m60629c(str);
            }
            if (this.HANDLE_MILLIS) {
                str = C14051a.m60630d(str);
            }
            synchronized (this.FORMATTER) {
                parse = this.FORMATTER.parse(str);
            }
            return parse;
        }
    }

    /* renamed from: i.d.a.a$c */
    /* compiled from: XmppDateTime */
    private static class C14054c {

        /* renamed from: a */
        final Pattern f41307a;

        /* renamed from: b */
        final C14053b f41308b;

        public C14054c(Pattern pattern, C14053b bVar) {
            this.f41307a = pattern;
            this.f41308b = bVar;
        }
    }

    static {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        f41299o.setTimeZone(timeZone);
        f41300p.setTimeZone(timeZone);
        f41301q.setTimeZone(timeZone);
        f41301q.setLenient(false);
        f41302r.setTimeZone(timeZone);
        f41302r.setLenient(false);
        f41304t.add(new C14054c(f41286b, f41285a));
        f41304t.add(new C14054c(f41296l, f41295k));
        f41304t.add(new C14054c(f41298n, f41297m));
        f41304t.add(new C14054c(f41288d, f41287c));
        f41304t.add(new C14054c(f41290f, f41289e));
        f41304t.add(new C14054c(f41292h, f41291g));
        f41304t.add(new C14054c(f41294j, f41293i));
    }

    /* renamed from: b */
    public static String m60628b(String str) {
        int length = str.length();
        int i = length - 2;
        String substring = str.substring(0, i);
        StringBuilder sb = new StringBuilder();
        sb.append(substring);
        sb.append(':');
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2);
        sb3.append(str.substring(i, length));
        return sb3.toString();
    }

    /* renamed from: c */
    public static String m60629c(String str) {
        if (str.charAt(str.length() - 1) == 'Z') {
            return str.replace("Z", "+0000");
        }
        return str.replaceAll("([\\+\\-]\\d\\d):(\\d\\d)", "$1$2");
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static String m60630d(String str) {
        Matcher matcher = f41305u.matcher(str);
        if (!matcher.matches()) {
            return str;
        }
        int length = matcher.group(1).length();
        if (length == 3) {
            return str;
        }
        int indexOf = str.indexOf(".");
        StringBuilder sb = new StringBuilder((str.length() - length) + 3);
        if (length > 3) {
            sb.append(str.substring(0, indexOf + 4));
        } else {
            sb.append(str.substring(0, indexOf + length + 1));
            for (int i = length; i < 3; i++) {
                sb.append('0');
            }
        }
        sb.append(str.substring(indexOf + length + 1));
        return sb.toString();
    }

    /* renamed from: e */
    public static Date m60631e(String str) throws ParseException {
        Date parse;
        if (f41303s.matcher(str).matches()) {
            int length = str.split(C2108a.f8183X4)[0].length();
            if (length < 8) {
                Date a = m60626a(str, length);
                if (a != null) {
                    return a;
                }
            } else {
                synchronized (f41299o) {
                    parse = f41299o.parse(str);
                }
                return parse;
            }
        }
        return m60632f(str);
    }

    /* renamed from: f */
    public static Date m60632f(String str) throws ParseException {
        Date b;
        for (C14054c cVar : f41304t) {
            if (cVar.f41307a.matcher(str).matches()) {
                return cVar.f41308b.mo44383b(str);
            }
        }
        synchronized (f41297m) {
            b = f41297m.mo44383b(str);
        }
        return b;
    }

    /* renamed from: a */
    public static String m60622a(Date date) {
        String a;
        synchronized (f41295k) {
            a = f41295k.mo44382a(date);
        }
        return a;
    }

    /* renamed from: a */
    public static String m60623a(TimeZone timeZone) {
        int rawOffset = timeZone.getRawOffset();
        int i = rawOffset / 3600000;
        return String.format("%+d:%02d", new Object[]{Integer.valueOf(i), Integer.valueOf(Math.abs((rawOffset / 60000) - (i * 60)))});
    }

    /* renamed from: a */
    private static Date m60626a(String str, int i) throws ParseException {
        Date parse;
        if (i == 6) {
            synchronized (f41300p) {
                parse = f41300p.parse(str);
            }
            return parse;
        }
        Calendar instance = Calendar.getInstance();
        List a = m60627a(instance, m60624a(str, f41301q), m60624a(str, f41302r));
        if (!a.isEmpty()) {
            return m60625a(instance, a).getTime();
        }
        return null;
    }

    /* renamed from: a */
    private static Calendar m60624a(String str, DateFormat dateFormat) {
        Calendar calendar;
        try {
            synchronized (dateFormat) {
                dateFormat.parse(str);
                calendar = dateFormat.getCalendar();
            }
            return calendar;
        } catch (ParseException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static List<Calendar> m60627a(Calendar calendar, Calendar... calendarArr) {
        ArrayList arrayList = new ArrayList();
        for (Calendar calendar2 : calendarArr) {
            if (calendar2 != null && calendar2.before(calendar)) {
                arrayList.add(calendar2);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static Calendar m60625a(Calendar calendar, List<Calendar> list) {
        Collections.sort(list, new C14052a(calendar));
        return (Calendar) list.get(0);
    }
}
