package kotlin;

import kotlin.p214b1.p216u.C14445h0;
import p205i.p209c.p210a.C6003d;

/* renamed from: kotlin.v */
/* compiled from: Standard.kt */
public final class C14743v extends Error {
    public C14743v() {
        this(null, 1, null);
    }

    public C14743v(@C6003d String str) {
        C14445h0.m62478f(str, "message");
        super(str);
    }

    public /* synthetic */ C14743v(String str, int i, C14487u uVar) {
        if ((i & 1) != 0) {
            str = "An operation is not implemented.";
        }
        this(str);
    }
}
