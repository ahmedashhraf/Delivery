package com.clevertap.android.sdk;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import androidx.fragment.app.C1376c;
import java.lang.ref.WeakReference;

public final class InAppNotificationActivity extends C1376c implements C3109b {

    /* renamed from: O */
    private static boolean f10908O = false;

    /* renamed from: N */
    private WeakReference<C3057g> f10909N;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public CTInAppNotification f10910a;

    /* renamed from: b */
    private CleverTapInstanceConfig f10911b;

    /* renamed from: com.clevertap.android.sdk.InAppNotificationActivity$a */
    class C3051a implements OnClickListener {
        C3051a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Bundle bundle = new Bundle();
            bundle.putString("wzrk_id", InAppNotificationActivity.this.f10910a.mo11939k());
            bundle.putString("wzrk_c2a", ((CTInAppNotificationButton) InAppNotificationActivity.this.f10910a.mo11938j().get(0)).mo11979l());
            InAppNotificationActivity.this.mo12151a(bundle);
            String a = ((CTInAppNotificationButton) InAppNotificationActivity.this.f10910a.mo11938j().get(0)).mo11964a();
            if (a != null) {
                InAppNotificationActivity.this.mo12153a(a, bundle);
            } else {
                InAppNotificationActivity.this.mo12155b(bundle);
            }
        }
    }

    /* renamed from: com.clevertap.android.sdk.InAppNotificationActivity$b */
    class C3052b implements OnClickListener {
        C3052b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Bundle bundle = new Bundle();
            bundle.putString("wzrk_id", InAppNotificationActivity.this.f10910a.mo11939k());
            bundle.putString("wzrk_c2a", ((CTInAppNotificationButton) InAppNotificationActivity.this.f10910a.mo11938j().get(1)).mo11979l());
            InAppNotificationActivity.this.mo12151a(bundle);
            String a = ((CTInAppNotificationButton) InAppNotificationActivity.this.f10910a.mo11938j().get(1)).mo11964a();
            if (a != null) {
                InAppNotificationActivity.this.mo12153a(a, bundle);
            } else {
                InAppNotificationActivity.this.mo12155b(bundle);
            }
        }
    }

    /* renamed from: com.clevertap.android.sdk.InAppNotificationActivity$c */
    class C3053c implements OnClickListener {
        C3053c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Bundle bundle = new Bundle();
            bundle.putString("wzrk_id", InAppNotificationActivity.this.f10910a.mo11939k());
            bundle.putString("wzrk_c2a", ((CTInAppNotificationButton) InAppNotificationActivity.this.f10910a.mo11938j().get(0)).mo11979l());
            InAppNotificationActivity.this.mo12151a(bundle);
            String a = ((CTInAppNotificationButton) InAppNotificationActivity.this.f10910a.mo11938j().get(0)).mo11964a();
            if (a != null) {
                InAppNotificationActivity.this.mo12153a(a, bundle);
            } else {
                InAppNotificationActivity.this.mo12155b(bundle);
            }
        }
    }

    /* renamed from: com.clevertap.android.sdk.InAppNotificationActivity$d */
    class C3054d implements OnClickListener {
        C3054d() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Bundle bundle = new Bundle();
            bundle.putString("wzrk_id", InAppNotificationActivity.this.f10910a.mo11939k());
            bundle.putString("wzrk_c2a", ((CTInAppNotificationButton) InAppNotificationActivity.this.f10910a.mo11938j().get(1)).mo11979l());
            InAppNotificationActivity.this.mo12151a(bundle);
            String a = ((CTInAppNotificationButton) InAppNotificationActivity.this.f10910a.mo11938j().get(1)).mo11964a();
            if (a != null) {
                InAppNotificationActivity.this.mo12153a(a, bundle);
            } else {
                InAppNotificationActivity.this.mo12155b(bundle);
            }
        }
    }

    /* renamed from: com.clevertap.android.sdk.InAppNotificationActivity$e */
    class C3055e implements OnClickListener {
        C3055e() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Bundle bundle = new Bundle();
            bundle.putString("wzrk_id", InAppNotificationActivity.this.f10910a.mo11939k());
            bundle.putString("wzrk_c2a", ((CTInAppNotificationButton) InAppNotificationActivity.this.f10910a.mo11938j().get(2)).mo11979l());
            InAppNotificationActivity.this.mo12151a(bundle);
            String a = ((CTInAppNotificationButton) InAppNotificationActivity.this.f10910a.mo11938j().get(2)).mo11964a();
            if (a != null) {
                InAppNotificationActivity.this.mo12153a(a, bundle);
            } else {
                InAppNotificationActivity.this.mo12155b(bundle);
            }
        }
    }

    /* renamed from: com.clevertap.android.sdk.InAppNotificationActivity$f */
    static /* synthetic */ class C3056f {

        /* renamed from: a */
        static final /* synthetic */ int[] f10917a = new int[C3071b0.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.clevertap.android.sdk.b0[] r0 = com.clevertap.android.sdk.C3071b0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10917a = r0
                int[] r0 = f10917a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.clevertap.android.sdk.b0 r1 = com.clevertap.android.sdk.C3071b0.CTInAppTypeCoverHTML     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f10917a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.clevertap.android.sdk.b0 r1 = com.clevertap.android.sdk.C3071b0.CTInAppTypeInterstitialHTML     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f10917a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.clevertap.android.sdk.b0 r1 = com.clevertap.android.sdk.C3071b0.CTInAppTypeHalfInterstitialHTML     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f10917a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.clevertap.android.sdk.b0 r1 = com.clevertap.android.sdk.C3071b0.CTInAppTypeCover     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f10917a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.clevertap.android.sdk.b0 r1 = com.clevertap.android.sdk.C3071b0.CTInAppTypeInterstitial     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f10917a     // Catch:{ NoSuchFieldError -> 0x004b }
                com.clevertap.android.sdk.b0 r1 = com.clevertap.android.sdk.C3071b0.CTInAppTypeHalfInterstitial     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f10917a     // Catch:{ NoSuchFieldError -> 0x0056 }
                com.clevertap.android.sdk.b0 r1 = com.clevertap.android.sdk.C3071b0.CTInAppTypeCoverImageOnly     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                int[] r0 = f10917a     // Catch:{ NoSuchFieldError -> 0x0062 }
                com.clevertap.android.sdk.b0 r1 = com.clevertap.android.sdk.C3071b0.CTInAppTypeInterstitialImageOnly     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f10917a     // Catch:{ NoSuchFieldError -> 0x006e }
                com.clevertap.android.sdk.b0 r1 = com.clevertap.android.sdk.C3071b0.CTInAppTypeHalfInterstitialImageOnly     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                int[] r0 = f10917a     // Catch:{ NoSuchFieldError -> 0x007a }
                com.clevertap.android.sdk.b0 r1 = com.clevertap.android.sdk.C3071b0.CTInAppTypeAlert     // Catch:{ NoSuchFieldError -> 0x007a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007a }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007a }
            L_0x007a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.clevertap.android.sdk.InAppNotificationActivity.C3056f.<clinit>():void");
        }
    }

    /* renamed from: com.clevertap.android.sdk.InAppNotificationActivity$g */
    interface C3057g {
        /* renamed from: a */
        void mo12165a(Context context, CTInAppNotification cTInAppNotification, Bundle bundle);

        /* renamed from: b */
        void mo12166b(Context context, CTInAppNotification cTInAppNotification, Bundle bundle);

        /* renamed from: c */
        void mo12167c(Context context, CTInAppNotification cTInAppNotification, Bundle bundle);
    }

    /* renamed from: D */
    private C3112i m14692D() {
        AlertDialog alertDialog;
        C3071b0 s = this.f10910a.mo11947s();
        switch (C3056f.f10917a[s.ordinal()]) {
            case 1:
                return new C3146o();
            case 2:
                return new C3215s();
            case 3:
                return new C3207q();
            case 4:
                return new C3218t();
            case 5:
                return new C3251z();
            case 6:
                return new C3233w();
            case 7:
                return new C3225u();
            case 8:
                return new C3064a0();
            case 9:
                return new C3239x();
            case 10:
                if (this.f10910a.mo11938j().size() > 0) {
                    if (VERSION.SDK_INT >= 21) {
                        alertDialog = new Builder(this, 16974394).setCancelable(false).setTitle(this.f10910a.mo11955z()).setMessage(this.f10910a.mo11951w()).setPositiveButton(((CTInAppNotificationButton) this.f10910a.mo11938j().get(0)).mo11979l(), new C3051a()).create();
                        if (this.f10910a.mo11938j().size() == 2) {
                            alertDialog.setButton(-2, ((CTInAppNotificationButton) this.f10910a.mo11938j().get(1)).mo11979l(), new C3052b());
                        }
                    } else {
                        alertDialog = new Builder(this).setCancelable(false).setTitle(this.f10910a.mo11955z()).setMessage(this.f10910a.mo11951w()).setPositiveButton(((CTInAppNotificationButton) this.f10910a.mo11938j().get(0)).mo11979l(), new C3053c()).create();
                        if (this.f10910a.mo11938j().size() == 2) {
                            alertDialog.setButton(-2, ((CTInAppNotificationButton) this.f10910a.mo11938j().get(1)).mo11979l(), new C3054d());
                        }
                    }
                    if (this.f10910a.mo11938j().size() > 2) {
                        alertDialog.setButton(-3, ((CTInAppNotificationButton) this.f10910a.mo11938j().get(2)).mo11979l(), new C3055e());
                    }
                } else {
                    alertDialog = null;
                }
                alertDialog.show();
                f10908O = true;
                mo12157c(null);
                return null;
            default:
                C3111h1 l = this.f10911b.mo12108l();
                StringBuilder sb = new StringBuilder();
                sb.append("InAppNotificationActivity: Unhandled InApp Type: ");
                sb.append(s);
                l.mo12314c(sb.toString());
                return null;
        }
    }

    /* renamed from: E */
    private String m14693E() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f10911b.mo12093a());
        sb.append(":CT_INAPP_CONTENT_FRAGMENT");
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: C */
    public C3057g mo12149C() {
        C3057g gVar;
        try {
            gVar = (C3057g) this.f10909N.get();
        } catch (Throwable unused) {
            gVar = null;
        }
        if (gVar == null) {
            C3111h1 l = this.f10911b.mo12108l();
            String a = this.f10911b.mo12093a();
            StringBuilder sb = new StringBuilder();
            sb.append("InAppActivityListener is null for notification: ");
            sb.append(this.f10910a.mo11948t());
            l.mo12315c(a, sb.toString());
        }
        return gVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo12155b(Bundle bundle) {
        if (f10908O) {
            f10908O = false;
        }
        finish();
        C3057g C = mo12149C();
        if (C != null) {
            C.mo12166b(getBaseContext(), this.f10910a, bundle);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo12157c(Bundle bundle) {
        C3057g C = mo12149C();
        if (C != null) {
            C.mo12165a(getBaseContext(), this.f10910a, bundle);
        }
    }

    public void finish() {
        super.finish();
        overridePendingTransition(17432576, 17432577);
    }

    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(17432576, 17432577);
        finish();
        mo12155b(null);
    }

    public void onCreate(Bundle bundle) {
        String str = "config";
        String str2 = "inApp";
        super.onCreate(bundle);
        int i = getResources().getConfiguration().orientation;
        if (i == 2) {
            getWindow().addFlags(1024);
        }
        try {
            Bundle extras = getIntent().getExtras();
            if (extras != null) {
                this.f10910a = (CTInAppNotification) extras.getParcelable(str2);
                this.f10911b = (CleverTapInstanceConfig) extras.getParcelable(str);
                mo12152a((C3057g) C3150p0.m15209b(getApplicationContext(), this.f10911b));
                String str3 = "Error displaying InAppNotification";
                if (this.f10910a.mo11925L() && !this.f10910a.mo11924K()) {
                    try {
                        setRequestedOrientation(1);
                    } catch (Throwable th) {
                        C3111h1.m14933d(str3, th);
                        if (i == 2) {
                            C3111h1.m14930d("App in Landscape, dismissing portrait InApp Notification");
                            finish();
                            mo12155b(null);
                            return;
                        }
                        C3111h1.m14930d("App in Portrait, displaying InApp Notification anyway");
                    }
                }
                if (!this.f10910a.mo11925L() && this.f10910a.mo11924K()) {
                    try {
                        setRequestedOrientation(0);
                    } catch (Throwable th2) {
                        C3111h1.m14933d(str3, th2);
                        if (i == 1) {
                            C3111h1.m14930d("App in Portrait, dismissing landscape InApp Notification");
                            finish();
                            mo12155b(null);
                            return;
                        }
                        C3111h1.m14930d("App in Landscape, displaying InApp Notification anyway");
                    }
                }
                if (bundle == null) {
                    C3112i D = m14692D();
                    if (D != null) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putParcelable(str2, this.f10910a);
                        bundle2.putParcelable(str, this.f10911b);
                        D.setArguments(bundle2);
                        getFragmentManager().beginTransaction().setCustomAnimations(17498112, 17498113).add(16908290, D, m14693E()).commit();
                    }
                } else if (f10908O) {
                    m14692D();
                }
                return;
            }
            throw new IllegalArgumentException();
        } catch (Throwable th3) {
            C3111h1.m14941f("Cannot find a valid notification bundle to show!", th3);
        }
    }

    public void setTheme(int i) {
        super.setTheme(16973840);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12152a(C3057g gVar) {
        this.f10909N = new WeakReference<>(gVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12151a(Bundle bundle) {
        C3057g C = mo12149C();
        if (C != null) {
            C.mo12167c(getBaseContext(), this.f10910a, bundle);
        }
    }

    /* renamed from: c */
    public void mo12156c(Context context, CTInAppNotification cTInAppNotification, Bundle bundle) {
        mo12151a(bundle);
    }

    /* renamed from: a */
    public void mo12150a(Context context, CTInAppNotification cTInAppNotification, Bundle bundle) {
        mo12157c(bundle);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12153a(String str, Bundle bundle) {
        try {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (Throwable unused) {
        }
        mo12155b(bundle);
    }

    /* renamed from: b */
    public void mo12154b(Context context, CTInAppNotification cTInAppNotification, Bundle bundle) {
        mo12155b(bundle);
    }
}
