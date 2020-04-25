package com.mrsool.utils;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView.C1664w;
import androidx.recyclerview.widget.RecyclerView.State;

public class WrapContentLinearLayoutManager extends LinearLayoutManager {
    public WrapContentLinearLayoutManager(Context context) {
        super(context);
    }

    /* renamed from: J */
    public boolean mo6906J() {
        return false;
    }

    /* renamed from: e */
    public void mo6934e(C1664w wVar, State state) {
        try {
            super.mo6934e(wVar, state);
        } catch (IndexOutOfBoundsException unused) {
            C5880q.m25751b("IndexOutOfBoundsException in RecyclerView happens");
        }
    }
}
