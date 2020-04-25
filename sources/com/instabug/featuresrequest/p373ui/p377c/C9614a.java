package com.instabug.featuresrequest.p373ui.p377c;

import android.graphics.drawable.GradientDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.content.C0841b;
import androidx.core.graphics.drawable.C0892a;
import androidx.fragment.app.C1382h;
import androidx.fragment.app.C1406n;
import androidx.fragment.app.Fragment;
import com.instabug.featuresrequest.C9525R;
import com.instabug.featuresrequest.models.C9567a;
import com.instabug.featuresrequest.models.C9567a.C9568a;
import com.instabug.featuresrequest.models.C9572d;
import com.instabug.featuresrequest.models.C9573e;
import com.instabug.featuresrequest.models.C9575f;
import com.instabug.featuresrequest.p370c.C9543f;
import com.instabug.featuresrequest.p373ui.custom.C9659f;
import com.instabug.featuresrequest.p373ui.custom.C9659f.C9660a;
import com.instabug.featuresrequest.p373ui.custom.C9659f.C9661b;
import com.instabug.featuresrequest.p373ui.custom.DynamicToolbarFragment;
import com.instabug.featuresrequest.p373ui.p374a.C9587b;
import com.instabug.featuresrequest.p373ui.p375b.p376a.C9611g;
import com.instabug.featuresrequest.p373ui.p377c.C9619b.C9621b;
import com.instabug.library.Instabug;
import com.instabug.library.InstabugColorTheme;
import com.instabug.library.core.p382ui.BaseContract.Presenter;
import com.instabug.library.util.AttrResolver;
import com.instabug.library.view.ViewUtils;
import java.util.ArrayList;
import p205i.p471b.p472a.p473a.p474c.C13938g;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

/* renamed from: com.instabug.featuresrequest.ui.c.a */
/* compiled from: FeatureRequestsDetailsFragment */
public class C9614a extends DynamicToolbarFragment<C9622c> implements C9621b {

    /* renamed from: f0 */
    private static transient /* synthetic */ boolean[] f25446f0;

    /* renamed from: N */
    private TextView f25447N;

    /* renamed from: O */
    private TextView f25448O;

    /* renamed from: P */
    private TextView f25449P;

    /* renamed from: Q */
    private TextView f25450Q;

    /* renamed from: R */
    private TextView f25451R;

    /* renamed from: S */
    private TextView f25452S;

    /* renamed from: T */
    private TextView f25453T;

    /* renamed from: U */
    private ImageView f25454U;

    /* renamed from: V */
    private TextView f25455V;

    /* renamed from: W */
    private LinearLayout f25456W;

    /* renamed from: X */
    private LinearLayout f25457X;

    /* renamed from: Y */
    private ImageView f25458Y;

    /* renamed from: Z */
    private ListView f25459Z;

    /* renamed from: a */
    private LinearLayout f25460a;

    /* renamed from: a0 */
    private boolean f25461a0 = false;

    /* renamed from: b */
    private C9567a f25462b;

    /* renamed from: b0 */
    private C9623d f25463b0;

    /* renamed from: c0 */
    private ArrayList<C9573e> f25464c0;

    /* renamed from: d0 */
    private C9611g f25465d0;

    /* renamed from: e0 */
    private boolean f25466e0;

    /* renamed from: com.instabug.featuresrequest.ui.c.a$a */
    /* compiled from: FeatureRequestsDetailsFragment */
    class C9615a implements C9660a {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f25467b;

        /* renamed from: a */
        final /* synthetic */ C9614a f25468a;

        C9615a(C9614a aVar) {
            boolean[] a = m45009a();
            this.f25468a = aVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45009a() {
            boolean[] zArr = f25467b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-1492936263229971676L, "com/instabug/featuresrequest/ui/featuredetails/FeatureRequestsDetailsFragment$1", 2);
            f25467b = a;
            return a;
        }

        /* renamed from: d */
        public void mo34351d() {
            boolean[] a = m45009a();
            ((C9622c) C9614a.m44989a(this.f25468a)).mo34449d();
            a[1] = true;
        }
    }

    /* renamed from: com.instabug.featuresrequest.ui.c.a$b */
    /* compiled from: FeatureRequestsDetailsFragment */
    class C9616b implements C9660a {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f25469b;

        /* renamed from: a */
        final /* synthetic */ C9614a f25470a;

        C9616b(C9614a aVar) {
            boolean[] a = m45011a();
            this.f25470a = aVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45011a() {
            boolean[] zArr = f25469b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-5489182459595811291L, "com/instabug/featuresrequest/ui/featuredetails/FeatureRequestsDetailsFragment$2", 3);
            f25469b = a;
            return a;
        }

        /* renamed from: d */
        public void mo34351d() {
            boolean[] a = m45011a();
            C9614a.m44991a(this.f25470a, true);
            a[1] = true;
            ((C9622c) C9614a.m44995c(this.f25470a)).mo34447a(C9614a.m44992b(this.f25470a));
            a[2] = true;
        }
    }

    /* renamed from: com.instabug.featuresrequest.ui.c.a$c */
    /* compiled from: FeatureRequestsDetailsFragment */
    class C9617c implements Runnable {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f25471b;

        /* renamed from: a */
        final /* synthetic */ C9614a f25472a;

        C9617c(C9614a aVar) {
            boolean[] a = m45013a();
            this.f25472a = aVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45013a() {
            boolean[] zArr = f25471b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-7587423210627890735L, "com/instabug/featuresrequest/ui/featuredetails/FeatureRequestsDetailsFragment$3", 4);
            f25471b = a;
            return a;
        }

        public void run() {
            boolean z;
            boolean[] a = m45013a();
            C9614a aVar = this.f25472a;
            if (!C9614a.m44996d(aVar)) {
                a[1] = true;
                z = true;
            } else {
                z = false;
                a[2] = true;
            }
            C9614a.m44994b(aVar, z);
            a[3] = true;
        }
    }

    /* renamed from: com.instabug.featuresrequest.ui.c.a$d */
    /* compiled from: FeatureRequestsDetailsFragment */
    class C9618d implements Runnable {

        /* renamed from: N */
        private static transient /* synthetic */ boolean[] f25473N;

        /* renamed from: a */
        final /* synthetic */ C9567a f25474a;

        /* renamed from: b */
        final /* synthetic */ C9614a f25475b;

        C9618d(C9614a aVar, C9567a aVar2) {
            boolean[] a = m45014a();
            this.f25475b = aVar;
            this.f25474a = aVar2;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45014a() {
            boolean[] zArr = f25473N;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-147491239101457771L, "com/instabug/featuresrequest/ui/featuredetails/FeatureRequestsDetailsFragment$4", 32);
            f25473N = a;
            return a;
        }

        public void run() {
            boolean[] a = m45014a();
            C9614a.m44997e(this.f25475b).setImageResource(C9525R.C9528drawable.ib_fr_ic_vote_arrow_white);
            a[1] = true;
            GradientDrawable gradientDrawable = (GradientDrawable) C9614a.m44998f(this.f25475b).getBackground();
            a[2] = true;
            C9614a.m44999g(this.f25475b).setText(this.f25475b.getString(C9525R.string.feature_request_votes_count, Integer.valueOf(this.f25474a.mo34273j())));
            a[3] = true;
            if (Instabug.getTheme() == InstabugColorTheme.InstabugColorThemeLight) {
                a[4] = true;
                if (this.f25474a.mo34278o()) {
                    a[5] = true;
                    gradientDrawable.setStroke(ViewUtils.convertDpToPx(this.f25475b.getContext(), 2.0f), C0841b.m4915a(this.f25475b.getContext(), 17170443));
                    a[6] = true;
                    gradientDrawable.setColor(C0841b.m4915a(this.f25475b.getContext(), 17170443));
                    a[7] = true;
                    C9614a.m44999g(this.f25475b).setTextColor(Instabug.getPrimaryColor());
                    a[8] = true;
                    C0892a.m5154b(C9614a.m44997e(this.f25475b).getDrawable(), Instabug.getPrimaryColor());
                    if (VERSION.SDK_INT >= 16) {
                        a[9] = true;
                        C9614a.m44998f(this.f25475b).setBackground(gradientDrawable);
                        a[10] = true;
                    } else {
                        C9614a.m44998f(this.f25475b).setBackgroundDrawable(gradientDrawable);
                        a[11] = true;
                    }
                } else {
                    gradientDrawable.setStroke(ViewUtils.convertDpToPx(this.f25475b.getContext(), 2.0f), C0841b.m4915a(this.f25475b.getContext(), C9525R.C9527color.ib_fr_toolbar_vote_btn_stroke_color));
                    a[12] = true;
                    gradientDrawable.setColor(C0841b.m4915a(this.f25475b.getContext(), 17170445));
                    a[13] = true;
                    C9614a.m44999g(this.f25475b).setTextColor(C0841b.m4915a(this.f25475b.getContext(), 17170443));
                    a[14] = true;
                    C0892a.m5154b(C9614a.m44997e(this.f25475b).getDrawable(), C0841b.m4915a(this.f25475b.getContext(), 17170443));
                    if (VERSION.SDK_INT >= 16) {
                        a[15] = true;
                        C9614a.m44998f(this.f25475b).setBackground(gradientDrawable);
                        a[16] = true;
                    } else {
                        C9614a.m44998f(this.f25475b).setBackgroundDrawable(gradientDrawable);
                        a[17] = true;
                    }
                }
            } else if (this.f25474a.mo34278o()) {
                a[18] = true;
                gradientDrawable.setStroke(ViewUtils.convertDpToPx(this.f25475b.getContext(), 2.0f), Instabug.getPrimaryColor());
                a[19] = true;
                gradientDrawable.setColor(Instabug.getPrimaryColor());
                a[20] = true;
                C9614a.m44999g(this.f25475b).setTextColor(C0841b.m4915a(this.f25475b.getContext(), 17170443));
                a[21] = true;
                C0892a.m5154b(C9614a.m44997e(this.f25475b).getDrawable(), C0841b.m4915a(this.f25475b.getContext(), 17170443));
                if (VERSION.SDK_INT >= 16) {
                    a[22] = true;
                    C9614a.m44998f(this.f25475b).setBackground(gradientDrawable);
                    a[23] = true;
                } else {
                    C9614a.m44998f(this.f25475b).setBackgroundDrawable(gradientDrawable);
                    a[24] = true;
                }
            } else {
                gradientDrawable.setStroke(ViewUtils.convertDpToPx(this.f25475b.getContext(), 2.0f), Instabug.getPrimaryColor());
                a[25] = true;
                gradientDrawable.setColor(C0841b.m4915a(this.f25475b.getContext(), 17170445));
                a[26] = true;
                C9614a.m44999g(this.f25475b).setTextColor(Instabug.getPrimaryColor());
                a[27] = true;
                C0892a.m5154b(C9614a.m44997e(this.f25475b).getDrawable(), Instabug.getPrimaryColor());
                if (VERSION.SDK_INT >= 16) {
                    a[28] = true;
                    C9614a.m44998f(this.f25475b).setBackground(gradientDrawable);
                    a[29] = true;
                } else {
                    C9614a.m44998f(this.f25475b).setBackgroundDrawable(gradientDrawable);
                    a[30] = true;
                }
            }
            a[31] = true;
        }
    }

    public C9614a() {
        boolean[] h = m45000h();
        h[0] = true;
        this.f25464c0 = new ArrayList<>();
        this.f25466e0 = false;
        h[1] = true;
    }

    /* renamed from: a */
    static /* synthetic */ Presenter m44989a(C9614a aVar) {
        boolean[] h = m45000h();
        P p = aVar.presenter;
        h[121] = true;
        return p;
    }

    /* renamed from: b */
    static /* synthetic */ C9567a m44992b(C9614a aVar) {
        boolean[] h = m45000h();
        C9567a aVar2 = aVar.f25462b;
        h[123] = true;
        return aVar2;
    }

    /* renamed from: c */
    static /* synthetic */ Presenter m44995c(C9614a aVar) {
        boolean[] h = m45000h();
        P p = aVar.presenter;
        h[124] = true;
        return p;
    }

    /* renamed from: d */
    static /* synthetic */ boolean m44996d(C9614a aVar) {
        boolean[] h = m45000h();
        boolean z = aVar.f25461a0;
        h[126] = true;
        return z;
    }

    /* renamed from: e */
    static /* synthetic */ ImageView m44997e(C9614a aVar) {
        boolean[] h = m45000h();
        ImageView imageView = aVar.f25454U;
        h[127] = true;
        return imageView;
    }

    /* renamed from: f */
    static /* synthetic */ LinearLayout m44998f(C9614a aVar) {
        boolean[] h = m45000h();
        LinearLayout linearLayout = aVar.f25460a;
        h[128] = true;
        return linearLayout;
    }

    /* renamed from: g */
    static /* synthetic */ TextView m44999g(C9614a aVar) {
        boolean[] h = m45000h();
        TextView textView = aVar.f25447N;
        h[129] = true;
        return textView;
    }

    /* renamed from: h */
    private static /* synthetic */ boolean[] m45000h() {
        boolean[] zArr = f25446f0;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(9070412495372589263L, "com/instabug/featuresrequest/ui/featuredetails/FeatureRequestsDetailsFragment", C13959t.f40839S1);
        f25446f0 = a;
        return a;
    }

    /* access modifiers changed from: protected */
    public void addToolbarActionButtons() {
        boolean[] h = m45000h();
        this.toolbarActionButtons.add(new C9659f(-1, C9525R.string.ib_feature_rq_str_votes, new C9616b(this), C9661b.VOTE));
        h[12] = true;
    }

    /* access modifiers changed from: protected */
    public int getContentLayout() {
        boolean[] h = m45000h();
        int i = C9525R.layout.ib_fr_features_details_fragment;
        h[14] = true;
        return i;
    }

    /* access modifiers changed from: protected */
    public String getTitle() {
        boolean[] h = m45000h();
        String string = getString(C9525R.string.feature_requests_details);
        h[13] = true;
        return string;
    }

    /* access modifiers changed from: protected */
    public C9659f getToolbarCloseActionButton() {
        boolean[] h = m45000h();
        C9659f fVar = new C9659f(C9525R.C9528drawable.instabug_ic_back, C9525R.string.feature_request_go_back, new C9615a(this), C9661b.ICON);
        h[11] = true;
        return fVar;
    }

    /* access modifiers changed from: protected */
    public void initContentViews(View view, Bundle bundle) {
        boolean[] h = m45000h();
        this.f25460a = (LinearLayout) this.toolbar.findViewById(C9525R.C9529id.ib_feature_request_toolbar_vote_action_layout);
        h[15] = true;
        this.f25447N = (TextView) this.toolbar.findViewById(C9525R.C9529id.ib_toolbar_vote_count);
        h[16] = true;
        this.f25454U = (ImageView) this.toolbar.findViewById(C9525R.C9529id.ib_toolbar_vote_icon);
        h[17] = true;
        this.f25455V = (TextView) view.findViewById(C9525R.C9529id.ib_fr_tv_feature_details_desc);
        h[18] = true;
        this.f25448O = (TextView) view.findViewById(C9525R.C9529id.ib_fr_details_title);
        h[19] = true;
        this.f25449P = (TextView) view.findViewById(C9525R.C9529id.instabug_txt_feature_request_status);
        h[20] = true;
        this.f25451R = (TextView) view.findViewById(C9525R.C9529id.ib_txt_feature_request_date);
        h[21] = true;
        this.f25450Q = (TextView) view.findViewById(C9525R.C9529id.ib_txt_feature_request_owner);
        h[22] = true;
        this.f25452S = (TextView) view.findViewById(C9525R.C9529id.tv_add_comment);
        h[23] = true;
        this.f25453T = (TextView) view.findViewById(C9525R.C9529id.ib_features_request_comment_count);
        h[24] = true;
        this.f25456W = (LinearLayout) view.findViewById(C9525R.C9529id.ib_fr_details_no_comments_layout);
        h[25] = true;
        this.f25458Y = (ImageView) view.findViewById(C9525R.C9529id.ib_fr_details_no_comments_icon);
        h[26] = true;
        this.f25459Z = (ListView) view.findViewById(C9525R.C9529id.instabug_feature_details_comments_list);
        h[27] = true;
        this.f25457X = (LinearLayout) view.findViewById(C9525R.C9529id.addCommentLayoutContainer);
        h[28] = true;
        this.f25458Y.setColorFilter(AttrResolver.getColor(getContext(), C9525R.attr.ib_fr_no_comments_icon_color));
        h[29] = true;
        this.f25452S.setOnClickListener(this);
        h[30] = true;
        this.f25463b0 = new C9623d(this.f25464c0, this);
        h[31] = true;
        this.f25459Z.setAdapter(this.f25463b0);
        h[32] = true;
        mo34438c(this.f25462b);
        h[33] = true;
        ((C9622c) this.presenter).mo34446a(this.f25462b.mo34271h());
        h[34] = true;
    }

    public void onClick(View view) {
        boolean[] h = m45000h();
        if (view.getId() != C9525R.C9529id.tv_add_comment) {
            h[78] = true;
        } else {
            h[79] = true;
            if (getActivity() == null) {
                h[80] = true;
            } else {
                h[81] = true;
                C1382h supportFragmentManager = getActivity().getSupportFragmentManager();
                h[82] = true;
                C1406n a = supportFragmentManager.mo6224a();
                int i = C9525R.C9529id.instabug_fragment_container;
                C9567a aVar = this.f25462b;
                h[83] = true;
                C1406n a2 = a.mo6394a(i, (Fragment) C9587b.m44823a(aVar.mo34271h()));
                h[84] = true;
                C1406n a3 = a2.mo6401a("add_comment");
                h[85] = true;
                a3.mo6097e();
                h[86] = true;
            }
        }
        h[87] = true;
    }

    public void onCreate(Bundle bundle) {
        boolean[] h = m45000h();
        super.onCreate(bundle);
        h[8] = true;
        this.f25462b = (C9567a) getArguments().getSerializable("key_feature");
        h[9] = true;
        this.presenter = new C9622c(this);
        h[10] = true;
    }

    public void onDestroy() {
        boolean[] h = m45000h();
        super.onDestroy();
        C9611g gVar = this.f25465d0;
        if (gVar == null) {
            h[90] = true;
        } else if (!this.f25466e0) {
            h[91] = true;
        } else {
            h[92] = true;
            gVar.mo34396v();
            h[93] = true;
        }
        h[94] = true;
    }

    /* renamed from: a */
    static /* synthetic */ boolean m44991a(C9614a aVar, boolean z) {
        boolean[] h = m45000h();
        aVar.f25466e0 = z;
        h[122] = true;
        return z;
    }

    /* renamed from: b */
    static /* synthetic */ boolean m44994b(C9614a aVar, boolean z) {
        boolean[] h = m45000h();
        aVar.f25461a0 = z;
        h[125] = true;
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00d9  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo34438c(com.instabug.featuresrequest.models.C9567a r13) {
        /*
            r12 = this;
            boolean[] r0 = m45000h()
            r12.f25462b = r13
            r1 = 1
            r2 = 35
            r0[r2] = r1
            android.widget.TextView r2 = r12.f25448O
            java.lang.String r3 = r13.mo34275l()
            r2.setText(r3)
            r2 = 36
            r0[r2] = r1
            java.lang.String r2 = r13.mo34270g()
            r3 = 8
            java.lang.String r4 = "null"
            r5 = 0
            if (r2 != 0) goto L_0x0028
            r2 = 37
            r0[r2] = r1
            goto L_0x004d
        L_0x0028:
            r2 = 38
            r0[r2] = r1
            java.lang.String r2 = r13.mo34270g()
            boolean r2 = r2.equalsIgnoreCase(r4)
            if (r2 == 0) goto L_0x003b
            r2 = 39
            r0[r2] = r1
            goto L_0x004d
        L_0x003b:
            r2 = 40
            r0[r2] = r1
            java.lang.String r2 = r13.mo34270g()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x0057
            r2 = 41
            r0[r2] = r1
        L_0x004d:
            android.widget.TextView r2 = r12.f25455V
            r2.setVisibility(r3)
            r2 = 50
            r0[r2] = r1
            goto L_0x009d
        L_0x0057:
            r2 = 42
            r0[r2] = r1
            android.widget.TextView r2 = r12.f25455V
            r2.setVisibility(r5)
            android.widget.TextView r6 = r12.f25455V
            r2 = 43
            r0[r2] = r1
            java.lang.String r7 = r13.mo34270g()
            int r2 = com.instabug.featuresrequest.C9525R.string.feature_request_str_more
            r8 = 44
            r0[r8] = r1
            java.lang.String r8 = r12.getString(r2)
            int r2 = com.instabug.featuresrequest.C9525R.string.feature_request_str_less
            r9 = 45
            r0[r9] = r1
            java.lang.String r9 = r12.getString(r2)
            boolean r2 = r12.f25461a0
            if (r2 != 0) goto L_0x0088
            r2 = 46
            r0[r2] = r1
            r10 = 1
            goto L_0x008d
        L_0x0088:
            r2 = 47
            r0[r2] = r1
            r10 = 0
        L_0x008d:
            com.instabug.featuresrequest.ui.c.a$c r11 = new com.instabug.featuresrequest.ui.c.a$c
            r11.<init>(r12)
            r2 = 48
            r0[r2] = r1
            com.instabug.featuresrequest.p370c.C9548j.m44652a(r6, r7, r8, r9, r10, r11)
            r2 = 49
            r0[r2] = r1
        L_0x009d:
            boolean r2 = r13.mo34277n()
            if (r2 == 0) goto L_0x00ba
            r2 = 51
            r0[r2] = r1
            android.widget.LinearLayout r2 = r12.f25457X
            r2.setVisibility(r3)
            r2 = 52
            r0[r2] = r1
            android.widget.LinearLayout r2 = r12.f25460a
            r2.setEnabled(r5)
            r2 = 53
            r0[r2] = r1
            goto L_0x00cc
        L_0x00ba:
            android.widget.LinearLayout r2 = r12.f25457X
            r2.setVisibility(r5)
            r2 = 54
            r0[r2] = r1
            android.widget.LinearLayout r2 = r12.f25460a
            r2.setEnabled(r1)
            r2 = 55
            r0[r2] = r1
        L_0x00cc:
            android.widget.TextView r2 = r12.f25450Q
            java.lang.String r3 = r13.mo34267e()
            if (r3 != 0) goto L_0x00d9
            r3 = 56
            r0[r3] = r1
            goto L_0x00fe
        L_0x00d9:
            r3 = 57
            r0[r3] = r1
            java.lang.String r3 = r13.mo34267e()
            boolean r3 = r3.equalsIgnoreCase(r4)
            if (r3 == 0) goto L_0x00ec
            r3 = 58
            r0[r3] = r1
            goto L_0x00fe
        L_0x00ec:
            r3 = 59
            r0[r3] = r1
            java.lang.String r3 = r13.mo34267e()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x010d
            r3 = 60
            r0[r3] = r1
        L_0x00fe:
            int r3 = com.instabug.featuresrequest.C9525R.string.feature_request_owner_anonymous
            r4 = 63
            r0[r4] = r1
            java.lang.String r3 = r12.getString(r3)
            r4 = 64
            r0[r4] = r1
            goto L_0x0123
        L_0x010d:
            int r3 = com.instabug.featuresrequest.C9525R.string.feature_request_owner
            java.lang.Object[] r4 = new java.lang.Object[r1]
            r6 = 61
            r0[r6] = r1
            java.lang.String r6 = r13.mo34267e()
            r4[r5] = r6
            java.lang.String r3 = r12.getString(r3, r4)
            r4 = 62
            r0[r4] = r1
        L_0x0123:
            r2.setText(r3)
            r2 = 65
            r0[r2] = r1
            android.widget.TextView r2 = r12.f25453T
            int r3 = com.instabug.featuresrequest.C9525R.string.feature_request_comments_count
            java.lang.Object[] r4 = new java.lang.Object[r1]
            int r6 = r13.mo34265d()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4[r5] = r6
            java.lang.String r3 = r12.getString(r3, r4)
            r2.setText(r3)
            r2 = 66
            r0[r2] = r1
            com.instabug.featuresrequest.models.a$a r2 = r13.mo34274k()
            java.lang.String r3 = r13.mo34255a()
            android.widget.TextView r4 = r12.f25449P
            android.content.Context r5 = r12.getContext()
            com.instabug.featuresrequest.p370c.C9544g.m44643a(r2, r3, r4, r5)
            r2 = 67
            r0[r2] = r1
            android.widget.TextView r2 = r12.f25451R
            android.content.Context r3 = r12.getContext()
            long r4 = r13.mo34269f()
            java.lang.String r3 = com.instabug.featuresrequest.p370c.C9538a.m44630a(r3, r4)
            r2.setText(r3)
            r2 = 68
            r0[r2] = r1
            r12.m44993b(r13)
            r13 = 69
            r0[r13] = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.featuresrequest.p373ui.p377c.C9614a.mo34438c(com.instabug.featuresrequest.models.a):void");
    }

    /* renamed from: d */
    public void mo34439d() {
        boolean[] h = m45000h();
        if (getActivity() == null) {
            h[70] = true;
        } else {
            h[71] = true;
            getActivity().onBackPressed();
            h[72] = true;
        }
        h[73] = true;
    }

    /* renamed from: e */
    public void mo34440e() {
        boolean[] h = m45000h();
        if (this.f25464c0.size() <= 0) {
            h[104] = true;
        } else {
            h[105] = true;
            h[106] = true;
            int i = 0;
            while (true) {
                if (i >= this.f25464c0.size() - 1) {
                    h[107] = true;
                    break;
                }
                h[108] = true;
                C9573e eVar = (C9573e) this.f25464c0.get(i);
                if (eVar instanceof C9572d) {
                    h[109] = true;
                    if (((C9572d) eVar).mo34305f() == C9568a.Completed) {
                        h[110] = true;
                        this.f25457X.setVisibility(8);
                        h[111] = true;
                        this.f25460a.setEnabled(false);
                        h[112] = true;
                    } else {
                        this.f25457X.setVisibility(0);
                        h[113] = true;
                        this.f25460a.setEnabled(true);
                        h[114] = true;
                    }
                } else {
                    i++;
                    h[115] = true;
                }
            }
        }
        h[116] = true;
    }

    /* renamed from: f */
    public void mo34441f() {
        boolean[] h = m45000h();
        C9543f.m44641a(this.f25459Z);
        h[117] = true;
    }

    /* renamed from: g */
    public void mo34442g() {
        boolean[] h = m45000h();
        C9567a aVar = this.f25462b;
        aVar.mo34256a(aVar.mo34265d() + 1);
        h[118] = true;
        mo34438c(this.f25462b);
        h[119] = true;
        ((C9622c) this.presenter).mo34446a(this.f25462b.mo34271h());
        h[120] = true;
    }

    /* renamed from: a */
    public static C9614a m44988a(C9567a aVar, C9611g gVar) {
        boolean[] h = m45000h();
        Bundle bundle = new Bundle();
        h[2] = true;
        bundle.putSerializable("key_feature", aVar);
        h[3] = true;
        C9614a aVar2 = new C9614a();
        h[4] = true;
        aVar2.m44990a(gVar);
        h[5] = true;
        aVar2.setArguments(bundle);
        h[6] = true;
        return aVar2;
    }

    /* renamed from: b */
    private void m44993b(C9567a aVar) {
        boolean[] h = m45000h();
        LinearLayout linearLayout = this.f25460a;
        if (linearLayout == null) {
            h[74] = true;
        } else {
            h[75] = true;
            linearLayout.post(new C9618d(this, aVar));
            h[76] = true;
        }
        h[77] = true;
    }

    /* renamed from: a */
    private void m44990a(C9611g gVar) {
        boolean[] h = m45000h();
        this.f25465d0 = gVar;
        h[7] = true;
    }

    /* renamed from: a */
    public void mo34435a(C9567a aVar) {
        boolean[] h = m45000h();
        m44993b(aVar);
        h[89] = true;
    }

    /* renamed from: a */
    public void mo34436a(C9575f fVar) {
        boolean[] h = m45000h();
        this.f25464c0 = null;
        h[95] = true;
        this.f25464c0 = new ArrayList<>();
        this.f25463b0 = null;
        h[96] = true;
        this.f25463b0 = new C9623d(this.f25464c0, this);
        h[97] = true;
        this.f25459Z.setAdapter(this.f25463b0);
        h[98] = true;
        this.f25464c0.addAll(fVar.mo34313a());
        h[99] = true;
        this.f25463b0.notifyDataSetChanged();
        h[100] = true;
        this.f25456W.setVisibility(8);
        h[101] = true;
        this.f25459Z.invalidate();
        h[102] = true;
        C9543f.m44641a(this.f25459Z);
        h[103] = true;
    }

    /* renamed from: c */
    public void mo34437c() {
        boolean[] h = m45000h();
        this.f25456W.setVisibility(0);
        h[88] = true;
    }
}
