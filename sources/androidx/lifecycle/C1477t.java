package androidx.lifecycle;

import androidx.annotation.C0187e0;
import androidx.annotation.C0195i0;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.lifecycle.t */
/* compiled from: ViewModel */
public abstract class C1477t {
    @C0195i0

    /* renamed from: a */
    private final Map<String, Object> f5734a = new HashMap();

    /* renamed from: b */
    private volatile boolean f5735b = false;

    /* access modifiers changed from: 0000 */
    @C0187e0
    /* renamed from: a */
    public final void mo6535a() {
        this.f5735b = true;
        Map<String, Object> map = this.f5734a;
        if (map != null) {
            synchronized (map) {
                for (Object a : this.f5734a.values()) {
                    m7738a(a);
                }
            }
        }
        mo6367b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo6367b() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public <T> T mo6534a(String str, T t) {
        T t2;
        synchronized (this.f5734a) {
            t2 = this.f5734a.get(str);
            if (t2 == null) {
                this.f5734a.put(str, t);
            }
        }
        if (t2 != null) {
            t = t2;
        }
        if (this.f5735b) {
            m7738a((Object) t);
        }
        return t;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public <T> T mo6533a(String str) {
        T t;
        synchronized (this.f5734a) {
            t = this.f5734a.get(str);
        }
        return t;
    }

    /* renamed from: a */
    private static void m7738a(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
