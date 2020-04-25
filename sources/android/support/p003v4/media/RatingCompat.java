package android.support.p003v4.media;

import android.media.Rating;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: android.support.v4.media.RatingCompat */
public final class RatingCompat implements Parcelable {
    public static final Creator<RatingCompat> CREATOR = new C0057a();

    /* renamed from: O */
    private static final String f214O = "Rating";

    /* renamed from: P */
    public static final int f215P = 0;

    /* renamed from: Q */
    public static final int f216Q = 1;

    /* renamed from: R */
    public static final int f217R = 2;

    /* renamed from: S */
    public static final int f218S = 3;

    /* renamed from: T */
    public static final int f219T = 4;

    /* renamed from: U */
    public static final int f220U = 5;

    /* renamed from: V */
    public static final int f221V = 6;

    /* renamed from: W */
    private static final float f222W = -1.0f;

    /* renamed from: N */
    private Object f223N;

    /* renamed from: a */
    private final int f224a;

    /* renamed from: b */
    private final float f225b;

    /* renamed from: android.support.v4.media.RatingCompat$a */
    static class C0057a implements Creator<RatingCompat> {
        C0057a() {
        }

        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        public RatingCompat[] newArray(int i) {
            return new RatingCompat[i];
        }
    }

    @C0207n0({C0208a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.media.RatingCompat$b */
    public @interface C0058b {
    }

    @C0207n0({C0208a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.media.RatingCompat$c */
    public @interface C0059c {
    }

    RatingCompat(int i, float f) {
        this.f224a = i;
        this.f225b = f;
    }

    /* renamed from: a */
    public static RatingCompat m207a(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return new RatingCompat(i, -1.0f);
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static RatingCompat m211b(boolean z) {
        return new RatingCompat(2, z ? 1.0f : 0.0f);
    }

    /* renamed from: c */
    public int mo188c() {
        return this.f224a;
    }

    public int describeContents() {
        return this.f224a;
    }

    /* renamed from: i */
    public float mo190i() {
        int i = this.f224a;
        if ((i == 3 || i == 4 || i == 5) && mo192k()) {
            return this.f225b;
        }
        return -1.0f;
    }

    /* renamed from: j */
    public boolean mo191j() {
        boolean z = false;
        if (this.f224a != 1) {
            return false;
        }
        if (this.f225b == 1.0f) {
            z = true;
        }
        return z;
    }

    /* renamed from: k */
    public boolean mo192k() {
        return this.f225b >= 0.0f;
    }

    /* renamed from: l */
    public boolean mo193l() {
        boolean z = false;
        if (this.f224a != 2) {
            return false;
        }
        if (this.f225b == 1.0f) {
            z = true;
        }
        return z;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Rating:style=");
        sb.append(this.f224a);
        sb.append(" rating=");
        float f = this.f225b;
        if (f < 0.0f) {
            str = "unrated";
        } else {
            str = String.valueOf(f);
        }
        sb.append(str);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f224a);
        parcel.writeFloat(this.f225b);
    }

    /* renamed from: a */
    public static RatingCompat m209a(boolean z) {
        return new RatingCompat(1, z ? 1.0f : 0.0f);
    }

    /* renamed from: b */
    public static RatingCompat m210b(Object obj) {
        RatingCompat ratingCompat = null;
        if (obj != null && VERSION.SDK_INT >= 19) {
            Rating rating = (Rating) obj;
            int ratingStyle = rating.getRatingStyle();
            if (rating.isRated()) {
                switch (ratingStyle) {
                    case 1:
                        ratingCompat = m209a(rating.hasHeart());
                        break;
                    case 2:
                        ratingCompat = m211b(rating.isThumbUp());
                        break;
                    case 3:
                    case 4:
                    case 5:
                        ratingCompat = m208a(ratingStyle, rating.getStarRating());
                        break;
                    case 6:
                        ratingCompat = m206a(rating.getPercentRating());
                        break;
                    default:
                        return null;
                }
            } else {
                ratingCompat = m207a(ratingStyle);
            }
            ratingCompat.f223N = obj;
        }
        return ratingCompat;
    }

    /* renamed from: a */
    public static RatingCompat m208a(int i, float f) {
        float f2;
        if (i == 3) {
            f2 = 3.0f;
        } else if (i == 4) {
            f2 = 4.0f;
        } else if (i != 5) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid rating style (");
            sb.append(i);
            sb.append(") for a star rating");
            sb.toString();
            return null;
        } else {
            f2 = 5.0f;
        }
        if (f < 0.0f || f > f2) {
            return null;
        }
        return new RatingCompat(i, f);
    }

    /* renamed from: a */
    public static RatingCompat m206a(float f) {
        if (f < 0.0f || f > 100.0f) {
            return null;
        }
        return new RatingCompat(6, f);
    }

    /* renamed from: a */
    public float mo186a() {
        if (this.f224a != 6 || !mo192k()) {
            return -1.0f;
        }
        return this.f225b;
    }

    /* renamed from: b */
    public Object mo187b() {
        if (this.f223N == null && VERSION.SDK_INT >= 19) {
            if (mo192k()) {
                int i = this.f224a;
                switch (i) {
                    case 1:
                        this.f223N = Rating.newHeartRating(mo191j());
                        break;
                    case 2:
                        this.f223N = Rating.newThumbRating(mo193l());
                        break;
                    case 3:
                    case 4:
                    case 5:
                        this.f223N = Rating.newStarRating(i, mo190i());
                        break;
                    case 6:
                        this.f223N = Rating.newPercentageRating(mo186a());
                        break;
                    default:
                        return null;
                }
            } else {
                this.f223N = Rating.newUnratedRating(this.f224a);
            }
        }
        return this.f223N;
    }
}
