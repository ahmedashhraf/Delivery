package com.google.android.material.p182d;

import android.animation.TypeEvaluator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0198k;
import com.google.android.material.p182d.C5700d.C5701a;
import com.google.android.material.p300k.C6947a;

/* renamed from: com.google.android.material.d.g */
/* compiled from: CircularRevealWidget */
public interface C5705g extends C5701a {

    /* renamed from: com.google.android.material.d.g$b */
    /* compiled from: CircularRevealWidget */
    public static class C5707b implements TypeEvaluator<C5710e> {

        /* renamed from: b */
        public static final TypeEvaluator<C5710e> f16560b = new C5707b();

        /* renamed from: a */
        private final C5710e f16561a = new C5710e();

        @C0193h0
        /* renamed from: a */
        public C5710e evaluate(float f, @C0193h0 C5710e eVar, @C0193h0 C5710e eVar2) {
            this.f16561a.mo23025a(C6947a.m33315b(eVar.f16565a, eVar2.f16565a, f), C6947a.m33315b(eVar.f16566b, eVar2.f16566b, f), C6947a.m33315b(eVar.f16567c, eVar2.f16567c, f));
            return this.f16561a;
        }
    }

    /* renamed from: com.google.android.material.d.g$c */
    /* compiled from: CircularRevealWidget */
    public static class C5708c extends Property<C5705g, C5710e> {

        /* renamed from: a */
        public static final Property<C5705g, C5710e> f16562a = new C5708c("circularReveal");

        private C5708c(String str) {
            super(C5710e.class, str);
        }

        @C0195i0
        /* renamed from: a */
        public C5710e get(@C0193h0 C5705g gVar) {
            return gVar.getRevealInfo();
        }

        /* renamed from: a */
        public void set(@C0193h0 C5705g gVar, @C0195i0 C5710e eVar) {
            gVar.setRevealInfo(eVar);
        }
    }

    /* renamed from: com.google.android.material.d.g$d */
    /* compiled from: CircularRevealWidget */
    public static class C5709d extends Property<C5705g, Integer> {

        /* renamed from: a */
        public static final Property<C5705g, Integer> f16563a = new C5709d("circularRevealScrimColor");

        private C5709d(String str) {
            super(Integer.class, str);
        }

        @C0193h0
        /* renamed from: a */
        public Integer get(@C0193h0 C5705g gVar) {
            return Integer.valueOf(gVar.getCircularRevealScrimColor());
        }

        /* renamed from: a */
        public void set(@C0193h0 C5705g gVar, @C0193h0 Integer num) {
            gVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* renamed from: com.google.android.material.d.g$e */
    /* compiled from: CircularRevealWidget */
    public static class C5710e {

        /* renamed from: d */
        public static final float f16564d = Float.MAX_VALUE;

        /* renamed from: a */
        public float f16565a;

        /* renamed from: b */
        public float f16566b;

        /* renamed from: c */
        public float f16567c;

        /* renamed from: a */
        public void mo23025a(float f, float f2, float f3) {
            this.f16565a = f;
            this.f16566b = f2;
            this.f16567c = f3;
        }

        private C5710e() {
        }

        public C5710e(float f, float f2, float f3) {
            this.f16565a = f;
            this.f16566b = f2;
            this.f16567c = f3;
        }

        /* renamed from: a */
        public void mo23026a(@C0193h0 C5710e eVar) {
            mo23025a(eVar.f16565a, eVar.f16566b, eVar.f16567c);
        }

        /* renamed from: a */
        public boolean mo23027a() {
            return this.f16567c == Float.MAX_VALUE;
        }

        public C5710e(@C0193h0 C5710e eVar) {
            this(eVar.f16565a, eVar.f16566b, eVar.f16567c);
        }
    }

    /* renamed from: a */
    void mo22993a();

    /* renamed from: b */
    void mo22995b();

    void draw(Canvas canvas);

    @C0195i0
    Drawable getCircularRevealOverlayDrawable();

    @C0198k
    int getCircularRevealScrimColor();

    @C0195i0
    C5710e getRevealInfo();

    boolean isOpaque();

    void setCircularRevealOverlayDrawable(@C0195i0 Drawable drawable);

    void setCircularRevealScrimColor(@C0198k int i);

    void setRevealInfo(@C0195i0 C5710e eVar);
}
