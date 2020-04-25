package com.google.android.gms.auth;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.C0203m0;
import com.google.android.gms.common.C4256b;
import com.google.android.gms.common.C4284g;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.internal.C4362l;
import com.google.android.gms.common.p169n.C4432a;
import java.io.IOException;
import java.util.List;

/* renamed from: com.google.android.gms.auth.h */
public class C4041h {

    /* renamed from: a */
    public static final String f12720a = "com.google";

    /* renamed from: b */
    public static final String f12721b = "com.google.work";

    /* renamed from: c */
    private static final String[] f12722c = {"com.google", "com.google.work", "cn.google"};

    /* renamed from: d */
    public static final String f12723d = "suppressProgressScreen";
    @SuppressLint({"InlinedApi"})

    /* renamed from: e */
    public static final String f12724e = "callerUid";
    @SuppressLint({"InlinedApi"})

    /* renamed from: f */
    public static final String f12725f = "androidPackageName";

    /* renamed from: g */
    public static final int f12726g = 1;

    /* renamed from: h */
    public static final int f12727h = 2;

    /* renamed from: i */
    public static final int f12728i = 3;

    /* renamed from: j */
    public static final int f12729j = 4;

    /* renamed from: k */
    private static final ComponentName f12730k = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final C4432a f12731l = new C4432a("Auth", "GoogleAuthUtil");

    C4041h() {
    }

    @Deprecated
    /* renamed from: a */
    public static String m17495a(Context context, String str, String str2) throws IOException, UserRecoverableAuthException, GoogleAuthException {
        return m17493a(context, new Account(str, "com.google"), str2);
    }

    /* renamed from: b */
    public static TokenData m17501b(Context context, Account account, String str, Bundle bundle) throws IOException, UserRecoverableAuthException, GoogleAuthException {
        C4300a0.m18634c("Calling this from your main thread can lead to deadlock");
        C4300a0.m18622a(str, (Object) "Scope cannot be empty or null.");
        m17498a(account);
        m17499a(context, 8400000);
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        String str2 = context.getApplicationInfo().packageName;
        bundle2.putString("clientPackageName", str2);
        if (TextUtils.isEmpty(bundle2.getString(f12725f))) {
            bundle2.putString(f12725f, str2);
        }
        bundle2.putLong("service_connection_start_time_millis", SystemClock.elapsedRealtime());
        return (TokenData) m17491a(context, f12730k, (C4047n<T>) new C4042i<T>(account, str, bundle2));
    }

    @Deprecated
    @C0203m0("android.permission.MANAGE_ACCOUNTS")
    /* renamed from: c */
    public static void m17504c(Context context, String str) {
        AccountManager.get(context).invalidateAuthToken("com.google", str);
    }

    @Deprecated
    /* renamed from: a */
    public static String m17496a(Context context, String str, String str2, Bundle bundle) throws IOException, UserRecoverableAuthException, GoogleAuthException {
        return m17494a(context, new Account(str, "com.google"), str2, bundle);
    }

    /* renamed from: a */
    public static String m17493a(Context context, Account account, String str) throws IOException, UserRecoverableAuthException, GoogleAuthException {
        return m17494a(context, account, str, new Bundle());
    }

    /* renamed from: a */
    public static String m17494a(Context context, Account account, String str, Bundle bundle) throws IOException, UserRecoverableAuthException, GoogleAuthException {
        m17498a(account);
        return m17501b(context, account, str, bundle).mo17293i();
    }

    /* renamed from: a */
    public static void m17500a(Context context, String str) throws GooglePlayServicesAvailabilityException, GoogleAuthException, IOException {
        C4300a0.m18634c("Calling this from your main thread can lead to deadlock");
        m17499a(context, 8400000);
        Bundle bundle = new Bundle();
        String str2 = context.getApplicationInfo().packageName;
        bundle.putString("clientPackageName", str2);
        if (!bundle.containsKey(f12725f)) {
            bundle.putString(f12725f, str2);
        }
        m17491a(context, f12730k, (C4047n<T>) new C4043j<T>(str, bundle));
    }

    /* renamed from: b */
    public static String m17503b(Context context, String str) throws GoogleAuthException, IOException {
        C4300a0.m18622a(str, (Object) "accountName must be provided");
        C4300a0.m18634c("Calling this from your main thread can lead to deadlock");
        m17499a(context, 8400000);
        return m17496a(context, str, "^^_account_id_^^", new Bundle());
    }

    /* renamed from: a */
    public static List<AccountChangeEvent> m17497a(Context context, int i, String str) throws GoogleAuthException, IOException {
        C4300a0.m18622a(str, (Object) "accountName must be provided");
        C4300a0.m18634c("Calling this from your main thread can lead to deadlock");
        m17499a(context, 8400000);
        return (List) m17491a(context, f12730k, (C4047n<T>) new C4044k<T>(str, i));
    }

    @TargetApi(23)
    /* renamed from: a */
    public static Bundle m17488a(Context context, Account account) throws GoogleAuthException, IOException {
        C4300a0.m18620a(context);
        m17498a(account);
        m17499a(context, 8400000);
        return (Bundle) m17491a(context, f12730k, (C4047n<T>) new C4045l<T>(account));
    }

    @TargetApi(26)
    /* renamed from: a */
    public static Boolean m17490a(Context context) throws GoogleAuthException, IOException {
        C4300a0.m18620a(context);
        m17499a(context, 11400000);
        return (Boolean) m17491a(context, f12730k, (C4047n<T>) new C4046m<T>(context.getApplicationInfo().packageName));
    }

    /* renamed from: a */
    private static void m17498a(Account account) {
        if (account == null) {
            throw new IllegalArgumentException("Account cannot be null");
        } else if (!TextUtils.isEmpty(account.name)) {
            String[] strArr = f12722c;
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                if (!strArr[i].equals(account.type)) {
                    i++;
                } else {
                    return;
                }
            }
            throw new IllegalArgumentException("Account type not supported");
        } else {
            throw new IllegalArgumentException("Account name cannot be empty!");
        }
    }

    /* renamed from: a */
    private static void m17499a(Context context, int i) throws GoogleAuthException {
        try {
            C4284g.ensurePlayServicesAvailable(context.getApplicationContext(), i);
        } catch (GooglePlayServicesRepairableException e) {
            throw new GooglePlayServicesAvailabilityException(e.mo17592d(), e.getMessage(), e.mo17593a());
        } catch (GooglePlayServicesNotAvailableException e2) {
            throw new GoogleAuthException(e2.getMessage());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static <T> T m17492a(T t) throws IOException {
        if (t != null) {
            return t;
        }
        f12731l.mo18437e("GoogleAuthUtil", "Binder call returned null.");
        throw new IOException("Service unavailable.");
    }

    /* renamed from: a */
    private static <T> T m17491a(Context context, ComponentName componentName, C4047n<T> nVar) throws IOException, GoogleAuthException {
        String str = "Error on service connection.";
        C4256b bVar = new C4256b();
        C4362l a = C4362l.m18835a(context);
        String str2 = "GoogleAuthUtil";
        if (a.mo18334a(componentName, (ServiceConnection) bVar, str2)) {
            try {
                T a2 = nVar.mo17573a(bVar.mo18020a());
                a.mo18336b(componentName, (ServiceConnection) bVar, str2);
                return a2;
            } catch (RemoteException | InterruptedException e) {
                f12731l.mo18435c(str2, str, e);
                throw new IOException(str, e);
            } catch (Throwable th) {
                a.mo18336b(componentName, (ServiceConnection) bVar, str2);
                throw th;
            }
        } else {
            throw new IOException("Could not bind to service.");
        }
    }
}
