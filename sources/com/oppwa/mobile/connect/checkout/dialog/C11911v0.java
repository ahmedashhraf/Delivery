package com.oppwa.mobile.connect.checkout.dialog;

import android.text.Editable;
import java.util.Calendar;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.v0 */
class C11911v0 extends C11920y0 {

    /* renamed from: O */
    private String f34374O;

    /* renamed from: P */
    private String f34375P;

    /* renamed from: Q */
    private String f34376Q;

    /* renamed from: R */
    private int f34377R;

    C11911v0(Character ch, int i) {
        this.f34374O = String.valueOf(ch);
        this.f34377R = i;
        String str = "";
        this.f34375P = str;
        this.f34376Q = str;
    }

    /* renamed from: a */
    private void m53560a(String str) {
        if (str.contains(this.f34374O)) {
            String[] split = str.split(this.f34374O);
            this.f34375P = split[0];
            if (split.length > 1) {
                this.f34376Q = m53561b(split[1]);
            }
        }
    }

    /* renamed from: b */
    private String m53561b(String str) {
        if (str.length() != 2) {
            return str;
        }
        int i = Calendar.getInstance().get(1) / 100;
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: c */
    private void m53562c(Editable editable) {
        int length = editable.length();
        for (int i = 0; i < length; i++) {
            if (editable.charAt(i) == this.f34374O.charAt(0)) {
                this.f34395a = true;
                editable.replace(i, i + 1, "");
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Editable mo40458a(Editable editable) {
        m53562c(editable);
        if (editable.length() < this.f34377R) {
            return editable;
        }
        int length = editable.length();
        int i = this.f34377R;
        this.f34395a = true;
        if (length == i) {
            editable.append(this.f34374O);
        } else {
            editable.insert(i, this.f34374O);
        }
        m53560a(editable.toString());
        return editable;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo40595a() {
        return this.f34375P;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public String mo40596b() {
        return this.f34376Q;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo40462b(Editable editable) {
        m53560a(editable.toString());
    }
}
