package com.mrsool.utils.p421c;

import android.content.Context;
import android.text.TextUtils;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C5887x;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import p212io.branch.indexing.BranchUniversalObject;
import p212io.branch.referral.util.C14192a;
import p212io.branch.referral.util.C14194c;
import p212io.branch.referral.util.C14197e;
import p212io.branch.referral.util.ContentMetadata;

/* renamed from: com.mrsool.utils.c.c */
/* compiled from: BranchCriteoEvents */
public class C11614c {

    /* renamed from: a */
    private Context f32882a;

    /* renamed from: b */
    private C5887x f32883b;

    /* renamed from: c */
    public String f32884c = "MM-dd-yyyy hh:mm:ss.SSS a";

    public C11614c(Context context) {
        this.f32882a = context;
        this.f32883b = new C5887x(context);
    }

    /* renamed from: c */
    private String m52307c() {
        try {
            if (!this.f32883b.mo23504Z().booleanValue() && C11644i.f33072D6 != null && C11644i.f33072D6.getUser() != null && !TextUtils.isEmpty(C11644i.f33072D6.getUser().getVEmail())) {
                return C5887x.m25790R(C11644i.f33072D6.getUser().getVEmail());
            }
        } catch (Exception unused) {
        }
        return "";
    }

    /* renamed from: a */
    public void mo39849a(String str, String str2) {
        String str3 = "";
        try {
            BranchUniversalObject a = new BranchUniversalObject().mo44516a(new ContentMetadata().mo44813e(str).mo44799a(Double.valueOf(1.0d), C14197e.SAR).mo44798a(Double.valueOf(1.0d)));
            BranchUniversalObject a2 = new BranchUniversalObject().mo44516a(new ContentMetadata().mo44813e(str2).mo44799a(Double.valueOf(1.0d), C14197e.SAR).mo44798a(Double.valueOf(1.0d)));
            C14194c cVar = new C14194c(C14192a.VIEW_ITEMS);
            BranchUniversalObject[] branchUniversalObjectArr = {a, a2};
            StringBuilder sb = new StringBuilder();
            sb.append(str3);
            sb.append(mo39845a());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str3);
            sb2.append(mo39845a());
            cVar.mo44843a(branchUniversalObjectArr).mo44841a("md5_hashed_email", m52307c()).mo44841a("din", sb.toString()).mo44841a("dout", sb2.toString()).mo44844a(this.f32882a);
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public void mo39851b() {
    }

    /* renamed from: b */
    public void mo39853b(String str, String str2, String str3) {
        String str4 = "";
        try {
            BranchUniversalObject a = new BranchUniversalObject().mo44516a(new ContentMetadata().mo44813e(str).mo44799a(Double.valueOf(1.0d), C14197e.SAR).mo44798a(Double.valueOf(1.0d)));
            BranchUniversalObject a2 = new BranchUniversalObject().mo44516a(new ContentMetadata().mo44813e(str2).mo44799a(Double.valueOf(1.0d), C14197e.SAR).mo44798a(Double.valueOf(1.0d)));
            BranchUniversalObject a3 = new BranchUniversalObject().mo44516a(new ContentMetadata().mo44813e(str3).mo44799a(Double.valueOf(1.0d), C14197e.SAR).mo44798a(Double.valueOf(1.0d)));
            C14194c cVar = new C14194c(C14192a.VIEW_ITEMS);
            BranchUniversalObject[] branchUniversalObjectArr = {a, a2, a3};
            StringBuilder sb = new StringBuilder();
            sb.append(str4);
            sb.append(mo39845a());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str4);
            sb2.append(mo39845a());
            cVar.mo44843a(branchUniversalObjectArr).mo44841a("md5_hashed_email", m52307c()).mo44841a("din", sb.toString()).mo44841a("dout", sb2.toString()).mo44844a(this.f32882a);
        } catch (Exception unused) {
        }
    }

    /* renamed from: c */
    public void mo39854c(String str) {
        String str2 = "";
        try {
            BranchUniversalObject a = new BranchUniversalObject().mo44516a(new ContentMetadata().mo44813e(str).mo44799a(Double.valueOf(1.0d), C14197e.SAR).mo44798a(Double.valueOf(1.0d)));
            C14194c cVar = new C14194c(C14192a.VIEW_ITEM);
            BranchUniversalObject[] branchUniversalObjectArr = {a};
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(mo39845a());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(mo39845a());
            cVar.mo44843a(branchUniversalObjectArr).mo44841a("md5_hashed_email", m52307c()).mo44841a("din", sb.toString()).mo44841a("dout", sb2.toString()).mo44844a(this.f32882a);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public void mo39847a(String str) {
        String str2 = "";
        try {
            BranchUniversalObject a = new BranchUniversalObject().mo44516a(new ContentMetadata().mo44813e(str).mo44799a(Double.valueOf(1.0d), C14197e.SAR).mo44798a(Double.valueOf(1.0d)));
            C14194c cVar = new C14194c(C14192a.VIEW_CART);
            BranchUniversalObject[] branchUniversalObjectArr = {a};
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(mo39845a());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(mo39845a());
            cVar.mo44843a(branchUniversalObjectArr).mo44841a("md5_hashed_email", m52307c()).mo44841a("din", sb.toString()).mo44841a("dout", sb2.toString()).mo44844a(this.f32882a);
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public void mo39852b(String str) {
        String str2 = "";
        try {
            BranchUniversalObject a = new BranchUniversalObject().mo44516a(new ContentMetadata().mo44813e(str).mo44799a(Double.valueOf(1.0d), C14197e.SAR).mo44798a(Double.valueOf(1.0d)));
            C14194c cVar = new C14194c(C14192a.VIEW_ITEMS);
            BranchUniversalObject[] branchUniversalObjectArr = {a};
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(mo39845a());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(mo39845a());
            cVar.mo44843a(branchUniversalObjectArr).mo44841a("md5_hashed_email", m52307c()).mo44841a("din", sb.toString()).mo44841a("dout", sb2.toString()).mo44844a(this.f32882a);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public void mo39848a(String str, double d) {
        String str2 = "";
        try {
            BranchUniversalObject a = new BranchUniversalObject().mo44516a(new ContentMetadata().mo44813e(str).mo44799a(Double.valueOf(d), C14197e.SAR).mo44798a(Double.valueOf(1.0d)));
            C14194c cVar = new C14194c(C14192a.PURCHASE);
            BranchUniversalObject[] branchUniversalObjectArr = {a};
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(mo39845a());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(mo39845a());
            cVar.mo44843a(branchUniversalObjectArr).mo44841a("md5_hashed_email", m52307c()).mo44838a(d).mo44841a("din", sb.toString()).mo44841a("dout", sb2.toString()).mo44844a(this.f32882a);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public void mo39850a(String str, String str2, String str3) {
        String str4 = "md5_hashed_email";
        try {
            BranchUniversalObject branchUniversalObject = new BranchUniversalObject();
            String str5 = "";
            ContentMetadata c = new ContentMetadata().mo44813e(str).mo44799a(Double.valueOf(1.0d), C14197e.SAR).mo44809c(TextUtils.isEmpty(str2) ? str5 : str2);
            if (TextUtils.isEmpty(str2)) {
                str2 = str5;
            }
            BranchUniversalObject a = branchUniversalObject.mo44516a(c.mo44803a(str2).mo44811d(str5).mo44798a(Double.valueOf(1.0d)));
            C14194c cVar = new C14194c(C14192a.ADD_TO_CART);
            BranchUniversalObject[] branchUniversalObjectArr = {a};
            StringBuilder sb = new StringBuilder();
            sb.append(str5);
            sb.append(mo39845a());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str5);
            sb2.append(mo39845a());
            C14194c a2 = cVar.mo44843a(branchUniversalObjectArr).mo44841a(str4, m52307c()).mo44841a(str4, m52307c()).mo44841a("din", sb.toString()).mo44841a("dout", sb2.toString());
            if (TextUtils.isEmpty(str3)) {
                str3 = str5;
            }
            a2.mo44850e(str3).mo44839a(C14197e.SAR).mo44838a(0.0d).mo44845b(0.0d).mo44847c(0.0d).mo44846b(str5).mo44840a(str5).mo44848c(str5).mo44849d(str5).mo44844a(this.f32882a);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public String mo39845a() {
        if (TextUtils.isEmpty(this.f32884c)) {
            return String.valueOf(System.currentTimeMillis());
        }
        return new SimpleDateFormat(this.f32884c, Locale.US).format(new Date());
    }

    /* renamed from: a */
    public String mo39846a(long j) {
        try {
            return new SimpleDateFormat(this.f32884c, Locale.US).format(Long.valueOf(j * 1000));
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
