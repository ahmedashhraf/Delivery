package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.widget.ImageView;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;

/* renamed from: androidx.core.widget.f */
/* compiled from: ImageViewCompat */
public class C1113f {
    private C1113f() {
    }

    @C0195i0
    /* renamed from: a */
    public static ColorStateList m6333a(@C0193h0 ImageView imageView) {
        if (VERSION.SDK_INT >= 21) {
            return imageView.getImageTintList();
        }
        return imageView instanceof C1125p ? ((C1125p) imageView).getSupportImageTintList() : null;
    }

    @C0195i0
    /* renamed from: b */
    public static Mode m6336b(@C0193h0 ImageView imageView) {
        if (VERSION.SDK_INT >= 21) {
            return imageView.getImageTintMode();
        }
        return imageView instanceof C1125p ? ((C1125p) imageView).getSupportImageTintMode() : null;
    }

    /* renamed from: a */
    public static void m6334a(@C0193h0 ImageView imageView, @C0195i0 ColorStateList colorStateList) {
        if (VERSION.SDK_INT >= 21) {
            imageView.setImageTintList(colorStateList);
            if (VERSION.SDK_INT == 21) {
                Drawable drawable = imageView.getDrawable();
                if (drawable != null && imageView.getImageTintList() != null) {
                    if (drawable.isStateful()) {
                        drawable.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable);
                }
            }
        } else if (imageView instanceof C1125p) {
            ((C1125p) imageView).setSupportImageTintList(colorStateList);
        }
    }

    /* renamed from: a */
    public static void m6335a(@C0193h0 ImageView imageView, @C0195i0 Mode mode) {
        if (VERSION.SDK_INT >= 21) {
            imageView.setImageTintMode(mode);
            if (VERSION.SDK_INT == 21) {
                Drawable drawable = imageView.getDrawable();
                if (drawable != null && imageView.getImageTintList() != null) {
                    if (drawable.isStateful()) {
                        drawable.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable);
                }
            }
        } else if (imageView instanceof C1125p) {
            ((C1125p) imageView).setSupportImageTintMode(mode);
        }
    }
}
