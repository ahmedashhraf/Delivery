package p195e.p196a.p199x0.p200j;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: e.a.x0.j.m */
/* compiled from: HashMapSupplier */
public enum C13757m implements Callable<Map<Object, Object>> {
    INSTANCE;

    /* renamed from: d */
    public static <K, V> Callable<Map<K, V>> m58731d() {
        return INSTANCE;
    }

    public Map<Object, Object> call() throws Exception {
        return new HashMap();
    }
}
