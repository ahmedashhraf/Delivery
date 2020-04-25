package androidx.annotation.p005y0;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.PACKAGE})
@Retention(RetentionPolicy.CLASS)
/* renamed from: androidx.annotation.y0.c */
/* compiled from: UseExperimental */
public @interface C0236c {
    Class<?> markerClass();
}
