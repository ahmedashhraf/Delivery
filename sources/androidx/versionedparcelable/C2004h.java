package androidx.versionedparcelable;

import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
@Retention(RetentionPolicy.SOURCE)
/* renamed from: androidx.versionedparcelable.h */
/* compiled from: VersionedParcelize */
public @interface C2004h {
    boolean allowSerialization() default false;

    int[] deprecatedIds() default {};

    Class factory() default void.class;

    boolean ignoreParcelables() default false;

    boolean isCustom() default false;

    String jetifyAs() default "";
}
