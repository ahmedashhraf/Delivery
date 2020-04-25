package com.mrsool.order;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.drawable.C0894c;
import androidx.core.graphics.drawable.C0895d;
import androidx.recyclerview.widget.RecyclerView.C1635d0;
import androidx.recyclerview.widget.RecyclerView.C1638g;
import com.fasterxml.jackson.core.p162w.C3868i;
import com.mrsool.C10232R;
import com.mrsool.bean.MyOrdersInactive;
import com.mrsool.p418u.C11558b;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import p076c.p082c.p083a.C2232l;
import p076c.p082c.p083a.p108y.p110j.C2550c;

/* renamed from: com.mrsool.order.k */
/* compiled from: MyInActiveDeliveriesAdapter */
public class C11023k extends C1638g<C11028e> {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Context f30458c;

    /* renamed from: d */
    private List<MyOrdersInactive> f30459d = new ArrayList();

    /* renamed from: e */
    public C11558b f30460e;

    /* renamed from: com.mrsool.order.k$a */
    /* compiled from: MyInActiveDeliveriesAdapter */
    class C11024a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C11028e f30461a;

        C11024a(C11028e eVar) {
            this.f30461a = eVar;
        }

        public void onClick(View view) {
            C11023k.this.f30460e.mo38773a(this.f30461a.mo7273f());
        }
    }

    /* renamed from: com.mrsool.order.k$b */
    /* compiled from: MyInActiveDeliveriesAdapter */
    class C11025b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C11028e f30463a;

        C11025b(C11028e eVar) {
            this.f30463a = eVar;
        }

        public void onClick(View view) {
            C11023k.this.f30460e.mo38773a(this.f30463a.mo7273f());
        }
    }

    /* renamed from: com.mrsool.order.k$c */
    /* compiled from: MyInActiveDeliveriesAdapter */
    class C11026c extends C2550c {

        /* renamed from: R */
        final /* synthetic */ C11028e f30465R;

        C11026c(ImageView imageView, C11028e eVar) {
            this.f30465R = eVar;
            super(imageView);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10023a(Bitmap bitmap) {
            C0894c a = C0895d.m5185a(C11023k.this.f30458c.getResources(), bitmap);
            a.mo4601b(true);
            this.f30465R.f30470B0.setImageDrawable(a);
        }
    }

    /* renamed from: com.mrsool.order.k$d */
    /* compiled from: MyInActiveDeliveriesAdapter */
    class C11027d extends C2550c {

        /* renamed from: R */
        final /* synthetic */ C11028e f30467R;

        C11027d(ImageView imageView, C11028e eVar) {
            this.f30467R = eVar;
            super(imageView);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10023a(Bitmap bitmap) {
            C0894c a = C0895d.m5185a(C11023k.this.f30458c.getResources(), bitmap);
            a.mo4601b(true);
            this.f30467R.f30470B0.setImageDrawable(a);
        }
    }

    /* renamed from: com.mrsool.order.k$e */
    /* compiled from: MyInActiveDeliveriesAdapter */
    public static class C11028e extends C1635d0 {

        /* renamed from: A0 */
        ImageView f30469A0;

        /* renamed from: B0 */
        ImageView f30470B0;

        /* renamed from: C0 */
        ImageView f30471C0;

        /* renamed from: D0 */
        ImageView f30472D0;

        /* renamed from: E0 */
        ImageView f30473E0;

        /* renamed from: F0 */
        ImageView f30474F0;

        /* renamed from: G0 */
        CardView f30475G0;

        /* renamed from: H0 */
        LinearLayout f30476H0;

        /* renamed from: I0 */
        FrameLayout f30477I0;

        /* renamed from: s0 */
        TextView f30478s0;

        /* renamed from: t0 */
        TextView f30479t0;

        /* renamed from: u0 */
        TextView f30480u0;

        /* renamed from: v0 */
        TextView f30481v0;

        /* renamed from: w0 */
        TextView f30482w0;

        /* renamed from: x0 */
        TextView f30483x0;

        /* renamed from: y0 */
        TextView f30484y0;

        /* renamed from: z0 */
        TextView f30485z0;

        public C11028e(View view) {
            super(view);
            this.f30478s0 = (TextView) view.findViewById(C10232R.C10236id.txtrow1);
            this.f30479t0 = (TextView) view.findViewById(C10232R.C10236id.txtrow12);
            this.f30480u0 = (TextView) view.findViewById(C10232R.C10236id.txtrow2);
            this.f30481v0 = (TextView) view.findViewById(C10232R.C10236id.txtrow3);
            this.f30482w0 = (TextView) view.findViewById(C10232R.C10236id.txtrow31);
            this.f30483x0 = (TextView) view.findViewById(C10232R.C10236id.txtrow4);
            this.f30484y0 = (TextView) view.findViewById(C10232R.C10236id.txtrow5);
            this.f30469A0 = (ImageView) view.findViewById(C10232R.C10236id.imgBig);
            this.f30470B0 = (ImageView) view.findViewById(C10232R.C10236id.imgSmall);
            this.f30471C0 = (ImageView) view.findViewById(C10232R.C10236id.imgrow2);
            this.f30472D0 = (ImageView) view.findViewById(C10232R.C10236id.imgrow3);
            this.f30473E0 = (ImageView) view.findViewById(C10232R.C10236id.imgrow4);
            this.f30475G0 = (CardView) view.findViewById(C10232R.C10236id.cvShops);
            this.f30476H0 = (LinearLayout) view.findViewById(C10232R.C10236id.llContent);
            this.f30474F0 = (ImageView) view.findViewById(C10232R.C10236id.ivLiveGlowing);
            this.f30477I0 = (FrameLayout) view.findViewById(C10232R.C10236id.layOrderUnreadMsg);
            this.f30485z0 = (TextView) view.findViewById(C10232R.C10236id.txtOrderUnreadMsg);
        }
    }

    public C11023k(List<MyOrdersInactive> list, Context context) {
        this.f30458c = context;
        this.f30459d = list;
    }

    /* renamed from: f */
    public C11558b mo38782f() {
        return this.f30460e;
    }

    /* renamed from: a */
    public void mo38781a(C11558b bVar) {
        this.f30460e = bVar;
    }

    /* renamed from: a */
    public void mo7330b(C11028e eVar, int i) {
        eVar.f30478s0.setText(((MyOrdersInactive) this.f30459d.get(eVar.mo7273f())).getVShopName().toString());
        TextView textView = eVar.f30479t0;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f30458c.getString(C10232R.string.lbl_no_numbers));
        sb.append(". ");
        sb.append(((MyOrdersInactive) this.f30459d.get(eVar.mo7273f())).getIOrderId());
        textView.setText(sb.toString());
        TextView textView2 = eVar.f30481v0;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.valueOf(((MyOrdersInactive) this.f30459d.get(eVar.mo7273f())).getDistance()));
        sb2.append(this.f30458c.getResources().getString(C10232R.string.lbl_distance));
        textView2.setText(sb2.toString());
        eVar.f30481v0.setTypeface(null, 0);
        eVar.f30481v0.setTextColor(Color.parseColor("#999999"));
        eVar.f30474F0.setVisibility(8);
        eVar.f30475G0.setOnClickListener(new C11024a(eVar));
        eVar.f30476H0.setOnClickListener(new C11025b(eVar));
        String str = "-";
        eVar.f30480u0.setText(str);
        TextView textView3 = eVar.f30482w0;
        StringBuilder sb3 = new StringBuilder();
        String str2 = "";
        sb3.append(str2);
        sb3.append(((MyOrdersInactive) this.f30459d.get(eVar.mo7273f())).getOrderStatus());
        textView3.setText(sb3.toString());
        TextView textView4 = eVar.f30482w0;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(str2);
        sb4.append(((MyOrdersInactive) this.f30459d.get(eVar.mo7273f())).getStatus_color());
        textView4.setTextColor(Color.parseColor(sb4.toString()));
        if (((MyOrdersInactive) this.f30459d.get(eVar.mo7273f())).getVBuyerFullName() == null || ((MyOrdersInactive) this.f30459d.get(eVar.mo7273f())).getVBuyerFullName().length() <= 0) {
            eVar.f30483x0.setText(str);
        } else if (((MyOrdersInactive) this.f30459d.get(eVar.mo7273f())).getVBuyerFullName().length() == 1) {
            eVar.f30483x0.setText(((MyOrdersInactive) this.f30459d.get(eVar.mo7273f())).getVBuyerFullName());
        } else {
            String substring = ((MyOrdersInactive) this.f30459d.get(eVar.mo7273f())).getVBuyerFullName().substring(0, 2);
            String substring2 = ((MyOrdersInactive) this.f30459d.get(eVar.mo7273f())).getVBuyerFullName().substring(((MyOrdersInactive) this.f30459d.get(eVar.mo7273f())).getVBuyerFullName().length() - 1, ((MyOrdersInactive) this.f30459d.get(eVar.mo7273f())).getVBuyerFullName().length());
            TextView textView5 = eVar.f30483x0;
            StringBuilder sb5 = new StringBuilder();
            sb5.append(substring);
            sb5.append("**");
            sb5.append(substring2);
            textView5.setText(sb5.toString());
        }
        if (((MyOrdersInactive) this.f30459d.get(eVar.mo7273f())).getUnread() == null || ((MyOrdersInactive) this.f30459d.get(eVar.mo7273f())).getUnread().intValue() != 0 || ((MyOrdersInactive) this.f30459d.get(eVar.mo7273f())).getOtherOrderStatus() == null || ((MyOrdersInactive) this.f30459d.get(eVar.mo7273f())).getOtherOrderStatus().length() <= 0) {
            int intValue = ((MyOrdersInactive) this.f30459d.get(eVar.mo7273f())).getUnread().intValue();
            String str3 = C3868i.f12248b;
            if (intValue == 1) {
                TextView textView6 = eVar.f30484y0;
                StringBuilder sb6 = new StringBuilder();
                sb6.append(((MyOrdersInactive) this.f30459d.get(eVar.mo7273f())).getUnread());
                sb6.append(str3);
                sb6.append(this.f30458c.getString(C10232R.string.lbl_message));
                textView6.setText(sb6.toString());
                eVar.f30484y0.setVisibility(0);
                eVar.f30485z0.setText(String.valueOf(((MyOrdersInactive) this.f30459d.get(eVar.mo7273f())).getUnread()));
                eVar.f30477I0.setVisibility(0);
            } else if (((MyOrdersInactive) this.f30459d.get(eVar.mo7273f())).getUnread().intValue() > 1) {
                TextView textView7 = eVar.f30484y0;
                StringBuilder sb7 = new StringBuilder();
                sb7.append(((MyOrdersInactive) this.f30459d.get(eVar.mo7273f())).getUnread());
                sb7.append(str3);
                sb7.append(this.f30458c.getString(C10232R.string.lbl_messages));
                textView7.setText(sb7.toString());
                eVar.f30484y0.setVisibility(0);
                eVar.f30485z0.setText(String.valueOf(((MyOrdersInactive) this.f30459d.get(eVar.mo7273f())).getUnread()));
                eVar.f30477I0.setVisibility(0);
            } else if (((MyOrdersInactive) this.f30459d.get(eVar.mo7273f())).getUnread().intValue() == 0 && ((MyOrdersInactive) this.f30459d.get(eVar.mo7273f())).getOtherOrderStatus() == null && ((MyOrdersInactive) this.f30459d.get(eVar.mo7273f())).getOtherOrderStatus().length() == 0) {
                eVar.f30484y0.setVisibility(8);
                eVar.f30485z0.setText(str2);
                eVar.f30477I0.setVisibility(8);
            } else {
                eVar.f30484y0.setVisibility(8);
                eVar.f30485z0.setText(str2);
                eVar.f30477I0.setVisibility(8);
            }
        } else {
            TextView textView8 = eVar.f30484y0;
            if (((MyOrdersInactive) this.f30459d.get(eVar.mo7273f())).getOtherOrderStatus() != null) {
                str2 = ((MyOrdersInactive) this.f30459d.get(eVar.mo7273f())).getOtherOrderStatus();
            }
            textView8.setText(str2);
            eVar.f30484y0.setVisibility(0);
        }
        if (((MyOrdersInactive) this.f30459d.get(eVar.mo7273f())).getVBuyerProfilePic().contains("no_courier")) {
            C0894c a = C0895d.m5185a(this.f30458c.getResources(), BitmapFactory.decodeResource(this.f30458c.getResources(), C10232R.C10235drawable.icon_mo_ac_big_que));
            a.mo4601b(true);
            eVar.f30469A0.setImageDrawable(a);
        } else {
            C2232l.m11649c(this.f30458c.getApplicationContext()).mo9515a(((MyOrdersInactive) this.f30459d.get(eVar.mo7273f())).getVBuyerProfilePic()).mo9441j().m11415e((int) C10232R.C10235drawable.icon_mo_ac_big_user).m11411d().mo9458b(new C11026c(eVar.f30469A0, eVar));
        }
        C2232l.m11649c(this.f30458c.getApplicationContext()).mo9511a(new File(((MyOrdersInactive) this.f30459d.get(eVar.mo7273f())).getVShopPic())).mo9441j().m11415e((int) C10232R.C10235drawable.icon_mo_ac_small_shop).m11411d().mo9458b(new C11027d(eVar.f30470B0, eVar));
        eVar.f30471C0.setImageResource(C10232R.C10235drawable.icon_mo_timer);
        eVar.f30472D0.setImageResource(C10232R.C10235drawable.icon_mo_pin);
        eVar.f30473E0.setImageResource(C10232R.C10235drawable.icon_mo_user);
    }

    /* renamed from: b */
    public C11028e m50167b(ViewGroup viewGroup, int i) {
        return new C11028e(LayoutInflater.from(viewGroup.getContext()).inflate(C10232R.layout.row_my_orders, viewGroup, false));
    }

    /* renamed from: b */
    public int mo7325b() {
        return this.f30459d.size();
    }
}
