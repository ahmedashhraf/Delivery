package kotlin.p504e1;

import java.util.NoSuchElementException;
import kotlin.p219v0.C14790l0;

/* renamed from: kotlin.e1.j */
/* compiled from: ProgressionIterators.kt */
public final class C14524j extends C14790l0 {

    /* renamed from: N */
    private int f42681N;

    /* renamed from: O */
    private final int f42682O;

    /* renamed from: a */
    private final int f42683a;

    /* renamed from: b */
    private boolean f42684b;

    public C14524j(int i, int i2, int i3) {
        this.f42682O = i3;
        this.f42683a = i2;
        boolean z = true;
        if (this.f42682O <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.f42684b = z;
        if (!this.f42684b) {
            i = this.f42683a;
        }
        this.f42681N = i;
    }

    /* renamed from: b */
    public int mo45559b() {
        int i = this.f42681N;
        if (i != this.f42683a) {
            this.f42681N = this.f42682O + i;
        } else if (this.f42684b) {
            this.f42684b = false;
        } else {
            throw new NoSuchElementException();
        }
        return i;
    }

    /* renamed from: c */
    public final int mo45721c() {
        return this.f42682O;
    }

    public boolean hasNext() {
        return this.f42684b;
    }
}
