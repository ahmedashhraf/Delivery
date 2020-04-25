package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.widget.ImageView;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Field;

/* renamed from: androidx.transition.t */
/* compiled from: ImageViewUtils */
class C1941t {

    /* renamed from: a */
    private static boolean f7454a = true;

    /* renamed from: b */
    private static Field f7455b;

    /* renamed from: c */
    private static boolean f7456c;

    private C1941t() {
    }

    /* renamed from: a */
    static void m10237a(@C0193h0 ImageView imageView, @C0195i0 Matrix matrix) {
        int i = VERSION.SDK_INT;
        if (i >= 29) {
            imageView.animateTransform(matrix);
        } else if (matrix == null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable != null) {
                drawable.setBounds(0, 0, (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight(), (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom());
                imageView.invalidate();
            }
        } else if (i >= 21) {
            m10238b(imageView, matrix);
        } else {
            Drawable drawable2 = imageView.getDrawable();
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
                Matrix matrix2 = null;
                m10236a();
                Field field = f7455b;
                if (field != null) {
                    try {
                        Matrix matrix3 = (Matrix) field.get(imageView);
                        if (matrix3 == null) {
                            try {
                                matrix2 = new Matrix();
                                f7455b.set(imageView, matrix2);
                            } catch (IllegalAccessException unused) {
                            }
                        }
                        matrix2 = matrix3;
                    } catch (IllegalAccessException unused2) {
                    }
                }
                if (matrix2 != null) {
                    matrix2.set(matrix);
                }
                imageView.invalidate();
            }
        }
    }

    @RequiresApi(21)
    @SuppressLint({"NewApi"})
    /* renamed from: b */
    private static void m10238b(@C0193h0 ImageView imageView, @C0195i0 Matrix matrix) {
        if (f7454a) {
            try {
                imageView.animateTransform(matrix);
            } catch (NoSuchMethodError unused) {
                f7454a = false;
            }
        }
    }

    /* renamed from: a */
    private static void m10236a() {
        if (!f7456c) {
            try {
                f7455b = ImageView.class.getDeclaredField("mDrawMatrix");
                f7455b.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f7456c = true;
        }
    }
}
