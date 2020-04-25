package org.apache.http.p549j0;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: org.apache.http.j0.g */
/* compiled from: HttpDateGenerator */
public class C15432g {

    /* renamed from: d */
    public static final String f44601d = "EEE, dd MMM yyyy HH:mm:ss zzz";

    /* renamed from: e */
    public static final TimeZone f44602e = TimeZone.getTimeZone("GMT");

    /* renamed from: a */
    private final DateFormat f44603a = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);

    /* renamed from: b */
    private long f44604b = 0;

    /* renamed from: c */
    private String f44605c = null;

    public C15432g() {
        this.f44603a.setTimeZone(f44602e);
    }

    /* renamed from: a */
    public synchronized String mo47715a() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f44604b > 1000) {
            this.f44605c = this.f44603a.format(new Date(currentTimeMillis));
            this.f44604b = currentTimeMillis;
        }
        return this.f44605c;
    }
}
