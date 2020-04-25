package com.google.gson;

import com.google.gson.stream.C8795a;
import com.google.gson.stream.C8798c;
import com.google.gson.stream.C8799d;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.google.gson.a */
/* compiled from: DefaultDateTypeAdapter */
final class C8765a extends C8803u<Date> {

    /* renamed from: d */
    private static final String f22984d = "DefaultDateTypeAdapter";

    /* renamed from: a */
    private final Class<? extends Date> f22985a;

    /* renamed from: b */
    private final DateFormat f22986b;

    /* renamed from: c */
    private final DateFormat f22987c;

    C8765a(Class<? extends Date> cls) {
        this(cls, DateFormat.getDateTimeInstance(2, 2, Locale.US), DateFormat.getDateTimeInstance(2, 2));
    }

    /* JADX INFO: used method not loaded: com.google.gson.x.m.o.a.a(java.lang.String, java.text.ParsePosition):null, types can be incorrect */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:13|14|15|16|17) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:8|9|10|11|12) */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0014, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r4 = com.google.gson.p321x.p322m.p323o.C8927a.m41690a(r4, new java.text.ParsePosition(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0020, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0021, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0027, code lost:
        throw new com.google.gson.JsonSyntaxException(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r4 = r3.f22986b.parse(r4);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0015 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x000d */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.Date m41067b(java.lang.String r4) {
        /*
            r3 = this;
            java.text.DateFormat r0 = r3.f22987c
            monitor-enter(r0)
            java.text.DateFormat r1 = r3.f22987c     // Catch:{ ParseException -> 0x000d }
            java.util.Date r4 = r1.parse(r4)     // Catch:{ ParseException -> 0x000d }
            monitor-exit(r0)     // Catch:{ all -> 0x000b }
            return r4
        L_0x000b:
            r4 = move-exception
            goto L_0x0028
        L_0x000d:
            java.text.DateFormat r1 = r3.f22986b     // Catch:{ ParseException -> 0x0015 }
            java.util.Date r4 = r1.parse(r4)     // Catch:{ ParseException -> 0x0015 }
            monitor-exit(r0)     // Catch:{ all -> 0x000b }
            return r4
        L_0x0015:
            java.text.ParsePosition r1 = new java.text.ParsePosition     // Catch:{ ParseException -> 0x0021 }
            r2 = 0
            r1.<init>(r2)     // Catch:{ ParseException -> 0x0021 }
            java.util.Date r4 = com.google.gson.p321x.p322m.p323o.C8927a.m41690a(r4, r1)     // Catch:{ ParseException -> 0x0021 }
            monitor-exit(r0)     // Catch:{ all -> 0x000b }
            return r4
        L_0x0021:
            r1 = move-exception
            com.google.gson.JsonSyntaxException r2 = new com.google.gson.JsonSyntaxException     // Catch:{ all -> 0x000b }
            r2.<init>(r4, r1)     // Catch:{ all -> 0x000b }
            throw r2     // Catch:{ all -> 0x000b }
        L_0x0028:
            monitor-exit(r0)     // Catch:{ all -> 0x000b }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.C8765a.m41067b(java.lang.String):java.util.Date");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(f22984d);
        sb.append('(');
        sb.append(this.f22987c.getClass().getSimpleName());
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: a */
    public void mo32288a(C8799d dVar, Date date) throws IOException {
        synchronized (this.f22987c) {
            dVar.mo32472e(this.f22986b.format(date));
        }
    }

    C8765a(Class<? extends Date> cls, String str) {
        this(cls, (DateFormat) new SimpleDateFormat(str, Locale.US), (DateFormat) new SimpleDateFormat(str));
    }

    C8765a(Class<? extends Date> cls, int i) {
        this(cls, DateFormat.getDateInstance(i, Locale.US), DateFormat.getDateInstance(i));
    }

    public C8765a(int i, int i2) {
        this(Date.class, DateFormat.getDateTimeInstance(i, i2, Locale.US), DateFormat.getDateTimeInstance(i, i2));
    }

    /* renamed from: a */
    public Date m41069a(C8795a aVar) throws IOException {
        if (aVar.peek() == C8798c.STRING) {
            Date b = m41067b(aVar.mo32442M());
            Class<? extends Date> cls = this.f22985a;
            if (cls == Date.class) {
                return b;
            }
            if (cls == Timestamp.class) {
                return new Timestamp(b.getTime());
            }
            if (cls == java.sql.Date.class) {
                return new java.sql.Date(b.getTime());
            }
            throw new AssertionError();
        }
        throw new JsonParseException("The date should be a string value");
    }

    public C8765a(Class<? extends Date> cls, int i, int i2) {
        this(cls, DateFormat.getDateTimeInstance(i, i2, Locale.US), DateFormat.getDateTimeInstance(i, i2));
    }

    C8765a(Class<? extends Date> cls, DateFormat dateFormat, DateFormat dateFormat2) {
        if (cls == Date.class || cls == java.sql.Date.class || cls == Timestamp.class) {
            this.f22985a = cls;
            this.f22986b = dateFormat;
            this.f22987c = dateFormat2;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Date type must be one of ");
        sb.append(Date.class);
        sb.append(", ");
        sb.append(Timestamp.class);
        sb.append(", or ");
        sb.append(java.sql.Date.class);
        sb.append(" but was ");
        sb.append(cls);
        throw new IllegalArgumentException(sb.toString());
    }
}
