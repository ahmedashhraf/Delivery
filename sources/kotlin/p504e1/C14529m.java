package kotlin.p504e1;

import java.util.NoSuchElementException;
import kotlin.p219v0.C14792m0;

/* renamed from: kotlin.e1.m */
/* compiled from: ProgressionIterators.kt */
public final class C14529m extends C14792m0 {

    /* renamed from: N */
    private long f42691N;

    /* renamed from: O */
    private final long f42692O;

    /* renamed from: a */
    private final long f42693a;

    /* renamed from: b */
    private boolean f42694b;

    public C14529m(long j, long j2, long j3) {
        this.f42692O = j3;
        this.f42693a = j2;
        boolean z = true;
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (this.f42692O <= 0 ? i < 0 : i > 0) {
            z = false;
        }
        this.f42694b = z;
        if (!this.f42694b) {
            j = this.f42693a;
        }
        this.f42691N = j;
    }

    /* renamed from: b */
    public long mo45592b() {
        long j = this.f42691N;
        if (j != this.f42693a) {
            this.f42691N = this.f42692O + j;
        } else if (this.f42694b) {
            this.f42694b = false;
        } else {
            throw new NoSuchElementException();
        }
        return j;
    }

    /* renamed from: c */
    public final long mo45734c() {
        return this.f42692O;
    }

    public boolean hasNext() {
        return this.f42694b;
    }
}
