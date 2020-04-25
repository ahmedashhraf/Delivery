package p212io.branch.referral.util;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import androidx.annotation.C0195i0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p212io.branch.referral.C14168s.C14169a;
import p212io.branch.referral.C6031o.C6032a;

/* renamed from: io.branch.referral.util.ContentMetadata */
public class ContentMetadata implements Parcelable {
    public static final Creator CREATOR = new C14189a();

    /* renamed from: N */
    public Double f41748N;

    /* renamed from: O */
    public C14197e f41749O;

    /* renamed from: P */
    public String f41750P;

    /* renamed from: Q */
    public String f41751Q;

    /* renamed from: R */
    public String f41752R;

    /* renamed from: S */
    public C14199g f41753S;

    /* renamed from: T */
    public C14190b f41754T;

    /* renamed from: U */
    public String f41755U;

    /* renamed from: V */
    public Double f41756V;

    /* renamed from: W */
    public Double f41757W;

    /* renamed from: X */
    public Integer f41758X;

    /* renamed from: Y */
    public Double f41759Y;

    /* renamed from: Z */
    public String f41760Z;

    /* renamed from: a */
    C14193b f41761a;

    /* renamed from: a0 */
    public String f41762a0;

    /* renamed from: b */
    public Double f41763b;

    /* renamed from: b0 */
    public String f41764b0;

    /* renamed from: c0 */
    public String f41765c0;

    /* renamed from: d0 */
    public String f41766d0;

    /* renamed from: e0 */
    public Double f41767e0;

    /* renamed from: f0 */
    public Double f41768f0;

    /* renamed from: g0 */
    private final ArrayList<String> f41769g0;

    /* renamed from: h0 */
    private final HashMap<String, String> f41770h0;

    /* renamed from: io.branch.referral.util.ContentMetadata$a */
    static class C14189a implements Creator {
        C14189a() {
        }

        public ContentMetadata createFromParcel(Parcel parcel) {
            return new ContentMetadata(parcel, null);
        }

        public ContentMetadata[] newArray(int i) {
            return new ContentMetadata[i];
        }
    }

    /* renamed from: io.branch.referral.util.ContentMetadata$b */
    public enum C14190b {
        OTHER,
        NEW,
        GOOD,
        FAIR,
        POOR,
        USED,
        REFURBISHED,
        EXCELLENT;

        /* renamed from: b */
        public static C14190b m61375b(String str) {
            C14190b[] values;
            if (!TextUtils.isEmpty(str)) {
                for (C14190b bVar : values()) {
                    if (bVar.name().equalsIgnoreCase(str)) {
                        return bVar;
                    }
                }
            }
            return null;
        }
    }

    /* synthetic */ ContentMetadata(Parcel parcel, C14189a aVar) {
        this(parcel);
    }

    /* renamed from: a */
    public ContentMetadata mo44806a(String... strArr) {
        Collections.addAll(this.f41769g0, strArr);
        return this;
    }

    /* renamed from: b */
    public HashMap<String, String> mo44808b() {
        return this.f41770h0;
    }

    /* renamed from: c */
    public ContentMetadata mo44809c(String str) {
        this.f41751Q = str;
        return this;
    }

    /* renamed from: d */
    public ContentMetadata mo44811d(String str) {
        this.f41755U = str;
        return this;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public ContentMetadata mo44813e(String str) {
        this.f41750P = str;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C14193b bVar = this.f41761a;
        String str = "";
        parcel.writeString(bVar != null ? bVar.name() : str);
        parcel.writeSerializable(this.f41763b);
        parcel.writeSerializable(this.f41748N);
        C14197e eVar = this.f41749O;
        parcel.writeString(eVar != null ? eVar.name() : str);
        parcel.writeString(this.f41750P);
        parcel.writeString(this.f41751Q);
        parcel.writeString(this.f41752R);
        C14199g gVar = this.f41753S;
        parcel.writeString(gVar != null ? gVar.getName() : str);
        C14190b bVar2 = this.f41754T;
        if (bVar2 != null) {
            str = bVar2.name();
        }
        parcel.writeString(str);
        parcel.writeString(this.f41755U);
        parcel.writeSerializable(this.f41756V);
        parcel.writeSerializable(this.f41757W);
        parcel.writeSerializable(this.f41758X);
        parcel.writeSerializable(this.f41759Y);
        parcel.writeString(this.f41760Z);
        parcel.writeString(this.f41762a0);
        parcel.writeString(this.f41764b0);
        parcel.writeString(this.f41765c0);
        parcel.writeString(this.f41766d0);
        parcel.writeSerializable(this.f41767e0);
        parcel.writeSerializable(this.f41768f0);
        parcel.writeSerializable(this.f41769g0);
        parcel.writeSerializable(this.f41770h0);
    }

    public ContentMetadata() {
        this.f41769g0 = new ArrayList<>();
        this.f41770h0 = new HashMap<>();
    }

    /* renamed from: a */
    public ContentMetadata mo44804a(String str, String str2) {
        this.f41770h0.put(str, str2);
        return this;
    }

    /* renamed from: c */
    public ArrayList<String> mo44810c() {
        return this.f41769g0;
    }

    /* renamed from: a */
    public ContentMetadata mo44796a(C14193b bVar) {
        this.f41761a = bVar;
        return this;
    }

    /* renamed from: a */
    public ContentMetadata mo44798a(Double d) {
        this.f41763b = d;
        return this;
    }

    private ContentMetadata(Parcel parcel) {
        this();
        this.f41761a = C14193b.m61393b(parcel.readString());
        this.f41763b = (Double) parcel.readSerializable();
        this.f41748N = (Double) parcel.readSerializable();
        this.f41749O = C14197e.m61439b(parcel.readString());
        this.f41750P = parcel.readString();
        this.f41751Q = parcel.readString();
        this.f41752R = parcel.readString();
        this.f41753S = C14199g.m61455b(parcel.readString());
        this.f41754T = C14190b.m61375b(parcel.readString());
        this.f41755U = parcel.readString();
        this.f41756V = (Double) parcel.readSerializable();
        this.f41757W = (Double) parcel.readSerializable();
        this.f41758X = (Integer) parcel.readSerializable();
        this.f41759Y = (Double) parcel.readSerializable();
        this.f41760Z = parcel.readString();
        this.f41762a0 = parcel.readString();
        this.f41764b0 = parcel.readString();
        this.f41765c0 = parcel.readString();
        this.f41766d0 = parcel.readString();
        this.f41767e0 = (Double) parcel.readSerializable();
        this.f41768f0 = (Double) parcel.readSerializable();
        this.f41769g0.addAll((ArrayList) parcel.readSerializable());
        this.f41770h0.putAll((HashMap) parcel.readSerializable());
    }

    /* renamed from: a */
    public ContentMetadata mo44805a(@C0195i0 String str, @C0195i0 String str2, @C0195i0 String str3, @C0195i0 String str4, @C0195i0 String str5) {
        this.f41760Z = str;
        this.f41762a0 = str2;
        this.f41764b0 = str3;
        this.f41765c0 = str4;
        this.f41766d0 = str5;
        return this;
    }

    /* renamed from: a */
    public ContentMetadata mo44800a(@C0195i0 Double d, @C0195i0 Double d2) {
        this.f41767e0 = d;
        this.f41768f0 = d2;
        return this;
    }

    /* renamed from: a */
    public ContentMetadata mo44801a(@C0195i0 Double d, @C0195i0 Double d2, @C0195i0 Double d3, @C0195i0 Integer num) {
        this.f41756V = d;
        this.f41757W = d2;
        this.f41759Y = d3;
        this.f41758X = num;
        return this;
    }

    /* renamed from: a */
    public ContentMetadata mo44802a(@C0195i0 Double d, @C0195i0 Double d2, @C0195i0 Integer num) {
        this.f41757W = d;
        this.f41759Y = d2;
        this.f41758X = num;
        return this;
    }

    /* renamed from: a */
    public ContentMetadata mo44799a(Double d, @C0195i0 C14197e eVar) {
        this.f41748N = d;
        this.f41749O = eVar;
        return this;
    }

    /* renamed from: a */
    public ContentMetadata mo44803a(String str) {
        this.f41752R = str;
        return this;
    }

    /* renamed from: a */
    public ContentMetadata mo44797a(C14199g gVar) {
        this.f41753S = gVar;
        return this;
    }

    /* renamed from: a */
    public ContentMetadata mo44795a(C14190b bVar) {
        this.f41754T = bVar;
        return this;
    }

    /* renamed from: a */
    public JSONObject mo44807a() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f41761a != null) {
                jSONObject.put(C14169a.ContentSchema.mo44764d(), this.f41761a.name());
            }
            if (this.f41763b != null) {
                jSONObject.put(C14169a.Quantity.mo44764d(), this.f41763b);
            }
            if (this.f41748N != null) {
                jSONObject.put(C14169a.Price.mo44764d(), this.f41748N);
            }
            if (this.f41749O != null) {
                jSONObject.put(C14169a.PriceCurrency.mo44764d(), this.f41749O.toString());
            }
            if (!TextUtils.isEmpty(this.f41750P)) {
                jSONObject.put(C14169a.SKU.mo44764d(), this.f41750P);
            }
            if (!TextUtils.isEmpty(this.f41751Q)) {
                jSONObject.put(C14169a.ProductName.mo44764d(), this.f41751Q);
            }
            if (!TextUtils.isEmpty(this.f41752R)) {
                jSONObject.put(C14169a.ProductBrand.mo44764d(), this.f41752R);
            }
            if (this.f41753S != null) {
                jSONObject.put(C14169a.ProductCategory.mo44764d(), this.f41753S.getName());
            }
            if (this.f41754T != null) {
                jSONObject.put(C14169a.Condition.mo44764d(), this.f41754T.name());
            }
            if (!TextUtils.isEmpty(this.f41755U)) {
                jSONObject.put(C14169a.ProductVariant.mo44764d(), this.f41755U);
            }
            if (this.f41756V != null) {
                jSONObject.put(C14169a.Rating.mo44764d(), this.f41756V);
            }
            if (this.f41757W != null) {
                jSONObject.put(C14169a.RatingAverage.mo44764d(), this.f41757W);
            }
            if (this.f41758X != null) {
                jSONObject.put(C14169a.RatingCount.mo44764d(), this.f41758X);
            }
            if (this.f41759Y != null) {
                jSONObject.put(C14169a.RatingMax.mo44764d(), this.f41759Y);
            }
            if (!TextUtils.isEmpty(this.f41760Z)) {
                jSONObject.put(C14169a.AddressStreet.mo44764d(), this.f41760Z);
            }
            if (!TextUtils.isEmpty(this.f41762a0)) {
                jSONObject.put(C14169a.AddressCity.mo44764d(), this.f41762a0);
            }
            if (!TextUtils.isEmpty(this.f41764b0)) {
                jSONObject.put(C14169a.AddressRegion.mo44764d(), this.f41764b0);
            }
            if (!TextUtils.isEmpty(this.f41765c0)) {
                jSONObject.put(C14169a.AddressCountry.mo44764d(), this.f41765c0);
            }
            if (!TextUtils.isEmpty(this.f41766d0)) {
                jSONObject.put(C14169a.AddressPostalCode.mo44764d(), this.f41766d0);
            }
            if (this.f41767e0 != null) {
                jSONObject.put(C14169a.Latitude.mo44764d(), this.f41767e0);
            }
            if (this.f41768f0 != null) {
                jSONObject.put(C14169a.Longitude.mo44764d(), this.f41768f0);
            }
            if (this.f41769g0.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                jSONObject.put(C14169a.ImageCaptions.mo44764d(), jSONArray);
                Iterator it = this.f41769g0.iterator();
                while (it.hasNext()) {
                    jSONArray.put((String) it.next());
                }
            }
            if (this.f41770h0.size() > 0) {
                for (String str : this.f41770h0.keySet()) {
                    jSONObject.put(str, this.f41770h0.get(str));
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static ContentMetadata m61356a(C6032a aVar) {
        ContentMetadata contentMetadata = new ContentMetadata();
        contentMetadata.f41761a = C14193b.m61393b(aVar.mo24930h(C14169a.ContentSchema.mo44764d()));
        contentMetadata.f41763b = aVar.mo24918a(C14169a.Quantity.mo44764d(), (Double) null);
        contentMetadata.f41748N = aVar.mo24918a(C14169a.Price.mo44764d(), (Double) null);
        contentMetadata.f41749O = C14197e.m61439b(aVar.mo24930h(C14169a.PriceCurrency.mo44764d()));
        contentMetadata.f41750P = aVar.mo24930h(C14169a.SKU.mo44764d());
        contentMetadata.f41751Q = aVar.mo24930h(C14169a.ProductName.mo44764d());
        contentMetadata.f41752R = aVar.mo24930h(C14169a.ProductBrand.mo44764d());
        contentMetadata.f41753S = C14199g.m61455b(aVar.mo24930h(C14169a.ProductCategory.mo44764d()));
        contentMetadata.f41754T = C14190b.m61375b(aVar.mo24930h(C14169a.Condition.mo44764d()));
        contentMetadata.f41755U = aVar.mo24930h(C14169a.ProductVariant.mo44764d());
        contentMetadata.f41756V = aVar.mo24918a(C14169a.Rating.mo44764d(), (Double) null);
        contentMetadata.f41757W = aVar.mo24918a(C14169a.RatingAverage.mo44764d(), (Double) null);
        contentMetadata.f41758X = aVar.mo24919a(C14169a.RatingCount.mo44764d(), (Integer) null);
        contentMetadata.f41759Y = aVar.mo24918a(C14169a.RatingMax.mo44764d(), (Double) null);
        contentMetadata.f41760Z = aVar.mo24930h(C14169a.AddressStreet.mo44764d());
        contentMetadata.f41762a0 = aVar.mo24930h(C14169a.AddressCity.mo44764d());
        contentMetadata.f41764b0 = aVar.mo24930h(C14169a.AddressRegion.mo44764d());
        contentMetadata.f41765c0 = aVar.mo24930h(C14169a.AddressCountry.mo44764d());
        contentMetadata.f41766d0 = aVar.mo24930h(C14169a.AddressPostalCode.mo44764d());
        contentMetadata.f41767e0 = aVar.mo24918a(C14169a.Latitude.mo44764d(), (Double) null);
        contentMetadata.f41768f0 = aVar.mo24918a(C14169a.Longitude.mo44764d(), (Double) null);
        JSONArray f = aVar.mo24928f(C14169a.ImageCaptions.mo44764d());
        if (f != null) {
            for (int i = 0; i < f.length(); i++) {
                contentMetadata.f41769g0.add(f.optString(i));
            }
        }
        try {
            JSONObject a = aVar.mo24921a();
            Iterator keys = a.keys();
            while (keys.hasNext()) {
                String str = (String) keys.next();
                contentMetadata.f41770h0.put(str, a.optString(str));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return contentMetadata;
    }
}
