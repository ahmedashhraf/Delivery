package com.mrsool.chat;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.C0195i0;
import androidx.core.content.C0841b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.C5670b;
import com.mrsool.C10232R;
import com.mrsool.bean.OptionMenuItemsBean;
import com.mrsool.p418u.C11557a;
import com.mrsool.utils.C11648l;
import com.mrsool.utils.C5887x;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.mrsool.chat.i */
/* compiled from: ChatOptionMenuDialogFragment */
public class C10516i extends C5670b implements OnClickListener {

    /* renamed from: N */
    private RecyclerView f28498N;

    /* renamed from: O */
    private C10519j f28499O;

    /* renamed from: P */
    public C5887x f28500P;

    /* renamed from: Q */
    private ArrayList<OptionMenuItemsBean> f28501Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public ArrayList<OptionMenuItemsBean> f28502R;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public C10518b f28503S;

    /* renamed from: b */
    private TextView f28504b;

    /* renamed from: com.mrsool.chat.i$a */
    /* compiled from: ChatOptionMenuDialogFragment */
    class C10517a implements C11557a {
        C10517a() {
        }

        /* renamed from: a */
        public void mo37901a(int i) {
            C10516i.this.dismiss();
            C10516i.this.f28503S.mo37668e(((OptionMenuItemsBean) C10516i.this.f28502R.get(i)).getId());
        }
    }

    /* renamed from: com.mrsool.chat.i$b */
    /* compiled from: ChatOptionMenuDialogFragment */
    public interface C10518b {
        /* renamed from: e */
        void mo37668e(int i);

        void onCancel();
    }

    /* renamed from: x */
    private void m48616x() {
        this.f28499O = new C10519j(getActivity(), this.f28502R, new C10517a());
        this.f28498N.setLayoutManager(new LinearLayoutManager(getActivity()));
        this.f28498N.addItemDecoration(new C11648l(C0841b.m4928c(getActivity(), C10232R.C10235drawable.list_divider_7a)));
        this.f28498N.setAdapter(this.f28499O);
        this.f28504b.setOnClickListener(this);
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            this.f28503S = (C10518b) context;
        } catch (ClassCastException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append(context.toString());
            sb.append(" must implement DialogFragmentListener");
            throw new ClassCastException(sb.toString());
        }
    }

    public void onClick(View view) {
        if (view.getId() == C10232R.C10236id.tvCancel) {
            dismiss();
            this.f28503S.onCancel();
        }
    }

    public void onCreate(@C0195i0 Bundle bundle) {
        super.onCreate(bundle);
        this.f28500P = new C5887x(getActivity());
        if (getArguments() != null) {
            String str = "data";
            if (getArguments().containsKey(str)) {
                this.f28501Q = getArguments().getParcelableArrayList(str);
            }
        }
        mo37900w();
    }

    @C0195i0
    public View onCreateView(LayoutInflater layoutInflater, @C0195i0 ViewGroup viewGroup, @C0195i0 Bundle bundle) {
        return layoutInflater.inflate(C10232R.layout.layout_chat_option_bottom_sheet, viewGroup, false);
    }

    public void onViewCreated(View view, @C0195i0 Bundle bundle) {
        super.onViewCreated(view, bundle);
        m48613a(view);
    }

    /* renamed from: w */
    public void mo37900w() {
        this.f28502R = new ArrayList<>();
        ArrayList<OptionMenuItemsBean> arrayList = this.f28501Q;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                OptionMenuItemsBean optionMenuItemsBean = (OptionMenuItemsBean) it.next();
                if (optionMenuItemsBean.isVisible()) {
                    this.f28502R.add(optionMenuItemsBean);
                }
            }
        }
    }

    /* renamed from: a */
    private void m48613a(View view) {
        this.f28504b = (TextView) view.findViewById(C10232R.C10236id.tvCancel);
        this.f28498N = (RecyclerView) view.findViewById(C10232R.C10236id.rvOptions);
        if (this.f28501Q != null) {
            m48616x();
        }
    }

    /* renamed from: b */
    public static C10516i m48615b(ArrayList<OptionMenuItemsBean> arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("data", arrayList);
        C10516i iVar = new C10516i();
        iVar.setArguments(bundle);
        return iVar;
    }
}
