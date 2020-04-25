package com.theartofdev.edmodo.cropper;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
import android.os.AsyncTask;
import com.theartofdev.edmodo.cropper.CropImageView.C12069j;
import java.lang.ref.WeakReference;

/* renamed from: com.theartofdev.edmodo.cropper.a */
/* compiled from: BitmapCroppingWorkerTask */
final class C12079a extends AsyncTask<Void, Void, C12080a> {

    /* renamed from: a */
    private final WeakReference<CropImageView> f34911a;

    /* renamed from: b */
    private final Bitmap f34912b;

    /* renamed from: c */
    private final Uri f34913c;

    /* renamed from: d */
    private final Context f34914d;

    /* renamed from: e */
    private final float[] f34915e;

    /* renamed from: f */
    private final int f34916f;

    /* renamed from: g */
    private final int f34917g;

    /* renamed from: h */
    private final int f34918h;

    /* renamed from: i */
    private final boolean f34919i;

    /* renamed from: j */
    private final int f34920j;

    /* renamed from: k */
    private final int f34921k;

    /* renamed from: l */
    private final int f34922l;

    /* renamed from: m */
    private final int f34923m;

    /* renamed from: n */
    private final boolean f34924n;

    /* renamed from: o */
    private final boolean f34925o;

    /* renamed from: p */
    private final C12069j f34926p;

    /* renamed from: q */
    private final Uri f34927q;

    /* renamed from: r */
    private final CompressFormat f34928r;

    /* renamed from: s */
    private final int f34929s;

    /* renamed from: com.theartofdev.edmodo.cropper.a$a */
    /* compiled from: BitmapCroppingWorkerTask */
    static final class C12080a {

        /* renamed from: a */
        public final Bitmap f34930a;

        /* renamed from: b */
        public final Uri f34931b;

        /* renamed from: c */
        final Exception f34932c;

        /* renamed from: d */
        final boolean f34933d;

        /* renamed from: e */
        final int f34934e;

        C12080a(Bitmap bitmap, int i) {
            this.f34930a = bitmap;
            this.f34931b = null;
            this.f34932c = null;
            this.f34933d = false;
            this.f34934e = i;
        }

        C12080a(Uri uri, int i) {
            this.f34930a = null;
            this.f34931b = uri;
            this.f34932c = null;
            this.f34933d = true;
            this.f34934e = i;
        }

        C12080a(Exception exc, boolean z) {
            this.f34930a = null;
            this.f34931b = null;
            this.f34932c = exc;
            this.f34933d = z;
            this.f34934e = 1;
        }
    }

    C12079a(CropImageView cropImageView, Bitmap bitmap, float[] fArr, int i, boolean z, int i2, int i3, int i4, int i5, boolean z2, boolean z3, C12069j jVar, Uri uri, CompressFormat compressFormat, int i6) {
        CropImageView cropImageView2 = cropImageView;
        this.f34911a = new WeakReference<>(cropImageView);
        this.f34914d = cropImageView.getContext();
        this.f34912b = bitmap;
        this.f34915e = fArr;
        this.f34913c = null;
        this.f34916f = i;
        this.f34919i = z;
        this.f34920j = i2;
        this.f34921k = i3;
        this.f34922l = i4;
        this.f34923m = i5;
        this.f34924n = z2;
        this.f34925o = z3;
        this.f34926p = jVar;
        this.f34927q = uri;
        this.f34928r = compressFormat;
        this.f34929s = i6;
        this.f34917g = 0;
        this.f34918h = 0;
    }

    /* renamed from: a */
    public Uri mo41403a() {
        return this.f34913c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C12080a doInBackground(Void... voidArr) {
        C12084a aVar;
        boolean z = true;
        try {
            if (isCancelled()) {
                return null;
            }
            if (this.f34913c != null) {
                aVar = C12083c.m54610a(this.f34914d, this.f34913c, this.f34915e, this.f34916f, this.f34917g, this.f34918h, this.f34919i, this.f34920j, this.f34921k, this.f34922l, this.f34923m, this.f34924n, this.f34925o);
            } else if (this.f34912b == null) {
                return new C12080a((Bitmap) null, 1);
            } else {
                aVar = C12083c.m54613a(this.f34912b, this.f34915e, this.f34916f, this.f34919i, this.f34920j, this.f34921k, this.f34924n, this.f34925o);
            }
            Bitmap a = C12083c.m54601a(aVar.f34952a, this.f34922l, this.f34923m, this.f34926p);
            if (this.f34927q == null) {
                return new C12080a(a, aVar.f34953b);
            }
            C12083c.m54616a(this.f34914d, a, this.f34927q, this.f34928r, this.f34929s);
            if (a != null) {
                a.recycle();
            }
            return new C12080a(this.f34927q, aVar.f34953b);
        } catch (Exception e) {
            if (this.f34927q == null) {
                z = false;
            }
            return new C12080a(e, z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(C12080a aVar) {
        if (aVar != null) {
            boolean z = false;
            if (!isCancelled()) {
                CropImageView cropImageView = (CropImageView) this.f34911a.get();
                if (cropImageView != null) {
                    z = true;
                    cropImageView.mo41300a(aVar);
                }
            }
            if (!z) {
                Bitmap bitmap = aVar.f34930a;
                if (bitmap != null) {
                    bitmap.recycle();
                }
            }
        }
    }

    C12079a(CropImageView cropImageView, Uri uri, float[] fArr, int i, int i2, int i3, boolean z, int i4, int i5, int i6, int i7, boolean z2, boolean z3, C12069j jVar, Uri uri2, CompressFormat compressFormat, int i8) {
        CropImageView cropImageView2 = cropImageView;
        this.f34911a = new WeakReference<>(cropImageView);
        this.f34914d = cropImageView.getContext();
        this.f34913c = uri;
        this.f34915e = fArr;
        this.f34916f = i;
        this.f34919i = z;
        this.f34920j = i4;
        this.f34921k = i5;
        this.f34917g = i2;
        this.f34918h = i3;
        this.f34922l = i6;
        this.f34923m = i7;
        this.f34924n = z2;
        this.f34925o = z3;
        this.f34926p = jVar;
        this.f34927q = uri2;
        this.f34928r = compressFormat;
        this.f34929s = i8;
        this.f34912b = null;
    }
}
