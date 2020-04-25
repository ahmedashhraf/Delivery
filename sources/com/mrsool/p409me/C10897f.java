package com.mrsool.p409me;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.C1635d0;
import androidx.recyclerview.widget.RecyclerView.C1638g;
import com.mrsool.C10232R;
import com.mrsool.bean.PaymentCardsBean;
import com.mrsool.bean.PaymentListBean;
import com.mrsool.utils.C5887x;
import java.util.ArrayList;
import java.util.List;
import p076c.p082c.p083a.C2232l;

/* renamed from: com.mrsool.me.f */
/* compiled from: CardListAdapter */
public class C10897f extends C1638g {

    /* renamed from: c */
    private Context f29972c;

    /* renamed from: d */
    private List<PaymentCardsBean> f29973d = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C10907j f29974e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C10903f f29975f;

    /* renamed from: g */
    private String f29976g = "";

    /* renamed from: h */
    private C5887x f29977h;

    /* renamed from: i */
    private PaymentListBean f29978i;

    /* renamed from: com.mrsool.me.f$a */
    /* compiled from: CardListAdapter */
    class C10898a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C10906i f29979a;

        C10898a(C10906i iVar) {
            this.f29979a = iVar;
        }

        public void onClick(View view) {
            if (C10897f.this.f29975f != null) {
                C10897f.this.f29975f.mo38493a(C10897f.this.m49825g(this.f29979a.mo7273f()));
            }
        }
    }

    /* renamed from: com.mrsool.me.f$b */
    /* compiled from: CardListAdapter */
    class C10899b implements OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ PopupWindow f29981a;

        C10899b(PopupWindow popupWindow) {
            this.f29981a = popupWindow;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() != 4) {
                return false;
            }
            this.f29981a.dismiss();
            return true;
        }
    }

    /* renamed from: com.mrsool.me.f$c */
    /* compiled from: CardListAdapter */
    class C10900c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PopupWindow f29983a;

        C10900c(PopupWindow popupWindow) {
            this.f29983a = popupWindow;
        }

        public void onClick(View view) {
            this.f29983a.dismiss();
        }
    }

    /* renamed from: com.mrsool.me.f$d */
    /* compiled from: CardListAdapter */
    class C10901d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PopupWindow f29985a;

        C10901d(PopupWindow popupWindow) {
            this.f29985a = popupWindow;
        }

        public void onClick(View view) {
            this.f29985a.dismiss();
        }
    }

    /* renamed from: com.mrsool.me.f$e */
    /* compiled from: CardListAdapter */
    class C10902e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ int f29987a;

        C10902e(int i) {
            this.f29987a = i;
        }

        public void onClick(View view) {
            if (C10897f.this.f29974e != null) {
                C10897f.this.f29974e.mo38492a(this.f29987a);
            }
        }
    }

    /* renamed from: com.mrsool.me.f$f */
    /* compiled from: CardListAdapter */
    public interface C10903f {
        /* renamed from: a */
        void mo38493a(int i);
    }

    /* renamed from: com.mrsool.me.f$g */
    /* compiled from: CardListAdapter */
    private static class C10904g extends C1635d0 {

        /* renamed from: s0 */
        TextView f29989s0;

        C10904g(View view) {
            super(view);
            this.f29989s0 = (TextView) view.findViewById(C10232R.C10236id.tvName);
        }
    }

    /* renamed from: com.mrsool.me.f$h */
    /* compiled from: CardListAdapter */
    public static class C10905h extends C1635d0 {

        /* renamed from: s0 */
        TextView f29990s0;

        /* renamed from: t0 */
        ImageView f29991t0;

        /* renamed from: u0 */
        LinearLayout f29992u0;

        public C10905h(View view) {
            super(view);
            this.f29990s0 = (TextView) view.findViewById(C10232R.C10236id.tvPaymentMethodName);
            this.f29992u0 = (LinearLayout) view.findViewById(C10232R.C10236id.llPayment);
            this.f29991t0 = (ImageView) view.findViewById(C10232R.C10236id.ivPaymentMethodIcon);
        }
    }

    /* renamed from: com.mrsool.me.f$i */
    /* compiled from: CardListAdapter */
    public static class C10906i extends C1635d0 {

        /* renamed from: s0 */
        TextView f29993s0;

        /* renamed from: t0 */
        TextView f29994t0;

        /* renamed from: u0 */
        ImageView f29995u0;

        /* renamed from: v0 */
        ImageView f29996v0;

        /* renamed from: w0 */
        LinearLayout f29997w0;

        /* renamed from: x0 */
        LinearLayout f29998x0;

        /* renamed from: y0 */
        View f29999y0;

        public C10906i(View view) {
            super(view);
            this.f29993s0 = (TextView) view.findViewById(C10232R.C10236id.tvPaymentMethodName);
            this.f29995u0 = (ImageView) view.findViewById(C10232R.C10236id.ivPaymentMethodIcon);
            this.f29996v0 = (ImageView) view.findViewById(C10232R.C10236id.ivPaymentMethodSelected);
            this.f29999y0 = view.findViewById(C10232R.C10236id.vDivider);
            this.f29997w0 = (LinearLayout) view.findViewById(C10232R.C10236id.llWarning);
            this.f29994t0 = (TextView) view.findViewById(C10232R.C10236id.tvDefault);
            this.f29998x0 = (LinearLayout) view.findViewById(C10232R.C10236id.llOptionMenu);
        }
    }

    /* renamed from: com.mrsool.me.f$j */
    /* compiled from: CardListAdapter */
    public interface C10907j {
        /* renamed from: a */
        void mo38492a(int i);
    }

    public C10897f(List<PaymentCardsBean> list, Context context) {
        this.f29972c = context;
        this.f29973d = list;
        this.f29976g = this.f29976g;
        this.f29977h = new C5887x(this.f29972c);
    }

    /* renamed from: f */
    private boolean m49824f() {
        return this.f29978i != null;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public int m49825g(int i) {
        return m49824f() ? i - 1 : i;
    }

    /* renamed from: c */
    public int mo7333c(int i) {
        if (i != 0 || !m49824f()) {
            return ((PaymentCardsBean) this.f29973d.get(m49825g(i))).getId() == null ? 3 : 2;
        }
        return 1;
    }

    /* renamed from: b */
    public C1635d0 mo7327b(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new C10905h(LayoutInflater.from(viewGroup.getContext()).inflate(C10232R.layout.row_payment_method_revised, viewGroup, false));
        }
        if (i != 3) {
            return new C10906i(LayoutInflater.from(viewGroup.getContext()).inflate(C10232R.layout.row_payment_method_revised, viewGroup, false));
        }
        return new C10904g(LayoutInflater.from(viewGroup.getContext()).inflate(C10232R.layout.row_payment_method_revised_footer, viewGroup, false));
    }

    /* renamed from: a */
    private void m49822a(C10906i iVar, int i) {
        PaymentCardsBean paymentCardsBean = (PaymentCardsBean) this.f29973d.get(m49825g(i));
        iVar.f29995u0.setImageResource(C5887x.m25788P(paymentCardsBean.getBrand()));
        iVar.f29993s0.setText(String.format(iVar.f6294a.getContext().getString(C10232R.string.card_ending_format), new Object[]{paymentCardsBean.getLastDigits()}));
        iVar.f29994t0.setVisibility(paymentCardsBean.isDefault() ? 0 : 8);
        iVar.f29998x0.setVisibility(0);
        iVar.f29998x0.setOnClickListener(new C10898a(iVar));
    }

    /* renamed from: b */
    public void mo7330b(C1635d0 d0Var, int i) {
        if (d0Var instanceof C10906i) {
            m49822a((C10906i) d0Var, i);
        } else if (d0Var instanceof C10904g) {
            m49820a((C10904g) d0Var, i);
        } else if (d0Var instanceof C10905h) {
            m49821a((C10905h) d0Var, i);
        }
    }

    /* renamed from: a */
    private void m49821a(C10905h hVar, int i) {
        C2232l.m11649c(this.f29972c).mo9515a(this.f29978i.getPaymentIconUrl()).m11500e((int) C10232R.C10235drawable.img_payment_placeholder).mo9424a(hVar.f29991t0);
        hVar.f29990s0.setText(this.f29978i.getName());
        this.f29977h.mo23582b(hVar.f29990s0);
    }

    /* renamed from: a */
    private void m49819a(View view, int i) {
        Context context = view.getContext();
        View inflate = LayoutInflater.from(context).inflate(C10232R.layout.layout_popup_payment_options, null);
        PopupWindow popupWindow = new PopupWindow(inflate, -2, -2);
        Rect a = m49817a(view);
        popupWindow.showAtLocation(view, 51, a.left, a.bottom - C5887x.m25794a(42, context));
        popupWindow.setOutsideTouchable(true);
        popupWindow.setTouchable(true);
        popupWindow.setFocusable(true);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        popupWindow.setOutsideTouchable(true);
        popupWindow.setBackgroundDrawable(new ShapeDrawable());
        popupWindow.setTouchInterceptor(new C10899b(popupWindow));
        TextView textView = (TextView) inflate.findViewById(C10232R.C10236id.tvCardError);
        ((LinearLayout) inflate.findViewById(C10232R.C10236id.llMarkDefault)).setOnClickListener(new C10900c(popupWindow));
        textView.setOnClickListener(new C10901d(popupWindow));
    }

    /* renamed from: b */
    public int mo7325b() {
        return m49824f() ? this.f29973d.size() + 1 : this.f29973d.size();
    }

    /* renamed from: a */
    public static Rect m49817a(View view) {
        int[] iArr = new int[2];
        Rect rect = null;
        if (view == null) {
            return null;
        }
        try {
            view.getLocationOnScreen(iArr);
            rect = new Rect();
            rect.left = iArr[0];
            rect.top = iArr[1];
            rect.right = rect.left + view.getWidth();
            rect.bottom = rect.top + view.getHeight();
        } catch (NullPointerException unused) {
        }
        return rect;
    }

    /* renamed from: a */
    private void m49820a(C10904g gVar, int i) {
        this.f29977h.mo23582b(gVar.f29989s0);
        gVar.f6294a.setOnClickListener(new C10902e(i));
    }

    /* renamed from: a */
    public void mo38529a(C10907j jVar) {
        this.f29974e = jVar;
    }

    /* renamed from: a */
    public void mo38528a(C10903f fVar) {
        this.f29975f = fVar;
    }

    /* renamed from: a */
    public void mo38527a(PaymentListBean paymentListBean) {
        this.f29978i = paymentListBean;
    }
}
