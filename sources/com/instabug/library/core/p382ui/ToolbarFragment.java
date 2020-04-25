package com.instabug.library.core.p382ui;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewStub;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.C0183c0;
import androidx.annotation.C0194i;
import com.instabug.library.C9700R;
import com.instabug.library.core.p382ui.BaseContract.Presenter;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.SystemServiceUtils;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.core.ui.ToolbarFragment */
public abstract class ToolbarFragment<P extends Presenter> extends C9792a<P> {
    private static transient /* synthetic */ boolean[] $jacocoData;
    protected ImageButton toolbarImageButtonClose;
    protected ImageButton toolbarImageButtonDone;

    /* renamed from: com.instabug.library.core.ui.ToolbarFragment$a */
    class C9790a implements OnClickListener {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f25972b;

        /* renamed from: a */
        final /* synthetic */ ToolbarFragment f25973a;

        C9790a(ToolbarFragment toolbarFragment) {
            boolean[] a = m45665a();
            this.f25973a = toolbarFragment;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45665a() {
            boolean[] zArr = f25972b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(1951880620716420871L, "com/instabug/library/core/ui/ToolbarFragment$1", 3);
            f25972b = a;
            return a;
        }

        public void onClick(View view) {
            boolean[] a = m45665a();
            SystemServiceUtils.hideInputMethod(this.f25973a.getActivity());
            a[1] = true;
            this.f25973a.onDoneButtonClicked();
            a[2] = true;
        }
    }

    /* renamed from: com.instabug.library.core.ui.ToolbarFragment$b */
    class C9791b implements OnClickListener {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f25974b;

        /* renamed from: a */
        final /* synthetic */ ToolbarFragment f25975a;

        C9791b(ToolbarFragment toolbarFragment) {
            boolean[] a = m45666a();
            this.f25975a = toolbarFragment;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45666a() {
            boolean[] zArr = f25974b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(5852241717508555865L, "com/instabug/library/core/ui/ToolbarFragment$2", 4);
            f25974b = a;
            return a;
        }

        public void onClick(View view) {
            boolean[] a = m45666a();
            SystemServiceUtils.hideInputMethod(this.f25975a.getActivity());
            a[1] = true;
            this.f25975a.onCloseButtonClicked();
            a[2] = true;
            this.f25975a.getActivity().onBackPressed();
            a[3] = true;
        }
    }

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(1495974973103354676L, "com/instabug/library/core/ui/ToolbarFragment", 17);
        $jacocoData = a;
        return a;
    }

    public ToolbarFragment() {
        $jacocoInit()[0] = true;
    }

    private void initToolbarViews() {
        boolean[] $jacocoInit = $jacocoInit();
        this.toolbarImageButtonDone = (ImageButton) findViewById(C9700R.C9704id.instabug_btn_toolbar_right);
        $jacocoInit[7] = true;
        this.toolbarImageButtonDone.setOnClickListener(new C9790a(this));
        $jacocoInit[8] = true;
        this.toolbarImageButtonClose = (ImageButton) findViewById(C9700R.C9704id.instabug_btn_toolbar_left);
        $jacocoInit[9] = true;
        this.toolbarImageButtonClose.setOnClickListener(new C9791b(this));
        $jacocoInit[10] = true;
    }

    /* access modifiers changed from: protected */
    @C0183c0
    public abstract int getContentLayout();

    /* access modifiers changed from: protected */
    public int getLayout() {
        boolean[] $jacocoInit = $jacocoInit();
        int i = C9700R.layout.instabug_fragment_toolbar;
        $jacocoInit[11] = true;
        return i;
    }

    /* access modifiers changed from: protected */
    public abstract String getTitle();

    /* access modifiers changed from: protected */
    public abstract void initContentViews(View view, Bundle bundle);

    /* access modifiers changed from: protected */
    @C0194i
    public void initViews(View view, Bundle bundle) {
        boolean[] $jacocoInit = $jacocoInit();
        initToolbarViews();
        $jacocoInit[1] = true;
        ViewStub viewStub = (ViewStub) findViewById(C9700R.C9704id.instabug_content);
        $jacocoInit[2] = true;
        viewStub.setLayoutResource(getContentLayout());
        $jacocoInit[3] = true;
        viewStub.inflate();
        $jacocoInit[4] = true;
        initContentViews(view, bundle);
        $jacocoInit[5] = true;
        setTitle(getTitle());
        $jacocoInit[6] = true;
    }

    /* access modifiers changed from: protected */
    public abstract void onCloseButtonClicked();

    /* access modifiers changed from: protected */
    public abstract void onDoneButtonClicked();

    /* access modifiers changed from: protected */
    public void setTitle(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        if (this.rootView == null) {
            $jacocoInit[12] = true;
            InstabugSDKLogger.m46626v(this, "Calling setTitle before inflating the view! Ignoring call");
            $jacocoInit[13] = true;
            return;
        }
        TextView textView = (TextView) findViewById(C9700R.C9704id.instabug_fragment_title);
        $jacocoInit[14] = true;
        StringBuilder sb = new StringBuilder();
        sb.append("Setting fragment title to \"");
        sb.append(str);
        sb.append("\"");
        InstabugSDKLogger.m46626v(this, sb.toString());
        $jacocoInit[15] = true;
        textView.setText(str);
        $jacocoInit[16] = true;
    }
}
