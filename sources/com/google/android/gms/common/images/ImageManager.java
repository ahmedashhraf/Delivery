package com.google.android.gms.common.images;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.widget.ImageView;
import androidx.collection.LruCache;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.C4311d;
import com.google.android.gms.common.internal.C4337h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import p076c.p112d.p113a.p114a.p118d.p121c.C2604j;
import p076c.p112d.p113a.p114a.p118d.p121c.C2608n;
import p076c.p112d.p113a.p114a.p118d.p121c.C2609o;
import p076c.p112d.p113a.p114a.p118d.p121c.C2612r;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class ImageManager {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final Object f13295i = new Object();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static HashSet<Uri> f13296j = new HashSet<>();

    /* renamed from: k */
    private static ImageManager f13297k;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f13298a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Handler f13299b = new C2612r(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final ExecutorService f13300c = C2608n.m12715a().mo10124a(4, C2609o.f9723b);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C4289b f13301d = null;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C2604j f13302e = new C2604j();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Map<C4295c, ImageReceiver> f13303f = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Map<Uri, ImageReceiver> f13304g = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final Map<Uri, Long> f13305h = new HashMap();

    @KeepName
    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    private final class ImageReceiver extends ResultReceiver {

        /* renamed from: a */
        private final Uri f13307a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final ArrayList<C4295c> f13308b = new ArrayList<>();

        ImageReceiver(Uri uri) {
            super(new C2612r(Looper.getMainLooper()));
            this.f13307a = uri;
        }

        /* renamed from: a */
        public final void mo18136a(C4295c cVar) {
            C4311d.m18638a("ImageReceiver.addImageRequest() must be called in the main thread");
            this.f13308b.add(cVar);
        }

        /* renamed from: b */
        public final void mo18137b(C4295c cVar) {
            C4311d.m18638a("ImageReceiver.removeImageRequest() must be called in the main thread");
            this.f13308b.remove(cVar);
        }

        public final void onReceiveResult(int i, Bundle bundle) {
            ImageManager.this.f13300c.execute(new C4291d(this.f13307a, (ParcelFileDescriptor) bundle.getParcelable("com.google.android.gms.extra.fileDescriptor")));
        }

        /* renamed from: a */
        public final void mo18135a() {
            Intent intent = new Intent(C4337h.f13485c);
            intent.putExtra(C4337h.f13486d, this.f13307a);
            intent.putExtra(C4337h.f13487e, this);
            intent.putExtra(C4337h.f13488f, 3);
            ImageManager.this.f13298a.sendBroadcast(intent);
        }
    }

    /* renamed from: com.google.android.gms.common.images.ImageManager$a */
    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public interface C4288a {
        /* renamed from: a */
        void mo18139a(Uri uri, Drawable drawable, boolean z);
    }

    /* renamed from: com.google.android.gms.common.images.ImageManager$b */
    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    private static final class C4289b extends LruCache<C4294b, Bitmap> {
        /* access modifiers changed from: protected */
        public final /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
            super.entryRemoved(z, (C4294b) obj, (Bitmap) obj2, (Bitmap) obj3);
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ int sizeOf(Object obj, Object obj2) {
            Bitmap bitmap = (Bitmap) obj2;
            return bitmap.getHeight() * bitmap.getRowBytes();
        }
    }

    /* renamed from: com.google.android.gms.common.images.ImageManager$c */
    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    private final class C4290c implements Runnable {

        /* renamed from: a */
        private final C4295c f13309a;

        public C4290c(C4295c cVar) {
            this.f13309a = cVar;
        }

        public final void run() {
            C4311d.m18638a("LoadImageRunnable must be executed on the main thread");
            ImageReceiver imageReceiver = (ImageReceiver) ImageManager.this.f13303f.get(this.f13309a);
            if (imageReceiver != null) {
                ImageManager.this.f13303f.remove(this.f13309a);
                imageReceiver.mo18137b(this.f13309a);
            }
            C4295c cVar = this.f13309a;
            C4294b bVar = cVar.f13326a;
            if (bVar.f13325a == null) {
                cVar.mo18160a(ImageManager.this.f13298a, ImageManager.this.f13302e, true);
                return;
            }
            Bitmap a = ImageManager.this.m18538a(bVar);
            if (a != null) {
                this.f13309a.mo18158a(ImageManager.this.f13298a, a, true);
                return;
            }
            Long l = (Long) ImageManager.this.f13305h.get(bVar.f13325a);
            if (l != null) {
                if (SystemClock.elapsedRealtime() - l.longValue() < 3600000) {
                    this.f13309a.mo18160a(ImageManager.this.f13298a, ImageManager.this.f13302e, true);
                    return;
                }
                ImageManager.this.f13305h.remove(bVar.f13325a);
            }
            this.f13309a.mo18159a(ImageManager.this.f13298a, ImageManager.this.f13302e);
            ImageReceiver imageReceiver2 = (ImageReceiver) ImageManager.this.f13304g.get(bVar.f13325a);
            if (imageReceiver2 == null) {
                imageReceiver2 = new ImageReceiver(bVar.f13325a);
                ImageManager.this.f13304g.put(bVar.f13325a, imageReceiver2);
            }
            imageReceiver2.mo18136a(this.f13309a);
            if (!(this.f13309a instanceof C4296d)) {
                ImageManager.this.f13303f.put(this.f13309a, imageReceiver2);
            }
            synchronized (ImageManager.f13295i) {
                if (!ImageManager.f13296j.contains(bVar.f13325a)) {
                    ImageManager.f13296j.add(bVar.f13325a);
                    imageReceiver2.mo18135a();
                }
            }
        }
    }

    /* renamed from: com.google.android.gms.common.images.ImageManager$d */
    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    private final class C4291d implements Runnable {

        /* renamed from: a */
        private final Uri f13312a;

        /* renamed from: b */
        private final ParcelFileDescriptor f13313b;

        public C4291d(Uri uri, ParcelFileDescriptor parcelFileDescriptor) {
            this.f13312a = uri;
            this.f13313b = parcelFileDescriptor;
        }

        public final void run() {
            boolean z;
            Bitmap bitmap;
            C4311d.m18642b("LoadBitmapFromDiskRunnable can't be executed in the main thread");
            ParcelFileDescriptor parcelFileDescriptor = this.f13313b;
            boolean z2 = false;
            Bitmap bitmap2 = null;
            if (parcelFileDescriptor != null) {
                try {
                    bitmap2 = BitmapFactory.decodeFileDescriptor(parcelFileDescriptor.getFileDescriptor());
                } catch (OutOfMemoryError unused) {
                    String valueOf = String.valueOf(this.f13312a);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
                    sb.append("OOM while loading bitmap for uri: ");
                    sb.append(valueOf);
                    sb.toString();
                    z2 = true;
                }
                try {
                    this.f13313b.close();
                } catch (IOException unused2) {
                }
                z = z2;
                bitmap = bitmap2;
            } else {
                bitmap = null;
                z = false;
            }
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Handler g = ImageManager.this.f13299b;
            C4292e eVar = new C4292e(this.f13312a, bitmap, z, countDownLatch);
            g.post(eVar);
            try {
                countDownLatch.await();
            } catch (InterruptedException unused3) {
                String valueOf2 = String.valueOf(this.f13312a);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 32);
                sb2.append("Latch interrupted while posting ");
                sb2.append(valueOf2);
                sb2.toString();
            }
        }
    }

    /* renamed from: com.google.android.gms.common.images.ImageManager$e */
    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    private final class C4292e implements Runnable {

        /* renamed from: N */
        private final CountDownLatch f13314N;

        /* renamed from: O */
        private boolean f13315O;

        /* renamed from: a */
        private final Uri f13317a;

        /* renamed from: b */
        private final Bitmap f13318b;

        public C4292e(Uri uri, Bitmap bitmap, boolean z, CountDownLatch countDownLatch) {
            this.f13317a = uri;
            this.f13318b = bitmap;
            this.f13315O = z;
            this.f13314N = countDownLatch;
        }

        public final void run() {
            C4311d.m18638a("OnBitmapLoadedRunnable must be executed in the main thread");
            boolean z = this.f13318b != null;
            if (ImageManager.this.f13301d != null) {
                if (this.f13315O) {
                    ImageManager.this.f13301d.evictAll();
                    System.gc();
                    this.f13315O = false;
                    ImageManager.this.f13299b.post(this);
                    return;
                } else if (z) {
                    ImageManager.this.f13301d.put(new C4294b(this.f13317a), this.f13318b);
                }
            }
            ImageReceiver imageReceiver = (ImageReceiver) ImageManager.this.f13304g.remove(this.f13317a);
            if (imageReceiver != null) {
                ArrayList a = imageReceiver.f13308b;
                int size = a.size();
                for (int i = 0; i < size; i++) {
                    C4295c cVar = (C4295c) a.get(i);
                    if (z) {
                        cVar.mo18158a(ImageManager.this.f13298a, this.f13318b, false);
                    } else {
                        ImageManager.this.f13305h.put(this.f13317a, Long.valueOf(SystemClock.elapsedRealtime()));
                        cVar.mo18160a(ImageManager.this.f13298a, ImageManager.this.f13302e, false);
                    }
                    if (!(cVar instanceof C4296d)) {
                        ImageManager.this.f13303f.remove(cVar);
                    }
                }
            }
            this.f13314N.countDown();
            synchronized (ImageManager.f13295i) {
                ImageManager.f13296j.remove(this.f13317a);
            }
        }
    }

    private ImageManager(Context context, boolean z) {
        this.f13298a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static ImageManager m18539a(Context context) {
        if (f13297k == null) {
            f13297k = new ImageManager(context, false);
        }
        return f13297k;
    }

    /* renamed from: a */
    public final void mo18131a(ImageView imageView, Uri uri) {
        m18542a((C4295c) new C4297e(imageView, uri));
    }

    /* renamed from: a */
    public final void mo18130a(ImageView imageView, int i) {
        m18542a((C4295c) new C4297e(imageView, i));
    }

    /* renamed from: a */
    public final void mo18132a(ImageView imageView, Uri uri, int i) {
        C4297e eVar = new C4297e(imageView, uri);
        eVar.f13328c = i;
        m18542a((C4295c) eVar);
    }

    /* renamed from: a */
    public final void mo18133a(C4288a aVar, Uri uri) {
        m18542a((C4295c) new C4296d(aVar, uri));
    }

    /* renamed from: a */
    public final void mo18134a(C4288a aVar, Uri uri, int i) {
        C4296d dVar = new C4296d(aVar, uri);
        dVar.f13328c = i;
        m18542a((C4295c) dVar);
    }

    /* renamed from: a */
    private final void m18542a(C4295c cVar) {
        C4311d.m18638a("ImageManager.loadImage() must be called in the main thread");
        new C4290c(cVar).run();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Bitmap m18538a(C4294b bVar) {
        C4289b bVar2 = this.f13301d;
        if (bVar2 == null) {
            return null;
        }
        return (Bitmap) bVar2.get(bVar);
    }
}
