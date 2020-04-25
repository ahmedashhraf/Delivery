package p076c.p112d.p134b.p135a.p143g;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: c.d.b.a.g.r */
/* compiled from: FieldInfo */
public class C6412r {

    /* renamed from: d */
    private static final Map<Field, C6412r> f17870d = new WeakHashMap();

    /* renamed from: a */
    private final boolean f17871a;

    /* renamed from: b */
    private final Field f17872b;

    /* renamed from: c */
    private final String f17873c;

    C6412r(Field field, String str) {
        String str2;
        this.f17872b = field;
        if (str == null) {
            str2 = null;
        } else {
            str2 = str.intern();
        }
        this.f17873c = str2;
        this.f17871a = C6398n.m29720a((Type) mo25835f());
    }

    /* renamed from: a */
    public static C6412r m29777a(Enum<?> enumR) {
        try {
            C6412r a = m29778a(enumR.getClass().getField(enumR.name()));
            C6381h0.m29668a(a != null, "enum constant missing @Value or @NullValue annotation: %s", enumR);
            return a;
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public C6387k mo25831b() {
        return C6387k.m29691a(this.f17872b.getDeclaringClass());
    }

    /* renamed from: c */
    public Field mo25832c() {
        return this.f17872b;
    }

    /* renamed from: d */
    public Type mo25833d() {
        return this.f17872b.getGenericType();
    }

    /* renamed from: e */
    public String mo25834e() {
        return this.f17873c;
    }

    /* renamed from: f */
    public Class<?> mo25835f() {
        return this.f17872b.getType();
    }

    /* renamed from: g */
    public boolean mo25836g() {
        return Modifier.isFinal(this.f17872b.getModifiers());
    }

    /* renamed from: h */
    public boolean mo25837h() {
        return this.f17871a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006a, code lost:
        return r2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p076c.p112d.p134b.p135a.p143g.C6412r m29778a(java.lang.reflect.Field r5) {
        /*
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.util.Map<java.lang.reflect.Field, c.d.b.a.g.r> r1 = f17870d
            monitor-enter(r1)
            java.util.Map<java.lang.reflect.Field, c.d.b.a.g.r> r2 = f17870d     // Catch:{ all -> 0x006b }
            java.lang.Object r2 = r2.get(r5)     // Catch:{ all -> 0x006b }
            c.d.b.a.g.r r2 = (p076c.p112d.p134b.p135a.p143g.C6412r) r2     // Catch:{ all -> 0x006b }
            boolean r3 = r5.isEnumConstant()     // Catch:{ all -> 0x006b }
            if (r2 != 0) goto L_0x0069
            if (r3 != 0) goto L_0x0021
            int r4 = r5.getModifiers()     // Catch:{ all -> 0x006b }
            boolean r4 = java.lang.reflect.Modifier.isStatic(r4)     // Catch:{ all -> 0x006b }
            if (r4 != 0) goto L_0x0069
        L_0x0021:
            if (r3 == 0) goto L_0x003f
            java.lang.Class<c.d.b.a.g.r0> r2 = p076c.p112d.p134b.p135a.p143g.C2767r0.class
            java.lang.annotation.Annotation r2 = r5.getAnnotation(r2)     // Catch:{ all -> 0x006b }
            c.d.b.a.g.r0 r2 = (p076c.p112d.p134b.p135a.p143g.C2767r0) r2     // Catch:{ all -> 0x006b }
            if (r2 == 0) goto L_0x0032
            java.lang.String r0 = r2.value()     // Catch:{ all -> 0x006b }
            goto L_0x0053
        L_0x0032:
            java.lang.Class<c.d.b.a.g.d0> r2 = p076c.p112d.p134b.p135a.p143g.C2765d0.class
            java.lang.annotation.Annotation r2 = r5.getAnnotation(r2)     // Catch:{ all -> 0x006b }
            c.d.b.a.g.d0 r2 = (p076c.p112d.p134b.p135a.p143g.C2765d0) r2     // Catch:{ all -> 0x006b }
            if (r2 == 0) goto L_0x003d
            goto L_0x0053
        L_0x003d:
            monitor-exit(r1)     // Catch:{ all -> 0x006b }
            return r0
        L_0x003f:
            java.lang.Class<c.d.b.a.g.v> r2 = p076c.p112d.p134b.p135a.p143g.C2768v.class
            java.lang.annotation.Annotation r2 = r5.getAnnotation(r2)     // Catch:{ all -> 0x006b }
            c.d.b.a.g.v r2 = (p076c.p112d.p134b.p135a.p143g.C2768v) r2     // Catch:{ all -> 0x006b }
            if (r2 != 0) goto L_0x004b
            monitor-exit(r1)     // Catch:{ all -> 0x006b }
            return r0
        L_0x004b:
            java.lang.String r0 = r2.value()     // Catch:{ all -> 0x006b }
            r2 = 1
            r5.setAccessible(r2)     // Catch:{ all -> 0x006b }
        L_0x0053:
            java.lang.String r2 = "##default"
            boolean r2 = r2.equals(r0)     // Catch:{ all -> 0x006b }
            if (r2 == 0) goto L_0x005f
            java.lang.String r0 = r5.getName()     // Catch:{ all -> 0x006b }
        L_0x005f:
            c.d.b.a.g.r r2 = new c.d.b.a.g.r     // Catch:{ all -> 0x006b }
            r2.<init>(r5, r0)     // Catch:{ all -> 0x006b }
            java.util.Map<java.lang.reflect.Field, c.d.b.a.g.r> r0 = f17870d     // Catch:{ all -> 0x006b }
            r0.put(r5, r2)     // Catch:{ all -> 0x006b }
        L_0x0069:
            monitor-exit(r1)     // Catch:{ all -> 0x006b }
            return r2
        L_0x006b:
            r5 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x006b }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p076c.p112d.p134b.p135a.p143g.C6412r.m29778a(java.lang.reflect.Field):c.d.b.a.g.r");
    }

    /* renamed from: a */
    public Object mo25829a(Object obj) {
        return m29779a(this.f17872b, obj);
    }

    /* renamed from: a */
    public void mo25830a(Object obj, Object obj2) {
        m29780a(this.f17872b, obj, obj2);
    }

    /* renamed from: a */
    public <T extends Enum<T>> T mo25828a() {
        return Enum.valueOf(this.f17872b.getDeclaringClass(), this.f17872b.getName());
    }

    /* renamed from: a */
    public static Object m29779a(Field field, Object obj) {
        try {
            return field.get(obj);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public static void m29780a(Field field, Object obj, Object obj2) {
        if (Modifier.isFinal(field.getModifiers())) {
            Object a = m29779a(field, obj);
            if (obj2 == null) {
                if (a == null) {
                    return;
                }
            } else if (obj2.equals(a)) {
                return;
            }
            String valueOf = String.valueOf(String.valueOf(a));
            String valueOf2 = String.valueOf(String.valueOf(obj2));
            String valueOf3 = String.valueOf(String.valueOf(field.getName()));
            String valueOf4 = String.valueOf(String.valueOf(obj.getClass().getName()));
            StringBuilder sb = new StringBuilder(valueOf.length() + 48 + valueOf2.length() + valueOf3.length() + valueOf4.length());
            sb.append("expected final value <");
            sb.append(valueOf);
            sb.append("> but was <");
            sb.append(valueOf2);
            sb.append("> on ");
            sb.append(valueOf3);
            sb.append(" field in ");
            sb.append(valueOf4);
            throw new IllegalArgumentException(sb.toString());
        }
        try {
            field.set(obj, obj2);
        } catch (SecurityException e) {
            throw new IllegalArgumentException(e);
        } catch (IllegalAccessException e2) {
            throw new IllegalArgumentException(e2);
        }
    }
}
