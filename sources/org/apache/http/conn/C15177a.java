package org.apache.http.conn;

import java.io.IOException;
import java.io.InputStream;
import org.apache.http.p224d0.C6145c;

@C6145c
/* renamed from: org.apache.http.conn.a */
/* compiled from: BasicEofSensorWatcher */
public class C15177a implements C15186j {

    /* renamed from: a */
    protected final C15187k f44069a;

    /* renamed from: b */
    protected final boolean f44070b;

    public C15177a(C15187k kVar, boolean z) {
        if (kVar != null) {
            this.f44069a = kVar;
            this.f44070b = z;
            return;
        }
        throw new IllegalArgumentException("Connection may not be null.");
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public boolean mo46980a(InputStream inputStream) throws IOException {
        try {
            if (this.f44070b) {
                inputStream.close();
                this.f44069a.mo47018g();
            }
            this.f44069a.mo46983B();
            return false;
        } catch (Throwable th) {
            this.f44069a.mo46983B();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public boolean mo46981b(InputStream inputStream) throws IOException {
        try {
            if (this.f44070b) {
                inputStream.close();
                this.f44069a.mo47018g();
            }
            this.f44069a.mo46983B();
            return false;
        } catch (Throwable th) {
            this.f44069a.mo46983B();
            throw th;
        }
    }

    /* renamed from: c */
    public boolean mo46982c(InputStream inputStream) throws IOException {
        this.f44069a.mo46984F();
        return false;
    }
}
