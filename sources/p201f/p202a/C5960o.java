package p201f.p202a;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p201f.p202a.p204v.C5972c;
import p201f.p202a.p204v.C5976g;

@Documented
@C5972c(applicableTo = String.class)
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: f.a.o */
/* compiled from: Syntax */
public @interface C5960o {
    String value();

    C5976g when() default C5976g.ALWAYS;
}
