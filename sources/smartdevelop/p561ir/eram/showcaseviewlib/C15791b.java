package smartdevelop.p561ir.eram.showcaseviewlib;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.RectF;
import android.widget.LinearLayout;

/* renamed from: smartdevelop.ir.eram.showcaseviewlib.b */
/* compiled from: GuideMessageView */
class C15791b extends LinearLayout {

    /* renamed from: N */
    int[] f45099N = new int[2];

    /* renamed from: a */
    private Paint f45100a;

    /* renamed from: b */
    private RectF f45101b;

    C15791b(Context context) {
        super(context);
        float f = context.getResources().getDisplayMetrics().density;
        setWillNotDraw(false);
        setOrientation(1);
        setGravity(17);
        this.f45101b = new RectF();
        this.f45100a = new Paint(1);
        this.f45100a.setStrokeCap(Cap.ROUND);
    }

    /* renamed from: a */
    public void mo51996a(int i) {
        addView(LinearLayout.inflate(getContext(), i, null));
    }

    /* renamed from: b */
    public void mo51997b(int i) {
        this.f45100a.setAlpha(255);
        this.f45100a.setColor(i);
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        getLocationOnScreen(this.f45099N);
        this.f45101b.set((float) getPaddingLeft(), (float) getPaddingTop(), (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()));
        canvas.drawRoundRect(this.f45101b, 20.0f, 20.0f, this.f45100a);
    }
}
