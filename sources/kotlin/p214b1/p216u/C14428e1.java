package kotlin.p214b1.p216u;

import kotlin.C6096e0;
import kotlin.p505f1.C14538b;
import kotlin.p505f1.C14557l;

/* renamed from: kotlin.b1.u.e1 */
/* compiled from: PropertyReference */
public abstract class C14428e1 extends C14473o implements C14557l {
    public C14428e1() {
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C14428e1) {
            C14428e1 e1Var = (C14428e1) obj;
            if (!mo45536t().equals(e1Var.mo45536t()) || !getName().equals(e1Var.getName()) || !mo45537v().equals(e1Var.mo45537v()) || !C14445h0.m62463a(mo45620s(), e1Var.mo45620s())) {
                z = false;
            }
            return z;
        } else if (obj instanceof C14557l) {
            return obj.equals(mo45619q());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return (((mo45536t().hashCode() * 31) + getName().hashCode()) * 31) + mo45537v().hashCode();
    }

    @C6096e0(version = "1.1")
    /* renamed from: n */
    public boolean mo45556n() {
        return mo45547u().mo45556n();
    }

    @C6096e0(version = "1.1")
    /* renamed from: o */
    public boolean mo45557o() {
        return mo45547u().mo45557o();
    }

    public String toString() {
        C14538b q = mo45619q();
        if (q != this) {
            return q.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("property ");
        sb.append(getName());
        sb.append(" (Kotlin reflection is not available)");
        return sb.toString();
    }

    @C6096e0(version = "1.1")
    public C14428e1(Object obj) {
        super(obj);
    }

    /* access modifiers changed from: protected */
    @C6096e0(version = "1.1")
    /* renamed from: u */
    public C14557l m62422u() {
        return (C14557l) super.mo45547u();
    }
}
