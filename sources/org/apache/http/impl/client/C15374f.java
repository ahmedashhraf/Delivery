package org.apache.http.impl.client;

import org.apache.http.p224d0.C6145c;
import org.apache.http.p548i0.C15349a;
import org.apache.http.p548i0.C15357i;

@C6145c
/* renamed from: org.apache.http.impl.client.f */
/* compiled from: ClientParamsStack */
public class C15374f extends C15349a {

    /* renamed from: N */
    protected final C15357i f44476N;

    /* renamed from: O */
    protected final C15357i f44477O;

    /* renamed from: a */
    protected final C15357i f44478a;

    /* renamed from: b */
    protected final C15357i f44479b;

    public C15374f(C15357i iVar, C15357i iVar2, C15357i iVar3, C15357i iVar4) {
        this.f44478a = iVar;
        this.f44479b = iVar2;
        this.f44476N = iVar3;
        this.f44477O = iVar4;
    }

    /* renamed from: a */
    public C15357i mo47546a(String str, Object obj) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Setting parameters in a stack is not supported.");
    }

    /* renamed from: b */
    public Object mo47549b(String str) {
        if (str != null) {
            Object obj = null;
            C15357i iVar = this.f44477O;
            if (iVar != null) {
                obj = iVar.mo47549b(str);
            }
            if (obj == null) {
                C15357i iVar2 = this.f44476N;
                if (iVar2 != null) {
                    obj = iVar2.mo47549b(str);
                }
            }
            if (obj == null) {
                C15357i iVar3 = this.f44479b;
                if (iVar3 != null) {
                    obj = iVar3.mo47549b(str);
                }
            }
            if (obj != null) {
                return obj;
            }
            C15357i iVar4 = this.f44478a;
            return iVar4 != null ? iVar4.mo47549b(str) : obj;
        }
        throw new IllegalArgumentException("Parameter name must not be null.");
    }

    /* renamed from: d */
    public C15357i mo47551d() {
        return this;
    }

    /* renamed from: d */
    public boolean mo47552d(String str) {
        throw new UnsupportedOperationException("Removing parameters in a stack is not supported.");
    }

    /* renamed from: e */
    public final C15357i mo47638e() {
        return this.f44478a;
    }

    /* renamed from: f */
    public final C15357i mo47639f() {
        return this.f44479b;
    }

    /* renamed from: g */
    public final C15357i mo47640g() {
        return this.f44477O;
    }

    /* renamed from: h */
    public final C15357i mo47641h() {
        return this.f44476N;
    }

    public C15374f(C15374f fVar) {
        this(fVar.mo47638e(), fVar.mo47639f(), fVar.mo47641h(), fVar.mo47640g());
    }

    public C15374f(C15374f fVar, C15357i iVar, C15357i iVar2, C15357i iVar3, C15357i iVar4) {
        if (iVar == null) {
            iVar = fVar.mo47638e();
        }
        if (iVar2 == null) {
            iVar2 = fVar.mo47639f();
        }
        if (iVar3 == null) {
            iVar3 = fVar.mo47641h();
        }
        if (iVar4 == null) {
            iVar4 = fVar.mo47640g();
        }
        this(iVar, iVar2, iVar3, iVar4);
    }
}
