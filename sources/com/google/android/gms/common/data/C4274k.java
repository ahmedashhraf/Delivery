package com.google.android.gms.common.data;

import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.data.k */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class C4274k {
    /* renamed from: a */
    public static <T, E extends C4273j<T>> ArrayList<T> m18470a(ArrayList<E> arrayList) {
        ArrayList<T> arrayList2 = new ArrayList<>(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(((C4273j) arrayList.get(i)).mo18089b());
        }
        return arrayList2;
    }

    /* renamed from: a */
    public static <T, E extends C4273j<T>> ArrayList<T> m18471a(E[] eArr) {
        ArrayList<T> arrayList = new ArrayList<>(eArr.length);
        for (E b : eArr) {
            arrayList.add(b.mo18089b());
        }
        return arrayList;
    }

    /* renamed from: a */
    public static <T, E extends C4273j<T>> ArrayList<T> m18469a(Iterable<E> iterable) {
        ArrayList<T> arrayList = new ArrayList<>();
        for (E b : iterable) {
            arrayList.add(b.mo18089b());
        }
        return arrayList;
    }
}
