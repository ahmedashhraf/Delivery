package com.mrsool.stores;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.C1635d0;
import androidx.recyclerview.widget.RecyclerView.C1638g;
import com.google.android.material.card.MaterialCardView;
import com.mrsool.C10232R;
import com.mrsool.bean.MrsoolService;
import com.mrsool.p423v.C11725f;
import com.mrsool.utils.C5887x;
import java.util.ArrayList;
import p076c.p082c.p083a.C2232l;
import p076c.p082c.p083a.p108y.p110j.C2550c;

/* renamed from: com.mrsool.stores.c */
/* compiled from: PackageAdapterNew */
public class C11528c extends C1638g<C11530b> {

    /* renamed from: c */
    private Context f32605c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C11725f f32606d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C5887x f32607e;

    /* renamed from: f */
    private float f32608f = 100.0f;

    /* renamed from: g */
    public ArrayList<MrsoolService> f32609g;

    /* renamed from: com.mrsool.stores.c$a */
    /* compiled from: PackageAdapterNew */
    class C11529a extends C2550c {

        /* renamed from: R */
        final /* synthetic */ C11530b f32610R;

        C11529a(ImageView imageView, C11530b bVar) {
            this.f32610R = bVar;
            super(imageView);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10023a(Bitmap bitmap) {
            this.f32610R.f32617v0.setImageDrawable(C11528c.this.f32607e.mo23513a(bitmap));
        }
    }

    /* renamed from: com.mrsool.stores.c$b */
    /* compiled from: PackageAdapterNew */
    public class C11530b extends C1635d0 {

        /* renamed from: A0 */
        public LinearLayout f32612A0;

        /* renamed from: s0 */
        TextView f32614s0;

        /* renamed from: t0 */
        TextView f32615t0;

        /* renamed from: u0 */
        TextView f32616u0;

        /* renamed from: v0 */
        ImageView f32617v0;

        /* renamed from: w0 */
        MaterialCardView f32618w0;

        /* renamed from: x0 */
        FrameLayout f32619x0;

        /* renamed from: y0 */
        FrameLayout f32620y0;

        /* renamed from: z0 */
        public LinearLayout f32621z0;

        /* renamed from: com.mrsool.stores.c$b$a */
        /* compiled from: PackageAdapterNew */
        class C11531a implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C11528c f32622a;

            C11531a(C11528c cVar) {
                this.f32622a = cVar;
            }

            public void onClick(View view) {
                C11528c.this.f32606d.mo37847a(C11530b.this.mo7273f());
            }
        }

        public C11530b(View view) {
            super(view);
            this.f32614s0 = (TextView) view.findViewById(C10232R.C10236id.txtPkgTitle);
            this.f32617v0 = (ImageView) view.findViewById(C10232R.C10236id.imgPkgIcon);
            this.f32615t0 = (TextView) view.findViewById(C10232R.C10236id.tvShortDescription);
            this.f32616u0 = (TextView) view.findViewById(C10232R.C10236id.tvServicediscount);
            this.f32618w0 = (MaterialCardView) view.findViewById(C10232R.C10236id.llServiceDiscountTag);
            this.f32619x0 = (FrameLayout) view.findViewById(C10232R.C10236id.flHeight1);
            this.f32620y0 = (FrameLayout) view.findViewById(C10232R.C10236id.flHeight3);
            this.f32612A0 = (LinearLayout) view.findViewById(C10232R.C10236id.llHeight2);
            if (C11528c.this.f32607e.mo23496R()) {
                C11528c.this.f32607e.mo23608d(this.f32614s0);
                C11528c.this.f32607e.mo23608d(this.f32615t0);
            }
            this.f32621z0 = (LinearLayout) view.findViewById(C10232R.C10236id.llMain);
            this.f32619x0.setOnClickListener(new C11531a(C11528c.this));
        }
    }

    C11528c(Context context, ArrayList<MrsoolService> arrayList, C11725f fVar) {
        this.f32605c = context;
        this.f32609g = arrayList;
        this.f32606d = fVar;
        this.f32607e = new C5887x(this.f32605c);
    }

    /* renamed from: a */
    public void mo7330b(C11530b bVar, int i) {
        bVar.f32614s0.setText(((MrsoolService) this.f32609g.get(i)).getVTitle());
        C2232l.m11649c(this.f32605c.getApplicationContext()).mo9515a(((MrsoolService) this.f32609g.get(i)).getVIcon()).mo9441j().m11415e((int) C10232R.C10235drawable.shop_place_holder_white).mo9458b(new C11529a(bVar.f32617v0, bVar));
        String str = "";
        if (TextUtils.isEmpty(((MrsoolService) this.f32609g.get(i)).getvDescription())) {
            bVar.f32615t0.setVisibility(8);
        } else {
            bVar.f32615t0.setVisibility(0);
            TextView textView = bVar.f32615t0;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(((MrsoolService) this.f32609g.get(i)).getvDescription());
            textView.setText(sb.toString());
        }
        if (!((MrsoolService) this.f32609g.get(i)).getDiscountLabel().equals(str)) {
            bVar.f32618w0.setAlpha(this.f32608f);
            bVar.f32616u0.setText(((MrsoolService) this.f32609g.get(i)).getDiscountLabel());
            return;
        }
        bVar.f32618w0.setAlpha(0.0f);
    }

    /* renamed from: b */
    public C11530b m51989b(ViewGroup viewGroup, int i) {
        return new C11530b(LayoutInflater.from(viewGroup.getContext()).inflate(C10232R.layout.row_package_new, viewGroup, false));
    }

    /* renamed from: b */
    public int mo7325b() {
        return this.f32609g.size();
    }

    /* renamed from: a */
    public void mo39667a(ArrayList<MrsoolService> arrayList) {
        this.f32609g = arrayList;
    }
}
