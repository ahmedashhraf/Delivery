package com.instabug.featuresrequest.p373ui.custom;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewStub;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.C0183c0;
import androidx.annotation.C0194i;
import androidx.annotation.C0195i0;
import androidx.annotation.C0214q0;
import androidx.core.content.C0841b;
import com.instabug.featuresrequest.C9525R;
import com.instabug.featuresrequest.p373ui.custom.C9659f.C9661b;
import com.instabug.library.Instabug;
import com.instabug.library.InstabugColorTheme;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.core.p382ui.BaseContract.Presenter;
import com.instabug.library.core.p382ui.C9792a;
import com.instabug.library.util.C10020a;
import com.instabug.library.util.InstabugSDKLogger;
import java.util.ArrayList;
import java.util.Iterator;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.featuresrequest.ui.custom.DynamicToolbarFragment */
public abstract class DynamicToolbarFragment<P extends Presenter> extends C9792a<P> implements OnClickListener {
    private static transient /* synthetic */ boolean[] $jacocoData;
    private LinearLayout actionButtonsLayout;
    private ImageButton closeButton;
    protected RelativeLayout toolbar;
    protected ArrayList<C9659f> toolbarActionButtons = new ArrayList<>();

    /* renamed from: com.instabug.featuresrequest.ui.custom.DynamicToolbarFragment$a */
    class C9627a implements OnClickListener {

        /* renamed from: N */
        private static transient /* synthetic */ boolean[] f25496N;

        /* renamed from: a */
        final /* synthetic */ C9659f f25497a;

        /* renamed from: b */
        final /* synthetic */ DynamicToolbarFragment f25498b;

        C9627a(DynamicToolbarFragment dynamicToolbarFragment, C9659f fVar) {
            boolean[] a = m45039a();
            this.f25498b = dynamicToolbarFragment;
            this.f25497a = fVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45039a() {
            boolean[] zArr = f25496N;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(7136193527906272775L, "com/instabug/featuresrequest/ui/custom/DynamicToolbarFragment$1", 2);
            f25496N = a;
            return a;
        }

        public void onClick(View view) {
            boolean[] a = m45039a();
            this.f25497a.mo34547c().mo34351d();
            a[1] = true;
        }
    }

    /* renamed from: com.instabug.featuresrequest.ui.custom.DynamicToolbarFragment$b */
    class C9628b implements OnClickListener {

        /* renamed from: N */
        private static transient /* synthetic */ boolean[] f25499N;

        /* renamed from: a */
        final /* synthetic */ C9659f f25500a;

        /* renamed from: b */
        final /* synthetic */ DynamicToolbarFragment f25501b;

        C9628b(DynamicToolbarFragment dynamicToolbarFragment, C9659f fVar) {
            boolean[] a = m45040a();
            this.f25501b = dynamicToolbarFragment;
            this.f25500a = fVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45040a() {
            boolean[] zArr = f25499N;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(5332456355208331559L, "com/instabug/featuresrequest/ui/custom/DynamicToolbarFragment$2", 2);
            f25499N = a;
            return a;
        }

        public void onClick(View view) {
            boolean[] a = m45040a();
            this.f25500a.mo34547c().mo34351d();
            a[1] = true;
        }
    }

    /* renamed from: com.instabug.featuresrequest.ui.custom.DynamicToolbarFragment$c */
    class C9629c implements OnClickListener {

        /* renamed from: N */
        private static transient /* synthetic */ boolean[] f25502N;

        /* renamed from: a */
        final /* synthetic */ C9659f f25503a;

        /* renamed from: b */
        final /* synthetic */ DynamicToolbarFragment f25504b;

        C9629c(DynamicToolbarFragment dynamicToolbarFragment, C9659f fVar) {
            boolean[] a = m45041a();
            this.f25504b = dynamicToolbarFragment;
            this.f25503a = fVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45041a() {
            boolean[] zArr = f25502N;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-1838385410862127372L, "com/instabug/featuresrequest/ui/custom/DynamicToolbarFragment$3", 2);
            f25502N = a;
            return a;
        }

        public void onClick(View view) {
            boolean[] a = m45041a();
            this.f25503a.mo34547c().mo34351d();
            a[1] = true;
        }
    }

    /* renamed from: com.instabug.featuresrequest.ui.custom.DynamicToolbarFragment$d */
    class C9630d implements OnClickListener {

        /* renamed from: N */
        private static transient /* synthetic */ boolean[] f25505N;

        /* renamed from: a */
        final /* synthetic */ C9659f f25506a;

        /* renamed from: b */
        final /* synthetic */ DynamicToolbarFragment f25507b;

        C9630d(DynamicToolbarFragment dynamicToolbarFragment, C9659f fVar) {
            boolean[] a = m45042a();
            this.f25507b = dynamicToolbarFragment;
            this.f25506a = fVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45042a() {
            boolean[] zArr = f25505N;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(4595960504425244659L, "com/instabug/featuresrequest/ui/custom/DynamicToolbarFragment$4", 2);
            f25505N = a;
            return a;
        }

        public void onClick(View view) {
            boolean[] a = m45042a();
            this.f25506a.mo34547c().mo34351d();
            a[1] = true;
        }
    }

    /* renamed from: com.instabug.featuresrequest.ui.custom.DynamicToolbarFragment$e */
    static /* synthetic */ class C9631e {

        /* renamed from: a */
        static final /* synthetic */ int[] f25508a = new int[C9661b.values().length];

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f25509b;

        /* JADX WARNING: Can't wrap try/catch for region: R(2:4|5) */
        /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
            r0[4] = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
            r0[6] = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:?, code lost:
            r0[2] = true;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0020 */
        static {
            /*
                boolean[] r0 = m45043a()
                com.instabug.featuresrequest.ui.custom.f$b[] r1 = com.instabug.featuresrequest.p373ui.custom.C9659f.C9661b.values()
                int r1 = r1.length
                int[] r1 = new int[r1]
                f25508a = r1
                r1 = 0
                r2 = 3
                r3 = 2
                r4 = 1
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0020 }
                int[] r1 = f25508a     // Catch:{ NoSuchFieldError -> 0x0020 }
                com.instabug.featuresrequest.ui.custom.f$b r5 = com.instabug.featuresrequest.p373ui.custom.C9659f.C9661b.ICON     // Catch:{ NoSuchFieldError -> 0x0020 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0020 }
                r1[r5] = r4     // Catch:{ NoSuchFieldError -> 0x0020 }
                r0[r4] = r4
                goto L_0x0022
            L_0x0020:
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x002f }
            L_0x0022:
                int[] r1 = f25508a     // Catch:{ NoSuchFieldError -> 0x002f }
                com.instabug.featuresrequest.ui.custom.f$b r5 = com.instabug.featuresrequest.p373ui.custom.C9659f.C9661b.TEXT     // Catch:{ NoSuchFieldError -> 0x002f }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x002f }
                r1[r5] = r3     // Catch:{ NoSuchFieldError -> 0x002f }
                r0[r2] = r4
                goto L_0x0032
            L_0x002f:
                r1 = 4
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0032:
                int[] r1 = f25508a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.instabug.featuresrequest.ui.custom.f$b r3 = com.instabug.featuresrequest.p373ui.custom.C9659f.C9661b.VOTE     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r1[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
                r1 = 5
                r0[r1] = r4
                goto L_0x0043
            L_0x0040:
                r1 = 6
                r0[r1] = r4
            L_0x0043:
                r1 = 7
                r0[r1] = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instabug.featuresrequest.p373ui.custom.DynamicToolbarFragment.C9631e.<clinit>():void");
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45043a() {
            boolean[] zArr = f25509b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-4495794053528064164L, "com/instabug/featuresrequest/ui/custom/DynamicToolbarFragment$5", 8);
            f25509b = a;
            return a;
        }
    }

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-2784621931730497303L, "com/instabug/featuresrequest/ui/custom/DynamicToolbarFragment", 60);
        $jacocoData = a;
        return a;
    }

    public DynamicToolbarFragment() {
        boolean[] $jacocoInit = $jacocoInit();
        $jacocoInit[0] = true;
        $jacocoInit[1] = true;
    }

    /* access modifiers changed from: protected */
    public abstract void addToolbarActionButtons();

    public View findTextViewByTitle(@C0214q0 int i) {
        boolean[] $jacocoInit = $jacocoInit();
        String string = getContext().getResources().getString(i);
        $jacocoInit[52] = true;
        View findViewWithContentDescription = findViewWithContentDescription(this.actionButtonsLayout, string);
        $jacocoInit[53] = true;
        return findViewWithContentDescription;
    }

    @C0195i0
    public View findViewWithContentDescription(View view, String str) {
        View view2;
        boolean[] $jacocoInit = $jacocoInit();
        ArrayList arrayList = new ArrayList();
        $jacocoInit[54] = true;
        view.findViewsWithText(arrayList, str, 2);
        $jacocoInit[55] = true;
        if (arrayList.size() <= 0) {
            $jacocoInit[56] = true;
            view2 = null;
        } else {
            $jacocoInit[57] = true;
            view2 = (View) arrayList.get(0);
            $jacocoInit[58] = true;
        }
        $jacocoInit[59] = true;
        return view2;
    }

    /* access modifiers changed from: protected */
    @C0183c0
    public abstract int getContentLayout();

    /* access modifiers changed from: protected */
    public int getLayout() {
        boolean[] $jacocoInit = $jacocoInit();
        int i = C9525R.layout.ib_fr_toolbar_fragment;
        $jacocoInit[8] = true;
        return i;
    }

    /* access modifiers changed from: protected */
    public abstract String getTitle();

    /* access modifiers changed from: protected */
    public abstract C9659f getToolbarCloseActionButton();

    /* access modifiers changed from: protected */
    public abstract void initContentViews(View view, Bundle bundle);

    /* access modifiers changed from: protected */
    public void initToolbarViews(Bundle bundle) {
        boolean[] $jacocoInit = $jacocoInit();
        this.toolbar = (RelativeLayout) findViewById(C9525R.C9529id.ib_fr_toolbar_main);
        $jacocoInit[9] = true;
        if (Instabug.getTheme() == InstabugColorTheme.InstabugColorThemeLight) {
            $jacocoInit[10] = true;
            this.toolbar.setBackgroundColor(InstabugCore.getPrimaryColor());
            $jacocoInit[11] = true;
        } else {
            this.toolbar.setBackgroundColor(C0841b.m4915a(getContext(), C9525R.C9527color.ib_fr_toolbar_dark_color));
            $jacocoInit[12] = true;
        }
        this.actionButtonsLayout = (LinearLayout) this.toolbar.findViewById(C9525R.C9529id.ib_toolbar_action_btns_layout);
        $jacocoInit[13] = true;
        this.closeButton = (ImageButton) findViewById(C9525R.C9529id.instabug_btn_toolbar_left);
        $jacocoInit[14] = true;
        if (!C10020a.m46628a(getContext())) {
            $jacocoInit[15] = true;
        } else {
            $jacocoInit[16] = true;
            this.closeButton.setRotation(180.0f);
            $jacocoInit[17] = true;
        }
        C9659f toolbarCloseActionButton = getToolbarCloseActionButton();
        $jacocoInit[18] = true;
        this.closeButton.setImageResource(toolbarCloseActionButton.mo34545a());
        $jacocoInit[19] = true;
        this.closeButton.setOnClickListener(new C9627a(this, toolbarCloseActionButton));
        $jacocoInit[20] = true;
        this.toolbarActionButtons.clear();
        $jacocoInit[21] = true;
        addToolbarActionButtons();
        $jacocoInit[22] = true;
        Iterator it = this.toolbarActionButtons.iterator();
        $jacocoInit[23] = true;
        while (it.hasNext()) {
            C9659f fVar = (C9659f) it.next();
            $jacocoInit[24] = true;
            int i = C9631e.f25508a[fVar.mo34548d().ordinal()];
            if (i == 1) {
                LayoutInflater from = LayoutInflater.from(getContext());
                int i2 = C9525R.layout.ib_fr_toolbar_action_icon_view;
                $jacocoInit[26] = true;
                ImageView imageView = (ImageView) from.inflate(i2, null);
                $jacocoInit[27] = true;
                imageView.setImageResource(fVar.mo34545a());
                $jacocoInit[28] = true;
                imageView.setOnClickListener(new C9628b(this, fVar));
                $jacocoInit[29] = true;
                this.actionButtonsLayout.addView(imageView);
                $jacocoInit[30] = true;
            } else if (i == 2) {
                LayoutInflater from2 = LayoutInflater.from(getContext());
                int i3 = C9525R.layout.ib_fr_toolbar_action_text_view;
                $jacocoInit[31] = true;
                TextView textView = (TextView) from2.inflate(i3, null);
                $jacocoInit[32] = true;
                textView.setText(fVar.mo34546b());
                $jacocoInit[33] = true;
                CharSequence text = getContext().getResources().getText(fVar.mo34546b());
                $jacocoInit[34] = true;
                textView.setContentDescription(text);
                $jacocoInit[35] = true;
                textView.setOnClickListener(new C9629c(this, fVar));
                $jacocoInit[36] = true;
                this.actionButtonsLayout.addView(textView);
                $jacocoInit[37] = true;
            } else if (i != 3) {
                $jacocoInit[25] = true;
            } else {
                LayoutInflater from3 = LayoutInflater.from(getContext());
                int i4 = C9525R.layout.ib_fr_toolbar_action_vote_button;
                $jacocoInit[38] = true;
                LinearLayout linearLayout = (LinearLayout) from3.inflate(i4, null);
                $jacocoInit[39] = true;
                TextView textView2 = (TextView) linearLayout.findViewById(C9525R.C9529id.ib_toolbar_vote_count);
                $jacocoInit[40] = true;
                IbFrRippleView ibFrRippleView = (IbFrRippleView) linearLayout.findViewById(C9525R.C9529id.ib_feature_request_toolbar_vote_action_layout);
                $jacocoInit[41] = true;
                textView2.setText(fVar.mo34546b());
                $jacocoInit[42] = true;
                ibFrRippleView.setOnClickListener(new C9630d(this, fVar));
                $jacocoInit[43] = true;
                this.actionButtonsLayout.addView(linearLayout);
                $jacocoInit[44] = true;
            }
            $jacocoInit[45] = true;
        }
        $jacocoInit[46] = true;
    }

    /* access modifiers changed from: protected */
    @C0194i
    public void initViews(View view, Bundle bundle) {
        boolean[] $jacocoInit = $jacocoInit();
        initToolbarViews(bundle);
        $jacocoInit[2] = true;
        ViewStub viewStub = (ViewStub) findViewById(C9525R.C9529id.instabug_content);
        $jacocoInit[3] = true;
        viewStub.setLayoutResource(getContentLayout());
        $jacocoInit[4] = true;
        viewStub.inflate();
        $jacocoInit[5] = true;
        initContentViews(view, bundle);
        $jacocoInit[6] = true;
        setTitle(getTitle());
        $jacocoInit[7] = true;
    }

    /* access modifiers changed from: protected */
    public void setTitle(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        if (this.rootView == null) {
            $jacocoInit[47] = true;
            InstabugSDKLogger.m46626v(this, "Calling setTitle before inflating the view! Ignoring call");
            $jacocoInit[48] = true;
            return;
        }
        TextView textView = (TextView) findViewById(C9525R.C9529id.instabug_fragment_title);
        $jacocoInit[49] = true;
        StringBuilder sb = new StringBuilder();
        sb.append("Setting fragment title to \"");
        sb.append(str);
        sb.append("\"");
        InstabugSDKLogger.m46626v(this, sb.toString());
        $jacocoInit[50] = true;
        textView.setText(str);
        $jacocoInit[51] = true;
    }
}
