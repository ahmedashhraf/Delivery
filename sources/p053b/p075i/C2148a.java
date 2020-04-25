package p053b.p075i;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory.Options;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.CancellationSignal.OnCancelListener;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import android.print.PrintAttributes;
import android.print.PrintAttributes.Margins;
import android.print.PrintAttributes.MediaSize;
import android.print.PrintDocumentAdapter;
import android.print.PrintDocumentAdapter.LayoutResultCallback;
import android.print.PrintDocumentAdapter.WriteResultCallback;
import android.print.PrintDocumentInfo.Builder;
import android.print.PrintManager;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.RequiresApi;
import java.io.FileNotFoundException;

/* renamed from: b.i.a */
/* compiled from: PrintHelper */
public final class C2148a {

    /* renamed from: g */
    private static final String f8541g = "PrintHelper";

    /* renamed from: h */
    private static final int f8542h = 3500;

    /* renamed from: i */
    static final boolean f8543i;

    /* renamed from: j */
    static final boolean f8544j;

    /* renamed from: k */
    public static final int f8545k = 1;

    /* renamed from: l */
    public static final int f8546l = 2;
    @SuppressLint({"InlinedApi"})

    /* renamed from: m */
    public static final int f8547m = 1;
    @SuppressLint({"InlinedApi"})

    /* renamed from: n */
    public static final int f8548n = 2;

    /* renamed from: o */
    public static final int f8549o = 1;

    /* renamed from: p */
    public static final int f8550p = 2;

    /* renamed from: a */
    final Context f8551a;

    /* renamed from: b */
    Options f8552b = null;

    /* renamed from: c */
    final Object f8553c = new Object();

    /* renamed from: d */
    int f8554d = 2;

    /* renamed from: e */
    int f8555e = 2;

    /* renamed from: f */
    int f8556f = 1;

    /* renamed from: b.i.a$a */
    /* compiled from: PrintHelper */
    class C2149a extends AsyncTask<Void, Void, Throwable> {

        /* renamed from: a */
        final /* synthetic */ CancellationSignal f8557a;

        /* renamed from: b */
        final /* synthetic */ PrintAttributes f8558b;

        /* renamed from: c */
        final /* synthetic */ Bitmap f8559c;

        /* renamed from: d */
        final /* synthetic */ PrintAttributes f8560d;

        /* renamed from: e */
        final /* synthetic */ int f8561e;

        /* renamed from: f */
        final /* synthetic */ ParcelFileDescriptor f8562f;

        /* renamed from: g */
        final /* synthetic */ WriteResultCallback f8563g;

        C2149a(CancellationSignal cancellationSignal, PrintAttributes printAttributes, Bitmap bitmap, PrintAttributes printAttributes2, int i, ParcelFileDescriptor parcelFileDescriptor, WriteResultCallback writeResultCallback) {
            this.f8557a = cancellationSignal;
            this.f8558b = printAttributes;
            this.f8559c = bitmap;
            this.f8560d = printAttributes2;
            this.f8561e = i;
            this.f8562f = parcelFileDescriptor;
            this.f8563g = writeResultCallback;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x00de, code lost:
            r1.recycle();
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x00a3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x00c5 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:46:0x00da */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x00a7 A[Catch:{ all -> 0x00cd, all -> 0x00e2 }] */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x00c9 A[Catch:{ all -> 0x00cd, all -> 0x00e2 }] */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x00de A[Catch:{ all -> 0x00cd, all -> 0x00e2 }] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Throwable doInBackground(java.lang.Void... r8) {
            /*
                r7 = this;
                android.os.CancellationSignal r8 = r7.f8557a     // Catch:{ all -> 0x00e2 }
                boolean r8 = r8.isCanceled()     // Catch:{ all -> 0x00e2 }
                r0 = 0
                if (r8 == 0) goto L_0x000a
                return r0
            L_0x000a:
                android.print.pdf.PrintedPdfDocument r8 = new android.print.pdf.PrintedPdfDocument     // Catch:{ all -> 0x00e2 }
                b.i.a r1 = p053b.p075i.C2148a.this     // Catch:{ all -> 0x00e2 }
                android.content.Context r1 = r1.f8551a     // Catch:{ all -> 0x00e2 }
                android.print.PrintAttributes r2 = r7.f8558b     // Catch:{ all -> 0x00e2 }
                r8.<init>(r1, r2)     // Catch:{ all -> 0x00e2 }
                android.graphics.Bitmap r1 = r7.f8559c     // Catch:{ all -> 0x00e2 }
                android.print.PrintAttributes r2 = r7.f8558b     // Catch:{ all -> 0x00e2 }
                int r2 = r2.getColorMode()     // Catch:{ all -> 0x00e2 }
                android.graphics.Bitmap r1 = p053b.p075i.C2148a.m11135a(r1, r2)     // Catch:{ all -> 0x00e2 }
                android.os.CancellationSignal r2 = r7.f8557a     // Catch:{ all -> 0x00e2 }
                boolean r2 = r2.isCanceled()     // Catch:{ all -> 0x00e2 }
                if (r2 == 0) goto L_0x002a
                return r0
            L_0x002a:
                r2 = 1
                android.graphics.pdf.PdfDocument$Page r3 = r8.startPage(r2)     // Catch:{ all -> 0x00cd }
                boolean r4 = p053b.p075i.C2148a.f8544j     // Catch:{ all -> 0x00cd }
                if (r4 == 0) goto L_0x0041
                android.graphics.RectF r2 = new android.graphics.RectF     // Catch:{ all -> 0x00cd }
                android.graphics.pdf.PdfDocument$PageInfo r4 = r3.getInfo()     // Catch:{ all -> 0x00cd }
                android.graphics.Rect r4 = r4.getContentRect()     // Catch:{ all -> 0x00cd }
                r2.<init>(r4)     // Catch:{ all -> 0x00cd }
                goto L_0x0064
            L_0x0041:
                android.print.pdf.PrintedPdfDocument r4 = new android.print.pdf.PrintedPdfDocument     // Catch:{ all -> 0x00cd }
                b.i.a r5 = p053b.p075i.C2148a.this     // Catch:{ all -> 0x00cd }
                android.content.Context r5 = r5.f8551a     // Catch:{ all -> 0x00cd }
                android.print.PrintAttributes r6 = r7.f8560d     // Catch:{ all -> 0x00cd }
                r4.<init>(r5, r6)     // Catch:{ all -> 0x00cd }
                android.graphics.pdf.PdfDocument$Page r2 = r4.startPage(r2)     // Catch:{ all -> 0x00cd }
                android.graphics.RectF r5 = new android.graphics.RectF     // Catch:{ all -> 0x00cd }
                android.graphics.pdf.PdfDocument$PageInfo r6 = r2.getInfo()     // Catch:{ all -> 0x00cd }
                android.graphics.Rect r6 = r6.getContentRect()     // Catch:{ all -> 0x00cd }
                r5.<init>(r6)     // Catch:{ all -> 0x00cd }
                r4.finishPage(r2)     // Catch:{ all -> 0x00cd }
                r4.close()     // Catch:{ all -> 0x00cd }
                r2 = r5
            L_0x0064:
                int r4 = r1.getWidth()     // Catch:{ all -> 0x00cd }
                int r5 = r1.getHeight()     // Catch:{ all -> 0x00cd }
                int r6 = r7.f8561e     // Catch:{ all -> 0x00cd }
                android.graphics.Matrix r4 = p053b.p075i.C2148a.m11137a(r4, r5, r2, r6)     // Catch:{ all -> 0x00cd }
                boolean r5 = p053b.p075i.C2148a.f8544j     // Catch:{ all -> 0x00cd }
                if (r5 == 0) goto L_0x0077
                goto L_0x0085
            L_0x0077:
                float r5 = r2.left     // Catch:{ all -> 0x00cd }
                float r6 = r2.top     // Catch:{ all -> 0x00cd }
                r4.postTranslate(r5, r6)     // Catch:{ all -> 0x00cd }
                android.graphics.Canvas r5 = r3.getCanvas()     // Catch:{ all -> 0x00cd }
                r5.clipRect(r2)     // Catch:{ all -> 0x00cd }
            L_0x0085:
                android.graphics.Canvas r2 = r3.getCanvas()     // Catch:{ all -> 0x00cd }
                r2.drawBitmap(r1, r4, r0)     // Catch:{ all -> 0x00cd }
                r8.finishPage(r3)     // Catch:{ all -> 0x00cd }
                android.os.CancellationSignal r2 = r7.f8557a     // Catch:{ all -> 0x00cd }
                boolean r2 = r2.isCanceled()     // Catch:{ all -> 0x00cd }
                if (r2 == 0) goto L_0x00ab
                r8.close()     // Catch:{ all -> 0x00e2 }
                android.os.ParcelFileDescriptor r8 = r7.f8562f     // Catch:{ all -> 0x00e2 }
                if (r8 == 0) goto L_0x00a3
                android.os.ParcelFileDescriptor r8 = r7.f8562f     // Catch:{ IOException -> 0x00a3 }
                r8.close()     // Catch:{ IOException -> 0x00a3 }
            L_0x00a3:
                android.graphics.Bitmap r8 = r7.f8559c     // Catch:{ all -> 0x00e2 }
                if (r1 == r8) goto L_0x00aa
                r1.recycle()     // Catch:{ all -> 0x00e2 }
            L_0x00aa:
                return r0
            L_0x00ab:
                java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ all -> 0x00cd }
                android.os.ParcelFileDescriptor r3 = r7.f8562f     // Catch:{ all -> 0x00cd }
                java.io.FileDescriptor r3 = r3.getFileDescriptor()     // Catch:{ all -> 0x00cd }
                r2.<init>(r3)     // Catch:{ all -> 0x00cd }
                r8.writeTo(r2)     // Catch:{ all -> 0x00cd }
                r8.close()     // Catch:{ all -> 0x00e2 }
                android.os.ParcelFileDescriptor r8 = r7.f8562f     // Catch:{ all -> 0x00e2 }
                if (r8 == 0) goto L_0x00c5
                android.os.ParcelFileDescriptor r8 = r7.f8562f     // Catch:{ IOException -> 0x00c5 }
                r8.close()     // Catch:{ IOException -> 0x00c5 }
            L_0x00c5:
                android.graphics.Bitmap r8 = r7.f8559c     // Catch:{ all -> 0x00e2 }
                if (r1 == r8) goto L_0x00cc
                r1.recycle()     // Catch:{ all -> 0x00e2 }
            L_0x00cc:
                return r0
            L_0x00cd:
                r0 = move-exception
                r8.close()     // Catch:{ all -> 0x00e2 }
                android.os.ParcelFileDescriptor r8 = r7.f8562f     // Catch:{ all -> 0x00e2 }
                if (r8 == 0) goto L_0x00da
                android.os.ParcelFileDescriptor r8 = r7.f8562f     // Catch:{ IOException -> 0x00da }
                r8.close()     // Catch:{ IOException -> 0x00da }
            L_0x00da:
                android.graphics.Bitmap r8 = r7.f8559c     // Catch:{ all -> 0x00e2 }
                if (r1 == r8) goto L_0x00e1
                r1.recycle()     // Catch:{ all -> 0x00e2 }
            L_0x00e1:
                throw r0     // Catch:{ all -> 0x00e2 }
            L_0x00e2:
                r8 = move-exception
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p053b.p075i.C2148a.C2149a.doInBackground(java.lang.Void[]):java.lang.Throwable");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Throwable th) {
            if (this.f8557a.isCanceled()) {
                this.f8563g.onWriteCancelled();
            } else if (th == null) {
                this.f8563g.onWriteFinished(new PageRange[]{PageRange.ALL_PAGES});
            } else {
                this.f8563g.onWriteFailed(null);
            }
        }
    }

    /* renamed from: b.i.a$b */
    /* compiled from: PrintHelper */
    public interface C2150b {
        void onFinish();
    }

    @RequiresApi(19)
    /* renamed from: b.i.a$c */
    /* compiled from: PrintHelper */
    private class C2151c extends PrintDocumentAdapter {

        /* renamed from: a */
        private final String f8565a;

        /* renamed from: b */
        private final int f8566b;

        /* renamed from: c */
        private final Bitmap f8567c;

        /* renamed from: d */
        private final C2150b f8568d;

        /* renamed from: e */
        private PrintAttributes f8569e;

        C2151c(String str, int i, Bitmap bitmap, C2150b bVar) {
            this.f8565a = str;
            this.f8566b = i;
            this.f8567c = bitmap;
            this.f8568d = bVar;
        }

        public void onFinish() {
            C2150b bVar = this.f8568d;
            if (bVar != null) {
                bVar.onFinish();
            }
        }

        public void onLayout(PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, LayoutResultCallback layoutResultCallback, Bundle bundle) {
            this.f8569e = printAttributes2;
            layoutResultCallback.onLayoutFinished(new Builder(this.f8565a).setContentType(1).setPageCount(1).build(), !printAttributes2.equals(printAttributes));
        }

        public void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, WriteResultCallback writeResultCallback) {
            C2148a.this.mo9231a(this.f8569e, this.f8566b, this.f8567c, parcelFileDescriptor, cancellationSignal, writeResultCallback);
        }
    }

    @RequiresApi(19)
    /* renamed from: b.i.a$d */
    /* compiled from: PrintHelper */
    private class C2152d extends PrintDocumentAdapter {

        /* renamed from: a */
        final String f8571a;

        /* renamed from: b */
        final Uri f8572b;

        /* renamed from: c */
        final C2150b f8573c;

        /* renamed from: d */
        final int f8574d;

        /* renamed from: e */
        PrintAttributes f8575e;

        /* renamed from: f */
        AsyncTask<Uri, Boolean, Bitmap> f8576f;

        /* renamed from: g */
        Bitmap f8577g = null;

        /* renamed from: b.i.a$d$a */
        /* compiled from: PrintHelper */
        class C2153a extends AsyncTask<Uri, Boolean, Bitmap> {

            /* renamed from: a */
            final /* synthetic */ CancellationSignal f8579a;

            /* renamed from: b */
            final /* synthetic */ PrintAttributes f8580b;

            /* renamed from: c */
            final /* synthetic */ PrintAttributes f8581c;

            /* renamed from: d */
            final /* synthetic */ LayoutResultCallback f8582d;

            /* renamed from: b.i.a$d$a$a */
            /* compiled from: PrintHelper */
            class C2154a implements OnCancelListener {
                C2154a() {
                }

                public void onCancel() {
                    C2152d.this.mo9248a();
                    C2153a.this.cancel(false);
                }
            }

            C2153a(CancellationSignal cancellationSignal, PrintAttributes printAttributes, PrintAttributes printAttributes2, LayoutResultCallback layoutResultCallback) {
                this.f8579a = cancellationSignal;
                this.f8580b = printAttributes;
                this.f8581c = printAttributes2;
                this.f8582d = layoutResultCallback;
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public Bitmap doInBackground(Uri... uriArr) {
                try {
                    return C2148a.this.mo9229a(C2152d.this.f8572b);
                } catch (FileNotFoundException unused) {
                    return null;
                }
            }

            /* access modifiers changed from: protected */
            /* renamed from: b */
            public void onPostExecute(Bitmap bitmap) {
                MediaSize mediaSize;
                super.onPostExecute(bitmap);
                if (bitmap != null && (!C2148a.f8543i || C2148a.this.f8556f == 0)) {
                    synchronized (this) {
                        mediaSize = C2152d.this.f8575e.getMediaSize();
                    }
                    if (!(mediaSize == null || mediaSize.isPortrait() == C2148a.m11139a(bitmap))) {
                        Matrix matrix = new Matrix();
                        matrix.postRotate(90.0f);
                        bitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                    }
                }
                C2152d dVar = C2152d.this;
                dVar.f8577g = bitmap;
                if (bitmap != null) {
                    this.f8582d.onLayoutFinished(new Builder(dVar.f8571a).setContentType(1).setPageCount(1).build(), true ^ this.f8580b.equals(this.f8581c));
                } else {
                    this.f8582d.onLayoutFailed(null);
                }
                C2152d.this.f8576f = null;
            }

            /* access modifiers changed from: protected */
            public void onPreExecute() {
                this.f8579a.setOnCancelListener(new C2154a());
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void onCancelled(Bitmap bitmap) {
                this.f8582d.onLayoutCancelled();
                C2152d.this.f8576f = null;
            }
        }

        C2152d(String str, Uri uri, C2150b bVar, int i) {
            this.f8571a = str;
            this.f8572b = uri;
            this.f8573c = bVar;
            this.f8574d = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo9248a() {
            synchronized (C2148a.this.f8553c) {
                if (C2148a.this.f8552b != null) {
                    if (VERSION.SDK_INT < 24) {
                        C2148a.this.f8552b.requestCancelDecode();
                    }
                    C2148a.this.f8552b = null;
                }
            }
        }

        public void onFinish() {
            super.onFinish();
            mo9248a();
            AsyncTask<Uri, Boolean, Bitmap> asyncTask = this.f8576f;
            if (asyncTask != null) {
                asyncTask.cancel(true);
            }
            C2150b bVar = this.f8573c;
            if (bVar != null) {
                bVar.onFinish();
            }
            Bitmap bitmap = this.f8577g;
            if (bitmap != null) {
                bitmap.recycle();
                this.f8577g = null;
            }
        }

        public void onLayout(PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, LayoutResultCallback layoutResultCallback, Bundle bundle) {
            synchronized (this) {
                this.f8575e = printAttributes2;
            }
            if (cancellationSignal.isCanceled()) {
                layoutResultCallback.onLayoutCancelled();
            } else if (this.f8577g != null) {
                layoutResultCallback.onLayoutFinished(new Builder(this.f8571a).setContentType(1).setPageCount(1).build(), !printAttributes2.equals(printAttributes));
            } else {
                C2153a aVar = new C2153a(cancellationSignal, printAttributes2, printAttributes, layoutResultCallback);
                this.f8576f = aVar.execute(new Uri[0]);
            }
        }

        public void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, WriteResultCallback writeResultCallback) {
            C2148a.this.mo9231a(this.f8575e, this.f8574d, this.f8577g, parcelFileDescriptor, cancellationSignal, writeResultCallback);
        }
    }

    static {
        int i = VERSION.SDK_INT;
        boolean z = false;
        f8543i = i < 20 || i > 23;
        if (VERSION.SDK_INT != 23) {
            z = true;
        }
        f8544j = z;
    }

    public C2148a(@C0193h0 Context context) {
        this.f8551a = context;
    }

    /* renamed from: d */
    public static boolean m11140d() {
        return VERSION.SDK_INT >= 19;
    }

    /* renamed from: a */
    public void mo9230a(int i) {
        this.f8555e = i;
    }

    /* renamed from: b */
    public void mo9237b(int i) {
        this.f8556f = i;
    }

    /* renamed from: c */
    public void mo9239c(int i) {
        this.f8554d = i;
    }

    /* renamed from: a */
    public int mo9228a() {
        return this.f8555e;
    }

    /* renamed from: b */
    public int mo9236b() {
        if (VERSION.SDK_INT < 19 || this.f8556f != 0) {
            return this.f8556f;
        }
        return 1;
    }

    /* renamed from: c */
    public int mo9238c() {
        return this.f8554d;
    }

    /* renamed from: a */
    public void mo9232a(@C0193h0 String str, @C0193h0 Bitmap bitmap) {
        mo9233a(str, bitmap, (C2150b) null);
    }

    /* renamed from: a */
    public void mo9233a(@C0193h0 String str, @C0193h0 Bitmap bitmap, @C0195i0 C2150b bVar) {
        MediaSize mediaSize;
        if (VERSION.SDK_INT >= 19 && bitmap != null) {
            PrintManager printManager = (PrintManager) this.f8551a.getSystemService("print");
            if (m11139a(bitmap)) {
                mediaSize = MediaSize.UNKNOWN_PORTRAIT;
            } else {
                mediaSize = MediaSize.UNKNOWN_LANDSCAPE;
            }
            PrintAttributes build = new PrintAttributes.Builder().setMediaSize(mediaSize).setColorMode(this.f8555e).build();
            C2151c cVar = new C2151c(str, this.f8554d, bitmap, bVar);
            printManager.print(str, cVar, build);
        }
    }

    /* renamed from: a */
    public void mo9234a(@C0193h0 String str, @C0193h0 Uri uri) throws FileNotFoundException {
        mo9235a(str, uri, (C2150b) null);
    }

    /* renamed from: a */
    public void mo9235a(@C0193h0 String str, @C0193h0 Uri uri, @C0195i0 C2150b bVar) throws FileNotFoundException {
        if (VERSION.SDK_INT >= 19) {
            C2152d dVar = new C2152d(str, uri, bVar, this.f8554d);
            PrintManager printManager = (PrintManager) this.f8551a.getSystemService("print");
            PrintAttributes.Builder builder = new PrintAttributes.Builder();
            builder.setColorMode(this.f8555e);
            int i = this.f8556f;
            if (i == 1 || i == 0) {
                builder.setMediaSize(MediaSize.UNKNOWN_LANDSCAPE);
            } else if (i == 2) {
                builder.setMediaSize(MediaSize.UNKNOWN_PORTRAIT);
            }
            printManager.print(str, dVar, builder.build());
        }
    }

    /* renamed from: a */
    static boolean m11139a(Bitmap bitmap) {
        return bitmap.getWidth() <= bitmap.getHeight();
    }

    @RequiresApi(19)
    /* renamed from: a */
    private static PrintAttributes.Builder m11138a(PrintAttributes printAttributes) {
        PrintAttributes.Builder minMargins = new PrintAttributes.Builder().setMediaSize(printAttributes.getMediaSize()).setResolution(printAttributes.getResolution()).setMinMargins(printAttributes.getMinMargins());
        if (printAttributes.getColorMode() != 0) {
            minMargins.setColorMode(printAttributes.getColorMode());
        }
        if (VERSION.SDK_INT >= 23 && printAttributes.getDuplexMode() != 0) {
            minMargins.setDuplexMode(printAttributes.getDuplexMode());
        }
        return minMargins;
    }

    /* renamed from: a */
    static Matrix m11137a(int i, int i2, RectF rectF, int i3) {
        float f;
        Matrix matrix = new Matrix();
        float f2 = (float) i;
        float width = rectF.width() / f2;
        if (i3 == 2) {
            f = Math.max(width, rectF.height() / ((float) i2));
        } else {
            f = Math.min(width, rectF.height() / ((float) i2));
        }
        matrix.postScale(f, f);
        matrix.postTranslate((rectF.width() - (f2 * f)) / 2.0f, (rectF.height() - (((float) i2) * f)) / 2.0f);
        return matrix;
    }

    /* access modifiers changed from: 0000 */
    @RequiresApi(19)
    /* renamed from: a */
    public void mo9231a(PrintAttributes printAttributes, int i, Bitmap bitmap, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, WriteResultCallback writeResultCallback) {
        PrintAttributes printAttributes2;
        if (f8544j) {
            printAttributes2 = printAttributes;
        } else {
            printAttributes2 = m11138a(printAttributes).setMinMargins(new Margins(0, 0, 0, 0)).build();
        }
        C2149a aVar = new C2149a(cancellationSignal, printAttributes2, bitmap, printAttributes, i, parcelFileDescriptor, writeResultCallback);
        aVar.execute(new Void[0]);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Bitmap mo9229a(Uri uri) throws FileNotFoundException {
        Options options;
        if (uri == null || this.f8551a == null) {
            throw new IllegalArgumentException("bad argument to getScaledBitmap");
        }
        Options options2 = new Options();
        options2.inJustDecodeBounds = true;
        m11136a(uri, options2);
        int i = options2.outWidth;
        int i2 = options2.outHeight;
        if (i > 0 && i2 > 0) {
            int max = Math.max(i, i2);
            int i3 = 1;
            while (max > f8542h) {
                max >>>= 1;
                i3 <<= 1;
            }
            if (i3 > 0 && Math.min(i, i2) / i3 > 0) {
                synchronized (this.f8553c) {
                    this.f8552b = new Options();
                    this.f8552b.inMutable = true;
                    this.f8552b.inSampleSize = i3;
                    options = this.f8552b;
                }
                try {
                    Bitmap a = m11136a(uri, options);
                    synchronized (this.f8553c) {
                        this.f8552b = null;
                    }
                    return a;
                } catch (Throwable th) {
                    synchronized (this.f8553c) {
                        this.f8552b = null;
                        throw th;
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x001f A[SYNTHETIC, Splitter:B:17:0x001f] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.Bitmap m11136a(android.net.Uri r3, android.graphics.BitmapFactory.Options r4) throws java.io.FileNotFoundException {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x0023
            android.content.Context r0 = r2.f8551a
            if (r0 == 0) goto L_0x0023
            r1 = 0
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch:{ all -> 0x001c }
            java.io.InputStream r3 = r0.openInputStream(r3)     // Catch:{ all -> 0x001c }
            android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeStream(r3, r1, r4)     // Catch:{ all -> 0x0019 }
            if (r3 == 0) goto L_0x0018
            r3.close()     // Catch:{ IOException -> 0x0018 }
        L_0x0018:
            return r4
        L_0x0019:
            r4 = move-exception
            r1 = r3
            goto L_0x001d
        L_0x001c:
            r4 = move-exception
        L_0x001d:
            if (r1 == 0) goto L_0x0022
            r1.close()     // Catch:{ IOException -> 0x0022 }
        L_0x0022:
            throw r4
        L_0x0023:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "bad argument to loadBitmap"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p053b.p075i.C2148a.m11136a(android.net.Uri, android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    /* renamed from: a */
    static Bitmap m11135a(Bitmap bitmap, int i) {
        if (i != 1) {
            return bitmap;
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }
}
