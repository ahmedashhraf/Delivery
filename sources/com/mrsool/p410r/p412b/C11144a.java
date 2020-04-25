package com.mrsool.p410r.p412b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.EditText;
import android.widget.ListView;
import androidx.fragment.app.C1374b;
import com.facebook.places.model.PlaceFields;
import com.mrsool.C10232R;
import com.mrsool.p410r.p411a.C11138a;
import com.mrsool.p410r.p413c.C11147a;
import com.mrsool.p410r.p414d.C11148a;
import com.mrsool.utils.C11644i;
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

/* renamed from: com.mrsool.r.b.a */
/* compiled from: CountryPicker */
public class C11144a extends C1374b implements Comparator<C11148a> {

    /* renamed from: S */
    private static C5887x f30861S;

    /* renamed from: N */
    private C11138a f30862N;

    /* renamed from: O */
    private List<C11148a> f30863O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public List<C11148a> f30864P;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public C11147a f30865Q;

    /* renamed from: R */
    private Context f30866R;

    /* renamed from: a */
    private EditText f30867a;

    /* renamed from: b */
    private ListView f30868b;

    /* renamed from: com.mrsool.r.b.a$a */
    /* compiled from: CountryPicker */
    class C11145a implements OnItemClickListener {
        C11145a() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (C11144a.this.f30865Q != null) {
                C11148a aVar = (C11148a) C11144a.this.f30864P.get(i);
                C11144a.this.f30865Q.mo36619a(aVar.mo38972d(), aVar.mo38965a(), aVar.mo38968b(), aVar.mo38970c());
            }
        }
    }

    /* renamed from: com.mrsool.r.b.a$b */
    /* compiled from: CountryPicker */
    class C11146b implements TextWatcher {
        C11146b() {
        }

        public void afterTextChanged(Editable editable) {
            C11144a.this.m50538k(editable.toString());
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: i */
    public static Currency m50536i(String str) {
        try {
            return Currency.getInstance(new Locale(C11644i.f33183R5, str));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: j */
    private int m50537j(String str) {
        try {
            Resources resources = this.f30866R.getResources();
            StringBuilder sb = new StringBuilder();
            sb.append("flag_");
            sb.append(str.toLowerCase(Locale.ENGLISH));
            return resources.getIdentifier(sb.toString(), "drawable", this.f30866R.getPackageName());
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* access modifiers changed from: private */
    @SuppressLint({"DefaultLocale"})
    /* renamed from: k */
    public void m50538k(String str) {
        this.f30864P.clear();
        for (C11148a aVar : this.f30863O) {
            if (aVar.mo38972d().toLowerCase(Locale.ENGLISH).contains(str.toLowerCase())) {
                this.f30864P.add(aVar);
            }
        }
        this.f30862N.notifyDataSetChanged();
    }

    public static C11144a newInstance(String str) {
        C11144a aVar = new C11144a();
        Bundle bundle = new Bundle();
        bundle.putString("dialogTitle", str);
        aVar.setArguments(bundle);
        return aVar;
    }

    /* renamed from: y */
    private C11148a m50539y() {
        C11148a aVar = new C11148a();
        aVar.mo38967a("AF");
        aVar.mo38969b("+93");
        aVar.mo38966a((int) C10232R.C10235drawable.flag_af);
        return aVar;
    }

    /* renamed from: z */
    private List<C11148a> m50540z() {
        if (this.f30863O == null) {
            try {
                this.f30863O = new ArrayList();
                JSONArray jSONArray = new JSONObject(f30861S.mo23465A("countries.json")).getJSONArray("countries");
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    String string = jSONObject.getString("dial_code");
                    String string2 = jSONObject.getString(XHTMLText.CODE);
                    C11148a aVar = new C11148a();
                    aVar.mo38967a(string2);
                    aVar.mo38969b(string);
                    aVar.mo38971c(jSONObject.getString("name"));
                    this.f30863O.add(aVar);
                }
                Collections.sort(this.f30863O, this);
                this.f30864P = new ArrayList();
                this.f30864P.addAll(this.f30863O);
                return this.f30863O;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @SuppressLint({"DefaultLocale"})
    /* renamed from: g */
    public String mo38957g(String str) {
        if ("+966".equals(str) || "+20".equals(str)) {
            return str;
        }
        for (C11148a b : this.f30863O) {
            if (b.mo38968b().equals(str)) {
                return str;
            }
        }
        return "";
    }

    @SuppressLint({"DefaultLocale"})
    /* renamed from: h */
    public void mo38958h(String str) {
        for (C11148a aVar : this.f30863O) {
            if (aVar.mo38968b().equals(str)) {
                this.f30865Q.mo36619a(aVar.mo38972d(), aVar.mo38965a(), aVar.mo38968b(), aVar.mo38970c());
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C10232R.layout.country_picker, null);
        Bundle arguments = getArguments();
        if (arguments != null) {
            getDialog().setTitle(arguments.getString("dialogTitle"));
            getDialog().getWindow().setLayout(getResources().getDimensionPixelSize(C10232R.dimen.cp_dialog_width), getResources().getDimensionPixelSize(C10232R.dimen.cp_dialog_height));
        }
        m50540z();
        this.f30867a = (EditText) inflate.findViewById(C10232R.C10236id.country_code_picker_search);
        this.f30868b = (ListView) inflate.findViewById(C10232R.C10236id.country_code_picker_listview);
        this.f30862N = new C11138a(getActivity(), this.f30864P);
        this.f30868b.setAdapter(this.f30862N);
        this.f30868b.setOnItemClickListener(new C11145a());
        this.f30867a.addTextChangedListener(new C11146b());
        return inflate;
    }

    /* renamed from: w */
    public ListView mo38959w() {
        return this.f30868b;
    }

    /* renamed from: x */
    public EditText mo38960x() {
        return this.f30867a;
    }

    /* renamed from: a */
    public void mo38955a(C11147a aVar) {
        this.f30865Q = aVar;
    }

    /* renamed from: a */
    public int compare(C11148a aVar, C11148a aVar2) {
        return aVar.mo38972d().compareTo(aVar2.mo38972d());
    }

    /* renamed from: a */
    public C11148a mo38954a(Context context) {
        this.f30866R = context;
        f30861S = new C5887x(context);
        m50540z();
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(PlaceFields.PHONE);
        if (telephonyManager.getSimState() != 1) {
            String simCountryIso = telephonyManager.getSimCountryIso();
            for (int i = 0; i < this.f30863O.size(); i++) {
                C11148a aVar = (C11148a) this.f30863O.get(i);
                if (aVar.mo38965a().equalsIgnoreCase(simCountryIso)) {
                    aVar.mo38966a(m50537j(aVar.mo38965a()));
                    return aVar;
                }
            }
        }
        return m50539y();
    }
}
