package com.mrsool.stores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.C0841b;
import androidx.recyclerview.widget.RecyclerView.C1635d0;
import androidx.recyclerview.widget.RecyclerView.C1638g;
import com.mrsool.C10232R;
import com.mrsool.bean.FourSquareMainBean;
import com.mrsool.p423v.C11725f;
import com.mrsool.utils.C5880q;
import com.mrsool.utils.C5887x;
import java.util.ArrayList;
import p076c.p082c.p083a.C2232l;

/* renamed from: com.mrsool.stores.f */
/* compiled from: StoresAdapterNew */
public class C11537f extends C1638g<C1635d0> {

    /* renamed from: c */
    private Context f32636c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C11725f f32637d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C5887x f32638e;

    /* renamed from: f */
    private ArrayList<FourSquareMainBean> f32639f;

    /* renamed from: g */
    private boolean f32640g = false;

    /* renamed from: com.mrsool.stores.f$a */
    /* compiled from: StoresAdapterNew */
    class C11538a extends C1635d0 {

        /* renamed from: s0 */
        public TextView f32642s0;

        /* renamed from: t0 */
        public TextView f32643t0;

        /* renamed from: u0 */
        public TextView f32644u0;

        /* renamed from: v0 */
        public TextView f32645v0;

        /* renamed from: w0 */
        public ImageView f32646w0;

        /* renamed from: x0 */
        public LinearLayout f32647x0;

        /* renamed from: y0 */
        public LinearLayout f32648y0;

        /* renamed from: z0 */
        public LinearLayout f32649z0;

        /* renamed from: com.mrsool.stores.f$a$a */
        /* compiled from: StoresAdapterNew */
        class C11539a implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C11537f f32650a;

            C11539a(C11537f fVar) {
                this.f32650a = fVar;
            }

            public void onClick(View view) {
                C11537f.this.f32637d.mo37847a(C11538a.this.mo7273f());
            }
        }

        public C11538a(View view) {
            super(view);
            this.f32642s0 = (TextView) view.findViewById(C10232R.C10236id.txyShopTitle);
            this.f32643t0 = (TextView) view.findViewById(C10232R.C10236id.txtShopDistance);
            this.f32646w0 = (ImageView) view.findViewById(C10232R.C10236id.imgShopIcon);
            this.f32647x0 = (LinearLayout) view.findViewById(C10232R.C10236id.llDiscountTag);
            this.f32644u0 = (TextView) view.findViewById(C10232R.C10236id.tvShopAddress);
            this.f32645v0 = (TextView) view.findViewById(C10232R.C10236id.tvdiscount);
            this.f32648y0 = (LinearLayout) view.findViewById(C10232R.C10236id.llMain);
            this.f32649z0 = (LinearLayout) view.findViewById(C10232R.C10236id.llShop);
            if (C11537f.this.f32638e.mo23496R()) {
                C11537f.this.f32638e.mo23608d(this.f32644u0);
                C11537f.this.f32638e.mo23608d(this.f32642s0);
            }
            this.f32648y0.setOnClickListener(new C11539a(C11537f.this));
        }
    }

    C11537f(Context context, ArrayList<FourSquareMainBean> arrayList, boolean z, C11725f fVar) {
        this.f32639f = arrayList;
        this.f32637d = fVar;
        this.f32636c = context;
        this.f32640g = z;
        this.f32638e = new C5887x(this.f32636c);
    }

    /* renamed from: c */
    public int mo7333c(int i) {
        return this.f32639f.get(i) == null ? 1 : 0;
    }

    /* renamed from: a */
    public void mo39676a(ArrayList<FourSquareMainBean> arrayList) {
        this.f32639f = arrayList;
    }

    /* renamed from: b */
    public C1635d0 mo7327b(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new C11538a(LayoutInflater.from(this.f32636c).inflate(C10232R.layout.row_stores_new, viewGroup, false));
        }
        if (i == 1) {
            return new C11527b(LayoutInflater.from(this.f32636c).inflate(C10232R.layout.layout_loading_item, viewGroup, false));
        }
        return null;
    }

    /* renamed from: b */
    public void mo7330b(C1635d0 d0Var, int i) {
        if (d0Var instanceof C11538a) {
            FourSquareMainBean fourSquareMainBean = (FourSquareMainBean) this.f32639f.get(i);
            C11538a aVar = (C11538a) d0Var;
            TextView textView = aVar.f32642s0;
            TextView textView2 = aVar.f32643t0;
            textView.setText(fourSquareMainBean.getShopName());
            aVar.f32644u0.setText(fourSquareMainBean.getFormattedAddress());
            if (fourSquareMainBean.isHighlightShop() || this.f32640g) {
                aVar.f32649z0.setBackgroundResource(C10232R.C10235drawable.bg_shops_mrsool_new);
            } else if (this.f32639f.size() - 1 == i) {
                aVar.f32649z0.setBackgroundResource(0);
                aVar.f32649z0.setBackgroundColor(C0841b.m4915a(this.f32636c, (int) C10232R.C10234color.white));
            }
            textView2.setText(((FourSquareMainBean) this.f32639f.get(i)).getDistance());
            C2232l.m11649c(this.f32636c.getApplicationContext()).mo9515a(((FourSquareMainBean) this.f32639f.get(i)).getShopPic()).m11491c((int) C10232R.C10235drawable.icon_mo_ac_small_shop).m11496d().m11500e((int) C10232R.C10235drawable.shop_place_holder_white).mo9424a(aVar.f32646w0);
            if (((FourSquareMainBean) this.f32639f.get(i)).getHasDiscount()) {
                float f = 180.0f;
                aVar.f32647x0.setRotation(this.f32638e.mo23496R() ? 180.0f : 0.0f);
                TextView textView3 = aVar.f32645v0;
                if (!this.f32638e.mo23496R()) {
                    f = 0.0f;
                }
                textView3.setRotation(f);
                aVar.f32647x0.setVisibility(0);
                aVar.f32645v0.setText(((FourSquareMainBean) this.f32639f.get(i)).getDiscountLabel());
                return;
            }
            aVar.f32647x0.setVisibility(8);
        } else if (d0Var instanceof C11527b) {
            C5880q.m25753d("call loading onBindViewHolder");
            ((C11527b) d0Var).f32604s0.setIndeterminate(true);
        }
    }

    /* renamed from: b */
    public int mo7325b() {
        return this.f32639f.size();
    }
}
