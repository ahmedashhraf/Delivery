package com.instabug.library.annotation;

import android.graphics.Canvas;
import android.graphics.PointF;
import com.instabug.library.annotation.C9747b.C9750c;
import com.instabug.library.annotation.C9747b.C9756i;
import java.io.Serializable;
import java.util.Stack;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.annotation.e */
/* compiled from: MarkUpDrawable */
public class C9762e implements Serializable {

    /* renamed from: Q */
    private static transient /* synthetic */ boolean[] f25900Q;

    /* renamed from: N */
    protected C9747b f25901N = new C9747b();

    /* renamed from: O */
    protected C9747b f25902O;

    /* renamed from: P */
    private Stack<C9747b> f25903P;

    /* renamed from: a */
    protected C9756i f25904a;

    /* renamed from: b */
    protected C9756i f25905b;

    public C9762e(C9756i iVar) {
        boolean[] g = m45527g();
        g[0] = true;
        g[1] = true;
        this.f25902O = new C9747b();
        g[2] = true;
        this.f25903P = new Stack<>();
        this.f25904a = iVar;
        this.f25905b = iVar;
        g[3] = true;
    }

    /* renamed from: c */
    private void m45526c(C9747b bVar) {
        boolean[] g = m45527g();
        C9747b bVar2 = this.f25902O;
        if (bVar2 == null) {
            g[17] = true;
        } else {
            g[18] = true;
            this.f25903P.push(new C9747b(bVar2));
            g[19] = true;
        }
        this.f25902O = bVar;
        g[20] = true;
    }

    /* renamed from: g */
    private static /* synthetic */ boolean[] m45527g() {
        boolean[] zArr = f25900Q;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-3083045156646805944L, "com/instabug/library/annotation/MarkUpDrawable", 44);
        f25900Q = a;
        return a;
    }

    /* renamed from: a */
    public void mo34811a(C9747b bVar) {
        boolean[] g = m45527g();
        this.f25901N = bVar;
        g[4] = true;
        this.f25902O.mo34764a(bVar);
        g[5] = true;
    }

    /* renamed from: b */
    public void mo34815b(C9747b bVar) {
        boolean[] g = m45527g();
        this.f25904a.mo34778a(bVar, this.f25901N, false);
        g[34] = true;
    }

    /* renamed from: d */
    public boolean mo34816d() {
        boolean[] g = m45527g();
        if (this.f25903P.size() > 0) {
            g[25] = true;
            this.f25902O = (C9747b) this.f25903P.pop();
            g[26] = true;
            if (this.f25903P.size() != 0) {
                g[27] = true;
            } else {
                this.f25904a = this.f25905b;
                g[28] = true;
            }
            this.f25904a.mo34778a(this.f25902O, this.f25901N, true);
            g[29] = true;
            return true;
        }
        g[30] = true;
        return false;
    }

    /* renamed from: e */
    public C9756i mo34817e() {
        boolean[] g = m45527g();
        C9756i iVar = this.f25904a;
        g[33] = true;
        return iVar;
    }

    /* renamed from: f */
    public boolean mo34818f() {
        boolean[] g = m45527g();
        boolean m = this.f25902O.mo34770m();
        g[42] = true;
        return m;
    }

    /* renamed from: b */
    public void mo34814b(Canvas canvas) {
        boolean[] g = m45527g();
        C9756i iVar = this.f25904a;
        PointF a = this.f25901N.mo34763a();
        PointF i = this.f25901N.mo34766i();
        C9747b bVar = this.f25901N;
        g[36] = true;
        PointF j = bVar.mo34767j();
        PointF k = this.f25901N.mo34768k();
        g[37] = true;
        iVar.mo34774a(canvas, a, i, j, k);
        g[38] = true;
    }

    /* renamed from: a */
    public boolean mo34813a(PointF pointF) {
        boolean[] g = m45527g();
        if (this.f25902O.mo34770m()) {
            g[6] = true;
            boolean a = this.f25904a.mo34779a(pointF, this.f25901N);
            g[7] = true;
            return a;
        }
        g[8] = true;
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo34808a(Canvas canvas) {
        boolean[] g = m45527g();
        if (!this.f25902O.mo34770m()) {
            g[9] = true;
        } else {
            g[10] = true;
            canvas.save();
            g[11] = true;
            this.f25904a.mo34775a(canvas, this.f25901N, this.f25902O);
            g[12] = true;
            canvas.restore();
            g[13] = true;
        }
        g[14] = true;
    }

    /* renamed from: a */
    public void mo34806a() {
        boolean[] g = m45527g();
        m45526c(new C9747b(this.f25901N));
        g[21] = true;
    }

    /* renamed from: a */
    public void mo34812a(boolean z) {
        boolean[] g = m45527g();
        C9747b bVar = new C9747b(this.f25901N);
        g[22] = true;
        bVar.mo34765a(z);
        g[23] = true;
        m45526c(bVar);
        g[24] = true;
    }

    /* renamed from: a */
    public void mo34807a(int i, int i2) {
        boolean[] g = m45527g();
        this.f25904a.mo34777a(this.f25901N, this.f25902O, i, i2);
        g[32] = true;
    }

    /* renamed from: a */
    public void mo34809a(Canvas canvas, C9758c... cVarArr) {
        boolean[] g = m45527g();
        this.f25904a.mo34776a(canvas, this.f25901N, cVarArr);
        g[35] = true;
    }

    /* renamed from: a */
    public void mo34810a(C9756i iVar, C9747b bVar) {
        boolean[] g = m45527g();
        m45526c(new C9747b(bVar));
        this.f25904a = iVar;
        if (!(iVar instanceof C9750c)) {
            g[39] = true;
        } else {
            this.f25901N = bVar;
            g[40] = true;
        }
        g[41] = true;
    }
}
