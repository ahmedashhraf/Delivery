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
import androidx.core.content.C0841b;
import androidx.core.graphics.drawable.C0894c;
import androidx.core.graphics.drawable.C0895d;
import androidx.recyclerview.widget.RecyclerView.C1635d0;
import androidx.recyclerview.widget.RecyclerView.C1638g;
import com.facebook.places.model.PlaceFields;
import com.fasterxml.jackson.core.p162w.C3868i;
import com.mrsool.C10232R;
import com.mrsool.bean.MyOrdersActive;
import com.mrsool.p418u.C11558b;
import com.skyfishjy.library.RippleBackground;
import java.util.ArrayList;
import java.util.List;
import p076c.p082c.p083a.C2232l;
import p076c.p082c.p083a.p108y.p110j.C2550c;

/* renamed from: com.mrsool.order.h */
/* compiled from: MyActiveDeliveriesAdapter */
public class C10996h extends C1638g<C11001e> {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Context f30359c;

    /* renamed from: d */
    private List<MyOrdersActive> f30360d = new ArrayList();

    /* renamed from: e */
    public C11558b f30361e;

    /* renamed from: com.mrsool.order.h$a */
    /* compiled from: MyActiveDeliveriesAdapter */
    class C10997a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C11001e f30362a;

        C10997a(C11001e eVar) {
            this.f30362a = eVar;
        }

        public void onClick(View view) {
            C10996h.this.f30361e.mo38773a(this.f30362a.mo7273f());
        }
    }

    /* renamed from: com.mrsool.order.h$b */
    /* compiled from: MyActiveDeliveriesAdapter */
    class C10998b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C11001e f30364a;

        C10998b(C11001e eVar) {
            this.f30364a = eVar;
        }

        public void onClick(View view) {
            C10996h.this.f30361e.mo38773a(this.f30364a.mo7273f());
        }
    }

    /* renamed from: com.mrsool.order.h$c */
    /* compiled from: MyActiveDeliveriesAdapter */
    class C10999c extends C2550c {

        /* renamed from: R */
        final /* synthetic */ C11001e f30366R;

        C10999c(ImageView imageView, C11001e eVar) {
            this.f30366R = eVar;
            super(imageView);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10023a(Bitmap bitmap) {
            C0894c a = C0895d.m5185a(C10996h.this.f30359c.getResources(), bitmap);
            a.mo4601b(true);
            this.f30366R.f30370A0.setImageDrawable(a);
        }
    }

    /* renamed from: com.mrsool.order.h$d */
    /* compiled from: MyActiveDeliveriesAdapter */
    class C11000d extends C2550c {

        /* renamed from: R */
        final /* synthetic */ C11001e f30368R;

        C11000d(ImageView imageView, C11001e eVar) {
            this.f30368R = eVar;
            super(imageView);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10023a(Bitmap bitmap) {
            C0894c a = C0895d.m5185a(C10996h.this.f30359c.getResources(), bitmap);
            a.mo4601b(true);
            this.f30368R.f30371B0.setImageDrawable(a);
        }
    }

    /* renamed from: com.mrsool.order.h$e */
    /* compiled from: MyActiveDeliveriesAdapter */
    public static class C11001e extends C1635d0 {

        /* renamed from: A0 */
        ImageView f30370A0;

        /* renamed from: B0 */
        ImageView f30371B0;

        /* renamed from: C0 */
        ImageView f30372C0;

        /* renamed from: D0 */
        ImageView f30373D0;

        /* renamed from: E0 */
        ImageView f30374E0;

        /* renamed from: F0 */
        ImageView f30375F0;

        /* renamed from: G0 */
        CardView f30376G0;

        /* renamed from: H0 */
        LinearLayout f30377H0;

        /* renamed from: I0 */
        FrameLayout f30378I0;

        /* renamed from: J0 */
        RippleBackground f30379J0;

        /* renamed from: s0 */
        TextView f30380s0;

        /* renamed from: t0 */
        TextView f30381t0;

        /* renamed from: u0 */
        TextView f30382u0;

        /* renamed from: v0 */
        TextView f30383v0;

        /* renamed from: w0 */
        TextView f30384w0;

        /* renamed from: x0 */
        TextView f30385x0;

        /* renamed from: y0 */
        TextView f30386y0;

        /* renamed from: z0 */
        TextView f30387z0;

        public C11001e(View view) {
            super(view);
            this.f30380s0 = (TextView) view.findViewById(C10232R.C10236id.txtrow1);
            this.f30381t0 = (TextView) view.findViewById(C10232R.C10236id.txtrow12);
            this.f30382u0 = (TextView) view.findViewById(C10232R.C10236id.txtrow2);
            this.f30383v0 = (TextView) view.findViewById(C10232R.C10236id.txtrow3);
            this.f30384w0 = (TextView) view.findViewById(C10232R.C10236id.txtrow31);
            this.f30385x0 = (TextView) view.findViewById(C10232R.C10236id.txtrow4);
            this.f30386y0 = (TextView) view.findViewById(C10232R.C10236id.txtrow5);
            this.f30370A0 = (ImageView) view.findViewById(C10232R.C10236id.imgBig);
            this.f30371B0 = (ImageView) view.findViewById(C10232R.C10236id.imgSmall);
            this.f30372C0 = (ImageView) view.findViewById(C10232R.C10236id.imgrow2);
            this.f30373D0 = (ImageView) view.findViewById(C10232R.C10236id.imgrow3);
            this.f30374E0 = (ImageView) view.findViewById(C10232R.C10236id.imgrow4);
            this.f30376G0 = (CardView) view.findViewById(C10232R.C10236id.cvShops);
            this.f30377H0 = (LinearLayout) view.findViewById(C10232R.C10236id.llContent);
            this.f30375F0 = (ImageView) view.findViewById(C10232R.C10236id.ivLiveGlowing);
            this.f30378I0 = (FrameLayout) view.findViewById(C10232R.C10236id.layOrderUnreadMsg);
            this.f30387z0 = (TextView) view.findViewById(C10232R.C10236id.txtOrderUnreadMsg);
            this.f30379J0 = (RippleBackground) view.findViewById(C10232R.C10236id.rippleUserBg);
        }
    }

    public C10996h(List<MyOrdersActive> list, Context context) {
        this.f30359c = context;
        this.f30360d = list;
    }

    /* renamed from: f */
    public C11558b mo38761f() {
        return this.f30361e;
    }

    /* renamed from: a */
    public void mo38760a(C11558b bVar) {
        this.f30361e = bVar;
    }

    /* renamed from: a */
    public void mo7330b(C11001e eVar, int i) {
        if (((MyOrdersActive) this.f30360d.get(eVar.mo7273f())).isTrack_order() || ((MyOrdersActive) this.f30360d.get(eVar.mo7273f())).isAutostart_tracking()) {
            eVar.f30375F0.setVisibility(8);
            eVar.f30379J0.mo41218b();
        } else {
            eVar.f30379J0.mo41219c();
            eVar.f30375F0.setVisibility(8);
        }
        eVar.f30380s0.setText(((MyOrdersActive) this.f30360d.get(eVar.mo7273f())).getVShopName().toString());
        TextView textView = eVar.f30381t0;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f30359c.getString(C10232R.string.lbl_no_numbers));
        sb.append(". ");
        sb.append(((MyOrdersActive) this.f30360d.get(eVar.mo7273f())).getIOrderId());
        textView.setText(sb.toString());
        eVar.f30383v0.setTypeface(null, 0);
        eVar.f30383v0.setTextColor(Color.parseColor("#999999"));
        TextView textView2 = eVar.f30383v0;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.valueOf(((MyOrdersActive) this.f30360d.get(eVar.mo7273f())).getDistance()));
        sb2.append(this.f30359c.getResources().getString(C10232R.string.lbl_distance));
        textView2.setText(sb2.toString());
        eVar.f30376G0.setOnClickListener(new C10997a(eVar));
        eVar.f30377H0.setOnClickListener(new C10998b(eVar));
        String orderTimeStatus = ((MyOrdersActive) this.f30360d.get(eVar.mo7273f())).getOrderTimeStatus();
        String str = "within";
        String str2 = PlaceFields.ABOUT;
        String str3 = ": ";
        String str4 = "";
        if (orderTimeStatus == null || !((MyOrdersActive) this.f30360d.get(eVar.mo7273f())).getOrderTimeStatus().equalsIgnoreCase(this.f30359c.getString(C10232R.string.lbl_order_time_status_late))) {
            eVar.f30382u0.setTextColor(C0841b.m4915a(this.f30359c, (int) C10232R.C10234color.my_order_arrives_in));
            TextView textView3 = eVar.f30382u0;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.f30359c.getString(C10232R.string.lbl_arrives_in));
            sb3.append(str3);
            sb3.append(((MyOrdersActive) this.f30360d.get(eVar.mo7273f())).getDtOrderDateTime().toString().replace(str2, str4).replace(str, str4));
            textView3.setText(sb3.toString());
        } else {
            eVar.f30382u0.setTextColor(C0841b.m4915a(this.f30359c, (int) C10232R.C10234color.my_order_arrives_late));
            TextView textView4 = eVar.f30382u0;
            StringBuilder sb4 = new StringBuilder();
            sb4.append(this.f30359c.getString(C10232R.string.lbl_arrives_late));
            sb4.append(str3);
            sb4.append(((MyOrdersActive) this.f30360d.get(eVar.mo7273f())).getDtOrderDateTime().toString().replace(str2, str4).replace(str, str4));
            textView4.setText(sb4.toString());
        }
        TextView textView5 = eVar.f30384w0;
        StringBuilder sb5 = new StringBuilder();
        sb5.append(str4);
        sb5.append(((MyOrdersActive) this.f30360d.get(eVar.mo7273f())).getOrderStatus());
        textView5.setText(sb5.toString());
        TextView textView6 = eVar.f30384w0;
        StringBuilder sb6 = new StringBuilder();
        sb6.append(str4);
        sb6.append(((MyOrdersActive) this.f30360d.get(eVar.mo7273f())).getStatus_color());
        textView6.setTextColor(Color.parseColor(sb6.toString()));
        if (((MyOrdersActive) this.f30360d.get(eVar.mo7273f())).getVBuyerFullName() == null || ((MyOrdersActive) this.f30360d.get(eVar.mo7273f())).getVBuyerFullName().length() <= 0) {
            eVar.f30385x0.setText("-");
        } else if (((MyOrdersActive) this.f30360d.get(eVar.mo7273f())).getVBuyerFullName().length() == 1) {
            eVar.f30385x0.setText(((MyOrdersActive) this.f30360d.get(eVar.mo7273f())).getVBuyerFullName());
        } else {
            String substring = ((MyOrdersActive) this.f30360d.get(eVar.mo7273f())).getVBuyerFullName().substring(0, 2);
            String substring2 = ((MyOrdersActive) this.f30360d.get(eVar.mo7273f())).getVBuyerFullName().substring(((MyOrdersActive) this.f30360d.get(eVar.mo7273f())).getVBuyerFullName().length() - 1, ((MyOrdersActive) this.f30360d.get(eVar.mo7273f())).getVBuyerFullName().length());
            TextView textView7 = eVar.f30385x0;
            StringBuilder sb7 = new StringBuilder();
            sb7.append(substring);
            sb7.append("**");
            sb7.append(substring2);
            textView7.setText(sb7.toString());
        }
        if (((MyOrdersActive) this.f30360d.get(eVar.mo7273f())).getUnread() == null || ((MyOrdersActive) this.f30360d.get(eVar.mo7273f())).getUnread().intValue() != 0 || ((MyOrdersActive) this.f30360d.get(eVar.mo7273f())).getOtherOrderStatus() == null || ((MyOrdersActive) this.f30360d.get(eVar.mo7273f())).getOtherOrderStatus().length() <= 0) {
            int intValue = ((MyOrdersActive) this.f30360d.get(eVar.mo7273f())).getUnread().intValue();
            String str5 = C3868i.f12248b;
            if (intValue == 1) {
                TextView textView8 = eVar.f30386y0;
                StringBuilder sb8 = new StringBuilder();
                sb8.append(((MyOrdersActive) this.f30360d.get(eVar.mo7273f())).getUnread());
                sb8.append(str5);
                sb8.append(this.f30359c.getString(C10232R.string.lbl_message));
                textView8.setText(sb8.toString());
                eVar.f30386y0.setVisibility(0);
                eVar.f30387z0.setText(String.valueOf(((MyOrdersActive) this.f30360d.get(eVar.mo7273f())).getUnread()));
                eVar.f30378I0.setVisibility(0);
            } else if (((MyOrdersActive) this.f30360d.get(eVar.mo7273f())).getUnread().intValue() > 1) {
                TextView textView9 = eVar.f30386y0;
                StringBuilder sb9 = new StringBuilder();
                sb9.append(((MyOrdersActive) this.f30360d.get(eVar.mo7273f())).getUnread());
                sb9.append(str5);
                sb9.append(this.f30359c.getString(C10232R.string.lbl_messages));
                textView9.setText(sb9.toString());
                eVar.f30386y0.setVisibility(0);
                eVar.f30387z0.setText(String.valueOf(((MyOrdersActive) this.f30360d.get(eVar.mo7273f())).getUnread()));
                eVar.f30378I0.setVisibility(0);
            } else if (((MyOrdersActive) this.f30360d.get(eVar.mo7273f())).getUnread().intValue() == 0 && ((MyOrdersActive) this.f30360d.get(eVar.mo7273f())).getOtherOrderStatus() == null && ((MyOrdersActive) this.f30360d.get(eVar.mo7273f())).getOtherOrderStatus().length() == 0) {
                eVar.f30386y0.setVisibility(8);
                eVar.f30387z0.setText(str4);
                eVar.f30378I0.setVisibility(8);
            } else {
                eVar.f30386y0.setVisibility(8);
                eVar.f30387z0.setText(str4);
                eVar.f30378I0.setVisibility(8);
            }
        } else {
            TextView textView10 = eVar.f30386y0;
            if (((MyOrdersActive) this.f30360d.get(eVar.mo7273f())).getOtherOrderStatus() != null) {
                str4 = ((MyOrdersActive) this.f30360d.get(eVar.mo7273f())).getOtherOrderStatus();
            }
            textView10.setText(str4);
            eVar.f30386y0.setVisibility(0);
            eVar.f30378I0.setVisibility(8);
        }
        if (((MyOrdersActive) this.f30360d.get(eVar.mo7273f())).getVBuyerProfilePic().contains("no_courier")) {
            C0894c a = C0895d.m5185a(this.f30359c.getResources(), BitmapFactory.decodeResource(this.f30359c.getResources(), C10232R.C10235drawable.icon_mo_ac_big_que));
            a.mo4601b(true);
            eVar.f30370A0.setImageDrawable(a);
        } else {
            C2232l.m11649c(this.f30359c.getApplicationContext()).mo9515a(((MyOrdersActive) this.f30360d.get(eVar.mo7273f())).getVBuyerProfilePic()).mo9441j().m11415e((int) C10232R.C10235drawable.icon_mo_ac_big_user).m11411d().mo9458b(new C10999c(eVar.f30370A0, eVar));
        }
        C2232l.m11649c(this.f30359c.getApplicationContext()).mo9515a(((MyOrdersActive) this.f30360d.get(eVar.mo7273f())).getVShopPic()).mo9441j().m11415e((int) C10232R.C10235drawable.icon_mo_ac_small_shop).m11411d().mo9458b(new C11000d(eVar.f30371B0, eVar));
        eVar.f30372C0.setImageResource(C10232R.C10235drawable.icon_mo_timer);
        eVar.f30373D0.setImageResource(C10232R.C10235drawable.icon_mo_pin);
        eVar.f30374E0.setImageResource(C10232R.C10235drawable.icon_mo_user);
    }

    /* renamed from: b */
    public C11001e m50114b(ViewGroup viewGroup, int i) {
        return new C11001e(LayoutInflater.from(viewGroup.getContext()).inflate(C10232R.layout.row_my_orders, viewGroup, false));
    }

    /* renamed from: b */
    public int mo7325b() {
        return this.f30360d.size();
    }
}
