package com.mrsool.order;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Paint;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.drawable.C0894c;
import androidx.core.graphics.drawable.C0895d;
import androidx.recyclerview.widget.RecyclerView.C1635d0;
import androidx.recyclerview.widget.RecyclerView.C1638g;
import com.fasterxml.jackson.core.p162w.C3868i;
import com.mrsool.C10232R;
import com.mrsool.bean.ChangeCourierBean;
import com.mrsool.bean.PaymentListBean;
import com.mrsool.chat.ViewPhotoFullActivity;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C5887x;
import java.util.ArrayList;
import java.util.List;
import p076c.p082c.p083a.C2232l;
import p076c.p082c.p083a.p108y.p110j.C2550c;

/* renamed from: com.mrsool.order.d */
/* compiled from: ChangeCouriersAdapter */
public class C10983d extends C1638g<C10989f> {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Context f30314c;

    /* renamed from: d */
    private List<ChangeCourierBean> f30315d = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C5887x f30316e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C10988e f30317f;

    /* renamed from: g */
    private String f30318g;

    /* renamed from: com.mrsool.order.d$a */
    /* compiled from: ChangeCouriersAdapter */
    class C10984a extends C2550c {

        /* renamed from: R */
        final /* synthetic */ C10989f f30319R;

        C10984a(ImageView imageView, C10989f fVar) {
            this.f30319R = fVar;
            super(imageView);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10023a(Bitmap bitmap) {
            try {
                this.f30319R.f30328A0.setScaleType(ScaleType.CENTER_CROP);
                Resources resources = C10983d.this.f30314c.getResources();
                C10983d.this.f30316e;
                C0894c a = C0895d.m5185a(resources, C5887x.m25815e(bitmap));
                a.mo4601b(true);
                this.f30319R.f30328A0.setImageDrawable(a);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.mrsool.order.d$b */
    /* compiled from: ChangeCouriersAdapter */
    class C10985b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ int f30321a;

        C10985b(int i) {
            this.f30321a = i;
        }

        public void onClick(View view) {
            C10983d.this.f30317f.mo38736a(this.f30321a);
        }
    }

    /* renamed from: com.mrsool.order.d$c */
    /* compiled from: ChangeCouriersAdapter */
    class C10986c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ChangeCourierBean f30323a;

        C10986c(ChangeCourierBean changeCourierBean) {
            this.f30323a = changeCourierBean;
        }

        public void onClick(View view) {
            Intent intent = new Intent(C10983d.this.f30314c, ViewPhotoFullActivity.class);
            intent.putExtra(C11644i.f33463z1, this.f30323a.getCourier_pic());
            C10983d.this.f30314c.startActivity(intent);
        }
    }

    /* renamed from: com.mrsool.order.d$d */
    /* compiled from: ChangeCouriersAdapter */
    class C10987d implements OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ TextView f30326a;

        /* renamed from: b */
        final /* synthetic */ int f30327b;

        C10987d(TextView textView, int i) {
            this.f30326a = textView;
            this.f30327b = i;
        }

        public void onGlobalLayout() {
            float f;
            float f2;
            this.f30326a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            Paint paint = new Paint(this.f30326a.getPaint());
            if (this.f30326a.getText().toString().isEmpty()) {
                f = paint.measureText(this.f30326a.getHint().toString());
            } else {
                f = paint.measureText(this.f30326a.getText().toString());
            }
            float width = (float) this.f30326a.getWidth();
            int maxLines = this.f30326a.getMaxLines();
            while (width > 0.0f && f / ((float) maxLines) > width - ((float) this.f30326a.getCompoundDrawablePadding())) {
                float textSize = paint.getTextSize();
                paint.setTextSize(textSize - 1.0f);
                if (this.f30326a.getText().toString().isEmpty()) {
                    f2 = paint.measureText(this.f30326a.getHint().toString());
                } else {
                    f2 = paint.measureText(this.f30326a.getText().toString());
                }
                if (textSize < TypedValue.applyDimension(2, (float) this.f30327b, this.f30326a.getContext().getResources().getDisplayMetrics())) {
                    break;
                }
                f = f2;
            }
            this.f30326a.setTextSize(0, paint.getTextSize());
        }
    }

    /* renamed from: com.mrsool.order.d$e */
    /* compiled from: ChangeCouriersAdapter */
    public interface C10988e {
        /* renamed from: a */
        void mo38736a(int i);
    }

    /* renamed from: com.mrsool.order.d$f */
    /* compiled from: ChangeCouriersAdapter */
    public static class C10989f extends C1635d0 {

        /* renamed from: A0 */
        ImageView f30328A0;

        /* renamed from: B0 */
        RatingBar f30329B0;

        /* renamed from: C0 */
        FrameLayout f30330C0;

        /* renamed from: D0 */
        CardView f30331D0;

        /* renamed from: E0 */
        LinearLayout f30332E0;

        /* renamed from: s0 */
        TextView f30333s0;

        /* renamed from: t0 */
        TextView f30334t0;

        /* renamed from: u0 */
        TextView f30335u0;

        /* renamed from: v0 */
        TextView f30336v0;

        /* renamed from: w0 */
        TextView f30337w0;

        /* renamed from: x0 */
        TextView f30338x0;

        /* renamed from: y0 */
        TextView f30339y0;

        /* renamed from: z0 */
        TextView f30340z0;

        public C10989f(View view) {
            super(view);
            this.f30333s0 = (TextView) view.findViewById(C10232R.C10236id.tvUserName);
            this.f30334t0 = (TextView) view.findViewById(C10232R.C10236id.txtDiscountCost);
            this.f30335u0 = (TextView) view.findViewById(C10232R.C10236id.txtCost);
            this.f30336v0 = (TextView) view.findViewById(C10232R.C10236id.txtAccept);
            this.f30337w0 = (TextView) view.findViewById(C10232R.C10236id.txtDistance);
            this.f30328A0 = (ImageView) view.findViewById(C10232R.C10236id.ivCourier);
            this.f30329B0 = (RatingBar) view.findViewById(C10232R.C10236id.rating1);
            this.f30338x0 = (TextView) view.findViewById(C10232R.C10236id.txtRating);
            this.f30339y0 = (TextView) view.findViewById(C10232R.C10236id.txtDeliveryTime);
            this.f30332E0 = (LinearLayout) view.findViewById(C10232R.C10236id.llselectedPayments);
            this.f30330C0 = (FrameLayout) view.findViewById(C10232R.C10236id.flBestOffer);
            this.f30331D0 = (CardView) view.findViewById(C10232R.C10236id.cvBestOffer);
            this.f30340z0 = (TextView) view.findViewById(C10232R.C10236id.tvBestOffer);
        }
    }

    public C10983d(List<ChangeCourierBean> list, Context context, C5887x xVar, String str) {
        this.f30314c = context;
        this.f30315d = list;
        this.f30316e = xVar;
        this.f30318g = str;
    }

    /* renamed from: a */
    public void mo38744a(C10988e eVar) {
        this.f30317f = eVar;
    }

    /* renamed from: a */
    public void mo7330b(C10989f fVar, int i) {
        ChangeCourierBean changeCourierBean = (ChangeCourierBean) this.f30315d.get(i);
        fVar.f30333s0.setText(!TextUtils.isEmpty(changeCourierBean.getCourier_name()) ? changeCourierBean.getCourier_name() : "-");
        if (!TextUtils.isEmpty(changeCourierBean.getOfferTypeLabel())) {
            fVar.f30330C0.setVisibility(0);
            fVar.f30340z0.setText(changeCourierBean.getOfferTypeLabel());
            if (!TextUtils.isEmpty(changeCourierBean.getOfferTypeLabelColor())) {
                fVar.f30331D0.setCardBackgroundColor(Color.parseColor(changeCourierBean.getOfferTypeLabelColor()));
            }
        } else {
            fVar.f30330C0.setVisibility(4);
        }
        fVar.f30335u0.setVisibility(changeCourierBean.getOffer_cost() == changeCourierBean.getDiscountCost() ? 8 : 0);
        TextView textView = fVar.f30335u0;
        StringBuilder sb = new StringBuilder();
        sb.append(changeCourierBean.getOffer_cost());
        String str = C3868i.f12248b;
        sb.append(str);
        sb.append(this.f30318g);
        textView.setText(sb.toString());
        TextView textView2 = fVar.f30335u0;
        textView2.setPaintFlags(textView2.getPaintFlags() | 16);
        m50076a(fVar.f30335u0, 8);
        m50076a(fVar.f30334t0, 12);
        TextView textView3 = fVar.f30334t0;
        StringBuilder sb2 = new StringBuilder();
        String str2 = "";
        sb2.append(str2);
        sb2.append(changeCourierBean.getDiscountCost());
        sb2.append(str);
        sb2.append(this.f30318g);
        textView3.setText(sb2.toString());
        RatingBar ratingBar = fVar.f30329B0;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str2);
        sb3.append(changeCourierBean.getCourier_rating());
        ratingBar.setRating(Float.parseFloat(sb3.toString()));
        fVar.f30337w0.setText(String.format(this.f30314c.getResources().getString(C10232R.string.lbl_distance_km), new Object[]{String.format("%.2f", new Object[]{changeCourierBean.getDistance()})}));
        fVar.f30339y0.setText(changeCourierBean.getTime_to_arrive());
        try {
            if (changeCourierBean.getCourier_order_count() != null) {
                TextView textView4 = fVar.f30338x0;
                StringBuilder sb4 = new StringBuilder();
                sb4.append(changeCourierBean.getCourier_order_count());
                sb4.append(str2);
                textView4.setText(sb4.toString());
                fVar.f30338x0.setVisibility(0);
            } else {
                fVar.f30338x0.setVisibility(8);
            }
        } catch (Exception unused) {
            TextView textView5 = fVar.f30338x0;
            if (textView5 != null) {
                textView5.setVisibility(8);
            }
        }
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.setMargins(0, 0, 30, 0);
        for (int i2 = 0; i2 < changeCourierBean.getPaymentOptions().size(); i2++) {
            ImageView imageView = new ImageView(this.f30314c);
            imageView.setLayoutParams(layoutParams);
            C2232l.m11649c(this.f30314c).mo9515a(((PaymentListBean) changeCourierBean.getPaymentOptions().get(i2)).getPaymentIconUrl()).m11498d(100, 35).mo9424a(imageView);
            fVar.f30332E0.addView(imageView);
        }
        C2232l.m11649c(this.f30314c.getApplicationContext()).mo9515a(changeCourierBean.getCourier_pic()).mo9441j().m11415e((int) C10232R.C10235drawable.user_profile).m11411d().mo9458b(new C10984a(fVar.f30328A0, fVar));
        fVar.f30336v0.setOnClickListener(new C10985b(i));
        fVar.f30328A0.setOnClickListener(new C10986c(changeCourierBean));
    }

    /* renamed from: b */
    public C10989f m50083b(ViewGroup viewGroup, int i) {
        return new C10989f(LayoutInflater.from(viewGroup.getContext()).inflate(C10232R.layout.row_change_courier, viewGroup, false));
    }

    /* renamed from: b */
    public int mo7325b() {
        List<ChangeCourierBean> list = this.f30315d;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* renamed from: a */
    private void m50076a(TextView textView, int i) {
        textView.getViewTreeObserver().addOnGlobalLayoutListener(new C10987d(textView, i));
    }
}
