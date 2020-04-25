package com.instabug.library.core.p382ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.C0183c0;
import androidx.annotation.C0194i;
import androidx.annotation.C0195i0;
import androidx.annotation.C0225w;
import androidx.fragment.app.Fragment;
import com.instabug.library.core.p382ui.BaseContract.Presenter;
import com.instabug.library.core.p382ui.BaseContract.View;
import com.instabug.library.util.InstabugSDKLogger;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.core.ui.a */
/* compiled from: BaseFragment */
public abstract class C9792a<P extends Presenter> extends Fragment implements View<Fragment> {
    private static transient /* synthetic */ boolean[] $jacocoData;
    protected P presenter;
    protected android.view.View rootView;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-5134094777038252074L, "com/instabug/library/core/ui/BaseFragment", 21);
        $jacocoData = a;
        return a;
    }

    public C9792a() {
        $jacocoInit()[0] = true;
    }

    /* access modifiers changed from: protected */
    public <T extends android.view.View> T findViewById(@C0225w int i) {
        boolean[] $jacocoInit = $jacocoInit();
        T findViewById = this.rootView.findViewById(i);
        $jacocoInit[19] = true;
        return findViewById;
    }

    public void finishActivity() {
        boolean[] $jacocoInit = $jacocoInit();
        if (getActivity() == null) {
            $jacocoInit[15] = true;
        } else {
            $jacocoInit[16] = true;
            getActivity().finish();
            $jacocoInit[17] = true;
        }
        $jacocoInit[18] = true;
    }

    /* access modifiers changed from: protected */
    @C0183c0
    public abstract int getLayout();

    /* access modifiers changed from: protected */
    public abstract void initViews(android.view.View view, Bundle bundle);

    public void onCreate(Bundle bundle) {
        boolean[] $jacocoInit = $jacocoInit();
        InstabugSDKLogger.m46622d(this, "onCreate called");
        $jacocoInit[1] = true;
        super.onCreate(bundle);
        $jacocoInit[2] = true;
    }

    @C0194i
    public android.view.View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean[] $jacocoInit = $jacocoInit();
        InstabugSDKLogger.m46622d(this, "onCreateView called");
        $jacocoInit[3] = true;
        this.rootView = layoutInflater.inflate(getLayout(), viewGroup, false);
        $jacocoInit[4] = true;
        initViews(this.rootView, bundle);
        android.view.View view = this.rootView;
        $jacocoInit[5] = true;
        return view;
    }

    public void onDestroyView() {
        boolean[] $jacocoInit = $jacocoInit();
        InstabugSDKLogger.m46622d(this, "onDestroyView called");
        $jacocoInit[12] = true;
        super.onDestroyView();
        $jacocoInit[13] = true;
    }

    public void onStart() {
        boolean[] $jacocoInit = $jacocoInit();
        InstabugSDKLogger.m46622d(this, "onStart called");
        $jacocoInit[8] = true;
        super.onStart();
        $jacocoInit[9] = true;
    }

    public void onStop() {
        boolean[] $jacocoInit = $jacocoInit();
        InstabugSDKLogger.m46622d(this, "onStop called");
        $jacocoInit[10] = true;
        super.onStop();
        $jacocoInit[11] = true;
    }

    public void onViewCreated(android.view.View view, @C0195i0 Bundle bundle) {
        boolean[] $jacocoInit = $jacocoInit();
        InstabugSDKLogger.m46622d(this, "onViewCreated called");
        $jacocoInit[6] = true;
        super.onViewCreated(view, bundle);
        $jacocoInit[7] = true;
    }

    public Fragment getViewContext() {
        $jacocoInit()[14] = true;
        return this;
    }
}
