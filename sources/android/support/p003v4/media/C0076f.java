package android.support.p003v4.media;

import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.media.MediaMetadata.Builder;
import android.media.Rating;
import android.os.Parcel;
import androidx.annotation.RequiresApi;
import java.util.Set;

@RequiresApi(21)
/* renamed from: android.support.v4.media.f */
/* compiled from: MediaMetadataCompatApi21 */
class C0076f {

    /* renamed from: android.support.v4.media.f$a */
    /* compiled from: MediaMetadataCompatApi21 */
    public static class C0077a {
        private C0077a() {
        }

        /* renamed from: a */
        public static Object m274a() {
            return new Builder();
        }

        /* renamed from: a */
        public static void m277a(Object obj, String str, Bitmap bitmap) {
            ((Builder) obj).putBitmap(str, bitmap);
        }

        /* renamed from: a */
        public static void m276a(Object obj, String str, long j) {
            ((Builder) obj).putLong(str, j);
        }

        /* renamed from: a */
        public static void m279a(Object obj, String str, Object obj2) {
            ((Builder) obj).putRating(str, (Rating) obj2);
        }

        /* renamed from: a */
        public static void m278a(Object obj, String str, CharSequence charSequence) {
            ((Builder) obj).putText(str, charSequence);
        }

        /* renamed from: a */
        public static void m280a(Object obj, String str, String str2) {
            ((Builder) obj).putString(str, str2);
        }

        /* renamed from: a */
        public static Object m275a(Object obj) {
            return ((Builder) obj).build();
        }
    }

    private C0076f() {
    }

    /* renamed from: a */
    public static Set<String> m269a(Object obj) {
        return ((MediaMetadata) obj).keySet();
    }

    /* renamed from: b */
    public static long m271b(Object obj, String str) {
        return ((MediaMetadata) obj).getLong(str);
    }

    /* renamed from: c */
    public static Object m272c(Object obj, String str) {
        return ((MediaMetadata) obj).getRating(str);
    }

    /* renamed from: d */
    public static CharSequence m273d(Object obj, String str) {
        return ((MediaMetadata) obj).getText(str);
    }

    /* renamed from: a */
    public static Bitmap m267a(Object obj, String str) {
        return ((MediaMetadata) obj).getBitmap(str);
    }

    /* renamed from: a */
    public static void m270a(Object obj, Parcel parcel, int i) {
        ((MediaMetadata) obj).writeToParcel(parcel, i);
    }

    /* renamed from: a */
    public static Object m268a(Parcel parcel) {
        return MediaMetadata.CREATOR.createFromParcel(parcel);
    }
}
