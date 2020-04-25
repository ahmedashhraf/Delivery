package com.instabug.library.internal.view.floatingactionbutton;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import androidx.core.p024e.p025b.C0886a;
import com.instabug.library.C9700R;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class RecordingFloatingActionButton extends C9871a {

    /* renamed from: f0 */
    private static transient /* synthetic */ boolean[] f26170f0;

    /* renamed from: b0 */
    private RecordingState f26171b0;

    /* renamed from: c0 */
    private Paint f26172c0;

    /* renamed from: d0 */
    private String f26173d0;

    /* renamed from: e0 */
    private float f26174e0;

    public enum RecordingState {
        RECORDING,
        STOPPED;

        static {
            boolean[] $jacocoInit;
            $jacocoInit[3] = true;
        }
    }

    /* renamed from: com.instabug.library.internal.view.floatingactionbutton.RecordingFloatingActionButton$a */
    class C9870a extends Shape {

        /* renamed from: P */
        private static transient /* synthetic */ boolean[] f26175P;

        /* renamed from: N */
        final /* synthetic */ float f26176N;

        /* renamed from: O */
        final /* synthetic */ RecordingFloatingActionButton f26177O;

        /* renamed from: a */
        final /* synthetic */ float f26178a;

        /* renamed from: b */
        final /* synthetic */ float f26179b;

        C9870a(RecordingFloatingActionButton recordingFloatingActionButton, float f, float f2, float f3) {
            boolean[] b = m45954b();
            this.f26177O = recordingFloatingActionButton;
            this.f26178a = f;
            this.f26179b = f2;
            this.f26176N = f3;
            b[0] = true;
        }

        /* renamed from: b */
        private static /* synthetic */ boolean[] m45954b() {
            boolean[] zArr = f26175P;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(1882376997079757795L, "com/instabug/library/internal/view/floatingactionbutton/RecordingFloatingActionButton$1", 9);
            f26175P = a;
            return a;
        }

        public void draw(Canvas canvas, Paint paint) {
            boolean[] b = m45954b();
            paint.setColor(C0886a.f4059c);
            b[1] = true;
            paint.setStyle(Style.FILL_AND_STROKE);
            b[2] = true;
            paint.setStrokeWidth(this.f26178a);
            b[3] = true;
            float f = this.f26179b;
            canvas.drawCircle(f, f, this.f26176N / 2.0f, paint);
            b[4] = true;
            if (RecordingFloatingActionButton.m45950a(this.f26177O) == RecordingState.RECORDING) {
                b[5] = true;
                this.f26177O.mo35120a((String) null, false);
                b[6] = true;
            } else {
                this.f26177O.mo35120a("", false);
                b[7] = true;
            }
            b[8] = true;
        }
    }

    public RecordingFloatingActionButton(Context context) {
        boolean[] b = m45951b();
        this(context, null);
        b[0] = true;
    }

    /* renamed from: a */
    static /* synthetic */ RecordingState m45950a(RecordingFloatingActionButton recordingFloatingActionButton) {
        boolean[] b = m45951b();
        RecordingState recordingState = recordingFloatingActionButton.f26171b0;
        b[37] = true;
        return recordingState;
    }

    /* renamed from: b */
    private static /* synthetic */ boolean[] m45951b() {
        boolean[] zArr = f26170f0;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(8747970428762396482L, "com/instabug/library/internal/view/floatingactionbutton/RecordingFloatingActionButton", 38);
        f26170f0 = a;
        return a;
    }

    /* access modifiers changed from: 0000 */
    public Drawable getIconDrawable() {
        float f;
        float f2;
        boolean[] b = m45951b();
        if (getSize() == 0) {
            b[13] = true;
            f2 = mo35127b(C9700R.dimen.instabug_fab_size_normal);
            b[14] = true;
            f = mo35127b(C9700R.dimen.instabug_fab_icon_size_normal);
            b[15] = true;
        } else {
            f2 = mo35127b(C9700R.dimen.instabug_fab_size_mini);
            b[16] = true;
            f = mo35127b(C9700R.dimen.instabug_fab_icon_size_mini);
            b[17] = true;
        }
        float f3 = f / 2.0f;
        b[18] = true;
        float b2 = mo35127b(C9700R.dimen.instabug_fab_circle_icon_stroke);
        b[19] = true;
        C9870a aVar = new C9870a(this, b2, f3, f2);
        b[20] = true;
        ShapeDrawable shapeDrawable = new ShapeDrawable(aVar);
        b[21] = true;
        Paint paint = shapeDrawable.getPaint();
        b[22] = true;
        paint.setAntiAlias(true);
        b[23] = true;
        return shapeDrawable;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        boolean[] b = m45951b();
        super.onDraw(canvas);
        if (this.f26173d0 == null) {
            b[24] = true;
        } else {
            b[25] = true;
            int width = canvas.getWidth() / 2;
            b[26] = true;
            float height = ((float) canvas.getHeight()) / 2.0f;
            Paint paint = this.f26172c0;
            b[27] = true;
            int descent = (int) ((height - ((paint.descent() + this.f26172c0.ascent()) / 2.0f)) - this.f26174e0);
            b[28] = true;
            canvas.drawText(this.f26173d0, (float) width, (float) descent, this.f26172c0);
            b[29] = true;
        }
        b[30] = true;
    }

    public void setRecordingState(RecordingState recordingState) {
        boolean[] b = m45951b();
        this.f26171b0 = recordingState;
        b[35] = true;
        mo35126a();
        b[36] = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo35119a(Context context, AttributeSet attributeSet) {
        boolean[] b = m45951b();
        super.mo35119a(context, attributeSet);
        b[3] = true;
        this.f26172c0 = new Paint(1);
        b[4] = true;
        this.f26172c0.setColor(-1);
        b[5] = true;
        this.f26172c0.setTextAlign(Align.CENTER);
        b[6] = true;
        this.f26172c0.setTextSize(context.getResources().getDimension(C9700R.dimen.instabug_fab_text_size));
        b[7] = true;
        this.f26174e0 = mo35127b(C9700R.dimen.instabug_fab_circle_icon_stroke);
        b[8] = true;
        setTypeface(Typeface.createFromAsset(context.getAssets(), "video_icon.ttf"));
        b[9] = true;
        mo35120a("", false);
        b[10] = true;
        setTextColor(-1);
        b[11] = true;
        setGravity(17);
        b[12] = true;
    }

    public RecordingFloatingActionButton(Context context, AttributeSet attributeSet) {
        boolean[] b = m45951b();
        super(context, attributeSet);
        b[1] = true;
    }

    /* renamed from: a */
    public void mo35120a(String str, boolean z) {
        boolean[] b = m45951b();
        if (z) {
            this.f26173d0 = str;
            b[31] = true;
            invalidate();
            b[32] = true;
        } else {
            super.setText(str);
            b[33] = true;
        }
        b[34] = true;
    }
}
