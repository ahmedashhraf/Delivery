package com.mrsool.chat;

import com.mrsool.bean.PaymentCardsBean;
import com.mrsool.bean.PaymentStatusMainBean;
import com.mrsool.payment.C11127q;
import com.mrsool.payment.C11127q.C11130c;
import java.util.List;

/* renamed from: com.mrsool.chat.f */
/* compiled from: lambda */
public final /* synthetic */ class C10486f implements C11130c {

    /* renamed from: a */
    private final /* synthetic */ ChatActivityNew f28342a;

    /* renamed from: b */
    private final /* synthetic */ PaymentStatusMainBean f28343b;

    /* renamed from: c */
    private final /* synthetic */ C11127q f28344c;

    public /* synthetic */ C10486f(ChatActivityNew chatActivityNew, PaymentStatusMainBean paymentStatusMainBean, C11127q qVar) {
        this.f28342a = chatActivityNew;
        this.f28343b = paymentStatusMainBean;
        this.f28344c = qVar;
    }

    /* renamed from: a */
    public final void mo37856a(List list, PaymentCardsBean paymentCardsBean) {
        this.f28342a.mo37662a(this.f28343b, this.f28344c, list, paymentCardsBean);
    }
}
