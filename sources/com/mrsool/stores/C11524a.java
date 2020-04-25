package com.mrsool.stores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.content.C0841b;
import androidx.recyclerview.widget.RecyclerView.C1635d0;
import androidx.recyclerview.widget.RecyclerView.C1638g;
import com.google.android.material.card.MaterialCardView;
import com.mrsool.C10232R;
import com.mrsool.newBean.StoreCategoryBean;
import com.mrsool.p423v.C11725f;
import java.util.ArrayList;

/* renamed from: com.mrsool.stores.a */
/* compiled from: CategoryAdapter */
public class C11524a extends C1638g<C11525a> {

    /* renamed from: c */
    private Context f32594c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C11725f f32595d;

    /* renamed from: e */
    public ArrayList<StoreCategoryBean> f32596e;

    /* renamed from: f */
    private boolean f32597f = false;

    /* renamed from: com.mrsool.stores.a$a */
    /* compiled from: CategoryAdapter */
    public class C11525a extends C1635d0 {

        /* renamed from: s0 */
        TextView f32598s0;

        /* renamed from: t0 */
        MaterialCardView f32599t0;

        /* renamed from: u0 */
        ProgressBar f32600u0;

        /* renamed from: com.mrsool.stores.a$a$a */
        /* compiled from: CategoryAdapter */
        class C11526a implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C11524a f32602a;

            C11526a(C11524a aVar) {
                this.f32602a = aVar;
            }

            public void onClick(View view) {
                C11524a.this.f32595d.mo37847a(C11525a.this.mo7273f());
            }
        }

        public C11525a(View view) {
            super(view);
            this.f32598s0 = (TextView) view.findViewById(C10232R.C10236id.tvName);
            this.f32599t0 = (MaterialCardView) view.findViewById(C10232R.C10236id.llMain);
            this.f32600u0 = (ProgressBar) view.findViewById(C10232R.C10236id.progressBar);
            this.f32599t0.setOnClickListener(new C11526a(C11524a.this));
        }
    }

    C11524a(Context context, ArrayList<StoreCategoryBean> arrayList, C11725f fVar) {
        this.f32594c = context;
        this.f32596e = arrayList;
        this.f32595d = fVar;
    }

    /* renamed from: f */
    public boolean mo39664f() {
        return this.f32597f;
    }

    /* renamed from: a */
    public void mo7330b(C11525a aVar, int i) {
        int i2 = 8;
        int i3 = 0;
        if (((StoreCategoryBean) this.f32596e.get(i)).isSelected()) {
            ProgressBar progressBar = aVar.f32600u0;
            if (this.f32597f) {
                i2 = 0;
            }
            progressBar.setVisibility(i2);
            aVar.f32599t0.setCardBackgroundColor(C0841b.m4915a(this.f32594c, (int) C10232R.C10234color.sky_blue_color_2));
            TextView textView = aVar.f32598s0;
            if (this.f32597f) {
                i3 = 4;
            }
            textView.setVisibility(i3);
        } else {
            aVar.f32600u0.setVisibility(8);
            aVar.f32598s0.setVisibility(0);
            aVar.f32599t0.setCardBackgroundColor(C0841b.m4915a(this.f32594c, (int) C10232R.C10234color.text_color_c0));
        }
        aVar.f32598s0.setText(((StoreCategoryBean) this.f32596e.get(i)).getName());
    }

    /* renamed from: b */
    public void mo39663b(boolean z) {
        this.f32597f = z;
    }

    /* renamed from: b */
    public C11525a m51979b(ViewGroup viewGroup, int i) {
        return new C11525a(LayoutInflater.from(viewGroup.getContext()).inflate(C10232R.layout.row_store_category, viewGroup, false));
    }

    /* renamed from: b */
    public int mo7325b() {
        return this.f32596e.size();
    }

    /* renamed from: a */
    public void mo39662a(ArrayList<StoreCategoryBean> arrayList) {
        this.f32596e = arrayList;
    }
}
