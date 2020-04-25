package com.mrsool.auth;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.appcompat.app.C0295d;
import com.google.android.gms.auth.api.signin.C3984a;
import com.google.android.gms.auth.api.signin.C3986c;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions.C3983a;
import com.google.android.gms.common.C4420j;
import com.google.android.gms.tasks.C5560k;
import com.google.api.client.googleapis.extensions.android.gms.auth.C7242a;
import com.google.api.client.googleapis.extensions.android.gms.auth.UserRecoverableAuthIOException;
import com.google.api.client.googleapis.json.GoogleJsonResponseException;
import com.mrsool.C10232R;
import com.mrsool.HomeActivity;
import com.mrsool.bean.SingInBean;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C5880q;
import com.mrsool.utils.C5881v;
import com.mrsool.utils.C5887x;
import com.mrsool.utils.webservice.C11687c;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p076c.p112d.p134b.p135a.p136d.p259k.C6297a;
import p076c.p112d.p134b.p135a.p231b.p232a.p233b.C6182a;
import p076c.p112d.p134b.p271b.p272a.p273a.C6440a;
import p076c.p112d.p134b.p271b.p272a.p273a.C6440a.C6441a;
import p076c.p112d.p134b.p271b.p272a.p273a.p274e.C6470e;
import p076c.p112d.p134b.p271b.p272a.p273a.p274e.C6475g0;
import p076c.p112d.p134b.p271b.p272a.p273a.p274e.C6486m;
import p076c.p112d.p134b.p271b.p272a.p273a.p274e.C6498s;
import p212io.branch.referral.C6009d;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class GplusLoginActivity extends C0295d {

    /* renamed from: S */
    private static final String f27516S = "GplusLoginActivity";

    /* renamed from: T */
    private static final int f27517T = 9001;

    /* renamed from: N */
    private String f27518N = null;

    /* renamed from: O */
    private String f27519O = null;

    /* renamed from: P */
    private String f27520P = null;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public C5887x f27521Q;

    /* renamed from: R */
    private WeakReference<GplusLoginActivity> f27522R = new WeakReference<>(this);

    /* renamed from: a */
    private C3986c f27523a;

    /* renamed from: b */
    private String f27524b = null;

    /* renamed from: com.mrsool.auth.GplusLoginActivity$a */
    class C10268a implements Callback<SingInBean> {
        C10268a() {
        }

        public void onFailure(Call<SingInBean> call, Throwable th) {
            try {
                if (GplusLoginActivity.this.f27521Q != null) {
                    GplusLoginActivity.this.f27521Q.mo23492O();
                    GplusLoginActivity.this.f27521Q.mo23475F(GplusLoginActivity.this.getString(C10232R.string.msg_error_server_issue));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void onResponse(Call<SingInBean> call, Response<SingInBean> response) {
            String str = "user_id";
            try {
                if (GplusLoginActivity.this.f27521Q != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SignInApi response");
                    sb.append(response.toString());
                    C5880q.m25753d(sb.toString());
                    if (response.isSuccessful()) {
                        SingInBean singInBean = (SingInBean) response.body();
                        if (singInBean.getCode().intValue() <= 300) {
                            GplusLoginActivity.this.f27521Q.mo23468C().mo23448a(C11644i.f33135L5, singInBean.getbRegistered());
                            boolean booleanValue = singInBean.getbRegistered().booleanValue();
                            String str2 = C11644i.f33198T4;
                            if (!booleanValue) {
                                Intent intent = new Intent(GplusLoginActivity.this, LoginWithPhoneActivity.class);
                                intent.putExtra(C11644i.f33067D1, str2);
                                GplusLoginActivity.this.startActivity(intent);
                                GplusLoginActivity.this.finish();
                                return;
                            }
                            GplusLoginActivity.this.f27521Q.mo23468C().mo23449a(str, String.valueOf(singInBean.getIUserId()));
                            GplusLoginActivity.this.f27521Q.mo23468C().mo23448a(C11644i.f33435v5, singInBean.getBNotification());
                            GplusLoginActivity.this.f27521Q.mo23468C().mo23449a("language", singInBean.getVLanguage());
                            GplusLoginActivity.this.f27521Q.mo23468C().mo23449a(C11644i.f33443w5, singInBean.getAuth_token());
                            C11644i.f33186S0 = 2;
                            boolean booleanValue2 = singInBean.getBStatus().booleanValue();
                            String str3 = C11644i.f33246Z4;
                            if (booleanValue2) {
                                GplusLoginActivity.this.m47722C();
                                GplusLoginActivity.this.f27521Q.mo23479H(C11644i.f33214V4);
                                C6009d.m27516c(GplusLoginActivity.this.getApplicationContext()).mo24810e(GplusLoginActivity.this.getResources().getString(C10232R.string.branch_event_user_signup));
                                GplusLoginActivity.this.f27521Q.mo23468C().mo23448a(C11644i.f33411s5, singInBean.getCourier());
                                GplusLoginActivity.this.f27521Q.mo23468C().mo23448a(str3, Boolean.valueOf(true));
                                GplusLoginActivity.this.f27521Q.mo23468C().mo23448a(C11644i.f33230X4, Boolean.valueOf(false));
                                Intent intent2 = new Intent(GplusLoginActivity.this, HomeActivity.class);
                                intent2.setFlags(67108864);
                                intent2.setFlags(32768);
                                intent2.setFlags(268435456);
                                GplusLoginActivity.this.startActivity(intent2);
                                GplusLoginActivity.this.finish();
                                return;
                            }
                            GplusLoginActivity.this.f27521Q.mo23468C().mo23448a(str3, Boolean.valueOf(false));
                            Intent intent3 = new Intent(GplusLoginActivity.this, LoginWithPhoneActivity.class);
                            intent3.putExtra(str, String.valueOf(singInBean.getIUserId()));
                            intent3.putExtra(C11644i.f33067D1, str2);
                            GplusLoginActivity.this.startActivity(intent3);
                            GplusLoginActivity.this.finish();
                            return;
                        }
                        GplusLoginActivity.this.f27521Q.mo23475F(singInBean.getMessage());
                    } else if (GplusLoginActivity.this.f27521Q != null) {
                        GplusLoginActivity.this.f27521Q.mo23475F(response.message());
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.mrsool.auth.GplusLoginActivity$b */
    public class C10269b extends AsyncTask<Void, Void, C6475g0> {

        /* renamed from: a */
        private C6440a f27526a;

        /* renamed from: b */
        private int f27527b = -1;

        /* renamed from: c */
        private WeakReference<GplusLoginActivity> f27528c;

        /* renamed from: d */
        private String f27529d;

        C10269b(GoogleSignInAccount googleSignInAccount, WeakReference<GplusLoginActivity> weakReference, String str) {
            this.f27529d = str;
            this.f27528c = weakReference;
            C7242a a = C7242a.m34847a((Context) this.f27528c.get(), (Collection<String>) Collections.singleton(C4420j.f13552a));
            a.mo28763a(new Account(googleSignInAccount.mo17444O(), "com.google"));
            this.f27526a = new C6441a(C6182a.m28398a(), C6297a.m29246b(), a).m29872a("Google Sign In Quickstart").m29874a();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C6475g0 doInBackground(Void... voidArr) {
            try {
                return (C6475g0) this.f27526a.mo25890m().mo25939b("people/me").mo25965l("names,genders,birthdays").execute();
            } catch (UserRecoverableAuthIOException e) {
                e.printStackTrace();
                this.f27527b = 0;
            } catch (GoogleJsonResponseException e2) {
                e2.printStackTrace();
                this.f27527b = 1;
            } catch (IOException e3) {
                e3.printStackTrace();
                this.f27527b = 2;
            }
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(C6475g0 g0Var) {
            if (((GplusLoginActivity) this.f27528c.get()) != null) {
                int i = this.f27527b;
                if (!(i == 0 || i == 1 || i == 2 || i != -1)) {
                    GplusLoginActivity.this.f27521Q.mo23468C().mo23449a(C11644i.f33451x5, GplusLoginActivity.this.m47729b(g0Var));
                    GplusLoginActivity.this.f27521Q.mo23468C().mo23449a(C11644i.f33459y5, GplusLoginActivity.this.m47725a(g0Var));
                    StringBuilder sb = new StringBuilder();
                    sb.append("Birthday : > ");
                    sb.append(GplusLoginActivity.this.m47725a(g0Var));
                    C5880q.m25751b(sb.toString());
                }
                GplusLoginActivity.this.m47732c(true);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public void m47722C() {
        JSONObject jSONObject = new JSONObject();
        try {
            String string = getResources().getString(C10232R.string.brach_event_param_user_id);
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(this.f27521Q.mo23476G());
            jSONObject.put(string, sb.toString());
            jSONObject.put(getResources().getString(C10232R.string.brach_event_param_channel), "Google");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C6009d.m27516c(getApplicationContext()).mo24767a(getResources().getString(C10232R.string.branch_event_user_signin), jSONObject);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("BRANCH_EVENT: ");
        sb2.append(getResources().getString(C10232R.string.branch_event_user_signin));
        sb2.append(" values :");
        sb2.append(jSONObject.toString());
        C5880q.m25751b(sb2.toString());
    }

    /* renamed from: D */
    private void m47723D() {
        startActivityForResult(this.f27523a.mo17494k(), f27517T);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m47732c(boolean z) {
        String str;
        String str2;
        String str3;
        String str4;
        if (z) {
            String str5 = "\n\n";
            if (this.f27519O != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("User Id : ");
                sb.append(this.f27519O);
                sb.append(str5);
                str = sb.toString();
            } else {
                str = "User Id : Not Available \n\n";
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            if (this.f27524b != null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("User Email : ");
                sb3.append(this.f27524b);
                sb3.append(str5);
                str2 = sb3.toString();
            } else {
                str2 = "User Email : Not Available \n\n";
            }
            sb2.append(str2);
            String sb4 = sb2.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(sb4);
            if (this.f27518N != null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append("User Name : ");
                sb6.append(this.f27518N);
                sb6.append(str5);
                str3 = sb6.toString();
            } else {
                str3 = "User Name : Not Available\n\n";
            }
            sb5.append(str3);
            String sb7 = sb5.toString();
            StringBuilder sb8 = new StringBuilder();
            sb8.append(sb7);
            if (this.f27520P != null) {
                StringBuilder sb9 = new StringBuilder();
                sb9.append("Access Token : ");
                sb9.append(this.f27520P);
                sb9.append(str5);
                str4 = sb9.toString();
            } else {
                str4 = "Access Token : Not Available\n\n";
            }
            sb8.append(str4);
            sb8.toString();
            C3986c cVar = this.f27523a;
            if (cVar != null) {
                cVar.mo17496m();
            }
            if (this.f27521Q.mo23468C().mo23459f(C11644i.f33354l5) != null) {
                m47733e(C11644i.f33198T4);
                return;
            }
            setResult(-1, new Intent());
            finish();
            return;
        }
        this.f27521Q.mo23468C().mo23448a(C11644i.f33214V4, Boolean.valueOf(false));
        C5880q.m25753d("updateUI false");
        setResult(0, new Intent());
        finish();
    }

    /* renamed from: e */
    private void m47733e(String str) {
        this.f27521Q.mo23619g(getResources().getString(C10232R.string.app_name), getResources().getString(C10232R.string.lbl_dg_loader_please_wait));
        HashMap hashMap = new HashMap();
        boolean equals = str.equals(C11644i.f33190S4);
        String str2 = "vLanguage";
        String str3 = C11644i.f33273c5;
        String str4 = "vDeviceToken";
        String str5 = "vFullName";
        String str6 = "vProfilePic";
        String str7 = "vEmail";
        String str8 = C11644i.f33419t5;
        String str9 = "";
        if (equals) {
            hashMap.put("vFacbookId", this.f27521Q.mo23468C().mo23459f(C11644i.f33309g5));
            hashMap.put(str7, this.f27521Q.mo23468C().mo23459f(C11644i.f33318h5));
            C5881v C = this.f27521Q.mo23468C();
            String str10 = C11644i.f33327i5;
            if (C.mo23459f(str10) != null) {
                str9 = this.f27521Q.mo23468C().mo23459f(str10);
            }
            hashMap.put(str6, str9);
            hashMap.put(str5, this.f27521Q.mo23468C().mo23459f(C11644i.f33300f5));
            if (this.f27521Q.mo23468C().mo23459f(str8) != null) {
                str3 = this.f27521Q.mo23468C().mo23459f(str8);
            }
            hashMap.put(str4, str3);
            hashMap.put(str2, this.f27521Q.mo23478H());
        } else if (str.equals(C11644i.f33198T4)) {
            hashMap.put("vGoogleId", this.f27521Q.mo23468C().mo23459f(C11644i.f33345k5));
            hashMap.put(str7, this.f27521Q.mo23468C().mo23459f(C11644i.f33354l5));
            C5881v C2 = this.f27521Q.mo23468C();
            String str11 = C11644i.f33363m5;
            hashMap.put(str6, C2.mo23459f(str11) != null ? this.f27521Q.mo23468C().mo23459f(str11) : str9);
            hashMap.put(str5, this.f27521Q.mo23468C().mo23459f(C11644i.f33336j5));
            if (this.f27521Q.mo23468C().mo23459f(str8) != null) {
                str3 = this.f27521Q.mo23468C().mo23459f(str8);
            }
            hashMap.put(str4, str3);
            hashMap.put(str2, this.f27521Q.mo23478H());
            C5881v C3 = this.f27521Q.mo23468C();
            String str12 = C11644i.f33451x5;
            hashMap.put("vGender", !TextUtils.isEmpty(C3.mo23459f(str12)) ? this.f27521Q.mo23468C().mo23459f(str12) : str9);
            C5881v C4 = this.f27521Q.mo23468C();
            String str13 = C11644i.f33459y5;
            if (!TextUtils.isEmpty(C4.mo23459f(str13))) {
                str9 = this.f27521Q.mo23468C().mo23459f(str13);
            }
            hashMap.put("vBirthYear", str9);
        }
        hashMap.put("device_id", this.f27521Q.mo23669w());
        StringBuilder sb = new StringBuilder();
        sb.append("SignInApi params");
        sb.append(hashMap.toString());
        C5880q.m25753d(sb.toString());
        C11687c.m52645a(null).SignInApi(hashMap).enqueue(new C10268a());
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C5880q.m25753d("onActivityResult outside");
        if (i == f27517T) {
            C5880q.m25753d("login done");
            m47727a(C3984a.m17338a(intent));
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f27521Q = new C5887x(this);
        this.f27523a = C3984a.m17336a((Activity) this, new C3983a(GoogleSignInOptions.f12628b0).mo17479b().mo17478a());
        m47723D();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public String m47729b(C6475g0 g0Var) {
        List q = g0Var.mo26169q();
        if (q == null || q.size() <= 0) {
            return "";
        }
        String h = ((C6498s) q.get(0)).mo26323h();
        StringBuilder sb = new StringBuilder();
        sb.append("onPostExecute gender: ");
        sb.append(h);
        sb.toString();
        return h;
    }

    /* renamed from: a */
    private void m47727a(C5560k<GoogleSignInAccount> kVar) {
        if (kVar != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("handleSignInResult:");
            sb.append(kVar.mo22013e());
            C5880q.m25753d(sb.toString());
            if (kVar.mo22013e()) {
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) kVar.mo22008b();
                this.f27524b = googleSignInAccount.mo17444O();
                this.f27518N = googleSignInAccount.mo17443N();
                this.f27519O = googleSignInAccount.mo17448S();
                this.f27520P = googleSignInAccount.mo17449T();
                String str = "";
                if (this.f27524b.equalsIgnoreCase(this.f27518N) && TextUtils.isEmpty(googleSignInAccount.mo17446Q())) {
                    this.f27518N = str;
                }
                this.f27521Q.mo23468C().mo23449a(C11644i.f33345k5, this.f27519O);
                this.f27521Q.mo23468C().mo23449a(C11644i.f33336j5, this.f27518N);
                C5881v C = this.f27521Q.mo23468C();
                String str2 = this.f27524b;
                C.mo23449a(C11644i.f33354l5, (str2 == null || str2.length() <= 0) ? null : this.f27524b);
                Uri U = googleSignInAccount.mo17450U();
                String str3 = C11644i.f33363m5;
                if (U == null) {
                    this.f27521Q.mo23468C().mo23449a(str3, str);
                } else {
                    this.f27521Q.mo23468C().mo23449a(str3, googleSignInAccount.mo17450U().toString());
                }
                new C10269b(googleSignInAccount, this.f27522R, f27516S).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            } else {
                this.f27521Q.mo23468C().mo23448a(C11644i.f33214V4, Boolean.valueOf(false));
                m47732c(false);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public String m47725a(C6475g0 g0Var) {
        List<C6470e> j = g0Var.mo26156j();
        if (j != null && j.size() > 0) {
            for (C6470e f : j) {
                C6486m f2 = f.mo26071f();
                if (f2 != null && f2.mo26251h() != null) {
                    return f2.mo26251h().toString();
                }
            }
        }
        return "";
    }
}
