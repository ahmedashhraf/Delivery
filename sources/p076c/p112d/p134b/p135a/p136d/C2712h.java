package p076c.p112d.p134b.p135a.p136d;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p076c.p112d.p134b.p135a.p143g.C2766f;

@C2766f
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: c.d.b.a.d.h */
/* compiled from: JsonPolymorphicTypeMap */
public @interface C2712h {

    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: c.d.b.a.d.h$a */
    /* compiled from: JsonPolymorphicTypeMap */
    public @interface C2713a {
        String key();

        Class<?> ref();
    }

    C2713a[] typeDefinitions();
}
