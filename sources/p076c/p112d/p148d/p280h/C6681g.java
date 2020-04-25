package p076c.p112d.p148d.p280h;

import com.google.common.base.C7397x;
import com.google.common.collect.C8257x2;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.util.Iterator;
import p076c.p112d.p148d.p149a.C2775a;
import p201f.p202a.C5952h;

@C2775a
/* renamed from: c.d.d.h.g */
/* compiled from: Parameter */
public final class C6681g implements AnnotatedElement {

    /* renamed from: N */
    private final C6693m<?> f18658N;

    /* renamed from: O */
    private final C8257x2<Annotation> f18659O;

    /* renamed from: a */
    private final C6673e<?, ?> f18660a;

    /* renamed from: b */
    private final int f18661b;

    C6681g(C6673e<?, ?> eVar, int i, C6693m<?> mVar, Annotation[] annotationArr) {
        this.f18660a = eVar;
        this.f18661b = i;
        this.f18658N = mVar;
        this.f18659O = C8257x2.m39410c(annotationArr);
    }

    /* renamed from: a */
    public C6673e<?, ?> mo26805a() {
        return this.f18660a;
    }

    /* renamed from: b */
    public C6693m<?> mo26806b() {
        return this.f18658N;
    }

    public boolean equals(@C5952h Object obj) {
        if (!(obj instanceof C6681g)) {
            return false;
        }
        C6681g gVar = (C6681g) obj;
        if (this.f18661b != gVar.f18661b || !this.f18660a.equals(gVar.f18660a)) {
            return false;
        }
        return true;
    }

    @C5952h
    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        C7397x.m35664a(cls);
        Iterator it = this.f18659O.iterator();
        while (it.hasNext()) {
            Annotation annotation = (Annotation) it.next();
            if (cls.isInstance(annotation)) {
                return (Annotation) cls.cast(annotation);
            }
        }
        return null;
    }

    public Annotation[] getAnnotations() {
        return getDeclaredAnnotations();
    }

    public Annotation[] getDeclaredAnnotations() {
        C8257x2<Annotation> x2Var = this.f18659O;
        return (Annotation[]) x2Var.toArray(new Annotation[x2Var.size()]);
    }

    public int hashCode() {
        return this.f18661b;
    }

    public boolean isAnnotationPresent(Class<? extends Annotation> cls) {
        return getAnnotation(cls) != null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f18658N);
        sb.append(" arg");
        sb.append(this.f18661b);
        return sb.toString();
    }
}
