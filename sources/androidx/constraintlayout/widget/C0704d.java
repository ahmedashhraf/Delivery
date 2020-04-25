package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout.C0694a;
import org.jcodec.codecs.mjpeg.JpegConst;

/* renamed from: androidx.constraintlayout.widget.d */
/* compiled from: Placeholder */
public class C0704d extends View {

    /* renamed from: N */
    private int f3311N = 4;

    /* renamed from: a */
    private int f3312a = -1;

    /* renamed from: b */
    private View f3313b = null;

    public C0704d(Context context) {
        super(context);
        m4097a((AttributeSet) null);
    }

    /* renamed from: a */
    private void m4097a(AttributeSet attributeSet) {
        super.setVisibility(this.f3311N);
        this.f3312a = -1;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0696R.styleable.ConstraintLayout_placeholder);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0696R.styleable.ConstraintLayout_placeholder_content) {
                    this.f3312a = obtainStyledAttributes.getResourceId(index, this.f3312a);
                } else if (index == C0696R.styleable.ConstraintLayout_placeholder_emptyVisibility) {
                    this.f3311N = obtainStyledAttributes.getInt(index, this.f3311N);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo3923b(ConstraintLayout constraintLayout) {
        if (this.f3312a == -1 && !isInEditMode()) {
            setVisibility(this.f3311N);
        }
        this.f3313b = constraintLayout.findViewById(this.f3312a);
        View view = this.f3313b;
        if (view != null) {
            ((C0694a) view.getLayoutParams()).f3026a0 = true;
            this.f3313b.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.f3313b;
    }

    public int getEmptyVisibility() {
        return this.f3311N;
    }

    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, JpegConst.RST2, JpegConst.RST2, JpegConst.RST2);
            paint.setTextAlign(Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize((float) rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Align.LEFT);
            String str = "?";
            paint.getTextBounds(str, 0, 1, rect);
            canvas.drawText(str, ((((float) width) / 2.0f) - (((float) rect.width()) / 2.0f)) - ((float) rect.left), ((((float) height) / 2.0f) + (((float) rect.height()) / 2.0f)) - ((float) rect.bottom), paint);
        }
    }

    public void setContentId(int i) {
        if (this.f3312a != i) {
            View view = this.f3313b;
            if (view != null) {
                view.setVisibility(0);
                ((C0694a) this.f3313b.getLayoutParams()).f3026a0 = false;
                this.f3313b = null;
            }
            this.f3312a = i;
            if (i != -1) {
                View findViewById = ((View) getParent()).findViewById(i);
                if (findViewById != null) {
                    findViewById.setVisibility(8);
                }
            }
        }
    }

    public void setEmptyVisibility(int i) {
        this.f3311N = i;
    }

    public C0704d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m4097a(attributeSet);
    }

    /* renamed from: a */
    public void mo3922a(ConstraintLayout constraintLayout) {
        if (this.f3313b != null) {
            C0694a aVar = (C0694a) getLayoutParams();
            C0694a aVar2 = (C0694a) this.f3313b.getLayoutParams();
            aVar2.f3048l0.mo3696t(0);
            aVar.f3048l0.mo3699u(aVar2.f3048l0.mo3593U());
            aVar.f3048l0.mo3679m(aVar2.f3048l0.mo3688q());
            aVar2.f3048l0.mo3696t(8);
        }
    }

    public C0704d(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m4097a(attributeSet);
    }

    public C0704d(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        m4097a(attributeSet);
    }
}
