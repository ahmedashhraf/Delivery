package com.oppwa.mobile.connect.checkout.dialog;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import androidx.annotation.C0195i0;
import com.oppwa.mobile.connect.C11771R;
import com.oppwa.mobile.connect.checkout.meta.CheckoutStorePaymentDetailsMode;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.b0 */
public abstract class C11801b0 extends C11795a0 {

    /* renamed from: a0 */
    private CheckBox f34133a0;

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo40412e() {
        if (this.f34111P.mo40664C() == CheckoutStorePaymentDetailsMode.ALWAYS) {
            return true;
        }
        CheckBox checkBox = this.f34133a0;
        if (checkBox != null) {
            return checkBox.isChecked();
        }
        return false;
    }

    public void onViewCreated(View view, @C0195i0 Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f34133a0 = (CheckBox) view.findViewById(C11771R.C11775id.store_payment_info_checkbox);
        if (!"/registration".equals(this.f34112Q.mo40845i())) {
            if (!"/omnitoken".equals(this.f34112Q.mo40845i())) {
                if (this.f34111P.mo40664C() == CheckoutStorePaymentDetailsMode.PROMPT && this.f34115T == null) {
                    view.findViewById(C11771R.C11775id.store_payment_info_layout).setVisibility(0);
                    return;
                }
                return;
            }
        }
        this.f34119X.setText(C11771R.string.checkout_layout_text_register);
    }
}
