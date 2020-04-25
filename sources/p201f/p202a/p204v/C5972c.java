package p201f.p202a.p204v;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: f.a.v.c */
/* compiled from: TypeQualifier */
public @interface C5972c {
    Class<?> applicableTo() default Object.class;
}
