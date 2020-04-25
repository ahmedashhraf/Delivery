package kotlin.p217i1;

import java.nio.charset.Charset;
import kotlin.p213a1.C6041f;
import kotlin.p214b1.C6055e;
import kotlin.p214b1.p216u.C14445h0;

@C6055e(name = "CharsetsKt")
/* renamed from: kotlin.i1.g */
/* compiled from: Charsets.kt */
public final class C14665g {
    @C6041f
    /* renamed from: a */
    private static final Charset m63564a(String str) {
        Charset forName = Charset.forName(str);
        C14445h0.m62453a((Object) forName, "Charset.forName(charsetName)");
        return forName;
    }
}
