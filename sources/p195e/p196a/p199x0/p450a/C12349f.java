package p195e.p196a.p199x0.p450a;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import p195e.p196a.p199x0.p200j.C13754k;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p447u0.C12314c;
import p212io.reactivex.exceptions.C14398a;
import p212io.reactivex.exceptions.CompositeException;

/* renamed from: e.a.x0.a.f */
/* compiled from: ListCompositeDisposable */
public final class C12349f implements C12314c, C12346c {

    /* renamed from: a */
    List<C12314c> f35499a;

    /* renamed from: b */
    volatile boolean f35500b;

    public C12349f() {
    }

    /* renamed from: a */
    public boolean mo42108a(C12314c... cVarArr) {
        C12390b.m55563a(cVarArr, "ds is null");
        if (!this.f35500b) {
            synchronized (this) {
                if (!this.f35500b) {
                    List list = this.f35499a;
                    if (list == null) {
                        list = new LinkedList();
                        this.f35499a = list;
                    }
                    for (C12314c cVar : cVarArr) {
                        C12390b.m55563a(cVar, "d is null");
                        list.add(cVar);
                    }
                    return true;
                }
            }
        }
        for (C12314c dispose : cVarArr) {
            dispose.dispose();
        }
        return false;
    }

    /* renamed from: b */
    public boolean mo42072b(C12314c cVar) {
        C12390b.m55563a(cVar, "d is null");
        if (!this.f35500b) {
            synchronized (this) {
                if (!this.f35500b) {
                    List list = this.f35499a;
                    if (list == null) {
                        list = new LinkedList();
                        this.f35499a = list;
                    }
                    list.add(cVar);
                    return true;
                }
            }
        }
        cVar.dispose();
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0021, code lost:
        return false;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo42073c(p195e.p196a.p447u0.C12314c r3) {
        /*
            r2 = this;
            java.lang.String r0 = "Disposable item is null"
            p195e.p196a.p199x0.p451b.C12390b.m55563a(r3, r0)
            boolean r0 = r2.f35500b
            r1 = 0
            if (r0 == 0) goto L_0x000b
            return r1
        L_0x000b:
            monitor-enter(r2)
            boolean r0 = r2.f35500b     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0012
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            return r1
        L_0x0012:
            java.util.List<e.a.u0.c> r0 = r2.f35499a     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0020
            boolean r3 = r0.remove(r3)     // Catch:{ all -> 0x0022 }
            if (r3 != 0) goto L_0x001d
            goto L_0x0020
        L_0x001d:
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            r3 = 1
            return r3
        L_0x0020:
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            return r1
        L_0x0022:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p195e.p196a.p199x0.p450a.C12349f.mo42073c(e.a.u0.c):boolean");
    }

    /* renamed from: d */
    public boolean mo41878d() {
        return this.f35500b;
    }

    public void dispose() {
        if (!this.f35500b) {
            synchronized (this) {
                if (!this.f35500b) {
                    this.f35500b = true;
                    List<C12314c> list = this.f35499a;
                    this.f35499a = null;
                    mo42107a(list);
                }
            }
        }
    }

    public C12349f(C12314c... cVarArr) {
        C12390b.m55563a(cVarArr, "resources is null");
        this.f35499a = new LinkedList();
        for (C12314c cVar : cVarArr) {
            C12390b.m55563a(cVar, "Disposable item is null");
            this.f35499a.add(cVar);
        }
    }

    public C12349f(Iterable<? extends C12314c> iterable) {
        C12390b.m55563a(iterable, "resources is null");
        this.f35499a = new LinkedList();
        for (C12314c cVar : iterable) {
            C12390b.m55563a(cVar, "Disposable item is null");
            this.f35499a.add(cVar);
        }
    }

    /* renamed from: a */
    public boolean mo42069a(C12314c cVar) {
        if (!mo42073c(cVar)) {
            return false;
        }
        cVar.dispose();
        return true;
    }

    /* renamed from: a */
    public void mo42106a() {
        if (!this.f35500b) {
            synchronized (this) {
                if (!this.f35500b) {
                    List<C12314c> list = this.f35499a;
                    this.f35499a = null;
                    mo42107a(list);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo42107a(List<C12314c> list) {
        if (list != null) {
            ArrayList arrayList = null;
            for (C12314c dispose : list) {
                try {
                    dispose.dispose();
                } catch (Throwable th) {
                    C14398a.m62357b(th);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th);
                }
            }
            if (arrayList == null) {
                return;
            }
            if (arrayList.size() == 1) {
                throw C13754k.m58724c((Throwable) arrayList.get(0));
            }
            throw new CompositeException((Iterable<? extends Throwable>) arrayList);
        }
    }
}
