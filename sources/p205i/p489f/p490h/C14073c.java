package p205i.p489f.p490h;

import java.util.HashMap;
import java.util.Map;
import p205i.p489f.C14065b;
import p205i.p489f.C14069f;

/* renamed from: i.f.h.c */
/* compiled from: BasicMarkerFactory */
public class C14073c implements C14065b {

    /* renamed from: a */
    Map f41353a = new HashMap();

    /* renamed from: a */
    public synchronized C14069f mo44420a(String str) {
        C14069f fVar;
        if (str != null) {
            fVar = (C14069f) this.f41353a.get(str);
            if (fVar == null) {
                fVar = new C14072b(str);
                this.f41353a.put(str, fVar);
            }
        } else {
            throw new IllegalArgumentException("Marker name cannot be null");
        }
        return fVar;
    }

    /* renamed from: b */
    public C14069f mo44421b(String str) {
        return new C14072b(str);
    }

    /* renamed from: c */
    public boolean mo44422c(String str) {
        boolean z = false;
        if (str == null) {
            return false;
        }
        if (this.f41353a.remove(str) != null) {
            z = true;
        }
        return z;
    }

    /* renamed from: d */
    public synchronized boolean mo44423d(String str) {
        if (str == null) {
            return false;
        }
        return this.f41353a.containsKey(str);
    }
}
