package com.cleveroad.audiovisualization;

import android.content.Context;
import android.opengl.GLES20;
import androidx.annotation.C0193h0;
import com.cleveroad.audiovisualization.C3005e.C3007b;
import com.cleveroad.audiovisualization.C3005e.C3009d;
import com.cleveroad.audiovisualization.C3020l.C3021a;
import java.util.Random;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.cleveroad.audiovisualization.h */
/* compiled from: GLRenderer */
class C3016h implements C3007b {

    /* renamed from: i */
    private static final long f10692i = 400;

    /* renamed from: j */
    private static final float f10693j = 0.015707964f;

    /* renamed from: a */
    private final C3010e f10694a;

    /* renamed from: b */
    private C3019k[] f10695b;

    /* renamed from: c */
    private long f10696c;

    /* renamed from: d */
    private final float f10697d;

    /* renamed from: e */
    private final Random f10698e;

    /* renamed from: f */
    private float f10699f = 1.0f;

    /* renamed from: g */
    private C3021a f10700g;

    /* renamed from: h */
    boolean f10701h;

    public C3016h(@C0193h0 Context context, C3010e eVar) {
        this.f10694a = eVar;
        this.f10698e = new Random();
        this.f10696c = System.currentTimeMillis();
        this.f10697d = (float) context.getResources().getDisplayMetrics().heightPixels;
    }

    /* renamed from: a */
    public C3016h mo11870a(C3021a aVar) {
        this.f10700g = aVar;
        return this;
    }

    public void onDrawFrame(GL10 gl10) {
        C3019k[] kVarArr;
        if (this.f10701h) {
            float[] fArr = this.f10694a.f10667h;
            GLES20.glClearColor(fArr[0], fArr[1], fArr[2], fArr[3]);
            this.f10701h = false;
        } else {
            GLES20.glClear(16640);
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - this.f10696c;
        this.f10696c = currentTimeMillis;
        int i = 0;
        boolean z = true;
        for (C3019k kVar : this.f10695b) {
            kVar.mo11884a(j, (1.0f - (((((float) i) * 1.0f) / ((float) this.f10695b.length)) * 0.8f)) * f10693j, this.f10699f);
            z &= kVar.mo11886b();
            i++;
        }
        for (C3019k a : this.f10695b) {
            a.mo11882a();
        }
        if (z) {
            C3021a aVar = this.f10700g;
            if (aVar != null) {
                aVar.mo11838a();
            }
        }
    }

    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        GLES20.glViewport(0, 0, i, i2);
        this.f10699f = ((float) i) / ((float) i2);
    }

    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        float[] fArr = this.f10694a.f10667h;
        int i = 0;
        GLES20.glClearColor(fArr[0], fArr[1], fArr[2], fArr[3]);
        C3010e eVar = this.f10694a;
        this.f10695b = new C3019k[eVar.f10661b];
        float f = eVar.f10665f;
        float f2 = eVar.f10664e;
        float f3 = f + f2;
        float f4 = this.f10697d;
        float f5 = f3 / f4;
        float f6 = (f2 / f4) * 2.0f;
        while (true) {
            C3019k[] kVarArr = this.f10695b;
            if (i < kVarArr.length) {
                float length = ((((float) ((kVarArr.length - i) - 1)) * f6) * 2.0f) - 4.0f;
                float f7 = length + (f5 * 2.0f);
                C3010e eVar2 = this.f10694a;
                C3019k kVar = new C3019k(eVar2, eVar2.f10668i[i], length, f7, this.f10698e);
                kVarArr[i] = kVar;
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final void mo11871a(float[] fArr, float[] fArr2) {
        if (this.f10695b != null) {
            int i = 0;
            while (true) {
                C3019k[] kVarArr = this.f10695b;
                if (i < kVarArr.length && kVarArr[i] != null) {
                    kVarArr[i].mo11883a(fArr[i], fArr2[i]);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public static int m14394a(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        return glCreateShader;
    }

    /* renamed from: a */
    public void mo11843a(@C0193h0 C3009d dVar) {
        float[] fArr = this.f10694a.f10667h;
        float[] a = dVar.mo11858a();
        int i = 0;
        this.f10701h = false;
        for (int i2 = 0; i2 < 4; i2++) {
            this.f10701h |= Float.compare(fArr[i2], a[i2]) != 0;
        }
        if (this.f10701h) {
            this.f10694a.f10667h = dVar.mo11858a();
        }
        if (this.f10695b != null) {
            float[][] c = dVar.mo11861c();
            while (true) {
                C3019k[] kVarArr = this.f10695b;
                if (i < kVarArr.length) {
                    kVarArr[i].mo11885a(c[i]);
                    i++;
                } else {
                    return;
                }
            }
        }
    }
}
