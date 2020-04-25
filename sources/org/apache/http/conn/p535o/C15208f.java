package org.apache.http.conn.p535o;

import java.net.InetAddress;
import org.apache.http.C15460l;
import org.apache.http.conn.p535o.C15205e.C15206a;
import org.apache.http.conn.p535o.C15205e.C15207b;
import org.apache.http.p224d0.C6145c;

@C6145c
/* renamed from: org.apache.http.conn.o.f */
/* compiled from: RouteTracker */
public final class C15208f implements C15205e, Cloneable {

    /* renamed from: N */
    private boolean f44105N;

    /* renamed from: O */
    private C15460l[] f44106O;

    /* renamed from: P */
    private C15207b f44107P;

    /* renamed from: Q */
    private C15206a f44108Q;

    /* renamed from: R */
    private boolean f44109R;

    /* renamed from: a */
    private final C15460l f44110a;

    /* renamed from: b */
    private final InetAddress f44111b;

    public C15208f(C15460l lVar, InetAddress inetAddress) {
        if (lVar != null) {
            this.f44110a = lVar;
            this.f44111b = inetAddress;
            this.f44107P = C15207b.PLAIN;
            this.f44108Q = C15206a.PLAIN;
            return;
        }
        throw new IllegalArgumentException("Target host may not be null.");
    }

    /* renamed from: a */
    public final void mo47063a(boolean z) {
        if (!this.f44105N) {
            this.f44105N = true;
            this.f44109R = z;
            return;
        }
        throw new IllegalStateException("Already connected.");
    }

    /* renamed from: b */
    public final void mo47064b(C15460l lVar, boolean z) {
        if (lVar == null) {
            throw new IllegalArgumentException("Proxy host may not be null.");
        } else if (this.f44105N) {
            C15460l[] lVarArr = this.f44106O;
            if (lVarArr != null) {
                C15460l[] lVarArr2 = new C15460l[(lVarArr.length + 1)];
                System.arraycopy(lVarArr, 0, lVarArr2, 0, lVarArr.length);
                lVarArr2[lVarArr2.length - 1] = lVar;
                this.f44106O = lVarArr2;
                this.f44109R = z;
                return;
            }
            throw new IllegalStateException("No proxy tunnel without proxy.");
        } else {
            throw new IllegalStateException("No tunnel unless connected.");
        }
    }

    /* renamed from: c */
    public final void mo47066c(boolean z) {
        if (!this.f44105N) {
            throw new IllegalStateException("No tunnel unless connected.");
        } else if (this.f44106O != null) {
            this.f44107P = C15207b.TUNNELLED;
            this.f44109R = z;
        } else {
            throw new IllegalStateException("No tunnel without proxy.");
        }
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /* renamed from: d */
    public final boolean mo47051d() {
        return this.f44109R;
    }

    /* renamed from: e */
    public final C15207b mo47052e() {
        return this.f44107P;
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        int i = 0;
        if (!(obj instanceof C15208f)) {
            return false;
        }
        C15208f fVar = (C15208f) obj;
        boolean equals = this.f44110a.equals(fVar.f44110a);
        InetAddress inetAddress = this.f44111b;
        InetAddress inetAddress2 = fVar.f44111b;
        boolean z2 = equals & (inetAddress == inetAddress2 || (inetAddress != null && inetAddress.equals(inetAddress2)));
        C15460l[] lVarArr = this.f44106O;
        C15460l[] lVarArr2 = fVar.f44106O;
        boolean z3 = z2 & (lVarArr == lVarArr2 || !(lVarArr == null || lVarArr2 == null || lVarArr.length != lVarArr2.length));
        if (!(this.f44105N == fVar.f44105N && this.f44109R == fVar.f44109R && this.f44107P == fVar.f44107P && this.f44108Q == fVar.f44108Q)) {
            z = false;
        }
        boolean z4 = z & z3;
        if (z4 && this.f44106O != null) {
            while (z4) {
                C15460l[] lVarArr3 = this.f44106O;
                if (i >= lVarArr3.length) {
                    break;
                }
                z4 = lVarArr3[i].equals(fVar.f44106O[i]);
                i++;
            }
        }
        return z4;
    }

    /* renamed from: f */
    public final boolean mo47054f() {
        return this.f44107P == C15207b.TUNNELLED;
    }

    /* renamed from: g */
    public final C15206a mo47055g() {
        return this.f44108Q;
    }

    public final InetAddress getLocalAddress() {
        return this.f44111b;
    }

    /* renamed from: h */
    public final C15460l mo47057h() {
        C15460l[] lVarArr = this.f44106O;
        if (lVarArr == null) {
            return null;
        }
        return lVarArr[0];
    }

    public final int hashCode() {
        int i;
        int hashCode = this.f44110a.hashCode();
        InetAddress inetAddress = this.f44111b;
        if (inetAddress != null) {
            hashCode ^= inetAddress.hashCode();
        }
        C15460l[] lVarArr = this.f44106O;
        if (lVarArr != null) {
            i ^= lVarArr.length;
            int i2 = 0;
            while (true) {
                C15460l[] lVarArr2 = this.f44106O;
                if (i2 >= lVarArr2.length) {
                    break;
                }
                i ^= lVarArr2[i2].hashCode();
                i2++;
            }
        }
        if (this.f44105N) {
            i ^= 286331153;
        }
        if (this.f44109R) {
            i ^= 572662306;
        }
        return (i ^ this.f44107P.hashCode()) ^ this.f44108Q.hashCode();
    }

    /* renamed from: i */
    public final boolean mo47059i() {
        return this.f44108Q == C15206a.LAYERED;
    }

    /* renamed from: j */
    public final boolean mo47070j() {
        return this.f44105N;
    }

    /* renamed from: k */
    public final C15202b mo47071k() {
        if (!this.f44105N) {
            return null;
        }
        C15202b bVar = new C15202b(this.f44110a, this.f44111b, this.f44106O, this.f44109R, this.f44107P, this.f44108Q);
        return bVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((mo47049c() * 30) + 50);
        sb.append("RouteTracker[");
        InetAddress inetAddress = this.f44111b;
        String str = "->";
        if (inetAddress != null) {
            sb.append(inetAddress);
            sb.append(str);
        }
        sb.append('{');
        if (this.f44105N) {
            sb.append('c');
        }
        if (this.f44107P == C15207b.TUNNELLED) {
            sb.append('t');
        }
        if (this.f44108Q == C15206a.LAYERED) {
            sb.append('l');
        }
        if (this.f44109R) {
            sb.append('s');
        }
        sb.append("}->");
        if (this.f44106O != null) {
            int i = 0;
            while (true) {
                C15460l[] lVarArr = this.f44106O;
                if (i >= lVarArr.length) {
                    break;
                }
                sb.append(lVarArr[i]);
                sb.append(str);
                i++;
            }
        }
        sb.append(this.f44110a);
        sb.append(']');
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo47062a(C15460l lVar, boolean z) {
        if (lVar == null) {
            throw new IllegalArgumentException("Proxy host may not be null.");
        } else if (!this.f44105N) {
            this.f44105N = true;
            this.f44106O = new C15460l[]{lVar};
            this.f44109R = z;
        } else {
            throw new IllegalStateException("Already connected.");
        }
    }

    public C15208f(C15202b bVar) {
        this(bVar.mo47048b(), bVar.getLocalAddress());
    }

    /* renamed from: c */
    public final int mo47049c() {
        if (!this.f44105N) {
            return 0;
        }
        C15460l[] lVarArr = this.f44106O;
        if (lVarArr == null) {
            return 1;
        }
        return 1 + lVarArr.length;
    }

    /* renamed from: a */
    public final C15460l mo47047a(int i) {
        if (i >= 0) {
            int c = mo47049c();
            if (i >= c) {
                StringBuilder sb = new StringBuilder();
                sb.append("Hop index ");
                sb.append(i);
                sb.append(" exceeds tracked route length ");
                sb.append(c);
                sb.append(".");
                throw new IllegalArgumentException(sb.toString());
            } else if (i < c - 1) {
                return this.f44106O[i];
            } else {
                return this.f44110a;
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Hop index must not be negative: ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* renamed from: b */
    public final void mo47065b(boolean z) {
        if (this.f44105N) {
            this.f44108Q = C15206a.LAYERED;
            this.f44109R = z;
            return;
        }
        throw new IllegalStateException("No layered protocol unless connected.");
    }

    /* renamed from: b */
    public final C15460l mo47048b() {
        return this.f44110a;
    }
}
