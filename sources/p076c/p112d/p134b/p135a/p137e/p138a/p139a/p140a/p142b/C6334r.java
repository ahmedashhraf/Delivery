package p076c.p112d.p134b.p135a.p137e.p138a.p139a.p140a.p142b;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p076c.p112d.p134b.p135a.p137e.p138a.p139a.p140a.p141a.C2715a;
import p201f.p202a.C5952h;

/* renamed from: c.d.b.a.e.a.a.a.b.r */
/* compiled from: Throwables */
public final class C6334r {
    private C6334r() {
    }

    /* renamed from: a */
    public static <X extends Throwable> void m29475a(@C5952h Throwable th, Class<X> cls) throws Throwable {
        if (th != null && cls.isInstance(th)) {
            throw ((Throwable) cls.cast(th));
        }
    }

    /* renamed from: b */
    public static <X extends Throwable> void m29478b(@C5952h Throwable th, Class<X> cls) throws Throwable {
        m29475a(th, cls);
        m29481e(th);
    }

    /* renamed from: c */
    public static String m29479c(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* renamed from: d */
    public static RuntimeException m29480d(Throwable th) {
        m29481e((Throwable) C6329k.m29434a(th));
        throw new RuntimeException(th);
    }

    /* renamed from: e */
    public static void m29481e(@C5952h Throwable th) {
        m29475a(th, Error.class);
        m29475a(th, RuntimeException.class);
    }

    /* renamed from: a */
    public static <X1 extends Throwable, X2 extends Throwable> void m29476a(@C5952h Throwable th, Class<X1> cls, Class<X2> cls2) throws Throwable, Throwable {
        C6329k.m29434a(cls2);
        m29475a(th, cls);
        m29478b(th, cls2);
    }

    /* renamed from: b */
    public static Throwable m29477b(Throwable th) {
        while (true) {
            Throwable cause = th.getCause();
            if (cause == null) {
                return th;
            }
            th = cause;
        }
    }

    @C2715a
    /* renamed from: a */
    public static List<Throwable> m29474a(Throwable th) {
        C6329k.m29434a(th);
        ArrayList arrayList = new ArrayList(4);
        while (th != null) {
            arrayList.add(th);
            th = th.getCause();
        }
        return Collections.unmodifiableList(arrayList);
    }
}
