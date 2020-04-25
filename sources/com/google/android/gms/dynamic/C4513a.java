package com.google.android.gms.dynamic;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.C4279e;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.internal.C4334g;
import com.google.android.gms.dynamic.C4522e;
import java.util.LinkedList;

@C4056a
/* renamed from: com.google.android.gms.dynamic.a */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public abstract class C4513a<T extends C4522e> {
    /* access modifiers changed from: private */
    public T zaru;
    /* access modifiers changed from: private */
    public Bundle zarv;
    /* access modifiers changed from: private */
    public LinkedList<C4514a> zarw;
    private final C4524g<T> zarx = new C4526i(this);

    /* renamed from: com.google.android.gms.dynamic.a$a */
    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    private interface C4514a {
        /* renamed from: a */
        void mo18594a(C4522e eVar);

        int getState();
    }

    @C4056a
    public static void showGooglePlayUnavailableMessage(FrameLayout frameLayout) {
        C4279e a = C4279e.m18476a();
        Context context = frameLayout.getContext();
        int d = a.mo18113d(context);
        String b = C4334g.m18784b(context, d);
        String a2 = C4334g.m18780a(context, d);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        TextView textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new LayoutParams(-2, -2));
        textView.setText(b);
        linearLayout.addView(textView);
        Intent a3 = a.mo18099a(context, d, (String) null);
        if (a3 != null) {
            Button button = new Button(context);
            button.setId(16908313);
            button.setLayoutParams(new LayoutParams(-2, -2));
            button.setText(a2);
            linearLayout.addView(button);
            button.setOnClickListener(new C4529l(context, a3));
        }
    }

    private final void zaa(Bundle bundle, C4514a aVar) {
        T t = this.zaru;
        if (t != null) {
            aVar.mo18594a(t);
            return;
        }
        if (this.zarw == null) {
            this.zarw = new LinkedList<>();
        }
        this.zarw.add(aVar);
        if (bundle != null) {
            Bundle bundle2 = this.zarv;
            if (bundle2 == null) {
                this.zarv = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        createDelegate(this.zarx);
    }

    private final void zal(int i) {
        while (!this.zarw.isEmpty() && ((C4514a) this.zarw.getLast()).getState() >= i) {
            this.zarw.removeLast();
        }
    }

    /* access modifiers changed from: protected */
    @C4056a
    public abstract void createDelegate(C4524g<T> gVar);

    @C4056a
    public T getDelegate() {
        return this.zaru;
    }

    /* access modifiers changed from: protected */
    @C4056a
    public void handleGooglePlayUnavailable(FrameLayout frameLayout) {
        showGooglePlayUnavailableMessage(frameLayout);
    }

    @C4056a
    public void onCreate(Bundle bundle) {
        zaa(bundle, (C4514a) new C4527j(this, bundle));
    }

    @C4056a
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        C4530m mVar = new C4530m(this, frameLayout, layoutInflater, viewGroup, bundle);
        zaa(bundle, (C4514a) mVar);
        if (this.zaru == null) {
            handleGooglePlayUnavailable(frameLayout);
        }
        return frameLayout;
    }

    @C4056a
    public void onDestroy() {
        T t = this.zaru;
        if (t != null) {
            t.onDestroy();
        } else {
            zal(1);
        }
    }

    @C4056a
    public void onDestroyView() {
        T t = this.zaru;
        if (t != null) {
            t.onDestroyView();
        } else {
            zal(2);
        }
    }

    @C4056a
    public void onInflate(Activity activity, Bundle bundle, Bundle bundle2) {
        zaa(bundle2, (C4514a) new C4528k(this, activity, bundle, bundle2));
    }

    @C4056a
    public void onLowMemory() {
        T t = this.zaru;
        if (t != null) {
            t.onLowMemory();
        }
    }

    @C4056a
    public void onPause() {
        T t = this.zaru;
        if (t != null) {
            t.onPause();
        } else {
            zal(5);
        }
    }

    @C4056a
    public void onResume() {
        zaa((Bundle) null, (C4514a) new C4531n(this));
    }

    @C4056a
    public void onSaveInstanceState(Bundle bundle) {
        T t = this.zaru;
        if (t != null) {
            t.onSaveInstanceState(bundle);
            return;
        }
        Bundle bundle2 = this.zarv;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }

    @C4056a
    public void onStart() {
        zaa((Bundle) null, (C4514a) new C4532o(this));
    }

    @C4056a
    public void onStop() {
        T t = this.zaru;
        if (t != null) {
            t.onStop();
        } else {
            zal(4);
        }
    }
}
