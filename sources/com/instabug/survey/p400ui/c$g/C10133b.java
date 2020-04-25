package com.instabug.survey.p400ui.c$g;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.C0195i0;
import com.instabug.survey.C10049R;
import com.instabug.survey.models.C10084b;
import com.instabug.survey.p400ui.C10105c.C10107b;
import com.instabug.survey.p400ui.C10105c.C10122e;
import com.instabug.survey.p400ui.custom.RatingView;
import com.instabug.survey.p400ui.custom.RatingView.C10150b;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.survey.ui.c$g.b */
/* compiled from: StarRatingQuestionFragment */
public class C10133b extends C10107b implements C10150b {

    /* renamed from: V */
    private static transient /* synthetic */ boolean[] f26951V;

    /* renamed from: U */
    protected RatingView f26952U;

    public C10133b() {
        m47119h()[0] = true;
    }

    /* renamed from: a */
    public static C10133b m47116a(C10084b bVar, C10122e eVar) {
        boolean[] h = m47119h();
        Bundle bundle = new Bundle();
        h[19] = true;
        bundle.putSerializable("question", bVar);
        h[20] = true;
        C10133b bVar2 = new C10133b();
        h[21] = true;
        bVar2.setArguments(bundle);
        h[22] = true;
        bVar2.mo36267a(eVar);
        h[23] = true;
        return bVar2;
    }

    /* renamed from: b */
    private void m47117b(C10084b bVar) {
        boolean[] h = m47119h();
        this.f26881N.setText(bVar.mo36215d());
        h[15] = true;
        m47118c(bVar);
        h[16] = true;
    }

    /* renamed from: c */
    private void m47118c(C10084b bVar) {
        boolean[] h = m47119h();
        if (bVar.mo36218g() == null) {
            h[8] = true;
        } else if (bVar.mo36218g().isEmpty()) {
            h[9] = true;
        } else {
            h[10] = true;
            this.f26952U.mo36346a(Float.valueOf(bVar.mo36218g()).floatValue(), false);
            h[11] = true;
        }
        h[12] = true;
    }

    /* renamed from: h */
    private static /* synthetic */ boolean[] m47119h() {
        boolean[] zArr = f26951V;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(931336269174796624L, "com/instabug/survey/ui/survey/starrating/StarRatingQuestionFragment", 32);
        f26951V = a;
        return a;
    }

    /* renamed from: f */
    public String mo36269f() {
        boolean[] h = m47119h();
        StringBuilder sb = new StringBuilder();
        sb.append((int) this.f26952U.getRating());
        sb.append("");
        String sb2 = sb.toString();
        h[17] = true;
        return sb2;
    }

    /* access modifiers changed from: protected */
    public int getLayout() {
        boolean[] h = m47119h();
        int i = C10049R.layout.instabug_star_rating_question;
        h[18] = true;
        return i;
    }

    /* access modifiers changed from: protected */
    public void initViews(View view, Bundle bundle) {
        boolean[] h = m47119h();
        super.initViews(view, bundle);
        h[4] = true;
        this.f26881N = (TextView) view.findViewById(C10049R.C10053id.instabug_text_view_question);
        h[5] = true;
        this.f26952U = (RatingView) view.findViewById(C10049R.C10053id.ib_ratingbar);
        h[6] = true;
        this.f26952U.setOnRatingBarChangeListener(this);
        h[7] = true;
    }

    public void onCreate(Bundle bundle) {
        boolean[] h = m47119h();
        super.onCreate(bundle);
        h[1] = true;
        setRetainInstance(true);
        h[2] = true;
        this.f26887a = (C10084b) getArguments().getSerializable("question");
        h[3] = true;
    }

    public void onViewCreated(View view, @C0195i0 Bundle bundle) {
        boolean[] h = m47119h();
        super.onViewCreated(view, bundle);
        h[13] = true;
        m47117b(this.f26887a);
        h[14] = true;
    }

    /* renamed from: a */
    public void mo36310a(RatingView ratingView, float f, boolean z) {
        boolean[] h = m47119h();
        if (f >= 1.0f) {
            h[24] = true;
            C10084b bVar = this.f26887a;
            StringBuilder sb = new StringBuilder();
            sb.append((int) f);
            sb.append("");
            bVar.mo36214c(sb.toString());
            h[25] = true;
        } else {
            this.f26887a.mo36214c(null);
            h[26] = true;
        }
        C10122e eVar = this.f26888b;
        if (eVar == null) {
            h[27] = true;
        } else {
            h[28] = true;
            eVar.mo36276a(this.f26887a);
            h[29] = true;
        }
        h[30] = true;
    }
}
