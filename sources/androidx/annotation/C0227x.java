package androidx.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.SOURCE)
/* renamed from: androidx.annotation.x */
/* compiled from: InspectableProperty */
public @interface C0227x {

    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.annotation.x$a */
    /* compiled from: InspectableProperty */
    public @interface C0228a {
        String name();

        int value();
    }

    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.annotation.x$b */
    /* compiled from: InspectableProperty */
    public @interface C0229b {
        int mask() default 0;

        String name();

        int target();
    }

    /* renamed from: androidx.annotation.x$c */
    /* compiled from: InspectableProperty */
    public enum C0230c {
        NONE,
        INFERRED,
        INT_ENUM,
        INT_FLAG,
        COLOR,
        GRAVITY,
        RESOURCE_ID
    }

    int attributeId() default 0;

    C0228a[] enumMapping() default {};

    C0229b[] flagMapping() default {};

    boolean hasAttributeId() default true;

    String name() default "";

    C0230c valueType() default C0230c.INFERRED;
}
