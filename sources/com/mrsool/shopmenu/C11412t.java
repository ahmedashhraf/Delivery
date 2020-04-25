package com.mrsool.shopmenu;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.facebook.appevents.AppEventsConstants;
import com.mrsool.C10232R;
import com.mrsool.C10787d;
import com.mrsool.bean.CheckDiscountBean;
import com.mrsool.utils.AppSingleton;
import com.mrsool.utils.C5880q;
import com.mrsool.utils.C5887x;
import com.mrsool.utils.webservice.C11687c;
import java.util.HashMap;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* renamed from: com.mrsool.shopmenu.t */
/* compiled from: MenuOrderBaseActivity */
public class C11412t extends C10787d {

    /* renamed from: S */
    public AppSingleton f32097S;

    /* renamed from: T */
    public boolean f32098T = false;

    /* renamed from: U */
    public CheckDiscountBean f32099U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public C11377m f32100V;

    /* renamed from: W */
    public String f32101W = "bundle_description";

    /* renamed from: X */
    public String f32102X = "bundle_coupon_option";

    /* renamed from: Y */
    public String f32103Y = "bundle_payment_option";

    /* renamed from: Z */
    public String f32104Z = "bundle_array_list_images";

    /* renamed from: com.mrsool.shopmenu.t$a */
    /* compiled from: MenuOrderBaseActivity */
    class C11413a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f32105a;

        C11413a(Dialog dialog) {
            this.f32105a = dialog;
        }

        public void onClick(View view) {
            this.f32105a.dismiss();
            C11412t.this.finish();
        }
    }

    /* renamed from: com.mrsool.shopmenu.t$b */
    /* compiled from: MenuOrderBaseActivity */
    class C11414b implements Callback<CheckDiscountBean> {

        /* renamed from: a */
        final /* synthetic */ boolean f32107a;

        /* renamed from: b */
        final /* synthetic */ boolean f32108b;

        /* renamed from: c */
        final /* synthetic */ boolean f32109c;

        /* renamed from: d */
        final /* synthetic */ String f32110d;

        /* renamed from: e */
        final /* synthetic */ int f32111e;

        C11414b(boolean z, boolean z2, boolean z3, String str, int i) {
            this.f32107a = z;
            this.f32108b = z2;
            this.f32109c = z3;
            this.f32110d = str;
            this.f32111e = i;
        }

        public void onFailure(Call<CheckDiscountBean> call, Throwable th) {
            C5887x xVar = C11412t.this.f29642a;
            if (xVar != null) {
                xVar.mo23492O();
                C11412t tVar = C11412t.this;
                tVar.mo39495i(tVar.getString(C10232R.string.msg_error_server_issue));
            }
        }

        public void onResponse(Call<CheckDiscountBean> call, Response<CheckDiscountBean> response) {
            if (C11412t.this.f29642a != null) {
                try {
                    if (!response.isSuccessful()) {
                        C11412t.this.mo39495i(response.message());
                    } else if (((CheckDiscountBean) response.body()).getCode().intValue() > 300) {
                        C11412t.this.mo39495i(((CheckDiscountBean) response.body()).getMessage());
                    } else if (this.f32107a) {
                        if (this.f32108b && !this.f32109c) {
                            C11412t.this.f29642a.mo23492O();
                        }
                        C11412t.this.f32100V.mo39119b(response);
                    } else if (!this.f32110d.equals(AppEventsConstants.EVENT_PARAM_VALUE_NO)) {
                        C11412t.this.f32100V.mo39118a(response, this.f32110d, this.f32111e);
                    } else {
                        if (this.f32108b && !this.f32109c) {
                            C11412t.this.f29642a.mo23492O();
                        }
                        C11412t.this.f32099U = (CheckDiscountBean) response.body();
                        C11412t.this.f32100V.mo39117a(response);
                        C11412t.this.f32100V.mo39119b(response);
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: i */
    public void mo39495i(String str) {
        try {
            Dialog dialog = new Dialog(this, C10232R.style.AlertCustomerDialogStyle);
            dialog.setContentView(C10232R.layout.dialog_show_ok);
            dialog.setCancelable(false);
            TextView textView = (TextView) dialog.findViewById(C10232R.C10236id.txtdOk);
            TextView textView2 = (TextView) dialog.findViewById(C10232R.C10236id.txtdMessage);
            ((TextView) dialog.findViewById(C10232R.C10236id.txtdTitle)).setText(getResources().getString(C10232R.string.app_name));
            textView2.setText(str);
            textView.setOnClickListener(new C11413a(dialog));
            if (!isFinishing()) {
                dialog.show();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f32097S = (AppSingleton) getApplicationContext();
    }

    /* renamed from: a */
    public void mo39493a(C11377m mVar) {
        this.f32100V = mVar;
    }

    /* renamed from: a */
    public void mo39494a(boolean z, boolean z2, String str, int i, boolean z3, boolean z4) {
        C5887x xVar = this.f29642a;
        if (xVar != null && xVar.mo23502X()) {
            if (z && !z4) {
                this.f29642a.mo23619g(getString(C10232R.string.app_name), getString(C10232R.string.lbl_dg_loader_loading));
            }
            HashMap hashMap = new HashMap();
            hashMap.put("current_user_id", this.f29642a.mo23476G());
            hashMap.put("auth_token", this.f29642a.mo23640m());
            hashMap.put(C11687c.f33862z0, this.f32097S.f16955b.getShop().getVShopId());
            hashMap.put(C11687c.f33719R0, this.f32098T ? "2" : "1");
            StringBuilder sb = new StringBuilder();
            sb.append("param: ");
            sb.append(hashMap);
            C5880q.m25751b(sb.toString());
            Call checkDiscountOptions = C11687c.m52645a(this.f29642a).checkDiscountOptions(this.f29642a.mo23476G(), hashMap);
            C11414b bVar = new C11414b(z3, z2, z4, str, i);
            checkDiscountOptions.enqueue(bVar);
        }
    }
}
