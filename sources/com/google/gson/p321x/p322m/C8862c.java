package com.google.gson.p321x.p322m;

import com.google.gson.C8775f;
import com.google.gson.C8803u;
import com.google.gson.C8805v;
import com.google.gson.p324y.C8928a;
import com.google.gson.stream.C8795a;
import com.google.gson.stream.C8798c;
import com.google.gson.stream.C8799d;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.google.gson.x.m.c */
/* compiled from: DateTypeAdapter */
public final class C8862c extends C8803u<Date> {

    /* renamed from: c */
    public static final C8805v f23221c = new C8863a();

    /* renamed from: a */
    private final DateFormat f23222a = DateFormat.getDateTimeInstance(2, 2, Locale.US);

    /* renamed from: b */
    private final DateFormat f23223b = DateFormat.getDateTimeInstance(2, 2);

    /* renamed from: com.google.gson.x.m.c$a */
    /* compiled from: DateTypeAdapter */
    static class C8863a implements C8805v {
        C8863a() {
        }

        /* renamed from: a */
        public <T> C8803u<T> mo32486a(C8775f fVar, C8928a<T> aVar) {
            if (aVar.mo32660a() == Date.class) {
                return new C8862c();
            }
            return null;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:6|7|8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001e, code lost:
        return com.google.gson.p321x.p322m.p323o.C8927a.m41690a(r3, new java.text.ParsePosition(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0025, code lost:
        throw new com.google.gson.JsonSyntaxException(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        return r2.f23222a.parse(r3);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0013 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x000b */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized java.util.Date m41462b(java.lang.String r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.text.DateFormat r0 = r2.f23223b     // Catch:{ ParseException -> 0x000b }
            java.util.Date r3 = r0.parse(r3)     // Catch:{ ParseException -> 0x000b }
            monitor-exit(r2)
            return r3
        L_0x0009:
            r3 = move-exception
            goto L_0x0026
        L_0x000b:
            java.text.DateFormat r0 = r2.f23222a     // Catch:{ ParseException -> 0x0013 }
            java.util.Date r3 = r0.parse(r3)     // Catch:{ ParseException -> 0x0013 }
            monitor-exit(r2)
            return r3
        L_0x0013:
            java.text.ParsePosition r0 = new java.text.ParsePosition     // Catch:{ ParseException -> 0x001f }
            r1 = 0
            r0.<init>(r1)     // Catch:{ ParseException -> 0x001f }
            java.util.Date r3 = com.google.gson.p321x.p322m.p323o.C8927a.m41690a(r3, r0)     // Catch:{ ParseException -> 0x001f }
            monitor-exit(r2)
            return r3
        L_0x001f:
            r0 = move-exception
            com.google.gson.JsonSyntaxException r1 = new com.google.gson.JsonSyntaxException     // Catch:{ all -> 0x0009 }
            r1.<init>(r3, r0)     // Catch:{ all -> 0x0009 }
            throw r1     // Catch:{ all -> 0x0009 }
        L_0x0026:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.p321x.p322m.C8862c.m41462b(java.lang.String):java.util.Date");
    }

    /* renamed from: a */
    public Date m41464a(C8795a aVar) throws IOException {
        if (aVar.peek() != C8798c.NULL) {
            return m41462b(aVar.mo32442M());
        }
        aVar.mo32441L();
        return null;
    }

    /* renamed from: a */
    public synchronized void mo32288a(C8799d dVar, Date date) throws IOException {
        if (date == null) {
            dVar.mo32456B();
        } else {
            dVar.mo32472e(this.f23222a.format(date));
        }
    }
}
