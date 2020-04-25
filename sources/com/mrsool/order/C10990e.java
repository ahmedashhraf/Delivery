package com.mrsool.order;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.mrsool.C10232R;
import com.mrsool.bean.ReasonBean;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.mrsool.order.e */
/* compiled from: CustomReasonAdapter */
public class C10990e extends ArrayAdapter<ReasonBean> {

    /* renamed from: N */
    public Resources f30341N;

    /* renamed from: O */
    LayoutInflater f30342O;

    /* renamed from: a */
    private Context f30343a;

    /* renamed from: b */
    private List<ReasonBean> f30344b = new ArrayList();

    public C10990e(Context context, List<ReasonBean> list) {
        super(context, C10232R.layout.row_reason_spinner, list);
        this.f30343a = context;
        this.f30344b = list;
        this.f30342O = (LayoutInflater) this.f30343a.getSystemService("layout_inflater");
    }

    /* renamed from: a */
    public View mo38749a(int i, View view, ViewGroup viewGroup) {
        View inflate = this.f30342O.inflate(C10232R.layout.row_reason_spinner, viewGroup, false);
        ((TextView) inflate.findViewById(C10232R.C10236id.txtTitle)).setText(((ReasonBean) this.f30344b.get(i)).getvReason());
        return inflate;
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        View inflate = this.f30342O.inflate(C10232R.layout.row_reason_spinner_dropdown, viewGroup, false);
        TextView textView = (TextView) inflate.findViewById(C10232R.C10236id.txtTitle);
        Typeface createFromAsset = Typeface.createFromAsset(getContext().getAssets(), "ProximaNova-Bold.otf");
        if (i == 0 && createFromAsset != null) {
            textView.setTypeface(createFromAsset, 1);
        }
        textView.setText(((ReasonBean) this.f30344b.get(i)).getvReason());
        return inflate;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        return mo38749a(i, view, viewGroup);
    }
}
