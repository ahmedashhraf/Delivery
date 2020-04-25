package androidx.coordinatorlayout.widget;

import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.collection.C0649h;
import androidx.core.p033k.C0940h.C0941a;
import androidx.core.p033k.C0940h.C0942b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@C0207n0({C0208a.LIBRARY})
/* renamed from: androidx.coordinatorlayout.widget.a */
/* compiled from: DirectedAcyclicGraph */
public final class C0719a<T> {

    /* renamed from: a */
    private final C0941a<ArrayList<T>> f3366a = new C0942b(10);

    /* renamed from: b */
    private final C0649h<T, ArrayList<T>> f3367b = new C0649h<>();

    /* renamed from: c */
    private final ArrayList<T> f3368c = new ArrayList<>();

    /* renamed from: d */
    private final HashSet<T> f3369d = new HashSet<>();

    /* renamed from: a */
    public void mo4037a(@C0193h0 T t) {
        if (!this.f3367b.containsKey(t)) {
            this.f3367b.put(t, null);
        }
    }

    /* renamed from: b */
    public boolean mo4040b(@C0193h0 T t) {
        return this.f3367b.containsKey(t);
    }

    @C0195i0
    /* renamed from: c */
    public List mo4042c(@C0193h0 T t) {
        return (List) this.f3367b.get(t);
    }

    @C0195i0
    /* renamed from: d */
    public List<T> mo4043d(@C0193h0 T t) {
        int size = this.f3367b.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            ArrayList arrayList2 = (ArrayList) this.f3367b.mo3367d(i);
            if (arrayList2 != null && arrayList2.contains(t)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f3367b.mo3361b(i));
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public boolean mo4044e(@C0193h0 T t) {
        int size = this.f3367b.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList = (ArrayList) this.f3367b.mo3367d(i);
            if (arrayList != null && arrayList.contains(t)) {
                return true;
            }
        }
        return false;
    }

    @C0193h0
    /* renamed from: b */
    public ArrayList<T> mo4039b() {
        this.f3368c.clear();
        this.f3369d.clear();
        int size = this.f3367b.size();
        for (int i = 0; i < size; i++) {
            m4204a(this.f3367b.mo3361b(i), this.f3368c, this.f3369d);
        }
        return this.f3368c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo4041c() {
        return this.f3367b.size();
    }

    /* renamed from: a */
    public void mo4038a(@C0193h0 T t, @C0193h0 T t2) {
        if (!this.f3367b.containsKey(t) || !this.f3367b.containsKey(t2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList arrayList = (ArrayList) this.f3367b.get(t);
        if (arrayList == null) {
            arrayList = m4206d();
            this.f3367b.put(t, arrayList);
        }
        arrayList.add(t2);
    }

    @C0193h0
    /* renamed from: d */
    private ArrayList<T> m4206d() {
        ArrayList<T> arrayList = (ArrayList) this.f3366a.mo4743a();
        return arrayList == null ? new ArrayList<>() : arrayList;
    }

    /* renamed from: a */
    public void mo4036a() {
        int size = this.f3367b.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList = (ArrayList) this.f3367b.mo3367d(i);
            if (arrayList != null) {
                m4205a(arrayList);
            }
        }
        this.f3367b.clear();
    }

    /* renamed from: a */
    private void m4204a(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (!arrayList.contains(t)) {
            if (!hashSet.contains(t)) {
                hashSet.add(t);
                ArrayList arrayList2 = (ArrayList) this.f3367b.get(t);
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        m4204a(arrayList2.get(i), arrayList, hashSet);
                    }
                }
                hashSet.remove(t);
                arrayList.add(t);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }

    /* renamed from: a */
    private void m4205a(@C0193h0 ArrayList<T> arrayList) {
        arrayList.clear();
        this.f3366a.release(arrayList);
    }
}
