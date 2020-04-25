package androidx.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.SOURCE)
/* renamed from: androidx.annotation.y */
/* compiled from: IntDef */
public @interface C0232y {
    boolean flag() default false;

    boolean open() default false;

    int[] value() default {};
}
