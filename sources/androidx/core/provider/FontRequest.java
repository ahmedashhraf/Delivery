package androidx.core.provider;

import android.util.Base64;
import androidx.annotation.C0186e;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.core.p033k.C0944i;
import java.util.List;

public final class FontRequest {
    private final List<List<byte[]>> mCertificates;
    private final int mCertificatesArray;
    private final String mIdentifier;
    private final String mProviderAuthority;
    private final String mProviderPackage;
    private final String mQuery;

    public FontRequest(@C0193h0 String str, @C0193h0 String str2, @C0193h0 String str3, @C0193h0 List<List<byte[]>> list) {
        this.mProviderAuthority = (String) C0944i.m5337a(str);
        this.mProviderPackage = (String) C0944i.m5337a(str2);
        this.mQuery = (String) C0944i.m5337a(str3);
        this.mCertificates = (List) C0944i.m5337a(list);
        this.mCertificatesArray = 0;
        StringBuilder sb = new StringBuilder(this.mProviderAuthority);
        String str4 = "-";
        sb.append(str4);
        sb.append(this.mProviderPackage);
        sb.append(str4);
        sb.append(this.mQuery);
        this.mIdentifier = sb.toString();
    }

    @C0195i0
    public List<List<byte[]>> getCertificates() {
        return this.mCertificates;
    }

    @C0186e
    public int getCertificatesArrayResId() {
        return this.mCertificatesArray;
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    public String getIdentifier() {
        return this.mIdentifier;
    }

    @C0193h0
    public String getProviderAuthority() {
        return this.mProviderAuthority;
    }

    @C0193h0
    public String getProviderPackage() {
        return this.mProviderPackage;
    }

    @C0193h0
    public String getQuery() {
        return this.mQuery;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: ");
        sb2.append(this.mProviderAuthority);
        sb2.append(", mProviderPackage: ");
        sb2.append(this.mProviderPackage);
        sb2.append(", mQuery: ");
        sb2.append(this.mQuery);
        sb2.append(", mCertificates:");
        sb.append(sb2.toString());
        for (int i = 0; i < this.mCertificates.size(); i++) {
            sb.append(" [");
            List list = (List) this.mCertificates.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        StringBuilder sb3 = new StringBuilder();
        sb3.append("mCertificatesArray: ");
        sb3.append(this.mCertificatesArray);
        sb.append(sb3.toString());
        return sb.toString();
    }

    public FontRequest(@C0193h0 String str, @C0193h0 String str2, @C0193h0 String str3, @C0186e int i) {
        this.mProviderAuthority = (String) C0944i.m5337a(str);
        this.mProviderPackage = (String) C0944i.m5337a(str2);
        this.mQuery = (String) C0944i.m5337a(str3);
        this.mCertificates = null;
        C0944i.m5339a(i != 0);
        this.mCertificatesArray = i;
        StringBuilder sb = new StringBuilder(this.mProviderAuthority);
        String str4 = "-";
        sb.append(str4);
        sb.append(this.mProviderPackage);
        sb.append(str4);
        sb.append(this.mQuery);
        this.mIdentifier = sb.toString();
    }
}
