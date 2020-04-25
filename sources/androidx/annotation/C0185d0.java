package androidx.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.SOURCE)
/* renamed from: androidx.annotation.d0 */
/* compiled from: LongDef */
public @interface C0185d0 {
    boolean flag() default false;

    boolean open() default false;

    long[] value() default {};
}
