package com.mrsool.p409me;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.C0193h0;
import androidx.appcompat.app.C0295d;
import androidx.core.content.C0841b;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior.C5662e;
import com.google.android.material.bottomsheet.C5665a;
import com.mrsool.C10232R;
import com.mrsool.HomeActivity;
import com.mrsool.bean.DefaultBean;
import com.mrsool.utils.C5887x;
import com.mrsool.utils.webservice.C11687c;
import java.util.HashMap;
import java.util.Map;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* renamed from: com.mrsool.me.e */
/* compiled from: AddSponsorBottomSheet */
public class C10889e {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public View f29949a;

    /* renamed from: b */
    BottomSheetBehavior f29950b;

    /* renamed from: c */
    private C5665a f29951c;

    /* renamed from: d */
    private Context f29952d;

    /* renamed from: e */
    private Bundle f29953e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C5887x f29954f;

    /* renamed from: g */
    private ProgressBar f29955g;

    /* renamed from: h */
    private TextView f29956h;

    /* renamed from: i */
    private RelativeLayout f29957i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public EditText f29958j;

    /* renamed from: k */
    private LinearLayout f29959k;

    /* renamed from: l */
    private TextView f29960l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public C10896f f29961m;

    /* renamed from: n */
    private String f29962n = null;

    /* renamed from: o */
    private String f29963o;

    /* renamed from: p */
    private String f29964p;

    /* renamed from: q */
    private String f29965q;

    /* renamed from: com.mrsool.me.e$a */
    /* compiled from: AddSponsorBottomSheet */
    class C10890a implements OnShowListener {

        /* renamed from: com.mrsool.me.e$a$a */
        /* compiled from: AddSponsorBottomSheet */
        class C10891a extends C5662e {
            C10891a() {
            }

            /* renamed from: a */
            public void mo22486a(@C0193h0 View view, float f) {
            }

            /* renamed from: a */
            public void mo22487a(@C0193h0 View view, int i) {
                if (i == 1) {
                    C10889e.this.f29950b.mo22474e(3);
                }
            }
        }

        C10890a() {
        }

        public void onShow(DialogInterface dialogInterface) {
            FrameLayout frameLayout = (FrameLayout) ((C5665a) dialogInterface).findViewById(C10232R.C10236id.design_bottom_sheet);
            C10889e.this.f29950b = BottomSheetBehavior.m24700c(frameLayout);
            C10889e eVar = C10889e.this;
            eVar.f29950b.mo22467c(eVar.f29949a.getHeight());
            C10889e.this.f29950b.mo22474e(3);
            C10889e.this.f29950b.mo22458a((C5662e) new C10891a());
        }
    }

    /* renamed from: com.mrsool.me.e$b */
    /* compiled from: AddSponsorBottomSheet */
    class C10892b implements OnClickListener {
        C10892b() {
        }

        public void onClick(View view) {
            if (C10889e.this.f29954f.mo23497S()) {
                C10889e.this.mo38516a();
            }
        }
    }

    /* renamed from: com.mrsool.me.e$c */
    /* compiled from: AddSponsorBottomSheet */
    class C10893c implements OnClickListener {
        C10893c() {
        }

        public void onClick(View view) {
            if (C10889e.this.f29954f.mo23497S()) {
                HashMap hashMap = new HashMap();
                hashMap.put(C11687c.f33758a3, C10889e.this.f29958j.getText().toString());
                C10889e.this.m49802a((Map<String, String>) hashMap);
            }
        }
    }

    /* renamed from: com.mrsool.me.e$d */
    /* compiled from: AddSponsorBottomSheet */
    class C10894d implements TextWatcher {
        C10894d() {
        }

        public void afterTextChanged(Editable editable) {
            C10889e.this.mo38518b();
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.mrsool.me.e$e */
    /* compiled from: AddSponsorBottomSheet */
    class C10895e implements Callback<DefaultBean> {
        C10895e() {
        }

        public void onFailure(Call<DefaultBean> call, Throwable th) {
            try {
                C10889e.this.m49799a(3);
                C10889e.this.f29954f.mo23653q0();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void onResponse(Call<DefaultBean> call, Response<DefaultBean> response) {
            try {
                C10889e.this.m49799a(3);
                if (!response.isSuccessful()) {
                    C10889e.this.f29954f.mo23487L(response.message());
                } else if (((DefaultBean) response.body()).getCode().intValue() <= 300) {
                    C10889e.this.f29961m.mo38526a(C10889e.this.f29958j.getText().toString());
                } else {
                    C10889e.this.f29954f.mo23487L(((DefaultBean) response.body()).getMessage());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.mrsool.me.e$f */
    /* compiled from: AddSponsorBottomSheet */
    public interface C10896f {
        /* renamed from: a */
        void mo38526a(String str);
    }

    public C10889e(Context context, Bundle bundle) {
        this.f29954f = new C5887x(context);
        this.f29952d = context;
        this.f29953e = bundle;
        if (bundle != null) {
            String str = "extra_name";
            if (bundle.containsKey(str)) {
                this.f29962n = bundle.getString(str, null);
            }
            String str2 = "extra_header";
            if (bundle.containsKey(str2)) {
                this.f29963o = bundle.getString(str2, null);
            }
            String str3 = "extra_placeholder";
            if (bundle.containsKey(str3)) {
                this.f29964p = bundle.getString(str3, null);
            }
            String str4 = "extra_btnlabel";
            if (bundle.containsKey(str4)) {
                this.f29965q = bundle.getString(str4, null);
            }
        }
        m49807e();
    }

    /* renamed from: e */
    private void m49807e() {
        this.f29949a = m49805d().getLayoutInflater().inflate(C10232R.layout.bottom_sheet_add_sponsor, null);
        this.f29955g = (ProgressBar) this.f29949a.findViewById(C10232R.C10236id.pbAPI);
        this.f29958j = (EditText) this.f29949a.findViewById(C10232R.C10236id.edName);
        this.f29959k = (LinearLayout) this.f29949a.findViewById(C10232R.C10236id.llClose);
        this.f29960l = (TextView) this.f29949a.findViewById(C10232R.C10236id.btnDone);
        this.f29956h = (TextView) this.f29949a.findViewById(C10232R.C10236id.tvTitle);
        this.f29957i = (RelativeLayout) this.f29949a.findViewById(C10232R.C10236id.rlMain);
        if (!TextUtils.isEmpty(this.f29963o)) {
            this.f29956h.setText(this.f29963o);
        }
        if (!TextUtils.isEmpty(this.f29964p)) {
            this.f29958j.setHint(this.f29964p);
        }
        if (!TextUtils.isEmpty(this.f29965q)) {
            this.f29960l.setText(this.f29965q);
        }
        this.f29951c = new C5665a(this.f29952d, C10232R.style.DialogStyle);
        this.f29951c.setOnShowListener(new C10890a());
        this.f29951c.setCancelable(false);
        this.f29951c.setContentView(this.f29949a);
        this.f29951c.getWindow().setSoftInputMode(19);
        this.f29951c.setCancelable(false);
        this.f29959k.setOnClickListener(new C10892b());
        this.f29957i.setOnClickListener(new C10893c());
        this.f29958j.addTextChangedListener(new C10894d());
        this.f29954f.mo23550a(this.f29951c);
        String str = this.f29962n;
        if (str != null) {
            this.f29958j.setText(str);
        }
        mo38518b();
    }

    /* renamed from: f */
    private boolean m49808f() {
        return this.f29958j.getText().toString().length() > 2;
    }

    /* renamed from: d */
    private Activity m49805d() {
        Context context = this.f29952d;
        if (context instanceof HomeActivity) {
            return (HomeActivity) context;
        }
        return (C0295d) context;
    }

    /* renamed from: b */
    public void mo38518b() {
        try {
            if (!m49808f()) {
                this.f29957i.setBackgroundColor(C0841b.m4915a(this.f29952d, (int) C10232R.C10234color.gray_3));
                this.f29957i.setEnabled(false);
                return;
            }
            this.f29957i.setBackground(C0841b.m4928c(this.f29952d, C10232R.C10235drawable.bg_sky_blue_seletor));
            this.f29957i.setEnabled(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    public void mo38519c() {
        C5665a aVar = this.f29951c;
        if (aVar != null && !aVar.isShowing()) {
            this.f29951c.show();
        }
    }

    /* renamed from: a */
    public void mo38516a() {
        C5665a aVar = this.f29951c;
        if (aVar != null && aVar.isShowing()) {
            this.f29951c.dismiss();
        }
    }

    /* renamed from: a */
    public void mo38517a(C10896f fVar) {
        this.f29961m = fVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m49802a(Map<String, String> map) {
        m49799a(1);
        C11687c.m52645a(this.f29954f).addCourierSponsor(this.f29954f.mo23476G(), map).enqueue(new C10895e());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m49799a(int i) {
        if (i == 1) {
            this.f29960l.setText("");
            this.f29958j.setEnabled(false);
            this.f29957i.setClickable(false);
            this.f29955g.setVisibility(0);
        } else if (i == 2) {
            this.f29957i.setClickable(false);
            this.f29955g.setVisibility(8);
            this.f29958j.setEnabled(false);
        } else if (i == 3) {
            if (TextUtils.isEmpty(this.f29965q)) {
                this.f29960l.setText(this.f29952d.getString(C10232R.string.lbl_save_f_caps));
            } else {
                this.f29960l.setText(this.f29965q);
            }
            this.f29957i.setClickable(true);
            this.f29958j.setEnabled(true);
            this.f29955g.setVisibility(8);
        }
    }
}
