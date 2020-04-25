package androidx.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD, ElementType.LOCAL_VARIABLE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.CLASS)
/* renamed from: androidx.annotation.p */
/* compiled from: Dimension */
public @interface C0211p {

    /* renamed from: a */
    public static final int f630a = 0;

    /* renamed from: b */
    public static final int f631b = 1;

    /* renamed from: c */
    public static final int f632c = 2;

    int unit() default 1;
}
