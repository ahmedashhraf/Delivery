package kotlin;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.p218u0.C6122a;
import kotlin.p218u0.C6123b;
import kotlin.p218u0.C6126e;
import kotlin.p218u0.C6127f;

@C6127f(allowedTargets = {C6123b.CLASS, C6123b.PROPERTY, C6123b.LOCAL_VARIABLE, C6123b.VALUE_PARAMETER, C6123b.CONSTRUCTOR, C6123b.FUNCTION, C6123b.PROPERTY_GETTER, C6123b.PROPERTY_SETTER, C6123b.EXPRESSION, C6123b.FILE})
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.PARAMETER, ElementType.CONSTRUCTOR, ElementType.LOCAL_VARIABLE})
@C6096e0(version = "1.3")
@C6126e(C6122a.SOURCE)
@Retention(RetentionPolicy.SOURCE)
/* renamed from: kotlin.s0 */
/* compiled from: Experimental.kt */
public @interface C6120s0 {
    Class<? extends Annotation>[] markerClass();
}
