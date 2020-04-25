package com.google.common.collect;

import com.google.common.base.C7344g0;
import com.google.common.base.C7397x;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2776b;

@C2776b
@C2775a
/* renamed from: com.google.common.collect.i4 */
/* compiled from: MultimapBuilder */
public abstract class C7900i4<K0, V0> {

    /* renamed from: a */
    private static final int f21638a = 8;

    /* renamed from: com.google.common.collect.i4$a */
    /* compiled from: MultimapBuilder */
    static class C7901a extends C7911k<Object> {

        /* renamed from: b */
        final /* synthetic */ int f21639b;

        C7901a(int i) {
            this.f21639b = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public <K, V> Map<K, Collection<V>> mo30623b() {
            return new HashMap(this.f21639b);
        }
    }

    /* renamed from: com.google.common.collect.i4$b */
    /* compiled from: MultimapBuilder */
    static class C7902b extends C7911k<Object> {

        /* renamed from: b */
        final /* synthetic */ int f21640b;

        C7902b(int i) {
            this.f21640b = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public <K, V> Map<K, Collection<V>> mo30623b() {
            return new LinkedHashMap(this.f21640b);
        }
    }

    /* renamed from: com.google.common.collect.i4$c */
    /* compiled from: MultimapBuilder */
    static class C7903c extends C7911k<K0> {

        /* renamed from: b */
        final /* synthetic */ Comparator f21641b;

        C7903c(Comparator comparator) {
            this.f21641b = comparator;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public <K extends K0, V> Map<K, Collection<V>> mo30623b() {
            return new TreeMap(this.f21641b);
        }
    }

    /* renamed from: com.google.common.collect.i4$d */
    /* compiled from: MultimapBuilder */
    static class C7904d extends C7911k<K0> {

        /* renamed from: b */
        final /* synthetic */ Class f21642b;

        C7904d(Class cls) {
            this.f21642b = cls;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public <K extends K0, V> Map<K, Collection<V>> mo30623b() {
            return new EnumMap(this.f21642b);
        }
    }

    /* renamed from: com.google.common.collect.i4$e */
    /* compiled from: MultimapBuilder */
    private static final class C7905e<V> implements C7344g0<List<V>>, Serializable {

        /* renamed from: a */
        private final int f21643a;

        C7905e(int i) {
            this.f21643a = C8277y.m39484a(i, "expectedValuesPerKey");
        }

        public List<V> get() {
            return new ArrayList(this.f21643a);
        }
    }

    /* renamed from: com.google.common.collect.i4$f */
    /* compiled from: MultimapBuilder */
    private static final class C7906f<V extends Enum<V>> implements C7344g0<Set<V>>, Serializable {

        /* renamed from: a */
        private final Class<V> f21644a;

        C7906f(Class<V> cls) {
            this.f21644a = (Class) C7397x.m35664a(cls);
        }

        public Set<V> get() {
            return EnumSet.noneOf(this.f21644a);
        }
    }

    /* renamed from: com.google.common.collect.i4$g */
    /* compiled from: MultimapBuilder */
    private static final class C7907g<V> implements C7344g0<Set<V>>, Serializable {

        /* renamed from: a */
        private final int f21645a;

        C7907g(int i) {
            this.f21645a = C8277y.m39484a(i, "expectedValuesPerKey");
        }

        public Set<V> get() {
            return new HashSet(this.f21645a);
        }
    }

    /* renamed from: com.google.common.collect.i4$h */
    /* compiled from: MultimapBuilder */
    private static final class C7908h<V> implements C7344g0<Set<V>>, Serializable {

        /* renamed from: a */
        private final int f21646a;

        C7908h(int i) {
            this.f21646a = C8277y.m39484a(i, "expectedValuesPerKey");
        }

        public Set<V> get() {
            return new LinkedHashSet(this.f21646a);
        }
    }

    /* renamed from: com.google.common.collect.i4$i */
    /* compiled from: MultimapBuilder */
    private enum C7909i implements C7344g0<List<Object>> {
        INSTANCE;

        /* renamed from: d */
        public static <V> C7344g0<List<V>> m37796d() {
            return INSTANCE;
        }

        public List<Object> get() {
            return new LinkedList();
        }
    }

    /* renamed from: com.google.common.collect.i4$j */
    /* compiled from: MultimapBuilder */
    public static abstract class C7910j<K0, V0> extends C7900i4<K0, V0> {
        C7910j() {
            super(null);
        }

        /* renamed from: a */
        public abstract <K extends K0, V extends V0> C8283y3<K, V> m37799a();

        /* renamed from: a */
        public <K extends K0, V extends V0> C8283y3<K, V> m37800a(C7886h4<? extends K, ? extends V> h4Var) {
            return (C8283y3) C7900i4.super.mo30622a(h4Var);
        }
    }

    /* renamed from: com.google.common.collect.i4$k */
    /* compiled from: MultimapBuilder */
    public static abstract class C7911k<K0> {

        /* renamed from: a */
        private static final int f21647a = 2;

        /* renamed from: com.google.common.collect.i4$k$a */
        /* compiled from: MultimapBuilder */
        class C7912a extends C7910j<K0, Object> {

            /* renamed from: b */
            final /* synthetic */ int f21648b;

            C7912a(int i) {
                this.f21648b = i;
            }

            /* renamed from: a */
            public <K extends K0, V> C8283y3<K, V> m37813a() {
                return C7936j4.m37991a(C7911k.this.mo30623b(), (C7344g0<? extends List<V>>) new C7905e<Object>(this.f21648b));
            }
        }

        /* renamed from: com.google.common.collect.i4$k$b */
        /* compiled from: MultimapBuilder */
        class C7913b extends C7910j<K0, Object> {
            C7913b() {
            }

            /* renamed from: a */
            public <K extends K0, V> C8283y3<K, V> m37815a() {
                return C7936j4.m37991a(C7911k.this.mo30623b(), C7909i.m37796d());
            }
        }

        /* renamed from: com.google.common.collect.i4$k$c */
        /* compiled from: MultimapBuilder */
        class C7914c extends C7918l<K0, Object> {

            /* renamed from: b */
            final /* synthetic */ int f21651b;

            C7914c(int i) {
                this.f21651b = i;
            }

            /* renamed from: a */
            public <K extends K0, V> C8022l5<K, V> m37817a() {
                return C7936j4.m38010c(C7911k.this.mo30623b(), (C7344g0<? extends Set<V>>) new C7907g<Object>(this.f21651b));
            }
        }

        /* renamed from: com.google.common.collect.i4$k$d */
        /* compiled from: MultimapBuilder */
        class C7915d extends C7918l<K0, Object> {

            /* renamed from: b */
            final /* synthetic */ int f21653b;

            C7915d(int i) {
                this.f21653b = i;
            }

            /* renamed from: a */
            public <K extends K0, V> C8022l5<K, V> m37819a() {
                return C7936j4.m38010c(C7911k.this.mo30623b(), (C7344g0<? extends Set<V>>) new C7908h<Object>(this.f21653b));
            }
        }

        /* renamed from: com.google.common.collect.i4$k$e */
        /* compiled from: MultimapBuilder */
        class C7916e extends C7919m<K0, V0> {

            /* renamed from: b */
            final /* synthetic */ Comparator f21655b;

            C7916e(Comparator comparator) {
                this.f21655b = comparator;
            }

            /* renamed from: a */
            public <K extends K0, V extends V0> C8291y5<K, V> m37822a() {
                return C7936j4.m38014d(C7911k.this.mo30623b(), new C7920n(this.f21655b));
            }
        }

        /* renamed from: com.google.common.collect.i4$k$f */
        /* compiled from: MultimapBuilder */
        class C7917f extends C7918l<K0, V0> {

            /* renamed from: b */
            final /* synthetic */ Class f21657b;

            C7917f(Class cls) {
                this.f21657b = cls;
            }

            /* renamed from: a */
            public <K extends K0, V extends V0> C8022l5<K, V> m37824a() {
                return C7936j4.m38010c(C7911k.this.mo30623b(), (C7344g0<? extends Set<V>>) new C7906f<Object>(this.f21657b));
            }
        }

        C7911k() {
        }

        /* renamed from: a */
        public C7910j<K0, Object> mo30624a() {
            return mo30625a(2);
        }

        /* renamed from: b */
        public C7918l<K0, Object> mo30628b(int i) {
            C8277y.m39484a(i, "expectedValuesPerKey");
            return new C7914c(i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public abstract <K extends K0, V> Map<K, Collection<V>> mo30623b();

        /* renamed from: c */
        public C7918l<K0, Object> mo30629c() {
            return mo30628b(2);
        }

        /* renamed from: d */
        public C7918l<K0, Object> mo30631d() {
            return mo30630c(2);
        }

        /* renamed from: e */
        public C7910j<K0, Object> mo30632e() {
            return new C7913b();
        }

        /* renamed from: f */
        public C7919m<K0, Comparable> mo30633f() {
            return mo30627a((Comparator<V0>) C8133r4.m38943j());
        }

        /* renamed from: a */
        public C7910j<K0, Object> mo30625a(int i) {
            C8277y.m39484a(i, "expectedValuesPerKey");
            return new C7912a(i);
        }

        /* renamed from: c */
        public C7918l<K0, Object> mo30630c(int i) {
            C8277y.m39484a(i, "expectedValuesPerKey");
            return new C7915d(i);
        }

        /* renamed from: a */
        public <V0> C7919m<K0, V0> mo30627a(Comparator<V0> comparator) {
            C7397x.m35665a(comparator, (Object) "comparator");
            return new C7916e(comparator);
        }

        /* renamed from: a */
        public <V0 extends Enum<V0>> C7918l<K0, V0> mo30626a(Class<V0> cls) {
            C7397x.m35665a(cls, (Object) "valueClass");
            return new C7917f(cls);
        }
    }

    /* renamed from: com.google.common.collect.i4$l */
    /* compiled from: MultimapBuilder */
    public static abstract class C7918l<K0, V0> extends C7900i4<K0, V0> {
        C7918l() {
            super(null);
        }

        /* renamed from: a */
        public abstract <K extends K0, V extends V0> C8022l5<K, V> m37827a();

        /* renamed from: a */
        public <K extends K0, V extends V0> C8022l5<K, V> m37828a(C7886h4<? extends K, ? extends V> h4Var) {
            return (C8022l5) C7900i4.super.mo30622a(h4Var);
        }
    }

    /* renamed from: com.google.common.collect.i4$m */
    /* compiled from: MultimapBuilder */
    public static abstract class C7919m<K0, V0> extends C7918l<K0, V0> {
        C7919m() {
        }

        /* renamed from: a */
        public abstract <K extends K0, V extends V0> C8291y5<K, V> m37833a();

        /* renamed from: a */
        public <K extends K0, V extends V0> C8291y5<K, V> m37834a(C7886h4<? extends K, ? extends V> h4Var) {
            return (C8291y5) super.mo30622a((C7886h4) h4Var);
        }
    }

    /* renamed from: com.google.common.collect.i4$n */
    /* compiled from: MultimapBuilder */
    private static final class C7920n<V> implements C7344g0<SortedSet<V>>, Serializable {

        /* renamed from: a */
        private final Comparator<? super V> f21659a;

        C7920n(Comparator<? super V> comparator) {
            this.f21659a = (Comparator) C7397x.m35664a(comparator);
        }

        public SortedSet<V> get() {
            return new TreeSet(this.f21659a);
        }
    }

    /* synthetic */ C7900i4(C7901a aVar) {
        this();
    }

    /* renamed from: a */
    public static C7911k<Object> m37783a(int i) {
        C8277y.m39484a(i, "expectedKeys");
        return new C7901a(i);
    }

    /* renamed from: b */
    public static C7911k<Object> m37786b() {
        return m37783a(8);
    }

    /* renamed from: c */
    public static C7911k<Object> m37788c() {
        return m37787b(8);
    }

    /* renamed from: d */
    public static C7911k<Comparable> m37789d() {
        return m37785a((Comparator<K0>) C8133r4.m38943j());
    }

    /* renamed from: a */
    public abstract <K extends K0, V extends V0> C7886h4<K, V> mo30621a();

    private C7900i4() {
    }

    /* renamed from: b */
    public static C7911k<Object> m37787b(int i) {
        C8277y.m39484a(i, "expectedKeys");
        return new C7902b(i);
    }

    /* renamed from: a */
    public static <K0> C7911k<K0> m37785a(Comparator<K0> comparator) {
        C7397x.m35664a(comparator);
        return new C7903c(comparator);
    }

    /* renamed from: a */
    public static <K0 extends Enum<K0>> C7911k<K0> m37784a(Class<K0> cls) {
        C7397x.m35664a(cls);
        return new C7904d(cls);
    }

    /* renamed from: a */
    public <K extends K0, V extends V0> C7886h4<K, V> mo30622a(C7886h4<? extends K, ? extends V> h4Var) {
        C7886h4<K, V> a = mo30621a();
        a.mo29701a(h4Var);
        return a;
    }
}
