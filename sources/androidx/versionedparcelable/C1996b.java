package androidx.versionedparcelable;

import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
@Retention(RetentionPolicy.SOURCE)
/* renamed from: androidx.versionedparcelable.b */
/* compiled from: ParcelField */
public @interface C1996b {
    String defaultValue() default "";

    int value();
}
