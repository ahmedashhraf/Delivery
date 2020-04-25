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
import com.mrsool.utils.C5880q;
import java.util.ArrayList;
import java.util.List;
import p076c.p082c.p083a.C2232l;
import p076c.p082c.p083a.p108y.p110j.C2550c;

/* renamed from: com.mrsool.order.l */
/* compiled from: MyInActiveOrdersAdapter */
public class C11029l extends C1638g<C11033d> {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Context f30486c;

    /* renamed from: d */
    private List<MyOrdersInactive> f30487d = new ArrayList();

    /* renamed from: e */
    public C11558b f30488e;

    /* renamed from: com.mrsool.order.l$a */
    /* compiled from: MyInActiveOrdersAdapter */
    class C11030a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C11033d f30489a;

        C11030a(C11033d dVar) {
            this.f30489a = dVar;
        }

        public void onClick(View view) {
            C11029l.this.f30488e.mo38773a(this.f30489a.mo7273f());
        }
    }

    /* renamed from: com.mrsool.order.l$b */
    /* compiled from: MyInActiveOrdersAdapter */
    class C11031b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C11033d f30491a;

        C11031b(C11033d dVar) {
            this.f30491a = dVar;
        }

        public void onClick(View view) {
            C11029l.this.f30488e.mo38773a(this.f30491a.mo7273f());
        }
    }

    /* renamed from: com.mrsool.order.l$c */
    /* compiled from: MyInActiveOrdersAdapter */
    class C11032c extends C2550c {

        /* renamed from: R */
        final /* synthetic */ C11033d f30493R;

        C11032c(ImageView imageView, C11033d dVar) {
            this.f30493R = dVar;
            super(imageView);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10023a(Bitmap bitmap) {
            C0894c a = C0895d.m5185a(C11029l.this.f30486c.getResources(), bitmap);
            a.mo4601b(true);
            this.f30493R.f30496B0.setImageDrawable(a);
        }
    }

    /* renamed from: com.mrsool.order.l$d */
    /* compiled from: MyInActiveOrdersAdapter */
    public static class C11033d extends C1635d0 {

        /* renamed from: A0 */
        ImageView f30495A0;

        /* renamed from: B0 */
        ImageView f30496B0;

        /* renamed from: C0 */
        ImageView f30497C0;

        /* renamed from: D0 */
        ImageView f30498D0;

        /* renamed from: E0 */
        ImageView f30499E0;

        /* renamed from: F0 */
        ImageView f30500F0;

        /* renamed from: G0 */
        LinearLayout f30501G0;

        /* renamed from: H0 */
        CardView f30502H0;

        /* renamed from: I0 */
        FrameLayout f30503I0;

        /* renamed from: s0 */
        TextView f30504s0;

        /* renamed from: t0 */
        TextView f30505t0;

        /* renamed from: u0 */
        TextView f30506u0;

        /* renamed from: v0 */
        TextView f30507v0;

        /* renamed from: w0 */
        TextView f30508w0;

        /* renamed from: x0 */
        TextView f30509x0;

        /* renamed from: y0 */
        TextView f30510y0;

        /* renamed from: z0 */
        TextView f30511z0;

        public C11033d(View view) {
            super(view);
            this.f30504s0 = (TextView) view.findViewById(C10232R.C10236id.txtrow1);
            this.f30505t0 = (TextView) view.findViewById(C10232R.C10236id.txtrow12);
            this.f30506u0 = (TextView) view.findViewById(C10232R.C10236id.txtrow2);
            this.f30507v0 = (TextView) view.findViewById(C10232R.C10236id.txtrow3);
            this.f30508w0 = (TextView) view.findViewById(C10232R.C10236id.txtrow31);
            this.f30509x0 = (TextView) view.findViewById(C10232R.C10236id.txtrow4);
            this.f30510y0 = (TextView) view.findViewById(C10232R.C10236id.txtrow5);
            this.f30495A0 = (ImageView) view.findViewById(C10232R.C10236id.imgBig);
            this.f30496B0 = (ImageView) view.findViewById(C10232R.C10236id.imgSmall);
            this.f30497C0 = (ImageView) view.findViewById(C10232R.C10236id.imgrow2);
            this.f30498D0 = (ImageView) view.findViewById(C10232R.C10236id.imgrow3);
            this.f30499E0 = (ImageView) view.findViewById(C10232R.C10236id.imgrow4);
            this.f30502H0 = (CardView) view.findViewById(C10232R.C10236id.cvShops);
            this.f30500F0 = (ImageView) view.findViewById(C10232R.C10236id.ivLiveGlowing);
            this.f30503I0 = (FrameLayout) view.findViewById(C10232R.C10236id.layOrderUnreadMsg);
            this.f30511z0 = (TextView) view.findViewById(C10232R.C10236id.txtOrderUnreadMsg);
            this.f30501G0 = (LinearLayout) view.findViewById(C10232R.C10236id.llContent);
        }
    }

    public C11029l(List<MyOrdersInactive> list, Context context) {
        this.f30486c = context;
        this.f30487d = list;
    }

    /* renamed from: f */
    public C11558b mo38787f() {
        return this.f30488e;
    }

    /* renamed from: a */
    public void mo38786a(C11558b bVar) {
        this.f30488e = bVar;
    }

    /* renamed from: a */
    public void mo7330b(C11033d dVar, int i) {
        dVar.f30500F0.setVisibility(8);
        dVar.f30504s0.setText(((MyOrdersInactive) this.f30487d.get(dVar.mo7273f())).getVShopName().toString());
        TextView textView = dVar.f30505t0;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f30486c.getString(C10232R.string.lbl_no_numbers));
        sb.append(". ");
        sb.append(((MyOrdersInactive) this.f30487d.get(dVar.mo7273f())).getIOrderId());
        textView.setText(sb.toString());
        dVar.f30507v0.setText(((MyOrdersInactive) this.f30487d.get(dVar.mo7273f())).getTxOrderDescription());
        dVar.f30502H0.setOnClickListener(new C11030a(dVar));
        dVar.f30501G0.setOnClickListener(new C11031b(dVar));
        String str = "-";
        dVar.f30506u0.setText(str);
        TextView textView2 = dVar.f30508w0;
        StringBuilder sb2 = new StringBuilder();
        String str2 = "";
        sb2.append(str2);
        sb2.append(((MyOrdersInactive) this.f30487d.get(dVar.mo7273f())).getOrderStatus());
        textView2.setText(sb2.toString());
        TextView textView3 = dVar.f30508w0;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str2);
        sb3.append(((MyOrdersInactive) this.f30487d.get(dVar.mo7273f())).getStatus_color());
        textView3.setTextColor(Color.parseColor(sb3.toString()));
        if (((MyOrdersInactive) this.f30487d.get(dVar.mo7273f())).getVBuyerFullName() == null || ((MyOrdersInactive) this.f30487d.get(dVar.mo7273f())).getVBuyerFullName().length() <= 0) {
            dVar.f30509x0.setText(str);
        } else if (((MyOrdersInactive) this.f30487d.get(dVar.mo7273f())).getVBuyerFullName().length() == 1) {
            dVar.f30509x0.setText(((MyOrdersInactive) this.f30487d.get(dVar.mo7273f())).getVBuyerFullName());
        } else {
            String substring = ((MyOrdersInactive) this.f30487d.get(dVar.mo7273f())).getVBuyerFullName().substring(0, 2);
            String substring2 = ((MyOrdersInactive) this.f30487d.get(dVar.mo7273f())).getVBuyerFullName().substring(((MyOrdersInactive) this.f30487d.get(dVar.mo7273f())).getVBuyerFullName().length() - 1, ((MyOrdersInactive) this.f30487d.get(dVar.mo7273f())).getVBuyerFullName().length());
            TextView textView4 = dVar.f30509x0;
            StringBuilder sb4 = new StringBuilder();
            sb4.append(substring);
            sb4.append("**");
            sb4.append(substring2);
            textView4.setText(sb4.toString());
        }
        if (((MyOrdersInactive) this.f30487d.get(dVar.mo7273f())).getUnread() == null || ((MyOrdersInactive) this.f30487d.get(dVar.mo7273f())).getUnread().intValue() != 0 || ((MyOrdersInactive) this.f30487d.get(dVar.mo7273f())).getOtherOrderStatus() == null || ((MyOrdersInactive) this.f30487d.get(dVar.mo7273f())).getOtherOrderStatus().length() <= 0) {
            int intValue = ((MyOrdersInactive) this.f30487d.get(dVar.mo7273f())).getUnread().intValue();
            String str3 = C3868i.f12248b;
            if (intValue == 1) {
                TextView textView5 = dVar.f30510y0;
                StringBuilder sb5 = new StringBuilder();
                sb5.append(((MyOrdersInactive) this.f30487d.get(dVar.mo7273f())).getUnread());
                sb5.append(str3);
                sb5.append(this.f30486c.getString(C10232R.string.lbl_message));
                textView5.setText(sb5.toString());
                dVar.f30510y0.setVisibility(0);
                dVar.f30511z0.setText(String.valueOf(((MyOrdersInactive) this.f30487d.get(dVar.mo7273f())).getUnread()));
                dVar.f30503I0.setVisibility(0);
            } else if (((MyOrdersInactive) this.f30487d.get(dVar.mo7273f())).getUnread().intValue() > 1) {
                TextView textView6 = dVar.f30510y0;
                StringBuilder sb6 = new StringBuilder();
                sb6.append(((MyOrdersInactive) this.f30487d.get(dVar.mo7273f())).getUnread());
                sb6.append(str3);
                sb6.append(this.f30486c.getString(C10232R.string.lbl_messages));
                textView6.setText(sb6.toString());
                dVar.f30510y0.setVisibility(0);
                dVar.f30511z0.setText(String.valueOf(((MyOrdersInactive) this.f30487d.get(dVar.mo7273f())).getUnread()));
                dVar.f30503I0.setVisibility(0);
            } else if (((MyOrdersInactive) this.f30487d.get(dVar.mo7273f())).getUnread().intValue() == 0 && ((MyOrdersInactive) this.f30487d.get(dVar.mo7273f())).getOtherOrderStatus() == null && ((MyOrdersInactive) this.f30487d.get(dVar.mo7273f())).getOtherOrderStatus().length() == 0) {
                dVar.f30510y0.setVisibility(8);
                dVar.f30511z0.setText(str2);
                dVar.f30503I0.setVisibility(8);
            } else {
                dVar.f30510y0.setVisibility(8);
                dVar.f30511z0.setText(str2);
                dVar.f30503I0.setVisibility(8);
            }
        } else {
            dVar.f30510y0.setText(((MyOrdersInactive) this.f30487d.get(dVar.mo7273f())).getOtherOrderStatus() != null ? ((MyOrdersInactive) this.f30487d.get(dVar.mo7273f())).getOtherOrderStatus() : str2);
            dVar.f30510y0.setVisibility(0);
        }
        C2232l.m11649c(this.f30486c.getApplicationContext()).mo9515a(((MyOrdersInactive) this.f30487d.get(dVar.mo7273f())).getVShopPic()).m11496d().m11500e((int) C10232R.C10235drawable.menu_shop).mo9424a(dVar.f30495A0);
        StringBuilder sb7 = new StringBuilder();
        sb7.append(str2);
        sb7.append(((MyOrdersInactive) this.f30487d.get(dVar.mo7273f())).getVBuyerProfilePic());
        C5880q.m25753d(sb7.toString());
        if (((MyOrdersInactive) this.f30487d.get(dVar.mo7273f())).getVBuyerProfilePic().contains("no_courier")) {
            C0894c a = C0895d.m5185a(this.f30486c.getResources(), BitmapFactory.decodeResource(this.f30486c.getResources(), C10232R.C10235drawable.icon_mo_ac_small_que));
            a.mo4601b(true);
            dVar.f30496B0.setImageDrawable(a);
        } else {
            C2232l.m11649c(this.f30486c.getApplicationContext()).mo9515a(((MyOrdersInactive) this.f30487d.get(dVar.mo7273f())).getVBuyerProfilePic()).mo9441j().m11415e((int) C10232R.C10235drawable.icon_mo_ac_small_user).m11411d().mo9458b(new C11032c(dVar.f30496B0, dVar));
        }
        dVar.f30497C0.setImageResource(C10232R.C10235drawable.icon_mo_timer);
        dVar.f30498D0.setImageResource(C10232R.C10235drawable.icon_mo_order);
        dVar.f30499E0.setImageResource(C10232R.C10235drawable.icon_mo_user);
    }

    /* renamed from: b */
    public C11033d m50179b(ViewGroup viewGroup, int i) {
        return new C11033d(LayoutInflater.from(viewGroup.getContext()).inflate(C10232R.layout.row_my_orders, viewGroup, false));
    }

    /* renamed from: b */
    public int mo7325b() {
        return this.f30487d.size();
    }
}
