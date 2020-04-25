package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.j6 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
final class C4821j6 {

    /* renamed from: a */
    private static final Class<?> f14223a = m20434d();

    /* renamed from: b */
    private static final C5074z6<?, ?> f14224b = m20409a(false);

    /* renamed from: c */
    private static final C5074z6<?, ?> f14225c = m20409a(true);

    /* renamed from: d */
    private static final C5074z6<?, ?> f14226d = new C4685a7();

    /* renamed from: a */
    public static void m20418a(Class<?> cls) {
        if (!C4801i4.class.isAssignableFrom(cls)) {
            Class<?> cls2 = f14223a;
            if (cls2 != null && !cls2.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            }
        }
    }

    /* renamed from: b */
    public static void m20427b(int i, List<Float> list, C5036w7 w7Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            w7Var.mo19440n(i, list, z);
        }
    }

    /* renamed from: c */
    public static void m20431c(int i, List<Long> list, C5036w7 w7Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            w7Var.mo19426d(i, list, z);
        }
    }

    /* renamed from: d */
    public static void m20435d(int i, List<Long> list, C5036w7 w7Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            w7Var.mo19437k(i, list, z);
        }
    }

    /* renamed from: e */
    public static void m20439e(int i, List<Long> list, C5036w7 w7Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            w7Var.mo19436j(i, list, z);
        }
    }

    /* renamed from: f */
    public static void m20442f(int i, List<Long> list, C5036w7 w7Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            w7Var.mo19435i(i, list, z);
        }
    }

    /* renamed from: g */
    public static void m20445g(int i, List<Long> list, C5036w7 w7Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            w7Var.mo19430e(i, list, z);
        }
    }

    /* renamed from: h */
    public static void m20448h(int i, List<Integer> list, C5036w7 w7Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            w7Var.mo19420b(i, list, z);
        }
    }

    /* renamed from: i */
    public static void m20451i(int i, List<Integer> list, C5036w7 w7Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            w7Var.mo19433g(i, list, z);
        }
    }

    /* renamed from: j */
    public static void m20454j(int i, List<Integer> list, C5036w7 w7Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            w7Var.mo19438l(i, list, z);
        }
    }

    /* renamed from: k */
    public static void m20455k(int i, List<Integer> list, C5036w7 w7Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            w7Var.mo19432f(i, list, z);
        }
    }

    /* renamed from: l */
    public static void m20456l(int i, List<Integer> list, C5036w7 w7Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            w7Var.mo19434h(i, list, z);
        }
    }

    /* renamed from: m */
    public static void m20457m(int i, List<Integer> list, C5036w7 w7Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            w7Var.mo19423c(i, list, z);
        }
    }

    /* renamed from: n */
    public static void m20458n(int i, List<Boolean> list, C5036w7 w7Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            w7Var.mo19413a(i, list, z);
        }
    }

    /* renamed from: b */
    public static void m20425b(int i, List<C5070z2> list, C5036w7 w7Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            w7Var.mo19411a(i, list);
        }
    }

    /* renamed from: c */
    static int m20429c(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4757f5) {
            C4757f5 f5Var = (C4757f5) list;
            i = 0;
            while (i2 < size) {
                i += zzek.m21951f(f5Var.mo18983e(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzek.m21951f(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: d */
    static int m20433d(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4833k4) {
            C4833k4 k4Var = (C4833k4) list;
            i = 0;
            while (i2 < size) {
                i += zzek.m21965k(k4Var.mo19169f(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzek.m21965k(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: e */
    static int m20437e(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4833k4) {
            C4833k4 k4Var = (C4833k4) list;
            i = 0;
            while (i2 < size) {
                i += zzek.m21948f(k4Var.mo19169f(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzek.m21948f(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: f */
    static int m20441f(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4833k4) {
            C4833k4 k4Var = (C4833k4) list;
            i = 0;
            while (i2 < size) {
                i += zzek.m21952g(k4Var.mo19169f(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzek.m21952g(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: g */
    static int m20444g(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4833k4) {
            C4833k4 k4Var = (C4833k4) list;
            i = 0;
            while (i2 < size) {
                i += zzek.m21956h(k4Var.mo19169f(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzek.m21956h(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: h */
    static int m20447h(List<?> list) {
        return list.size() << 2;
    }

    /* renamed from: i */
    static int m20450i(List<?> list) {
        return list.size() << 3;
    }

    /* renamed from: j */
    static int m20453j(List<?> list) {
        return list.size();
    }

    /* renamed from: a */
    public static void m20414a(int i, List<Double> list, C5036w7 w7Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            w7Var.mo19439m(i, list, z);
        }
    }

    /* renamed from: h */
    static int m20446h(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzek.m21961i(i, 0);
    }

    /* renamed from: i */
    static int m20449i(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzek.m21954g(i, 0);
    }

    /* renamed from: j */
    static int m20452j(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzek.m21932b(i, true);
    }

    /* renamed from: b */
    public static void m20426b(int i, List<?> list, C5036w7 w7Var, C4790h6 h6Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            w7Var.mo19419b(i, list, h6Var);
        }
    }

    /* renamed from: a */
    public static void m20412a(int i, List<String> list, C5036w7 w7Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            w7Var.mo19418b(i, list);
        }
    }

    /* renamed from: b */
    static int m20423b(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4757f5) {
            C4757f5 f5Var = (C4757f5) list;
            i = 0;
            while (i2 < size) {
                i += zzek.m21947e(f5Var.mo18983e(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzek.m21947e(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: a */
    public static void m20413a(int i, List<?> list, C5036w7 w7Var, C4790h6 h6Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            w7Var.mo19412a(i, list, h6Var);
        }
    }

    /* renamed from: c */
    static int m20428c(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m20429c(list) + (size * zzek.m21945e(i));
    }

    /* renamed from: d */
    static int m20432d(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m20433d(list) + (size * zzek.m21945e(i));
    }

    /* renamed from: e */
    static int m20436e(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m20437e(list) + (size * zzek.m21945e(i));
    }

    /* renamed from: f */
    static int m20440f(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m20441f(list) + (size * zzek.m21945e(i));
    }

    /* renamed from: g */
    static int m20443g(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m20444g(list) + (size * zzek.m21945e(i));
    }

    /* renamed from: a */
    static int m20407a(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4757f5) {
            C4757f5 f5Var = (C4757f5) list;
            i = 0;
            while (i2 < size) {
                i += zzek.m21944d(f5Var.mo18983e(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzek.m21944d(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: c */
    public static C5074z6<?, ?> m20430c() {
        return f14226d;
    }

    /* renamed from: d */
    private static Class<?> m20434d() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: e */
    private static Class<?> m20438e() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    static int m20422b(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m20423b(list) + (size * zzek.m21945e(i));
    }

    /* renamed from: a */
    static int m20406a(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return m20407a(list) + (list.size() * zzek.m21945e(i));
    }

    /* renamed from: b */
    static int m20420b(int i, List<C5070z2> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e = size * zzek.m21945e(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            e += zzek.m21934b((C5070z2) list.get(i2));
        }
        return e;
    }

    /* renamed from: a */
    static int m20404a(int i, List<?> list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int e = zzek.m21945e(i) * size;
        if (list instanceof C5046x4) {
            C5046x4 x4Var = (C5046x4) list;
            while (i4 < size) {
                Object e2 = x4Var.mo18921e(i4);
                if (e2 instanceof C5070z2) {
                    i3 = zzek.m21934b((C5070z2) e2);
                } else {
                    i3 = zzek.m21935b((String) e2);
                }
                e += i3;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof C5070z2) {
                    i2 = zzek.m21934b((C5070z2) obj);
                } else {
                    i2 = zzek.m21935b((String) obj);
                }
                e += i2;
                i4++;
            }
        }
        return e;
    }

    /* renamed from: b */
    static int m20421b(int i, List<C4945r5> list, C4790h6 h6Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zzek.m21938c(i, (C4945r5) list.get(i3), h6Var);
        }
        return i2;
    }

    /* renamed from: b */
    public static C5074z6<?, ?> m20424b() {
        return f14225c;
    }

    /* renamed from: a */
    static int m20403a(int i, Object obj, C4790h6 h6Var) {
        if (obj instanceof C5020v4) {
            return zzek.m21920a(i, (C5020v4) obj);
        }
        return zzek.m21929b(i, (C4945r5) obj, h6Var);
    }

    /* renamed from: a */
    static int m20405a(int i, List<?> list, C4790h6 h6Var) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e = zzek.m21945e(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof C5020v4) {
                i2 = zzek.m21922a((C5020v4) obj);
            } else {
                i2 = zzek.m21921a((C4945r5) obj, h6Var);
            }
            e += i2;
        }
        return e;
    }

    /* renamed from: a */
    public static C5074z6<?, ?> m20408a() {
        return f14224b;
    }

    /* renamed from: a */
    private static C5074z6<?, ?> m20409a(boolean z) {
        try {
            Class e = m20438e();
            if (e == null) {
                return null;
            }
            return (C5074z6) e.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    static boolean m20419a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: a */
    static <T> void m20415a(C4834k5 k5Var, T t, T t2, long j) {
        C4759f7.m20151a((Object) t, j, k5Var.mo19174a(C4759f7.m20173f(t, j), C4759f7.m20173f(t2, j)));
    }

    /* renamed from: a */
    static <T, FT extends C5071z3<FT>> void m20416a(C5032w3<FT> w3Var, T t, T t2) {
        C5045x3 a = w3Var.mo19711a((Object) t2);
        if (!a.f14506a.isEmpty()) {
            w3Var.mo19718b(t).mo19740a(a);
        }
    }

    /* renamed from: a */
    static <T, UT, UB> void m20417a(C5074z6<UT, UB> z6Var, T t, T t2) {
        z6Var.mo18836a((Object) t, z6Var.mo18843c(z6Var.mo18838b(t), z6Var.mo18838b(t2)));
    }

    /* renamed from: a */
    static <UT, UB> UB m20411a(int i, List<Integer> list, C4899o4 o4Var, UB ub, C5074z6<UT, UB> z6Var) {
        UB ub2;
        if (o4Var == null) {
            return ub;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            loop1:
            while (true) {
                ub2 = ub;
                while (it.hasNext()) {
                    int intValue = ((Integer) it.next()).intValue();
                    if (!o4Var.mo19348a(intValue)) {
                        ub = m20410a(i, intValue, ub2, z6Var);
                        it.remove();
                    }
                }
                break loop1;
            }
        } else {
            int size = list.size();
            ub2 = ub;
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue2 = ((Integer) list.get(i3)).intValue();
                if (o4Var.mo19348a(intValue2)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue2));
                    }
                    i2++;
                } else {
                    ub2 = m20410a(i, intValue2, ub2, z6Var);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        }
        return ub2;
    }

    /* renamed from: a */
    static <UT, UB> UB m20410a(int i, int i2, UB ub, C5074z6<UT, UB> z6Var) {
        if (ub == null) {
            ub = z6Var.mo18829a();
        }
        z6Var.mo18832a(ub, i, (long) i2);
        return ub;
    }
}
