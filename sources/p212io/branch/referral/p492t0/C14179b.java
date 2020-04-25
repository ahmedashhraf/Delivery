package p212io.branch.referral.p492t0;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Handler;
import android.text.TextUtils;
import com.facebook.appevents.UserDataStore;
import java.lang.ref.WeakReference;
import org.jivesoftware.smack.p557sm.packet.StreamManagement.AckRequest;
import org.json.JSONObject;
import p212io.branch.referral.C14168s.C14169a;
import p212io.branch.referral.C6009d;

/* renamed from: io.branch.referral.t0.b */
/* compiled from: DeepLinkRoutingValidator */
public class C14179b {

    /* renamed from: a */
    private static final String f41727a = "bnc_validate";

    /* renamed from: b */
    private static final String f41728b = "validate";

    /* renamed from: c */
    private static final String f41729c = "_branch_validate";

    /* renamed from: d */
    private static final int f41730d = 60514;

    /* renamed from: e */
    private static final String f41731e = "$uri_redirect_mode";

    /* renamed from: f */
    private static final String f41732f = "2";

    /* renamed from: g */
    private static final int f41733g = 500;

    /* renamed from: h */
    private static WeakReference<Activity> f41734h;

    /* renamed from: io.branch.referral.t0.b$a */
    /* compiled from: DeepLinkRoutingValidator */
    static class C14180a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ JSONObject f41735a;

        C14180a(JSONObject jSONObject) {
            this.f41735a = jSONObject;
        }

        public void run() {
            C14179b.m61335b(C14179b.m61334b(this.f41735a, ""));
        }
    }

    /* renamed from: io.branch.referral.t0.b$b */
    /* compiled from: DeepLinkRoutingValidator */
    static class C14181b implements OnClickListener {
        C14181b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: io.branch.referral.t0.b$c */
    /* compiled from: DeepLinkRoutingValidator */
    static class C14182c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ JSONObject f41736a;

        C14182c(JSONObject jSONObject) {
            this.f41736a = jSONObject;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C14179b.m61335b(C14179b.m61334b(this.f41736a, AckRequest.ELEMENT));
        }
    }

    /* renamed from: io.branch.referral.t0.b$d */
    /* compiled from: DeepLinkRoutingValidator */
    static class C14183d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ JSONObject f41737a;

        C14183d(JSONObject jSONObject) {
            this.f41737a = jSONObject;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C14179b.m61335b(C14179b.m61334b(this.f41737a, "g"));
        }
    }

    /* renamed from: io.branch.referral.t0.b$e */
    /* compiled from: DeepLinkRoutingValidator */
    static class C14184e implements OnClickListener {
        C14184e() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m61335b(String str) {
        if (f41734h.get() != null) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str).buildUpon().appendQueryParameter(f41731e, "2").build());
            intent.addFlags(268435456);
            intent.setPackage("com.android.chrome");
            ((Activity) f41734h.get()).getPackageManager().queryIntentActivities(intent, 0);
            try {
                ((Activity) f41734h.get()).startActivity(intent);
            } catch (ActivityNotFoundException unused) {
                intent.setPackage(null);
                ((Activity) f41734h.get()).startActivity(intent);
            }
        }
    }

    /* renamed from: a */
    public static void m61331a(WeakReference<Activity> weakReference) {
        f41734h = weakReference;
        if (!TextUtils.isEmpty(m61333b()) && weakReference != null) {
            JSONObject m = C6009d.m27463J().mo24819m();
            if (m.optInt(f41729c) == f41730d) {
                if (m.optBoolean(C14169a.Clicked_Branch_Link.mo44764d())) {
                    m61332a(m);
                } else {
                    m61329a();
                }
            } else if (m.optBoolean(f41727a)) {
                new Handler().postDelayed(new C14180a(m), 500);
            }
        }
    }

    /* renamed from: a */
    private static void m61332a(JSONObject jSONObject) {
        Builder builder;
        if (f41734h.get() != null) {
            if (VERSION.SDK_INT >= 21) {
                builder = new Builder((Context) f41734h.get(), 16974374);
            } else {
                builder = new Builder((Context) f41734h.get());
            }
            builder.setTitle("Branch Deeplinking Routing").setMessage("Good news - we got link data. Now a question for you, astute developer: did the app deep link to the specific piece of content you expected to see?").setPositiveButton("Yes", new C14183d(jSONObject)).setNegativeButton("No", new C14182c(jSONObject)).setNeutralButton(17039360, new C14181b()).setCancelable(false).setIcon(17301651).show();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static String m61334b(JSONObject jSONObject, String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7 = "t5";
        String str8 = "t4";
        String str9 = "t3";
        String str10 = "t2";
        String str11 = "t1";
        String str12 = UserDataStore.CITY;
        String str13 = "";
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("~");
            sb.append(C14169a.ReferringLink.mo44764d());
            str13 = jSONObject.getString(sb.toString()).split("\\?")[0];
        } catch (Exception unused) {
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str13);
        sb2.append("?validate=true");
        String sb3 = sb2.toString();
        if (!TextUtils.isEmpty(str)) {
            try {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(sb3);
                String str14 = "&t1=";
                if (jSONObject.getString(str12).equals(str11)) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(str14);
                    sb5.append(str);
                    str2 = sb5.toString();
                } else {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(str14);
                    sb6.append(jSONObject.getString(str11));
                    str2 = sb6.toString();
                }
                sb4.append(str2);
                sb3 = sb4.toString();
                StringBuilder sb7 = new StringBuilder();
                sb7.append(sb3);
                String str15 = "&t2=";
                if (jSONObject.getString(str12).equals(str10)) {
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append(str15);
                    sb8.append(str);
                    str3 = sb8.toString();
                } else {
                    StringBuilder sb9 = new StringBuilder();
                    sb9.append(str15);
                    sb9.append(jSONObject.getString(str10));
                    str3 = sb9.toString();
                }
                sb7.append(str3);
                sb3 = sb7.toString();
                StringBuilder sb10 = new StringBuilder();
                sb10.append(sb3);
                String str16 = "&t3=";
                if (jSONObject.getString(str12).equals(str9)) {
                    StringBuilder sb11 = new StringBuilder();
                    sb11.append(str16);
                    sb11.append(str);
                    str4 = sb11.toString();
                } else {
                    StringBuilder sb12 = new StringBuilder();
                    sb12.append(str16);
                    sb12.append(jSONObject.getString(str9));
                    str4 = sb12.toString();
                }
                sb10.append(str4);
                sb3 = sb10.toString();
                StringBuilder sb13 = new StringBuilder();
                sb13.append(sb3);
                String str17 = "&t4=";
                if (jSONObject.getString(str12).equals(str8)) {
                    StringBuilder sb14 = new StringBuilder();
                    sb14.append(str17);
                    sb14.append(str);
                    str5 = sb14.toString();
                } else {
                    StringBuilder sb15 = new StringBuilder();
                    sb15.append(str17);
                    sb15.append(jSONObject.getString(str8));
                    str5 = sb15.toString();
                }
                sb13.append(str5);
                sb3 = sb13.toString();
                StringBuilder sb16 = new StringBuilder();
                sb16.append(sb3);
                String str18 = "&t5=";
                if (jSONObject.getString(str12).equals(str7)) {
                    StringBuilder sb17 = new StringBuilder();
                    sb17.append(str18);
                    sb17.append(str);
                    str6 = sb17.toString();
                } else {
                    StringBuilder sb18 = new StringBuilder();
                    sb18.append(str18);
                    sb18.append(jSONObject.getString(str7));
                    str6 = sb18.toString();
                }
                sb16.append(str6);
                sb3 = sb16.toString();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        StringBuilder sb19 = new StringBuilder();
        sb19.append(sb3);
        sb19.append("&os=android");
        return sb19.toString();
    }

    /* renamed from: b */
    private static String m61333b() {
        if (C6009d.m27463J() == null || C6009d.m27463J().mo24819m() == null) {
            return "";
        }
        JSONObject m = C6009d.m27463J().mo24819m();
        StringBuilder sb = new StringBuilder();
        sb.append("~");
        sb.append(C14169a.ReferringLink.mo44764d());
        return m.optString(sb.toString());
    }

    /* renamed from: a */
    private static void m61329a() {
        Builder builder;
        if (f41734h.get() != null) {
            if (VERSION.SDK_INT >= 21) {
                builder = new Builder((Context) f41734h.get(), 16974374);
            } else {
                builder = new Builder((Context) f41734h.get());
            }
            builder.setTitle("Branch Deeplink Routing Support").setMessage("Bummer. It seems like +clicked_branch_link is false - we didn't deep link.  Double check that the link you're clicking has the same branch_key that is being used in your Manifest file. Return to Chrome when you're ready to test again.").setNeutralButton("Got it", new C14184e()).setCancelable(false).setIcon(17301651).show();
        }
    }
}
