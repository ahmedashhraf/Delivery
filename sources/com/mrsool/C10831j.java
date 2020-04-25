package com.mrsool;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.mrsool.bean.CancelReasonBean;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.mrsool.j */
/* compiled from: CancelCustomReasonAdapter */
public class C10831j extends ArrayAdapter<CancelReasonBean> {

    /* renamed from: N */
    public Resources f29741N;

    /* renamed from: O */
    LayoutInflater f29742O;

    /* renamed from: a */
    private Context f29743a;

    /* renamed from: b */
    private List<CancelReasonBean> f29744b = new ArrayList();

    public C10831j(Context context, List<CancelReasonBean> list) {
        super(context, C10232R.layout.row_reason_spinner, list);
        this.f29743a = context;
        this.f29744b = list;
        this.f29742O = (LayoutInflater) this.f29743a.getSystemService("layout_inflater");
    }

    /* renamed from: a */
    public View mo38465a(int i, View view, ViewGroup viewGroup) {
        View inflate = this.f29742O.inflate(C10232R.layout.row_reason_spinner, viewGroup, false);
        ((TextView) inflate.findViewById(C10232R.C10236id.txtTitle)).setText(((CancelReasonBean) this.f29744b.get(i)).getReason());
        return inflate;
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        View inflate = this.f29742O.inflate(C10232R.layout.row_reason_spinner_dropdown, viewGroup, false);
        TextView textView = (TextView) inflate.findViewById(C10232R.C10236id.txtTitle);
        Typeface createFromAsset = Typeface.createFromAsset(getContext().getAssets(), "ProximaNova-Bold.otf");
        if (i == 0 && createFromAsset != null) {
            textView.setTypeface(createFromAsset, 1);
        }
        textView.setText(((CancelReasonBean) this.f29744b.get(i)).getReason());
        return inflate;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        return mo38465a(i, view, viewGroup);
    }
}
