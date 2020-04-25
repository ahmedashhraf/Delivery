package p205i.p489f.p490h;

import java.io.ObjectStreamException;
import java.io.Serializable;
import p205i.p489f.C14066c;
import p205i.p489f.C14067d;

/* renamed from: i.f.h.j */
/* compiled from: NamedLoggerBase */
abstract class C14080j implements C14066c, Serializable {
    private static final long serialVersionUID = 7535258609338176893L;

    /* renamed from: a */
    protected String f41363a;

    C14080j() {
    }

    public String getName() {
        return this.f41363a;
    }

    /* access modifiers changed from: protected */
    public Object readResolve() throws ObjectStreamException {
        return C14067d.m60728a(getName());
    }
}
