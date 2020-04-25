package p076c.p112d.p144c.p145a;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.CLASS)
/* renamed from: c.d.c.a.c */
/* compiled from: AutoValue */
public @interface C2771c {

    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.CLASS)
    /* renamed from: c.d.c.a.c$a */
    /* compiled from: AutoValue */
    public @interface C2772a {
    }

    @Target({ElementType.TYPE, ElementType.METHOD})
    @Retention(RetentionPolicy.CLASS)
    /* renamed from: c.d.c.a.c$b */
    /* compiled from: AutoValue */
    public @interface C2773b {
        Class<? extends Annotation>[] exclude() default {};
    }
}
