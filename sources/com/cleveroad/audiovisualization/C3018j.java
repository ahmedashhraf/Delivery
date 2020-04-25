package com.cleveroad.audiovisualization;

import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.Random;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

/* renamed from: com.cleveroad.audiovisualization.j */
/* compiled from: GLWave */
class C3018j extends C3017i {

    /* renamed from: A */
    private static final int f10711A = 5;

    /* renamed from: B */
    private static final int f10712B = (((int) Math.ceil(2.5d)) * 3);

    /* renamed from: w */
    public static final byte f10713w = 0;

    /* renamed from: x */
    public static final byte f10714x = 1;

    /* renamed from: y */
    private static final float f10715y = 0.35f;

    /* renamed from: z */
    private static final int f10716z = 40;

    /* renamed from: j */
    private FloatBuffer f10717j;

    /* renamed from: k */
    private ShortBuffer f10718k;

    /* renamed from: l */
    private final Random f10719l;

    /* renamed from: m */
    private final float f10720m;

    /* renamed from: n */
    private final float f10721n;

    /* renamed from: o */
    private final float f10722o;

    /* renamed from: p */
    private final float f10723p;

    /* renamed from: q */
    private float[] f10724q;

    /* renamed from: r */
    private float f10725r;

    /* renamed from: s */
    private float f10726s;

    /* renamed from: t */
    private float f10727t;

    /* renamed from: u */
    private float f10728u;

    /* renamed from: v */
    float f10729v = 0.0f;

    public C3018j(float[] fArr, float f, float f2, float f3, float f4, byte b, Random random) {
        super(fArr);
        float f5 = 0.0f;
        this.f10720m = f;
        this.f10721n = f2;
        this.f10722o = f3;
        this.f10723p = f4;
        this.f10719l = random;
        if (b != 0) {
            f5 = 3.1415927f;
        }
        this.f10725r = f5;
        m14402f();
        m14401e();
    }

    /* renamed from: e */
    private void m14401e() {
        short[] sArr = new short[C13959t.f40835R1];
        int i = 0;
        while (i < sArr.length / 3) {
            int i2 = i * 3;
            sArr[i2] = 0;
            int i3 = i + 1;
            sArr[i2 + 1] = (short) i3;
            sArr[i2 + 2] = (short) (i + 2);
            i = i3;
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(sArr.length * 2);
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f10718k = allocateDirect.asShortBuffer();
        this.f10718k.put(sArr);
        this.f10718k.position(0);
    }

    /* renamed from: f */
    private void m14402f() {
        this.f10724q = new float[C13959t.f40859X1];
        this.f10724q[0] = C3023n.m14439c(0.0f, this.f10720m, this.f10721n);
        this.f10724q[1] = C3023n.m14439c(-1.0f, this.f10722o, this.f10723p);
        this.f10724q[3] = C3023n.m14439c(-1.0f, this.f10720m, this.f10721n);
        this.f10724q[4] = C3023n.m14439c(-1.0f, this.f10722o, this.f10723p);
        float[] fArr = this.f10724q;
        fArr[6] = fArr[3];
        fArr[7] = C3023n.m14439c(0.0f, this.f10722o, this.f10723p);
        float[] fArr2 = this.f10724q;
        fArr2[fArr2.length - 6] = C3023n.m14439c(1.0f, this.f10720m, this.f10721n);
        float[] fArr3 = this.f10724q;
        fArr3[fArr3.length - 5] = fArr3[7];
        fArr3[fArr3.length - 3] = fArr3[fArr3.length - 6];
        fArr3[fArr3.length - 2] = fArr3[4];
    }

    /* renamed from: a */
    public void mo11878a(float f) {
        this.f10727t = f;
    }

    /* renamed from: b */
    public void mo11879b(float f) {
        int i = 0;
        if (this.f10717j == null) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.f10724q.length * 4);
            allocateDirect.order(ByteOrder.nativeOrder());
            this.f10717j = allocateDirect.asFloatBuffer();
            this.f10717j.put(this.f10724q);
            this.f10717j.position(0);
        }
        float f2 = this.f10725r + f;
        this.f10725r = f2;
        float f3 = 0.0f;
        if (this.f10726s == 0.0f) {
            float f4 = this.f10727t;
            if (f4 > 0.0f) {
                this.f10726s = C3023n.m14440d(0.0f, f4, f10715y);
            }
        }
        float sin = ((float) Math.sin((double) f2)) * this.f10726s;
        if ((this.f10728u > 0.0f && sin <= 0.0f) || (this.f10728u < 0.0f && sin >= 0.0f)) {
            this.f10726s = C3023n.m14440d(this.f10726s, this.f10727t, f10715y);
            this.f10729v = this.f10719l.nextFloat() * 0.3f * ((float) (this.f10719l.nextBoolean() ? 1 : -1));
        }
        this.f10728u = sin;
        float c = C3023n.m14439c(this.f10729v, this.f10720m, this.f10721n);
        float c2 = C3023n.m14439c(sin, this.f10722o, this.f10723p);
        while (true) {
            double d = (double) f3;
            if (d < 0.9875d) {
                float[] fArr = this.f10724q;
                int i2 = i * 3;
                int i3 = i2 + 1;
                int i4 = f10712B;
                fArr[i3 + i4] = f2;
                this.f10717j.put(i2 + i4, C3023n.m14429a(f3, fArr[6], c, fArr[fArr.length - 6]));
                FloatBuffer floatBuffer = this.f10717j;
                int i5 = i3 + f10712B;
                float[] fArr2 = this.f10724q;
                floatBuffer.put(i5, C3023n.m14429a(f3, fArr2[7], c2, fArr2[fArr2.length - 5]));
                i++;
                Double.isNaN(d);
                f3 = (float) (d + 0.025d);
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public void mo11880c() {
        GLES20.glUseProgram(mo11877b());
        int glGetAttribLocation = GLES20.glGetAttribLocation(mo11877b(), "vPosition");
        GLES20.glEnableVertexAttribArray(glGetAttribLocation);
        GLES20.glVertexAttribPointer(glGetAttribLocation, 3, 5126, false, 12, this.f10717j);
        GLES20.glUniform4fv(GLES20.glGetUniformLocation(mo11877b(), "vColor"), 1, mo11876a(), 0);
        GLES20.glDrawElements(6, this.f10718k.capacity(), 5123, this.f10718k);
        GLES20.glDisableVertexAttribArray(glGetAttribLocation);
    }

    /* renamed from: d */
    public boolean mo11881d() {
        return Math.abs(this.f10728u) < 0.001f;
    }
}
