package p201f.p202a;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p201f.p202a.p204v.C5972c;
import p201f.p202a.p204v.C5975f;
import p201f.p202a.p204v.C5976g;

@Documented
@C5972c(applicableTo = Number.class)
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: f.a.f */
/* compiled from: Nonnegative */
public @interface C5948f {

    /* renamed from: f.a.f$a */
    /* compiled from: Nonnegative */
    public static class C5949a implements C5975f<C5948f> {
        /* renamed from: a */
        public C5976g mo24709a(C5948f fVar, Object obj) {
            if (!(obj instanceof Number)) {
                return C5976g.NEVER;
            }
            Number number = (Number) obj;
            boolean z = true;
            if (!(number instanceof Long) ? !(number instanceof Double) ? !(number instanceof Float) ? number.intValue() >= 0 : number.floatValue() >= 0.0f : number.doubleValue() >= 0.0d : number.longValue() >= 0) {
                z = false;
            }
            if (z) {
                return C5976g.NEVER;
            }
            return C5976g.ALWAYS;
        }
    }

    C5976g when() default C5976g.ALWAYS;
}
