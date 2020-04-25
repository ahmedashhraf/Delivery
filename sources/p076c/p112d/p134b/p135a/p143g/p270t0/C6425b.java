package p076c.p112d.p134b.p135a.p143g.p270t0;

import java.io.IOException;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;
import p076c.p112d.p134b.p135a.p143g.C6364b0;
import p076c.p112d.p134b.p135a.p143g.C6381h0;

/* renamed from: c.d.b.a.g.t0.b */
/* compiled from: AbstractDataStoreFactory */
public abstract class C6425b implements C6428e {

    /* renamed from: c */
    private static final Pattern f17900c = Pattern.compile("\\w{1,30}");

    /* renamed from: a */
    private final Lock f17901a = new ReentrantLock();

    /* renamed from: b */
    private final Map<String, C6427d<? extends Serializable>> f17902b = C6364b0.m29631a();

    /* renamed from: a */
    public final <V extends Serializable> C6427d<V> mo25864a(String str) throws IOException {
        C6381h0.m29668a(f17900c.matcher(str).matches(), "%s does not match pattern %s", str, f17900c);
        this.f17901a.lock();
        try {
            C6427d<V> dVar = (C6427d) this.f17902b.get(str);
            if (dVar == null) {
                dVar = mo25865b(str);
                this.f17902b.put(str, dVar);
            }
            return dVar;
        } finally {
            this.f17901a.unlock();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract <V extends Serializable> C6427d<V> mo25865b(String str) throws IOException;
}
