package com.google.android.gms.common.util;

import androidx.annotation.C0195i0;
import androidx.collection.C0635a;
import androidx.collection.C0637b;
import com.google.android.gms.common.annotation.C4056a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@C4056a
/* renamed from: com.google.android.gms.common.util.h */
public final class C4486h {
    private C4486h() {
    }

    @C4056a
    /* renamed from: a */
    public static boolean m19360a(@C0195i0 Collection<?> collection) {
        if (collection == null) {
            return true;
        }
        return collection.isEmpty();
    }

    @C4056a
    @Deprecated
    /* renamed from: b */
    public static <T> Set<T> m19362b(T... tArr) {
        int length = tArr.length;
        if (length == 0) {
            return Collections.emptySet();
        }
        if (length == 1) {
            return Collections.singleton(tArr[0]);
        }
        if (length == 2) {
            T t = tArr[0];
            T t2 = tArr[1];
            Set a = m19358a(2, false);
            a.add(t);
            a.add(t2);
            return Collections.unmodifiableSet(a);
        } else if (length == 3) {
            return m19359a(tArr[0], tArr[1], tArr[2]);
        } else {
            if (length != 4) {
                Set a2 = m19358a(tArr.length, false);
                Collections.addAll(a2, tArr);
                return Collections.unmodifiableSet(a2);
            }
            T t3 = tArr[0];
            T t4 = tArr[1];
            T t5 = tArr[2];
            T t6 = tArr[3];
            Set a3 = m19358a(4, false);
            a3.add(t3);
            a3.add(t4);
            a3.add(t5);
            a3.add(t6);
            return Collections.unmodifiableSet(a3);
        }
    }

    @C4056a
    @Deprecated
    /* renamed from: a */
    public static <T> List<T> m19351a() {
        return Collections.emptyList();
    }

    @C4056a
    @Deprecated
    /* renamed from: a */
    public static <T> List<T> m19352a(T t) {
        return Collections.singletonList(t);
    }

    @C4056a
    @Deprecated
    /* renamed from: a */
    public static <T> List<T> m19353a(T... tArr) {
        int length = tArr.length;
        if (length == 0) {
            return m19351a();
        }
        if (length != 1) {
            return Collections.unmodifiableList(Arrays.asList(tArr));
        }
        return m19352a(tArr[0]);
    }

    /* renamed from: a */
    private static <T> Set<T> m19358a(int i, boolean z) {
        float f = z ? 0.75f : 1.0f;
        if (i <= (z ? 128 : 256)) {
            return new C0637b(i);
        }
        return new HashSet(i, f);
    }

    @C4056a
    @Deprecated
    /* renamed from: a */
    public static <T> Set<T> m19359a(T t, T t2, T t3) {
        Set a = m19358a(3, false);
        a.add(t);
        a.add(t2);
        a.add(t3);
        return Collections.unmodifiableSet(a);
    }

    @C4056a
    /* renamed from: a */
    public static <T> Set<T> m19357a(int i) {
        if (i == 0) {
            return new C0637b();
        }
        return m19358a(i, true);
    }

    @C4056a
    /* renamed from: a */
    public static <K, V> Map<K, V> m19354a(K k, V v, K k2, V v2, K k3, V v3) {
        Map b = m19361b(3, false);
        b.put(k, v);
        b.put(k2, v2);
        b.put(k3, v3);
        return Collections.unmodifiableMap(b);
    }

    @C4056a
    /* renamed from: a */
    public static <K, V> Map<K, V> m19355a(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6) {
        Map b = m19361b(6, false);
        b.put(k, v);
        b.put(k2, v2);
        b.put(k3, v3);
        b.put(k4, v4);
        b.put(k5, v5);
        b.put(k6, v6);
        return Collections.unmodifiableMap(b);
    }

    /* renamed from: b */
    private static <K, V> Map<K, V> m19361b(int i, boolean z) {
        if (i <= 256) {
            return new C0635a(i);
        }
        return new HashMap(i, 1.0f);
    }

    @C4056a
    /* renamed from: a */
    public static <K, V> Map<K, V> m19356a(K[] kArr, V[] vArr) {
        if (kArr.length == vArr.length) {
            int length = kArr.length;
            if (length == 0) {
                return Collections.emptyMap();
            }
            if (length == 1) {
                return Collections.singletonMap(kArr[0], vArr[0]);
            }
            Map b = m19361b(kArr.length, false);
            for (int i = 0; i < kArr.length; i++) {
                b.put(kArr[i], vArr[i]);
            }
            return Collections.unmodifiableMap(b);
        }
        int length2 = kArr.length;
        int length3 = vArr.length;
        StringBuilder sb = new StringBuilder(66);
        sb.append("Key and values array lengths not equal: ");
        sb.append(length2);
        sb.append(" != ");
        sb.append(length3);
        throw new IllegalArgumentException(sb.toString());
    }
}
