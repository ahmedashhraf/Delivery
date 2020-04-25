package p076c.p112d.p148d.p280h;

import com.google.common.base.C7397x;
import com.google.common.collect.C8257x2;
import com.google.common.collect.C8257x2.C8259b;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import p076c.p112d.p148d.p149a.C2775a;
import p201f.p202a.C5952h;

@C2775a
/* renamed from: c.d.d.h.e */
/* compiled from: Invokable */
public abstract class C6673e<T, R> extends C6669c implements GenericDeclaration {

    /* renamed from: c.d.d.h.e$a */
    /* compiled from: Invokable */
    static class C6674a<T> extends C6673e<T, T> {

        /* renamed from: N */
        final Constructor<?> f18653N;

        C6674a(Constructor<?> constructor) {
            super(constructor);
            this.f18653N = constructor;
        }

        /* renamed from: a */
        private static Type[] m31884a(Type[] typeArr, int i, int i2) {
            int i3 = i2 - i;
            Type[] typeArr2 = new Type[i3];
            System.arraycopy(typeArr, i, typeArr2, 0, i3);
            return typeArr2;
        }

        /* renamed from: v */
        private boolean m31885v() {
            Class declaringClass = this.f18653N.getDeclaringClass();
            boolean z = true;
            if (declaringClass.getEnclosingConstructor() != null) {
                return true;
            }
            Method enclosingMethod = declaringClass.getEnclosingMethod();
            if (enclosingMethod != null) {
                return !Modifier.isStatic(enclosingMethod.getModifiers());
            }
            if (declaringClass.getEnclosingClass() == null || Modifier.isStatic(declaringClass.getModifiers())) {
                z = false;
            }
            return z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final Object mo26784b(@C5952h Object obj, Object[] objArr) throws InvocationTargetException, IllegalAccessException {
            try {
                return this.f18653N.newInstance(objArr);
            } catch (InstantiationException e) {
                StringBuilder sb = new StringBuilder();
                sb.append(this.f18653N);
                sb.append(" failed.");
                throw new RuntimeException(sb.toString(), e);
            }
        }

        public final TypeVariable<?>[] getTypeParameters() {
            TypeVariable[] typeParameters = getDeclaringClass().getTypeParameters();
            TypeVariable[] typeParameters2 = this.f18653N.getTypeParameters();
            TypeVariable<?>[] typeVariableArr = new TypeVariable[(typeParameters.length + typeParameters2.length)];
            System.arraycopy(typeParameters, 0, typeVariableArr, 0, typeParameters.length);
            System.arraycopy(typeParameters2, 0, typeVariableArr, typeParameters.length, typeParameters2.length);
            return typeVariableArr;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: n */
        public Type[] mo26786n() {
            return this.f18653N.getGenericExceptionTypes();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: o */
        public Type[] mo26787o() {
            Type[] genericParameterTypes = this.f18653N.getGenericParameterTypes();
            if (genericParameterTypes.length <= 0 || !m31885v()) {
                return genericParameterTypes;
            }
            Class[] parameterTypes = this.f18653N.getParameterTypes();
            return (genericParameterTypes.length == parameterTypes.length && parameterTypes[0] == getDeclaringClass().getEnclosingClass()) ? m31884a(genericParameterTypes, 1, genericParameterTypes.length) : genericParameterTypes;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: p */
        public Type mo26788p() {
            Class declaringClass = getDeclaringClass();
            TypeVariable[] typeParameters = declaringClass.getTypeParameters();
            return typeParameters.length > 0 ? C6713o.m32088a(declaringClass, (Type[]) typeParameters) : declaringClass;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: q */
        public final Annotation[][] mo26789q() {
            return this.f18653N.getParameterAnnotations();
        }

        /* renamed from: t */
        public final boolean mo26792t() {
            return false;
        }

        /* renamed from: u */
        public final boolean mo26793u() {
            return this.f18653N.isVarArgs();
        }
    }

    /* renamed from: c.d.d.h.e$b */
    /* compiled from: Invokable */
    static class C6675b<T> extends C6673e<T, Object> {

        /* renamed from: N */
        final Method f18654N;

        C6675b(Method method) {
            super(method);
            this.f18654N = method;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final Object mo26784b(@C5952h Object obj, Object[] objArr) throws InvocationTargetException, IllegalAccessException {
            return this.f18654N.invoke(obj, objArr);
        }

        public final TypeVariable<?>[] getTypeParameters() {
            return this.f18654N.getTypeParameters();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: n */
        public Type[] mo26786n() {
            return this.f18654N.getGenericExceptionTypes();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: o */
        public Type[] mo26787o() {
            return this.f18654N.getGenericParameterTypes();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: p */
        public Type mo26788p() {
            return this.f18654N.getGenericReturnType();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: q */
        public final Annotation[][] mo26789q() {
            return this.f18654N.getParameterAnnotations();
        }

        /* renamed from: t */
        public final boolean mo26792t() {
            return !mo26750c() && !mo26754f() && !mo26764i() && !Modifier.isFinal(getDeclaringClass().getModifiers());
        }

        /* renamed from: u */
        public final boolean mo26793u() {
            return this.f18654N.isVarArgs();
        }
    }

    <M extends AccessibleObject & Member> C6673e(M m) {
        super(m);
    }

    /* renamed from: a */
    public static C6673e<?, Object> m31869a(Method method) {
        return new C6675b(method);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract Object mo26784b(@C5952h Object obj, Object[] objArr) throws InvocationTargetException, IllegalAccessException;

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final Class<? super T> getDeclaringClass() {
        return super.getDeclaringClass();
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    /* renamed from: m */
    public final C8257x2<C6693m<? extends Throwable>> mo26785m() {
        C8259b l = C8257x2.m39411l();
        for (Type g : mo26786n()) {
            l.m39420a((Object) C6693m.m31990g(g));
        }
        return l.mo30346a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public abstract Type[] mo26786n();

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public abstract Type[] mo26787o();

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public abstract Type mo26788p();

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public abstract Annotation[][] mo26789q();

    /* renamed from: r */
    public final C8257x2<C6681g> mo26790r() {
        Type[] o = mo26787o();
        Annotation[][] q = mo26789q();
        C8259b l = C8257x2.m39411l();
        for (int i = 0; i < o.length; i++) {
            l.m39420a((Object) new C6681g(this, i, C6693m.m31990g(o[i]), q[i]));
        }
        return l.mo30346a();
    }

    /* renamed from: s */
    public final C6693m<? extends R> mo26791s() {
        return C6693m.m31990g(mo26788p());
    }

    /* renamed from: t */
    public abstract boolean mo26792t();

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    /* renamed from: u */
    public abstract boolean mo26793u();

    /* renamed from: a */
    public static <T> C6673e<T, T> m31868a(Constructor<T> constructor) {
        return new C6674a(constructor);
    }

    /* renamed from: a */
    public final R mo26783a(@C5952h T t, Object... objArr) throws InvocationTargetException, IllegalAccessException {
        return mo26784b(t, (Object[]) C7397x.m35664a(objArr));
    }

    /* renamed from: a */
    public final <R1 extends R> C6673e<T, R1> mo26782a(Class<R1> cls) {
        return mo26781a(C6693m.m31985e(cls));
    }

    /* renamed from: a */
    public final <R1 extends R> C6673e<T, R1> mo26781a(C6693m<R1> mVar) {
        if (mVar.mo26839a(mo26791s())) {
            return this;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invokable is known to return ");
        sb.append(mo26791s());
        sb.append(", not ");
        sb.append(mVar);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public C6693m<T> mo26748a() {
        return C6693m.m31985e(getDeclaringClass());
    }
}
