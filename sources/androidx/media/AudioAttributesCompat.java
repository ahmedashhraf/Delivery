package androidx.media;

import android.media.AudioAttributes;
import android.media.AudioAttributes.Builder;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.SparseIntArray;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.versionedparcelable.C2003g;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class AudioAttributesCompat implements C2003g {

    /* renamed from: A */
    private static final SparseIntArray f5810A = new SparseIntArray();

    /* renamed from: B */
    static boolean f5811B = false;

    /* renamed from: C */
    private static final int[] f5812C = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16};

    /* renamed from: D */
    public static final int f5813D = 1;

    /* renamed from: E */
    static final int f5814E = 2;

    /* renamed from: F */
    static final int f5815F = 4;

    /* renamed from: G */
    static final int f5816G = 8;

    /* renamed from: H */
    public static final int f5817H = 16;

    /* renamed from: I */
    static final int f5818I = 32;

    /* renamed from: J */
    static final int f5819J = 64;

    /* renamed from: K */
    static final int f5820K = 128;

    /* renamed from: L */
    static final int f5821L = 256;

    /* renamed from: M */
    static final int f5822M = 512;

    /* renamed from: N */
    static final int f5823N = 1023;

    /* renamed from: O */
    static final int f5824O = 273;

    /* renamed from: P */
    static final int f5825P = -1;

    /* renamed from: Q */
    static final String f5826Q = "androidx.media.audio_attrs.FRAMEWORKS";

    /* renamed from: R */
    static final String f5827R = "androidx.media.audio_attrs.USAGE";

    /* renamed from: S */
    static final String f5828S = "androidx.media.audio_attrs.CONTENT_TYPE";

    /* renamed from: T */
    static final String f5829T = "androidx.media.audio_attrs.FLAGS";

    /* renamed from: U */
    static final String f5830U = "androidx.media.audio_attrs.LEGACY_STREAM_TYPE";

    /* renamed from: b */
    private static final String f5831b = "AudioAttributesCompat";

    /* renamed from: c */
    public static final int f5832c = 0;

    /* renamed from: d */
    public static final int f5833d = 1;

    /* renamed from: e */
    public static final int f5834e = 2;

    /* renamed from: f */
    public static final int f5835f = 3;

    /* renamed from: g */
    public static final int f5836g = 4;

    /* renamed from: h */
    public static final int f5837h = 0;

    /* renamed from: i */
    public static final int f5838i = 1;

    /* renamed from: j */
    public static final int f5839j = 2;

    /* renamed from: k */
    public static final int f5840k = 3;

    /* renamed from: l */
    public static final int f5841l = 4;

    /* renamed from: m */
    public static final int f5842m = 5;

    /* renamed from: n */
    public static final int f5843n = 6;

    /* renamed from: o */
    public static final int f5844o = 7;

    /* renamed from: p */
    public static final int f5845p = 8;

    /* renamed from: q */
    public static final int f5846q = 9;

    /* renamed from: r */
    public static final int f5847r = 10;

    /* renamed from: s */
    public static final int f5848s = 11;

    /* renamed from: t */
    public static final int f5849t = 12;

    /* renamed from: u */
    public static final int f5850u = 13;

    /* renamed from: v */
    public static final int f5851v = 14;

    /* renamed from: w */
    private static final int f5852w = 15;

    /* renamed from: x */
    public static final int f5853x = 16;

    /* renamed from: y */
    private static final int f5854y = 1;

    /* renamed from: z */
    private static final int f5855z = 2;

    /* renamed from: a */
    C1523a f5856a;

    @C0207n0({C0208a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.media.AudioAttributesCompat$a */
    public @interface C1515a {
    }

    @C0207n0({C0208a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.media.AudioAttributesCompat$b */
    public @interface C1516b {
    }

    /* renamed from: androidx.media.AudioAttributesCompat$c */
    static abstract class C1517c {

        /* renamed from: a */
        public static final int f5857a = 6;

        /* renamed from: b */
        public static final int f5858b = 7;

        /* renamed from: c */
        public static final int f5859c = 9;

        /* renamed from: d */
        public static final int f5860d = 10;

        private C1517c() {
        }
    }

    /* renamed from: androidx.media.AudioAttributesCompat$d */
    public static class C1518d {

        /* renamed from: a */
        private int f5861a = 0;

        /* renamed from: b */
        private int f5862b = 0;

        /* renamed from: c */
        private int f5863c = 0;

        /* renamed from: d */
        private int f5864d = -1;

        public C1518d() {
        }

        /* renamed from: a */
        public AudioAttributesCompat mo6666a() {
            C1523a aVar;
            if (AudioAttributesCompat.f5811B || VERSION.SDK_INT < 21) {
                aVar = new C1525c(this.f5862b, this.f5863c, this.f5861a, this.f5864d);
            } else {
                Builder usage = new Builder().setContentType(this.f5862b).setFlags(this.f5863c).setUsage(this.f5861a);
                int i = this.f5864d;
                if (i != -1) {
                    usage.setLegacyStreamType(i);
                }
                aVar = new C1524b(usage.build(), this.f5864d);
            }
            return new AudioAttributesCompat(aVar);
        }

        /* renamed from: b */
        public C1518d mo6667b(int i) {
            this.f5863c = (i & AudioAttributesCompat.f5823N) | this.f5863c;
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public C1518d mo6668c(int i) {
            switch (i) {
                case 0:
                    this.f5862b = 1;
                    break;
                case 1:
                    break;
                case 2:
                    this.f5862b = 4;
                    break;
                case 3:
                    this.f5862b = 2;
                    break;
                case 4:
                    this.f5862b = 4;
                    break;
                case 5:
                    this.f5862b = 4;
                    break;
                case 6:
                    this.f5862b = 1;
                    this.f5863c |= 4;
                    break;
                case 7:
                    this.f5863c = 1 | this.f5863c;
                    break;
                case 8:
                    this.f5862b = 4;
                    break;
                case 9:
                    this.f5862b = 4;
                    break;
                case 10:
                    this.f5862b = 1;
                    break;
                default:
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid stream type ");
                    sb.append(i);
                    sb.append(" for AudioAttributesCompat");
                    sb.toString();
                    break;
            }
            this.f5862b = 4;
            this.f5861a = AudioAttributesCompat.m7892a(i);
            return this;
        }

        /* renamed from: d */
        public C1518d mo6669d(int i) {
            if (i != 10) {
                this.f5864d = i;
                return VERSION.SDK_INT >= 21 ? mo6668c(i) : this;
            }
            throw new IllegalArgumentException("STREAM_ACCESSIBILITY is not a legacy stream type that was used for audio playback");
        }

        /* renamed from: e */
        public C1518d mo6670e(int i) {
            switch (i) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    this.f5861a = i;
                    break;
                case 16:
                    if (!AudioAttributesCompat.f5811B && VERSION.SDK_INT > 25) {
                        this.f5861a = i;
                        break;
                    } else {
                        this.f5861a = 12;
                        break;
                    }
                default:
                    this.f5861a = 0;
                    break;
            }
            return this;
        }

        public C1518d(AudioAttributesCompat audioAttributesCompat) {
            this.f5861a = audioAttributesCompat.mo6657d();
            this.f5862b = audioAttributesCompat.getContentType();
            this.f5863c = audioAttributesCompat.mo6663k();
            this.f5864d = audioAttributesCompat.mo6656c();
        }

        /* renamed from: a */
        public C1518d mo6665a(int i) {
            if (i == 0 || i == 1 || i == 2 || i == 3 || i == 4) {
                this.f5862b = i;
            } else {
                this.f5861a = 0;
            }
            return this;
        }
    }

    static {
        f5810A.put(5, 1);
        f5810A.put(6, 2);
        f5810A.put(7, 2);
        f5810A.put(8, 1);
        f5810A.put(9, 1);
        f5810A.put(10, 1);
    }

    AudioAttributesCompat() {
    }

    /* renamed from: a */
    static int m7892a(int i) {
        switch (i) {
            case 0:
                return 2;
            case 1:
            case 7:
                return 13;
            case 2:
                return 6;
            case 3:
                return 1;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 2;
            case 8:
                return 3;
            case 10:
                return 11;
            default:
                return 0;
        }
    }

    @C0195i0
    /* renamed from: a */
    public static AudioAttributesCompat m7896a(@C0193h0 Object obj) {
        if (VERSION.SDK_INT < 21 || f5811B) {
            return null;
        }
        C1524b bVar = new C1524b((AudioAttributes) obj);
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.f5856a = bVar;
        return audioAttributesCompat;
    }

    /* renamed from: b */
    public int mo6655b() {
        return this.f5856a.mo6672b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo6656c() {
        return this.f5856a.mo6673c();
    }

    /* renamed from: d */
    public int mo6657d() {
        return this.f5856a.mo6674d();
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        C1523a aVar = this.f5856a;
        if (aVar != null) {
            return aVar.equals(audioAttributesCompat.f5856a);
        }
        if (audioAttributesCompat.f5856a == null) {
            z = true;
        }
        return z;
    }

    /* renamed from: f */
    public int mo6659f() {
        return this.f5856a.mo6676f();
    }

    @C0195i0
    /* renamed from: g */
    public Object mo6660g() {
        return this.f5856a.mo6675e();
    }

    public int getContentType() {
        return this.f5856a.getContentType();
    }

    public int hashCode() {
        return this.f5856a.hashCode();
    }

    /* renamed from: k */
    public int mo6663k() {
        return this.f5856a.mo6678k();
    }

    public String toString() {
        return this.f5856a.toString();
    }

    AudioAttributesCompat(C1523a aVar) {
        this.f5856a = aVar;
    }

    /* renamed from: b */
    static String m7898b(int i) {
        switch (i) {
            case 0:
                return "USAGE_UNKNOWN";
            case 1:
                return "USAGE_MEDIA";
            case 2:
                return "USAGE_VOICE_COMMUNICATION";
            case 3:
                return "USAGE_VOICE_COMMUNICATION_SIGNALLING";
            case 4:
                return "USAGE_ALARM";
            case 5:
                return "USAGE_NOTIFICATION";
            case 6:
                return "USAGE_NOTIFICATION_RINGTONE";
            case 7:
                return "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
            case 8:
                return "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
            case 9:
                return "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
            case 10:
                return "USAGE_NOTIFICATION_EVENT";
            case 11:
                return "USAGE_ASSISTANCE_ACCESSIBILITY";
            case 12:
                return "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
            case 13:
                return "USAGE_ASSISTANCE_SONIFICATION";
            case 14:
                return "USAGE_GAME";
            case 16:
                return "USAGE_ASSISTANT";
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("unknown usage ");
                sb.append(i);
                return sb.toString();
        }
    }

    @C0193h0
    @C0207n0({C0208a.LIBRARY_GROUP})
    /* renamed from: a */
    public Bundle mo6654a() {
        return this.f5856a.mo6671a();
    }

    @C0207n0({C0208a.LIBRARY_GROUP})
    /* renamed from: a */
    public static AudioAttributesCompat m7895a(Bundle bundle) {
        C1523a aVar;
        if (VERSION.SDK_INT >= 21) {
            aVar = C1524b.m7919a(bundle);
        } else {
            aVar = C1525c.m7928a(bundle);
        }
        if (aVar == null) {
            return null;
        }
        return new AudioAttributesCompat(aVar);
    }

    @C0207n0({C0208a.LIBRARY_GROUP})
    /* renamed from: a */
    public static void m7897a(boolean z) {
        f5811B = z;
    }

    /* renamed from: a */
    static int m7894a(boolean z, AudioAttributesCompat audioAttributesCompat) {
        return m7893a(z, audioAttributesCompat.mo6663k(), audioAttributesCompat.mo6657d());
    }

    /* renamed from: a */
    static int m7893a(boolean z, int i, int i2) {
        int i3 = 1;
        if ((i & 1) == 1) {
            if (!z) {
                i3 = 7;
            }
            return i3;
        }
        int i4 = 0;
        if ((i & 4) == 4) {
            if (!z) {
                i4 = 6;
            }
            return i4;
        }
        int i5 = 3;
        switch (i2) {
            case 0:
                if (z) {
                    i5 = Integer.MIN_VALUE;
                }
                return i5;
            case 1:
            case 12:
            case 14:
            case 16:
                return 3;
            case 2:
                break;
            case 3:
                if (!z) {
                    i4 = 8;
                    break;
                }
                break;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            case 11:
                return 10;
            case 13:
                return 1;
            default:
                if (!z) {
                    return 3;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown usage value ");
                sb.append(i2);
                sb.append(" in audio attributes");
                throw new IllegalArgumentException(sb.toString());
        }
        return i4;
    }
}
