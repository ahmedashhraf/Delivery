package p205i.p206a.p207a.p208a;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.ANNOTATION_TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.SOURCE)
/* renamed from: i.a.a.a.e */
/* compiled from: MagicConstant */
public @interface C5995e {
    long[] flags() default {};

    Class flagsFromClass() default void.class;

    long[] intValues() default {};

    String[] stringValues() default {};

    Class valuesFromClass() default void.class;
}
