package p205i.p489f.p490h;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import p205i.p489f.C14069f;

/* renamed from: i.f.h.b */
/* compiled from: BasicMarker */
public class C14072b implements C14069f {

    /* renamed from: N */
    private static String f41348N = "[ ";

    /* renamed from: O */
    private static String f41349O = " ]";

    /* renamed from: P */
    private static String f41350P = ", ";
    private static final long serialVersionUID = 1803952589649545191L;

    /* renamed from: a */
    private final String f41351a;

    /* renamed from: b */
    private List f41352b;

    C14072b(String str) {
        if (str != null) {
            this.f41351a = str;
            return;
        }
        throw new IllegalArgumentException("A marker name cannot be null");
    }

    /* renamed from: a */
    public synchronized boolean mo44485a(C14069f fVar) {
        if (this.f41352b == null) {
            return false;
        }
        int size = this.f41352b.size();
        for (int i = 0; i < size; i++) {
            if (fVar.equals((C14069f) this.f41352b.get(i))) {
                this.f41352b.remove(i);
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public synchronized boolean mo44487b() {
        return this.f41352b != null && this.f41352b.size() > 0;
    }

    /* renamed from: c */
    public synchronized void mo44489c(C14069f fVar) {
        if (fVar == null) {
            throw new IllegalArgumentException("A null value cannot be added to a Marker as reference.");
        } else if (!mo44488b(fVar)) {
            if (!fVar.mo44488b(this)) {
                if (this.f41352b == null) {
                    this.f41352b = new Vector();
                }
                this.f41352b.add(fVar);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C14069f)) {
            return false;
        }
        return this.f41351a.equals(((C14069f) obj).getName());
    }

    public String getName() {
        return this.f41351a;
    }

    public int hashCode() {
        return this.f41351a.hashCode();
    }

    public synchronized Iterator iterator() {
        if (this.f41352b != null) {
            return this.f41352b.iterator();
        }
        return Collections.EMPTY_LIST.iterator();
    }

    public String toString() {
        if (!mo44487b()) {
            return getName();
        }
        Iterator it = iterator();
        StringBuffer stringBuffer = new StringBuffer(getName());
        stringBuffer.append(' ');
        stringBuffer.append(f41348N);
        while (it.hasNext()) {
            stringBuffer.append(((C14069f) it.next()).getName());
            if (it.hasNext()) {
                stringBuffer.append(f41350P);
            }
        }
        stringBuffer.append(f41349O);
        return stringBuffer.toString();
    }

    /* renamed from: b */
    public boolean mo44488b(C14069f fVar) {
        if (fVar == null) {
            throw new IllegalArgumentException("Other cannot be null");
        } else if (equals(fVar)) {
            return true;
        } else {
            if (mo44487b()) {
                for (int i = 0; i < this.f41352b.size(); i++) {
                    if (((C14069f) this.f41352b.get(i)).mo44488b(fVar)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* renamed from: a */
    public boolean mo44486a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Other cannot be null");
        } else if (this.f41351a.equals(str)) {
            return true;
        } else {
            if (mo44487b()) {
                for (int i = 0; i < this.f41352b.size(); i++) {
                    if (((C14069f) this.f41352b.get(i)).mo44486a(str)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* renamed from: c */
    public boolean mo44490c() {
        return mo44487b();
    }
}
