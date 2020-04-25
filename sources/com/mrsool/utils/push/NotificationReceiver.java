package com.mrsool.utils.push;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.C0807w;
import com.facebook.internal.ServerProtocol;
import com.mrsool.bean.DefaultBeanUrl;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C5880q;
import com.mrsool.utils.C5887x;
import com.mrsool.utils.webservice.C5882b;
import java.util.HashMap;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class NotificationReceiver extends BroadcastReceiver {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C5887x f33543a;

    /* renamed from: b */
    private String f33544b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f33545c = 0;

    /* renamed from: d */
    private Bundle f33546d;

    /* renamed from: e */
    private String f33547e;

    /* renamed from: f */
    private String f33548f;

    /* renamed from: g */
    private boolean f33549g;

    /* renamed from: h */
    Bundle f33550h;

    /* renamed from: com.mrsool.utils.push.NotificationReceiver$a */
    class C11661a implements Callback<DefaultBeanUrl> {
        C11661a() {
        }

        public void onFailure(Call<DefaultBeanUrl> call, Throwable th) {
        }

        public void onResponse(Call<DefaultBeanUrl> call, Response<DefaultBeanUrl> response) {
            try {
                if (NotificationReceiver.this.f33543a != null) {
                    NotificationReceiver.this.f33543a.mo23492O();
                    if (response.isSuccessful() && ((DefaultBeanUrl) response.body()).getCode() <= 300) {
                        C11644i.f33276d.cancel(NotificationReceiver.this.f33545c);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public NotificationReceiver() {
        String str = "";
        this.f33544b = str;
        this.f33547e = str;
        this.f33548f = str;
        this.f33549g = false;
    }

    public void onReceive(Context context, Intent intent) {
        this.f33543a = new C5887x(context);
        this.f33546d = intent.getExtras();
        m52563a();
        this.f33550h = C0807w.m4703b(intent);
        Bundle bundle = this.f33550h;
        if (bundle != null) {
            this.f33547e = bundle.getCharSequence("NotificationReply").toString();
            String str = this.f33548f;
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(System.currentTimeMillis());
            m52564a(str, sb.toString(), this.f33547e);
        }
    }

    /* renamed from: a */
    private void m52563a() {
        Bundle bundle = this.f33546d;
        if (bundle != null) {
            if (bundle.containsKey(C11644i.f33314h1)) {
                this.f33544b = this.f33546d.getString(C11644i.f33314h1);
            }
            if (this.f33546d.containsKey(C11644i.f33333j2)) {
                this.f33545c = this.f33546d.getInt(C11644i.f33333j2);
            }
            if (this.f33546d.containsKey(C11644i.f33342k2)) {
                this.f33548f = this.f33546d.getString(C11644i.f33342k2);
            }
        }
    }

    /* renamed from: a */
    private void m52564a(String str, String str2, String str3) {
        C5887x xVar = this.f33543a;
        if (xVar != null && xVar.mo23502X()) {
            HashMap hashMap = new HashMap();
            hashMap.put("iOrderId", this.f33544b);
            StringBuilder sb = new StringBuilder();
            String str4 = "";
            sb.append(str4);
            sb.append(str2);
            hashMap.put("vMessageId", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str4);
            sb2.append(this.f33543a.mo23476G());
            hashMap.put("iFromUserId", sb2.toString());
            hashMap.put("iToUserId", str);
            hashMap.put("txContent", str3);
            hashMap.put("vType", "text");
            hashMap.put("online", "1");
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str4);
            sb3.append(this.f33543a.mo23648p().latitude);
            hashMap.put("clatitude", sb3.toString());
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str4);
            sb4.append(this.f33543a.mo23648p().longitude);
            hashMap.put("clongitude", sb4.toString());
            hashMap.put("inline", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
            StringBuilder sb5 = new StringBuilder();
            sb5.append("param: ");
            sb5.append(hashMap);
            C5880q.m25751b(sb5.toString());
            C5882b.m25774a(this.f33543a).saveMessage(String.valueOf(this.f33544b), hashMap).enqueue(new C11661a());
        }
    }
}
