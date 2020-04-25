package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import androidx.annotation.C0193h0;
import java.util.Map;

/* renamed from: androidx.transition.g */
/* compiled from: ChangeImageTransform */
public class C1890g extends C1880f0 {

    /* renamed from: H0 */
    private static final String f7308H0 = "android:changeImageTransform:matrix";

    /* renamed from: I0 */
    private static final String f7309I0 = "android:changeImageTransform:bounds";

    /* renamed from: J0 */
    private static final String[] f7310J0 = {f7308H0, f7309I0};

    /* renamed from: K0 */
    private static final TypeEvaluator<Matrix> f7311K0 = new C1891a();

    /* renamed from: L0 */
    private static final Property<ImageView, Matrix> f7312L0 = new C1892b(Matrix.class, "animatedTransform");

    /* renamed from: androidx.transition.g$a */
    /* compiled from: ChangeImageTransform */
    static class C1891a implements TypeEvaluator<Matrix> {
        C1891a() {
        }

        /* renamed from: a */
        public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            return null;
        }
    }

    /* renamed from: androidx.transition.g$b */
    /* compiled from: ChangeImageTransform */
    static class C1892b extends Property<ImageView, Matrix> {
        C1892b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Matrix get(ImageView imageView) {
            return null;
        }

        /* renamed from: a */
        public void set(ImageView imageView, Matrix matrix) {
            C1941t.m10237a(imageView, matrix);
        }
    }

    /* renamed from: androidx.transition.g$c */
    /* compiled from: ChangeImageTransform */
    static /* synthetic */ class C1893c {

        /* renamed from: a */
        static final /* synthetic */ int[] f7313a = new int[ScaleType.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                android.widget.ImageView$ScaleType[] r0 = android.widget.ImageView.ScaleType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f7313a = r0
                int[] r0 = f7313a     // Catch:{ NoSuchFieldError -> 0x0014 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f7313a     // Catch:{ NoSuchFieldError -> 0x001f }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.transition.C1890g.C1893c.<clinit>():void");
        }
    }

    public C1890g() {
    }

    @C0193h0
    /* renamed from: b */
    private static Matrix m10014b(@C0193h0 ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        if (drawable.getIntrinsicWidth() > 0 && drawable.getIntrinsicHeight() > 0) {
            int i = C1893c.f7313a[imageView.getScaleType().ordinal()];
            if (i == 1) {
                return m10016d(imageView);
            }
            if (i == 2) {
                return m10013a(imageView);
            }
        }
        return new Matrix(imageView.getImageMatrix());
    }

    /* renamed from: d */
    private void m10017d(C1922m0 m0Var) {
        View view = m0Var.f7404b;
        if ((view instanceof ImageView) && view.getVisibility() == 0) {
            ImageView imageView = (ImageView) view;
            if (imageView.getDrawable() != null) {
                Map<String, Object> map = m0Var.f7403a;
                map.put(f7309I0, new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
                map.put(f7308H0, m10014b(imageView));
            }
        }
    }

    /* renamed from: a */
    public void mo8261a(@C0193h0 C1922m0 m0Var) {
        m10017d(m0Var);
    }

    /* renamed from: c */
    public void mo8263c(@C0193h0 C1922m0 m0Var) {
        m10017d(m0Var);
    }

    /* renamed from: o */
    public String[] mo8272o() {
        return f7310J0;
    }

    public C1890g(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @C0193h0
    /* renamed from: c */
    private ObjectAnimator m10015c(@C0193h0 ImageView imageView) {
        Property<ImageView, Matrix> property = f7312L0;
        TypeEvaluator<Matrix> typeEvaluator = f7311K0;
        Matrix matrix = C1944u.f7464a;
        return ObjectAnimator.ofObject(imageView, property, typeEvaluator, new Matrix[]{matrix, matrix});
    }

    /* renamed from: a */
    public Animator mo8270a(@C0193h0 ViewGroup viewGroup, C1922m0 m0Var, C1922m0 m0Var2) {
        ObjectAnimator objectAnimator = null;
        if (!(m0Var == null || m0Var2 == null)) {
            Map<String, Object> map = m0Var.f7403a;
            String str = f7309I0;
            Rect rect = (Rect) map.get(str);
            Rect rect2 = (Rect) m0Var2.f7403a.get(str);
            if (!(rect == null || rect2 == null)) {
                Map<String, Object> map2 = m0Var.f7403a;
                String str2 = f7308H0;
                Matrix matrix = (Matrix) map2.get(str2);
                Matrix matrix2 = (Matrix) m0Var2.f7403a.get(str2);
                boolean z = (matrix == null && matrix2 == null) || (matrix != null && matrix.equals(matrix2));
                if (rect.equals(rect2) && z) {
                    return null;
                }
                ImageView imageView = (ImageView) m0Var2.f7404b;
                Drawable drawable = imageView.getDrawable();
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
                    objectAnimator = m10015c(imageView);
                } else {
                    if (matrix == null) {
                        matrix = C1944u.f7464a;
                    }
                    if (matrix2 == null) {
                        matrix2 = C1944u.f7464a;
                    }
                    f7312L0.set(imageView, matrix);
                    objectAnimator = m10012a(imageView, matrix, matrix2);
                }
            }
        }
        return objectAnimator;
    }

    /* renamed from: d */
    private static Matrix m10016d(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        Matrix matrix = new Matrix();
        matrix.postScale(((float) imageView.getWidth()) / ((float) drawable.getIntrinsicWidth()), ((float) imageView.getHeight()) / ((float) drawable.getIntrinsicHeight()));
        return matrix;
    }

    /* renamed from: a */
    private ObjectAnimator m10012a(ImageView imageView, Matrix matrix, Matrix matrix2) {
        return ObjectAnimator.ofObject(imageView, f7312L0, new C1920a(), new Matrix[]{matrix, matrix2});
    }

    /* renamed from: a */
    private static Matrix m10013a(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        float width = (float) imageView.getWidth();
        float intrinsicWidth = (float) drawable.getIntrinsicWidth();
        float f = width / intrinsicWidth;
        float height = (float) imageView.getHeight();
        float intrinsicHeight = (float) drawable.getIntrinsicHeight();
        float max = Math.max(f, height / intrinsicHeight);
        float f2 = intrinsicHeight * max;
        int round = Math.round((width - (intrinsicWidth * max)) / 2.0f);
        int round2 = Math.round((height - f2) / 2.0f);
        Matrix matrix = new Matrix();
        matrix.postScale(max, max);
        matrix.postTranslate((float) round, (float) round2);
        return matrix;
    }
}
