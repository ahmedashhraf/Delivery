package com.cleveroad.audiovisualization;

import android.opengl.GLES20;

/* renamed from: com.cleveroad.audiovisualization.i */
/* compiled from: GLShape */
abstract class C3017i {

    /* renamed from: c */
    protected static final String f10702c = "vPosition";

    /* renamed from: d */
    protected static final String f10703d = "vColor";

    /* renamed from: e */
    private static final String f10704e = "attribute vec4 vPosition;void main() {  gl_Position = vPosition;}";

    /* renamed from: f */
    private static final String f10705f = "precision mediump float;uniform vec4 vColor;void main() {  gl_FragColor = vColor;}";

    /* renamed from: g */
    protected static final int f10706g = 3;

    /* renamed from: h */
    protected static final int f10707h = 4;

    /* renamed from: i */
    protected static final int f10708i = 2;

    /* renamed from: a */
    private final float[] f10709a;

    /* renamed from: b */
    private final int f10710b = GLES20.glCreateProgram();

    public C3017i(float[] fArr) {
        this.f10709a = fArr;
        int a = C3016h.m14394a(35633, f10704e);
        int a2 = C3016h.m14394a(35632, f10705f);
        GLES20.glAttachShader(this.f10710b, a);
        GLES20.glAttachShader(this.f10710b, a2);
        GLES20.glLinkProgram(this.f10710b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public float[] mo11876a() {
        return this.f10709a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo11877b() {
        return this.f10710b;
    }

    /* renamed from: a */
    public void mo11875a(float[] fArr) {
        float[] fArr2 = this.f10709a;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
    }
}
