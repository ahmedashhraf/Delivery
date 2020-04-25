package android.support.p003v4.media.session;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.media.session.PlaybackStateCompat */
public final class PlaybackStateCompat implements Parcelable {

    /* renamed from: A0 */
    public static final int f434A0 = 7;

    /* renamed from: B0 */
    public static final int f435B0 = 8;

    /* renamed from: C0 */
    public static final int f436C0 = 9;
    public static final Creator<PlaybackStateCompat> CREATOR = new C0124a();

    /* renamed from: D0 */
    public static final int f437D0 = 10;

    /* renamed from: E0 */
    public static final int f438E0 = 11;

    /* renamed from: F0 */
    public static final long f439F0 = -1;

    /* renamed from: G0 */
    public static final int f440G0 = -1;

    /* renamed from: H0 */
    public static final int f441H0 = 0;

    /* renamed from: I0 */
    public static final int f442I0 = 1;

    /* renamed from: J0 */
    public static final int f443J0 = 2;

    /* renamed from: K0 */
    public static final int f444K0 = 3;

    /* renamed from: L0 */
    public static final int f445L0 = -1;

    /* renamed from: M0 */
    public static final int f446M0 = 0;

    /* renamed from: N0 */
    public static final int f447N0 = 1;

    /* renamed from: O0 */
    public static final int f448O0 = 2;

    /* renamed from: P0 */
    public static final int f449P0 = 0;

    /* renamed from: Q0 */
    public static final int f450Q0 = 1;

    /* renamed from: R0 */
    public static final int f451R0 = 2;

    /* renamed from: S0 */
    public static final int f452S0 = 3;

    /* renamed from: T0 */
    public static final int f453T0 = 4;

    /* renamed from: U0 */
    public static final int f454U0 = 5;

    /* renamed from: V0 */
    public static final int f455V0 = 6;

    /* renamed from: W0 */
    public static final int f456W0 = 7;

    /* renamed from: X */
    public static final long f457X = 1;

    /* renamed from: X0 */
    public static final int f458X0 = 8;

    /* renamed from: Y */
    public static final long f459Y = 2;

    /* renamed from: Y0 */
    public static final int f460Y0 = 9;

    /* renamed from: Z */
    public static final long f461Z = 4;

    /* renamed from: Z0 */
    public static final int f462Z0 = 10;

    /* renamed from: a0 */
    public static final long f463a0 = 8;

    /* renamed from: a1 */
    public static final int f464a1 = 11;

    /* renamed from: b0 */
    public static final long f465b0 = 16;

    /* renamed from: b1 */
    private static final int f466b1 = 127;

    /* renamed from: c0 */
    public static final long f467c0 = 32;

    /* renamed from: c1 */
    private static final int f468c1 = 126;

    /* renamed from: d0 */
    public static final long f469d0 = 64;

    /* renamed from: e0 */
    public static final long f470e0 = 128;

    /* renamed from: f0 */
    public static final long f471f0 = 256;

    /* renamed from: g0 */
    public static final long f472g0 = 512;

    /* renamed from: h0 */
    public static final long f473h0 = 1024;

    /* renamed from: i0 */
    public static final long f474i0 = 2048;

    /* renamed from: j0 */
    public static final long f475j0 = 4096;

    /* renamed from: k0 */
    public static final long f476k0 = 8192;

    /* renamed from: l0 */
    public static final long f477l0 = 16384;

    /* renamed from: m0 */
    public static final long f478m0 = 32768;

    /* renamed from: n0 */
    public static final long f479n0 = 65536;

    /* renamed from: o0 */
    public static final long f480o0 = 131072;

    /* renamed from: p0 */
    public static final long f481p0 = 262144;
    @Deprecated

    /* renamed from: q0 */
    public static final long f482q0 = 524288;

    /* renamed from: r0 */
    public static final long f483r0 = 1048576;

    /* renamed from: s0 */
    public static final long f484s0 = 2097152;

    /* renamed from: t0 */
    public static final int f485t0 = 0;

    /* renamed from: u0 */
    public static final int f486u0 = 1;

    /* renamed from: v0 */
    public static final int f487v0 = 2;

    /* renamed from: w0 */
    public static final int f488w0 = 3;

    /* renamed from: x0 */
    public static final int f489x0 = 4;

    /* renamed from: y0 */
    public static final int f490y0 = 5;

    /* renamed from: z0 */
    public static final int f491z0 = 6;

    /* renamed from: N */
    final long f492N;

    /* renamed from: O */
    final float f493O;

    /* renamed from: P */
    final long f494P;

    /* renamed from: Q */
    final int f495Q;

    /* renamed from: R */
    final CharSequence f496R;

    /* renamed from: S */
    final long f497S;

    /* renamed from: T */
    List<CustomAction> f498T;

    /* renamed from: U */
    final long f499U;

    /* renamed from: V */
    final Bundle f500V;

    /* renamed from: W */
    private Object f501W;

    /* renamed from: a */
    final int f502a;

    /* renamed from: b */
    final long f503b;

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction */
    public static final class CustomAction implements Parcelable {
        public static final Creator<CustomAction> CREATOR = new C0122a();

        /* renamed from: N */
        private final int f504N;

        /* renamed from: O */
        private final Bundle f505O;

        /* renamed from: P */
        private Object f506P;

        /* renamed from: a */
        private final String f507a;

        /* renamed from: b */
        private final CharSequence f508b;

        /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction$a */
        static class C0122a implements Creator<CustomAction> {
            C0122a() {
            }

            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            public CustomAction[] newArray(int i) {
                return new CustomAction[i];
            }
        }

        /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction$b */
        public static final class C0123b {

            /* renamed from: a */
            private final String f509a;

            /* renamed from: b */
            private final CharSequence f510b;

            /* renamed from: c */
            private final int f511c;

            /* renamed from: d */
            private Bundle f512d;

            public C0123b(String str, CharSequence charSequence, int i) {
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("You must specify an action to build a CustomAction.");
                } else if (TextUtils.isEmpty(charSequence)) {
                    throw new IllegalArgumentException("You must specify a name to build a CustomAction.");
                } else if (i != 0) {
                    this.f509a = str;
                    this.f510b = charSequence;
                    this.f511c = i;
                } else {
                    throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction.");
                }
            }

            /* renamed from: a */
            public C0123b mo560a(Bundle bundle) {
                this.f512d = bundle;
                return this;
            }

            /* renamed from: a */
            public CustomAction mo561a() {
                return new CustomAction(this.f509a, this.f510b, this.f511c, this.f512d);
            }
        }

        CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.f507a = str;
            this.f508b = charSequence;
            this.f504N = i;
            this.f505O = bundle;
        }

        /* renamed from: b */
        public static CustomAction m822b(Object obj) {
            if (obj == null || VERSION.SDK_INT < 21) {
                return null;
            }
            CustomAction customAction = new CustomAction(C0158a.m1074a(obj), C0158a.m1077d(obj), C0158a.m1076c(obj), C0158a.m1075b(obj));
            customAction.f506P = obj;
            return customAction;
        }

        /* renamed from: a */
        public String mo550a() {
            return this.f507a;
        }

        /* renamed from: c */
        public Bundle mo552c() {
            return this.f505O;
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: i */
        public int mo554i() {
            return this.f504N;
        }

        /* renamed from: j */
        public CharSequence mo555j() {
            return this.f508b;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Action:mName='");
            sb.append(this.f508b);
            sb.append(", mIcon=");
            sb.append(this.f504N);
            sb.append(", mExtras=");
            sb.append(this.f505O);
            return sb.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f507a);
            TextUtils.writeToParcel(this.f508b, parcel, i);
            parcel.writeInt(this.f504N);
            parcel.writeBundle(this.f505O);
        }

        CustomAction(Parcel parcel) {
            this.f507a = parcel.readString();
            this.f508b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f504N = parcel.readInt();
            this.f505O = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        /* renamed from: b */
        public Object mo551b() {
            if (this.f506P != null || VERSION.SDK_INT < 21) {
                return this.f506P;
            }
            this.f506P = C0158a.m1073a(this.f507a, this.f508b, this.f504N, this.f505O);
            return this.f506P;
        }
    }

    @C0207n0({C0208a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$State */
    public @interface State {
    }

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$a */
    static class C0124a implements Creator<PlaybackStateCompat> {
        C0124a() {
        }

        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        public PlaybackStateCompat[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }
    }

    @C0207n0({C0208a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$b */
    public @interface C0125b {
    }

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$c */
    public static final class C0126c {

        /* renamed from: a */
        private final List<CustomAction> f513a = new ArrayList();

        /* renamed from: b */
        private int f514b;

        /* renamed from: c */
        private long f515c;

        /* renamed from: d */
        private long f516d;

        /* renamed from: e */
        private float f517e;

        /* renamed from: f */
        private long f518f;

        /* renamed from: g */
        private int f519g;

        /* renamed from: h */
        private CharSequence f520h;

        /* renamed from: i */
        private long f521i;

        /* renamed from: j */
        private long f522j = -1;

        /* renamed from: k */
        private Bundle f523k;

        public C0126c() {
        }

        /* renamed from: a */
        public C0126c mo564a(int i, long j, float f) {
            return mo565a(i, j, f, SystemClock.elapsedRealtime());
        }

        /* renamed from: b */
        public C0126c mo573b(long j) {
            this.f522j = j;
            return this;
        }

        /* renamed from: c */
        public C0126c mo574c(long j) {
            this.f516d = j;
            return this;
        }

        /* renamed from: a */
        public C0126c mo565a(int i, long j, float f, long j2) {
            this.f514b = i;
            this.f515c = j;
            this.f521i = j2;
            this.f517e = f;
            return this;
        }

        public C0126c(PlaybackStateCompat playbackStateCompat) {
            this.f514b = playbackStateCompat.f502a;
            this.f515c = playbackStateCompat.f503b;
            this.f517e = playbackStateCompat.f493O;
            this.f521i = playbackStateCompat.f497S;
            this.f516d = playbackStateCompat.f492N;
            this.f518f = playbackStateCompat.f494P;
            this.f519g = playbackStateCompat.f495Q;
            this.f520h = playbackStateCompat.f496R;
            List<CustomAction> list = playbackStateCompat.f498T;
            if (list != null) {
                this.f513a.addAll(list);
            }
            this.f522j = playbackStateCompat.f499U;
            this.f523k = playbackStateCompat.f500V;
        }

        /* renamed from: a */
        public C0126c mo567a(long j) {
            this.f518f = j;
            return this;
        }

        /* renamed from: a */
        public C0126c mo571a(String str, String str2, int i) {
            return mo569a(new CustomAction(str, str2, i, null));
        }

        /* renamed from: a */
        public C0126c mo569a(CustomAction customAction) {
            if (customAction != null) {
                this.f513a.add(customAction);
                return this;
            }
            throw new IllegalArgumentException("You may not add a null CustomAction to PlaybackStateCompat.");
        }

        /* renamed from: a */
        public C0126c mo570a(CharSequence charSequence) {
            this.f520h = charSequence;
            return this;
        }

        /* renamed from: a */
        public C0126c mo566a(int i, CharSequence charSequence) {
            this.f519g = i;
            this.f520h = charSequence;
            return this;
        }

        /* renamed from: a */
        public C0126c mo568a(Bundle bundle) {
            this.f523k = bundle;
            return this;
        }

        /* renamed from: a */
        public PlaybackStateCompat mo572a() {
            PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(this.f514b, this.f515c, this.f516d, this.f517e, this.f518f, this.f519g, this.f520h, this.f521i, this.f513a, this.f522j, this.f523k);
            return playbackStateCompat;
        }
    }

    @C0207n0({C0208a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$d */
    public @interface C0127d {
    }

    @C0207n0({C0208a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$e */
    public @interface C0128e {
    }

    @C0207n0({C0208a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$f */
    public @interface C0129f {
    }

    @C0207n0({C0208a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$g */
    public @interface C0130g {
    }

    PlaybackStateCompat(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, List<CustomAction> list, long j5, Bundle bundle) {
        this.f502a = i;
        this.f503b = j;
        this.f492N = j2;
        this.f493O = f;
        this.f494P = j3;
        this.f495Q = i2;
        this.f496R = charSequence;
        this.f497S = j4;
        this.f498T = new ArrayList(list);
        this.f499U = j5;
        this.f500V = bundle;
    }

    /* renamed from: c */
    public static int m808c(long j) {
        if (j == 4) {
            return 126;
        }
        if (j == 2) {
            return 127;
        }
        if (j == 32) {
            return 87;
        }
        if (j == 16) {
            return 88;
        }
        if (j == 1) {
            return 86;
        }
        if (j == 64) {
            return 90;
        }
        if (j == 8) {
            return 89;
        }
        return j == 512 ? 85 : 0;
    }

    @C0207n0({C0208a.LIBRARY_GROUP})
    /* renamed from: a */
    public long mo535a(Long l) {
        return Math.max(0, this.f503b + ((long) (this.f493O * ((float) (l != null ? l.longValue() : SystemClock.elapsedRealtime() - this.f497S)))));
    }

    /* renamed from: b */
    public long mo536b() {
        return this.f499U;
    }

    /* renamed from: c */
    public long mo537c() {
        return this.f492N;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: i */
    public List<CustomAction> mo539i() {
        return this.f498T;
    }

    /* renamed from: j */
    public int mo540j() {
        return this.f495Q;
    }

    /* renamed from: k */
    public CharSequence mo541k() {
        return this.f496R;
    }

    @C0195i0
    /* renamed from: l */
    public Bundle mo542l() {
        return this.f500V;
    }

    /* renamed from: m */
    public long mo543m() {
        return this.f497S;
    }

    /* renamed from: n */
    public float mo544n() {
        return this.f493O;
    }

    /* renamed from: o */
    public Object mo545o() {
        if (this.f501W == null && VERSION.SDK_INT >= 21) {
            ArrayList arrayList = null;
            List<CustomAction> list = this.f498T;
            if (list != null) {
                arrayList = new ArrayList(list.size());
                for (CustomAction b : this.f498T) {
                    arrayList.add(b.mo551b());
                }
            }
            ArrayList arrayList2 = arrayList;
            if (VERSION.SDK_INT >= 22) {
                this.f501W = C0159k.m1079a(this.f502a, this.f503b, this.f492N, this.f493O, this.f494P, this.f496R, this.f497S, arrayList2, this.f499U, this.f500V);
            } else {
                this.f501W = C0157j.m1064a(this.f502a, this.f503b, this.f492N, this.f493O, this.f494P, this.f496R, this.f497S, arrayList2, this.f499U);
            }
        }
        return this.f501W;
    }

    /* renamed from: p */
    public long mo546p() {
        return this.f503b;
    }

    /* renamed from: q */
    public int mo547q() {
        return this.f502a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PlaybackState {");
        sb.append("state=");
        sb.append(this.f502a);
        sb.append(", position=");
        sb.append(this.f503b);
        sb.append(", buffered position=");
        sb.append(this.f492N);
        sb.append(", speed=");
        sb.append(this.f493O);
        sb.append(", updated=");
        sb.append(this.f497S);
        sb.append(", actions=");
        sb.append(this.f494P);
        sb.append(", error code=");
        sb.append(this.f495Q);
        sb.append(", error message=");
        sb.append(this.f496R);
        sb.append(", custom actions=");
        sb.append(this.f498T);
        sb.append(", active item id=");
        sb.append(this.f499U);
        sb.append("}");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f502a);
        parcel.writeLong(this.f503b);
        parcel.writeFloat(this.f493O);
        parcel.writeLong(this.f497S);
        parcel.writeLong(this.f492N);
        parcel.writeLong(this.f494P);
        TextUtils.writeToParcel(this.f496R, parcel, i);
        parcel.writeTypedList(this.f498T);
        parcel.writeLong(this.f499U);
        parcel.writeBundle(this.f500V);
        parcel.writeInt(this.f495Q);
    }

    /* renamed from: b */
    public static PlaybackStateCompat m807b(Object obj) {
        List list;
        Object obj2 = obj;
        Bundle bundle = null;
        if (obj2 == null || VERSION.SDK_INT < 21) {
            return null;
        }
        List<Object> d = C0157j.m1067d(obj);
        if (d != null) {
            ArrayList arrayList = new ArrayList(d.size());
            for (Object b : d) {
                arrayList.add(CustomAction.m822b(b));
            }
            list = arrayList;
        } else {
            list = null;
        }
        if (VERSION.SDK_INT >= 22) {
            bundle = C0159k.m1078a(obj);
        }
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(C0157j.m1072i(obj), C0157j.m1071h(obj), C0157j.m1066c(obj), C0157j.m1070g(obj), C0157j.m1063a(obj), 0, C0157j.m1068e(obj), C0157j.m1069f(obj), list, C0157j.m1065b(obj), bundle);
        playbackStateCompat.f501W = obj2;
        return playbackStateCompat;
    }

    /* renamed from: a */
    public long mo534a() {
        return this.f494P;
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f502a = parcel.readInt();
        this.f503b = parcel.readLong();
        this.f493O = parcel.readFloat();
        this.f497S = parcel.readLong();
        this.f492N = parcel.readLong();
        this.f494P = parcel.readLong();
        this.f496R = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f498T = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f499U = parcel.readLong();
        this.f500V = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f495Q = parcel.readInt();
    }
}
