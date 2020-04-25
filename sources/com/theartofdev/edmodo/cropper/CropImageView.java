package com.theartofdev.edmodo.cropper;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.ProgressBar;
import com.theartofdev.edmodo.cropper.C12081b.C12082a;
import com.theartofdev.edmodo.cropper.CropOverlayView.C12072b;
import java.lang.ref.WeakReference;
import java.util.UUID;
import p053b.p063d.p064b.C2108a;

public class CropImageView extends FrameLayout {

    /* renamed from: N */
    private final Matrix f34829N;

    /* renamed from: O */
    private final Matrix f34830O;

    /* renamed from: P */
    private final ProgressBar f34831P;

    /* renamed from: Q */
    private final float[] f34832Q;

    /* renamed from: R */
    private final float[] f34833R;

    /* renamed from: S */
    private C12087e f34834S;

    /* renamed from: T */
    private Bitmap f34835T;

    /* renamed from: U */
    private int f34836U;

    /* renamed from: V */
    private int f34837V;

    /* renamed from: W */
    private boolean f34838W;

    /* renamed from: a */
    private final ImageView f34839a;

    /* renamed from: a0 */
    private boolean f34840a0;

    /* renamed from: b */
    private final CropOverlayView f34841b;

    /* renamed from: b0 */
    private int f34842b0;

    /* renamed from: c0 */
    private int f34843c0;

    /* renamed from: d0 */
    private int f34844d0;

    /* renamed from: e0 */
    private C12070k f34845e0;

    /* renamed from: f0 */
    private boolean f34846f0;

    /* renamed from: g0 */
    private boolean f34847g0;

    /* renamed from: h0 */
    private boolean f34848h0;

    /* renamed from: i0 */
    private boolean f34849i0;

    /* renamed from: j0 */
    private int f34850j0;
    /* access modifiers changed from: private */

    /* renamed from: k0 */
    public C12066g f34851k0;
    /* access modifiers changed from: private */

    /* renamed from: l0 */
    public C12065f f34852l0;

    /* renamed from: m0 */
    private C12067h f34853m0;

    /* renamed from: n0 */
    private C12068i f34854n0;

    /* renamed from: o0 */
    private C12064e f34855o0;

    /* renamed from: p0 */
    private Uri f34856p0;

    /* renamed from: q0 */
    private int f34857q0;

    /* renamed from: r0 */
    private float f34858r0;

    /* renamed from: s0 */
    private float f34859s0;

    /* renamed from: t0 */
    private float f34860t0;

    /* renamed from: u0 */
    private RectF f34861u0;

    /* renamed from: v0 */
    private int f34862v0;

    /* renamed from: w0 */
    private boolean f34863w0;

    /* renamed from: x0 */
    private Uri f34864x0;

    /* renamed from: y0 */
    private WeakReference<C12081b> f34865y0;

    /* renamed from: z0 */
    private WeakReference<C12079a> f34866z0;

    /* renamed from: com.theartofdev.edmodo.cropper.CropImageView$a */
    class C12060a implements C12072b {
        C12060a() {
        }

        /* renamed from: a */
        public void mo41360a(boolean z) {
            CropImageView.this.m54514a(z, true);
            C12066g a = CropImageView.this.f34851k0;
            if (a != null && !z) {
                a.mo41373a(CropImageView.this.getCropRect());
            }
            C12065f b = CropImageView.this.f34852l0;
            if (b != null && z) {
                b.mo41372a(CropImageView.this.getCropRect());
            }
        }
    }

    /* renamed from: com.theartofdev.edmodo.cropper.CropImageView$b */
    public static class C12061b {

        /* renamed from: N */
        private final Bitmap f34868N;

        /* renamed from: O */
        private final Uri f34869O;

        /* renamed from: P */
        private final Exception f34870P;

        /* renamed from: Q */
        private final float[] f34871Q;

        /* renamed from: R */
        private final Rect f34872R;

        /* renamed from: S */
        private final Rect f34873S;

        /* renamed from: T */
        private final int f34874T;

        /* renamed from: U */
        private final int f34875U;

        /* renamed from: a */
        private final Bitmap f34876a;

        /* renamed from: b */
        private final Uri f34877b;

        C12061b(Bitmap bitmap, Uri uri, Bitmap bitmap2, Uri uri2, Exception exc, float[] fArr, Rect rect, Rect rect2, int i, int i2) {
            this.f34876a = bitmap;
            this.f34877b = uri;
            this.f34868N = bitmap2;
            this.f34869O = uri2;
            this.f34870P = exc;
            this.f34871Q = fArr;
            this.f34872R = rect;
            this.f34873S = rect2;
            this.f34874T = i;
            this.f34875U = i2;
        }

        /* renamed from: a */
        public Bitmap mo41361a() {
            return this.f34868N;
        }

        /* renamed from: b */
        public float[] mo41362b() {
            return this.f34871Q;
        }

        /* renamed from: c */
        public Rect mo41363c() {
            return this.f34872R;
        }

        /* renamed from: i */
        public Exception mo41364i() {
            return this.f34870P;
        }

        /* renamed from: j */
        public Bitmap mo41365j() {
            return this.f34876a;
        }

        /* renamed from: k */
        public Uri mo41366k() {
            return this.f34877b;
        }

        /* renamed from: l */
        public int mo41367l() {
            return this.f34874T;
        }

        /* renamed from: m */
        public int mo41368m() {
            return this.f34875U;
        }

        /* renamed from: n */
        public Uri mo41369n() {
            return this.f34869O;
        }

        /* renamed from: o */
        public Rect mo41370o() {
            return this.f34873S;
        }

        /* renamed from: p */
        public boolean mo41371p() {
            return this.f34870P == null;
        }
    }

    /* renamed from: com.theartofdev.edmodo.cropper.CropImageView$c */
    public enum C12062c {
        RECTANGLE,
        OVAL
    }

    /* renamed from: com.theartofdev.edmodo.cropper.CropImageView$d */
    public enum C12063d {
        OFF,
        ON_TOUCH,
        ON
    }

    /* renamed from: com.theartofdev.edmodo.cropper.CropImageView$e */
    public interface C12064e {
        /* renamed from: a */
        void mo41280a(CropImageView cropImageView, C12061b bVar);
    }

    /* renamed from: com.theartofdev.edmodo.cropper.CropImageView$f */
    public interface C12065f {
        /* renamed from: a */
        void mo41372a(Rect rect);
    }

    /* renamed from: com.theartofdev.edmodo.cropper.CropImageView$g */
    public interface C12066g {
        /* renamed from: a */
        void mo41373a(Rect rect);
    }

    /* renamed from: com.theartofdev.edmodo.cropper.CropImageView$h */
    public interface C12067h {
        /* renamed from: a */
        void mo41374a();
    }

    /* renamed from: com.theartofdev.edmodo.cropper.CropImageView$i */
    public interface C12068i {
        /* renamed from: a */
        void mo41279a(CropImageView cropImageView, Uri uri, Exception exc);
    }

    /* renamed from: com.theartofdev.edmodo.cropper.CropImageView$j */
    public enum C12069j {
        NONE,
        SAMPLING,
        RESIZE_INSIDE,
        RESIZE_FIT,
        RESIZE_EXACT
    }

    /* renamed from: com.theartofdev.edmodo.cropper.CropImageView$k */
    public enum C12070k {
        FIT_CENTER,
        CENTER,
        CENTER_CROP,
        CENTER_INSIDE
    }

    public CropImageView(Context context) {
        this(context, null);
    }

    /* renamed from: m */
    private void m54516m() {
        if (this.f34835T != null && (this.f34844d0 > 0 || this.f34856p0 != null)) {
            this.f34835T.recycle();
        }
        this.f34835T = null;
        this.f34844d0 = 0;
        this.f34856p0 = null;
        this.f34857q0 = 1;
        this.f34837V = 0;
        this.f34858r0 = 1.0f;
        this.f34859s0 = 0.0f;
        this.f34860t0 = 0.0f;
        this.f34829N.reset();
        this.f34864x0 = null;
        this.f34839a.setImageBitmap(null);
        m54518o();
    }

    /* renamed from: n */
    private void m54517n() {
        float[] fArr = this.f34832Q;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = (float) this.f34835T.getWidth();
        float[] fArr2 = this.f34832Q;
        fArr2[3] = 0.0f;
        fArr2[4] = (float) this.f34835T.getWidth();
        this.f34832Q[5] = (float) this.f34835T.getHeight();
        float[] fArr3 = this.f34832Q;
        fArr3[6] = 0.0f;
        fArr3[7] = (float) this.f34835T.getHeight();
        this.f34829N.mapPoints(this.f34832Q);
        float[] fArr4 = this.f34833R;
        fArr4[0] = 0.0f;
        fArr4[1] = 0.0f;
        fArr4[2] = 100.0f;
        fArr4[3] = 0.0f;
        fArr4[4] = 100.0f;
        fArr4[5] = 100.0f;
        fArr4[6] = 0.0f;
        fArr4[7] = 100.0f;
        this.f34829N.mapPoints(fArr4);
    }

    /* renamed from: o */
    private void m54518o() {
        CropOverlayView cropOverlayView = this.f34841b;
        if (cropOverlayView != null) {
            cropOverlayView.setVisibility((!this.f34847g0 || this.f34835T == null) ? 4 : 0);
        }
    }

    /* renamed from: p */
    private void m54519p() {
        int i = 0;
        boolean z = this.f34848h0 && ((this.f34835T == null && this.f34865y0 != null) || this.f34866z0 != null);
        ProgressBar progressBar = this.f34831P;
        if (!z) {
            i = 4;
        }
        progressBar.setVisibility(i);
    }

    /* renamed from: c */
    public void mo41306c(int i, int i2) {
        this.f34841b.setAspectRatioX(i);
        this.f34841b.setAspectRatioY(i2);
        setFixedAspectRatio(true);
    }

    /* renamed from: d */
    public void mo41308d(int i, int i2) {
        this.f34841b.mo41377a(i, i2);
    }

    /* renamed from: e */
    public boolean mo41310e() {
        return this.f34849i0;
    }

    /* renamed from: f */
    public boolean mo41311f() {
        return this.f34841b.mo41381b();
    }

    /* renamed from: g */
    public boolean mo41312g() {
        return this.f34838W;
    }

    public Pair<Integer, Integer> getAspectRatio() {
        return new Pair<>(Integer.valueOf(this.f34841b.getAspectRatioX()), Integer.valueOf(this.f34841b.getAspectRatioY()));
    }

    public float[] getCropPoints() {
        RectF cropWindowRect = this.f34841b.getCropWindowRect();
        float f = cropWindowRect.left;
        float f2 = cropWindowRect.top;
        float f3 = cropWindowRect.right;
        float f4 = cropWindowRect.bottom;
        float[] fArr = {f, f2, f3, f2, f3, f4, f, f4};
        this.f34829N.invert(this.f34830O);
        this.f34830O.mapPoints(fArr);
        for (int i = 0; i < fArr.length; i++) {
            fArr[i] = fArr[i] * ((float) this.f34857q0);
        }
        return fArr;
    }

    public Rect getCropRect() {
        int i = this.f34857q0;
        Bitmap bitmap = this.f34835T;
        if (bitmap == null) {
            return null;
        }
        return C12083c.m54606a(getCropPoints(), bitmap.getWidth() * i, i * bitmap.getHeight(), this.f34841b.mo41381b(), this.f34841b.getAspectRatioX(), this.f34841b.getAspectRatioY());
    }

    public C12062c getCropShape() {
        return this.f34841b.getCropShape();
    }

    public RectF getCropWindowRect() {
        CropOverlayView cropOverlayView = this.f34841b;
        if (cropOverlayView == null) {
            return null;
        }
        return cropOverlayView.getCropWindowRect();
    }

    public Bitmap getCroppedImage() {
        return mo41291a(0, 0, C12069j.NONE);
    }

    public void getCroppedImageAsync() {
        mo41304b(0, 0, C12069j.NONE);
    }

    public C12063d getGuidelines() {
        return this.f34841b.getGuidelines();
    }

    public int getImageResource() {
        return this.f34844d0;
    }

    public Uri getImageUri() {
        return this.f34856p0;
    }

    public int getMaxZoom() {
        return this.f34850j0;
    }

    public int getRotatedDegrees() {
        return this.f34837V;
    }

    public C12070k getScaleType() {
        return this.f34845e0;
    }

    public Rect getWholeImageRect() {
        int i = this.f34857q0;
        Bitmap bitmap = this.f34835T;
        if (bitmap == null) {
            return null;
        }
        return new Rect(0, 0, bitmap.getWidth() * i, bitmap.getHeight() * i);
    }

    /* renamed from: h */
    public boolean mo41327h() {
        return this.f34840a0;
    }

    /* renamed from: i */
    public boolean mo41328i() {
        return this.f34846f0;
    }

    /* renamed from: j */
    public boolean mo41329j() {
        return this.f34847g0;
    }

    /* renamed from: k */
    public boolean mo41330k() {
        return this.f34848h0;
    }

    /* renamed from: l */
    public void mo41331l() {
        this.f34858r0 = 1.0f;
        this.f34859s0 = 0.0f;
        this.f34860t0 = 0.0f;
        this.f34837V = this.f34836U;
        this.f34838W = false;
        this.f34840a0 = false;
        m54510a((float) getWidth(), (float) getHeight(), false, false);
        this.f34841b.mo41383d();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f34842b0 <= 0 || this.f34843c0 <= 0) {
            m54513a(true);
            return;
        }
        LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = this.f34842b0;
        layoutParams.height = this.f34843c0;
        setLayoutParams(layoutParams);
        if (this.f34835T != null) {
            float f = (float) (i3 - i);
            float f2 = (float) (i4 - i2);
            m54510a(f, f2, true, false);
            if (this.f34861u0 != null) {
                int i5 = this.f34862v0;
                if (i5 != this.f34836U) {
                    this.f34837V = i5;
                    m54510a(f, f2, true, false);
                }
                this.f34829N.mapRect(this.f34861u0);
                this.f34841b.setCropWindowRect(this.f34861u0);
                m54514a(false, false);
                this.f34841b.mo41375a();
                this.f34861u0 = null;
            } else if (this.f34863w0) {
                this.f34863w0 = false;
                m54514a(false, false);
            }
        } else {
            m54513a(true);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        double d;
        double d2;
        int i3;
        int i4;
        super.onMeasure(i, i2);
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size2 = MeasureSpec.getSize(i2);
        Bitmap bitmap = this.f34835T;
        if (bitmap != null) {
            if (size2 == 0) {
                size2 = bitmap.getHeight();
            }
            if (size < this.f34835T.getWidth()) {
                double d3 = (double) size;
                double width = (double) this.f34835T.getWidth();
                Double.isNaN(d3);
                Double.isNaN(width);
                d = d3 / width;
            } else {
                d = Double.POSITIVE_INFINITY;
            }
            if (size2 < this.f34835T.getHeight()) {
                double d4 = (double) size2;
                double height = (double) this.f34835T.getHeight();
                Double.isNaN(d4);
                Double.isNaN(height);
                d2 = d4 / height;
            } else {
                d2 = Double.POSITIVE_INFINITY;
            }
            if (d == Double.POSITIVE_INFINITY && d2 == Double.POSITIVE_INFINITY) {
                i4 = this.f34835T.getWidth();
                i3 = this.f34835T.getHeight();
            } else if (d <= d2) {
                double height2 = (double) this.f34835T.getHeight();
                Double.isNaN(height2);
                i3 = (int) (height2 * d);
                i4 = size;
            } else {
                double width2 = (double) this.f34835T.getWidth();
                Double.isNaN(width2);
                i4 = (int) (width2 * d2);
                i3 = size2;
            }
            int a = m54508a(mode, size, i4);
            int a2 = m54508a(mode2, size2, i3);
            this.f34842b0 = a;
            this.f34843c0 = a2;
            setMeasuredDimension(this.f34842b0, this.f34843c0);
            return;
        }
        setMeasuredDimension(size, size2);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            if (this.f34865y0 == null && this.f34856p0 == null && this.f34835T == null && this.f34844d0 == 0) {
                Uri uri = (Uri) bundle.getParcelable("LOADED_IMAGE_URI");
                if (uri != null) {
                    String string = bundle.getString("LOADED_IMAGE_STATE_BITMAP_KEY");
                    if (string != null) {
                        Pair<String, WeakReference<Bitmap>> pair = C12083c.f34951g;
                        Bitmap bitmap = (pair == null || !((String) pair.first).equals(string)) ? null : (Bitmap) ((WeakReference) C12083c.f34951g.second).get();
                        C12083c.f34951g = null;
                        if (bitmap != null && !bitmap.isRecycled()) {
                            m54511a(bitmap, 0, uri, bundle.getInt("LOADED_SAMPLE_SIZE"), 0);
                        }
                    }
                    if (this.f34856p0 == null) {
                        setImageUriAsync(uri);
                    }
                } else {
                    int i = bundle.getInt("LOADED_IMAGE_RESOURCE");
                    if (i > 0) {
                        setImageResource(i);
                    } else {
                        Uri uri2 = (Uri) bundle.getParcelable("LOADING_IMAGE_URI");
                        if (uri2 != null) {
                            setImageUriAsync(uri2);
                        }
                    }
                }
                int i2 = bundle.getInt("DEGREES_ROTATED");
                this.f34862v0 = i2;
                this.f34837V = i2;
                Rect rect = (Rect) bundle.getParcelable("INITIAL_CROP_RECT");
                if (rect != null && (rect.width() > 0 || rect.height() > 0)) {
                    this.f34841b.setInitialCropWindowRect(rect);
                }
                RectF rectF = (RectF) bundle.getParcelable("CROP_WINDOW_RECT");
                if (rectF != null && (rectF.width() > 0.0f || rectF.height() > 0.0f)) {
                    this.f34861u0 = rectF;
                }
                this.f34841b.setCropShape(C12062c.valueOf(bundle.getString("CROP_SHAPE")));
                this.f34849i0 = bundle.getBoolean("CROP_AUTO_ZOOM_ENABLED");
                this.f34850j0 = bundle.getInt("CROP_MAX_ZOOM");
                this.f34838W = bundle.getBoolean("CROP_FLIP_HORIZONTALLY");
                this.f34840a0 = bundle.getBoolean("CROP_FLIP_VERTICALLY");
            }
            super.onRestoreInstanceState(bundle.getParcelable("instanceState"));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public Parcelable onSaveInstanceState() {
        if (this.f34856p0 == null && this.f34835T == null && this.f34844d0 < 1) {
            return super.onSaveInstanceState();
        }
        Bundle bundle = new Bundle();
        Uri uri = this.f34856p0;
        if (this.f34846f0 && uri == null && this.f34844d0 < 1) {
            uri = C12083c.m54607a(getContext(), this.f34835T, this.f34864x0);
            this.f34864x0 = uri;
        }
        if (!(uri == null || this.f34835T == null)) {
            String uuid = UUID.randomUUID().toString();
            C12083c.f34951g = new Pair<>(uuid, new WeakReference(this.f34835T));
            bundle.putString("LOADED_IMAGE_STATE_BITMAP_KEY", uuid);
        }
        WeakReference<C12081b> weakReference = this.f34865y0;
        if (weakReference != null) {
            C12081b bVar = (C12081b) weakReference.get();
            if (bVar != null) {
                bundle.putParcelable("LOADING_IMAGE_URI", bVar.mo41408a());
            }
        }
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putParcelable("LOADED_IMAGE_URI", uri);
        bundle.putInt("LOADED_IMAGE_RESOURCE", this.f34844d0);
        bundle.putInt("LOADED_SAMPLE_SIZE", this.f34857q0);
        bundle.putInt("DEGREES_ROTATED", this.f34837V);
        bundle.putParcelable("INITIAL_CROP_RECT", this.f34841b.getInitialCropWindowRect());
        C12083c.f34947c.set(this.f34841b.getCropWindowRect());
        this.f34829N.invert(this.f34830O);
        this.f34830O.mapRect(C12083c.f34947c);
        bundle.putParcelable("CROP_WINDOW_RECT", C12083c.f34947c);
        bundle.putString("CROP_SHAPE", this.f34841b.getCropShape().name());
        bundle.putBoolean("CROP_AUTO_ZOOM_ENABLED", this.f34849i0);
        bundle.putInt("CROP_MAX_ZOOM", this.f34850j0);
        bundle.putBoolean("CROP_FLIP_HORIZONTALLY", this.f34838W);
        bundle.putBoolean("CROP_FLIP_VERTICALLY", this.f34840a0);
        return bundle;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f34863w0 = i3 > 0 && i4 > 0;
    }

    public void setAutoZoomEnabled(boolean z) {
        if (this.f34849i0 != z) {
            this.f34849i0 = z;
            m54514a(false, false);
            this.f34841b.invalidate();
        }
    }

    public void setCropRect(Rect rect) {
        this.f34841b.setInitialCropWindowRect(rect);
    }

    public void setCropShape(C12062c cVar) {
        this.f34841b.setCropShape(cVar);
    }

    public void setFixedAspectRatio(boolean z) {
        this.f34841b.setFixedAspectRatio(z);
    }

    public void setFlippedHorizontally(boolean z) {
        if (this.f34838W != z) {
            this.f34838W = z;
            m54510a((float) getWidth(), (float) getHeight(), true, false);
        }
    }

    public void setFlippedVertically(boolean z) {
        if (this.f34840a0 != z) {
            this.f34840a0 = z;
            m54510a((float) getWidth(), (float) getHeight(), true, false);
        }
    }

    public void setGuidelines(C12063d dVar) {
        this.f34841b.setGuidelines(dVar);
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.f34841b.setInitialCropWindowRect(null);
        m54511a(bitmap, 0, (Uri) null, 1, 0);
    }

    public void setImageResource(int i) {
        if (i != 0) {
            this.f34841b.setInitialCropWindowRect(null);
            m54511a(BitmapFactory.decodeResource(getResources(), i), i, (Uri) null, 1, 0);
        }
    }

    public void setImageUriAsync(Uri uri) {
        if (uri != null) {
            WeakReference<C12081b> weakReference = this.f34865y0;
            AsyncTask asyncTask = weakReference != null ? (C12081b) weakReference.get() : null;
            if (asyncTask != null) {
                asyncTask.cancel(true);
            }
            m54516m();
            this.f34861u0 = null;
            this.f34862v0 = 0;
            this.f34841b.setInitialCropWindowRect(null);
            this.f34865y0 = new WeakReference<>(new C12081b(this, uri));
            ((C12081b) this.f34865y0.get()).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            m54519p();
        }
    }

    public void setMaxZoom(int i) {
        if (this.f34850j0 != i && i > 0) {
            this.f34850j0 = i;
            m54514a(false, false);
            this.f34841b.invalidate();
        }
    }

    public void setMultiTouchEnabled(boolean z) {
        if (this.f34841b.mo41379a(z)) {
            m54514a(false, false);
            this.f34841b.invalidate();
        }
    }

    public void setOnCropImageCompleteListener(C12064e eVar) {
        this.f34855o0 = eVar;
    }

    public void setOnCropWindowChangedListener(C12067h hVar) {
        this.f34853m0 = hVar;
    }

    public void setOnSetCropOverlayMovedListener(C12065f fVar) {
        this.f34852l0 = fVar;
    }

    public void setOnSetCropOverlayReleasedListener(C12066g gVar) {
        this.f34851k0 = gVar;
    }

    public void setOnSetImageUriCompleteListener(C12068i iVar) {
        this.f34854n0 = iVar;
    }

    public void setRotatedDegrees(int i) {
        int i2 = this.f34837V;
        if (i2 != i) {
            mo41293a(i - i2);
        }
    }

    public void setSaveBitmapToInstanceState(boolean z) {
        this.f34846f0 = z;
    }

    public void setScaleType(C12070k kVar) {
        if (kVar != this.f34845e0) {
            this.f34845e0 = kVar;
            this.f34858r0 = 1.0f;
            this.f34860t0 = 0.0f;
            this.f34859s0 = 0.0f;
            this.f34841b.mo41382c();
            requestLayout();
        }
    }

    public void setShowCropOverlay(boolean z) {
        if (this.f34847g0 != z) {
            this.f34847g0 = z;
            m54518o();
        }
    }

    public void setShowProgressBar(boolean z) {
        if (this.f34848h0 != z) {
            this.f34848h0 = z;
            m54519p();
        }
    }

    public void setSnapRadius(float f) {
        if (f >= 0.0f) {
            this.f34841b.setSnapRadius(f);
        }
    }

    public CropImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f34829N = new Matrix();
        this.f34830O = new Matrix();
        this.f34832Q = new float[8];
        this.f34833R = new float[8];
        this.f34846f0 = false;
        this.f34847g0 = true;
        this.f34848h0 = true;
        this.f34849i0 = true;
        this.f34857q0 = 1;
        this.f34858r0 = 1.0f;
        CropImageOptions cropImageOptions = null;
        Intent intent = context instanceof Activity ? ((Activity) context).getIntent() : null;
        if (intent != null) {
            Bundle bundleExtra = intent.getBundleExtra(CropImage.f34769c);
            if (bundleExtra != null) {
                cropImageOptions = (CropImageOptions) bundleExtra.getParcelable(CropImage.f34768b);
            }
        }
        if (cropImageOptions == null) {
            cropImageOptions = new CropImageOptions();
            if (attributeSet != null) {
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C12074R.styleable.CropImageView, 0, 0);
                try {
                    cropImageOptions.f34797W = obtainStyledAttributes.getBoolean(C12074R.styleable.CropImageView_cropFixAspectRatio, cropImageOptions.f34797W);
                    cropImageOptions.f34798X = obtainStyledAttributes.getInteger(C12074R.styleable.CropImageView_cropAspectRatioX, cropImageOptions.f34798X);
                    cropImageOptions.f34799Y = obtainStyledAttributes.getInteger(C12074R.styleable.CropImageView_cropAspectRatioY, cropImageOptions.f34799Y);
                    cropImageOptions.f34790P = C12070k.values()[obtainStyledAttributes.getInt(C12074R.styleable.CropImageView_cropScaleType, cropImageOptions.f34790P.ordinal())];
                    cropImageOptions.f34793S = obtainStyledAttributes.getBoolean(C12074R.styleable.CropImageView_cropAutoZoomEnabled, cropImageOptions.f34793S);
                    cropImageOptions.f34794T = obtainStyledAttributes.getBoolean(C12074R.styleable.CropImageView_cropMultiTouchEnabled, cropImageOptions.f34794T);
                    cropImageOptions.f34795U = obtainStyledAttributes.getInteger(C12074R.styleable.CropImageView_cropMaxZoom, cropImageOptions.f34795U);
                    cropImageOptions.f34801a = C12062c.values()[obtainStyledAttributes.getInt(C12074R.styleable.CropImageView_cropShape, cropImageOptions.f34801a.ordinal())];
                    cropImageOptions.f34789O = C12063d.values()[obtainStyledAttributes.getInt(C12074R.styleable.CropImageView_cropGuidelines, cropImageOptions.f34789O.ordinal())];
                    cropImageOptions.f34803b = obtainStyledAttributes.getDimension(C12074R.styleable.CropImageView_cropSnapRadius, cropImageOptions.f34803b);
                    cropImageOptions.f34788N = obtainStyledAttributes.getDimension(C12074R.styleable.CropImageView_cropTouchRadius, cropImageOptions.f34788N);
                    cropImageOptions.f34796V = obtainStyledAttributes.getFloat(C12074R.styleable.CropImageView_cropInitialCropWindowPaddingRatio, cropImageOptions.f34796V);
                    cropImageOptions.f34800Z = obtainStyledAttributes.getDimension(C12074R.styleable.CropImageView_cropBorderLineThickness, cropImageOptions.f34800Z);
                    cropImageOptions.f34802a0 = obtainStyledAttributes.getInteger(C12074R.styleable.CropImageView_cropBorderLineColor, cropImageOptions.f34802a0);
                    cropImageOptions.f34804b0 = obtainStyledAttributes.getDimension(C12074R.styleable.CropImageView_cropBorderCornerThickness, cropImageOptions.f34804b0);
                    cropImageOptions.f34805c0 = obtainStyledAttributes.getDimension(C12074R.styleable.CropImageView_cropBorderCornerOffset, cropImageOptions.f34805c0);
                    cropImageOptions.f34806d0 = obtainStyledAttributes.getDimension(C12074R.styleable.CropImageView_cropBorderCornerLength, cropImageOptions.f34806d0);
                    cropImageOptions.f34807e0 = obtainStyledAttributes.getInteger(C12074R.styleable.CropImageView_cropBorderCornerColor, cropImageOptions.f34807e0);
                    cropImageOptions.f34808f0 = obtainStyledAttributes.getDimension(C12074R.styleable.CropImageView_cropGuidelinesThickness, cropImageOptions.f34808f0);
                    cropImageOptions.f34809g0 = obtainStyledAttributes.getInteger(C12074R.styleable.CropImageView_cropGuidelinesColor, cropImageOptions.f34809g0);
                    cropImageOptions.f34810h0 = obtainStyledAttributes.getInteger(C12074R.styleable.CropImageView_cropBackgroundColor, cropImageOptions.f34810h0);
                    cropImageOptions.f34791Q = obtainStyledAttributes.getBoolean(C12074R.styleable.CropImageView_cropShowCropOverlay, this.f34847g0);
                    cropImageOptions.f34792R = obtainStyledAttributes.getBoolean(C12074R.styleable.CropImageView_cropShowProgressBar, this.f34848h0);
                    cropImageOptions.f34804b0 = obtainStyledAttributes.getDimension(C12074R.styleable.CropImageView_cropBorderCornerThickness, cropImageOptions.f34804b0);
                    cropImageOptions.f34811i0 = (int) obtainStyledAttributes.getDimension(C12074R.styleable.CropImageView_cropMinCropWindowWidth, (float) cropImageOptions.f34811i0);
                    cropImageOptions.f34812j0 = (int) obtainStyledAttributes.getDimension(C12074R.styleable.CropImageView_cropMinCropWindowHeight, (float) cropImageOptions.f34812j0);
                    cropImageOptions.f34813k0 = (int) obtainStyledAttributes.getFloat(C12074R.styleable.CropImageView_cropMinCropResultWidthPX, (float) cropImageOptions.f34813k0);
                    cropImageOptions.f34814l0 = (int) obtainStyledAttributes.getFloat(C12074R.styleable.CropImageView_cropMinCropResultHeightPX, (float) cropImageOptions.f34814l0);
                    cropImageOptions.f34815m0 = (int) obtainStyledAttributes.getFloat(C12074R.styleable.CropImageView_cropMaxCropResultWidthPX, (float) cropImageOptions.f34815m0);
                    cropImageOptions.f34816n0 = (int) obtainStyledAttributes.getFloat(C12074R.styleable.CropImageView_cropMaxCropResultHeightPX, (float) cropImageOptions.f34816n0);
                    cropImageOptions.f34784D0 = obtainStyledAttributes.getBoolean(C12074R.styleable.CropImageView_cropFlipHorizontally, cropImageOptions.f34784D0);
                    cropImageOptions.f34785E0 = obtainStyledAttributes.getBoolean(C12074R.styleable.CropImageView_cropFlipHorizontally, cropImageOptions.f34785E0);
                    this.f34846f0 = obtainStyledAttributes.getBoolean(C12074R.styleable.CropImageView_cropSaveBitmapToInstanceState, this.f34846f0);
                    if (obtainStyledAttributes.hasValue(C12074R.styleable.CropImageView_cropAspectRatioX) && obtainStyledAttributes.hasValue(C12074R.styleable.CropImageView_cropAspectRatioX) && !obtainStyledAttributes.hasValue(C12074R.styleable.CropImageView_cropFixAspectRatio)) {
                        cropImageOptions.f34797W = true;
                    }
                } finally {
                    obtainStyledAttributes.recycle();
                }
            }
        }
        cropImageOptions.mo41285a();
        this.f34845e0 = cropImageOptions.f34790P;
        this.f34849i0 = cropImageOptions.f34793S;
        this.f34850j0 = cropImageOptions.f34795U;
        this.f34847g0 = cropImageOptions.f34791Q;
        this.f34848h0 = cropImageOptions.f34792R;
        this.f34838W = cropImageOptions.f34784D0;
        this.f34840a0 = cropImageOptions.f34785E0;
        View inflate = LayoutInflater.from(context).inflate(C12074R.layout.crop_image_view, this, true);
        this.f34839a = (ImageView) inflate.findViewById(C12074R.C12077id.ImageView_image);
        this.f34839a.setScaleType(ScaleType.MATRIX);
        this.f34841b = (CropOverlayView) inflate.findViewById(C12074R.C12077id.CropOverlayView);
        this.f34841b.setCropWindowChangeListener(new C12060a());
        this.f34841b.setInitialAttributeValues(cropImageOptions);
        this.f34831P = (ProgressBar) inflate.findViewById(C12074R.C12077id.CropProgressBar);
        m54519p();
    }

    /* renamed from: b */
    public void mo41303b(int i, int i2) {
        mo41304b(i, i2, C12069j.RESIZE_INSIDE);
    }

    /* renamed from: d */
    public void mo41307d() {
        this.f34840a0 = !this.f34840a0;
        m54510a((float) getWidth(), (float) getHeight(), true, false);
    }

    /* renamed from: e */
    public void mo41309e(int i, int i2) {
        this.f34841b.mo41380b(i, i2);
    }

    /* renamed from: a */
    public void mo41292a() {
        this.f34841b.setAspectRatioX(1);
        this.f34841b.setAspectRatioY(1);
        setFixedAspectRatio(false);
    }

    /* renamed from: b */
    public void mo41304b(int i, int i2, C12069j jVar) {
        if (this.f34855o0 != null) {
            mo41294a(i, i2, jVar, (Uri) null, (CompressFormat) null, 0);
            return;
        }
        throw new IllegalArgumentException("mOnCropImageCompleteListener is not set");
    }

    /* renamed from: c */
    public void mo41305c() {
        this.f34838W = !this.f34838W;
        m54510a((float) getWidth(), (float) getHeight(), true, false);
    }

    /* renamed from: a */
    public Bitmap mo41290a(int i, int i2) {
        return mo41291a(i, i2, C12069j.RESIZE_INSIDE);
    }

    /* renamed from: b */
    public void mo41302b() {
        m54516m();
        this.f34841b.setInitialCropWindowRect(null);
    }

    /* renamed from: a */
    public Bitmap mo41291a(int i, int i2, C12069j jVar) {
        Bitmap bitmap;
        C12069j jVar2 = jVar;
        if (this.f34835T == null) {
            return null;
        }
        this.f34839a.clearAnimation();
        int i3 = 0;
        int i4 = jVar2 != C12069j.NONE ? i : 0;
        if (jVar2 != C12069j.NONE) {
            i3 = i2;
        }
        if (this.f34856p0 == null || (this.f34857q0 <= 1 && jVar2 != C12069j.SAMPLING)) {
            bitmap = C12083c.m54613a(this.f34835T, getCropPoints(), this.f34837V, this.f34841b.mo41381b(), this.f34841b.getAspectRatioX(), this.f34841b.getAspectRatioY(), this.f34838W, this.f34840a0).f34952a;
        } else {
            bitmap = C12083c.m54610a(getContext(), this.f34856p0, getCropPoints(), this.f34837V, this.f34835T.getWidth() * this.f34857q0, this.f34835T.getHeight() * this.f34857q0, this.f34841b.mo41381b(), this.f34841b.getAspectRatioX(), this.f34841b.getAspectRatioY(), i4, i3, this.f34838W, this.f34840a0).f34952a;
        }
        return C12083c.m54601a(bitmap, i4, i3, jVar2);
    }

    /* renamed from: a */
    public void mo41296a(Uri uri) {
        mo41299a(uri, CompressFormat.JPEG, 90, 0, 0, C12069j.NONE);
    }

    /* renamed from: a */
    public void mo41297a(Uri uri, CompressFormat compressFormat, int i) {
        mo41299a(uri, compressFormat, i, 0, 0, C12069j.NONE);
    }

    /* renamed from: a */
    public void mo41298a(Uri uri, CompressFormat compressFormat, int i, int i2, int i3) {
        mo41299a(uri, compressFormat, i, i2, i3, C12069j.RESIZE_INSIDE);
    }

    /* renamed from: a */
    public void mo41299a(Uri uri, CompressFormat compressFormat, int i, int i2, int i3, C12069j jVar) {
        if (this.f34855o0 != null) {
            mo41294a(i2, i3, jVar, uri, compressFormat, i);
            return;
        }
        throw new IllegalArgumentException("mOnCropImageCompleteListener is not set");
    }

    /* renamed from: a */
    public void mo41295a(Bitmap bitmap, C2108a aVar) {
        int i;
        Bitmap bitmap2;
        if (bitmap == null || aVar == null) {
            bitmap2 = bitmap;
            i = 0;
        } else {
            C12085b a = C12083c.m54615a(bitmap, aVar);
            Bitmap bitmap3 = a.f34954a;
            int i2 = a.f34955b;
            this.f34836U = i2;
            i = i2;
            bitmap2 = bitmap3;
        }
        this.f34841b.setInitialCropWindowRect(null);
        m54511a(bitmap2, 0, (Uri) null, 1, i);
    }

    /* renamed from: a */
    public void mo41293a(int i) {
        int i2;
        int i3 = i;
        if (this.f34835T != null) {
            if (i3 < 0) {
                i2 = (i3 % 360) + 360;
            } else {
                i2 = i3 % 360;
            }
            boolean z = !this.f34841b.mo41381b() && ((i2 > 45 && i2 < 135) || (i2 > 215 && i2 < 305));
            C12083c.f34947c.set(this.f34841b.getCropWindowRect());
            RectF rectF = C12083c.f34947c;
            float height = (z ? rectF.height() : rectF.width()) / 2.0f;
            RectF rectF2 = C12083c.f34947c;
            float width = (z ? rectF2.width() : rectF2.height()) / 2.0f;
            if (z) {
                boolean z2 = this.f34838W;
                this.f34838W = this.f34840a0;
                this.f34840a0 = z2;
            }
            this.f34829N.invert(this.f34830O);
            C12083c.f34948d[0] = C12083c.f34947c.centerX();
            C12083c.f34948d[1] = C12083c.f34947c.centerY();
            float[] fArr = C12083c.f34948d;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 1.0f;
            fArr[5] = 0.0f;
            this.f34830O.mapPoints(fArr);
            this.f34837V = (this.f34837V + i2) % 360;
            m54510a((float) getWidth(), (float) getHeight(), true, false);
            this.f34829N.mapPoints(C12083c.f34949e, C12083c.f34948d);
            double d = (double) this.f34858r0;
            float[] fArr2 = C12083c.f34949e;
            double pow = Math.pow((double) (fArr2[4] - fArr2[2]), 2.0d);
            float[] fArr3 = C12083c.f34949e;
            float f = width;
            double sqrt = Math.sqrt(pow + Math.pow((double) (fArr3[5] - fArr3[3]), 2.0d));
            Double.isNaN(d);
            this.f34858r0 = (float) (d / sqrt);
            this.f34858r0 = Math.max(this.f34858r0, 1.0f);
            m54510a((float) getWidth(), (float) getHeight(), true, false);
            this.f34829N.mapPoints(C12083c.f34949e, C12083c.f34948d);
            float[] fArr4 = C12083c.f34949e;
            double pow2 = Math.pow((double) (fArr4[4] - fArr4[2]), 2.0d);
            float[] fArr5 = C12083c.f34949e;
            double sqrt2 = Math.sqrt(pow2 + Math.pow((double) (fArr5[5] - fArr5[3]), 2.0d));
            double d2 = (double) height;
            Double.isNaN(d2);
            float f2 = (float) (d2 * sqrt2);
            double d3 = (double) f;
            Double.isNaN(d3);
            float f3 = (float) (d3 * sqrt2);
            RectF rectF3 = C12083c.f34947c;
            float[] fArr6 = C12083c.f34949e;
            rectF3.set(fArr6[0] - f2, fArr6[1] - f3, fArr6[0] + f2, fArr6[1] + f3);
            this.f34841b.mo41382c();
            this.f34841b.setCropWindowRect(C12083c.f34947c);
            m54510a((float) getWidth(), (float) getHeight(), true, false);
            m54514a(false, false);
            this.f34841b.mo41375a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo41301a(C12082a aVar) {
        this.f34865y0 = null;
        m54519p();
        if (aVar.f34944e == null) {
            int i = aVar.f34943d;
            this.f34836U = i;
            m54511a(aVar.f34941b, 0, aVar.f34940a, aVar.f34942c, i);
        }
        C12068i iVar = this.f34854n0;
        if (iVar != null) {
            iVar.mo41279a(this, aVar.f34940a, aVar.f34944e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo41300a(C12080a aVar) {
        this.f34866z0 = null;
        m54519p();
        C12064e eVar = this.f34855o0;
        if (eVar != null) {
            C12061b bVar = new C12061b(this.f34835T, this.f34856p0, aVar.f34930a, aVar.f34931b, aVar.f34932c, getCropPoints(), getCropRect(), getWholeImageRect(), getRotatedDegrees(), aVar.f34934e);
            eVar.mo41280a(this, bVar);
        }
    }

    /* renamed from: a */
    private void m54511a(Bitmap bitmap, int i, Uri uri, int i2, int i3) {
        Bitmap bitmap2 = this.f34835T;
        if (bitmap2 == null || !bitmap2.equals(bitmap)) {
            this.f34839a.clearAnimation();
            m54516m();
            this.f34835T = bitmap;
            this.f34839a.setImageBitmap(this.f34835T);
            this.f34856p0 = uri;
            this.f34844d0 = i;
            this.f34857q0 = i2;
            this.f34837V = i3;
            m54510a((float) getWidth(), (float) getHeight(), true, false);
            CropOverlayView cropOverlayView = this.f34841b;
            if (cropOverlayView != null) {
                cropOverlayView.mo41382c();
                m54518o();
            }
        }
    }

    /* renamed from: a */
    public void mo41294a(int i, int i2, C12069j jVar, Uri uri, CompressFormat compressFormat, int i3) {
        CropImageView cropImageView;
        C12069j jVar2 = jVar;
        Bitmap bitmap = this.f34835T;
        if (bitmap != null) {
            this.f34839a.clearAnimation();
            WeakReference<C12079a> weakReference = this.f34866z0;
            C12079a aVar = weakReference != null ? (C12079a) weakReference.get() : null;
            if (aVar != null) {
                aVar.cancel(true);
            }
            int i4 = jVar2 != C12069j.NONE ? i : 0;
            int i5 = jVar2 != C12069j.NONE ? i2 : 0;
            int width = bitmap.getWidth() * this.f34857q0;
            int height = bitmap.getHeight();
            int i6 = this.f34857q0;
            int i7 = height * i6;
            if (this.f34856p0 == null || (i6 <= 1 && jVar2 != C12069j.SAMPLING)) {
                C12079a aVar2 = r0;
                C12079a aVar3 = new C12079a(this, bitmap, getCropPoints(), this.f34837V, this.f34841b.mo41381b(), this.f34841b.getAspectRatioX(), this.f34841b.getAspectRatioY(), i4, i5, this.f34838W, this.f34840a0, jVar, uri, compressFormat, i3);
                WeakReference<C12079a> weakReference2 = new WeakReference<>(aVar2);
                cropImageView = this;
                cropImageView.f34866z0 = weakReference2;
            } else {
                C12079a aVar4 = r0;
                C12079a aVar5 = new C12079a(this, this.f34856p0, getCropPoints(), this.f34837V, width, i7, this.f34841b.mo41381b(), this.f34841b.getAspectRatioX(), this.f34841b.getAspectRatioY(), i4, i5, this.f34838W, this.f34840a0, jVar, uri, compressFormat, i3);
                WeakReference<C12079a> weakReference3 = new WeakReference<>(aVar4);
                this.f34866z0 = weakReference3;
                cropImageView = this;
            }
            ((C12079a) cropImageView.f34866z0.get()).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            m54519p();
            return;
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00db  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m54514a(boolean r12, boolean r13) {
        /*
            r11 = this;
            int r0 = r11.getWidth()
            int r1 = r11.getHeight()
            android.graphics.Bitmap r2 = r11.f34835T
            if (r2 == 0) goto L_0x0104
            if (r0 <= 0) goto L_0x0104
            if (r1 <= 0) goto L_0x0104
            com.theartofdev.edmodo.cropper.CropOverlayView r2 = r11.f34841b
            android.graphics.RectF r2 = r2.getCropWindowRect()
            r3 = 0
            if (r12 == 0) goto L_0x003b
            float r13 = r2.left
            int r13 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r13 < 0) goto L_0x0033
            float r13 = r2.top
            int r13 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r13 < 0) goto L_0x0033
            float r13 = r2.right
            float r3 = (float) r0
            int r13 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r13 > 0) goto L_0x0033
            float r13 = r2.bottom
            float r2 = (float) r1
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 <= 0) goto L_0x00fb
        L_0x0033:
            float r13 = (float) r0
            float r0 = (float) r1
            r1 = 0
            r11.m54510a(r13, r0, r1, r1)
            goto L_0x00fb
        L_0x003b:
            boolean r4 = r11.f34849i0
            r5 = 1065353216(0x3f800000, float:1.0)
            if (r4 != 0) goto L_0x0047
            float r4 = r11.f34858r0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x00fb
        L_0x0047:
            float r4 = r11.f34858r0
            int r6 = r11.f34850j0
            float r6 = (float) r6
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 >= 0) goto L_0x0089
            float r4 = r2.width()
            float r6 = (float) r0
            r7 = 1056964608(0x3f000000, float:0.5)
            float r8 = r6 * r7
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 >= 0) goto L_0x0089
            float r4 = r2.height()
            float r8 = (float) r1
            float r7 = r7 * r8
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 >= 0) goto L_0x0089
            int r4 = r11.f34850j0
            float r4 = (float) r4
            float r7 = r2.width()
            float r9 = r11.f34858r0
            float r7 = r7 / r9
            r9 = 1059313418(0x3f23d70a, float:0.64)
            float r7 = r7 / r9
            float r6 = r6 / r7
            float r7 = r2.height()
            float r10 = r11.f34858r0
            float r7 = r7 / r10
            float r7 = r7 / r9
            float r8 = r8 / r7
            float r6 = java.lang.Math.min(r6, r8)
            float r4 = java.lang.Math.min(r4, r6)
            goto L_0x008a
        L_0x0089:
            r4 = 0
        L_0x008a:
            float r6 = r11.f34858r0
            int r6 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r6 <= 0) goto L_0x00c8
            float r6 = r2.width()
            float r7 = (float) r0
            r8 = 1059481190(0x3f266666, float:0.65)
            float r9 = r7 * r8
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 > 0) goto L_0x00a9
            float r6 = r2.height()
            float r9 = (float) r1
            float r9 = r9 * r8
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 <= 0) goto L_0x00c8
        L_0x00a9:
            float r4 = r2.width()
            float r6 = r11.f34858r0
            float r4 = r4 / r6
            r6 = 1057132380(0x3f028f5c, float:0.51)
            float r4 = r4 / r6
            float r7 = r7 / r4
            float r4 = (float) r1
            float r2 = r2.height()
            float r8 = r11.f34858r0
            float r2 = r2 / r8
            float r2 = r2 / r6
            float r4 = r4 / r2
            float r2 = java.lang.Math.min(r7, r4)
            float r2 = java.lang.Math.max(r5, r2)
            goto L_0x00c9
        L_0x00c8:
            r2 = r4
        L_0x00c9:
            boolean r4 = r11.f34849i0
            if (r4 != 0) goto L_0x00cf
            r2 = 1065353216(0x3f800000, float:1.0)
        L_0x00cf:
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x00fb
            float r3 = r11.f34858r0
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x00fb
            if (r13 == 0) goto L_0x00f3
            com.theartofdev.edmodo.cropper.e r3 = r11.f34834S
            if (r3 != 0) goto L_0x00ea
            com.theartofdev.edmodo.cropper.e r3 = new com.theartofdev.edmodo.cropper.e
            android.widget.ImageView r4 = r11.f34839a
            com.theartofdev.edmodo.cropper.CropOverlayView r5 = r11.f34841b
            r3.<init>(r4, r5)
            r11.f34834S = r3
        L_0x00ea:
            com.theartofdev.edmodo.cropper.e r3 = r11.f34834S
            float[] r4 = r11.f34832Q
            android.graphics.Matrix r5 = r11.f34829N
            r3.mo41415b(r4, r5)
        L_0x00f3:
            r11.f34858r0 = r2
            float r0 = (float) r0
            float r1 = (float) r1
            r2 = 1
            r11.m54510a(r0, r1, r2, r13)
        L_0x00fb:
            com.theartofdev.edmodo.cropper.CropImageView$h r13 = r11.f34853m0
            if (r13 == 0) goto L_0x0104
            if (r12 != 0) goto L_0x0104
            r13.mo41374a()
        L_0x0104:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.theartofdev.edmodo.cropper.CropImageView.m54514a(boolean, boolean):void");
    }

    /* renamed from: a */
    private void m54510a(float f, float f2, boolean z, boolean z2) {
        float f3;
        if (this.f34835T != null) {
            float f4 = 0.0f;
            if (f > 0.0f && f2 > 0.0f) {
                this.f34829N.invert(this.f34830O);
                RectF cropWindowRect = this.f34841b.getCropWindowRect();
                this.f34830O.mapRect(cropWindowRect);
                this.f34829N.reset();
                this.f34829N.postTranslate((f - ((float) this.f34835T.getWidth())) / 2.0f, (f2 - ((float) this.f34835T.getHeight())) / 2.0f);
                m54517n();
                int i = this.f34837V;
                if (i > 0) {
                    this.f34829N.postRotate((float) i, C12083c.m54619b(this.f34832Q), C12083c.m54620c(this.f34832Q));
                    m54517n();
                }
                float min = Math.min(f / C12083c.m54625h(this.f34832Q), f2 / C12083c.m54621d(this.f34832Q));
                C12070k kVar = this.f34845e0;
                if (kVar == C12070k.FIT_CENTER || ((kVar == C12070k.CENTER_INSIDE && min < 1.0f) || (min > 1.0f && this.f34849i0))) {
                    this.f34829N.postScale(min, min, C12083c.m54619b(this.f34832Q), C12083c.m54620c(this.f34832Q));
                    m54517n();
                }
                float f5 = this.f34838W ? -this.f34858r0 : this.f34858r0;
                float f6 = this.f34840a0 ? -this.f34858r0 : this.f34858r0;
                this.f34829N.postScale(f5, f6, C12083c.m54619b(this.f34832Q), C12083c.m54620c(this.f34832Q));
                m54517n();
                this.f34829N.mapRect(cropWindowRect);
                if (z) {
                    if (f > C12083c.m54625h(this.f34832Q)) {
                        f3 = 0.0f;
                    } else {
                        f3 = Math.max(Math.min((f / 2.0f) - cropWindowRect.centerX(), -C12083c.m54622e(this.f34832Q)), ((float) getWidth()) - C12083c.m54623f(this.f34832Q)) / f5;
                    }
                    this.f34859s0 = f3;
                    if (f2 <= C12083c.m54621d(this.f34832Q)) {
                        f4 = Math.max(Math.min((f2 / 2.0f) - cropWindowRect.centerY(), -C12083c.m54624g(this.f34832Q)), ((float) getHeight()) - C12083c.m54596a(this.f34832Q)) / f6;
                    }
                    this.f34860t0 = f4;
                } else {
                    this.f34859s0 = Math.min(Math.max(this.f34859s0 * f5, -cropWindowRect.left), (-cropWindowRect.right) + f) / f5;
                    this.f34860t0 = Math.min(Math.max(this.f34860t0 * f6, -cropWindowRect.top), (-cropWindowRect.bottom) + f2) / f6;
                }
                this.f34829N.postTranslate(this.f34859s0 * f5, this.f34860t0 * f6);
                cropWindowRect.offset(this.f34859s0 * f5, this.f34860t0 * f6);
                this.f34841b.setCropWindowRect(cropWindowRect);
                m54517n();
                this.f34841b.invalidate();
                if (z2) {
                    this.f34834S.mo41413a(this.f34832Q, this.f34829N);
                    this.f34839a.startAnimation(this.f34834S);
                } else {
                    this.f34839a.setImageMatrix(this.f34829N);
                }
                m54513a(false);
            }
        }
    }

    /* renamed from: a */
    private static int m54508a(int i, int i2, int i3) {
        if (i == 1073741824) {
            return i2;
        }
        return i == Integer.MIN_VALUE ? Math.min(i3, i2) : i3;
    }

    /* renamed from: a */
    private void m54513a(boolean z) {
        if (this.f34835T != null && !z) {
            this.f34841b.mo41376a((float) getWidth(), (float) getHeight(), (((float) this.f34857q0) * 100.0f) / C12083c.m54625h(this.f34833R), (((float) this.f34857q0) * 100.0f) / C12083c.m54621d(this.f34833R));
        }
        this.f34841b.mo41378a(z ? null : this.f34832Q, getWidth(), getHeight());
    }
}
