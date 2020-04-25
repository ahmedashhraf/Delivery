package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.media.ExifInterface;
import android.os.Build.VERSION;
import android.util.Log;
import com.facebook.imagepipeline.common.RotationOptions;
import p053b.p063d.p064b.C2108a;
import p076c.p082c.p083a.p088u.p090i.p091n.C2330c;

/* renamed from: com.bumptech.glide.load.resource.bitmap.q */
/* compiled from: TransformationUtils */
public final class C2980q {

    /* renamed from: a */
    private static final String f10544a = "TransformationUtils";

    /* renamed from: b */
    public static final int f10545b = 6;

    private C2980q() {
    }

    /* renamed from: a */
    public static int m14240a(int i) {
        switch (i) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return RotationOptions.ROTATE_270;
            default:
                return 0;
        }
    }

    /* renamed from: a */
    public static Bitmap m14244a(Bitmap bitmap, Bitmap bitmap2, int i, int i2) {
        float f;
        float f2;
        if (bitmap2 == null) {
            return null;
        }
        if (bitmap2.getWidth() == i && bitmap2.getHeight() == i2) {
            return bitmap2;
        }
        Matrix matrix = new Matrix();
        float f3 = 0.0f;
        if (bitmap2.getWidth() * i2 > bitmap2.getHeight() * i) {
            f2 = ((float) i2) / ((float) bitmap2.getHeight());
            f = (((float) i) - (((float) bitmap2.getWidth()) * f2)) * 0.5f;
        } else {
            f2 = ((float) i) / ((float) bitmap2.getWidth());
            f3 = (((float) i2) - (((float) bitmap2.getHeight()) * f2)) * 0.5f;
            f = 0.0f;
        }
        matrix.setScale(f2, f2);
        matrix.postTranslate((float) ((int) (f + 0.5f)), (float) ((int) (f3 + 0.5f)));
        if (bitmap == null) {
            bitmap = Bitmap.createBitmap(i, i2, m14242a(bitmap2));
        }
        m14249a(bitmap2, bitmap);
        new Canvas(bitmap).drawBitmap(bitmap2, matrix, new Paint(6));
        return bitmap;
    }

    /* renamed from: a */
    public static Bitmap m14246a(Bitmap bitmap, C2330c cVar, int i, int i2) {
        int width = bitmap.getWidth();
        String str = f10544a;
        if (width == i && bitmap.getHeight() == i2) {
            boolean isLoggable = Log.isLoggable(str, 2);
            return bitmap;
        }
        float min = Math.min(((float) i) / ((float) bitmap.getWidth()), ((float) i2) / ((float) bitmap.getHeight()));
        int width2 = (int) (((float) bitmap.getWidth()) * min);
        int height = (int) (((float) bitmap.getHeight()) * min);
        if (bitmap.getWidth() == width2 && bitmap.getHeight() == height) {
            boolean isLoggable2 = Log.isLoggable(str, 2);
            return bitmap;
        }
        Config a = m14242a(bitmap);
        Bitmap a2 = cVar.mo9731a(width2, height, a);
        if (a2 == null) {
            a2 = Bitmap.createBitmap(width2, height, a);
        }
        m14249a(bitmap, a2);
        if (Log.isLoggable(str, 2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("request: ");
            sb.append(i);
            String str2 = "x";
            sb.append(str2);
            sb.append(i2);
            sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("toFit:   ");
            sb2.append(bitmap.getWidth());
            sb2.append(str2);
            sb2.append(bitmap.getHeight());
            sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("toReuse: ");
            sb3.append(a2.getWidth());
            sb3.append(str2);
            sb3.append(a2.getHeight());
            sb3.toString();
            StringBuilder sb4 = new StringBuilder();
            sb4.append("minPct:   ");
            sb4.append(min);
            sb4.toString();
        }
        Canvas canvas = new Canvas(a2);
        Matrix matrix = new Matrix();
        matrix.setScale(min, min);
        canvas.drawBitmap(bitmap, matrix, new Paint(6));
        return a2;
    }

    @TargetApi(12)
    /* renamed from: a */
    public static void m14249a(Bitmap bitmap, Bitmap bitmap2) {
        if (VERSION.SDK_INT >= 12 && bitmap2 != null) {
            bitmap2.setHasAlpha(bitmap.hasAlpha());
        }
    }

    @TargetApi(5)
    @Deprecated
    /* renamed from: a */
    public static int m14241a(String str) {
        try {
            return m14240a(new ExifInterface(str).getAttributeInt(C2108a.f8392y, 0));
        } catch (Exception unused) {
            if (Log.isLoggable(f10544a, 6)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to get orientation for image with path=");
                sb.append(str);
                sb.toString();
            }
            return 0;
        }
    }

    @Deprecated
    /* renamed from: a */
    public static Bitmap m14247a(String str, Bitmap bitmap) {
        return m14243a(bitmap, m14241a(str));
    }

    /* renamed from: a */
    public static Bitmap m14243a(Bitmap bitmap, int i) {
        if (i == 0) {
            return bitmap;
        }
        try {
            Matrix matrix = new Matrix();
            matrix.setRotate((float) i);
            return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        } catch (Exception unused) {
            boolean isLoggable = Log.isLoggable(f10544a, 6);
            return bitmap;
        }
    }

    /* renamed from: a */
    public static Bitmap m14245a(Bitmap bitmap, C2330c cVar, int i) {
        Matrix matrix = new Matrix();
        m14248a(i, matrix);
        if (matrix.isIdentity()) {
            return bitmap;
        }
        RectF rectF = new RectF(0.0f, 0.0f, (float) bitmap.getWidth(), (float) bitmap.getHeight());
        matrix.mapRect(rectF);
        int round = Math.round(rectF.width());
        int round2 = Math.round(rectF.height());
        Config a = m14242a(bitmap);
        Bitmap a2 = cVar.mo9731a(round, round2, a);
        if (a2 == null) {
            a2 = Bitmap.createBitmap(round, round2, a);
        }
        matrix.postTranslate(-rectF.left, -rectF.top);
        new Canvas(a2).drawBitmap(bitmap, matrix, new Paint(6));
        return a2;
    }

    /* renamed from: a */
    private static Config m14242a(Bitmap bitmap) {
        return bitmap.getConfig() != null ? bitmap.getConfig() : Config.ARGB_8888;
    }

    /* renamed from: a */
    static void m14248a(int i, Matrix matrix) {
        switch (i) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                return;
            case 3:
                matrix.setRotate(180.0f);
                return;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 6:
                matrix.setRotate(90.0f);
                return;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 8:
                matrix.setRotate(-90.0f);
                return;
            default:
                return;
        }
    }
}
