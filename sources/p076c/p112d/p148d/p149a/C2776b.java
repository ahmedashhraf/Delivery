package p076c.p112d.p148d.p149a;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.TYPE, ElementType.METHOD})
@C2776b
@Retention(RetentionPolicy.CLASS)
/* renamed from: c.d.d.a.b */
/* compiled from: GwtCompatible */
public @interface C2776b {
    boolean emulated() default false;

    boolean serializable() default false;
}
