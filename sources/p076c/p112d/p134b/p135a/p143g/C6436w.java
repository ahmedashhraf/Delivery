package p076c.p112d.p134b.p135a.p143g;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: c.d.b.a.g.w */
/* compiled from: Lists */
public final class C6436w {
    private C6436w() {
    }

    /* renamed from: a */
    public static <E> ArrayList<E> m29853a() {
        return new ArrayList<>();
    }

    /* renamed from: a */
    public static <E> ArrayList<E> m29854a(int i) {
        return new ArrayList<>(i);
    }

    /* renamed from: a */
    public static <E> ArrayList<E> m29855a(Iterable<? extends E> iterable) {
        return iterable instanceof Collection ? new ArrayList<>(C6396m.m29714a(iterable)) : m29856a(iterable.iterator());
    }

    /* renamed from: a */
    public static <E> ArrayList<E> m29856a(Iterator<? extends E> it) {
        ArrayList<E> a = m29853a();
        while (it.hasNext()) {
            a.add(it.next());
        }
        return a;
    }
}
