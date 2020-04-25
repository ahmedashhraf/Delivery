package p076c.p112d.p148d.p280h;

import com.google.common.base.C7397x;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import p201f.p202a.C5952h;

/* renamed from: c.d.d.h.c */
/* compiled from: Element */
class C6669c extends AccessibleObject implements Member {

    /* renamed from: a */
    private final AccessibleObject f18649a;

    /* renamed from: b */
    private final Member f18650b;

    <M extends AccessibleObject & Member> C6669c(M m) {
        C7397x.m35664a(m);
        this.f18649a = m;
        this.f18650b = (Member) m;
    }

    /* renamed from: a */
    public C6693m<?> mo26748a() {
        return C6693m.m31985e(getDeclaringClass());
    }

    /* renamed from: b */
    public final boolean mo26749b() {
        return Modifier.isAbstract(getModifiers());
    }

    /* renamed from: c */
    public final boolean mo26750c() {
        return Modifier.isFinal(getModifiers());
    }

    /* renamed from: d */
    public final boolean mo26751d() {
        return Modifier.isNative(getModifiers());
    }

    /* renamed from: e */
    public final boolean mo26752e() {
        return !mo26754f() && !mo26762h() && !mo26755g();
    }

    public boolean equals(@C5952h Object obj) {
        if (!(obj instanceof C6669c)) {
            return false;
        }
        C6669c cVar = (C6669c) obj;
        if (!mo26748a().equals(cVar.mo26748a()) || !this.f18650b.equals(cVar.f18650b)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo26754f() {
        return Modifier.isPrivate(getModifiers());
    }

    /* renamed from: g */
    public final boolean mo26755g() {
        return Modifier.isProtected(getModifiers());
    }

    public final <A extends Annotation> A getAnnotation(Class<A> cls) {
        return this.f18649a.getAnnotation(cls);
    }

    public final Annotation[] getAnnotations() {
        return this.f18649a.getAnnotations();
    }

    public final Annotation[] getDeclaredAnnotations() {
        return this.f18649a.getDeclaredAnnotations();
    }

    public Class<?> getDeclaringClass() {
        return this.f18650b.getDeclaringClass();
    }

    public final int getModifiers() {
        return this.f18650b.getModifiers();
    }

    public final String getName() {
        return this.f18650b.getName();
    }

    /* renamed from: h */
    public final boolean mo26762h() {
        return Modifier.isPublic(getModifiers());
    }

    public int hashCode() {
        return this.f18650b.hashCode();
    }

    /* renamed from: i */
    public final boolean mo26764i() {
        return Modifier.isStatic(getModifiers());
    }

    public final boolean isAccessible() {
        return this.f18649a.isAccessible();
    }

    public final boolean isAnnotationPresent(Class<? extends Annotation> cls) {
        return this.f18649a.isAnnotationPresent(cls);
    }

    public final boolean isSynthetic() {
        return this.f18650b.isSynthetic();
    }

    /* renamed from: j */
    public final boolean mo26768j() {
        return Modifier.isSynchronized(getModifiers());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public final boolean mo26769k() {
        return Modifier.isTransient(getModifiers());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public final boolean mo26770l() {
        return Modifier.isVolatile(getModifiers());
    }

    public final void setAccessible(boolean z) throws SecurityException {
        this.f18649a.setAccessible(z);
    }

    public String toString() {
        return this.f18650b.toString();
    }
}
