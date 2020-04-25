package com.mrsool.complaint;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.drawable.C0894c;
import androidx.core.graphics.drawable.C0895d;
import androidx.recyclerview.widget.RecyclerView.C1635d0;
import androidx.recyclerview.widget.RecyclerView.C1638g;
import com.jackandphantom.circularimageview.CircleImage;
import com.mrsool.C10232R;
import com.mrsool.bean.ComplaintListBean;
import com.mrsool.utils.C5887x;
import java.util.ArrayList;
import java.util.List;
import p076c.p082c.p083a.C2232l;
import p076c.p082c.p083a.p108y.p110j.C2550c;

/* renamed from: com.mrsool.complaint.a */
/* compiled from: ComplaintListAdapter */
public class C10547a extends C1638g<C10552e> {

    /* renamed from: f */
    public static C5887x f28655f;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Context f28656c;

    /* renamed from: d */
    private List<ComplaintListBean> f28657d = new ArrayList();

    /* renamed from: e */
    public C10551d f28658e;

    /* renamed from: com.mrsool.complaint.a$a */
    /* compiled from: ComplaintListAdapter */
    class C10548a extends C2550c {

        /* renamed from: R */
        final /* synthetic */ C10552e f28659R;

        C10548a(ImageView imageView, C10552e eVar) {
            this.f28659R = eVar;
            super(imageView);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10023a(Bitmap bitmap) {
            C0894c a = C0895d.m5185a(C10547a.this.f28656c.getResources(), bitmap);
            a.mo4601b(true);
            this.f28659R.f28669t0.setImageDrawable(a);
        }
    }

    /* renamed from: com.mrsool.complaint.a$b */
    /* compiled from: ComplaintListAdapter */
    class C10549b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ int f28661a;

        C10549b(int i) {
            this.f28661a = i;
        }

        public void onClick(View view) {
            C10547a.this.f28658e.mo37928b(this.f28661a);
        }
    }

    /* renamed from: com.mrsool.complaint.a$c */
    /* compiled from: ComplaintListAdapter */
    class C10550c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ int f28663a;

        C10550c(int i) {
            this.f28663a = i;
        }

        public void onClick(View view) {
            C10547a.this.f28658e.mo37927a(this.f28663a);
        }
    }

    /* renamed from: com.mrsool.complaint.a$d */
    /* compiled from: ComplaintListAdapter */
    public interface C10551d {
        /* renamed from: a */
        void mo37927a(int i);

        /* renamed from: b */
        void mo37928b(int i);
    }

    /* renamed from: com.mrsool.complaint.a$e */
    /* compiled from: ComplaintListAdapter */
    public static class C10552e extends C1635d0 {

        /* renamed from: A0 */
        TextView f28665A0;

        /* renamed from: B0 */
        TextView f28666B0;

        /* renamed from: C0 */
        LinearLayout f28667C0;

        /* renamed from: s0 */
        CircleImage f28668s0;

        /* renamed from: t0 */
        CircleImage f28669t0;

        /* renamed from: u0 */
        TextView f28670u0;

        /* renamed from: v0 */
        TextView f28671v0;

        /* renamed from: w0 */
        TextView f28672w0;

        /* renamed from: x0 */
        TextView f28673x0;

        /* renamed from: y0 */
        TextView f28674y0;

        /* renamed from: z0 */
        TextView f28675z0;

        public C10552e(View view) {
            super(view);
            this.f28670u0 = (TextView) view.findViewById(C10232R.C10236id.txtrow1);
            this.f28671v0 = (TextView) view.findViewById(C10232R.C10236id.txtrow12);
            this.f28672w0 = (TextView) view.findViewById(C10232R.C10236id.txtrow2);
            this.f28673x0 = (TextView) view.findViewById(C10232R.C10236id.txtrow3);
            this.f28674y0 = (TextView) view.findViewById(C10232R.C10236id.txtrow31);
            this.f28675z0 = (TextView) view.findViewById(C10232R.C10236id.txtrowTime);
            this.f28665A0 = (TextView) view.findViewById(C10232R.C10236id.txtEdit);
            this.f28666B0 = (TextView) view.findViewById(C10232R.C10236id.txtComplaintNumber);
            this.f28668s0 = (CircleImage) view.findViewById(C10232R.C10236id.imgBig);
            this.f28669t0 = (CircleImage) view.findViewById(C10232R.C10236id.imgSmall);
            this.f28667C0 = (LinearLayout) view.findViewById(C10232R.C10236id.llContent);
            if (C10547a.f28655f.mo23496R()) {
                C10547a.f28655f.mo23608d(this.f28670u0, this.f28672w0, this.f28673x0, this.f28674y0);
            }
        }
    }

    public C10547a(List<ComplaintListBean> list, Context context) {
        this.f28656c = context;
        this.f28657d = list;
        f28655f = new C5887x(context);
    }

    /* renamed from: f */
    public C10551d mo37932f() {
        return this.f28658e;
    }

    /* renamed from: a */
    public void mo37930a(C10551d dVar) {
        this.f28658e = dVar;
    }

    /* renamed from: a */
    public void mo7330b(C10552e eVar, int i) {
        ComplaintListBean complaintListBean = (ComplaintListBean) this.f28657d.get(i);
        C2232l.m11649c(this.f28656c.getApplicationContext()).mo9515a(complaintListBean.getShop_pic()).mo9424a((ImageView) eVar.f28668s0);
        C2232l.m11649c(this.f28656c.getApplicationContext()).mo9515a(complaintListBean.getSuspect_pic()).mo9441j().m11415e((int) C10232R.C10235drawable.icon_mo_ac_small_user).m11411d().mo9458b(new C10548a(eVar.f28669t0, eVar));
        eVar.f28670u0.setText(complaintListBean.getShop_name());
        String str = "";
        if (complaintListBean.getOrder_id() != null) {
            TextView textView = eVar.f28671v0;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(complaintListBean.getOrder_id());
            textView.setText(sb.toString());
        } else {
            TextView textView2 = eVar.f28671v0;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(complaintListBean.getOrder());
            textView2.setText(sb2.toString());
        }
        eVar.f28672w0.setText(complaintListBean.getOrder_desc());
        eVar.f28673x0.setText(complaintListBean.getSuspect_name());
        TextView textView3 = eVar.f28674y0;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append(complaintListBean.getStatus());
        textView3.setText(sb3.toString());
        if (!TextUtils.isEmpty(complaintListBean.getStatus_color())) {
            TextView textView4 = eVar.f28674y0;
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str);
            sb4.append(complaintListBean.getStatus_color());
            textView4.setTextColor(Color.parseColor(sb4.toString()));
        }
        eVar.f28675z0.setText(complaintListBean.getCreated_at());
        eVar.f28665A0.setVisibility(complaintListBean.is_editable() ? 0 : 8);
        eVar.f28666B0.setText(complaintListBean.getComplaint_number());
        eVar.f28665A0.setOnClickListener(new C10549b(i));
        eVar.f28667C0.setOnClickListener(new C10550c(i));
    }

    /* renamed from: b */
    public C10552e m48712b(ViewGroup viewGroup, int i) {
        return new C10552e(LayoutInflater.from(viewGroup.getContext()).inflate(C10232R.layout.row_my_filed_complaint, viewGroup, false));
    }

    /* renamed from: b */
    public int mo7325b() {
        List<ComplaintListBean> list = this.f28657d;
        if (list != null) {
            return list.size();
        }
        return 0;
    }
}
