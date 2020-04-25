package p201f.p202a;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import p201f.p202a.p204v.C5974e;
import p201f.p202a.p204v.C5975f;
import p201f.p202a.p204v.C5976g;

@C5974e
@C5960o("RegEx")
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: f.a.m */
/* compiled from: RegEx */
public @interface C5957m {

    /* renamed from: f.a.m$a */
    /* compiled from: RegEx */
    public static class C5958a implements C5975f<C5957m> {
        /* renamed from: a */
        public C5976g mo24709a(C5957m mVar, Object obj) {
            if (!(obj instanceof String)) {
                return C5976g.NEVER;
            }
            try {
                Pattern.compile((String) obj);
                return C5976g.ALWAYS;
            } catch (PatternSyntaxException unused) {
                return C5976g.NEVER;
            }
        }
    }

    C5976g when() default C5976g.ALWAYS;
}
