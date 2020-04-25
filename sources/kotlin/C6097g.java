package kotlin;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.p218u0.C6122a;
import kotlin.p218u0.C6123b;
import kotlin.p218u0.C6126e;
import kotlin.p218u0.C6127f;

@C6127f(allowedTargets = {C6123b.ANNOTATION_CLASS})
@Target({ElementType.ANNOTATION_TYPE})
@C6096e0(version = "1.3")
@C6126e(C6122a.BINARY)
@C6121u(mo24988bv = {1, 0, 2}, mo24989d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u001a\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005R\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0000R\t\u0010\u0002\u001a\u00020\u0003¢\u0006\u0000¨\u0006\t"}, mo24990d2 = {"Lkotlin/Experimental;", "", "level", "Lkotlin/Experimental$Level;", "changesMayBreak", "", "Lkotlin/Experimental$Impact;", "Impact", "Level", "kotlin-stdlib-experimental"}, mo24991k = 1, mo24992mv = {1, 1, 10}, mo24994xi = 2)
@Retention(RetentionPolicy.CLASS)
/* renamed from: kotlin.g */
/* compiled from: Experimental.kt */
public @interface C6097g {

    /* renamed from: kotlin.g$a */
    /* compiled from: Experimental.kt */
    public enum C6098a {
        COMPILATION,
        LINKAGE,
        RUNTIME
    }

    /* renamed from: kotlin.g$b */
    /* compiled from: Experimental.kt */
    public enum C6099b {
        WARNING,
        ERROR
    }

    C6098a[] changesMayBreak() default {C6098a.COMPILATION, C6098a.LINKAGE, C6098a.RUNTIME};

    C6099b level() default C6099b.ERROR;
}
