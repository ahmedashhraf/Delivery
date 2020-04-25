package com.instabug.library.internal.view.floatingactionbutton;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import androidx.core.p024e.p025b.C0886a;
import com.instabug.library.C9700R;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.internal.view.floatingactionbutton.c */
/* compiled from: StopFloatingActionButton */
public class C9876c extends C9871a {

    /* renamed from: b0 */
    private static transient /* synthetic */ boolean[] f26210b0;

    /* renamed from: com.instabug.library.internal.view.floatingactionbutton.c$a */
    /* compiled from: StopFloatingActionButton */
    class C9877a extends Shape {

        /* renamed from: Q */
        private static transient /* synthetic */ boolean[] f26211Q;

        /* renamed from: N */
        final /* synthetic */ float f26212N;

        /* renamed from: O */
        final /* synthetic */ float f26213O;

        /* renamed from: P */
        final /* synthetic */ C9876c f26214P;

        /* renamed from: a */
        final /* synthetic */ float f26215a;

        /* renamed from: b */
        final /* synthetic */ float f26216b;

        C9877a(C9876c cVar, float f, float f2, float f3, float f4) {
            boolean[] b = m45983b();
            this.f26214P = cVar;
            this.f26215a = f;
            this.f26216b = f2;
            this.f26212N = f3;
            this.f26213O = f4;
            b[0] = true;
        }

        /* renamed from: b */
        private static /* synthetic */ boolean[] m45983b() {
            boolean[] zArr = f26211Q;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-778778098254932185L, "com/instabug/library/internal/view/floatingactionbutton/StopFloatingActionButton$1", 11);
            f26211Q = a;
            return a;
        }

        public void draw(Canvas canvas, Paint paint) {
            boolean[] b = m45983b();
            if (this.f26214P.isEnabled()) {
                b[1] = true;
                paint.setColor(C0886a.f4059c);
                b[2] = true;
            } else {
                paint.setColor(Color.parseColor("#D1D1D6"));
                b[3] = true;
            }
            paint.setStyle(Style.STROKE);
            b[4] = true;
            paint.setStrokeWidth(this.f26215a);
            b[5] = true;
            float f = this.f26216b;
            canvas.drawCircle(f, f, this.f26212N / 2.0f, paint);
            b[6] = true;
            paint.setStyle(Style.FILL);
            b[7] = true;
            float f2 = this.f26213O;
            RectF rectF = new RectF(0.0f, 0.0f, f2, f2);
            b[8] = true;
            float f3 = this.f26215a;
            rectF.inset(f3 / 2.0f, f3 / 2.0f);
            b[9] = true;
            canvas.drawRoundRect(rectF, 4.0f, 4.0f, paint);
            b[10] = true;
        }
    }

    public C9876c(Context context) {
        boolean[] b = m45981b();
        this(context, null);
        b[0] = true;
    }

    /* renamed from: b */
    private static /* synthetic */ boolean[] m45981b() {
        boolean[] zArr = f26210b0;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-206373929410911505L, "com/instabug/library/internal/view/floatingactionbutton/StopFloatingActionButton", 13);
        f26210b0 = a;
        return a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo35119a(Context context, AttributeSet attributeSet) {
        boolean[] b = m45981b();
        super.mo35119a(context, attributeSet);
        b[3] = true;
        setSize(1);
        b[4] = true;
        setId(C9700R.C9704id.instabug_video_stop_button);
        b[5] = true;
    }

    /* access modifiers changed from: 0000 */
    public Drawable getIconDrawable() {
        boolean[] b = m45981b();
        float b2 = mo35127b(C9700R.dimen.instabug_fab_icon_size_mini);
        b[6] = true;
        float b3 = mo35127b(C9700R.dimen.instabug_fab_size_mini);
        float f = b2 / 2.0f;
        b[7] = true;
        float b4 = mo35127b(C9700R.dimen.instabug_fab_circle_icon_stroke);
        b[8] = true;
        C9877a aVar = new C9877a(this, b4, f, b3, b2);
        b[9] = true;
        ShapeDrawable shapeDrawable = new ShapeDrawable(aVar);
        b[10] = true;
        Paint paint = shapeDrawable.getPaint();
        b[11] = true;
        paint.setAntiAlias(true);
        b[12] = true;
        return shapeDrawable;
    }

    public C9876c(Context context, AttributeSet attributeSet) {
        boolean[] b = m45981b();
        super(context, attributeSet);
        b[1] = true;
    }
}
