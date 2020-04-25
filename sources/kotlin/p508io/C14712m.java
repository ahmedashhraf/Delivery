package kotlin.p508io;

import java.io.File;
import kotlin.p214b1.p216u.C14445h0;
import p205i.p209c.p210a.C6003d;

/* renamed from: kotlin.io.m */
/* compiled from: FileTreeWalk.kt */
class C14712m extends C14710l {
    @C6003d
    /* renamed from: a */
    public static /* synthetic */ C14699g m63797a(File file, C14707i iVar, int i, Object obj) {
        if ((i & 1) != 0) {
            iVar = C14707i.TOP_DOWN;
        }
        return m63796a(file, iVar);
    }

    @C6003d
    /* renamed from: e */
    public static final C14699g m63798e(@C6003d File file) {
        C14445h0.m62478f(file, "$receiver");
        return m63796a(file, C14707i.BOTTOM_UP);
    }

    @C6003d
    /* renamed from: f */
    public static final C14699g m63799f(@C6003d File file) {
        C14445h0.m62478f(file, "$receiver");
        return m63796a(file, C14707i.TOP_DOWN);
    }

    @C6003d
    /* renamed from: a */
    public static final C14699g m63796a(@C6003d File file, @C6003d C14707i iVar) {
        C14445h0.m62478f(file, "$receiver");
        C14445h0.m62478f(iVar, "direction");
        return new C14699g(file, iVar);
    }
}
