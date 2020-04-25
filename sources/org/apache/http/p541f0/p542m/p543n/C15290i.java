package org.apache.http.p541f0.p542m.p543n;

import java.io.IOException;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import org.apache.commons.logging.C15089a;
import org.apache.commons.logging.C15096h;
import org.apache.http.conn.p535o.C15202b;
import org.apache.http.p224d0.C6145c;
import org.apache.http.p550k0.C15458f;

@C6145c
/* renamed from: org.apache.http.f0.m.n.i */
/* compiled from: RouteSpecificPool */
public class C15290i {

    /* renamed from: a */
    private final C15089a f44284a = C15096h.m66940c(C15290i.class);

    /* renamed from: b */
    protected final C15202b f44285b;

    /* renamed from: c */
    protected final int f44286c;

    /* renamed from: d */
    protected final LinkedList<C15282b> f44287d;

    /* renamed from: e */
    protected final Queue<C15293k> f44288e;

    /* renamed from: f */
    protected int f44289f;

    public C15290i(C15202b bVar, int i) {
        this.f44285b = bVar;
        this.f44286c = i;
        this.f44287d = new LinkedList<>();
        this.f44288e = new LinkedList();
        this.f44289f = 0;
    }

    /* renamed from: a */
    public C15282b mo47336a(Object obj) {
        if (!this.f44287d.isEmpty()) {
            LinkedList<C15282b> linkedList = this.f44287d;
            ListIterator listIterator = linkedList.listIterator(linkedList.size());
            while (listIterator.hasPrevious()) {
                C15282b bVar = (C15282b) listIterator.previous();
                if (bVar.mo47250a() != null) {
                    if (C15458f.m68507a(obj, bVar.mo47250a())) {
                    }
                }
                listIterator.remove();
                return bVar;
            }
        }
        if (mo47340b() != 0 || this.f44287d.isEmpty()) {
            return null;
        }
        C15282b bVar2 = (C15282b) this.f44287d.remove();
        bVar2.mo47256b();
        try {
            bVar2.mo47313c().close();
        } catch (IOException e) {
            this.f44284a.mo46777a("I/O error closing connection", e);
        }
        return bVar2;
    }

    /* renamed from: b */
    public int mo47340b() {
        return this.f44286c - this.f44289f;
    }

    /* renamed from: c */
    public final int mo47343c() {
        return this.f44289f;
    }

    /* renamed from: d */
    public final int mo47345d() {
        return this.f44286c;
    }

    /* renamed from: e */
    public final C15202b mo47346e() {
        return this.f44285b;
    }

    /* renamed from: f */
    public boolean mo47347f() {
        return !this.f44288e.isEmpty();
    }

    /* renamed from: g */
    public boolean mo47348g() {
        return this.f44289f < 1 && this.f44288e.isEmpty();
    }

    /* renamed from: h */
    public C15293k mo47349h() {
        return (C15293k) this.f44288e.peek();
    }

    /* renamed from: b */
    public boolean mo47342b(C15282b bVar) {
        boolean remove = this.f44287d.remove(bVar);
        if (remove) {
            this.f44289f--;
        }
        return remove;
    }

    /* renamed from: c */
    public void mo47344c(C15282b bVar) {
        int i = this.f44289f;
        if (i < 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("No entry created for this pool. ");
            sb.append(this.f44285b);
            throw new IllegalStateException(sb.toString());
        } else if (i > this.f44287d.size()) {
            this.f44287d.add(bVar);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("No entry allocated from this pool. ");
            sb2.append(this.f44285b);
            throw new IllegalStateException(sb2.toString());
        }
    }

    /* renamed from: b */
    public void mo47341b(C15293k kVar) {
        if (kVar != null) {
            this.f44288e.remove(kVar);
        }
    }

    /* renamed from: a */
    public void mo47338a(C15282b bVar) {
        if (this.f44285b.equals(bVar.mo47314d())) {
            this.f44289f++;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Entry not planned for this pool.\npool: ");
        sb.append(this.f44285b);
        sb.append("\nplan: ");
        sb.append(bVar.mo47314d());
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public void mo47337a() {
        int i = this.f44289f;
        if (i >= 1) {
            this.f44289f = i - 1;
            return;
        }
        throw new IllegalStateException("There is no entry that could be dropped.");
    }

    /* renamed from: a */
    public void mo47339a(C15293k kVar) {
        if (kVar != null) {
            this.f44288e.add(kVar);
            return;
        }
        throw new IllegalArgumentException("Waiting thread must not be null.");
    }
}
