package kotlin;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.p218u0.C6122a;
import kotlin.p218u0.C6123b;
import kotlin.p218u0.C6126e;
import kotlin.p218u0.C6127f;

@C6127f(allowedTargets = {C6123b.CLASS})
@Target({ElementType.TYPE})
@C6126e(C6122a.RUNTIME)
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: kotlin.u */
/* compiled from: Metadata.kt */
public @interface C6121u {
    /* renamed from: bv */
    int[] mo24988bv() default {};

    /* renamed from: d1 */
    String[] mo24989d1() default {};

    /* renamed from: d2 */
    String[] mo24990d2() default {};

    /* renamed from: k */
    int mo24991k() default 1;

    /* renamed from: mv */
    int[] mo24992mv() default {};

    /* renamed from: pn */
    String mo24993pn() default "";

    /* renamed from: xi */
    int mo24994xi() default 0;

    /* renamed from: xs */
    String mo24995xs() default "";
}
