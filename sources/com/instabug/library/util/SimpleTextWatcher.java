package com.instabug.library.util;

import android.text.Editable;
import android.text.TextWatcher;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class SimpleTextWatcher implements TextWatcher {
    private static transient /* synthetic */ boolean[] $jacocoData;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(6861772355889056810L, "com/instabug/library/util/SimpleTextWatcher", 4);
        $jacocoData = a;
        return a;
    }

    public SimpleTextWatcher() {
        $jacocoInit()[0] = true;
    }

    public void afterTextChanged(Editable editable) {
        $jacocoInit()[3] = true;
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        $jacocoInit()[1] = true;
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        $jacocoInit()[2] = true;
    }
}
