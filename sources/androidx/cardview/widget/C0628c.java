package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.C0195i0;

/* renamed from: androidx.cardview.widget.c */
/* compiled from: CardViewBaseImpl */
class C0628c implements C0631e {

    /* renamed from: a */
    final RectF f2468a = new RectF();

    /* renamed from: androidx.cardview.widget.c$a */
    /* compiled from: CardViewBaseImpl */
    class C0629a implements C0634a {
        C0629a() {
        }

        /* renamed from: a */
        public void mo3139a(Canvas canvas, RectF rectF, float f, Paint paint) {
            Canvas canvas2 = canvas;
            RectF rectF2 = rectF;
            float f2 = 2.0f * f;
            float width = (rectF.width() - f2) - 1.0f;
            float height = (rectF.height() - f2) - 1.0f;
            if (f >= 1.0f) {
                float f3 = f + 0.5f;
                float f4 = -f3;
                C0628c.this.f2468a.set(f4, f4, f3, f3);
                int save = canvas.save();
                canvas2.translate(rectF2.left + f3, rectF2.top + f3);
                Paint paint2 = paint;
                canvas.drawArc(C0628c.this.f2468a, 180.0f, 90.0f, true, paint2);
                canvas2.translate(width, 0.0f);
                canvas2.rotate(90.0f);
                canvas.drawArc(C0628c.this.f2468a, 180.0f, 90.0f, true, paint2);
                canvas2.translate(height, 0.0f);
                canvas2.rotate(90.0f);
                canvas.drawArc(C0628c.this.f2468a, 180.0f, 90.0f, true, paint2);
                canvas2.translate(width, 0.0f);
                canvas2.rotate(90.0f);
                canvas.drawArc(C0628c.this.f2468a, 180.0f, 90.0f, true, paint2);
                canvas2.restoreToCount(save);
                float f5 = (rectF2.left + f3) - 1.0f;
                float f6 = rectF2.top;
                canvas.drawRect(f5, f6, (rectF2.right - f3) + 1.0f, f6 + f3, paint2);
                float f7 = (rectF2.left + f3) - 1.0f;
                float f8 = rectF2.bottom;
                canvas.drawRect(f7, f8 - f3, (rectF2.right - f3) + 1.0f, f8, paint2);
            }
            canvas.drawRect(rectF2.left, rectF2.top + f, rectF2.right, rectF2.bottom - f, paint);
        }
    }

    C0628c() {
    }

    /* renamed from: j */
    private C0633g m3296j(C0630d dVar) {
        return (C0633g) dVar.mo3136c();
    }

    /* renamed from: a */
    public void mo3138a() {
        C0633g.f2483s = new C0629a();
    }

    /* renamed from: b */
    public float mo3144b(C0630d dVar) {
        return m3296j(dVar).mo3175b();
    }

    /* renamed from: c */
    public void mo3146c(C0630d dVar) {
    }

    /* renamed from: c */
    public void mo3147c(C0630d dVar, float f) {
        m3296j(dVar).mo3176b(f);
        mo3150f(dVar);
    }

    /* renamed from: d */
    public float mo3148d(C0630d dVar) {
        return m3296j(dVar).mo3177c();
    }

    /* renamed from: e */
    public ColorStateList mo3149e(C0630d dVar) {
        return m3296j(dVar).mo3170a();
    }

    /* renamed from: f */
    public void mo3150f(C0630d dVar) {
        Rect rect = new Rect();
        m3296j(dVar).mo3173a(rect);
        dVar.mo3131a((int) Math.ceil((double) mo3152h(dVar)), (int) Math.ceil((double) mo3151g(dVar)));
        dVar.mo3132a(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: g */
    public float mo3151g(C0630d dVar) {
        return m3296j(dVar).mo3179d();
    }

    /* renamed from: h */
    public float mo3152h(C0630d dVar) {
        return m3296j(dVar).mo3181e();
    }

    /* renamed from: i */
    public void mo3153i(C0630d dVar) {
        m3296j(dVar).mo3174a(dVar.mo3134a());
        mo3150f(dVar);
    }

    /* renamed from: a */
    public void mo3142a(C0630d dVar, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        C0633g a = m3295a(context, colorStateList, f, f2, f3);
        a.mo3174a(dVar.mo3134a());
        dVar.mo3133a(a);
        mo3150f(dVar);
    }

    /* renamed from: b */
    public void mo3145b(C0630d dVar, float f) {
        m3296j(dVar).mo3178c(f);
    }

    /* renamed from: a */
    private C0633g m3295a(Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        C0633g gVar = new C0633g(context.getResources(), colorStateList, f, f2, f3);
        return gVar;
    }

    /* renamed from: a */
    public void mo3143a(C0630d dVar, @C0195i0 ColorStateList colorStateList) {
        m3296j(dVar).mo3172a(colorStateList);
    }

    /* renamed from: a */
    public void mo3141a(C0630d dVar, float f) {
        m3296j(dVar).mo3171a(f);
        mo3150f(dVar);
    }

    /* renamed from: a */
    public float mo3140a(C0630d dVar) {
        return m3296j(dVar).mo3182f();
    }
}
