package com.instabug.featuresrequest.p373ui.p375b.p376a;

import android.content.Context;
import android.graphics.Color;
import android.os.Build.VERSION;
import android.text.Html;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.C0202m;
import androidx.core.content.C0841b;
import com.instabug.featuresrequest.C9525R;
import com.instabug.featuresrequest.models.C9567a;
import com.instabug.featuresrequest.models.C9567a.C9568a;
import com.instabug.featuresrequest.p368a.C9532a;
import com.instabug.featuresrequest.p370c.C9538a;
import com.instabug.featuresrequest.p370c.C9539b;
import com.instabug.featuresrequest.p370c.C9542e;
import com.instabug.featuresrequest.p373ui.custom.IbFrRippleView;
import com.instabug.library.Instabug;
import com.instabug.library.InstabugColorTheme;
import com.instabug.library.util.AttrResolver;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.featuresrequest.ui.b.a.b */
/* compiled from: FeatureHolder */
public class C9598b {

    /* renamed from: k */
    private static transient /* synthetic */ boolean[] f25398k;

    /* renamed from: a */
    private final TextView f25399a;

    /* renamed from: b */
    private final ImageView f25400b;

    /* renamed from: c */
    private final TextView f25401c;

    /* renamed from: d */
    private final TextView f25402d;

    /* renamed from: e */
    private final TextView f25403e;

    /* renamed from: f */
    private final TextView f25404f;

    /* renamed from: g */
    private final TextView f25405g;

    /* renamed from: h */
    private final IbFrRippleView f25406h;

    /* renamed from: i */
    private C9532a f25407i;

    /* renamed from: j */
    private View f25408j;

    /* renamed from: com.instabug.featuresrequest.ui.b.a.b$a */
    /* compiled from: FeatureHolder */
    class C9599a implements OnClickListener {

        /* renamed from: N */
        private static transient /* synthetic */ boolean[] f25409N;

        /* renamed from: a */
        final /* synthetic */ C9567a f25410a;

        /* renamed from: b */
        final /* synthetic */ C9598b f25411b;

        C9599a(C9598b bVar, C9567a aVar) {
            boolean[] a = m44889a();
            this.f25411b = bVar;
            this.f25410a = aVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m44889a() {
            boolean[] zArr = f25409N;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-1046999837257444734L, "com/instabug/featuresrequest/ui/base/featureslist/FeatureHolder$1", 13);
            f25409N = a;
            return a;
        }

        public void onClick(View view) {
            boolean[] a = m44889a();
            if (this.f25410a.mo34278o()) {
                a[1] = true;
                C9567a aVar = this.f25410a;
                aVar.mo34261b(aVar.mo34273j() - 1);
                a[2] = true;
                this.f25410a.mo34260a(false);
                a[3] = true;
                this.f25411b.mo34372a(Boolean.valueOf(this.f25410a.mo34278o()));
                a[4] = true;
                C9598b.m44878a(this.f25411b).setRippleColor(Color.parseColor("#888888"));
                a[5] = true;
                C9598b.m44881b(this.f25411b).mo34214a(this.f25410a);
                a[6] = true;
            } else {
                this.f25410a.mo34260a(true);
                a[7] = true;
                C9567a aVar2 = this.f25410a;
                aVar2.mo34261b(aVar2.mo34273j() + 1);
                a[8] = true;
                C9598b.m44878a(this.f25411b).setRippleColor(Color.parseColor("#ffffff"));
                a[9] = true;
                this.f25411b.mo34372a(Boolean.valueOf(this.f25410a.mo34278o()));
                a[10] = true;
                C9598b.m44881b(this.f25411b).mo34216c(this.f25410a);
                a[11] = true;
            }
            a[12] = true;
        }
    }

    /* renamed from: com.instabug.featuresrequest.ui.b.a.b$b */
    /* compiled from: FeatureHolder */
    static /* synthetic */ class C9600b {

        /* renamed from: a */
        static final /* synthetic */ int[] f25412a = new int[C9568a.values().length];

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f25413b;

        /* JADX WARNING: Can't wrap try/catch for region: R(2:4|5) */
        /* JADX WARNING: Can't wrap try/catch for region: R(2:8|9) */
        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            r0[6] = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            r0[8] = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0064, code lost:
            r0[10] = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:?, code lost:
            r0[2] = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            r0[4] = true;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0031 */
        static {
            /*
                boolean[] r0 = m44890a()
                com.instabug.featuresrequest.models.a$a[] r1 = com.instabug.featuresrequest.models.C9567a.C9568a.values()
                int r1 = r1.length
                int[] r1 = new int[r1]
                f25412a = r1
                r1 = 0
                r2 = 5
                r3 = 3
                r4 = 4
                r5 = 2
                r6 = 1
                r0[r1] = r6     // Catch:{ NoSuchFieldError -> 0x0022 }
                int[] r1 = f25412a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.instabug.featuresrequest.models.a$a r7 = com.instabug.featuresrequest.models.C9567a.C9568a.Completed     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r1[r7] = r6     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0[r6] = r6
                goto L_0x0024
            L_0x0022:
                r0[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0031 }
            L_0x0024:
                int[] r1 = f25412a     // Catch:{ NoSuchFieldError -> 0x0031 }
                com.instabug.featuresrequest.models.a$a r7 = com.instabug.featuresrequest.models.C9567a.C9568a.InProgress     // Catch:{ NoSuchFieldError -> 0x0031 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0031 }
                r1[r7] = r5     // Catch:{ NoSuchFieldError -> 0x0031 }
                r0[r3] = r6
                goto L_0x0033
            L_0x0031:
                r0[r4] = r6     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0033:
                int[] r1 = f25412a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.instabug.featuresrequest.models.a$a r5 = com.instabug.featuresrequest.models.C9567a.C9568a.Planned     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r1[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0040 }
                r0[r2] = r6
                goto L_0x0043
            L_0x0040:
                r1 = 6
                r0[r1] = r6     // Catch:{ NoSuchFieldError -> 0x0051 }
            L_0x0043:
                int[] r1 = f25412a     // Catch:{ NoSuchFieldError -> 0x0051 }
                com.instabug.featuresrequest.models.a$a r3 = com.instabug.featuresrequest.models.C9567a.C9568a.Open     // Catch:{ NoSuchFieldError -> 0x0051 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0051 }
                r1[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0051 }
                r1 = 7
                r0[r1] = r6
                goto L_0x0055
            L_0x0051:
                r1 = 8
                r0[r1] = r6     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0055:
                int[] r1 = f25412a     // Catch:{ NoSuchFieldError -> 0x0064 }
                com.instabug.featuresrequest.models.a$a r3 = com.instabug.featuresrequest.models.C9567a.C9568a.MaybeLater     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r1[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0064 }
                r1 = 9
                r0[r1] = r6
                goto L_0x0068
            L_0x0064:
                r1 = 10
                r0[r1] = r6
            L_0x0068:
                r1 = 11
                r0[r1] = r6
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instabug.featuresrequest.p373ui.p375b.p376a.C9598b.C9600b.<clinit>():void");
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m44890a() {
            boolean[] zArr = f25413b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(8493042904213974245L, "com/instabug/featuresrequest/ui/base/featureslist/FeatureHolder$2", 12);
            f25413b = a;
            return a;
        }
    }

    C9598b(View view, C9532a aVar) {
        boolean[] a = m44880a();
        this.f25408j = view;
        this.f25407i = aVar;
        a[0] = true;
        this.f25399a = (TextView) view.findViewById(C9525R.C9529id.instabug_txt_feature_request_vote_txt);
        a[1] = true;
        this.f25400b = (ImageView) view.findViewById(C9525R.C9529id.instabug_txt_feature_request_vote_icon);
        a[2] = true;
        this.f25401c = (TextView) view.findViewById(C9525R.C9529id.instabug_txt_feature_request_title);
        a[3] = true;
        this.f25402d = (TextView) view.findViewById(C9525R.C9529id.instabug_txt_feature_request_vote_count);
        int i = C9525R.C9529id.instabug_txt_feature_request_comment_count;
        a[4] = true;
        this.f25403e = (TextView) view.findViewById(i);
        a[5] = true;
        this.f25404f = (TextView) view.findViewById(C9525R.C9529id.instabug_txt_feature_request_status);
        a[6] = true;
        this.f25405g = (TextView) view.findViewById(C9525R.C9529id.instabug_txt_feature_request_date);
        a[7] = true;
        this.f25406h = (IbFrRippleView) view.findViewById(C9525R.C9529id.ib_btn_fr_vote);
        a[8] = true;
    }

    /* renamed from: a */
    static /* synthetic */ IbFrRippleView m44878a(C9598b bVar) {
        boolean[] a = m44880a();
        IbFrRippleView ibFrRippleView = bVar.f25406h;
        a[52] = true;
        return ibFrRippleView;
    }

    /* renamed from: a */
    private static /* synthetic */ boolean[] m44880a() {
        boolean[] zArr = f25398k;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-4848620374508932389L, "com/instabug/featuresrequest/ui/base/featureslist/FeatureHolder", 54);
        f25398k = a;
        return a;
    }

    /* renamed from: b */
    static /* synthetic */ C9532a m44881b(C9598b bVar) {
        boolean[] a = m44880a();
        C9532a aVar = bVar.f25407i;
        a[53] = true;
        return aVar;
    }

    /* renamed from: a */
    public void mo34373a(String str) {
        boolean[] a = m44880a();
        if (VERSION.SDK_INT >= 24) {
            a[9] = true;
            this.f25401c.setText(Html.fromHtml(str, 63));
            a[10] = true;
        } else {
            this.f25401c.setText(Html.fromHtml(str));
            a[11] = true;
        }
        a[12] = true;
    }

    /* renamed from: b */
    public void mo34374b(int i) {
        boolean[] a = m44880a();
        this.f25402d.setText(C9542e.m44639a(String.valueOf(i)));
        a[31] = true;
    }

    /* renamed from: b */
    public void mo34375b(C9567a aVar) {
        boolean[] a = m44880a();
        this.f25406h.setOnClickListener(new C9599a(this, aVar));
        a[47] = true;
    }

    /* renamed from: a */
    public void mo34371a(C9567a aVar) {
        boolean[] a = m44880a();
        int i = C9600b.f25412a[aVar.mo34274k().ordinal()];
        if (i == 1) {
            this.f25404f.setText(C9525R.string.ib_feature_rq_status_completed);
            a[14] = true;
            m44879a(aVar, this, this.f25408j.getContext(), C9525R.C9527color.ib_fr_color_completed);
            a[15] = true;
            this.f25406h.setEnabled(false);
            a[16] = true;
        } else if (i == 2) {
            this.f25404f.setText(C9525R.string.ib_feature_rq_status_inprogress);
            a[17] = true;
            m44879a(aVar, this, this.f25408j.getContext(), C9525R.C9527color.ib_fr_color_in_progress);
            a[18] = true;
            this.f25406h.setEnabled(true);
            a[19] = true;
        } else if (i == 3) {
            this.f25404f.setText(C9525R.string.ib_feature_rq_status_planned);
            a[20] = true;
            m44879a(aVar, this, this.f25408j.getContext(), C9525R.C9527color.ib_fr_color_planned);
            a[21] = true;
            this.f25406h.setEnabled(true);
            a[22] = true;
        } else if (i == 4) {
            this.f25404f.setText(C9525R.string.ib_feature_rq_status_open);
            a[23] = true;
            m44879a(aVar, this, this.f25408j.getContext(), C9525R.C9527color.ib_fr_color_opened);
            a[24] = true;
            this.f25406h.setEnabled(true);
            a[25] = true;
        } else if (i != 5) {
            a[13] = true;
        } else {
            this.f25404f.setText(C9525R.string.ib_feature_rq_status_maybe_later);
            a[26] = true;
            m44879a(aVar, this, this.f25408j.getContext(), C9525R.C9527color.ib_fr_color_maybe_later);
            a[27] = true;
            this.f25406h.setEnabled(true);
            a[28] = true;
        }
        a[29] = true;
    }

    /* renamed from: a */
    public void mo34369a(int i) {
        boolean[] a = m44880a();
        this.f25403e.setText(C9542e.m44639a(String.valueOf(i)));
        a[30] = true;
    }

    /* renamed from: a */
    public void mo34370a(long j) {
        boolean[] a = m44880a();
        this.f25405g.setText(C9538a.m44630a(this.f25408j.getContext(), j));
        a[32] = true;
    }

    /* renamed from: a */
    public void mo34372a(Boolean bool) {
        boolean[] a = m44880a();
        if (bool.booleanValue()) {
            a[33] = true;
            C9539b.m44632a(this.f25406h, Instabug.getPrimaryColor());
            a[34] = true;
            this.f25402d.setTextColor(C0841b.m4915a(this.f25408j.getContext(), 17170443));
            a[35] = true;
            this.f25400b.setImageResource(C9525R.C9528drawable.ib_fr_ic_vote_arrow_white);
            a[36] = true;
            this.f25399a.setTextColor(C0841b.m4915a(this.f25408j.getContext(), 17170443));
            a[37] = true;
        } else {
            C9539b.m44632a(this.f25406h, 17170443);
            a[38] = true;
            if (Instabug.getTheme() == InstabugColorTheme.InstabugColorThemeLight) {
                a[39] = true;
                this.f25400b.setImageResource(C9525R.C9528drawable.ib_fr_ic_vote_arrow);
                a[40] = true;
                this.f25402d.setTextColor(C0841b.m4915a(this.f25408j.getContext(), C9525R.C9527color.ib_fr_color_ptr_loading_txt));
                a[41] = true;
                this.f25399a.setTextColor(C0841b.m4915a(this.f25408j.getContext(), C9525R.C9527color.ib_fr_color_ptr_loading_txt));
                a[42] = true;
            } else {
                this.f25400b.setImageResource(C9525R.C9528drawable.ib_fr_ic_vote_arrow_dark);
                a[43] = true;
                this.f25402d.setTextColor(AttrResolver.getColor(this.f25408j.getContext(), C9525R.attr.instabug_fr_text_color));
                a[44] = true;
                this.f25399a.setTextColor(AttrResolver.getColor(this.f25408j.getContext(), C9525R.attr.instabug_fr_text_color));
                a[45] = true;
            }
        }
        a[46] = true;
    }

    /* renamed from: a */
    private void m44879a(C9567a aVar, C9598b bVar, Context context, @C0202m int i) {
        boolean[] a = m44880a();
        if (aVar.mo34255a() != null) {
            a[48] = true;
            C9539b.m44632a(bVar.f25404f, Color.parseColor(aVar.mo34255a()));
            a[49] = true;
        } else {
            C9539b.m44632a(bVar.f25404f, C0841b.m4915a(context, i));
            a[50] = true;
        }
        a[51] = true;
    }
}
