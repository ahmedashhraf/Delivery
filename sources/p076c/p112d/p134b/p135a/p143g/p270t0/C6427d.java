package p076c.p112d.p134b.p135a.p143g.p270t0;

import java.io.IOException;
import java.io.Serializable;
import java.util.Collection;
import java.util.Set;

/* renamed from: c.d.b.a.g.t0.d */
/* compiled from: DataStore */
public interface C6427d<V extends Serializable> {
    /* renamed from: a */
    C6427d<V> mo25866a(String str, V v) throws IOException;

    /* renamed from: a */
    C6428e mo25858a();

    /* renamed from: a */
    boolean mo25859a(V v) throws IOException;

    /* renamed from: b */
    V mo25867b(String str) throws IOException;

    /* renamed from: c */
    C6427d<V> mo25869c(String str) throws IOException;

    C6427d<V> clear() throws IOException;

    /* renamed from: d */
    boolean mo25860d(String str) throws IOException;

    String getId();

    boolean isEmpty() throws IOException;

    Set<String> keySet() throws IOException;

    int size() throws IOException;

    Collection<V> values() throws IOException;
}
