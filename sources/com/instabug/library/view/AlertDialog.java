package com.instabug.library.view;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.instabug.library.C9700R;
import com.instabug.library.Instabug;
import com.instabug.library.core.p382ui.C9793b;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class AlertDialog extends C9793b implements OnClickListener {

    /* renamed from: T */
    private static transient /* synthetic */ boolean[] f26687T;

    /* renamed from: O */
    TextView f26688O;

    /* renamed from: P */
    TextView f26689P;

    /* renamed from: Q */
    TextView f26690Q;

    /* renamed from: R */
    String f26691R;

    /* renamed from: S */
    private OnAlertViewsClickListener f26692S;

    public interface OnAlertViewsClickListener {
        void onPositiveButtonClicked();
    }

    public AlertDialog() {
        m46649q()[0] = true;
    }

    /* renamed from: q */
    private static /* synthetic */ boolean[] m46649q() {
        boolean[] zArr = f26687T;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-7001040781690759825L, "com/instabug/library/view/AlertDialog", 29);
        f26687T = a;
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo34912a() {
        boolean[] q = m46649q();
        int i = C9700R.layout.instabug_alert_dialog;
        q[1] = true;
        return i;
    }

    /* renamed from: b */
    public String mo36017b() {
        CharSequence charSequence;
        boolean[] q = m46649q();
        TextView textView = this.f26688O;
        if (textView != null) {
            charSequence = textView.getText();
            q[14] = true;
        } else {
            charSequence = null;
            q[15] = true;
        }
        String valueOf = String.valueOf(charSequence);
        q[16] = true;
        return valueOf;
    }

    /* renamed from: e */
    public void mo36018e(String str) {
        boolean[] q = m46649q();
        TextView textView = this.f26688O;
        if (textView == null) {
            q[17] = true;
        } else {
            q[18] = true;
            textView.setText(str);
            q[19] = true;
        }
        this.f26691R = str;
        q[20] = true;
    }

    public void onClick(View view) {
        boolean[] q = m46649q();
        int id = view.getId();
        if (id == C9700R.C9704id.btnYes) {
            OnAlertViewsClickListener onAlertViewsClickListener = this.f26692S;
            if (onAlertViewsClickListener == null) {
                q[22] = true;
            } else {
                q[23] = true;
                onAlertViewsClickListener.onPositiveButtonClicked();
                q[24] = true;
            }
        } else if (id != C9700R.C9704id.btnNo) {
            q[25] = true;
        } else {
            q[26] = true;
            dismiss();
            q[27] = true;
        }
        q[28] = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
        boolean[] q = m46649q();
        super.onSaveInstanceState(bundle);
        q[12] = true;
        bundle.putString("message", this.f26691R);
        q[13] = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo34914a(View view, Bundle bundle) {
        boolean[] q = m46649q();
        this.f26688O = (TextView) view.findViewById(C9700R.C9704id.tvMessage);
        q[2] = true;
        this.f26689P = (TextView) view.findViewById(C9700R.C9704id.btnYes);
        q[3] = true;
        this.f26690Q = (TextView) view.findViewById(C9700R.C9704id.btnNo);
        q[4] = true;
        this.f26689P.setTextColor(Instabug.getPrimaryColor());
        q[5] = true;
        this.f26690Q.setTextColor(Instabug.getPrimaryColor());
        if (bundle == null) {
            q[6] = true;
        } else {
            q[7] = true;
            this.f26691R = bundle.getString("message", this.f26691R);
            q[8] = true;
        }
        this.f26688O.setText(this.f26691R);
        q[9] = true;
        this.f26689P.setOnClickListener(this);
        q[10] = true;
        this.f26690Q.setOnClickListener(this);
        q[11] = true;
    }

    /* renamed from: a */
    public void mo36016a(OnAlertViewsClickListener onAlertViewsClickListener) {
        boolean[] q = m46649q();
        this.f26692S = onAlertViewsClickListener;
        q[21] = true;
    }
}
