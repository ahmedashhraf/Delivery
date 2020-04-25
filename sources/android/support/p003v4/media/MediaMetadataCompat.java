package android.support.p003v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p003v4.media.MediaDescriptionCompat.C0050b;
import android.support.p003v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.collection.C0635a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Set;

/* renamed from: android.support.v4.media.MediaMetadataCompat */
public final class MediaMetadataCompat implements Parcelable {

    /* renamed from: A0 */
    private static final String[] f170A0;

    /* renamed from: B0 */
    private static final String[] f171B0;
    public static final Creator<MediaMetadataCompat> CREATOR = new C0051a();

    /* renamed from: O */
    private static final String f172O = "MediaMetadata";

    /* renamed from: P */
    public static final String f173P = "android.media.metadata.TITLE";

    /* renamed from: Q */
    public static final String f174Q = "android.media.metadata.ARTIST";

    /* renamed from: R */
    public static final String f175R = "android.media.metadata.DURATION";

    /* renamed from: S */
    public static final String f176S = "android.media.metadata.ALBUM";

    /* renamed from: T */
    public static final String f177T = "android.media.metadata.AUTHOR";

    /* renamed from: U */
    public static final String f178U = "android.media.metadata.WRITER";

    /* renamed from: V */
    public static final String f179V = "android.media.metadata.COMPOSER";

    /* renamed from: W */
    public static final String f180W = "android.media.metadata.COMPILATION";

    /* renamed from: X */
    public static final String f181X = "android.media.metadata.DATE";

    /* renamed from: Y */
    public static final String f182Y = "android.media.metadata.YEAR";

    /* renamed from: Z */
    public static final String f183Z = "android.media.metadata.GENRE";

    /* renamed from: a0 */
    public static final String f184a0 = "android.media.metadata.TRACK_NUMBER";

    /* renamed from: b0 */
    public static final String f185b0 = "android.media.metadata.NUM_TRACKS";

    /* renamed from: c0 */
    public static final String f186c0 = "android.media.metadata.DISC_NUMBER";

    /* renamed from: d0 */
    public static final String f187d0 = "android.media.metadata.ALBUM_ARTIST";

    /* renamed from: e0 */
    public static final String f188e0 = "android.media.metadata.ART";

    /* renamed from: f0 */
    public static final String f189f0 = "android.media.metadata.ART_URI";

    /* renamed from: g0 */
    public static final String f190g0 = "android.media.metadata.ALBUM_ART";

    /* renamed from: h0 */
    public static final String f191h0 = "android.media.metadata.ALBUM_ART_URI";

    /* renamed from: i0 */
    public static final String f192i0 = "android.media.metadata.USER_RATING";

    /* renamed from: j0 */
    public static final String f193j0 = "android.media.metadata.RATING";

    /* renamed from: k0 */
    public static final String f194k0 = "android.media.metadata.DISPLAY_TITLE";

    /* renamed from: l0 */
    public static final String f195l0 = "android.media.metadata.DISPLAY_SUBTITLE";

    /* renamed from: m0 */
    public static final String f196m0 = "android.media.metadata.DISPLAY_DESCRIPTION";

    /* renamed from: n0 */
    public static final String f197n0 = "android.media.metadata.DISPLAY_ICON";

    /* renamed from: o0 */
    public static final String f198o0 = "android.media.metadata.DISPLAY_ICON_URI";

    /* renamed from: p0 */
    public static final String f199p0 = "android.media.metadata.MEDIA_ID";

    /* renamed from: q0 */
    public static final String f200q0 = "android.media.metadata.MEDIA_URI";

    /* renamed from: r0 */
    public static final String f201r0 = "android.media.metadata.BT_FOLDER_TYPE";

    /* renamed from: s0 */
    public static final String f202s0 = "android.media.metadata.ADVERTISEMENT";

    /* renamed from: t0 */
    public static final String f203t0 = "android.media.metadata.DOWNLOAD_STATUS";

    /* renamed from: u0 */
    static final int f204u0 = 0;

    /* renamed from: v0 */
    static final int f205v0 = 1;

    /* renamed from: w0 */
    static final int f206w0 = 2;

    /* renamed from: x0 */
    static final int f207x0 = 3;

    /* renamed from: y0 */
    static final C0635a<String, Integer> f208y0 = new C0635a<>();

    /* renamed from: z0 */
    private static final String[] f209z0;

    /* renamed from: N */
    private MediaDescriptionCompat f210N;

    /* renamed from: a */
    final Bundle f211a;

    /* renamed from: b */
    private Object f212b;

    /* renamed from: android.support.v4.media.MediaMetadataCompat$a */
    static class C0051a implements Creator<MediaMetadataCompat> {
        C0051a() {
        }

        public MediaMetadataCompat createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }

        public MediaMetadataCompat[] newArray(int i) {
            return new MediaMetadataCompat[i];
        }
    }

    @C0207n0({C0208a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.media.MediaMetadataCompat$b */
    public @interface C0052b {
    }

    /* renamed from: android.support.v4.media.MediaMetadataCompat$c */
    public static final class C0053c {

        /* renamed from: a */
        private final Bundle f213a;

        public C0053c() {
            this.f213a = new Bundle();
        }

        /* renamed from: a */
        public C0053c mo183a(String str, CharSequence charSequence) {
            if (!MediaMetadataCompat.f208y0.containsKey(str) || ((Integer) MediaMetadataCompat.f208y0.get(str)).intValue() == 1) {
                this.f213a.putCharSequence(str, charSequence);
                return this;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("The ");
            sb.append(str);
            sb.append(" key cannot be used to put a CharSequence");
            throw new IllegalArgumentException(sb.toString());
        }

        public C0053c(MediaMetadataCompat mediaMetadataCompat) {
            this.f213a = new Bundle(mediaMetadataCompat.f211a);
            MediaSessionCompat.m514b(this.f213a);
        }

        /* renamed from: a */
        public C0053c mo184a(String str, String str2) {
            if (!MediaMetadataCompat.f208y0.containsKey(str) || ((Integer) MediaMetadataCompat.f208y0.get(str)).intValue() == 1) {
                this.f213a.putCharSequence(str, str2);
                return this;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("The ");
            sb.append(str);
            sb.append(" key cannot be used to put a String");
            throw new IllegalArgumentException(sb.toString());
        }

        @C0207n0({C0208a.LIBRARY_GROUP})
        public C0053c(MediaMetadataCompat mediaMetadataCompat, int i) {
            this(mediaMetadataCompat);
            for (String str : this.f213a.keySet()) {
                Object obj = this.f213a.get(str);
                if (obj instanceof Bitmap) {
                    Bitmap bitmap = (Bitmap) obj;
                    if (bitmap.getHeight() > i || bitmap.getWidth() > i) {
                        mo181a(str, m199a(bitmap, i));
                    }
                }
            }
        }

        /* renamed from: a */
        public C0053c mo180a(String str, long j) {
            if (!MediaMetadataCompat.f208y0.containsKey(str) || ((Integer) MediaMetadataCompat.f208y0.get(str)).intValue() == 0) {
                this.f213a.putLong(str, j);
                return this;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("The ");
            sb.append(str);
            sb.append(" key cannot be used to put a long");
            throw new IllegalArgumentException(sb.toString());
        }

        /* renamed from: a */
        public C0053c mo182a(String str, RatingCompat ratingCompat) {
            if (!MediaMetadataCompat.f208y0.containsKey(str) || ((Integer) MediaMetadataCompat.f208y0.get(str)).intValue() == 3) {
                if (VERSION.SDK_INT >= 19) {
                    this.f213a.putParcelable(str, (Parcelable) ratingCompat.mo187b());
                } else {
                    this.f213a.putParcelable(str, ratingCompat);
                }
                return this;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("The ");
            sb.append(str);
            sb.append(" key cannot be used to put a Rating");
            throw new IllegalArgumentException(sb.toString());
        }

        /* renamed from: a */
        public C0053c mo181a(String str, Bitmap bitmap) {
            if (!MediaMetadataCompat.f208y0.containsKey(str) || ((Integer) MediaMetadataCompat.f208y0.get(str)).intValue() == 2) {
                this.f213a.putParcelable(str, bitmap);
                return this;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("The ");
            sb.append(str);
            sb.append(" key cannot be used to put a Bitmap");
            throw new IllegalArgumentException(sb.toString());
        }

        /* renamed from: a */
        public MediaMetadataCompat mo185a() {
            return new MediaMetadataCompat(this.f213a);
        }

        /* renamed from: a */
        private Bitmap m199a(Bitmap bitmap, int i) {
            float f = (float) i;
            float min = Math.min(f / ((float) bitmap.getWidth()), f / ((float) bitmap.getHeight()));
            return Bitmap.createScaledBitmap(bitmap, (int) (((float) bitmap.getWidth()) * min), (int) (((float) bitmap.getHeight()) * min), true);
        }
    }

    @C0207n0({C0208a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.media.MediaMetadataCompat$d */
    public @interface C0054d {
    }

    @C0207n0({C0208a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.media.MediaMetadataCompat$e */
    public @interface C0055e {
    }

    @C0207n0({C0208a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.media.MediaMetadataCompat$f */
    public @interface C0056f {
    }

    static {
        C0635a<String, Integer> aVar = f208y0;
        Integer valueOf = Integer.valueOf(1);
        String str = f173P;
        aVar.put(str, valueOf);
        C0635a<String, Integer> aVar2 = f208y0;
        String str2 = f174Q;
        aVar2.put(str2, valueOf);
        C0635a<String, Integer> aVar3 = f208y0;
        Integer valueOf2 = Integer.valueOf(0);
        aVar3.put(f175R, valueOf2);
        C0635a<String, Integer> aVar4 = f208y0;
        String str3 = f176S;
        aVar4.put(str3, valueOf);
        C0635a<String, Integer> aVar5 = f208y0;
        String str4 = f177T;
        aVar5.put(str4, valueOf);
        C0635a<String, Integer> aVar6 = f208y0;
        String str5 = f178U;
        aVar6.put(str5, valueOf);
        C0635a<String, Integer> aVar7 = f208y0;
        String str6 = f179V;
        aVar7.put(str6, valueOf);
        f208y0.put(f180W, valueOf);
        f208y0.put(f181X, valueOf);
        f208y0.put(f182Y, valueOf2);
        f208y0.put(f183Z, valueOf);
        f208y0.put(f184a0, valueOf2);
        f208y0.put(f185b0, valueOf2);
        f208y0.put(f186c0, valueOf2);
        C0635a<String, Integer> aVar8 = f208y0;
        String str7 = f187d0;
        aVar8.put(str7, valueOf);
        C0635a<String, Integer> aVar9 = f208y0;
        Integer valueOf3 = Integer.valueOf(2);
        String str8 = f188e0;
        aVar9.put(str8, valueOf3);
        C0635a<String, Integer> aVar10 = f208y0;
        String str9 = f189f0;
        aVar10.put(str9, valueOf);
        C0635a<String, Integer> aVar11 = f208y0;
        String str10 = f190g0;
        aVar11.put(str10, valueOf3);
        C0635a<String, Integer> aVar12 = f208y0;
        String str11 = f191h0;
        aVar12.put(str11, valueOf);
        C0635a<String, Integer> aVar13 = f208y0;
        String str12 = str11;
        Integer valueOf4 = Integer.valueOf(3);
        aVar13.put(f192i0, valueOf4);
        f208y0.put(f193j0, valueOf4);
        f208y0.put(f194k0, valueOf);
        f208y0.put(f195l0, valueOf);
        f208y0.put(f196m0, valueOf);
        f208y0.put(f197n0, valueOf3);
        f208y0.put(f198o0, valueOf);
        f208y0.put(f199p0, valueOf);
        f208y0.put(f201r0, valueOf2);
        f208y0.put(f200q0, valueOf);
        f208y0.put(f202s0, valueOf2);
        f208y0.put(f203t0, valueOf2);
        f209z0 = new String[]{str, str2, str3, str7, str5, str4, str6};
        f170A0 = new String[]{f197n0, str8, str10};
        f171B0 = new String[]{f198o0, str9, str12};
    }

    MediaMetadataCompat(Bundle bundle) {
        this.f211a = new Bundle(bundle);
        MediaSessionCompat.m514b(this.f211a);
    }

    /* renamed from: a */
    public boolean mo166a(String str) {
        return this.f211a.containsKey(str);
    }

    /* renamed from: b */
    public MediaDescriptionCompat mo167b() {
        Uri uri;
        Bitmap bitmap;
        Uri uri2;
        MediaDescriptionCompat mediaDescriptionCompat = this.f210N;
        if (mediaDescriptionCompat != null) {
            return mediaDescriptionCompat;
        }
        String f = mo173f(f199p0);
        CharSequence[] charSequenceArr = new CharSequence[3];
        CharSequence g = mo174g(f194k0);
        if (TextUtils.isEmpty(g)) {
            int i = 0;
            int i2 = 0;
            while (i < charSequenceArr.length) {
                String[] strArr = f209z0;
                if (i2 >= strArr.length) {
                    break;
                }
                int i3 = i2 + 1;
                CharSequence g2 = mo174g(strArr[i2]);
                if (!TextUtils.isEmpty(g2)) {
                    int i4 = i + 1;
                    charSequenceArr[i] = g2;
                    i = i4;
                }
                i2 = i3;
            }
        } else {
            charSequenceArr[0] = g;
            charSequenceArr[1] = mo174g(f195l0);
            charSequenceArr[2] = mo174g(f196m0);
        }
        int i5 = 0;
        while (true) {
            String[] strArr2 = f170A0;
            uri = null;
            if (i5 >= strArr2.length) {
                bitmap = null;
                break;
            }
            bitmap = mo168c(strArr2[i5]);
            if (bitmap != null) {
                break;
            }
            i5++;
        }
        int i6 = 0;
        while (true) {
            String[] strArr3 = f171B0;
            if (i6 >= strArr3.length) {
                uri2 = null;
                break;
            }
            String f2 = mo173f(strArr3[i6]);
            if (!TextUtils.isEmpty(f2)) {
                uri2 = Uri.parse(f2);
                break;
            }
            i6++;
        }
        String f3 = mo173f(f200q0);
        if (!TextUtils.isEmpty(f3)) {
            uri = Uri.parse(f3);
        }
        C0050b bVar = new C0050b();
        bVar.mo160a(f);
        bVar.mo164c(charSequenceArr[0]);
        bVar.mo163b(charSequenceArr[1]);
        bVar.mo159a(charSequenceArr[2]);
        bVar.mo156a(bitmap);
        bVar.mo157a(uri2);
        bVar.mo162b(uri);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f211a;
        String str = f201r0;
        if (bundle2.containsKey(str)) {
            bundle.putLong(MediaDescriptionCompat.f139U, mo170d(str));
        }
        Bundle bundle3 = this.f211a;
        String str2 = f203t0;
        if (bundle3.containsKey(str2)) {
            bundle.putLong(MediaDescriptionCompat.f147c0, mo170d(str2));
        }
        if (!bundle.isEmpty()) {
            bVar.mo158a(bundle);
        }
        this.f210N = bVar.mo161a();
        return this.f210N;
    }

    /* renamed from: c */
    public Bitmap mo168c(String str) {
        try {
            return (Bitmap) this.f211a.getParcelable(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: d */
    public long mo170d(String str) {
        return this.f211a.getLong(str, 0);
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public RatingCompat mo172e(String str) {
        try {
            if (VERSION.SDK_INT >= 19) {
                return RatingCompat.m210b((Object) this.f211a.getParcelable(str));
            }
            return (RatingCompat) this.f211a.getParcelable(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: f */
    public String mo173f(String str) {
        CharSequence charSequence = this.f211a.getCharSequence(str);
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    /* renamed from: g */
    public CharSequence mo174g(String str) {
        return this.f211a.getCharSequence(str);
    }

    /* renamed from: i */
    public Set<String> mo175i() {
        return this.f211a.keySet();
    }

    /* renamed from: j */
    public int mo176j() {
        return this.f211a.size();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f211a);
    }

    /* renamed from: a */
    public Bundle mo165a() {
        return new Bundle(this.f211a);
    }

    /* renamed from: c */
    public Object mo169c() {
        if (this.f212b == null && VERSION.SDK_INT >= 21) {
            Parcel obtain = Parcel.obtain();
            writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            this.f212b = C0076f.m268a(obtain);
            obtain.recycle();
        }
        return this.f212b;
    }

    MediaMetadataCompat(Parcel parcel) {
        this.f211a = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }

    /* renamed from: b */
    public static MediaMetadataCompat m187b(Object obj) {
        if (obj == null || VERSION.SDK_INT < 21) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        C0076f.m270a(obj, obtain, 0);
        obtain.setDataPosition(0);
        MediaMetadataCompat mediaMetadataCompat = (MediaMetadataCompat) CREATOR.createFromParcel(obtain);
        obtain.recycle();
        mediaMetadataCompat.f212b = obj;
        return mediaMetadataCompat;
    }
}
