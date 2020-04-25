package com.theartofdev.edmodo.cropper;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.DisplayMetrics;
import java.lang.ref.WeakReference;

/* renamed from: com.theartofdev.edmodo.cropper.b */
/* compiled from: BitmapLoadingWorkerTask */
final class C12081b extends AsyncTask<Void, Void, C12082a> {

    /* renamed from: a */
    private final WeakReference<CropImageView> f34935a;

    /* renamed from: b */
    private final Uri f34936b;

    /* renamed from: c */
    private final Context f34937c;

    /* renamed from: d */
    private final int f34938d;

    /* renamed from: e */
    private final int f34939e;

    /* renamed from: com.theartofdev.edmodo.cropper.b$a */
    /* compiled from: BitmapLoadingWorkerTask */
    public static final class C12082a {

        /* renamed from: a */
        public final Uri f34940a;

        /* renamed from: b */
        public final Bitmap f34941b;

        /* renamed from: c */
        public final int f34942c;

        /* renamed from: d */
        public final int f34943d;

        /* renamed from: e */
        public final Exception f34944e;

        C12082a(Uri uri, Bitmap bitmap, int i, int i2) {
            this.f34940a = uri;
            this.f34941b = bitmap;
            this.f34942c = i;
            this.f34943d = i2;
            this.f34944e = null;
        }

        C12082a(Uri uri, Exception exc) {
            this.f34940a = uri;
            this.f34941b = null;
            this.f34942c = 0;
            this.f34943d = 0;
            this.f34944e = exc;
        }
    }

    public C12081b(CropImageView cropImageView, Uri uri) {
        this.f34936b = uri;
        this.f34935a = new WeakReference<>(cropImageView);
        this.f34937c = cropImageView.getContext();
        DisplayMetrics displayMetrics = cropImageView.getResources().getDisplayMetrics();
        float f = displayMetrics.density;
        double d = f > 1.0f ? (double) (1.0f / f) : 1.0d;
        double d2 = (double) displayMetrics.widthPixels;
        Double.isNaN(d2);
        this.f34938d = (int) (d2 * d);
        double d3 = (double) displayMetrics.heightPixels;
        Double.isNaN(d3);
        this.f34939e = (int) (d3 * d);
    }

    /* renamed from: a */
    public Uri mo41408a() {
        return this.f34936b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C12082a doInBackground(Void... voidArr) {
        try {
            if (!isCancelled()) {
                C12084a a = C12083c.m54608a(this.f34937c, this.f34936b, this.f34938d, this.f34939e);
                if (!isCancelled()) {
                    C12085b a2 = C12083c.m54614a(a.f34952a, this.f34937c, this.f34936b);
                    return new C12082a(this.f34936b, a2.f34954a, a.f34953b, a2.f34955b);
                }
            }
            return null;
        } catch (Exception e) {
            return new C12082a(this.f34936b, e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(C12082a aVar) {
        if (aVar != null) {
            boolean z = false;
            if (!isCancelled()) {
                CropImageView cropImageView = (CropImageView) this.f34935a.get();
                if (cropImageView != null) {
                    z = true;
                    cropImageView.mo41301a(aVar);
                }
            }
            if (!z) {
                Bitmap bitmap = aVar.f34941b;
                if (bitmap != null) {
                    bitmap.recycle();
                }
            }
        }
    }
}
