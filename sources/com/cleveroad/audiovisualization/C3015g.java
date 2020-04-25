package com.cleveroad.audiovisualization;

import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;

/* renamed from: com.cleveroad.audiovisualization.g */
/* compiled from: GLRectangle */
class C3015g extends C3017i {

    /* renamed from: j */
    private final FloatBuffer f10690j;

    /* renamed from: k */
    private final ShortBuffer f10691k;

    public C3015g(float[] fArr, float f, float f2, float f3, float f4) {
        super(fArr);
        float[] fArr2 = {C3023n.m14439c(-1.0f, f, f2), C3023n.m14439c(1.0f, f3, f4), 0.0f, C3023n.m14439c(-1.0f, f, f2), C3023n.m14439c(-1.0f, f3, f4), 0.0f, C3023n.m14439c(1.0f, f, f2), C3023n.m14439c(-1.0f, f3, f4), 0.0f, C3023n.m14439c(1.0f, f, f2), C3023n.m14439c(1.0f, f3, f4), 0.0f};
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(fArr2.length * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f10690j = allocateDirect.asFloatBuffer();
        this.f10690j.put(fArr2);
        this.f10690j.position(0);
        short[] sArr = {0, 1, 2, 0, 2, 3};
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(sArr.length * 2);
        allocateDirect2.order(ByteOrder.nativeOrder());
        this.f10691k = allocateDirect2.asShortBuffer();
        this.f10691k.put(sArr);
        this.f10691k.position(0);
    }

    /* renamed from: c */
    public void mo11869c() {
        GLES20.glUseProgram(mo11877b());
        int glGetAttribLocation = GLES20.glGetAttribLocation(mo11877b(), "vPosition");
        GLES20.glEnableVertexAttribArray(glGetAttribLocation);
        GLES20.glVertexAttribPointer(glGetAttribLocation, 3, 5126, false, 12, this.f10690j);
        GLES20.glUniform4fv(GLES20.glGetUniformLocation(mo11877b(), "vColor"), 1, mo11876a(), 0);
        GLES20.glDrawElements(6, this.f10691k.capacity(), 5123, this.f10691k);
        GLES20.glDisableVertexAttribArray(glGetAttribLocation);
    }
}
