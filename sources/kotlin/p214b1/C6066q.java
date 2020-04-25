package kotlin.p214b1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.p218u0.C6122a;
import kotlin.p218u0.C6123b;
import kotlin.p218u0.C6126e;
import kotlin.p218u0.C6127f;

@C6127f(allowedTargets = {C6123b.FUNCTION, C6123b.PROPERTY_GETTER, C6123b.PROPERTY_SETTER, C6123b.CONSTRUCTOR})
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@C6126e(C6122a.SOURCE)
@Retention(RetentionPolicy.SOURCE)
/* renamed from: kotlin.b1.q */
/* compiled from: JvmPlatformAnnotations.kt */
public @interface C6066q {
    Class<? extends Throwable>[] exceptionClasses();
}
