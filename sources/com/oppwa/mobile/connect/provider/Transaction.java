package com.oppwa.mobile.connect.provider;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.exception.PaymentException;
import com.oppwa.mobile.connect.p427b.C11780c;
import com.oppwa.mobile.connect.payment.PaymentParams;

public class Transaction implements Parcelable {
    public static final Creator<Transaction> CREATOR = new C11975a();

    /* renamed from: N */
    private String f34554N;

    /* renamed from: O */
    private String f34555O;
    @C0193h0

    /* renamed from: a */
    private PaymentParams f34556a;

    /* renamed from: b */
    private TransactionType f34557b;

    /* renamed from: com.oppwa.mobile.connect.provider.Transaction$a */
    static class C11975a implements Creator<Transaction> {
        C11975a() {
        }

        /* renamed from: a */
        public Transaction createFromParcel(Parcel parcel) {
            return new Transaction(parcel, null);
        }

        /* renamed from: a */
        public Transaction[] newArray(int i) {
            return new Transaction[i];
        }
    }

    private Transaction(Parcel parcel) {
        this.f34557b = (TransactionType) parcel.readParcelable(TransactionType.class.getClassLoader());
        this.f34556a = (PaymentParams) parcel.readParcelable(PaymentParams.class.getClassLoader());
        this.f34554N = parcel.readString();
        this.f34555O = parcel.readString();
    }

    /* synthetic */ Transaction(Parcel parcel, C11975a aVar) {
        this(parcel);
    }

    public Transaction(PaymentParams paymentParams) throws PaymentException {
        if (paymentParams != null) {
            this.f34556a = paymentParams;
            return;
        }
        throw new PaymentException(PaymentError.m53749C());
    }

    /* renamed from: a */
    public String mo41024a() {
        return this.f34555O;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo41025a(TransactionType transactionType) {
        this.f34557b = transactionType;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo41026a(String str) {
        this.f34554N = str;
    }

    /* renamed from: b */
    public PaymentParams mo41027b() {
        return this.f34556a;
    }

    @C0195i0
    /* renamed from: c */
    public String mo41028c() {
        return this.f34554N;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo41029c(String str) {
        this.f34555O = str;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || Transaction.class != obj.getClass()) {
            return false;
        }
        Transaction transaction = (Transaction) obj;
        if (!C11780c.m52958a((Object) this.f34557b, (Object) transaction.f34557b) || !C11780c.m52958a((Object) this.f34556a, (Object) transaction.f34556a) || !C11780c.m52958a((Object) this.f34554N, (Object) transaction.f34554N) || !C11780c.m52958a((Object) this.f34555O, (Object) transaction.f34555O)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        TransactionType transactionType = this.f34557b;
        int i = 0;
        int hashCode = (((transactionType != null ? transactionType.hashCode() : 0) * 31) + this.f34556a.hashCode()) * 31;
        String str = this.f34554N;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f34555O;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    /* renamed from: i */
    public TransactionType mo41033i() {
        return this.f34557b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f34557b, 0);
        parcel.writeParcelable(this.f34556a, 0);
        parcel.writeString(this.f34554N);
        parcel.writeString(this.f34555O);
    }
}
