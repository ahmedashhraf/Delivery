package com.instabug.library.annotation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.annotation.f */
/* compiled from: MarkUpStack */
public class C9763f implements Serializable {

    /* renamed from: P */
    private static transient /* synthetic */ boolean[] f25906P;

    /* renamed from: N */
    private ArrayList<C9762e> f25907N;

    /* renamed from: O */
    private Stack<C9762e> f25908O;

    /* renamed from: a */
    private ArrayList<C9762e> f25909a = new ArrayList<>();

    /* renamed from: b */
    private ArrayList<C9762e> f25910b;

    public C9763f() {
        boolean[] g = m45542g();
        g[0] = true;
        g[1] = true;
        this.f25910b = new ArrayList<>();
        g[2] = true;
        this.f25907N = new ArrayList<>();
        g[3] = true;
        this.f25908O = new Stack<>();
        g[4] = true;
    }

    /* renamed from: f */
    private void m45541f() {
        boolean[] g = m45542g();
        this.f25909a.clear();
        g[11] = true;
        this.f25909a.addAll(this.f25907N);
        g[12] = true;
        this.f25909a.addAll(this.f25910b);
        g[13] = true;
    }

    /* renamed from: g */
    private static /* synthetic */ boolean[] m45542g() {
        boolean[] zArr = f25906P;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-742153373895592352L, "com/instabug/library/annotation/MarkUpStack", 33);
        f25906P = a;
        return a;
    }

    /* renamed from: a */
    public void mo34821a(C9762e eVar) {
        boolean[] g = m45542g();
        this.f25910b.add(eVar);
        g[5] = true;
        m45541f();
        g[6] = true;
        this.f25908O.add(eVar);
        g[7] = true;
    }

    /* renamed from: b */
    public void mo34822b(C9762e eVar) {
        boolean[] g = m45542g();
        this.f25907N.add(eVar);
        g[8] = true;
        m45541f();
        g[9] = true;
        this.f25908O.add(eVar);
        g[10] = true;
    }

    /* renamed from: c */
    public void mo34823c(C9762e eVar) {
        boolean[] g = m45542g();
        if (this.f25910b.remove(eVar)) {
            g[15] = true;
        } else {
            g[16] = true;
            this.f25907N.remove(eVar);
            g[17] = true;
        }
        this.f25909a.remove(eVar);
        g[18] = true;
        while (true) {
            int indexOf = this.f25908O.indexOf(eVar);
            if (indexOf != -1) {
                g[19] = true;
                this.f25908O.remove(indexOf);
                g[20] = true;
            } else {
                g[21] = true;
                return;
            }
        }
    }

    /* renamed from: d */
    public int mo34824d() {
        boolean[] g = m45542g();
        int size = this.f25909a.size();
        g[23] = true;
        return size;
    }

    /* renamed from: e */
    public C9762e mo34826e() {
        boolean[] g = m45542g();
        if (this.f25908O.size() <= 0) {
            g[25] = true;
        } else {
            g[26] = true;
            C9762e eVar = (C9762e) this.f25908O.pop();
            g[27] = true;
            if (eVar.mo34816d()) {
                g[28] = true;
            } else {
                g[29] = true;
                mo34823c(eVar);
                g[30] = true;
                return eVar;
            }
        }
        g[31] = true;
        return null;
    }

    /* renamed from: d */
    public int mo34825d(C9762e eVar) {
        boolean[] g = m45542g();
        int indexOf = this.f25909a.indexOf(eVar);
        g[24] = true;
        return indexOf;
    }

    /* renamed from: a */
    public List<C9762e> mo34820a() {
        boolean[] g = m45542g();
        ArrayList<C9762e> arrayList = this.f25909a;
        g[14] = true;
        return arrayList;
    }

    /* renamed from: a */
    public C9762e mo34819a(int i) {
        C9762e eVar = (C9762e) this.f25909a.get(i);
        m45542g()[22] = true;
        return eVar;
    }

    /* renamed from: e */
    public void mo34827e(C9762e eVar) {
        boolean[] g = m45542g();
        this.f25908O.push(eVar);
        g[32] = true;
    }
}
