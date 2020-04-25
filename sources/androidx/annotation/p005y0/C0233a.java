package androidx.annotation.p005y0;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.CLASS)
/* renamed from: androidx.annotation.y0.a */
/* compiled from: Experimental */
public @interface C0233a {

    /* renamed from: androidx.annotation.y0.a$a */
    /* compiled from: Experimental */
    public enum C0234a {
        WARNING,
        ERROR
    }

    C0234a level() default C0234a.ERROR;
}
