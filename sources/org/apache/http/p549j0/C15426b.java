package org.apache.http.p549j0;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.http.C15463o;
import org.apache.http.C15465q;
import org.apache.http.C15466r;
import org.apache.http.C15468t;
import org.apache.http.HttpException;

/* renamed from: org.apache.http.j0.b */
/* compiled from: BasicHttpProcessor */
public final class C15426b implements C15434i, C15439n, C15440o, Cloneable {

    /* renamed from: a */
    protected final List f44559a = new ArrayList();

    /* renamed from: b */
    protected final List f44560b = new ArrayList();

    /* renamed from: a */
    public void mo47692a(C15465q qVar) {
        if (qVar != null) {
            this.f44559a.add(qVar);
        }
    }

    /* renamed from: b */
    public void mo47698b(Class cls) {
        Iterator it = this.f44559a.iterator();
        while (it.hasNext()) {
            if (it.next().getClass().equals(cls)) {
                it.remove();
            }
        }
    }

    /* renamed from: c */
    public void mo47703c() {
        this.f44559a.clear();
    }

    public Object clone() throws CloneNotSupportedException {
        C15426b bVar = (C15426b) super.clone();
        mo47691a(bVar);
        return bVar;
    }

    /* renamed from: d */
    public void mo47705d() {
        this.f44560b.clear();
    }

    /* renamed from: e */
    public int mo47706e() {
        return this.f44559a.size();
    }

    /* renamed from: f */
    public void mo47707f() {
        mo47703c();
        mo47705d();
    }

    /* renamed from: g */
    public C15426b mo47708g() {
        C15426b bVar = new C15426b();
        mo47691a(bVar);
        return bVar;
    }

    /* renamed from: a */
    public void mo47693a(C15465q qVar, int i) {
        if (qVar != null) {
            this.f44559a.add(i, qVar);
        }
    }

    /* renamed from: a */
    public void mo47695a(C15468t tVar, int i) {
        if (tVar != null) {
            this.f44560b.add(i, tVar);
        }
    }

    /* renamed from: a */
    public void mo47689a(Class cls) {
        Iterator it = this.f44560b.iterator();
        while (it.hasNext()) {
            if (it.next().getClass().equals(cls)) {
                it.remove();
            }
        }
    }

    /* renamed from: b */
    public final void mo47699b(C15465q qVar) {
        mo47692a(qVar);
    }

    /* renamed from: b */
    public final void mo47700b(C15465q qVar, int i) {
        mo47693a(qVar, i);
    }

    /* renamed from: b */
    public C15465q mo47697b(int i) {
        if (i < 0 || i >= this.f44559a.size()) {
            return null;
        }
        return (C15465q) this.f44559a.get(i);
    }

    /* renamed from: a */
    public void mo47694a(C15468t tVar) {
        if (tVar != null) {
            this.f44560b.add(tVar);
        }
    }

    /* renamed from: a */
    public C15468t mo47688a(int i) {
        if (i < 0 || i >= this.f44560b.size()) {
            return null;
        }
        return (C15468t) this.f44560b.get(i);
    }

    /* renamed from: b */
    public final void mo47701b(C15468t tVar) {
        mo47694a(tVar);
    }

    /* renamed from: b */
    public final void mo47702b(C15468t tVar, int i) {
        mo47695a(tVar, i);
    }

    /* renamed from: a */
    public void mo47690a(List list) {
        if (list != null) {
            this.f44559a.clear();
            this.f44560b.clear();
            for (int i = 0; i < list.size(); i++) {
                Object obj = list.get(i);
                if (obj instanceof C15465q) {
                    mo47699b((C15465q) obj);
                }
                if (obj instanceof C15468t) {
                    mo47701b((C15468t) obj);
                }
            }
            return;
        }
        throw new IllegalArgumentException("List must not be null.");
    }

    /* renamed from: b */
    public int mo47696b() {
        return this.f44560b.size();
    }

    /* renamed from: a */
    public void mo46975a(C15463o oVar, C15431f fVar) throws IOException, HttpException {
        for (int i = 0; i < this.f44559a.size(); i++) {
            ((C15465q) this.f44559a.get(i)).mo46975a(oVar, fVar);
        }
    }

    /* renamed from: a */
    public void mo46976a(C15466r rVar, C15431f fVar) throws IOException, HttpException {
        for (int i = 0; i < this.f44560b.size(); i++) {
            ((C15468t) this.f44560b.get(i)).mo46976a(rVar, fVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo47691a(C15426b bVar) {
        bVar.f44559a.clear();
        bVar.f44559a.addAll(this.f44559a);
        bVar.f44560b.clear();
        bVar.f44560b.addAll(this.f44560b);
    }
}
