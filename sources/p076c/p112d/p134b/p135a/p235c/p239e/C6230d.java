package p076c.p112d.p134b.p135a.p235c.p239e;

import com.fasterxml.jackson.core.p162w.C3868i;
import com.google.api.client.http.C7252a;
import com.google.api.client.http.C7295m;
import com.google.api.client.http.C7299q;
import com.google.api.client.http.C7305u;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/* renamed from: c.d.b.a.c.e.d */
/* compiled from: HttpRequestContent */
class C6230d extends C7252a {

    /* renamed from: d */
    static final String f17543d = "\r\n";

    /* renamed from: e */
    private static final String f17544e = "HTTP/1.1";

    /* renamed from: c */
    private final C7305u f17545c;

    C6230d(C7305u uVar) {
        super("application/http");
        this.f17545c = uVar;
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, mo28855d());
        outputStreamWriter.write(this.f17545c.mo29117o());
        String str = C3868i.f12248b;
        outputStreamWriter.write(str);
        outputStreamWriter.write(this.f17545c.mo29126x().mo28930d());
        outputStreamWriter.write(str);
        outputStreamWriter.write(f17544e);
        String str2 = f17543d;
        outputStreamWriter.write(str2);
        C7299q qVar = new C7299q();
        qVar.mo29011a(this.f17545c.mo29111i());
        qVar.mo29016d(null).mo29059z(null).mo29024h(null).mo29030k(null).mo29013b((Long) null);
        C7295m e = this.f17545c.mo29105e();
        if (e != null) {
            qVar.mo29030k(e.getType());
            long b = e.mo25634b();
            if (b != -1) {
                qVar.mo29013b(Long.valueOf(b));
            }
        }
        C7299q.m35232a(qVar, null, null, outputStreamWriter);
        outputStreamWriter.write(str2);
        outputStreamWriter.flush();
        if (e != null) {
            e.writeTo(outputStream);
        }
    }
}
