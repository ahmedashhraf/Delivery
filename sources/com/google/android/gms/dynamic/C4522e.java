package com.google.android.gms.dynamic;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.annotation.C4056a;

@C4056a
/* renamed from: com.google.android.gms.dynamic.e */
public interface C4522e {
    @C4056a
    void onCreate(Bundle bundle);

    @C4056a
    View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    @C4056a
    void onDestroy();

    @C4056a
    void onDestroyView();

    @C4056a
    void onInflate(Activity activity, Bundle bundle, Bundle bundle2);

    @C4056a
    void onLowMemory();

    @C4056a
    void onPause();

    @C4056a
    void onResume();

    @C4056a
    void onSaveInstanceState(Bundle bundle);

    @C4056a
    void onStart();

    @C4056a
    void onStop();
}
