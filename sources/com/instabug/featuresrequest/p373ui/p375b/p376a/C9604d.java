package com.instabug.featuresrequest.p373ui.p375b.p376a;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewStub;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.annotation.C0193h0;
import androidx.core.content.C0841b;
import androidx.fragment.app.C1382h;
import androidx.fragment.app.C1406n;
import androidx.fragment.app.Fragment;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout.C1814j;
import com.instabug.featuresrequest.C9525R;
import com.instabug.featuresrequest.models.C9567a;
import com.instabug.featuresrequest.p368a.C9532a;
import com.instabug.featuresrequest.p368a.C9533b;
import com.instabug.featuresrequest.p370c.C9539b;
import com.instabug.featuresrequest.p373ui.p375b.p376a.C9601c.C9603b;
import com.instabug.featuresrequest.p373ui.p377c.C9614a;
import com.instabug.featuresrequest.p373ui.p379e.C9681b;
import com.instabug.library.Instabug;
import com.instabug.library.InstabugColorTheme;
import com.instabug.library.core.p382ui.BaseContract.Presenter;
import com.instabug.library.core.p382ui.C9792a;
import com.instabug.library.util.InstabugLogoProvider;
import com.instabug.library.util.InstabugSDKLogger;
import p205i.p471b.p472a.p473a.p474c.C13938g;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

/* renamed from: com.instabug.featuresrequest.ui.b.a.d */
/* compiled from: FeaturesListFragment */
public abstract class C9604d extends C9792a<C9606e> implements C1814j, OnClickListener, C9532a, C9533b, C9603b, C9611g {

    /* renamed from: X */
    private static transient /* synthetic */ boolean[] f25414X;

    /* renamed from: N */
    private ViewStub f25415N;

    /* renamed from: O */
    private ViewStub f25416O;

    /* renamed from: P */
    protected boolean f25417P = false;

    /* renamed from: Q */
    private View f25418Q;

    /* renamed from: R */
    private ProgressBar f25419R;

    /* renamed from: S */
    private LinearLayout f25420S;

    /* renamed from: T */
    private ImageView f25421T;

    /* renamed from: U */
    private boolean f25422U = false;

    /* renamed from: V */
    private SwipeRefreshLayout f25423V;

    /* renamed from: W */
    private boolean f25424W = false;

    /* renamed from: a */
    ListView f25425a;

    /* renamed from: b */
    C9596a f25426b;

    /* renamed from: com.instabug.featuresrequest.ui.b.a.d$a */
    /* compiled from: FeaturesListFragment */
    class C9605a implements OnScrollListener {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f25427b;

        /* renamed from: a */
        final /* synthetic */ C9604d f25428a;

        C9605a(C9604d dVar) {
            boolean[] a = m44941a();
            this.f25428a = dVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m44941a() {
            boolean[] zArr = f25427b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(2289719924155606752L, "com/instabug/featuresrequest/ui/base/featureslist/FeaturesListFragment$1", 10);
            f25427b = a;
            return a;
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            boolean[] a = m44941a();
            int i4 = i2 + i;
            a[2] = true;
            if (i4 != i3) {
                a[3] = true;
            } else if (C9604d.m44910a(this.f25428a)) {
                a[4] = true;
            } else if (i == 0) {
                a[5] = true;
            } else {
                a[6] = true;
                C9604d.m44911a(this.f25428a, true);
                a[7] = true;
                ((C9606e) C9604d.m44912b(this.f25428a)).mo34409e();
                a[8] = true;
            }
            a[9] = true;
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            m44941a()[1] = true;
        }
    }

    public C9604d() {
        boolean[] A = m44909A();
        A[0] = true;
    }

    /* renamed from: A */
    private static /* synthetic */ boolean[] m44909A() {
        boolean[] zArr = f25414X;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(1827678321573055812L, "com/instabug/featuresrequest/ui/base/featureslist/FeaturesListFragment", C13959t.f40921k2);
        f25414X = a;
        return a;
    }

    /* renamed from: a */
    static /* synthetic */ boolean m44910a(C9604d dVar) {
        boolean[] A = m44909A();
        boolean z = dVar.f25424W;
        A[145] = true;
        return z;
    }

    /* renamed from: b */
    static /* synthetic */ Presenter m44912b(C9604d dVar) {
        boolean[] A = m44909A();
        P p = dVar.presenter;
        A[147] = true;
        return p;
    }

    /* renamed from: x */
    private void m44913x() {
        boolean[] A = m44909A();
        this.f25425a.setOnScrollListener(new C9605a(this));
        A[81] = true;
    }

    /* renamed from: y */
    private void m44914y() {
        boolean[] A = m44909A();
        this.f25425a.setOnScrollListener(null);
        A[82] = true;
    }

    /* renamed from: z */
    private void m44915z() {
        boolean[] A = m44909A();
        try {
            if (!this.f25422U) {
                A[101] = true;
                this.f25418Q = View.inflate(getContext(), C9525R.layout.ib_fr_pull_to_refresh_footer_view, null);
                A[105] = true;
                this.f25419R = (ProgressBar) this.f25418Q.findViewById(C9525R.C9529id.ib_loadmore_progressbar);
                A[106] = true;
                this.f25419R.setVisibility(4);
                A[107] = true;
                this.f25420S = (LinearLayout) this.f25418Q.findViewById(C9525R.C9529id.instabug_pbi_container);
                A[108] = true;
                this.f25421T = (ImageView) this.f25418Q.findViewById(C9525R.C9529id.image_instabug_logo);
                ProgressBar progressBar = this.f25419R;
                A[109] = true;
                Drawable indeterminateDrawable = progressBar.getIndeterminateDrawable();
                A[110] = true;
                indeterminateDrawable.setColorFilter(Instabug.getPrimaryColor(), Mode.SRC_IN);
                A[111] = true;
                this.f25425a.addFooterView(this.f25418Q);
                A[112] = true;
                ((C9606e) this.presenter).mo34410f();
                this.f25422U = true;
                A[113] = true;
                A[116] = true;
                return;
            }
            A[102] = true;
            this.f25425a.removeFooterView(this.f25418Q);
            A[103] = true;
            this.f25425a.addFooterView(this.f25418Q);
            A[104] = true;
        } catch (Exception e) {
            A[114] = true;
            InstabugSDKLogger.m46624e(C9604d.class, "exception occurring while setting up the loadMore views", e);
            A[115] = true;
        }
    }

    /* renamed from: c */
    public void mo34380c() {
        boolean[] A = m44909A();
        this.f25416O.setVisibility(8);
        A[16] = true;
    }

    /* renamed from: d */
    public void mo34381d() {
        boolean[] A = m44909A();
        if (this.f25415N.getParent() != null) {
            A[7] = true;
            View inflate = this.f25415N.inflate();
            A[8] = true;
            Button button = (Button) inflate.findViewById(C9525R.C9529id.ib_empty_state_action);
            A[9] = true;
            ImageView imageView = (ImageView) inflate.findViewById(C9525R.C9529id.ib_empty_state_icon);
            A[10] = true;
            imageView.setImageResource(C9525R.C9528drawable.ib_fr_ic_features_empty_state);
            A[11] = true;
            C9539b.m44632a(button, Instabug.getPrimaryColor());
            A[12] = true;
            button.setOnClickListener(this);
            A[13] = true;
        } else {
            this.f25415N.setVisibility(0);
            A[14] = true;
        }
        A[15] = true;
    }

    /* renamed from: e */
    public void mo34382e() {
        boolean[] A = m44909A();
        if (this.f25425a == null) {
            A[17] = true;
        } else {
            A[18] = true;
            m44915z();
            A[19] = true;
            mo34385h();
            A[20] = true;
        }
        if (((C9606e) this.presenter).mo34415k()) {
            A[21] = true;
            this.f25419R.setVisibility(0);
            A[22] = true;
        } else {
            m44914y();
            A[23] = true;
            this.f25419R.setVisibility(8);
            A[24] = true;
        }
        this.f25424W = false;
        A[25] = true;
    }

    /* renamed from: f */
    public void mo34383f() {
        boolean[] A = m44909A();
        if (this.f25416O.getParent() != null) {
            A[26] = true;
            View inflate = this.f25416O.inflate();
            A[27] = true;
            inflate.setOnClickListener(this);
            A[28] = true;
        } else {
            this.f25416O.setVisibility(0);
            A[29] = true;
        }
        A[30] = true;
    }

    /* renamed from: g */
    public void mo34384g() {
        boolean[] A = m44909A();
        this.f25415N.setVisibility(8);
        A[31] = true;
    }

    /* access modifiers changed from: protected */
    public int getLayout() {
        boolean[] A = m44909A();
        int i = C9525R.layout.ib_fr_features_list_fragment;
        A[42] = true;
        return i;
    }

    /* renamed from: h */
    public void mo34385h() {
        boolean[] A = m44909A();
        C9596a aVar = this.f25426b;
        if (aVar == null) {
            A[32] = true;
        } else {
            A[33] = true;
            aVar.notifyDataSetChanged();
            A[34] = true;
        }
        A[35] = true;
    }

    /* renamed from: i */
    public void mo34386i() {
        boolean[] A = m44909A();
        C1382h supportFragmentManager = getActivity().getSupportFragmentManager();
        A[92] = true;
        C1406n a = supportFragmentManager.mo6224a();
        int i = C9525R.C9529id.instabug_fragment_container;
        C9681b bVar = new C9681b();
        A[93] = true;
        C1406n a2 = a.mo6394a(i, (Fragment) bVar);
        A[94] = true;
        C1406n a3 = a2.mo6401a("search_features");
        A[95] = true;
        a3.mo6097e();
        A[96] = true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0125  */
    @androidx.annotation.C0194i
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void initViews(android.view.View r6, android.os.Bundle r7) {
        /*
            r5 = this;
            boolean[] r6 = m44909A()
            int r0 = com.instabug.featuresrequest.C9525R.C9529id.ib_empty_state_stub
            android.view.View r0 = r5.findViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            r5.f25415N = r0
            r0 = 1
            r1 = 43
            r6[r1] = r0
            int r1 = com.instabug.featuresrequest.C9525R.C9529id.error_state_stub
            android.view.View r1 = r5.findViewById(r1)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            r5.f25416O = r1
            r1 = 44
            r6[r1] = r0
            int r1 = com.instabug.featuresrequest.C9525R.C9529id.features_request_list
            android.view.View r1 = r5.findViewById(r1)
            android.widget.ListView r1 = (android.widget.ListView) r1
            r5.f25425a = r1
            r1 = 45
            r6[r1] = r0
            r5.m44913x()
            r1 = 46
            r6[r1] = r0
            int r1 = com.instabug.featuresrequest.C9525R.C9529id.swipeRefreshLayout
            android.view.View r1 = r5.findViewById(r1)
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r1 = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) r1
            r5.f25423V = r1
            r1 = 47
            r6[r1] = r0
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r1 = r5.f25423V
            int[] r2 = new int[r0]
            int r3 = com.instabug.library.Instabug.getPrimaryColor()
            r4 = 0
            r2[r4] = r3
            r1.setColorSchemeColors(r2)
            r1 = 48
            r6[r1] = r0
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r1 = r5.f25423V
            r1.setOnRefreshListener(r5)
            r1 = 49
            r6[r1] = r0
            android.os.Bundle r1 = r5.getArguments()
            if (r1 != 0) goto L_0x006a
            r1 = 50
            r6[r1] = r0
            goto L_0x007e
        L_0x006a:
            r1 = 51
            r6[r1] = r0
            android.os.Bundle r1 = r5.getArguments()
            java.lang.String r2 = "my_posts"
            boolean r1 = r1.getBoolean(r2, r4)
            r5.f25417P = r1
            r1 = 52
            r6[r1] = r0
        L_0x007e:
            if (r7 != 0) goto L_0x0085
            r7 = 53
            r6[r7] = r0
            goto L_0x008d
        L_0x0085:
            P r1 = r5.presenter
            if (r1 != 0) goto L_0x0099
            r7 = 54
            r6[r7] = r0
        L_0x008d:
            com.instabug.featuresrequest.ui.b.a.e r7 = r5.mo34397w()
            r5.presenter = r7
            r7 = 55
            r6[r7] = r0
            goto L_0x010f
        L_0x0099:
            r5.f25422U = r4
            r1 = 56
            r6[r1] = r0
            java.lang.String r1 = "empty_state"
            boolean r1 = r7.getBoolean(r1)
            if (r1 != 0) goto L_0x00ac
            r1 = 57
            r6[r1] = r0
            goto L_0x00ca
        L_0x00ac:
            P r1 = r5.presenter
            com.instabug.featuresrequest.ui.b.a.e r1 = (com.instabug.featuresrequest.p373ui.p375b.p376a.C9606e) r1
            r2 = 58
            r6[r2] = r0
            int r1 = r1.mo34411g()
            if (r1 == 0) goto L_0x00bf
            r1 = 59
            r6[r1] = r0
            goto L_0x00ca
        L_0x00bf:
            r1 = 60
            r6[r1] = r0
            r5.mo34381d()
            r1 = 61
            r6[r1] = r0
        L_0x00ca:
            java.lang.String r1 = "error_state"
            boolean r7 = r7.getBoolean(r1)
            if (r7 != 0) goto L_0x00d7
            r7 = 62
            r6[r7] = r0
            goto L_0x00f5
        L_0x00d7:
            P r7 = r5.presenter
            com.instabug.featuresrequest.ui.b.a.e r7 = (com.instabug.featuresrequest.p373ui.p375b.p376a.C9606e) r7
            r1 = 63
            r6[r1] = r0
            int r7 = r7.mo34411g()
            if (r7 == 0) goto L_0x00ea
            r7 = 64
            r6[r7] = r0
            goto L_0x00f5
        L_0x00ea:
            r7 = 65
            r6[r7] = r0
            r5.mo34383f()
            r7 = 66
            r6[r7] = r0
        L_0x00f5:
            P r7 = r5.presenter
            com.instabug.featuresrequest.ui.b.a.e r7 = (com.instabug.featuresrequest.p373ui.p375b.p376a.C9606e) r7
            int r7 = r7.mo34411g()
            if (r7 > 0) goto L_0x0104
            r7 = 67
            r6[r7] = r0
            goto L_0x010f
        L_0x0104:
            r7 = 68
            r6[r7] = r0
            r5.m44915z()
            r7 = 69
            r6[r7] = r0
        L_0x010f:
            com.instabug.featuresrequest.ui.b.a.a r7 = new com.instabug.featuresrequest.ui.b.a.a
            P r1 = r5.presenter
            com.instabug.featuresrequest.ui.b.a.e r1 = (com.instabug.featuresrequest.p373ui.p375b.p376a.C9606e) r1
            r7.<init>(r1, r5)
            r5.f25426b = r7
            int r7 = android.os.Build.VERSION.SDK_INT
            r1 = 18
            if (r7 < r1) goto L_0x0125
            r7 = 70
            r6[r7] = r0
            goto L_0x0130
        L_0x0125:
            r7 = 71
            r6[r7] = r0
            r5.m44915z()
            r7 = 72
            r6[r7] = r0
        L_0x0130:
            android.widget.ListView r7 = r5.f25425a
            com.instabug.featuresrequest.ui.b.a.a r1 = r5.f25426b
            r7.setAdapter(r1)
            r7 = 73
            r6[r7] = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.featuresrequest.p373ui.p375b.p376a.C9604d.initViews(android.view.View, android.os.Bundle):void");
    }

    /* renamed from: j */
    public boolean mo34387j() {
        boolean[] A = m44909A();
        boolean z = this.f25417P;
        A[97] = true;
        return z;
    }

    /* renamed from: k */
    public void mo34388k() {
        boolean[] A = m44909A();
        this.f25419R.setVisibility(0);
        A[126] = true;
    }

    /* renamed from: l */
    public void mo34389l() {
        boolean[] A = m44909A();
        this.f25420S.setVisibility(4);
        A[117] = true;
    }

    /* renamed from: m */
    public void mo34390m() {
        boolean[] A = m44909A();
        this.f25420S.setVisibility(0);
        A[118] = true;
        if (Instabug.getTheme() == InstabugColorTheme.InstabugColorThemeDark) {
            A[119] = true;
            this.f25421T.setImageBitmap(InstabugLogoProvider.getInstabugHoloLogo());
            ImageView imageView = this.f25421T;
            A[120] = true;
            int parseColor = Color.parseColor("#FFFFFF");
            Mode mode = Mode.SRC_ATOP;
            A[121] = true;
            imageView.setColorFilter(parseColor, mode);
            A[122] = true;
        } else {
            this.f25421T.setImageBitmap(InstabugLogoProvider.getInstabugHoloLogo());
            A[123] = true;
            this.f25421T.setColorFilter(C0841b.m4915a((Context) getActivity(), C9525R.C9527color.ib_fr_pbi_color), Mode.SRC_ATOP);
            A[124] = true;
        }
        A[125] = true;
    }

    /* renamed from: n */
    public void mo34391n() {
        boolean[] A = m44909A();
        this.f25419R.setVisibility(8);
        A[127] = true;
    }

    /* renamed from: o */
    public void mo34392o() {
        boolean[] A = m44909A();
        mo34391n();
        A[137] = true;
    }

    public void onClick(View view) {
        boolean[] A = m44909A();
        int id = view.getId();
        if (id == C9525R.C9529id.ib_empty_state_action) {
            A[86] = true;
            ((C9606e) this.presenter).mo34413i();
            A[87] = true;
        } else if (id != this.f25416O.getInflatedId()) {
            A[88] = true;
        } else {
            A[89] = true;
            ((C9606e) this.presenter).mo34404b();
            A[90] = true;
        }
        A[91] = true;
    }

    public void onCreate(Bundle bundle) {
        boolean[] A = m44909A();
        super.onCreate(bundle);
        A[1] = true;
        setRetainInstance(true);
        A[2] = true;
    }

    public void onDestroy() {
        boolean[] A = m44909A();
        super.onDestroy();
        A[128] = true;
        ((C9606e) this.presenter).mo34414j();
        A[129] = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
        boolean z;
        boolean[] A = m44909A();
        super.onSaveInstanceState(bundle);
        A[74] = true;
        boolean z2 = false;
        if (this.f25415N.getParent() == null) {
            A[75] = true;
            z = true;
        } else {
            A[76] = true;
            z = false;
        }
        bundle.putBoolean("empty_state", z);
        A[77] = true;
        if (this.f25416O.getParent() == null) {
            A[78] = true;
            z2 = true;
        } else {
            A[79] = true;
        }
        bundle.putBoolean("error_state", z2);
        A[80] = true;
    }

    /* renamed from: p */
    public void mo34393p() {
        boolean[] A = m44909A();
        this.f25425a.smoothScrollToPosition(0);
        A[138] = true;
        m44913x();
        A[139] = true;
        ((C9606e) this.presenter).mo34400a();
        A[140] = true;
    }

    /* renamed from: r */
    public void mo34394r() {
        boolean[] A = m44909A();
        if (getActivity() == null) {
            A[141] = true;
        } else {
            A[142] = true;
            mo34377a(getString(C9525R.string.feature_requests_error_state_sub_title));
            A[143] = true;
        }
        A[144] = true;
    }

    /* renamed from: v */
    public void mo34396v() {
        boolean[] A = m44909A();
        C9596a aVar = this.f25426b;
        if (aVar == null) {
            A[130] = true;
        } else {
            A[131] = true;
            aVar.notifyDataSetChanged();
            A[132] = true;
        }
        A[133] = true;
    }

    @C0193h0
    /* renamed from: w */
    public abstract C9606e mo34397w();

    /* renamed from: a */
    static /* synthetic */ boolean m44911a(C9604d dVar, boolean z) {
        boolean[] A = m44909A();
        dVar.f25424W = z;
        A[146] = true;
        return z;
    }

    /* renamed from: b */
    public void mo34379b(C9567a aVar) {
        boolean[] A = m44909A();
        C1382h supportFragmentManager = getActivity().getSupportFragmentManager();
        A[36] = true;
        C1406n a = supportFragmentManager.mo6224a();
        int i = C9525R.C9529id.instabug_fragment_container;
        A[37] = true;
        C9614a a2 = C9614a.m44988a(aVar, (C9611g) this);
        A[38] = true;
        C1406n a3 = a.mo6394a(i, (Fragment) a2);
        A[39] = true;
        C1406n a4 = a3.mo6401a("feature_requests_details");
        A[40] = true;
        a4.mo6097e();
        A[41] = true;
    }

    /* renamed from: a */
    public void mo34377a(String str) {
        boolean[] A = m44909A();
        if (str == null) {
            A[3] = true;
        } else {
            A[4] = true;
            Toast.makeText(getViewContext().getContext(), str, 0).show();
            A[5] = true;
        }
        A[6] = true;
    }

    /* renamed from: c */
    public void mo34216c(C9567a aVar) {
        boolean[] A = m44909A();
        ((C9606e) this.presenter).mo34402a(aVar);
        A[83] = true;
    }

    /* renamed from: a */
    public void mo34214a(C9567a aVar) {
        boolean[] A = m44909A();
        ((C9606e) this.presenter).mo34406b(aVar);
        A[84] = true;
    }

    /* renamed from: a */
    public void mo34217a(Boolean bool) {
        boolean[] A = m44909A();
        this.f25425a.smoothScrollToPosition(0);
        A[98] = true;
        m44913x();
        A[99] = true;
        ((C9606e) this.presenter).mo34400a();
        A[100] = true;
    }

    /* renamed from: b */
    public void mo34215b(int i) {
        boolean[] A = m44909A();
        ((C9606e) this.presenter).mo34405b(i);
        A[85] = true;
    }

    /* renamed from: a */
    public void mo8147a() {
        boolean[] A = m44909A();
        m44913x();
        A[134] = true;
        ((C9606e) this.presenter).mo34412h();
        A[135] = true;
    }

    /* renamed from: a */
    public void mo34378a(boolean z) {
        boolean[] A = m44909A();
        this.f25423V.setRefreshing(z);
        A[136] = true;
    }
}
