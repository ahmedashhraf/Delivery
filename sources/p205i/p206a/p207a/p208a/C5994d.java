package p205i.p206a.p207a.p208a;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p205i.p209c.p210a.C6002c;

@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.CLASS)
/* renamed from: i.a.a.a.d */
/* compiled from: Language */
public @interface C5994d {
    @C6002c
    String prefix() default "";

    @C6002c
    String suffix() default "";

    @C6002c
    String value();
}
