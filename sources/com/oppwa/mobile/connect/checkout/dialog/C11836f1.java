package com.oppwa.mobile.connect.checkout.dialog;

import android.text.Editable;
import com.oppwa.mobile.connect.p427b.C11779b;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.f1 */
class C11836f1 extends C11920y0 {

    /* renamed from: O */
    private String f34212O;

    /* renamed from: P */
    private String f34213P;

    /* renamed from: Q */
    private boolean f34214Q = false;

    C11836f1(Character ch, String str) {
        this.f34212O = String.valueOf(ch);
        if (str != null) {
            this.f34213P = str;
        } else {
            this.f34213P = "#### #### #### #### ###";
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Editable mo40458a(Editable editable) {
        if (this.f34214Q && C11779b.m52955b((CharSequence) editable)) {
            return editable;
        }
        int i = 0;
        while (i < editable.length()) {
            if (editable.charAt(i) == this.f34212O.charAt(0)) {
                this.f34395a = true;
                editable.replace(i, i + 1, "");
            }
            if (i < this.f34213P.length() && this.f34213P.charAt(i) == this.f34212O.charAt(0)) {
                this.f34395a = true;
                editable.insert(i, this.f34212O);
                i++;
            }
            i++;
        }
        return editable;
    }

    /* renamed from: a */
    public String mo40459a() {
        return this.f34212O;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo40460a(String str) {
        return str.replace(this.f34212O, "");
    }

    /* renamed from: a */
    public void mo40461a(boolean z) {
        this.f34214Q = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo40462b(Editable editable) {
    }
}
