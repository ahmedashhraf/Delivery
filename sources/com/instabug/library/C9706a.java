package com.instabug.library;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.C0183c0;
import androidx.fragment.app.Fragment;
import com.instabug.library.util.InstabugSDKLogger;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.a */
/* compiled from: InstabugBaseFragment */
public abstract class C9706a extends Fragment {
    private static transient /* synthetic */ boolean[] $jacocoData;
    private Activity activity;
    private boolean isStateRestored;
    private View view;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(1335773065140107508L, "com/instabug/library/InstabugBaseFragment", 34);
        $jacocoData = a;
        return a;
    }

    public C9706a() {
        $jacocoInit()[0] = true;
    }

    /* access modifiers changed from: protected */
    public abstract void consumeNewInstanceSavedArguments();

    /* access modifiers changed from: protected */
    @C0183c0
    public abstract int getLayout();

    public Activity getPreservedActivity() {
        boolean[] $jacocoInit = $jacocoInit();
        StringBuilder sb = new StringBuilder();
        sb.append("Returning preserved activity ");
        sb.append(this.activity);
        InstabugSDKLogger.m46626v(this, sb.toString());
        Activity activity2 = this.activity;
        $jacocoInit[26] = true;
        return activity2;
    }

    /* access modifiers changed from: protected */
    public abstract String getTitle();

    public boolean isStateRestored() {
        boolean[] $jacocoInit = $jacocoInit();
        boolean z = this.isStateRestored;
        $jacocoInit[25] = true;
        return z;
    }

    public void onAttach(Activity activity2) {
        boolean[] $jacocoInit = $jacocoInit();
        super.onAttach(activity2);
        this.activity = activity2;
        $jacocoInit[1] = true;
    }

    public void onCreate(Bundle bundle) {
        boolean[] $jacocoInit = $jacocoInit();
        super.onCreate(bundle);
        $jacocoInit[2] = true;
        InstabugSDKLogger.m46626v(this, "onCreateView called");
        $jacocoInit[3] = true;
        if (getArguments() == null) {
            $jacocoInit[4] = true;
        } else {
            $jacocoInit[5] = true;
            StringBuilder sb = new StringBuilder();
            sb.append("Arguments found, calling consumeNewInstanceSavedArguments with ");
            sb.append(getArguments());
            InstabugSDKLogger.m46626v(this, sb.toString());
            $jacocoInit[6] = true;
            consumeNewInstanceSavedArguments();
            $jacocoInit[7] = true;
        }
        this.isStateRestored = false;
        $jacocoInit[8] = true;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean[] $jacocoInit = $jacocoInit();
        InstabugSDKLogger.m46626v(this, "onCreateView called");
        $jacocoInit[9] = true;
        this.view = layoutInflater.inflate(getLayout(), viewGroup, false);
        $jacocoInit[10] = true;
        setTitle(getTitle());
        View view2 = this.view;
        $jacocoInit[11] = true;
        return view2;
    }

    public void onPause() {
        boolean[] $jacocoInit = $jacocoInit();
        super.onPause();
        $jacocoInit[21] = true;
        InstabugSDKLogger.m46626v(this, "onPause called, calling saveState");
        $jacocoInit[22] = true;
    }

    public void onResume() {
        boolean[] $jacocoInit = $jacocoInit();
        super.onResume();
        $jacocoInit[23] = true;
        InstabugSDKLogger.m46626v(this, "onResume called, calling saveState");
        $jacocoInit[24] = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
        boolean[] $jacocoInit = $jacocoInit();
        super.onSaveInstanceState(bundle);
        $jacocoInit[18] = true;
        InstabugSDKLogger.m46626v(this, "onSaveInstanceState called, calling saveState");
        $jacocoInit[19] = true;
        saveState(bundle);
        $jacocoInit[20] = true;
    }

    public void onViewCreated(View view2, Bundle bundle) {
        boolean[] $jacocoInit = $jacocoInit();
        InstabugSDKLogger.m46626v(this, "onViewCreated called");
        $jacocoInit[12] = true;
        super.onViewCreated(view2, bundle);
        if (bundle == null) {
            $jacocoInit[13] = true;
        } else {
            $jacocoInit[14] = true;
            InstabugSDKLogger.m46626v(this, "savedInstanceState found, calling restoreState");
            $jacocoInit[15] = true;
            restoreState(bundle);
            this.isStateRestored = true;
            $jacocoInit[16] = true;
        }
        $jacocoInit[17] = true;
    }

    /* access modifiers changed from: protected */
    public abstract void restoreState(Bundle bundle);

    /* access modifiers changed from: protected */
    public abstract void saveState(Bundle bundle);

    public void setTitle(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        View view2 = this.view;
        if (view2 == null) {
            $jacocoInit[27] = true;
            InstabugSDKLogger.m46626v(this, "Calling setTitle before inflating the view! Ignoring call");
            $jacocoInit[28] = true;
            return;
        }
        TextView textView = (TextView) view2.findViewById(C9700R.C9704id.instabug_fragment_title);
        if (textView != null) {
            $jacocoInit[29] = true;
            StringBuilder sb = new StringBuilder();
            sb.append("Setting fragment title to \"");
            sb.append(str);
            sb.append("\"");
            InstabugSDKLogger.m46626v(this, sb.toString());
            $jacocoInit[30] = true;
            textView.setText(str);
            $jacocoInit[31] = true;
        } else {
            InstabugSDKLogger.m46626v(this, "instabug_fragment_title wasn't found, make sure your layout.xml contains it");
            $jacocoInit[32] = true;
        }
        $jacocoInit[33] = true;
    }
}
