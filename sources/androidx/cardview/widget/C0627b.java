package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.annotation.C0195i0;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
/* renamed from: androidx.cardview.widget.b */
/* compiled from: CardViewApi21Impl */
class C0627b implements C0631e {
    C0627b() {
    }

    /* renamed from: j */
    private C0632f m3279j(C0630d dVar) {
        return (C0632f) dVar.mo3136c();
    }

    /* renamed from: a */
    public void mo3138a() {
    }

    /* renamed from: a */
    public void mo3142a(C0630d dVar, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        dVar.mo3133a(new C0632f(colorStateList, f));
        View d = dVar.mo3137d();
        d.setClipToOutline(true);
        d.setElevation(f2);
        mo3147c(dVar, f3);
    }

    /* renamed from: b */
    public float mo3144b(C0630d dVar) {
        return m3279j(dVar).mo3159c();
    }

    /* renamed from: c */
    public void mo3147c(C0630d dVar, float f) {
        m3279j(dVar).mo3156a(f, dVar.mo3135b(), dVar.mo3134a());
        mo3150f(dVar);
    }

    /* renamed from: d */
    public float mo3148d(C0630d dVar) {
        return m3279j(dVar).mo3158b();
    }

    /* renamed from: e */
    public ColorStateList mo3149e(C0630d dVar) {
        return m3279j(dVar).mo3154a();
    }

    /* renamed from: f */
    public void mo3150f(C0630d dVar) {
        if (!dVar.mo3135b()) {
            dVar.mo3132a(0, 0, 0, 0);
            return;
        }
        float d = mo3148d(dVar);
        float b = mo3144b(dVar);
        int ceil = (int) Math.ceil((double) C0633g.m3344a(d, b, dVar.mo3134a()));
        int ceil2 = (int) Math.ceil((double) C0633g.m3347b(d, b, dVar.mo3134a()));
        dVar.mo3132a(ceil, ceil2, ceil, ceil2);
    }

    /* renamed from: g */
    public float mo3151g(C0630d dVar) {
        return mo3144b(dVar) * 2.0f;
    }

    /* renamed from: h */
    public float mo3152h(C0630d dVar) {
        return mo3144b(dVar) * 2.0f;
    }

    /* renamed from: i */
    public void mo3153i(C0630d dVar) {
        mo3147c(dVar, mo3148d(dVar));
    }

    /* renamed from: b */
    public void mo3145b(C0630d dVar, float f) {
        dVar.mo3137d().setElevation(f);
    }

    /* renamed from: c */
    public void mo3146c(C0630d dVar) {
        mo3147c(dVar, mo3148d(dVar));
    }

    /* renamed from: a */
    public void mo3141a(C0630d dVar, float f) {
        m3279j(dVar).mo3155a(f);
    }

    /* renamed from: a */
    public float mo3140a(C0630d dVar) {
        return dVar.mo3137d().getElevation();
    }

    /* renamed from: a */
    public void mo3143a(C0630d dVar, @C0195i0 ColorStateList colorStateList) {
        m3279j(dVar).mo3157a(colorStateList);
    }
}
