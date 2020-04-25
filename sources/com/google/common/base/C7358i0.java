package com.google.common.base;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p076c.p112d.p148d.p149a.C2775a;
import p201f.p202a.C5952h;

/* renamed from: com.google.common.base.i0 */
/* compiled from: Throwables */
public final class C7358i0 {
    private C7358i0() {
    }

    /* renamed from: a */
    public static <X extends Throwable> void m35584a(@C5952h Throwable th, Class<X> cls) throws Throwable {
        if (th != null && cls.isInstance(th)) {
            throw ((Throwable) cls.cast(th));
        }
    }

    /* renamed from: b */
    public static <X extends Throwable> void m35587b(@C5952h Throwable th, Class<X> cls) throws Throwable {
        m35584a(th, cls);
        m35590e(th);
    }

    /* renamed from: c */
    public static String m35588c(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* renamed from: d */
    public static RuntimeException m35589d(Throwable th) {
        m35590e((Throwable) C7397x.m35664a(th));
        throw new RuntimeException(th);
    }

    /* renamed from: e */
    public static void m35590e(@C5952h Throwable th) {
        m35584a(th, Error.class);
        m35584a(th, RuntimeException.class);
    }

    /* renamed from: a */
    public static <X1 extends Throwable, X2 extends Throwable> void m35585a(@C5952h Throwable th, Class<X1> cls, Class<X2> cls2) throws Throwable, Throwable {
        C7397x.m35664a(cls2);
        m35584a(th, cls);
        m35587b(th, cls2);
    }

    /* renamed from: b */
    public static Throwable m35586b(Throwable th) {
        while (true) {
            Throwable cause = th.getCause();
            if (cause == null) {
                return th;
            }
            th = cause;
        }
    }

    @C2775a
    /* renamed from: a */
    public static List<Throwable> m35583a(Throwable th) {
        C7397x.m35664a(th);
        ArrayList arrayList = new ArrayList(4);
        while (th != null) {
            arrayList.add(th);
            th = th.getCause();
        }
        return Collections.unmodifiableList(arrayList);
    }
}
