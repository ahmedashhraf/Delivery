package androidx.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.CLASS)
/* renamed from: androidx.annotation.m0 */
/* compiled from: RequiresPermission */
public @interface C0203m0 {

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
    /* renamed from: androidx.annotation.m0$a */
    /* compiled from: RequiresPermission */
    public @interface C0204a {
        C0203m0 value() default @C0203m0;
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
    /* renamed from: androidx.annotation.m0$b */
    /* compiled from: RequiresPermission */
    public @interface C0205b {
        C0203m0 value() default @C0203m0;
    }

    String[] allOf() default {};

    String[] anyOf() default {};

    boolean conditional() default false;

    String value() default "";
}
