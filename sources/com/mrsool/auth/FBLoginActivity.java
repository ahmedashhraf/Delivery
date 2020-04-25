package com.mrsool.auth;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.appcompat.app.C0295d;
import com.facebook.AccessToken;
import com.facebook.AccessTokenTracker;
import com.facebook.CallbackManager;
import com.facebook.CallbackManager.Factory;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest.GraphJSONObjectCallback;
import com.facebook.GraphResponse;
import com.facebook.Profile;
import com.facebook.ProfileTracker;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.mrsool.C10232R;
import com.mrsool.HomeActivity;
import com.mrsool.bean.SingInBean;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C5880q;
import com.mrsool.utils.C5881v;
import com.mrsool.utils.C5887x;
import com.mrsool.utils.webservice.C11687c;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
import p212io.branch.referral.C6009d;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FBLoginActivity extends C0295d {

    /* renamed from: N */
    private ProfileTracker f27501N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public AccessToken f27502O;

    /* renamed from: P */
    private String f27503P = null;

    /* renamed from: Q */
    private String f27504Q = null;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public String f27505R = null;

    /* renamed from: S */
    private String f27506S = null;

    /* renamed from: T */
    private String f27507T = null;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public C5887x f27508U;

    /* renamed from: a */
    private CallbackManager f27509a;

    /* renamed from: b */
    private AccessTokenTracker f27510b;

    /* renamed from: com.mrsool.auth.FBLoginActivity$a */
    class C10263a extends AccessTokenTracker {
        C10263a() {
        }

        /* access modifiers changed from: protected */
        public void onCurrentAccessTokenChanged(AccessToken accessToken, AccessToken accessToken2) {
            FBLoginActivity.this.f27502O = accessToken2;
            if (FBLoginActivity.this.f27502O != null) {
                FBLoginActivity fBLoginActivity = FBLoginActivity.this;
                fBLoginActivity.f27505R = fBLoginActivity.f27502O.getUserId();
                FBLoginActivity.this.m47708I();
            }
        }
    }

    /* renamed from: com.mrsool.auth.FBLoginActivity$b */
    class C10264b extends ProfileTracker {
        C10264b() {
        }

        /* access modifiers changed from: protected */
        public void onCurrentProfileChanged(Profile profile, Profile profile2) {
            profile2.getProfilePictureUri(120, 120);
        }
    }

    /* renamed from: com.mrsool.auth.FBLoginActivity$c */
    class C10265c implements FacebookCallback<LoginResult> {
        C10265c() {
        }

        /* renamed from: a */
        public void onSuccess(LoginResult loginResult) {
            FBLoginActivity.this.f27502O = loginResult.getAccessToken();
        }

        public void onCancel() {
            FBLoginActivity.this.m47710K();
        }

        public void onError(FacebookException facebookException) {
            FBLoginActivity.this.m47710K();
        }
    }

    /* renamed from: com.mrsool.auth.FBLoginActivity$d */
    class C10266d implements GraphJSONObjectCallback {
        C10266d() {
        }

        public void onCompleted(JSONObject jSONObject, GraphResponse graphResponse) {
            FBLoginActivity.this.m47715a(jSONObject);
        }
    }

    /* renamed from: com.mrsool.auth.FBLoginActivity$e */
    class C10267e implements Callback<SingInBean> {
        C10267e() {
        }

        public void onFailure(Call<SingInBean> call, Throwable th) {
            try {
                if (FBLoginActivity.this.f27508U != null) {
                    FBLoginActivity.this.f27508U.mo23492O();
                    FBLoginActivity.this.f27508U.mo23475F(FBLoginActivity.this.getString(C10232R.string.msg_error_server_issue));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void onResponse(Call<SingInBean> call, Response<SingInBean> response) {
            String str = "user_id";
            try {
                if (FBLoginActivity.this.f27508U != null) {
                    FBLoginActivity.this.f27508U.mo23492O();
                    StringBuilder sb = new StringBuilder();
                    sb.append("SignInApi response");
                    sb.append(response.toString());
                    C5880q.m25753d(sb.toString());
                    if (response.isSuccessful()) {
                        SingInBean singInBean = (SingInBean) response.body();
                        if (singInBean.getCode().intValue() <= 300) {
                            FBLoginActivity.this.f27508U.mo23468C().mo23448a(C11644i.f33135L5, singInBean.getbRegistered());
                            boolean booleanValue = singInBean.getbRegistered().booleanValue();
                            String str2 = C11644i.f33190S4;
                            if (!booleanValue) {
                                Intent intent = new Intent(FBLoginActivity.this, LoginWithPhoneActivity.class);
                                intent.putExtra(C11644i.f33067D1, str2);
                                FBLoginActivity.this.startActivity(intent);
                                FBLoginActivity.this.finish();
                                return;
                            }
                            FBLoginActivity.this.f27508U.mo23468C().mo23449a(str, String.valueOf(singInBean.getIUserId()));
                            FBLoginActivity.this.f27508U.mo23468C().mo23448a(C11644i.f33435v5, singInBean.getBNotification());
                            FBLoginActivity.this.f27508U.mo23468C().mo23449a("language", singInBean.getVLanguage());
                            FBLoginActivity.this.f27508U.mo23468C().mo23449a(C11644i.f33443w5, singInBean.getAuth_token());
                            boolean booleanValue2 = singInBean.getBStatus().booleanValue();
                            String str3 = C11644i.f33246Z4;
                            if (booleanValue2) {
                                FBLoginActivity.this.m47703C();
                                C6009d.m27516c(FBLoginActivity.this.getApplicationContext()).mo24810e(FBLoginActivity.this.getResources().getString(C10232R.string.branch_event_user_signup));
                                FBLoginActivity.this.f27508U.mo23468C().mo23448a(C11644i.f33411s5, singInBean.getCourier());
                                FBLoginActivity.this.f27508U.mo23468C().mo23448a(str3, Boolean.valueOf(true));
                                FBLoginActivity.this.f27508U.mo23468C().mo23448a(C11644i.f33230X4, Boolean.valueOf(false));
                                Intent intent2 = new Intent(FBLoginActivity.this, HomeActivity.class);
                                intent2.setFlags(67108864);
                                intent2.setFlags(32768);
                                intent2.setFlags(268435456);
                                FBLoginActivity.this.startActivity(intent2);
                                FBLoginActivity.this.f27508U.mo23479H(C11644i.f33206U4);
                                FBLoginActivity.this.finish();
                                return;
                            }
                            FBLoginActivity.this.f27508U.mo23468C().mo23448a(str3, Boolean.valueOf(false));
                            Intent intent3 = new Intent(FBLoginActivity.this, LoginWithPhoneActivity.class);
                            intent3.putExtra(str, String.valueOf(singInBean.getIUserId()));
                            intent3.putExtra(C11644i.f33067D1, str2);
                            FBLoginActivity.this.startActivity(intent3);
                            FBLoginActivity.this.finish();
                            return;
                        }
                        FBLoginActivity.this.f27508U.mo23475F(singInBean.getMessage());
                    } else if (FBLoginActivity.this.f27508U != null) {
                        FBLoginActivity.this.f27508U.mo23475F(response.message());
                    }
                }
            } catch (Exception e) {
                FBLoginActivity.this.f27508U.mo23492O();
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public void m47703C() {
        JSONObject jSONObject = new JSONObject();
        try {
            String string = getResources().getString(C10232R.string.brach_event_param_user_id);
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(this.f27508U.mo23476G());
            jSONObject.put(string, sb.toString());
            jSONObject.put(getResources().getString(C10232R.string.brach_event_param_channel), "Facebook");
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
    private void m47704D() {
        this.f27502O = AccessToken.getCurrentAccessToken();
        this.f27510b = new C10263a();
        if (this.f27502O != null) {
            m47708I();
        }
    }

    /* renamed from: E */
    private void m47705E() {
        AccessToken.getCurrentAccessToken().getDeclinedPermissions();
    }

    /* renamed from: G */
    private void m47706G() {
        AccessToken.getCurrentAccessToken().getPermissions();
    }

    /* renamed from: H */
    private void m47707H() {
        this.f27501N = new C10264b();
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public void m47708I() {
        this.f27506S = this.f27502O.getToken();
        this.f27505R = this.f27502O.getUserId();
        GraphRequest newMeRequest = GraphRequest.newMeRequest(this.f27502O, new C10266d());
        Bundle bundle = new Bundle();
        bundle.putString(GraphRequest.FIELDS_PARAM, "id, first_name, last_name, email,gender, birthday, location, age_range");
        newMeRequest.setParameters(bundle);
        newMeRequest.executeAsync();
    }

    /* renamed from: J */
    private void m47709J() {
        if (this.f27502O == null) {
            LoginManager.getInstance().logInWithReadPermissions((Activity) this, (Collection<String>) Arrays.asList(new String[]{"public_profile", "email", "user_birthday"}));
            LoginManager.getInstance().registerCallback(this.f27509a, new C10265c());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public void m47710K() {
        String str;
        String str2;
        String str3;
        String str4;
        if (this.f27502O != null) {
            String str5 = "\n\n";
            if (this.f27505R != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("User Id : ");
                sb.append(this.f27505R);
                sb.append(str5);
                str = sb.toString();
            } else {
                str = "User Id : Not Available \n\n";
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            if (this.f27503P != null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("User Email : ");
                sb3.append(this.f27503P);
                sb3.append(str5);
                str2 = sb3.toString();
            } else {
                str2 = "User Email : Not Available \n\n";
            }
            sb2.append(str2);
            String sb4 = sb2.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(sb4);
            if (this.f27504Q != null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append("User Name : ");
                sb6.append(this.f27504Q);
                sb6.append(str5);
                str3 = sb6.toString();
            } else {
                str3 = "User Name : Not Available\n\n";
            }
            sb5.append(str3);
            String sb7 = sb5.toString();
            StringBuilder sb8 = new StringBuilder();
            sb8.append(sb7);
            if (this.f27506S != null) {
                StringBuilder sb9 = new StringBuilder();
                sb9.append("Access Token : ");
                sb9.append(this.f27506S);
                sb9.append(str5);
                str4 = sb9.toString();
            } else {
                str4 = "Access Token : Not Available\n\n";
            }
            sb8.append(str4);
            sb8.toString();
            LoginManager.getInstance().logOut();
            if (this.f27508U.mo23468C().mo23459f(C11644i.f33318h5) != null) {
                m47720e(C11644i.f33190S4);
                return;
            }
            setResult(-1, new Intent());
            finish();
            return;
        }
        LoginManager.getInstance().logOut();
        setResult(0, new Intent());
        finish();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f27509a.onActivityResult(i, i2, intent);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f27508U = new C5887x(this);
        this.f27509a = Factory.create();
        m47704D();
        m47709J();
    }

    public void onDestroy() {
        super.onDestroy();
        AccessTokenTracker accessTokenTracker = this.f27510b;
        if (accessTokenTracker != null) {
            accessTokenTracker.stopTracking();
        }
        ProfileTracker profileTracker = this.f27501N;
        if (profileTracker != null) {
            profileTracker.stopTracking();
        }
    }

    /* renamed from: e */
    private void m47720e(String str) {
        this.f27508U.mo23619g(getResources().getString(C10232R.string.app_name), getResources().getString(C10232R.string.lbl_dg_loader_please_wait));
        HashMap hashMap = new HashMap();
        boolean equals = str.equals(C11644i.f33190S4);
        String str2 = "vGender";
        String str3 = "vLanguage";
        String str4 = C11644i.f33273c5;
        String str5 = "vDeviceToken";
        String str6 = "vFullName";
        String str7 = "vProfilePic";
        String str8 = "vEmail";
        String str9 = C11644i.f33451x5;
        String str10 = C11644i.f33419t5;
        String str11 = "";
        if (equals) {
            hashMap.put("vFacbookId", this.f27508U.mo23468C().mo23459f(C11644i.f33309g5));
            hashMap.put(str8, this.f27508U.mo23468C().mo23459f(C11644i.f33318h5));
            C5881v C = this.f27508U.mo23468C();
            String str12 = C11644i.f33327i5;
            hashMap.put(str7, C.mo23459f(str12) != null ? this.f27508U.mo23468C().mo23459f(str12) : str11);
            hashMap.put(str6, this.f27508U.mo23468C().mo23459f(C11644i.f33300f5));
            if (this.f27508U.mo23468C().mo23459f(str10) != null) {
                str4 = this.f27508U.mo23468C().mo23459f(str10);
            }
            hashMap.put(str5, str4);
            hashMap.put(str3, this.f27508U.mo23478H());
            hashMap.put(str2, !TextUtils.isEmpty(this.f27508U.mo23468C().mo23459f(str9)) ? this.f27508U.mo23468C().mo23459f(str9) : str11);
            C5881v C2 = this.f27508U.mo23468C();
            String str13 = C11644i.f33459y5;
            if (!TextUtils.isEmpty(C2.mo23459f(str13))) {
                str11 = this.f27508U.mo23468C().mo23459f(str13);
            }
            hashMap.put("vBirthYear", str11);
        } else if (str.equals(C11644i.f33198T4)) {
            hashMap.put("vGoogleId", this.f27508U.mo23468C().mo23459f(C11644i.f33345k5));
            hashMap.put(str8, this.f27508U.mo23468C().mo23459f(C11644i.f33354l5));
            C5881v C3 = this.f27508U.mo23468C();
            String str14 = C11644i.f33363m5;
            hashMap.put(str7, C3.mo23459f(str14) != null ? this.f27508U.mo23468C().mo23459f(str14) : str11);
            hashMap.put(str6, this.f27508U.mo23468C().mo23459f(C11644i.f33336j5));
            if (this.f27508U.mo23468C().mo23459f(str10) != null) {
                str4 = this.f27508U.mo23468C().mo23459f(str10);
            }
            hashMap.put(str5, str4);
            hashMap.put(str3, this.f27508U.mo23478H());
            if (!TextUtils.isEmpty(this.f27508U.mo23468C().mo23459f(str9))) {
                str11 = this.f27508U.mo23468C().mo23459f(str9);
            }
            hashMap.put(str2, str11);
        }
        hashMap.put("device_id", this.f27508U.mo23669w());
        StringBuilder sb = new StringBuilder();
        sb.append("SignInApi params");
        sb.append(hashMap.toString());
        C5880q.m25753d(sb.toString());
        C11687c.m52645a(null).SignInApi(hashMap).enqueue(new C10267e());
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x0171 */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0057 A[Catch:{ Exception -> 0x0175 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007b A[Catch:{ Exception -> 0x0175 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009f A[Catch:{ Exception -> 0x0175 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b2 A[Catch:{ Exception -> 0x0175 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00bf A[Catch:{ Exception -> 0x0175 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00cc A[Catch:{ Exception -> 0x0175 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x012e A[SYNTHETIC, Splitter:B:43:0x012e] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m47715a(org.json.JSONObject r13) {
        /*
            r12 = this;
            java.lang.String r0 = "location"
            java.lang.String r1 = "email"
            java.lang.String r2 = "last_name"
            java.lang.String r3 = "first_name"
            java.lang.String r4 = "birthday"
            java.lang.String r5 = "gender"
            android.os.Bundle r6 = new android.os.Bundle     // Catch:{ Exception -> 0x0175 }
            r6.<init>()     // Catch:{ Exception -> 0x0175 }
            java.lang.String r7 = "id"
            java.lang.String r7 = r13.getString(r7)     // Catch:{ Exception -> 0x0175 }
            r8 = 0
            java.net.URL r9 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0047, Exception -> 0x0041 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ MalformedURLException -> 0x0047, Exception -> 0x0041 }
            r10.<init>()     // Catch:{ MalformedURLException -> 0x0047, Exception -> 0x0041 }
            java.lang.String r11 = "https://graph.facebook.com/"
            r10.append(r11)     // Catch:{ MalformedURLException -> 0x0047, Exception -> 0x0041 }
            r10.append(r7)     // Catch:{ MalformedURLException -> 0x0047, Exception -> 0x0041 }
            java.lang.String r11 = "/picture?width=200&height=150"
            r10.append(r11)     // Catch:{ MalformedURLException -> 0x0047, Exception -> 0x0041 }
            java.lang.String r10 = r10.toString()     // Catch:{ MalformedURLException -> 0x0047, Exception -> 0x0041 }
            r9.<init>(r10)     // Catch:{ MalformedURLException -> 0x0047, Exception -> 0x0041 }
            java.lang.String r10 = "profile_pic"
            java.lang.String r11 = r9.toString()     // Catch:{ MalformedURLException -> 0x003f, Exception -> 0x003d }
            r6.putString(r10, r11)     // Catch:{ MalformedURLException -> 0x003f, Exception -> 0x003d }
            goto L_0x004c
        L_0x003d:
            r10 = move-exception
            goto L_0x0043
        L_0x003f:
            r10 = move-exception
            goto L_0x0049
        L_0x0041:
            r10 = move-exception
            r9 = r8
        L_0x0043:
            r10.printStackTrace()     // Catch:{ Exception -> 0x0175 }
            goto L_0x004c
        L_0x0047:
            r10 = move-exception
            r9 = r8
        L_0x0049:
            r10.printStackTrace()     // Catch:{ Exception -> 0x0175 }
        L_0x004c:
            java.lang.String r10 = "idFacebook"
            r6.putString(r10, r7)     // Catch:{ Exception -> 0x0175 }
            boolean r7 = r13.has(r3)     // Catch:{ Exception -> 0x0175 }
            if (r7 == 0) goto L_0x0075
            java.lang.String r7 = r13.getString(r3)     // Catch:{ Exception -> 0x0175 }
            r6.putString(r3, r7)     // Catch:{ Exception -> 0x0175 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0175 }
            r7.<init>()     // Catch:{ Exception -> 0x0175 }
            java.lang.String r3 = r13.getString(r3)     // Catch:{ Exception -> 0x0175 }
            r7.append(r3)     // Catch:{ Exception -> 0x0175 }
            java.lang.String r3 = " "
            r7.append(r3)     // Catch:{ Exception -> 0x0175 }
            java.lang.String r3 = r7.toString()     // Catch:{ Exception -> 0x0175 }
            r12.f27504Q = r3     // Catch:{ Exception -> 0x0175 }
        L_0x0075:
            boolean r3 = r13.has(r2)     // Catch:{ Exception -> 0x0175 }
            if (r3 == 0) goto L_0x0099
            java.lang.String r3 = r13.getString(r2)     // Catch:{ Exception -> 0x0175 }
            r6.putString(r2, r3)     // Catch:{ Exception -> 0x0175 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0175 }
            r3.<init>()     // Catch:{ Exception -> 0x0175 }
            java.lang.String r7 = r12.f27504Q     // Catch:{ Exception -> 0x0175 }
            r3.append(r7)     // Catch:{ Exception -> 0x0175 }
            java.lang.String r2 = r13.getString(r2)     // Catch:{ Exception -> 0x0175 }
            r3.append(r2)     // Catch:{ Exception -> 0x0175 }
            java.lang.String r2 = r3.toString()     // Catch:{ Exception -> 0x0175 }
            r12.f27504Q = r2     // Catch:{ Exception -> 0x0175 }
        L_0x0099:
            boolean r2 = r13.has(r1)     // Catch:{ Exception -> 0x0175 }
            if (r2 == 0) goto L_0x00ac
            java.lang.String r2 = r13.getString(r1)     // Catch:{ Exception -> 0x0175 }
            r6.putString(r1, r2)     // Catch:{ Exception -> 0x0175 }
            java.lang.String r1 = r13.getString(r1)     // Catch:{ Exception -> 0x0175 }
            r12.f27503P = r1     // Catch:{ Exception -> 0x0175 }
        L_0x00ac:
            boolean r1 = r13.has(r5)     // Catch:{ Exception -> 0x0175 }
            if (r1 == 0) goto L_0x00b9
            java.lang.String r1 = r13.getString(r5)     // Catch:{ Exception -> 0x0175 }
            r6.putString(r5, r1)     // Catch:{ Exception -> 0x0175 }
        L_0x00b9:
            boolean r1 = r13.has(r4)     // Catch:{ Exception -> 0x0175 }
            if (r1 == 0) goto L_0x00c6
            java.lang.String r1 = r13.getString(r4)     // Catch:{ Exception -> 0x0175 }
            r6.putString(r4, r1)     // Catch:{ Exception -> 0x0175 }
        L_0x00c6:
            boolean r1 = r13.has(r0)     // Catch:{ Exception -> 0x0175 }
            if (r1 == 0) goto L_0x00d9
            org.json.JSONObject r1 = r13.getJSONObject(r0)     // Catch:{ Exception -> 0x0175 }
            java.lang.String r2 = "name"
            java.lang.String r1 = r1.getString(r2)     // Catch:{ Exception -> 0x0175 }
            r6.putString(r0, r1)     // Catch:{ Exception -> 0x0175 }
        L_0x00d9:
            com.mrsool.utils.x r0 = r12.f27508U     // Catch:{ Exception -> 0x0175 }
            com.mrsool.utils.v r0 = r0.mo23468C()     // Catch:{ Exception -> 0x0175 }
            java.lang.String r1 = "fb_app_id"
            java.lang.String r2 = r12.f27505R     // Catch:{ Exception -> 0x0175 }
            r0.mo23449a(r1, r2)     // Catch:{ Exception -> 0x0175 }
            com.mrsool.utils.x r0 = r12.f27508U     // Catch:{ Exception -> 0x0175 }
            com.mrsool.utils.v r0 = r0.mo23468C()     // Catch:{ Exception -> 0x0175 }
            java.lang.String r1 = "fb_uname"
            java.lang.String r2 = r12.f27504Q     // Catch:{ Exception -> 0x0175 }
            r0.mo23449a(r1, r2)     // Catch:{ Exception -> 0x0175 }
            com.mrsool.utils.x r0 = r12.f27508U     // Catch:{ Exception -> 0x0175 }
            com.mrsool.utils.v r0 = r0.mo23468C()     // Catch:{ Exception -> 0x0175 }
            java.lang.String r1 = "fb_email"
            java.lang.String r2 = r12.f27503P     // Catch:{ Exception -> 0x0175 }
            if (r2 == 0) goto L_0x0109
            java.lang.String r2 = r12.f27503P     // Catch:{ Exception -> 0x0175 }
            int r2 = r2.length()     // Catch:{ Exception -> 0x0175 }
            if (r2 <= 0) goto L_0x0109
            java.lang.String r8 = r12.f27503P     // Catch:{ Exception -> 0x0175 }
        L_0x0109:
            r0.mo23449a(r1, r8)     // Catch:{ Exception -> 0x0175 }
            com.mrsool.utils.x r0 = r12.f27508U     // Catch:{ Exception -> 0x0175 }
            com.mrsool.utils.v r0 = r0.mo23468C()     // Catch:{ Exception -> 0x0175 }
            java.lang.String r1 = "fb_pic"
            java.lang.String r2 = r9.toString()     // Catch:{ Exception -> 0x0175 }
            r0.mo23449a(r1, r2)     // Catch:{ Exception -> 0x0175 }
            com.mrsool.utils.x r0 = r12.f27508U     // Catch:{ Exception -> 0x0175 }
            com.mrsool.utils.v r0 = r0.mo23468C()     // Catch:{ Exception -> 0x0175 }
            java.lang.String r1 = r6.getString(r5)     // Catch:{ Exception -> 0x0175 }
            r0.mo23449a(r5, r1)     // Catch:{ Exception -> 0x0175 }
            boolean r0 = r13.has(r4)     // Catch:{ Exception -> 0x0175 }
            if (r0 == 0) goto L_0x0171
            java.lang.String r13 = r13.getString(r4)     // Catch:{ Exception -> 0x0171 }
            java.lang.String r0 = "/"
            java.lang.String[] r13 = r13.split(r0)     // Catch:{ Exception -> 0x0171 }
            int r0 = r13.length     // Catch:{ Exception -> 0x0171 }
            r1 = 3
            if (r0 != r1) goto L_0x0171
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0171 }
            r0.<init>()     // Catch:{ Exception -> 0x0171 }
            java.lang.String r1 = "Birthyear :"
            r0.append(r1)     // Catch:{ Exception -> 0x0171 }
            r1 = 2
            r2 = r13[r1]     // Catch:{ Exception -> 0x0171 }
            r0.append(r2)     // Catch:{ Exception -> 0x0171 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0171 }
            com.mrsool.utils.C5880q.m25751b(r0)     // Catch:{ Exception -> 0x0171 }
            com.mrsool.utils.x r0 = r12.f27508U     // Catch:{ Exception -> 0x0171 }
            com.mrsool.utils.v r0 = r0.mo23468C()     // Catch:{ Exception -> 0x0171 }
            java.lang.String r2 = "birthyear"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0171 }
            r3.<init>()     // Catch:{ Exception -> 0x0171 }
            java.lang.String r4 = ""
            r3.append(r4)     // Catch:{ Exception -> 0x0171 }
            r13 = r13[r1]     // Catch:{ Exception -> 0x0171 }
            r3.append(r13)     // Catch:{ Exception -> 0x0171 }
            java.lang.String r13 = r3.toString()     // Catch:{ Exception -> 0x0171 }
            r0.mo23449a(r2, r13)     // Catch:{ Exception -> 0x0171 }
        L_0x0171:
            r12.m47710K()     // Catch:{ Exception -> 0x0175 }
            goto L_0x0179
        L_0x0175:
            r13 = move-exception
            r13.printStackTrace()
        L_0x0179:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mrsool.auth.FBLoginActivity.m47715a(org.json.JSONObject):void");
    }
}
