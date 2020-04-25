package kotlin.p504e1;

import java.util.NoSuchElementException;
import kotlin.p219v0.C14838s;

/* renamed from: kotlin.e1.b */
/* compiled from: ProgressionIterators.kt */
public final class C14512b extends C14838s {

    /* renamed from: N */
    private int f42665N;

    /* renamed from: O */
    private final int f42666O;

    /* renamed from: a */
    private final int f42667a;

    /* renamed from: b */
    private boolean f42668b;

    /* JADX WARNING: Incorrect type for immutable var: ssa=char, code=int, for r3v0, types: [int, char] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C14512b(int r3, char r4, int r5) {
        /*
            r2 = this;
            r2.<init>()
            r2.f42666O = r5
            r2.f42667a = r4
            int r5 = r2.f42666O
            r0 = 1
            r1 = 0
            if (r5 <= 0) goto L_0x0010
            if (r3 > r4) goto L_0x0013
            goto L_0x0014
        L_0x0010:
            if (r3 < r4) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            r2.f42668b = r0
            boolean r4 = r2.f42668b
            if (r4 == 0) goto L_0x001b
            goto L_0x001d
        L_0x001b:
            int r3 = r2.f42667a
        L_0x001d:
            r2.f42665N = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p504e1.C14512b.<init>(char, char, int):void");
    }

    /* renamed from: b */
    public char mo24981b() {
        int i = this.f42665N;
        if (i != this.f42667a) {
            this.f42665N = this.f42666O + i;
        } else if (this.f42668b) {
            this.f42668b = false;
        } else {
            throw new NoSuchElementException();
        }
        return (char) i;
    }

    /* renamed from: c */
    public final int mo45691c() {
        return this.f42666O;
    }

    public boolean hasNext() {
        return this.f42668b;
    }
}
