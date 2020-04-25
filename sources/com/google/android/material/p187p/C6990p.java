package com.google.android.material.p187p;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Path.Op;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build.VERSION;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.RequiresApi;

/* renamed from: com.google.android.material.p.p */
/* compiled from: ShapeAppearancePathProvider */
public class C6990p {

    /* renamed from: a */
    private final C6993q[] f19623a = new C6993q[4];

    /* renamed from: b */
    private final Matrix[] f19624b = new Matrix[4];

    /* renamed from: c */
    private final Matrix[] f19625c = new Matrix[4];

    /* renamed from: d */
    private final PointF f19626d = new PointF();

    /* renamed from: e */
    private final Path f19627e = new Path();

    /* renamed from: f */
    private final Path f19628f = new Path();

    /* renamed from: g */
    private final C6993q f19629g = new C6993q();

    /* renamed from: h */
    private final float[] f19630h = new float[2];

    /* renamed from: i */
    private final float[] f19631i = new float[2];

    /* renamed from: j */
    private boolean f19632j = true;

    @C0207n0({C0208a.LIBRARY_GROUP})
    /* renamed from: com.google.android.material.p.p$a */
    /* compiled from: ShapeAppearancePathProvider */
    public interface C6991a {
        /* renamed from: a */
        void mo27847a(C6993q qVar, Matrix matrix, int i);

        /* renamed from: b */
        void mo27848b(C6993q qVar, Matrix matrix, int i);
    }

    /* renamed from: com.google.android.material.p.p$b */
    /* compiled from: ShapeAppearancePathProvider */
    static final class C6992b {
        @C0193h0

        /* renamed from: a */
        public final C6986o f19633a;
        @C0193h0

        /* renamed from: b */
        public final Path f19634b;
        @C0193h0

        /* renamed from: c */
        public final RectF f19635c;
        @C0195i0

        /* renamed from: d */
        public final C6991a f19636d;

        /* renamed from: e */
        public final float f19637e;

        C6992b(@C0193h0 C6986o oVar, float f, RectF rectF, @C0195i0 C6991a aVar, Path path) {
            this.f19636d = aVar;
            this.f19633a = oVar;
            this.f19637e = f;
            this.f19635c = rectF;
            this.f19634b = path;
        }
    }

    public C6990p() {
        for (int i = 0; i < 4; i++) {
            this.f19623a[i] = new C6993q();
            this.f19624b[i] = new Matrix();
            this.f19625c[i] = new Matrix();
        }
    }

    /* renamed from: a */
    private float m33591a(int i) {
        return (float) ((i + 1) * 90);
    }

    /* renamed from: b */
    private void m33598b(int i) {
        this.f19630h[0] = this.f19623a[i].mo27905a();
        this.f19630h[1] = this.f19623a[i].mo27911b();
        this.f19624b[i].mapPoints(this.f19630h);
        float a = m33591a(i);
        this.f19625c[i].reset();
        Matrix matrix = this.f19625c[i];
        float[] fArr = this.f19630h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f19625c[i].preRotate(a);
    }

    /* renamed from: c */
    private void m33601c(@C0193h0 C6992b bVar, int i) {
        m33597b(i, bVar.f19633a).mo27770a(this.f19623a[i], 90.0f, bVar.f19637e, bVar.f19635c, m33593a(i, bVar.f19633a));
        float a = m33591a(i);
        this.f19624b[i].reset();
        m33594a(i, bVar.f19635c, this.f19626d);
        Matrix matrix = this.f19624b[i];
        PointF pointF = this.f19626d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f19624b[i].preRotate(a);
    }

    /* renamed from: a */
    public void mo27902a(C6986o oVar, float f, RectF rectF, @C0193h0 Path path) {
        mo27903a(oVar, f, rectF, null, path);
    }

    @C0207n0({C0208a.LIBRARY_GROUP})
    /* renamed from: a */
    public void mo27903a(C6986o oVar, float f, RectF rectF, C6991a aVar, @C0193h0 Path path) {
        path.rewind();
        this.f19627e.rewind();
        this.f19628f.rewind();
        this.f19628f.addRect(rectF, Direction.CW);
        C6992b bVar = new C6992b(oVar, f, rectF, aVar, path);
        for (int i = 0; i < 4; i++) {
            m33601c(bVar, i);
            m33598b(i);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            m33595a(bVar, i2);
            m33599b(bVar, i2);
        }
        path.close();
        this.f19627e.close();
        if (VERSION.SDK_INT >= 19 && !this.f19627e.isEmpty()) {
            path.op(this.f19627e, Op.UNION);
        }
    }

    /* renamed from: b */
    private void m33599b(@C0193h0 C6992b bVar, int i) {
        int i2 = (i + 1) % 4;
        this.f19630h[0] = this.f19623a[i].mo27905a();
        this.f19630h[1] = this.f19623a[i].mo27911b();
        this.f19624b[i].mapPoints(this.f19630h);
        this.f19631i[0] = this.f19623a[i2].mo27914c();
        this.f19631i[1] = this.f19623a[i2].mo27915d();
        this.f19624b[i2].mapPoints(this.f19631i);
        float[] fArr = this.f19630h;
        float f = fArr[0];
        float[] fArr2 = this.f19631i;
        float max = Math.max(((float) Math.hypot((double) (f - fArr2[0]), (double) (fArr[1] - fArr2[1]))) - 0.001f, 0.0f);
        float a = m33592a(bVar.f19635c, i);
        this.f19629g.mo27912b(0.0f, 0.0f);
        C6974g c = m33600c(i, bVar.f19633a);
        c.mo22347a(max, a, bVar.f19637e, this.f19629g);
        Path path = new Path();
        this.f19629g.mo27910a(this.f19625c[i], path);
        if (!this.f19632j || VERSION.SDK_INT < 19 || (!c.mo27772b() && !m33596a(path, i) && !m33596a(path, i2))) {
            this.f19629g.mo27910a(this.f19625c[i], bVar.f19634b);
        } else {
            path.op(path, this.f19628f, Op.DIFFERENCE);
            this.f19630h[0] = this.f19629g.mo27914c();
            this.f19630h[1] = this.f19629g.mo27915d();
            this.f19625c[i].mapPoints(this.f19630h);
            Path path2 = this.f19627e;
            float[] fArr3 = this.f19630h;
            path2.moveTo(fArr3[0], fArr3[1]);
            this.f19629g.mo27910a(this.f19625c[i], this.f19627e);
        }
        C6991a aVar = bVar.f19636d;
        if (aVar != null) {
            aVar.mo27848b(this.f19629g, this.f19625c[i], i);
        }
    }

    /* renamed from: c */
    private C6974g m33600c(int i, @C0193h0 C6986o oVar) {
        if (i == 1) {
            return oVar.mo27855a();
        }
        if (i == 2) {
            return oVar.mo27864f();
        }
        if (i != 3) {
            return oVar.mo27865g();
        }
        return oVar.mo27866h();
    }

    /* renamed from: a */
    private void m33595a(@C0193h0 C6992b bVar, int i) {
        this.f19630h[0] = this.f19623a[i].mo27914c();
        this.f19630h[1] = this.f19623a[i].mo27915d();
        this.f19624b[i].mapPoints(this.f19630h);
        if (i == 0) {
            Path path = bVar.f19634b;
            float[] fArr = this.f19630h;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = bVar.f19634b;
            float[] fArr2 = this.f19630h;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.f19623a[i].mo27910a(this.f19624b[i], bVar.f19634b);
        C6991a aVar = bVar.f19636d;
        if (aVar != null) {
            aVar.mo27847a(this.f19623a[i], this.f19624b[i], i);
        }
    }

    @RequiresApi(19)
    /* renamed from: a */
    private boolean m33596a(Path path, int i) {
        Path path2 = new Path();
        this.f19623a[i].mo27910a(this.f19624b[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (!rectF.isEmpty()) {
            return true;
        }
        if (rectF.width() <= 1.0f || rectF.height() <= 1.0f) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private float m33592a(@C0193h0 RectF rectF, int i) {
        float[] fArr = this.f19630h;
        C6993q[] qVarArr = this.f19623a;
        fArr[0] = qVarArr[i].f19642c;
        fArr[1] = qVarArr[i].f19643d;
        this.f19624b[i].mapPoints(fArr);
        if (i == 1 || i == 3) {
            return Math.abs(rectF.centerX() - this.f19630h[0]);
        }
        return Math.abs(rectF.centerY() - this.f19630h[1]);
    }

    /* renamed from: a */
    private C6971d m33593a(int i, @C0193h0 C6986o oVar) {
        if (i == 1) {
            return oVar.mo27863e();
        }
        if (i == 2) {
            return oVar.mo27861c();
        }
        if (i != 3) {
            return oVar.mo27870l();
        }
        return oVar.mo27868j();
    }

    /* renamed from: b */
    private C6972e m33597b(int i, @C0193h0 C6986o oVar) {
        if (i == 1) {
            return oVar.mo27862d();
        }
        if (i == 2) {
            return oVar.mo27860b();
        }
        if (i != 3) {
            return oVar.mo27869k();
        }
        return oVar.mo27867i();
    }

    /* renamed from: a */
    private void m33594a(int i, @C0193h0 RectF rectF, @C0193h0 PointF pointF) {
        if (i == 1) {
            pointF.set(rectF.right, rectF.bottom);
        } else if (i == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i != 3) {
            pointF.set(rectF.right, rectF.top);
        } else {
            pointF.set(rectF.left, rectF.top);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo27904a(boolean z) {
        this.f19632j = z;
    }
}
