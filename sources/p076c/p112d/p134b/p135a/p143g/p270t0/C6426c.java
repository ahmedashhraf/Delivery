package p076c.p112d.p134b.p135a.p143g.p270t0;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p076c.p112d.p134b.p135a.p143g.C6364b0;
import p076c.p112d.p134b.p135a.p143g.C6381h0;
import p076c.p112d.p134b.p135a.p143g.C6423t;
import p076c.p112d.p134b.p135a.p143g.C6436w;

/* renamed from: c.d.b.a.g.t0.c */
/* compiled from: AbstractMemoryDataStore */
class C6426c<V extends Serializable> extends C6424a<V> {

    /* renamed from: c */
    private final Lock f17903c = new ReentrantLock();

    /* renamed from: d */
    HashMap<String, byte[]> f17904d = C6364b0.m29631a();

    protected C6426c(C6428e eVar, String str) {
        super(eVar, str);
    }

    /* renamed from: a */
    public final C6427d<V> mo25866a(String str, V v) throws IOException {
        C6381h0.m29663a(str);
        C6381h0.m29663a(v);
        this.f17903c.lock();
        try {
            this.f17904d.put(str, C6423t.m29821a((Object) v));
            mo25868b();
            return this;
        } finally {
            this.f17903c.unlock();
        }
    }

    /* renamed from: b */
    public final V mo25867b(String str) throws IOException {
        if (str == null) {
            return null;
        }
        this.f17903c.lock();
        try {
            return C6423t.m29816a((byte[]) this.f17904d.get(str));
        } finally {
            this.f17903c.unlock();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo25868b() throws IOException {
    }

    /* renamed from: c */
    public C6427d<V> mo25869c(String str) throws IOException {
        if (str == null) {
            return this;
        }
        this.f17903c.lock();
        try {
            this.f17904d.remove(str);
            mo25868b();
            return this;
        } finally {
            this.f17903c.unlock();
        }
    }

    public final C6427d<V> clear() throws IOException {
        this.f17903c.lock();
        try {
            this.f17904d.clear();
            mo25868b();
            return this;
        } finally {
            this.f17903c.unlock();
        }
    }

    /* renamed from: d */
    public boolean mo25860d(String str) throws IOException {
        if (str == null) {
            return false;
        }
        this.f17903c.lock();
        try {
            return this.f17904d.containsKey(str);
        } finally {
            this.f17903c.unlock();
        }
    }

    public boolean isEmpty() throws IOException {
        this.f17903c.lock();
        try {
            return this.f17904d.isEmpty();
        } finally {
            this.f17903c.unlock();
        }
    }

    public final Set<String> keySet() throws IOException {
        this.f17903c.lock();
        try {
            return Collections.unmodifiableSet(this.f17904d.keySet());
        } finally {
            this.f17903c.unlock();
        }
    }

    public int size() throws IOException {
        this.f17903c.lock();
        try {
            return this.f17904d.size();
        } finally {
            this.f17903c.unlock();
        }
    }

    public String toString() {
        return C6429f.m29840a(this);
    }

    public final Collection<V> values() throws IOException {
        this.f17903c.lock();
        try {
            ArrayList a = C6436w.m29853a();
            for (byte[] a2 : this.f17904d.values()) {
                a.add(C6423t.m29816a(a2));
            }
            return Collections.unmodifiableList(a);
        } finally {
            this.f17903c.unlock();
        }
    }

    /* renamed from: a */
    public boolean mo25859a(V v) throws IOException {
        if (v == null) {
            return false;
        }
        this.f17903c.lock();
        try {
            byte[] a = C6423t.m29821a((Object) v);
            for (byte[] equals : this.f17904d.values()) {
                if (Arrays.equals(a, equals)) {
                    return true;
                }
            }
            this.f17903c.unlock();
            return false;
        } finally {
            this.f17903c.unlock();
        }
    }
}
