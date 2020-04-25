package com.mrsool;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Handler;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.C1376c;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.C5665a;
import com.hsalf.smilerating.SmileRating;
import com.hsalf.smilerating.SmileRating.C9197e;
import com.jackandphantom.circularimageview.RoundedImage;
import com.mrsool.bean.Order;
import com.mrsool.bean.RatingReasonBean;
import com.mrsool.bean.RatingReasonMainBean;
import com.mrsool.bean.ServiceManualDataBean;
import com.mrsool.newBean.SubmitRatingBean;
import com.mrsool.newBean.WriteRatingReviewBean;
import com.mrsool.order.C11056p;
import com.mrsool.p423v.C11725f;
import com.mrsool.review.C11174a;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C5880q;
import com.mrsool.utils.C5881v;
import com.mrsool.utils.p421c.C11598a;
import com.mrsool.utils.webservice.C11687c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p053b.p072g.p073b.C2128a;
import p076c.p082c.p083a.C2232l;
import p076c.p082c.p083a.p108y.p109i.C2535c;
import p076c.p082c.p083a.p108y.p110j.C2557j;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* renamed from: com.mrsool.g */
/* compiled from: BaseRatingActivity */
public class C10797g extends C10787d implements C11056p {

    /* renamed from: S */
    public C5665a f29660S;

    /* renamed from: T */
    public C5665a f29661T;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public View f29662U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public View f29663V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public List<RatingReasonBean> f29664W = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: X */
    public C11174a f29665X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public RecyclerView f29666Y;
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public SmileRating f29667Z;
    /* access modifiers changed from: private */

    /* renamed from: a0 */
    public SmileRating f29668a0;

    /* renamed from: b0 */
    private EditText f29669b0;
    /* access modifiers changed from: private */

    /* renamed from: c0 */
    public boolean f29670c0;
    /* access modifiers changed from: private */

    /* renamed from: d0 */
    public boolean f29671d0;

    /* renamed from: e0 */
    public final String f29672e0 = "RateNReview";

    /* renamed from: f0 */
    public final String f29673f0 = "StoreRateNReview";

    /* renamed from: g0 */
    public final String f29674g0 = "AppRateNReview";

    /* renamed from: h0 */
    public SubmitRatingBean f29675h0;
    /* access modifiers changed from: private */

    /* renamed from: i0 */
    public NestedScrollView f29676i0;
    /* access modifiers changed from: private */

    /* renamed from: j0 */
    public NestedScrollView f29677j0;
    /* access modifiers changed from: private */

    /* renamed from: k0 */
    public EditText f29678k0;
    /* access modifiers changed from: private */

    /* renamed from: l0 */
    public String f29679l0;
    /* access modifiers changed from: private */

    /* renamed from: m0 */
    public int f29680m0;

    /* renamed from: n0 */
    private final int f29681n0;

    /* renamed from: o0 */
    public int f29682o0;
    /* access modifiers changed from: private */

    /* renamed from: p0 */
    public String f29683p0;

    /* renamed from: q0 */
    private boolean f29684q0;

    /* renamed from: com.mrsool.g$a */
    /* compiled from: BaseRatingActivity */
    class C10798a implements C9197e {

        /* renamed from: a */
        final /* synthetic */ Order f29685a;

        C10798a(Order order) {
            this.f29685a = order;
        }

        /* renamed from: a */
        public void mo33330a(int i, boolean z) {
            ((TextView) C10797g.this.f29662U.findViewById(C10232R.C10236id.tvDone)).setText(C10797g.this.getString(C10232R.string.lbl_done));
            ((TextView) C10797g.this.f29662U.findViewById(C10232R.C10236id.tvDone)).setBackgroundResource(C10232R.C10235drawable.selector_primary_button);
            ((TextView) C10797g.this.f29662U.findViewById(C10232R.C10236id.tvDone)).setEnabled(true);
            C10797g.this.m49587a(i, this.f29685a.getiOrderId());
        }
    }

    /* renamed from: com.mrsool.g$a0 */
    /* compiled from: BaseRatingActivity */
    class C10799a0 implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ boolean f29687a;

        C10799a0(boolean z) {
            this.f29687a = z;
        }

        public void onClick(View view) {
            C10797g.this.f29661T.dismiss();
            C10797g gVar = C10797g.this;
            gVar.f29661T = null;
            if (!this.f29687a) {
                gVar.mo36520O();
            }
        }
    }

    /* renamed from: com.mrsool.g$b */
    /* compiled from: BaseRatingActivity */
    class C10800b implements OnShowListener {

        /* renamed from: com.mrsool.g$b$a */
        /* compiled from: BaseRatingActivity */
        class C10801a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ DialogInterface f29690a;

            C10801a(DialogInterface dialogInterface) {
                this.f29690a = dialogInterface;
            }

            public void run() {
                BottomSheetBehavior.m24700c((FrameLayout) ((C5665a) this.f29690a).findViewById(C10232R.C10236id.design_bottom_sheet)).mo22474e(3);
                C10797g gVar = C10797g.this;
                gVar.m49588a(gVar.f29677j0);
            }
        }

        C10800b() {
        }

        public void onShow(DialogInterface dialogInterface) {
            new Handler().postDelayed(new C10801a(dialogInterface), 0);
        }
    }

    /* renamed from: com.mrsool.g$b0 */
    /* compiled from: BaseRatingActivity */
    class C10802b0 implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Order f29692a;

        C10802b0(Order order) {
            this.f29692a = order;
        }

        public void onClick(View view) {
            if (C10797g.this.f29667Z.getRating() == 1) {
                C10797g gVar = C10797g.this;
                Order order = this.f29692a;
                gVar.mo38435b(order, order.getiBuyerId().equals(C10797g.this.f29642a.mo23476G()));
                return;
            }
            C10797g gVar2 = C10797g.this;
            Order order2 = this.f29692a;
            gVar2.m49589a(order2, order2.getiBuyerId().equals(C10797g.this.f29642a.mo23476G()), C10797g.this.mo36519N());
        }
    }

    /* renamed from: com.mrsool.g$c */
    /* compiled from: BaseRatingActivity */
    class C10803c implements OnTouchListener {
        C10803c() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* renamed from: com.mrsool.g$d */
    /* compiled from: BaseRatingActivity */
    class C10804d implements OnClickListener {
        C10804d() {
        }

        public void onClick(View view) {
            C10797g gVar = C10797g.this;
            gVar.f29642a.mo23543a(gVar.f29663V);
        }
    }

    /* renamed from: com.mrsool.g$e */
    /* compiled from: BaseRatingActivity */
    class C10805e implements OnTouchListener {
        C10805e() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* renamed from: com.mrsool.g$f */
    /* compiled from: BaseRatingActivity */
    class C10806f implements C9197e {
        C10806f() {
        }

        /* renamed from: a */
        public void mo33330a(int i, boolean z) {
            C10797g gVar = C10797g.this;
            gVar.m49588a(gVar.f29676i0);
            if (!C10797g.this.f29671d0) {
                ((TextView) C10797g.this.f29663V.findViewById(C10232R.C10236id.tvDone)).setText(C10797g.this.getString(C10232R.string.lbl_done));
            }
            ((TextView) C10797g.this.f29663V.findViewById(C10232R.C10236id.tvDone)).setBackgroundResource(C10232R.C10235drawable.selector_primary_button);
            ((TextView) C10797g.this.f29663V.findViewById(C10232R.C10236id.tvDone)).setEnabled(true);
        }
    }

    /* renamed from: com.mrsool.g$g */
    /* compiled from: BaseRatingActivity */
    class C10807g extends C2557j<Bitmap> {
        C10807g() {
        }

        /* renamed from: a */
        public void mo9404a(Bitmap bitmap, C2535c<? super Bitmap> cVar) {
            if (!C10797g.this.isFinishing()) {
                ((RoundedImage) C10797g.this.f29663V.findViewById(C10232R.C10236id.ivShop)).setScaleType(ScaleType.CENTER_CROP);
                ((RoundedImage) C10797g.this.f29663V.findViewById(C10232R.C10236id.ivShop)).setImageBitmap(bitmap);
                C10797g.this.f29663V.findViewById(C10232R.C10236id.progressBar).setVisibility(8);
            }
        }
    }

    /* renamed from: com.mrsool.g$h */
    /* compiled from: BaseRatingActivity */
    class C10808h implements OnClickListener {
        C10808h() {
        }

        public void onClick(View view) {
            C10797g.this.f29660S.dismiss();
            C10797g gVar = C10797g.this;
            gVar.f29660S = null;
            if (!gVar.f29670c0) {
                C10797g.this.mo36520O();
            } else {
                C10797g.this.mo38429J();
            }
        }
    }

    /* renamed from: com.mrsool.g$i */
    /* compiled from: BaseRatingActivity */
    class C10809i implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ WriteRatingReviewBean f29700a;

        C10809i(WriteRatingReviewBean writeRatingReviewBean) {
            this.f29700a = writeRatingReviewBean;
        }

        public void onClick(View view) {
            C10797g.this.m49595a(this.f29700a);
        }
    }

    /* renamed from: com.mrsool.g$j */
    /* compiled from: BaseRatingActivity */
    class C10810j implements TextWatcher {
        C10810j() {
        }

        public void afterTextChanged(Editable editable) {
            C10797g.this.f29678k0.removeTextChangedListener(this);
            if (C10797g.this.f29678k0.getLineCount() > 7) {
                C10797g.this.f29678k0.setText(C10797g.this.f29679l0);
                C10797g.this.f29678k0.setSelection(C10797g.this.f29680m0);
            } else {
                C10797g gVar = C10797g.this;
                gVar.f29679l0 = gVar.f29678k0.getText().toString();
            }
            C10797g.this.f29678k0.addTextChangedListener(this);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C10797g gVar = C10797g.this;
            gVar.f29680m0 = gVar.f29678k0.getSelectionStart();
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            TextView textView = (TextView) C10797g.this.f29663V.findViewById(C10232R.C10236id.tvCount);
            StringBuilder sb = new StringBuilder();
            sb.append(((EditText) C10797g.this.f29663V.findViewById(C10232R.C10236id.etReview)).getText().toString().length());
            sb.append(" / 300");
            textView.setText(sb.toString());
        }
    }

    /* renamed from: com.mrsool.g$k */
    /* compiled from: BaseRatingActivity */
    class C10811k implements OnClickListener {
        C10811k() {
        }

        public void onClick(View view) {
            C10797g gVar = C10797g.this;
            gVar.f29642a.mo23543a(gVar.f29662U);
        }
    }

    /* renamed from: com.mrsool.g$l */
    /* compiled from: BaseRatingActivity */
    class C10812l implements OnShowListener {

        /* renamed from: com.mrsool.g$l$a */
        /* compiled from: BaseRatingActivity */
        class C10813a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ DialogInterface f29705a;

            C10813a(DialogInterface dialogInterface) {
                this.f29705a = dialogInterface;
            }

            public void run() {
                BottomSheetBehavior.m24700c((FrameLayout) ((C5665a) this.f29705a).findViewById(C10232R.C10236id.design_bottom_sheet)).mo22474e(3);
            }
        }

        C10812l() {
        }

        public void onShow(DialogInterface dialogInterface) {
            new Handler().postDelayed(new C10813a(dialogInterface), 0);
        }
    }

    /* renamed from: com.mrsool.g$m */
    /* compiled from: BaseRatingActivity */
    class C10814m implements Runnable {

        /* renamed from: a */
        final /* synthetic */ WriteRatingReviewBean f29707a;

        C10814m(WriteRatingReviewBean writeRatingReviewBean) {
            this.f29707a = writeRatingReviewBean;
        }

        public void run() {
            ((SmileRating) C10797g.this.f29663V.findViewById(C10232R.C10236id.smileRatingShop)).setSelectedSmile(((int) this.f29707a.getRating()) - 1);
        }
    }

    /* renamed from: com.mrsool.g$n */
    /* compiled from: BaseRatingActivity */
    class C10815n implements Runnable {

        /* renamed from: a */
        final /* synthetic */ NestedScrollView f29709a;

        /* renamed from: com.mrsool.g$n$a */
        /* compiled from: BaseRatingActivity */
        class C10816a implements Runnable {
            C10816a() {
            }

            public void run() {
                C10815n.this.f29709a.mo5288c(C13959t.f40839S1);
            }
        }

        C10815n(NestedScrollView nestedScrollView) {
            this.f29709a = nestedScrollView;
        }

        public void run() {
            this.f29709a.post(new C10816a());
        }
    }

    /* renamed from: com.mrsool.g$o */
    /* compiled from: BaseRatingActivity */
    class C10817o implements Runnable {
        C10817o() {
        }

        public void run() {
            if (!C10797g.this.f29675h0.isServiceReviewSubmitted()) {
                C10797g gVar = C10797g.this;
                gVar.mo38434a(gVar.f29675h0.getWriteRatingReviewBean(), false);
            } else if (!C10797g.this.f29670c0) {
                C10797g.this.mo36520O();
            } else if (C10797g.this.f29670c0) {
                C10797g.this.mo38429J();
            }
        }
    }

    /* renamed from: com.mrsool.g$p */
    /* compiled from: BaseRatingActivity */
    class C10818p implements Callback<RatingReasonMainBean> {

        /* renamed from: a */
        final /* synthetic */ int f29713a;

        C10818p(int i) {
            this.f29713a = i;
        }

        public void onFailure(Call<RatingReasonMainBean> call, Throwable th) {
            C10797g.this.f29642a.mo23653q0();
        }

        public void onResponse(Call<RatingReasonMainBean> call, Response<RatingReasonMainBean> response) {
            if (!response.isSuccessful()) {
                C10797g.this.mo36529l(response.message());
            } else if (((RatingReasonMainBean) response.body()).getCode().intValue() <= 300) {
                C10797g.this.f29664W.clear();
                C10797g.this.f29664W.addAll(((RatingReasonMainBean) response.body()).getReasons());
                String str = "";
                if (this.f29713a == 5) {
                    TextView textView = (TextView) C10797g.this.f29662U.findViewById(C10232R.C10236id.tvWhatNotWork);
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(C10797g.this.getResources().getString(C10232R.string.lbl_what_like_mostly));
                    textView.setText(sb.toString());
                } else {
                    TextView textView2 = (TextView) C10797g.this.f29662U.findViewById(C10232R.C10236id.tvWhatNotWork);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(C10797g.this.getResources().getString(C10232R.string.lbl_what_don_t_work));
                    textView2.setText(sb2.toString());
                }
                if (C10797g.this.f29664W.size() == 0) {
                    C10797g.this.f29662U.findViewById(C10232R.C10236id.tvWhatNotWork).setVisibility(8);
                    C10797g.this.f29666Y.setVisibility(8);
                    C10797g.this.f29662U.findViewById(C10232R.C10236id.tverror).setVisibility(8);
                } else {
                    C10797g.this.f29662U.findViewById(C10232R.C10236id.tvWhatNotWork).setVisibility(0);
                    C10797g.this.f29666Y.setVisibility(0);
                }
                C10797g.this.f29665X.mo7341e();
                String a = C10797g.this.f29642a.mo23528a(response.body());
                if (!TextUtils.isEmpty(a)) {
                    C10797g.this.f29642a.mo23551a(new ServiceManualDataBean(str, a));
                }
                C10797g.this.mo38430K();
            } else {
                C10797g.this.mo36529l(((RatingReasonMainBean) response.body()).getMessage());
            }
        }
    }

    /* renamed from: com.mrsool.g$q */
    /* compiled from: BaseRatingActivity */
    class C10819q implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Order f29716a;

        /* renamed from: b */
        final /* synthetic */ Dialog f29717b;

        C10819q(Order order, Dialog dialog) {
            this.f29716a = order;
            this.f29717b = dialog;
        }

        public void onClick(View view) {
            C10797g gVar = C10797g.this;
            Order order = this.f29716a;
            gVar.m49589a(order, order.getiBuyerId().equals(C10797g.this.f29642a.mo23476G()), C10797g.this.mo36519N());
            this.f29717b.dismiss();
        }
    }

    /* renamed from: com.mrsool.g$r */
    /* compiled from: BaseRatingActivity */
    class C10820r implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f29718a;

        C10820r(Dialog dialog) {
            this.f29718a = dialog;
        }

        public void onClick(View view) {
            this.f29718a.dismiss();
        }
    }

    /* renamed from: com.mrsool.g$s */
    /* compiled from: BaseRatingActivity */
    class C10821s implements Callback<SubmitRatingBean> {

        /* renamed from: a */
        final /* synthetic */ WriteRatingReviewBean f29720a;

        C10821s(WriteRatingReviewBean writeRatingReviewBean) {
            this.f29720a = writeRatingReviewBean;
        }

        public void onFailure(Call<SubmitRatingBean> call, Throwable th) {
            C10797g.this.f29642a.mo23653q0();
        }

        public void onResponse(Call<SubmitRatingBean> call, Response<SubmitRatingBean> response) {
            C10797g.this.f29642a.mo23492O();
            if (response.isSuccessful()) {
                C10797g.this.f29675h0 = (SubmitRatingBean) response.body();
                if (C10797g.this.f29675h0.getCode() <= 300) {
                    C10797g.this.f29675h0.setWriteRatingReviewBean(new WriteRatingReviewBean());
                    C10797g.this.f29675h0.getWriteRatingReviewBean().setRating((float) C10797g.this.f29668a0.getRating());
                    C10797g.this.f29675h0.getWriteRatingReviewBean().setReview(C10797g.this.f29678k0.getText().toString().trim());
                    C10797g.this.mo36528k(this.f29720a.getShopId());
                    String a = C10797g.this.f29642a.mo23528a(response.body());
                    C10797g gVar = C10797g.this;
                    gVar.f29642a.mo23491N(gVar.f29675h0.getMessage());
                    String str = "StoreRateNReview";
                    if (!TextUtils.isEmpty(a)) {
                        C10797g.this.f29642a.mo23551a(new ServiceManualDataBean(str, a));
                        C10797g gVar2 = C10797g.this;
                        gVar2.f29642a.mo23553a((C11056p) gVar2);
                        return;
                    }
                    C10797g.this.mo36511f(str);
                    return;
                }
                C10797g.this.f29642a.mo23615f(((SubmitRatingBean) response.body()).getMessage(), C10797g.this.getString(C10232R.string.app_name));
                return;
            }
            C10797g.this.f29642a.mo23615f(response.message(), C10797g.this.getString(C10232R.string.app_name));
        }
    }

    /* renamed from: com.mrsool.g$t */
    /* compiled from: BaseRatingActivity */
    class C10822t implements Callback<SubmitRatingBean> {

        /* renamed from: a */
        final /* synthetic */ Order f29722a;

        /* renamed from: b */
        final /* synthetic */ boolean f29723b;

        C10822t(Order order, boolean z) {
            this.f29722a = order;
            this.f29723b = z;
        }

        public void onFailure(Call<SubmitRatingBean> call, Throwable th) {
            C10797g.this.f29642a.mo23653q0();
        }

        public void onResponse(Call<SubmitRatingBean> call, Response<SubmitRatingBean> response) {
            C10797g.this.f29642a.mo23492O();
            if (response.isSuccessful()) {
                C10797g.this.f29642a.mo23494P();
                C10797g.this.f29675h0 = (SubmitRatingBean) response.body();
                if (C10797g.this.f29675h0.getCode() <= 300) {
                    C10797g gVar = C10797g.this;
                    StringBuilder sb = new StringBuilder();
                    String str = "";
                    sb.append(str);
                    sb.append(this.f29722a.getiOrderId());
                    gVar.f29683p0 = sb.toString();
                    C5881v C = C10797g.this.f29642a.mo23468C();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(this.f29722a.getiOrderId());
                    String sb3 = sb2.toString();
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(str);
                    sb4.append(C10797g.this.f29667Z.getRating());
                    C.mo23449a(sb3, sb4.toString());
                    C10797g.this.m49599c(this.f29722a, this.f29723b);
                    C10797g gVar2 = C10797g.this;
                    gVar2.f29642a.mo23491N(gVar2.f29675h0.getMessage());
                    String a = C10797g.this.f29642a.mo23528a(response.body());
                    String str2 = "RateNReview";
                    if (!TextUtils.isEmpty(a)) {
                        C10797g.this.f29642a.mo23551a(new ServiceManualDataBean(str2, a));
                        C10797g gVar3 = C10797g.this;
                        gVar3.f29642a.mo23553a((C11056p) gVar3);
                        return;
                    }
                    C10797g.this.mo36511f(str2);
                    return;
                }
                C10797g.this.f29642a.mo23615f(((SubmitRatingBean) response.body()).getMessage(), C10797g.this.getString(C10232R.string.app_name));
                return;
            }
            C10797g.this.f29642a.mo23615f(response.message(), C10797g.this.getString(C10232R.string.app_name));
        }
    }

    /* renamed from: com.mrsool.g$u */
    /* compiled from: BaseRatingActivity */
    class C10823u implements OnClickListener {
        C10823u() {
        }

        public void onClick(View view) {
            C10797g gVar = C10797g.this;
            gVar.f29642a.mo23543a(gVar.f29662U);
        }
    }

    /* renamed from: com.mrsool.g$v */
    /* compiled from: BaseRatingActivity */
    class C10824v extends GridLayoutManager {
        C10824v(Context context, int i) {
            super(context, i);
        }

        /* renamed from: b */
        public boolean mo6987b() {
            return false;
        }
    }

    /* renamed from: com.mrsool.g$w */
    /* compiled from: BaseRatingActivity */
    class C10825w extends C11725f {
        C10825w() {
        }

        /* renamed from: a */
        public void mo37847a(int i) {
            ((RatingReasonBean) C10797g.this.f29664W.get(i)).setSelected(Boolean.valueOf(!((RatingReasonBean) C10797g.this.f29664W.get(i)).getSelected()));
            C10797g.this.f29665X.mo7337d(i);
        }
    }

    /* renamed from: com.mrsool.g$x */
    /* compiled from: BaseRatingActivity */
    class C10826x implements OnTouchListener {
        C10826x() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* renamed from: com.mrsool.g$y */
    /* compiled from: BaseRatingActivity */
    class C10827y implements OnTouchListener {
        C10827y() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* renamed from: com.mrsool.g$z */
    /* compiled from: BaseRatingActivity */
    class C10828z implements OnTouchListener {
        C10828z() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    public C10797g() {
        String str = "";
        this.f29679l0 = str;
        this.f29680m0 = 0;
        this.f29681n0 = 7;
        this.f29682o0 = 4;
        this.f29683p0 = str;
        this.f29684q0 = false;
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public String mo36519N() {
        String str;
        String str2 = "";
        String str3 = str2;
        int i = 0;
        while (true) {
            str = ",";
            if (i >= this.f29664W.size()) {
                break;
            }
            if (((RatingReasonBean) this.f29664W.get(i)).getSelected()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Selected ID is :");
                sb.append(((RatingReasonBean) this.f29664W.get(i)).getid());
                C5880q.m25751b(sb.toString());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str3);
                sb2.append(str2);
                sb2.append(((RatingReasonBean) this.f29664W.get(i)).getid());
                sb2.append(str);
                str3 = sb2.toString();
            }
            i++;
        }
        if (str3.contains(str) && str3.lastIndexOf(str) == str3.length() - 1) {
            str3 = str3.substring(0, str3.length() - 1);
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("String is :");
        sb3.append(str3);
        C5880q.m25751b(sb3.toString());
        return str3;
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public void mo36520O() {
        Intent intent = new Intent(C11644i.f33410s4);
        try {
            intent.putExtra(C11644i.f33261b2, 0.0f);
        } catch (Exception unused) {
        }
        C2128a.m11089a((Context) this).mo9219a(intent);
    }

    /* renamed from: J */
    public void mo38429J() {
        if (mo38432M() && mo38437j(this.f29683p0)) {
            mo36511f("AppRateNReview");
        }
    }

    /* renamed from: K */
    public void mo38430K() {
        C5665a aVar = this.f29661T;
        if (aVar == null || !aVar.isShowing()) {
            C5665a aVar2 = this.f29660S;
            if (aVar2 != null && aVar2.isShowing()) {
                m49588a(this.f29676i0);
                return;
            }
            return;
        }
        m49588a(this.f29677j0);
    }

    /* renamed from: L */
    public void mo38431L() {
        try {
            if (this.f29660S != null) {
                this.f29660S.dismiss();
            }
            this.f29660S = null;
            if (!this.f29670c0) {
                mo36520O();
            } else if (this.f29670c0) {
                mo38429J();
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: M */
    public boolean mo38432M() {
        boolean a = this.f29642a.mo23468C().mo23450a(C11644i.f33167P5);
        this.f29642a.mo23468C().mo23450a(C11644i.f33175Q5);
        return !this.f29642a.mo23468C().mo23450a(C11644i.f33159O5) && !a;
    }

    /* renamed from: f */
    public void mo36511f(String str) {
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void mo36528k(String str) {
        if (!this.f29671d0) {
            boolean z = !this.f29678k0.getText().toString().trim().equals("");
            String str2 = str;
            C11598a.m52263f().mo39833c((double) this.f29668a0.getRating(), z, str2, this.f29683p0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public void mo36529l(String str) {
        TextView textView = (TextView) this.f29662U.findViewById(C10232R.C10236id.tverror);
        StringBuilder sb = new StringBuilder();
        sb.append("");
        if (TextUtils.isEmpty(str)) {
            str = "Error ! Please try Again";
        }
        sb.append(str);
        textView.setText(sb.toString());
    }

    /* renamed from: i */
    public void mo38436i(String str) {
        this.f29683p0 = str;
        try {
            if (this.f29661T != null) {
                this.f29661T.dismiss();
            }
            this.f29661T = null;
            new Handler().postDelayed(new C10817o(), 350);
        } catch (Exception unused) {
        }
    }

    /* renamed from: j */
    public boolean mo38437j(String str) {
        String str2 = "";
        try {
            C5881v C = this.f29642a.mo23468C();
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(str);
            if (TextUtils.isEmpty(C.mo23459f(sb.toString()))) {
                return false;
            }
            C5881v C2 = this.f29642a.mo23468C();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(str);
            return Double.valueOf(Double.parseDouble(C2.mo23459f(sb2.toString()))).doubleValue() >= ((double) this.f29682o0);
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m49599c(Order order, boolean z) {
        if (!this.f29671d0) {
            int rating = this.f29667Z.getRating();
            boolean z2 = !this.f29669b0.getText().toString().trim().equals("");
            String str = order.getiOrderId();
            String str2 = order.getvShopId();
            if (z) {
                C11598a.m52263f().mo39828b((double) rating, z2, str, str2);
            } else {
                C11598a.m52263f().mo39807a((double) rating, z2, str, str2);
            }
        }
    }

    /* renamed from: b */
    public void mo38435b(Order order, boolean z) {
        try {
            Dialog dialog = new Dialog(this, C10232R.style.AlertCustomerDialogStyle);
            dialog.setContentView(C10232R.layout.dialog_pos_neg_multi_line);
            dialog.setCancelable(true);
            TextView textView = (TextView) dialog.findViewById(C10232R.C10236id.txtdMessage);
            TextView textView2 = (TextView) dialog.findViewById(C10232R.C10236id.txtPositive);
            TextView textView3 = (TextView) dialog.findViewById(C10232R.C10236id.txtNegetive);
            ((TextView) dialog.findViewById(C10232R.C10236id.txtdTitle)).setText(getString(C10232R.string.app_name));
            if (z) {
                textView.setText(getString(C10232R.string.msg_low_rating_confirmation_buyer));
            } else {
                textView.setText(getString(C10232R.string.msg_low_rating_confirmation_Courier));
            }
            textView2.setText(getString(C10232R.string.msg_low_rating_confirmation_positive));
            textView3.setText(getString(C10232R.string.msg_low_rating_confirmation_negetive));
            textView2.setOnClickListener(new C10819q(order, dialog));
            textView3.setOnClickListener(new C10820r(dialog));
            if (!isFinishing()) {
                dialog.show();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo38433a(Order order, boolean z) {
        this.f29670c0 = z;
        if (this.f29661T == null) {
            this.f29662U = getLayoutInflater().inflate(C10232R.layout.bottom_sheet_courer_rating, null);
            this.f29642a.mo23553a((C11056p) this);
            this.f29667Z = (SmileRating) this.f29662U.findViewById(C10232R.C10236id.smileRating);
            this.f29642a.mo23496R();
            this.f29662U.findViewById(C10232R.C10236id.llOutSide).setOnClickListener(new C10811k());
            this.f29662U.findViewById(C10232R.C10236id.tvWhatNotWork).setOnClickListener(new C10823u());
            ((TextView) this.f29662U.findViewById(C10232R.C10236id.tvDone)).setText(getString(C10232R.string.lbl_choose_rating));
            if (!order.getiBuyerId().equals(this.f29642a.mo23476G())) {
                ((TextView) this.f29662U.findViewById(C10232R.C10236id.tvTitle)).setText(getString(C10232R.string.lbl_please_rate_your_experience));
            }
            C10824v vVar = new C10824v(this, 2);
            this.f29666Y = (RecyclerView) this.f29662U.findViewById(C10232R.C10236id.rvReasons);
            this.f29666Y.setLayoutManager(vVar);
            this.f29665X = new C11174a(this, this.f29664W, new C10825w());
            this.f29666Y.setAdapter(this.f29665X);
            this.f29669b0 = (EditText) this.f29662U.findViewById(C10232R.C10236id.etFeedback);
            this.f29677j0 = (NestedScrollView) this.f29662U.findViewById(C10232R.C10236id.nsvCourier);
            this.f29677j0.setOnTouchListener(new C10826x());
            this.f29662U.findViewById(C10232R.C10236id.llNSV).setOnTouchListener(new C10827y());
            this.f29662U.findViewById(C10232R.C10236id.rvReasons).setOnTouchListener(new C10828z());
            m49588a(this.f29677j0);
            try {
                C2232l.m11636a((C1376c) this).mo9515a(order.getiBuyerId().equals(this.f29642a.mo23476G()) ? order.getvCourierPic() : order.getvBuyerPic()).m11500e((int) C10232R.C10235drawable.user_profile).m11481b().mo9424a((ImageView) (RoundedImage) this.f29662U.findViewById(C10232R.C10236id.ivUser));
            } catch (Exception unused) {
            }
            ((RoundedImage) this.f29662U.findViewById(C10232R.C10236id.ivUser)).setRoundedRadius((int) getResources().getDimension(C10232R.dimen.dp_56));
            ((TextView) this.f29662U.findViewById(C10232R.C10236id.tvDone)).setBackgroundResource(C10232R.C10235drawable.bg_gray_button);
            ((TextView) this.f29662U.findViewById(C10232R.C10236id.tvDone)).setEnabled(false);
            this.f29662U.findViewById(C10232R.C10236id.tvSkip).setOnClickListener(new C10799a0(z));
            this.f29662U.findViewById(C10232R.C10236id.tvDone).setOnClickListener(new C10802b0(order));
            this.f29667Z.setOnRatingSelectedListener(new C10798a(order));
            this.f29642a.mo23631j();
            this.f29661T = new C5665a(this, C10232R.style.DialogStyle);
            this.f29661T.setOnShowListener(new C10800b());
            this.f29661T.setCancelable(false);
            this.f29661T.setContentView(this.f29662U);
            this.f29661T.getWindow().setSoftInputMode(19);
        }
        if (!isFinishing() && !this.f29661T.isShowing()) {
            this.f29661T.show();
        }
    }

    /* renamed from: a */
    public void mo38434a(WriteRatingReviewBean writeRatingReviewBean, boolean z) {
        this.f29671d0 = z;
        if (this.f29660S == null) {
            this.f29684q0 = true;
            this.f29663V = getLayoutInflater().inflate(C10232R.layout.bottom_sheet_service_rating, null);
            this.f29676i0 = (NestedScrollView) this.f29663V.findViewById(C10232R.C10236id.nsvAllShop);
            this.f29676i0.setOnTouchListener(new C10803c());
            this.f29663V.findViewById(C10232R.C10236id.llOutSide).setOnClickListener(new C10804d());
            this.f29663V.findViewById(C10232R.C10236id.llNSV).setOnTouchListener(new C10805e());
            if (!this.f29671d0) {
                ((TextView) this.f29663V.findViewById(C10232R.C10236id.tvDone)).setText(getString(C10232R.string.lbl_choose_rating));
            }
            this.f29678k0 = (EditText) this.f29663V.findViewById(C10232R.C10236id.etReview);
            ((TextView) this.f29663V.findViewById(C10232R.C10236id.tvDone)).setBackgroundResource(C10232R.C10235drawable.bg_gray_button);
            ((TextView) this.f29663V.findViewById(C10232R.C10236id.tvDone)).setEnabled(false);
            this.f29668a0 = (SmileRating) this.f29663V.findViewById(C10232R.C10236id.smileRatingShop);
            this.f29668a0.setOnRatingSelectedListener(new C10806f());
            ((TextView) this.f29663V.findViewById(C10232R.C10236id.tvTitle)).setText(writeRatingReviewBean.getTitle());
            ((RoundedImage) this.f29663V.findViewById(C10232R.C10236id.ivShop)).setRoundedRadius((int) getResources().getDimension(C10232R.dimen.dp_50));
            C2232l.m11636a((C1376c) this).mo9515a(writeRatingReviewBean.getShopPic()).mo9441j().m11415e((int) C10232R.C10235drawable.ic_image_placeholder).mo9458b(new C10807g());
            this.f29663V.findViewById(C10232R.C10236id.tvSkip).setOnClickListener(new C10808h());
            ((TextView) this.f29663V.findViewById(C10232R.C10236id.tvDone)).setOnClickListener(new C10809i(writeRatingReviewBean));
            this.f29678k0.addTextChangedListener(new C10810j());
            this.f29642a.mo23631j();
            this.f29660S = new C5665a(this, C10232R.style.DialogStyle);
            this.f29660S.setOnShowListener(new C10812l());
            this.f29660S.setCancelable(false);
            this.f29660S.setContentView(this.f29663V);
            this.f29660S.getWindow().setSoftInputMode(19);
            if (this.f29671d0) {
                ((TextView) this.f29663V.findViewById(C10232R.C10236id.tvDone)).setText(getString(C10232R.string.btn_update));
                this.f29678k0.setText(writeRatingReviewBean.getReview());
                this.f29678k0.setSelection(writeRatingReviewBean.getReview().length());
                this.f29678k0.clearFocus();
                if (!((TextView) this.f29663V.findViewById(C10232R.C10236id.tvDone)).isEnabled()) {
                    ((TextView) this.f29663V.findViewById(C10232R.C10236id.tvDone)).setBackgroundResource(C10232R.C10235drawable.selector_primary_button);
                    ((TextView) this.f29663V.findViewById(C10232R.C10236id.tvDone)).setEnabled(true);
                }
            }
        }
        if (!isFinishing() && !this.f29660S.isShowing()) {
            this.f29660S.show();
        }
        if (this.f29671d0) {
            new Handler().postDelayed(new C10814m(writeRatingReviewBean), 200);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m49588a(NestedScrollView nestedScrollView) {
        try {
            new Handler().postDelayed(new C10815n(nestedScrollView), 200);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m49587a(int i, String str) {
        if (this.f29642a.mo23502X()) {
            this.f29662U.findViewById(C10232R.C10236id.tverror).setVisibility(8);
            HashMap hashMap = new HashMap();
            hashMap.put("current_user_id", this.f29642a.mo23476G());
            hashMap.put("auth_token", this.f29642a.mo23468C().mo23459f(C11644i.f33443w5));
            StringBuilder sb = new StringBuilder();
            String str2 = "";
            sb.append(str2);
            sb.append(str);
            hashMap.put("order_id", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(i);
            hashMap.put("rating", sb2.toString());
            C11687c.m52645a(this.f29642a).ratingReason(hashMap).enqueue(new C10818p(i));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m49595a(WriteRatingReviewBean writeRatingReviewBean) {
        if (this.f29642a.mo23502X()) {
            this.f29642a.mo23619g(getResources().getString(C10232R.string.lbl_dg_loader_loading), getResources().getString(C10232R.string.app_name));
            HashMap hashMap = new HashMap();
            StringBuilder sb = new StringBuilder();
            String str = "";
            sb.append(str);
            sb.append(this.f29668a0.getRating());
            hashMap.put("rating", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(this.f29678k0.getText().toString().trim());
            hashMap.put(C11687c.f33827q1, sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Param : ");
            sb3.append(hashMap);
            C5880q.m25751b(sb3.toString());
            C11687c.m52645a(this.f29642a).RateNReviewShop(writeRatingReviewBean.getShopId(), hashMap).enqueue(new C10821s(writeRatingReviewBean));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m49589a(Order order, boolean z, String str) {
        if (this.f29642a.mo23502X()) {
            this.f29642a.mo23619g(getResources().getString(C10232R.string.lbl_dg_loader_loading), getResources().getString(C10232R.string.app_name));
            HashMap hashMap = new HashMap();
            StringBuilder sb = new StringBuilder();
            String str2 = "";
            sb.append(str2);
            sb.append(z ? order.getiBuyerId() : order.getiCourierId());
            hashMap.put("iRaterId", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(z ? order.getiCourierId() : order.getiBuyerId());
            hashMap.put("iRatedId", sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str2);
            sb3.append(this.f29667Z.getRating());
            hashMap.put("fRating", sb3.toString());
            hashMap.put("txReview", this.f29669b0.getText().toString().trim());
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str2);
            sb4.append(order.getiOrderId());
            hashMap.put("iOrderId", sb4.toString());
            StringBuilder sb5 = new StringBuilder();
            sb5.append(str2);
            sb5.append(str);
            hashMap.put("rating_reason_ids", sb5.toString());
            StringBuilder sb6 = new StringBuilder();
            sb6.append("Param : ");
            sb6.append(hashMap);
            C5880q.m25751b(sb6.toString());
            C11687c.m52645a(this.f29642a).RateNReviewNew(hashMap).enqueue(new C10822t(order, z));
        }
    }
}
