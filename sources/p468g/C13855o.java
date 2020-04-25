package p468g;

import java.nio.charset.Charset;
import okhttp3.internal.C14910b;
import p470h.C13896f;

/* renamed from: g.o */
/* compiled from: Credentials */
public final class C13855o {
    private C13855o() {
    }

    /* renamed from: a */
    public static String m59177a(String str, String str2) {
        return m59178a(str, str2, C14910b.f43168k);
    }

    /* renamed from: a */
    public static String m59178a(String str, String str2, Charset charset) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        String e = C13896f.m59649a(sb.toString(), charset).mo43972e();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Basic ");
        sb2.append(e);
        return sb2.toString();
    }
}
