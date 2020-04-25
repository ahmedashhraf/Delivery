package com.google.android.gms.common;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Looper;
import android.os.Message;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.annotation.C0187e0;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0221u;
import androidx.annotation.C0224v0;
import androidx.core.app.C0770p.C0778d;
import androidx.core.app.C0770p.C0779e;
import androidx.core.app.C0770p.C0791n;
import androidx.fragment.app.C1376c;
import com.bogdwellers.pinchtozoom.C2945d;
import com.google.android.gms.base.C4049R;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.api.C4083h;
import com.google.android.gms.common.api.C4235j;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.C4102c;
import com.google.android.gms.common.api.internal.C4137i;
import com.google.android.gms.common.api.internal.C4162m;
import com.google.android.gms.common.api.internal.C4203t1;
import com.google.android.gms.common.api.internal.C4208u1;
import com.google.android.gms.common.api.internal.C4223x1;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.internal.C4312d0;
import com.google.android.gms.common.internal.C4334g;
import com.google.android.gms.common.internal.C4340i;
import com.google.android.gms.common.internal.C4372o;
import com.google.android.gms.common.util.C4493l;
import com.google.android.gms.common.util.C4503v;
import com.google.android.gms.tasks.C5543c;
import com.google.android.gms.tasks.C5560k;
import com.google.android.gms.tasks.C5566n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import p076c.p112d.p113a.p114a.p118d.p121c.C2612r;

/* renamed from: com.google.android.gms.common.e */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public class C4279e extends C4282f {

    /* renamed from: h */
    private static final Object f13273h = new Object();

    /* renamed from: i */
    private static final C4279e f13274i = new C4279e();

    /* renamed from: j */
    public static final int f13275j = C4282f.f13284a;

    /* renamed from: k */
    public static final String f13276k = "com.google.android.gms";
    @C0221u("mLock")

    /* renamed from: g */
    private String f13277g;

    @SuppressLint({"HandlerLeak"})
    /* renamed from: com.google.android.gms.common.e$a */
    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    private class C4280a extends C2612r {

        /* renamed from: b */
        private final Context f13278b;

        public C4280a(Context context) {
            super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
            this.f13278b = context.getApplicationContext();
        }

        public final void handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                StringBuilder sb = new StringBuilder(50);
                sb.append("Don't know how to handle this message: ");
                sb.append(i);
                sb.toString();
                return;
            }
            int d = C4279e.this.mo18113d(this.f13278b);
            if (C4279e.this.mo18112c(d)) {
                C4279e.this.mo18115e(this.f13278b, d);
            }
        }
    }

    /* renamed from: a */
    public static C4279e m18476a() {
        return f13274i;
    }

    /* renamed from: b */
    public boolean mo18109b(Activity activity, int i, int i2) {
        return mo18110b(activity, i, i2, null);
    }

    /* renamed from: c */
    public final boolean mo18112c(int i) {
        return super.mo18112c(i);
    }

    @C4372o
    /* renamed from: d */
    public int mo18113d(Context context) {
        return super.mo18113d(context);
    }

    /* renamed from: e */
    public void mo18115e(Context context, int i) {
        m18479a(context, i, (String) null, mo18119a(context, i, 0, "n"));
    }

    @C0187e0
    /* renamed from: a */
    public C5560k<Void> mo18101a(Activity activity) {
        int i = f13275j;
        C4300a0.m18626a("makeGooglePlayServicesAvailable must be called from the main thread");
        int a = mo18094a((Context) activity, i);
        if (a == 0) {
            return C5566n.m24211a(null);
        }
        C4223x1 b = C4223x1.m18273b(activity);
        b.mo17817b(new ConnectionResult(a, null), 0);
        return b.mo17993h();
    }

    /* renamed from: b */
    public boolean mo18110b(Activity activity, int i, int i2, OnCancelListener onCancelListener) {
        Dialog a = mo18096a(activity, i, i2, onCancelListener);
        if (a == null) {
            return false;
        }
        m18478a(activity, a, GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    @C4056a
    @C4312d0
    /* renamed from: c */
    public int mo18111c(Context context) {
        return super.mo18111c(context);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final void mo18114e(Context context) {
        new C4280a(context).sendEmptyMessageDelayed(1, 120000);
    }

    /* renamed from: b */
    public void mo18107b(Context context, ConnectionResult connectionResult) {
        m18479a(context, connectionResult.mo17576N(), (String) null, mo18098a(context, connectionResult));
    }

    /* renamed from: b */
    private static C5560k<Map<C4102c<?>, String>> m18480b(C4235j<?> jVar, C4235j<?>... jVarArr) {
        String str = "Requested API must not be null.";
        C4300a0.m18621a(jVar, (Object) str);
        for (C4235j<?> a : jVarArr) {
            C4300a0.m18621a(a, (Object) str);
        }
        ArrayList arrayList = new ArrayList(jVarArr.length + 1);
        arrayList.add(jVar);
        arrayList.addAll(Arrays.asList(jVarArr));
        return C4137i.m17847e().mo17846a((Iterable<? extends C4235j<?>>) arrayList);
    }

    /* renamed from: a */
    public Dialog mo18095a(Activity activity, int i, int i2) {
        return mo18096a(activity, i, i2, (OnCancelListener) null);
    }

    /* renamed from: a */
    public Dialog mo18096a(Activity activity, int i, int i2, OnCancelListener onCancelListener) {
        return m18475a((Context) activity, i, C4340i.m18799a(activity, mo18099a((Context) activity, i, C2945d.f10439h), i2), onCancelListener);
    }

    @C0224v0(otherwise = 2)
    /* renamed from: b */
    private final String m18481b() {
        String str;
        synchronized (f13273h) {
            str = this.f13277g;
        }
        return str;
    }

    /* renamed from: a */
    public final boolean mo18104a(Activity activity, @C0193h0 C4162m mVar, int i, int i2, OnCancelListener onCancelListener) {
        Dialog a = m18475a((Context) activity, i, C4340i.m18801a(mVar, mo18099a((Context) activity, i, C2945d.f10439h), 2), onCancelListener);
        if (a == null) {
            return false;
        }
        m18478a(activity, a, GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    @TargetApi(26)
    /* renamed from: b */
    public void mo18108b(@C0193h0 Context context, @C0193h0 String str) {
        if (C4503v.m19420n()) {
            C4300a0.m18620a(((NotificationManager) context.getSystemService("notification")).getNotificationChannel(str));
        }
        synchronized (f13273h) {
            this.f13277g = str;
        }
    }

    /* renamed from: a */
    public final boolean mo18105a(Context context, ConnectionResult connectionResult, int i) {
        PendingIntent a = mo18098a(context, connectionResult);
        if (a == null) {
            return false;
        }
        m18479a(context, connectionResult.mo17576N(), (String) null, GoogleApiActivity.m17528a(context, a, i));
        return true;
    }

    /* renamed from: a */
    public static Dialog m18474a(Activity activity, OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, 16842874);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        Builder builder = new Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(C4334g.m18784b(activity, 18));
        builder.setPositiveButton("", null);
        AlertDialog create = builder.create();
        m18478a(activity, (Dialog) create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    /* renamed from: b */
    public final String mo18106b(int i) {
        return super.mo18106b(i);
    }

    @C0195i0
    /* renamed from: a */
    public final C4208u1 mo18100a(Context context, C4203t1 t1Var) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        C4208u1 u1Var = new C4208u1(t1Var);
        context.registerReceiver(u1Var, intentFilter);
        u1Var.mo17977a(context);
        if (mo18122a(context, "com.google.android.gms")) {
            return u1Var;
        }
        t1Var.mo17835a();
        u1Var.mo17976a();
        return null;
    }

    /* renamed from: a */
    public C5560k<Void> mo18103a(C4235j<?> jVar, C4235j<?>... jVarArr) {
        return m18480b(jVar, jVarArr).mo21995a(C4441s.f13609a);
    }

    /* renamed from: a */
    public C5560k<Void> mo18102a(C4083h<?> hVar, C4083h<?>... hVarArr) {
        return m18480b((C4235j<?>) hVar, (C4235j<?>[]) hVarArr).mo21990a((C5543c<TResult, TContinuationResult>) new C4440r<TResult,TContinuationResult>(this));
    }

    @C4056a
    @C4312d0
    /* renamed from: a */
    public int mo18094a(Context context, int i) {
        return super.mo18094a(context, i);
    }

    @C4056a
    @C4312d0
    @C0195i0
    /* renamed from: a */
    public Intent mo18099a(Context context, int i, @C0195i0 String str) {
        return super.mo18099a(context, i, str);
    }

    @C0195i0
    /* renamed from: a */
    public PendingIntent mo18097a(Context context, int i, int i2) {
        return super.mo18097a(context, i, i2);
    }

    @C0195i0
    /* renamed from: a */
    public PendingIntent mo18098a(Context context, ConnectionResult connectionResult) {
        if (connectionResult.mo17579Q()) {
            return connectionResult.mo17578P();
        }
        return mo18097a(context, connectionResult.mo17576N(), 0);
    }

    /* renamed from: a */
    static Dialog m18475a(Context context, int i, C4340i iVar, OnCancelListener onCancelListener) {
        Builder builder = null;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new Builder(context, 5);
        }
        if (builder == null) {
            builder = new Builder(context);
        }
        builder.setMessage(C4334g.m18784b(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String a = C4334g.m18780a(context, i);
        if (a != null) {
            builder.setPositiveButton(a, iVar);
        }
        String e = C4334g.m18787e(context, i);
        if (e != null) {
            builder.setTitle(e);
        }
        return builder.create();
    }

    /* renamed from: a */
    static void m18478a(Activity activity, Dialog dialog, String str, OnCancelListener onCancelListener) {
        if (activity instanceof C1376c) {
            C4424l.m19063a(dialog, onCancelListener).show(((C1376c) activity).getSupportFragmentManager(), str);
            return;
        }
        C4258c.m18392a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    @TargetApi(20)
    /* renamed from: a */
    private final void m18479a(Context context, int i, String str, PendingIntent pendingIntent) {
        int i2;
        if (i == 18) {
            mo18114e(context);
        } else if (pendingIntent != null) {
            String d = C4334g.m18786d(context, i);
            String c = C4334g.m18785c(context, i);
            Resources resources = context.getResources();
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            C0779e a = new C0779e(context).mo4242d(true).mo4217a(true).mo4234c((CharSequence) d).mo4213a((C0791n) new C0778d().mo4193a((CharSequence) c));
            if (C4493l.m19381e(context)) {
                C4300a0.m18631b(C4503v.m19415i());
                a.mo4253g(context.getApplicationInfo().icon).mo4249f(2);
                if (C4493l.m19382f(context)) {
                    a.mo4201a(C4049R.C4051drawable.common_full_open_on_phone, (CharSequence) resources.getString(C4049R.string.common_open_on_phone), pendingIntent);
                } else {
                    a.mo4204a(pendingIntent);
                }
            } else {
                a.mo4253g(17301642).mo4245e((CharSequence) resources.getString(C4049R.string.common_google_play_services_notification_ticker)).mo4223b(System.currentTimeMillis()).mo4204a(pendingIntent).mo4228b((CharSequence) c);
            }
            if (C4503v.m19420n()) {
                C4300a0.m18631b(C4503v.m19420n());
                String b = m18481b();
                if (b == null) {
                    b = "com.google.android.gms.availability";
                    NotificationChannel notificationChannel = notificationManager.getNotificationChannel(b);
                    String b2 = C4334g.m18783b(context);
                    if (notificationChannel == null) {
                        notificationManager.createNotificationChannel(new NotificationChannel(b, b2, 4));
                    } else if (!b2.contentEquals(notificationChannel.getName())) {
                        notificationChannel.setName(b2);
                        notificationManager.createNotificationChannel(notificationChannel);
                    }
                }
                a.mo4235c(b);
            }
            Notification a2 = a.mo4196a();
            if (i == 1 || i == 2 || i == 3) {
                i2 = 10436;
                C4284g.sCanceledAvailabilityNotification.set(false);
            } else {
                i2 = 39789;
            }
            notificationManager.notify(i2, a2);
        }
    }
}
