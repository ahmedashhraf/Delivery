package com.oppwa.mobile.connect.payment;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import com.oppwa.mobile.connect.p427b.C11780c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONException;
import org.json.JSONObject;

public class BrandsValidation implements Parcelable {
    public static final Creator<BrandsValidation> CREATOR = new C11943a();

    /* renamed from: N */
    private Set<String> f34459N;

    /* renamed from: O */
    private Map<String, Pattern> f34460O;

    /* renamed from: P */
    private Map<String, Pattern> f34461P;
    @C0193h0

    /* renamed from: a */
    private Map<String, BrandInfo> f34462a;

    /* renamed from: b */
    private Set<String> f34463b;

    /* renamed from: com.oppwa.mobile.connect.payment.BrandsValidation$a */
    static class C11943a implements Creator<BrandsValidation> {
        C11943a() {
        }

        /* renamed from: a */
        public BrandsValidation createFromParcel(Parcel parcel) {
            return new BrandsValidation(parcel, null);
        }

        /* renamed from: a */
        public BrandsValidation[] newArray(int i) {
            return new BrandsValidation[i];
        }
    }

    private BrandsValidation(Parcel parcel) {
        this.f34462a = new LinkedHashMap();
        int readInt = parcel.readInt();
        if (readInt > 0) {
            this.f34462a = new LinkedHashMap();
            for (int i = 0; i < readInt; i++) {
                this.f34462a.put(parcel.readString(), (BrandInfo) parcel.readParcelable(BrandInfo.class.getClassLoader()));
            }
            m53803i();
        }
    }

    /* synthetic */ BrandsValidation(Parcel parcel, C11943a aVar) {
        this(parcel);
    }

    public BrandsValidation(@C0193h0 Map<String, BrandInfo> map) {
        this.f34462a = new LinkedHashMap();
        this.f34462a = map;
        m53803i();
    }

    /* renamed from: a */
    public static BrandsValidation m53799a(JSONObject jSONObject) throws JSONException {
        return new BrandsValidation(C11952a.m53903a(jSONObject));
    }

    @C0193h0
    /* renamed from: b */
    private List<String> m53800b(@C0193h0 List<String> list) {
        Set<String> set = this.f34459N;
        if (set == null || set.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : this.f34459N) {
            if (list.contains(str)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    @C0195i0
    /* renamed from: e */
    private BrandInfo m53801e(String str) {
        if (this.f34462a.containsKey(str)) {
            return (BrandInfo) this.f34462a.get(str);
        }
        return null;
    }

    /* renamed from: f */
    private Pattern m53802f(String str) {
        try {
            return Pattern.compile(str);
        } catch (PatternSyntaxException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid regex '");
            sb.append(str);
            sb.append("' was ignored. ");
            sb.append(e.getDescription());
            sb.toString();
            return null;
        }
    }

    /* renamed from: i */
    private void m53803i() {
        this.f34463b = new LinkedHashSet();
        this.f34460O = new LinkedHashMap();
        this.f34461P = new LinkedHashMap();
        for (String str : this.f34462a.keySet()) {
            BrandInfo brandInfo = (BrandInfo) this.f34462a.get(str);
            if (brandInfo.mo40784j() && brandInfo.mo40778b() != null) {
                this.f34463b.add(str);
                String c = brandInfo.mo40778b().mo40822c();
                if (c != null && !c.isEmpty()) {
                    this.f34460O.put(str, m53802f(c));
                }
                String j = brandInfo.mo40778b().mo40828j();
                if (!j.isEmpty()) {
                    this.f34461P.put(str, m53802f(j));
                }
            }
        }
    }

    @C0193h0
    /* renamed from: a */
    public CardBrandInfo mo40790a(String str) {
        BrandInfo e = m53801e(str);
        return (e == null || e.mo40778b() == null) ? new CardBrandInfo() : e.mo40778b();
    }

    /* renamed from: a */
    public List<String> mo40791a() {
        Set<String> set = this.f34459N;
        if (set != null) {
            return new ArrayList(set);
        }
        return null;
    }

    @C0193h0
    /* renamed from: a */
    public List<String> mo40792a(@C0193h0 String str, @C0193h0 String str2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (String str3 : this.f34463b) {
            Pattern pattern = (Pattern) this.f34460O.get(str3);
            if (pattern == null) {
                arrayList2.add(str3);
            } else if (pattern.matcher(str).find()) {
                arrayList.add(str3);
            }
        }
        if (str2.equalsIgnoreCase("CARD")) {
            arrayList.addAll(arrayList2);
        }
        return m53800b(arrayList);
    }

    /* renamed from: a */
    public void mo40793a(@C0193h0 List<String> list) {
        if (!list.isEmpty()) {
            this.f34459N = new LinkedHashSet();
            this.f34459N.addAll(list);
            this.f34459N.addAll(this.f34463b);
        }
    }

    @C0193h0
    /* renamed from: a */
    public String[] mo40794a(@C0193h0 String[] strArr) {
        List asList = Arrays.asList(strArr);
        ArrayList arrayList = new ArrayList();
        for (String str : this.f34463b) {
            if (asList.contains(str)) {
                arrayList.add(str);
            }
        }
        return (String[]) m53800b(arrayList).toArray(new String[0]);
    }

    @C0193h0
    /* renamed from: b */
    public Map<String, BrandInfo> mo40795b() {
        return this.f34462a;
    }

    /* renamed from: c */
    public Bundle mo40796c() {
        Bundle bundle = new Bundle();
        for (String str : this.f34462a.keySet()) {
            bundle.putString(str, ((BrandInfo) this.f34462a.get(str)).mo40779c());
        }
        return bundle;
    }

    /* renamed from: c */
    public Pattern mo40797c(String str) {
        return (Pattern) this.f34461P.get(str);
    }

    /* renamed from: d */
    public boolean mo40798d(@C0193h0 String str) {
        boolean z = true;
        if (str.equalsIgnoreCase("CARD")) {
            return true;
        }
        BrandInfo e = m53801e(str);
        if (e == null || !e.mo40784j()) {
            z = false;
        }
        return z;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || BrandsValidation.class != obj.getClass()) {
            return false;
        }
        return C11780c.m52958a((Object) this.f34462a, (Object) ((BrandsValidation) obj).f34462a);
    }

    public int hashCode() {
        return this.f34462a.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int size = this.f34462a.size();
        parcel.writeInt(size);
        if (size > 0) {
            for (Entry entry : this.f34462a.entrySet()) {
                parcel.writeString((String) entry.getKey());
                parcel.writeParcelable((Parcelable) entry.getValue(), 0);
            }
        }
    }
}
