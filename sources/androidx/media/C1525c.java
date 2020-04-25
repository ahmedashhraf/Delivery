package androidx.media;

import android.os.Bundle;
import androidx.annotation.C0193h0;
import java.util.Arrays;

/* renamed from: androidx.media.c */
/* compiled from: AudioAttributesImplBase */
class C1525c implements C1523a {

    /* renamed from: a */
    int f5869a = 0;

    /* renamed from: b */
    int f5870b = 0;

    /* renamed from: c */
    int f5871c = 0;

    /* renamed from: d */
    int f5872d = -1;

    C1525c() {
    }

    @C0193h0
    /* renamed from: a */
    public Bundle mo6671a() {
        Bundle bundle = new Bundle();
        bundle.putInt("androidx.media.audio_attrs.USAGE", this.f5869a);
        bundle.putInt("androidx.media.audio_attrs.CONTENT_TYPE", this.f5870b);
        bundle.putInt("androidx.media.audio_attrs.FLAGS", this.f5871c);
        int i = this.f5872d;
        if (i != -1) {
            bundle.putInt("androidx.media.audio_attrs.LEGACY_STREAM_TYPE", i);
        }
        return bundle;
    }

    /* renamed from: b */
    public int mo6672b() {
        int i = this.f5872d;
        if (i != -1) {
            return i;
        }
        return AudioAttributesCompat.m7893a(false, this.f5871c, this.f5869a);
    }

    /* renamed from: c */
    public int mo6673c() {
        return this.f5872d;
    }

    /* renamed from: d */
    public int mo6674d() {
        return this.f5869a;
    }

    /* renamed from: e */
    public Object mo6675e() {
        return null;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof C1525c)) {
            return false;
        }
        C1525c cVar = (C1525c) obj;
        if (this.f5870b == cVar.getContentType() && this.f5871c == cVar.mo6678k() && this.f5869a == cVar.mo6674d() && this.f5872d == cVar.f5872d) {
            z = true;
        }
        return z;
    }

    /* renamed from: f */
    public int mo6676f() {
        return AudioAttributesCompat.m7893a(true, this.f5871c, this.f5869a);
    }

    public int getContentType() {
        return this.f5870b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f5870b), Integer.valueOf(this.f5871c), Integer.valueOf(this.f5869a), Integer.valueOf(this.f5872d)});
    }

    /* renamed from: k */
    public int mo6678k() {
        int i = this.f5871c;
        int b = mo6672b();
        if (b == 6) {
            i |= 4;
        } else if (b == 7) {
            i |= 1;
        }
        return i & 273;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f5872d != -1) {
            sb.append(" stream=");
            sb.append(this.f5872d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.m7898b(this.f5869a));
        sb.append(" content=");
        sb.append(this.f5870b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f5871c).toUpperCase());
        return sb.toString();
    }

    C1525c(int i, int i2, int i3, int i4) {
        this.f5870b = i;
        this.f5871c = i2;
        this.f5869a = i3;
        this.f5872d = i4;
    }

    /* renamed from: a */
    public static C1523a m7928a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return new C1525c(bundle.getInt("androidx.media.audio_attrs.CONTENT_TYPE", 0), bundle.getInt("androidx.media.audio_attrs.FLAGS", 0), bundle.getInt("androidx.media.audio_attrs.USAGE", 0), bundle.getInt("androidx.media.audio_attrs.LEGACY_STREAM_TYPE", -1));
    }
}
