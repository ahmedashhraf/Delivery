package com.instabug.library.core.p382ui;

/* renamed from: com.instabug.library.core.ui.BaseContract */
public interface BaseContract {

    /* renamed from: com.instabug.library.core.ui.BaseContract$Presenter */
    public interface Presenter {
    }

    /* renamed from: com.instabug.library.core.ui.BaseContract$View */
    public interface View<C> {
        void finishActivity();

        C getViewContext();
    }
}
