package com.google.android.material.bottomsheet;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.appcompat.app.C0301h;
import com.google.android.material.bottomsheet.BottomSheetBehavior.C5662e;

/* renamed from: com.google.android.material.bottomsheet.b */
/* compiled from: BottomSheetDialogFragment */
public class C5670b extends C0301h {

    /* renamed from: a */
    private boolean f16333a;

    /* renamed from: com.google.android.material.bottomsheet.b$b */
    /* compiled from: BottomSheetDialogFragment */
    private class C5672b extends C5662e {
        private C5672b() {
        }

        /* renamed from: a */
        public void mo22486a(@C0193h0 View view, float f) {
        }

        /* renamed from: a */
        public void mo22487a(@C0193h0 View view, int i) {
            if (i == 5) {
                C5670b.this.mo37900w();
            }
        }
    }

    /* renamed from: c */
    private boolean m24781c(boolean z) {
        Dialog dialog = getDialog();
        if (dialog instanceof C5665a) {
            C5665a aVar = (C5665a) dialog;
            BottomSheetBehavior a = aVar.mo22489a();
            if (a.mo22480j() && aVar.mo22491b()) {
                m24779a(a, z);
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public void mo37900w() {
        if (this.f16333a) {
            super.dismissAllowingStateLoss();
        } else {
            super.dismiss();
        }
    }

    public void dismiss() {
        if (!m24781c(false)) {
            super.dismiss();
        }
    }

    public void dismissAllowingStateLoss() {
        if (!m24781c(true)) {
            super.dismissAllowingStateLoss();
        }
    }

    @C0193h0
    public Dialog onCreateDialog(@C0195i0 Bundle bundle) {
        return new C5665a(getContext(), getTheme());
    }

    /* renamed from: a */
    private void m24779a(@C0193h0 BottomSheetBehavior<?> bottomSheetBehavior, boolean z) {
        this.f16333a = z;
        if (bottomSheetBehavior.mo22478h() == 5) {
            mo37900w();
            return;
        }
        if (getDialog() instanceof C5665a) {
            ((C5665a) getDialog()).mo22492c();
        }
        bottomSheetBehavior.mo22458a((C5662e) new C5672b());
        bottomSheetBehavior.mo22474e(5);
    }
}
