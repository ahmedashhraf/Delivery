package com.instabug.featuresrequest.p373ui;

import android.os.Bundle;
import androidx.annotation.C0195i0;
import androidx.annotation.C0224v0;
import androidx.fragment.app.C1376c;
import androidx.fragment.app.C1382h;
import androidx.fragment.app.C1406n;
import androidx.fragment.app.Fragment;
import com.instabug.featuresrequest.C9525R;
import com.instabug.featuresrequest.FeaturesRequestPlugin;
import com.instabug.featuresrequest.p370c.C9540c;
import com.instabug.featuresrequest.p373ui.custom.C9639b;
import com.instabug.featuresrequest.p373ui.custom.C9657e;
import com.instabug.featuresrequest.p373ui.p377c.C9614a;
import com.instabug.featuresrequest.p373ui.p378d.C9668b;
import com.instabug.library.Instabug;
import com.instabug.library._InstabugActivity;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEvent;
import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEvent.ForegroundStatus;
import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEventPublisher;
import com.instabug.library.util.LocaleUtils;
import java.util.Iterator;
import java.util.List;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.featuresrequest.ui.FeaturesRequestActivity */
public class FeaturesRequestActivity extends C1376c implements _InstabugActivity {

    /* renamed from: b */
    private static transient /* synthetic */ boolean[] f25358b;

    /* renamed from: a */
    C9639b f25359a;

    public FeaturesRequestActivity() {
        m44806g()[0] = true;
    }

    /* renamed from: g */
    private static /* synthetic */ boolean[] m44806g() {
        boolean[] zArr = f25358b;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(6082917574209203519L, "com/instabug/featuresrequest/ui/FeaturesRequestActivity", 43);
        f25358b = a;
        return a;
    }

    /* access modifiers changed from: 0000 */
    @C0224v0
    /* renamed from: a */
    public void mo34329a(boolean z) {
        boolean[] g = m44806g();
        g[10] = true;
        FeaturesRequestPlugin featuresRequestPlugin = (FeaturesRequestPlugin) InstabugCore.getXPlugin(FeaturesRequestPlugin.class);
        if (featuresRequestPlugin == null) {
            g[11] = true;
        } else if (z) {
            g[12] = true;
            featuresRequestPlugin.setState(1);
            g[13] = true;
        } else {
            featuresRequestPlugin.setState(0);
            g[14] = true;
            SDKCoreEventPublisher.post(new SDKCoreEvent(ForegroundStatus.TYPE_FOREGROUNDS_STATUS, ForegroundStatus.VALUE_AVAILABLE));
            g[15] = true;
        }
        g[16] = true;
    }

    /* renamed from: c */
    public void mo34330c() {
        boolean[] g = m44806g();
        C9639b bVar = this.f25359a;
        if (bVar == null) {
            g[22] = true;
        } else {
            g[23] = true;
            bVar.dismiss();
            g[24] = true;
        }
        g[25] = true;
    }

    /* renamed from: d */
    public void mo34331d() {
        boolean[] g = m44806g();
        C1382h supportFragmentManager = getSupportFragmentManager();
        g[19] = true;
        this.f25359a = C9639b.m45068d();
        g[20] = true;
        this.f25359a.show(supportFragmentManager, "progress_dialog_fragment");
        g[21] = true;
    }

    /* renamed from: e */
    public void mo34332e() {
        boolean[] g = m44806g();
        List e = getSupportFragmentManager().mo6240e();
        g[26] = true;
        Iterator it = e.iterator();
        g[27] = true;
        while (true) {
            if (!it.hasNext()) {
                g[28] = true;
                break;
            }
            Fragment fragment = (Fragment) it.next();
            if (fragment instanceof C9614a) {
                g[29] = true;
                ((C9614a) fragment).mo34442g();
                g[30] = true;
                break;
            }
            g[31] = true;
        }
        g[32] = true;
    }

    /* renamed from: f */
    public void mo34333f() {
        boolean[] g = m44806g();
        onBackPressed();
        g[33] = true;
        List e = getSupportFragmentManager().mo6240e();
        g[34] = true;
        Iterator it = e.iterator();
        g[35] = true;
        while (true) {
            if (!it.hasNext()) {
                g[36] = true;
                break;
            }
            Fragment fragment = (Fragment) it.next();
            if (fragment instanceof C9668b) {
                g[37] = true;
                ((C9668b) fragment).mo34553e();
                g[38] = true;
                break;
            }
            g[39] = true;
        }
        C1382h supportFragmentManager = getSupportFragmentManager();
        g[40] = true;
        C9657e d = C9657e.m45149d();
        g[41] = true;
        d.show(supportFragmentManager, "thanks_dialog_fragment");
        g[42] = true;
    }

    /* access modifiers changed from: protected */
    public void onCreate(@C0195i0 Bundle bundle) {
        boolean[] g = m44806g();
        LocaleUtils.setLocale(this, Instabug.getLocale(this));
        g[1] = true;
        setTheme(C9540c.m44634a(Instabug.getTheme()));
        g[2] = true;
        super.onCreate(bundle);
        g[3] = true;
        setContentView(C9525R.layout.instabug_activity);
        if (bundle != null) {
            g[4] = true;
        } else {
            g[5] = true;
            C1406n a = getSupportFragmentManager().mo6224a();
            int i = C9525R.C9529id.instabug_fragment_container;
            C9668b bVar = new C9668b();
            g[6] = true;
            C1406n b = a.mo6405b(i, bVar);
            g[7] = true;
            b.mo6097e();
            g[8] = true;
        }
        mo34329a(true);
        g[9] = true;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        boolean[] g = m44806g();
        super.onDestroy();
        g[17] = true;
        mo34329a(false);
        g[18] = true;
    }
}
