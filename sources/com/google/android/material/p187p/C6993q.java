package com.google.android.material.p187p;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.C0193h0;
import com.google.android.material.p304o.C6967b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.material.p.q */
/* compiled from: ShapePath */
public class C6993q {

    /* renamed from: i */
    private static final float f19638i = 270.0f;

    /* renamed from: j */
    protected static final float f19639j = 180.0f;
    @Deprecated

    /* renamed from: a */
    public float f19640a;
    @Deprecated

    /* renamed from: b */
    public float f19641b;
    @Deprecated

    /* renamed from: c */
    public float f19642c;
    @Deprecated

    /* renamed from: d */
    public float f19643d;
    @Deprecated

    /* renamed from: e */
    public float f19644e;
    @Deprecated

    /* renamed from: f */
    public float f19645f;

    /* renamed from: g */
    private final List<C6999f> f19646g = new ArrayList();

    /* renamed from: h */
    private final List<C7001h> f19647h = new ArrayList();

    /* renamed from: com.google.android.material.p.q$a */
    /* compiled from: ShapePath */
    class C6994a extends C7001h {

        /* renamed from: b */
        final /* synthetic */ List f19648b;

        /* renamed from: c */
        final /* synthetic */ Matrix f19649c;

        C6994a(List list, Matrix matrix) {
            this.f19648b = list;
            this.f19649c = matrix;
        }

        /* renamed from: a */
        public void mo27916a(Matrix matrix, C6967b bVar, int i, Canvas canvas) {
            for (C7001h a : this.f19648b) {
                a.mo27916a(this.f19649c, bVar, i, canvas);
            }
        }
    }

    /* renamed from: com.google.android.material.p.q$b */
    /* compiled from: ShapePath */
    static class C6995b extends C7001h {

        /* renamed from: b */
        private final C6997d f19651b;

        public C6995b(C6997d dVar) {
            this.f19651b = dVar;
        }

        /* renamed from: a */
        public void mo27916a(Matrix matrix, @C0193h0 C6967b bVar, int i, @C0193h0 Canvas canvas) {
            float e = this.f19651b.m33643d();
            float f = this.f19651b.m33646e();
            bVar.mo27761a(canvas, matrix, new RectF(this.f19651b.m33636b(), this.f19651b.m33649f(), this.f19651b.m33640c(), this.f19651b.m33632a()), i, e, f);
        }
    }

    /* renamed from: com.google.android.material.p.q$c */
    /* compiled from: ShapePath */
    static class C6996c extends C7001h {

        /* renamed from: b */
        private final C6998e f19652b;

        /* renamed from: c */
        private final float f19653c;

        /* renamed from: d */
        private final float f19654d;

        public C6996c(C6998e eVar, float f, float f2) {
            this.f19652b = eVar;
            this.f19653c = f;
            this.f19654d = f2;
        }

        /* renamed from: a */
        public void mo27916a(Matrix matrix, @C0193h0 C6967b bVar, int i, @C0193h0 Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot((double) (this.f19652b.f19663c - this.f19654d), (double) (this.f19652b.f19662b - this.f19653c)), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.f19653c, this.f19654d);
            matrix2.preRotate(mo27917a());
            bVar.mo27760a(canvas, matrix2, rectF, i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public float mo27917a() {
            return (float) Math.toDegrees(Math.atan((double) ((this.f19652b.f19663c - this.f19654d) / (this.f19652b.f19662b - this.f19653c))));
        }
    }

    /* renamed from: com.google.android.material.p.q$d */
    /* compiled from: ShapePath */
    public static class C6997d extends C6999f {

        /* renamed from: h */
        private static final RectF f19655h = new RectF();
        @Deprecated

        /* renamed from: b */
        public float f19656b;
        @Deprecated

        /* renamed from: c */
        public float f19657c;
        @Deprecated

        /* renamed from: d */
        public float f19658d;
        @Deprecated

        /* renamed from: e */
        public float f19659e;
        @Deprecated

        /* renamed from: f */
        public float f19660f;
        @Deprecated

        /* renamed from: g */
        public float f19661g;

        public C6997d(float f, float f2, float f3, float f4) {
            m33638b(f);
            m33651f(f2);
            m33642c(f3);
            m33634a(f4);
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public float m33640c() {
            return this.f19658d;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public float m33643d() {
            return this.f19660f;
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public float m33646e() {
            return this.f19661g;
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public float m33649f() {
            return this.f19657c;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public float m33636b() {
            return this.f19656b;
        }

        /* renamed from: c */
        private void m33642c(float f) {
            this.f19658d = f;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public void m33645d(float f) {
            this.f19660f = f;
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public void m33648e(float f) {
            this.f19661g = f;
        }

        /* renamed from: f */
        private void m33651f(float f) {
            this.f19657c = f;
        }

        /* renamed from: a */
        public void mo27918a(@C0193h0 Matrix matrix, @C0193h0 Path path) {
            Matrix matrix2 = this.f19664a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            f19655h.set(m33636b(), m33649f(), m33640c(), m33632a());
            path.arcTo(f19655h, m33643d(), m33646e(), false);
            path.transform(matrix);
        }

        /* renamed from: b */
        private void m33638b(float f) {
            this.f19656b = f;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public float m33632a() {
            return this.f19659e;
        }

        /* renamed from: a */
        private void m33634a(float f) {
            this.f19659e = f;
        }
    }

    /* renamed from: com.google.android.material.p.q$e */
    /* compiled from: ShapePath */
    public static class C6998e extends C6999f {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public float f19662b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public float f19663c;

        /* renamed from: a */
        public void mo27918a(@C0193h0 Matrix matrix, @C0193h0 Path path) {
            Matrix matrix2 = this.f19664a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f19662b, this.f19663c);
            path.transform(matrix);
        }
    }

    /* renamed from: com.google.android.material.p.q$f */
    /* compiled from: ShapePath */
    public static abstract class C6999f {

        /* renamed from: a */
        protected final Matrix f19664a = new Matrix();

        /* renamed from: a */
        public abstract void mo27918a(Matrix matrix, Path path);
    }

    /* renamed from: com.google.android.material.p.q$g */
    /* compiled from: ShapePath */
    public static class C7000g extends C6999f {
        @Deprecated

        /* renamed from: b */
        public float f19665b;
        @Deprecated

        /* renamed from: c */
        public float f19666c;
        @Deprecated

        /* renamed from: d */
        public float f19667d;
        @Deprecated

        /* renamed from: e */
        public float f19668e;

        /* renamed from: b */
        private float m33662b() {
            return this.f19666c;
        }

        /* renamed from: c */
        private float m33665c() {
            return this.f19667d;
        }

        /* renamed from: d */
        private float m33668d() {
            return this.f19668e;
        }

        /* renamed from: a */
        public void mo27918a(@C0193h0 Matrix matrix, @C0193h0 Path path) {
            Matrix matrix2 = this.f19664a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.quadTo(m33659a(), m33662b(), m33665c(), m33668d());
            path.transform(matrix);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void m33663b(float f) {
            this.f19666c = f;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public void m33666c(float f) {
            this.f19667d = f;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public void m33669d(float f) {
            this.f19668e = f;
        }

        /* renamed from: a */
        private float m33659a() {
            return this.f19665b;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m33660a(float f) {
            this.f19665b = f;
        }
    }

    /* renamed from: com.google.android.material.p.q$h */
    /* compiled from: ShapePath */
    static abstract class C7001h {

        /* renamed from: a */
        static final Matrix f19669a = new Matrix();

        C7001h() {
        }

        /* renamed from: a */
        public abstract void mo27916a(Matrix matrix, C6967b bVar, int i, Canvas canvas);

        /* renamed from: a */
        public final void mo27919a(C6967b bVar, int i, Canvas canvas) {
            mo27916a(f19669a, bVar, i, canvas);
        }
    }

    public C6993q() {
        mo27912b(0.0f, 0.0f);
    }

    /* renamed from: e */
    private float m33612e() {
        return this.f19644e;
    }

    /* renamed from: f */
    private float m33614f() {
        return this.f19645f;
    }

    /* renamed from: g */
    private void m33616g(float f) {
        this.f19641b = f;
    }

    /* renamed from: a */
    public void mo27907a(float f, float f2) {
        C6998e eVar = new C6998e();
        eVar.f19662b = f;
        eVar.f19663c = f2;
        this.f19646g.add(eVar);
        C6996c cVar = new C6996c(eVar, mo27905a(), mo27911b());
        m33608a(cVar, cVar.mo27917a() + 270.0f, cVar.mo27917a() + 270.0f);
        m33611d(f);
        m33613e(f2);
    }

    /* renamed from: b */
    public void mo27912b(float f, float f2) {
        mo27913b(f, f2, 270.0f, 0.0f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public float mo27914c() {
        return this.f19640a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public float mo27915d() {
        return this.f19641b;
    }

    /* renamed from: c */
    private void m33610c(float f) {
        this.f19645f = f;
    }

    /* renamed from: d */
    private void m33611d(float f) {
        this.f19642c = f;
    }

    /* renamed from: e */
    private void m33613e(float f) {
        this.f19643d = f;
    }

    /* renamed from: f */
    private void m33615f(float f) {
        this.f19640a = f;
    }

    /* renamed from: b */
    public void mo27913b(float f, float f2, float f3, float f4) {
        m33615f(f);
        m33616g(f2);
        m33611d(f);
        m33613e(f2);
        m33609b(f3);
        m33610c((f3 + f4) % 360.0f);
        this.f19646g.clear();
        this.f19647h.clear();
    }

    public C6993q(float f, float f2) {
        mo27912b(f, f2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public float mo27911b() {
        return this.f19643d;
    }

    /* renamed from: b */
    private void m33609b(float f) {
        this.f19644e = f;
    }

    /* renamed from: a */
    public void mo27908a(float f, float f2, float f3, float f4) {
        C7000g gVar = new C7000g();
        gVar.m33660a(f);
        gVar.m33663b(f2);
        gVar.m33666c(f3);
        gVar.m33669d(f4);
        this.f19646g.add(gVar);
        m33611d(f3);
        m33613e(f4);
    }

    /* renamed from: a */
    public void mo27909a(float f, float f2, float f3, float f4, float f5, float f6) {
        C6997d dVar = new C6997d(f, f2, f3, f4);
        dVar.m33645d(f5);
        dVar.m33648e(f6);
        this.f19646g.add(dVar);
        C6995b bVar = new C6995b(dVar);
        float f7 = f5 + f6;
        boolean z = f6 < 0.0f;
        if (z) {
            f5 = (f5 + 180.0f) % 360.0f;
        }
        m33608a(bVar, f5, z ? (180.0f + f7) % 360.0f : f7);
        double d = (double) f7;
        m33611d(((f + f3) * 0.5f) + (((f3 - f) / 2.0f) * ((float) Math.cos(Math.toRadians(d)))));
        m33613e(((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) Math.sin(Math.toRadians(d)))));
    }

    /* renamed from: a */
    public void mo27910a(Matrix matrix, Path path) {
        int size = this.f19646g.size();
        for (int i = 0; i < size; i++) {
            ((C6999f) this.f19646g.get(i)).mo27918a(matrix, path);
        }
    }

    /* access modifiers changed from: 0000 */
    @C0193h0
    /* renamed from: a */
    public C7001h mo27906a(Matrix matrix) {
        m33607a(m33614f());
        return new C6994a(new ArrayList(this.f19647h), matrix);
    }

    /* renamed from: a */
    private void m33608a(C7001h hVar, float f, float f2) {
        m33607a(f);
        this.f19647h.add(hVar);
        m33609b(f2);
    }

    /* renamed from: a */
    private void m33607a(float f) {
        if (m33612e() != f) {
            float e = ((f - m33612e()) + 360.0f) % 360.0f;
            if (e <= 180.0f) {
                C6997d dVar = new C6997d(mo27905a(), mo27911b(), mo27905a(), mo27911b());
                dVar.m33645d(m33612e());
                dVar.m33648e(e);
                this.f19647h.add(new C6995b(dVar));
                m33609b(f);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public float mo27905a() {
        return this.f19642c;
    }
}
