package com.mrsool.p425y;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.C0195i0;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0716g;
import androidx.core.content.C0841b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.C5670b;
import com.mrsool.C10232R;
import com.mrsool.bean.OrderReasonBean;
import com.mrsool.utils.C11648l;
import com.mrsool.utils.C5887x;

/* renamed from: com.mrsool.y.b */
/* compiled from: ShowReasonDialogFragment */
public class C11759b extends C5670b implements OnClickListener {

    /* renamed from: N */
    private TextView f34002N;

    /* renamed from: O */
    private TextView f34003O;

    /* renamed from: P */
    private RecyclerView f34004P;

    /* renamed from: Q */
    private C11761c f34005Q;

    /* renamed from: R */
    public C5887x f34006R;

    /* renamed from: S */
    private OrderReasonBean f34007S;

    /* renamed from: T */
    private C11760a f34008T;

    /* renamed from: b */
    private TextView f34009b;

    /* renamed from: com.mrsool.y.b$a */
    /* compiled from: ShowReasonDialogFragment */
    public interface C11760a {
        /* renamed from: a */
        void mo37659a(int i, int i2);

        /* renamed from: f */
        void mo37670f(int i);
    }

    /* renamed from: a */
    public static C11759b m52887a(OrderReasonBean orderReasonBean) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("data", orderReasonBean);
        C11759b bVar = new C11759b();
        bVar.setArguments(bundle);
        return bVar;
    }

    /* renamed from: b */
    static /* synthetic */ void m52889b(View view) {
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) ((C0716g) ((View) view.getParent()).getLayoutParams()).mo4027d();
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.mo22467c(view.getMeasuredHeight());
        }
    }

    /* renamed from: w */
    private boolean m52890w() {
        if (this.f34005Q.mo40269f() >= 0) {
            return true;
        }
        this.f34006R.mo23615f(getString(C10232R.string.alert_please_select_reason), getString(C10232R.string.app_name));
        return false;
    }

    /* renamed from: x */
    private void m52891x() {
        this.f34009b.setText(this.f34007S.getMessage());
        this.f34003O.setText(this.f34007S.getPositiveBtnText());
        this.f34002N.setText(this.f34007S.getNegativeBtnText());
        if (this.f34007S.getPositiveColorRes().intValue() > 0) {
            this.f34003O.setTextColor(C0841b.m4915a(getContext(), this.f34007S.getPositiveColorRes().intValue()));
        }
        this.f34005Q = new C11761c(this.f34007S.getSpinnerList(), getActivity());
        this.f34004P.setLayoutManager(new LinearLayoutManager(getActivity()));
        this.f34004P.addItemDecoration(new C11648l(C0841b.m4928c(getActivity(), C10232R.C10235drawable.list_divider_7a)));
        this.f34004P.setAdapter(this.f34005Q);
        if (this.f34007S.getSelectedPos().intValue() >= 0) {
            this.f34005Q.mo40270g(this.f34007S.getSelectedPos().intValue());
        }
        this.f34003O.setOnClickListener(this);
        this.f34002N.setOnClickListener(this);
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            this.f34008T = (C11760a) context;
        } catch (ClassCastException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append(context.toString());
            sb.append(" must implement EditNameDialogListener");
            throw new ClassCastException(sb.toString());
        }
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == C10232R.C10236id.tvNegative) {
            this.f34008T.mo37670f(this.f34007S.getIsForCancelWithdrawOrCourier());
            dismiss();
        } else if (id == C10232R.C10236id.tvPositive && m52890w()) {
            this.f34008T.mo37659a(this.f34007S.getIsForCancelWithdrawOrCourier(), this.f34005Q.mo40269f());
            dismiss();
        }
    }

    public void onCreate(@C0195i0 Bundle bundle) {
        super.onCreate(bundle);
        this.f34006R = new C5887x(getActivity());
        if (getArguments() != null) {
            String str = "data";
            if (getArguments().containsKey(str)) {
                this.f34007S = (OrderReasonBean) getArguments().getParcelable(str);
            }
        }
    }

    @C0195i0
    public View onCreateView(LayoutInflater layoutInflater, @C0195i0 ViewGroup viewGroup, @C0195i0 Bundle bundle) {
        return layoutInflater.inflate(C10232R.layout.layout_show_reason, viewGroup, false);
    }

    public void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.findViewById(C10232R.C10236id.design_bottom_sheet).getLayoutParams().height = -2;
        }
        View view = getView();
        if (view != null) {
            view.post(new C11758a(view));
        }
    }

    public void onViewCreated(View view, @C0195i0 Bundle bundle) {
        super.onViewCreated(view, bundle);
        m52888a(view);
    }

    /* renamed from: a */
    private void m52888a(View view) {
        this.f34009b = (TextView) view.findViewById(C10232R.C10236id.tvMessage);
        this.f34002N = (TextView) view.findViewById(C10232R.C10236id.tvNegative);
        this.f34003O = (TextView) view.findViewById(C10232R.C10236id.tvPositive);
        this.f34004P = (RecyclerView) view.findViewById(C10232R.C10236id.rvReasons);
        if (this.f34007S != null) {
            m52891x();
        }
    }
}
