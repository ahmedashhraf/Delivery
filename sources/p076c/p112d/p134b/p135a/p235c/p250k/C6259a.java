package p076c.p112d.p134b.p135a.p235c.p250k;

import com.google.common.base.C5786c0;
import com.google.common.collect.C8309z3;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.p217i1.C14662d0;

/* renamed from: c.d.b.a.c.k.a */
/* compiled from: TestUtils */
public final class C6259a {

    /* renamed from: a */
    private static final String f17609a = "UTF-8";

    private C6259a() {
    }

    /* renamed from: a */
    public static Map<String, String> m29053a(String str) throws IOException {
        HashMap hashMap = new HashMap();
        for (String a : C5786c0.m25366b((char) C14662d0.f42852c).mo23075a((CharSequence) str)) {
            ArrayList b = C8309z3.m39665b(C5786c0.m25366b('=').mo23075a((CharSequence) a));
            if (b.size() == 2) {
                String str2 = "UTF-8";
                hashMap.put(URLDecoder.decode((String) b.get(0), str2), URLDecoder.decode((String) b.get(1), str2));
            } else {
                throw new IOException("Invalid Query String");
            }
        }
        return hashMap;
    }
}
