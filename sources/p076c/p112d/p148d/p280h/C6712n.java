package p076c.p112d.p148d.p280h;

import com.google.common.collect.C8047m5;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Set;
import p201f.p202a.p203u.C5968c;

@C5968c
/* renamed from: c.d.d.h.n */
/* compiled from: TypeVisitor */
abstract class C6712n {

    /* renamed from: a */
    private final Set<Type> f18694a = C8047m5.m38530c();

    C6712n() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo26821a(Class<?> cls) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo26822a(GenericArrayType genericArrayType) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo26823a(ParameterizedType parameterizedType) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo26824a(TypeVariable<?> typeVariable) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo26825a(WildcardType wildcardType) {
    }

    /* renamed from: a */
    public final void mo26877a(Type... typeArr) {
        for (Type type : typeArr) {
            if (type != null && this.f18694a.add(type)) {
                try {
                    if (type instanceof TypeVariable) {
                        mo26824a((TypeVariable) type);
                    } else if (type instanceof WildcardType) {
                        mo26825a((WildcardType) type);
                    } else if (type instanceof ParameterizedType) {
                        mo26823a((ParameterizedType) type);
                    } else if (type instanceof Class) {
                        mo26821a((Class) type);
                    } else if (type instanceof GenericArrayType) {
                        mo26822a((GenericArrayType) type);
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unknown type: ");
                        sb.append(type);
                        throw new AssertionError(sb.toString());
                    }
                } catch (Throwable th) {
                    this.f18694a.remove(type);
                    throw th;
                }
            }
        }
    }
}
