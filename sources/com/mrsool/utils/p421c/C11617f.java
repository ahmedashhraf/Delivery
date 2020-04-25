package com.mrsool.utils.p421c;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.mrsool.C10232R;
import com.mrsool.utils.AppSingleton;
import com.mrsool.utils.C5880q;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.mrsool.utils.c.f */
/* compiled from: FireBaseEvents */
public class C11617f {

    /* renamed from: a */
    private Context f32890a;

    /* renamed from: b */
    private AppSingleton f32891b;

    /* renamed from: c */
    public String f32892c = "MM-dd-yyyy hh:mm:ss.SSS a";

    public C11617f(Context context) {
        this.f32890a = context;
        this.f32891b = AppSingleton.m25737d();
    }

    /* renamed from: a */
    public void mo39863a(String str, String str2, String str3, String str4) {
        Bundle bundle = new Bundle();
        bundle.putString(this.f32890a.getResources().getString(C10232R.string.attr_store_name), str);
        bundle.putString(this.f32890a.getResources().getString(C10232R.string.attr_time_initiated), str2);
        bundle.putString(this.f32890a.getResources().getString(C10232R.string.attr_distance), str3);
        bundle.putString(this.f32890a.getResources().getString(C10232R.string.attr_time_dismissed), str4);
        StringBuilder sb = new StringBuilder();
        sb.append("event_order_dismissed :");
        sb.append(bundle);
        C5880q.m25751b(sb.toString());
        AppSingleton.f16951R.mo23273a(this.f32890a.getResources().getString(C10232R.string.event_order_dismissed), bundle);
    }

    /* renamed from: b */
    public void mo39867b(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        bundle.putString(this.f32890a.getResources().getString(C10232R.string.attr_store_name), str);
        bundle.putString(this.f32890a.getResources().getString(C10232R.string.attr_time_initiated), str2);
        bundle.putString(this.f32890a.getResources().getString(C10232R.string.attr_distance), str3);
        StringBuilder sb = new StringBuilder();
        sb.append("event_order_initiated :");
        sb.append(bundle);
        C5880q.m25751b(sb.toString());
        AppSingleton.f16951R.mo23273a(this.f32890a.getResources().getString(C10232R.string.event_order_initiated), bundle);
    }

    /* renamed from: c */
    public void mo39870c(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        bundle.putString(this.f32890a.getResources().getString(C10232R.string.attr_store_name), str);
        bundle.putString(this.f32890a.getResources().getString(C10232R.string.attr_time_placed), str2);
        bundle.putString(this.f32890a.getResources().getString(C10232R.string.attr_distance), str3);
        StringBuilder sb = new StringBuilder();
        sb.append("event_order_submitted :");
        sb.append(bundle);
        C5880q.m25751b(sb.toString());
        AppSingleton.f16951R.mo23273a(this.f32890a.getResources().getString(C10232R.string.event_order_submitted), bundle);
    }

    /* renamed from: d */
    public void mo39872d(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        bundle.putString(this.f32890a.getResources().getString(C10232R.string.attr_time), str);
        bundle.putString(this.f32890a.getResources().getString(C10232R.string.attr_value), str2);
        bundle.putString(this.f32890a.getResources().getString(C10232R.string.attr_order_id), str3);
        StringBuilder sb = new StringBuilder();
        sb.append("event_order_start :");
        sb.append(bundle);
        C5880q.m25751b(sb.toString());
        AppSingleton.f16951R.mo23273a(this.f32890a.getResources().getString(C10232R.string.event_order_start), bundle);
    }

    /* renamed from: e */
    public void mo39873e(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        bundle.putString(this.f32890a.getResources().getString(C10232R.string.attr_user_id), str);
        bundle.putString(this.f32890a.getResources().getString(C10232R.string.attr_time_signup), str2);
        bundle.putString(this.f32890a.getResources().getString(C10232R.string.attr_signup_method), str3);
        AppSingleton.f16951R.mo23273a(this.f32890a.getResources().getString(C10232R.string.event_sign_up), bundle);
    }

    /* renamed from: b */
    public void mo39869b(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Bundle bundle = new Bundle();
        bundle.putString(this.f32890a.getResources().getString(C10232R.string.attr_time_placed), str);
        bundle.putString(this.f32890a.getResources().getString(C10232R.string.attr_time_canceled), str2);
        bundle.putString(this.f32890a.getResources().getString(C10232R.string.attr_value), str3);
        bundle.putString(this.f32890a.getResources().getString(C10232R.string.attr_courier_rating), str4);
        bundle.putString(this.f32890a.getResources().getString(C10232R.string.attr_cancel_reason), str5);
        bundle.putString(this.f32890a.getResources().getString(C10232R.string.attr_order_id), str6);
        bundle.putString(this.f32890a.getResources().getString(C10232R.string.attr_order_started), str7);
        StringBuilder sb = new StringBuilder();
        sb.append("event_order_cancelled :");
        sb.append(bundle);
        C5880q.m25751b(sb.toString());
        AppSingleton.f16951R.mo23273a(this.f32890a.getResources().getString(C10232R.string.event_order_cancelled), bundle);
    }

    /* renamed from: c */
    public void mo39871c(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Bundle bundle = new Bundle();
        bundle.putString(this.f32890a.getResources().getString(C10232R.string.attr_time_placed), str);
        bundle.putString(this.f32890a.getResources().getString(C10232R.string.attr_time_withdraw), str7);
        bundle.putString(this.f32890a.getResources().getString(C10232R.string.attr_value), str2);
        bundle.putString(this.f32890a.getResources().getString(C10232R.string.attr_customer_rating), str3);
        bundle.putString(this.f32890a.getResources().getString(C10232R.string.attr_courier_rating), str4);
        bundle.putString(this.f32890a.getResources().getString(C10232R.string.attr_reason), str5);
        bundle.putString(this.f32890a.getResources().getString(C10232R.string.attr_order_id), str6);
        StringBuilder sb = new StringBuilder();
        sb.append("event_withdraw_courier :");
        sb.append(bundle);
        C5880q.m25751b(sb.toString());
        AppSingleton.f16951R.mo23273a(this.f32890a.getResources().getString(C10232R.string.event_withdraw_courier), bundle);
    }

    /* renamed from: a */
    public void mo39864a(String str, String str2, String str3, String str4, String str5) {
        Bundle bundle = new Bundle();
        bundle.putString(this.f32890a.getResources().getString(C10232R.string.attr_time_received), str);
        bundle.putString(this.f32890a.getResources().getString(C10232R.string.attr_value), str2);
        bundle.putString(this.f32890a.getResources().getString(C10232R.string.attr_courier_status), str3);
        bundle.putString(this.f32890a.getResources().getString(C10232R.string.attr_courier_rating), str4);
        bundle.putString(this.f32890a.getResources().getString(C10232R.string.attr_order_id), str5);
        StringBuilder sb = new StringBuilder();
        sb.append("event_offer_received :");
        sb.append(bundle);
        C5880q.m25751b(sb.toString());
        AppSingleton.f16951R.mo23273a(this.f32890a.getResources().getString(C10232R.string.event_offer_received), bundle);
    }

    /* renamed from: a */
    public void mo39862a(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        bundle.putString(this.f32890a.getResources().getString(C10232R.string.attr_value), str);
        bundle.putString(this.f32890a.getResources().getString(C10232R.string.attr_reason), str2);
        bundle.putString(this.f32890a.getResources().getString(C10232R.string.attr_order_id), str3);
        StringBuilder sb = new StringBuilder();
        sb.append("event_offer_rejected:");
        sb.append(bundle);
        C5880q.m25751b(sb.toString());
        AppSingleton.f16951R.mo23273a(this.f32890a.getResources().getString(C10232R.string.event_offer_rejected), bundle);
    }

    /* renamed from: b */
    public void mo39868b(String str, String str2, String str3, String str4, String str5) {
        Bundle bundle = new Bundle();
        bundle.putString(this.f32890a.getResources().getString(C10232R.string.attr_time_placed), str);
        bundle.putString(this.f32890a.getResources().getString(C10232R.string.attr_time_delivered), str2);
        bundle.putString(this.f32890a.getResources().getString(C10232R.string.attr_value), str3);
        bundle.putString(this.f32890a.getResources().getString(C10232R.string.attr_customer_rating), str4);
        bundle.putString(this.f32890a.getResources().getString(C10232R.string.attr_order_id), str5);
        StringBuilder sb = new StringBuilder();
        sb.append("event_order_delivered :");
        sb.append(bundle);
        C5880q.m25751b(sb.toString());
        AppSingleton.f16951R.mo23273a(this.f32890a.getResources().getString(C10232R.string.event_order_delivered), bundle);
    }

    /* renamed from: a */
    public void mo39866a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        Bundle bundle = new Bundle();
        bundle.putString(this.f32890a.getResources().getString(C10232R.string.attr_time_placed), str);
        bundle.putString(this.f32890a.getResources().getString(C10232R.string.attr_time_delivered), str2);
        bundle.putString(this.f32890a.getResources().getString(C10232R.string.attr_value), str3);
        bundle.putString(this.f32890a.getResources().getString(C10232R.string.attr_customer_rating), str4);
        bundle.putString(this.f32890a.getResources().getString(C10232R.string.attr_order_id), str6);
        bundle.putString(this.f32890a.getResources().getString(C10232R.string.attr_courier_rating), str5);
        bundle.putString(this.f32890a.getResources().getString(C10232R.string.attr_rating_value), str7);
        bundle.putString(this.f32890a.getResources().getString(C10232R.string.attr_rated_type), str8);
        StringBuilder sb = new StringBuilder();
        sb.append("event_order_rated :");
        sb.append(bundle);
        C5880q.m25751b(sb.toString());
        AppSingleton.f16951R.mo23273a(this.f32890a.getResources().getString(C10232R.string.event_order_rated), bundle);
    }

    /* renamed from: a */
    public void mo39865a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Bundle bundle = new Bundle();
        bundle.putString(this.f32890a.getResources().getString(C10232R.string.attr_time_placed), str);
        bundle.putString(this.f32890a.getResources().getString(C10232R.string.attr_value), str2);
        bundle.putString(this.f32890a.getResources().getString(C10232R.string.attr_customer_rating), str3);
        bundle.putString(this.f32890a.getResources().getString(C10232R.string.attr_courier_rating), str4);
        bundle.putString(this.f32890a.getResources().getString(C10232R.string.attr_reason), str5);
        bundle.putString(this.f32890a.getResources().getString(C10232R.string.attr_order_id), str6);
        bundle.putString(this.f32890a.getResources().getString(C10232R.string.attr_time_changed), str7);
        StringBuilder sb = new StringBuilder();
        sb.append("event_change_courier :");
        sb.append(bundle);
        C5880q.m25751b(sb.toString());
        AppSingleton.f16951R.mo23273a(this.f32890a.getResources().getString(C10232R.string.event_change_courier), bundle);
    }

    /* renamed from: a */
    public String mo39860a() {
        if (TextUtils.isEmpty(this.f32892c)) {
            return String.valueOf(System.currentTimeMillis());
        }
        return new SimpleDateFormat(this.f32892c, Locale.US).format(new Date());
    }

    /* renamed from: a */
    public String mo39861a(long j) {
        try {
            return new SimpleDateFormat(this.f32892c, Locale.US).format(Long.valueOf(j * 1000));
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
