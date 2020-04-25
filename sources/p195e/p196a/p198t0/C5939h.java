package p195e.p196a.p198t0;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: e.a.t0.h */
/* compiled from: SchedulerSupport */
public @interface C5939h {

    /* renamed from: C0 */
    public static final String f17184C0 = "none";

    /* renamed from: D0 */
    public static final String f17185D0 = "custom";

    /* renamed from: E0 */
    public static final String f17186E0 = "io.reactivex:computation";

    /* renamed from: F0 */
    public static final String f17187F0 = "io.reactivex:io";

    /* renamed from: G0 */
    public static final String f17188G0 = "io.reactivex:new-thread";

    /* renamed from: H0 */
    public static final String f17189H0 = "io.reactivex:trampoline";
    @C5936e

    /* renamed from: I0 */
    public static final String f17190I0 = "io.reactivex:single";

    String value();
}
