package com.mrsool.shop;

import android.content.Context;
import com.mrsool.C10232R;
import com.mrsool.bean.CardListMainBean;
import com.mrsool.utils.C5887x;
import com.mrsool.utils.webservice.C11687c;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* renamed from: com.mrsool.shop.c */
/* compiled from: HasCardsChecker */
public class C11232c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C5887x f31245a;

    /* renamed from: com.mrsool.shop.c$a */
    /* compiled from: HasCardsChecker */
    class C11233a implements Callback<CardListMainBean> {

        /* renamed from: a */
        final /* synthetic */ C11234b f31246a;

        /* renamed from: b */
        final /* synthetic */ Context f31247b;

        C11233a(C11234b bVar, Context context) {
            this.f31246a = bVar;
            this.f31247b = context;
        }

        public void onFailure(Call<CardListMainBean> call, Throwable th) {
            try {
                if (C11232c.this.f31245a != null) {
                    C11232c.this.f31245a.mo23492O();
                    C11232c.this.f31245a.mo23653q0();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void onResponse(Call<CardListMainBean> call, Response<CardListMainBean> response) {
            try {
                if (C11232c.this.f31245a != null) {
                    C11232c.this.f31245a.mo23492O();
                    if (!response.isSuccessful()) {
                        C11232c.this.f31245a.mo23615f(response.message(), this.f31247b.getString(C10232R.string.app_name));
                    } else if (((CardListMainBean) response.body()).getCode().intValue() <= 300) {
                        if (((CardListMainBean) response.body()).getCardsBeans().size() > 0) {
                            this.f31246a.mo37975a();
                        } else {
                            this.f31246a.mo37976b();
                        }
                    } else {
                        C11232c.this.f31245a.mo23615f(((CardListMainBean) response.body()).getMessage(), this.f31247b.getString(C10232R.string.app_name));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.mrsool.shop.c$b */
    /* compiled from: HasCardsChecker */
    public interface C11234b {
        /* renamed from: a */
        void mo37975a();

        /* renamed from: b */
        void mo37976b();
    }

    public C11232c(C5887x xVar) {
        this.f31245a = xVar;
    }

    /* renamed from: a */
    public void mo39069a(Context context, C11234b bVar) {
        if (this.f31245a.mo23502X()) {
            this.f31245a.mo23665u0();
            C11687c.m52645a(this.f31245a).getCardList(this.f31245a.mo23476G()).enqueue(new C11233a(bVar, context));
        }
    }
}
