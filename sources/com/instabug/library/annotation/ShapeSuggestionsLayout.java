package com.instabug.library.annotation;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import androidx.annotation.C0198k;
import com.instabug.library.C9700R;
import com.instabug.library.util.AttrResolver;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class ShapeSuggestionsLayout extends LinearLayout {

    /* renamed from: Q */
    private static transient /* synthetic */ boolean[] f25793Q;

    /* renamed from: N */
    private boolean f25794N;

    /* renamed from: O */
    private final Runnable f25795O;

    /* renamed from: P */
    private Handler f25796P;

    /* renamed from: a */
    private float f25797a;

    /* renamed from: b */
    private C9735d f25798b;

    /* renamed from: com.instabug.library.annotation.ShapeSuggestionsLayout$a */
    class C9732a implements Runnable {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f25799b;

        /* renamed from: a */
        final /* synthetic */ ShapeSuggestionsLayout f25800a;

        C9732a(ShapeSuggestionsLayout shapeSuggestionsLayout) {
            boolean[] a = m45380a();
            this.f25800a = shapeSuggestionsLayout;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45380a() {
            boolean[] zArr = f25799b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(5182090705438436193L, "com/instabug/library/annotation/ShapeSuggestionsLayout$1", 2);
            f25799b = a;
            return a;
        }

        public void run() {
            boolean[] a = m45380a();
            this.f25800a.mo34743b();
            a[1] = true;
        }
    }

    /* renamed from: com.instabug.library.annotation.ShapeSuggestionsLayout$b */
    class C9733b implements AnimatorListener {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f25801b;

        /* renamed from: a */
        final /* synthetic */ ShapeSuggestionsLayout f25802a;

        C9733b(ShapeSuggestionsLayout shapeSuggestionsLayout) {
            boolean[] a = m45381a();
            this.f25802a = shapeSuggestionsLayout;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45381a() {
            boolean[] zArr = f25801b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-1384164427132456401L, "com/instabug/library/annotation/ShapeSuggestionsLayout$2", 6);
            f25801b = a;
            return a;
        }

        public void onAnimationCancel(Animator animator) {
            m45381a()[4] = true;
        }

        public void onAnimationEnd(Animator animator) {
            boolean[] a = m45381a();
            this.f25802a.setVisibility(4);
            a[2] = true;
            this.f25802a.removeAllViews();
            a[3] = true;
        }

        public void onAnimationRepeat(Animator animator) {
            m45381a()[5] = true;
        }

        public void onAnimationStart(Animator animator) {
            m45381a()[1] = true;
        }
    }

    /* renamed from: com.instabug.library.annotation.ShapeSuggestionsLayout$c */
    class C9734c implements OnClickListener {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f25803b;

        /* renamed from: a */
        final /* synthetic */ ShapeSuggestionsLayout f25804a;

        C9734c(ShapeSuggestionsLayout shapeSuggestionsLayout) {
            boolean[] a = m45382a();
            this.f25804a = shapeSuggestionsLayout;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45382a() {
            boolean[] zArr = f25803b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(8308853122633743193L, "com/instabug/library/annotation/ShapeSuggestionsLayout$3", 7);
            f25803b = a;
            return a;
        }

        public void onClick(View view) {
            boolean[] a = m45382a();
            int indexOfChild = this.f25804a.indexOfChild(view);
            a[1] = true;
            ShapeSuggestionsLayout.m45374a(this.f25804a, indexOfChild);
            a[2] = true;
            if (ShapeSuggestionsLayout.m45371a(this.f25804a) == null) {
                a[3] = true;
            } else {
                a[4] = true;
                ShapeSuggestionsLayout.m45371a(this.f25804a).mo34699b(indexOfChild);
                a[5] = true;
            }
            this.f25804a.mo34743b();
            a[6] = true;
        }
    }

    /* renamed from: com.instabug.library.annotation.ShapeSuggestionsLayout$d */
    interface C9735d {
        /* renamed from: b */
        void mo34699b(int i);
    }

    /* renamed from: com.instabug.library.annotation.ShapeSuggestionsLayout$e */
    private final class C9736e extends View {

        /* renamed from: T */
        private static transient /* synthetic */ boolean[] f25805T;

        /* renamed from: N */
        private Paint f25806N = new Paint(1);

        /* renamed from: O */
        private RectF f25807O;

        /* renamed from: P */
        private RectF f25808P;
        @C0198k

        /* renamed from: Q */
        private int f25809Q;
        @C0198k

        /* renamed from: R */
        private int f25810R;

        /* renamed from: S */
        final /* synthetic */ ShapeSuggestionsLayout f25811S;

        /* renamed from: a */
        private Path f25812a;

        /* renamed from: b */
        private Path f25813b;

        public C9736e(ShapeSuggestionsLayout shapeSuggestionsLayout, Context context, Path path, int i) {
            boolean[] a = m45384a();
            this.f25811S = shapeSuggestionsLayout;
            a[0] = true;
            super(context);
            this.f25812a = path;
            a[1] = true;
            a[2] = true;
            this.f25806N.setStrokeWidth(4.0f);
            this.f25810R = i;
            a[3] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45384a() {
            boolean[] zArr = f25805T;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(896282742954385676L, "com/instabug/library/annotation/ShapeSuggestionsLayout$PathView", 30);
            f25805T = a;
            return a;
        }

        /* renamed from: a */
        public Path mo34753a(Path path, RectF rectF) {
            boolean[] a = m45384a();
            Path path2 = new Path(path);
            a[24] = true;
            RectF rectF2 = new RectF();
            a[25] = true;
            path2.computeBounds(rectF2, true);
            a[26] = true;
            Matrix matrix = new Matrix();
            a[27] = true;
            matrix.setRectToRect(rectF2, rectF, ScaleToFit.CENTER);
            a[28] = true;
            path2.transform(matrix);
            a[29] = true;
            return path2;
        }

        /* access modifiers changed from: protected */
        public void onDraw(Canvas canvas) {
            boolean[] a = m45384a();
            super.onDraw(canvas);
            a[15] = true;
            this.f25806N.setColor(this.f25809Q);
            a[16] = true;
            this.f25806N.setStyle(Style.FILL);
            a[17] = true;
            canvas.drawRoundRect(this.f25807O, ShapeSuggestionsLayout.m45375b(this.f25811S), ShapeSuggestionsLayout.m45375b(this.f25811S), this.f25806N);
            a[18] = true;
            this.f25806N.setColor(this.f25810R);
            a[19] = true;
            this.f25806N.setStyle(Style.STROKE);
            a[20] = true;
            canvas.drawPath(this.f25813b, this.f25806N);
            a[21] = true;
        }

        /* access modifiers changed from: protected */
        public void onMeasure(int i, int i2) {
            boolean[] a = m45384a();
            super.onMeasure(i, i2);
            a[4] = true;
            int dimension = (int) getResources().getDimension(C9700R.dimen.instabug_path_view_margin);
            a[5] = true;
            LayoutParams layoutParams = (LayoutParams) getLayoutParams();
            a[6] = true;
            layoutParams.setMargins(dimension, dimension, dimension, dimension);
            a[7] = true;
            setLayoutParams(layoutParams);
            a[8] = true;
            int dimension2 = (int) getResources().getDimension(C9700R.dimen.instabug_path_view_dimen);
            a[9] = true;
            setMeasuredDimension(dimension2, dimension2);
            a[10] = true;
            float f = (float) dimension2;
            this.f25807O = new RectF(0.0f, 0.0f, f, f);
            a[11] = true;
            this.f25808P = new RectF(this.f25807O);
            a[12] = true;
            this.f25808P.inset(8.0f, 8.0f);
            a[13] = true;
            this.f25813b = mo34753a(this.f25812a, this.f25808P);
            a[14] = true;
        }

        public void setBackgroundColor(@C0198k int i) {
            boolean[] a = m45384a();
            this.f25809Q = i;
            a[22] = true;
            invalidate();
            a[23] = true;
        }
    }

    public ShapeSuggestionsLayout(Context context) {
        boolean[] c = m45376c();
        this(context, null);
        c[0] = true;
    }

    /* renamed from: a */
    static /* synthetic */ C9735d m45371a(ShapeSuggestionsLayout shapeSuggestionsLayout) {
        boolean[] c = m45376c();
        C9735d dVar = shapeSuggestionsLayout.f25798b;
        c[49] = true;
        return dVar;
    }

    /* renamed from: b */
    static /* synthetic */ float m45375b(ShapeSuggestionsLayout shapeSuggestionsLayout) {
        boolean[] c = m45376c();
        float f = shapeSuggestionsLayout.f25797a;
        c[50] = true;
        return f;
    }

    /* renamed from: c */
    private static /* synthetic */ boolean[] m45376c() {
        boolean[] zArr = f25793Q;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-1757222098077305940L, "com/instabug/library/annotation/ShapeSuggestionsLayout", 51);
        f25793Q = a;
        return a;
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        boolean[] c = m45376c();
        super.onConfigurationChanged(configuration);
        if (this.f25794N) {
            c[6] = true;
        } else {
            c[7] = true;
            mo34743b();
            c[8] = true;
            mo34741a();
            c[9] = true;
        }
        c[10] = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        boolean[] c = m45376c();
        super.onDetachedFromWindow();
        Handler handler = this.f25796P;
        if (handler == null) {
            c[30] = true;
        } else {
            c[31] = true;
            handler.removeCallbacks(this.f25795O);
            this.f25796P = null;
            c[32] = true;
        }
        c[33] = true;
    }

    public void setOnShapeSelectedListener(C9735d dVar) {
        boolean[] c = m45376c();
        this.f25798b = dVar;
        c[23] = true;
    }

    /* renamed from: a */
    static /* synthetic */ void m45374a(ShapeSuggestionsLayout shapeSuggestionsLayout, int i) {
        boolean[] c = m45376c();
        shapeSuggestionsLayout.m45372a(i);
        c[48] = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo34743b() {
        boolean[] c = m45376c();
        this.f25796P.removeCallbacks(this.f25795O);
        if (this.f25794N) {
            c[34] = true;
            return;
        }
        this.f25794N = true;
        if (VERSION.SDK_INT < 12) {
            c[35] = true;
        } else {
            c[36] = true;
            animate().alpha(0.0f).setDuration(400).setListener(new C9733b(this));
            c[37] = true;
        }
        c[38] = true;
    }

    public ShapeSuggestionsLayout(Context context, AttributeSet attributeSet) {
        boolean[] c = m45376c();
        this(context, attributeSet, 0);
        c[1] = true;
    }

    /* renamed from: a */
    private void m45373a(Context context, AttributeSet attributeSet, int i) {
        boolean[] c = m45376c();
        setVisibility(4);
        c[11] = true;
        setGravity(17);
        c[12] = true;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        c[13] = true;
        this.f25797a = TypedValue.applyDimension(1, 4.0f, displayMetrics);
        c[14] = true;
        int applyDimension = (int) TypedValue.applyDimension(1, 1.5f, displayMetrics);
        c[15] = true;
        GradientDrawable gradientDrawable = new GradientDrawable();
        c[16] = true;
        gradientDrawable.setColor(AttrResolver.getBackgroundColor(getContext()));
        c[17] = true;
        gradientDrawable.setCornerRadius(this.f25797a);
        c[18] = true;
        gradientDrawable.setStroke(applyDimension, AttrResolver.getDividerColor(getContext()));
        if (VERSION.SDK_INT >= 16) {
            c[19] = true;
            setBackground(gradientDrawable);
            c[20] = true;
        } else {
            setBackgroundDrawable(gradientDrawable);
            c[21] = true;
        }
        c[22] = true;
    }

    @TargetApi(11)
    public ShapeSuggestionsLayout(Context context, AttributeSet attributeSet, int i) {
        boolean[] c = m45376c();
        super(context, attributeSet, i);
        c[2] = true;
        this.f25795O = new C9732a(this);
        c[3] = true;
        this.f25796P = new Handler();
        c[4] = true;
        m45373a(context, attributeSet, i);
        c[5] = true;
    }

    /* renamed from: a */
    public void mo34741a() {
        boolean[] c = m45376c();
        if (!this.f25794N) {
            c[24] = true;
            return;
        }
        this.f25794N = false;
        c[25] = true;
        setVisibility(0);
        if (VERSION.SDK_INT < 12) {
            c[26] = true;
        } else {
            c[27] = true;
            animate().alpha(1.0f).setDuration(400).setListener(null);
            c[28] = true;
        }
        this.f25796P.postDelayed(this.f25795O, 3000);
        c[29] = true;
    }

    /* renamed from: a */
    public void mo34742a(Path path) {
        boolean[] c = m45376c();
        Context context = getContext();
        c[39] = true;
        C9736e eVar = new C9736e(this, context, path, AttrResolver.getTintingColor(getContext()));
        c[40] = true;
        eVar.setOnClickListener(new C9734c(this));
        c[41] = true;
        addView(eVar);
        c[42] = true;
        m45372a(0);
        c[43] = true;
    }

    /* renamed from: a */
    private void m45372a(int i) {
        boolean[] c = m45376c();
        c[44] = true;
        int i2 = 0;
        while (i2 < getChildCount()) {
            c[45] = true;
            getChildAt(i2).setBackgroundColor(0);
            i2++;
            c[46] = true;
        }
        getChildAt(i).setBackgroundColor(AttrResolver.getDividerColor(getContext()));
        c[47] = true;
    }
}
