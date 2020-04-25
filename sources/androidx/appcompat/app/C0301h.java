package androidx.appcompat.app;

import android.app.Dialog;
import android.os.Bundle;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.fragment.app.C1374b;

/* renamed from: androidx.appcompat.app.h */
/* compiled from: AppCompatDialogFragment */
public class C0301h extends C1374b {
    @C0193h0
    public Dialog onCreateDialog(@C0195i0 Bundle bundle) {
        return new C0299g(getContext(), getTheme());
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    public void setupDialog(@C0193h0 Dialog dialog, int i) {
        if (dialog instanceof C0299g) {
            C0299g gVar = (C0299g) dialog;
            if (!(i == 1 || i == 2)) {
                if (i == 3) {
                    dialog.getWindow().addFlags(24);
                } else {
                    return;
                }
            }
            gVar.supportRequestWindowFeature(1);
            return;
        }
        super.setupDialog(dialog, i);
    }
}
