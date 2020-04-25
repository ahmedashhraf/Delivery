package androidx.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build.VERSION;
import android.widget.EdgeEffect;
import androidx.annotation.C0193h0;

/* renamed from: androidx.core.widget.e */
/* compiled from: EdgeEffectCompat */
public final class C1112e {

    /* renamed from: a */
    private EdgeEffect f4920a;

    @Deprecated
    public C1112e(Context context) {
        this.f4920a = new EdgeEffect(context);
    }

    @Deprecated
    /* renamed from: a */
    public void mo5362a(int i, int i2) {
        this.f4920a.setSize(i, i2);
    }

    @Deprecated
    /* renamed from: b */
    public boolean mo5367b() {
        return this.f4920a.isFinished();
    }

    @Deprecated
    /* renamed from: c */
    public boolean mo5368c() {
        this.f4920a.onRelease();
        return this.f4920a.isFinished();
    }

    @Deprecated
    /* renamed from: a */
    public void mo5361a() {
        this.f4920a.finish();
    }

    @Deprecated
    /* renamed from: a */
    public boolean mo5363a(float f) {
        this.f4920a.onPull(f);
        return true;
    }

    @Deprecated
    /* renamed from: a */
    public boolean mo5364a(float f, float f2) {
        m6324a(this.f4920a, f, f2);
        return true;
    }

    /* renamed from: a */
    public static void m6324a(@C0193h0 EdgeEffect edgeEffect, float f, float f2) {
        if (VERSION.SDK_INT >= 21) {
            edgeEffect.onPull(f, f2);
        } else {
            edgeEffect.onPull(f);
        }
    }

    @Deprecated
    /* renamed from: a */
    public boolean mo5365a(int i) {
        this.f4920a.onAbsorb(i);
        return true;
    }

    @Deprecated
    /* renamed from: a */
    public boolean mo5366a(Canvas canvas) {
        return this.f4920a.draw(canvas);
    }
}
