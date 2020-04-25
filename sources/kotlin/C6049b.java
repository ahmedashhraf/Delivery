package kotlin;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.p218u0.C6123b;
import kotlin.p218u0.C6124c;
import kotlin.p218u0.C6127f;

@C6127f(allowedTargets = {C6123b.CLASS, C6123b.FUNCTION, C6123b.PROPERTY, C6123b.ANNOTATION_CLASS, C6123b.CONSTRUCTOR, C6123b.PROPERTY_SETTER, C6123b.PROPERTY_GETTER, C6123b.TYPEALIAS})
@Documented
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.ANNOTATION_TYPE})
@C6124c
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: kotlin.b */
/* compiled from: Annotations.kt */
public @interface C6049b {
    C6093c level() default C6093c.WARNING;

    String message();

    C6094c0 replaceWith() default @C6094c0(expression = "", imports = {});
}
