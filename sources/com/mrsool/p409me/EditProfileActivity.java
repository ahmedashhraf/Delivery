package com.mrsool.p409me;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.content.C0841b;
import androidx.core.graphics.drawable.C0894c;
import androidx.core.graphics.drawable.C0895d;
import com.mrsool.C10232R;
import com.mrsool.C10787d;
import com.mrsool.auth.LoginWithPhoneActivity;
import com.mrsool.bean.UpdateProfile;
import com.mrsool.bean.User;
import com.mrsool.customeview.WheelView;
import com.mrsool.customeview.WheelView.C10735d;
import com.mrsool.customeview.WheelViewNew;
import com.mrsool.customeview.WheelViewNew.C10750e;
import com.mrsool.customeview.WheelViewNew.C10751f;
import com.mrsool.p423v.C11730j;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C11669t;
import com.mrsool.utils.C11669t.C11673d;
import com.mrsool.utils.C5881v;
import com.mrsool.utils.C5887x;
import com.mrsool.utils.TakeImages;
import com.mrsool.utils.webservice.C11687c;
import com.mrsool.utils.webservice.C11694e;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import p076c.p082c.p083a.C2232l;
import p076c.p082c.p083a.p108y.p110j.C2550c;
import p468g.C13817d0;
import p468g.C13872x;
import p468g.C13873y.C13875b;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* renamed from: com.mrsool.me.EditProfileActivity */
public class EditProfileActivity extends C10787d implements OnClickListener {

    /* renamed from: o0 */
    public static Boolean f29757o0;

    /* renamed from: p0 */
    public static Boolean f29758p0;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public EditText f29759S;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public EditText f29760T;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public ImageView f29761U;

    /* renamed from: V */
    private ImageView f29762V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public TextView f29763W;

    /* renamed from: X */
    private TextView f29764X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public TextView f29765Y;
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public TextView f29766Z;

    /* renamed from: a0 */
    private TextView f29767a0;

    /* renamed from: b0 */
    private TextView f29768b0;

    /* renamed from: c0 */
    private C11669t f29769c0;
    /* access modifiers changed from: private */

    /* renamed from: d0 */
    public ProgressBar f29770d0;

    /* renamed from: e0 */
    private String f29771e0;
    /* access modifiers changed from: private */

    /* renamed from: f0 */
    public String f29772f0;

    /* renamed from: g0 */
    private final int f29773g0 = 1930;

    /* renamed from: h0 */
    private final int f29774h0 = 15;

    /* renamed from: i0 */
    private final int f29775i0 = 30;

    /* renamed from: j0 */
    private int f29776j0 = 0;
    /* access modifiers changed from: private */

    /* renamed from: k0 */
    public int f29777k0 = -1;
    /* access modifiers changed from: private */

    /* renamed from: l0 */
    public List<String> f29778l0 = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: m0 */
    public Dialog f29779m0;
    /* access modifiers changed from: private */

    /* renamed from: n0 */
    public String f29780n0;

    /* renamed from: com.mrsool.me.EditProfileActivity$a */
    class C10837a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ WheelViewNew f29781a;

        C10837a(WheelViewNew wheelViewNew) {
            this.f29781a = wheelViewNew;
        }

        public void onClick(View view) {
            EditProfileActivity editProfileActivity = EditProfileActivity.this;
            editProfileActivity.f29777k0 = editProfileActivity.f29777k0 + -1 >= 0 ? EditProfileActivity.this.f29777k0 - 1 : 0;
            this.f29781a.setSeletion(EditProfileActivity.this.f29777k0);
        }
    }

    /* renamed from: com.mrsool.me.EditProfileActivity$b */
    class C10838b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ WheelViewNew f29783a;

        C10838b(WheelViewNew wheelViewNew) {
            this.f29783a = wheelViewNew;
        }

        public void onClick(View view) {
            EditProfileActivity editProfileActivity = EditProfileActivity.this;
            editProfileActivity.f29777k0 = editProfileActivity.f29777k0 + 1 <= EditProfileActivity.this.f29778l0.size() ? EditProfileActivity.this.f29777k0 + 1 : EditProfileActivity.this.f29778l0.size();
            this.f29783a.setSeletion(EditProfileActivity.this.f29777k0);
        }
    }

    /* renamed from: com.mrsool.me.EditProfileActivity$c */
    class C10839c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ WheelViewNew f29785a;

        C10839c(WheelViewNew wheelViewNew) {
            this.f29785a = wheelViewNew;
        }

        public void onClick(View view) {
            EditProfileActivity.this.f29777k0 = this.f29785a.getSeletedIndex();
            EditProfileActivity.this.f29765Y.setText((CharSequence) EditProfileActivity.this.f29778l0.get(EditProfileActivity.this.f29777k0));
            EditProfileActivity editProfileActivity = EditProfileActivity.this;
            editProfileActivity.f29780n0 = (String) editProfileActivity.f29778l0.get(EditProfileActivity.this.f29777k0);
            EditProfileActivity.this.f29779m0.dismiss();
            EditProfileActivity.this.f29765Y.setCursorVisible(false);
            EditProfileActivity.this.f29765Y.requestFocus();
        }
    }

    /* renamed from: com.mrsool.me.EditProfileActivity$d */
    class C10840d implements OnClickListener {
        C10840d() {
        }

        public void onClick(View view) {
            if (EditProfileActivity.this.f29779m0 != null && EditProfileActivity.this.f29779m0.isShowing()) {
                EditProfileActivity.this.f29779m0.dismiss();
            }
        }
    }

    /* renamed from: com.mrsool.me.EditProfileActivity$e */
    class C10841e extends C2550c {
        C10841e(ImageView imageView) {
            super(imageView);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10023a(Bitmap bitmap) {
            EditProfileActivity.this.f29761U.setScaleType(ScaleType.CENTER_CROP);
            Resources resources = EditProfileActivity.this.getResources();
            C5887x xVar = EditProfileActivity.this.f29642a;
            C0894c a = C0895d.m5185a(resources, C5887x.m25815e(bitmap));
            a.mo4601b(true);
            EditProfileActivity.this.f29761U.setImageDrawable(a);
        }
    }

    /* renamed from: com.mrsool.me.EditProfileActivity$f */
    class C10842f implements C11673d {
        C10842f() {
        }

        /* renamed from: a */
        public void mo36513a() {
        }

        /* renamed from: b */
        public void mo36514b() {
            Intent intent = new Intent(EditProfileActivity.this, TakeImages.class);
            intent.putExtra("PicType", EditProfileActivity.this.getString(C10232R.string.lbl_dg_title_both));
            intent.putExtra("pictureRatio", "1,1");
            EditProfileActivity.this.startActivityForResult(intent, C11644i.f33390q0);
        }
    }

    /* renamed from: com.mrsool.me.EditProfileActivity$g */
    class C10843g implements Callback<UpdateProfile> {
        C10843g() {
        }

        public void onFailure(Call<UpdateProfile> call, Throwable th) {
            try {
                if (EditProfileActivity.this.f29642a != null) {
                    EditProfileActivity.this.f29770d0.setVisibility(8);
                    EditProfileActivity.this.f29642a.mo23492O();
                    EditProfileActivity.f29758p0 = Boolean.valueOf(false);
                    EditProfileActivity.this.f29642a.mo23475F(EditProfileActivity.this.getString(C10232R.string.msg_error_server_issue));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void onResponse(Call<UpdateProfile> call, Response<UpdateProfile> response) {
            String str = "";
            try {
                if (EditProfileActivity.this.f29642a != null) {
                    EditProfileActivity.this.f29642a.mo23492O();
                    EditProfileActivity.this.f29770d0.setVisibility(8);
                    if (response.isSuccessful()) {
                        UpdateProfile updateProfile = (UpdateProfile) response.body();
                        if (EditProfileActivity.this.f29642a != null) {
                            EditProfileActivity.this.f29642a.mo23491N(updateProfile.getMessage());
                        }
                        if (updateProfile.getCode().intValue() <= 300) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(str);
                            sb.append(EditProfileActivity.this.f29760T.getText().toString().trim());
                            EditProfileActivity.this.f29642a.mo23468C().mo23449a("user_name", sb.toString());
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(str);
                            sb2.append(EditProfileActivity.this.f29759S.getText().toString().trim());
                            EditProfileActivity.this.f29642a.mo23468C().mo23449a("user_email", sb2.toString());
                            C5881v C = EditProfileActivity.this.f29642a.mo23468C();
                            String str2 = C11644i.f33387p5;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(str);
                            sb3.append(EditProfileActivity.this.f29766Z.getText().toString().trim());
                            C.mo23449a(str2, sb3.toString());
                            C5881v C2 = EditProfileActivity.this.f29642a.mo23468C();
                            String str3 = C11644i.f33459y5;
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(str);
                            sb4.append(EditProfileActivity.this.f29765Y.getText().toString().trim());
                            C2.mo23449a(str3, sb4.toString());
                            C5881v C3 = EditProfileActivity.this.f29642a.mo23468C();
                            String str4 = C11644i.f33451x5;
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append(str);
                            boolean isActivated = EditProfileActivity.this.f29763W.isActivated();
                            String str5 = C11644i.f33087F5;
                            String str6 = C11644i.f33095G5;
                            sb5.append(isActivated ? str5 : str6);
                            C3.mo23449a(str4, sb5.toString());
                            C11644i.f33072D6.getUser().setVFullName(EditProfileActivity.this.f29760T.getText().toString().trim());
                            C11644i.f33072D6.getUser().setVEmail(EditProfileActivity.this.f29759S.getText().toString().trim());
                            C11644i.f33072D6.getUser().setVPhone(EditProfileActivity.this.f29766Z.getText().toString().trim());
                            C11644i.f33072D6.getUser().setvBirthYear(EditProfileActivity.this.f29765Y.getText().toString().trim());
                            User user = C11644i.f33072D6.getUser();
                            if (!EditProfileActivity.this.f29763W.isActivated()) {
                                str5 = str6;
                            }
                            user.setvGender(str5);
                            EditProfileActivity.this.f29642a.mo23621g0();
                            if (!TextUtils.isEmpty(EditProfileActivity.this.f29772f0)) {
                                C5881v C4 = EditProfileActivity.this.f29642a.mo23468C();
                                String str7 = C11644i.f33395q5;
                                StringBuilder sb6 = new StringBuilder();
                                sb6.append(str);
                                sb6.append(EditProfileActivity.this.f29772f0);
                                C4.mo23449a(str7, sb6.toString());
                                C11644i.f33072D6.getUser().setVProfilePic(EditProfileActivity.this.f29772f0);
                                EditProfileActivity.f29758p0 = Boolean.valueOf(true);
                            }
                            C11644i.f33072D6.getUser().setVFullName(EditProfileActivity.this.f29760T.getText().toString().trim());
                            if (EditProfileActivity.f29758p0.booleanValue()) {
                                Intent intent = new Intent();
                                intent.putExtra("isProfileChange", true);
                                EditProfileActivity.this.setResult(-1, intent);
                                EditProfileActivity.this.finish();
                                EditProfileActivity.this.f29642a.mo23473E(C11644i.f33272c4);
                                return;
                            }
                            EditProfileActivity.this.onBackPressed();
                            return;
                        }
                        EditProfileActivity.this.f29642a.mo23475F(((UpdateProfile) response.body()).getMessage());
                    } else if (EditProfileActivity.this.f29642a != null) {
                        EditProfileActivity.f29758p0 = Boolean.valueOf(false);
                        EditProfileActivity.this.f29642a.mo23492O();
                        EditProfileActivity.this.f29642a.mo23475F(response.message());
                    }
                }
            } catch (Exception e) {
                EditProfileActivity.this.f29642a.mo23492O();
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.mrsool.me.EditProfileActivity$h */
    class C10844h implements OnTouchListener {
        C10844h() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            EditProfileActivity.this.f29760T.requestFocus();
            EditProfileActivity.this.f29760T.setCursorVisible(true);
            return false;
        }
    }

    /* renamed from: com.mrsool.me.EditProfileActivity$i */
    class C10845i extends C2550c {
        C10845i(ImageView imageView) {
            super(imageView);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10023a(Bitmap bitmap) {
            EditProfileActivity.this.f29761U.setScaleType(ScaleType.CENTER_CROP);
            Resources resources = EditProfileActivity.this.getResources();
            C5887x xVar = EditProfileActivity.this.f29642a;
            C0894c a = C0895d.m5185a(resources, C5887x.m25815e(bitmap));
            a.mo4601b(true);
            EditProfileActivity.this.f29761U.setImageDrawable(a);
        }
    }

    /* renamed from: com.mrsool.me.EditProfileActivity$j */
    class C10846j extends C10735d {
        C10846j() {
        }

        /* renamed from: a */
        public void mo36632a(int i, String str) {
        }
    }

    /* renamed from: com.mrsool.me.EditProfileActivity$k */
    class C10847k implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ WheelView f29794a;

        C10847k(WheelView wheelView) {
            this.f29794a = wheelView;
        }

        public void onClick(View view) {
            EditProfileActivity editProfileActivity = EditProfileActivity.this;
            editProfileActivity.f29777k0 = editProfileActivity.f29777k0 + -1 >= 0 ? EditProfileActivity.this.f29777k0 - 1 : 0;
            this.f29794a.setSeletion(EditProfileActivity.this.f29777k0);
        }
    }

    /* renamed from: com.mrsool.me.EditProfileActivity$l */
    class C10848l implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ WheelView f29796a;

        C10848l(WheelView wheelView) {
            this.f29796a = wheelView;
        }

        public void onClick(View view) {
            int i;
            EditProfileActivity editProfileActivity = EditProfileActivity.this;
            if (editProfileActivity.f29777k0 + 1 <= Arrays.asList(new List[]{EditProfileActivity.this.f29778l0}).size()) {
                i = EditProfileActivity.this.f29777k0 + 1;
            } else {
                i = Arrays.asList(new List[]{EditProfileActivity.this.f29778l0}).size();
            }
            editProfileActivity.f29777k0 = i;
            this.f29796a.setSeletion(EditProfileActivity.this.f29777k0);
        }
    }

    /* renamed from: com.mrsool.me.EditProfileActivity$m */
    class C10849m implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ WheelView f29799a;

        /* renamed from: b */
        final /* synthetic */ Dialog f29800b;

        C10849m(WheelView wheelView, Dialog dialog) {
            this.f29799a = wheelView;
            this.f29800b = dialog;
        }

        public void onClick(View view) {
            EditProfileActivity.this.f29777k0 = this.f29799a.getSeletedIndex();
            EditProfileActivity.this.f29765Y.setText((CharSequence) EditProfileActivity.this.f29778l0.get(EditProfileActivity.this.f29777k0));
            this.f29800b.dismiss();
            EditProfileActivity.this.f29765Y.setCursorVisible(false);
            EditProfileActivity.this.f29765Y.requestFocus();
        }
    }

    /* renamed from: com.mrsool.me.EditProfileActivity$n */
    class C10850n implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f29801a;

        C10850n(Dialog dialog) {
            this.f29801a = dialog;
        }

        public void onClick(View view) {
            this.f29801a.dismiss();
        }
    }

    /* renamed from: com.mrsool.me.EditProfileActivity$o */
    class C10851o extends C10750e {
        C10851o() {
        }

        /* renamed from: a */
        public void mo36637a(int i, String str) {
            EditProfileActivity.this.f29777k0 = i - 1;
        }
    }

    /* renamed from: com.mrsool.me.EditProfileActivity$p */
    class C10852p implements C10751f {

        /* renamed from: a */
        final /* synthetic */ WheelViewNew f29804a;

        C10852p(WheelViewNew wheelViewNew) {
            this.f29804a = wheelViewNew;
        }

        /* renamed from: a */
        public void mo36638a(String str) {
            int a = EditProfileActivity.this.m49673i(str);
            if (a != -1) {
                this.f29804a.setSeletion(a);
                EditProfileActivity.this.f29777k0 = a;
            }
        }
    }

    static {
        Boolean valueOf = Boolean.valueOf(false);
        f29757o0 = valueOf;
        f29758p0 = valueOf;
    }

    public EditProfileActivity() {
        String str = "";
        this.f29771e0 = str;
        this.f29772f0 = str;
        this.f29780n0 = str;
    }

    /* renamed from: J */
    private void m49644J() {
        if (!this.f29764X.isActivated()) {
            this.f29763W.setActivated(false);
            this.f29764X.setActivated(true);
        }
    }

    /* renamed from: K */
    private void m49645K() {
        if (!this.f29763W.isActivated()) {
            this.f29763W.setActivated(true);
            this.f29764X.setActivated(false);
        }
    }

    /* renamed from: L */
    private void m49646L() {
        this.f29769c0.mo40036a(C11644i.f33330j, (C11673d) new C10842f());
    }

    /* renamed from: M */
    private void m49647M() {
        String str = "";
        try {
            EditText editText = this.f29760T;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(this.f29642a.mo23471D(C11644i.f33072D6.getUser().getVFullName()));
            editText.setText(sb.toString());
            EditText editText2 = this.f29759S;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(this.f29642a.mo23471D(C11644i.f33072D6.getUser().getVEmail()));
            editText2.setText(sb2.toString());
            TextView textView = this.f29766Z;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(this.f29642a.mo23471D(C11644i.f33072D6.getUser().getVPhone()));
            textView.setText(sb3.toString());
            TextView textView2 = this.f29765Y;
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str);
            sb4.append(this.f29642a.mo23471D(C11644i.f33072D6.getUser().getvBirthYear()));
            textView2.setText(sb4.toString());
            m49648N();
            for (int i = 0; i < this.f29778l0.size(); i++) {
                String str2 = (String) this.f29778l0.get(i);
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(this.f29642a.mo23471D(this.f29642a.mo23468C().mo23459f(C11644i.f33459y5)));
                if (str2.equalsIgnoreCase(sb5.toString())) {
                    this.f29780n0 = (String) this.f29778l0.get(i);
                    this.f29777k0 = i;
                    return;
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0049  */
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m49648N() {
        /*
            r5 = this;
            com.mrsool.utils.x r0 = r5.f29642a
            com.mrsool.utils.v r1 = r0.mo23468C()
            java.lang.String r2 = "gender"
            java.lang.String r1 = r1.mo23459f(r2)
            java.lang.String r0 = r0.mo23471D(r1)
            int r1 = r0.hashCode()
            r2 = -1278174388(0xffffffffb3d09b4c, float:-9.714003E-8)
            r3 = 1
            r4 = 0
            if (r1 == r2) goto L_0x002b
            r2 = 3343885(0x33060d, float:4.685781E-39)
            if (r1 == r2) goto L_0x0021
            goto L_0x0035
        L_0x0021:
            java.lang.String r1 = "male"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0035
            r0 = 0
            goto L_0x0036
        L_0x002b:
            java.lang.String r1 = "female"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0035
            r0 = 1
            goto L_0x0036
        L_0x0035:
            r0 = -1
        L_0x0036:
            if (r0 == 0) goto L_0x0049
            if (r0 == r3) goto L_0x0045
            android.widget.TextView r0 = r5.f29763W
            r0.setActivated(r4)
            android.widget.TextView r0 = r5.f29764X
            r0.setActivated(r4)
            goto L_0x004c
        L_0x0045:
            r5.m49644J()
            goto L_0x004c
        L_0x0049:
            r5.m49645K()
        L_0x004c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mrsool.p409me.EditProfileActivity.m49648N():void");
    }

    /* renamed from: O */
    private void m49649O() {
        if (this.f29642a.mo23502X() && m49651Q()) {
            HashMap hashMap = new HashMap();
            C5887x xVar = this.f29642a;
            C5881v C = xVar.mo23468C();
            String str = C11644i.f33419t5;
            hashMap.put("vDeviceToken", xVar.mo23622h(String.valueOf(C.mo23459f(str) != null ? this.f29642a.mo23468C().mo23459f(str) : C11644i.f33273c5)));
            String str2 = "";
            String str3 = "\"";
            hashMap.put("vFullName", this.f29642a.mo23622h(String.valueOf(this.f29760T.getText().toString().trim().replaceAll(str3, str2))));
            hashMap.put("vEmail", this.f29642a.mo23622h(String.valueOf(this.f29759S.getText().toString().trim().replaceAll(str3, str2))));
            hashMap.put("vGender", this.f29642a.mo23622h(m49652R()));
            hashMap.put("vBirthYear", this.f29642a.mo23622h(this.f29780n0));
            C13875b bVar = null;
            if (this.f29642a.mo23488M() != null) {
                bVar = C13875b.m59383a("vProfilePic", new File(this.f29642a.mo23488M()).getName(), C13817d0.create(C13872x.m59361b("image/*"), this.f29642a.mo23486L()));
            }
            C5887x xVar2 = this.f29642a;
            hashMap.put("device_id", xVar2.mo23622h(xVar2.mo23669w()));
            Call UpdateUserProfile = C11687c.m52645a(this.f29642a).UpdateUserProfile(this.f29642a.mo23468C().mo23459f("user_id"), hashMap, bVar);
            this.f29642a.mo23619g(getString(C10232R.string.app_name), getString(C10232R.string.lbl_dg_loader_loading));
            UpdateUserProfile.enqueue(new C10843g());
        }
    }

    /* renamed from: P */
    private void m49650P() {
        Intent intent = new Intent(this, LoginWithPhoneActivity.class);
        String str = "user_id";
        intent.putExtra(str, String.valueOf(this.f29642a.mo23468C().mo23459f(str)));
        intent.putExtra(C11644i.f33324i2, "EditProfile");
        startActivity(intent);
    }

    /* renamed from: Q */
    private boolean m49651Q() {
        if (TextUtils.isEmpty(this.f29760T.getText().toString().trim())) {
            this.f29642a.mo23615f(getString(C10232R.string.msg_error_blank_user_name), getString(C10232R.string.app_name));
            return false;
        } else if (TextUtils.isEmpty(this.f29759S.getText().toString().trim())) {
            this.f29642a.mo23615f(getString(C10232R.string.msg_error_blank_email), getString(C10232R.string.app_name));
            return false;
        } else if (this.f29642a.mo23563a(this.f29759S)) {
            return true;
        } else {
            this.f29642a.mo23615f(getString(C10232R.string.msg_error_invalid_email), getString(C10232R.string.app_name));
            return false;
        }
    }

    /* renamed from: R */
    private String m49652R() {
        if (this.f29763W.isActivated()) {
            return C11644i.f33087F5;
        }
        return this.f29764X.isActivated() ? C11644i.f33095G5 : "";
    }

    /* renamed from: S */
    private int m49653S() {
        C5881v C = this.f29642a.mo23468C();
        String str = C11644i.f33451x5;
        if (C.mo23459f(str).equalsIgnoreCase(C11644i.f33087F5)) {
            return C10232R.C10235drawable.ic_male_profile_place_holder;
        }
        return this.f29642a.mo23468C().mo23459f(str).equalsIgnoreCase(C11644i.f33095G5) ? C10232R.C10235drawable.ic_female_profile_place_holder : C10232R.C10235drawable.ic_profile_place_holder;
    }

    /* renamed from: T */
    private int m49654T() {
        int i = this.f29777k0;
        for (int i2 = 0; i2 < this.f29778l0.size(); i2++) {
            String str = (String) this.f29778l0.get(i2);
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(this.f29642a.mo23471D(this.f29765Y.getText().toString()));
            if (str.equalsIgnoreCase(sb.toString())) {
                this.f29777k0 = i2;
                return i2;
            }
        }
        return i;
    }

    /* renamed from: U */
    private int m49655U() {
        if (!TextUtils.isEmpty(this.f29780n0)) {
            return m49673i(this.f29780n0);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(this.f29776j0 - 30);
        return m49673i(sb.toString());
    }

    /* renamed from: V */
    private void m49656V() {
        this.f29769c0 = new C11669t(this);
        this.f29770d0 = (ProgressBar) findViewById(C10232R.C10236id.pgEditProfile);
        this.f29759S = (EditText) findViewById(C10232R.C10236id.edtProfileEditEmail);
        this.f29760T = (EditText) findViewById(C10232R.C10236id.edtProfileEditFullName);
        this.f29765Y = (TextView) findViewById(C10232R.C10236id.tvYearOfBirth);
        m49658X();
        this.f29760T.setCursorVisible(false);
        this.f29760T.clearFocus();
        this.f29760T.setOnTouchListener(new C10844h());
        this.f29766Z = (TextView) findViewById(C10232R.C10236id.tvProfileEditPhone);
        this.f29766Z.setOnClickListener(this);
        this.f29765Y.setOnClickListener(this);
        this.f29761U = (ImageView) findViewById(C10232R.C10236id.imgProfileEditProfile);
        this.f29761U.setOnClickListener(this);
        this.f29761U.setOnClickListener(this);
        this.f29763W = (TextView) findViewById(C10232R.C10236id.tvMale);
        this.f29764X = (TextView) findViewById(C10232R.C10236id.tvFemale);
        this.f29763W.setOnClickListener(this);
        this.f29764X.setOnClickListener(this);
        this.f29768b0 = (TextView) findViewById(C10232R.C10236id.btnDone);
        this.f29768b0.setOnClickListener(this);
        m49659Y();
        m49657W();
        m49647M();
        if (this.f29642a.mo23496R()) {
            this.f29642a.mo23545a((ImageView) findViewById(C10232R.C10236id.ivArwPhone));
            this.f29642a.mo23608d(this.f29760T, this.f29759S);
            this.f29766Z.setTextDirection(3);
            this.f29766Z.setGravity(5);
        }
        C5881v C = this.f29642a.mo23468C();
        String str = C11644i.f33387p5;
        if (C.mo23459f(str) != null && !this.f29642a.mo23468C().mo23459f(str).equalsIgnoreCase("")) {
            this.f29771e0 = this.f29642a.mo23468C().mo23459f(str);
            this.f29766Z.setText(this.f29642a.mo23468C().mo23459f(str));
        }
        C2232l.m11649c(getApplicationContext()).mo9515a(getIntent().getStringExtra(C11644i.f33395q5)).mo9441j().m11415e(m49653S()).m11411d().mo9458b(new C10845i(this.f29761U));
    }

    /* renamed from: W */
    private void m49657W() {
        if (this.f29642a.mo23496R()) {
            this.f29763W.setBackground(getResources().getDrawable(C10232R.C10235drawable.selector_female_profile));
            this.f29764X.setBackground(getResources().getDrawable(C10232R.C10235drawable.selector_male_profile));
        }
    }

    /* renamed from: X */
    private void m49658X() {
        this.f29767a0 = (TextView) findViewById(C10232R.C10236id.txtTitle);
        this.f29767a0.setText(getResources().getString(C10232R.string.lbl_edit_ptofile));
        this.f29762V = (ImageView) findViewById(C10232R.C10236id.imgClose);
        this.f29762V.setOnClickListener(this);
        if (this.f29642a.mo23496R()) {
            this.f29762V.setScaleX(-1.0f);
        }
    }

    /* renamed from: Y */
    private void m49659Y() {
        this.f29776j0 = Calendar.getInstance().get(1);
        for (int i = 1930; i < this.f29776j0; i++) {
            List<String> list = this.f29778l0;
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(i);
            list.add(sb.toString());
        }
    }

    /* renamed from: Z */
    private void m49660Z() {
        Dialog dialog = this.f29779m0;
        if (dialog == null || !dialog.isShowing()) {
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
            wheelView.setItems(this.f29778l0);
            wheelView.setSeletion(this.f29777k0);
            Dialog dialog2 = new Dialog(this, C10232R.style.AlertCustomerDialogStyle);
            dialog2.setContentView(inflate);
            this.f29779m0 = dialog2;
            if (!isFinishing()) {
                dialog2.show();
            }
            wheelView.setOnWheelViewListener(new C10846j());
            imageView.setOnClickListener(new C10847k(wheelView));
            imageView2.setOnClickListener(new C10848l(wheelView));
            textView.setOnClickListener(new C10849m(wheelView, dialog2));
            textView2.setOnClickListener(new C10850n(dialog2));
        }
    }

    /* renamed from: a0 */
    private void m49664a0() {
        Dialog dialog = this.f29779m0;
        if ((dialog == null || !dialog.isShowing()) && this.f29778l0.size() != 0) {
            View inflate = LayoutInflater.from(this).inflate(C10232R.layout.custom_wheel_view_year, null);
            ImageView imageView = (ImageView) inflate.findViewById(C10232R.C10236id.imgUp);
            ImageView imageView2 = (ImageView) inflate.findViewById(C10232R.C10236id.imgDown);
            TextView textView = (TextView) inflate.findViewById(C10232R.C10236id.txtOk);
            TextView textView2 = (TextView) inflate.findViewById(C10232R.C10236id.txtCancel);
            WheelViewNew wheelViewNew = (WheelViewNew) inflate.findViewById(C10232R.C10236id.wheel_view_wv);
            wheelViewNew.setSelectorCenterView(inflate.findViewById(C10232R.C10236id.vSelector));
            wheelViewNew.setOffset(1);
            wheelViewNew.setItems(this.f29778l0);
            wheelViewNew.setSeletion(m49655U());
            this.f29779m0 = new Dialog(this);
            this.f29779m0.requestWindowFeature(1);
            this.f29779m0.setContentView(inflate);
            C5887x xVar = this.f29642a;
            if (xVar != null) {
                xVar.mo23535a(this.f29779m0);
            }
            if (!isFinishing()) {
                this.f29779m0.show();
            }
            wheelViewNew.setOnWheelViewListener(new C10851o());
            wheelViewNew.setmOnWheelItemClickListner(new C10852p(wheelViewNew));
            imageView.setOnClickListener(new C10837a(wheelViewNew));
            imageView2.setOnClickListener(new C10838b(wheelViewNew));
            textView.setOnClickListener(new C10839c(wheelViewNew));
            textView2.setOnClickListener(new C10840d());
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
                try {
                    if (this.f29642a.mo23484K().getWidth() == 0 || this.f29642a.mo23484K().getHeight() == 0) {
                        this.f29642a.mo23491N(getString(C10232R.string.error_upload_image));
                        return;
                    }
                } catch (Exception unused) {
                }
                this.f29642a.mo23573b(1080);
                this.f29772f0 = intent.getExtras().getString(str);
                C2232l.m11649c(getApplicationContext()).mo9511a(new File(this.f29772f0)).mo9441j().m11415e((int) C10232R.C10235drawable.user_profile).m11411d().mo9458b(new C10841e(this.f29761U));
            }
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
        if (f29758p0.booleanValue()) {
            Intent intent = new Intent();
            intent.putExtra("isProfileChange", true);
            setResult(-1, intent);
        }
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case C10232R.C10236id.btnDone /*2131361973*/:
                m49649O();
                return;
            case C10232R.C10236id.imgClose /*2131362467*/:
                onBackPressed();
                return;
            case C10232R.C10236id.imgProfileEditProfile /*2131362502*/:
                m49646L();
                return;
            case C10232R.C10236id.tvFemale /*2131363855*/:
                m49644J();
                return;
            case C10232R.C10236id.tvMale /*2131363895*/:
                m49645K();
                return;
            case C10232R.C10236id.tvProfileEditPhone /*2131363947*/:
                m49650P();
                return;
            case C10232R.C10236id.tvYearOfBirth /*2131364021*/:
                m49664a0();
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
        setContentView((int) C10232R.layout.activity_profile_edit_revised);
        m49656V();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C11669t tVar = this.f29769c0;
        if (tVar != null) {
            tVar.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (this.f29642a == null) {
            this.f29642a = new C5887x(this);
        }
        C5881v C = this.f29642a.mo23468C();
        String str = C11644i.f33387p5;
        if (C.mo23459f(str) != null) {
            this.f29771e0 = this.f29642a.mo23468C().mo23459f(str);
            this.f29766Z.setText(this.f29642a.mo23468C().mo23459f(str));
        }
        C5887x xVar = this.f29642a;
        if (!(xVar == null || this.f29766Z == null || xVar.mo23468C().mo23459f(str) == null || this.f29642a.mo23468C().mo23459f(str).length() <= 0)) {
            if (!this.f29771e0.equalsIgnoreCase(this.f29642a.mo23468C().mo23459f(str))) {
                this.f29642a.mo23615f(getString(C10232R.string.msg_info_mobile_number_updated), getString(C10232R.string.app_name));
            }
            this.f29766Z.setText(this.f29642a.mo23468C().mo23459f(str));
        }
        if (f29757o0.booleanValue()) {
            f29758p0 = Boolean.valueOf(true);
            if (this.f29642a.mo23468C().mo23459f(str) != null) {
                this.f29771e0 = this.f29642a.mo23468C().mo23459f(str);
                this.f29766Z.setText(this.f29642a.mo23468C().mo23459f(str));
            }
            f29757o0 = Boolean.valueOf(false);
            this.f29642a.mo23491N(getString(C10232R.string.msg_info_update_number_sucess));
        }
        C5887x xVar2 = this.f29642a;
        if (xVar2 != null && xVar2.mo23620g() && !C11694e.INSTANCE.mo40213h()) {
            this.f29642a.mo23626i();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public int m49673i(String str) {
        for (int i = 0; i < this.f29778l0.size(); i++) {
            if (((String) this.f29778l0.get(i)).equalsIgnoreCase(str)) {
                return i;
            }
        }
        return -1;
    }
}
