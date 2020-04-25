package kotlin.p213a1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.C6093c;
import kotlin.C6096e0;
import kotlin.p218u0.C6122a;
import kotlin.p218u0.C6123b;
import kotlin.p218u0.C6126e;
import kotlin.p218u0.C6127f;

@C6127f(allowedTargets = {C6123b.CLASS, C6123b.FUNCTION, C6123b.PROPERTY, C6123b.CONSTRUCTOR, C6123b.TYPEALIAS})
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
@C6096e0(version = "1.2")
@C6126e(C6122a.SOURCE)
@Retention(RetentionPolicy.SOURCE)
/* renamed from: kotlin.a1.o */
/* compiled from: Annotations.kt */
public @interface C6047o {
    int errorCode() default -1;

    C6093c level() default C6093c.ERROR;

    String message() default "";

    String version();

    C6048p versionKind() default C6048p.LANGUAGE_VERSION;
}
