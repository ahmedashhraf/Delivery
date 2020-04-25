package kotlin.p214b1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.p218u0.C6122a;
import kotlin.p218u0.C6123b;
import kotlin.p218u0.C6126e;
import kotlin.p218u0.C6127f;

@C6127f(allowedTargets = {C6123b.FILE, C6123b.CLASS, C6123b.PROPERTY, C6123b.CONSTRUCTOR, C6123b.FUNCTION})
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
@C6126e(C6122a.SOURCE)
@Retention(RetentionPolicy.SOURCE)
/* renamed from: kotlin.b1.k */
/* compiled from: JvmVersion.kt */
public @interface C6061k {
    int maximum() default 100;

    int minimum() default 6;
}
