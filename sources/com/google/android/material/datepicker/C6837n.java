package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

/* renamed from: com.google.android.material.datepicker.n */
/* compiled from: PickerFragment */
abstract class C6837n<S> extends Fragment {

    /* renamed from: a */
    protected final LinkedHashSet<C6836m<S>> f19046a = new LinkedHashSet<>();

    C6837n() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo27211a(C6836m<S> mVar) {
        return this.f19046a.add(mVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo27212b(C6836m<S> mVar) {
        return this.f19046a.remove(mVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: w */
    public void mo27213w() {
        this.f19046a.clear();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: x */
    public abstract DateSelector<S> mo27160x();
}
