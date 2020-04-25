package androidx.core.app;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.core.app.z */
/* compiled from: SharedElementCallback */
public abstract class C0815z {

    /* renamed from: b */
    private static final int f3896b = 1048576;

    /* renamed from: c */
    private static final String f3897c = "sharedElement:snapshot:bitmap";

    /* renamed from: d */
    private static final String f3898d = "sharedElement:snapshot:imageScaleType";

    /* renamed from: e */
    private static final String f3899e = "sharedElement:snapshot:imageMatrix";

    /* renamed from: a */
    private Matrix f3900a;

    /* renamed from: androidx.core.app.z$a */
    /* compiled from: SharedElementCallback */
    public interface C0816a {
        /* renamed from: a */
        void mo4072a();
    }

    /* renamed from: a */
    public Parcelable mo4455a(View view, Matrix matrix, RectF rectF) {
        if (view instanceof ImageView) {
            ImageView imageView = (ImageView) view;
            Drawable drawable = imageView.getDrawable();
            Drawable background = imageView.getBackground();
            if (drawable != null && background == null) {
                Bitmap a = m4768a(drawable);
                if (a != null) {
                    Bundle bundle = new Bundle();
                    bundle.putParcelable(f3897c, a);
                    bundle.putString(f3898d, imageView.getScaleType().toString());
                    if (imageView.getScaleType() == ScaleType.MATRIX) {
                        float[] fArr = new float[9];
                        imageView.getImageMatrix().getValues(fArr);
                        bundle.putFloatArray(f3899e, fArr);
                    }
                    return bundle;
                }
            }
        }
        int round = Math.round(rectF.width());
        int round2 = Math.round(rectF.height());
        Bitmap bitmap = null;
        if (round > 0 && round2 > 0) {
            float min = Math.min(1.0f, 1048576.0f / ((float) (round * round2)));
            int i = (int) (((float) round) * min);
            int i2 = (int) (((float) round2) * min);
            if (this.f3900a == null) {
                this.f3900a = new Matrix();
            }
            this.f3900a.set(matrix);
            this.f3900a.postTranslate(-rectF.left, -rectF.top);
            this.f3900a.postScale(min, min);
            bitmap = Bitmap.createBitmap(i, i2, Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmap);
            canvas.concat(this.f3900a);
            view.draw(canvas);
        }
        return bitmap;
    }

    /* renamed from: a */
    public void mo4457a(List<View> list) {
    }

    /* renamed from: a */
    public void mo4459a(List<String> list, List<View> list2, List<View> list3) {
    }

    /* renamed from: a */
    public void mo4460a(List<String> list, Map<String, View> map) {
    }

    /* renamed from: b */
    public void mo4461b(List<String> list, List<View> list2, List<View> list3) {
    }

    /* renamed from: a */
    private static Bitmap m4768a(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return null;
        }
        float min = Math.min(1.0f, 1048576.0f / ((float) (intrinsicWidth * intrinsicHeight)));
        if ((drawable instanceof BitmapDrawable) && min == 1.0f) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        int i = (int) (((float) intrinsicWidth) * min);
        int i2 = (int) (((float) intrinsicHeight) * min);
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Rect bounds = drawable.getBounds();
        int i3 = bounds.left;
        int i4 = bounds.top;
        int i5 = bounds.right;
        int i6 = bounds.bottom;
        drawable.setBounds(0, 0, i, i2);
        drawable.draw(canvas);
        drawable.setBounds(i3, i4, i5, i6);
        return createBitmap;
    }

    /* renamed from: a */
    public View mo4456a(Context context, Parcelable parcelable) {
        ImageView imageView = null;
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            Bitmap bitmap = (Bitmap) bundle.getParcelable(f3897c);
            if (bitmap == null) {
                return null;
            }
            imageView = new ImageView(context);
            imageView.setImageBitmap(bitmap);
            imageView.setScaleType(ScaleType.valueOf(bundle.getString(f3898d)));
            if (imageView.getScaleType() == ScaleType.MATRIX) {
                float[] floatArray = bundle.getFloatArray(f3899e);
                Matrix matrix = new Matrix();
                matrix.setValues(floatArray);
                imageView.setImageMatrix(matrix);
            }
        } else if (parcelable instanceof Bitmap) {
            Bitmap bitmap2 = (Bitmap) parcelable;
            imageView = new ImageView(context);
            imageView.setImageBitmap(bitmap2);
        }
        return imageView;
    }

    /* renamed from: a */
    public void mo4458a(List<String> list, List<View> list2, C0816a aVar) {
        aVar.mo4072a();
    }
}
