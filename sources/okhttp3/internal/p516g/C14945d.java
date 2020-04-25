package okhttp3.internal.p516g;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import okhttp3.internal.C14910b;
import org.apache.http.impl.cookie.C15410p;

/* renamed from: okhttp3.internal.g.d */
/* compiled from: HttpDate */
public final class C14945d {

    /* renamed from: a */
    public static final long f43333a = 253402300799999L;

    /* renamed from: b */
    private static final ThreadLocal<DateFormat> f43334b = new C14946a();

    /* renamed from: c */
    private static final String[] f43335c = {"EEE, dd MMM yyyy HH:mm:ss zzz", C15410p.f44537b, C15410p.f44538c, "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};

    /* renamed from: d */
    private static final DateFormat[] f43336d = new DateFormat[f43335c.length];

    /* renamed from: okhttp3.internal.g.d$a */
    /* compiled from: HttpDate */
    class C14946a extends ThreadLocal<DateFormat> {
        C14946a() {
        }

        /* access modifiers changed from: protected */
        public DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(C14910b.f43173p);
            return simpleDateFormat;
        }
    }

    private C14945d() {
    }

    /* renamed from: a */
    public static Date m66221a(String str) {
        if (str.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date parse = ((DateFormat) f43334b.get()).parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return parse;
        }
        synchronized (f43335c) {
            int length = f43335c.length;
            for (int i = 0; i < length; i++) {
                DateFormat dateFormat = f43336d[i];
                if (dateFormat == null) {
                    dateFormat = new SimpleDateFormat(f43335c[i], Locale.US);
                    dateFormat.setTimeZone(C14910b.f43173p);
                    f43336d[i] = dateFormat;
                }
                parsePosition.setIndex(0);
                Date parse2 = dateFormat.parse(str, parsePosition);
                if (parsePosition.getIndex() != 0) {
                    return parse2;
                }
            }
            return null;
        }
    }

    /* renamed from: a */
    public static String m66220a(Date date) {
        return ((DateFormat) f43334b.get()).format(date);
    }
}
