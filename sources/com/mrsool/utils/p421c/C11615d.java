package com.mrsool.utils.p421c;

import android.content.Context;
import android.text.TextUtils;
import com.mrsool.C10232R;
import com.mrsool.utils.C5880q;
import com.mrsool.utils.C5887x;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.json.JSONObject;
import p212io.branch.referral.C6009d;

/* renamed from: com.mrsool.utils.c.d */
/* compiled from: BranchEvents */
public class C11615d {

    /* renamed from: a */
    private Context f32885a;

    /* renamed from: b */
    private C5887x f32886b;

    /* renamed from: c */
    public String f32887c = "MM-dd-yyyy hh:mm:ss.SSS a";

    public C11615d(Context context) {
        this.f32885a = context;
        this.f32886b = new C5887x(context);
    }

    /* renamed from: a */
    public void mo39857a(String... strArr) {
        JSONObject jSONObject = new JSONObject();
        try {
            String string = this.f32885a.getResources().getString(C10232R.string.brach_event_param_buyer_id);
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(strArr[0]);
            jSONObject.put(string, sb.toString());
            jSONObject.put(this.f32885a.getResources().getString(C10232R.string.brach_event_param_order_id), strArr[1]);
            C6009d.m27516c(this.f32885a).mo24767a(this.f32885a.getResources().getString(C10232R.string.branch_event_first_delivered_order), jSONObject);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("BRANCH_EVENT: ");
            sb2.append(this.f32885a.getResources().getString(C10232R.string.branch_event_first_delivered_order));
            sb2.append(" values :");
            sb2.append(jSONObject.toString());
            C5880q.m25751b(sb2.toString());
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public String mo39855a() {
        if (TextUtils.isEmpty(this.f32887c)) {
            return String.valueOf(System.currentTimeMillis());
        }
        return new SimpleDateFormat(this.f32887c, Locale.US).format(new Date());
    }

    /* renamed from: a */
    public String mo39856a(long j) {
        try {
            return new SimpleDateFormat(this.f32887c, Locale.US).format(Long.valueOf(j * 1000));
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
