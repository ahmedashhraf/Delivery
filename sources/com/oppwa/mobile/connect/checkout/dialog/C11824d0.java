package com.oppwa.mobile.connect.checkout.dialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0195i0;
import com.oppwa.mobile.connect.C11771R;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.d0 */
public class C11824d0 extends C11799b {
    @C0195i0
    public View onCreateView(LayoutInflater layoutInflater, @C0195i0 ViewGroup viewGroup, @C0195i0 Bundle bundle) {
        return layoutInflater.inflate(C11771R.layout.opp_fragment_processing, viewGroup, false);
    }

    public void onViewCreated(View view, @C0195i0 Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f34131b.setText(C11771R.string.checkout_processing);
        this.f34129O.setVisibility(4);
    }
}
