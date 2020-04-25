package com.mrsool.p410r.p411a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.C1635d0;
import androidx.recyclerview.widget.RecyclerView.C1638g;
import com.futuremind.recyclerviewfastscroll.C3881c;
import com.mrsool.C10232R;
import com.mrsool.C10232R.C10235drawable;
import com.mrsool.p410r.p414d.C11148a;
import com.mrsool.p423v.C11725f;
import com.mrsool.utils.C5887x;
import java.util.List;
import java.util.Locale;

/* renamed from: com.mrsool.r.a.b */
/* compiled from: CountryListAdapter1 */
public class C11140b extends C1638g<C1635d0> implements C3881c {

    /* renamed from: c */
    private final int f30847c = 1;

    /* renamed from: d */
    private final int f30848d = 0;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C11725f f30849e;

    /* renamed from: f */
    private Context f30850f;

    /* renamed from: g */
    private C5887x f30851g;

    /* renamed from: h */
    private List<Object> f30852h;

    /* renamed from: com.mrsool.r.a.b$a */
    /* compiled from: CountryListAdapter1 */
    class C11141a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C1635d0 f30853a;

        C11141a(C1635d0 d0Var) {
            this.f30853a = d0Var;
        }

        public void onClick(View view) {
            C11140b.this.f30849e.mo37847a(this.f30853a.mo7273f());
        }
    }

    /* renamed from: com.mrsool.r.a.b$b */
    /* compiled from: CountryListAdapter1 */
    public class C11142b extends C1635d0 {

        /* renamed from: s0 */
        public TextView f30855s0;

        /* renamed from: t0 */
        public ImageView f30856t0;

        /* renamed from: u0 */
        public LinearLayout f30857u0;

        public C11142b(View view) {
            super(view);
            this.f30855s0 = (TextView) view.findViewById(C10232R.C10236id.row_title);
            this.f30856t0 = (ImageView) view.findViewById(C10232R.C10236id.row_icon);
            this.f30857u0 = (LinearLayout) view.findViewById(C10232R.C10236id.llMain);
        }
    }

    /* renamed from: com.mrsool.r.a.b$c */
    /* compiled from: CountryListAdapter1 */
    public class C11143c extends C1635d0 {

        /* renamed from: s0 */
        public TextView f30859s0;

        public C11143c(View view) {
            super(view);
            this.f30859s0 = (TextView) view.findViewById(C10232R.C10236id.txtTitle);
        }
    }

    public C11140b(Context context, List<Object> list, C11725f fVar) {
        this.f30850f = context;
        this.f30849e = fVar;
        this.f30851g = new C5887x(this.f30850f);
        this.f30852h = list;
    }

    /* renamed from: g */
    private Object m50527g(int i) {
        return this.f30852h.get(i);
    }

    /* renamed from: b */
    public C1635d0 mo7327b(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new C11142b(LayoutInflater.from(viewGroup.getContext()).inflate(C10232R.layout.row_country_list, viewGroup, false));
        }
        if (i != 1) {
            return null;
        }
        return new C11143c(LayoutInflater.from(viewGroup.getContext()).inflate(C10232R.layout.row_country_list_header, viewGroup, false));
    }

    /* renamed from: c */
    public int mo7333c(int i) {
        return this.f30852h.get(i) instanceof C11148a ? 0 : 1;
    }

    /* renamed from: a */
    private int m50525a(String str) {
        try {
            return C10235drawable.class.getField(str).getInt(null);
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: a */
    public String mo17158a(int i) {
        String str;
        if (m50527g(i) instanceof C11148a) {
            str = ((C11148a) m50527g(i)).mo38972d();
        } else {
            str = (String) m50527g(i);
        }
        return str.substring(0, 1);
    }

    /* renamed from: b */
    public void mo7330b(C1635d0 d0Var, int i) {
        if (d0Var instanceof C11142b) {
            C11148a aVar = (C11148a) this.f30852h.get(i);
            C11142b bVar = (C11142b) d0Var;
            bVar.f30855s0.setText(aVar.mo38972d());
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("flag_");
                sb.append(aVar.mo38965a().toLowerCase(Locale.ENGLISH));
                int a = m50525a(sb.toString());
                aVar.mo38966a(a);
                bVar.f30856t0.setImageResource(a);
            } catch (Exception e) {
                e.printStackTrace();
            }
            bVar.f30857u0.setOnClickListener(new C11141a(d0Var));
            return;
        }
        ((C11143c) d0Var).f30859s0.setText((String) this.f30852h.get(i));
    }

    /* renamed from: b */
    public int mo7325b() {
        return this.f30852h.size();
    }
}
