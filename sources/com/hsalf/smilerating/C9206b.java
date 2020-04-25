package com.hsalf.smilerating;

import android.animation.FloatEvaluator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.hsalf.smilerating.b */
/* compiled from: BaseRatingAr */
public abstract class C9206b extends View {

    /* renamed from: N */
    public static final int f24290N = -1;

    /* renamed from: O */
    public static final int f24291O = 4;

    /* renamed from: P */
    public static final int f24292P = 3;

    /* renamed from: Q */
    public static final int f24293Q = 2;

    /* renamed from: R */
    public static final int f24294R = 1;

    /* renamed from: S */
    public static final int f24295S = 0;

    /* renamed from: T */
    public static final int f24296T = 0;

    /* renamed from: U */
    public static final int f24297U = 1;

    /* renamed from: V */
    public static final int f24298V = 2;

    /* renamed from: W */
    public static final int f24299W = 3;

    /* renamed from: b */
    private static final String f24300b = "BaseSmile";

    /* renamed from: a */
    protected int[] f24301a = {0, 1, 2, 3, 4};

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.hsalf.smilerating.b$a */
    /* compiled from: BaseRatingAr */
    public @interface C5870a {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.hsalf.smilerating.b$g */
    /* compiled from: BaseRatingAr */
    public @interface C5874g {
    }

    /* renamed from: com.hsalf.smilerating.b$b */
    /* compiled from: BaseRatingAr */
    protected static class C9207b {

        /* renamed from: g */
        public static final int f24302g = 0;

        /* renamed from: h */
        public static final int f24303h = 1;

        /* renamed from: a */
        public float f24304a;

        /* renamed from: b */
        public float f24305b;

        /* renamed from: c */
        public C9210e f24306c = new C9210e();

        /* renamed from: d */
        public int f24307d;

        /* renamed from: e */
        public float f24308e;

        /* renamed from: f */
        private RectF f24309f = new RectF();

        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: com.hsalf.smilerating.b$b$a */
        /* compiled from: BaseRatingAr */
        public @interface C5871a {
        }

        protected C9207b() {
        }

        /* renamed from: a */
        public RectF mo33353a() {
            C9210e eVar = this.f24306c;
            if (eVar != null) {
                RectF rectF = this.f24309f;
                float f = eVar.f24318a;
                float f2 = this.f24308e;
                float f3 = f - f2;
                float f4 = eVar.f24319b;
                rectF.set(f3, f4 - f2, f + f2, f4 + f2);
            }
            return this.f24309f;
        }

        /* renamed from: a */
        public Path mo33352a(Path path) {
            if (path == null) {
                path = new Path();
            }
            path.addArc(mo33353a(), this.f24304a, this.f24305b);
            return path;
        }
    }

    /* renamed from: com.hsalf.smilerating.b$c */
    /* compiled from: BaseRatingAr */
    protected static class C9208c {

        /* renamed from: a */
        private static final float f24310a = -90.0f;

        /* renamed from: b */
        private static final float f24311b = 270.0f;

        /* renamed from: c */
        private static final float f24312c = -35.0f;

        /* renamed from: d */
        private static final float f24313d = 280.0f;

        /* renamed from: e */
        private static final float f24314e = -135.0f;

        /* renamed from: f */
        private static final float f24315f = 360.0f;

        protected C9208c() {
        }

        /* renamed from: a */
        public static C9207b m43093a(C9207b bVar, FloatEvaluator floatEvaluator, float f, int i) {
            Float valueOf = Float.valueOf(270.0f);
            Float valueOf2 = Float.valueOf(f24310a);
            if (4 == i) {
                float floatValue = floatEvaluator.evaluate(f, Float.valueOf(f24312c), valueOf2).floatValue();
                float floatValue2 = floatEvaluator.evaluate(f, Float.valueOf(f24313d), valueOf).floatValue();
                if (bVar.f24307d == 0) {
                    bVar.f24304a = floatValue;
                    bVar.f24305b = floatValue2;
                } else {
                    m43094a(bVar, floatValue, floatValue2);
                }
            } else if (3 == i) {
                float floatValue3 = floatEvaluator.evaluate(f, valueOf2, Float.valueOf(f24314e)).floatValue();
                float floatValue4 = floatEvaluator.evaluate(f, valueOf, Float.valueOf(f24315f)).floatValue();
                if (bVar.f24307d == 0) {
                    bVar.f24304a = floatValue3;
                    bVar.f24305b = floatValue4;
                } else {
                    m43094a(bVar, floatValue3, floatValue4);
                }
            } else {
                bVar.f24304a = f24314e;
                bVar.f24305b = f24315f;
            }
            return bVar;
        }

        /* renamed from: a */
        private static void m43094a(C9207b bVar, float f, float f2) {
            bVar.f24304a = -((f + f2) - 180.0f);
            bVar.f24305b = f2;
        }
    }

    /* renamed from: com.hsalf.smilerating.b$d */
    /* compiled from: BaseRatingAr */
    protected static class C9209d {

        /* renamed from: a */
        public C9210e f24316a;

        /* renamed from: b */
        public C9210e f24317b;

        public C9209d() {
        }

        /* renamed from: a */
        public void mo33354a(Canvas canvas, Paint paint) {
            C9210e eVar = this.f24316a;
            float f = eVar.f24318a;
            float f2 = eVar.f24319b;
            C9210e eVar2 = this.f24317b;
            canvas.drawLine(f, f2, eVar2.f24318a, eVar2.f24319b, paint);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Line{start=");
            sb.append(this.f24316a);
            sb.append(", end=");
            sb.append(this.f24317b);
            sb.append('}');
            return sb.toString();
        }

        public C9209d(C9210e eVar, C9210e eVar2) {
            this.f24316a = eVar;
            this.f24317b = eVar2;
        }
    }

    /* renamed from: com.hsalf.smilerating.b$e */
    /* compiled from: BaseRatingAr */
    protected static class C9210e {

        /* renamed from: a */
        public float f24318a;

        /* renamed from: b */
        public float f24319b;

        public C9210e() {
        }

        /* renamed from: a */
        public void mo33356a(float f, float f2) {
            this.f24318a += f;
            this.f24319b += f2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Point{x=");
            sb.append(this.f24318a);
            sb.append(", y=");
            sb.append(this.f24319b);
            sb.append('}');
            return sb.toString();
        }

        public C9210e(float f, float f2) {
            this.f24318a = f;
            this.f24319b = f2;
        }
    }

    /* renamed from: com.hsalf.smilerating.b$f */
    /* compiled from: BaseRatingAr */
    protected static class C9211f {

        /* renamed from: g */
        public static final int f24320g = 0;

        /* renamed from: h */
        public static final int f24321h = 1;

        /* renamed from: i */
        public static final int f24322i = 2;

        /* renamed from: j */
        public static final int f24323j = 0;

        /* renamed from: k */
        public static final int f24324k = 1;

        /* renamed from: l */
        public static final int f24325l = 2;

        /* renamed from: m */
        public static final int f24326m = 3;

        /* renamed from: a */
        int f24327a;

        /* renamed from: b */
        public C9210e f24328b;

        /* renamed from: c */
        public C9210e[] f24329c;

        /* renamed from: d */
        public C9210e[] f24330d;

        /* renamed from: e */
        public C9210e[] f24331e;

        /* renamed from: f */
        public C9210e[] f24332f;

        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: com.hsalf.smilerating.b$f$a */
        /* compiled from: BaseRatingAr */
        public @interface C5872a {
        }

        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: com.hsalf.smilerating.b$f$b */
        /* compiled from: BaseRatingAr */
        public @interface C5873b {
        }

        public C9211f() {
            this(0);
        }

        /* renamed from: b */
        private void m43101b(float f, float f2) {
            this.f24329c[1].mo33356a(f, f2);
            this.f24329c[2].mo33356a(f, f2);
            this.f24330d[0].mo33356a(f, f2);
            this.f24330d[1].mo33356a(f, f2);
            this.f24330d[2].mo33356a(f, f2);
            this.f24331e[0].mo33356a(f, f2);
        }

        /* renamed from: a */
        public void mo33359a(int i, float f, float f2) {
            if (2 == i) {
                m43098a(f, f2);
                m43101b(f, f2);
            } else if (1 == i) {
                m43101b(f, f2);
            } else if (i == 0) {
                m43098a(f, f2);
            }
        }

        public C9211f(int i) {
            this.f24327a = 0;
            this.f24329c = new C9210e[3];
            this.f24330d = new C9210e[3];
            this.f24331e = new C9210e[3];
            this.f24332f = new C9210e[3];
            this.f24327a = i;
        }

        /* renamed from: a */
        private void m43098a(float f, float f2) {
            this.f24328b.mo33356a(f, f2);
            this.f24332f[0].mo33356a(f, f2);
            this.f24332f[1].mo33356a(f, f2);
            this.f24331e[2].mo33356a(f, f2);
            this.f24331e[1].mo33356a(f, f2);
            this.f24329c[0].mo33356a(f, f2);
        }

        /* renamed from: a */
        public Path mo33358a(Path path) {
            path.reset();
            C9210e eVar = this.f24328b;
            path.moveTo(eVar.f24318a, eVar.f24319b);
            Path a = m43097a(m43097a(m43097a(m43097a(path, this.f24329c), this.f24330d), this.f24331e), this.f24332f);
            a.close();
            return a;
        }

        /* renamed from: a */
        private Path m43097a(Path path, C9210e[] eVarArr) {
            path.cubicTo(eVarArr[0].f24318a, eVarArr[0].f24319b, eVarArr[1].f24318a, eVarArr[1].f24319b, eVarArr[2].f24318a, eVarArr[2].f24319b);
            return path;
        }

        /* renamed from: a */
        public void mo33360a(Canvas canvas, Paint paint) {
            m43099a(this.f24328b, canvas, paint);
            m43100a(this.f24329c, canvas, paint);
            m43100a(this.f24330d, canvas, paint);
            m43100a(this.f24331e, canvas, paint);
            m43100a(this.f24332f, canvas, paint);
        }

        /* renamed from: a */
        private void m43100a(C9210e[] eVarArr, Canvas canvas, Paint paint) {
            for (C9210e a : eVarArr) {
                m43099a(a, canvas, paint);
            }
        }

        /* renamed from: a */
        private void m43099a(C9210e eVar, Canvas canvas, Paint paint) {
            if (eVar != null) {
                eVar.toString();
                canvas.drawCircle(eVar.f24318a, eVar.f24319b, 6.0f, paint);
            }
        }
    }

    /* renamed from: com.hsalf.smilerating.b$h */
    /* compiled from: BaseRatingAr */
    protected static class C9212h {

        /* renamed from: a */
        private int f24333a;

        /* renamed from: b */
        private int f24334b;

        /* renamed from: c */
        private float f24335c;

        /* renamed from: d */
        protected float f24336d;

        /* renamed from: e */
        private Map<Integer, C9207b> f24337e = new HashMap();

        /* renamed from: f */
        private Map<Integer, C9211f> f24338f = new HashMap();

        private C9212h(int i, int i2) {
            this.f24333a = i;
            this.f24334b = i2;
            float f = (float) i2;
            this.f24335c = (f / 2.0f) + (f / 5.0f);
            this.f24336d = ((float) this.f24334b) / 2.0f;
            m43117c();
            m43115b();
            m43118d();
            m43107a();
            m43119e();
        }

        /* renamed from: a */
        public static C9212h m43106a(int i, int i2) {
            return new C9212h(i, i2);
        }

        /* renamed from: c */
        private void m43117c() {
            FloatEvaluator floatEvaluator = new FloatEvaluator();
            C9210e eVar = new C9210e(this.f24336d, this.f24335c);
            double d = (double) this.f24336d;
            Double.isNaN(d);
            float floatValue = floatEvaluator.evaluate(0.1f, Double.valueOf(d * 0.295d), Float.valueOf(this.f24336d)).floatValue();
            double d2 = (double) this.f24335c;
            double d3 = (double) this.f24336d;
            Double.isNaN(d3);
            double d4 = d3 * 0.23d;
            Double.isNaN(d2);
            C9210e eVar2 = new C9210e(floatValue, floatEvaluator.evaluate(0.1f, Double.valueOf(d2 - d4), Float.valueOf(this.f24335c)).floatValue());
            double d5 = (double) this.f24336d;
            Double.isNaN(d5);
            float floatValue2 = floatEvaluator.evaluate(0.1f, Double.valueOf(d5 * 0.295d), Float.valueOf(this.f24336d)).floatValue();
            double d6 = (double) this.f24335c;
            double d7 = (double) this.f24336d;
            Double.isNaN(d7);
            double d8 = d7 * 0.088d;
            Double.isNaN(d6);
            C9210e eVar3 = new C9210e(floatValue2, floatEvaluator.evaluate(0.1f, Double.valueOf(d6 - d8), Float.valueOf(this.f24335c)).floatValue());
            double d9 = (double) this.f24336d;
            Double.isNaN(d9);
            float floatValue3 = floatEvaluator.evaluate(0.1f, Double.valueOf(d9 * 0.591d), Float.valueOf(this.f24336d)).floatValue();
            double d10 = (double) this.f24335c;
            double d11 = (double) this.f24336d;
            Double.isNaN(d11);
            double d12 = d11 * 0.23d;
            Double.isNaN(d10);
            C9210e eVar4 = new C9210e(floatValue3, floatEvaluator.evaluate(0.1f, Double.valueOf(d10 - d12), Float.valueOf(this.f24335c)).floatValue());
            double d13 = (double) this.f24336d;
            Double.isNaN(d13);
            float floatValue4 = floatEvaluator.evaluate(0.1f, Double.valueOf(d13 * 0.591d), Float.valueOf(this.f24336d)).floatValue();
            double d14 = (double) this.f24335c;
            double d15 = (double) this.f24336d;
            Double.isNaN(d15);
            double d16 = d15 * 0.118d;
            Double.isNaN(d14);
            mo33362a(eVar, eVar2, eVar3, eVar4, new C9210e(floatValue4, floatEvaluator.evaluate(0.1f, Double.valueOf(d14 + d16), Float.valueOf(this.f24335c)).floatValue()), 0, 0, -1.0f, -1.0f, -1.0f);
        }

        /* renamed from: d */
        private void m43118d() {
            C9210e eVar = new C9210e(this.f24336d, this.f24335c);
            float f = this.f24336d;
            mo33362a(eVar, null, null, null, null, 3, 2, f * 0.094f, 350.0f, f * 0.798f);
        }

        /* renamed from: e */
        private void m43119e() {
            FloatEvaluator floatEvaluator = new FloatEvaluator();
            C9210e eVar = new C9210e(this.f24336d, this.f24335c);
            double d = (double) this.f24336d;
            Double.isNaN(d);
            float floatValue = floatEvaluator.evaluate(0.2f, Double.valueOf(d * 0.414d), Float.valueOf(this.f24336d)).floatValue();
            double d2 = (double) this.f24335c;
            double d3 = (double) this.f24336d;
            Double.isNaN(d3);
            double d4 = d3 * 0.24d;
            Double.isNaN(d2);
            C9210e eVar2 = new C9210e(floatValue, floatEvaluator.evaluate(0.2f, Double.valueOf(d2 - d4), Float.valueOf(this.f24335c)).floatValue());
            double d5 = (double) this.f24336d;
            Double.isNaN(d5);
            float floatValue2 = floatEvaluator.evaluate(0.2f, Double.valueOf(d5 * 0.355d), Float.valueOf(this.f24336d)).floatValue();
            double d6 = (double) this.f24335c;
            double d7 = (double) this.f24336d;
            Double.isNaN(d7);
            double d8 = d7 * 0.029d;
            Double.isNaN(d6);
            C9210e eVar3 = new C9210e(floatValue2, floatEvaluator.evaluate(0.2f, Double.valueOf(d6 - d8), Float.valueOf(this.f24335c)).floatValue());
            double d9 = (double) this.f24336d;
            Double.isNaN(d9);
            float floatValue3 = floatEvaluator.evaluate(0.2f, Double.valueOf(d9 * 0.65d), Float.valueOf(this.f24336d)).floatValue();
            double d10 = (double) this.f24335c;
            double d11 = (double) this.f24336d;
            Double.isNaN(d11);
            double d12 = d11 * 0.118d;
            Double.isNaN(d10);
            C9210e eVar4 = new C9210e(floatValue3, floatEvaluator.evaluate(0.2f, Double.valueOf(d10 - d12), Float.valueOf(this.f24335c)).floatValue());
            double d13 = (double) this.f24336d;
            Double.isNaN(d13);
            float floatValue4 = floatEvaluator.evaluate(0.2f, Double.valueOf(d13 * 0.591d), Float.valueOf(this.f24336d)).floatValue();
            double d14 = (double) this.f24335c;
            double d15 = (double) this.f24336d;
            Double.isNaN(d15);
            double d16 = d15 * 0.118d;
            Double.isNaN(d14);
            mo33362a(eVar, eVar2, eVar3, eVar4, new C9210e(floatValue4, floatEvaluator.evaluate(0.2f, Double.valueOf(d14 + d16), Float.valueOf(this.f24335c)).floatValue()), 2, 4, -1.0f, -1.0f, -1.0f);
        }

        /* renamed from: b */
        public C9211f mo33363b(int i) {
            return (C9211f) this.f24338f.get(Integer.valueOf(i));
        }

        /* renamed from: b */
        private void m43116b(C9210e eVar, C9210e eVar2, C9210e eVar3, C9210e eVar4, C9210e eVar5, int i) {
            float f = eVar.f24318a;
            float f2 = eVar.f24319b;
            C9211f fVar = new C9211f();
            fVar.f24328b = eVar4;
            fVar.f24331e[2] = eVar5;
            C9210e[] eVarArr = fVar.f24332f;
            eVarArr[0] = eVar3;
            eVarArr[1] = eVar2;
            eVarArr[2] = eVar4;
            m43110a(f, fVar);
            this.f24338f.put(Integer.valueOf(i), fVar);
        }

        /* renamed from: a */
        public C9207b mo33361a(int i) {
            C9207b bVar = (C9207b) this.f24337e.get(Integer.valueOf(i));
            if (bVar != null) {
                return bVar;
            }
            C9207b bVar2 = new C9207b();
            bVar2.f24307d = i;
            this.f24337e.put(Integer.valueOf(i), bVar2);
            return bVar2;
        }

        /* renamed from: a */
        public void mo33362a(C9210e eVar, C9210e eVar2, C9210e eVar3, C9210e eVar4, C9210e eVar5, int i, int i2, float f, float f2, float f3) {
            int i3 = i;
            if (i3 == 0) {
                m43116b(eVar, eVar2, eVar3, eVar4, eVar5, i2);
            } else if (2 == i3) {
                m43113a(eVar, eVar2, eVar3, eVar4, eVar5, i2);
            } else if (3 == i3) {
                m43111a(eVar, f, f2, f3, i2);
            }
        }

        /* renamed from: a */
        private void m43113a(C9210e eVar, C9210e eVar2, C9210e eVar3, C9210e eVar4, C9210e eVar5, int i) {
            float f = eVar.f24318a;
            float f2 = eVar.f24319b;
            float f3 = eVar2.f24318a;
            eVar2.f24318a = eVar3.f24318a;
            eVar3.f24318a = f3;
            float f4 = eVar4.f24318a;
            eVar4.f24318a = eVar5.f24318a;
            eVar5.f24318a = f4;
            m43109a(f2, eVar4, eVar5);
            m43109a(f2, eVar2, eVar3);
            C9211f fVar = new C9211f();
            fVar.f24328b = eVar4;
            fVar.f24331e[2] = eVar5;
            C9210e[] eVarArr = fVar.f24332f;
            eVarArr[0] = eVar3;
            eVarArr[1] = eVar2;
            eVarArr[2] = eVar4;
            m43110a(f, fVar);
            this.f24338f.put(Integer.valueOf(i), fVar);
        }

        /* renamed from: b */
        private void m43115b() {
            FloatEvaluator floatEvaluator = new FloatEvaluator();
            C9210e eVar = new C9210e(this.f24336d, this.f24335c);
            double d = (double) this.f24336d;
            Double.isNaN(d);
            float floatValue = floatEvaluator.evaluate(0.2f, Double.valueOf(d * 0.414d), Float.valueOf(this.f24336d)).floatValue();
            double d2 = (double) this.f24335c;
            double d3 = (double) this.f24336d;
            Double.isNaN(d3);
            double d4 = d3 * 0.24d;
            Double.isNaN(d2);
            C9210e eVar2 = new C9210e(floatValue, floatEvaluator.evaluate(0.2f, Double.valueOf(d2 - d4), Float.valueOf(this.f24335c)).floatValue());
            double d5 = (double) this.f24336d;
            Double.isNaN(d5);
            float floatValue2 = floatEvaluator.evaluate(0.2f, Double.valueOf(d5 * 0.355d), Float.valueOf(this.f24336d)).floatValue();
            double d6 = (double) this.f24335c;
            double d7 = (double) this.f24336d;
            Double.isNaN(d7);
            double d8 = d7 * 0.029d;
            Double.isNaN(d6);
            C9210e eVar3 = new C9210e(floatValue2, floatEvaluator.evaluate(0.2f, Double.valueOf(d6 - d8), Float.valueOf(this.f24335c)).floatValue());
            double d9 = (double) this.f24336d;
            Double.isNaN(d9);
            float floatValue3 = floatEvaluator.evaluate(0.2f, Double.valueOf(d9 * 0.65d), Float.valueOf(this.f24336d)).floatValue();
            double d10 = (double) this.f24335c;
            double d11 = (double) this.f24336d;
            Double.isNaN(d11);
            double d12 = d11 * 0.118d;
            Double.isNaN(d10);
            C9210e eVar4 = new C9210e(floatValue3, floatEvaluator.evaluate(0.2f, Double.valueOf(d10 - d12), Float.valueOf(this.f24335c)).floatValue());
            double d13 = (double) this.f24336d;
            Double.isNaN(d13);
            float floatValue4 = floatEvaluator.evaluate(0.2f, Double.valueOf(d13 * 0.591d), Float.valueOf(this.f24336d)).floatValue();
            double d14 = (double) this.f24335c;
            double d15 = (double) this.f24336d;
            Double.isNaN(d15);
            double d16 = d15 * 0.118d;
            Double.isNaN(d14);
            mo33362a(eVar, eVar2, eVar3, eVar4, new C9210e(floatValue4, floatEvaluator.evaluate(0.2f, Double.valueOf(d14 + d16), Float.valueOf(this.f24335c)).floatValue()), 0, 1, -1.0f, -1.0f, -1.0f);
        }

        /* renamed from: b */
        private C9210e m43114b(float f, C9210e eVar) {
            C9210e eVar2 = new C9210e();
            C9206b.m43085a(eVar, new C9210e(eVar.f24318a, f), eVar2);
            return eVar2;
        }

        /* renamed from: a */
        private void m43111a(C9210e eVar, float f, float f2, float f3, int i) {
            float f4 = eVar.f24318a;
            float f5 = eVar.f24319b;
            C9210e b = C9206b.m43086b(eVar, C9206b.m43083a(f2 - 180.0f), f3 / 2.0f);
            C9211f fVar = new C9211f();
            float f6 = f2 - 270.0f;
            fVar.f24332f[0] = C9206b.m43086b(b, C9206b.m43083a(f6), f);
            float f7 = f2 - 90.0f;
            fVar.f24332f[1] = C9206b.m43086b(b, C9206b.m43083a(f7), f);
            C9210e b2 = C9206b.m43086b(b, f2, f3 / 6.0f);
            fVar.f24328b = C9206b.m43086b(b2, C9206b.m43083a(f7), f);
            fVar.f24331e[2] = C9206b.m43086b(b2, C9206b.m43083a(f6), f);
            fVar.f24332f[2] = fVar.f24328b;
            m43108a(f4, f5, fVar);
            this.f24338f.put(Integer.valueOf(i), fVar);
        }

        /* renamed from: a */
        private void m43108a(float f, float f2, C9211f fVar) {
            fVar.f24329c[0] = C9206b.m43085a(fVar.f24332f[1], fVar.f24328b, new C9210e());
            C9210e[] eVarArr = fVar.f24329c;
            eVarArr[1] = m43105a(f, eVarArr[0]);
            fVar.f24329c[2] = m43105a(f, fVar.f24328b);
            fVar.f24330d[0] = m43105a(f, fVar.f24332f[1]);
            fVar.f24330d[1] = m43105a(f, fVar.f24332f[0]);
            fVar.f24330d[2] = m43105a(f, fVar.f24331e[2]);
            C9210e[] eVarArr2 = fVar.f24331e;
            eVarArr2[1] = C9206b.m43085a(fVar.f24332f[0], eVarArr2[2], new C9210e());
            C9210e[] eVarArr3 = fVar.f24331e;
            eVarArr3[0] = m43105a(f, eVarArr3[1]);
            m43112a(fVar.f24329c[1], fVar.f24331e[0]);
            m43109a(f2, fVar.f24329c[1], fVar.f24331e[0]);
            m43112a(fVar.f24329c[2], fVar.f24330d[2]);
            m43109a(f2, fVar.f24329c[2], fVar.f24330d[2]);
            C9210e[] eVarArr4 = fVar.f24330d;
            m43112a(eVarArr4[0], eVarArr4[1]);
            C9210e[] eVarArr5 = fVar.f24330d;
            m43109a(f2, eVarArr5[0], eVarArr5[1]);
        }

        /* renamed from: a */
        private void m43110a(float f, C9211f fVar) {
            fVar.f24329c[0] = C9206b.m43085a(fVar.f24332f[1], fVar.f24328b, new C9210e());
            C9210e[] eVarArr = fVar.f24329c;
            eVarArr[1] = m43105a(f, eVarArr[0]);
            fVar.f24329c[2] = m43105a(f, fVar.f24328b);
            fVar.f24330d[0] = m43105a(f, fVar.f24332f[1]);
            fVar.f24330d[1] = m43105a(f, fVar.f24332f[0]);
            fVar.f24330d[2] = m43105a(f, fVar.f24331e[2]);
            C9210e[] eVarArr2 = fVar.f24331e;
            eVarArr2[1] = C9206b.m43085a(fVar.f24332f[0], eVarArr2[2], new C9210e());
            C9210e[] eVarArr3 = fVar.f24331e;
            eVarArr3[0] = m43105a(f, eVarArr3[1]);
        }

        /* renamed from: a */
        private void m43112a(C9210e eVar, C9210e eVar2) {
            float f = eVar.f24318a;
            eVar.f24318a = eVar2.f24318a;
            eVar2.f24318a = f;
        }

        /* renamed from: a */
        private void m43109a(float f, C9210e eVar, C9210e eVar2) {
            float f2 = f - eVar.f24319b;
            eVar.f24319b = f - (eVar2.f24319b - f);
            eVar2.f24319b = f + f2;
        }

        /* renamed from: a */
        private void m43107a() {
            FloatEvaluator floatEvaluator = new FloatEvaluator();
            C9210e eVar = new C9210e(this.f24336d, this.f24335c);
            double d = (double) this.f24336d;
            Double.isNaN(d);
            float floatValue = floatEvaluator.evaluate(0.2f, Double.valueOf(d * 0.414d), Float.valueOf(this.f24336d)).floatValue();
            double d2 = (double) this.f24335c;
            double d3 = (double) this.f24336d;
            Double.isNaN(d3);
            double d4 = d3 * 0.24d;
            Double.isNaN(d2);
            C9210e eVar2 = new C9210e(floatValue, floatEvaluator.evaluate(0.2f, Double.valueOf(d2 - d4), Float.valueOf(this.f24335c)).floatValue());
            double d5 = (double) this.f24336d;
            Double.isNaN(d5);
            float floatValue2 = floatEvaluator.evaluate(0.2f, Double.valueOf(d5 * 0.355d), Float.valueOf(this.f24336d)).floatValue();
            double d6 = (double) this.f24335c;
            double d7 = (double) this.f24336d;
            Double.isNaN(d7);
            double d8 = d7 * 0.029d;
            Double.isNaN(d6);
            C9210e eVar3 = new C9210e(floatValue2, floatEvaluator.evaluate(0.2f, Double.valueOf(d6 - d8), Float.valueOf(this.f24335c)).floatValue());
            double d9 = (double) this.f24336d;
            Double.isNaN(d9);
            float floatValue3 = floatEvaluator.evaluate(0.2f, Double.valueOf(d9 * 0.65d), Float.valueOf(this.f24336d)).floatValue();
            double d10 = (double) this.f24335c;
            double d11 = (double) this.f24336d;
            Double.isNaN(d11);
            double d12 = d11 * 0.118d;
            Double.isNaN(d10);
            C9210e eVar4 = new C9210e(floatValue3, floatEvaluator.evaluate(0.2f, Double.valueOf(d10 - d12), Float.valueOf(this.f24335c)).floatValue());
            double d13 = (double) this.f24336d;
            Double.isNaN(d13);
            float floatValue4 = floatEvaluator.evaluate(0.2f, Double.valueOf(d13 * 0.591d), Float.valueOf(this.f24336d)).floatValue();
            double d14 = (double) this.f24335c;
            double d15 = (double) this.f24336d;
            Double.isNaN(d15);
            double d16 = d15 * 0.118d;
            Double.isNaN(d14);
            mo33362a(eVar, eVar2, eVar3, eVar4, new C9210e(floatValue4, floatEvaluator.evaluate(0.2f, Double.valueOf(d14 + d16), Float.valueOf(this.f24335c)).floatValue()), 2, 3, -1.0f, -1.0f, -1.0f);
        }

        /* renamed from: a */
        private C9210e m43105a(float f, C9210e eVar) {
            C9210e eVar2 = new C9210e();
            C9206b.m43085a(eVar, new C9210e(f, eVar.f24319b), eVar2);
            return eVar2;
        }
    }

    public C9206b(Context context) {
        super(context);
    }

    /* renamed from: b */
    protected static C9210e m43086b(C9210e eVar, float f, float f2) {
        double d = (double) eVar.f24318a;
        double d2 = (double) f;
        double cos = Math.cos(Math.toRadians(d2));
        double d3 = (double) f2;
        Double.isNaN(d3);
        double d4 = cos * d3;
        Double.isNaN(d);
        float f3 = (float) (d + d4);
        double d5 = (double) eVar.f24319b;
        double sin = Math.sin(Math.toRadians(d2));
        Double.isNaN(d3);
        double d6 = sin * d3;
        Double.isNaN(d5);
        return new C9210e(f3, (float) (d5 + d6));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo33350a(C9211f fVar, float f, float f2) {
        mo33349a(fVar.f24328b, f, f2);
        mo33351a(fVar.f24329c, f, f2);
        mo33351a(fVar.f24330d, f, f2);
        mo33351a(fVar.f24331e, f, f2);
        mo33351a(fVar.f24332f, f, f2);
    }

    public C9206b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C9206b(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo33351a(C9210e[] eVarArr, float f, float f2) {
        for (C9210e a : eVarArr) {
            mo33349a(a, f, f2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo33349a(C9210e eVar, float f, float f2) {
        eVar.f24318a += f;
        eVar.f24319b += f2;
    }

    /* renamed from: a */
    protected static C9210e m43085a(C9210e eVar, C9210e eVar2, C9210e eVar3) {
        float f = m43084a(eVar, eVar2) < 0.0f ? -1.0f : 1.0f;
        float f2 = eVar2.f24318a;
        eVar3.f24318a = f2 + ((f2 - eVar.f24318a) * f);
        float f3 = eVar2.f24319b;
        eVar3.f24319b = f3 + (f * (f3 - eVar.f24319b));
        return eVar3;
    }

    /* renamed from: a */
    protected static float m43084a(C9210e eVar, C9210e eVar2) {
        float f = eVar.f24318a;
        float f2 = eVar2.f24318a;
        float f3 = (f - f2) * (f - f2);
        float f4 = eVar.f24319b;
        float f5 = eVar2.f24319b;
        return (float) Math.sqrt((double) (f3 + ((f4 - f5) * (f4 - f5))));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Path mo33348a(float f, float f2, Path path, C9211f fVar, C9211f fVar2, FloatEvaluator floatEvaluator) {
        float f3 = f2;
        Path path2 = path;
        C9211f fVar3 = fVar;
        C9211f fVar4 = fVar2;
        FloatEvaluator floatEvaluator2 = floatEvaluator;
        path.reset();
        path2.moveTo(floatEvaluator2.evaluate(f3, Float.valueOf(fVar3.f24328b.f24318a), Float.valueOf(fVar4.f24328b.f24318a)).floatValue() + f, floatEvaluator2.evaluate(f3, Float.valueOf(fVar3.f24328b.f24319b), Float.valueOf(fVar4.f24328b.f24319b)).floatValue());
        path.cubicTo(floatEvaluator2.evaluate(f3, Float.valueOf(fVar3.f24329c[0].f24318a), Float.valueOf(fVar4.f24329c[0].f24318a)).floatValue() + f, floatEvaluator2.evaluate(f3, Float.valueOf(fVar3.f24329c[0].f24319b), Float.valueOf(fVar4.f24329c[0].f24319b)).floatValue(), floatEvaluator2.evaluate(f3, Float.valueOf(fVar3.f24329c[1].f24318a), Float.valueOf(fVar4.f24329c[1].f24318a)).floatValue() + f, floatEvaluator2.evaluate(f3, Float.valueOf(fVar3.f24329c[1].f24319b), Float.valueOf(fVar4.f24329c[1].f24319b)).floatValue(), floatEvaluator2.evaluate(f3, Float.valueOf(fVar3.f24329c[2].f24318a), Float.valueOf(fVar4.f24329c[2].f24318a)).floatValue() + f, floatEvaluator2.evaluate(f3, Float.valueOf(fVar3.f24329c[2].f24319b), Float.valueOf(fVar4.f24329c[2].f24319b)).floatValue());
        path.cubicTo(floatEvaluator2.evaluate(f3, Float.valueOf(fVar3.f24330d[0].f24318a), Float.valueOf(fVar4.f24330d[0].f24318a)).floatValue() + f, floatEvaluator2.evaluate(f3, Float.valueOf(fVar3.f24330d[0].f24319b), Float.valueOf(fVar4.f24330d[0].f24319b)).floatValue(), floatEvaluator2.evaluate(f3, Float.valueOf(fVar3.f24330d[1].f24318a), Float.valueOf(fVar4.f24330d[1].f24318a)).floatValue() + f, floatEvaluator2.evaluate(f3, Float.valueOf(fVar3.f24330d[1].f24319b), Float.valueOf(fVar4.f24330d[1].f24319b)).floatValue(), floatEvaluator2.evaluate(f3, Float.valueOf(fVar3.f24330d[2].f24318a), Float.valueOf(fVar4.f24330d[2].f24318a)).floatValue() + f, floatEvaluator2.evaluate(f3, Float.valueOf(fVar3.f24330d[2].f24319b), Float.valueOf(fVar4.f24330d[2].f24319b)).floatValue());
        path.cubicTo(floatEvaluator2.evaluate(f3, Float.valueOf(fVar3.f24331e[0].f24318a), Float.valueOf(fVar4.f24331e[0].f24318a)).floatValue() + f, floatEvaluator2.evaluate(f3, Float.valueOf(fVar3.f24331e[0].f24319b), Float.valueOf(fVar4.f24331e[0].f24319b)).floatValue(), floatEvaluator2.evaluate(f3, Float.valueOf(fVar3.f24331e[1].f24318a), Float.valueOf(fVar4.f24331e[1].f24318a)).floatValue() + f, floatEvaluator2.evaluate(f3, Float.valueOf(fVar3.f24331e[1].f24319b), Float.valueOf(fVar4.f24331e[1].f24319b)).floatValue(), floatEvaluator2.evaluate(f3, Float.valueOf(fVar3.f24331e[2].f24318a), Float.valueOf(fVar4.f24331e[2].f24318a)).floatValue() + f, floatEvaluator2.evaluate(f3, Float.valueOf(fVar3.f24331e[2].f24319b), Float.valueOf(fVar4.f24331e[2].f24319b)).floatValue());
        path.cubicTo(floatEvaluator2.evaluate(f3, Float.valueOf(fVar3.f24332f[0].f24318a), Float.valueOf(fVar4.f24332f[0].f24318a)).floatValue() + f, floatEvaluator2.evaluate(f3, Float.valueOf(fVar3.f24332f[0].f24319b), Float.valueOf(fVar4.f24332f[0].f24319b)).floatValue(), floatEvaluator2.evaluate(f3, Float.valueOf(fVar3.f24332f[1].f24318a), Float.valueOf(fVar4.f24332f[1].f24318a)).floatValue() + f, floatEvaluator2.evaluate(f3, Float.valueOf(fVar3.f24332f[1].f24319b), Float.valueOf(fVar4.f24332f[1].f24319b)).floatValue(), floatEvaluator2.evaluate(f3, Float.valueOf(fVar3.f24332f[2].f24318a), Float.valueOf(fVar4.f24332f[2].f24318a)).floatValue() + f, floatEvaluator2.evaluate(f3, Float.valueOf(fVar3.f24332f[2].f24319b), Float.valueOf(fVar4.f24332f[2].f24319b)).floatValue());
        path.close();
        return path2;
    }

    /* renamed from: a */
    public static float m43083a(float f) {
        if (f < 0.0f) {
            return m43083a(f + 360.0f);
        }
        return f >= 360.0f ? f % 360.0f : f + 0.0f;
    }
}
