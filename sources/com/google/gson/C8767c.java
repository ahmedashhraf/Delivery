package com.google.gson;

import com.google.gson.p321x.C8806a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: com.google.gson.c */
/* compiled from: FieldAttributes */
public final class C8767c {

    /* renamed from: a */
    private final Field f22988a;

    public C8767c(Field field) {
        C8806a.m41344a(field);
        this.f22988a = field;
    }

    /* renamed from: a */
    public <T extends Annotation> T mo32294a(Class<T> cls) {
        return this.f22988a.getAnnotation(cls);
    }

    /* renamed from: b */
    public Class<?> mo32297b() {
        return this.f22988a.getType();
    }

    /* renamed from: c */
    public Type mo32298c() {
        return this.f22988a.getGenericType();
    }

    /* renamed from: d */
    public Class<?> mo32299d() {
        return this.f22988a.getDeclaringClass();
    }

    /* renamed from: e */
    public String mo32300e() {
        return this.f22988a.getName();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public boolean mo32301f() {
        return this.f22988a.isSynthetic();
    }

    /* renamed from: a */
    public Collection<Annotation> mo32295a() {
        return Arrays.asList(this.f22988a.getAnnotations());
    }

    /* renamed from: a */
    public boolean mo32296a(int i) {
        return (i & this.f22988a.getModifiers()) != 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Object mo32293a(Object obj) throws IllegalAccessException {
        return this.f22988a.get(obj);
    }
}
