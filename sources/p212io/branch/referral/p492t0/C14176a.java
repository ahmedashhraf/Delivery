package p212io.branch.referral.p492t0;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;
import p212io.branch.referral.C14126f;
import p212io.branch.referral.C14168s.C14169a;
import p212io.branch.referral.C6031o;

/* renamed from: io.branch.referral.t0.a */
/* compiled from: BranchIntegrationModel */
class C14176a {

    /* renamed from: a */
    JSONObject f41720a;

    /* renamed from: b */
    private final String f41721b;

    /* renamed from: c */
    private final String f41722c;

    /* renamed from: d */
    final List<String> f41723d = new ArrayList();

    /* renamed from: e */
    final String f41724e;

    /* renamed from: f */
    boolean f41725f = false;

    /* renamed from: io.branch.referral.t0.a$b */
    /* compiled from: BranchIntegrationModel */
    private class C14178b extends C14126f<Context, Void, JSONObject> {
        private C14178b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public JSONObject doInBackground(Context... contextArr) {
            return C6031o.m27709a(contextArr[0]);
        }
    }

    public C14176a(Context context) {
        String str;
        String str2;
        this.f41724e = context.getPackageName();
        String str3 = null;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo.metaData != null) {
                str2 = applicationInfo.metaData.getString("io.branch.sdk.BranchKey");
                try {
                    str3 = applicationInfo.metaData.getString("io.branch.sdk.BranchKey.test");
                } catch (NameNotFoundException e) {
                    e = e;
                    e.printStackTrace();
                    str = str3;
                    str3 = str2;
                    this.f41722c = str3;
                    this.f41721b = str;
                    m61326a(context);
                }
                str = str3;
                str3 = str2;
                this.f41722c = str3;
                this.f41721b = str;
                m61326a(context);
            }
            str = null;
            this.f41722c = str3;
            this.f41721b = str;
            m61326a(context);
        } catch (NameNotFoundException e2) {
            e = e2;
            str2 = null;
            e.printStackTrace();
            str = str3;
            str3 = str2;
            this.f41722c = str3;
            this.f41721b = str;
            m61326a(context);
        }
    }

    /* renamed from: a */
    private void m61326a(Context context) {
        JSONObject jSONObject;
        try {
            jSONObject = (JSONObject) new C14178b().mo44642a(context).get(2500, TimeUnit.MILLISECONDS);
            try {
                this.f41725f = true;
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            jSONObject = null;
        }
        if (jSONObject != null) {
            this.f41720a = jSONObject.optJSONObject(C14169a.URIScheme.mo44764d());
            JSONArray optJSONArray = jSONObject.optJSONArray(C14169a.AppLinks.mo44764d());
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    this.f41723d.add(optJSONArray.optString(i));
                }
            }
        }
    }
}
