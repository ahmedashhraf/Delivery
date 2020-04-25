package com.instabug.library.core.p382ui;

import android.view.ViewStub;
import androidx.appcompat.widget.Toolbar;
import com.instabug.library.C9700R;
import com.instabug.library.Instabug;
import com.instabug.library.core.p382ui.BaseContract.Presenter;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import p205i.p471b.p472a.p473a.p474c.C13938g;

@SuppressFBWarnings({"UUF_UNUSED_PUBLIC_OR_PROTECTED_FIELD"})
/* renamed from: com.instabug.library.core.ui.BaseToolbarActivity */
public abstract class BaseToolbarActivity<P extends Presenter> extends BaseFragmentActivity<P> {
    private static transient /* synthetic */ boolean[] $jacocoData;
    protected Toolbar toolbar;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-1335706502521215081L, "com/instabug/library/core/ui/BaseToolbarActivity", 12);
        $jacocoData = a;
        return a;
    }

    public BaseToolbarActivity() {
        $jacocoInit()[0] = true;
    }

    private void initToolbar() {
        boolean[] $jacocoInit = $jacocoInit();
        this.toolbar = (Toolbar) findViewById(C9700R.C9704id.instabug_toolbar);
        $jacocoInit[7] = true;
        this.toolbar.setBackgroundColor(Instabug.getPrimaryColor());
        $jacocoInit[8] = true;
        setSupportActionBar(this.toolbar);
        $jacocoInit[9] = true;
        getSupportActionBar().mo950d(true);
        $jacocoInit[10] = true;
        this.toolbar.setNavigationIcon(C9700R.C9703drawable.instabug_ic_close);
        $jacocoInit[11] = true;
    }

    /* access modifiers changed from: protected */
    public abstract int getContentLayout();

    /* access modifiers changed from: protected */
    public int getLayout() {
        boolean[] $jacocoInit = $jacocoInit();
        int i = C9700R.layout.instabug_toolbar_activity;
        $jacocoInit[1] = true;
        return i;
    }

    /* access modifiers changed from: protected */
    public abstract void initContentViews();

    /* access modifiers changed from: protected */
    public void initViews() {
        boolean[] $jacocoInit = $jacocoInit();
        initToolbar();
        $jacocoInit[2] = true;
        ViewStub viewStub = (ViewStub) findViewById(C9700R.C9704id.instabug_content);
        $jacocoInit[3] = true;
        viewStub.setLayoutResource(getContentLayout());
        $jacocoInit[4] = true;
        viewStub.inflate();
        $jacocoInit[5] = true;
        initContentViews();
        $jacocoInit[6] = true;
    }
}
