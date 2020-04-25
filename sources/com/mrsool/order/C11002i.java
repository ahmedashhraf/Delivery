package com.mrsool.order;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
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

/* renamed from: com.mrsool.order.i */
/* compiled from: MyActiveOrdersAdapter */
public class C11002i extends C1638g<C11006d> {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Context f30388c;

    /* renamed from: d */
    private List<MyOrdersActive> f30389d = new ArrayList();

    /* renamed from: e */
    public C11558b f30390e;

    /* renamed from: com.mrsool.order.i$a */
    /* compiled from: MyActiveOrdersAdapter */
    class C11003a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C11006d f30391a;

        C11003a(C11006d dVar) {
            this.f30391a = dVar;
        }

        public void onClick(View view) {
            C11002i.this.f30390e.mo38773a(this.f30391a.mo7273f());
        }
    }

    /* renamed from: com.mrsool.order.i$b */
    /* compiled from: MyActiveOrdersAdapter */
    class C11004b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C11006d f30393a;

        C11004b(C11006d dVar) {
            this.f30393a = dVar;
        }

        public void onClick(View view) {
            C11002i.this.f30390e.mo38773a(this.f30393a.mo7273f());
        }
    }

    /* renamed from: com.mrsool.order.i$c */
    /* compiled from: MyActiveOrdersAdapter */
    class C11005c extends C2550c {

        /* renamed from: R */
        final /* synthetic */ C11006d f30395R;

        C11005c(ImageView imageView, C11006d dVar) {
            this.f30395R = dVar;
            super(imageView);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10023a(Bitmap bitmap) {
            C0894c a = C0895d.m5185a(C11002i.this.f30388c.getResources(), bitmap);
            a.mo4601b(true);
            this.f30395R.f30398B0.setImageDrawable(a);
        }
    }

    /* renamed from: com.mrsool.order.i$d */
    /* compiled from: MyActiveOrdersAdapter */
    public static class C11006d extends C1635d0 {

        /* renamed from: A0 */
        ImageView f30397A0;

        /* renamed from: B0 */
        ImageView f30398B0;

        /* renamed from: C0 */
        ImageView f30399C0;

        /* renamed from: D0 */
        ImageView f30400D0;

        /* renamed from: E0 */
        ImageView f30401E0;

        /* renamed from: F0 */
        ImageView f30402F0;

        /* renamed from: G0 */
        LinearLayout f30403G0;

        /* renamed from: H0 */
        FrameLayout f30404H0;

        /* renamed from: I0 */
        CardView f30405I0;

        /* renamed from: J0 */
        RippleBackground f30406J0;

        /* renamed from: s0 */
        TextView f30407s0;

        /* renamed from: t0 */
        TextView f30408t0;

        /* renamed from: u0 */
        TextView f30409u0;

        /* renamed from: v0 */
        TextView f30410v0;

        /* renamed from: w0 */
        TextView f30411w0;

        /* renamed from: x0 */
        TextView f30412x0;

        /* renamed from: y0 */
        TextView f30413y0;

        /* renamed from: z0 */
        TextView f30414z0;

        public C11006d(View view) {
            super(view);
            this.f30407s0 = (TextView) view.findViewById(C10232R.C10236id.txtrow1);
            this.f30408t0 = (TextView) view.findViewById(C10232R.C10236id.txtrow12);
            this.f30409u0 = (TextView) view.findViewById(C10232R.C10236id.txtrow2);
            this.f30410v0 = (TextView) view.findViewById(C10232R.C10236id.txtrow3);
            this.f30411w0 = (TextView) view.findViewById(C10232R.C10236id.txtrow31);
            this.f30412x0 = (TextView) view.findViewById(C10232R.C10236id.txtrow4);
            this.f30413y0 = (TextView) view.findViewById(C10232R.C10236id.txtrow5);
            this.f30397A0 = (ImageView) view.findViewById(C10232R.C10236id.imgBig);
            this.f30398B0 = (ImageView) view.findViewById(C10232R.C10236id.imgSmall);
            this.f30399C0 = (ImageView) view.findViewById(C10232R.C10236id.imgrow2);
            this.f30400D0 = (ImageView) view.findViewById(C10232R.C10236id.imgrow3);
            this.f30401E0 = (ImageView) view.findViewById(C10232R.C10236id.imgrow4);
            this.f30402F0 = (ImageView) view.findViewById(C10232R.C10236id.ivLiveGlowing);
            this.f30403G0 = (LinearLayout) view.findViewById(C10232R.C10236id.llContent);
            this.f30404H0 = (FrameLayout) view.findViewById(C10232R.C10236id.layOrderUnreadMsg);
            this.f30414z0 = (TextView) view.findViewById(C10232R.C10236id.txtOrderUnreadMsg);
            this.f30405I0 = (CardView) view.findViewById(C10232R.C10236id.cvShops);
            this.f30406J0 = (RippleBackground) view.findViewById(C10232R.C10236id.rippleUserBg);
        }
    }

    public C11002i(List<MyOrdersActive> list, Context context) {
        this.f30388c = context;
        this.f30389d = list;
    }

    /* renamed from: f */
    public C11558b mo38766f() {
        return this.f30390e;
    }

    /* renamed from: a */
    public void mo38765a(C11558b bVar) {
        this.f30390e = bVar;
    }

    /* renamed from: a */
    public void mo7330b(C11006d dVar, int i) {
        if (((MyOrdersActive) this.f30389d.get(dVar.mo7273f())).isTrack_order()) {
            Animation loadAnimation = AnimationUtils.loadAnimation(this.f30388c, C10232R.anim.rotate);
            dVar.f30402F0.setVisibility(8);
            dVar.f30402F0.startAnimation(loadAnimation);
            dVar.f30406J0.mo41218b();
        } else {
            dVar.f30406J0.mo41219c();
            dVar.f30402F0.setVisibility(8);
        }
        dVar.f30407s0.setText(((MyOrdersActive) this.f30389d.get(dVar.mo7273f())).getVShopName().toString());
        TextView textView = dVar.f30408t0;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f30388c.getString(C10232R.string.lbl_no_numbers));
        sb.append(". ");
        sb.append(((MyOrdersActive) this.f30389d.get(dVar.mo7273f())).getIOrderId());
        textView.setText(sb.toString());
        dVar.f30410v0.setText(((MyOrdersActive) this.f30389d.get(dVar.mo7273f())).getTxOrderDescription().toString());
        dVar.f30405I0.setOnClickListener(new C11003a(dVar));
        dVar.f30403G0.setOnClickListener(new C11004b(dVar));
        String orderTimeStatus = ((MyOrdersActive) this.f30389d.get(dVar.mo7273f())).getOrderTimeStatus();
        String str = "within";
        String str2 = PlaceFields.ABOUT;
        String str3 = ": ";
        String str4 = "";
        if (orderTimeStatus == null || !((MyOrdersActive) this.f30389d.get(dVar.mo7273f())).getOrderTimeStatus().equalsIgnoreCase(this.f30388c.getString(C10232R.string.lbl_order_time_status_late))) {
            dVar.f30409u0.setTextColor(C0841b.m4915a(this.f30388c, (int) C10232R.C10234color.my_order_arrives_in));
            TextView textView2 = dVar.f30409u0;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f30388c.getString(C10232R.string.lbl_arrives_in));
            sb2.append(str3);
            sb2.append(((MyOrdersActive) this.f30389d.get(dVar.mo7273f())).getDtOrderDateTime().toString().replace(str2, str4).replace(str, str4));
            textView2.setText(sb2.toString());
        } else {
            dVar.f30409u0.setTextColor(C0841b.m4915a(this.f30388c, (int) C10232R.C10234color.my_order_arrives_late));
            TextView textView3 = dVar.f30409u0;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.f30388c.getString(C10232R.string.lbl_arrives_late));
            sb3.append(str3);
            sb3.append(((MyOrdersActive) this.f30389d.get(dVar.mo7273f())).getDtOrderDateTime().toString().replace(str2, str4).replace(str, str4));
            textView3.setText(sb3.toString());
        }
        TextView textView4 = dVar.f30411w0;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(str4);
        sb4.append(((MyOrdersActive) this.f30389d.get(dVar.mo7273f())).getOrderStatus());
        textView4.setText(sb4.toString());
        TextView textView5 = dVar.f30411w0;
        StringBuilder sb5 = new StringBuilder();
        sb5.append(str4);
        sb5.append(((MyOrdersActive) this.f30389d.get(dVar.mo7273f())).getStatus_color());
        textView5.setTextColor(Color.parseColor(sb5.toString()));
        if (((MyOrdersActive) this.f30389d.get(dVar.mo7273f())).getVBuyerFullName() == null || ((MyOrdersActive) this.f30389d.get(dVar.mo7273f())).getVBuyerFullName().length() <= 0) {
            dVar.f30412x0.setText("-");
        } else if (((MyOrdersActive) this.f30389d.get(dVar.mo7273f())).getVBuyerFullName().length() == 1) {
            dVar.f30412x0.setText(((MyOrdersActive) this.f30389d.get(dVar.mo7273f())).getVBuyerFullName());
        } else {
            String substring = ((MyOrdersActive) this.f30389d.get(dVar.mo7273f())).getVBuyerFullName().substring(0, 2);
            String substring2 = ((MyOrdersActive) this.f30389d.get(dVar.mo7273f())).getVBuyerFullName().substring(((MyOrdersActive) this.f30389d.get(dVar.mo7273f())).getVBuyerFullName().length() - 1, ((MyOrdersActive) this.f30389d.get(dVar.mo7273f())).getVBuyerFullName().length());
            TextView textView6 = dVar.f30412x0;
            StringBuilder sb6 = new StringBuilder();
            sb6.append(substring);
            sb6.append("**");
            sb6.append(substring2);
            textView6.setText(sb6.toString());
        }
        if (((MyOrdersActive) this.f30389d.get(dVar.mo7273f())).getUnread() == null || ((MyOrdersActive) this.f30389d.get(dVar.mo7273f())).getUnread().intValue() != 0 || ((MyOrdersActive) this.f30389d.get(dVar.mo7273f())).getOtherOrderStatus() == null || ((MyOrdersActive) this.f30389d.get(dVar.mo7273f())).getOtherOrderStatus().length() <= 0) {
            int intValue = ((MyOrdersActive) this.f30389d.get(dVar.mo7273f())).getUnread().intValue();
            String str5 = C3868i.f12248b;
            if (intValue == 1) {
                TextView textView7 = dVar.f30413y0;
                StringBuilder sb7 = new StringBuilder();
                sb7.append(((MyOrdersActive) this.f30389d.get(dVar.mo7273f())).getUnread());
                sb7.append(str5);
                sb7.append(this.f30388c.getString(C10232R.string.lbl_message));
                textView7.setText(sb7.toString());
                dVar.f30413y0.setVisibility(0);
                dVar.f30414z0.setText(String.valueOf(((MyOrdersActive) this.f30389d.get(dVar.mo7273f())).getUnread()));
                dVar.f30404H0.setVisibility(0);
            } else if (((MyOrdersActive) this.f30389d.get(dVar.mo7273f())).getUnread().intValue() > 1) {
                TextView textView8 = dVar.f30413y0;
                StringBuilder sb8 = new StringBuilder();
                sb8.append(((MyOrdersActive) this.f30389d.get(dVar.mo7273f())).getUnread());
                sb8.append(str5);
                sb8.append(this.f30388c.getString(C10232R.string.lbl_messages));
                textView8.setText(sb8.toString());
                dVar.f30413y0.setVisibility(0);
                dVar.f30414z0.setText(String.valueOf(((MyOrdersActive) this.f30389d.get(dVar.mo7273f())).getUnread()));
                dVar.f30404H0.setVisibility(0);
            } else if (((MyOrdersActive) this.f30389d.get(dVar.mo7273f())).getUnread().intValue() == 0 && ((MyOrdersActive) this.f30389d.get(dVar.mo7273f())).getOtherOrderStatus() == null && ((MyOrdersActive) this.f30389d.get(dVar.mo7273f())).getOtherOrderStatus().length() == 0) {
                dVar.f30413y0.setVisibility(8);
                dVar.f30414z0.setText(str4);
                dVar.f30404H0.setVisibility(8);
            } else {
                dVar.f30413y0.setVisibility(8);
                dVar.f30414z0.setText(str4);
                dVar.f30404H0.setVisibility(8);
            }
        } else {
            TextView textView9 = dVar.f30413y0;
            if (((MyOrdersActive) this.f30389d.get(dVar.mo7273f())).getOtherOrderStatus() != null) {
                str4 = ((MyOrdersActive) this.f30389d.get(dVar.mo7273f())).getOtherOrderStatus();
            }
            textView9.setText(str4);
            dVar.f30413y0.setVisibility(0);
        }
        C2232l.m11649c(this.f30388c.getApplicationContext()).mo9515a(((MyOrdersActive) this.f30389d.get(dVar.mo7273f())).getVShopPic()).m11496d().m11500e((int) C10232R.C10235drawable.menu_shop).mo9424a(dVar.f30397A0);
        if (((MyOrdersActive) this.f30389d.get(dVar.mo7273f())).getVBuyerProfilePic().contains("no_courier")) {
            C0894c a = C0895d.m5185a(this.f30388c.getResources(), BitmapFactory.decodeResource(this.f30388c.getResources(), C10232R.C10235drawable.icon_mo_ac_small_que));
            a.mo4601b(true);
            dVar.f30398B0.setImageDrawable(a);
        } else {
            C2232l.m11649c(this.f30388c.getApplicationContext()).mo9515a(((MyOrdersActive) this.f30389d.get(dVar.mo7273f())).getVBuyerProfilePic()).mo9441j().m11415e((int) C10232R.C10235drawable.icon_mo_ac_small_user).m11411d().mo9458b(new C11005c(dVar.f30398B0, dVar));
        }
        dVar.f30399C0.setImageResource(C10232R.C10235drawable.icon_mo_flag);
        dVar.f30400D0.setImageResource(C10232R.C10235drawable.icon_mo_order);
        dVar.f30401E0.setImageResource(C10232R.C10235drawable.icon_mo_user);
    }

    /* renamed from: b */
    public C11006d m50126b(ViewGroup viewGroup, int i) {
        return new C11006d(LayoutInflater.from(viewGroup.getContext()).inflate(C10232R.layout.row_my_orders, viewGroup, false));
    }

    /* renamed from: b */
    public int mo7325b() {
        return this.f30389d.size();
    }
}
