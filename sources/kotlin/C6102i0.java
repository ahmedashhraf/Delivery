package kotlin;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.p218u0.C6122a;
import kotlin.p218u0.C6123b;
import kotlin.p218u0.C6126e;
import kotlin.p218u0.C6127f;

@C6127f(allowedTargets = {C6123b.CLASS, C6123b.ANNOTATION_CLASS, C6123b.PROPERTY, C6123b.FIELD, C6123b.LOCAL_VARIABLE, C6123b.VALUE_PARAMETER, C6123b.CONSTRUCTOR, C6123b.FUNCTION, C6123b.PROPERTY_GETTER, C6123b.PROPERTY_SETTER, C6123b.TYPE, C6123b.EXPRESSION, C6123b.FILE, C6123b.TYPEALIAS})
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.CONSTRUCTOR, ElementType.LOCAL_VARIABLE, ElementType.ANNOTATION_TYPE})
@C6126e(C6122a.SOURCE)
@Retention(RetentionPolicy.SOURCE)
/* renamed from: kotlin.i0 */
/* compiled from: Annotations.kt */
public @interface C6102i0 {
    String[] names();
}
