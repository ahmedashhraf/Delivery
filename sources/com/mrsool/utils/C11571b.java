package com.mrsool.utils;

import android.content.Context;
import com.mrsool.C11072p;
import com.mrsool.bean.MyOrdersActive;
import com.mrsool.utils.C11644i.C11645a;

/* renamed from: com.mrsool.utils.b */
/* compiled from: AbortPendingOperations */
public class C11571b {

    /* renamed from: a */
    private C5887x f32762a;

    /* renamed from: b */
    private String f32763b = "abort_";

    public C11571b(Context context) {
        this.f32762a = new C5887x(context);
    }

    /* renamed from: a */
    public void mo39718a(String str, boolean z) {
        if (!z) {
            C5881v D = this.f32762a.mo23470D();
            StringBuilder sb = new StringBuilder();
            sb.append(this.f32763b);
            sb.append(str);
            D.mo23462i(sb.toString());
            return;
        }
        C5881v D2 = this.f32762a.mo23470D();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f32763b);
        sb2.append(str);
        D2.mo23453b(sb2.toString(), Boolean.valueOf(z));
    }

    /* renamed from: a */
    public void mo39716a() {
        for (int i = 0; i < C11644i.f33468z6.size(); i++) {
            C5881v D = this.f32762a.mo23470D();
            StringBuilder sb = new StringBuilder();
            sb.append(this.f32763b);
            sb.append(((MyOrdersActive) C11644i.f33468z6.get(i)).getIOrderId());
            if (D.mo23455b(sb.toString()) && this.f32762a.mo23620g()) {
                C5887x xVar = this.f32762a;
                String str = C11645a.f33469a;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("");
                sb2.append(((MyOrdersActive) C11644i.f33468z6.get(i)).getIOrderId());
                xVar.mo23595c(str, "credit_card", sb2.toString());
                mo39718a(((MyOrdersActive) C11644i.f33468z6.get(i)).getIOrderId(), false);
            }
        }
    }

    /* renamed from: a */
    public void mo39717a(C11072p pVar) {
        for (int i = 0; i < C11644i.f33468z6.size(); i++) {
            C5881v D = this.f32762a.mo23470D();
            StringBuilder sb = new StringBuilder();
            sb.append(this.f32763b);
            sb.append(((MyOrdersActive) C11644i.f33468z6.get(i)).getIOrderId());
            if (D.mo23455b(sb.toString()) && this.f32762a.mo23620g()) {
                C5887x xVar = this.f32762a;
                String str = C11645a.f33469a;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("");
                sb2.append(((MyOrdersActive) C11644i.f33468z6.get(i)).getIOrderId());
                xVar.mo23595c(str, "credit_card", sb2.toString());
                mo39718a(((MyOrdersActive) C11644i.f33468z6.get(i)).getIOrderId(), false);
                pVar.mo36571a();
            }
        }
    }
}
