package androidx.databinding;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.ANNOTATION_TYPE})
/* renamed from: androidx.databinding.n */
/* compiled from: InverseBindingAdapter */
public @interface C1285n {
    String attribute();

    String event() default "";
}
