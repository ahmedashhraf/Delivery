package com.mrsool.utils.push;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.C0193h0;
import androidx.core.app.C0770p;
import androidx.core.app.C0770p.C0771a;
import androidx.core.app.C0770p.C0771a.C0772a;
import androidx.core.app.C0770p.C0778d;
import androidx.core.app.C0770p.C0779e;
import androidx.core.app.C0770p.C0791n;
import androidx.core.app.C0807w;
import androidx.core.app.C0807w.C0808a;
import androidx.core.content.FileProvider;
import androidx.core.p024e.p025b.C0886a;
import com.clevertap.android.sdk.C3150p0;
import com.facebook.internal.ServerProtocol;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.mrsool.C10232R;
import com.mrsool.HomeActivity;
import com.mrsool.SplashActivity;
import com.mrsool.WebviewActivity;
import com.mrsool.bean.messages;
import com.mrsool.shop.PendingOrdersActivity;
import com.mrsool.shop.ShopDetailActivity;
import com.mrsool.shop.ShopDetailPackageActivity;
import com.mrsool.utils.AppSingleton;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C5880q;
import com.mrsool.utils.C5881v;
import com.mrsool.utils.C5887x;
import java.io.File;
import java.io.Serializable;
import java.util.Date;
import java.util.Map.Entry;
import org.jcodec.codecs.common.biari.MQEncoder;
import p053b.p072g.p073b.C2128a;

public class MyFirebaseMessagingService extends FirebaseMessagingService {

    /* renamed from: d0 */
    private static final String f33524d0 = "MyFirebaseMsgService";

    /* renamed from: e0 */
    public static final int f33525e0 = 101;

    /* renamed from: f0 */
    public static final String f33526f0 = "keyintenthelp";

    /* renamed from: g0 */
    private static final String f33527g0 = "shop_key_emails";

    /* renamed from: h0 */
    private static final String f33528h0 = "order_key_emails";

    /* renamed from: i0 */
    private static final String f33529i0 = "mix_key_emails";

    /* renamed from: j0 */
    public static final String f33530j0 = "NotificationReply";

    /* renamed from: R */
    private int f33531R = 111;

    /* renamed from: S */
    private int f33532S = C11644i.f33366n0;

    /* renamed from: T */
    private int f33533T = 333;

    /* renamed from: U */
    private int f33534U = 0;

    /* renamed from: V */
    private int f33535V = 0;

    /* renamed from: W */
    private int f33536W = 0;

    /* renamed from: X */
    private String f33537X;

    /* renamed from: Y */
    private Intent f33538Y;

    /* renamed from: Z */
    private String f33539Z;

    /* renamed from: a0 */
    private C5887x f33540a0;

    /* renamed from: b0 */
    private String f33541b0;

    /* renamed from: c0 */
    private boolean f33542c0;

    public MyFirebaseMessagingService() {
        String str = "";
        this.f33537X = str;
        this.f33538Y = null;
        this.f33539Z = str;
        this.f33541b0 = str;
        this.f33542c0 = false;
    }

    /* renamed from: c */
    private void m52543c(RemoteMessage remoteMessage) {
        Intent intent = new Intent(C11644i.f33434v4);
        intent.putExtra(C11644i.f33463z1, (String) remoteMessage.mo32197O().get("image"));
        intent.putExtra(C11644i.f33391q1, (String) remoteMessage.mo32197O().get("message"));
        intent.putExtra(C11644i.f33243Z1, (String) remoteMessage.mo32197O().get("desc"));
        intent.putExtra(C11644i.f33367n1, this.f33539Z);
        intent.putExtra(C11644i.f33199T5, "broadcast");
        C2128a.m11089a((Context) this).mo9219a(intent);
    }

    /* renamed from: d */
    private boolean m52545d(RemoteMessage remoteMessage) {
        try {
            if (remoteMessage.mo32197O().size() > 0) {
                Bundle bundle = new Bundle();
                for (Entry entry : remoteMessage.mo32197O().entrySet()) {
                    bundle.putString((String) entry.getKey(), (String) entry.getValue());
                }
                if (C3150p0.m15266d(bundle).f11197a) {
                    m52542c();
                    C3150p0.m15151a((Context) this, bundle);
                    return true;
                }
            }
            return false;
        } catch (Throwable unused) {
            C5880q.m25751b("MYFCMLIST Error parsing FCM message");
            return false;
        }
    }

    /* renamed from: e */
    private Boolean m52547e(RemoteMessage remoteMessage) {
        try {
            if (((String) remoteMessage.mo32197O().get(C3150p0.f11231S0)).equalsIgnoreCase(ServerProtocol.DIALOG_RETURN_SCOPES_TRUE) && TextUtils.isEmpty((CharSequence) remoteMessage.mo32197O().get("nm"))) {
                return Boolean.valueOf(true);
            }
        } catch (Exception unused) {
        }
        return Boolean.valueOf(false);
    }

    /* renamed from: f */
    private int m52548f() {
        return VERSION.SDK_INT <= 25 ? 1 : 4;
    }

    /* renamed from: g */
    private String m52549g() {
        if (!TextUtils.isEmpty(this.f33537X)) {
            String str = ":";
            if (this.f33537X.contains(str)) {
                String[] split = this.f33537X.split(str);
                if (split.length > 1) {
                    return split[1].trim();
                }
            }
        }
        return this.f33537X;
    }

    /* renamed from: h */
    private Boolean m52550h() {
        return Boolean.valueOf(this.f33541b0.equalsIgnoreCase("complaint"));
    }

    /* renamed from: i */
    private boolean m52551i() {
        return m52556n() && this.f33539Z.equalsIgnoreCase(C11644i.f33218W0);
    }

    /* renamed from: j */
    private boolean m52552j() {
        return C11644i.f33194T0.equalsIgnoreCase(this.f33539Z);
    }

    /* renamed from: k */
    private boolean m52553k() {
        return m52554l() && m52552j();
    }

    /* renamed from: l */
    private boolean m52554l() {
        return this.f33541b0.equalsIgnoreCase(C11644i.f33239Y5);
    }

    /* renamed from: m */
    private Boolean m52555m() {
        return Boolean.valueOf(this.f33540a0.mo23515a(ShopDetailActivity.class).booleanValue() || this.f33540a0.mo23515a(ShopDetailPackageActivity.class).booleanValue() || this.f33540a0.mo23515a(PendingOrdersActivity.class).booleanValue());
    }

    /* renamed from: n */
    private boolean m52556n() {
        return this.f33541b0.equalsIgnoreCase(C11644i.f33247Z5) || this.f33541b0.equalsIgnoreCase("service");
    }

    /* renamed from: o */
    private void m52557o() {
        Intent intent = new Intent(C11644i.f33109I3);
        intent.putExtra(C11644i.f33359m1, this.f33541b0);
        intent.putExtra(C11644i.f33314h1, this.f33539Z);
        C2128a.m11089a((Context) this).mo9219a(intent);
    }

    /* renamed from: a */
    public void mo12649a(RemoteMessage remoteMessage) {
        this.f33540a0 = new C5887x(this);
        if (remoteMessage.mo32197O().size() > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Message data payload data : ");
            sb.append(remoteMessage.mo32197O());
            C5880q.m25753d(sb.toString());
            String str = "type";
            this.f33541b0 = (String) remoteMessage.mo32197O().get(str);
            this.f33537X = (String) remoteMessage.mo32197O().get("message");
            String str2 = "id";
            String str3 = "";
            this.f33539Z = remoteMessage.mo32197O().get(str2) == null ? str3 : (String) remoteMessage.mo32197O().get(str2);
            C5887x xVar = this.f33540a0;
            if (xVar == null || xVar.mo23501W()) {
                if (this.f33541b0 == null) {
                    this.f33541b0 = str3;
                }
                if (remoteMessage.mo32197O().containsKey(str)) {
                    m52540a(this.f33541b0, remoteMessage);
                } else if (!m52547e(remoteMessage).booleanValue() && !m52545d(remoteMessage)) {
                    this.f33538Y = new Intent(this, SplashActivity.class);
                    this.f33538Y.setFlags(805306368);
                    m52539a(this.f33538Y, remoteMessage);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo32193b(@C0193h0 String str) {
        C5880q.m25753d("onTokenRefresh");
        this.f33540a0 = new C5887x(this);
        StringBuilder sb = new StringBuilder();
        sb.append("Firebase token Refreshed : ");
        sb.append(str);
        C5880q.m25753d(sb.toString());
        C5887x xVar = this.f33540a0;
        C5881v C = xVar.mo23468C();
        String str2 = C11644i.f33419t5;
        if (xVar.mo23661t(C.mo23459f(str2)) == null) {
            this.f33540a0.mo23468C().mo23449a(str2, str != null ? str : C11644i.f33273c5);
        } else if (str != null && !this.f33540a0.mo23468C().mo23459f(str2).equalsIgnoreCase(str)) {
            this.f33540a0.mo23468C().mo23449a(str2, str);
        }
        if (str != null) {
            Intent intent = new Intent(C11644i.f33149N3);
            C2128a a = C2128a.m11089a((Context) this);
            intent.putExtra(C11644i.f33170Q0, str);
            a.mo9219a(intent);
        }
        super.mo32193b(str);
    }

    /* renamed from: e */
    private int m52546e() {
        String valueOf = String.valueOf(new Date().getTime());
        return Integer.valueOf(valueOf.substring(valueOf.length() - 5)).intValue();
    }

    /* renamed from: c */
    private void m52542c() {
        try {
            C3150p0 p0Var = AppSingleton.f16949P;
            C3150p0.m15159a(getApplicationContext(), "CT_GroupId", (CharSequence) "CT_GroupInitCampaign");
            C3150p0 p0Var2 = AppSingleton.f16949P;
            C3150p0.m15160a(getApplicationContext(), "CT_campaignid", (CharSequence) "Mrsool promotion", "We will send promotional notification in this channel.", 5, "CT_GroupId", true);
        } catch (Exception unused) {
        }
    }

    /* renamed from: d */
    private void m52544d() {
        if (VERSION.SDK_INT >= 26) {
            NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
            String y = this.f33540a0.mo23674y();
            if (TextUtils.isEmpty(y)) {
                StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(System.currentTimeMillis());
                y = sb.toString();
                this.f33540a0.mo23470D().mo23454b(C11644i.f33055B5, y);
            }
            if (notificationManager == null || notificationManager.getNotificationChannel(y) == null) {
                String string = getResources().getString(C10232R.string.notification_channel_name);
                String string2 = getResources().getString(C10232R.string.notification_channel_description);
                NotificationChannel notificationChannel = new NotificationChannel(y, string, 4);
                notificationChannel.setDescription(string2);
                notificationChannel.enableLights(true);
                notificationChannel.setSound(mo40023b(), null);
                notificationChannel.setLightColor(C0886a.f4059c);
                notificationManager.createNotificationChannel(notificationChannel);
            }
        }
    }

    /* renamed from: b */
    private void m52541b(RemoteMessage remoteMessage) {
        if (((String) remoteMessage.mo32197O().get("inline")).equalsIgnoreCase(ServerProtocol.DIALOG_RETURN_SCOPES_TRUE)) {
            String str = (String) remoteMessage.mo32197O().get("other_user_id");
            if (!TextUtils.isEmpty(str)) {
                messages a = m52538a(m52549g(), this.f33539Z, str);
                Intent intent = new Intent(C11644i.f33117J3);
                intent.putExtra(C11644i.f33274c6, a);
                C2128a.m11089a(WebviewActivity.f27459U).mo9219a(intent);
            }
        }
    }

    /* renamed from: a */
    private void m52540a(String str, RemoteMessage remoteMessage) {
        if (this.f33540a0.mo23501W()) {
            char c = 65535;
            int hashCode = str.hashCode();
            String str2 = "service";
            String str3 = C11644i.f33301f6;
            String str4 = C11644i.f33239Y5;
            String str5 = C11644i.f33247Z5;
            String str6 = C11644i.f33274c6;
            String str7 = C11644i.f33265b6;
            String str8 = "complaint";
            switch (hashCode) {
                case -1403061077:
                    if (str.equals(str8)) {
                        c = 4;
                        break;
                    }
                    break;
                case -1354814997:
                    if (str.equals(str7)) {
                        c = 3;
                        break;
                    }
                    break;
                case 3052376:
                    if (str.equals(str6)) {
                        c = 2;
                        break;
                    }
                    break;
                case 3529462:
                    if (str.equals(str5)) {
                        c = 0;
                        break;
                    }
                    break;
                case 106006350:
                    if (str.equals(str4)) {
                        c = 1;
                        break;
                    }
                    break;
                case 156781895:
                    if (str.equals(str3)) {
                        c = 6;
                        break;
                    }
                    break;
                case 1159915126:
                    if (str.equals(C11644i.f33319h6)) {
                        c = 8;
                        break;
                    }
                    break;
                case 1428477471:
                    if (str.equals(C11644i.f33328i6)) {
                        c = 9;
                        break;
                    }
                    break;
                case 1597617262:
                    if (str.equals(C11644i.f33310g6)) {
                        c = 7;
                        break;
                    }
                    break;
                case 1722065341:
                    if (str.equals(C11644i.f33337j6)) {
                        c = 10;
                        break;
                    }
                    break;
                case 1984153269:
                    if (str.equals(str2)) {
                        c = 5;
                        break;
                    }
                    break;
            }
            String str9 = C11644i.f33070D4;
            String str10 = C11644i.f33199T5;
            switch (c) {
                case 0:
                    this.f33538Y = new Intent(this, HomeActivity.class);
                    this.f33538Y.putExtra(str10, getString(C10232R.string.lbl_push_notification));
                    this.f33538Y.putExtra(C11644i.f33367n1, this.f33539Z);
                    this.f33538Y.putExtra(C11644i.f33359m1, str5);
                    this.f33538Y.putExtra(C11644i.f33399r1, true);
                    this.f33538Y.addFlags(872415232);
                    break;
                case 1:
                    this.f33538Y = new Intent(this, HomeActivity.class);
                    this.f33538Y.putExtra(str10, getString(C10232R.string.lbl_push_notification));
                    this.f33538Y.putExtra(C11644i.f33314h1, this.f33539Z);
                    this.f33538Y.putExtra(C11644i.f33359m1, str4);
                    this.f33538Y.addFlags(872415232);
                    break;
                case 2:
                    this.f33538Y = new Intent(this, HomeActivity.class);
                    this.f33538Y.putExtra(str10, getString(C10232R.string.lbl_push_notification));
                    this.f33538Y.putExtra(C11644i.f33314h1, this.f33539Z);
                    this.f33538Y.putExtra(C11644i.f33359m1, str6);
                    this.f33538Y.addFlags(872415232);
                    break;
                case 3:
                    this.f33538Y = new Intent(this, HomeActivity.class);
                    this.f33538Y.putExtra(str10, getString(C10232R.string.lbl_push_notification));
                    this.f33538Y.putExtra(C11644i.f33359m1, str7);
                    this.f33538Y.putExtra(C11644i.f33367n1, this.f33539Z);
                    this.f33538Y.addFlags(872415232);
                    break;
                case 4:
                    this.f33538Y = new Intent(this, HomeActivity.class);
                    this.f33538Y.putExtra(str10, getString(C10232R.string.lbl_push_notification));
                    this.f33538Y.putExtra(C11644i.f33359m1, str8);
                    this.f33538Y.putExtra(C11644i.f33051B1, this.f33539Z);
                    this.f33538Y.putExtra(C11644i.f33279d2, (String) remoteMessage.mo32197O().get(C11644i.f33411s5));
                    this.f33538Y.addFlags(872415232);
                    break;
                case 5:
                    this.f33538Y = new Intent(this, HomeActivity.class);
                    this.f33538Y.putExtra(str10, getString(C10232R.string.lbl_push_notification));
                    this.f33538Y.putExtra(C11644i.f33359m1, str2);
                    this.f33538Y.putExtra(C11644i.f33367n1, this.f33539Z);
                    this.f33538Y.putExtra(C11644i.f33399r1, true);
                    this.f33538Y.addFlags(872415232);
                    break;
                case 6:
                    this.f33538Y = new Intent(this, HomeActivity.class);
                    this.f33538Y.putExtra(str10, getString(C10232R.string.lbl_push_notification));
                    this.f33538Y.putExtra(C11644i.f33359m1, str3);
                    this.f33538Y.putExtra(C11644i.f33463z1, (String) remoteMessage.mo32197O().get("image"));
                    this.f33538Y.putExtra(C11644i.f33391q1, (String) remoteMessage.mo32197O().get("message"));
                    this.f33538Y.putExtra(C11644i.f33243Z1, (String) remoteMessage.mo32197O().get("desc"));
                    this.f33538Y.putExtra(C11644i.f33367n1, this.f33539Z);
                    this.f33538Y.addFlags(872415232);
                    break;
                case 7:
                    Intent intent = new Intent(str9);
                    intent.putExtra(C11644i.f33314h1, this.f33539Z);
                    intent.putExtra(C11644i.f33171Q1, true);
                    String str11 = C11644i.f33341k1;
                    StringBuilder sb = new StringBuilder();
                    String str12 = "";
                    sb.append(str12);
                    sb.append((String) remoteMessage.mo32197O().get(C11644i.f33306g2));
                    intent.putExtra(str11, sb.toString() == null ? Double.valueOf(0.0d) : (Serializable) remoteMessage.mo32197O().get(C11644i.f33306g2));
                    String str13 = C11644i.f33350l1;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str12);
                    sb2.append((String) remoteMessage.mo32197O().get(C11644i.f33315h2));
                    intent.putExtra(str13, sb2.toString() == null ? Double.valueOf(0.0d) : (Serializable) remoteMessage.mo32197O().get(C11644i.f33315h2));
                    C2128a.m11089a(getApplicationContext()).mo9219a(intent);
                    break;
                case 8:
                    Intent intent2 = new Intent(str9);
                    intent2.putExtra(C11644i.f33314h1, this.f33539Z);
                    intent2.putExtra(C11644i.f33171Q1, false);
                    C2128a.m11089a(getApplicationContext()).mo9219a(intent2);
                    break;
                case 9:
                    this.f33540a0.mo23623h(C11644i.f33457y3, this.f33539Z);
                    Intent intent3 = new Intent(C11644i.f33086F4);
                    intent3.putExtra(C11644i.f33314h1, this.f33539Z);
                    intent3.putExtra(C11644i.f33171Q1, true);
                    C2128a.m11089a(getApplicationContext()).mo9219a(intent3);
                    break;
                case 10:
                    this.f33540a0.mo23623h(C11644i.f33465z3, this.f33539Z);
                    Intent intent4 = new Intent(C11644i.f33094G4);
                    intent4.putExtra(C11644i.f33314h1, this.f33539Z);
                    intent4.putExtra(C11644i.f33171Q1, false);
                    C2128a.m11089a(getApplicationContext()).mo9219a(intent4);
                    break;
            }
        }
        Intent intent5 = this.f33538Y;
        if (intent5 != null) {
            m52539a(intent5, remoteMessage);
            return;
        }
        this.f33538Y = new Intent(this, SplashActivity.class);
        this.f33538Y.addFlags(805306368);
        m52539a(this.f33538Y, remoteMessage);
    }

    /* renamed from: b */
    public Uri mo40023b() {
        this.f33542c0 = false;
        C5881v C = this.f33540a0.mo23468C();
        String str = C11644i.f33111I5;
        if (C.mo23459f(str) == null) {
            return RingtoneManager.getDefaultUri(2);
        }
        try {
            if (VERSION.SDK_INT < 24) {
                return Uri.parse(this.f33540a0.mo23468C().mo23459f(str));
            }
            File file = new File(Uri.parse(this.f33540a0.mo23468C().mo23459f(str)).getPath());
            if (!file.exists()) {
                return Uri.parse(this.f33540a0.mo23468C().mo23459f(str));
            }
            Context applicationContext = getApplicationContext();
            StringBuilder sb = new StringBuilder();
            sb.append(getApplication().getPackageName());
            sb.append(".provider");
            Uri a = FileProvider.m4903a(applicationContext, sb.toString(), file);
            this.f33542c0 = true;
            return a;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    private void m52539a(Intent intent, RemoteMessage remoteMessage) {
        String str = C11644i.f33274c6;
        try {
            m52544d();
            C11644i.f33276d = (NotificationManager) getSystemService("notification");
            PendingIntent activity = PendingIntent.getActivity(this, (int) System.currentTimeMillis(), intent, MQEncoder.CARRY_MASK);
            Resources resources = getResources();
            C0807w a = new C0808a("NotificationReply").mo4410a((CharSequence) getResources().getString(C10232R.string.hint_type_a_reply)).mo4414a();
            int e = m52546e();
            C0771a a2 = new C0772a(C10232R.C10235drawable.app_icon, getString(C10232R.string.hint_reply_to), PendingIntent.getBroadcast(getApplicationContext(), 101, new Intent(getApplicationContext(), NotificationReceiver.class).putExtra("keyintenthelp", 101).putExtra(C11644i.f33314h1, this.f33539Z).putExtra(C11644i.f33342k2, (String) remoteMessage.mo32197O().get(C11644i.f33342k2)).putExtra(C11644i.f33333j2, e), MQEncoder.CARRY_MASK)).mo4169a(a).mo4171a();
            C0779e a3 = new C0779e(this, getResources().getString(C10232R.string.notification_channel_id)).mo4229b(C0770p.f3526h0).mo4234c((CharSequence) getResources().getString(C10232R.string.app_name)).mo4228b((CharSequence) this.f33537X).mo4253g((int) C10232R.C10235drawable.ic_notification_small_new).mo4251f(true).mo4206a(BitmapFactory.decodeResource(resources, C10232R.mipmap.app_icon)).mo4217a(true).mo4213a((C0791n) new C0778d().mo4193a((CharSequence) this.f33537X)).mo4204a(activity).mo4232c(-1).mo4235c(this.f33540a0.mo23674y()).mo4249f(m52548f()).mo4207a(mo40023b());
            if (this.f33541b0.equalsIgnoreCase(str) && VERSION.SDK_INT >= 24) {
                a3.mo4211a(a2);
            }
            Notification a4 = a3.mo4196a();
            if (this.f33541b0.equalsIgnoreCase(str)) {
                if (!C11644i.f33269c1 || C11644i.f33226X0 || C11644i.f33234Y0 || C11644i.f33242Z0 || !C11644i.f33251a1) {
                    try {
                        if (C11644i.f33260b1) {
                            this.f33540a0.mo23617f0();
                        } else if (!C11644i.f33226X0) {
                            this.f33540a0.mo23596c(this.f33542c0);
                            C11644i.f33276d.notify(e, a4);
                        } else if (!m52552j()) {
                            this.f33540a0.mo23596c(this.f33542c0);
                            C11644i.f33276d.notify(e, a4);
                        } else {
                            m52541b(remoteMessage);
                            C5880q.m25751b("chat message push order sreen opened");
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            }
            boolean z = C11644i.f33226X0;
            String str2 = C11644i.f33197T3;
            String str3 = C11644i.f33189S3;
            String str4 = C11644i.f33205U3;
            String str5 = C11644i.f33181R3;
            if (z) {
                if (m52553k()) {
                    C11644i.f33276d.cancel(e);
                    if (TextUtils.isEmpty(C11644i.f33241Z) || !C11644i.f33241Z.equalsIgnoreCase(C11644i.f33325i3) || !m52552j()) {
                        this.f33540a0.mo23473E(str5);
                        this.f33540a0.mo23473E(str4);
                        this.f33540a0.mo23473E(str3);
                        this.f33540a0.mo23473E(str2);
                        this.f33540a0.mo23596c(this.f33542c0);
                        this.f33540a0.mo23473E(C11644i.f33299f4);
                    } else {
                        this.f33540a0.mo23473E(str5);
                        this.f33540a0.mo23473E(str4);
                        this.f33540a0.mo23473E(str3);
                        this.f33540a0.mo23473E(str2);
                        this.f33540a0.mo23473E(C11644i.f33054B4);
                        this.f33540a0.mo23596c(this.f33542c0);
                        C11644i.f33276d.notify(e, a4);
                    }
                }
            }
            if (!C11644i.f33226X0 || !m52550h().booleanValue()) {
                boolean booleanValue = m52555m().booleanValue();
                String str6 = C11644i.f33157O3;
                if (booleanValue) {
                    if (m52551i()) {
                        C11644i.f33276d.cancel(e);
                        this.f33540a0.mo23596c(this.f33542c0);
                        C11644i.f33276d.notify(e, a4);
                        intent.putExtra("isChat", false);
                        this.f33540a0.mo23473E(str6);
                    }
                }
                boolean l = m52554l();
                String str7 = C11644i.f33141M3;
                if (l) {
                    if (C11644i.f33251a1) {
                        m52557o();
                        this.f33540a0.mo23596c(this.f33542c0);
                        C11644i.f33276d.notify(e, a4);
                        if (getApplicationContext() != null) {
                            this.f33540a0.mo23473E(str3);
                            this.f33540a0.mo23473E(str2);
                            this.f33540a0.mo23473E(str5);
                            this.f33540a0.mo23473E(str4);
                            if (getApplicationContext() != null && this.f33540a0.mo23583b(getApplicationContext())) {
                                this.f33540a0.mo23473E(str7);
                            }
                            this.f33540a0.mo23473E(str6);
                        }
                    }
                }
                boolean z2 = C11644i.f33251a1;
                String str8 = C11644i.f33337j6;
                String str9 = C11644i.f33328i6;
                String str10 = C11644i.f33310g6;
                if (z2) {
                    if (this.f33541b0.equalsIgnoreCase(C11644i.f33301f6)) {
                        m52543c(remoteMessage);
                    } else if (this.f33541b0.equalsIgnoreCase("complaint")) {
                        C11644i.f33276d.notify(e, a4);
                        this.f33540a0.mo23596c(this.f33542c0);
                    } else {
                        m52557o();
                        if (!this.f33541b0.equalsIgnoreCase(str10) && !this.f33541b0.equalsIgnoreCase(str9)) {
                            if (!this.f33541b0.equalsIgnoreCase(str8)) {
                                if (!C11644i.f33260b1) {
                                    C11644i.f33276d.notify(e, a4);
                                    this.f33540a0.mo23596c(this.f33542c0);
                                } else if (m52556n()) {
                                    this.f33540a0.mo23596c(this.f33542c0);
                                    C11644i.f33276d.notify(e, a4);
                                }
                                if (this.f33540a0.mo23583b(getApplicationContext())) {
                                    this.f33540a0.mo23473E(str3);
                                    this.f33540a0.mo23473E(str2);
                                    this.f33540a0.mo23473E(str5);
                                    this.f33540a0.mo23473E(str4);
                                    this.f33540a0.mo23473E(str7);
                                    this.f33540a0.mo23473E(str6);
                                }
                            }
                        }
                        return;
                    }
                } else if (C11644i.f33242Z0) {
                    m52557o();
                    C11644i.f33276d.cancelAll();
                } else {
                    if (!this.f33541b0.equalsIgnoreCase(str10) && !this.f33541b0.equalsIgnoreCase(str9)) {
                        if (!this.f33541b0.equalsIgnoreCase(str8)) {
                            C11644i.f33093G3++;
                            C11644i.f33276d.notify(e, a4);
                            this.f33540a0.mo23596c(this.f33542c0);
                            if (this.f33540a0.mo23583b(getApplicationContext())) {
                                this.f33540a0.mo23473E(str3);
                                this.f33540a0.mo23473E(str2);
                                this.f33540a0.mo23473E(str5);
                                this.f33540a0.mo23473E(str4);
                                this.f33540a0.mo23473E(str7);
                                this.f33540a0.mo23473E(str6);
                            }
                        }
                    }
                    return;
                }
            }
            this.f33540a0.mo23473E(C11644i.f33062C4);
            this.f33540a0.mo23596c(this.f33542c0);
            C11644i.f33276d.notify(e, a4);
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo40022a(int i) {
        ((NotificationManager) getSystemService("notification")).cancel(i);
    }

    /* renamed from: a */
    private messages m52538a(String str, String str2, String str3) {
        Long valueOf = Long.valueOf(System.currentTimeMillis() / 1000);
        messages messages = new messages();
        StringBuilder sb = new StringBuilder();
        String str4 = "";
        sb.append(str4);
        sb.append(valueOf);
        messages.setId(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str4);
        sb2.append(valueOf);
        messages.setvMessageId(sb2.toString());
        C5887x xVar = this.f33540a0;
        messages.setSender_username(xVar.mo23646o(xVar.mo23468C().mo23459f("user_name")));
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str4);
        sb3.append(valueOf);
        messages.setCreated_at(sb3.toString());
        messages.setiAddress(str4);
        messages.setOrderId(str2);
        messages.setiToOrderID(str2);
        messages.setiFromUserId(str3);
        messages.setiToUserId(this.f33540a0.mo23476G());
        messages.setvType("text");
        messages.setTxContent(str);
        StringBuilder sb4 = new StringBuilder();
        sb4.append("replyMessage in getMessageObject ");
        sb4.append(str);
        C5880q.m25751b(sb4.toString());
        return messages;
    }
}
