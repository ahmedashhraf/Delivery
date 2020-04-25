package com.clevertap.android.sdk;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.LruCache;
import com.bogdwellers.pinchtozoom.C2945d;
import java.util.ArrayList;
import java.util.Iterator;
import org.jivesoftware.smackx.xhtmlim.packet.XHTMLExtension;
import org.json.JSONException;
import org.json.JSONObject;

class CTInAppNotification implements Parcelable {
    public static final Creator<CTInAppNotification> CREATOR = new C3029a();

    /* renamed from: N */
    private String f10766N;

    /* renamed from: O */
    private C3071b0 f10767O;

    /* renamed from: P */
    private String f10768P;

    /* renamed from: Q */
    private boolean f10769Q;

    /* renamed from: R */
    private boolean f10770R;

    /* renamed from: S */
    private boolean f10771S;

    /* renamed from: T */
    private int f10772T;

    /* renamed from: U */
    private int f10773U;

    /* renamed from: V */
    private int f10774V;

    /* renamed from: W */
    private char f10775W;

    /* renamed from: X */
    private int f10776X;

    /* renamed from: Y */
    private int f10777Y;

    /* renamed from: Z */
    private int f10778Z;

    /* renamed from: a */
    private String f10779a;

    /* renamed from: a0 */
    private int f10780a0;

    /* renamed from: b */
    private String f10781b;

    /* renamed from: b0 */
    private String f10782b0;

    /* renamed from: c0 */
    private String f10783c0;

    /* renamed from: d0 */
    private String f10784d0;

    /* renamed from: e0 */
    private String f10785e0;

    /* renamed from: f0 */
    private String f10786f0;

    /* renamed from: g0 */
    private boolean f10787g0;

    /* renamed from: h0 */
    private ArrayList<CTInAppNotificationButton> f10788h0;

    /* renamed from: i0 */
    private ArrayList<CTInAppNotificationMedia> f10789i0;

    /* renamed from: j0 */
    private int f10790j0;

    /* renamed from: k0 */
    private JSONObject f10791k0;

    /* renamed from: l0 */
    private String f10792l0;

    /* renamed from: m0 */
    private JSONObject f10793m0;

    /* renamed from: n0 */
    private JSONObject f10794n0;

    /* renamed from: o0 */
    C3031c f10795o0;

    /* renamed from: p0 */
    private boolean f10796p0;

    /* renamed from: q0 */
    private boolean f10797q0;

    /* renamed from: r0 */
    private String f10798r0;

    /* renamed from: s0 */
    private boolean f10799s0;

    /* renamed from: t0 */
    private boolean f10800t0;

    /* renamed from: u0 */
    private boolean f10801u0;

    /* renamed from: v0 */
    private String f10802v0;

    /* renamed from: w0 */
    private String f10803w0;

    /* renamed from: com.clevertap.android.sdk.CTInAppNotification$a */
    static class C3029a implements Creator<CTInAppNotification> {
        C3029a() {
        }

        public CTInAppNotification createFromParcel(Parcel parcel) {
            return new CTInAppNotification(parcel, null);
        }

        public CTInAppNotification[] newArray(int i) {
            return new CTInAppNotification[i];
        }
    }

    /* renamed from: com.clevertap.android.sdk.CTInAppNotification$b */
    static /* synthetic */ class C3030b {

        /* renamed from: a */
        static final /* synthetic */ int[] f10804a = new int[C3071b0.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.clevertap.android.sdk.b0[] r0 = com.clevertap.android.sdk.C3071b0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10804a = r0
                int[] r0 = f10804a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.clevertap.android.sdk.b0 r1 = com.clevertap.android.sdk.C3071b0.CTInAppTypeFooter     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f10804a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.clevertap.android.sdk.b0 r1 = com.clevertap.android.sdk.C3071b0.CTInAppTypeHeader     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f10804a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.clevertap.android.sdk.b0 r1 = com.clevertap.android.sdk.C3071b0.CTInAppTypeCover     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f10804a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.clevertap.android.sdk.b0 r1 = com.clevertap.android.sdk.C3071b0.CTInAppTypeHalfInterstitial     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f10804a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.clevertap.android.sdk.b0 r1 = com.clevertap.android.sdk.C3071b0.CTInAppTypeCoverImageOnly     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f10804a     // Catch:{ NoSuchFieldError -> 0x004b }
                com.clevertap.android.sdk.b0 r1 = com.clevertap.android.sdk.C3071b0.CTInAppTypeHalfInterstitialImageOnly     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f10804a     // Catch:{ NoSuchFieldError -> 0x0056 }
                com.clevertap.android.sdk.b0 r1 = com.clevertap.android.sdk.C3071b0.CTInAppTypeInterstitialImageOnly     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.clevertap.android.sdk.CTInAppNotification.C3030b.<clinit>():void");
        }
    }

    /* renamed from: com.clevertap.android.sdk.CTInAppNotification$c */
    interface C3031c {
        /* renamed from: a */
        void mo11958a(CTInAppNotification cTInAppNotification);
    }

    /* renamed from: com.clevertap.android.sdk.CTInAppNotification$d */
    private static class C3032d {

        /* renamed from: a */
        private static final int f10805a = 5120;

        /* renamed from: b */
        private static final int f10806b = (((int) Runtime.getRuntime().maxMemory()) / 1024);

        /* renamed from: c */
        private static final int f10807c = Math.max(f10806b / 32, f10805a);

        /* renamed from: d */
        private static LruCache<String, byte[]> f10808d;

        /* renamed from: com.clevertap.android.sdk.CTInAppNotification$d$a */
        static class C3033a extends LruCache<String, byte[]> {
            C3033a(int i) {
                super(i);
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public int sizeOf(String str, byte[] bArr) {
                int a = C3032d.m14507b(bArr);
                StringBuilder sb = new StringBuilder();
                sb.append("CTInAppNotification.GifCache: have gif of size: ");
                sb.append(a);
                sb.append("KB for key: ");
                sb.append(str);
                C3111h1.m14938f(sb.toString());
                return a;
            }
        }

        private C3032d() {
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static int m14507b(byte[] bArr) {
            return bArr.length / 1024;
        }

        /* renamed from: c */
        static void m14509c() {
            synchronized (C3032d.class) {
                if (f10808d == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("CTInAppNotification.GifCache: init with max device memory: ");
                    sb.append(String.valueOf(f10806b));
                    sb.append("KB and allocated cache size: ");
                    sb.append(String.valueOf(f10807c));
                    sb.append("KB");
                    C3111h1.m14938f(sb.toString());
                    try {
                        f10808d = new C3033a(f10807c);
                    } catch (Throwable th) {
                        C3111h1.m14941f("CTInAppNotification.GifCache: unable to initialize cache: ", th.getCause());
                    }
                }
            }
        }

        /* renamed from: d */
        private static boolean m14510d() {
            boolean z;
            synchronized (C3032d.class) {
                z = f10808d.size() <= 0;
            }
            return z;
        }

        /* renamed from: a */
        private static void m14503a() {
            synchronized (C3032d.class) {
                if (m14510d()) {
                    C3111h1.m14938f("CTInAppNotification.GifCache: cache is empty, removing it");
                    f10808d = null;
                }
            }
        }

        /* renamed from: b */
        private static int m14506b() {
            int size;
            synchronized (C3032d.class) {
                size = f10808d == null ? 0 : f10807c - f10808d.size();
            }
            return size;
        }

        /* renamed from: b */
        static void m14508b(String str) {
            synchronized (C3032d.class) {
                if (f10808d != null) {
                    f10808d.remove(str);
                    StringBuilder sb = new StringBuilder();
                    sb.append("CTInAppNotification.GifCache: removed gif for key: ");
                    sb.append(str);
                    C3111h1.m14938f(sb.toString());
                    m14503a();
                }
            }
        }

        /* renamed from: a */
        static boolean m14504a(String str, byte[] bArr) {
            if (f10808d == null) {
                return false;
            }
            if (m14505a(str) == null) {
                synchronized (C3032d.class) {
                    int b = m14507b(bArr);
                    int b2 = m14506b();
                    StringBuilder sb = new StringBuilder();
                    sb.append("CTInAppNotification.GifCache: gif size: ");
                    sb.append(b);
                    sb.append("KB. Available mem: ");
                    sb.append(b2);
                    sb.append("KB.");
                    C3111h1.m14938f(sb.toString());
                    if (b > m14506b()) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("CTInAppNotification.GifCache: insufficient memory to add gif: ");
                        sb2.append(str);
                        C3111h1.m14938f(sb2.toString());
                        return false;
                    }
                    f10808d.put(str, bArr);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("CTInAppNotification.GifCache: added gif for key: ");
                    sb3.append(str);
                    C3111h1.m14938f(sb3.toString());
                }
            }
            return true;
        }

        /* renamed from: a */
        static byte[] m14505a(String str) {
            byte[] bArr;
            synchronized (C3032d.class) {
                bArr = f10808d == null ? null : (byte[]) f10808d.get(str);
            }
            return bArr;
        }
    }

    /* renamed from: com.clevertap.android.sdk.CTInAppNotification$e */
    private static class C3034e {

        /* renamed from: a */
        private static final int f10809a = 10240;

        /* renamed from: b */
        private static final int f10810b = (((int) Runtime.getRuntime().maxMemory()) / 1024);

        /* renamed from: c */
        private static final int f10811c = Math.max(f10810b / 32, f10809a);

        /* renamed from: d */
        private static LruCache<String, Bitmap> f10812d;

        /* renamed from: com.clevertap.android.sdk.CTInAppNotification$e$a */
        static class C3035a extends LruCache<String, Bitmap> {
            C3035a(int i) {
                super(i);
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public int sizeOf(String str, Bitmap bitmap) {
                int a = C3034e.m14517b(bitmap);
                StringBuilder sb = new StringBuilder();
                sb.append("CTInAppNotification.ImageCache: have image of size: ");
                sb.append(a);
                sb.append("KB for key: ");
                sb.append(str);
                C3111h1.m14938f(sb.toString());
                return a;
            }
        }

        private C3034e() {
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static int m14517b(Bitmap bitmap) {
            return bitmap.getByteCount() / 1024;
        }

        /* renamed from: c */
        static void m14519c() {
            synchronized (C3034e.class) {
                if (f10812d == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("CTInAppNotification.ImageCache: init with max device memory: ");
                    sb.append(String.valueOf(f10810b));
                    sb.append("KB and allocated cache size: ");
                    sb.append(String.valueOf(f10811c));
                    sb.append("KB");
                    C3111h1.m14938f(sb.toString());
                    try {
                        f10812d = new C3035a(f10811c);
                    } catch (Throwable th) {
                        C3111h1.m14941f("CTInAppNotification.ImageCache: unable to initialize cache: ", th.getCause());
                    }
                }
            }
        }

        /* renamed from: d */
        private static boolean m14520d() {
            boolean z;
            synchronized (C3034e.class) {
                z = f10812d.size() <= 0;
            }
            return z;
        }

        /* renamed from: a */
        private static void m14514a() {
            synchronized (C3034e.class) {
                if (m14520d()) {
                    C3111h1.m14938f("CTInAppNotification.ImageCache: cache is empty, removing it");
                    f10812d = null;
                }
            }
        }

        /* renamed from: b */
        private static int m14516b() {
            int size;
            synchronized (C3034e.class) {
                size = f10812d == null ? 0 : f10811c - f10812d.size();
            }
            return size;
        }

        /* renamed from: b */
        static void m14518b(String str) {
            synchronized (C3034e.class) {
                if (f10812d != null) {
                    f10812d.remove(str);
                    StringBuilder sb = new StringBuilder();
                    sb.append("CTInAppNotification.LruImageCache: removed image for key: ");
                    sb.append(str);
                    C3111h1.m14938f(sb.toString());
                    m14514a();
                }
            }
        }

        /* renamed from: a */
        static boolean m14515a(String str, Bitmap bitmap) {
            if (f10812d == null) {
                return false;
            }
            if (m14513a(str) == null) {
                synchronized (C3034e.class) {
                    int b = m14517b(bitmap);
                    int b2 = m14516b();
                    StringBuilder sb = new StringBuilder();
                    sb.append("CTInAppNotification.ImageCache: image size: ");
                    sb.append(b);
                    sb.append("KB. Available mem: ");
                    sb.append(b2);
                    sb.append("KB.");
                    C3111h1.m14938f(sb.toString());
                    if (b > m14516b()) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("CTInAppNotification.ImageCache: insufficient memory to add image: ");
                        sb2.append(str);
                        C3111h1.m14938f(sb2.toString());
                        return false;
                    }
                    f10812d.put(str, bitmap);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("CTInAppNotification.ImageCache: added image for key: ");
                    sb3.append(str);
                    C3111h1.m14938f(sb3.toString());
                }
            }
            return true;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0015, code lost:
            return r1;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        static android.graphics.Bitmap m14513a(java.lang.String r3) {
            /*
                java.lang.Class<com.clevertap.android.sdk.CTInAppNotification$e> r0 = com.clevertap.android.sdk.CTInAppNotification.C3034e.class
                monitor-enter(r0)
                r1 = 0
                if (r3 == 0) goto L_0x0016
                android.util.LruCache<java.lang.String, android.graphics.Bitmap> r2 = f10812d     // Catch:{ all -> 0x0018 }
                if (r2 != 0) goto L_0x000b
                goto L_0x0014
            L_0x000b:
                android.util.LruCache<java.lang.String, android.graphics.Bitmap> r1 = f10812d     // Catch:{ all -> 0x0018 }
                java.lang.Object r3 = r1.get(r3)     // Catch:{ all -> 0x0018 }
                r1 = r3
                android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1     // Catch:{ all -> 0x0018 }
            L_0x0014:
                monitor-exit(r0)     // Catch:{ all -> 0x0018 }
                return r1
            L_0x0016:
                monitor-exit(r0)     // Catch:{ all -> 0x0018 }
                return r1
            L_0x0018:
                r3 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0018 }
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.clevertap.android.sdk.CTInAppNotification.C3034e.m14513a(java.lang.String):android.graphics.Bitmap");
        }
    }

    /* synthetic */ CTInAppNotification(Parcel parcel, C3029a aVar) {
        this(parcel);
    }

    /* renamed from: P */
    private void m14455P() {
        Iterator it = this.f10789i0.iterator();
        while (it.hasNext()) {
            CTInAppNotificationMedia cTInAppNotificationMedia = (CTInAppNotificationMedia) it.next();
            if (cTInAppNotificationMedia.mo11988c() != null) {
                if (!cTInAppNotificationMedia.mo11987b().equals("image/gif")) {
                    C3034e.m14518b(cTInAppNotificationMedia.mo11985a());
                    StringBuilder sb = new StringBuilder();
                    sb.append("Deleted image - ");
                    sb.append(cTInAppNotificationMedia.mo11985a());
                    C3111h1.m14938f(sb.toString());
                } else {
                    C3032d.m14508b(cTInAppNotificationMedia.mo11985a());
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Deleted GIF - ");
                    sb2.append(cTInAppNotificationMedia.mo11985a());
                    C3111h1.m14938f(sb2.toString());
                }
            }
        }
    }

    /* renamed from: b */
    private static Bundle m14459b(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            try {
                Object obj = jSONObject.get(str);
                if (obj instanceof String) {
                    bundle.putString(str, (String) obj);
                } else if (obj instanceof Character) {
                    bundle.putChar(str, ((Character) obj).charValue());
                } else if (obj instanceof Integer) {
                    bundle.putInt(str, ((Integer) obj).intValue());
                } else if (obj instanceof Float) {
                    bundle.putFloat(str, ((Float) obj).floatValue());
                } else if (obj instanceof Double) {
                    bundle.putDouble(str, ((Double) obj).doubleValue());
                } else if (obj instanceof Long) {
                    bundle.putLong(str, ((Long) obj).longValue());
                } else if (obj instanceof Boolean) {
                    bundle.putBoolean(str, ((Boolean) obj).booleanValue());
                } else if (obj instanceof JSONObject) {
                    bundle.putBundle(str, m14459b((JSONObject) obj));
                }
            } catch (JSONException unused) {
                C3111h1.m14938f("Key had unknown object. Discarding");
            }
        }
        return bundle;
    }

    /* renamed from: c */
    private void m14460c(JSONObject jSONObject) {
        String str = C2945d.f10439h;
        String str2 = "isJsEnabled";
        String str3 = "tdc";
        String str4 = "tlc";
        String str5 = "efc";
        String str6 = "wzrk_id";
        String str7 = "ti";
        String str8 = "Invalid JSON";
        if (!m14457a(m14459b(jSONObject))) {
            this.f10792l0 = str8;
            return;
        }
        try {
            String str9 = "";
            this.f10779a = jSONObject.has(str7) ? jSONObject.getString(str7) : str9;
            this.f10781b = jSONObject.has(str6) ? jSONObject.getString(str6) : str9;
            boolean z = true;
            int i = 0;
            this.f10769Q = jSONObject.has(str5) && jSONObject.getInt(str5) == 1;
            int i2 = -1;
            this.f10773U = jSONObject.has(str4) ? jSONObject.getInt(str4) : -1;
            this.f10774V = jSONObject.has(str3) ? jSONObject.getInt(str3) : -1;
            if (!jSONObject.has(str2) || !jSONObject.getBoolean(str2)) {
                z = false;
            }
            this.f10799s0 = z;
            JSONObject jSONObject2 = null;
            JSONObject jSONObject3 = jSONObject.has(str) ? jSONObject.getJSONObject(str) : null;
            if (jSONObject3 != null) {
                this.f10768P = jSONObject3.getString(XHTMLExtension.ELEMENT);
                if (jSONObject3.has("url")) {
                    str9 = jSONObject3.getString("url");
                }
                this.f10798r0 = str9;
                if (jSONObject3.has("kv")) {
                    jSONObject2 = jSONObject3.getJSONObject("kv");
                }
                this.f10793m0 = jSONObject2;
                if (this.f10793m0 == null) {
                    this.f10793m0 = new JSONObject();
                }
                JSONObject jSONObject4 = jSONObject.getJSONObject("w");
                if (jSONObject4 != null) {
                    this.f10771S = jSONObject4.getBoolean("dk");
                    this.f10770R = jSONObject4.getBoolean("sc");
                    this.f10775W = jSONObject4.getString("pos").charAt(0);
                    this.f10778Z = jSONObject4.has("xdp") ? jSONObject4.getInt("xdp") : 0;
                    this.f10780a0 = jSONObject4.has("xp") ? jSONObject4.getInt("xp") : 0;
                    this.f10776X = jSONObject4.has("ydp") ? jSONObject4.getInt("ydp") : 0;
                    if (jSONObject4.has("yp")) {
                        i = jSONObject4.getInt("yp");
                    }
                    this.f10777Y = i;
                    if (jSONObject4.has("mdc")) {
                        i2 = jSONObject4.getInt("mdc");
                    }
                    this.f10772T = i2;
                }
                if (this.f10768P != null) {
                    if (this.f10775W == 't' && this.f10780a0 == 100 && this.f10777Y == 30) {
                        this.f10767O = C3071b0.CTInAppTypeHeaderHTML;
                    } else if (this.f10775W == 'b' && this.f10780a0 == 100 && this.f10777Y == 30) {
                        this.f10767O = C3071b0.CTInAppTypeFooterHTML;
                    } else if (this.f10775W == 'c' && this.f10780a0 == 90 && this.f10777Y == 85) {
                        this.f10767O = C3071b0.CTInAppTypeInterstitialHTML;
                    } else if (this.f10775W == 'c' && this.f10780a0 == 100 && this.f10777Y == 100) {
                        this.f10767O = C3071b0.CTInAppTypeCoverHTML;
                    } else if (this.f10775W == 'c' && this.f10780a0 == 90 && this.f10777Y == 50) {
                        this.f10767O = C3071b0.CTInAppTypeHalfInterstitialHTML;
                    }
                }
            }
        } catch (JSONException unused) {
            this.f10792l0 = str8;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: A */
    public String mo11914A() {
        return this.f10783c0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: B */
    public int mo11915B() {
        return this.f10774V;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: C */
    public int mo11916C() {
        return this.f10773U;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: D */
    public String mo11917D() {
        return this.f10766N;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: E */
    public int mo11918E() {
        return this.f10778Z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: F */
    public int mo11919F() {
        return this.f10780a0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: G */
    public boolean mo11920G() {
        return this.f10771S;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: H */
    public boolean mo11921H() {
        return this.f10769Q;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: I */
    public boolean mo11922I() {
        return this.f10787g0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: J */
    public boolean mo11923J() {
        return this.f10799s0;
    }

    /* renamed from: K */
    public boolean mo11924K() {
        return this.f10801u0;
    }

    /* renamed from: L */
    public boolean mo11925L() {
        return this.f10800t0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: M */
    public boolean mo11926M() {
        return this.f10770R;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: N */
    public boolean mo11927N() {
        return this.f10796p0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: O */
    public void mo11928O() {
        Iterator it = this.f10789i0.iterator();
        while (it.hasNext()) {
            CTInAppNotificationMedia cTInAppNotificationMedia = (CTInAppNotificationMedia) it.next();
            if (cTInAppNotificationMedia.mo11992k()) {
                C3032d.m14509c();
                if (mo11932a(cTInAppNotificationMedia) != null) {
                    this.f10795o0.mo11958a(this);
                    return;
                } else if (cTInAppNotificationMedia.mo11988c() != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("CTInAppNotification: downloading GIF :");
                    sb.append(cTInAppNotificationMedia.mo11988c());
                    C3111h1.m14938f(sb.toString());
                    byte[] b = C3238w1.m15665b(cTInAppNotificationMedia.mo11988c());
                    if (b != null) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("GIF Downloaded from url: ");
                        sb2.append(cTInAppNotificationMedia.mo11988c());
                        C3111h1.m14938f(sb2.toString());
                        if (!C3032d.m14504a(cTInAppNotificationMedia.mo11985a(), b)) {
                            this.f10792l0 = "Error processing GIF";
                        }
                    }
                }
            } else if (cTInAppNotificationMedia.mo11993l()) {
                C3034e.m14519c();
                if (mo11933b(cTInAppNotificationMedia) != null) {
                    this.f10795o0.mo11958a(this);
                    return;
                } else if (cTInAppNotificationMedia.mo11988c() != null) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("CTInAppNotification: downloading Image :");
                    sb3.append(cTInAppNotificationMedia.mo11988c());
                    C3111h1.m14938f(sb3.toString());
                    Bitmap a = C3238w1.m15659a(cTInAppNotificationMedia.mo11988c());
                    if (a != null) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Image Downloaded from url: ");
                        sb4.append(cTInAppNotificationMedia.mo11988c());
                        C3111h1.m14938f(sb4.toString());
                        if (!C3034e.m14515a(cTInAppNotificationMedia.mo11985a(), a)) {
                            this.f10792l0 = "Error processing image";
                        }
                    }
                }
            } else if ((cTInAppNotificationMedia.mo11994m() || cTInAppNotificationMedia.mo11991j()) && !this.f10797q0) {
                this.f10792l0 = "InApp Video/Audio is not supported";
            }
        }
        this.f10795o0.mo11958a(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public CTInAppNotification mo11929a(JSONObject jSONObject, boolean z) {
        String str = "type";
        this.f10797q0 = z;
        this.f10791k0 = jSONObject;
        try {
            this.f10766N = jSONObject.has(str) ? jSONObject.getString(str) : null;
            if (this.f10766N != null) {
                if (!this.f10766N.equals("custom-html")) {
                    m14456a(jSONObject);
                    return this;
                }
            }
            m14460c(jSONObject);
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid JSON : ");
            sb.append(e.getLocalizedMessage());
            this.f10792l0 = sb.toString();
        }
        return this;
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public int mo11937i() {
        return this.f10790j0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public ArrayList<CTInAppNotificationButton> mo11938j() {
        return this.f10788h0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public String mo11939k() {
        return this.f10781b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public JSONObject mo11940l() {
        return this.f10793m0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public String mo11941m() {
        return this.f10798r0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public String mo11942n() {
        return this.f10792l0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public int mo11943o() {
        return this.f10776X;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public int mo11944p() {
        return this.f10777Y;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public String mo11945q() {
        return this.f10768P;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public String mo11946r() {
        return this.f10779a;
    }

    /* renamed from: s */
    public C3071b0 mo11947s() {
        return this.f10767O;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: t */
    public JSONObject mo11948t() {
        return this.f10791k0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: u */
    public int mo11949u() {
        return this.f10772T;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: v */
    public ArrayList<CTInAppNotificationMedia> mo11950v() {
        return this.f10789i0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: w */
    public String mo11951w() {
        return this.f10784d0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f10779a);
        parcel.writeString(this.f10781b);
        parcel.writeValue(this.f10767O);
        parcel.writeString(this.f10768P);
        parcel.writeByte(this.f10769Q ? (byte) 1 : 0);
        parcel.writeByte(this.f10770R ? (byte) 1 : 0);
        parcel.writeByte(this.f10771S ? (byte) 1 : 0);
        parcel.writeInt(this.f10772T);
        parcel.writeInt(this.f10773U);
        parcel.writeInt(this.f10774V);
        parcel.writeValue(Character.valueOf(this.f10775W));
        parcel.writeInt(this.f10776X);
        parcel.writeInt(this.f10777Y);
        parcel.writeInt(this.f10778Z);
        parcel.writeInt(this.f10780a0);
        if (this.f10791k0 == null) {
            parcel.writeByte(0);
        } else {
            parcel.writeByte(1);
            parcel.writeString(this.f10791k0.toString());
        }
        parcel.writeString(this.f10792l0);
        if (this.f10793m0 == null) {
            parcel.writeByte(0);
        } else {
            parcel.writeByte(1);
            parcel.writeString(this.f10793m0.toString());
        }
        if (this.f10794n0 == null) {
            parcel.writeByte(0);
        } else {
            parcel.writeByte(1);
            parcel.writeString(this.f10794n0.toString());
        }
        parcel.writeString(this.f10766N);
        parcel.writeString(this.f10782b0);
        parcel.writeString(this.f10783c0);
        parcel.writeString(this.f10786f0);
        parcel.writeString(this.f10784d0);
        parcel.writeString(this.f10785e0);
        parcel.writeTypedList(this.f10788h0);
        parcel.writeTypedList(this.f10789i0);
        parcel.writeByte(this.f10787g0 ? (byte) 1 : 0);
        parcel.writeInt(this.f10790j0);
        parcel.writeByte(this.f10796p0 ? (byte) 1 : 0);
        parcel.writeString(this.f10798r0);
        parcel.writeByte(this.f10799s0 ? (byte) 1 : 0);
        parcel.writeByte(this.f10800t0 ? (byte) 1 : 0);
        parcel.writeByte(this.f10801u0 ? (byte) 1 : 0);
        parcel.writeString(this.f10802v0);
        parcel.writeString(this.f10803w0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: x */
    public String mo11953x() {
        return this.f10785e0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: y */
    public char mo11954y() {
        return this.f10775W;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: z */
    public String mo11955z() {
        return this.f10782b0;
    }

    CTInAppNotification() {
        this.f10788h0 = new ArrayList<>();
        this.f10789i0 = new ArrayList<>();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(31:1|2|(1:4)(1:5)|6|(1:8)(1:9)|10|(1:12)(1:13)|14|(1:16)(1:17)|18|(1:20)(1:21)|22|(1:24)(1:25)|26|27|28|29|30|31|32|(1:34)(1:35)|36|(1:38)(1:39)|40|(1:42)(1:43)|44|(1:46)(1:47)|48|(1:50)(1:51)|52|54) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00fb */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0103 */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0109 A[Catch:{ JSONException -> 0x0151 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x010b A[Catch:{ JSONException -> 0x0151 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x011a A[Catch:{ JSONException -> 0x0151 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x011c A[Catch:{ JSONException -> 0x0151 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x012b A[Catch:{ JSONException -> 0x0151 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x012d A[Catch:{ JSONException -> 0x0151 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0136 A[Catch:{ JSONException -> 0x0151 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0138 A[Catch:{ JSONException -> 0x0151 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0141 A[Catch:{ JSONException -> 0x0151 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0142 A[Catch:{ JSONException -> 0x0151 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private CTInAppNotification(android.os.Parcel r6) {
        /*
            r5 = this;
            r5.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.f10788h0 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.f10789i0 = r0
            java.lang.String r0 = r6.readString()     // Catch:{ JSONException -> 0x0151 }
            r5.f10779a = r0     // Catch:{ JSONException -> 0x0151 }
            java.lang.String r0 = r6.readString()     // Catch:{ JSONException -> 0x0151 }
            r5.f10781b = r0     // Catch:{ JSONException -> 0x0151 }
            java.lang.Class<com.clevertap.android.sdk.b0> r0 = com.clevertap.android.sdk.C3071b0.class
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch:{ JSONException -> 0x0151 }
            java.lang.Object r0 = r6.readValue(r0)     // Catch:{ JSONException -> 0x0151 }
            com.clevertap.android.sdk.b0 r0 = (com.clevertap.android.sdk.C3071b0) r0     // Catch:{ JSONException -> 0x0151 }
            r5.f10767O = r0     // Catch:{ JSONException -> 0x0151 }
            java.lang.String r0 = r6.readString()     // Catch:{ JSONException -> 0x0151 }
            r5.f10768P = r0     // Catch:{ JSONException -> 0x0151 }
            byte r0 = r6.readByte()     // Catch:{ JSONException -> 0x0151 }
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x003b
            r0 = 1
            goto L_0x003c
        L_0x003b:
            r0 = 0
        L_0x003c:
            r5.f10769Q = r0     // Catch:{ JSONException -> 0x0151 }
            byte r0 = r6.readByte()     // Catch:{ JSONException -> 0x0151 }
            if (r0 == 0) goto L_0x0046
            r0 = 1
            goto L_0x0047
        L_0x0046:
            r0 = 0
        L_0x0047:
            r5.f10770R = r0     // Catch:{ JSONException -> 0x0151 }
            byte r0 = r6.readByte()     // Catch:{ JSONException -> 0x0151 }
            if (r0 == 0) goto L_0x0051
            r0 = 1
            goto L_0x0052
        L_0x0051:
            r0 = 0
        L_0x0052:
            r5.f10771S = r0     // Catch:{ JSONException -> 0x0151 }
            int r0 = r6.readInt()     // Catch:{ JSONException -> 0x0151 }
            r5.f10772T = r0     // Catch:{ JSONException -> 0x0151 }
            int r0 = r6.readInt()     // Catch:{ JSONException -> 0x0151 }
            r5.f10773U = r0     // Catch:{ JSONException -> 0x0151 }
            int r0 = r6.readInt()     // Catch:{ JSONException -> 0x0151 }
            r5.f10774V = r0     // Catch:{ JSONException -> 0x0151 }
            java.lang.Class r0 = java.lang.Character.TYPE     // Catch:{ JSONException -> 0x0151 }
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch:{ JSONException -> 0x0151 }
            java.lang.Object r0 = r6.readValue(r0)     // Catch:{ JSONException -> 0x0151 }
            java.lang.Character r0 = (java.lang.Character) r0     // Catch:{ JSONException -> 0x0151 }
            char r0 = r0.charValue()     // Catch:{ JSONException -> 0x0151 }
            r5.f10775W = r0     // Catch:{ JSONException -> 0x0151 }
            int r0 = r6.readInt()     // Catch:{ JSONException -> 0x0151 }
            r5.f10776X = r0     // Catch:{ JSONException -> 0x0151 }
            int r0 = r6.readInt()     // Catch:{ JSONException -> 0x0151 }
            r5.f10777Y = r0     // Catch:{ JSONException -> 0x0151 }
            int r0 = r6.readInt()     // Catch:{ JSONException -> 0x0151 }
            r5.f10778Z = r0     // Catch:{ JSONException -> 0x0151 }
            int r0 = r6.readInt()     // Catch:{ JSONException -> 0x0151 }
            r5.f10780a0 = r0     // Catch:{ JSONException -> 0x0151 }
            byte r0 = r6.readByte()     // Catch:{ JSONException -> 0x0151 }
            r3 = 0
            if (r0 != 0) goto L_0x0099
            r0 = r3
            goto L_0x00a2
        L_0x0099:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0151 }
            java.lang.String r4 = r6.readString()     // Catch:{ JSONException -> 0x0151 }
            r0.<init>(r4)     // Catch:{ JSONException -> 0x0151 }
        L_0x00a2:
            r5.f10791k0 = r0     // Catch:{ JSONException -> 0x0151 }
            java.lang.String r0 = r6.readString()     // Catch:{ JSONException -> 0x0151 }
            r5.f10792l0 = r0     // Catch:{ JSONException -> 0x0151 }
            byte r0 = r6.readByte()     // Catch:{ JSONException -> 0x0151 }
            if (r0 != 0) goto L_0x00b2
            r0 = r3
            goto L_0x00bb
        L_0x00b2:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0151 }
            java.lang.String r4 = r6.readString()     // Catch:{ JSONException -> 0x0151 }
            r0.<init>(r4)     // Catch:{ JSONException -> 0x0151 }
        L_0x00bb:
            r5.f10793m0 = r0     // Catch:{ JSONException -> 0x0151 }
            byte r0 = r6.readByte()     // Catch:{ JSONException -> 0x0151 }
            if (r0 != 0) goto L_0x00c4
            goto L_0x00cd
        L_0x00c4:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0151 }
            java.lang.String r0 = r6.readString()     // Catch:{ JSONException -> 0x0151 }
            r3.<init>(r0)     // Catch:{ JSONException -> 0x0151 }
        L_0x00cd:
            r5.f10794n0 = r3     // Catch:{ JSONException -> 0x0151 }
            java.lang.String r0 = r6.readString()     // Catch:{ JSONException -> 0x0151 }
            r5.f10766N = r0     // Catch:{ JSONException -> 0x0151 }
            java.lang.String r0 = r6.readString()     // Catch:{ JSONException -> 0x0151 }
            r5.f10782b0 = r0     // Catch:{ JSONException -> 0x0151 }
            java.lang.String r0 = r6.readString()     // Catch:{ JSONException -> 0x0151 }
            r5.f10783c0 = r0     // Catch:{ JSONException -> 0x0151 }
            java.lang.String r0 = r6.readString()     // Catch:{ JSONException -> 0x0151 }
            r5.f10786f0 = r0     // Catch:{ JSONException -> 0x0151 }
            java.lang.String r0 = r6.readString()     // Catch:{ JSONException -> 0x0151 }
            r5.f10784d0 = r0     // Catch:{ JSONException -> 0x0151 }
            java.lang.String r0 = r6.readString()     // Catch:{ JSONException -> 0x0151 }
            r5.f10785e0 = r0     // Catch:{ JSONException -> 0x0151 }
            android.os.Parcelable$Creator<com.clevertap.android.sdk.CTInAppNotificationButton> r0 = com.clevertap.android.sdk.CTInAppNotificationButton.CREATOR     // Catch:{ all -> 0x00fb }
            java.util.ArrayList r0 = r6.createTypedArrayList(r0)     // Catch:{ all -> 0x00fb }
            r5.f10788h0 = r0     // Catch:{ all -> 0x00fb }
        L_0x00fb:
            android.os.Parcelable$Creator<com.clevertap.android.sdk.CTInAppNotificationMedia> r0 = com.clevertap.android.sdk.CTInAppNotificationMedia.CREATOR     // Catch:{ all -> 0x0103 }
            java.util.ArrayList r0 = r6.createTypedArrayList(r0)     // Catch:{ all -> 0x0103 }
            r5.f10789i0 = r0     // Catch:{ all -> 0x0103 }
        L_0x0103:
            byte r0 = r6.readByte()     // Catch:{ JSONException -> 0x0151 }
            if (r0 == 0) goto L_0x010b
            r0 = 1
            goto L_0x010c
        L_0x010b:
            r0 = 0
        L_0x010c:
            r5.f10787g0 = r0     // Catch:{ JSONException -> 0x0151 }
            int r0 = r6.readInt()     // Catch:{ JSONException -> 0x0151 }
            r5.f10790j0 = r0     // Catch:{ JSONException -> 0x0151 }
            byte r0 = r6.readByte()     // Catch:{ JSONException -> 0x0151 }
            if (r0 == 0) goto L_0x011c
            r0 = 1
            goto L_0x011d
        L_0x011c:
            r0 = 0
        L_0x011d:
            r5.f10796p0 = r0     // Catch:{ JSONException -> 0x0151 }
            java.lang.String r0 = r6.readString()     // Catch:{ JSONException -> 0x0151 }
            r5.f10798r0 = r0     // Catch:{ JSONException -> 0x0151 }
            byte r0 = r6.readByte()     // Catch:{ JSONException -> 0x0151 }
            if (r0 == 0) goto L_0x012d
            r0 = 1
            goto L_0x012e
        L_0x012d:
            r0 = 0
        L_0x012e:
            r5.f10799s0 = r0     // Catch:{ JSONException -> 0x0151 }
            byte r0 = r6.readByte()     // Catch:{ JSONException -> 0x0151 }
            if (r0 == 0) goto L_0x0138
            r0 = 1
            goto L_0x0139
        L_0x0138:
            r0 = 0
        L_0x0139:
            r5.f10800t0 = r0     // Catch:{ JSONException -> 0x0151 }
            byte r0 = r6.readByte()     // Catch:{ JSONException -> 0x0151 }
            if (r0 == 0) goto L_0x0142
            goto L_0x0143
        L_0x0142:
            r1 = 0
        L_0x0143:
            r5.f10801u0 = r1     // Catch:{ JSONException -> 0x0151 }
            java.lang.String r0 = r6.readString()     // Catch:{ JSONException -> 0x0151 }
            r5.f10802v0 = r0     // Catch:{ JSONException -> 0x0151 }
            java.lang.String r6 = r6.readString()     // Catch:{ JSONException -> 0x0151 }
            r5.f10803w0 = r6     // Catch:{ JSONException -> 0x0151 }
        L_0x0151:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clevertap.android.sdk.CTInAppNotification.<init>(android.os.Parcel):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0176 A[Catch:{ JSONException -> 0x0240 }] */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x017d A[Catch:{ JSONException -> 0x0240 }] */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0180 A[Catch:{ JSONException -> 0x0240 }, LOOP:0: B:104:0x0180->B:111:0x01a5, LOOP_START, PHI: r7 
      PHI: (r7v4 int) = (r7v3 int), (r7v5 int) binds: [B:103:0x017e, B:111:0x01a5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01b5 A[Catch:{ JSONException -> 0x0240 }] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01b7 A[Catch:{ JSONException -> 0x0240 }] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x01e6 A[Catch:{ JSONException -> 0x0240 }] */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0213 A[Catch:{ JSONException -> 0x0240 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00bc A[Catch:{ JSONException -> 0x0240 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ca A[SYNTHETIC, Splitter:B:54:0x00ca] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00ef A[Catch:{ JSONException -> 0x0240 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00f6 A[Catch:{ JSONException -> 0x0240 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00f9 A[Catch:{ JSONException -> 0x0240 }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0131 A[Catch:{ JSONException -> 0x0240 }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0138 A[Catch:{ JSONException -> 0x0240 }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x013b A[Catch:{ JSONException -> 0x0240 }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0153 A[Catch:{ JSONException -> 0x0240 }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x015a A[Catch:{ JSONException -> 0x0240 }] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x015d A[Catch:{ JSONException -> 0x0240 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m14456a(org.json.JSONObject r11) {
        /*
            r10 = this;
            java.lang.String r0 = "hasPortrait"
            java.lang.String r1 = "bg"
            java.lang.String r2 = "tablet"
            java.lang.String r3 = "tdc"
            java.lang.String r4 = "tlc"
            java.lang.String r5 = "efc"
            java.lang.String r6 = "wzrk_id"
            java.lang.String r7 = "ti"
            boolean r8 = r11.has(r7)     // Catch:{ JSONException -> 0x0240 }
            java.lang.String r9 = ""
            if (r8 == 0) goto L_0x001d
            java.lang.String r7 = r11.getString(r7)     // Catch:{ JSONException -> 0x0240 }
            goto L_0x001e
        L_0x001d:
            r7 = r9
        L_0x001e:
            r10.f10779a = r7     // Catch:{ JSONException -> 0x0240 }
            boolean r7 = r11.has(r6)     // Catch:{ JSONException -> 0x0240 }
            if (r7 == 0) goto L_0x002b
            java.lang.String r6 = r11.getString(r6)     // Catch:{ JSONException -> 0x0240 }
            goto L_0x002c
        L_0x002b:
            r6 = r9
        L_0x002c:
            r10.f10781b = r6     // Catch:{ JSONException -> 0x0240 }
            java.lang.String r6 = "type"
            java.lang.String r6 = r11.getString(r6)     // Catch:{ JSONException -> 0x0240 }
            r10.f10766N = r6     // Catch:{ JSONException -> 0x0240 }
            boolean r6 = r11.has(r5)     // Catch:{ JSONException -> 0x0240 }
            r7 = 0
            r8 = 1
            if (r6 == 0) goto L_0x0046
            int r5 = r11.getInt(r5)     // Catch:{ JSONException -> 0x0240 }
            if (r5 != r8) goto L_0x0046
            r5 = 1
            goto L_0x0047
        L_0x0046:
            r5 = 0
        L_0x0047:
            r10.f10769Q = r5     // Catch:{ JSONException -> 0x0240 }
            boolean r5 = r11.has(r4)     // Catch:{ JSONException -> 0x0240 }
            r6 = -1
            if (r5 == 0) goto L_0x0055
            int r4 = r11.getInt(r4)     // Catch:{ JSONException -> 0x0240 }
            goto L_0x0056
        L_0x0055:
            r4 = -1
        L_0x0056:
            r10.f10773U = r4     // Catch:{ JSONException -> 0x0240 }
            boolean r4 = r11.has(r3)     // Catch:{ JSONException -> 0x0240 }
            if (r4 == 0) goto L_0x0062
            int r6 = r11.getInt(r3)     // Catch:{ JSONException -> 0x0240 }
        L_0x0062:
            r10.f10774V = r6     // Catch:{ JSONException -> 0x0240 }
            java.lang.String r3 = r10.f10766N     // Catch:{ JSONException -> 0x0240 }
            com.clevertap.android.sdk.b0 r3 = com.clevertap.android.sdk.C3071b0.m14750b(r3)     // Catch:{ JSONException -> 0x0240 }
            r10.f10767O = r3     // Catch:{ JSONException -> 0x0240 }
            boolean r3 = r11.has(r2)     // Catch:{ JSONException -> 0x0240 }
            if (r3 == 0) goto L_0x007a
            boolean r2 = r11.getBoolean(r2)     // Catch:{ JSONException -> 0x0240 }
            if (r2 == 0) goto L_0x007a
            r2 = 1
            goto L_0x007b
        L_0x007a:
            r2 = 0
        L_0x007b:
            r10.f10796p0 = r2     // Catch:{ JSONException -> 0x0240 }
            boolean r2 = r11.has(r1)     // Catch:{ JSONException -> 0x0240 }
            if (r2 == 0) goto L_0x0088
            java.lang.String r1 = r11.getString(r1)     // Catch:{ JSONException -> 0x0240 }
            goto L_0x008a
        L_0x0088:
            java.lang.String r1 = "#FFFFFF"
        L_0x008a:
            r10.f10786f0 = r1     // Catch:{ JSONException -> 0x0240 }
            boolean r1 = r11.has(r0)     // Catch:{ JSONException -> 0x0240 }
            if (r1 == 0) goto L_0x009b
            boolean r0 = r11.getBoolean(r0)     // Catch:{ JSONException -> 0x0240 }
            if (r0 == 0) goto L_0x0099
            goto L_0x009b
        L_0x0099:
            r0 = 0
            goto L_0x009c
        L_0x009b:
            r0 = 1
        L_0x009c:
            r10.f10800t0 = r0     // Catch:{ JSONException -> 0x0240 }
            java.lang.String r0 = "hasLandscape"
            boolean r0 = r11.has(r0)     // Catch:{ JSONException -> 0x0240 }
            if (r0 == 0) goto L_0x00b0
            java.lang.String r0 = "hasLandscape"
            boolean r0 = r11.getBoolean(r0)     // Catch:{ JSONException -> 0x0240 }
            if (r0 == 0) goto L_0x00b0
            r0 = 1
            goto L_0x00b1
        L_0x00b0:
            r0 = 0
        L_0x00b1:
            r10.f10801u0 = r0     // Catch:{ JSONException -> 0x0240 }
            java.lang.String r0 = "title"
            boolean r0 = r11.has(r0)     // Catch:{ JSONException -> 0x0240 }
            r1 = 0
            if (r0 == 0) goto L_0x00c3
            java.lang.String r0 = "title"
            org.json.JSONObject r0 = r11.getJSONObject(r0)     // Catch:{ JSONException -> 0x0240 }
            goto L_0x00c4
        L_0x00c3:
            r0 = r1
        L_0x00c4:
            java.lang.String r2 = "color"
            java.lang.String r3 = "text"
            if (r0 == 0) goto L_0x00e7
            boolean r4 = r0.has(r3)     // Catch:{ JSONException -> 0x0240 }
            if (r4 == 0) goto L_0x00d5
            java.lang.String r4 = r0.getString(r3)     // Catch:{ JSONException -> 0x0240 }
            goto L_0x00d6
        L_0x00d5:
            r4 = r9
        L_0x00d6:
            r10.f10782b0 = r4     // Catch:{ JSONException -> 0x0240 }
            boolean r4 = r0.has(r2)     // Catch:{ JSONException -> 0x0240 }
            if (r4 == 0) goto L_0x00e3
            java.lang.String r0 = r0.getString(r2)     // Catch:{ JSONException -> 0x0240 }
            goto L_0x00e5
        L_0x00e3:
            java.lang.String r0 = "#000000"
        L_0x00e5:
            r10.f10783c0 = r0     // Catch:{ JSONException -> 0x0240 }
        L_0x00e7:
            java.lang.String r0 = "message"
            boolean r0 = r11.has(r0)     // Catch:{ JSONException -> 0x0240 }
            if (r0 == 0) goto L_0x00f6
            java.lang.String r0 = "message"
            org.json.JSONObject r0 = r11.getJSONObject(r0)     // Catch:{ JSONException -> 0x0240 }
            goto L_0x00f7
        L_0x00f6:
            r0 = r1
        L_0x00f7:
            if (r0 == 0) goto L_0x0114
            boolean r4 = r0.has(r3)     // Catch:{ JSONException -> 0x0240 }
            if (r4 == 0) goto L_0x0103
            java.lang.String r9 = r0.getString(r3)     // Catch:{ JSONException -> 0x0240 }
        L_0x0103:
            r10.f10784d0 = r9     // Catch:{ JSONException -> 0x0240 }
            boolean r3 = r0.has(r2)     // Catch:{ JSONException -> 0x0240 }
            if (r3 == 0) goto L_0x0110
            java.lang.String r0 = r0.getString(r2)     // Catch:{ JSONException -> 0x0240 }
            goto L_0x0112
        L_0x0110:
            java.lang.String r0 = "#000000"
        L_0x0112:
            r10.f10785e0 = r0     // Catch:{ JSONException -> 0x0240 }
        L_0x0114:
            java.lang.String r0 = "close"
            boolean r0 = r11.has(r0)     // Catch:{ JSONException -> 0x0240 }
            if (r0 == 0) goto L_0x0126
            java.lang.String r0 = "close"
            boolean r0 = r11.getBoolean(r0)     // Catch:{ JSONException -> 0x0240 }
            if (r0 == 0) goto L_0x0126
            r0 = 1
            goto L_0x0127
        L_0x0126:
            r0 = 0
        L_0x0127:
            r10.f10787g0 = r0     // Catch:{ JSONException -> 0x0240 }
            java.lang.String r0 = "media"
            boolean r0 = r11.has(r0)     // Catch:{ JSONException -> 0x0240 }
            if (r0 == 0) goto L_0x0138
            java.lang.String r0 = "media"
            org.json.JSONObject r0 = r11.getJSONObject(r0)     // Catch:{ JSONException -> 0x0240 }
            goto L_0x0139
        L_0x0138:
            r0 = r1
        L_0x0139:
            if (r0 == 0) goto L_0x014b
            com.clevertap.android.sdk.CTInAppNotificationMedia r2 = new com.clevertap.android.sdk.CTInAppNotificationMedia     // Catch:{ JSONException -> 0x0240 }
            r2.<init>()     // Catch:{ JSONException -> 0x0240 }
            com.clevertap.android.sdk.CTInAppNotificationMedia r0 = r2.mo11984a(r0, r8)     // Catch:{ JSONException -> 0x0240 }
            if (r0 == 0) goto L_0x014b
            java.util.ArrayList<com.clevertap.android.sdk.CTInAppNotificationMedia> r2 = r10.f10789i0     // Catch:{ JSONException -> 0x0240 }
            r2.add(r0)     // Catch:{ JSONException -> 0x0240 }
        L_0x014b:
            java.lang.String r0 = "mediaLandscape"
            boolean r0 = r11.has(r0)     // Catch:{ JSONException -> 0x0240 }
            if (r0 == 0) goto L_0x015a
            java.lang.String r0 = "mediaLandscape"
            org.json.JSONObject r0 = r11.getJSONObject(r0)     // Catch:{ JSONException -> 0x0240 }
            goto L_0x015b
        L_0x015a:
            r0 = r1
        L_0x015b:
            if (r0 == 0) goto L_0x016e
            com.clevertap.android.sdk.CTInAppNotificationMedia r2 = new com.clevertap.android.sdk.CTInAppNotificationMedia     // Catch:{ JSONException -> 0x0240 }
            r2.<init>()     // Catch:{ JSONException -> 0x0240 }
            r3 = 2
            com.clevertap.android.sdk.CTInAppNotificationMedia r0 = r2.mo11984a(r0, r3)     // Catch:{ JSONException -> 0x0240 }
            if (r0 == 0) goto L_0x016e
            java.util.ArrayList<com.clevertap.android.sdk.CTInAppNotificationMedia> r2 = r10.f10789i0     // Catch:{ JSONException -> 0x0240 }
            r2.add(r0)     // Catch:{ JSONException -> 0x0240 }
        L_0x016e:
            java.lang.String r0 = "buttons"
            boolean r0 = r11.has(r0)     // Catch:{ JSONException -> 0x0240 }
            if (r0 == 0) goto L_0x017d
            java.lang.String r0 = "buttons"
            org.json.JSONArray r11 = r11.getJSONArray(r0)     // Catch:{ JSONException -> 0x0240 }
            goto L_0x017e
        L_0x017d:
            r11 = r1
        L_0x017e:
            if (r11 == 0) goto L_0x01a8
        L_0x0180:
            int r0 = r11.length()     // Catch:{ JSONException -> 0x0240 }
            if (r7 >= r0) goto L_0x01a8
            com.clevertap.android.sdk.CTInAppNotificationButton r0 = new com.clevertap.android.sdk.CTInAppNotificationButton     // Catch:{ JSONException -> 0x0240 }
            r0.<init>()     // Catch:{ JSONException -> 0x0240 }
            org.json.JSONObject r2 = r11.getJSONObject(r7)     // Catch:{ JSONException -> 0x0240 }
            com.clevertap.android.sdk.CTInAppNotificationButton r0 = r0.mo11963a(r2)     // Catch:{ JSONException -> 0x0240 }
            if (r0 == 0) goto L_0x01a5
            java.lang.String r2 = r0.mo11977j()     // Catch:{ JSONException -> 0x0240 }
            if (r2 != 0) goto L_0x01a5
            java.util.ArrayList<com.clevertap.android.sdk.CTInAppNotificationButton> r2 = r10.f10788h0     // Catch:{ JSONException -> 0x0240 }
            r2.add(r0)     // Catch:{ JSONException -> 0x0240 }
            int r0 = r10.f10790j0     // Catch:{ JSONException -> 0x0240 }
            int r0 = r0 + r8
            r10.f10790j0 = r0     // Catch:{ JSONException -> 0x0240 }
        L_0x01a5:
            int r7 = r7 + 1
            goto L_0x0180
        L_0x01a8:
            int[] r11 = com.clevertap.android.sdk.CTInAppNotification.C3030b.f10804a     // Catch:{ JSONException -> 0x0240 }
            com.clevertap.android.sdk.b0 r0 = r10.f10767O     // Catch:{ JSONException -> 0x0240 }
            int r0 = r0.ordinal()     // Catch:{ JSONException -> 0x0240 }
            r11 = r11[r0]     // Catch:{ JSONException -> 0x0240 }
            switch(r11) {
                case 1: goto L_0x0213;
                case 2: goto L_0x0213;
                case 3: goto L_0x01e6;
                case 4: goto L_0x01e6;
                case 5: goto L_0x01b7;
                case 6: goto L_0x01b7;
                case 7: goto L_0x01b7;
                default: goto L_0x01b5;
            }     // Catch:{ JSONException -> 0x0240 }
        L_0x01b5:
            goto L_0x0258
        L_0x01b7:
            java.util.ArrayList<com.clevertap.android.sdk.CTInAppNotificationMedia> r11 = r10.f10789i0     // Catch:{ JSONException -> 0x0240 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ JSONException -> 0x0240 }
        L_0x01bd:
            boolean r0 = r11.hasNext()     // Catch:{ JSONException -> 0x0240 }
            if (r0 == 0) goto L_0x0258
            java.lang.Object r0 = r11.next()     // Catch:{ JSONException -> 0x0240 }
            com.clevertap.android.sdk.CTInAppNotificationMedia r0 = (com.clevertap.android.sdk.CTInAppNotificationMedia) r0     // Catch:{ JSONException -> 0x0240 }
            boolean r1 = r0.mo11992k()     // Catch:{ JSONException -> 0x0240 }
            if (r1 != 0) goto L_0x01e1
            boolean r1 = r0.mo11991j()     // Catch:{ JSONException -> 0x0240 }
            if (r1 != 0) goto L_0x01e1
            boolean r1 = r0.mo11994m()     // Catch:{ JSONException -> 0x0240 }
            if (r1 != 0) goto L_0x01e1
            boolean r0 = r0.mo11993l()     // Catch:{ JSONException -> 0x0240 }
            if (r0 != 0) goto L_0x01bd
        L_0x01e1:
            java.lang.String r0 = "Wrong media type for template"
            r10.f10792l0 = r0     // Catch:{ JSONException -> 0x0240 }
            goto L_0x01bd
        L_0x01e6:
            java.util.ArrayList<com.clevertap.android.sdk.CTInAppNotificationMedia> r11 = r10.f10789i0     // Catch:{ JSONException -> 0x0240 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ JSONException -> 0x0240 }
        L_0x01ec:
            boolean r0 = r11.hasNext()     // Catch:{ JSONException -> 0x0240 }
            if (r0 == 0) goto L_0x0258
            java.lang.Object r0 = r11.next()     // Catch:{ JSONException -> 0x0240 }
            com.clevertap.android.sdk.CTInAppNotificationMedia r0 = (com.clevertap.android.sdk.CTInAppNotificationMedia) r0     // Catch:{ JSONException -> 0x0240 }
            boolean r2 = r0.mo11992k()     // Catch:{ JSONException -> 0x0240 }
            if (r2 != 0) goto L_0x020a
            boolean r2 = r0.mo11991j()     // Catch:{ JSONException -> 0x0240 }
            if (r2 != 0) goto L_0x020a
            boolean r2 = r0.mo11994m()     // Catch:{ JSONException -> 0x0240 }
            if (r2 == 0) goto L_0x01ec
        L_0x020a:
            r0.mo11986a(r1)     // Catch:{ JSONException -> 0x0240 }
            java.lang.String r0 = "Unable to download to media. Wrong media type for template"
            com.clevertap.android.sdk.C3111h1.m14930d(r0)     // Catch:{ JSONException -> 0x0240 }
            goto L_0x01ec
        L_0x0213:
            java.util.ArrayList<com.clevertap.android.sdk.CTInAppNotificationMedia> r11 = r10.f10789i0     // Catch:{ JSONException -> 0x0240 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ JSONException -> 0x0240 }
        L_0x0219:
            boolean r0 = r11.hasNext()     // Catch:{ JSONException -> 0x0240 }
            if (r0 == 0) goto L_0x0258
            java.lang.Object r0 = r11.next()     // Catch:{ JSONException -> 0x0240 }
            com.clevertap.android.sdk.CTInAppNotificationMedia r0 = (com.clevertap.android.sdk.CTInAppNotificationMedia) r0     // Catch:{ JSONException -> 0x0240 }
            boolean r2 = r0.mo11992k()     // Catch:{ JSONException -> 0x0240 }
            if (r2 != 0) goto L_0x0237
            boolean r2 = r0.mo11991j()     // Catch:{ JSONException -> 0x0240 }
            if (r2 != 0) goto L_0x0237
            boolean r2 = r0.mo11994m()     // Catch:{ JSONException -> 0x0240 }
            if (r2 == 0) goto L_0x0219
        L_0x0237:
            r0.mo11986a(r1)     // Catch:{ JSONException -> 0x0240 }
            java.lang.String r0 = "Unable to download to media. Wrong media type for template"
            com.clevertap.android.sdk.C3111h1.m14930d(r0)     // Catch:{ JSONException -> 0x0240 }
            goto L_0x0219
        L_0x0240:
            r11 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid JSON"
            r0.append(r1)
            java.lang.String r11 = r11.getLocalizedMessage()
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            r10.f10792l0 = r11
        L_0x0258:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clevertap.android.sdk.CTInAppNotification.m14456a(org.json.JSONObject):void");
    }

    /* renamed from: b */
    public JSONObject mo11934b() {
        return this.f10794n0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public Bitmap mo11933b(CTInAppNotificationMedia cTInAppNotificationMedia) {
        return C3034e.m14513a(cTInAppNotificationMedia.mo11985a());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public String mo11935c() {
        return this.f10786f0;
    }

    /* renamed from: a */
    private boolean m14457a(Bundle bundle) {
        String str = "pos";
        try {
            Bundle bundle2 = bundle.getBundle("w");
            Bundle bundle3 = bundle.getBundle(C2945d.f10439h);
            if (bundle2 != null) {
                if (bundle3 != null) {
                    if (!m14458a(bundle2, "xdp", Integer.class) && !m14458a(bundle2, "xp", Integer.class)) {
                        return false;
                    }
                    if ((m14458a(bundle2, "ydp", Integer.class) || m14458a(bundle2, "yp", Integer.class)) && m14458a(bundle2, "dk", Boolean.class) && m14458a(bundle2, "sc", Boolean.class) && m14458a(bundle3, XHTMLExtension.ELEMENT, String.class) && m14458a(bundle2, str, String.class)) {
                        char charAt = bundle2.getString(str).charAt(0);
                        if (charAt == 'b' || charAt == 'c' || charAt == 'l' || charAt == 'r' || charAt == 't') {
                            return true;
                        }
                        return false;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            C3111h1.m14941f("Failed to parse in-app notification!", th);
            return false;
        }
    }

    /* renamed from: a */
    private boolean m14458a(Bundle bundle, String str, Class<?> cls) {
        return bundle.containsKey(str) && bundle.get(str).getClass().equals(cls);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public CTInAppNotificationMedia mo11930a(int i) {
        Iterator it = this.f10789i0.iterator();
        while (it.hasNext()) {
            CTInAppNotificationMedia cTInAppNotificationMedia = (CTInAppNotificationMedia) it.next();
            if (i == cTInAppNotificationMedia.mo11990i()) {
                return cTInAppNotificationMedia;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public byte[] mo11932a(CTInAppNotificationMedia cTInAppNotificationMedia) {
        return C3032d.m14505a(cTInAppNotificationMedia.mo11985a());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo11931a() {
        m14455P();
    }
}
