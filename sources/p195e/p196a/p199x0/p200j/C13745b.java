package p195e.p196a.p199x0.p200j;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p195e.p196a.p449w0.C12339o;

/* renamed from: e.a.x0.j.b */
/* compiled from: ArrayListSupplier */
public enum C13745b implements Callable<List<Object>>, C12339o<Object, List<Object>> {
    INSTANCE;

    /* renamed from: d */
    public static <T> Callable<List<T>> m58690d() {
        return INSTANCE;
    }

    /* renamed from: e */
    public static <T, O> C12339o<O, List<T>> m58691e() {
        return INSTANCE;
    }

    public List<Object> apply(Object obj) throws Exception {
        return new ArrayList();
    }

    public List<Object> call() throws Exception {
        return new ArrayList();
    }
}
