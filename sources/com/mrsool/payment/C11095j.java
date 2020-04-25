package com.mrsool.payment;

import android.app.Activity;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.C0193h0;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.cardview.widget.CardView;
import androidx.core.content.C0841b;
import com.facebook.appevents.AppEventsConstants;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior.C5662e;
import com.google.android.material.bottomsheet.C5665a;
import com.google.android.material.button.MaterialButton;
import com.mrsool.C10232R;
import com.mrsool.bean.PaymentCardsBean;
import com.mrsool.bean.PaymentSaveMainBean;
import com.mrsool.bean.PaymentStatusMainBean;
import com.mrsool.chat.C10526n.C10527a;
import com.mrsool.chat.ChatActivityNew;
import com.mrsool.p417t.C11549c;
import com.mrsool.utils.C11571b;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C11644i.C11645a;
import com.mrsool.utils.C5887x;
import com.mrsool.utils.payment.CardEditText;
import com.mrsool.utils.webservice.C11687c;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutActivity;
import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.exception.PaymentException;
import com.oppwa.mobile.connect.payment.BrandsValidation;
import com.oppwa.mobile.connect.payment.CheckoutInfo;
import com.oppwa.mobile.connect.payment.ImagesRequest;
import com.oppwa.mobile.connect.payment.PaymentParams;
import com.oppwa.mobile.connect.payment.card.CardPaymentParams;
import com.oppwa.mobile.connect.payment.token.TokenPaymentParams;
import com.oppwa.mobile.connect.provider.C11977a.C11978a;
import com.oppwa.mobile.connect.provider.C11980c;
import com.oppwa.mobile.connect.provider.Transaction;
import com.oppwa.mobile.connect.provider.TransactionType;
import com.oppwa.mobile.connect.service.C11991a;
import com.oppwa.mobile.connect.service.ConnectService;
import java.util.HashMap;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import smartdevelop.p561ir.eram.showcaseviewlib.C15792c;
import smartdevelop.p561ir.eram.showcaseviewlib.C15792c.C15800h;
import smartdevelop.p561ir.eram.showcaseviewlib.p562d.C15801a;
import smartdevelop.p561ir.eram.showcaseviewlib.p562d.C15802b;

/* renamed from: com.mrsool.payment.j */
/* compiled from: AddCardBottomSheet */
public class C11095j implements OnClickListener, OnFocusChangeListener, C11980c {

    /* renamed from: A0 */
    private String[] f30705A0 = {"visa", "master", "mastercard", "mada"};

    /* renamed from: B0 */
    public boolean f30706B0 = false;

    /* renamed from: C0 */
    public Dialog f30707C0;

    /* renamed from: D0 */
    private String f30708D0;
    /* access modifiers changed from: private */

    /* renamed from: E0 */
    public PaymentCardsBean f30709E0;

    /* renamed from: F0 */
    private boolean f30710F0;
    /* access modifiers changed from: private */

    /* renamed from: G0 */
    public String f30711G0;
    /* access modifiers changed from: private */

    /* renamed from: H0 */
    public C11112n f30712H0;

    /* renamed from: I0 */
    BroadcastReceiver f30713I0;

    /* renamed from: J0 */
    private ServiceConnection f30714J0;

    /* renamed from: N */
    private final int f30715N = 2;

    /* renamed from: O */
    private final int f30716O = 3;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public int f30717P = 1;

    /* renamed from: Q */
    private String f30718Q;

    /* renamed from: R */
    private Bundle f30719R;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public Context f30720S;

    /* renamed from: T */
    public C15792c f30721T;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public View f30722U;

    /* renamed from: V */
    private C5665a f30723V;

    /* renamed from: W */
    BottomSheetBehavior f30724W;

    /* renamed from: X */
    private ScrollView f30725X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public CardView f30726Y;
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public ProgressBar f30727Z;

    /* renamed from: a */
    public C5887x f30728a;

    /* renamed from: a0 */
    private CardEditText f30729a0;

    /* renamed from: b */
    private final int f30730b = 1;

    /* renamed from: b0 */
    private TextView f30731b0;

    /* renamed from: c0 */
    private TextView f30732c0;

    /* renamed from: d0 */
    private TextView f30733d0;

    /* renamed from: e0 */
    private TextView f30734e0;
    /* access modifiers changed from: private */

    /* renamed from: f0 */
    public TextView f30735f0;
    /* access modifiers changed from: private */

    /* renamed from: g0 */
    public EditText f30736g0;
    /* access modifiers changed from: private */

    /* renamed from: h0 */
    public EditText f30737h0;
    /* access modifiers changed from: private */

    /* renamed from: i0 */
    public EditText f30738i0;

    /* renamed from: j0 */
    private AppCompatCheckBox f30739j0;

    /* renamed from: k0 */
    private LinearLayout f30740k0;

    /* renamed from: l0 */
    private LinearLayout f30741l0;

    /* renamed from: m0 */
    private LinearLayout f30742m0;

    /* renamed from: n0 */
    private ImageView f30743n0;

    /* renamed from: o0 */
    private ImageView f30744o0;
    /* access modifiers changed from: private */

    /* renamed from: p0 */
    public View f30745p0;

    /* renamed from: q0 */
    private View f30746q0;

    /* renamed from: r0 */
    private View f30747r0;

    /* renamed from: s0 */
    private View f30748s0;

    /* renamed from: t0 */
    private View f30749t0;

    /* renamed from: u0 */
    private View f30750u0;
    /* access modifiers changed from: private */

    /* renamed from: v0 */
    public View f30751v0;

    /* renamed from: w0 */
    private C11118l f30752w0;

    /* renamed from: x0 */
    private C11113o f30753x0;
    /* access modifiers changed from: private */

    /* renamed from: y0 */
    public C11991a f30754y0;
    /* access modifiers changed from: private */

    /* renamed from: z0 */
    public int f30755z0 = 0;

    /* renamed from: com.mrsool.payment.j$a */
    /* compiled from: AddCardBottomSheet */
    class C11096a implements OnShowListener {

        /* renamed from: com.mrsool.payment.j$a$a */
        /* compiled from: AddCardBottomSheet */
        class C11097a extends C5662e {
            C11097a() {
            }

            /* renamed from: a */
            public void mo22486a(@C0193h0 View view, float f) {
            }

            /* renamed from: a */
            public void mo22487a(@C0193h0 View view, int i) {
                if (i == 1) {
                    C11095j.this.f30724W.mo22474e(3);
                }
            }
        }

        /* renamed from: com.mrsool.payment.j$a$b */
        /* compiled from: AddCardBottomSheet */
        class C11098b implements Runnable {
            C11098b() {
            }

            public void run() {
                C11095j.this.m50423t();
                if (C11095j.this.f30717P == 2) {
                    C11095j.this.m50365D();
                }
            }
        }

        C11096a() {
        }

        public void onShow(DialogInterface dialogInterface) {
            FrameLayout frameLayout = (FrameLayout) ((C5665a) dialogInterface).findViewById(C10232R.C10236id.design_bottom_sheet);
            C11095j.this.f30724W = BottomSheetBehavior.m24700c(frameLayout);
            C11095j jVar = C11095j.this;
            jVar.f30724W.mo22467c(jVar.f30722U.getHeight());
            C11095j.this.f30724W.mo22474e(3);
            C11095j.this.f30724W.mo22458a((C5662e) new C11097a());
            new Handler().postDelayed(new C11098b(), 200);
        }
    }

    /* renamed from: com.mrsool.payment.j$b */
    /* compiled from: AddCardBottomSheet */
    class C11099b implements Callback<PaymentStatusMainBean> {
        C11099b() {
        }

        public void onFailure(Call<PaymentStatusMainBean> call, Throwable th) {
            C11095j.this.m50398f(false);
        }

        public void onResponse(Call<PaymentStatusMainBean> call, Response<PaymentStatusMainBean> response) {
            C11095j.this.m50398f(false);
            if (response.isSuccessful() && ((PaymentStatusMainBean) response.body()).getCode().intValue() <= 300) {
                PaymentStatusMainBean paymentStatusMainBean = (PaymentStatusMainBean) response.body();
                boolean isPaid = paymentStatusMainBean.getPaymentHash().isPaid();
                String str = C11644i.f33299f4;
                if (!isPaid) {
                    C11095j.this.f30728a.mo23494P();
                    if (paymentStatusMainBean.getPaymentHash().getPaymentStatus().equalsIgnoreCase(C11645a.f33470b)) {
                        C11095j.this.f30728a.mo23628i(C11645a.f33469a, "credit_card");
                        C11095j.this.f30728a.mo23473E(str);
                        C11095j.this.mo38891e();
                    } else if (paymentStatusMainBean.getPaymentHash().getPaymentStatus().equalsIgnoreCase(C11645a.f33471c)) {
                        C11095j.this.f30711G0 = ((PaymentStatusMainBean) response.body()).getPaymentHash().getData().getCheckoutId();
                        C11095j.this.f30728a.mo23473E(str);
                        C11095j.this.mo38886a((String) null, (String) null);
                    }
                } else {
                    C11095j.this.f30728a.mo23473E(str);
                    C11095j.this.mo38891e();
                }
            }
        }
    }

    /* renamed from: com.mrsool.payment.j$c */
    /* compiled from: AddCardBottomSheet */
    class C11100c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ boolean f30760a;

        C11100c(boolean z) {
            this.f30760a = z;
        }

        public void run() {
            if (this.f30760a && !C11095j.this.m50412n().isFinishing() && C11095j.this.f30727Z.getVisibility() != 0) {
                C11095j.this.f30735f0.setText("");
                C11095j.this.f30727Z.setVisibility(0);
                C11095j.this.f30745p0.setVisibility(0);
                C11095j.this.f30751v0.setBackgroundColor(C0841b.m4915a(C11095j.this.f30720S, (int) C10232R.C10234color.text_color_5b_35));
                C11095j.this.f30726Y.setEnabled(false);
            } else if (!this.f30760a && !C11095j.this.m50412n().isFinishing() && C11095j.this.f30727Z.getVisibility() == 0) {
                C11095j.this.f30735f0.setText(C11095j.this.m50415o());
                C11095j.this.f30727Z.setVisibility(8);
                C11095j.this.f30745p0.setVisibility(8);
                C11095j.this.f30751v0.setBackgroundColor(C0841b.m4915a(C11095j.this.f30720S, (int) C10232R.C10234color.transparent));
                C11095j.this.f30726Y.setEnabled(true);
            }
        }
    }

    /* renamed from: com.mrsool.payment.j$d */
    /* compiled from: AddCardBottomSheet */
    class C11101d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f30763a;

        /* renamed from: b */
        final /* synthetic */ String f30764b;

        C11101d(String str, String str2) {
            this.f30763a = str;
            this.f30764b = str2;
        }

        /* renamed from: a */
        public /* synthetic */ void mo38902a(View view) {
            C11095j.this.m50398f(false);
            C11095j.this.f30707C0.dismiss();
        }

        public void run() {
            C11095j.this.m50398f(false);
            Dialog dialog = C11095j.this.f30707C0;
            if (dialog == null || !dialog.isShowing()) {
                C11095j jVar = C11095j.this;
                jVar.f30707C0 = jVar.f30728a.mo23508a((int) C10232R.layout.dialog_hyperpay_payment_error, false);
                MaterialButton materialButton = (MaterialButton) C11095j.this.f30707C0.findViewById(C10232R.C10236id.btnClose);
                TextView textView = (TextView) C11095j.this.f30707C0.findViewById(C10232R.C10236id.tvDesc);
                ((TextView) C11095j.this.f30707C0.findViewById(C10232R.C10236id.tvTitle)).setText(TextUtils.isEmpty(this.f30763a) ? C11095j.this.f30720S.getString(C10232R.string.payment_error_title) : this.f30763a);
                textView.setText(TextUtils.isEmpty(this.f30764b) ? C11095j.this.f30720S.getString(C10232R.string.payment_error_detail) : this.f30764b);
                materialButton.setOnClickListener(new C11091f(this));
                if (!((Activity) C11095j.this.f30720S).isFinishing()) {
                    Dialog dialog2 = C11095j.this.f30707C0;
                    if (dialog2 != null && !dialog2.isShowing()) {
                        C11095j.this.f30707C0.show();
                    }
                }
            }
        }
    }

    /* renamed from: com.mrsool.payment.j$e */
    /* compiled from: AddCardBottomSheet */
    class C11102e implements Callback<PaymentSaveMainBean> {

        /* renamed from: a */
        final /* synthetic */ String f30765a;

        C11102e(String str) {
            this.f30765a = str;
        }

        public void onFailure(Call<PaymentSaveMainBean> call, Throwable th) {
            C11095j.this.mo38886a((String) null, (String) null);
        }

        public void onResponse(Call<PaymentSaveMainBean> call, Response<PaymentSaveMainBean> response) {
            C11095j.this.m50398f(false);
            if (!response.isSuccessful()) {
                C11095j.this.mo38886a((String) null, (String) null);
            } else if (((PaymentSaveMainBean) response.body()).getCode().intValue() > 300) {
                C11095j.this.mo38886a((String) null, ((PaymentSaveMainBean) response.body()).getMessage());
            } else if (((PaymentSaveMainBean) response.body()).getRegistrationDetails().getPaymentSaveData() != null) {
                C11095j.this.f30711G0 = ((PaymentSaveMainBean) response.body()).getRegistrationDetails().getPaymentSaveData().getCheckoutId();
                if (!this.f30765a.equalsIgnoreCase(C11645a.f33475g)) {
                    return;
                }
                if (((PaymentSaveMainBean) response.body()).getRegistrationDetails().getRegistrationStatus().equalsIgnoreCase("registered")) {
                    C11095j.this.mo38891e();
                    if (C11095j.this.f30712H0 != null) {
                        C11095j.this.f30712H0.mo38026a();
                        return;
                    }
                    return;
                }
                C11095j.this.mo38886a((String) null, ((PaymentSaveMainBean) response.body()).getRegistrationDetails().getPaymentSaveData().getError());
                C11095j.this.m50380a(C11645a.f33473e);
            }
        }
    }

    /* renamed from: com.mrsool.payment.j$f */
    /* compiled from: AddCardBottomSheet */
    class C11103f extends BroadcastReceiver {
        C11103f() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null && intent.getAction().equalsIgnoreCase(C11644i.f33174Q4) && C11095j.this.m50434z()) {
                if (C11095j.this.f30728a.mo23620g()) {
                    C11095j.this.m50398f(true);
                    C11095j.this.mo38888b(C11645a.f33469a, "credit_card");
                    return;
                }
                ChatActivityNew.f27658F6 = true;
            }
        }
    }

    /* renamed from: com.mrsool.payment.j$g */
    /* compiled from: AddCardBottomSheet */
    class C11104g implements TextWatcher {
        C11104g() {
        }

        public void afterTextChanged(Editable editable) {
            if (C11095j.this.m50420r().length() >= 16 && C11095j.this.f30709E0 == null && TextUtils.isEmpty(C11095j.this.m50407k())) {
                C11095j.this.f30736g0.requestFocus();
            }
            if (C11095j.this.f30726Y.isEnabled()) {
                C11095j.this.m50409l();
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.mrsool.payment.j$h */
    /* compiled from: AddCardBottomSheet */
    class C11105h implements TextWatcher {
        C11105h() {
        }

        public void afterTextChanged(Editable editable) {
            try {
                int length = C11095j.this.f30736g0.getText().toString().trim().length();
                String str = "/";
                if (C11095j.this.f30755z0 <= length && length < 3) {
                    int parseInt = Integer.parseInt(C11095j.this.f30736g0.getText().toString());
                    if (length == 1 && parseInt >= 2) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(AppEventsConstants.EVENT_PARAM_VALUE_NO);
                        sb.append(parseInt);
                        sb.append(str);
                        C11095j.this.f30736g0.setText(sb.toString());
                        C11095j.this.f30736g0.setSelection(3);
                    } else if (length == 2 && parseInt <= 12) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(C11095j.this.f30736g0.getText().toString());
                        sb2.append(str);
                        C11095j.this.f30736g0.setText(sb2.toString());
                        C11095j.this.f30736g0.setSelection(3);
                    } else if (length == 2 && parseInt > 12) {
                        C11095j.this.f30736g0.setText("1");
                        C11095j.this.f30736g0.setSelection(1);
                    }
                } else if (length > 2 && !C11095j.this.f30736g0.getText().toString().trim().contains(str)) {
                    String substring = C11095j.this.f30736g0.getText().toString().trim().substring(0, 2);
                    String substring2 = C11095j.this.f30736g0.getText().toString().trim().substring(length - 1, length);
                    EditText x = C11095j.this.f30736g0;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(substring);
                    sb3.append(str);
                    sb3.append(substring2);
                    x.setText(sb3.toString());
                    C11095j.this.f30736g0.setSelection(C11095j.this.f30736g0.getText().length());
                } else if (length == 5) {
                    if (C11095j.this.m50362A()) {
                        C11095j.this.f30737h0.requestFocus();
                    } else {
                        C11095j.this.m50386b(true);
                    }
                }
                if (C11095j.this.f30726Y.isEnabled()) {
                    C11095j.this.m50409l();
                }
            } catch (Exception unused) {
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C11095j.this.f30755z0 = charSequence.length();
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.mrsool.payment.j$i */
    /* compiled from: AddCardBottomSheet */
    class C11106i implements TextWatcher {

        /* renamed from: a */
        boolean f30770a;

        C11106i() {
        }

        public void afterTextChanged(Editable editable) {
            if (editable.length() >= 3) {
                if (C11095j.this.f30709E0 != null) {
                    C11095j.this.m50409l();
                } else {
                    C11095j.this.f30738i0.requestFocus();
                }
            }
            if (C11095j.this.f30726Y.isEnabled()) {
                C11095j.this.m50409l();
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.mrsool.payment.j$j */
    /* compiled from: AddCardBottomSheet */
    class C11107j implements TextWatcher {
        C11107j() {
        }

        public void afterTextChanged(Editable editable) {
            C11095j.this.m50409l();
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.mrsool.payment.j$k */
    /* compiled from: AddCardBottomSheet */
    class C11108k implements Runnable {

        /* renamed from: com.mrsool.payment.j$k$a */
        /* compiled from: AddCardBottomSheet */
        class C11109a implements Runnable {
            C11109a() {
            }

            public void run() {
                if (C11095j.this.m50434z()) {
                    C11095j.this.m50389c("credit_card", C11645a.f33472d);
                    return;
                }
                C11095j.this.m50380a(C11645a.f33475g);
            }
        }

        C11108k() {
        }

        public void run() {
            new Handler().postDelayed(new C11109a(), 2000);
        }
    }

    /* renamed from: com.mrsool.payment.j$l */
    /* compiled from: AddCardBottomSheet */
    class C11110l implements ServiceConnection {
        C11110l() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C11095j.this.f30754y0 = (C11991a) iBinder;
            C11095j.this.f30754y0.mo41069a((C11980c) C11095j.this);
            try {
                C11095j.this.f30754y0.mo41074b(C11978a.LIVE);
            } catch (PaymentException e) {
                C11095j.this.f30728a.mo23487L(e.getMessage());
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            C11095j.this.f30754y0 = null;
        }
    }

    /* renamed from: com.mrsool.payment.j$m */
    /* compiled from: AddCardBottomSheet */
    class C11111m implements Callback<PaymentStatusMainBean> {

        /* renamed from: a */
        final /* synthetic */ String f30776a;

        C11111m(String str) {
            this.f30776a = str;
        }

        public void onFailure(Call<PaymentStatusMainBean> call, Throwable th) {
            C11095j.this.m50398f(false);
        }

        public void onResponse(Call<PaymentStatusMainBean> call, Response<PaymentStatusMainBean> response) {
            if (!response.isSuccessful()) {
                C11095j.this.m50398f(false);
            } else if (((PaymentStatusMainBean) response.body()).getCode().intValue() > 300) {
                C11095j.this.m50398f(false);
            } else if (this.f30776a.equalsIgnoreCase(C11645a.f33474f)) {
                C11095j.this.f30728a.mo23473E(CheckoutActivity.f34069j0);
                C11095j.this.m50398f(false);
            } else if (this.f30776a.equalsIgnoreCase(C11645a.f33469a)) {
                C11095j.this.m50389c("credit_card", C11645a.f33472d);
            }
        }
    }

    /* renamed from: com.mrsool.payment.j$n */
    /* compiled from: AddCardBottomSheet */
    public interface C11112n {
        /* renamed from: a */
        void mo38026a();
    }

    /* renamed from: com.mrsool.payment.j$o */
    /* compiled from: AddCardBottomSheet */
    public interface C11113o {
        /* renamed from: a */
        void mo37759a(String str);
    }

    public C11095j(Context context, Bundle bundle) {
        String str = "";
        this.f30708D0 = str;
        this.f30710F0 = false;
        this.f30711G0 = str;
        this.f30713I0 = new C11103f();
        this.f30714J0 = new C11110l();
        this.f30720S = context;
        this.f30719R = bundle;
        this.f30728a = new C5887x(context);
        if (bundle != null) {
            this.f30718Q = bundle.getString(C11644i.f33164P2, str);
            this.f30709E0 = (PaymentCardsBean) bundle.getSerializable(C11644i.f33180R2);
            PaymentCardsBean paymentCardsBean = this.f30709E0;
            if (paymentCardsBean != null) {
                this.f30708D0 = paymentCardsBean.getCardToken();
                this.f30710F0 = true;
                this.f30717P = 2;
            }
            this.f30711G0 = ChatActivityNew.f27659G6;
        } else {
            this.f30717P = 3;
            m50380a(C11645a.f33473e);
        }
        m50426u();
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public boolean m50362A() {
        return C11119m.m50478b(mo38887b(), mo38889c());
    }

    /* renamed from: B */
    private void m50363B() {
        try {
            TokenPaymentParams tokenPaymentParams = new TokenPaymentParams(this.f30711G0, this.f30708D0, this.f30709E0.getBrand(), this.f30737h0.getText().toString());
            StringBuilder sb = new StringBuilder();
            sb.append(this.f30720S.getString(C10232R.string.checkout_ui_callback_scheme));
            sb.append("://callback");
            tokenPaymentParams.mo40895e(sb.toString());
            this.f30754y0.mo41066a(new Transaction((PaymentParams) tokenPaymentParams));
            this.f30728a.mo23628i(C11645a.f33474f, "credit_card");
        } catch (PaymentException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: C */
    private void m50364C() {
        m50412n().runOnUiThread(new C11092g(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public void m50365D() {
        this.f30729a0.mo40012a(this.f30709E0.getBrand(), this.f30709E0.getLastDigits());
        this.f30729a0.setEnabled(false);
        this.f30729a0.setTextColor(C0841b.m4915a(this.f30720S, (int) C10232R.C10234color.text_color_5b_59));
        String substring = this.f30709E0.getExpiryYear().substring(this.f30709E0.getExpiryYear().length() - 2);
        EditText editText = this.f30736g0;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f30709E0.getExpiryMonth());
        sb.append("/");
        sb.append(substring);
        editText.setText(sb.toString());
        this.f30736g0.setEnabled(false);
        this.f30736g0.setTextColor(C0841b.m4915a(this.f30720S, (int) C10232R.C10234color.text_color_5b_59));
        this.f30738i0.setText("XXXXXX");
        this.f30738i0.setEnabled(false);
        this.f30738i0.setTextColor(C0841b.m4915a(this.f30720S, (int) C10232R.C10234color.text_color_5b_59));
    }

    /* renamed from: E */
    private void m50366E() {
    }

    /* renamed from: F */
    private void m50367F() {
    }

    /* renamed from: G */
    private void m50368G() {
        this.f30729a0.setText(C10527a.f28546g);
        this.f30736g0.setText("01/21");
        this.f30737h0.setText("111");
        this.f30738i0.setText("Test User");
    }

    /* renamed from: H */
    private void m50369H() {
        this.f30729a0.addTextChangedListener(new C11104g());
        this.f30736g0.addTextChangedListener(new C11105h());
        this.f30737h0.addTextChangedListener(new C11106i());
        this.f30738i0.addTextChangedListener(new C11107j());
    }

    /* renamed from: I */
    private void m50370I() {
        int i = this.f30717P;
        if (i == 1) {
            m50396e(this.f30711G0);
        } else if (i == 2) {
            m50398f(true);
            m50363B();
        } else if (i == 3) {
            m50396e(this.f30711G0);
        }
    }

    /* renamed from: y */
    private String m50433y() {
        if (TextUtils.isEmpty(this.f30738i0.getText().toString().trim())) {
            return this.f30720S.getString(C10232R.string.payment_error_blank_field);
        }
        return !CardPaymentParams.m53961m(this.f30738i0.getText().toString().trim()) ? this.f30720S.getString(C10232R.string.checkout_error_card_holder_invalid) : "";
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public boolean m50434z() {
        int i = this.f30717P;
        return i == 1 || i == 2;
    }

    /* renamed from: a */
    public void mo38838a(PaymentError paymentError) {
    }

    /* renamed from: a */
    public void mo38839a(BrandsValidation brandsValidation) {
    }

    /* renamed from: a */
    public void mo38841a(ImagesRequest imagesRequest) {
    }

    public void onClick(View view) {
        boolean z = true;
        switch (view.getId()) {
            case C10232R.C10236id.cvPay /*2131362109*/:
                if (this.f30728a.mo23620g()) {
                    if (this.f30728a.mo23497S()) {
                        this.f30728a.mo23543a(this.f30722U);
                        m50370I();
                        break;
                    }
                } else {
                    m50398f(false);
                    mo38886a((String) null, this.f30720S.getString(C10232R.string.msg_info_internet_connection));
                    return;
                }
                break;
            case C10232R.C10236id.ivClose /*2131362756*/:
                this.f30721T.mo51999a();
                break;
            case C10232R.C10236id.ivCloseCvv /*2131362757*/:
                m50397e(true);
                break;
            case C10232R.C10236id.ivCloseExpiry /*2131362758*/:
                m50397e(false);
                break;
            case C10232R.C10236id.llBack /*2131362968*/:
                mo38891e();
                break;
            case C10232R.C10236id.llQuestionCvv /*2131363132*/:
                m50403h(true);
                break;
            case C10232R.C10236id.llQuestionExpiry /*2131363133*/:
                m50403h(false);
                break;
            case C10232R.C10236id.viewEmpty /*2131364242*/:
                if (this.f30747r0.getVisibility() != 0) {
                    z = false;
                }
                m50397e(z);
                break;
        }
    }

    public void onFocusChange(View view, boolean z) {
        int id = view.getId();
        if (id != C10232R.C10236id.edNameOnCard) {
            switch (id) {
                case C10232R.C10236id.edCardCvv /*2131362148*/:
                    mo38882a((View) this.f30737h0, (EditText) view);
                    m50421s();
                    if (!z) {
                        m50381a(true);
                        break;
                    }
                    break;
                case C10232R.C10236id.edCardExpiryDate /*2131362149*/:
                    mo38882a((View) this.f30736g0, (EditText) view);
                    m50421s();
                    if (!z) {
                        m50386b(true);
                        break;
                    }
                    break;
                case C10232R.C10236id.edCardNumber /*2131362150*/:
                    mo38882a((View) this.f30729a0, (EditText) view);
                    m50421s();
                    if (!z) {
                        m50407k();
                        break;
                    }
                    break;
            }
        } else {
            mo38882a((View) this.f30738i0, (EditText) view);
            m50417p();
            m50421s();
            if (!z) {
                m50390c(true);
            }
        }
        m50409l();
        m50367F();
    }

    /* renamed from: q */
    public void mo38850q() {
    }

    /* renamed from: d */
    private View m50392d(boolean z) {
        C11549c a = C11549c.m52059a(m50412n().getLayoutInflater());
        a.f32690s0.setText(this.f30720S.getString(z ? C10232R.string.llb_cvv : C10232R.string.lbl_expiration_date));
        a.f32689r0.setText(this.f30720S.getString(z ? C10232R.string.msg_cvv_desc : C10232R.string.msg_exp_date_desc));
        a.f32688q0.setImageResource(z ? C10232R.C10235drawable.ic_card_cvv_light : C10232R.C10235drawable.ic_card_exp_date_light);
        a.f32687p0.setTag(Boolean.valueOf(z));
        a.f32687p0.setOnClickListener(this);
        return a.mo5538m();
    }

    /* renamed from: e */
    private void m50397e(boolean z) {
        this.f30746q0.setVisibility(8);
        if (z) {
            this.f30747r0.setVisibility(8);
        } else {
            this.f30748s0.setVisibility(8);
        }
    }

    /* renamed from: g */
    private void m50401g(boolean z) {
        try {
            if (this.f30721T != null && this.f30721T.mo52000b()) {
                this.f30721T.mo51999a();
            }
            this.f30721T = new C15800h(this.f30720S).mo52035c(m50392d(z)).mo52031b((View) z ? this.f30741l0 : this.f30740k0).mo52023a(C15801a.none).mo52024a(C15802b.center).mo52037d(50).mo52027a();
            this.f30721T.mo52001c();
        } catch (Exception unused) {
        }
    }

    /* renamed from: h */
    private void m50403h(boolean z) {
        this.f30746q0.setVisibility(0);
        if (z) {
            this.f30747r0.setVisibility(0);
            if (this.f30748s0.getVisibility() == 0) {
                m50397e(false);
                return;
            }
            return;
        }
        if (this.f30747r0.getVisibility() == 0) {
            m50397e(true);
        }
        this.f30748s0.setVisibility(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public String m50407k() {
        String w = m50429w();
        if (!TextUtils.isEmpty(w)) {
            TextView textView = this.f30731b0;
            CardEditText cardEditText = this.f30729a0;
            m50376a(textView, cardEditText, cardEditText, w);
        }
        return w;
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public void m50409l() {
        if (!mo38892f()) {
            this.f30726Y.setEnabled(false);
            this.f30726Y.setCardBackgroundColor(C0841b.m4924b(this.f30720S, (int) C10232R.C10234color.light_gray_1));
            return;
        }
        this.f30726Y.setEnabled(true);
        this.f30726Y.setCardBackgroundColor(C0841b.m4924b(this.f30720S, (int) C10232R.C10234color.sky_blue_color));
        m50375a(this.f30731b0);
        m50375a(this.f30732c0);
        m50375a(this.f30733d0);
        m50375a(this.f30734e0);
    }

    /* renamed from: m */
    private void m50411m() {
        m50398f(false);
        mo38886a(this.f30720S.getString(C10232R.string.app_name), this.f30720S.getString(C10232R.string.msg_alert_something_went_wrong));
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public Activity m50412n() {
        return (Activity) this.f30720S;
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public CharSequence m50415o() {
        if (!m50434z()) {
            return this.f30720S.getResources().getString(C10232R.string.lbl_save);
        }
        return String.format(this.f30720S.getString(C10232R.string.lbl_two_string), new Object[]{this.f30720S.getString(C10232R.string.lbl_pay), this.f30718Q});
    }

    /* renamed from: p */
    private String m50417p() {
        String cardType = this.f30729a0.getCardType();
        String str = C10527a.f28544e;
        if (cardType.equalsIgnoreCase(str)) {
            return str;
        }
        if (cardType.equalsIgnoreCase("MASTERCARD")) {
            return "MASTER";
        }
        String str2 = "MADA";
        return cardType.equalsIgnoreCase(str2) ? str2 : "UNKNOWN";
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public String m50420r() {
        try {
            return this.f30729a0.getCardNumber();
        } catch (Exception unused) {
            return this.f30729a0.getText().toString().trim();
        }
    }

    /* renamed from: s */
    private void m50421s() {
        if (this.f30709E0 == null && TextUtils.isEmpty(m50429w())) {
            m50375a(this.f30731b0);
        }
        if (TextUtils.isEmpty(m50432x())) {
            m50375a(this.f30732c0);
        }
        if (TextUtils.isEmpty(m50428v())) {
            m50375a(this.f30733d0);
        }
        if (TextUtils.isEmpty(m50433y())) {
            m50375a(this.f30734e0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public void m50423t() {
        if (this.f30709E0 == null) {
            this.f30729a0.requestFocus();
            this.f30728a.mo23668v0();
        }
        this.f30729a0.setCardEvent(new C11093h(this));
    }

    /* renamed from: u */
    private void m50426u() {
        this.f30722U = ((Activity) this.f30720S).getLayoutInflater().inflate(C10232R.layout.bottom_sheet_add_card_1, null);
        this.f30726Y = (CardView) this.f30722U.findViewById(C10232R.C10236id.cvPay);
        this.f30735f0 = (TextView) this.f30722U.findViewById(C10232R.C10236id.tvButtonText);
        this.f30742m0 = (LinearLayout) this.f30722U.findViewById(C10232R.C10236id.llBack);
        this.f30743n0 = (ImageView) this.f30722U.findViewById(C10232R.C10236id.ivCardType);
        this.f30729a0 = (CardEditText) this.f30722U.findViewById(C10232R.C10236id.edCardNumber);
        this.f30743n0 = (ImageView) this.f30722U.findViewById(C10232R.C10236id.ivCardType);
        this.f30727Z = (ProgressBar) this.f30722U.findViewById(C10232R.C10236id.pgCall);
        this.f30729a0 = (CardEditText) this.f30722U.findViewById(C10232R.C10236id.edCardNumber);
        this.f30729a0.setImeOptions(5);
        this.f30737h0 = (EditText) this.f30722U.findViewById(C10232R.C10236id.edCardCvv);
        this.f30736g0 = (EditText) this.f30722U.findViewById(C10232R.C10236id.edCardExpiryDate);
        this.f30738i0 = (EditText) this.f30722U.findViewById(C10232R.C10236id.edNameOnCard);
        this.f30740k0 = (LinearLayout) this.f30722U.findViewById(C10232R.C10236id.llQuestionExpiry);
        this.f30741l0 = (LinearLayout) this.f30722U.findViewById(C10232R.C10236id.llQuestionCvv);
        this.f30731b0 = (TextView) this.f30722U.findViewById(C10232R.C10236id.tvCardError);
        this.f30732c0 = (TextView) this.f30722U.findViewById(C10232R.C10236id.tvDateError);
        this.f30733d0 = (TextView) this.f30722U.findViewById(C10232R.C10236id.tvCvvError);
        this.f30734e0 = (TextView) this.f30722U.findViewById(C10232R.C10236id.tvNameError);
        this.f30725X = (ScrollView) this.f30722U.findViewById(C10232R.C10236id.svMain);
        this.f30751v0 = this.f30722U.findViewById(C10232R.C10236id.flBg2);
        this.f30745p0 = this.f30722U.findViewById(C10232R.C10236id.vBg1);
        this.f30746q0 = this.f30722U.findViewById(C10232R.C10236id.viewEmpty);
        this.f30747r0 = this.f30722U.findViewById(C10232R.C10236id.toolTipCvv);
        this.f30748s0 = this.f30722U.findViewById(C10232R.C10236id.toolTipExpiry);
        this.f30749t0 = this.f30722U.findViewById(C10232R.C10236id.ivCloseExpiry);
        this.f30750u0 = this.f30722U.findViewById(C10232R.C10236id.ivCloseCvv);
        this.f30739j0 = (AppCompatCheckBox) this.f30722U.findViewById(C10232R.C10236id.cbStoreForFuture);
        this.f30742m0.setOnClickListener(this);
        this.f30726Y.setOnClickListener(this);
        this.f30740k0.setOnClickListener(this);
        this.f30741l0.setOnClickListener(this);
        this.f30745p0.setOnClickListener(this);
        this.f30746q0.setOnClickListener(this);
        this.f30749t0.setOnClickListener(this);
        this.f30750u0.setOnClickListener(this);
        this.f30729a0.setOnFocusChangeListener(this);
        this.f30737h0.setOnFocusChangeListener(this);
        this.f30736g0.setOnFocusChangeListener(this);
        this.f30738i0.setOnFocusChangeListener(this);
        this.f30735f0.setText(m50415o());
        m50366E();
        m50369H();
        this.f30728a.mo23608d(this.f30738i0);
        this.f30723V = new C5665a(this.f30720S, C10232R.style.DialogStyle);
        this.f30723V.setOnShowListener(new C11096a());
        AppCompatCheckBox appCompatCheckBox = this.f30739j0;
        int i = this.f30717P;
        appCompatCheckBox.setVisibility((i == 2 || i == 3) ? 8 : 0);
        this.f30723V.setCancelable(false);
        this.f30723V.setContentView(this.f30722U);
        this.f30723V.getWindow().setSoftInputMode(19);
        this.f30728a.mo23540a(this.f30713I0, C11644i.f33174Q4);
    }

    /* renamed from: v */
    private String m50428v() {
        if (TextUtils.isEmpty(this.f30737h0.getText().toString())) {
            return this.f30720S.getString(C10232R.string.payment_error_blank_field);
        }
        return !CardPaymentParams.m53958j(this.f30737h0.getText().toString().trim()) ? this.f30720S.getString(C10232R.string.payment_error_security_code_invalid) : "";
    }

    /* renamed from: w */
    private String m50429w() {
        if (TextUtils.isEmpty(m50420r())) {
            return this.f30720S.getString(C10232R.string.payment_error_blank_field);
        }
        if (m50420r().length() < 16) {
            return this.f30720S.getString(C10232R.string.payment_error_min_card_digit);
        }
        return !m50391c(this.f30729a0.getCardType()) ? this.f30720S.getString(C10232R.string.payment_error_valid_card_brand) : "";
    }

    /* renamed from: x */
    private String m50432x() {
        if (TextUtils.isEmpty(this.f30736g0.getText().toString())) {
            return this.f30720S.getString(C10232R.string.payment_error_blank_field);
        }
        return !m50362A() ? this.f30720S.getString(C10232R.string.checkout_error_expiration_date_invalid) : "";
    }

    /* renamed from: c */
    public String mo38889c() {
        String trim = this.f30736g0.getText().toString().trim();
        return trim.length() == 5 ? trim.substring(3, 5) : "";
    }

    /* renamed from: f */
    public boolean mo38892f() {
        return TextUtils.isEmpty(m50429w()) && TextUtils.isEmpty(m50432x()) && TextUtils.isEmpty(m50428v()) && TextUtils.isEmpty(m50433y());
    }

    /* renamed from: i */
    public /* synthetic */ void mo38895i() {
        new C11571b(this.f30720S).mo39718a(ChatActivityNew.f27655C6, true);
    }

    /* renamed from: j */
    public void mo38896j() {
        Intent intent = new Intent(this.f30720S, ConnectService.class);
        this.f30720S.startService(intent);
        m50412n().bindService(intent, this.f30714J0, 1);
        C5665a aVar = this.f30723V;
        if (aVar != null && !aVar.isShowing()) {
            this.f30723V.show();
        }
    }

    /* renamed from: b */
    public String mo38887b() {
        String trim = this.f30736g0.getText().toString().trim();
        if (trim.length() < 2) {
            return "";
        }
        return trim.substring(0, 2);
    }

    /* renamed from: c */
    private boolean m50391c(String str) {
        for (String equalsIgnoreCase : this.f30705A0) {
            if (str.equalsIgnoreCase(equalsIgnoreCase)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public void mo38891e() {
        this.f30728a.mo23539a(this.f30713I0);
        m50412n().unbindService(this.f30714J0);
        m50412n().stopService(new Intent(this.f30720S, ConnectService.class));
        C5665a aVar = this.f30723V;
        if (aVar != null && aVar.isShowing()) {
            this.f30723V.dismiss();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m50398f(boolean z) {
        m50412n().runOnUiThread(new C11100c(z));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m50386b(boolean z) {
        if (z) {
            String x = m50432x();
            if (!TextUtils.isEmpty(x)) {
                TextView textView = this.f30732c0;
                EditText editText = this.f30736g0;
                m50376a(textView, editText, editText, x);
            }
        }
    }

    /* renamed from: c */
    private void m50390c(boolean z) {
        if (z) {
            String y = m50433y();
            if (!TextUtils.isEmpty(y)) {
                TextView textView = this.f30734e0;
                EditText editText = this.f30738i0;
                m50376a(textView, editText, editText, y);
            }
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo38881a(int i) {
        this.f30743n0.setImageResource(i);
    }

    /* renamed from: a */
    private void m50381a(boolean z) {
        if (z) {
            String v = m50428v();
            if (!TextUtils.isEmpty(v)) {
                TextView textView = this.f30733d0;
                EditText editText = this.f30737h0;
                m50376a(textView, editText, editText, v);
            }
        }
    }

    /* renamed from: d */
    private void m50394d(String str) {
        Transaction transaction;
        if (!this.f30728a.mo23620g()) {
            m50398f(false);
            mo38886a((String) null, this.f30720S.getString(C10232R.string.msg_info_internet_connection));
            return;
        }
        try {
            String str2 = "://callback";
            if (this.f30739j0.isChecked()) {
                CardPaymentParams cardPaymentParams = (CardPaymentParams) m50382b(str);
                cardPaymentParams.mo40949a(true);
                StringBuilder sb = new StringBuilder();
                sb.append(this.f30720S.getString(C10232R.string.checkout_ui_callback_scheme));
                sb.append(str2);
                cardPaymentParams.mo40895e(sb.toString());
                transaction = new Transaction((PaymentParams) cardPaymentParams);
            } else {
                PaymentParams b = m50382b(str);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f30720S.getString(C10232R.string.checkout_ui_callback_scheme));
                sb2.append(str2);
                b.mo40895e(sb2.toString());
                transaction = new Transaction(b);
            }
            if (m50434z()) {
                this.f30754y0.mo41066a(transaction);
                this.f30728a.mo23628i(C11645a.f33474f, "credit_card");
            } else {
                this.f30754y0.mo41073b(transaction);
            }
        } catch (PaymentException e) {
            m50398f(false);
            mo38886a((String) null, e.mo40774a().mo40764c());
        }
    }

    /* renamed from: h */
    public /* synthetic */ void mo38894h() {
        m50394d(this.f30711G0);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m50389c(String str, String str2) {
        if (this.f30728a.mo23502X()) {
            HashMap hashMap = new HashMap();
            hashMap.put(C11687c.f33751Z0, str);
            hashMap.put("status", str2);
            C11687c.m52645a(this.f30728a).getBuyerPaymentStatus(ChatActivityNew.f27655C6, hashMap).enqueue(new C11099b());
        }
    }

    /* renamed from: e */
    private void m50396e(String str) {
        C11991a aVar = this.f30754y0;
        if (aVar != null) {
            try {
                aVar.mo41070a(str);
                m50398f(true);
            } catch (PaymentException e) {
                mo38886a((String) null, e.getMessage());
            }
        }
    }

    /* renamed from: b */
    public void mo38844b(PaymentError paymentError) {
        if (m50434z()) {
            mo38888b(C11645a.f33469a, "credit_card");
        }
        mo38886a((String) null, m50388c(paymentError));
    }

    /* renamed from: a */
    private void m50376a(TextView textView, EditText editText, View view, String str) {
        textView.setVisibility(0);
        textView.setText(str);
        view.setBackground(C0841b.m4928c(this.f30720S, C10232R.C10235drawable.bg_border_red_1_5));
        editText.setTextColor(C0841b.m4915a(this.f30720S, (int) C10232R.C10234color.red_lite_3));
    }

    /* renamed from: g */
    public boolean mo38893g() {
        return this.f30723V.isShowing();
    }

    /* renamed from: b */
    private PaymentParams m50382b(String str) throws PaymentException {
        String trim = this.f30738i0.getText().toString().trim();
        String r = m50420r();
        String b = mo38887b();
        String c = mo38889c();
        String obj = this.f30737h0.getText().toString();
        String p = m50417p();
        StringBuilder sb = new StringBuilder();
        sb.append("20");
        sb.append(c);
        CardPaymentParams cardPaymentParams = new CardPaymentParams(str, p, r, trim, b, sb.toString(), obj);
        return cardPaymentParams;
    }

    /* renamed from: a */
    private void m50375a(TextView textView) {
        textView.setVisibility(8);
    }

    /* renamed from: c */
    private String m50388c(PaymentError paymentError) {
        try {
            return new JSONObject(paymentError.mo40763b()).getString("description");
        } catch (Exception unused) {
            return paymentError.mo40764c();
        }
    }

    /* renamed from: a */
    public void mo38880a() {
        mo38883a(this.f30731b0, (View) this.f30729a0);
        mo38883a(this.f30732c0, (View) this.f30736g0);
        mo38883a(this.f30733d0, (View) this.f30737h0);
        mo38883a(this.f30734e0, (View) this.f30738i0);
    }

    /* renamed from: a */
    public void mo38883a(TextView textView, View view) {
        if (textView.getVisibility() == 0) {
            view.setBackground(C0841b.m4928c(this.f30720S, C10232R.C10235drawable.bg_border_red_1_5));
        } else {
            view.setBackground(C0841b.m4928c(this.f30720S, C10232R.C10235drawable.bg_border_gray_f2_4));
        }
    }

    /* renamed from: b */
    public void mo38888b(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(C11687c.f33751Z0, str2);
        hashMap.put("status", str);
        C11687c.m52645a(this.f30728a).updatePaymentProcess(ChatActivityNew.f27655C6, hashMap).enqueue(new C11111m(str));
    }

    /* renamed from: a */
    public void mo38882a(View view, EditText editText) {
        mo38880a();
        editText.setTextColor(C0841b.m4915a(this.f30720S, (int) C10232R.C10234color.text_color_5b));
        view.setBackground(C0841b.m4928c(this.f30720S, C10232R.C10235drawable.bg_border_sky_blue_1_5));
    }

    /* renamed from: a */
    private void m50374a(EditText editText, String str) {
        editText.requestFocus();
        editText.setError(str);
        editText.setSelection(editText.getText().toString().trim().length());
        this.f30728a.mo23668v0();
    }

    /* renamed from: d */
    public C11112n mo38890d() {
        return this.f30712H0;
    }

    /* renamed from: a */
    public void mo38885a(C11113o oVar) {
        this.f30753x0 = oVar;
    }

    /* renamed from: a */
    public void mo38840a(CheckoutInfo checkoutInfo) {
        if (checkoutInfo == null) {
            m50398f(false);
            mo38886a((String) null, (String) null);
            return;
        }
        m50412n().runOnUiThread(new C11094i(this));
    }

    /* renamed from: a */
    public void mo38842a(Transaction transaction) {
        if (transaction == null) {
            m50398f(false);
            return;
        }
        if (transaction.mo41033i() == TransactionType.SYNC) {
            m50412n().runOnUiThread(new C11108k());
        } else if (m50434z()) {
            this.f30753x0.mo37759a(transaction.mo41028c());
            ChatActivityNew.f27658F6 = false;
            m50364C();
        } else {
            m50380a(C11645a.f33475g);
        }
    }

    /* renamed from: a */
    public void mo38843a(Transaction transaction, PaymentError paymentError) {
        m50398f(false);
        mo38886a((String) null, m50388c(paymentError));
        if (m50434z()) {
            this.f30728a.mo23473E(C11644i.f33299f4);
            mo38888b(C11645a.f33469a, "credit_card");
        }
    }

    /* renamed from: a */
    public void mo38886a(String str, String str2) {
        ((Activity) this.f30720S).runOnUiThread(new C11101d(str, str2));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m50380a(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("auth_token", this.f30728a.mo23640m());
        hashMap.put("status", str);
        C11687c.m52645a(this.f30728a).registerPaymentCard(this.f30728a.mo23476G(), hashMap).enqueue(new C11102e(str));
    }

    /* renamed from: a */
    public void mo38884a(C11112n nVar) {
        this.f30712H0 = nVar;
    }
}
