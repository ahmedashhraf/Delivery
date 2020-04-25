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

/* renamed from: com.hsalf.smilerating.a */
/* compiled from: BaseRating */
public abstract class C9199a extends View {

    /* renamed from: N */
    public static final int f24241N = -1;

    /* renamed from: O */
    public static final int f24242O = 0;

    /* renamed from: P */
    public static final int f24243P = 1;

    /* renamed from: Q */
    public static final int f24244Q = 2;

    /* renamed from: R */
    public static final int f24245R = 3;

    /* renamed from: S */
    public static final int f24246S = 4;

    /* renamed from: T */
    public static final int f24247T = 0;

    /* renamed from: U */
    public static final int f24248U = 1;

    /* renamed from: V */
    public static final int f24249V = 2;

    /* renamed from: W */
    public static final int f24250W = 3;

    /* renamed from: b */
    private static final String f24251b = "BaseSmile";

    /* renamed from: a */
    protected int[] f24252a = {0, 1, 2, 3, 4};

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.hsalf.smilerating.a$a */
    /* compiled from: BaseRating */
    public @interface C5865a {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.hsalf.smilerating.a$g */
    /* compiled from: BaseRating */
    public @interface C5869g {
    }

    /* renamed from: com.hsalf.smilerating.a$b */
    /* compiled from: BaseRating */
    protected static class C9200b {

        /* renamed from: g */
        public static final int f24253g = 0;

        /* renamed from: h */
        public static final int f24254h = 1;

        /* renamed from: a */
        public float f24255a;

        /* renamed from: b */
        public float f24256b;

        /* renamed from: c */
        public C9203e f24257c = new C9203e();

        /* renamed from: d */
        public int f24258d;

        /* renamed from: e */
        public float f24259e;

        /* renamed from: f */
        private RectF f24260f = new RectF();

        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: com.hsalf.smilerating.a$b$a */
        /* compiled from: BaseRating */
        public @interface C5866a {
        }

        protected C9200b() {
        }

        /* renamed from: a */
        public RectF mo33337a() {
            C9203e eVar = this.f24257c;
            if (eVar != null) {
                RectF rectF = this.f24260f;
                float f = eVar.f24269a;
                float f2 = this.f24259e;
                float f3 = f - f2;
                float f4 = eVar.f24270b;
                rectF.set(f3, f4 - f2, f + f2, f4 + f2);
            }
            return this.f24260f;
        }

        /* renamed from: a */
        public Path mo33336a(Path path) {
            if (path == null) {
                path = new Path();
            }
            path.addArc(mo33337a(), this.f24255a, this.f24256b);
            return path;
        }
    }

    /* renamed from: com.hsalf.smilerating.a$c */
    /* compiled from: BaseRating */
    protected static class C9201c {

        /* renamed from: a */
        private static final float f24261a = -90.0f;

        /* renamed from: b */
        private static final float f24262b = 270.0f;

        /* renamed from: c */
        private static final float f24263c = -35.0f;

        /* renamed from: d */
        private static final float f24264d = 280.0f;

        /* renamed from: e */
        private static final float f24265e = -135.0f;

        /* renamed from: f */
        private static final float f24266f = 360.0f;

        protected C9201c() {
        }

        /* renamed from: a */
        public static C9200b m43053a(C9200b bVar, FloatEvaluator floatEvaluator, float f, int i) {
            Float valueOf = Float.valueOf(270.0f);
            Float valueOf2 = Float.valueOf(f24261a);
            if (i == 0) {
                float floatValue = floatEvaluator.evaluate(f, Float.valueOf(f24263c), valueOf2).floatValue();
                float floatValue2 = floatEvaluator.evaluate(f, Float.valueOf(f24264d), valueOf).floatValue();
                if (bVar.f24258d == 0) {
                    bVar.f24255a = floatValue;
                    bVar.f24256b = floatValue2;
                } else {
                    m43054a(bVar, floatValue, floatValue2);
                }
            } else if (1 == i) {
                float floatValue3 = floatEvaluator.evaluate(f, valueOf2, Float.valueOf(f24265e)).floatValue();
                float floatValue4 = floatEvaluator.evaluate(f, valueOf, Float.valueOf(f24266f)).floatValue();
                if (bVar.f24258d == 0) {
                    bVar.f24255a = floatValue3;
                    bVar.f24256b = floatValue4;
                } else {
                    m43054a(bVar, floatValue3, floatValue4);
                }
            } else {
                bVar.f24255a = f24265e;
                bVar.f24256b = f24266f;
            }
            return bVar;
        }

        /* renamed from: a */
        private static void m43054a(C9200b bVar, float f, float f2) {
            bVar.f24255a = -((f + f2) - 180.0f);
            bVar.f24256b = f2;
        }
    }

    /* renamed from: com.hsalf.smilerating.a$d */
    /* compiled from: BaseRating */
    protected static class C9202d {

        /* renamed from: a */
        public C9203e f24267a;

        /* renamed from: b */
        public C9203e f24268b;

        public C9202d() {
        }

        /* renamed from: a */
        public void mo33338a(Canvas canvas, Paint paint) {
            C9203e eVar = this.f24267a;
            float f = eVar.f24269a;
            float f2 = eVar.f24270b;
            C9203e eVar2 = this.f24268b;
            canvas.drawLine(f, f2, eVar2.f24269a, eVar2.f24270b, paint);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Line{start=");
            sb.append(this.f24267a);
            sb.append(", end=");
            sb.append(this.f24268b);
            sb.append('}');
            return sb.toString();
        }

        public C9202d(C9203e eVar, C9203e eVar2) {
            this.f24267a = eVar;
            this.f24268b = eVar2;
        }
    }

    /* renamed from: com.hsalf.smilerating.a$e */
    /* compiled from: BaseRating */
    protected static class C9203e {

        /* renamed from: a */
        public float f24269a;

        /* renamed from: b */
        public float f24270b;

        public C9203e() {
        }

        /* renamed from: a */
        public void mo33340a(float f, float f2) {
            this.f24269a += f;
            this.f24270b += f2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Point{x=");
            sb.append(this.f24269a);
            sb.append(", y=");
            sb.append(this.f24270b);
            sb.append('}');
            return sb.toString();
        }

        public C9203e(float f, float f2) {
            this.f24269a = f;
            this.f24270b = f2;
        }
    }

    /* renamed from: com.hsalf.smilerating.a$f */
    /* compiled from: BaseRating */
    protected static class C9204f {

        /* renamed from: g */
        public static final int f24271g = 0;

        /* renamed from: h */
        public static final int f24272h = 1;

        /* renamed from: i */
        public static final int f24273i = 2;

        /* renamed from: j */
        public static final int f24274j = 0;

        /* renamed from: k */
        public static final int f24275k = 1;

        /* renamed from: l */
        public static final int f24276l = 2;

        /* renamed from: m */
        public static final int f24277m = 3;

        /* renamed from: a */
        int f24278a;

        /* renamed from: b */
        public C9203e f24279b;

        /* renamed from: c */
        public C9203e[] f24280c;

        /* renamed from: d */
        public C9203e[] f24281d;

        /* renamed from: e */
        public C9203e[] f24282e;

        /* renamed from: f */
        public C9203e[] f24283f;

        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: com.hsalf.smilerating.a$f$a */
        /* compiled from: BaseRating */
        public @interface C5867a {
        }

        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: com.hsalf.smilerating.a$f$b */
        /* compiled from: BaseRating */
        public @interface C5868b {
        }

        public C9204f() {
            this(0);
        }

        /* renamed from: b */
        private void m43061b(float f, float f2) {
            this.f24280c[1].mo33340a(f, f2);
            this.f24280c[2].mo33340a(f, f2);
            this.f24281d[0].mo33340a(f, f2);
            this.f24281d[1].mo33340a(f, f2);
            this.f24281d[2].mo33340a(f, f2);
            this.f24282e[0].mo33340a(f, f2);
        }

        /* renamed from: a */
        public void mo33343a(int i, float f, float f2) {
            if (2 == i) {
                m43058a(f, f2);
                m43061b(f, f2);
            } else if (1 == i) {
                m43061b(f, f2);
            } else if (i == 0) {
                m43058a(f, f2);
            }
        }

        public C9204f(int i) {
            this.f24278a = 0;
            this.f24280c = new C9203e[3];
            this.f24281d = new C9203e[3];
            this.f24282e = new C9203e[3];
            this.f24283f = new C9203e[3];
            this.f24278a = i;
        }

        /* renamed from: a */
        private void m43058a(float f, float f2) {
            this.f24279b.mo33340a(f, f2);
            this.f24283f[0].mo33340a(f, f2);
            this.f24283f[1].mo33340a(f, f2);
            this.f24282e[2].mo33340a(f, f2);
            this.f24282e[1].mo33340a(f, f2);
            this.f24280c[0].mo33340a(f, f2);
        }

        /* renamed from: a */
        public Path mo33342a(Path path) {
            path.reset();
            C9203e eVar = this.f24279b;
            path.moveTo(eVar.f24269a, eVar.f24270b);
            Path a = m43057a(m43057a(m43057a(m43057a(path, this.f24280c), this.f24281d), this.f24282e), this.f24283f);
            a.close();
            return a;
        }

        /* renamed from: a */
        private Path m43057a(Path path, C9203e[] eVarArr) {
            path.cubicTo(eVarArr[0].f24269a, eVarArr[0].f24270b, eVarArr[1].f24269a, eVarArr[1].f24270b, eVarArr[2].f24269a, eVarArr[2].f24270b);
            return path;
        }

        /* renamed from: a */
        public void mo33344a(Canvas canvas, Paint paint) {
            m43059a(this.f24279b, canvas, paint);
            m43060a(this.f24280c, canvas, paint);
            m43060a(this.f24281d, canvas, paint);
            m43060a(this.f24282e, canvas, paint);
            m43060a(this.f24283f, canvas, paint);
        }

        /* renamed from: a */
        private void m43060a(C9203e[] eVarArr, Canvas canvas, Paint paint) {
            for (C9203e a : eVarArr) {
                m43059a(a, canvas, paint);
            }
        }

        /* renamed from: a */
        private void m43059a(C9203e eVar, Canvas canvas, Paint paint) {
            if (eVar != null) {
                eVar.toString();
                canvas.drawCircle(eVar.f24269a, eVar.f24270b, 6.0f, paint);
            }
        }
    }

    /* renamed from: com.hsalf.smilerating.a$h */
    /* compiled from: BaseRating */
    protected static class C9205h {

        /* renamed from: a */
        private int f24284a;

        /* renamed from: b */
        private int f24285b;

        /* renamed from: c */
        private float f24286c;

        /* renamed from: d */
        protected float f24287d;

        /* renamed from: e */
        private Map<Integer, C9200b> f24288e = new HashMap();

        /* renamed from: f */
        private Map<Integer, C9204f> f24289f = new HashMap();

        private C9205h(int i, int i2) {
            this.f24284a = i;
            this.f24285b = i2;
            float f = (float) i2;
            this.f24286c = (f / 2.0f) + (f / 5.0f);
            this.f24287d = ((float) this.f24285b) / 2.0f;
            m43077c();
            m43075b();
            m43078d();
            m43067a();
            m43079e();
        }

        /* renamed from: a */
        public static C9205h m43066a(int i, int i2) {
            return new C9205h(i, i2);
        }

        /* renamed from: c */
        private void m43077c() {
            FloatEvaluator floatEvaluator = new FloatEvaluator();
            C9203e eVar = new C9203e(this.f24287d, this.f24286c);
            double d = (double) this.f24287d;
            Double.isNaN(d);
            float floatValue = floatEvaluator.evaluate(0.1f, Double.valueOf(d * 0.295d), Float.valueOf(this.f24287d)).floatValue();
            double d2 = (double) this.f24286c;
            double d3 = (double) this.f24287d;
            Double.isNaN(d3);
            double d4 = d3 * 0.23d;
            Double.isNaN(d2);
            C9203e eVar2 = new C9203e(floatValue, floatEvaluator.evaluate(0.1f, Double.valueOf(d2 - d4), Float.valueOf(this.f24286c)).floatValue());
            double d5 = (double) this.f24287d;
            Double.isNaN(d5);
            float floatValue2 = floatEvaluator.evaluate(0.1f, Double.valueOf(d5 * 0.295d), Float.valueOf(this.f24287d)).floatValue();
            double d6 = (double) this.f24286c;
            double d7 = (double) this.f24287d;
            Double.isNaN(d7);
            double d8 = d7 * 0.088d;
            Double.isNaN(d6);
            C9203e eVar3 = new C9203e(floatValue2, floatEvaluator.evaluate(0.1f, Double.valueOf(d6 - d8), Float.valueOf(this.f24286c)).floatValue());
            double d9 = (double) this.f24287d;
            Double.isNaN(d9);
            float floatValue3 = floatEvaluator.evaluate(0.1f, Double.valueOf(d9 * 0.591d), Float.valueOf(this.f24287d)).floatValue();
            double d10 = (double) this.f24286c;
            double d11 = (double) this.f24287d;
            Double.isNaN(d11);
            double d12 = d11 * 0.23d;
            Double.isNaN(d10);
            C9203e eVar4 = new C9203e(floatValue3, floatEvaluator.evaluate(0.1f, Double.valueOf(d10 - d12), Float.valueOf(this.f24286c)).floatValue());
            double d13 = (double) this.f24287d;
            Double.isNaN(d13);
            float floatValue4 = floatEvaluator.evaluate(0.1f, Double.valueOf(d13 * 0.591d), Float.valueOf(this.f24287d)).floatValue();
            double d14 = (double) this.f24286c;
            double d15 = (double) this.f24287d;
            Double.isNaN(d15);
            double d16 = d15 * 0.118d;
            Double.isNaN(d14);
            mo33346a(eVar, eVar2, eVar3, eVar4, new C9203e(floatValue4, floatEvaluator.evaluate(0.1f, Double.valueOf(d14 + d16), Float.valueOf(this.f24286c)).floatValue()), 0, 4, -1.0f, -1.0f, -1.0f);
        }

        /* renamed from: d */
        private void m43078d() {
            C9203e eVar = new C9203e(this.f24287d, this.f24286c);
            float f = this.f24287d;
            mo33346a(eVar, null, null, null, null, 3, 2, f * 0.094f, 350.0f, f * 0.798f);
        }

        /* renamed from: e */
        private void m43079e() {
            FloatEvaluator floatEvaluator = new FloatEvaluator();
            C9203e eVar = new C9203e(this.f24287d, this.f24286c);
            double d = (double) this.f24287d;
            Double.isNaN(d);
            float floatValue = floatEvaluator.evaluate(0.2f, Double.valueOf(d * 0.414d), Float.valueOf(this.f24287d)).floatValue();
            double d2 = (double) this.f24286c;
            double d3 = (double) this.f24287d;
            Double.isNaN(d3);
            double d4 = d3 * 0.24d;
            Double.isNaN(d2);
            C9203e eVar2 = new C9203e(floatValue, floatEvaluator.evaluate(0.2f, Double.valueOf(d2 - d4), Float.valueOf(this.f24286c)).floatValue());
            double d5 = (double) this.f24287d;
            Double.isNaN(d5);
            float floatValue2 = floatEvaluator.evaluate(0.2f, Double.valueOf(d5 * 0.355d), Float.valueOf(this.f24287d)).floatValue();
            double d6 = (double) this.f24286c;
            double d7 = (double) this.f24287d;
            Double.isNaN(d7);
            double d8 = d7 * 0.029d;
            Double.isNaN(d6);
            C9203e eVar3 = new C9203e(floatValue2, floatEvaluator.evaluate(0.2f, Double.valueOf(d6 - d8), Float.valueOf(this.f24286c)).floatValue());
            double d9 = (double) this.f24287d;
            Double.isNaN(d9);
            float floatValue3 = floatEvaluator.evaluate(0.2f, Double.valueOf(d9 * 0.65d), Float.valueOf(this.f24287d)).floatValue();
            double d10 = (double) this.f24286c;
            double d11 = (double) this.f24287d;
            Double.isNaN(d11);
            double d12 = d11 * 0.118d;
            Double.isNaN(d10);
            C9203e eVar4 = new C9203e(floatValue3, floatEvaluator.evaluate(0.2f, Double.valueOf(d10 - d12), Float.valueOf(this.f24286c)).floatValue());
            double d13 = (double) this.f24287d;
            Double.isNaN(d13);
            float floatValue4 = floatEvaluator.evaluate(0.2f, Double.valueOf(d13 * 0.591d), Float.valueOf(this.f24287d)).floatValue();
            double d14 = (double) this.f24286c;
            double d15 = (double) this.f24287d;
            Double.isNaN(d15);
            double d16 = d15 * 0.118d;
            Double.isNaN(d14);
            mo33346a(eVar, eVar2, eVar3, eVar4, new C9203e(floatValue4, floatEvaluator.evaluate(0.2f, Double.valueOf(d14 + d16), Float.valueOf(this.f24286c)).floatValue()), 2, 0, -1.0f, -1.0f, -1.0f);
        }

        /* renamed from: b */
        public C9204f mo33347b(int i) {
            return (C9204f) this.f24289f.get(Integer.valueOf(i));
        }

        /* renamed from: b */
        private void m43076b(C9203e eVar, C9203e eVar2, C9203e eVar3, C9203e eVar4, C9203e eVar5, int i) {
            float f = eVar.f24269a;
            float f2 = eVar.f24270b;
            C9204f fVar = new C9204f();
            fVar.f24279b = eVar4;
            fVar.f24282e[2] = eVar5;
            C9203e[] eVarArr = fVar.f24283f;
            eVarArr[0] = eVar3;
            eVarArr[1] = eVar2;
            eVarArr[2] = eVar4;
            m43070a(f, fVar);
            this.f24289f.put(Integer.valueOf(i), fVar);
        }

        /* renamed from: a */
        public C9200b mo33345a(int i) {
            C9200b bVar = (C9200b) this.f24288e.get(Integer.valueOf(i));
            if (bVar != null) {
                return bVar;
            }
            C9200b bVar2 = new C9200b();
            bVar2.f24258d = i;
            this.f24288e.put(Integer.valueOf(i), bVar2);
            return bVar2;
        }

        /* renamed from: a */
        public void mo33346a(C9203e eVar, C9203e eVar2, C9203e eVar3, C9203e eVar4, C9203e eVar5, int i, int i2, float f, float f2, float f3) {
            int i3 = i;
            if (i3 == 0) {
                m43076b(eVar, eVar2, eVar3, eVar4, eVar5, i2);
            } else if (2 == i3) {
                m43073a(eVar, eVar2, eVar3, eVar4, eVar5, i2);
            } else if (3 == i3) {
                m43071a(eVar, f, f2, f3, i2);
            }
        }

        /* renamed from: a */
        private void m43073a(C9203e eVar, C9203e eVar2, C9203e eVar3, C9203e eVar4, C9203e eVar5, int i) {
            float f = eVar.f24269a;
            float f2 = eVar.f24270b;
            float f3 = eVar2.f24269a;
            eVar2.f24269a = eVar3.f24269a;
            eVar3.f24269a = f3;
            float f4 = eVar4.f24269a;
            eVar4.f24269a = eVar5.f24269a;
            eVar5.f24269a = f4;
            m43069a(f2, eVar4, eVar5);
            m43069a(f2, eVar2, eVar3);
            C9204f fVar = new C9204f();
            fVar.f24279b = eVar4;
            fVar.f24282e[2] = eVar5;
            C9203e[] eVarArr = fVar.f24283f;
            eVarArr[0] = eVar3;
            eVarArr[1] = eVar2;
            eVarArr[2] = eVar4;
            m43070a(f, fVar);
            this.f24289f.put(Integer.valueOf(i), fVar);
        }

        /* renamed from: b */
        private void m43075b() {
            FloatEvaluator floatEvaluator = new FloatEvaluator();
            C9203e eVar = new C9203e(this.f24287d, this.f24286c);
            double d = (double) this.f24287d;
            Double.isNaN(d);
            float floatValue = floatEvaluator.evaluate(0.2f, Double.valueOf(d * 0.414d), Float.valueOf(this.f24287d)).floatValue();
            double d2 = (double) this.f24286c;
            double d3 = (double) this.f24287d;
            Double.isNaN(d3);
            double d4 = d3 * 0.24d;
            Double.isNaN(d2);
            C9203e eVar2 = new C9203e(floatValue, floatEvaluator.evaluate(0.2f, Double.valueOf(d2 - d4), Float.valueOf(this.f24286c)).floatValue());
            double d5 = (double) this.f24287d;
            Double.isNaN(d5);
            float floatValue2 = floatEvaluator.evaluate(0.2f, Double.valueOf(d5 * 0.355d), Float.valueOf(this.f24287d)).floatValue();
            double d6 = (double) this.f24286c;
            double d7 = (double) this.f24287d;
            Double.isNaN(d7);
            double d8 = d7 * 0.029d;
            Double.isNaN(d6);
            C9203e eVar3 = new C9203e(floatValue2, floatEvaluator.evaluate(0.2f, Double.valueOf(d6 - d8), Float.valueOf(this.f24286c)).floatValue());
            double d9 = (double) this.f24287d;
            Double.isNaN(d9);
            float floatValue3 = floatEvaluator.evaluate(0.2f, Double.valueOf(d9 * 0.65d), Float.valueOf(this.f24287d)).floatValue();
            double d10 = (double) this.f24286c;
            double d11 = (double) this.f24287d;
            Double.isNaN(d11);
            double d12 = d11 * 0.118d;
            Double.isNaN(d10);
            C9203e eVar4 = new C9203e(floatValue3, floatEvaluator.evaluate(0.2f, Double.valueOf(d10 - d12), Float.valueOf(this.f24286c)).floatValue());
            double d13 = (double) this.f24287d;
            Double.isNaN(d13);
            float floatValue4 = floatEvaluator.evaluate(0.2f, Double.valueOf(d13 * 0.591d), Float.valueOf(this.f24287d)).floatValue();
            double d14 = (double) this.f24286c;
            double d15 = (double) this.f24287d;
            Double.isNaN(d15);
            double d16 = d15 * 0.118d;
            Double.isNaN(d14);
            mo33346a(eVar, eVar2, eVar3, eVar4, new C9203e(floatValue4, floatEvaluator.evaluate(0.2f, Double.valueOf(d14 + d16), Float.valueOf(this.f24286c)).floatValue()), 0, 3, -1.0f, -1.0f, -1.0f);
        }

        /* renamed from: b */
        private C9203e m43074b(float f, C9203e eVar) {
            C9203e eVar2 = new C9203e();
            C9199a.m43045a(eVar, new C9203e(eVar.f24269a, f), eVar2);
            return eVar2;
        }

        /* renamed from: a */
        private void m43071a(C9203e eVar, float f, float f2, float f3, int i) {
            float f4 = eVar.f24269a;
            float f5 = eVar.f24270b;
            C9203e b = C9199a.m43046b(eVar, C9199a.m43043a(f2 - 180.0f), f3 / 2.0f);
            C9204f fVar = new C9204f();
            float f6 = f2 - 270.0f;
            fVar.f24283f[0] = C9199a.m43046b(b, C9199a.m43043a(f6), f);
            float f7 = f2 - 90.0f;
            fVar.f24283f[1] = C9199a.m43046b(b, C9199a.m43043a(f7), f);
            C9203e b2 = C9199a.m43046b(b, f2, f3 / 6.0f);
            fVar.f24279b = C9199a.m43046b(b2, C9199a.m43043a(f7), f);
            fVar.f24282e[2] = C9199a.m43046b(b2, C9199a.m43043a(f6), f);
            fVar.f24283f[2] = fVar.f24279b;
            m43068a(f4, f5, fVar);
            this.f24289f.put(Integer.valueOf(i), fVar);
        }

        /* renamed from: a */
        private void m43068a(float f, float f2, C9204f fVar) {
            fVar.f24280c[0] = C9199a.m43045a(fVar.f24283f[1], fVar.f24279b, new C9203e());
            C9203e[] eVarArr = fVar.f24280c;
            eVarArr[1] = m43065a(f, eVarArr[0]);
            fVar.f24280c[2] = m43065a(f, fVar.f24279b);
            fVar.f24281d[0] = m43065a(f, fVar.f24283f[1]);
            fVar.f24281d[1] = m43065a(f, fVar.f24283f[0]);
            fVar.f24281d[2] = m43065a(f, fVar.f24282e[2]);
            C9203e[] eVarArr2 = fVar.f24282e;
            eVarArr2[1] = C9199a.m43045a(fVar.f24283f[0], eVarArr2[2], new C9203e());
            C9203e[] eVarArr3 = fVar.f24282e;
            eVarArr3[0] = m43065a(f, eVarArr3[1]);
            m43072a(fVar.f24280c[1], fVar.f24282e[0]);
            m43069a(f2, fVar.f24280c[1], fVar.f24282e[0]);
            m43072a(fVar.f24280c[2], fVar.f24281d[2]);
            m43069a(f2, fVar.f24280c[2], fVar.f24281d[2]);
            C9203e[] eVarArr4 = fVar.f24281d;
            m43072a(eVarArr4[0], eVarArr4[1]);
            C9203e[] eVarArr5 = fVar.f24281d;
            m43069a(f2, eVarArr5[0], eVarArr5[1]);
        }

        /* renamed from: a */
        private void m43070a(float f, C9204f fVar) {
            fVar.f24280c[0] = C9199a.m43045a(fVar.f24283f[1], fVar.f24279b, new C9203e());
            C9203e[] eVarArr = fVar.f24280c;
            eVarArr[1] = m43065a(f, eVarArr[0]);
            fVar.f24280c[2] = m43065a(f, fVar.f24279b);
            fVar.f24281d[0] = m43065a(f, fVar.f24283f[1]);
            fVar.f24281d[1] = m43065a(f, fVar.f24283f[0]);
            fVar.f24281d[2] = m43065a(f, fVar.f24282e[2]);
            C9203e[] eVarArr2 = fVar.f24282e;
            eVarArr2[1] = C9199a.m43045a(fVar.f24283f[0], eVarArr2[2], new C9203e());
            C9203e[] eVarArr3 = fVar.f24282e;
            eVarArr3[0] = m43065a(f, eVarArr3[1]);
        }

        /* renamed from: a */
        private void m43072a(C9203e eVar, C9203e eVar2) {
            float f = eVar.f24269a;
            eVar.f24269a = eVar2.f24269a;
            eVar2.f24269a = f;
        }

        /* renamed from: a */
        private void m43069a(float f, C9203e eVar, C9203e eVar2) {
            float f2 = f - eVar.f24270b;
            eVar.f24270b = f - (eVar2.f24270b - f);
            eVar2.f24270b = f + f2;
        }

        /* renamed from: a */
        private void m43067a() {
            FloatEvaluator floatEvaluator = new FloatEvaluator();
            C9203e eVar = new C9203e(this.f24287d, this.f24286c);
            double d = (double) this.f24287d;
            Double.isNaN(d);
            float floatValue = floatEvaluator.evaluate(0.2f, Double.valueOf(d * 0.414d), Float.valueOf(this.f24287d)).floatValue();
            double d2 = (double) this.f24286c;
            double d3 = (double) this.f24287d;
            Double.isNaN(d3);
            double d4 = d3 * 0.24d;
            Double.isNaN(d2);
            C9203e eVar2 = new C9203e(floatValue, floatEvaluator.evaluate(0.2f, Double.valueOf(d2 - d4), Float.valueOf(this.f24286c)).floatValue());
            double d5 = (double) this.f24287d;
            Double.isNaN(d5);
            float floatValue2 = floatEvaluator.evaluate(0.2f, Double.valueOf(d5 * 0.355d), Float.valueOf(this.f24287d)).floatValue();
            double d6 = (double) this.f24286c;
            double d7 = (double) this.f24287d;
            Double.isNaN(d7);
            double d8 = d7 * 0.029d;
            Double.isNaN(d6);
            C9203e eVar3 = new C9203e(floatValue2, floatEvaluator.evaluate(0.2f, Double.valueOf(d6 - d8), Float.valueOf(this.f24286c)).floatValue());
            double d9 = (double) this.f24287d;
            Double.isNaN(d9);
            float floatValue3 = floatEvaluator.evaluate(0.2f, Double.valueOf(d9 * 0.65d), Float.valueOf(this.f24287d)).floatValue();
            double d10 = (double) this.f24286c;
            double d11 = (double) this.f24287d;
            Double.isNaN(d11);
            double d12 = d11 * 0.118d;
            Double.isNaN(d10);
            C9203e eVar4 = new C9203e(floatValue3, floatEvaluator.evaluate(0.2f, Double.valueOf(d10 - d12), Float.valueOf(this.f24286c)).floatValue());
            double d13 = (double) this.f24287d;
            Double.isNaN(d13);
            float floatValue4 = floatEvaluator.evaluate(0.2f, Double.valueOf(d13 * 0.591d), Float.valueOf(this.f24287d)).floatValue();
            double d14 = (double) this.f24286c;
            double d15 = (double) this.f24287d;
            Double.isNaN(d15);
            double d16 = d15 * 0.118d;
            Double.isNaN(d14);
            mo33346a(eVar, eVar2, eVar3, eVar4, new C9203e(floatValue4, floatEvaluator.evaluate(0.2f, Double.valueOf(d14 + d16), Float.valueOf(this.f24286c)).floatValue()), 2, 1, -1.0f, -1.0f, -1.0f);
        }

        /* renamed from: a */
        private C9203e m43065a(float f, C9203e eVar) {
            C9203e eVar2 = new C9203e();
            C9199a.m43045a(eVar, new C9203e(f, eVar.f24270b), eVar2);
            return eVar2;
        }
    }

    public C9199a(Context context) {
        super(context);
    }

    /* renamed from: b */
    protected static C9203e m43046b(C9203e eVar, float f, float f2) {
        double d = (double) eVar.f24269a;
        double d2 = (double) f;
        double cos = Math.cos(Math.toRadians(d2));
        double d3 = (double) f2;
        Double.isNaN(d3);
        double d4 = cos * d3;
        Double.isNaN(d);
        float f3 = (float) (d + d4);
        double d5 = (double) eVar.f24270b;
        double sin = Math.sin(Math.toRadians(d2));
        Double.isNaN(d3);
        double d6 = sin * d3;
        Double.isNaN(d5);
        return new C9203e(f3, (float) (d5 + d6));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo33334a(C9204f fVar, float f, float f2) {
        mo33333a(fVar.f24279b, f, f2);
        mo33335a(fVar.f24280c, f, f2);
        mo33335a(fVar.f24281d, f, f2);
        mo33335a(fVar.f24282e, f, f2);
        mo33335a(fVar.f24283f, f, f2);
    }

    public C9199a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C9199a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo33335a(C9203e[] eVarArr, float f, float f2) {
        for (C9203e a : eVarArr) {
            mo33333a(a, f, f2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo33333a(C9203e eVar, float f, float f2) {
        eVar.f24269a += f;
        eVar.f24270b += f2;
    }

    /* renamed from: a */
    protected static C9203e m43045a(C9203e eVar, C9203e eVar2, C9203e eVar3) {
        float f = m43044a(eVar, eVar2) < 0.0f ? -1.0f : 1.0f;
        float f2 = eVar2.f24269a;
        eVar3.f24269a = f2 + ((f2 - eVar.f24269a) * f);
        float f3 = eVar2.f24270b;
        eVar3.f24270b = f3 + (f * (f3 - eVar.f24270b));
        return eVar3;
    }

    /* renamed from: a */
    protected static float m43044a(C9203e eVar, C9203e eVar2) {
        float f = eVar.f24269a;
        float f2 = eVar2.f24269a;
        float f3 = (f - f2) * (f - f2);
        float f4 = eVar.f24270b;
        float f5 = eVar2.f24270b;
        return (float) Math.sqrt((double) (f3 + ((f4 - f5) * (f4 - f5))));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Path mo33332a(float f, float f2, Path path, C9204f fVar, C9204f fVar2, FloatEvaluator floatEvaluator) {
        float f3 = f2;
        Path path2 = path;
        C9204f fVar3 = fVar;
        C9204f fVar4 = fVar2;
        FloatEvaluator floatEvaluator2 = floatEvaluator;
        path.reset();
        path2.moveTo(floatEvaluator2.evaluate(f3, Float.valueOf(fVar3.f24279b.f24269a), Float.valueOf(fVar4.f24279b.f24269a)).floatValue() + f, floatEvaluator2.evaluate(f3, Float.valueOf(fVar3.f24279b.f24270b), Float.valueOf(fVar4.f24279b.f24270b)).floatValue());
        path.cubicTo(floatEvaluator2.evaluate(f3, Float.valueOf(fVar3.f24280c[0].f24269a), Float.valueOf(fVar4.f24280c[0].f24269a)).floatValue() + f, floatEvaluator2.evaluate(f3, Float.valueOf(fVar3.f24280c[0].f24270b), Float.valueOf(fVar4.f24280c[0].f24270b)).floatValue(), floatEvaluator2.evaluate(f3, Float.valueOf(fVar3.f24280c[1].f24269a), Float.valueOf(fVar4.f24280c[1].f24269a)).floatValue() + f, floatEvaluator2.evaluate(f3, Float.valueOf(fVar3.f24280c[1].f24270b), Float.valueOf(fVar4.f24280c[1].f24270b)).floatValue(), floatEvaluator2.evaluate(f3, Float.valueOf(fVar3.f24280c[2].f24269a), Float.valueOf(fVar4.f24280c[2].f24269a)).floatValue() + f, floatEvaluator2.evaluate(f3, Float.valueOf(fVar3.f24280c[2].f24270b), Float.valueOf(fVar4.f24280c[2].f24270b)).floatValue());
        path.cubicTo(floatEvaluator2.evaluate(f3, Float.valueOf(fVar3.f24281d[0].f24269a), Float.valueOf(fVar4.f24281d[0].f24269a)).floatValue() + f, floatEvaluator2.evaluate(f3, Float.valueOf(fVar3.f24281d[0].f24270b), Float.valueOf(fVar4.f24281d[0].f24270b)).floatValue(), floatEvaluator2.evaluate(f3, Float.valueOf(fVar3.f24281d[1].f24269a), Float.valueOf(fVar4.f24281d[1].f24269a)).floatValue() + f, floatEvaluator2.evaluate(f3, Float.valueOf(fVar3.f24281d[1].f24270b), Float.valueOf(fVar4.f24281d[1].f24270b)).floatValue(), floatEvaluator2.evaluate(f3, Float.valueOf(fVar3.f24281d[2].f24269a), Float.valueOf(fVar4.f24281d[2].f24269a)).floatValue() + f, floatEvaluator2.evaluate(f3, Float.valueOf(fVar3.f24281d[2].f24270b), Float.valueOf(fVar4.f24281d[2].f24270b)).floatValue());
        path.cubicTo(floatEvaluator2.evaluate(f3, Float.valueOf(fVar3.f24282e[0].f24269a), Float.valueOf(fVar4.f24282e[0].f24269a)).floatValue() + f, floatEvaluator2.evaluate(f3, Float.valueOf(fVar3.f24282e[0].f24270b), Float.valueOf(fVar4.f24282e[0].f24270b)).floatValue(), floatEvaluator2.evaluate(f3, Float.valueOf(fVar3.f24282e[1].f24269a), Float.valueOf(fVar4.f24282e[1].f24269a)).floatValue() + f, floatEvaluator2.evaluate(f3, Float.valueOf(fVar3.f24282e[1].f24270b), Float.valueOf(fVar4.f24282e[1].f24270b)).floatValue(), floatEvaluator2.evaluate(f3, Float.valueOf(fVar3.f24282e[2].f24269a), Float.valueOf(fVar4.f24282e[2].f24269a)).floatValue() + f, floatEvaluator2.evaluate(f3, Float.valueOf(fVar3.f24282e[2].f24270b), Float.valueOf(fVar4.f24282e[2].f24270b)).floatValue());
        path.cubicTo(floatEvaluator2.evaluate(f3, Float.valueOf(fVar3.f24283f[0].f24269a), Float.valueOf(fVar4.f24283f[0].f24269a)).floatValue() + f, floatEvaluator2.evaluate(f3, Float.valueOf(fVar3.f24283f[0].f24270b), Float.valueOf(fVar4.f24283f[0].f24270b)).floatValue(), floatEvaluator2.evaluate(f3, Float.valueOf(fVar3.f24283f[1].f24269a), Float.valueOf(fVar4.f24283f[1].f24269a)).floatValue() + f, floatEvaluator2.evaluate(f3, Float.valueOf(fVar3.f24283f[1].f24270b), Float.valueOf(fVar4.f24283f[1].f24270b)).floatValue(), floatEvaluator2.evaluate(f3, Float.valueOf(fVar3.f24283f[2].f24269a), Float.valueOf(fVar4.f24283f[2].f24269a)).floatValue() + f, floatEvaluator2.evaluate(f3, Float.valueOf(fVar3.f24283f[2].f24270b), Float.valueOf(fVar4.f24283f[2].f24270b)).floatValue());
        path.close();
        return path2;
    }

    /* renamed from: a */
    public static float m43043a(float f) {
        if (f < 0.0f) {
            return m43043a(f + 360.0f);
        }
        return f >= 360.0f ? f % 360.0f : f + 0.0f;
    }
}
