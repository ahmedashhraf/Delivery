package org.apache.http.p547h0;

import java.util.NoSuchElementException;
import org.apache.http.C15131b;
import org.apache.http.C15133c;
import org.apache.http.C15236d;
import org.apache.http.C15237e;
import org.apache.http.C15250f;
import org.apache.http.p550k0.C15454b;

/* renamed from: org.apache.http.h0.d */
/* compiled from: BasicHeaderElementIterator */
public class C15327d implements C15237e {

    /* renamed from: N */
    private C15236d f44369N;

    /* renamed from: O */
    private C15454b f44370O;

    /* renamed from: P */
    private C15347x f44371P;

    /* renamed from: a */
    private final C15250f f44372a;

    /* renamed from: b */
    private final C15344u f44373b;

    public C15327d(C15250f fVar, C15344u uVar) {
        this.f44369N = null;
        this.f44370O = null;
        this.f44371P = null;
        if (fVar == null) {
            throw new IllegalArgumentException("Header iterator may not be null");
        } else if (uVar != null) {
            this.f44372a = fVar;
            this.f44373b = uVar;
        } else {
            throw new IllegalArgumentException("Parser may not be null");
        }
    }

    /* renamed from: a */
    private void m67839a() {
        this.f44371P = null;
        this.f44370O = null;
        while (this.f44372a.hasNext()) {
            C15133c e = this.f44372a.mo47173e();
            if (e instanceof C15131b) {
                C15131b bVar = (C15131b) e;
                this.f44370O = bVar.mo46910c();
                this.f44371P = new C15347x(0, this.f44370O.mo47772f());
                this.f44371P.mo47530a(bVar.mo46911d());
                return;
            }
            String value = e.getValue();
            if (value != null) {
                this.f44370O = new C15454b(value.length());
                this.f44370O.mo47757a(value);
                this.f44371P = new C15347x(0, this.f44370O.mo47772f());
                return;
            }
        }
    }

    /* renamed from: b */
    private void m67840b() {
        C15236d b;
        loop0:
        while (true) {
            if (this.f44372a.hasNext() || this.f44371P != null) {
                C15347x xVar = this.f44371P;
                if (xVar == null || xVar.mo47531a()) {
                    m67839a();
                }
                if (this.f44371P != null) {
                    while (!this.f44371P.mo47531a()) {
                        b = this.f44373b.mo47456b(this.f44370O, this.f44371P);
                        if (b.getName().length() == 0) {
                            if (b.getValue() != null) {
                                break loop0;
                            }
                        } else {
                            break loop0;
                        }
                    }
                    if (this.f44371P.mo47531a()) {
                        this.f44371P = null;
                        this.f44370O = null;
                    }
                }
            } else {
                return;
            }
        }
        this.f44369N = b;
    }

    public boolean hasNext() {
        if (this.f44369N == null) {
            m67840b();
        }
        return this.f44369N != null;
    }

    public final Object next() throws NoSuchElementException {
        return nextElement();
    }

    public C15236d nextElement() throws NoSuchElementException {
        if (this.f44369N == null) {
            m67840b();
        }
        C15236d dVar = this.f44369N;
        if (dVar != null) {
            this.f44369N = null;
            return dVar;
        }
        throw new NoSuchElementException("No more header elements available");
    }

    public void remove() throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Remove not supported");
    }

    public C15327d(C15250f fVar) {
        this(fVar, C15330g.f44380a);
    }
}
