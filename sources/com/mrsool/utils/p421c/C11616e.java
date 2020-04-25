package com.mrsool.utils.p421c;

import android.content.Context;
import android.text.TextUtils;
import com.mrsool.C10232R;
import com.mrsool.bean.CTEventBean;
import com.mrsool.bean.ShopDetails;
import com.mrsool.utils.AppSingleton;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C5880q;
import com.mrsool.utils.C5881v;
import com.mrsool.utils.C5887x;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.mrsool.utils.c.e */
/* compiled from: CleverTapEvents */
public class C11616e {

    /* renamed from: a */
    private Context f32888a;

    /* renamed from: b */
    private C5887x f32889b;

    public C11616e(Context context) {
        this.f32888a = context;
        this.f32889b = new C5887x(context);
    }

    /* renamed from: b */
    private boolean m52323b(String str) {
        try {
            C5881v D = this.f32889b.mo23470D();
            StringBuilder sb = new StringBuilder();
            sb.append("cancel_order_disabled_");
            sb.append(str);
            return !D.mo23455b(sb.toString());
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public void mo39858a(ShopDetails shopDetails, String str, CTEventBean cTEventBean) {
        if (shopDetails != null) {
            try {
                HashMap hashMap = new HashMap();
                hashMap.put(this.f32888a.getString(C10232R.string.ct_event_param_shopid), shopDetails.getShop().getVShopId());
                hashMap.put(this.f32888a.getString(C10232R.string.ct_event_param_shopname), m52322a(str) ? shopDetails.getShop().getvTitle() : shopDetails.getShop().getVName());
                hashMap.put(this.f32888a.getString(C10232R.string.ct_event_param_service_type), str);
                hashMap.put(this.f32888a.getString(C10232R.string.ct_event_param_type), this.f32889b.mo23471D(shopDetails.getShop().getVType()));
                hashMap.put(this.f32888a.getString(C10232R.string.ct_event_param_promotion), this.f32889b.mo23471D(shopDetails.getShop().getPromotionType()));
                hashMap.put(this.f32888a.getString(C10232R.string.ct_event_param_coming_from), this.f32889b.mo23471D(cTEventBean.getCommingFrom()));
                hashMap.put(this.f32888a.getString(C10232R.string.ct_event_param_value_additional_detail), this.f32889b.mo23471D(cTEventBean.getAdditionalDetail()));
                hashMap.put(this.f32888a.getString(C10232R.string.ct_event_param_value_list_index), this.f32889b.mo23471D(cTEventBean.getListIndex()));
                AppSingleton.f16949P.mo12448a(this.f32888a.getString(C10232R.string.ct_event_shop_opened), (Map<String, Object>) hashMap);
                StringBuilder sb = new StringBuilder();
                sb.append("shopViewedAction :>> ");
                sb.append(hashMap);
                C5880q.m25751b(sb.toString());
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    private boolean m52322a(String str) {
        return str.equalsIgnoreCase(C11644i.f33253a3);
    }

    /* renamed from: a */
    public void mo39859a(boolean z, String str) {
        String str2;
        if (m52323b(str)) {
            HashMap hashMap = new HashMap();
            hashMap.put(this.f32888a.getString(C10232R.string.ct_event_param_age), m52321a());
            hashMap.put(this.f32888a.getString(C10232R.string.ct_event_param_gender), this.f32889b.mo23666v());
            String string = this.f32888a.getString(C10232R.string.ct_event_param_type);
            if (z) {
                str2 = this.f32888a.getString(C10232R.string.ct_event_param_value_buyer);
            } else {
                str2 = this.f32888a.getString(C10232R.string.ct_event_param_value_courier);
            }
            hashMap.put(string, str2);
            StringBuilder sb = new StringBuilder();
            sb.append("logCancelWithdrawCtEvent :>> ");
            sb.append(hashMap);
            C5880q.m25751b(sb.toString());
            AppSingleton.f16949P.mo12448a(this.f32888a.getString(C10232R.string.ct_event_cancel_order_disabled), (Map<String, Object>) hashMap);
            C5881v D = this.f32889b.mo23470D();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("cancel_order_disabled_");
            sb2.append(str);
            D.mo23453b(sb2.toString(), Boolean.valueOf(true));
        }
    }

    /* renamed from: a */
    private String m52321a() {
        String str = "";
        try {
            if (TextUtils.isEmpty(C11644i.f33072D6.getUser().getvBirthYear())) {
                return str;
            }
            int i = Calendar.getInstance().get(1);
            int parseInt = Integer.parseInt(C11644i.f33072D6.getUser().getvBirthYear());
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(i - parseInt);
            str = sb.toString();
            return str;
        } catch (Exception unused) {
        }
    }
}
