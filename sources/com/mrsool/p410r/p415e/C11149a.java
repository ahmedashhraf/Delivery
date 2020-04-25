package com.mrsool.p410r.p415e;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.telephony.TelephonyManager;
import com.facebook.places.model.PlaceFields;
import com.mrsool.C10232R;
import com.mrsool.p410r.p413c.C11147a;
import com.mrsool.p410r.p414d.C11148a;
import com.mrsool.utils.C5887x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import org.jivesoftware.smackx.xhtmlim.XHTMLText;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.mrsool.r.e.a */
/* compiled from: PickerUtils */
public class C11149a implements Comparator<C11148a> {

    /* renamed from: P */
    private static C5887x f30875P;

    /* renamed from: N */
    private List<C11148a> f30876N;

    /* renamed from: O */
    private List<C11148a> f30877O;

    /* renamed from: a */
    private Context f30878a;

    /* renamed from: b */
    private C11147a f30879b;

    public C11149a(Context context) {
        this.f30878a = context;
    }

    /* renamed from: c */
    private int m50559c(String str) {
        try {
            Resources resources = this.f30878a.getResources();
            StringBuilder sb = new StringBuilder();
            sb.append("flag_");
            sb.append(str.toLowerCase(Locale.ENGLISH));
            return resources.getIdentifier(sb.toString(), "drawable", this.f30878a.getPackageName());
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    @SuppressLint({"DefaultLocale"})
    /* renamed from: a */
    public String mo38976a(String str) {
        if ("+966".equals(str) || "+20".equals(str)) {
            return str;
        }
        for (C11148a b : this.f30876N) {
            if (b.mo38968b().equals(str)) {
                return str;
            }
        }
        return "";
    }

    @SuppressLint({"DefaultLocale"})
    /* renamed from: b */
    public void mo38978b(String str) {
        for (C11148a aVar : this.f30876N) {
            if (aVar.mo38968b().equals(str)) {
                this.f30879b.mo36619a(aVar.mo38972d(), aVar.mo38965a(), aVar.mo38968b(), aVar.mo38970c());
            }
        }
    }

    /* renamed from: b */
    private List<C11148a> m50558b() {
        if (this.f30876N == null) {
            try {
                this.f30876N = new ArrayList();
                JSONArray jSONArray = new JSONObject(f30875P.mo23465A("countries.json")).getJSONArray("countries");
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    String string = jSONObject.getString("dial_code");
                    String string2 = jSONObject.getString(XHTMLText.CODE);
                    C11148a aVar = new C11148a();
                    aVar.mo38967a(string2);
                    aVar.mo38969b(string);
                    aVar.mo38971c(jSONObject.getString(f30875P.mo23496R() ? "name_ar" : "name"));
                    this.f30876N.add(aVar);
                }
                Collections.sort(this.f30876N, this);
                this.f30877O = new ArrayList();
                this.f30877O.addAll(this.f30876N);
                return this.f30876N;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /* renamed from: a */
    public C11148a mo38975a(Context context) {
        this.f30878a = context;
        f30875P = new C5887x(context);
        m50558b();
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(PlaceFields.PHONE);
        if (telephonyManager.getSimState() != 1) {
            String simCountryIso = telephonyManager.getSimCountryIso();
            for (int i = 0; i < this.f30876N.size(); i++) {
                C11148a aVar = (C11148a) this.f30876N.get(i);
                if (aVar.mo38965a().equalsIgnoreCase(simCountryIso)) {
                    aVar.mo38966a(m50559c(aVar.mo38965a()));
                    return aVar;
                }
            }
        }
        return m50557a();
    }

    /* renamed from: a */
    private C11148a m50557a() {
        C11148a aVar = new C11148a();
        aVar.mo38967a("AF");
        aVar.mo38969b("+93");
        aVar.mo38966a((int) C10232R.C10235drawable.flag_af);
        return aVar;
    }

    /* renamed from: a */
    public void mo38977a(C11147a aVar) {
        this.f30879b = aVar;
    }

    /* renamed from: a */
    public int compare(C11148a aVar, C11148a aVar2) {
        return aVar.mo38972d().compareTo(aVar2.mo38972d());
    }
}
