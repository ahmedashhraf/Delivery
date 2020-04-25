package android.support.p003v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;

/* renamed from: android.support.v4.media.MediaDescriptionCompat */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Creator<MediaDescriptionCompat> CREATOR = new C0049a();

    /* renamed from: U */
    public static final String f139U = "android.media.extra.BT_FOLDER_TYPE";

    /* renamed from: V */
    public static final long f140V = 0;

    /* renamed from: W */
    public static final long f141W = 1;

    /* renamed from: X */
    public static final long f142X = 2;

    /* renamed from: Y */
    public static final long f143Y = 3;

    /* renamed from: Z */
    public static final long f144Z = 4;

    /* renamed from: a0 */
    public static final long f145a0 = 5;

    /* renamed from: b0 */
    public static final long f146b0 = 6;

    /* renamed from: c0 */
    public static final String f147c0 = "android.media.extra.DOWNLOAD_STATUS";

    /* renamed from: d0 */
    public static final long f148d0 = 0;

    /* renamed from: e0 */
    public static final long f149e0 = 1;

    /* renamed from: f0 */
    public static final long f150f0 = 2;
    @C0207n0({C0208a.LIBRARY_GROUP})

    /* renamed from: g0 */
    public static final String f151g0 = "android.support.v4.media.description.MEDIA_URI";
    @C0207n0({C0208a.LIBRARY_GROUP})

    /* renamed from: h0 */
    public static final String f152h0 = "android.support.v4.media.description.NULL_BUNDLE_FLAG";

    /* renamed from: N */
    private final CharSequence f153N;

    /* renamed from: O */
    private final CharSequence f154O;

    /* renamed from: P */
    private final Bitmap f155P;

    /* renamed from: Q */
    private final Uri f156Q;

    /* renamed from: R */
    private final Bundle f157R;

    /* renamed from: S */
    private final Uri f158S;

    /* renamed from: T */
    private Object f159T;

    /* renamed from: a */
    private final String f160a;

    /* renamed from: b */
    private final CharSequence f161b;

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$a */
    static class C0049a implements Creator<MediaDescriptionCompat> {
        C0049a() {
        }

        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            if (VERSION.SDK_INT < 21) {
                return new MediaDescriptionCompat(parcel);
            }
            return MediaDescriptionCompat.m168b(C0072d.m248a(parcel));
        }

        public MediaDescriptionCompat[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }
    }

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$b */
    public static final class C0050b {

        /* renamed from: a */
        private String f162a;

        /* renamed from: b */
        private CharSequence f163b;

        /* renamed from: c */
        private CharSequence f164c;

        /* renamed from: d */
        private CharSequence f165d;

        /* renamed from: e */
        private Bitmap f166e;

        /* renamed from: f */
        private Uri f167f;

        /* renamed from: g */
        private Bundle f168g;

        /* renamed from: h */
        private Uri f169h;

        /* renamed from: a */
        public C0050b mo160a(@C0195i0 String str) {
            this.f162a = str;
            return this;
        }

        /* renamed from: b */
        public C0050b mo163b(@C0195i0 CharSequence charSequence) {
            this.f164c = charSequence;
            return this;
        }

        /* renamed from: c */
        public C0050b mo164c(@C0195i0 CharSequence charSequence) {
            this.f163b = charSequence;
            return this;
        }

        /* renamed from: a */
        public C0050b mo159a(@C0195i0 CharSequence charSequence) {
            this.f165d = charSequence;
            return this;
        }

        /* renamed from: b */
        public C0050b mo162b(@C0195i0 Uri uri) {
            this.f169h = uri;
            return this;
        }

        /* renamed from: a */
        public C0050b mo156a(@C0195i0 Bitmap bitmap) {
            this.f166e = bitmap;
            return this;
        }

        /* renamed from: a */
        public C0050b mo157a(@C0195i0 Uri uri) {
            this.f167f = uri;
            return this;
        }

        /* renamed from: a */
        public C0050b mo158a(@C0195i0 Bundle bundle) {
            this.f168g = bundle;
            return this;
        }

        /* renamed from: a */
        public MediaDescriptionCompat mo161a() {
            MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(this.f162a, this.f163b, this.f164c, this.f165d, this.f166e, this.f167f, this.f168g, this.f169h);
            return mediaDescriptionCompat;
        }
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f160a = str;
        this.f161b = charSequence;
        this.f153N = charSequence2;
        this.f154O = charSequence3;
        this.f155P = bitmap;
        this.f156Q = uri;
        this.f157R = bundle;
        this.f158S = uri2;
    }

    @C0195i0
    /* renamed from: a */
    public CharSequence mo142a() {
        return this.f154O;
    }

    @C0195i0
    /* renamed from: b */
    public Bundle mo143b() {
        return this.f157R;
    }

    @C0195i0
    /* renamed from: c */
    public Bitmap mo144c() {
        return this.f155P;
    }

    public int describeContents() {
        return 0;
    }

    @C0195i0
    /* renamed from: i */
    public Uri mo146i() {
        return this.f156Q;
    }

    /* renamed from: j */
    public Object mo147j() {
        if (this.f159T != null || VERSION.SDK_INT < 21) {
            return this.f159T;
        }
        Object a = C0073a.m256a();
        C0073a.m262a(a, this.f160a);
        C0073a.m264c(a, this.f161b);
        C0073a.m263b(a, this.f153N);
        C0073a.m261a(a, this.f154O);
        C0073a.m258a(a, this.f155P);
        C0073a.m259a(a, this.f156Q);
        Bundle bundle = this.f157R;
        if (VERSION.SDK_INT < 23 && this.f158S != null) {
            if (bundle == null) {
                bundle = new Bundle();
                bundle.putBoolean(f152h0, true);
            }
            bundle.putParcelable(f151g0, this.f158S);
        }
        C0073a.m260a(a, bundle);
        if (VERSION.SDK_INT >= 23) {
            C0075a.m266a(a, this.f158S);
        }
        this.f159T = C0073a.m257a(a);
        return this.f159T;
    }

    @C0195i0
    /* renamed from: k */
    public String mo148k() {
        return this.f160a;
    }

    @C0195i0
    /* renamed from: l */
    public Uri mo149l() {
        return this.f158S;
    }

    @C0195i0
    /* renamed from: m */
    public CharSequence mo150m() {
        return this.f153N;
    }

    @C0195i0
    /* renamed from: n */
    public CharSequence mo151n() {
        return this.f161b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f161b);
        String str = ", ";
        sb.append(str);
        sb.append(this.f153N);
        sb.append(str);
        sb.append(this.f154O);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (VERSION.SDK_INT < 21) {
            parcel.writeString(this.f160a);
            TextUtils.writeToParcel(this.f161b, parcel, i);
            TextUtils.writeToParcel(this.f153N, parcel, i);
            TextUtils.writeToParcel(this.f154O, parcel, i);
            parcel.writeParcelable(this.f155P, i);
            parcel.writeParcelable(this.f156Q, i);
            parcel.writeBundle(this.f157R);
            parcel.writeParcelable(this.f158S, i);
            return;
        }
        C0072d.m249a(mo147j(), parcel, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006d  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.p003v4.media.MediaDescriptionCompat m168b(java.lang.Object r8) {
        /*
            r0 = 0
            if (r8 == 0) goto L_0x0080
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r1 < r2) goto L_0x0080
            android.support.v4.media.MediaDescriptionCompat$b r1 = new android.support.v4.media.MediaDescriptionCompat$b
            r1.<init>()
            java.lang.String r2 = android.support.p003v4.media.C0072d.m253e(r8)
            r1.mo160a(r2)
            java.lang.CharSequence r2 = android.support.p003v4.media.C0072d.m255g(r8)
            r1.mo164c(r2)
            java.lang.CharSequence r2 = android.support.p003v4.media.C0072d.m254f(r8)
            r1.mo163b(r2)
            java.lang.CharSequence r2 = android.support.p003v4.media.C0072d.m247a(r8)
            r1.mo159a(r2)
            android.graphics.Bitmap r2 = android.support.p003v4.media.C0072d.m251c(r8)
            r1.mo156a(r2)
            android.net.Uri r2 = android.support.p003v4.media.C0072d.m252d(r8)
            r1.mo157a(r2)
            android.os.Bundle r2 = android.support.p003v4.media.C0072d.m250b(r8)
            java.lang.String r3 = "android.support.v4.media.description.MEDIA_URI"
            if (r2 == 0) goto L_0x004a
            android.support.p003v4.media.session.MediaSessionCompat.m514b(r2)
            android.os.Parcelable r4 = r2.getParcelable(r3)
            android.net.Uri r4 = (android.net.Uri) r4
            goto L_0x004b
        L_0x004a:
            r4 = r0
        L_0x004b:
            if (r4 == 0) goto L_0x0063
            java.lang.String r5 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r6 = r2.containsKey(r5)
            if (r6 == 0) goto L_0x005d
            int r6 = r2.size()
            r7 = 2
            if (r6 != r7) goto L_0x005d
            goto L_0x0064
        L_0x005d:
            r2.remove(r3)
            r2.remove(r5)
        L_0x0063:
            r0 = r2
        L_0x0064:
            r1.mo158a(r0)
            if (r4 == 0) goto L_0x006d
            r1.mo162b(r4)
            goto L_0x007a
        L_0x006d:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r0 < r2) goto L_0x007a
            android.net.Uri r0 = android.support.p003v4.media.C0074e.m265a(r8)
            r1.mo162b(r0)
        L_0x007a:
            android.support.v4.media.MediaDescriptionCompat r0 = r1.mo161a()
            r0.f159T = r8
        L_0x0080:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p003v4.media.MediaDescriptionCompat.m168b(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    MediaDescriptionCompat(Parcel parcel) {
        this.f160a = parcel.readString();
        this.f161b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f153N = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f154O = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        ClassLoader classLoader = MediaDescriptionCompat.class.getClassLoader();
        this.f155P = (Bitmap) parcel.readParcelable(classLoader);
        this.f156Q = (Uri) parcel.readParcelable(classLoader);
        this.f157R = parcel.readBundle(classLoader);
        this.f158S = (Uri) parcel.readParcelable(classLoader);
    }
}
