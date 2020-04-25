package kotlin.p214b1.p216u;

import kotlin.C6096e0;
import kotlin.p505f1.C14540c;
import kotlin.p505f1.C14543e;
import kotlin.p505f1.C14544f;
import kotlin.p505f1.C14548h;
import kotlin.p505f1.C14550i;
import kotlin.p505f1.C14552j;
import kotlin.p505f1.C14561m;
import kotlin.p505f1.C14563n;
import kotlin.p505f1.C14565o;

/* renamed from: kotlin.b1.u.g1 */
/* compiled from: Reflection */
public class C14443g1 {

    /* renamed from: a */
    private static final C14446h1 f42571a;

    /* renamed from: b */
    static final String f42572b = " (Kotlin reflection is not available)";

    /* renamed from: c */
    private static final C14540c[] f42573c = new C14540c[0];

    static {
        C14446h1 h1Var = null;
        try {
            h1Var = (C14446h1) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (h1Var == null) {
            h1Var = new C14446h1();
        }
        f42571a = h1Var;
    }

    /* renamed from: a */
    public static C14540c m62430a(Class cls) {
        return f42571a.mo45579a(cls);
    }

    /* renamed from: b */
    public static C14540c m62440b(Class cls) {
        return f42571a.mo45588b(cls);
    }

    /* renamed from: c */
    public static C14543e m62442c(Class cls, String str) {
        return f42571a.mo45590c(cls, str);
    }

    /* renamed from: a */
    public static C14540c m62431a(Class cls, String str) {
        return f42571a.mo45580a(cls, str);
    }

    /* renamed from: b */
    public static C14540c m62441b(Class cls, String str) {
        return f42571a.mo45589b(cls, str);
    }

    /* renamed from: a */
    public static C14540c[] m62439a(Class[] clsArr) {
        int length = clsArr.length;
        if (length == 0) {
            return f42573c;
        }
        C14540c[] cVarArr = new C14540c[length];
        for (int i = 0; i < length; i++) {
            cVarArr[i] = m62440b(clsArr[i]);
        }
        return cVarArr;
    }

    @C6096e0(version = "1.1")
    /* renamed from: a */
    public static String m62429a(C14448i0 i0Var) {
        return f42571a.mo45578a(i0Var);
    }

    /* renamed from: a */
    public static C14544f m62432a(C14421c0 c0Var) {
        return f42571a.mo45581a(c0Var);
    }

    /* renamed from: a */
    public static C14561m m62436a(C14496y0 y0Var) {
        return f42571a.mo45585a(y0Var);
    }

    /* renamed from: a */
    public static C14548h m62433a(C14478p0 p0Var) {
        return f42571a.mo45582a(p0Var);
    }

    /* renamed from: a */
    public static C14563n m62437a(C14417a1 a1Var) {
        return f42571a.mo45586a(a1Var);
    }

    /* renamed from: a */
    public static C14550i m62434a(C14482r0 r0Var) {
        return f42571a.mo45583a(r0Var);
    }

    /* renamed from: a */
    public static C14565o m62438a(C14422c1 c1Var) {
        return f42571a.mo45587a(c1Var);
    }

    /* renamed from: a */
    public static C14552j m62435a(C14486t0 t0Var) {
        return f42571a.mo45584a(t0Var);
    }
}
