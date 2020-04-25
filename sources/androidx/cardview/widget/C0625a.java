package androidx.cardview.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.annotation.RequiresApi;

@RequiresApi(17)
/* renamed from: androidx.cardview.widget.a */
/* compiled from: CardViewApi17Impl */
class C0625a extends C0628c {

    /* renamed from: androidx.cardview.widget.a$a */
    /* compiled from: CardViewApi17Impl */
    class C0626a implements C0634a {
        C0626a() {
        }

        /* renamed from: a */
        public void mo3139a(Canvas canvas, RectF rectF, float f, Paint paint) {
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    C0625a() {
    }

    /* renamed from: a */
    public void mo3138a() {
        C0633g.f2483s = new C0626a();
    }
}
