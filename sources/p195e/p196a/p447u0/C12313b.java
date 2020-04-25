package p195e.p196a.p447u0;

import java.util.ArrayList;
import java.util.List;
import p195e.p196a.p198t0.C5937f;
import p195e.p196a.p199x0.p200j.C13754k;
import p195e.p196a.p199x0.p200j.C13766s;
import p195e.p196a.p199x0.p450a.C12346c;
import p195e.p196a.p199x0.p451b.C12390b;
import p212io.reactivex.exceptions.C14398a;
import p212io.reactivex.exceptions.CompositeException;

/* renamed from: e.a.u0.b */
/* compiled from: CompositeDisposable */
public final class C12313b implements C12314c, C12346c {

    /* renamed from: a */
    C13766s<C12314c> f35494a;

    /* renamed from: b */
    volatile boolean f35495b;

    public C12313b() {
    }

    /* renamed from: a */
    public boolean mo42070a(@C5937f C12314c... cVarArr) {
        C12390b.m55563a(cVarArr, "ds is null");
        if (!this.f35495b) {
            synchronized (this) {
                if (!this.f35495b) {
                    C13766s<C12314c> sVar = this.f35494a;
                    if (sVar == null) {
                        sVar = new C13766s<>(cVarArr.length + 1);
                        this.f35494a = sVar;
                    }
                    for (C12314c cVar : cVarArr) {
                        C12390b.m55563a(cVar, "d is null");
                        sVar.mo43161a(cVar);
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
    public boolean mo42072b(@C5937f C12314c cVar) {
        C12390b.m55563a(cVar, "d is null");
        if (!this.f35495b) {
            synchronized (this) {
                if (!this.f35495b) {
                    C13766s<C12314c> sVar = this.f35494a;
                    if (sVar == null) {
                        sVar = new C13766s<>();
                        this.f35494a = sVar;
                    }
                    sVar.mo43161a(cVar);
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
    public boolean mo42073c(@p195e.p196a.p198t0.C5937f p195e.p196a.p447u0.C12314c r3) {
        /*
            r2 = this;
            java.lang.String r0 = "Disposable item is null"
            p195e.p196a.p199x0.p451b.C12390b.m55563a(r3, r0)
            boolean r0 = r2.f35495b
            r1 = 0
            if (r0 == 0) goto L_0x000b
            return r1
        L_0x000b:
            monitor-enter(r2)
            boolean r0 = r2.f35495b     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0012
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            return r1
        L_0x0012:
            e.a.x0.j.s<e.a.u0.c> r0 = r2.f35494a     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0020
            boolean r3 = r0.mo43164b(r3)     // Catch:{ all -> 0x0022 }
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
        throw new UnsupportedOperationException("Method not decompiled: p195e.p196a.p447u0.C12313b.mo42073c(e.a.u0.c):boolean");
    }

    /* renamed from: d */
    public boolean mo41878d() {
        return this.f35495b;
    }

    public void dispose() {
        if (!this.f35495b) {
            synchronized (this) {
                if (!this.f35495b) {
                    this.f35495b = true;
                    C13766s<C12314c> sVar = this.f35494a;
                    this.f35494a = null;
                    mo42068a(sVar);
                }
            }
        }
    }

    public C12313b(@C5937f C12314c... cVarArr) {
        C12390b.m55563a(cVarArr, "resources is null");
        this.f35494a = new C13766s<>(cVarArr.length + 1);
        for (C12314c cVar : cVarArr) {
            C12390b.m55563a(cVar, "Disposable item is null");
            this.f35494a.mo43161a(cVar);
        }
    }

    public C12313b(@C5937f Iterable<? extends C12314c> iterable) {
        C12390b.m55563a(iterable, "resources is null");
        this.f35494a = new C13766s<>();
        for (C12314c cVar : iterable) {
            C12390b.m55563a(cVar, "Disposable item is null");
            this.f35494a.mo43161a(cVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0016, code lost:
        return r1;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo42071b() {
        /*
            r2 = this;
            boolean r0 = r2.f35495b
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            monitor-enter(r2)
            boolean r0 = r2.f35495b     // Catch:{ all -> 0x0017 }
            if (r0 == 0) goto L_0x000d
            monitor-exit(r2)     // Catch:{ all -> 0x0017 }
            return r1
        L_0x000d:
            e.a.x0.j.s<e.a.u0.c> r0 = r2.f35494a     // Catch:{ all -> 0x0017 }
            if (r0 == 0) goto L_0x0015
            int r1 = r0.mo43165c()     // Catch:{ all -> 0x0017 }
        L_0x0015:
            monitor-exit(r2)     // Catch:{ all -> 0x0017 }
            return r1
        L_0x0017:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0017 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p195e.p196a.p447u0.C12313b.mo42071b():int");
    }

    /* renamed from: a */
    public boolean mo42069a(@C5937f C12314c cVar) {
        if (!mo42073c(cVar)) {
            return false;
        }
        cVar.dispose();
        return true;
    }

    /* renamed from: a */
    public void mo42067a() {
        if (!this.f35495b) {
            synchronized (this) {
                if (!this.f35495b) {
                    C13766s<C12314c> sVar = this.f35494a;
                    this.f35494a = null;
                    mo42068a(sVar);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo42068a(C13766s<C12314c> sVar) {
        Object[] a;
        if (sVar != null) {
            List list = null;
            for (Object obj : sVar.mo43162a()) {
                if (obj instanceof C12314c) {
                    try {
                        ((C12314c) obj).dispose();
                    } catch (Throwable th) {
                        C14398a.m62357b(th);
                        if (list == null) {
                            list = new ArrayList();
                        }
                        list.add(th);
                    }
                }
            }
            if (list == null) {
                return;
            }
            if (list.size() == 1) {
                throw C13754k.m58724c((Throwable) list.get(0));
            }
            throw new CompositeException((Iterable<? extends Throwable>) list);
        }
    }
}
