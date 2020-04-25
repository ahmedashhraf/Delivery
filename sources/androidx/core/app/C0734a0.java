package androidx.core.app;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.os.Bundle;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.core.content.C0841b;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.core.app.a0 */
/* compiled from: TaskStackBuilder */
public final class C0734a0 implements Iterable<Intent> {

    /* renamed from: N */
    private static final String f3396N = "TaskStackBuilder";

    /* renamed from: a */
    private final ArrayList<Intent> f3397a = new ArrayList<>();

    /* renamed from: b */
    private final Context f3398b;

    /* renamed from: androidx.core.app.a0$a */
    /* compiled from: TaskStackBuilder */
    public interface C0735a {
        @C0195i0
        Intent getSupportParentActivityIntent();
    }

    private C0734a0(Context context) {
        this.f3398b = context;
    }

    @C0193h0
    /* renamed from: a */
    public static C0734a0 m4256a(@C0193h0 Context context) {
        return new C0734a0(context);
    }

    @Deprecated
    /* renamed from: b */
    public static C0734a0 m4257b(Context context) {
        return m4256a(context);
    }

    @Deprecated
    /* renamed from: c */
    public Intent mo4083c(int i) {
        return mo4081b(i);
    }

    /* renamed from: e */
    public void mo4085e() {
        mo4079a((Bundle) null);
    }

    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f3397a.iterator();
    }

    @C0193h0
    /* renamed from: a */
    public C0734a0 mo4077a(@C0193h0 Intent intent) {
        this.f3397a.add(intent);
        return this;
    }

    @C0193h0
    /* renamed from: b */
    public C0734a0 mo4082b(@C0193h0 Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.f3398b.getPackageManager());
        }
        if (component != null) {
            mo4076a(component);
        }
        mo4077a(intent);
        return this;
    }

    @C0193h0
    /* renamed from: c */
    public Intent[] mo4084c() {
        Intent[] intentArr = new Intent[this.f3397a.size()];
        if (intentArr.length == 0) {
            return intentArr;
        }
        intentArr[0] = new Intent((Intent) this.f3397a.get(0)).addFlags(268484608);
        for (int i = 1; i < intentArr.length; i++) {
            intentArr[i] = new Intent((Intent) this.f3397a.get(i));
        }
        return intentArr;
    }

    @C0193h0
    /* renamed from: a */
    public C0734a0 mo4075a(@C0193h0 Activity activity) {
        Intent supportParentActivityIntent = activity instanceof C0735a ? ((C0735a) activity).getSupportParentActivityIntent() : null;
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = C0768n.m4356a(activity);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(this.f3398b.getPackageManager());
            }
            mo4076a(component);
            mo4077a(supportParentActivityIntent);
        }
        return this;
    }

    /* renamed from: b */
    public int mo4080b() {
        return this.f3397a.size();
    }

    @C0195i0
    /* renamed from: b */
    public Intent mo4081b(int i) {
        return (Intent) this.f3397a.get(i);
    }

    @C0193h0
    /* renamed from: a */
    public C0734a0 mo4078a(@C0193h0 Class<?> cls) {
        return mo4076a(new ComponentName(this.f3398b, cls));
    }

    /* renamed from: a */
    public C0734a0 mo4076a(ComponentName componentName) {
        int size = this.f3397a.size();
        try {
            Intent a = C0768n.m4357a(this.f3398b, componentName);
            while (a != null) {
                this.f3397a.add(size, a);
                a = C0768n.m4357a(this.f3398b, a.getComponent());
            }
            return this;
        } catch (NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public void mo4079a(@C0195i0 Bundle bundle) {
        if (!this.f3397a.isEmpty()) {
            ArrayList<Intent> arrayList = this.f3397a;
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!C0841b.m4923a(this.f3398b, intentArr, bundle)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(268435456);
                this.f3398b.startActivity(intent);
                return;
            }
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }

    @C0195i0
    /* renamed from: a */
    public PendingIntent mo4073a(int i, int i2) {
        return mo4074a(i, i2, null);
    }

    @C0195i0
    /* renamed from: a */
    public PendingIntent mo4074a(int i, int i2, @C0195i0 Bundle bundle) {
        if (!this.f3397a.isEmpty()) {
            ArrayList<Intent> arrayList = this.f3397a;
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (VERSION.SDK_INT >= 16) {
                return PendingIntent.getActivities(this.f3398b, i, intentArr, i2, bundle);
            }
            return PendingIntent.getActivities(this.f3398b, i, intentArr, i2);
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
    }
}
