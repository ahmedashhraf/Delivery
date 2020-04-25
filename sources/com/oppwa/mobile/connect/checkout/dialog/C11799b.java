package com.oppwa.mobile.connect.checkout.dialog;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.C0195i0;
import androidx.fragment.app.Fragment;
import com.oppwa.mobile.connect.C11771R;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.b */
public class C11799b extends Fragment {

    /* renamed from: N */
    protected ImageButton f34128N;

    /* renamed from: O */
    protected ImageButton f34129O;

    /* renamed from: a */
    protected C11909u0 f34130a;

    /* renamed from: b */
    protected TextView f34131b;

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.b$a */
    class C11800a implements OnClickListener {
        C11800a() {
        }

        public void onClick(View view) {
            C11909u0 u0Var = C11799b.this.f34130a;
            if (u0Var != null) {
                u0Var.mo40399w();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo40410b(int i) {
        this.f34131b.setText(i);
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (getActivity() instanceof C11909u0) {
            this.f34130a = (C11909u0) getActivity();
        }
    }

    public void onCreate(@C0195i0 Bundle bundle) {
        super.onCreate(bundle);
    }

    public void onDetach() {
        super.onDetach();
        this.f34130a = null;
    }

    public void onViewCreated(View view, @C0195i0 Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f34131b = (TextView) view.findViewById(C11771R.C11775id.title);
        this.f34128N = (ImageButton) view.findViewById(C11771R.C11775id.back_button);
        this.f34129O = (ImageButton) view.findViewById(C11771R.C11775id.close_button);
        this.f34129O.setOnClickListener(new C11800a());
    }
}
