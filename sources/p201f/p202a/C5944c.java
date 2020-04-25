package p201f.p202a;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p201f.p202a.p204v.C5976g;

@Documented
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.TYPE, ElementType.PACKAGE})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: f.a.c */
/* compiled from: CheckReturnValue */
public @interface C5944c {
    C5976g when() default C5976g.ALWAYS;
}
