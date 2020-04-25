package kotlin.p214b1;

import java.lang.annotation.Annotation;
import kotlin.C6049b;
import kotlin.C6093c;
import kotlin.C6094c0;
import kotlin.TypeCastException;
import kotlin.p214b1.p216u.C14443g1;
import kotlin.p214b1.p216u.C14445h0;
import kotlin.p214b1.p216u.C14481r;
import kotlin.p505f1.C14540c;
import p053b.p063d.p064b.C2108a;
import p205i.p209c.p210a.C6003d;

@C6055e(name = "JvmClassMappingKt")
/* renamed from: kotlin.b1.a */
/* compiled from: JvmClassMapping.kt */
public final class C6051a {
    @C6003d
    @C6055e(name = "getJavaClass")
    /* renamed from: a */
    public static final <T> Class<T> m27734a(@C6003d C14540c<T> cVar) {
        C14445h0.m62478f(cVar, "$receiver");
        Class<T> f = ((C14481r) cVar).mo45626f();
        if (f != null) {
            return f;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.Class<T>");
    }

    @C6003d
    /* renamed from: b */
    public static final <T> Class<T> m27738b(@C6003d C14540c<T> cVar) {
        C14445h0.m62478f(cVar, "$receiver");
        Class f = ((C14481r) cVar).mo45626f();
        String str = "null cannot be cast to non-null type java.lang.Class<T>";
        if (f.isPrimitive()) {
            String name = f.getName();
            if (name != null) {
                switch (name.hashCode()) {
                    case -1325958191:
                        if (name.equals("double")) {
                            f = Double.class;
                            break;
                        }
                        break;
                    case 104431:
                        if (name.equals("int")) {
                            f = Integer.class;
                            break;
                        }
                        break;
                    case 3039496:
                        if (name.equals("byte")) {
                            f = Byte.class;
                            break;
                        }
                        break;
                    case 3052374:
                        if (name.equals("char")) {
                            f = Character.class;
                            break;
                        }
                        break;
                    case 3327612:
                        if (name.equals("long")) {
                            f = Long.class;
                            break;
                        }
                        break;
                    case 3625364:
                        if (name.equals("void")) {
                            f = Void.class;
                            break;
                        }
                        break;
                    case 64711720:
                        if (name.equals("boolean")) {
                            f = Boolean.class;
                            break;
                        }
                        break;
                    case 97526364:
                        if (name.equals("float")) {
                            f = Float.class;
                            break;
                        }
                        break;
                    case 109413500:
                        if (name.equals("short")) {
                            f = Short.class;
                            break;
                        }
                        break;
                }
            }
            if (f != null) {
                return f;
            }
            throw new TypeCastException(str);
        } else if (f != null) {
            return f;
        } else {
            throw new TypeCastException(str);
        }
    }

    @p205i.p209c.p210a.C6004e
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Class<T> m27739c(@p205i.p209c.p210a.C6003d kotlin.p505f1.C14540c<T> r1) {
        /*
            java.lang.String r0 = "$receiver"
            kotlin.p214b1.p216u.C14445h0.m62478f(r1, r0)
            kotlin.b1.u.r r1 = (kotlin.p214b1.p216u.C14481r) r1
            java.lang.Class r1 = r1.mo45626f()
            boolean r0 = r1.isPrimitive()
            if (r0 == 0) goto L_0x001c
            if (r1 == 0) goto L_0x0014
            return r1
        L_0x0014:
            kotlin.TypeCastException r1 = new kotlin.TypeCastException
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.Class<T>"
            r1.<init>(r0)
            throw r1
        L_0x001c:
            java.lang.String r1 = r1.getName()
            if (r1 != 0) goto L_0x0024
            goto L_0x0090
        L_0x0024:
            int r0 = r1.hashCode()
            switch(r0) {
                case -2056817302: goto L_0x0085;
                case -527879800: goto L_0x007a;
                case -515992664: goto L_0x006f;
                case 155276373: goto L_0x0064;
                case 344809556: goto L_0x0059;
                case 398507100: goto L_0x004e;
                case 398795216: goto L_0x0043;
                case 399092968: goto L_0x0038;
                case 761287205: goto L_0x002d;
                default: goto L_0x002b;
            }
        L_0x002b:
            goto L_0x0090
        L_0x002d:
            java.lang.String r0 = "java.lang.Double"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0090
            java.lang.Class r1 = java.lang.Double.TYPE
            goto L_0x0091
        L_0x0038:
            java.lang.String r0 = "java.lang.Void"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0090
            java.lang.Class r1 = java.lang.Void.TYPE
            goto L_0x0091
        L_0x0043:
            java.lang.String r0 = "java.lang.Long"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0090
            java.lang.Class r1 = java.lang.Long.TYPE
            goto L_0x0091
        L_0x004e:
            java.lang.String r0 = "java.lang.Byte"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0090
            java.lang.Class r1 = java.lang.Byte.TYPE
            goto L_0x0091
        L_0x0059:
            java.lang.String r0 = "java.lang.Boolean"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0090
            java.lang.Class r1 = java.lang.Boolean.TYPE
            goto L_0x0091
        L_0x0064:
            java.lang.String r0 = "java.lang.Character"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0090
            java.lang.Class r1 = java.lang.Character.TYPE
            goto L_0x0091
        L_0x006f:
            java.lang.String r0 = "java.lang.Short"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0090
            java.lang.Class r1 = java.lang.Short.TYPE
            goto L_0x0091
        L_0x007a:
            java.lang.String r0 = "java.lang.Float"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0090
            java.lang.Class r1 = java.lang.Float.TYPE
            goto L_0x0091
        L_0x0085:
            java.lang.String r0 = "java.lang.Integer"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0090
            java.lang.Class r1 = java.lang.Integer.TYPE
            goto L_0x0091
        L_0x0090:
            r1 = 0
        L_0x0091:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p214b1.C6051a.m27739c(kotlin.f1.c):java.lang.Class");
    }

    @C6003d
    @C6055e(name = "getRuntimeClassOfKClassInstance")
    /* renamed from: d */
    public static final <T> Class<C14540c<T>> m27740d(@C6003d C14540c<T> cVar) {
        C14445h0.m62478f(cVar, "$receiver");
        Class<C14540c<T>> cls = cVar.getClass();
        if (cls != null) {
            return cls;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.Class<kotlin.reflect.KClass<T>>");
    }

    /* renamed from: e */
    public static /* synthetic */ void m27741e(C14540c cVar) {
    }

    @C6049b(level = C6093c.ERROR, message = "Use 'java' property to get Java class corresponding to this Kotlin class or cast this instance to Any if you really want to get the runtime Java class of this implementation of KClass.", replaceWith = @C6094c0(expression = "(this as Any).javaClass", imports = {}))
    /* renamed from: f */
    public static /* synthetic */ void m27742f(C14540c cVar) {
    }

    @C6003d
    @C6055e(name = "getKotlinClass")
    /* renamed from: a */
    public static final <T> C14540c<T> m27735a(@C6003d Class<T> cls) {
        C14445h0.m62478f(cls, "$receiver");
        return C14443g1.m62440b(cls);
    }

    @C6003d
    /* renamed from: a */
    public static final <T> Class<T> m27733a(@C6003d T t) {
        C14445h0.m62478f(t, "$receiver");
        Class<T> cls = t.getClass();
        if (cls != null) {
            return cls;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.Class<T>");
    }

    /* renamed from: a */
    private static final <T> boolean m27737a(@C6003d Object[] objArr) {
        C14445h0.m62450a(4, C2108a.f8183X4);
        return Object.class.isAssignableFrom(objArr.getClass().getComponentType());
    }

    @C6003d
    /* renamed from: a */
    public static final <T extends Annotation> C14540c<? extends T> m27736a(@C6003d T t) {
        C14445h0.m62478f(t, "$receiver");
        Class annotationType = t.annotationType();
        C14445h0.m62453a((Object) annotationType, "(this as java.lang.annot…otation).annotationType()");
        C14540c<? extends T> a = m27735a(annotationType);
        if (a != null) {
            return a;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.reflect.KClass<out T>");
    }
}
