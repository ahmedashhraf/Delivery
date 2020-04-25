package androidx.databinding;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE})
/* renamed from: androidx.databinding.p */
/* compiled from: InverseBindingMethod */
public @interface C1287p {
    String attribute();

    String event() default "";

    String method() default "";

    Class type();
}
