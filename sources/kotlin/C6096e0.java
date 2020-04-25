package kotlin;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.p218u0.C6122a;
import kotlin.p218u0.C6123b;
import kotlin.p218u0.C6124c;
import kotlin.p218u0.C6126e;
import kotlin.p218u0.C6127f;

@C6127f(allowedTargets = {C6123b.CLASS, C6123b.PROPERTY, C6123b.FIELD, C6123b.CONSTRUCTOR, C6123b.FUNCTION, C6123b.PROPERTY_GETTER, C6123b.PROPERTY_SETTER, C6123b.TYPEALIAS})
@Documented
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.CONSTRUCTOR})
@C6124c
@C6126e(C6122a.BINARY)
@Retention(RetentionPolicy.CLASS)
/* renamed from: kotlin.e0 */
/* compiled from: Annotations.kt */
public @interface C6096e0 {
    String version();
}
