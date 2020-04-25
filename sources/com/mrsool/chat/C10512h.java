package com.mrsool.chat;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.C0195i0;
import com.google.android.material.bottomsheet.C5670b;
import com.mrsool.C10232R;
import com.mrsool.bean.CancelReasonMainBean;
import com.mrsool.bean.ServiceManualDataBean;
import com.mrsool.order.C11056p;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C5887x;
import com.mrsool.utils.webservice.C5882b;
import java.util.HashMap;
import p053b.p065e.p066b.p067a.C2118c;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* renamed from: com.mrsool.chat.h */
/* compiled from: ChatOptionMenuConfirmationDialogFragment */
public class C10512h extends C5670b implements OnClickListener, C11056p {

    /* renamed from: N */
    private final int f28478N = 4;

    /* renamed from: O */
    private final int f28479O = 1;

    /* renamed from: P */
    private final int f28480P = 2;

    /* renamed from: Q */
    private final String f28481Q = "CancelReasonList";

    /* renamed from: R */
    private FrameLayout f28482R;

    /* renamed from: S */
    private TextView f28483S;

    /* renamed from: T */
    private TextView f28484T;

    /* renamed from: U */
    private TextView f28485U;

    /* renamed from: V */
    private ProgressBar f28486V;

    /* renamed from: W */
    private ImageView f28487W;

    /* renamed from: X */
    public C5887x f28488X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public CancelReasonMainBean f28489Y;
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public int f28490Z;

    /* renamed from: a0 */
    private int f28491a0 = -1;

    /* renamed from: b */
    private final int f28492b = 3;

    /* renamed from: b0 */
    private String f28493b0;

    /* renamed from: c0 */
    private C10515c f28494c0;

    /* renamed from: com.mrsool.chat.h$a */
    /* compiled from: ChatOptionMenuConfirmationDialogFragment */
    class C10513a implements Callback<CancelReasonMainBean> {

        /* renamed from: a */
        final /* synthetic */ int f28495a;

        C10513a(int i) {
            this.f28495a = i;
        }

        public void onFailure(Call<CancelReasonMainBean> call, Throwable th) {
            if (C10512h.this.getActivity() == null || !C10512h.this.getActivity().isFinishing()) {
                C10512h hVar = C10512h.this;
                if (hVar.f28488X != null) {
                    hVar.m48597a(3);
                    C10512h.this.f28488X.mo23653q0();
                }
            }
        }

        public void onResponse(Call<CancelReasonMainBean> call, Response<CancelReasonMainBean> response) {
            if (!(C10512h.this.getActivity() == null || C10512h.this.getActivity().isFinishing() || C10512h.this.f28488X == null)) {
                if (response.isSuccessful()) {
                    C10512h.this.f28489Y = (CancelReasonMainBean) response.body();
                    if (((CancelReasonMainBean) response.body()).getCode() <= 300) {
                        C10512h.this.f28490Z = this.f28495a;
                        String a = C10512h.this.f28488X.mo23528a(response.body());
                        if (!TextUtils.isEmpty(a)) {
                            C10512h.this.f28488X.mo23551a(new ServiceManualDataBean("CancelReasonList", a));
                            C10512h hVar = C10512h.this;
                            hVar.f28488X.mo23553a((C11056p) hVar);
                        } else {
                            C10512h.this.m48607y();
                        }
                    } else if (((CancelReasonMainBean) response.body()).getCode() == 402) {
                        C10512h.this.m48597a(3);
                        if (C10512h.this.getActivity() != null && !C10512h.this.getActivity().isDestroyed()) {
                            C10512h.this.getActivity().finish();
                        }
                    } else {
                        C10512h.this.m48597a(3);
                        C10512h.this.f28488X.mo23615f(((CancelReasonMainBean) response.body()).getMessage(), C10512h.this.getString(C10232R.string.app_name));
                    }
                } else {
                    C10512h.this.m48597a(3);
                    C5887x xVar = C10512h.this.f28488X;
                    if (xVar != null) {
                        xVar.mo23615f(response.message(), C10512h.this.getString(C10232R.string.app_name));
                    }
                }
            }
        }
    }

    /* renamed from: com.mrsool.chat.h$b */
    /* compiled from: ChatOptionMenuConfirmationDialogFragment */
    class C10514b implements AnimationListener {
        C10514b() {
        }

        public void onAnimationEnd(Animation animation) {
            C10512h.this.m48605w();
            C10512h.this.m48597a(3);
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: com.mrsool.chat.h$c */
    /* compiled from: ChatOptionMenuConfirmationDialogFragment */
    public interface C10515c {
        /* renamed from: a */
        void mo37660a(int i, int i2, CancelReasonMainBean cancelReasonMainBean);

        /* renamed from: g */
        void mo37671g(int i);
    }

    /* renamed from: c */
    private String m48603c(int i) {
        switch (i) {
            case C10232R.C10236id.action_cancel_order /*2131361861*/:
                return getString(C10232R.string.masg_ask_to_cancel_order);
            case C10232R.C10236id.action_change_courier /*2131361862*/:
                return getString(C10232R.string.masg_ask_to_change_courier);
            case C10232R.C10236id.action_goods_delivered /*2131361867*/:
                return getString(C10232R.string.msg_ask_have_you_delivered);
            case C10232R.C10236id.action_withdraw_order /*2131361887*/:
                return getString(C10232R.string.masg_ask_to_withdraw_order);
            default:
                return "";
        }
    }

    /* renamed from: e */
    private String m48604e(int i) {
        switch (i) {
            case C10232R.C10236id.action_cancel_order /*2131361861*/:
                return getString(C10232R.string.lbl_delete_order);
            case C10232R.C10236id.action_change_courier /*2131361862*/:
                return getString(C10232R.string.lbl_yes_change_courier);
            case C10232R.C10236id.action_goods_delivered /*2131361867*/:
                return getString(C10232R.string.lbl_yes_i_have_delivered);
            case C10232R.C10236id.action_withdraw_order /*2131361887*/:
                return getString(C10232R.string.lbl_withdraw_it);
            default:
                return "";
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public void m48605w() {
        dismiss();
        C10515c cVar = this.f28494c0;
        if (cVar != null) {
            cVar.mo37660a(this.f28491a0, this.f28490Z, this.f28489Y);
        }
    }

    /* renamed from: x */
    private void m48606x() {
        if (this.f28488X.mo23502X()) {
            switch (this.f28491a0) {
                case C10232R.C10236id.action_cancel_order /*2131361861*/:
                    m48598a(0, 4);
                    return;
                case C10232R.C10236id.action_change_courier /*2131361862*/:
                    m48598a(2, 1);
                    return;
                case C10232R.C10236id.action_withdraw_order /*2131361887*/:
                    m48598a(1, 2);
                    return;
                default:
                    return;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public void m48607y() {
        this.f28486V.setVisibility(8);
        mo37894a(this.f28487W, 0, new C10514b());
    }

    /* renamed from: f */
    public void mo36511f(String str) {
        if (((str.hashCode() == -625282244 && str.equals("CancelReasonList")) ? (char) 0 : 65535) == 0) {
            m48607y();
        }
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            this.f28494c0 = (C10515c) context;
        } catch (ClassCastException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append(context.toString());
            sb.append(" must implement DialogFragmentListener");
            throw new ClassCastException(sb.toString());
        }
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == C10232R.C10236id.flPositive) {
            int i = this.f28491a0;
            if (i == C10232R.C10236id.action_change_courier || i == C10232R.C10236id.action_cancel_order || i == C10232R.C10236id.action_withdraw_order) {
                m48606x();
                return;
            }
            this.f28494c0.mo37671g(i);
            dismiss();
        } else if (id == C10232R.C10236id.tvNegative) {
            dismiss();
        }
    }

    public void onCreate(@C0195i0 Bundle bundle) {
        super.onCreate(bundle);
        this.f28488X = new C5887x(getActivity());
        if (getArguments() != null) {
            Bundle arguments = getArguments();
            String str = "data";
            if (arguments.containsKey(str)) {
                this.f28491a0 = arguments.getInt(str);
            }
            if (arguments.containsKey(C11644i.f33314h1)) {
                this.f28493b0 = arguments.getString(C11644i.f33314h1);
            }
        }
    }

    @C0195i0
    public View onCreateView(LayoutInflater layoutInflater, @C0195i0 ViewGroup viewGroup, @C0195i0 Bundle bundle) {
        return layoutInflater.inflate(C10232R.layout.layout_chat_option_confirmation_bottom_sheet, viewGroup, false);
    }

    public void onViewCreated(View view, @C0195i0 Bundle bundle) {
        super.onViewCreated(view, bundle);
        m48599a(view);
    }

    /* renamed from: a */
    public static C10512h m48596a(int i, String str) {
        Bundle bundle = new Bundle();
        bundle.putInt("data", i);
        bundle.putString(C11644i.f33314h1, str);
        C10512h hVar = new C10512h();
        hVar.setArguments(bundle);
        return hVar;
    }

    /* renamed from: a */
    private void m48599a(View view) {
        this.f28483S = (TextView) view.findViewById(C10232R.C10236id.tvMessage);
        this.f28484T = (TextView) view.findViewById(C10232R.C10236id.tvNegative);
        this.f28485U = (TextView) view.findViewById(C10232R.C10236id.tvPositive);
        this.f28482R = (FrameLayout) view.findViewById(C10232R.C10236id.flPositive);
        this.f28487W = (ImageView) view.findViewById(C10232R.C10236id.ivSuccess);
        this.f28486V = (ProgressBar) view.findViewById(C10232R.C10236id.pbPending);
        int i = this.f28491a0;
        if (i != -1) {
            String c = m48603c(i);
            String e = m48604e(this.f28491a0);
            this.f28483S.setText(c);
            this.f28485U.setText(e);
            this.f28482R.setOnClickListener(this);
            this.f28484T.setOnClickListener(this);
            return;
        }
        dismiss();
    }

    /* renamed from: a */
    private void m48598a(int i, int i2) {
        if (this.f28488X != null) {
            m48597a(1);
            HashMap hashMap = new HashMap();
            hashMap.put("current_user_id", this.f28488X.mo23476G());
            hashMap.put("auth_token", this.f28488X.mo23468C().mo23459f(C11644i.f33443w5));
            hashMap.put("user_id", this.f28488X.mo23476G());
            StringBuilder sb = new StringBuilder();
            String str = "";
            sb.append(str);
            sb.append(this.f28493b0);
            hashMap.put("order_id", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(i2);
            hashMap.put("type", sb2.toString());
            C5882b.m25774a(this.f28488X).cancelReason(hashMap).enqueue(new C10513a(i));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m48597a(int i) {
        if (i == 1) {
            this.f28484T.setEnabled(false);
            this.f28485U.setVisibility(8);
            this.f28486V.setVisibility(0);
            this.f28487W.setVisibility(4);
        } else if (i != 2 && i == 3) {
            this.f28486V.setVisibility(8);
            this.f28487W.setVisibility(4);
            this.f28485U.setVisibility(0);
            this.f28484T.setEnabled(true);
        }
    }

    /* renamed from: a */
    public void mo37894a(View view, int i, AnimationListener animationListener) {
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setFillAfter(true);
        animationSet.setInterpolator(new C2118c());
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(500);
        long j = (long) i;
        alphaAnimation.setStartOffset(j);
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.5f, 1.0f, 0.5f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(500);
        scaleAnimation.setStartOffset(j);
        animationSet.addAnimation(alphaAnimation);
        animationSet.addAnimation(scaleAnimation);
        animationSet.setAnimationListener(animationListener);
        view.startAnimation(animationSet);
    }
}
