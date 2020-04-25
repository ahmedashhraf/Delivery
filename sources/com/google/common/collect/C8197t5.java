package com.google.common.collect;

import com.google.common.base.C7380p;
import com.google.common.base.C7397x;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b
@C2775a
/* renamed from: com.google.common.collect.t5 */
/* compiled from: SortedLists */
final class C8197t5 {

    /* renamed from: com.google.common.collect.t5$b */
    /* compiled from: SortedLists */
    public enum C8199b {
        NEXT_LOWER {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public int mo31096a(int i) {
                return i - 1;
            }
        },
        NEXT_HIGHER {
            /* renamed from: a */
            public int mo31096a(int i) {
                return i;
            }
        },
        INVERTED_INSERTION_INDEX {
            /* renamed from: a */
            public int mo31096a(int i) {
                return i ^ -1;
            }
        };

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract int mo31096a(int i);
    }

    /* renamed from: com.google.common.collect.t5$c */
    /* compiled from: SortedLists */
    public enum C8203c {
        ANY_PRESENT {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public <E> int mo31097a(Comparator<? super E> comparator, E e, List<? extends E> list, int i) {
                return i;
            }
        },
        LAST_PRESENT {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public <E> int mo31097a(Comparator<? super E> comparator, E e, List<? extends E> list, int i) {
                int size = list.size() - 1;
                while (i < size) {
                    int i2 = ((i + size) + 1) >>> 1;
                    if (comparator.compare(list.get(i2), e) > 0) {
                        size = i2 - 1;
                    } else {
                        i = i2;
                    }
                }
                return i;
            }
        },
        FIRST_PRESENT {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public <E> int mo31097a(Comparator<? super E> comparator, E e, List<? extends E> list, int i) {
                int i2 = 0;
                while (i2 < i) {
                    int i3 = (i2 + i) >>> 1;
                    if (comparator.compare(list.get(i3), e) < 0) {
                        i2 = i3 + 1;
                    } else {
                        i = i3;
                    }
                }
                return i2;
            }
        },
        FIRST_AFTER {
            /* renamed from: a */
            public <E> int mo31097a(Comparator<? super E> comparator, E e, List<? extends E> list, int i) {
                return C8203c.LAST_PRESENT.mo31097a(comparator, e, list, i) + 1;
            }
        },
        LAST_BEFORE {
            /* renamed from: a */
            public <E> int mo31097a(Comparator<? super E> comparator, E e, List<? extends E> list, int i) {
                return C8203c.FIRST_PRESENT.mo31097a(comparator, e, list, i) - 1;
            }
        };

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract <E> int mo31097a(Comparator<? super E> comparator, E e, List<? extends E> list, int i);
    }

    private C8197t5() {
    }

    /* renamed from: a */
    public static <E extends Comparable> int m39154a(List<? extends E> list, E e, C8203c cVar, C8199b bVar) {
        C7397x.m35664a(e);
        return m39155a(list, (E) C7397x.m35664a(e), (Comparator<? super E>) C8133r4.m38943j(), cVar, bVar);
    }

    /* renamed from: a */
    public static <E, K extends Comparable> int m39152a(List<E> list, C7380p<? super E, K> pVar, @C5952h K k, C8203c cVar, C8199b bVar) {
        return m39153a(list, pVar, k, C8133r4.m38943j(), cVar, bVar);
    }

    /* renamed from: a */
    public static <E, K> int m39153a(List<E> list, C7380p<? super E, K> pVar, @C5952h K k, Comparator<? super K> comparator, C8203c cVar, C8199b bVar) {
        return m39155a(C8309z3.m39657a(list, pVar), (E) k, comparator, cVar, bVar);
    }

    /* renamed from: a */
    public static <E> int m39155a(List<? extends E> list, @C5952h E e, Comparator<? super E> comparator, C8203c cVar, C8199b bVar) {
        C7397x.m35664a(comparator);
        C7397x.m35664a(list);
        C7397x.m35664a(cVar);
        C7397x.m35664a(bVar);
        if (!(list instanceof RandomAccess)) {
            list = C8309z3.m39665b((Iterable<? extends E>) list);
        }
        int i = 0;
        int size = list.size() - 1;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            int compare = comparator.compare(e, list.get(i2));
            if (compare < 0) {
                size = i2 - 1;
            } else if (compare <= 0) {
                return i + cVar.mo31097a(comparator, e, list.subList(i, size + 1), i2 - i);
            } else {
                i = i2 + 1;
            }
        }
        return bVar.mo31096a(i);
    }
}
