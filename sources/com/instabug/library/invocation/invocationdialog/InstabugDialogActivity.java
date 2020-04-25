package com.instabug.library.invocation.invocationdialog;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import androidx.core.p034l.C0962e0;
import androidx.fragment.app.C1406n;
import com.instabug.library.C9700R;
import com.instabug.library.OnSdkDismissedCallback;
import com.instabug.library.OnSdkDismissedCallback.DismissType;
import com.instabug.library.bugreporting.model.Bug.Type;
import com.instabug.library.core.p382ui.BaseFragmentActivity;
import com.instabug.library.invocation.invocationdialog.C9910a.C9912b;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.util.StatusBarUtils;
import java.util.ArrayList;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class InstabugDialogActivity extends BaseFragmentActivity<C9913b> implements OnClickListener, C9912b, C9918a {
    private static transient /* synthetic */ boolean[] $jacocoData = null;
    public static final String KEY_DIALOG_ITEMS = "dialog_items";
    public static final String KEY_DIALOG_TITLE = "dialog_title";
    public static final String KEY_SCREENSHOT_URI = "screenshot_uri";
    private static final String KEY_SHOULD_BE_KILLED = "should_be_killed";
    private boolean isPromptOptionSelected = false;
    private View[] sharedViews;
    private boolean shouldBeKilled = false;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(3860794478892877731L, "com/instabug/library/invocation/invocationdialog/InstabugDialogActivity", 83);
        $jacocoData = a;
        return a;
    }

    public InstabugDialogActivity() {
        boolean[] $jacocoInit = $jacocoInit();
        $jacocoInit[0] = true;
    }

    private C9913b createPresenter() {
        boolean[] $jacocoInit = $jacocoInit();
        C9913b bVar = new C9913b(this);
        $jacocoInit[14] = true;
        return bVar;
    }

    public static Intent getIntent(Context context, String str, Uri uri, ArrayList<InstabugDialogItem> arrayList, boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        Intent intent = new Intent(context, InstabugDialogActivity.class);
        $jacocoInit[1] = true;
        intent.putExtra(KEY_DIALOG_TITLE, str);
        $jacocoInit[2] = true;
        intent.putExtra(KEY_SCREENSHOT_URI, uri);
        $jacocoInit[3] = true;
        intent.putExtra(KEY_DIALOG_ITEMS, arrayList);
        $jacocoInit[4] = true;
        intent.putExtra(KEY_SHOULD_BE_KILLED, z);
        $jacocoInit[5] = true;
        intent.addFlags(268435456);
        $jacocoInit[6] = true;
        return intent;
    }

    private void runOnSdkInvokedRunnable() {
        boolean[] $jacocoInit = $jacocoInit();
        if (SettingsManager.getInstance().getOnSdkInvokedCallback() == null) {
            $jacocoInit[15] = true;
        } else {
            $jacocoInit[16] = true;
            SettingsManager.getInstance().getOnSdkInvokedCallback().onSdkInvoked();
            $jacocoInit[17] = true;
        }
        $jacocoInit[18] = true;
    }

    public void finish() {
        boolean[] $jacocoInit = $jacocoInit();
        super.finish();
        $jacocoInit[67] = true;
        overridePendingTransition(C9700R.anim.ib_core_anim_fade_in, C9700R.anim.ib_core_anim_fade_out);
        $jacocoInit[68] = true;
        SettingsManager instance = SettingsManager.getInstance();
        $jacocoInit[69] = true;
        OnSdkDismissedCallback onSdkDismissedCallback = instance.getOnSdkDismissedCallback();
        if (this.isPromptOptionSelected) {
            $jacocoInit[70] = true;
        } else if (onSdkDismissedCallback == null) {
            $jacocoInit[71] = true;
        } else {
            $jacocoInit[72] = true;
            onSdkDismissedCallback.onSdkDismissed(DismissType.CANCEL, Type.NOT_AVAILABLE);
            $jacocoInit[73] = true;
        }
        $jacocoInit[74] = true;
    }

    /* access modifiers changed from: protected */
    public int getLayout() {
        boolean[] $jacocoInit = $jacocoInit();
        int i = C9700R.layout.ib_lyt_activity_dialog;
        $jacocoInit[40] = true;
        return i;
    }

    /* access modifiers changed from: protected */
    public void initViews() {
        boolean[] $jacocoInit = $jacocoInit();
        Intent intent = getIntent();
        String str = KEY_DIALOG_ITEMS;
        if (intent.getSerializableExtra(str) == null) {
            $jacocoInit[41] = true;
            finish();
            $jacocoInit[42] = true;
            return;
        }
        findViewById(C9700R.C9704id.ib_fragment_container).setOnClickListener(this);
        $jacocoInit[43] = true;
        findViewById(C9700R.C9704id.ib_dialog_container).setOnClickListener(this);
        $jacocoInit[44] = true;
        if (!getIntent().getBooleanExtra(KEY_SHOULD_BE_KILLED, false)) {
            $jacocoInit[45] = true;
        } else {
            this.shouldBeKilled = true;
            $jacocoInit[46] = true;
        }
        C1406n a = getSupportFragmentManager().mo6224a();
        int i = C9700R.C9704id.ib_fragment_container;
        $jacocoInit[47] = true;
        String stringExtra = getIntent().getStringExtra(KEY_DIALOG_TITLE);
        $jacocoInit[48] = true;
        ArrayList arrayList = (ArrayList) getIntent().getSerializableExtra(str);
        $jacocoInit[49] = true;
        C9917d a2 = C9917d.m46143a(stringExtra, arrayList);
        $jacocoInit[50] = true;
        C1406n b = a.mo6405b(i, a2);
        $jacocoInit[51] = true;
        b.mo6097e();
        $jacocoInit[52] = true;
    }

    public void onBackPressed() {
        boolean[] $jacocoInit = $jacocoInit();
        overridePendingTransition(C9700R.anim.ib_core_anim_fade_in, C9700R.anim.ib_core_anim_fade_out);
        $jacocoInit[65] = true;
        super.onBackPressed();
        $jacocoInit[66] = true;
    }

    public void onClick(View view) {
        boolean[] $jacocoInit = $jacocoInit();
        if (view.getId() == C9700R.C9704id.ib_fragment_container) {
            $jacocoInit[60] = true;
        } else if (view.getId() != C9700R.C9704id.ib_dialog_container) {
            $jacocoInit[61] = true;
            $jacocoInit[64] = true;
        } else {
            $jacocoInit[62] = true;
        }
        finish();
        $jacocoInit[63] = true;
        $jacocoInit[64] = true;
    }

    public void onCreate(Bundle bundle) {
        boolean[] $jacocoInit = $jacocoInit();
        overridePendingTransition(C9700R.anim.ib_core_anim_fade_in, C9700R.anim.ib_core_anim_fade_out);
        $jacocoInit[7] = true;
        super.onCreate(bundle);
        $jacocoInit[8] = true;
        runOnSdkInvokedRunnable();
        if (this.presenter != null) {
            $jacocoInit[9] = true;
        } else {
            $jacocoInit[10] = true;
            this.presenter = createPresenter();
            $jacocoInit[11] = true;
        }
        StatusBarUtils.setStatusBarForDialog(this);
        $jacocoInit[12] = true;
        ((C9913b) this.presenter).mo35235f();
        $jacocoInit[13] = true;
    }

    public void onDialogItemClicked(int i, String str, View... viewArr) {
        boolean[] $jacocoInit = $jacocoInit();
        ((C9913b) this.presenter).mo35234e();
        this.isPromptOptionSelected = true;
        this.sharedViews = viewArr;
        $jacocoInit[53] = true;
        InstabugDialogListener instance = InstabugDialogListener.getInstance();
        $jacocoInit[54] = true;
        Uri uri = (Uri) getIntent().getParcelableExtra(KEY_SCREENSHOT_URI);
        $jacocoInit[55] = true;
        instance.onDialogItemClick(i, str, uri);
        if (!this.shouldBeKilled) {
            $jacocoInit[56] = true;
        } else {
            $jacocoInit[57] = true;
            finish();
            $jacocoInit[58] = true;
        }
        $jacocoInit[59] = true;
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        boolean[] $jacocoInit = $jacocoInit();
        super.onNewIntent(intent);
        $jacocoInit[19] = true;
        setIntent(intent);
        $jacocoInit[20] = true;
        String stringExtra = getIntent().getStringExtra(KEY_DIALOG_TITLE);
        $jacocoInit[21] = true;
        ArrayList arrayList = (ArrayList) intent.getSerializableExtra(KEY_DIALOG_ITEMS);
        if (arrayList == null) {
            $jacocoInit[22] = true;
            finish();
            $jacocoInit[23] = true;
            return;
        }
        C1406n a = getSupportFragmentManager().mo6224a();
        try {
            $jacocoInit[24] = true;
            if (this.sharedViews == null) {
                $jacocoInit[25] = true;
            } else {
                $jacocoInit[26] = true;
                int i = 0;
                while (i < this.sharedViews.length) {
                    $jacocoInit[28] = true;
                    a.mo6396a(this.sharedViews[i], C0962e0.m5415S(this.sharedViews[i]));
                    i++;
                    $jacocoInit[29] = true;
                }
                $jacocoInit[27] = true;
            }
            $jacocoInit[30] = true;
        } catch (IllegalArgumentException unused) {
            $jacocoInit[31] = true;
        }
        int i2 = C9700R.anim.ib_core_anim_invocation_dialog_exit;
        $jacocoInit[32] = true;
        C1406n a2 = a.mo6392a(0, i2);
        int i3 = C9700R.C9704id.ib_fragment_container;
        $jacocoInit[33] = true;
        C9917d a3 = C9917d.m46143a(stringExtra, arrayList);
        $jacocoInit[34] = true;
        C1406n b = a2.mo6405b(i3, a3);
        $jacocoInit[35] = true;
        b.mo6097e();
        $jacocoInit[36] = true;
        if (!intent.getBooleanExtra(KEY_SHOULD_BE_KILLED, false)) {
            $jacocoInit[37] = true;
        } else {
            this.shouldBeKilled = true;
            $jacocoInit[38] = true;
        }
        $jacocoInit[39] = true;
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        boolean[] $jacocoInit = $jacocoInit();
        super.onPause();
        $jacocoInit[81] = true;
        SettingsManager.getInstance().setPromptOptionsScreenShown(false);
        $jacocoInit[82] = true;
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        boolean[] $jacocoInit = $jacocoInit();
        super.onResume();
        $jacocoInit[79] = true;
        SettingsManager.getInstance().setPromptOptionsScreenShown(true);
        $jacocoInit[80] = true;
    }

    public void onStart() {
        boolean[] $jacocoInit = $jacocoInit();
        super.onStart();
        $jacocoInit[75] = true;
        ((C9913b) this.presenter).mo35233d();
        $jacocoInit[76] = true;
    }

    public void onStop() {
        boolean[] $jacocoInit = $jacocoInit();
        super.onStop();
        $jacocoInit[77] = true;
        ((C9913b) this.presenter).mo35232c();
        $jacocoInit[78] = true;
    }
}
