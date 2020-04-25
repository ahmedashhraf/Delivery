package p076c.p112d.p113a.p130b.p131a.p225a;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.play.core.install.InstallState;
import com.google.android.play.core.internal.C5742h;
import java.util.Iterator;
import p076c.p112d.p113a.p130b.p131a.p132c.C2692b;

/* renamed from: c.d.a.b.a.a.d */
public final class C6150d extends C2692b<InstallState> {
    public C6150d(Context context) {
        super(new C5742h("AppUpdateListenerRegistry"), new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS"), context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10353a(Context context, Intent intent) {
        String str = "package.name";
        if (!context.getPackageName().equals(intent.getStringExtra(str))) {
            this.f9806a.mo23045b("ListenerRegistryBroadcastReceiver received broadcast for third party app: %s", intent.getStringExtra(str));
            return;
        }
        this.f9806a.mo23045b("List of extras in received intent:", new Object[0]);
        Iterator it = intent.getExtras().keySet().iterator();
        while (true) {
            String str2 = "Key: %s; value: %s";
            if (it.hasNext()) {
                String str3 = (String) it.next();
                this.f9806a.mo23045b(str2, str3, intent.getExtras().get(str3));
            } else {
                C5742h hVar = this.f9806a;
                hVar.mo23045b("List of extras in received intent needed by fromUpdateIntent:", new Object[0]);
                String str4 = "install.status";
                hVar.mo23045b(str2, str4, Integer.valueOf(intent.getIntExtra(str4, 0)));
                String str5 = "error.code";
                hVar.mo23045b(str2, str5, Integer.valueOf(intent.getIntExtra(str5, 0)));
                InstallState a = InstallState.m34297a(intent.getIntExtra(str4, 0), intent.getIntExtra(str5, 0), intent.getStringExtra(str));
                this.f9806a.mo23045b("ListenerRegistryBroadcastReceiver.onReceive: %s", a);
                mo10355a(a);
                return;
            }
        }
    }
}
