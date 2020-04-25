package com.oppwa.mobile.connect.checkout.dialog;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import com.fasterxml.jackson.core.p162w.C3868i;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.wallet.PaymentData;
import com.mrsool.chat.C10526n.C10527a;
import com.oppwa.mobile.connect.p427b.C11780c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;

public class OrderSummary implements Parcelable {
    public static final Creator<OrderSummary> CREATOR = new C11793a();
    @C0193h0

    /* renamed from: N */
    private String f34093N;
    @C0193h0

    /* renamed from: O */
    private String f34094O;
    @C0195i0

    /* renamed from: P */
    private String f34095P;
    @C0193h0

    /* renamed from: a */
    private LinkedHashMap<String, Double> f34096a;
    @C0193h0

    /* renamed from: b */
    private Double f34097b;

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.OrderSummary$a */
    static class C11793a implements Creator<OrderSummary> {
        C11793a() {
        }

        /* renamed from: a */
        public OrderSummary createFromParcel(Parcel parcel) {
            return new OrderSummary(parcel, null);
        }

        /* renamed from: a */
        public OrderSummary[] newArray(int i) {
            return new OrderSummary[i];
        }
    }

    private OrderSummary(Parcel parcel) {
        this.f34096a = new LinkedHashMap<>();
        int readInt = parcel.readInt();
        if (readInt > 0) {
            for (int i = 0; i < readInt; i++) {
                this.f34096a.put(parcel.readString(), Double.valueOf(parcel.readDouble()));
            }
        }
        this.f34097b = Double.valueOf(parcel.readDouble());
        this.f34093N = parcel.readString();
        this.f34094O = parcel.readString();
        this.f34095P = parcel.readString();
    }

    /* synthetic */ OrderSummary(Parcel parcel, C11793a aVar) {
        this(parcel);
    }

    public OrderSummary(@C0193h0 LinkedHashMap<String, Double> linkedHashMap, @C0193h0 Double d, @C0193h0 PaymentData paymentData) {
        this(linkedHashMap, d, "", C10527a.f28541b);
        if (paymentData.getCardInfo() != null) {
            this.f34093N = paymentData.getCardInfo().getCardDescription();
        }
        if (paymentData.getShippingAddress() != null) {
            this.f34095P = m53020a(paymentData.getShippingAddress());
        }
    }

    public OrderSummary(@C0193h0 LinkedHashMap<String, Double> linkedHashMap, @C0193h0 Double d, @C0193h0 String str, @C0193h0 String str2) {
        this.f34096a = linkedHashMap;
        this.f34097b = d;
        this.f34093N = str;
        this.f34094O = str2;
    }

    @C0193h0
    /* renamed from: a */
    private String m53020a(@C0193h0 UserAddress userAddress) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(userAddress.getAddress1());
        arrayList.add(userAddress.getAddress2());
        String a = m53021a(arrayList, C3868i.f12248b);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(userAddress.getLocality());
        arrayList2.add(userAddress.getPostalCode());
        String a2 = m53021a(arrayList2, ", ");
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(userAddress.getName());
        arrayList3.add(a);
        arrayList3.add(a2);
        return m53021a(arrayList3, "\n");
    }

    /* renamed from: a */
    private String m53021a(ArrayList<String> arrayList, String str) {
        arrayList.removeAll(Collections.singleton(null));
        arrayList.removeAll(Collections.singleton(""));
        return TextUtils.join(str, arrayList);
    }

    /* renamed from: a */
    public OrderSummary mo40362a(@C0193h0 Double d) {
        this.f34097b = d;
        return this;
    }

    /* renamed from: a */
    public OrderSummary mo40363a(@C0193h0 String str) {
        this.f34094O = str;
        return this;
    }

    /* renamed from: a */
    public OrderSummary mo40364a(@C0193h0 LinkedHashMap<String, Double> linkedHashMap) {
        this.f34096a = linkedHashMap;
        return this;
    }

    @C0193h0
    /* renamed from: a */
    public LinkedHashMap<String, Double> mo40365a() {
        return this.f34096a;
    }

    @C0193h0
    /* renamed from: b */
    public Double mo40366b() {
        return this.f34097b;
    }

    /* renamed from: c */
    public OrderSummary mo40367c(@C0193h0 String str) {
        this.f34093N = str;
        return this;
    }

    @C0193h0
    /* renamed from: c */
    public String mo40368c() {
        return this.f34094O;
    }

    /* renamed from: d */
    public OrderSummary mo40369d(@C0195i0 String str) {
        this.f34095P = str;
        return this;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || OrderSummary.class != obj.getClass()) {
            return false;
        }
        OrderSummary orderSummary = (OrderSummary) obj;
        if (!C11780c.m52958a((Object) this.f34096a, (Object) orderSummary.f34096a) || Double.compare(this.f34097b.doubleValue(), orderSummary.f34097b.doubleValue()) != 0 || !C11780c.m52958a((Object) this.f34093N, (Object) orderSummary.f34093N) || !C11780c.m52958a((Object) this.f34094O, (Object) orderSummary.f34094O) || !C11780c.m52958a((Object) this.f34095P, (Object) orderSummary.f34095P)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int hashCode = ((((((this.f34096a.hashCode() * 31) + Long.valueOf(Double.doubleToLongBits(this.f34097b.doubleValue())).hashCode()) * 31) + this.f34093N.hashCode()) * 31) + this.f34094O.hashCode()) * 31;
        String str = this.f34095P;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @C0193h0
    /* renamed from: i */
    public String mo40373i() {
        return this.f34093N;
    }

    @C0195i0
    /* renamed from: j */
    public String mo40374j() {
        return this.f34095P;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f34096a.size());
        for (String str : this.f34096a.keySet()) {
            parcel.writeString(str);
            parcel.writeDouble(((Double) this.f34096a.get(str)).doubleValue());
        }
        parcel.writeDouble(this.f34097b.doubleValue());
        parcel.writeString(this.f34093N);
        parcel.writeString(this.f34094O);
        parcel.writeString(this.f34095P);
    }
}
