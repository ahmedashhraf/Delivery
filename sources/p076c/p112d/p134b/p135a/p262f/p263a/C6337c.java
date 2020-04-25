package p076c.p112d.p134b.p135a.p262f.p263a;

import com.google.api.client.http.C7295m;
import java.io.IOException;
import java.io.OutputStream;
import p076c.p112d.p134b.p135a.p143g.C2766f;
import p076c.p112d.p134b.p135a.p143g.C6381h0;

@C2766f
/* renamed from: c.d.b.a.f.a.c */
/* compiled from: MockHttpContent */
public class C6337c implements C7295m {

    /* renamed from: a */
    private long f17711a = -1;

    /* renamed from: b */
    private String f17712b;

    /* renamed from: c */
    private byte[] f17713c = new byte[0];

    /* renamed from: a */
    public C6337c mo25632a(byte[] bArr) {
        this.f17713c = (byte[]) C6381h0.m29663a(bArr);
        return this;
    }

    /* renamed from: a */
    public boolean mo25633a() {
        return true;
    }

    /* renamed from: b */
    public long mo25634b() throws IOException {
        return this.f17711a;
    }

    /* renamed from: c */
    public final byte[] mo25635c() {
        return this.f17713c;
    }

    public String getType() {
        return this.f17712b;
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(this.f17713c);
        outputStream.flush();
    }

    /* renamed from: a */
    public C6337c mo25630a(long j) {
        C6381h0.m29666a(j >= -1);
        this.f17711a = j;
        return this;
    }

    /* renamed from: a */
    public C6337c mo25631a(String str) {
        this.f17712b = str;
        return this;
    }
}
