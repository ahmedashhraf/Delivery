package p076c.p112d.p134b.p135a.p143g.p270t0;

import java.io.IOException;

/* renamed from: c.d.b.a.g.t0.f */
/* compiled from: DataStoreUtils */
public final class C6429f {
    private C6429f() {
    }

    /* renamed from: a */
    public static String m29840a(C6427d<?> dVar) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append('{');
            boolean z = true;
            for (String str : dVar.keySet()) {
                if (z) {
                    z = false;
                } else {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append('=');
                sb.append(dVar.mo25867b(str));
            }
            sb.append('}');
            return sb.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
