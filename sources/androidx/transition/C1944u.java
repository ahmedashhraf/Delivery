package androidx.transition;

import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.RectF;

/* renamed from: androidx.transition.u */
/* compiled from: MatrixUtils */
class C1944u {

    /* renamed from: a */
    static final Matrix f7464a = new C1945a();

    /* renamed from: androidx.transition.u$a */
    /* compiled from: MatrixUtils */
    static class C1945a extends Matrix {
        C1945a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo8457a() {
            throw new IllegalStateException("Matrix can not be modified");
        }

        public boolean postConcat(Matrix matrix) {
            mo8457a();
            return false;
        }

        public boolean postRotate(float f, float f2, float f3) {
            mo8457a();
            return false;
        }

        public boolean postScale(float f, float f2, float f3, float f4) {
            mo8457a();
            return false;
        }

        public boolean postSkew(float f, float f2, float f3, float f4) {
            mo8457a();
            return false;
        }

        public boolean postTranslate(float f, float f2) {
            mo8457a();
            return false;
        }

        public boolean preConcat(Matrix matrix) {
            mo8457a();
            return false;
        }

        public boolean preRotate(float f, float f2, float f3) {
            mo8457a();
            return false;
        }

        public boolean preScale(float f, float f2, float f3, float f4) {
            mo8457a();
            return false;
        }

        public boolean preSkew(float f, float f2, float f3, float f4) {
            mo8457a();
            return false;
        }

        public boolean preTranslate(float f, float f2) {
            mo8457a();
            return false;
        }

        public void reset() {
            mo8457a();
        }

        public void set(Matrix matrix) {
            mo8457a();
        }

        public boolean setConcat(Matrix matrix, Matrix matrix2) {
            mo8457a();
            return false;
        }

        public boolean setPolyToPoly(float[] fArr, int i, float[] fArr2, int i2, int i3) {
            mo8457a();
            return false;
        }

        public boolean setRectToRect(RectF rectF, RectF rectF2, ScaleToFit scaleToFit) {
            mo8457a();
            return false;
        }

        public void setRotate(float f, float f2, float f3) {
            mo8457a();
        }

        public void setScale(float f, float f2, float f3, float f4) {
            mo8457a();
        }

        public void setSinCos(float f, float f2, float f3, float f4) {
            mo8457a();
        }

        public void setSkew(float f, float f2, float f3, float f4) {
            mo8457a();
        }

        public void setTranslate(float f, float f2) {
            mo8457a();
        }

        public void setValues(float[] fArr) {
            mo8457a();
        }

        public boolean postRotate(float f) {
            mo8457a();
            return false;
        }

        public boolean postScale(float f, float f2) {
            mo8457a();
            return false;
        }

        public boolean postSkew(float f, float f2) {
            mo8457a();
            return false;
        }

        public boolean preRotate(float f) {
            mo8457a();
            return false;
        }

        public boolean preScale(float f, float f2) {
            mo8457a();
            return false;
        }

        public boolean preSkew(float f, float f2) {
            mo8457a();
            return false;
        }

        public void setRotate(float f) {
            mo8457a();
        }

        public void setScale(float f, float f2) {
            mo8457a();
        }

        public void setSinCos(float f, float f2) {
            mo8457a();
        }

        public void setSkew(float f, float f2) {
            mo8457a();
        }
    }

    private C1944u() {
    }
}
