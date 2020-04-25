package p205i.p209c.p210a;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
/* renamed from: i.c.a.a */
/* compiled from: Contract */
public @interface C6000a {
    boolean pure() default false;

    String value() default "";
}
