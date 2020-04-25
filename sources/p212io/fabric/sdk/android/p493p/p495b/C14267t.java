package p212io.fabric.sdk.android.p493p.p495b;

import android.content.Context;
import p212io.fabric.sdk.android.C14215d;
import p212io.fabric.sdk.android.p493p.p494a.C14233b;
import p212io.fabric.sdk.android.p493p.p494a.C14235d;

/* renamed from: io.fabric.sdk.android.p.b.t */
/* compiled from: InstallerPackageNameProvider */
public class C14267t {

    /* renamed from: c */
    private static final String f42094c = "";

    /* renamed from: a */
    private final C14235d<String> f42095a = new C14268a();

    /* renamed from: b */
    private final C14233b<String> f42096b = new C14233b<>();

    /* renamed from: io.fabric.sdk.android.p.b.t$a */
    /* compiled from: InstallerPackageNameProvider */
    class C14268a implements C14235d<String> {
        C14268a() {
        }

        public String load(Context context) throws Exception {
            String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
            return installerPackageName == null ? "" : installerPackageName;
        }
    }

    /* renamed from: a */
    public String mo45178a(Context context) {
        try {
            String str = (String) this.f42096b.mo45112a(context, this.f42095a);
            if ("".equals(str)) {
                str = null;
            }
            return str;
        } catch (Exception e) {
            C14215d.m61672j().mo45045e(C14215d.f41919m, "Failed to determine installer package name", e);
            return null;
        }
    }
}
