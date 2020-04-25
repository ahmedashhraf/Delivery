package p076c.p082c.p083a.p088u.p089h;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore.Images.Thumbnails;
import android.provider.MediaStore.Video;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.resource.bitmap.ImageHeaderParser;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import p076c.p082c.p083a.C2244p;

/* renamed from: c.c.a.u.h.i */
/* compiled from: MediaStoreThumbFetcher */
public class C2288i implements C2279c<InputStream> {

    /* renamed from: h */
    private static final String f9116h = "MediaStoreThumbFetcher";

    /* renamed from: i */
    private static final int f9117i = 512;

    /* renamed from: j */
    private static final int f9118j = 384;

    /* renamed from: k */
    private static final C2293e f9119k = new C2293e();

    /* renamed from: a */
    private final Context f9120a;

    /* renamed from: b */
    private final Uri f9121b;

    /* renamed from: c */
    private final C2279c<InputStream> f9122c;

    /* renamed from: d */
    private final int f9123d;

    /* renamed from: e */
    private final int f9124e;

    /* renamed from: f */
    private final C2293e f9125f;

    /* renamed from: g */
    private InputStream f9126g;

    /* renamed from: c.c.a.u.h.i$a */
    /* compiled from: MediaStoreThumbFetcher */
    static class C2289a {
        C2289a() {
        }

        /* renamed from: a */
        public boolean mo9661a(File file) {
            return file.exists();
        }

        /* renamed from: b */
        public long mo9662b(File file) {
            return file.length();
        }

        /* renamed from: a */
        public File mo9660a(String str) {
            return new File(str);
        }
    }

    /* renamed from: c.c.a.u.h.i$b */
    /* compiled from: MediaStoreThumbFetcher */
    static class C2290b implements C2291c {

        /* renamed from: a */
        private static final String[] f9127a = {"_data"};

        /* renamed from: b */
        private static final String f9128b = "kind = 1 AND image_id = ?";

        C2290b() {
        }

        /* renamed from: a */
        public Cursor mo9663a(Context context, Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return context.getContentResolver().query(Thumbnails.EXTERNAL_CONTENT_URI, f9127a, f9128b, new String[]{lastPathSegment}, null);
        }
    }

    /* renamed from: c.c.a.u.h.i$c */
    /* compiled from: MediaStoreThumbFetcher */
    interface C2291c {
        /* renamed from: a */
        Cursor mo9663a(Context context, Uri uri);
    }

    /* renamed from: c.c.a.u.h.i$d */
    /* compiled from: MediaStoreThumbFetcher */
    static class C2292d {

        /* renamed from: c */
        private static final C2289a f9129c = new C2289a();

        /* renamed from: a */
        private final C2289a f9130a;

        /* renamed from: b */
        private C2291c f9131b;

        public C2292d(C2291c cVar) {
            this(f9129c, cVar);
        }

        /* renamed from: a */
        public int mo9664a(Context context, Uri uri) {
            InputStream inputStream = null;
            try {
                inputStream = context.getContentResolver().openInputStream(uri);
                int a = new ImageHeaderParser(inputStream).mo11737a();
                if (inputStream == null) {
                    return a;
                }
                try {
                    inputStream.close();
                    return a;
                } catch (IOException unused) {
                    return a;
                }
            } catch (IOException unused2) {
                inputStream = Log.isLoggable(C2288i.f9116h, 3);
                if (inputStream) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to open uri: ");
                    sb.append(uri);
                    sb.toString();
                }
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused3) {
                    }
                }
                return -1;
            } finally {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused4) {
                    }
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x001e  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0023  */
        /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.io.InputStream mo9665b(android.content.Context r3, android.net.Uri r4) throws java.io.FileNotFoundException {
            /*
                r2 = this;
                c.c.a.u.h.i$c r0 = r2.f9131b
                android.database.Cursor r4 = r0.mo9663a(r3, r4)
                r0 = 0
                if (r4 == 0) goto L_0x001b
                boolean r1 = r4.moveToFirst()     // Catch:{ all -> 0x0014 }
                if (r1 == 0) goto L_0x001b
                android.net.Uri r1 = r2.m11950a(r4)     // Catch:{ all -> 0x0014 }
                goto L_0x001c
            L_0x0014:
                r3 = move-exception
                if (r4 == 0) goto L_0x001a
                r4.close()
            L_0x001a:
                throw r3
            L_0x001b:
                r1 = r0
            L_0x001c:
                if (r4 == 0) goto L_0x0021
                r4.close()
            L_0x0021:
                if (r1 == 0) goto L_0x002b
                android.content.ContentResolver r3 = r3.getContentResolver()
                java.io.InputStream r0 = r3.openInputStream(r1)
            L_0x002b:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p076c.p082c.p083a.p088u.p089h.C2288i.C2292d.mo9665b(android.content.Context, android.net.Uri):java.io.InputStream");
        }

        public C2292d(C2289a aVar, C2291c cVar) {
            this.f9130a = aVar;
            this.f9131b = cVar;
        }

        /* renamed from: a */
        private Uri m11950a(Cursor cursor) {
            String string = cursor.getString(0);
            if (!TextUtils.isEmpty(string)) {
                File a = this.f9130a.mo9660a(string);
                if (this.f9130a.mo9661a(a) && this.f9130a.mo9662b(a) > 0) {
                    return Uri.fromFile(a);
                }
            }
            return null;
        }
    }

    /* renamed from: c.c.a.u.h.i$e */
    /* compiled from: MediaStoreThumbFetcher */
    static class C2293e {
        C2293e() {
        }

        /* renamed from: a */
        public C2292d mo9666a(Uri uri, int i, int i2) {
            if (!C2288i.m11940c(uri) || i > 512 || i2 > 384) {
                return null;
            }
            if (C2288i.m11941d(uri)) {
                return new C2292d(new C2294f());
            }
            return new C2292d(new C2290b());
        }
    }

    /* renamed from: c.c.a.u.h.i$f */
    /* compiled from: MediaStoreThumbFetcher */
    static class C2294f implements C2291c {

        /* renamed from: a */
        private static final String[] f9132a = {"_data"};

        /* renamed from: b */
        private static final String f9133b = "kind = 1 AND video_id = ?";

        C2294f() {
        }

        /* renamed from: a */
        public Cursor mo9663a(Context context, Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return context.getContentResolver().query(Video.Thumbnails.EXTERNAL_CONTENT_URI, f9132a, f9133b, new String[]{lastPathSegment}, null);
        }
    }

    public C2288i(Context context, Uri uri, C2279c<InputStream> cVar, int i, int i2) {
        this(context, uri, cVar, i, i2, f9119k);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static boolean m11940c(Uri uri) {
        if (uri != null) {
            if ("content".equals(uri.getScheme())) {
                if ("media".equals(uri.getAuthority())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static boolean m11941d(Uri uri) {
        return m11940c(uri) && uri.getPathSegments().contains("video");
    }

    public void cancel() {
    }

    public String getId() {
        return this.f9121b.toString();
    }

    C2288i(Context context, Uri uri, C2279c<InputStream> cVar, int i, int i2, C2293e eVar) {
        this.f9120a = context;
        this.f9121b = uri;
        this.f9122c = cVar;
        this.f9123d = i;
        this.f9124e = i2;
        this.f9125f = eVar;
    }

    /* renamed from: a */
    public InputStream m11943a(C2244p pVar) throws Exception {
        C2292d a = this.f9125f.mo9666a(this.f9121b, this.f9123d, this.f9124e);
        if (a != null) {
            this.f9126g = m11937a(a);
        }
        if (this.f9126g == null) {
            this.f9126g = (InputStream) this.f9122c.mo9644a(pVar);
        }
        return this.f9126g;
    }

    /* renamed from: a */
    private InputStream m11937a(C2292d dVar) {
        InputStream inputStream;
        try {
            inputStream = dVar.mo9665b(this.f9120a, this.f9121b);
        } catch (FileNotFoundException unused) {
            boolean isLoggable = Log.isLoggable(f9116h, 3);
            inputStream = null;
        }
        int a = inputStream != null ? dVar.mo9664a(this.f9120a, this.f9121b) : -1;
        return a != -1 ? new C2280d(inputStream, a) : inputStream;
    }

    /* renamed from: a */
    public void mo9645a() {
        InputStream inputStream = this.f9126g;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        this.f9122c.mo9645a();
    }
}
