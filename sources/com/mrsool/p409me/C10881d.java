package com.mrsool.p409me;

import android.app.DatePickerDialog.OnDateSetListener;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.DatePicker;
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
import com.mrsool.utils.C11646j;
import com.mrsool.utils.C5887x;
import com.mrsool.utils.webservice.C11687c;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* renamed from: com.mrsool.me.d */
/* compiled from: AddDateBottomSheet */
public class C10881d implements OnDateSetListener {

    /* renamed from: a */
    private SimpleDateFormat f29923a = new SimpleDateFormat("dd-MM-yyyy");
    /* access modifiers changed from: private */

    /* renamed from: b */
    public SimpleDateFormat f29924b = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public View f29925c;

    /* renamed from: d */
    BottomSheetBehavior f29926d;

    /* renamed from: e */
    private C5665a f29927e;

    /* renamed from: f */
    private Context f29928f;

    /* renamed from: g */
    private Bundle f29929g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C5887x f29930h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public TextView f29931i;

    /* renamed from: j */
    private TextView f29932j;

    /* renamed from: k */
    private LinearLayout f29933k;

    /* renamed from: l */
    private TextView f29934l;

    /* renamed from: m */
    private ProgressBar f29935m;

    /* renamed from: n */
    private RelativeLayout f29936n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C10888f f29937o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public String f29938p;

    /* renamed from: q */
    private String f29939q;

    /* renamed from: r */
    private String f29940r;

    /* renamed from: s */
    private String f29941s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public Calendar f29942t;

    /* renamed from: com.mrsool.me.d$a */
    /* compiled from: AddDateBottomSheet */
    class C10882a implements OnShowListener {

        /* renamed from: com.mrsool.me.d$a$a */
        /* compiled from: AddDateBottomSheet */
        class C10883a extends C5662e {
            C10883a() {
            }

            /* renamed from: a */
            public void mo22486a(@C0193h0 View view, float f) {
            }

            /* renamed from: a */
            public void mo22487a(@C0193h0 View view, int i) {
                if (i == 1) {
                    C10881d.this.f29926d.mo22474e(3);
                }
            }
        }

        C10882a() {
        }

        public void onShow(DialogInterface dialogInterface) {
            FrameLayout frameLayout = (FrameLayout) ((C5665a) dialogInterface).findViewById(C10232R.C10236id.design_bottom_sheet);
            C10881d.this.f29926d = BottomSheetBehavior.m24700c(frameLayout);
            C10881d dVar = C10881d.this;
            dVar.f29926d.mo22467c(dVar.f29925c.getHeight());
            C10881d.this.f29926d.mo22474e(3);
            C10881d.this.f29926d.mo22458a((C5662e) new C10883a());
        }
    }

    /* renamed from: com.mrsool.me.d$b */
    /* compiled from: AddDateBottomSheet */
    class C10884b implements OnClickListener {
        C10884b() {
        }

        public void onClick(View view) {
            if (C10881d.this.f29930h.mo23497S()) {
                C10881d.this.mo38506a();
            }
        }
    }

    /* renamed from: com.mrsool.me.d$c */
    /* compiled from: AddDateBottomSheet */
    class C10885c implements OnClickListener {
        C10885c() {
        }

        public void onClick(View view) {
            if (C10881d.this.f29930h.mo23497S()) {
                HashMap hashMap = new HashMap();
                hashMap.put(C11687c.f33763b3, C10881d.this.f29924b.format(C10881d.this.f29942t.getTime()));
                new HashMap().put(C11687c.f33768c3, C10881d.this.f29938p);
                C10881d.this.m49779a((Map<String, String>) hashMap);
            }
        }
    }

    /* renamed from: com.mrsool.me.d$d */
    /* compiled from: AddDateBottomSheet */
    class C10886d implements OnClickListener {
        C10886d() {
        }

        public void onClick(View view) {
            if (C10881d.this.f29930h.mo23497S()) {
                C10881d.this.m49789g();
            }
        }
    }

    /* renamed from: com.mrsool.me.d$e */
    /* compiled from: AddDateBottomSheet */
    class C10887e implements Callback<DefaultBean> {
        C10887e() {
        }

        public void onFailure(Call<DefaultBean> call, Throwable th) {
            C10881d.this.m49776a(3);
            C10881d.this.f29930h.mo23653q0();
        }

        public void onResponse(Call<DefaultBean> call, Response<DefaultBean> response) {
            try {
                C10881d.this.m49776a(3);
                if (!response.isSuccessful()) {
                    C10881d.this.f29930h.mo23487L(response.message());
                } else if (((DefaultBean) response.body()).getCode().intValue() > 300) {
                    C10881d.this.f29930h.mo23487L(((DefaultBean) response.body()).getMessage());
                } else if (C10881d.this.f29937o != null) {
                    C10881d.this.f29937o.mo38515a(C10881d.this.f29931i.getText().toString(), C10881d.this.f29924b.format(C10881d.this.f29942t.getTime()));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.mrsool.me.d$f */
    /* compiled from: AddDateBottomSheet */
    public interface C10888f {
        /* renamed from: a */
        void mo38515a(String str, String str2);
    }

    public C10881d(Context context, Bundle bundle) {
        this.f29930h = new C5887x(context);
        this.f29928f = context;
        this.f29929g = bundle;
        if (bundle != null) {
            String str = "extra_date";
            if (bundle.containsKey(str)) {
                this.f29938p = bundle.getString(str, null);
            }
            String str2 = "extra_header";
            if (bundle.containsKey(str2)) {
                this.f29939q = bundle.getString(str2, null);
            }
            String str3 = "extra_placeholder";
            if (bundle.containsKey(str3)) {
                this.f29940r = bundle.getString(str3, null);
            }
            String str4 = "extra_btnlabel";
            if (bundle.containsKey(str4)) {
                this.f29941s = bundle.getString(str4, null);
            }
        }
        m49785e();
    }

    public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        this.f29942t.set(1, i);
        this.f29942t.set(2, i2);
        this.f29942t.set(5, i3);
        this.f29931i.setText(this.f29923a.format(this.f29942t.getTime()));
        mo38508b();
    }

    /* renamed from: d */
    private C0295d m49782d() {
        Context context = this.f29928f;
        if (context instanceof HomeActivity) {
            return (HomeActivity) context;
        }
        return (C0295d) context;
    }

    /* renamed from: e */
    private void m49785e() {
        this.f29925c = m49782d().getLayoutInflater().inflate(C10232R.layout.bottom_sheet_add_date, null);
        this.f29935m = (ProgressBar) this.f29925c.findViewById(C10232R.C10236id.pbAPI);
        this.f29936n = (RelativeLayout) this.f29925c.findViewById(C10232R.C10236id.rlMain);
        this.f29931i = (TextView) this.f29925c.findViewById(C10232R.C10236id.tvDate);
        this.f29933k = (LinearLayout) this.f29925c.findViewById(C10232R.C10236id.llClose);
        this.f29934l = (TextView) this.f29925c.findViewById(C10232R.C10236id.btnDone);
        this.f29932j = (TextView) this.f29925c.findViewById(C10232R.C10236id.tvTitle);
        if (!TextUtils.isEmpty(this.f29939q)) {
            this.f29932j.setText(this.f29939q);
        }
        if (!TextUtils.isEmpty(this.f29940r)) {
            this.f29931i.setHint(this.f29940r);
        }
        if (!TextUtils.isEmpty(this.f29941s)) {
            this.f29934l.setText(this.f29941s);
        }
        this.f29927e = new C5665a(this.f29928f, C10232R.style.DialogStyle);
        this.f29927e.setOnShowListener(new C10882a());
        this.f29927e.setCancelable(false);
        this.f29927e.setContentView(this.f29925c);
        this.f29927e.getWindow().setSoftInputMode(19);
        this.f29927e.setCancelable(false);
        this.f29933k.setOnClickListener(new C10884b());
        this.f29936n.setOnClickListener(new C10885c());
        this.f29931i.setOnClickListener(new C10886d());
        this.f29930h.mo23550a(this.f29927e);
        if (this.f29938p == null) {
            this.f29942t = Calendar.getInstance();
            m49789g();
        } else {
            try {
                this.f29942t = Calendar.getInstance();
                this.f29942t.setTime(this.f29923a.parse(this.f29938p));
                this.f29931i.setText(this.f29923a.format(this.f29942t.getTime()));
                mo38508b();
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        mo38508b();
    }

    /* renamed from: f */
    private boolean m49787f() {
        return this.f29931i.getText().toString().length() > 2;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m49789g() {
        Calendar instance = Calendar.getInstance();
        instance.add(1, 5);
        Calendar instance2 = Calendar.getInstance();
        new C11646j(this, this.f29942t, instance, instance2).show(m49782d().getSupportFragmentManager().mo6224a(), "dialog");
    }

    /* renamed from: b */
    public void mo38508b() {
        try {
            if (!m49787f()) {
                this.f29936n.setBackgroundColor(C0841b.m4915a(this.f29928f, (int) C10232R.C10234color.gray_3));
                this.f29936n.setClickable(false);
                return;
            }
            this.f29936n.setBackground(C0841b.m4928c(this.f29928f, C10232R.C10235drawable.bg_sky_blue_seletor));
            this.f29936n.setClickable(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    public void mo38509c() {
        C5665a aVar = this.f29927e;
        if (aVar != null && !aVar.isShowing()) {
            this.f29927e.show();
        }
    }

    /* renamed from: a */
    public void mo38506a() {
        C5665a aVar = this.f29927e;
        if (aVar != null && aVar.isShowing()) {
            this.f29927e.dismiss();
        }
    }

    /* renamed from: a */
    public void mo38507a(C10888f fVar) {
        this.f29937o = fVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m49779a(Map<String, String> map) {
        m49776a(1);
        C11687c.m52645a(this.f29930h).addCourierSponsor(this.f29930h.mo23476G(), map).enqueue(new C10887e());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m49776a(int i) {
        if (i == 1) {
            this.f29934l.setText("");
            this.f29936n.setClickable(false);
            this.f29931i.setClickable(false);
            this.f29935m.setVisibility(0);
        } else if (i == 2) {
            this.f29936n.setClickable(false);
            this.f29935m.setVisibility(8);
            this.f29931i.setClickable(false);
        } else if (i == 3) {
            if (TextUtils.isEmpty(this.f29941s)) {
                this.f29934l.setText(this.f29928f.getString(C10232R.string.lbl_save_f_caps));
            } else {
                this.f29934l.setText(this.f29941s);
            }
            this.f29936n.setClickable(true);
            this.f29931i.setClickable(true);
            this.f29935m.setVisibility(8);
        }
    }
}
