package com.google.gson.p321x.p322m;

import com.google.gson.C8775f;
import com.google.gson.C8803u;
import com.google.gson.C8805v;
import com.google.gson.JsonSyntaxException;
import com.google.gson.p324y.C8928a;
import com.google.gson.stream.C8795a;
import com.google.gson.stream.C8798c;
import com.google.gson.stream.C8799d;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* renamed from: com.google.gson.x.m.j */
/* compiled from: SqlDateTypeAdapter */
public final class C8878j extends C8803u<Date> {

    /* renamed from: b */
    public static final C8805v f23261b = new C8879a();

    /* renamed from: a */
    private final DateFormat f23262a = new SimpleDateFormat("MMM d, yyyy");

    /* renamed from: com.google.gson.x.m.j$a */
    /* compiled from: SqlDateTypeAdapter */
    static class C8879a implements C8805v {
        C8879a() {
        }

        /* renamed from: a */
        public <T> C8803u<T> mo32486a(C8775f fVar, C8928a<T> aVar) {
            if (aVar.mo32660a() == Date.class) {
                return new C8878j();
            }
            return null;
        }
    }

    /* renamed from: a */
    public synchronized Date m41529a(C8795a aVar) throws IOException {
        if (aVar.peek() == C8798c.NULL) {
            aVar.mo32441L();
            return null;
        }
        try {
            return new Date(this.f23262a.parse(aVar.mo32442M()).getTime());
        } catch (ParseException e) {
            throw new JsonSyntaxException((Throwable) e);
        }
    }

    /* renamed from: a */
    public synchronized void mo32288a(C8799d dVar, Date date) throws IOException {
        dVar.mo32472e(date == null ? null : this.f23262a.format(date));
    }
}
