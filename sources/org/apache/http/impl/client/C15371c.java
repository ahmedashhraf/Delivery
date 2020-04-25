package org.apache.http.impl.client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.apache.http.client.C15136b;
import org.apache.http.cookie.C15223b;
import org.apache.http.cookie.C15225d;
import org.apache.http.p224d0.C6143a;
import org.apache.http.p224d0.C6146d;

@C6146d
/* renamed from: org.apache.http.impl.client.c */
/* compiled from: BasicCookieStore */
public class C15371c implements C15136b {
    @C6143a("this")

    /* renamed from: a */
    private final ArrayList<C15223b> f44473a = new ArrayList<>();
    @C6143a("this")

    /* renamed from: b */
    private final Comparator<C15223b> f44474b = new C15225d();

    /* renamed from: a */
    public synchronized void mo46925a(C15223b bVar) {
        if (bVar != null) {
            Iterator it = this.f44473a.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (this.f44474b.compare(bVar, it.next()) == 0) {
                        it.remove();
                        break;
                    }
                } else {
                    break;
                }
            }
            if (!bVar.mo47101a(new Date())) {
                this.f44473a.add(bVar);
            }
        }
    }

    public synchronized void clear() {
        this.f44473a.clear();
    }

    public String toString() {
        return this.f44473a.toString();
    }

    /* renamed from: a */
    public synchronized void mo47635a(C15223b[] bVarArr) {
        if (bVarArr != null) {
            for (C15223b a : bVarArr) {
                mo46925a(a);
            }
        }
    }

    /* renamed from: a */
    public synchronized List<C15223b> mo46924a() {
        return Collections.unmodifiableList(this.f44473a);
    }

    /* renamed from: a */
    public synchronized boolean mo46926a(Date date) {
        boolean z = false;
        if (date == null) {
            return false;
        }
        Iterator it = this.f44473a.iterator();
        while (it.hasNext()) {
            if (((C15223b) it.next()).mo47101a(date)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }
}
