package p205i.p206a.p207a.p208a;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p205i.p209c.p210a.C6002c;

@Documented
@Target({ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
/* renamed from: i.a.a.a.a */
/* compiled from: Flow */
public @interface C5977a {
    @C6002c

    /* renamed from: J0 */
    public static final String f17191J0 = "The method argument (if parameter was annotated) or this container (if instance method was annotated)";
    @C6002c

    /* renamed from: K0 */
    public static final String f17192K0 = "this";
    @C6002c

    /* renamed from: L0 */
    public static final String f17193L0 = "This container (if the parameter was annotated) or the return value (if instance method was annotated)";
    @C6002c

    /* renamed from: M0 */
    public static final String f17194M0 = "The return value of this method";
    @C6002c

    /* renamed from: N0 */
    public static final String f17195N0 = "this";

    String source() default "The method argument (if parameter was annotated) or this container (if instance method was annotated)";

    boolean sourceIsContainer() default false;

    String target() default "This container (if the parameter was annotated) or the return value (if instance method was annotated)";

    boolean targetIsContainer() default false;
}
