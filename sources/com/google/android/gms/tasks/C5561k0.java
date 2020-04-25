package com.google.android.gms.tasks;

import androidx.annotation.C0193h0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.tasks.k0 */
final class C5561k0 implements C5543c<Void, List<TResult>> {

    /* renamed from: a */
    private final /* synthetic */ Collection f15869a;

    C5561k0(Collection collection) {
        this.f15869a = collection;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo17952a(@C0193h0 C5560k kVar) throws Exception {
        if (this.f15869a.size() == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (C5560k b : this.f15869a) {
            arrayList.add(b.mo22008b());
        }
        return arrayList;
    }
}
