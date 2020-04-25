package p201f.p202a;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.regex.Pattern;
import p201f.p202a.p204v.C5972c;
import p201f.p202a.p204v.C5975f;
import p201f.p202a.p204v.C5976g;

@Documented
@C5972c(applicableTo = String.class)
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: f.a.e */
/* compiled from: MatchesPattern */
public @interface C5946e {

    /* renamed from: f.a.e$a */
    /* compiled from: MatchesPattern */
    public static class C5947a implements C5975f<C5946e> {
        /* renamed from: a */
        public C5976g mo24709a(C5946e eVar, Object obj) {
            if (Pattern.compile(eVar.value(), eVar.flags()).matcher((String) obj).matches()) {
                return C5976g.ALWAYS;
            }
            return C5976g.NEVER;
        }
    }

    int flags() default 0;

    @C5957m
    String value();
}
