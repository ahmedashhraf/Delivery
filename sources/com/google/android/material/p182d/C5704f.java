package com.google.android.material.p182d;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0198k;
import com.google.android.material.p182d.C5705g.C5710e;

/* renamed from: com.google.android.material.d.f */
/* compiled from: CircularRevealRelativeLayout */
public class C5704f extends RelativeLayout implements C5705g {
    @C0193h0

    /* renamed from: a */
    private final C5700d f16559a;

    public C5704f(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public void mo22993a() {
        this.f16559a.mo23005a();
    }

    /* renamed from: b */
    public void mo22995b() {
        this.f16559a.mo23010b();
    }

    /* renamed from: c */
    public boolean mo22996c() {
        return super.isOpaque();
    }

    public void draw(@C0193h0 Canvas canvas) {
        C5700d dVar = this.f16559a;
        if (dVar != null) {
            dVar.mo23007a(canvas);
        } else {
            super.draw(canvas);
        }
    }

    @C0195i0
    public Drawable getCircularRevealOverlayDrawable() {
        return this.f16559a.mo23011c();
    }

    public int getCircularRevealScrimColor() {
        return this.f16559a.mo23012d();
    }

    @C0195i0
    public C5710e getRevealInfo() {
        return this.f16559a.mo23013e();
    }

    public boolean isOpaque() {
        C5700d dVar = this.f16559a;
        if (dVar != null) {
            return dVar.mo23014f();
        }
        return super.isOpaque();
    }

    public void setCircularRevealOverlayDrawable(@C0195i0 Drawable drawable) {
        this.f16559a.mo23008a(drawable);
    }

    public void setCircularRevealScrimColor(@C0198k int i) {
        this.f16559a.mo23006a(i);
    }

    public void setRevealInfo(@C0195i0 C5710e eVar) {
        this.f16559a.mo23009a(eVar);
    }

    public C5704f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16559a = new C5700d(this);
    }

    /* renamed from: a */
    public void mo22994a(Canvas canvas) {
        super.draw(canvas);
    }
}
