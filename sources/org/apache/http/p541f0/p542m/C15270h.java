package org.apache.http.p541f0.p542m;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.apache.commons.logging.C15089a;
import org.apache.commons.logging.C15096h;
import org.apache.http.C15323h;
import org.apache.http.p224d0.C6145c;

@C6145c
/* renamed from: org.apache.http.f0.m.h */
/* compiled from: IdleConnectionHandler */
public class C15270h {

    /* renamed from: a */
    private final C15089a f44235a = C15096h.m66940c(C15270h.class);

    /* renamed from: b */
    private final Map<C15323h, C15271a> f44236b = new HashMap();

    /* renamed from: org.apache.http.f0.m.h$a */
    /* compiled from: IdleConnectionHandler */
    private static class C15271a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final long f44237a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final long f44238b;

        C15271a(long j, long j2, TimeUnit timeUnit) {
            this.f44237a = j;
            if (j2 > 0) {
                this.f44238b = j + timeUnit.toMillis(j2);
            } else {
                this.f44238b = Long.MAX_VALUE;
            }
        }
    }

    /* renamed from: a */
    public void mo47262a(C15323h hVar, long j, TimeUnit timeUnit) {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f44235a.mo46785d()) {
            C15089a aVar = this.f44235a;
            StringBuilder sb = new StringBuilder();
            sb.append("Adding connection at: ");
            sb.append(currentTimeMillis);
            aVar.mo46776a(sb.toString());
        }
        Map<C15323h, C15271a> map = this.f44236b;
        C15271a aVar2 = new C15271a(currentTimeMillis, j, timeUnit);
        map.put(hVar, aVar2);
    }

    /* renamed from: b */
    public void mo47264b() {
        this.f44236b.clear();
    }

    /* renamed from: a */
    public boolean mo47263a(C15323h hVar) {
        C15271a aVar = (C15271a) this.f44236b.remove(hVar);
        boolean z = true;
        if (aVar == null) {
            this.f44235a.mo46783d("Removing a connection that never existed!");
            return true;
        }
        if (System.currentTimeMillis() > aVar.f44238b) {
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    public void mo47261a(long j) {
        long currentTimeMillis = System.currentTimeMillis() - j;
        if (this.f44235a.mo46785d()) {
            C15089a aVar = this.f44235a;
            StringBuilder sb = new StringBuilder();
            sb.append("Checking for connections, idle timeout: ");
            sb.append(currentTimeMillis);
            aVar.mo46776a(sb.toString());
        }
        for (C15323h hVar : this.f44236b.keySet()) {
            long b = ((C15271a) this.f44236b.get(hVar)).f44237a;
            if (b <= currentTimeMillis) {
                if (this.f44235a.mo46785d()) {
                    C15089a aVar2 = this.f44235a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Closing idle connection, connection time: ");
                    sb2.append(b);
                    aVar2.mo46776a(sb2.toString());
                }
                try {
                    hVar.close();
                } catch (IOException e) {
                    this.f44235a.mo46777a("I/O error closing connection", e);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo47260a() {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f44235a.mo46785d()) {
            C15089a aVar = this.f44235a;
            StringBuilder sb = new StringBuilder();
            sb.append("Checking for expired connections, now: ");
            sb.append(currentTimeMillis);
            aVar.mo46776a(sb.toString());
        }
        for (C15323h hVar : this.f44236b.keySet()) {
            C15271a aVar2 = (C15271a) this.f44236b.get(hVar);
            if (aVar2.f44238b <= currentTimeMillis) {
                if (this.f44235a.mo46785d()) {
                    C15089a aVar3 = this.f44235a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Closing connection, expired @: ");
                    sb2.append(aVar2.f44238b);
                    aVar3.mo46776a(sb2.toString());
                }
                try {
                    hVar.close();
                } catch (IOException e) {
                    this.f44235a.mo46777a("I/O error closing connection", e);
                }
            }
        }
    }
}
