package com.instabug.library.core.p382ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.C0183c0;
import androidx.appcompat.app.C0295d;
import com.instabug.library.C9700R;
import com.instabug.library.Instabug;
import com.instabug.library._InstabugActivity;
import com.instabug.library.core.p382ui.BaseContract.Presenter;
import com.instabug.library.core.p382ui.BaseContract.View;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.InstabugThemeResolver;
import com.instabug.library.util.LocaleUtils;
import com.instabug.library.util.StatusBarUtils;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import p053b.p072g.p073b.C2128a;
import p205i.p471b.p472a.p473a.p474c.C13938g;

@SuppressFBWarnings({"UUF_UNUSED_PUBLIC_OR_PROTECTED_FIELD"})
/* renamed from: com.instabug.library.core.ui.BaseFragmentActivity */
public abstract class BaseFragmentActivity<P extends Presenter> extends C0295d implements _InstabugActivity, View<C0295d> {
    private static transient /* synthetic */ boolean[] $jacocoData;
    protected P presenter;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(5091222481822438452L, "com/instabug/library/core/ui/BaseFragmentActivity", 30);
        $jacocoData = a;
        return a;
    }

    public BaseFragmentActivity() {
        $jacocoInit()[0] = true;
    }

    public void finishActivity() {
        boolean[] $jacocoInit = $jacocoInit();
        finish();
        $jacocoInit[28] = true;
    }

    /* access modifiers changed from: protected */
    @C0183c0
    public abstract int getLayout();

    /* access modifiers changed from: protected */
    public abstract void initViews();

    public void onCreate(Bundle bundle) {
        boolean[] $jacocoInit = $jacocoInit();
        InstabugSDKLogger.m46625i(this, "onCreate called");
        $jacocoInit[1] = true;
        StatusBarUtils.setStatusBar(this);
        $jacocoInit[2] = true;
        LocaleUtils.setLocale(this, Instabug.getLocale(this));
        $jacocoInit[3] = true;
        super.onCreate(bundle);
        $jacocoInit[4] = true;
        setTheme(InstabugThemeResolver.resolveTheme(SettingsManager.getInstance().getTheme()));
        $jacocoInit[5] = true;
        setContentView(getLayout());
        $jacocoInit[6] = true;
        initViews();
        $jacocoInit[7] = true;
        getWindow().getDecorView().setId(C9700R.C9704id.instabug_decor_view);
        $jacocoInit[8] = true;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        boolean[] $jacocoInit = $jacocoInit();
        InstabugSDKLogger.m46625i(this, "onDestroy called");
        $jacocoInit[25] = true;
        super.onDestroy();
        $jacocoInit[26] = true;
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        boolean[] $jacocoInit = $jacocoInit();
        super.onPause();
        $jacocoInit[17] = true;
        InstabugSDKLogger.m46622d(this, "onPause(),  SDK Invoking State Changed: false");
        $jacocoInit[18] = true;
        Intent intent = new Intent();
        $jacocoInit[19] = true;
        intent.setAction("SDK invoked");
        $jacocoInit[20] = true;
        intent.putExtra("SDK invoking state", false);
        $jacocoInit[21] = true;
        C2128a.m11089a((Context) this).mo9219a(intent);
        $jacocoInit[22] = true;
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        boolean[] $jacocoInit = $jacocoInit();
        super.onResume();
        $jacocoInit[11] = true;
        InstabugSDKLogger.m46622d(this, "onResume(),  SDK Invoking State Changed: true");
        $jacocoInit[12] = true;
        Intent intent = new Intent();
        $jacocoInit[13] = true;
        intent.setAction("SDK invoked");
        $jacocoInit[14] = true;
        intent.putExtra("SDK invoking state", true);
        $jacocoInit[15] = true;
        C2128a.m11089a((Context) this).mo9219a(intent);
        $jacocoInit[16] = true;
    }

    public void onStart() {
        boolean[] $jacocoInit = $jacocoInit();
        InstabugSDKLogger.m46625i(this, "onStart called");
        $jacocoInit[9] = true;
        super.onStart();
        $jacocoInit[10] = true;
    }

    public void onStop() {
        boolean[] $jacocoInit = $jacocoInit();
        InstabugSDKLogger.m46625i(this, "onStop called");
        $jacocoInit[23] = true;
        super.onStop();
        $jacocoInit[24] = true;
    }

    public C0295d getViewContext() {
        $jacocoInit()[27] = true;
        return this;
    }
}
