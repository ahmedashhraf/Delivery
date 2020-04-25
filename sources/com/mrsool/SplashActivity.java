package com.mrsool;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import androidx.core.app.C0727a;
import androidx.core.app.C0737c;
import androidx.core.content.C0841b;
import com.crashlytics.android.Crashlytics;
import com.fasterxml.jackson.core.p162w.C3868i;
import com.google.android.gms.tasks.C5551g;
import com.google.firebase.FirebaseApp;
import com.google.firebase.iid.C8677a;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.C8743a;
import com.mrsool.auth.ProfileActivity;
import com.mrsool.bean.UpdateInfoBean;
import com.mrsool.bean.XmppDetails;
import com.mrsool.utils.AppSingleton;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C5880q;
import com.mrsool.utils.C5881v;
import com.mrsool.utils.C5887x;
import com.mrsool.utils.webservice.C11687c;
import com.mrsool.utils.webservice.C11694e;
import java.lang.Thread.UncaughtExceptionHandler;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import org.jivesoftware.smackx.privacy.packet.PrivacyItem;
import org.json.JSONException;
import org.json.JSONObject;
import p053b.p072g.p073b.C2128a;
import p212io.branch.referral.C14130h;
import p212io.branch.referral.C6009d;
import p212io.branch.referral.C6009d.C6017h;
import p212io.fabric.sdk.android.C14215d;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SplashActivity extends C10787d {

    /* renamed from: S */
    private C6009d f27403S;

    /* renamed from: T */
    private ImageView f27404T;

    /* renamed from: U */
    private String f27405U;

    /* renamed from: V */
    private BroadcastReceiver f27406V = new C10241c();

    /* renamed from: W */
    BroadcastReceiver f27407W = new C10242d();

    /* renamed from: com.mrsool.SplashActivity$a */
    class C10239a implements UncaughtExceptionHandler {
        C10239a() {
        }

        public void uncaughtException(Thread thread, Throwable th) {
            SplashActivity.this.startActivity(new Intent(SplashActivity.this, SplashActivity.class));
            SplashActivity.this.finish();
            System.exit(2);
        }
    }

    /* renamed from: com.mrsool.SplashActivity$b */
    class C10240b implements C6017h {
        C10240b() {
        }

        /* renamed from: a */
        public void mo24851a(JSONObject jSONObject, C14130h hVar) {
            String str = "redirection_screen";
            String str2 = "type";
            String str3 = "shopid";
            if (hVar == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("BRANCH SDK Splash: ");
                sb.append(jSONObject.toString());
                C5880q.m25752c(sb.toString());
                try {
                    if (jSONObject.getBoolean("+clicked_branch_link")) {
                        C11644i.f33453y = true;
                        C11644i.f33065D = jSONObject.toString();
                        String str4 = "";
                        C11644i.f33461z = jSONObject.has(str3) ? jSONObject.getString(str3) : str4;
                        C11644i.f33041A = jSONObject.has(str2) ? jSONObject.getString(str2) : str4;
                        if (jSONObject.has(str)) {
                            str4 = jSONObject.getString(str);
                        }
                        C11644i.f33057C = str4;
                        C11644i.f33049B = SplashActivity.this.m47621a(jSONObject);
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("BRANCH SDK : ");
                sb2.append(hVar.mo44646b());
                C5880q.m25752c(sb2.toString());
            }
            SplashActivity.this.m47607L();
        }
    }

    /* renamed from: com.mrsool.SplashActivity$c */
    class C10241c extends BroadcastReceiver {
        C10241c() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equalsIgnoreCase(C11644i.f33402r4) && SplashActivity.this.f29642a.mo23562a(1)) {
                SplashActivity.this.m47605J();
            }
        }
    }

    /* renamed from: com.mrsool.SplashActivity$d */
    class C10242d extends BroadcastReceiver {
        C10242d() {
        }

        public void onReceive(Context context, Intent intent) {
            String stringExtra = intent.getStringExtra(C11644i.f33170Q0);
            StringBuilder sb = new StringBuilder();
            sb.append(C11644i.f33149N3);
            sb.append(stringExtra);
            C5880q.m25753d(sb.toString());
            if (stringExtra != null && stringExtra.length() > 0) {
                C5881v C = SplashActivity.this.f29642a.mo23468C();
                String str = C11644i.f33419t5;
                C.mo23449a(str, stringExtra);
                C5887x xVar = SplashActivity.this.f29642a;
                if (xVar.mo23661t(xVar.mo23468C().mo23459f(str)) == null) {
                    SplashActivity.this.f29642a.mo23468C().mo23449a(str, stringExtra);
                } else if (!SplashActivity.this.f29642a.mo23468C().mo23459f(str).equalsIgnoreCase(stringExtra)) {
                    SplashActivity.this.f29642a.mo23468C().mo23449a(str, stringExtra);
                    if (SplashActivity.this.f29642a.mo23585b0()) {
                        SplashActivity.this.m47626c(false);
                    }
                }
            }
        }
    }

    /* renamed from: com.mrsool.SplashActivity$e */
    class C10243e implements C5551g<C8677a> {
        C10243e() {
        }

        /* renamed from: a */
        public void onSuccess(C8677a aVar) {
            String token = aVar.getToken();
            SplashActivity.this.f29642a.mo23468C().mo23449a(C11644i.f33419t5, token);
            StringBuilder sb = new StringBuilder();
            sb.append("firebase_token:");
            sb.append(token);
            C5880q.m25753d(sb.toString());
            AppSingleton.f16949P.mo12449a(token, true);
            C5881v D = SplashActivity.this.f29642a.mo23470D();
            String str = C11644i.f33047A5;
            if (D.mo23450a(str) || !SplashActivity.this.f29642a.mo23585b0()) {
                SplashActivity.this.m47613R();
                return;
            }
            SplashActivity.this.f29642a.mo23470D().mo23448a(str, Boolean.valueOf(true));
            SplashActivity.this.m47626c(true);
        }
    }

    /* renamed from: com.mrsool.SplashActivity$f */
    class C10244f implements Runnable {
        C10244f() {
        }

        public void run() {
            if (!SplashActivity.this.f29642a.mo23470D().mo23455b(C11644i.f33196T2)) {
                SplashActivity.this.m47611P();
            } else if (!SplashActivity.this.f29642a.mo23468C().mo23455b(C11644i.f33238Y4)) {
                SplashActivity.this.m47614S();
            } else {
                SplashActivity.this.m47612Q();
            }
        }
    }

    /* renamed from: com.mrsool.SplashActivity$g */
    class C10245g implements Callback<UpdateInfoBean> {

        /* renamed from: a */
        final /* synthetic */ boolean f27414a;

        C10245g(boolean z) {
            this.f27414a = z;
        }

        public void onFailure(Call<UpdateInfoBean> call, Throwable th) {
            try {
                if (SplashActivity.this.f29642a != null) {
                    SplashActivity.this.f29642a.mo23492O();
                    SplashActivity.this.f29642a.mo23591c((Context) SplashActivity.this);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void onResponse(Call<UpdateInfoBean> call, Response<UpdateInfoBean> response) {
            try {
                if (SplashActivity.this.f29642a != null) {
                    SplashActivity.this.f29642a.mo23492O();
                    if (response.isSuccessful()) {
                        SplashActivity.this.f29642a.mo23468C().mo23448a(C11644i.f33411s5, Boolean.valueOf(((UpdateInfoBean) response.body()).isCourier()));
                    } else if (SplashActivity.this.f29642a != null) {
                        SplashActivity.this.f29642a.mo23576b((Context) SplashActivity.this, response.message());
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (this.f27414a) {
                SplashActivity.this.m47613R();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public void m47605J() {
        C2128a.m11089a((Context) this).mo9218a(this.f27407W, new IntentFilter(C11644i.f33149N3));
        C8743a.m41002b().mo32244a("Message");
        FirebaseInstanceId.m40758n().mo32073d().mo21989a((Activity) this, (C5551g<? super TResult>) new C10243e<Object>());
    }

    /* renamed from: K */
    private void m47606K() {
        if (this.f27403S == null) {
            this.f27403S = C6009d.m27463J();
        }
        this.f27403S.mo24778a((C6017h) new C10240b(), getIntent().getData(), (Activity) this);
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public void m47607L() {
        this.f29642a = new C5887x(this);
        C5887x xVar = this.f29642a;
        xVar.mo23477G(xVar.mo23470D().mo23460g("language"));
        if (this.f29642a.mo23562a(1)) {
            m47605J();
        }
        this.f29642a.mo23540a(this.f27406V, C11644i.f33402r4);
    }

    /* renamed from: M */
    private void m47608M() {
        try {
            FirebaseApp.m40522b((Context) this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: N */
    private void m47609N() {
        Signature[] signatureArr;
        String str = "KeyHash:";
        try {
            for (Signature signature : getPackageManager().getPackageInfo(getPackageName(), 64).signatures) {
                MessageDigest instance = MessageDigest.getInstance("SHA");
                instance.update(signature.toByteArray());
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(Base64.encodeToString(instance.digest(), 0));
                sb.toString();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(Base64.encodeToString(instance.digest(), 0));
                C5880q.m25750a(sb2.toString());
                this.f29642a.mo23554a("test ", Base64.encodeToString(instance.digest(), 0));
            }
        } catch (NameNotFoundException | NoSuchAlgorithmException unused) {
        }
    }

    /* renamed from: O */
    private void m47610O() {
        try {
            Intent intent = new Intent(this, HomeActivity.class);
            intent.putExtra(C11644i.f33407s1, true);
            intent.setFlags(67108864);
            intent.setFlags(268435456);
            intent.setFlags(32768);
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    @SuppressLint({"RestrictedApi"})
    /* renamed from: P */
    public void m47611P() {
        C5887x xVar = this.f29642a;
        String str = C11644i.f33191S5;
        xVar.mo23477G(str);
        this.f29642a.mo23470D().mo23454b("language", str);
        Intent intent = new Intent(this, ChangeLanguageActivity.class);
        if (VERSION.SDK_INT >= 21) {
            try {
                intent.putExtra(C11644i.f33392q2, true);
                C0727a.m4240a(this, intent, 1006, C0737c.m4272a((Activity) this, (View) this.f27404T, getString(C10232R.string.lbl_transition_logo)).mo4091b());
            } catch (Exception e) {
                e.printStackTrace();
                intent.putExtra(C11644i.f33392q2, false);
                startActivityForResult(intent, 1006);
            }
        } else {
            startActivityForResult(intent, 1006);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Q */
    public void m47612Q() {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(C11644i.f33324i2, "Splash");
        if (VERSION.SDK_INT >= 21) {
            try {
                intent.putExtra(C11644i.f33392q2, true);
                getWindow().setExitTransition(null);
                C0841b.m4921a((Context) this, intent, C0737c.m4272a((Activity) this, (View) this.f27404T, getString(C10232R.string.lbl_transition_logo)).mo4091b());
            } catch (Exception e) {
                e.printStackTrace();
                intent.putExtra(C11644i.f33392q2, false);
                startActivity(intent);
                finish();
            }
        } else {
            startActivity(intent);
            finish();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: R */
    public void m47613R() {
        C11644i.f33161P = true;
        C5881v C = this.f29642a.mo23468C();
        String str = C11644i.f33246Z4;
        if (C.mo23450a(str)) {
            m47610O();
            return;
        }
        boolean a = this.f29642a.mo23468C().mo23450a(C11644i.f33222W4);
        String str2 = C11644i.f33214V4;
        String str3 = C11644i.f33206U4;
        if ((a || this.f29642a.mo23468C().mo23450a(str3) || this.f29642a.mo23468C().mo23450a(str2)) && !this.f29642a.mo23468C().mo23450a(str)) {
            m47615T();
        } else if (((!this.f29642a.mo23468C().mo23450a(str3) || this.f29642a.mo23468C().mo23459f(C11644i.f33318h5) == null) && (!this.f29642a.mo23468C().mo23450a(str2) || this.f29642a.mo23468C().mo23459f(C11644i.f33354l5) == null)) || this.f29642a.mo23468C().mo23450a(str)) {
            new Handler().postDelayed(new C10244f(), (long) C11644i.f33389q);
        } else {
            m47612Q();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: S */
    public void m47614S() {
        Intent intent = new Intent(this, StartActivityNew.class);
        intent.putExtra("isFromSplash", true);
        intent.addFlags(604012544);
        startActivity(intent);
        finish();
    }

    /* renamed from: T */
    private void m47615T() {
        Intent intent = new Intent(this, ProfileActivity.class);
        intent.addFlags(67108864);
        intent.addFlags(268435456);
        intent.setFlags(32768);
        intent.putExtra(PrivacyItem.SUBSCRIPTION_FROM, "home");
        startActivityForResult(intent, 1021);
        finish();
    }

    /* renamed from: U */
    private void m47616U() {
        if (getIntent().getData() != null) {
            this.f27405U = getIntent().getData().toString();
        }
        C6009d.m27463J().mo24812f("$criteo_deep_link_url", this.f27405U);
    }

    /* renamed from: V */
    private void m47617V() {
        Configuration configuration = getResources().getConfiguration();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        this.f29642a.mo23468C().mo23446a(C11644i.f33220W2, configuration.fontScale);
        this.f29642a.mo23468C().mo23446a(C11644i.f33236Y2, displayMetrics.scaledDensity);
        this.f29642a.mo23468C().mo23447a(C11644i.f33228X2, displayMetrics.densityDpi);
    }

    /* renamed from: W */
    private void m47618W() {
        Thread.setDefaultUncaughtExceptionHandler(new C10239a());
        C14215d.m61661a((Context) this, new Crashlytics());
    }

    /* renamed from: X */
    private void m47619X() {
        XmppDetails I = this.f29642a.mo23480I();
        if (I == null) {
            I = new XmppDetails(C11644i.f33331j0, C11644i.f33322i0, C11644i.f33340k0, C11644i.f33349l0.booleanValue());
            this.f29642a.mo23552a(I);
        }
        C11694e.SERVICE = I.getDomain();
        C11694e.HOST = I.getHost();
        C11694e.PORT = Integer.parseInt(TextUtils.isEmpty(I.getPort()) ? C11644i.f33340k0 : I.getPort());
        C11694e.IS_TLS = Boolean.valueOf(I.isTls());
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 1006) {
            C5887x xVar = this.f29642a;
            xVar.mo23477G(xVar.mo23470D().mo23460g("language"));
            if (!C11644i.f33453y) {
                m47614S();
                return;
            }
            this.f29642a.mo23468C().mo23448a(C11644i.f33230X4, Boolean.valueOf(true));
            this.f29642a.mo23468C().mo23453b(C11644i.f33238Y4, Boolean.valueOf(true));
            this.f29642a.mo23581b(true);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m47618W();
        setContentView((int) C10232R.layout.activity_splash_new);
        m47616U();
        if (VERSION.SDK_INT >= 21) {
            getWindow().setExitTransition(null);
        }
        this.f27404T = (ImageView) findViewById(C10232R.C10236id.imgLogo);
        C11644i.f33161P = false;
        C11644i.f33453y = false;
        m47608M();
        if (isTaskRoot() || !getIntent().hasCategory("android.intent.category.LAUNCHER") || getIntent().getAction() == null || !getIntent().getAction().equals("android.intent.action.MAIN")) {
            m47606K();
        } else {
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        try {
            C11644i.f33225X = false;
            this.f29642a.mo23539a(this.f27406V);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        m47616U();
        super.onNewIntent(intent);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        try {
            if (this.f27407W != null) {
                C2128a.m11089a((Context) this).mo9217a(this.f27407W);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        try {
            C11644i.f33225X = true;
            this.f29642a.mo23635k0();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m47626c(boolean z) {
        if (this.f29642a != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("id", this.f29642a.mo23468C().mo23459f("user_id"));
            StringBuilder sb = new StringBuilder();
            sb.append(Build.MANUFACTURER);
            sb.append(C3868i.f12248b);
            sb.append(Build.MODEL);
            hashMap.put("vDeviceVersion", String.valueOf(sb.toString()));
            hashMap.put("vOSVersion", String.valueOf(VERSION.SDK_INT));
            hashMap.put("vAppVersion", String.valueOf(this.f29642a.mo23633k()));
            C5881v C = this.f29642a.mo23468C();
            String str = C11644i.f33419t5;
            hashMap.put("vDeviceToken", C.mo23459f(str) != null ? this.f29642a.mo23468C().mo23459f(str) : C11644i.f33273c5);
            hashMap.put("vLanguage", this.f29642a.mo23478H());
            hashMap.put("device_id", this.f29642a.mo23669w());
            StringBuilder sb2 = new StringBuilder();
            String str2 = "";
            sb2.append(str2);
            sb2.append(C5887x.m25816e((Context) this));
            hashMap.put("inst_package_name", sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str2);
            sb3.append(C5887x.m25813d((Context) this));
            hashMap.put("app_sign", sb3.toString());
            StringBuilder sb4 = new StringBuilder();
            sb4.append("UpdateDeviceInfo()==>");
            sb4.append(hashMap);
            C5880q.m25751b(sb4.toString());
            C11687c.m52645a(this.f29642a).UpdateDeviceInfo(hashMap).enqueue(new C10245g(z));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public String m47621a(JSONObject jSONObject) {
        String str = "~referring_link";
        String str2 = "";
        if (jSONObject != null) {
            try {
                String string = jSONObject.has(str) ? jSONObject.getString(str) : str2;
                if (!TextUtils.isEmpty(string)) {
                    return Uri.parse(string).getQueryParameter(C11687c.f33725S2);
                }
            } catch (Exception unused) {
            }
        }
        return str2;
    }
}
