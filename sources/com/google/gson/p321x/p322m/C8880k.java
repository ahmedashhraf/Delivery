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
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* renamed from: com.google.gson.x.m.k */
/* compiled from: TimeTypeAdapter */
public final class C8880k extends C8803u<Time> {

    /* renamed from: b */
    public static final C8805v f23263b = new C8881a();

    /* renamed from: a */
    private final DateFormat f23264a = new SimpleDateFormat("hh:mm:ss a");

    /* renamed from: com.google.gson.x.m.k$a */
    /* compiled from: TimeTypeAdapter */
    static class C8881a implements C8805v {
        C8881a() {
        }

        /* renamed from: a */
        public <T> C8803u<T> mo32486a(C8775f fVar, C8928a<T> aVar) {
            if (aVar.mo32660a() == Time.class) {
                return new C8880k();
            }
            return null;
        }
    }

    /* renamed from: a */
    public synchronized Time m41534a(C8795a aVar) throws IOException {
        if (aVar.peek() == C8798c.NULL) {
            aVar.mo32441L();
            return null;
        }
        try {
            return new Time(this.f23264a.parse(aVar.mo32442M()).getTime());
        } catch (ParseException e) {
            throw new JsonSyntaxException((Throwable) e);
        }
    }

    /* renamed from: a */
    public synchronized void mo32288a(C8799d dVar, Time time) throws IOException {
        dVar.mo32472e(time == null ? null : this.f23264a.format(time));
    }
}
