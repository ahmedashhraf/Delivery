package org.apache.http.conn;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.C15423j;
import org.apache.http.p224d0.C6145c;
import org.apache.http.p540e0.C15246i;

@C6145c
/* renamed from: org.apache.http.conn.b */
/* compiled from: BasicManagedEntity */
public class C15178b extends C15246i implements C15184h, C15186j {

    /* renamed from: N */
    protected final boolean f44071N;

    /* renamed from: b */
    protected C15187k f44072b;

    public C15178b(C15423j jVar, C15187k kVar, boolean z) {
        super(jVar);
        if (kVar != null) {
            this.f44072b = kVar;
            this.f44071N = z;
            return;
        }
        throw new IllegalArgumentException("Connection may not be null.");
    }

    /* renamed from: B */
    public void mo46983B() throws IOException {
        mo46986j();
    }

    /* renamed from: F */
    public void mo46984F() throws IOException {
        C15187k kVar = this.f44072b;
        if (kVar != null) {
            try {
                kVar.mo46984F();
            } finally {
                this.f44072b = null;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public boolean mo46980a(InputStream inputStream) throws IOException {
        try {
            if (this.f44071N && this.f44072b != null) {
                inputStream.close();
                this.f44072b.mo47018g();
            }
            mo46985a();
            return false;
        } catch (Throwable th) {
            mo46985a();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public boolean mo46981b(InputStream inputStream) throws IOException {
        try {
            if (this.f44071N && this.f44072b != null) {
                inputStream.close();
                this.f44072b.mo47018g();
            }
            mo46985a();
            return false;
        } catch (Throwable th) {
            mo46985a();
            throw th;
        }
    }

    /* renamed from: c */
    public boolean mo46982c(InputStream inputStream) throws IOException {
        C15187k kVar = this.f44072b;
        if (kVar != null) {
            kVar.mo46984F();
        }
        return false;
    }

    public InputStream getContent() throws IOException {
        return new C15185i(this.f44168a.getContent(), this);
    }

    public boolean isRepeatable() {
        return false;
    }

    /* renamed from: j */
    public void mo46986j() throws IOException {
        if (this.f44072b != null) {
            try {
                if (this.f44071N) {
                    this.f44168a.mo46986j();
                    this.f44072b.mo47018g();
                }
            } finally {
                mo46985a();
            }
        }
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        super.writeTo(outputStream);
        mo46986j();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo46985a() throws IOException {
        C15187k kVar = this.f44072b;
        if (kVar != null) {
            try {
                kVar.mo46983B();
            } finally {
                this.f44072b = null;
            }
        }
    }
}
