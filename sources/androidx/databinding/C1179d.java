package androidx.databinding;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
/* renamed from: androidx.databinding.d */
/* compiled from: BindingAdapter */
public @interface C1179d {
    boolean requireAll() default true;

    String[] value();
}
