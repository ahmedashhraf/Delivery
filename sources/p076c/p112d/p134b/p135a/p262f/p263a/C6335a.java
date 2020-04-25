package p076c.p112d.p134b.p135a.p262f.p263a;

import java.util.concurrent.atomic.AtomicLong;
import p076c.p112d.p134b.p135a.p143g.C2766f;
import p076c.p112d.p134b.p135a.p143g.C6391l;

@C2766f
/* renamed from: c.d.b.a.f.a.a */
/* compiled from: FixedClock */
public class C6335a implements C6391l {

    /* renamed from: b */
    private AtomicLong f17708b;

    public C6335a() {
        this(0);
    }

    /* renamed from: a */
    public C6335a mo25629a(long j) {
        this.f17708b.set(j);
        return this;
    }

    public C6335a(long j) {
        this.f17708b = new AtomicLong(j);
    }

    /* renamed from: a */
    public long mo25628a() {
        return this.f17708b.get();
    }
}
