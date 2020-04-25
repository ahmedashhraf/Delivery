package com.mrsool.p410r.p411a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.mrsool.C10232R;
import com.mrsool.C10232R.C10235drawable;
import com.mrsool.p410r.p414d.C11148a;
import java.util.List;
import java.util.Locale;

/* renamed from: com.mrsool.r.a.a */
/* compiled from: CountryListAdapter */
public class C11138a extends BaseAdapter {

    /* renamed from: N */
    LayoutInflater f30842N = ((LayoutInflater) this.f30843a.getSystemService("layout_inflater"));

    /* renamed from: a */
    private Context f30843a;

    /* renamed from: b */
    List<C11148a> f30844b;

    /* renamed from: com.mrsool.r.a.a$a */
    /* compiled from: CountryListAdapter */
    static class C11139a {

        /* renamed from: a */
        public TextView f30845a;

        /* renamed from: b */
        public ImageView f30846b;

        C11139a() {
        }
    }

    public C11138a(Context context, List<C11148a> list) {
        this.f30843a = context;
        this.f30844b = list;
    }

    /* renamed from: a */
    private int m50524a(String str) {
        try {
            return C10235drawable.class.getField(str).getInt(null);
        } catch (Exception unused) {
            return -1;
        }
    }

    public int getCount() {
        return this.f30844b.size();
    }

    public Object getItem(int i) {
        return null;
    }

    public long getItemId(int i) {
        return 0;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        View view2;
        C11139a aVar;
        C11148a aVar2 = (C11148a) this.f30844b.get(i);
        if (view == null) {
            aVar = new C11139a();
            view2 = this.f30842N.inflate(C10232R.layout.row, null);
            aVar.f30845a = (TextView) view2.findViewById(C10232R.C10236id.row_title);
            aVar.f30846b = (ImageView) view2.findViewById(C10232R.C10236id.row_icon);
            view2.setTag(aVar);
        } else {
            view2 = view;
            aVar = (C11139a) view.getTag();
        }
        aVar.f30845a.setText(aVar2.mo38972d());
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("flag_");
            sb.append(aVar2.mo38965a().toLowerCase(Locale.ENGLISH));
            int a = m50524a(sb.toString());
            aVar2.mo38966a(a);
            aVar.f30846b.setImageResource(a);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return view2;
    }
}
