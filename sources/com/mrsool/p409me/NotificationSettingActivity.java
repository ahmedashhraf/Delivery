package com.mrsool.p409me;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.content.C0841b;
import com.mrsool.C10232R;
import com.mrsool.C10787d;
import com.mrsool.bean.NotificationBean;
import com.mrsool.bean.UserDetail;
import com.mrsool.p423v.C11730j;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.webservice.C11687c;
import java.util.HashMap;
import p053b.p072g.p073b.C2128a;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* renamed from: com.mrsool.me.NotificationSettingActivity */
public class NotificationSettingActivity extends C10787d implements OnClickListener, OnCheckedChangeListener {

    /* renamed from: S */
    private LinearLayout f29818S;

    /* renamed from: T */
    private LinearLayout f29819T;

    /* renamed from: U */
    private LinearLayout f29820U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public SwitchCompat f29821V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public SwitchCompat f29822W;
    /* access modifiers changed from: private */

    /* renamed from: X */
    public SwitchCompat f29823X;

    /* renamed from: Y */
    private OnCheckedChangeListener f29824Y;

    /* renamed from: Z */
    private OnCheckedChangeListener f29825Z;

    /* renamed from: a0 */
    private OnCheckedChangeListener f29826a0;

    /* renamed from: b0 */
    private TextView f29827b0;

    /* renamed from: c0 */
    private ImageView f29828c0;

    /* renamed from: com.mrsool.me.NotificationSettingActivity$a */
    class C10855a implements OnCheckedChangeListener {
        C10855a() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            NotificationSettingActivity notificationSettingActivity = NotificationSettingActivity.this;
            notificationSettingActivity.m49704a(notificationSettingActivity.f29822W.isChecked(), NotificationSettingActivity.this.f29823X.isChecked(), NotificationSettingActivity.this.f29821V.isChecked());
        }
    }

    /* renamed from: com.mrsool.me.NotificationSettingActivity$b */
    class C10856b implements OnCheckedChangeListener {
        C10856b() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            NotificationSettingActivity notificationSettingActivity = NotificationSettingActivity.this;
            notificationSettingActivity.m49704a(notificationSettingActivity.f29822W.isChecked(), NotificationSettingActivity.this.f29823X.isChecked(), NotificationSettingActivity.this.f29821V.isChecked());
        }
    }

    /* renamed from: com.mrsool.me.NotificationSettingActivity$c */
    class C10857c implements OnCheckedChangeListener {
        C10857c() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (NotificationSettingActivity.this.f29642a.mo23502X()) {
                NotificationSettingActivity notificationSettingActivity = NotificationSettingActivity.this;
                notificationSettingActivity.m49704a(notificationSettingActivity.f29822W.isChecked(), NotificationSettingActivity.this.f29823X.isChecked(), NotificationSettingActivity.this.f29821V.isChecked());
            }
        }
    }

    /* renamed from: com.mrsool.me.NotificationSettingActivity$d */
    class C10858d implements Callback<NotificationBean> {

        /* renamed from: a */
        final /* synthetic */ boolean f29832a;

        C10858d(boolean z) {
            this.f29832a = z;
        }

        public void onFailure(Call<NotificationBean> call, Throwable th) {
        }

        public void onResponse(Call<NotificationBean> call, Response<NotificationBean> response) {
            if (response.isSuccessful() && ((NotificationBean) response.body()).getCode().intValue() <= 300) {
                UserDetail userDetail = C11644i.f33072D6;
                if (userDetail != null && userDetail.getUser() != null) {
                    Boolean valueOf = Boolean.valueOf(NotificationSettingActivity.this.m49708c(this.f29832a));
                    C11644i.f33072D6.getUser().setbNotification(Boolean.valueOf(((NotificationBean) response.body()).isbNotification()));
                    C11644i.f33072D6.getUser().setbAnnouncement(Boolean.valueOf(((NotificationBean) response.body()).isbAnnouncement()));
                    C11644i.f33072D6.getUser().setbNearbyOrder(Boolean.valueOf(((NotificationBean) response.body()).isbNearbyOrder()));
                    if (valueOf.booleanValue()) {
                        NotificationSettingActivity.this.f29642a.mo23621g0();
                    }
                }
            }
        }
    }

    /* renamed from: J */
    private void m49697J() {
        UserDetail userDetail = C11644i.f33072D6;
        if (!(userDetail == null || userDetail.getUser() == null)) {
            C11644i.f33072D6.getUser().getIs_courier().booleanValue();
            this.f29822W.setChecked(C11644i.f33072D6.getUser().getbAnnouncement().booleanValue());
            this.f29823X.setChecked(C11644i.f33072D6.getUser().getbNotification().booleanValue());
            this.f29821V.setChecked(C11644i.f33072D6.getUser().getbNearbyOrder().booleanValue());
        }
        this.f29821V.setOnCheckedChangeListener(this.f29824Y);
        this.f29822W.setOnCheckedChangeListener(this.f29825Z);
        this.f29823X.setOnCheckedChangeListener(this.f29826a0);
    }

    /* renamed from: K */
    private void m49698K() {
        m49701N();
        this.f29821V = (SwitchCompat) findViewById(C10232R.C10236id.swtSettingnearByNotification);
        this.f29822W = (SwitchCompat) findViewById(C10232R.C10236id.swtSettingAnnouncementNotification);
        this.f29823X = (SwitchCompat) findViewById(C10232R.C10236id.swtSettingNewOrderNotification);
        this.f29818S = (LinearLayout) findViewById(C10232R.C10236id.llSettingNearByNoti);
        this.f29819T = (LinearLayout) findViewById(C10232R.C10236id.llSettingAnnouncementNoti);
        this.f29820U = (LinearLayout) findViewById(C10232R.C10236id.llSettingNewOrderNoti);
        m49700M();
        m49697J();
    }

    /* renamed from: L */
    private boolean m49699L() {
        try {
            if (C11644i.f33072D6 == null || C11644i.f33072D6.getUser() == null || !C11644i.f33072D6.getUser().getIs_courier().booleanValue()) {
                if (!C11644i.f33072D6.getUser().getbAnnouncement().booleanValue()) {
                    return false;
                }
                return true;
            }
            if (!C11644i.f33072D6.getUser().getbNearbyOrder().booleanValue() || !C11644i.f33072D6.getUser().getbNotification().booleanValue() || !C11644i.f33072D6.getUser().getbAnnouncement().booleanValue()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
        }
    }

    /* renamed from: M */
    private void m49700M() {
        this.f29824Y = new C10855a();
        this.f29825Z = new C10856b();
        this.f29826a0 = new C10857c();
    }

    /* renamed from: N */
    private void m49701N() {
        this.f29827b0 = (TextView) findViewById(C10232R.C10236id.txtTitle);
        this.f29827b0.setText(getResources().getString(C10232R.string.lbl_notifications));
        this.f29828c0 = (ImageView) findViewById(C10232R.C10236id.imgClose);
        this.f29828c0.setOnClickListener(this);
        if (this.f29642a.mo23496R()) {
            this.f29828c0.setScaleX(-1.0f);
        }
    }

    public void onBackPressed() {
        Intent intent = new Intent(C11644i.f33442w4);
        intent.putExtra(C11644i.f33124K2, m49699L());
        C2128a.m11089a((Context) this).mo9219a(intent);
        super.onBackPressed();
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (compoundButton.getId()) {
            case C10232R.C10236id.swtSettingAnnouncementNotification /*2131363665*/:
                if (this.f29642a.mo23502X()) {
                    m49704a(this.f29822W.isChecked(), this.f29821V.isChecked(), this.f29823X.isChecked());
                    return;
                }
                return;
            case C10232R.C10236id.swtSettingNewOrderNotification /*2131363666*/:
                if (this.f29642a.mo23502X()) {
                    m49704a(this.f29822W.isChecked(), this.f29821V.isChecked(), this.f29823X.isChecked());
                    return;
                }
                return;
            case C10232R.C10236id.swtSettingnearByNotification /*2131363667*/:
                if (this.f29642a.mo23502X()) {
                    m49704a(this.f29822W.isChecked(), this.f29821V.isChecked(), this.f29823X.isChecked());
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void onClick(View view) {
        if (view.getId() == C10232R.C10236id.imgClose) {
            onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (VERSION.SDK_INT >= 23) {
            C11730j.m52797a((Activity) this, C0841b.m4915a((Context) this, (int) C10232R.C10234color.pending_order_bg));
            C11730j.m52801b(this);
        }
        setContentView((int) C10232R.layout.activity_notification_setting);
        m49698K();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public boolean m49708c(boolean z) {
        return C11644i.f33072D6.getUser().getbAnnouncement().booleanValue() != z;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m49704a(boolean z, boolean z2, boolean z3) {
        if (this.f29642a.mo23502X()) {
            HashMap hashMap = new HashMap();
            hashMap.put("current_user", this.f29642a.mo23476G());
            hashMap.put("auth_token", this.f29642a.mo23468C().mo23459f(C11644i.f33443w5));
            hashMap.put("vDeviceToken", this.f29642a.mo23468C().mo23459f(C11644i.f33419t5));
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(z);
            hashMap.put("bAnnouncement", sb.toString());
            C11687c.m52645a(this.f29642a).updateNotificationStatus(this.f29642a.mo23476G(), hashMap).enqueue(new C10858d(z));
        }
    }
}
