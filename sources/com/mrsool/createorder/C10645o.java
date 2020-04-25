package com.mrsool.createorder;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.C1635d0;
import androidx.recyclerview.widget.RecyclerView.C1638g;
import com.mrsool.C10232R;
import com.mrsool.newBean.BranchBean;
import com.mrsool.p423v.C11725f;
import com.mrsool.utils.C5887x;
import java.util.List;
import p076c.p082c.p083a.C2232l;
import p438de.hdodenhof.circleimageview.CircleImageView;

/* renamed from: com.mrsool.createorder.o */
/* compiled from: BranchAdapter */
public class C10645o extends C1638g<C10647b> {

    /* renamed from: c */
    private List<BranchBean> f29069c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C11725f f29070d;

    /* renamed from: e */
    private Context f29071e;

    /* renamed from: f */
    private String f29072f;

    /* renamed from: g */
    private String f29073g;

    /* renamed from: h */
    private C5887x f29074h;

    /* renamed from: com.mrsool.createorder.o$a */
    /* compiled from: BranchAdapter */
    class C10646a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ int f29075a;

        C10646a(int i) {
            this.f29075a = i;
        }

        public void onClick(View view) {
            if (C10645o.this.f29070d != null) {
                C10645o.this.f29070d.mo37847a(this.f29075a);
            }
        }
    }

    /* renamed from: com.mrsool.createorder.o$b */
    /* compiled from: BranchAdapter */
    public static class C10647b extends C1635d0 {

        /* renamed from: s0 */
        TextView f29077s0;

        /* renamed from: t0 */
        TextView f29078t0;

        /* renamed from: u0 */
        LinearLayout f29079u0;

        /* renamed from: v0 */
        CircleImageView f29080v0;

        /* renamed from: w0 */
        ImageView f29081w0;

        /* renamed from: x0 */
        ImageView f29082x0;

        public C10647b(View view) {
            super(view);
            this.f29077s0 = (TextView) view.findViewById(C10232R.C10236id.tvLocation);
            this.f29078t0 = (TextView) view.findViewById(C10232R.C10236id.tvDistance);
            this.f29079u0 = (LinearLayout) view.findViewById(C10232R.C10236id.llMain);
            this.f29080v0 = (CircleImageView) view.findViewById(C10232R.C10236id.imgShopIcon);
            this.f29081w0 = (ImageView) view.findViewById(C10232R.C10236id.ivMain);
            this.f29082x0 = (ImageView) view.findViewById(C10232R.C10236id.ivArrow);
        }
    }

    C10645o(Context context, String str, String str2, List<BranchBean> list, C11725f fVar) {
        this.f29071e = context;
        this.f29069c = list;
        this.f29072f = str;
        this.f29070d = fVar;
        this.f29073g = str2;
        this.f29074h = new C5887x(context);
    }

    /* renamed from: a */
    public void mo7330b(C10647b bVar, int i) {
        C2232l.m11649c(this.f29071e).mo9515a(this.f29072f).m11481b().mo9424a((ImageView) bVar.f29080v0);
        bVar.f29077s0.setText(TextUtils.isEmpty(((BranchBean) this.f29069c.get(i)).getTitle()) ? this.f29073g : ((BranchBean) this.f29069c.get(i)).getTitle());
        bVar.f29078t0.setText(((BranchBean) this.f29069c.get(i)).getDistance().toString());
        bVar.f29079u0.setVisibility(0);
        if (((BranchBean) this.f29069c.get(i)).getIsSelected() == 1) {
            bVar.f29079u0.setBackgroundResource(C10232R.C10235drawable.bg_border_sky_blue_10);
            bVar.f29082x0.setVisibility(0);
        } else {
            bVar.f29079u0.setBackgroundResource(0);
            bVar.f29082x0.setVisibility(8);
        }
        bVar.f29081w0.setOnClickListener(new C10646a(i));
        if (this.f29074h.mo23496R()) {
            this.f29074h.mo23608d(bVar.f29078t0);
            this.f29074h.mo23608d(bVar.f29077s0);
        }
    }

    /* renamed from: b */
    public C10647b m49089b(ViewGroup viewGroup, int i) {
        return new C10647b(LayoutInflater.from(viewGroup.getContext()).inflate(C10232R.layout.row_branches, viewGroup, false));
    }

    /* renamed from: b */
    public int mo7325b() {
        return this.f29069c.size();
    }
}
