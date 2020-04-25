package com.mrsool.order;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.mrsool.C10232R;
import com.mrsool.bean.OrderSpinnerBean;
import java.util.ArrayList;

/* renamed from: com.mrsool.order.f */
/* compiled from: CustomSpinnerAdapter */
public class C10991f extends ArrayAdapter<OrderSpinnerBean> {

    /* renamed from: N */
    public Resources f30345N;

    /* renamed from: O */
    LayoutInflater f30346O = ((LayoutInflater) this.f30347a.getSystemService("layout_inflater"));

    /* renamed from: a */
    private Context f30347a;

    /* renamed from: b */
    private ArrayList<OrderSpinnerBean> f30348b;

    public C10991f(Context context, ArrayList<OrderSpinnerBean> arrayList) {
        super(context, C10232R.layout.spinner_row, arrayList);
        this.f30347a = context;
        this.f30348b = arrayList;
    }

    /* renamed from: a */
    public View mo38752a(int i, View view, ViewGroup viewGroup) {
        View inflate = this.f30346O.inflate(C10232R.layout.spinner_row, viewGroup, false);
        TextView textView = (TextView) inflate.findViewById(C10232R.C10236id.txtTabBadgeCount);
        ((TextView) inflate.findViewById(C10232R.C10236id.txtTitle)).setText(((OrderSpinnerBean) this.f30348b.get(i)).getTitle());
        try {
            if (Integer.parseInt(((OrderSpinnerBean) this.f30348b.get(i)).getCount()) > 0) {
                textView.setVisibility(8);
                textView.setText(((OrderSpinnerBean) this.f30348b.get(i)).getCount());
            } else {
                textView.setVisibility(8);
            }
        } catch (Exception unused) {
            textView.setVisibility(8);
        }
        return inflate;
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        View inflate = this.f30346O.inflate(C10232R.layout.spinner_row, viewGroup, false);
        TextView textView = (TextView) inflate.findViewById(C10232R.C10236id.txtTabBadgeCount);
        ((TextView) inflate.findViewById(C10232R.C10236id.txtTitle)).setText(((OrderSpinnerBean) this.f30348b.get(i)).getTitle());
        try {
            if (Integer.parseInt(((OrderSpinnerBean) this.f30348b.get(i)).getCount()) > 0) {
                textView.setVisibility(0);
                textView.setText(((OrderSpinnerBean) this.f30348b.get(i)).getCount());
            } else {
                textView.setVisibility(8);
            }
        } catch (Exception unused) {
            textView.setVisibility(8);
        }
        return inflate;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        return mo38752a(i, view, viewGroup);
    }
}
