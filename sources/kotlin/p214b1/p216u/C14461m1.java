package kotlin.p214b1.p216u;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import kotlin.C6101i;
import kotlin.p214b1.p215t.C6069a;
import kotlin.p214b1.p215t.C6070b;
import kotlin.p214b1.p215t.C6071c;
import kotlin.p214b1.p215t.C6072d;
import kotlin.p214b1.p215t.C6073e;
import kotlin.p214b1.p215t.C6074f;
import kotlin.p214b1.p215t.C6075g;
import kotlin.p214b1.p215t.C6076h;
import kotlin.p214b1.p215t.C6077i;
import kotlin.p214b1.p215t.C6078j;
import kotlin.p214b1.p215t.C6079k;
import kotlin.p214b1.p215t.C6080l;
import kotlin.p214b1.p215t.C6081m;
import kotlin.p214b1.p215t.C6082n;
import kotlin.p214b1.p215t.C6083o;
import kotlin.p214b1.p215t.C6084p;
import kotlin.p214b1.p215t.C6085q;
import kotlin.p214b1.p215t.C6086r;
import kotlin.p214b1.p215t.C6087s;
import kotlin.p214b1.p215t.C6088t;
import kotlin.p214b1.p215t.C6089u;
import kotlin.p214b1.p215t.C6090v;
import kotlin.p214b1.p215t.C6091w;
import kotlin.p214b1.p216u.p500n1.C14464a;
import kotlin.p214b1.p216u.p500n1.C14465b;
import kotlin.p214b1.p216u.p500n1.C14466c;
import kotlin.p214b1.p216u.p500n1.C14467d;
import kotlin.p214b1.p216u.p500n1.C14468e;
import kotlin.p214b1.p216u.p500n1.C14469f;
import kotlin.p214b1.p216u.p500n1.C14470g;
import kotlin.p214b1.p216u.p500n1.C14470g.C14471a;
import kotlin.p214b1.p216u.p500n1.C14472h;

/* renamed from: kotlin.b1.u.m1 */
/* compiled from: TypeIntrinsics */
public class C14461m1 {
    /* renamed from: a */
    private static <T extends Throwable> T m62530a(T t) {
        return C14445h0.m62448a(t, C14461m1.class.getName());
    }

    /* renamed from: b */
    public static Iterable m62534b(Object obj) {
        if ((obj instanceof C14464a) && !(obj instanceof C14466c)) {
            m62550i(obj, "kotlin.collections.MutableIterable");
        }
        return m62551j(obj);
    }

    /* renamed from: c */
    public static Iterator m62537c(Object obj) {
        if ((obj instanceof C14464a) && !(obj instanceof C14467d)) {
            m62550i(obj, "kotlin.collections.MutableIterator");
        }
        return m62552k(obj);
    }

    /* renamed from: d */
    public static List m62539d(Object obj) {
        if ((obj instanceof C14464a) && !(obj instanceof C14468e)) {
            m62550i(obj, "kotlin.collections.MutableList");
        }
        return m62553l(obj);
    }

    /* renamed from: e */
    public static ListIterator m62541e(Object obj) {
        if ((obj instanceof C14464a) && !(obj instanceof C14469f)) {
            m62550i(obj, "kotlin.collections.MutableListIterator");
        }
        return m62554m(obj);
    }

    /* renamed from: f */
    public static Map m62543f(Object obj) {
        if ((obj instanceof C14464a) && !(obj instanceof C14470g)) {
            m62550i(obj, "kotlin.collections.MutableMap");
        }
        return m62555n(obj);
    }

    /* renamed from: g */
    public static Entry m62545g(Object obj) {
        if ((obj instanceof C14464a) && !(obj instanceof C14471a)) {
            m62550i(obj, "kotlin.collections.MutableMap.MutableEntry");
        }
        return m62556o(obj);
    }

    /* renamed from: h */
    public static Set m62547h(Object obj) {
        if ((obj instanceof C14464a) && !(obj instanceof C14472h)) {
            m62550i(obj, "kotlin.collections.MutableSet");
        }
        return m62557p(obj);
    }

    /* renamed from: i */
    public static void m62550i(Object obj, String str) {
        String name = obj == null ? "null" : obj.getClass().getName();
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(" cannot be cast to ");
        sb.append(str);
        m62533a(sb.toString());
    }

    /* renamed from: j */
    public static Iterable m62551j(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e) {
            throw m62527a(e);
        }
    }

    /* renamed from: k */
    public static Iterator m62552k(Object obj) {
        try {
            return (Iterator) obj;
        } catch (ClassCastException e) {
            throw m62527a(e);
        }
    }

    /* renamed from: l */
    public static List m62553l(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e) {
            throw m62527a(e);
        }
    }

    /* renamed from: m */
    public static ListIterator m62554m(Object obj) {
        try {
            return (ListIterator) obj;
        } catch (ClassCastException e) {
            throw m62527a(e);
        }
    }

    /* renamed from: n */
    public static Map m62555n(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e) {
            throw m62527a(e);
        }
    }

    /* renamed from: o */
    public static Entry m62556o(Object obj) {
        try {
            return (Entry) obj;
        } catch (ClassCastException e) {
            throw m62527a(e);
        }
    }

    /* renamed from: p */
    public static Set m62557p(Object obj) {
        try {
            return (Set) obj;
        } catch (ClassCastException e) {
            throw m62527a(e);
        }
    }

    /* renamed from: q */
    public static int m62558q(Object obj) {
        if (obj instanceof C14416a0) {
            return ((C14416a0) obj).getArity();
        }
        if (obj instanceof C6069a) {
            return 0;
        }
        if (obj instanceof C6080l) {
            return 1;
        }
        if (obj instanceof C6084p) {
            return 2;
        }
        if (obj instanceof C6085q) {
            return 3;
        }
        if (obj instanceof C6086r) {
            return 4;
        }
        if (obj instanceof C6087s) {
            return 5;
        }
        if (obj instanceof C6088t) {
            return 6;
        }
        if (obj instanceof C6089u) {
            return 7;
        }
        if (obj instanceof C6090v) {
            return 8;
        }
        if (obj instanceof C6091w) {
            return 9;
        }
        if (obj instanceof C6070b) {
            return 10;
        }
        if (obj instanceof C6071c) {
            return 11;
        }
        if (obj instanceof C6072d) {
            return 12;
        }
        if (obj instanceof C6073e) {
            return 13;
        }
        if (obj instanceof C6074f) {
            return 14;
        }
        if (obj instanceof C6075g) {
            return 15;
        }
        if (obj instanceof C6076h) {
            return 16;
        }
        if (obj instanceof C6077i) {
            return 17;
        }
        if (obj instanceof C6078j) {
            return 18;
        }
        if (obj instanceof C6079k) {
            return 19;
        }
        if (obj instanceof C6081m) {
            return 20;
        }
        if (obj instanceof C6082n) {
            return 21;
        }
        return obj instanceof C6083o ? 22 : -1;
    }

    /* renamed from: r */
    public static boolean m62559r(Object obj) {
        return (obj instanceof Collection) && (!(obj instanceof C14464a) || (obj instanceof C14465b));
    }

    /* renamed from: s */
    public static boolean m62560s(Object obj) {
        return (obj instanceof Iterable) && (!(obj instanceof C14464a) || (obj instanceof C14466c));
    }

    /* renamed from: t */
    public static boolean m62561t(Object obj) {
        return (obj instanceof Iterator) && (!(obj instanceof C14464a) || (obj instanceof C14467d));
    }

    /* renamed from: u */
    public static boolean m62562u(Object obj) {
        return (obj instanceof List) && (!(obj instanceof C14464a) || (obj instanceof C14468e));
    }

    /* renamed from: v */
    public static boolean m62563v(Object obj) {
        return (obj instanceof ListIterator) && (!(obj instanceof C14464a) || (obj instanceof C14469f));
    }

    /* renamed from: w */
    public static boolean m62564w(Object obj) {
        return (obj instanceof Map) && (!(obj instanceof C14464a) || (obj instanceof C14470g));
    }

    /* renamed from: x */
    public static boolean m62565x(Object obj) {
        return (obj instanceof Entry) && (!(obj instanceof C14464a) || (obj instanceof C14471a));
    }

    /* renamed from: y */
    public static boolean m62566y(Object obj) {
        return (obj instanceof Set) && (!(obj instanceof C14464a) || (obj instanceof C14472h));
    }

    /* renamed from: a */
    public static void m62533a(String str) {
        throw m62527a(new ClassCastException(str));
    }

    /* renamed from: a */
    public static ClassCastException m62527a(ClassCastException classCastException) {
        throw ((ClassCastException) m62530a((T) classCastException));
    }

    /* renamed from: i */
    public static Collection m62549i(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e) {
            throw m62527a(e);
        }
    }

    /* renamed from: a */
    public static Collection m62531a(Object obj) {
        if ((obj instanceof C14464a) && !(obj instanceof C14465b)) {
            m62550i(obj, "kotlin.collections.MutableCollection");
        }
        return m62549i(obj);
    }

    /* renamed from: b */
    public static Iterable m62535b(Object obj, String str) {
        if ((obj instanceof C14464a) && !(obj instanceof C14466c)) {
            m62533a(str);
        }
        return m62551j(obj);
    }

    /* renamed from: c */
    public static Iterator m62538c(Object obj, String str) {
        if ((obj instanceof C14464a) && !(obj instanceof C14467d)) {
            m62533a(str);
        }
        return m62552k(obj);
    }

    /* renamed from: d */
    public static List m62540d(Object obj, String str) {
        if ((obj instanceof C14464a) && !(obj instanceof C14468e)) {
            m62533a(str);
        }
        return m62553l(obj);
    }

    /* renamed from: e */
    public static ListIterator m62542e(Object obj, String str) {
        if ((obj instanceof C14464a) && !(obj instanceof C14469f)) {
            m62533a(str);
        }
        return m62554m(obj);
    }

    /* renamed from: f */
    public static Map m62544f(Object obj, String str) {
        if ((obj instanceof C14464a) && !(obj instanceof C14470g)) {
            m62533a(str);
        }
        return m62555n(obj);
    }

    /* renamed from: g */
    public static Entry m62546g(Object obj, String str) {
        if ((obj instanceof C14464a) && !(obj instanceof C14471a)) {
            m62533a(str);
        }
        return m62556o(obj);
    }

    /* renamed from: h */
    public static Set m62548h(Object obj, String str) {
        if ((obj instanceof C14464a) && !(obj instanceof C14472h)) {
            m62533a(str);
        }
        return m62557p(obj);
    }

    /* renamed from: a */
    public static Collection m62532a(Object obj, String str) {
        if ((obj instanceof C14464a) && !(obj instanceof C14465b)) {
            m62533a(str);
        }
        return m62549i(obj);
    }

    /* renamed from: b */
    public static boolean m62536b(Object obj, int i) {
        return (obj instanceof C6101i) && m62558q(obj) == i;
    }

    /* renamed from: a */
    public static Object m62528a(Object obj, int i) {
        if (obj != null && !m62536b(obj, i)) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.functions.Function");
            sb.append(i);
            m62550i(obj, sb.toString());
        }
        return obj;
    }

    /* renamed from: a */
    public static Object m62529a(Object obj, int i, String str) {
        if (obj != null && !m62536b(obj, i)) {
            m62533a(str);
        }
        return obj;
    }
}
