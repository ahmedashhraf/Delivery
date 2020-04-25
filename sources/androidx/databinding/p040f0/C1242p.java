package androidx.databinding.p040f0;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.databinding.C1179d;
import androidx.databinding.C1267g;
import androidx.databinding.C1268h;

@C0207n0({C0208a.LIBRARY})
@C1268h({@C1267g(attribute = "android:tint", method = "setImageTintList", type = ImageView.class), @C1267g(attribute = "android:tintMode", method = "setImageTintMode", type = ImageView.class)})
/* renamed from: androidx.databinding.f0.p */
/* compiled from: ImageViewBindingAdapter */
public class C1242p {
    @C1179d({"android:src"})
    /* renamed from: a */
    public static void m6819a(ImageView imageView, String str) {
        if (str == null) {
            imageView.setImageURI(null);
        } else {
            imageView.setImageURI(Uri.parse(str));
        }
    }

    @C1179d({"android:src"})
    /* renamed from: a */
    public static void m6818a(ImageView imageView, Uri uri) {
        imageView.setImageURI(uri);
    }

    @C1179d({"android:src"})
    /* renamed from: a */
    public static void m6817a(ImageView imageView, Drawable drawable) {
        imageView.setImageDrawable(drawable);
    }
}
