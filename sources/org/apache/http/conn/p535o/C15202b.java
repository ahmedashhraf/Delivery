package org.apache.http.conn.p535o;

import java.net.InetAddress;
import org.apache.http.C15460l;
import org.apache.http.conn.p535o.C15205e.C15206a;
import org.apache.http.conn.p535o.C15205e.C15207b;
import org.apache.http.p224d0.C6144b;

@C6144b
/* renamed from: org.apache.http.conn.o.b */
/* compiled from: HttpRoute */
public final class C15202b implements C15205e, Cloneable {

    /* renamed from: R */
    private static final C15460l[] f44091R = new C15460l[0];

    /* renamed from: N */
    private final C15460l[] f44092N;

    /* renamed from: O */
    private final C15207b f44093O;

    /* renamed from: P */
    private final C15206a f44094P;

    /* renamed from: Q */
    private final boolean f44095Q;

    /* renamed from: a */
    private final C15460l f44096a;

    /* renamed from: b */
    private final InetAddress f44097b;

    private C15202b(InetAddress inetAddress, C15460l lVar, C15460l[] lVarArr, boolean z, C15207b bVar, C15206a aVar) {
        if (lVar == null) {
            throw new IllegalArgumentException("Target host may not be null.");
        } else if (lVarArr == null) {
            throw new IllegalArgumentException("Proxies may not be null.");
        } else if (bVar == C15207b.TUNNELLED && lVarArr.length == 0) {
            throw new IllegalArgumentException("Proxy required if tunnelled.");
        } else {
            if (bVar == null) {
                bVar = C15207b.PLAIN;
            }
            if (aVar == null) {
                aVar = C15206a.PLAIN;
            }
            this.f44096a = lVar;
            this.f44097b = inetAddress;
            this.f44092N = lVarArr;
            this.f44095Q = z;
            this.f44093O = bVar;
            this.f44094P = aVar;
        }
    }

    /* renamed from: a */
    private static C15460l[] m67384a(C15460l lVar) {
        if (lVar == null) {
            return f44091R;
        }
        return new C15460l[]{lVar};
    }

    /* renamed from: b */
    public final C15460l mo47048b() {
        return this.f44096a;
    }

    /* renamed from: c */
    public final int mo47049c() {
        return this.f44092N.length + 1;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /* renamed from: d */
    public final boolean mo47051d() {
        return this.f44095Q;
    }

    /* renamed from: e */
    public final C15207b mo47052e() {
        return this.f44093O;
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        int i = 0;
        if (!(obj instanceof C15202b)) {
            return false;
        }
        C15202b bVar = (C15202b) obj;
        boolean equals = this.f44096a.equals(bVar.f44096a);
        InetAddress inetAddress = this.f44097b;
        InetAddress inetAddress2 = bVar.f44097b;
        boolean z2 = equals & (inetAddress == inetAddress2 || (inetAddress != null && inetAddress.equals(inetAddress2)));
        C15460l[] lVarArr = this.f44092N;
        C15460l[] lVarArr2 = bVar.f44092N;
        boolean z3 = z2 & (lVarArr == lVarArr2 || lVarArr.length == lVarArr2.length);
        if (!(this.f44095Q == bVar.f44095Q && this.f44093O == bVar.f44093O && this.f44094P == bVar.f44094P)) {
            z = false;
        }
        boolean z4 = z & z3;
        if (z4 && this.f44092N != null) {
            while (z4) {
                C15460l[] lVarArr3 = this.f44092N;
                if (i >= lVarArr3.length) {
                    break;
                }
                z4 = lVarArr3[i].equals(bVar.f44092N[i]);
                i++;
            }
        }
        return z4;
    }

    /* renamed from: f */
    public final boolean mo47054f() {
        return this.f44093O == C15207b.TUNNELLED;
    }

    /* renamed from: g */
    public final C15206a mo47055g() {
        return this.f44094P;
    }

    public final InetAddress getLocalAddress() {
        return this.f44097b;
    }

    /* renamed from: h */
    public final C15460l mo47057h() {
        C15460l[] lVarArr = this.f44092N;
        if (lVarArr.length == 0) {
            return null;
        }
        return lVarArr[0];
    }

    public final int hashCode() {
        int hashCode = this.f44096a.hashCode();
        InetAddress inetAddress = this.f44097b;
        if (inetAddress != null) {
            hashCode ^= inetAddress.hashCode();
        }
        C15460l[] lVarArr = this.f44092N;
        int length = hashCode ^ lVarArr.length;
        for (C15460l hashCode2 : lVarArr) {
            length ^= hashCode2.hashCode();
        }
        if (this.f44095Q) {
            length ^= 286331153;
        }
        return (length ^ this.f44093O.hashCode()) ^ this.f44094P.hashCode();
    }

    /* renamed from: i */
    public final boolean mo47059i() {
        return this.f44094P == C15206a.LAYERED;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((mo47049c() * 30) + 50);
        sb.append("HttpRoute[");
        InetAddress inetAddress = this.f44097b;
        String str = "->";
        if (inetAddress != null) {
            sb.append(inetAddress);
            sb.append(str);
        }
        sb.append('{');
        if (this.f44093O == C15207b.TUNNELLED) {
            sb.append('t');
        }
        if (this.f44094P == C15206a.LAYERED) {
            sb.append('l');
        }
        if (this.f44095Q) {
            sb.append('s');
        }
        sb.append("}->");
        for (C15460l append : this.f44092N) {
            sb.append(append);
            sb.append(str);
        }
        sb.append(this.f44096a);
        sb.append(']');
        return sb.toString();
    }

    /* renamed from: a */
    private static C15460l[] m67385a(C15460l[] lVarArr) {
        if (lVarArr == null || lVarArr.length < 1) {
            return f44091R;
        }
        int length = lVarArr.length;
        int i = 0;
        while (i < length) {
            if (lVarArr[i] != null) {
                i++;
            } else {
                throw new IllegalArgumentException("Proxy chain may not contain null elements.");
            }
        }
        C15460l[] lVarArr2 = new C15460l[lVarArr.length];
        System.arraycopy(lVarArr, 0, lVarArr2, 0, lVarArr.length);
        return lVarArr2;
    }

    /* renamed from: a */
    public final C15460l mo47047a(int i) {
        if (i >= 0) {
            int c = mo47049c();
            if (i >= c) {
                StringBuilder sb = new StringBuilder();
                sb.append("Hop index ");
                sb.append(i);
                sb.append(" exceeds route length ");
                sb.append(c);
                throw new IllegalArgumentException(sb.toString());
            } else if (i < c - 1) {
                return this.f44092N[i];
            } else {
                return this.f44096a;
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Hop index must not be negative: ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public C15202b(C15460l lVar, InetAddress inetAddress, C15460l[] lVarArr, boolean z, C15207b bVar, C15206a aVar) {
        this(inetAddress, lVar, m67385a(lVarArr), z, bVar, aVar);
    }

    public C15202b(C15460l lVar, InetAddress inetAddress, C15460l lVar2, boolean z, C15207b bVar, C15206a aVar) {
        this(inetAddress, lVar, m67384a(lVar2), z, bVar, aVar);
    }

    public C15202b(C15460l lVar, InetAddress inetAddress, boolean z) {
        this(inetAddress, lVar, f44091R, z, C15207b.PLAIN, C15206a.PLAIN);
    }

    public C15202b(C15460l lVar) {
        this((InetAddress) null, lVar, f44091R, false, C15207b.PLAIN, C15206a.PLAIN);
    }

    public C15202b(C15460l lVar, InetAddress inetAddress, C15460l lVar2, boolean z) {
        this(inetAddress, lVar, m67384a(lVar2), z, z ? C15207b.TUNNELLED : C15207b.PLAIN, z ? C15206a.LAYERED : C15206a.PLAIN);
        if (lVar2 == null) {
            throw new IllegalArgumentException("Proxy host may not be null.");
        }
    }
}
