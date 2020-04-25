package p201f.p202a;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p201f.p202a.p204v.C5972c;
import p201f.p202a.p204v.C5975f;
import p201f.p202a.p204v.C5976g;

@Documented
@C5972c
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: f.a.g */
/* compiled from: Nonnull */
public @interface C5950g {

    /* renamed from: f.a.g$a */
    /* compiled from: Nonnull */
    public static class C5951a implements C5975f<C5950g> {
        /* renamed from: a */
        public C5976g mo24709a(C5950g gVar, Object obj) {
            if (obj == null) {
                return C5976g.NEVER;
            }
            return C5976g.ALWAYS;
        }
    }

    C5976g when() default C5976g.ALWAYS;
}
