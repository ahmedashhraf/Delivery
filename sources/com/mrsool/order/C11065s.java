package com.mrsool.order;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.drawable.C0894c;
import androidx.core.graphics.drawable.C0895d;
import androidx.recyclerview.widget.RecyclerView.C1635d0;
import androidx.recyclerview.widget.RecyclerView.C1638g;
import com.mrsool.C10232R;
import com.mrsool.bean.serviceManualStepsBean;
import java.util.ArrayList;
import java.util.List;
import p076c.p082c.p083a.C2232l;
import p076c.p082c.p083a.p108y.p110j.C2550c;

/* renamed from: com.mrsool.order.s */
/* compiled from: ServiceManualAdapter */
public class C11065s extends C1638g<C11070e> {

    /* renamed from: c */
    private List<serviceManualStepsBean> f30613c = new ArrayList();

    /* renamed from: d */
    public C11069d f30614d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Context f30615e;

    /* renamed from: com.mrsool.order.s$a */
    /* compiled from: ServiceManualAdapter */
    class C11066a extends C2550c {

        /* renamed from: R */
        final /* synthetic */ C11070e f30616R;

        C11066a(ImageView imageView, C11070e eVar) {
            this.f30616R = eVar;
            super(imageView);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10023a(Bitmap bitmap) {
            C0894c a = C0895d.m5185a(C11065s.this.f30615e.getResources(), bitmap);
            a.mo4601b(true);
            this.f30616R.f30623t0.setImageDrawable(a);
        }
    }

    /* renamed from: com.mrsool.order.s$b */
    /* compiled from: ServiceManualAdapter */
    class C11067b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C11070e f30618a;

        C11067b(C11070e eVar) {
            this.f30618a = eVar;
        }

        public void onClick(View view) {
            C11069d dVar = C11065s.this.f30614d;
            if (dVar != null) {
                dVar.mo23704a(this.f30618a.mo7273f());
            }
        }
    }

    /* renamed from: com.mrsool.order.s$c */
    /* compiled from: ServiceManualAdapter */
    class C11068c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C11070e f30620a;

        C11068c(C11070e eVar) {
            this.f30620a = eVar;
        }

        public void onClick(View view) {
            C11069d dVar = C11065s.this.f30614d;
            if (dVar != null) {
                dVar.mo23705b(this.f30620a.mo7273f());
            }
        }
    }

    /* renamed from: com.mrsool.order.s$d */
    /* compiled from: ServiceManualAdapter */
    public interface C11069d {
        /* renamed from: a */
        void mo23704a(int i);

        /* renamed from: b */
        void mo23705b(int i);
    }

    /* renamed from: com.mrsool.order.s$e */
    /* compiled from: ServiceManualAdapter */
    public static class C11070e extends C1635d0 {

        /* renamed from: s0 */
        TextView f30622s0;

        /* renamed from: t0 */
        ImageView f30623t0;

        /* renamed from: u0 */
        ImageView f30624u0;

        /* renamed from: v0 */
        CardView f30625v0;

        /* renamed from: w0 */
        LinearLayout f30626w0;

        public C11070e(View view) {
            super(view);
            this.f30622s0 = (TextView) view.findViewById(C10232R.C10236id.tvStep);
            this.f30623t0 = (ImageView) view.findViewById(C10232R.C10236id.ivIcon);
            this.f30624u0 = (ImageView) view.findViewById(C10232R.C10236id.ivCheck);
            this.f30625v0 = (CardView) view.findViewById(C10232R.C10236id.cvStep);
            this.f30626w0 = (LinearLayout) view.findViewById(C10232R.C10236id.llCheck);
        }
    }

    public C11065s(List<serviceManualStepsBean> list, Context context) {
        this.f30613c = list;
        this.f30615e = context;
    }

    /* renamed from: f */
    public C11069d mo38826f() {
        return this.f30614d;
    }

    /* renamed from: a */
    public void mo38824a(C11069d dVar) {
        this.f30614d = dVar;
    }

    /* renamed from: a */
    public void mo7330b(C11070e eVar, int i) {
        serviceManualStepsBean servicemanualstepsbean = (serviceManualStepsBean) this.f30613c.get(i);
        eVar.f30622s0.setText(servicemanualstepsbean.getDescription());
        if (servicemanualstepsbean.isRead()) {
            eVar.f30626w0.setEnabled(false);
            eVar.f30624u0.setVisibility(0);
            eVar.f30625v0.setCardBackgroundColor(this.f30615e.getResources().getColor(C10232R.C10234color.color_step_read));
        } else {
            eVar.f30626w0.setEnabled(true);
            eVar.f30624u0.setVisibility(8);
            eVar.f30625v0.setCardBackgroundColor(this.f30615e.getResources().getColor(C10232R.C10234color.white));
        }
        C2232l.m11649c(this.f30615e.getApplicationContext()).mo9515a(servicemanualstepsbean.getIconUrl()).mo9441j().m11415e((int) C10232R.C10235drawable.ic_image_placeholder).m11411d().mo9458b(new C11066a(eVar.f30623t0, eVar));
        eVar.f30626w0.setOnClickListener(new C11067b(eVar));
        eVar.f30623t0.setOnClickListener(new C11068c(eVar));
    }

    /* renamed from: b */
    public C11070e m50271b(ViewGroup viewGroup, int i) {
        return new C11070e(LayoutInflater.from(viewGroup.getContext()).inflate(C10232R.layout.row_service_manual, viewGroup, false));
    }

    /* renamed from: b */
    public int mo7325b() {
        List<serviceManualStepsBean> list = this.f30613c;
        if (list != null) {
            return list.size();
        }
        return 0;
    }
}
