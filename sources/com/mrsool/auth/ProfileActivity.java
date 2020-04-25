package com.mrsool.auth;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import androidx.core.content.C0841b;
import androidx.core.graphics.drawable.C0894c;
import androidx.core.graphics.drawable.C0895d;
import com.fasterxml.jackson.core.p162w.C3868i;
import com.mrsool.C10232R;
import com.mrsool.C10787d;
import com.mrsool.HomeActivity;
import com.mrsool.TermsAndConditionActivity;
import com.mrsool.bean.UpdateInfoBean;
import com.mrsool.bean.UpdateProfile;
import com.mrsool.customeview.WheelView;
import com.mrsool.customeview.WheelView.C10735d;
import com.mrsool.customeview.WheelViewNew;
import com.mrsool.customeview.WheelViewNew.C10750e;
import com.mrsool.customeview.WheelViewNew.C10751f;
import com.mrsool.p423v.C11730j;
import com.mrsool.utils.AppSingleton;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C11669t;
import com.mrsool.utils.C11669t.C11673d;
import com.mrsool.utils.C5880q;
import com.mrsool.utils.C5881v;
import com.mrsool.utils.C5887x;
import com.mrsool.utils.TakeImages;
import com.mrsool.utils.p421c.C11617f;
import com.mrsool.utils.webservice.C11687c;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import org.jivesoftware.smackx.privacy.packet.PrivacyItem;
import org.json.JSONException;
import org.json.JSONObject;
import p076c.p082c.p083a.C2232l;
import p076c.p082c.p083a.p108y.p110j.C2550c;
import p212io.branch.referral.C6009d;
import p212io.fabric.sdk.android.p493p.p498e.C14330v;
import p468g.C13817d0;
import p468g.C13872x;
import p468g.C13873y.C13875b;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ProfileActivity extends C10787d implements OnClickListener {
    /* access modifiers changed from: private */

    /* renamed from: S */
    public int f27568S = 1;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public ImageView f27569T;

    /* renamed from: U */
    private ImageView f27570U;

    /* renamed from: V */
    private ImageView f27571V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public TextView f27572W;

    /* renamed from: X */
    private TextView f27573X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public EditText f27574Y;
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public EditText f27575Z;

    /* renamed from: a0 */
    private C11669t f27576a0;

    /* renamed from: b0 */
    private TextView f27577b0;

    /* renamed from: c0 */
    private TextView f27578c0;

    /* renamed from: d0 */
    private TextView f27579d0;

    /* renamed from: e0 */
    private String f27580e0;

    /* renamed from: f0 */
    private Bundle f27581f0;

    /* renamed from: g0 */
    private AppSingleton f27582g0;
    /* access modifiers changed from: private */

    /* renamed from: h0 */
    public List<String> f27583h0;

    /* renamed from: i0 */
    private int f27584i0;

    /* renamed from: j0 */
    private int f27585j0;

    /* renamed from: k0 */
    private int f27586k0;
    /* access modifiers changed from: private */

    /* renamed from: l0 */
    public int f27587l0;

    /* renamed from: m0 */
    private int f27588m0;
    /* access modifiers changed from: private */

    /* renamed from: n0 */
    public Dialog f27589n0;
    /* access modifiers changed from: private */

    /* renamed from: o0 */
    public C11617f f27590o0;
    /* access modifiers changed from: private */

    /* renamed from: p0 */
    public String f27591p0;
    /* access modifiers changed from: private */

    /* renamed from: q0 */
    public UpdateInfoBean f27592q0;

    /* renamed from: r0 */
    private final String f27593r0;

    /* renamed from: com.mrsool.auth.ProfileActivity$a */
    class C10279a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ WheelViewNew f27594a;

        C10279a(WheelViewNew wheelViewNew) {
            this.f27594a = wheelViewNew;
        }

        public void onClick(View view) {
            ProfileActivity.this.f27587l0 = this.f27594a.getSeletedIndex();
            ProfileActivity.this.f27572W.setText((CharSequence) ProfileActivity.this.f27583h0.get(ProfileActivity.this.f27587l0));
            ProfileActivity profileActivity = ProfileActivity.this;
            profileActivity.f27591p0 = (String) profileActivity.f27583h0.get(ProfileActivity.this.f27587l0);
            ProfileActivity.this.f27589n0.dismiss();
            ProfileActivity.this.f27572W.setCursorVisible(false);
            ProfileActivity.this.f27572W.requestFocus();
        }
    }

    /* renamed from: com.mrsool.auth.ProfileActivity$b */
    class C10280b implements OnClickListener {
        C10280b() {
        }

        public void onClick(View view) {
            if (ProfileActivity.this.f27589n0 != null && ProfileActivity.this.f27589n0.isShowing()) {
                ProfileActivity.this.f27589n0.dismiss();
            }
        }
    }

    /* renamed from: com.mrsool.auth.ProfileActivity$c */
    class C10281c implements C11673d {
        C10281c() {
        }

        /* renamed from: a */
        public void mo36513a() {
        }

        /* renamed from: b */
        public void mo36514b() {
            Intent intent = new Intent(ProfileActivity.this, TakeImages.class);
            intent.putExtra("PicType", ProfileActivity.this.getString(C10232R.string.lbl_dg_title_both));
            intent.putExtra("pictureRatio", "1,1");
            ProfileActivity.this.startActivityForResult(intent, C11644i.f33390q0);
        }
    }

    /* renamed from: com.mrsool.auth.ProfileActivity$d */
    class C10282d implements Callback<UpdateProfile> {
        C10282d() {
        }

        public void onFailure(Call<UpdateProfile> call, Throwable th) {
            try {
                if (ProfileActivity.this.f29642a != null) {
                    ProfileActivity.this.f29642a.mo23492O();
                    ProfileActivity.this.f29642a.mo23475F(ProfileActivity.this.getString(C10232R.string.msg_error_server_issue));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void onResponse(Call<UpdateProfile> call, Response<UpdateProfile> response) {
            try {
                if (ProfileActivity.this.f29642a == null) {
                    return;
                }
                if (response.isSuccessful()) {
                    UpdateProfile updateProfile = (UpdateProfile) response.body();
                    if (updateProfile.getCode().intValue() <= 300) {
                        try {
                            if (C11644i.f33437w) {
                                ProfileActivity.this.f27590o0.mo39873e(ProfileActivity.this.f29642a.mo23476G(), ProfileActivity.this.f27590o0.mo39860a(), "mobile");
                            }
                            ProfileActivity.this.m47784J();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        ProfileActivity.this.f29642a.mo23468C().mo23449a("user_name", ProfileActivity.this.f27574Y.getText().toString().toString().trim());
                        ProfileActivity.this.f29642a.mo23468C().mo23449a("user_email", ProfileActivity.this.f27575Z.getText().toString().toString().trim());
                        ProfileActivity.this.f29642a.mo23468C().mo23448a(C11644i.f33246Z4, Boolean.valueOf(true));
                        ProfileActivity.this.m47799Y();
                        ProfileActivity.this.m47787M();
                        return;
                    }
                    ProfileActivity.this.f29642a.mo23492O();
                    ProfileActivity.this.f29642a.mo23475F(updateProfile.getMessage());
                    return;
                }
                ProfileActivity.this.f29642a.mo23492O();
                ProfileActivity.this.f29642a.mo23475F(response.message());
            } catch (Exception e2) {
                ProfileActivity.this.f29642a.mo23492O();
                e2.printStackTrace();
            }
        }
    }

    /* renamed from: com.mrsool.auth.ProfileActivity$e */
    class C10283e implements Runnable {
        C10283e() {
        }

        public void run() {
            Intent intent = new Intent(ProfileActivity.this, TermsAndConditionActivity.class);
            intent.putExtra(C11644i.f33391q1, ProfileActivity.this.getString(C10232R.string.lbl_terms_condition));
            intent.putExtra(C11644i.f33067D1, C11644i.f33376o2);
            intent.putExtra(C11644i.f33383p1, "https://s.mrsool.co/terms.html");
            ProfileActivity profileActivity = ProfileActivity.this;
            profileActivity.startActivityForResult(intent, profileActivity.f27568S);
        }
    }

    /* renamed from: com.mrsool.auth.ProfileActivity$f */
    class C10284f extends C2550c {
        C10284f(ImageView imageView) {
            super(imageView);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10023a(Bitmap bitmap) {
            ProfileActivity.this.f27569T.setScaleType(ScaleType.CENTER_CROP);
            Resources resources = ProfileActivity.this.getResources();
            C5887x xVar = ProfileActivity.this.f29642a;
            C0894c a = C0895d.m5185a(resources, C5887x.m25815e(bitmap));
            a.mo4601b(true);
            ProfileActivity.this.f27569T.setImageDrawable(a);
        }
    }

    /* renamed from: com.mrsool.auth.ProfileActivity$g */
    class C10285g implements Callback<UpdateInfoBean> {
        C10285g() {
        }

        public void onFailure(Call<UpdateInfoBean> call, Throwable th) {
            try {
                if (ProfileActivity.this.f29642a != null) {
                    ProfileActivity.this.f29642a.mo23492O();
                    ProfileActivity.this.f29642a.mo23591c((Context) ProfileActivity.this);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void onResponse(Call<UpdateInfoBean> call, Response<UpdateInfoBean> response) {
            try {
                if (ProfileActivity.this.f29642a != null) {
                    ProfileActivity.this.f29642a.mo23492O();
                    if (response.isSuccessful()) {
                        if (((UpdateInfoBean) response.body()).getCode() <= 300) {
                            ProfileActivity.this.f27592q0 = (UpdateInfoBean) response.body();
                            ProfileActivity.this.f29642a.mo23468C().mo23448a("isupdated", Boolean.valueOf(true));
                            ProfileActivity.this.f29642a.mo23468C().mo23448a(C11644i.f33282d5, Boolean.valueOf(ProfileActivity.this.f27592q0.isTerms_accepted()));
                            ProfileActivity.this.f29642a.mo23468C().mo23447a(C11644i.f33291e5, ProfileActivity.this.f27592q0.getCurrent_terms_version());
                            C11644i.f33277d0 = ProfileActivity.this.f27592q0.getApp_update_alert_text();
                            ProfileActivity.this.mo36627f("updateDeviceInfo");
                            return;
                        }
                        ProfileActivity.this.f29642a.mo23576b((Context) ProfileActivity.this, ((UpdateInfoBean) response.body()).getMessage() != null ? ((UpdateInfoBean) response.body()).getMessage() : ((UpdateInfoBean) response.body()).getMessages());
                    } else if (ProfileActivity.this.f29642a != null) {
                        ProfileActivity.this.f29642a.mo23576b((Context) ProfileActivity.this, response.message());
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.mrsool.auth.ProfileActivity$h */
    class C10286h extends C10735d {
        C10286h() {
        }

        /* renamed from: a */
        public void mo36632a(int i, String str) {
        }
    }

    /* renamed from: com.mrsool.auth.ProfileActivity$i */
    class C10287i implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ WheelView f27603a;

        C10287i(WheelView wheelView) {
            this.f27603a = wheelView;
        }

        public void onClick(View view) {
            ProfileActivity profileActivity = ProfileActivity.this;
            profileActivity.f27587l0 = profileActivity.f27587l0 + -1 >= 0 ? ProfileActivity.this.f27587l0 - 1 : 0;
            this.f27603a.setSeletion(ProfileActivity.this.f27587l0);
        }
    }

    /* renamed from: com.mrsool.auth.ProfileActivity$j */
    class C10288j implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ WheelView f27605a;

        C10288j(WheelView wheelView) {
            this.f27605a = wheelView;
        }

        public void onClick(View view) {
            int i;
            ProfileActivity profileActivity = ProfileActivity.this;
            if (profileActivity.f27587l0 + 1 <= Arrays.asList(new List[]{ProfileActivity.this.f27583h0}).size()) {
                i = ProfileActivity.this.f27587l0 + 1;
            } else {
                i = Arrays.asList(new List[]{ProfileActivity.this.f27583h0}).size();
            }
            profileActivity.f27587l0 = i;
            this.f27605a.setSeletion(ProfileActivity.this.f27587l0);
        }
    }

    /* renamed from: com.mrsool.auth.ProfileActivity$k */
    class C10289k implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ WheelView f27607a;

        C10289k(WheelView wheelView) {
            this.f27607a = wheelView;
        }

        public void onClick(View view) {
            ProfileActivity.this.f27587l0 = this.f27607a.getSeletedIndex();
            ProfileActivity.this.f27572W.setText((CharSequence) ProfileActivity.this.f27583h0.get(ProfileActivity.this.f27587l0));
            ProfileActivity.this.f27589n0.dismiss();
        }
    }

    /* renamed from: com.mrsool.auth.ProfileActivity$l */
    class C10290l implements OnClickListener {
        C10290l() {
        }

        public void onClick(View view) {
            ProfileActivity.this.f27589n0.dismiss();
        }
    }

    /* renamed from: com.mrsool.auth.ProfileActivity$m */
    class C10291m extends C10750e {
        C10291m() {
        }

        /* renamed from: a */
        public void mo36637a(int i, String str) {
            ProfileActivity.this.f27587l0 = i - 1;
        }
    }

    /* renamed from: com.mrsool.auth.ProfileActivity$n */
    class C10292n implements C10751f {

        /* renamed from: a */
        final /* synthetic */ WheelViewNew f27611a;

        C10292n(WheelViewNew wheelViewNew) {
            this.f27611a = wheelViewNew;
        }

        /* renamed from: a */
        public void mo36638a(String str) {
            int a = ProfileActivity.this.m47819i(str);
            if (a != -1) {
                this.f27611a.setSeletion(a);
                ProfileActivity.this.f27587l0 = a;
            }
        }
    }

    /* renamed from: com.mrsool.auth.ProfileActivity$o */
    class C10293o implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ WheelViewNew f27613a;

        C10293o(WheelViewNew wheelViewNew) {
            this.f27613a = wheelViewNew;
        }

        public void onClick(View view) {
            ProfileActivity profileActivity = ProfileActivity.this;
            profileActivity.f27587l0 = profileActivity.f27587l0 + -1 >= 0 ? ProfileActivity.this.f27587l0 - 1 : 0;
            this.f27613a.setSeletion(ProfileActivity.this.f27587l0);
        }
    }

    /* renamed from: com.mrsool.auth.ProfileActivity$p */
    class C10294p implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ WheelViewNew f27615a;

        C10294p(WheelViewNew wheelViewNew) {
            this.f27615a = wheelViewNew;
        }

        public void onClick(View view) {
            ProfileActivity profileActivity = ProfileActivity.this;
            profileActivity.f27587l0 = profileActivity.f27587l0 + 1 <= ProfileActivity.this.f27583h0.size() ? ProfileActivity.this.f27587l0 + 1 : ProfileActivity.this.f27583h0.size();
            this.f27615a.setSeletion(ProfileActivity.this.f27587l0);
        }
    }

    public ProfileActivity() {
        String str = "";
        this.f27580e0 = str;
        this.f27583h0 = new ArrayList();
        this.f27584i0 = 1930;
        this.f27585j0 = 15;
        this.f27586k0 = 0;
        this.f27587l0 = -1;
        this.f27588m0 = 30;
        this.f27589n0 = null;
        this.f27591p0 = str;
        this.f27593r0 = "updateDeviceInfo";
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public void m47784J() {
        JSONObject jSONObject = new JSONObject();
        try {
            String string = getResources().getString(C10232R.string.brach_event_param_user_id);
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(this.f29642a.mo23476G());
            jSONObject.put(string, sb.toString());
            jSONObject.put(getResources().getString(C10232R.string.brach_event_param_channel), m47792R());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C6009d.m27516c(getApplicationContext()).mo24767a(getResources().getString(C10232R.string.branch_event_user_signup_revised), jSONObject);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("BRANCH_EVENT: ");
        sb2.append(getResources().getString(C10232R.string.branch_event_user_signup_revised));
        sb2.append(" values :");
        sb2.append(jSONObject.toString());
        C5880q.m25751b(sb2.toString());
    }

    /* renamed from: K */
    private void m47785K() {
        this.f27576a0.mo40036a(C11644i.f33330j, (C11673d) new C10281c());
    }

    /* renamed from: L */
    private void m47786L() {
        runOnUiThread(new C10283e());
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public void m47787M() {
        HashMap hashMap = new HashMap();
        hashMap.put("id", this.f29642a.mo23468C().mo23459f("user_id"));
        StringBuilder sb = new StringBuilder();
        sb.append(Build.MANUFACTURER);
        sb.append(C3868i.f12248b);
        sb.append(Build.MODEL);
        hashMap.put("vDeviceVersion", String.valueOf(sb.toString()));
        String str = "vOSVersion";
        hashMap.put(str, String.valueOf(VERSION.SDK_INT));
        hashMap.put(str, String.valueOf(VERSION.SDK_INT));
        hashMap.put("vPlatform", C11644i.f33264b5);
        hashMap.put("vAppVersion", String.valueOf(this.f29642a.mo23633k()));
        C5881v C = this.f29642a.mo23468C();
        String str2 = C11644i.f33419t5;
        hashMap.put("vDeviceToken", C.mo23459f(str2) != null ? this.f29642a.mo23468C().mo23459f(str2) : C11644i.f33273c5);
        hashMap.put("vLanguage", this.f29642a.mo23478H());
        StringBuilder sb2 = new StringBuilder();
        String str3 = "";
        sb2.append(str3);
        sb2.append(C5887x.m25816e((Context) this));
        hashMap.put("inst_package_name", sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str3);
        sb3.append(C5887x.m25813d((Context) this));
        hashMap.put("app_sign", sb3.toString());
        C5881v C2 = this.f29642a.mo23468C();
        String str4 = C11644i.f33303g;
        if (C2.mo23459f(str4) != null) {
            hashMap.put("latitude", this.f29642a.mo23468C().mo23459f(str4));
            hashMap.put("longitude", this.f29642a.mo23468C().mo23459f(C11644i.f33312h));
        }
        hashMap.put("device_id", this.f29642a.mo23669w());
        StringBuilder sb4 = new StringBuilder();
        sb4.append("UpdateDeviceInfo()==>");
        sb4.append(hashMap);
        C5880q.m25751b(sb4.toString());
        C11687c.m52645a(this.f29642a).UpdateDeviceInfo(hashMap).enqueue(new C10285g());
    }

    /* renamed from: N */
    private void m47788N() {
        if (m47789O()) {
            HashMap hashMap = new HashMap();
            C5887x xVar = this.f29642a;
            C5881v C = xVar.mo23468C();
            String str = C11644i.f33419t5;
            hashMap.put("vDeviceToken", xVar.mo23622h(C.mo23459f(str) != null ? this.f29642a.mo23468C().mo23459f(str) : C11644i.f33273c5));
            String str2 = "\"";
            String str3 = "";
            hashMap.put("vFullName", this.f29642a.mo23622h(this.f27574Y.getText().toString().trim().replaceAll(str2, str3)));
            hashMap.put("vEmail", this.f29642a.mo23622h(this.f27575Z.getText().toString().trim().replaceAll(str2, str3)));
            C5887x xVar2 = this.f29642a;
            hashMap.put("vLanguage", xVar2.mo23622h(xVar2.mo23478H()));
            hashMap.put("vGender", this.f29642a.mo23622h(m47790P()));
            C5887x xVar3 = this.f29642a;
            StringBuilder sb = new StringBuilder();
            sb.append(str3);
            sb.append(this.f27591p0);
            hashMap.put("vBirthYear", xVar3.mo23622h(sb.toString()));
            C13875b bVar = null;
            if (this.f29642a.mo23488M() != null) {
                bVar = C13875b.m59383a("vProfilePic", new File(this.f29642a.mo23488M()).getName(), C13817d0.create(C13872x.m59361b("image/*"), this.f29642a.mo23486L()));
            }
            C5887x xVar4 = this.f29642a;
            hashMap.put("language", xVar4.mo23622h(xVar4.mo23645o()));
            C5887x xVar5 = this.f29642a;
            hashMap.put("device_id", xVar5.mo23622h(xVar5.mo23669w()));
            StringBuilder sb2 = new StringBuilder();
            sb2.append("19 JUNE :");
            sb2.append(this.f27591p0);
            C5880q.m25751b(sb2.toString());
            Call UpdateUserProfile = C11687c.m52645a(this.f29642a).UpdateUserProfile(this.f29642a.mo23468C().mo23459f("user_id"), hashMap, bVar);
            this.f29642a.mo23619g(getString(C10232R.string.app_name), getString(C10232R.string.lbl_dg_loader_loading));
            UpdateUserProfile.enqueue(new C10282d());
        }
    }

    /* renamed from: O */
    private boolean m47789O() {
        if (TextUtils.isEmpty(this.f27574Y.getText().toString().trim())) {
            this.f29642a.mo23615f(getString(C10232R.string.msg_error_blank_user_name), getString(C10232R.string.app_name));
            return false;
        } else if (TextUtils.isEmpty(this.f27575Z.getText().toString().trim())) {
            this.f29642a.mo23615f(getString(C10232R.string.msg_error_blank_email), getString(C10232R.string.app_name));
            return false;
        } else if (this.f29642a.mo23563a(this.f27575Z)) {
            return true;
        } else {
            this.f29642a.mo23615f(getString(C10232R.string.msg_error_invalid_email), getString(C10232R.string.app_name));
            return false;
        }
    }

    /* renamed from: P */
    private String m47790P() {
        if (this.f27578c0.isActivated()) {
            return C11644i.f33087F5;
        }
        return this.f27579d0.isActivated() ? C11644i.f33095G5 : "";
    }

    /* renamed from: Q */
    private int m47791Q() {
        int i = 0;
        while (i < this.f27583h0.size()) {
            try {
                if (((String) this.f27583h0.get(i)).equalsIgnoreCase(this.f27591p0)) {
                    return i;
                }
                i++;
            } catch (Exception unused) {
            }
        }
        return -1;
    }

    /* renamed from: R */
    private String m47792R() {
        if (this.f29642a.mo23468C().mo23450a(C11644i.f33214V4)) {
            return "Google";
        }
        return this.f29642a.mo23468C().mo23450a(C11644i.f33206U4) ? "Facebook" : "Mobile";
    }

    /* renamed from: S */
    private int m47793S() {
        C5881v C = this.f29642a.mo23468C();
        String str = C11644i.f33451x5;
        if (C11644i.f33087F5.equalsIgnoreCase(C.mo23459f(str))) {
            return C10232R.C10235drawable.ic_male_profile_place_holder;
        }
        return C11644i.f33095G5.equalsIgnoreCase(this.f29642a.mo23468C().mo23459f(str)) ? C10232R.C10235drawable.ic_female_profile_place_holder : C10232R.C10235drawable.ic_profile_place_holder;
    }

    /* renamed from: T */
    private int m47794T() {
        int i = this.f27587l0;
        for (int i2 = 0; i2 < this.f27583h0.size(); i2++) {
            String str = (String) this.f27583h0.get(i2);
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(this.f29642a.mo23471D(this.f27572W.getText().toString()));
            if (str.equalsIgnoreCase(sb.toString())) {
                this.f27587l0 = i2;
                return i2;
            }
        }
        return i;
    }

    /* renamed from: U */
    private int m47795U() {
        if (!TextUtils.isEmpty(this.f27591p0)) {
            return m47819i(this.f27591p0);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(this.f27586k0 - this.f27588m0);
        return m47819i(sb.toString());
    }

    /* renamed from: V */
    private void m47796V() {
        Intent intent = new Intent(this, HomeActivity.class);
        intent.setFlags(67108864);
        intent.setFlags(268435456);
        intent.setFlags(32768);
        startActivity(intent);
        finish();
    }

    /* renamed from: W */
    private void m47797W() {
        m47806a0();
        this.f27576a0 = new C11669t(this);
        this.f27582g0 = (AppSingleton) getApplicationContext();
        this.f27590o0 = new C11617f(this);
        this.f27573X = (TextView) findViewById(C10232R.C10236id.btnDone);
        this.f27573X.setOnClickListener(this);
        this.f27574Y = (EditText) findViewById(C10232R.C10236id.edtFullName);
        this.f27575Z = (EditText) findViewById(C10232R.C10236id.edtEmail);
        this.f27569T = (ImageView) findViewById(C10232R.C10236id.imgPicIamge);
        this.f27569T.setOnClickListener(this);
        this.f27572W = (TextView) findViewById(C10232R.C10236id.tvYearOfBirth);
        this.f27572W.setOnClickListener(this);
        this.f27578c0 = (TextView) findViewById(C10232R.C10236id.tvMale);
        this.f27579d0 = (TextView) findViewById(C10232R.C10236id.tvFemale);
        this.f27578c0.setOnClickListener(this);
        this.f27579d0.setOnClickListener(this);
        m47809b0();
        m47798X();
        this.f27581f0 = getIntent().getExtras();
        Bundle bundle = this.f27581f0;
        if (bundle != null) {
            String str = PrivacyItem.SUBSCRIPTION_FROM;
            if (bundle.containsKey(str)) {
                this.f27580e0 = this.f27581f0.getString(str);
            }
        }
        C5881v C = this.f29642a.mo23468C();
        String str2 = C11644i.f33451x5;
        if (C11644i.f33087F5.equalsIgnoreCase(C.mo23459f(str2))) {
            this.f27578c0.setActivated(true);
        } else {
            if (C11644i.f33095G5.equalsIgnoreCase(this.f29642a.mo23468C().mo23459f(str2))) {
                this.f27579d0.setActivated(true);
            }
        }
        this.f27569T.setImageResource(m47793S());
        int i = 0;
        while (true) {
            if (i >= this.f27583h0.size()) {
                break;
            }
            String str3 = (String) this.f27583h0.get(i);
            StringBuilder sb = new StringBuilder();
            sb.append("");
            C5887x xVar = this.f29642a;
            sb.append(xVar.mo23471D(xVar.mo23468C().mo23459f(C11644i.f33459y5)));
            if (str3.equalsIgnoreCase(sb.toString())) {
                this.f27591p0 = (String) this.f27583h0.get(i);
                this.f27587l0 = i;
                break;
            }
            i++;
        }
        if (this.f29642a.mo23496R()) {
            this.f29642a.mo23608d(this.f27574Y, this.f27575Z);
        }
        m47800Z();
    }

    /* renamed from: X */
    private void m47798X() {
        if (this.f29642a.mo23496R()) {
            this.f27578c0.setBackground(getResources().getDrawable(C10232R.C10235drawable.selector_female_profile));
            this.f27579d0.setBackground(getResources().getDrawable(C10232R.C10235drawable.selector_male_profile));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public void m47799Y() {
        int i = C11644i.f33186S0;
        if (i == 1) {
            this.f29642a.mo23479H(C11644i.f33206U4);
        } else if (i == 2) {
            this.f29642a.mo23479H(C11644i.f33214V4);
        } else if (i == 3) {
            this.f29642a.mo23479H(C11644i.f33222W4);
        }
    }

    /* renamed from: Z */
    private void m47800Z() {
        if (this.f29642a.mo23468C().mo23450a(C11644i.f33214V4)) {
            C5881v C = this.f29642a.mo23468C();
            String str = C11644i.f33336j5;
            if (!TextUtils.isEmpty(C.mo23459f(str))) {
                this.f27574Y.setText(this.f29642a.mo23468C().mo23459f(str));
            }
            C5881v C2 = this.f29642a.mo23468C();
            String str2 = C11644i.f33354l5;
            if (!TextUtils.isEmpty(C2.mo23459f(str2))) {
                this.f27575Z.setText(this.f29642a.mo23468C().mo23459f(str2));
            }
            C5881v C3 = this.f29642a.mo23468C();
            String str3 = C11644i.f33459y5;
            if (!TextUtils.isEmpty(C3.mo23459f(str3))) {
                this.f27572W.setText(this.f29642a.mo23468C().mo23459f(str3));
            }
        } else if (this.f29642a.mo23468C().mo23450a(C11644i.f33206U4)) {
            C5881v C4 = this.f29642a.mo23468C();
            String str4 = C11644i.f33300f5;
            if (!TextUtils.isEmpty(C4.mo23459f(str4))) {
                this.f27574Y.setText(this.f29642a.mo23468C().mo23459f(str4));
            }
            C5881v C5 = this.f29642a.mo23468C();
            String str5 = C11644i.f33318h5;
            if (!TextUtils.isEmpty(C5.mo23459f(str5))) {
                this.f27575Z.setText(this.f29642a.mo23468C().mo23459f(str5));
            }
        }
    }

    /* renamed from: a0 */
    private void m47806a0() {
        this.f27577b0 = (TextView) findViewById(C10232R.C10236id.txtTitle);
        this.f27577b0.setText(getResources().getString(C10232R.string.lbl_one_more_thing));
        this.f27571V = (ImageView) findViewById(C10232R.C10236id.imgClose);
        this.f27571V.setOnClickListener(this);
        if (this.f29642a.mo23496R()) {
            this.f27571V.setScaleX(-1.0f);
        }
        findViewById(C10232R.C10236id.flBack).setVisibility(8);
    }

    /* renamed from: b0 */
    private void m47809b0() {
        this.f27586k0 = Calendar.getInstance().get(1);
        for (int i = this.f27584i0; i < this.f27586k0 + 1; i++) {
            List<String> list = this.f27583h0;
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(i);
            list.add(sb.toString());
        }
    }

    /* renamed from: c0 */
    private void m47811c0() {
        View inflate = LayoutInflater.from(this).inflate(C10232R.layout.custom_wheel_view, null);
        ImageView imageView = (ImageView) inflate.findViewById(C10232R.C10236id.imgUp);
        ImageView imageView2 = (ImageView) inflate.findViewById(C10232R.C10236id.imgDown);
        TextView textView = (TextView) inflate.findViewById(C10232R.C10236id.txtOk);
        TextView textView2 = (TextView) inflate.findViewById(C10232R.C10236id.txtCancel);
        ((TextView) inflate.findViewById(C10232R.C10236id.txtTitle)).setText(C10232R.string.hint_select_year);
        imageView.setVisibility(8);
        imageView2.setVisibility(8);
        WheelView wheelView = (WheelView) inflate.findViewById(C10232R.C10236id.wheel_view_wv);
        wheelView.setOffset(1);
        wheelView.setItems(this.f27583h0);
        wheelView.setSeletion(this.f27587l0);
        this.f27589n0 = new Dialog(this, C10232R.style.AlertCustomerDialogStyle);
        this.f27589n0.setContentView(inflate);
        if (!isFinishing()) {
            this.f27589n0.show();
        }
        wheelView.setOnWheelViewListener(new C10286h());
        imageView.setOnClickListener(new C10287i(wheelView));
        imageView2.setOnClickListener(new C10288j(wheelView));
        textView.setOnClickListener(new C10289k(wheelView));
        textView2.setOnClickListener(new C10290l());
    }

    /* renamed from: d0 */
    private void m47813d0() {
        Dialog dialog = this.f27589n0;
        if ((dialog == null || !dialog.isShowing()) && this.f27583h0.size() != 0) {
            View inflate = LayoutInflater.from(this).inflate(C10232R.layout.custom_wheel_view_year, null);
            ImageView imageView = (ImageView) inflate.findViewById(C10232R.C10236id.imgUp);
            ImageView imageView2 = (ImageView) inflate.findViewById(C10232R.C10236id.imgDown);
            TextView textView = (TextView) inflate.findViewById(C10232R.C10236id.txtOk);
            TextView textView2 = (TextView) inflate.findViewById(C10232R.C10236id.txtCancel);
            WheelViewNew wheelViewNew = (WheelViewNew) inflate.findViewById(C10232R.C10236id.wheel_view_wv);
            wheelViewNew.setSelectorCenterView(inflate.findViewById(C10232R.C10236id.vSelector));
            wheelViewNew.setOffset(1);
            wheelViewNew.setItems(this.f27583h0);
            wheelViewNew.setSeletion(m47795U());
            this.f27589n0 = new Dialog(this);
            this.f27589n0.requestWindowFeature(1);
            this.f27589n0.setContentView(inflate);
            C5887x xVar = this.f29642a;
            if (xVar != null) {
                xVar.mo23535a(this.f27589n0);
            }
            if (!isFinishing()) {
                this.f27589n0.show();
            }
            wheelViewNew.setOnWheelViewListener(new C10291m());
            wheelViewNew.setmOnWheelItemClickListner(new C10292n(wheelViewNew));
            imageView.setOnClickListener(new C10293o(wheelViewNew));
            imageView2.setOnClickListener(new C10294p(wheelViewNew));
            textView.setOnClickListener(new C10279a(wheelViewNew));
            textView2.setOnClickListener(new C10280b());
        }
    }

    /* renamed from: e0 */
    private void m47815e0() {
        if (this.f27574Y.getText().toString().trim().length() > 0 && this.f29642a.mo23563a(this.f27575Z)) {
            m47788N();
        } else if (this.f27574Y.getText().toString().trim().length() == 0) {
            this.f29642a.mo23615f(getString(C10232R.string.msg_error_blank_user_name), getString(C10232R.string.app_name));
        } else if (this.f27575Z.getText().toString().trim().length() == 0) {
            this.f29642a.mo23615f(getString(C10232R.string.msg_error_blank_email), getString(C10232R.string.app_name));
        } else if (!this.f29642a.mo23563a(this.f27575Z)) {
            this.f29642a.mo23615f(getString(C10232R.string.msg_error_invalid_email), getString(C10232R.string.app_name));
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 777 && i2 == -1) {
            String str = "image_path";
            if (intent.getExtras().getString(str) != null) {
                this.f29642a.mo23481I(intent.getExtras().getString(str));
                C5887x xVar = this.f29642a;
                xVar.mo23579b(new File(xVar.mo23488M()));
                C5887x xVar2 = this.f29642a;
                xVar2.mo23605d(xVar2.mo23511a(xVar2.mo23486L()));
                if (this.f29642a.mo23484K().getWidth() == 0 || this.f29642a.mo23484K().getHeight() == 0) {
                    this.f29642a.mo23491N(getString(C10232R.string.error_upload_image));
                } else {
                    this.f29642a.mo23573b((int) C14330v.f42355w);
                    C2232l.m11649c(getApplicationContext()).mo9511a(new File(intent.getExtras().getString(str))).mo9441j().m11411d().mo9458b(new C10284f(this.f27569T));
                }
            }
        } else if (i == this.f27568S && i2 == -1) {
            m47796V();
        }
    }

    public void onBackPressed() {
        if (!TextUtils.isEmpty(this.f27580e0)) {
            setResult(-1, new Intent());
            finish();
        }
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case C10232R.C10236id.btnDone /*2131361973*/:
                if (this.f29642a.mo23502X()) {
                    m47788N();
                    return;
                }
                return;
            case C10232R.C10236id.imgClose /*2131362467*/:
                onBackPressed();
                return;
            case C10232R.C10236id.imgPicIamge /*2131362495*/:
                m47785K();
                return;
            case C10232R.C10236id.tvFemale /*2131363855*/:
                if (!this.f27579d0.isActivated()) {
                    this.f27578c0.setActivated(false);
                    this.f27579d0.setActivated(true);
                    return;
                }
                return;
            case C10232R.C10236id.tvMale /*2131363895*/:
                if (!this.f27578c0.isActivated()) {
                    this.f27578c0.setActivated(true);
                    this.f27579d0.setActivated(false);
                    return;
                }
                return;
            case C10232R.C10236id.tvYearOfBirth /*2131364021*/:
                m47813d0();
                return;
            default:
                return;
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (VERSION.SDK_INT >= 23) {
            C11730j.m52797a((Activity) this, C0841b.m4915a((Context) this, (int) C10232R.C10234color.pending_order_bg));
            C11730j.m52801b(this);
        }
        setContentView((int) C10232R.layout.activity_profile_revised);
        m47797W();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C11669t tVar = this.f27576a0;
        if (tVar != null) {
            tVar.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public int m47819i(String str) {
        for (int i = 0; i < this.f27583h0.size(); i++) {
            if (((String) this.f27583h0.get(i)).equalsIgnoreCase(str)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: f */
    public void mo36627f(String str) {
        if (((str.hashCode() == -502838835 && str.equals("updateDeviceInfo")) ? (char) 0 : 65535) == 0) {
            m47786L();
        }
    }

    /* renamed from: a */
    private void m47805a(EditText editText) {
        Drawable background = editText.getBackground();
        background.setColorFilter(C0841b.m4915a((Context) this, (int) C10232R.C10234color.apptheme_color), Mode.SRC_ATOP);
        editText.setHighlightColor(C0841b.m4915a(getApplicationContext(), (int) C10232R.C10234color.gray_border));
        editText.setHintTextColor(C0841b.m4915a(getApplicationContext(), (int) C10232R.C10234color.gray_border));
        editText.setBackground(background);
    }
}
