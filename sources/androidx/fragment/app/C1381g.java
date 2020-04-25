package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.IntentSender.SendIntentException;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.core.app.C0727a;
import androidx.core.p033k.C0944i;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: androidx.fragment.app.g */
/* compiled from: FragmentHostCallback */
public abstract class C1381g<E> extends C1378d {
    @C0193h0

    /* renamed from: N */
    private final Handler f5417N;

    /* renamed from: O */
    private final int f5418O;

    /* renamed from: P */
    final C1386i f5419P;
    @C0195i0

    /* renamed from: a */
    private final Activity f5420a;
    @C0193h0

    /* renamed from: b */
    private final Context f5421b;

    public C1381g(@C0193h0 Context context, @C0193h0 Handler handler, int i) {
        this(context instanceof Activity ? (Activity) context : null, context, handler, i);
    }

    @C0195i0
    /* renamed from: a */
    public View mo6050a(int i) {
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6161a(@C0193h0 Fragment fragment) {
    }

    /* renamed from: a */
    public void mo6162a(@C0193h0 Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        mo6163a(fragment, intent, i, (Bundle) null);
    }

    /* renamed from: a */
    public void mo6165a(@C0193h0 Fragment fragment, @C0193h0 String[] strArr, int i) {
    }

    /* renamed from: a */
    public void mo6166a(@C0193h0 String str, @C0195i0 FileDescriptor fileDescriptor, @C0193h0 PrintWriter printWriter, @C0195i0 String[] strArr) {
    }

    /* renamed from: a */
    public boolean mo6051a() {
        return true;
    }

    /* renamed from: a */
    public boolean mo6167a(@C0193h0 String str) {
        return false;
    }

    /* access modifiers changed from: 0000 */
    @C0195i0
    /* renamed from: b */
    public Activity mo6217b() {
        return this.f5420a;
    }

    /* renamed from: b */
    public boolean mo6168b(@C0193h0 Fragment fragment) {
        return true;
    }

    /* access modifiers changed from: 0000 */
    @C0193h0
    /* renamed from: c */
    public Context mo6218c() {
        return this.f5421b;
    }

    /* access modifiers changed from: 0000 */
    @C0193h0
    /* renamed from: d */
    public Handler mo6219d() {
        return this.f5417N;
    }

    @C0195i0
    /* renamed from: e */
    public abstract E mo6169e();

    @C0193h0
    /* renamed from: f */
    public LayoutInflater mo6170f() {
        return LayoutInflater.from(this.f5421b);
    }

    /* renamed from: g */
    public int mo6171g() {
        return this.f5418O;
    }

    /* renamed from: h */
    public boolean mo6172h() {
        return true;
    }

    /* renamed from: i */
    public void mo6173i() {
    }

    C1381g(@C0193h0 C1376c cVar) {
        this(cVar, cVar, new Handler(), 0);
    }

    /* renamed from: a */
    public void mo6163a(@C0193h0 Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, @C0195i0 Bundle bundle) {
        if (i == -1) {
            this.f5421b.startActivity(intent);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }

    C1381g(@C0195i0 Activity activity, @C0193h0 Context context, @C0193h0 Handler handler, int i) {
        this.f5419P = new C1386i();
        this.f5420a = activity;
        this.f5421b = (Context) C0944i.m5338a(context, (Object) "context == null");
        this.f5417N = (Handler) C0944i.m5338a(handler, (Object) "handler == null");
        this.f5418O = i;
    }

    /* renamed from: a */
    public void mo6164a(@C0193h0 Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, @C0195i0 Intent intent, int i2, int i3, int i4, @C0195i0 Bundle bundle) throws SendIntentException {
        if (i == -1) {
            C0727a.m4241a(this.f5420a, intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
    }
}
