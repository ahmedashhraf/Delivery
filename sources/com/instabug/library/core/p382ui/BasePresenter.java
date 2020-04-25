package com.instabug.library.core.p382ui;

import com.instabug.library.core.p382ui.BaseContract.Presenter;
import com.instabug.library.core.p382ui.BaseContract.View;
import java.lang.ref.WeakReference;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.core.ui.BasePresenter */
public abstract class BasePresenter<V extends View> implements Presenter {
    private static transient /* synthetic */ boolean[] $jacocoData;
    protected WeakReference<V> view;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-4415910680735581217L, "com/instabug/library/core/ui/BasePresenter", 2);
        $jacocoData = a;
        return a;
    }

    public BasePresenter(V v) {
        boolean[] $jacocoInit = $jacocoInit();
        $jacocoInit[0] = true;
        this.view = new WeakReference<>(v);
        $jacocoInit[1] = true;
    }
}
