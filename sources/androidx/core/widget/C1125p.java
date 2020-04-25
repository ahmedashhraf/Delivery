package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;

@C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.core.widget.p */
/* compiled from: TintableImageSourceView */
public interface C1125p {
    @C0195i0
    ColorStateList getSupportImageTintList();

    @C0195i0
    Mode getSupportImageTintMode();

    void setSupportImageTintList(@C0195i0 ColorStateList colorStateList);

    void setSupportImageTintMode(@C0195i0 Mode mode);
}
