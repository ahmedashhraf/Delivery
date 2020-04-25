package com.oppwa.mobile.connect.checkout.dialog;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.oppwa.mobile.connect.C11771R;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.e1 */
class C11830e1 extends BaseAdapter {

    /* renamed from: N */
    private int f34201N;

    /* renamed from: a */
    private C11832b[] f34202a;

    /* renamed from: b */
    private LayoutInflater f34203b;

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.e1$b */
    static class C11832b {

        /* renamed from: a */
        String f34204a;

        /* renamed from: b */
        String f34205b;

        C11832b(String str, String str2) {
            this.f34204a = str;
            this.f34205b = str2;
        }
    }

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.e1$c */
    private static class C11833c {

        /* renamed from: a */
        TextView f34206a;

        /* renamed from: b */
        ImageView f34207b;

        private C11833c() {
        }
    }

    C11830e1(Context context, C11832b[] bVarArr) {
        this.f34202a = bVarArr;
        this.f34203b = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo40448a() {
        return this.f34201N;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo40449a(int i) {
        this.f34201N = i;
    }

    public int getCount() {
        return this.f34202a.length;
    }

    public Object getItem(int i) {
        return this.f34202a[i];
    }

    public long getItemId(int i) {
        return 0;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C11833c cVar;
        if (view == null) {
            view = this.f34203b.inflate(C11771R.layout.opp_item_payment_info, viewGroup, false);
            cVar = new C11833c();
            cVar.f34206a = (TextView) view.findViewById(C11771R.C11775id.text_view);
            cVar.f34207b = (ImageView) view.findViewById(C11771R.C11775id.mark_image_view);
            view.setTag(cVar);
        } else {
            cVar = (C11833c) view.getTag();
        }
        cVar.f34206a.setText(this.f34202a[i].f34204a);
        if (i == this.f34201N) {
            cVar.f34207b.setVisibility(0);
        } else {
            cVar.f34207b.setVisibility(4);
        }
        return view;
    }
}
