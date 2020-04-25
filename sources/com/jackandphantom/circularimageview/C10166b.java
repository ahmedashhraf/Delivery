package com.jackandphantom.circularimageview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.os.AsyncTask;

/* renamed from: com.jackandphantom.circularimageview.b */
/* compiled from: ImageCompress */
class C10166b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C10168b f27088a;

    /* renamed from: b */
    Context f27089b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Bitmap f27090c;

    /* renamed from: com.jackandphantom.circularimageview.b$a */
    /* compiled from: ImageCompress */
    private class C10167a extends AsyncTask<Void, Void, Void> {

        /* renamed from: c */
        private static final float f27091c = 1280.0f;

        /* renamed from: d */
        private static final float f27092d = 1280.0f;

        /* renamed from: a */
        private String f27093a;

        public C10167a(String str) {
            this.f27093a = str;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            if (m47239a() != null) {
                C10166b.this.f27090c = m47239a();
            }
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Void voidR) {
            super.onPostExecute(voidR);
            if (C10166b.this.f27088a != null) {
                C10166b.this.f27088a.mo36392a(C10166b.this.f27090c);
            }
        }

        /* renamed from: a */
        private Bitmap m47239a() {
            Bitmap bitmap;
            Options options = new Options();
            options.inJustDecodeBounds = true;
            Bitmap decodeFile = BitmapFactory.decodeFile(this.f27093a, options);
            int i = options.outHeight;
            int i2 = options.outWidth;
            float f = (float) i2;
            float f2 = (float) i;
            float f3 = f / f2;
            if (f2 > 1280.0f || f > 1280.0f) {
                if (f3 < 1.0f) {
                    i2 = (int) ((1280.0f / f2) * f);
                    i = 1280;
                } else {
                    i = f3 > 1.0f ? (int) ((1280.0f / f) * f2) : 1280;
                    i2 = 1280;
                }
            }
            options.inSampleSize = m47238a(options, i2, i);
            options.inJustDecodeBounds = false;
            options.inDither = false;
            options.inPurgeable = true;
            options.inTempStorage = new byte[16384];
            try {
                decodeFile = BitmapFactory.decodeFile(this.f27093a, options);
            } catch (OutOfMemoryError e) {
                e.printStackTrace();
            }
            try {
                bitmap = Bitmap.createBitmap(i2, i, Config.RGB_565);
            } catch (OutOfMemoryError e2) {
                e2.printStackTrace();
                bitmap = null;
            }
            float f4 = (float) i2;
            float f5 = f4 / ((float) options.outWidth);
            float f6 = (float) i;
            float f7 = f6 / ((float) options.outHeight);
            float f8 = f4 / 2.0f;
            float f9 = f6 / 2.0f;
            Matrix matrix = new Matrix();
            matrix.setScale(f5, f7, f8, f9);
            Canvas canvas = new Canvas(bitmap);
            canvas.setMatrix(matrix);
            canvas.drawBitmap(decodeFile, f8 - ((float) (decodeFile.getWidth() / 2)), f9 - ((float) (decodeFile.getHeight() / 2)), new Paint(2));
            decodeFile.recycle();
            return bitmap;
        }

        /* renamed from: a */
        private int m47238a(Options options, int i, int i2) {
            int i3;
            int i4 = options.outHeight;
            int i5 = options.outWidth;
            if (i4 > i2 || i5 > i) {
                i3 = Math.round(((float) i5) / ((float) i));
                int round = Math.round(((float) i4) / ((float) i2));
                if (round < i3) {
                    i3 = round;
                }
            } else {
                i3 = 1;
            }
            while (((float) (i5 * i4)) / ((float) (i3 * i3)) > ((float) (i2 * i * 2))) {
                i3++;
            }
            return i3;
        }
    }

    /* renamed from: com.jackandphantom.circularimageview.b$b */
    /* compiled from: ImageCompress */
    interface C10168b {
        /* renamed from: a */
        void mo36392a(Bitmap bitmap);
    }

    public C10166b(Context context) {
        this.f27089b = context;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Bitmap mo36397a(String str) {
        new C10167a(str).execute(new Void[0]);
        return this.f27090c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36398a(C10168b bVar) {
        this.f27088a = bVar;
    }
}
