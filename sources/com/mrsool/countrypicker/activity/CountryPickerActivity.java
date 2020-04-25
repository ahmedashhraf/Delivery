package com.mrsool.countrypicker.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.futuremind.recyclerviewfastscroll.FastScroller;
import com.mrsool.C10232R;
import com.mrsool.C10787d;
import com.mrsool.p410r.p411a.C11140b;
import com.mrsool.p410r.p414d.C11148a;
import com.mrsool.p423v.C11725f;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C11715z;
import com.mrsool.utils.C5887x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Currency;
import java.util.List;
import java.util.Locale;
import org.jivesoftware.smackx.xhtmlim.XHTMLText;
import org.json.JSONArray;
import org.json.JSONObject;

public class CountryPickerActivity extends C10787d implements Comparator<C11148a>, OnClickListener {

    /* renamed from: S */
    private RecyclerView f28676S;

    /* renamed from: T */
    private FastScroller f28677T;

    /* renamed from: U */
    private C11140b f28678U;

    /* renamed from: V */
    private List<C11148a> f28679V;

    /* renamed from: W */
    private TextView f28680W;

    /* renamed from: X */
    private EditText f28681X;

    /* renamed from: Y */
    private ImageView f28682Y;

    /* renamed from: Z */
    private ImageView f28683Z;

    /* renamed from: a0 */
    private ImageView f28684a0;

    /* renamed from: b0 */
    private View f28685b0;
    /* access modifiers changed from: private */

    /* renamed from: c0 */
    public ArrayList<Object> f28686c0 = new ArrayList<>();

    /* renamed from: d0 */
    private Context f28687d0;

    /* renamed from: e0 */
    private String f28688e0 = "";

    /* renamed from: f0 */
    private boolean f28689f0 = false;

    /* renamed from: com.mrsool.countrypicker.activity.CountryPickerActivity$a */
    class C10553a extends C11725f {
        C10553a() {
        }

        /* renamed from: a */
        public void mo37847a(int i) {
            if (CountryPickerActivity.this.f28686c0.get(i) instanceof C11148a) {
                C11148a aVar = (C11148a) CountryPickerActivity.this.f28686c0.get(i);
                Intent intent = new Intent();
                intent.putExtra(C11644i.f33132L2, aVar.mo38972d());
                intent.putExtra(C11644i.f33140M2, aVar.mo38965a());
                intent.putExtra(C11644i.f33148N2, aVar.mo38968b());
                intent.putExtra(C11644i.f33156O2, aVar.mo38970c());
                CountryPickerActivity.this.setResult(-1, intent);
                CountryPickerActivity.this.finish();
            }
        }
    }

    /* renamed from: com.mrsool.countrypicker.activity.CountryPickerActivity$b */
    class C10554b implements TextWatcher {
        C10554b() {
        }

        public void afterTextChanged(Editable editable) {
            CountryPickerActivity.this.m48727j(editable.toString());
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: K */
    private List<C11148a> m48719K() {
        if (this.f28679V == null) {
            try {
                this.f28679V = new ArrayList();
                JSONArray jSONArray = new JSONObject(this.f29642a.mo23465A("countries.json")).getJSONArray("countries");
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    String string = jSONObject.getString("dial_code");
                    String string2 = jSONObject.getString(XHTMLText.CODE);
                    C11148a aVar = new C11148a();
                    aVar.mo38967a(string2);
                    aVar.mo38969b(string);
                    aVar.mo38971c(jSONObject.getString(this.f29642a.mo23496R() ? "name_ar" : "name"));
                    this.f28679V.add(aVar);
                }
                Collections.sort(this.f28679V, this);
                if (this.f28686c0 == null) {
                    this.f28686c0 = new ArrayList<>();
                } else {
                    this.f28686c0.clear();
                }
                String str = "";
                for (int i2 = 0; i2 < this.f28679V.size(); i2++) {
                    C11148a aVar2 = (C11148a) this.f28679V.get(i2);
                    String upperCase = String.valueOf(aVar2.mo38972d().charAt(0)).toUpperCase();
                    if (!TextUtils.equals(str, upperCase)) {
                        this.f28686c0.add(upperCase);
                        str = upperCase;
                    }
                    this.f28686c0.add(aVar2);
                }
                return this.f28679V;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /* renamed from: L */
    private void m48720L() {
        m48722N();
        m48719K();
        this.f28678U = new C11140b(this, this.f28686c0, new C10553a());
        this.f28676S = (RecyclerView) findViewById(C10232R.C10236id.recyclerview);
        this.f28677T = (FastScroller) findViewById(C10232R.C10236id.fastscroll);
        this.f28676S.setLayoutManager(new LinearLayoutManager(this));
        this.f28676S.addItemDecoration(new C11715z(getResources().getDimensionPixelSize(C10232R.dimen.dp_10)));
        this.f28676S.setAdapter(this.f28678U);
        this.f28677T.setRecyclerView(this.f28676S);
        if (this.f29642a.mo23496R()) {
            this.f29642a.mo23545a(this.f28682Y);
            this.f28677T.setLayoutDirection(0);
            this.f28681X.setGravity(5);
        }
    }

    /* renamed from: M */
    private void m48721M() {
        Configuration configuration = getBaseContext().getResources().getConfiguration();
        createConfigurationContext(configuration);
        getBaseContext().getResources().updateConfiguration(configuration, new DisplayMetrics());
    }

    /* renamed from: N */
    private void m48722N() {
        this.f28682Y = (ImageView) findViewById(C10232R.C10236id.imgClose);
        this.f28680W = (TextView) findViewById(C10232R.C10236id.txtTitle);
        this.f28685b0 = findViewById(C10232R.C10236id.flSearch);
        this.f28681X = (EditText) findViewById(C10232R.C10236id.edtSearch);
        this.f28683Z = (ImageView) findViewById(C10232R.C10236id.imgSearch);
        this.f28684a0 = (ImageView) findViewById(C10232R.C10236id.imgCloseSearch);
        this.f28680W.setText(getString(C10232R.string.lbl_dg_title));
        this.f28683Z.setOnClickListener(this);
        this.f28682Y.setOnClickListener(this);
        this.f28684a0.setOnClickListener(this);
        this.f28681X.addTextChangedListener(new C10554b());
    }

    /* renamed from: c */
    private void m48725c(boolean z) {
        this.f28689f0 = z;
        if (z) {
            this.f28680W.setVisibility(8);
            this.f28683Z.setVisibility(8);
            this.f28685b0.setVisibility(0);
            this.f28681X.requestFocus();
            this.f29642a.mo23668v0();
            return;
        }
        this.f28685b0.setVisibility(8);
        this.f28680W.setVisibility(0);
        this.f28683Z.setVisibility(0);
        this.f29642a.mo23543a((View) this.f28681X);
    }

    /* renamed from: i */
    public static Currency m48726i(String str) {
        try {
            return Currency.getInstance(new Locale(C11644i.f33183R5, str));
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    @SuppressLint({"DefaultLocale"})
    /* renamed from: j */
    public void m48727j(String str) {
        this.f28686c0.clear();
        if (!TextUtils.isEmpty(str)) {
            this.f28684a0.setVisibility(0);
            for (C11148a aVar : this.f28679V) {
                if (aVar.mo38972d().toLowerCase(Locale.ENGLISH).contains(str.toLowerCase())) {
                    this.f28686c0.add(aVar);
                }
            }
            this.f28678U.mo7341e();
            return;
        }
        this.f28684a0.setVisibility(8);
        String str2 = "";
        for (int i = 0; i < this.f28679V.size(); i++) {
            C11148a aVar2 = (C11148a) this.f28679V.get(i);
            String upperCase = String.valueOf(aVar2.mo38972d().charAt(0)).toUpperCase();
            if (!TextUtils.equals(str2, upperCase)) {
                this.f28686c0.add(upperCase);
                str2 = upperCase;
            }
            this.f28686c0.add(aVar2);
        }
        this.f28678U.mo7341e();
    }

    /* renamed from: J */
    public EditText mo37935J() {
        return this.f28681X;
    }

    public void onClick(View view) {
        String str = "";
        if (view.equals(this.f28682Y)) {
            if (this.f28689f0) {
                this.f28681X.setText(str);
                m48725c(false);
                return;
            }
            onBackPressed();
        } else if (view.equals(this.f28683Z)) {
            m48725c(true);
        } else if (view.equals(this.f28684a0)) {
            this.f28681X.setText(str);
        }
    }

    /* access modifiers changed from: protected */
    @RequiresApi(api = 21)
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C10232R.layout.activity_country_picker);
        m48721M();
        C5887x xVar = this.f29642a;
        xVar.mo23477G(xVar.mo23470D().mo23460g("language"));
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String str = "dialogTitle";
            if (extras.containsKey(str)) {
                this.f28688e0 = extras.getString(str);
            }
        }
        m48720L();
    }

    /* renamed from: a */
    public int compare(C11148a aVar, C11148a aVar2) {
        return aVar.mo38972d().compareTo(aVar2.mo38972d());
    }
}
