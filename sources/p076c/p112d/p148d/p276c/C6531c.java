package p076c.p112d.p148d.p276c;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: c.d.d.c.c */
/* compiled from: AbstractHasher */
abstract class C6531c implements C6563m {
    C6531c() {
    }

    /* renamed from: a */
    public final C6563m m31078a(boolean z) {
        return mo26416a(z ? (byte) 1 : 0);
    }

    /* renamed from: a */
    public final C6563m m31074a(double d) {
        return mo26419a(Double.doubleToRawLongBits(d));
    }

    /* renamed from: a */
    public final C6563m m31075a(float f) {
        return mo26418a(Float.floatToRawIntBits(f));
    }

    /* renamed from: a */
    public C6563m m31076a(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            mo26417a(charSequence.charAt(i));
        }
        return this;
    }

    /* renamed from: a */
    public C6563m m31077a(CharSequence charSequence, Charset charset) {
        try {
            return mo26422a(charSequence.toString().getBytes(charset.name()));
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }
}
