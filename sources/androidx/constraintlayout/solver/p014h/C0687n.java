package androidx.constraintlayout.solver.p014h;

/* renamed from: androidx.constraintlayout.solver.h.n */
/* compiled from: Rectangle */
public class C0687n {

    /* renamed from: a */
    public int f2905a;

    /* renamed from: b */
    public int f2906b;

    /* renamed from: c */
    public int f2907c;

    /* renamed from: d */
    public int f2908d;

    /* renamed from: a */
    public void mo3753a(int i, int i2, int i3, int i4) {
        this.f2905a = i;
        this.f2906b = i2;
        this.f2907c = i3;
        this.f2908d = i4;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo3757b(int i, int i2) {
        this.f2905a -= i;
        this.f2906b -= i2;
        this.f2907c += i * 2;
        this.f2908d += i2 * 2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo3755a(C0687n nVar) {
        int i = this.f2905a;
        int i2 = nVar.f2905a;
        if (i >= i2 && i < i2 + nVar.f2907c) {
            int i3 = this.f2906b;
            int i4 = nVar.f2906b;
            if (i3 >= i4 && i3 < i4 + nVar.f2908d) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public int mo3756b() {
        return (this.f2906b + this.f2908d) / 2;
    }

    /* renamed from: a */
    public boolean mo3754a(int i, int i2) {
        int i3 = this.f2905a;
        if (i >= i3 && i < i3 + this.f2907c) {
            int i4 = this.f2906b;
            if (i2 >= i4 && i2 < i4 + this.f2908d) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public int mo3752a() {
        return (this.f2905a + this.f2907c) / 2;
    }
}
