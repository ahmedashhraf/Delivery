package com.mrsool.stores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.C1635d0;
import androidx.recyclerview.widget.RecyclerView.C1638g;
import com.mrsool.C10232R;
import com.mrsool.p423v.C11725f;
import com.mrsool.utils.C5887x;
import java.util.List;

/* renamed from: com.mrsool.stores.d */
/* compiled from: RecentSearchAdapter */
public class C11532d extends C1638g<C1635d0> {

    /* renamed from: c */
    private Context f32624c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C11725f f32625d;

    /* renamed from: e */
    private List<String> f32626e;

    /* renamed from: f */
    private C5887x f32627f = new C5887x(this.f32624c);

    /* renamed from: com.mrsool.stores.d$a */
    /* compiled from: RecentSearchAdapter */
    class C11533a implements OnClickListener {
        C11533a() {
        }

        public void onClick(View view) {
            C11532d.this.f32625d.onClick(view);
        }
    }

    /* renamed from: com.mrsool.stores.d$b */
    /* compiled from: RecentSearchAdapter */
    class C11534b extends C1635d0 {

        /* renamed from: s0 */
        public TextView f32629s0;

        public C11534b(View view) {
            super(view);
            this.f32629s0 = (TextView) view.findViewById(C10232R.C10236id.tvRecentSearch);
        }
    }

    C11532d(Context context, List<String> list, C11725f fVar) {
        this.f32626e = list;
        this.f32625d = fVar;
        this.f32624c = context;
    }

    /* renamed from: b */
    public C1635d0 mo7327b(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(this.f32624c).inflate(C10232R.layout.row_recent, viewGroup, false);
        inflate.setOnClickListener(new C11533a());
        return new C11534b(inflate);
    }

    /* renamed from: a */
    public void mo39669a(List<String> list) {
        this.f32626e = list;
        mo7341e();
    }

    /* renamed from: b */
    public void mo7330b(C1635d0 d0Var, int i) {
        C11534b bVar = (C11534b) d0Var;
        bVar.f32629s0.setText((CharSequence) this.f32626e.get(i));
        if (this.f32627f.mo23496R()) {
            this.f32627f.mo23608d(bVar.f32629s0);
        }
    }

    /* renamed from: b */
    public int mo7325b() {
        return this.f32626e.size();
    }
}
