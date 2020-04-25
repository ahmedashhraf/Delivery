package com.mrsool;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.core.content.C0841b;
import com.fasterxml.jackson.core.p162w.C3868i;
import com.google.android.material.bottomsheet.C5665a;
import com.mrsool.bean.ChatInitModel;
import com.mrsool.bean.ServiceManualDataBean;
import com.mrsool.bean.ServiceManualDefaultBean;
import com.mrsool.order.C11056p;
import com.mrsool.utils.AppSingleton;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C11669t;
import com.mrsool.utils.C11669t.C11673d;
import com.mrsool.utils.C5887x;
import com.mrsool.utils.TakeImages;
import com.mrsool.utils.p421c.C11598a;
import com.mrsool.utils.webservice.C11687c;
import java.io.File;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Locale;
import org.jivesoftware.smackx.xhtmlim.XHTMLText;
import p076c.p082c.p083a.C2232l;
import p076c.p082c.p083a.p108y.p110j.C2550c;
import p468g.C13817d0;
import p468g.C13872x;
import p468g.C13873y.C13875b;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CreateBillActivity extends C10787d implements OnClickListener, C11056p {

    /* renamed from: A0 */
    private ImageView f27204A0;

    /* renamed from: B0 */
    private ImageView f27205B0;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public TextView f27206S;

    /* renamed from: T */
    private TextView f27207T;

    /* renamed from: U */
    private TextView f27208U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public TextView f27209V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public TextView f27210W;

    /* renamed from: X */
    private TextView f27211X;

    /* renamed from: Y */
    private AppSingleton f27212Y;

    /* renamed from: Z */
    private String f27213Z;
    /* access modifiers changed from: private */

    /* renamed from: a0 */
    public String f27214a0;

    /* renamed from: b0 */
    private String f27215b0;

    /* renamed from: c0 */
    private String f27216c0;

    /* renamed from: d0 */
    private String f27217d0;

    /* renamed from: e0 */
    private String f27218e0;
    /* access modifiers changed from: private */

    /* renamed from: f0 */
    public double f27219f0;
    /* access modifiers changed from: private */

    /* renamed from: g0 */
    public double f27220g0;
    /* access modifiers changed from: private */

    /* renamed from: h0 */
    public double f27221h0;

    /* renamed from: i0 */
    private boolean f27222i0 = true;
    /* access modifiers changed from: private */

    /* renamed from: j0 */
    public ProgressBar f27223j0;

    /* renamed from: k0 */
    private C11669t f27224k0;

    /* renamed from: l0 */
    private RelativeLayout f27225l0;
    /* access modifiers changed from: private */

    /* renamed from: m0 */
    public RelativeLayout f27226m0;

    /* renamed from: n0 */
    private LinearLayout f27227n0;
    /* access modifiers changed from: private */

    /* renamed from: o0 */
    public ImageView f27228o0;

    /* renamed from: p0 */
    private ImageView f27229p0;

    /* renamed from: q0 */
    private ImageView f27230q0;

    /* renamed from: r0 */
    private Space f27231r0;

    /* renamed from: s0 */
    private String f27232s0;

    /* renamed from: t0 */
    private TextView f27233t0;

    /* renamed from: u0 */
    private TextView f27234u0;

    /* renamed from: v0 */
    private TextView f27235v0;

    /* renamed from: w0 */
    private LinearLayout f27236w0;
    /* access modifiers changed from: private */

    /* renamed from: x0 */
    public ChatInitModel f27237x0;

    /* renamed from: y0 */
    private Bundle f27238y0;
    /* access modifiers changed from: private */

    /* renamed from: z0 */
    public ServiceManualDefaultBean f27239z0;

    /* renamed from: com.mrsool.CreateBillActivity$a */
    class C10189a extends C2550c {
        C10189a(ImageView imageView) {
            super(imageView);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10023a(Bitmap bitmap) {
            CreateBillActivity.this.f27226m0.setEnabled(true);
            CreateBillActivity.this.f27223j0.setVisibility(8);
            CreateBillActivity.this.f27228o0.setScaleType(ScaleType.CENTER_CROP);
            CreateBillActivity.this.f27228o0.setImageBitmap(bitmap);
        }
    }

    /* renamed from: com.mrsool.CreateBillActivity$b */
    class C10190b implements C11673d {
        C10190b() {
        }

        /* renamed from: a */
        public void mo36513a() {
        }

        /* renamed from: b */
        public void mo36514b() {
            Intent intent = new Intent(CreateBillActivity.this, TakeImages.class);
            intent.putExtra("PicType", CreateBillActivity.this.getString(C10232R.string.lbl_dg_title_both));
            CreateBillActivity.this.startActivityForResult(intent, C11644i.f33390q0);
        }
    }

    /* renamed from: com.mrsool.CreateBillActivity$c */
    class C10191c implements TextWatcher {
        C10191c() {
        }

        public void afterTextChanged(Editable editable) {
            if (editable != null) {
                try {
                    if (editable.toString().equals(".")) {
                        CreateBillActivity.this.f27206S.setText("0.");
                        Selection.setSelection((Editable) CreateBillActivity.this.f27206S.getText(), CreateBillActivity.this.f27206S.getText().toString().length());
                        return;
                    }
                    TextView k = CreateBillActivity.this.f27209V;
                    StringBuilder sb = new StringBuilder();
                    sb.append(CreateBillActivity.this.m47395M());
                    sb.append(C3868i.f12248b);
                    sb.append(CreateBillActivity.this.f27237x0.getOrder().getCurrency());
                    k.setText(sb.toString());
                    String str = "";
                    if (!TextUtils.isEmpty(editable)) {
                        if (CreateBillActivity.this.f27219f0 == CreateBillActivity.this.f27220g0) {
                            CreateBillActivity.this.f27221h0 = Double.parseDouble(editable.toString().trim()) + CreateBillActivity.this.f27219f0;
                            Math.round(CreateBillActivity.this.f27221h0);
                            TextView d = CreateBillActivity.this.f27210W;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(str);
                            sb2.append(CreateBillActivity.this.m47396N());
                            d.setText(sb2.toString());
                        } else {
                            CreateBillActivity.this.f27221h0 = Double.parseDouble(editable.toString().trim()) + CreateBillActivity.this.f27220g0;
                            Math.round(CreateBillActivity.this.f27221h0);
                            TextView d2 = CreateBillActivity.this.f27210W;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(str);
                            sb3.append(CreateBillActivity.this.m47396N());
                            d2.setText(sb3.toString());
                        }
                    } else if (CreateBillActivity.this.f27219f0 == CreateBillActivity.this.f27220g0) {
                        TextView d3 = CreateBillActivity.this.f27210W;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(str);
                        sb4.append(CreateBillActivity.this.m47396N());
                        d3.setText(sb4.toString());
                    } else {
                        TextView d4 = CreateBillActivity.this.f27210W;
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(str);
                        sb5.append(CreateBillActivity.this.m47396N());
                        d4.setText(sb5.toString());
                    }
                } catch (Exception unused) {
                }
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.mrsool.CreateBillActivity$d */
    class C10192d implements Callback<ServiceManualDefaultBean> {
        C10192d() {
        }

        public void onFailure(Call<ServiceManualDefaultBean> call, Throwable th) {
            try {
                if (CreateBillActivity.this.f29642a != null) {
                    CreateBillActivity.this.f29642a.mo23492O();
                    CreateBillActivity.this.f29642a.mo23615f(CreateBillActivity.this.getString(C10232R.string.msg_error_server_issue), CreateBillActivity.this.getString(C10232R.string.app_name));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void onResponse(Call<ServiceManualDefaultBean> call, Response<ServiceManualDefaultBean> response) {
            try {
                if (CreateBillActivity.this.f29642a != null) {
                    CreateBillActivity.this.f29642a.mo23492O();
                    if (response.isSuccessful()) {
                        CreateBillActivity.this.f27239z0 = (ServiceManualDefaultBean) response.body();
                        if (((ServiceManualDefaultBean) response.body()).getCode().intValue() <= 300) {
                            String a = CreateBillActivity.this.f29642a.mo23528a(response.body());
                            if (!TextUtils.isEmpty(a)) {
                                CreateBillActivity.this.f29642a.mo23551a(new ServiceManualDataBean("from issue bill", a));
                            } else {
                                CreateBillActivity.this.m47409a(CreateBillActivity.this.f27239z0);
                            }
                            C11598a.m52263f().mo39803a(CreateBillActivity.this.f27220g0, Double.parseDouble(CreateBillActivity.this.f27206S.getText().toString().trim()), CreateBillActivity.this.f27214a0, CreateBillActivity.this.f27237x0.getOrder().getvShopId(), CreateBillActivity.this.f27221h0);
                        } else if (CreateBillActivity.this.f27239z0.getCode().intValue() == 402) {
                            CreateBillActivity.this.f29642a.mo23609d0();
                        } else {
                            CreateBillActivity.this.f29642a.mo23615f(CreateBillActivity.this.f27239z0.getMessage() != null ? CreateBillActivity.this.f27239z0.getMessage() : CreateBillActivity.this.f27239z0.getMessages(), CreateBillActivity.this.getString(C10232R.string.app_name));
                        }
                    } else {
                        CreateBillActivity.this.f29642a.mo23615f(response.message(), CreateBillActivity.this.getString(C10232R.string.app_name));
                    }
                }
            } catch (Exception e) {
                CreateBillActivity.this.f29642a.mo23492O();
                e.printStackTrace();
            }
        }
    }

    /* renamed from: J */
    private void m47392J() {
        this.f27224k0.mo40036a(C11644i.f33330j, (C11673d) new C10190b());
    }

    /* renamed from: K */
    private void m47393K() {
        String str = "dbOrderCost";
        if (m47394L()) {
            C5887x xVar = this.f29642a;
            if (xVar != null) {
                xVar.mo23619g(getString(C10232R.string.app_name), getString(C10232R.string.lbl_dg_loader_loading));
            }
            HashMap hashMap = new HashMap();
            hashMap.put("iOrderId", this.f29642a.mo23622h(String.valueOf(this.f27214a0)));
            hashMap.put("iBuyerId", this.f29642a.mo23622h(String.valueOf(this.f27215b0)));
            hashMap.put("iCourierId", this.f29642a.mo23622h(String.valueOf(this.f27216c0)));
            try {
                hashMap.put(str, this.f29642a.mo23622h(m47407a(Double.parseDouble(this.f27206S.getText().toString().trim()))));
            } catch (Exception unused) {
                hashMap.put(str, this.f29642a.mo23622h(this.f27206S.getText().toString().trim()));
            }
            double d = this.f27219f0;
            double d2 = this.f27220g0;
            String str2 = "dbDeliveryCost";
            if (d == d2) {
                hashMap.put(str2, this.f29642a.mo23622h(String.valueOf(d)));
            } else {
                hashMap.put(str2, this.f29642a.mo23622h(String.valueOf(d2)));
            }
            hashMap.put("dbTotalCost", this.f29642a.mo23622h(String.valueOf(this.f27221h0)));
            C5887x xVar2 = this.f29642a;
            StringBuilder sb = new StringBuilder();
            String str3 = "";
            sb.append(str3);
            sb.append(this.f29642a.mo23648p().latitude);
            hashMap.put("clatitude", xVar2.mo23622h(sb.toString()));
            C5887x xVar3 = this.f29642a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str3);
            sb2.append(this.f29642a.mo23648p().longitude);
            hashMap.put("clongitude", xVar3.mo23622h(sb2.toString()));
            C13875b bVar = null;
            try {
                if (this.f29642a.mo23488M() != null) {
                    bVar = C13875b.m59383a("image", new File(this.f29642a.mo23488M()).getName(), C13817d0.create(C13872x.m59361b("image/jpeg"), this.f29642a.mo23486L()));
                }
            } catch (Exception unused2) {
            }
            C11687c.m52645a(this.f29642a).issueBill(String.valueOf(this.f27213Z), hashMap, bVar).enqueue(new C10192d());
        }
    }

    /* renamed from: L */
    private boolean m47394L() {
        if (TextUtils.isEmpty(this.f27206S.getText().toString().trim())) {
            this.f29642a.mo23615f(getString(C10232R.string.alert_enter_cost_goods), getResources().getString(C10232R.string.app_name));
            return false;
        } else if (!this.f27222i0 || !TextUtils.isEmpty(this.f27232s0)) {
            return true;
        } else {
            this.f29642a.mo23615f(getString(C10232R.string.alert_attach_bil_pic), getResources().getString(C10232R.string.app_name));
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public String m47395M() {
        double parseDouble = TextUtils.isEmpty(this.f27206S.getText().toString().trim()) ? 0.0d : Double.parseDouble(this.f27206S.getText().toString().trim());
        DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getNumberInstance(Locale.US);
        decimalFormat.applyPattern("#.##");
        try {
            return decimalFormat.format(parseDouble);
        } catch (Exception e) {
            e.printStackTrace();
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(parseDouble);
            return sb.toString();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public String m47396N() {
        double parseDouble = this.f27220g0 + (TextUtils.isEmpty(this.f27206S.getText().toString().trim()) ? 0.0d : Double.parseDouble(this.f27206S.getText().toString().trim()));
        DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getNumberInstance(Locale.US);
        decimalFormat.applyPattern("#.##");
        try {
            return decimalFormat.format(parseDouble);
        } catch (Exception e) {
            e.printStackTrace();
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(parseDouble);
            return sb.toString();
        }
    }

    /* renamed from: O */
    private void m47397O() {
        m47398P();
        this.f27206S = (TextView) findViewById(C10232R.C10236id.edtCostOfGood);
        this.f27207T = (TextView) findViewById(C10232R.C10236id.txtDiscountCost);
        this.f27209V = (TextView) findViewById(C10232R.C10236id.txtCostOfProduct);
        this.f27208U = (TextView) findViewById(C10232R.C10236id.txtDeliveryCost);
        this.f27210W = (TextView) findViewById(C10232R.C10236id.txtTotalCost);
        this.f27211X = (TextView) findViewById(C10232R.C10236id.txtSlash);
        this.f27223j0 = (ProgressBar) findViewById(C10232R.C10236id.pgBillImage);
        this.f27235v0 = (TextView) findViewById(C10232R.C10236id.txtSAR);
        this.f27228o0 = (ImageView) findViewById(C10232R.C10236id.imgAttachment1);
        this.f27229p0 = (ImageView) findViewById(C10232R.C10236id.imgPlus1);
        this.f27227n0 = (LinearLayout) findViewById(C10232R.C10236id.llAddMore);
        this.f27226m0 = (RelativeLayout) findViewById(C10232R.C10236id.rlAttachment1);
        this.f27226m0.setOnClickListener(this);
        this.f27230q0 = (ImageView) findViewById(C10232R.C10236id.ivRemove);
        this.f27230q0.setOnClickListener(this);
        this.f27231r0 = (Space) findViewById(C10232R.C10236id.spacer);
        this.f27225l0 = (RelativeLayout) findViewById(C10232R.C10236id.rvInfo);
        this.f27233t0 = (TextView) findViewById(C10232R.C10236id.tvWhyDifferent);
        this.f27236w0 = (LinearLayout) findViewById(C10232R.C10236id.llInfoButton);
        this.f27236w0.setOnClickListener(this);
        this.f27234u0 = (TextView) findViewById(C10232R.C10236id.tvLblDeliveryCost);
        m47399Q();
        this.f27238y0 = getIntent().getExtras();
        Bundle bundle = this.f27238y0;
        if (bundle != null && bundle.containsKey(C11644i.f33297f2)) {
            this.f27237x0 = (ChatInitModel) this.f27238y0.getSerializable(C11644i.f33297f2);
        }
        if (this.f27237x0 == null) {
            finish();
            return;
        }
        this.f29642a.mo23473E(C11644i.f33126K4);
        Intent intent = getIntent();
        String str = "";
        if (intent != null) {
            this.f27213Z = intent.getStringExtra(C11644i.f33314h1);
            this.f27214a0 = intent.getStringExtra(C11644i.f33139M1);
            this.f27215b0 = intent.getStringExtra(C11644i.f33123K1);
            this.f27216c0 = intent.getStringExtra(C11644i.f33131L1);
            this.f27219f0 = intent.getDoubleExtra(C11644i.f33091G1, 0.0d);
            this.f27217d0 = intent.getStringExtra(C11644i.f33099H1);
            this.f27220g0 = intent.getDoubleExtra(C11644i.f33107I1, 0.0d);
            this.f27218e0 = intent.getStringExtra(C11644i.f33115J1);
            ChatInitModel chatInitModel = this.f27237x0;
            if (chatInitModel != null) {
                m47413c(TextUtils.isEmpty(chatInitModel.getBill_msg_coupon_title()));
            }
            if (intent.getExtras().containsKey(C11644i.f33187S1)) {
                m47420i(intent.getStringExtra(C11644i.f33187S1));
                this.f27222i0 = false;
            }
            if (intent.getExtras().containsKey(C11644i.f33195T1)) {
                TextView textView = this.f27206S;
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append((int) intent.getDoubleExtra(C11644i.f33195T1, 0.0d));
                textView.setText(sb.toString());
            }
        }
        if (this.f27219f0 == this.f27220g0) {
            this.f27207T.setVisibility(8);
            this.f27211X.setVisibility(8);
            this.f27207T.setText(this.f27218e0);
            TextView textView2 = this.f27207T;
            textView2.setPaintFlags(textView2.getPaintFlags() | 16);
            this.f27208U.setText(this.f27217d0);
            TextView textView3 = this.f27210W;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(Double.parseDouble(m47396N()));
            textView3.setText(sb2.toString());
            m47413c(true);
        } else {
            this.f27207T.setVisibility(0);
            this.f27211X.setVisibility(0);
            this.f27207T.setText(this.f27217d0);
            TextView textView4 = this.f27207T;
            textView4.setPaintFlags(textView4.getPaintFlags() | 16);
            this.f27208U.setText(this.f27218e0);
            TextView textView5 = this.f27210W;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(Double.parseDouble(m47396N()));
            textView5.setText(sb3.toString());
            m47413c(false);
        }
        m47401S();
        this.f27235v0.setText(this.f27237x0.getOrder().getCurrency());
        this.f29642a.mo23553a((C11056p) this);
        this.f27205B0 = (ImageView) findViewById(C10232R.C10236id.bgContinue);
        this.f27205B0.setOnClickListener(this);
    }

    /* renamed from: P */
    private void m47398P() {
        this.f29640Q = (TextView) findViewById(C10232R.C10236id.txtTitle);
        this.f29640Q.setText(getString(C10232R.string.lbl_title_create_issue));
        this.f27204A0 = (ImageView) findViewById(C10232R.C10236id.imgClose);
        this.f27204A0.setImageDrawable(C0841b.m4928c(this, C10232R.C10235drawable.back_white));
        this.f27204A0.setOnClickListener(this);
        if (this.f29642a.mo23496R()) {
            this.f27204A0.setScaleX(-1.0f);
        }
    }

    /* renamed from: Q */
    private void m47399Q() {
        this.f27206S.addTextChangedListener(new C10191c());
    }

    /* renamed from: R */
    private void m47400R() {
        C5665a aVar = new C5665a(this);
        aVar.setContentView((int) C10232R.layout.dialog_delivery_cost);
        aVar.setOnShowListener(new C10295b(this, aVar));
        aVar.show();
    }

    /* renamed from: S */
    private void m47401S() {
        String str = "";
        if (this.f27219f0 == this.f27220g0) {
            if (this.f27237x0.isVat_calculation_check()) {
                TextView textView = this.f27234u0;
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(this.f27237x0.getCost_with_vat_text());
                textView.setText(sb.toString());
            }
        } else if (this.f27237x0.isVat_calculation_check()) {
            TextView textView2 = this.f27234u0;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(this.f27237x0.getCost_with_vat_text());
            textView2.setText(sb2.toString());
            m47413c(false);
        } else {
            m47413c(false);
        }
    }

    /* renamed from: T */
    private void m47402T() {
        this.f27232s0 = null;
        this.f27228o0.setImageDrawable(C0841b.m4928c(this, C10232R.C10235drawable.bg_add_attachment));
        this.f27223j0.setVisibility(8);
        this.f27227n0.setVisibility(0);
        this.f27230q0.setVisibility(8);
        this.f27231r0.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 777) {
            String str = "image_path";
            if (intent.getExtras().getString(str) != null) {
                this.f29642a.mo23481I(intent.getExtras().getString(str));
                C5887x xVar = this.f29642a;
                xVar.mo23579b(new File(xVar.mo23488M()));
                C5887x xVar2 = this.f29642a;
                xVar2.mo23605d(xVar2.mo23511a(xVar2.mo23486L()));
                if (this.f29642a.mo23484K().getWidth() == 0 || this.f29642a.mo23484K().getHeight() == 0) {
                    this.f29642a.mo23491N(getString(C10232R.string.error_upload_image));
                } else if (this.f29642a.mo23484K() != null) {
                    if (this.f29642a.mo23484K().getWidth() > 720) {
                        this.f29642a.mo23589c(720);
                    } else {
                        C5887x xVar3 = this.f29642a;
                        xVar3.mo23589c(xVar3.mo23484K().getWidth());
                    }
                    this.f27232s0 = intent.getExtras().getString(str);
                    m47420i(this.f27232s0);
                }
            }
        }
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case C10232R.C10236id.bgContinue /*2131361929*/:
                if (this.f29642a.mo23502X()) {
                    m47393K();
                    return;
                }
                return;
            case C10232R.C10236id.imgClose /*2131362467*/:
                onBackPressed();
                return;
            case C10232R.C10236id.ivRemove /*2131362844*/:
                m47402T();
                return;
            case C10232R.C10236id.llInfoButton /*2131363054*/:
                m47400R();
                return;
            case C10232R.C10236id.llLeft /*2131363064*/:
                finish();
                return;
            case C10232R.C10236id.rlAttachment1 /*2131363447*/:
                m47392J();
                return;
            default:
                return;
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(@C0195i0 Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setSoftInputMode(3);
        setContentView((int) C10232R.layout.activity_create_bill);
        this.f27224k0 = new C11669t(this);
        m47397O();
    }

    public void onRequestPermissionsResult(int i, @C0193h0 String[] strArr, @C0193h0 int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        try {
            if (this.f27224k0 != null) {
                this.f27224k0.onRequestPermissionsResult(i, strArr, iArr);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    private void m47413c(boolean z) {
        if (z) {
            this.f27233t0.setVisibility(8);
            this.f27225l0.setVisibility(8);
            this.f27236w0.setVisibility(8);
        } else if (!TextUtils.isEmpty(this.f27237x0.getBill_msg_coupon_title())) {
            this.f27233t0.setVisibility(0);
            this.f27225l0.setVisibility(0);
            this.f27236w0.setVisibility(0);
            TextView textView = this.f27233t0;
            StringBuilder sb = new StringBuilder();
            sb.append(C3868i.f12248b);
            sb.append(this.f27237x0.getBill_msg_coupon_title());
            textView.setText(sb.toString());
        } else {
            this.f27233t0.setVisibility(8);
            this.f27225l0.setVisibility(8);
            this.f27236w0.setVisibility(8);
            TextView textView2 = this.f27233t0;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("  ");
            sb2.append(this.f27237x0.getBill_msg_coupon_title());
            textView2.setText(sb2.toString());
        }
    }

    /* renamed from: i */
    private void m47420i(String str) {
        this.f27226m0.setEnabled(false);
        this.f27223j0.setVisibility(0);
        this.f27227n0.setVisibility(8);
        this.f27230q0.setVisibility(0);
        this.f27231r0.setVisibility(0);
        C2232l.m11649c(getApplicationContext()).mo9515a(str).mo9441j().m11415e((int) C10232R.C10235drawable.ic_image_placeholder).m11411d().mo9458b(new C10189a(this.f27228o0));
    }

    /* renamed from: f */
    public void mo36511f(String str) {
        m47409a(this.f27239z0);
    }

    /* renamed from: a */
    private String m47407a(double d) {
        DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getNumberInstance(Locale.US);
        decimalFormat.applyPattern("#.##");
        try {
            return decimalFormat.format(d);
        } catch (Exception e) {
            e.printStackTrace();
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(d);
            return sb.toString();
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo36510a(C5665a aVar, DialogInterface dialogInterface) {
        ((TextView) aVar.findViewById(C10232R.C10236id.tvDescription)).setText(this.f27237x0.getHwcc_courier());
        aVar.findViewById(C10232R.C10236id.ivGotIt).setOnClickListener(new C10254a(dialogInterface));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m47409a(ServiceManualDefaultBean serviceManualDefaultBean) {
        this.f29642a.mo23473E(C11644i.f33189S3);
        Intent intent = new Intent();
        intent.putExtra("success", true);
        intent.putExtra(XHTMLText.CODE, 200);
        setResult(-1, intent);
        finish();
    }

    /* renamed from: a */
    private double m47404a(Float f, int i) {
        double d = (double) i;
        Double.isNaN(d);
        double d2 = d / 100.0d;
        try {
            double floatValue = (double) f.floatValue();
            Double.isNaN(floatValue);
            return Double.parseDouble(new DecimalFormat("#.#").format(d2 * floatValue));
        } catch (Exception unused) {
            return d;
        }
    }
}
