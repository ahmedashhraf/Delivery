package p205i.p206a.p207a.p208a;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@C5994d("RegExp")
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.CLASS)
/* renamed from: i.a.a.a.i */
/* compiled from: RegExp */
public @interface C5998i {
    String prefix() default "";

    String suffix() default "";
}
