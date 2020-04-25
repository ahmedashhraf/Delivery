package android.support.p003v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.media.MediaDescription.Builder;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
/* renamed from: android.support.v4.media.d */
/* compiled from: MediaDescriptionCompatApi21 */
class C0072d {

    /* renamed from: android.support.v4.media.d$a */
    /* compiled from: MediaDescriptionCompatApi21 */
    static class C0073a {
        private C0073a() {
        }

        /* renamed from: a */
        public static Object m256a() {
            return new Builder();
        }

        /* renamed from: b */
        public static void m263b(Object obj, CharSequence charSequence) {
            ((Builder) obj).setSubtitle(charSequence);
        }

        /* renamed from: c */
        public static void m264c(Object obj, CharSequence charSequence) {
            ((Builder) obj).setTitle(charSequence);
        }

        /* renamed from: a */
        public static void m262a(Object obj, String str) {
            ((Builder) obj).setMediaId(str);
        }

        /* renamed from: a */
        public static void m261a(Object obj, CharSequence charSequence) {
            ((Builder) obj).setDescription(charSequence);
        }

        /* renamed from: a */
        public static void m258a(Object obj, Bitmap bitmap) {
            ((Builder) obj).setIconBitmap(bitmap);
        }

        /* renamed from: a */
        public static void m259a(Object obj, Uri uri) {
            ((Builder) obj).setIconUri(uri);
        }

        /* renamed from: a */
        public static void m260a(Object obj, Bundle bundle) {
            ((Builder) obj).setExtras(bundle);
        }

        /* renamed from: a */
        public static Object m257a(Object obj) {
            return ((Builder) obj).build();
        }
    }

    private C0072d() {
    }

    /* renamed from: a */
    public static CharSequence m247a(Object obj) {
        return ((MediaDescription) obj).getDescription();
    }

    /* renamed from: b */
    public static Bundle m250b(Object obj) {
        return ((MediaDescription) obj).getExtras();
    }

    /* renamed from: c */
    public static Bitmap m251c(Object obj) {
        return ((MediaDescription) obj).getIconBitmap();
    }

    /* renamed from: d */
    public static Uri m252d(Object obj) {
        return ((MediaDescription) obj).getIconUri();
    }

    /* renamed from: e */
    public static String m253e(Object obj) {
        return ((MediaDescription) obj).getMediaId();
    }

    /* renamed from: f */
    public static CharSequence m254f(Object obj) {
        return ((MediaDescription) obj).getSubtitle();
    }

    /* renamed from: g */
    public static CharSequence m255g(Object obj) {
        return ((MediaDescription) obj).getTitle();
    }

    /* renamed from: a */
    public static void m249a(Object obj, Parcel parcel, int i) {
        ((MediaDescription) obj).writeToParcel(parcel, i);
    }

    /* renamed from: a */
    public static Object m248a(Parcel parcel) {
        return MediaDescription.CREATOR.createFromParcel(parcel);
    }
}
