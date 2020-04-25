package com.instabug.library.annotation.p380a;

import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.Path;
import android.graphics.RectF;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.annotation.a.f */
/* compiled from: Utility */
public class C9744f {

    /* renamed from: a */
    private static final RectF f25834a = new RectF(0.0f, 0.0f, 28.0f, 28.0f);

    /* renamed from: b */
    private static transient /* synthetic */ boolean[] f25835b;

    static {
        boolean[] a = m45404a();
        a[12] = true;
    }

    /* renamed from: a */
    public static Path m45402a(Path path) {
        boolean[] a = m45404a();
        Path path2 = new Path(path);
        a[1] = true;
        RectF rectF = new RectF();
        a[2] = true;
        path2.computeBounds(rectF, true);
        a[3] = true;
        Matrix matrix = new Matrix();
        a[4] = true;
        matrix.setRectToRect(rectF, f25834a, ScaleToFit.CENTER);
        a[5] = true;
        path2.transform(matrix);
        a[6] = true;
        return path2;
    }

    /* renamed from: a */
    private static /* synthetic */ boolean[] m45404a() {
        boolean[] zArr = f25835b;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-1584481810118747054L, "com/instabug/library/annotation/recognition/Utility", 13);
        f25835b = a;
        return a;
    }

    /* renamed from: a */
    public static Path m45403a(Path path, int i) {
        boolean[] a = m45404a();
        Path path2 = new Path(path);
        a[7] = true;
        Matrix matrix = new Matrix();
        a[8] = true;
        matrix.postRotate((float) i, 14.0f, 14.0f);
        a[9] = true;
        path2.transform(matrix);
        a[10] = true;
        Path a2 = m45402a(path2);
        a[11] = true;
        return a2;
    }
}
