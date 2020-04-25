package com.instabug.library.core.p382ui;

import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.C0183c0;
import androidx.annotation.C0194i;
import androidx.annotation.C0195i0;
import androidx.annotation.C0225w;
import com.instabug.library.core.p382ui.BaseContract.Presenter;
import com.instabug.library.core.p382ui.BaseContract.View;
import com.instabug.library.util.InstabugSDKLogger;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import p205i.p471b.p472a.p473a.p474c.C13938g;

@SuppressFBWarnings({"UUF_UNUSED_PUBLIC_OR_PROTECTED_FIELD"})
/* renamed from: com.instabug.library.core.ui.b */
/* compiled from: BaseDialogFragment */
public abstract class C9793b<P extends Presenter> extends DialogFragment implements View<DialogFragment> {

    /* renamed from: N */
    private static transient /* synthetic */ boolean[] f25976N;

    /* renamed from: a */
    protected P f25977a;

    /* renamed from: b */
    protected android.view.View f25978b;

    public C9793b() {
        mo36017b()[0] = true;
    }

    /* renamed from: b */
    private static /* synthetic */ boolean[] mo36017b() {
        boolean[] zArr = f25976N;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-8327515247368476446L, "com/instabug/library/core/ui/BaseDialogFragment", 23);
        f25976N = a;
        return a;
    }

    /* access modifiers changed from: protected */
    @C0183c0
    /* renamed from: a */
    public abstract int mo34912a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public <T extends android.view.View> T mo34913a(@C0225w int i) {
        boolean[] b = mo36017b();
        T findViewById = this.f25978b.findViewById(i);
        b[21] = true;
        return findViewById;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo34914a(android.view.View view, Bundle bundle);

    public void finishActivity() {
        boolean[] b = mo36017b();
        getActivity().finish();
        b[20] = true;
    }

    public void onCreate(Bundle bundle) {
        boolean[] b = mo36017b();
        InstabugSDKLogger.m46622d(this, "onCreate called");
        b[1] = true;
        super.onCreate(bundle);
        b[2] = true;
    }

    @C0194i
    public android.view.View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean[] b = mo36017b();
        Dialog dialog = getDialog();
        b[3] = true;
        if (dialog == null) {
            b[4] = true;
        } else if (getDialog().getWindow() == null) {
            b[5] = true;
        } else {
            b[6] = true;
            getDialog().getWindow().requestFeature(1);
            b[7] = true;
        }
        InstabugSDKLogger.m46622d(this, "onCreateView called");
        b[8] = true;
        this.f25978b = layoutInflater.inflate(mo34912a(), viewGroup, false);
        b[9] = true;
        mo34914a(this.f25978b, bundle);
        android.view.View view = this.f25978b;
        b[10] = true;
        return view;
    }

    public void onDestroyView() {
        boolean[] b = mo36017b();
        InstabugSDKLogger.m46622d(this, "onDestroyView called");
        b[17] = true;
        super.onDestroyView();
        b[18] = true;
    }

    public void onStart() {
        boolean[] b = mo36017b();
        InstabugSDKLogger.m46622d(this, "onStart called");
        b[13] = true;
        super.onStart();
        b[14] = true;
    }

    public void onStop() {
        boolean[] b = mo36017b();
        InstabugSDKLogger.m46622d(this, "onStop called");
        b[15] = true;
        super.onStop();
        b[16] = true;
    }

    public void onViewCreated(android.view.View view, @C0195i0 Bundle bundle) {
        boolean[] b = mo36017b();
        InstabugSDKLogger.m46622d(this, "onViewCreated called");
        b[11] = true;
        super.onViewCreated(view, bundle);
        b[12] = true;
    }

    public DialogFragment getViewContext() {
        mo36017b()[19] = true;
        return this;
    }
}
