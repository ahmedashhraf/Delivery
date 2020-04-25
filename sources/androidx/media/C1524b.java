package androidx.media;

import android.annotation.TargetApi;
import android.media.AudioAttributes;
import android.os.Build.VERSION;
import android.os.Bundle;
import androidx.annotation.C0193h0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@TargetApi(21)
/* renamed from: androidx.media.b */
/* compiled from: AudioAttributesImplApi21 */
class C1524b implements C1523a {

    /* renamed from: c */
    private static final String f5865c = "AudioAttributesCompat21";

    /* renamed from: d */
    static Method f5866d;

    /* renamed from: a */
    AudioAttributes f5867a;

    /* renamed from: b */
    int f5868b;

    C1524b() {
        this.f5868b = -1;
    }

    /* renamed from: g */
    static Method m7920g() {
        try {
            if (f5866d == null) {
                f5866d = AudioAttributes.class.getMethod("toLegacyStreamType", new Class[]{AudioAttributes.class});
            }
            return f5866d;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @C0193h0
    /* renamed from: a */
    public Bundle mo6671a() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("androidx.media.audio_attrs.FRAMEWORKS", this.f5867a);
        int i = this.f5868b;
        if (i != -1) {
            bundle.putInt("androidx.media.audio_attrs.LEGACY_STREAM_TYPE", i);
        }
        return bundle;
    }

    /* renamed from: b */
    public int mo6672b() {
        int i = this.f5868b;
        if (i != -1) {
            return i;
        }
        Method g = m7920g();
        if (g == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("No AudioAttributes#toLegacyStreamType() on API: ");
            sb.append(VERSION.SDK_INT);
            sb.toString();
            return -1;
        }
        try {
            return ((Integer) g.invoke(null, new Object[]{this.f5867a})).intValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("getLegacyStreamType() failed on API: ");
            sb2.append(VERSION.SDK_INT);
            sb2.toString();
            return -1;
        }
    }

    /* renamed from: c */
    public int mo6673c() {
        return this.f5868b;
    }

    /* renamed from: d */
    public int mo6674d() {
        return this.f5867a.getUsage();
    }

    /* renamed from: e */
    public Object mo6675e() {
        return this.f5867a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1524b)) {
            return false;
        }
        return this.f5867a.equals(((C1524b) obj).f5867a);
    }

    /* renamed from: f */
    public int mo6676f() {
        if (VERSION.SDK_INT >= 26) {
            return this.f5867a.getVolumeControlStream();
        }
        return AudioAttributesCompat.m7893a(true, mo6678k(), mo6674d());
    }

    public int getContentType() {
        return this.f5867a.getContentType();
    }

    public int hashCode() {
        return this.f5867a.hashCode();
    }

    /* renamed from: k */
    public int mo6678k() {
        return this.f5867a.getFlags();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AudioAttributesCompat: audioattributes=");
        sb.append(this.f5867a);
        return sb.toString();
    }

    C1524b(AudioAttributes audioAttributes) {
        this(audioAttributes, -1);
    }

    C1524b(AudioAttributes audioAttributes, int i) {
        this.f5868b = -1;
        this.f5867a = audioAttributes;
        this.f5868b = i;
    }

    /* renamed from: a */
    public static C1523a m7919a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        AudioAttributes audioAttributes = (AudioAttributes) bundle.getParcelable("androidx.media.audio_attrs.FRAMEWORKS");
        if (audioAttributes == null) {
            return null;
        }
        return new C1524b(audioAttributes, bundle.getInt("androidx.media.audio_attrs.LEGACY_STREAM_TYPE", -1));
    }
}
