package com.clevertap.android.sdk;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import androidx.annotation.C0195i0;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.clevertap.android.sdk.h */
/* compiled from: CTInAppBaseFragment */
public abstract class C3107h extends Fragment {

    /* renamed from: N */
    private WeakReference<C3109b> f11145N;

    /* renamed from: O */
    CloseImageView f11146O = null;

    /* renamed from: P */
    int f11147P;

    /* renamed from: Q */
    Activity f11148Q;

    /* renamed from: R */
    AtomicBoolean f11149R = new AtomicBoolean();

    /* renamed from: a */
    CTInAppNotification f11150a;

    /* renamed from: b */
    CleverTapInstanceConfig f11151b;

    /* renamed from: com.clevertap.android.sdk.h$a */
    /* compiled from: CTInAppBaseFragment */
    class C3108a implements OnClickListener {
        C3108a() {
        }

        public void onClick(View view) {
            C3107h.this.mo12297b(((Integer) view.getTag()).intValue());
        }
    }

    /* renamed from: com.clevertap.android.sdk.h$b */
    /* compiled from: CTInAppBaseFragment */
    interface C3109b {
        /* renamed from: a */
        void mo12150a(Context context, CTInAppNotification cTInAppNotification, Bundle bundle);

        /* renamed from: b */
        void mo12154b(Context context, CTInAppNotification cTInAppNotification, Bundle bundle);

        /* renamed from: c */
        void mo12156c(Context context, CTInAppNotification cTInAppNotification, Bundle bundle);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo12292a();

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12294a(C3109b bVar) {
        this.f11145N = new WeakReference<>(bVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract void mo12296b();

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo12298b(Bundle bundle) {
        mo12292a();
        C3109b c = mo12299c();
        if (c != null) {
            c.mo12154b(getActivity().getBaseContext(), this.f11150a, bundle);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public C3109b mo12299c() {
        C3109b bVar;
        try {
            bVar = (C3109b) this.f11145N.get();
        } catch (Throwable unused) {
            bVar = null;
        }
        if (bVar == null) {
            C3111h1 l = this.f11151b.mo12108l();
            String a = this.f11151b.mo12093a();
            StringBuilder sb = new StringBuilder();
            sb.append("InAppListener is null for notification: ");
            sb.append(this.f11150a.mo11948t());
            l.mo12315c(a, sb.toString());
        }
        return bVar;
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f11148Q = activity;
        Bundle arguments = getArguments();
        this.f11150a = (CTInAppNotification) arguments.getParcelable("inApp");
        this.f11151b = (CleverTapInstanceConfig) arguments.getParcelable("config");
        this.f11147P = getResources().getConfiguration().orientation;
        mo12296b();
    }

    public void onViewCreated(View view, @C0195i0 Bundle bundle) {
        super.onViewCreated(view, bundle);
        mo12300c(null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12293a(Bundle bundle) {
        C3109b c = mo12299c();
        if (c != null) {
            c.mo12156c(getActivity().getBaseContext(), this.f11150a, bundle);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo12300c(Bundle bundle) {
        C3109b c = mo12299c();
        if (c != null) {
            c.mo12150a(getActivity().getBaseContext(), this.f11150a, bundle);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12295a(String str, Bundle bundle) {
        try {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (Throwable unused) {
        }
        mo12298b(bundle);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo12297b(int i) {
        try {
            CTInAppNotificationButton cTInAppNotificationButton = (CTInAppNotificationButton) this.f11150a.mo11938j().get(i);
            Bundle bundle = new Bundle();
            bundle.putString("wzrk_id", this.f11150a.mo11939k());
            bundle.putString("wzrk_c2a", cTInAppNotificationButton.mo11979l());
            mo12293a(bundle);
            String a = cTInAppNotificationButton.mo11964a();
            if (a != null) {
                mo12295a(a, bundle);
            } else {
                mo12298b(bundle);
            }
        } catch (Throwable th) {
            C3111h1 l = this.f11151b.mo12108l();
            StringBuilder sb = new StringBuilder();
            sb.append("Error handling notification button click: ");
            sb.append(th.getCause());
            l.mo12306a(sb.toString());
            mo12298b((Bundle) null);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo12291a(int i) {
        return (int) TypedValue.applyDimension(1, (float) i, getResources().getDisplayMetrics());
    }
}
