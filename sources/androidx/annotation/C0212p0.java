package androidx.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.SOURCE)
/* renamed from: androidx.annotation.p0 */
/* compiled from: StringDef */
public @interface C0212p0 {
    boolean open() default false;

    String[] value() default {};
}
