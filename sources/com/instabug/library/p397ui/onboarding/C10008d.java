package com.instabug.library.p397ui.onboarding;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.C0213q;
import com.facebook.share.internal.MessengerShareContentUtility;
import com.instabug.library.C9700R;
import com.instabug.library.Instabug;
import com.instabug.library.core.p382ui.C9792a;
import com.instabug.library.util.LocaleUtils;
import com.instabug.library.view.ViewUtils;
import org.jivesoftware.smackx.xhtmlim.XHTMLText;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.ui.onboarding.d */
/* compiled from: OnboardingPagerFragment */
public class C10008d extends C9792a {

    /* renamed from: T */
    private static transient /* synthetic */ boolean[] f26621T;

    /* renamed from: N */
    private ImageView f26622N;

    /* renamed from: O */
    private String f26623O;

    /* renamed from: P */
    private String f26624P;
    @C0213q

    /* renamed from: Q */
    private int f26625Q;

    /* renamed from: R */
    private boolean f26626R = false;

    /* renamed from: S */
    private RelativeLayout f26627S;

    /* renamed from: a */
    private TextView f26628a;

    /* renamed from: b */
    private TextView f26629b;

    public C10008d() {
        boolean[] d = m46587d();
        d[0] = true;
    }

    /* renamed from: a */
    public static C10008d m46585a(@C0213q int i, String str, String str2) {
        boolean[] d = m46587d();
        Bundle bundle = new Bundle();
        d[1] = true;
        bundle.putInt(XHTMLText.IMG, i);
        d[2] = true;
        bundle.putString("title", str);
        d[3] = true;
        bundle.putString(MessengerShareContentUtility.SUBTITLE, str2);
        d[4] = true;
        C10008d dVar = new C10008d();
        d[5] = true;
        dVar.setArguments(bundle);
        d[6] = true;
        return dVar;
    }

    /* renamed from: d */
    private static /* synthetic */ boolean[] m46587d() {
        boolean[] zArr = f26621T;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(9162920063578618228L, "com/instabug/library/ui/onboarding/OnboardingPagerFragment", 37);
        f26621T = a;
        return a;
    }

    /* access modifiers changed from: protected */
    public int getLayout() {
        boolean[] d = m46587d();
        int i = C9700R.layout.ib_core_lyt_onboarding_pager_fragment;
        d[15] = true;
        return i;
    }

    /* access modifiers changed from: protected */
    public void initViews(View view, Bundle bundle) {
        boolean[] d = m46587d();
        this.f26628a = (TextView) findViewById(C9700R.C9704id.ib_core_tv_title);
        d[16] = true;
        this.f26629b = (TextView) findViewById(C9700R.C9704id.ib_core_tv_subtitle);
        d[17] = true;
        this.f26622N = (ImageView) findViewById(C9700R.C9704id.ib_core_img_onboarding);
        d[18] = true;
        this.f26627S = (RelativeLayout) findViewById(C9700R.C9704id.ib_core_lyt_onboarding_pager_fragment);
        d[19] = true;
        if (!LocaleUtils.isRTL(Instabug.getLocale(getContext()))) {
            d[20] = true;
        } else {
            d[21] = true;
            this.f26627S.setRotation(180.0f);
            d[22] = true;
        }
        this.f26628a.setText(this.f26623O);
        d[23] = true;
        this.f26629b.setText(this.f26624P);
        d[24] = true;
        this.f26622N.setImageResource(this.f26625Q);
        if (!this.f26626R) {
            d[25] = true;
        } else {
            d[26] = true;
            RelativeLayout relativeLayout = this.f26627S;
            int convertDpToPx = ViewUtils.convertDpToPx(getContext(), 16.0f);
            d[27] = true;
            int convertDpToPx2 = ViewUtils.convertDpToPx(getContext(), 24.0f);
            d[28] = true;
            int convertDpToPx3 = ViewUtils.convertDpToPx(getContext(), 16.0f);
            d[29] = true;
            int convertDpToPx4 = ViewUtils.convertDpToPx(getContext(), 16.0f);
            d[30] = true;
            relativeLayout.setPadding(convertDpToPx, convertDpToPx2, convertDpToPx3, convertDpToPx4);
            d[31] = true;
        }
        this.f26622N.setBackgroundColor(Instabug.getPrimaryColor());
        d[32] = true;
        int convertDpToPx5 = ViewUtils.convertDpToPx(getContext(), 1.0f);
        d[33] = true;
        int i = -convertDpToPx5;
        this.f26622N.setPadding(i, i, i, i);
        d[34] = true;
    }

    public void onCreate(Bundle bundle) {
        boolean[] d = m46587d();
        super.onCreate(bundle);
        d[7] = true;
        if (getArguments() == null) {
            d[8] = true;
        } else {
            d[9] = true;
            this.f26623O = getArguments().getString("title");
            d[10] = true;
            this.f26624P = getArguments().getString(MessengerShareContentUtility.SUBTITLE);
            d[11] = true;
            this.f26625Q = getArguments().getInt(XHTMLText.IMG);
            d[12] = true;
            this.f26626R = getArguments().getBoolean("setLivePadding");
            d[13] = true;
        }
        d[14] = true;
    }

    /* renamed from: a */
    public static C10008d m46586a(int i, String str, String str2, boolean z) {
        boolean[] d = m46587d();
        C10008d a = m46585a(i, str, str2);
        d[35] = true;
        a.getArguments().putBoolean("setLivePadding", z);
        d[36] = true;
        return a;
    }
}
