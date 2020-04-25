package com.google.android.gms.common.data;

import com.google.android.gms.common.data.C4266d.C4267a;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: com.google.android.gms.common.data.e */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class C4268e implements C4266d, C4267a {

    /* renamed from: a */
    private HashSet<C4266d> f13262a = new HashSet<>();

    /* renamed from: a */
    public final void mo18065a(C4266d dVar) {
        this.f13262a.remove(dVar);
    }

    /* renamed from: b */
    public final void mo18067b() {
        this.f13262a.clear();
    }

    /* renamed from: c */
    public final boolean mo18068c() {
        return !this.f13262a.isEmpty();
    }

    /* renamed from: a */
    public final void mo18060a() {
        Iterator it = this.f13262a.iterator();
        while (it.hasNext()) {
            ((C4266d) it.next()).mo18060a();
        }
    }

    /* renamed from: b */
    public final void mo18066b(C4266d dVar) {
        this.f13262a.add(dVar);
    }

    /* renamed from: c */
    public final void mo18064c(int i, int i2) {
        Iterator it = this.f13262a.iterator();
        while (it.hasNext()) {
            ((C4266d) it.next()).mo18064c(i, i2);
        }
    }

    /* renamed from: b */
    public final void mo18063b(int i, int i2) {
        Iterator it = this.f13262a.iterator();
        while (it.hasNext()) {
            ((C4266d) it.next()).mo18063b(i, i2);
        }
    }

    /* renamed from: a */
    public final void mo18061a(int i, int i2) {
        Iterator it = this.f13262a.iterator();
        while (it.hasNext()) {
            ((C4266d) it.next()).mo18061a(i, i2);
        }
    }

    /* renamed from: a */
    public final void mo18062a(int i, int i2, int i3) {
        Iterator it = this.f13262a.iterator();
        while (it.hasNext()) {
            ((C4266d) it.next()).mo18062a(i, i2, i3);
        }
    }
}
