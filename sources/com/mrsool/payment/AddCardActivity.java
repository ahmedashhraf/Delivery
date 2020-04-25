package com.mrsool.payment;

import android.app.Activity;
import android.app.Dialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.C0195i0;
import androidx.core.content.C0841b;
import com.facebook.appevents.AppEventsConstants;
import com.google.android.material.bottomsheet.C5665a;
import com.google.android.material.button.MaterialButton;
import com.mrsool.C10232R;
import com.mrsool.C10787d;
import com.mrsool.bean.PaymentSaveMainBean;
import com.mrsool.bean.PaymentStatusMainBean;
import com.mrsool.chat.C10526n.C10527a;
import com.mrsool.chat.ChatActivityNew;
import com.mrsool.countrypicker.activity.CountryPickerActivity;
import com.mrsool.utils.C11571b;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C11644i.C11645a;
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

public class AddCardActivity extends C10787d implements C11980c, OnFocusChangeListener, OnClickListener {

    /* renamed from: S */
    private final int f30627S = 1;

    /* renamed from: T */
    private final int f30628T = 1000;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public C11991a f30629U;

    /* renamed from: V */
    private CardEditText f30630V;

    /* renamed from: W */
    private TextView f30631W;

    /* renamed from: X */
    private TextView f30632X;

    /* renamed from: Y */
    private TextView f30633Y;

    /* renamed from: Z */
    private TextView f30634Z;

    /* renamed from: a0 */
    private TextView f30635a0;
    /* access modifiers changed from: private */

    /* renamed from: b0 */
    public EditText f30636b0;
    /* access modifiers changed from: private */

    /* renamed from: c0 */
    public EditText f30637c0;
    /* access modifiers changed from: private */

    /* renamed from: d0 */
    public EditText f30638d0;

    /* renamed from: e0 */
    private LinearLayout f30639e0;

    /* renamed from: f0 */
    private LinearLayout f30640f0;

    /* renamed from: g0 */
    private LinearLayout f30641g0;

    /* renamed from: h0 */
    private LinearLayout f30642h0;

    /* renamed from: i0 */
    private LinearLayout f30643i0;

    /* renamed from: j0 */
    private LinearLayout f30644j0;

    /* renamed from: k0 */
    private LinearLayout f30645k0;

    /* renamed from: l0 */
    private LinearLayout f30646l0;
    /* access modifiers changed from: private */

    /* renamed from: m0 */
    public MaterialButton f30647m0;

    /* renamed from: n0 */
    private ImageView f30648n0;

    /* renamed from: o0 */
    private ImageView f30649o0;
    /* access modifiers changed from: private */

    /* renamed from: p0 */
    public Dialog f30650p0;

    /* renamed from: q0 */
    private C5665a f30651q0;
    /* access modifiers changed from: private */

    /* renamed from: r0 */
    public C5665a f30652r0;

    /* renamed from: s0 */
    private boolean f30653s0 = false;
    /* access modifiers changed from: private */

    /* renamed from: t0 */
    public int f30654t0 = 0;

    /* renamed from: u0 */
    private boolean f30655u0 = false;

    /* renamed from: v0 */
    private boolean f30656v0 = false;

    /* renamed from: w0 */
    private boolean f30657w0;

    /* renamed from: x0 */
    private String[] f30658x0 = {"visa", "master", "mastercard", "mada"};
    /* access modifiers changed from: private */

    /* renamed from: y0 */
    public String f30659y0 = "";

    /* renamed from: z0 */
    private ServiceConnection f30660z0 = new C11075c();

    /* renamed from: com.mrsool.payment.AddCardActivity$a */
    class C11073a implements Callback<PaymentStatusMainBean> {

        /* renamed from: a */
        final /* synthetic */ String f30661a;

        C11073a(String str) {
            this.f30661a = str;
        }

        public void onFailure(Call<PaymentStatusMainBean> call, Throwable th) {
            AddCardActivity.this.m50323g(true);
        }

        public void onResponse(Call<PaymentStatusMainBean> call, Response<PaymentStatusMainBean> response) {
            if (response.isSuccessful() && ((PaymentStatusMainBean) response.body()).getCode().intValue() <= 300) {
                if (this.f30661a.equalsIgnoreCase(C11645a.f33474f)) {
                    AddCardActivity.this.f29642a.mo23473E(CheckoutActivity.f34069j0);
                } else {
                    this.f30661a.equalsIgnoreCase(C11645a.f33469a);
                }
            }
        }
    }

    /* renamed from: com.mrsool.payment.AddCardActivity$b */
    class C11074b implements Callback<PaymentSaveMainBean> {

        /* renamed from: a */
        final /* synthetic */ String f30663a;

        C11074b(String str) {
            this.f30663a = str;
        }

        public void onFailure(Call<PaymentSaveMainBean> call, Throwable th) {
            AddCardActivity.this.m50314d(null, null);
        }

        public void onResponse(Call<PaymentSaveMainBean> call, Response<PaymentSaveMainBean> response) {
            AddCardActivity.this.m50323g(false);
            if (!response.isSuccessful()) {
                AddCardActivity.this.m50314d(null, null);
            } else if (((PaymentSaveMainBean) response.body()).getCode().intValue() > 300) {
                AddCardActivity.this.m50314d(null, ((PaymentSaveMainBean) response.body()).getMessage());
            } else if (((PaymentSaveMainBean) response.body()).getRegistrationDetails().getPaymentSaveData() != null) {
                AddCardActivity.this.f30659y0 = ((PaymentSaveMainBean) response.body()).getRegistrationDetails().getPaymentSaveData().getCheckoutId();
                if (!this.f30663a.equalsIgnoreCase("complete")) {
                    return;
                }
                if (((PaymentSaveMainBean) response.body()).getRegistrationDetails().getRegistrationStatus().equalsIgnoreCase("registered")) {
                    AddCardActivity.this.setResult(-1);
                    AddCardActivity.this.finish();
                    return;
                }
                AddCardActivity.this.m50314d(null, ((PaymentSaveMainBean) response.body()).getRegistrationDetails().getPaymentSaveData().getError());
                AddCardActivity.this.m50326i("initiate");
            }
        }
    }

    /* renamed from: com.mrsool.payment.AddCardActivity$c */
    class C11075c implements ServiceConnection {
        C11075c() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            AddCardActivity.this.f30629U = (C11991a) iBinder;
            AddCardActivity.this.f30629U.mo41069a((C11980c) AddCardActivity.this);
            try {
                AddCardActivity.this.f30629U.mo41074b(C11978a.LIVE);
            } catch (PaymentException e) {
                AddCardActivity.this.f29642a.mo23487L(e.getMessage());
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            AddCardActivity.this.f30629U = null;
        }
    }

    /* renamed from: com.mrsool.payment.AddCardActivity$d */
    class C11076d implements TextWatcher {
        C11076d() {
        }

        public void afterTextChanged(Editable editable) {
            if (AddCardActivity.this.m50283S().length() >= 16 && TextUtils.isEmpty(AddCardActivity.this.m50280P())) {
                AddCardActivity.this.f30636b0.requestFocus();
            }
            if (AddCardActivity.this.f30647m0.isEnabled()) {
                AddCardActivity.this.m50281Q();
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.mrsool.payment.AddCardActivity$e */
    class C11077e implements TextWatcher {
        C11077e() {
        }

        public void afterTextChanged(Editable editable) {
            try {
                int length = AddCardActivity.this.f30636b0.getText().toString().trim().length();
                String str = "/";
                if (AddCardActivity.this.f30654t0 <= length && length < 3) {
                    int parseInt = Integer.parseInt(AddCardActivity.this.f30636b0.getText().toString());
                    if (length == 1 && parseInt >= 2) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(AppEventsConstants.EVENT_PARAM_VALUE_NO);
                        sb.append(parseInt);
                        sb.append(str);
                        AddCardActivity.this.f30636b0.setText(sb.toString());
                        AddCardActivity.this.f30636b0.setSelection(3);
                    } else if (length == 2 && parseInt <= 12) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(AddCardActivity.this.f30636b0.getText().toString());
                        sb2.append(str);
                        AddCardActivity.this.f30636b0.setText(sb2.toString());
                        AddCardActivity.this.f30636b0.setSelection(3);
                    } else if (length == 2 && parseInt > 12) {
                        AddCardActivity.this.f30636b0.setText("1");
                        AddCardActivity.this.f30636b0.setSelection(1);
                    }
                } else if (length > 2 && !AddCardActivity.this.f30636b0.getText().toString().trim().contains(str)) {
                    String substring = AddCardActivity.this.f30636b0.getText().toString().trim().substring(0, 2);
                    String substring2 = AddCardActivity.this.f30636b0.getText().toString().trim().substring(length - 1, length);
                    EditText g = AddCardActivity.this.f30636b0;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(substring);
                    sb3.append(str);
                    sb3.append(substring2);
                    g.setText(sb3.toString());
                    AddCardActivity.this.f30636b0.setSelection(AddCardActivity.this.f30636b0.getText().length());
                } else if (length == 5) {
                    if (AddCardActivity.this.m50307b0()) {
                        AddCardActivity.this.f30637c0.requestFocus();
                    } else {
                        AddCardActivity.this.m50315d(true);
                    }
                }
                if (AddCardActivity.this.f30647m0.isEnabled()) {
                    AddCardActivity.this.m50281Q();
                }
            } catch (Exception unused) {
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            AddCardActivity.this.f30654t0 = charSequence.length();
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.mrsool.payment.AddCardActivity$f */
    class C11078f implements TextWatcher {

        /* renamed from: a */
        boolean f30668a;

        C11078f() {
        }

        public void afterTextChanged(Editable editable) {
            if (editable.length() >= 3) {
                AddCardActivity.this.f30638d0.requestFocus();
            }
            if (AddCardActivity.this.f30647m0.isEnabled()) {
                AddCardActivity.this.m50281Q();
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.mrsool.payment.AddCardActivity$g */
    class C11079g implements TextWatcher {
        C11079g() {
        }

        public void afterTextChanged(Editable editable) {
            AddCardActivity.this.m50281Q();
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.mrsool.payment.AddCardActivity$h */
    class C11080h implements Runnable {

        /* renamed from: com.mrsool.payment.AddCardActivity$h$a */
        class C11081a implements Runnable {
            C11081a() {
            }

            public void run() {
                AddCardActivity.this.m50326i("complete");
            }
        }

        C11080h() {
        }

        public void run() {
            new Handler().postDelayed(new C11081a(), 2000);
        }
    }

    /* renamed from: com.mrsool.payment.AddCardActivity$i */
    class C11082i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ boolean f30673a;

        C11082i(boolean z) {
            this.f30673a = z;
        }

        public void run() {
            if (AddCardActivity.this.f30650p0 == null) {
                AddCardActivity addCardActivity = AddCardActivity.this;
                addCardActivity.f30650p0 = addCardActivity.f29642a.mo23508a((int) C10232R.layout.dialog_payment_progress, true);
                AddCardActivity.this.f30650p0.setCancelable(false);
            }
            if (this.f30673a && !AddCardActivity.this.isFinishing() && !AddCardActivity.this.f30650p0.isShowing()) {
                AddCardActivity.this.f30650p0.show();
            } else if (!this.f30673a && !AddCardActivity.this.isFinishing() && AddCardActivity.this.f30650p0.isShowing()) {
                AddCardActivity.this.f30650p0.dismiss();
            }
        }
    }

    /* renamed from: com.mrsool.payment.AddCardActivity$j */
    class C11083j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f30676a;

        /* renamed from: b */
        final /* synthetic */ String f30677b;

        C11083j(String str, String str2) {
            this.f30676a = str;
            this.f30677b = str2;
        }

        /* renamed from: a */
        public /* synthetic */ void mo38868a(View view) {
            if (!AddCardActivity.this.isFinishing() && AddCardActivity.this.f30652r0 != null && AddCardActivity.this.f30652r0.isShowing()) {
                AddCardActivity.this.f30652r0.dismiss();
            }
        }

        public void run() {
            View inflate = AddCardActivity.this.getLayoutInflater().inflate(C10232R.layout.bottom_card_error, null);
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(C10232R.C10236id.btnClose);
            TextView textView = (TextView) inflate.findViewById(C10232R.C10236id.tvDesc);
            ((TextView) inflate.findViewById(C10232R.C10236id.tvTitle)).setText(TextUtils.isEmpty(this.f30676a) ? AddCardActivity.this.getString(C10232R.string.payment_error_title) : this.f30676a);
            textView.setText(TextUtils.isEmpty(this.f30677b) ? AddCardActivity.this.getString(C10232R.string.payment_error_detail) : this.f30677b);
            materialButton.setOnClickListener(new C11086a(this));
            if (AddCardActivity.this.f30652r0 == null) {
                AddCardActivity addCardActivity = AddCardActivity.this;
                addCardActivity.f30652r0 = new C5665a(addCardActivity);
                AddCardActivity.this.f30652r0.setContentView(inflate);
            }
            if (!AddCardActivity.this.isFinishing() && AddCardActivity.this.f30652r0 != null && !AddCardActivity.this.f30652r0.isShowing()) {
                AddCardActivity.this.f30652r0.show();
            }
        }
    }

    /* renamed from: com.mrsool.payment.AddCardActivity$k */
    class C11084k implements Callback<PaymentStatusMainBean> {
        C11084k() {
        }

        public void onFailure(Call<PaymentStatusMainBean> call, Throwable th) {
            AddCardActivity.this.m50323g(false);
        }

        public void onResponse(Call<PaymentStatusMainBean> call, Response<PaymentStatusMainBean> response) {
            AddCardActivity.this.m50323g(false);
            if (response.isSuccessful() && ((PaymentStatusMainBean) response.body()).getCode().intValue() <= 300) {
                PaymentStatusMainBean paymentStatusMainBean = (PaymentStatusMainBean) response.body();
                boolean isPaid = paymentStatusMainBean.getPaymentHash().isPaid();
                String str = C11644i.f33299f4;
                if (!isPaid) {
                    AddCardActivity.this.f29642a.mo23494P();
                    if (paymentStatusMainBean.getPaymentHash().getPaymentStatus().equalsIgnoreCase(C11645a.f33470b)) {
                        AddCardActivity.this.f29642a.mo23473E(str);
                        AddCardActivity.this.finish();
                    } else if (paymentStatusMainBean.getPaymentHash().getPaymentStatus().equalsIgnoreCase(C11645a.f33471c)) {
                        ChatActivityNew.f27659G6 = ((PaymentStatusMainBean) response.body()).getPaymentHash().getData().getCheckoutId();
                        AddCardActivity.this.f29642a.mo23473E(str);
                        AddCardActivity.this.m50314d(null, null);
                    }
                } else {
                    AddCardActivity.this.f29642a.mo23473E(str);
                    AddCardActivity addCardActivity = AddCardActivity.this;
                    StringBuilder sb = new StringBuilder();
                    sb.append(AddCardActivity.this.getString(C10232R.string.checkout_ui_callback_scheme));
                    sb.append("://callback");
                    addCardActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(sb.toString())));
                    AddCardActivity.this.finish();
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public String m50280P() {
        String Y = m50289Y();
        if (!TextUtils.isEmpty(Y)) {
            m50299a(this.f30632X, this.f30630V, this.f30639e0, Y);
        }
        return Y;
    }

    /* access modifiers changed from: private */
    /* renamed from: Q */
    public void m50281Q() {
        if (!mo38832M()) {
            this.f29642a.mo23558a(false, (TextView) this.f30647m0, true);
            return;
        }
        this.f29642a.mo23558a(true, (TextView) this.f30647m0, false);
        m50298a(this.f30632X);
        m50298a(this.f30633Y);
        m50298a(this.f30634Z);
        m50298a(this.f30635a0);
    }

    /* renamed from: R */
    private String m50282R() {
        String cardType = this.f30630V.getCardType();
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
    /* renamed from: S */
    public String m50283S() {
        try {
            return this.f30630V.getCardNumber();
        } catch (Exception unused) {
            return this.f30630V.getText().toString().trim();
        }
    }

    /* renamed from: T */
    private void m50284T() {
        if (TextUtils.isEmpty(m50289Y())) {
            m50298a(this.f30632X);
        }
        if (TextUtils.isEmpty(m50290Z())) {
            m50298a(this.f30633Y);
        }
        if (TextUtils.isEmpty(m50287W())) {
            m50298a(this.f30634Z);
        }
        if (TextUtils.isEmpty(m50303a0())) {
            m50298a(this.f30635a0);
        }
    }

    /* renamed from: U */
    private void m50285U() {
        this.f30630V.requestFocus();
        this.f29642a.mo23668v0();
        this.f30630V.setCardEvent(new C11089d(this));
    }

    /* renamed from: V */
    private void m50286V() {
        if (this.f30653s0) {
            this.f30631W = (TextView) findViewById(C10232R.C10236id.tvCountryName);
            this.f30644j0 = (LinearLayout) findViewById(C10232R.C10236id.llCountrySub);
            this.f30649o0 = (ImageView) findViewById(C10232R.C10236id.ivCountry);
            this.f30643i0.setVisibility(0);
            this.f30644j0.setOnClickListener(this);
            return;
        }
        this.f30643i0.setVisibility(8);
    }

    /* renamed from: W */
    private String m50287W() {
        if (TextUtils.isEmpty(this.f30637c0.getText().toString())) {
            return getString(C10232R.string.payment_error_blank_field);
        }
        return !CardPaymentParams.m53958j(this.f30637c0.getText().toString().trim()) ? getString(C10232R.string.payment_error_security_code_invalid) : "";
    }

    /* renamed from: X */
    private boolean m50288X() {
        if (TextUtils.isEmpty(this.f30630V.getText().toString())) {
            m50297a((EditText) this.f30630V, getString(C10232R.string.payment_error_enter_card_number));
            return false;
        } else if (TextUtils.isEmpty(this.f30636b0.getText().toString())) {
            m50297a(this.f30636b0, getString(C10232R.string.payment_error_enter_card_date));
            return false;
        } else if (!m50307b0()) {
            m50297a(this.f30636b0, getString(C10232R.string.checkout_error_expiration_date_invalid));
            return false;
        } else if (TextUtils.isEmpty(this.f30637c0.getText().toString())) {
            m50297a(this.f30637c0, getString(C10232R.string.payment_error_enter_card_cvv));
            return false;
        } else if (!CardPaymentParams.m53958j(this.f30637c0.getText().toString().trim())) {
            m50297a(this.f30637c0, getString(C10232R.string.checkout_error_security_code_invalid));
            return false;
        } else if (TextUtils.isEmpty(this.f30638d0.getText().toString().trim())) {
            m50297a(this.f30638d0, getString(C10232R.string.payment_error_enter_card_holder));
            return false;
        } else if (CardPaymentParams.m53961m(this.f30638d0.getText().toString().trim())) {
            return true;
        } else {
            m50297a(this.f30638d0, getString(C10232R.string.checkout_error_card_holder_invalid));
            return false;
        }
    }

    /* renamed from: Y */
    private String m50289Y() {
        if (TextUtils.isEmpty(m50283S())) {
            return getString(C10232R.string.payment_error_blank_field);
        }
        if (m50283S().length() < 16) {
            return getString(C10232R.string.payment_error_min_card_digit);
        }
        return !m50330k(this.f30630V.getCardType()) ? getString(C10232R.string.payment_error_valid_card_brand) : "";
    }

    /* renamed from: Z */
    private String m50290Z() {
        if (TextUtils.isEmpty(this.f30636b0.getText().toString())) {
            return getString(C10232R.string.payment_error_blank_field);
        }
        return !m50307b0() ? getString(C10232R.string.checkout_error_expiration_date_invalid) : "";
    }

    /* renamed from: a0 */
    private String m50303a0() {
        if (TextUtils.isEmpty(this.f30638d0.getText().toString().trim())) {
            return getString(C10232R.string.payment_error_blank_field);
        }
        return !CardPaymentParams.m53961m(this.f30638d0.getText().toString().trim()) ? getString(C10232R.string.checkout_error_card_holder_invalid) : "";
    }

    /* access modifiers changed from: private */
    /* renamed from: b0 */
    public boolean m50307b0() {
        return C11119m.m50478b(mo38830K(), mo38831L());
    }

    /* renamed from: c0 */
    private void m50312c0() {
        runOnUiThread(new C11087b(this));
    }

    /* renamed from: d0 */
    private void m50316d0() {
        this.f30630V.setText(C10527a.f28546g);
        this.f30636b0.setText("01/21");
        this.f30637c0.setText("111");
        this.f30638d0.setText("Test User");
    }

    /* renamed from: e0 */
    private void m50319e0() {
        this.f30630V.addTextChangedListener(new C11076d());
        this.f30636b0.addTextChangedListener(new C11077e());
        this.f30637c0.addTextChangedListener(new C11078f());
        this.f30638d0.addTextChangedListener(new C11079g());
    }

    private void initViews() {
        mo38413g(getResources().getString(C10232R.string.title_add_card));
        this.f30648n0 = (ImageView) findViewById(C10232R.C10236id.ivCardType);
        this.f30630V = (CardEditText) findViewById(C10232R.C10236id.edCardNumber);
        this.f30630V.setImeOptions(5);
        this.f30637c0 = (EditText) findViewById(C10232R.C10236id.edCardCvv);
        this.f30636b0 = (EditText) findViewById(C10232R.C10236id.edCardExpiryDate);
        this.f30638d0 = (EditText) findViewById(C10232R.C10236id.edNameOnCard);
        this.f30639e0 = (LinearLayout) findViewById(C10232R.C10236id.llCardNumber);
        this.f30640f0 = (LinearLayout) findViewById(C10232R.C10236id.llCardExpiryDate);
        this.f30641g0 = (LinearLayout) findViewById(C10232R.C10236id.llCardCvv);
        this.f30642h0 = (LinearLayout) findViewById(C10232R.C10236id.llNameOnCard);
        this.f30645k0 = (LinearLayout) findViewById(C10232R.C10236id.llQuestionExpiry);
        this.f30646l0 = (LinearLayout) findViewById(C10232R.C10236id.llQuestionCvv);
        this.f30643i0 = (LinearLayout) findViewById(C10232R.C10236id.llCountry);
        this.f30647m0 = (MaterialButton) findViewById(C10232R.C10236id.btnPay);
        this.f30632X = (TextView) findViewById(C10232R.C10236id.tvCardError);
        this.f30633Y = (TextView) findViewById(C10232R.C10236id.tvDateError);
        this.f30634Z = (TextView) findViewById(C10232R.C10236id.tvCvvError);
        this.f30635a0 = (TextView) findViewById(C10232R.C10236id.tvNameError);
        this.f30647m0.setOnClickListener(this);
        this.f30645k0.setOnClickListener(this);
        this.f30646l0.setOnClickListener(this);
        this.f30630V.setOnFocusChangeListener(this);
        this.f30637c0.setOnFocusChangeListener(this);
        this.f30636b0.setOnFocusChangeListener(this);
        this.f30638d0.setOnFocusChangeListener(this);
        m50286V();
        m50319e0();
        m50285U();
        this.f29642a.mo23608d(this.f30638d0);
    }

    /* renamed from: m */
    private void m50333m(String str) {
        C11991a aVar = this.f30629U;
        if (aVar != null) {
            try {
                aVar.mo41070a(str);
                m50323g(true);
            } catch (PaymentException e) {
                m50314d(null, e.getMessage());
            }
        }
    }

    /* renamed from: J */
    public void mo38829J() {
        mo38837a(this.f30632X, this.f30639e0);
        mo38837a(this.f30633Y, this.f30640f0);
        mo38837a(this.f30634Z, this.f30641g0);
        mo38837a(this.f30635a0, this.f30642h0);
    }

    /* renamed from: K */
    public String mo38830K() {
        String trim = this.f30636b0.getText().toString().trim();
        if (trim.length() < 2) {
            return "";
        }
        return trim.substring(0, 2);
    }

    /* renamed from: L */
    public String mo38831L() {
        String trim = this.f30636b0.getText().toString().trim();
        return trim.length() == 5 ? trim.substring(3, 5) : "";
    }

    /* renamed from: M */
    public boolean mo38832M() {
        return TextUtils.isEmpty(m50289Y()) && TextUtils.isEmpty(m50290Z()) && TextUtils.isEmpty(m50287W()) && TextUtils.isEmpty(m50303a0());
    }

    /* renamed from: N */
    public /* synthetic */ void mo38833N() {
        m50332l(this.f30659y0);
    }

    /* renamed from: O */
    public /* synthetic */ void mo38834O() {
        new C11571b(this).mo39718a(ChatActivityNew.f27655C6, true);
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

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, @C0195i0 Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 1) {
            m50296a(intent);
        }
        if (i2 != 0 || i != 1000) {
            return;
        }
        if (this.f29642a.mo23620g()) {
            m50323g(true);
        } else {
            ChatActivityNew.f27658F6 = true;
        }
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case C10232R.C10236id.btnPay /*2131361983*/:
                if (this.f29642a.mo23620g()) {
                    if (this.f29642a.mo23497S()) {
                        m50333m(this.f30659y0);
                        break;
                    }
                } else {
                    m50323g(false);
                    m50314d(null, getString(C10232R.string.msg_info_internet_connection));
                    return;
                }
                break;
            case C10232R.C10236id.ivClose /*2131362756*/:
                this.f29642a.mo23494P();
                finish();
                break;
            case C10232R.C10236id.llCountrySub /*2131363005*/:
                startActivityForResult(new Intent(this, CountryPickerActivity.class), 1);
                break;
            case C10232R.C10236id.llQuestionCvv /*2131363132*/:
                m50321f(false);
                break;
            case C10232R.C10236id.llQuestionExpiry /*2131363133*/:
                m50321f(true);
                break;
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f29642a.mo23590c((Activity) this);
        setContentView((int) C10232R.layout.activity_add_card);
        initViews();
        ChatActivityNew.f27658F6 = false;
        try {
            this.f30659y0 = ChatActivityNew.f27659G6;
        } catch (Exception unused) {
        }
        m50326i("initiate");
    }

    public void onFocusChange(View view, boolean z) {
        int id = view.getId();
        if (id != C10232R.C10236id.edNameOnCard) {
            switch (id) {
                case C10232R.C10236id.edCardCvv /*2131362148*/:
                    mo38836a((View) this.f30641g0, (EditText) view);
                    m50284T();
                    if (!z) {
                        m50311c(true);
                        break;
                    }
                    break;
                case C10232R.C10236id.edCardExpiryDate /*2131362149*/:
                    mo38836a((View) this.f30640f0, (EditText) view);
                    m50284T();
                    if (!z) {
                        m50315d(true);
                        break;
                    }
                    break;
                case C10232R.C10236id.edCardNumber /*2131362150*/:
                    mo38836a((View) this.f30639e0, (EditText) view);
                    m50284T();
                    if (!z) {
                        m50280P();
                        break;
                    }
                    break;
            }
        } else {
            mo38836a((View) this.f30642h0, (EditText) view);
            m50282R();
            m50284T();
            if (!z) {
                m50318e(true);
            }
        }
        m50281Q();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        Intent intent = new Intent(this, ConnectService.class);
        startService(intent);
        bindService(intent, this.f30660z0, 1);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        unbindService(this.f30660z0);
        stopService(new Intent(this, ConnectService.class));
    }

    /* renamed from: q */
    public void mo38850q() {
    }

    /* renamed from: c */
    private void m50311c(boolean z) {
        if (z) {
            String W = m50287W();
            if (!TextUtils.isEmpty(W)) {
                m50299a(this.f30634Z, this.f30637c0, this.f30641g0, W);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m50315d(boolean z) {
        if (z) {
            String Z = m50290Z();
            if (!TextUtils.isEmpty(Z)) {
                m50299a(this.f30633Y, this.f30636b0, this.f30640f0, Z);
            }
        }
    }

    /* renamed from: e */
    private void m50318e(boolean z) {
        if (z) {
            String a0 = m50303a0();
            if (!TextUtils.isEmpty(a0)) {
                m50299a(this.f30635a0, this.f30638d0, this.f30642h0, a0);
            }
        }
    }

    /* renamed from: f */
    private void m50321f(boolean z) {
        View inflate = getLayoutInflater().inflate(C10232R.layout.bottom_card_element_info, null);
        TextView textView = (TextView) inflate.findViewById(C10232R.C10236id.tvTitle);
        TextView textView2 = (TextView) inflate.findViewById(C10232R.C10236id.tvDesc);
        ImageView imageView = (ImageView) inflate.findViewById(C10232R.C10236id.ivDemoImage);
        MaterialButton materialButton = (MaterialButton) inflate.findViewById(C10232R.C10236id.btnOk);
        if (z) {
            textView.setText(getResources().getString(C10232R.string.lbl_expiration_date));
            textView2.setText(getResources().getString(C10232R.string.msg_exp_date_desc));
            imageView.setImageResource(C10232R.C10235drawable.img_card_exp_date);
        } else {
            textView.setText(getString(C10232R.string.llb_cvv));
            textView2.setText(getString(C10232R.string.msg_cvv_desc));
            imageView.setImageResource(C10232R.C10235drawable.img_card_cvv);
        }
        materialButton.setOnClickListener(new C11088c(this));
        this.f30651q0 = new C5665a(this);
        this.f30651q0.setContentView(inflate);
        if (!isFinishing()) {
            C5665a aVar = this.f30651q0;
            if (aVar != null && !aVar.isShowing()) {
                this.f30651q0.show();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m50323g(boolean z) {
        runOnUiThread(new C11082i(z));
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m50326i(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("auth_token", this.f29642a.mo23640m());
        hashMap.put("status", str);
        C11687c.m52645a(this.f29642a).registerPaymentCard(this.f29642a.mo23476G(), hashMap).enqueue(new C11074b(str));
    }

    /* renamed from: k */
    private boolean m50330k(String str) {
        for (String equalsIgnoreCase : this.f30658x0) {
            if (str.equalsIgnoreCase(equalsIgnoreCase)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: l */
    private void m50332l(String str) {
        if (!this.f29642a.mo23620g()) {
            m50323g(false);
            m50314d(null, getString(C10232R.string.msg_info_internet_connection));
            return;
        }
        try {
            PaymentParams j = m50328j(str);
            StringBuilder sb = new StringBuilder();
            sb.append(getString(C10232R.string.checkout_ui_callback_scheme));
            sb.append("://callback");
            j.mo40895e(sb.toString());
            this.f30629U.mo41073b(new Transaction(j));
        } catch (PaymentException e) {
            m50314d(null, e.mo40774a().mo40764c());
        }
    }

    /* renamed from: j */
    public /* synthetic */ void mo38846j(int i) {
        this.f30648n0.setImageResource(i);
    }

    /* renamed from: j */
    private PaymentParams m50328j(String str) throws PaymentException {
        String trim = this.f30638d0.getText().toString().trim();
        String S = m50283S();
        String K = mo38830K();
        String L = mo38831L();
        String obj = this.f30637c0.getText().toString();
        String R = m50282R();
        StringBuilder sb = new StringBuilder();
        sb.append("20");
        sb.append(L);
        CardPaymentParams cardPaymentParams = new CardPaymentParams(str, R, S, trim, K, sb.toString(), obj);
        return cardPaymentParams;
    }

    /* renamed from: b */
    public void mo38844b(PaymentError paymentError) {
        m50323g(false);
        m50314d(null, m50309c(paymentError));
    }

    /* renamed from: c */
    private void m50310c(String str, String str2) {
        if (this.f29642a.mo23502X()) {
            HashMap hashMap = new HashMap();
            hashMap.put(C11687c.f33751Z0, str);
            hashMap.put("status", str2);
            C11687c.m52645a(this.f29642a).getBuyerPaymentStatus(ChatActivityNew.f27655C6, hashMap).enqueue(new C11084k());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m50314d(String str, String str2) {
        runOnUiThread(new C11083j(str, str2));
    }

    /* renamed from: b */
    public void mo38845b(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(C11687c.f33751Z0, str2);
        hashMap.put("status", str);
        C11687c.m52645a(this.f29642a).updatePaymentProcess(ChatActivityNew.f27655C6, hashMap).enqueue(new C11073a(str));
    }

    /* renamed from: a */
    public void mo38840a(CheckoutInfo checkoutInfo) {
        if (checkoutInfo == null) {
            m50323g(false);
            this.f29642a.mo23653q0();
            return;
        }
        runOnUiThread(new C11090e(this));
    }

    /* renamed from: c */
    private String m50309c(PaymentError paymentError) {
        try {
            return new JSONObject(paymentError.mo40763b()).getString("description");
        } catch (Exception unused) {
            return paymentError.mo40764c();
        }
    }

    /* renamed from: a */
    public void mo38842a(Transaction transaction) {
        if (transaction == null) {
            m50323g(false);
            return;
        }
        if (transaction.mo41033i() == TransactionType.SYNC) {
            runOnUiThread(new C11080h());
        } else {
            m50323g(false);
            m50326i("complete");
        }
    }

    /* renamed from: a */
    public void mo38843a(Transaction transaction, PaymentError paymentError) {
        m50323g(false);
        this.f29642a.mo23473E(C11644i.f33299f4);
        m50314d(null, m50309c(paymentError));
    }

    /* renamed from: a */
    private void m50299a(TextView textView, EditText editText, LinearLayout linearLayout, String str) {
        textView.setVisibility(0);
        textView.setText(str);
        linearLayout.setBackground(C0841b.m4928c(this, C10232R.C10235drawable.bg_border_red_1_5));
        editText.setTextColor(C0841b.m4915a((Context) this, (int) C10232R.C10234color.red_lite_3));
    }

    /* renamed from: a */
    private void m50298a(TextView textView) {
        textView.setVisibility(8);
    }

    /* renamed from: a */
    public void mo38837a(TextView textView, LinearLayout linearLayout) {
        if (textView.getVisibility() == 0) {
            linearLayout.setBackground(C0841b.m4928c(this, C10232R.C10235drawable.bg_border_red_1_5));
        } else {
            linearLayout.setBackground(C0841b.m4928c(this, C10232R.C10235drawable.bg_border_gray_f2_4));
        }
    }

    /* renamed from: a */
    public void mo38836a(View view, EditText editText) {
        mo38829J();
        editText.setTextColor(C0841b.m4915a((Context) this, (int) C10232R.C10234color.text_color_5b));
        view.setBackground(C0841b.m4928c(this, C10232R.C10235drawable.bg_border_sky_blue_1_5));
    }

    /* renamed from: a */
    private void m50297a(EditText editText, String str) {
        editText.requestFocus();
        editText.setError(str);
        editText.setSelection(editText.getText().toString().trim().length());
        this.f29642a.mo23668v0();
    }

    /* renamed from: a */
    public /* synthetic */ void mo38835a(View view) {
        if (!isFinishing()) {
            C5665a aVar = this.f30651q0;
            if (aVar != null && aVar.isShowing()) {
                this.f30651q0.dismiss();
            }
        }
    }

    /* renamed from: a */
    private void m50296a(Intent intent) {
        this.f30649o0.setImageResource(intent.getIntExtra(C11644i.f33156O2, 0));
        this.f30631W.setText(intent.getStringExtra(C11644i.f33132L2));
    }
}
