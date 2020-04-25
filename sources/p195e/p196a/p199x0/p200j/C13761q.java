package p195e.p196a.p199x0.p200j;

import java.io.Serializable;
import p195e.p196a.C12280i0;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p447u0.C12314c;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;

/* renamed from: e.a.x0.j.q */
/* compiled from: NotificationLite */
public enum C13761q {
    COMPLETE;

    /* renamed from: e.a.x0.j.q$a */
    /* compiled from: NotificationLite */
    static final class C13762a implements Serializable {
        private static final long serialVersionUID = -7482590109178395495L;

        /* renamed from: a */
        final C12314c f39808a;

        C13762a(C12314c cVar) {
            this.f39808a = cVar;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("NotificationLite.Disposable[");
            sb.append(this.f39808a);
            sb.append("]");
            return sb.toString();
        }
    }

    /* renamed from: e.a.x0.j.q$b */
    /* compiled from: NotificationLite */
    static final class C13763b implements Serializable {
        private static final long serialVersionUID = -8759979445933046293L;

        /* renamed from: a */
        final Throwable f39809a;

        C13763b(Throwable th) {
            this.f39809a = th;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C13763b)) {
                return false;
            }
            return C12390b.m55564a((Object) this.f39809a, (Object) ((C13763b) obj).f39809a);
        }

        public int hashCode() {
            return this.f39809a.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("NotificationLite.Error[");
            sb.append(this.f39809a);
            sb.append("]");
            return sb.toString();
        }
    }

    /* renamed from: e.a.x0.j.q$c */
    /* compiled from: NotificationLite */
    static final class C13764c implements Serializable {
        private static final long serialVersionUID = -1322257508628817540L;

        /* renamed from: a */
        final C14063d f39810a;

        C13764c(C14063d dVar) {
            this.f39810a = dVar;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("NotificationLite.Subscription[");
            sb.append(this.f39810a);
            sb.append("]");
            return sb.toString();
        }
    }

    /* renamed from: a */
    public static Object m58743a(Throwable th) {
        return new C13763b(th);
    }

    /* renamed from: b */
    public static Throwable m58746b(Object obj) {
        return ((C13763b) obj).f39809a;
    }

    /* renamed from: c */
    public static C14063d m58749c(Object obj) {
        return ((C13764c) obj).f39810a;
    }

    /* renamed from: d */
    public static Object m58750d() {
        return COMPLETE;
    }

    /* renamed from: d */
    public static <T> T m58751d(Object obj) {
        return obj;
    }

    /* renamed from: e */
    public static boolean m58752e(Object obj) {
        return obj == COMPLETE;
    }

    /* renamed from: f */
    public static boolean m58753f(Object obj) {
        return obj instanceof C13762a;
    }

    /* renamed from: g */
    public static boolean m58754g(Object obj) {
        return obj instanceof C13763b;
    }

    /* renamed from: h */
    public static boolean m58755h(Object obj) {
        return obj instanceof C13764c;
    }

    /* renamed from: i */
    public static <T> Object m58756i(T t) {
        return t;
    }

    public String toString() {
        return "NotificationLite.Complete";
    }

    /* renamed from: a */
    public static Object m58742a(C14063d dVar) {
        return new C13764c(dVar);
    }

    /* renamed from: b */
    public static <T> boolean m58748b(Object obj, C14062c<? super T> cVar) {
        if (obj == COMPLETE) {
            cVar.onComplete();
            return true;
        } else if (obj instanceof C13763b) {
            cVar.onError(((C13763b) obj).f39809a);
            return true;
        } else if (obj instanceof C13764c) {
            cVar.mo41788a(((C13764c) obj).f39810a);
            return false;
        } else {
            cVar.mo41789a(obj);
            return false;
        }
    }

    /* renamed from: a */
    public static Object m58741a(C12314c cVar) {
        return new C13762a(cVar);
    }

    /* renamed from: a */
    public static C12314c m58740a(Object obj) {
        return ((C13762a) obj).f39808a;
    }

    /* renamed from: a */
    public static <T> boolean m58745a(Object obj, C14062c<? super T> cVar) {
        if (obj == COMPLETE) {
            cVar.onComplete();
            return true;
        } else if (obj instanceof C13763b) {
            cVar.onError(((C13763b) obj).f39809a);
            return true;
        } else {
            cVar.mo41789a(obj);
            return false;
        }
    }

    /* renamed from: b */
    public static <T> boolean m58747b(Object obj, C12280i0<? super T> i0Var) {
        if (obj == COMPLETE) {
            i0Var.onComplete();
            return true;
        } else if (obj instanceof C13763b) {
            i0Var.onError(((C13763b) obj).f39809a);
            return true;
        } else if (obj instanceof C13762a) {
            i0Var.mo34123a(((C13762a) obj).f39808a);
            return false;
        } else {
            i0Var.mo33453a(obj);
            return false;
        }
    }

    /* renamed from: a */
    public static <T> boolean m58744a(Object obj, C12280i0<? super T> i0Var) {
        if (obj == COMPLETE) {
            i0Var.onComplete();
            return true;
        } else if (obj instanceof C13763b) {
            i0Var.onError(((C13763b) obj).f39809a);
            return true;
        } else {
            i0Var.mo33453a(obj);
            return false;
        }
    }
}
