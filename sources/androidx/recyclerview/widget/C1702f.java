package androidx.recyclerview.widget;

import androidx.annotation.C0193h0;

/* renamed from: androidx.recyclerview.widget.f */
/* compiled from: BatchingListUpdateCallback */
public class C1702f implements C1765t {

    /* renamed from: Q */
    private static final int f6534Q = 0;

    /* renamed from: R */
    private static final int f6535R = 1;

    /* renamed from: S */
    private static final int f6536S = 2;

    /* renamed from: T */
    private static final int f6537T = 3;

    /* renamed from: N */
    int f6538N = -1;

    /* renamed from: O */
    int f6539O = -1;

    /* renamed from: P */
    Object f6540P = null;

    /* renamed from: a */
    final C1765t f6541a;

    /* renamed from: b */
    int f6542b = 0;

    public C1702f(@C0193h0 C1765t tVar) {
        this.f6541a = tVar;
    }

    /* renamed from: a */
    public void mo7798a() {
        int i = this.f6542b;
        if (i != 0) {
            if (i == 1) {
                this.f6541a.mo7720b(this.f6538N, this.f6539O);
            } else if (i == 2) {
                this.f6541a.mo7721c(this.f6538N, this.f6539O);
            } else if (i == 3) {
                this.f6541a.mo7719a(this.f6538N, this.f6539O, this.f6540P);
            }
            this.f6540P = null;
            this.f6542b = 0;
        }
    }

    /* renamed from: b */
    public void mo7720b(int i, int i2) {
        if (this.f6542b == 1) {
            int i3 = this.f6538N;
            if (i >= i3) {
                int i4 = this.f6539O;
                if (i <= i3 + i4) {
                    this.f6539O = i4 + i2;
                    this.f6538N = Math.min(i, i3);
                    return;
                }
            }
        }
        mo7798a();
        this.f6538N = i;
        this.f6539O = i2;
        this.f6542b = 1;
    }

    /* renamed from: c */
    public void mo7721c(int i, int i2) {
        if (this.f6542b == 2) {
            int i3 = this.f6538N;
            if (i3 >= i && i3 <= i + i2) {
                this.f6539O += i2;
                this.f6538N = i;
                return;
            }
        }
        mo7798a();
        this.f6538N = i;
        this.f6539O = i2;
        this.f6542b = 2;
    }

    /* renamed from: a */
    public void mo7718a(int i, int i2) {
        mo7798a();
        this.f6541a.mo7718a(i, i2);
    }

    /* renamed from: a */
    public void mo7719a(int i, int i2, Object obj) {
        if (this.f6542b == 3) {
            int i3 = this.f6538N;
            int i4 = this.f6539O;
            if (i <= i3 + i4) {
                int i5 = i + i2;
                if (i5 >= i3 && this.f6540P == obj) {
                    int i6 = i4 + i3;
                    this.f6538N = Math.min(i, i3);
                    this.f6539O = Math.max(i6, i5) - this.f6538N;
                    return;
                }
            }
        }
        mo7798a();
        this.f6538N = i;
        this.f6539O = i2;
        this.f6540P = obj;
        this.f6542b = 3;
    }
}
