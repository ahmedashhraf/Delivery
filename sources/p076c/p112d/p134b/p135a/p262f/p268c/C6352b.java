package p076c.p112d.p134b.p135a.p262f.p268c;

import java.io.IOException;
import p076c.p112d.p134b.p135a.p143g.C2766f;
import p076c.p112d.p134b.p135a.p143g.C6365c;
import p076c.p112d.p134b.p135a.p143g.C6381h0;

@C2766f
/* renamed from: c.d.b.a.f.c.b */
/* compiled from: MockBackOff */
public class C6352b implements C6365c {

    /* renamed from: d */
    private long f17755d;

    /* renamed from: e */
    private int f17756e = 10;

    /* renamed from: f */
    private int f17757f;

    /* renamed from: a */
    public long mo25702a() throws IOException {
        int i = this.f17757f;
        if (i < this.f17756e) {
            long j = this.f17755d;
            if (j != -1) {
                this.f17757f = i + 1;
                return j;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final int mo25705b() {
        return this.f17757f;
    }

    /* renamed from: c */
    public final int mo25706c() {
        return this.f17757f;
    }

    public void reset() throws IOException {
        this.f17757f = 0;
    }

    /* renamed from: a */
    public C6352b mo25704a(long j) {
        C6381h0.m29666a(j == -1 || j >= 0);
        this.f17755d = j;
        return this;
    }

    /* renamed from: a */
    public C6352b mo25703a(int i) {
        C6381h0.m29666a(i >= 0);
        this.f17756e = i;
        return this;
    }
}
