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
import com.mrsool.bean.PaymentListBean;
import com.mrsool.utils.C5887x;
import java.util.ArrayList;
import java.util.List;
import p076c.p082c.p083a.C2232l;

/* renamed from: com.mrsool.me.i */
/* compiled from: PaymentMethodsAdapter */
public class C10926i extends C1638g {

    /* renamed from: c */
    private Context f30076c;

    /* renamed from: d */
    private List<PaymentListBean> f30077d = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C10936j f30078e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C10933g f30079f;

    /* renamed from: g */
    private String f30080g = "";

    /* renamed from: h */
    private C5887x f30081h;

    /* renamed from: i */
    private int f30082i = -1;

    /* renamed from: com.mrsool.me.i$a */
    /* compiled from: PaymentMethodsAdapter */
    class C10927a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C10935i f30083a;

        C10927a(C10935i iVar) {
            this.f30083a = iVar;
        }

        public void onClick(View view) {
            if (C10926i.this.f30079f != null) {
                C10926i.this.f30079f.mo38561a(this.f30083a.mo7273f());
            }
        }
    }

    /* renamed from: com.mrsool.me.i$b */
    /* compiled from: PaymentMethodsAdapter */
    class C10928b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ int f30085a;

        C10928b(int i) {
            this.f30085a = i;
        }

        public void onClick(View view) {
            if (C10926i.this.f30078e != null) {
                C10926i.this.f30078e.mo38489a(this.f30085a);
            }
        }
    }

    /* renamed from: com.mrsool.me.i$c */
    /* compiled from: PaymentMethodsAdapter */
    class C10929c implements OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ PopupWindow f30087a;

        C10929c(PopupWindow popupWindow) {
            this.f30087a = popupWindow;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() != 4) {
                return false;
            }
            this.f30087a.dismiss();
            return true;
        }
    }

    /* renamed from: com.mrsool.me.i$d */
    /* compiled from: PaymentMethodsAdapter */
    class C10930d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PopupWindow f30089a;

        C10930d(PopupWindow popupWindow) {
            this.f30089a = popupWindow;
        }

        public void onClick(View view) {
            this.f30089a.dismiss();
        }
    }

    /* renamed from: com.mrsool.me.i$e */
    /* compiled from: PaymentMethodsAdapter */
    class C10931e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PopupWindow f30091a;

        C10931e(PopupWindow popupWindow) {
            this.f30091a = popupWindow;
        }

        public void onClick(View view) {
            this.f30091a.dismiss();
        }
    }

    /* renamed from: com.mrsool.me.i$f */
    /* compiled from: PaymentMethodsAdapter */
    class C10932f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ int f30093a;

        C10932f(int i) {
            this.f30093a = i;
        }

        public void onClick(View view) {
            if (C10926i.this.f30078e != null) {
                C10926i.this.f30078e.mo38489a(this.f30093a);
            }
        }
    }

    /* renamed from: com.mrsool.me.i$g */
    /* compiled from: PaymentMethodsAdapter */
    public interface C10933g {
        /* renamed from: a */
        void mo38561a(int i);
    }

    /* renamed from: com.mrsool.me.i$h */
    /* compiled from: PaymentMethodsAdapter */
    private static class C10934h extends C1635d0 {
        C10934h(View view) {
            super(view);
        }
    }

    /* renamed from: com.mrsool.me.i$i */
    /* compiled from: PaymentMethodsAdapter */
    public static class C10935i extends C1635d0 {

        /* renamed from: s0 */
        TextView f30095s0;

        /* renamed from: t0 */
        TextView f30096t0;

        /* renamed from: u0 */
        ImageView f30097u0;

        /* renamed from: v0 */
        ImageView f30098v0;

        /* renamed from: w0 */
        LinearLayout f30099w0;

        /* renamed from: x0 */
        LinearLayout f30100x0;

        /* renamed from: y0 */
        LinearLayout f30101y0;

        /* renamed from: z0 */
        View f30102z0;

        public C10935i(View view) {
            super(view);
            this.f30095s0 = (TextView) view.findViewById(C10232R.C10236id.tvPaymentMethodName);
            this.f30100x0 = (LinearLayout) view.findViewById(C10232R.C10236id.llPayment);
            this.f30097u0 = (ImageView) view.findViewById(C10232R.C10236id.ivPaymentMethodIcon);
            this.f30098v0 = (ImageView) view.findViewById(C10232R.C10236id.ivPaymentMethodSelected);
            this.f30102z0 = view.findViewById(C10232R.C10236id.vDivider);
            this.f30099w0 = (LinearLayout) view.findViewById(C10232R.C10236id.llWarning);
            this.f30096t0 = (TextView) view.findViewById(C10232R.C10236id.tvDefault);
            this.f30101y0 = (LinearLayout) view.findViewById(C10232R.C10236id.llOptionMenu);
        }
    }

    /* renamed from: com.mrsool.me.i$j */
    /* compiled from: PaymentMethodsAdapter */
    public interface C10936j {
        /* renamed from: a */
        void mo38489a(int i);
    }

    /* renamed from: com.mrsool.me.i$k */
    /* compiled from: PaymentMethodsAdapter */
    class C10937k {

        /* renamed from: b */
        public static final int f30103b = 2;

        /* renamed from: c */
        public static final int f30104c = 3;

        C10937k() {
        }
    }

    public C10926i(List<PaymentListBean> list, Context context, String str) {
        this.f30076c = context;
        this.f30077d = list;
        this.f30080g = str;
        this.f30081h = new C5887x(this.f30076c);
    }

    /* renamed from: c */
    public int mo7333c(int i) {
        return ((PaymentListBean) this.f30077d.get(i)).getId() == null ? 3 : 2;
    }

    /* renamed from: f */
    public int mo38553f() {
        return this.f30082i;
    }

    /* renamed from: g */
    public void mo38554g(int i) {
        this.f30082i = i;
    }

    /* renamed from: a */
    private void m49895a(C10935i iVar, int i) {
        PaymentListBean paymentListBean = (PaymentListBean) this.f30077d.get(i);
        C2232l.m11649c(this.f30076c).mo9515a(paymentListBean.getPaymentIconUrl()).m11500e((int) C10232R.C10235drawable.img_payment_placeholder).mo9424a(iVar.f30097u0);
        iVar.f30095s0.setText(paymentListBean.getName());
        String str = "cash";
        int i2 = 8;
        if (this.f30080g.equalsIgnoreCase("selectPaymentScreen")) {
            iVar.f30098v0.setVisibility(0);
            iVar.f30101y0.setVisibility(8);
            if (paymentListBean.isActivated()) {
                iVar.f30098v0.setImageResource(C10232R.C10235drawable.ic_tick_sky_blue);
            } else {
                iVar.f30098v0.setImageResource(0);
            }
        } else if (this.f30080g.equalsIgnoreCase("configurePaymentGateway")) {
            iVar.f30098v0.setVisibility(8);
            if (paymentListBean.getCode() == null || !paymentListBean.getCode().equalsIgnoreCase(str)) {
                iVar.f30101y0.setVisibility(0);
                iVar.f30101y0.setOnClickListener(new C10927a(iVar));
            } else {
                iVar.f30101y0.setVisibility(8);
            }
            TextView textView = iVar.f30096t0;
            if (i == this.f30082i) {
                i2 = 0;
            }
            textView.setVisibility(i2);
        }
        iVar.f30100x0.setOnClickListener(new C10928b(i));
        if (paymentListBean.getCode() == null || !paymentListBean.getCode().equalsIgnoreCase(str)) {
            iVar.f30100x0.setEnabled(true);
        } else {
            iVar.f30100x0.setEnabled(false);
        }
    }

    /* renamed from: b */
    public C1635d0 mo7327b(ViewGroup viewGroup, int i) {
        if (i != 3) {
            return new C10935i(LayoutInflater.from(viewGroup.getContext()).inflate(C10232R.layout.row_payment_method_revised, viewGroup, false));
        }
        return new C10934h(LayoutInflater.from(viewGroup.getContext()).inflate(C10232R.layout.row_payment_method_revised_footer, viewGroup, false));
    }

    /* renamed from: b */
    public void mo7330b(C1635d0 d0Var, int i) {
        if (d0Var instanceof C10935i) {
            m49895a((C10935i) d0Var, i);
        }
        if (d0Var instanceof C10934h) {
            m49894a((C10934h) d0Var, i);
        }
    }

    /* renamed from: b */
    public int mo7325b() {
        List<PaymentListBean> list = this.f30077d;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* renamed from: a */
    private void m49893a(View view, int i) {
        Context context = view.getContext();
        View inflate = LayoutInflater.from(context).inflate(C10232R.layout.layout_popup_payment_options, null);
        PopupWindow popupWindow = new PopupWindow(inflate, -2, -2);
        Rect a = m49891a(view);
        popupWindow.showAtLocation(view, 51, a.left, a.bottom - C5887x.m25794a(42, context));
        popupWindow.setOutsideTouchable(true);
        popupWindow.setTouchable(true);
        popupWindow.setFocusable(true);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        popupWindow.setOutsideTouchable(true);
        popupWindow.setBackgroundDrawable(new ShapeDrawable());
        popupWindow.setTouchInterceptor(new C10929c(popupWindow));
        TextView textView = (TextView) inflate.findViewById(C10232R.C10236id.tvCardError);
        ((LinearLayout) inflate.findViewById(C10232R.C10236id.llMarkDefault)).setOnClickListener(new C10930d(popupWindow));
        textView.setOnClickListener(new C10931e(popupWindow));
    }

    /* renamed from: a */
    public static Rect m49891a(View view) {
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
    private void m49894a(C10934h hVar, int i) {
        hVar.f6294a.setOnClickListener(new C10932f(i));
    }

    /* renamed from: a */
    public void mo38552a(C10936j jVar) {
        this.f30078e = jVar;
    }

    /* renamed from: a */
    public void mo38551a(C10933g gVar) {
        this.f30079f = gVar;
    }
}
