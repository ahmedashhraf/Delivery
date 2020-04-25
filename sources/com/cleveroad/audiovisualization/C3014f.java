package com.cleveroad.audiovisualization;

import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.Random;

/* renamed from: com.cleveroad.audiovisualization.f */
/* compiled from: GLBubble */
class C3014f extends C3017i {

    /* renamed from: t */
    private static final long f10676t = 1000;

    /* renamed from: u */
    private static final float f10677u = 0.0062831854f;

    /* renamed from: v */
    private static final int f10678v = 40;

    /* renamed from: w */
    private static final float f10679w = 1.0f;

    /* renamed from: j */
    private final FloatBuffer f10680j;

    /* renamed from: k */
    private final ShortBuffer f10681k;

    /* renamed from: l */
    private final Random f10682l;

    /* renamed from: m */
    private float f10683m;

    /* renamed from: n */
    private float f10684n;

    /* renamed from: o */
    private float f10685o;

    /* renamed from: p */
    private float f10686p;

    /* renamed from: q */
    private float f10687q = -1.0f;

    /* renamed from: r */
    private float f10688r;

    /* renamed from: s */
    private float f10689s;

    public C3014f(float[] fArr, float f, float f2, float f3, float f4, Random random) {
        super(fArr);
        this.f10682l = random;
        mo11865a(f, f2, f3, f4);
        float[] fArr2 = new float[123];
        short[] sArr = new short[120];
        int i = 0;
        while (i < (sArr.length / 3) - 1) {
            int i2 = i * 3;
            sArr[i2] = 0;
            int i3 = i + 1;
            sArr[i2 + 1] = (short) i3;
            sArr[i2 + 2] = (short) (i + 2);
            i = i3;
        }
        int i4 = i * 3;
        sArr[i4] = 0;
        sArr[i4 + 1] = (short) (i + 1);
        sArr[i4 + 2] = 1;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(fArr2.length * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f10680j = allocateDirect.asFloatBuffer();
        this.f10680j.put(fArr2);
        this.f10680j.position(0);
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(sArr.length * 2);
        allocateDirect2.order(ByteOrder.nativeOrder());
        this.f10681k = allocateDirect2.asShortBuffer();
        this.f10681k.put(sArr);
        this.f10681k.position(0);
        double nextFloat = (double) (random.nextFloat() * 2.0f);
        Double.isNaN(nextFloat);
        this.f10689s = (float) (nextFloat * 3.141592653589793d);
    }

    /* renamed from: a */
    public void mo11866a(long j, float f) {
        float f2 = (float) j;
        this.f10689s += f10677u * f2;
        float sin = this.f10688r + ((float) (Math.sin((double) this.f10689s) * 0.05000000074505806d));
        float f3 = this.f10684n;
        float f4 = sin + f3;
        float f5 = this.f10683m + (this.f10685o * f2);
        float f6 = f3 + f5;
        this.f10687q += f2 * this.f10686p;
        mo11876a()[3] = 1.0f - (this.f10687q / 1.0f);
        this.f10680j.put(0, C3023n.m14439c(0.0f, sin, f4));
        this.f10680j.put(1, C3023n.m14439c(this.f10687q * f, f5, f6));
        for (int i = 1; i <= 40; i++) {
            FloatBuffer floatBuffer = this.f10680j;
            int i2 = i * 3;
            double d = (double) i;
            Double.isNaN(d);
            double d2 = (0.15707963267948966d * d) - 1.4292036732051034d;
            floatBuffer.put(i2, C3023n.m14439c((float) Math.sin(d2), sin, f4));
            this.f10680j.put(i2 + 1, C3023n.m14439c(((float) Math.cos(d2)) * f, f5, f6));
        }
        this.f10683m = f5;
    }

    /* renamed from: c */
    public void mo11867c() {
        GLES20.glUseProgram(mo11877b());
        int glGetAttribLocation = GLES20.glGetAttribLocation(mo11877b(), "vPosition");
        GLES20.glEnableVertexAttribArray(glGetAttribLocation);
        GLES20.glVertexAttribPointer(glGetAttribLocation, 3, 5126, false, 12, this.f10680j);
        int glGetUniformLocation = GLES20.glGetUniformLocation(mo11877b(), "vColor");
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(770, 771);
        GLES20.glUniform4fv(glGetUniformLocation, 1, mo11876a(), 0);
        GLES20.glDrawElements(6, this.f10681k.capacity(), 5123, this.f10681k);
        GLES20.glDisableVertexAttribArray(glGetAttribLocation);
        GLES20.glDisable(3042);
    }

    /* renamed from: d */
    public boolean mo11868d() {
        return this.f10687q > 1.0f;
    }

    /* renamed from: a */
    public void mo11865a(float f, float f2, float f3, float f4) {
        this.f10683m = f2;
        this.f10684n = f4;
        this.f10688r = f;
        this.f10687q = -1.0f;
        float nextFloat = (this.f10682l.nextFloat() * 0.8f) + 0.4f;
        this.f10685o = ((f3 - f2) / 1000.0f) * nextFloat;
        this.f10686p = nextFloat * 0.002f;
        mo11876a()[3] = 1.0f;
    }
}
