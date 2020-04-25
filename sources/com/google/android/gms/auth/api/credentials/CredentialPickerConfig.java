package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@C4392a(creator = "CredentialPickerConfigCreator")
public final class CredentialPickerConfig extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<CredentialPickerConfig> CREATOR = new C3961i();
    @C4394c(getter = "shouldShowCancelButton", mo18384id = 2)

    /* renamed from: N */
    private final boolean f12511N;
    @Deprecated
    @C4394c(getter = "isForNewAccount", mo18384id = 3)

    /* renamed from: O */
    private final boolean f12512O;
    @C4394c(getter = "getPromptInternalId", mo18384id = 4)

    /* renamed from: P */
    private final int f12513P;
    @C4394c(mo18384id = 1000)

    /* renamed from: a */
    private final int f12514a;
    @C4394c(getter = "shouldShowAddAccountButton", mo18384id = 1)

    /* renamed from: b */
    private final boolean f12515b;

    /* renamed from: com.google.android.gms.auth.api.credentials.CredentialPickerConfig$a */
    public static class C3948a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public boolean f12516a = false;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public boolean f12517b = true;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public int f12518c = 1;

        /* renamed from: a */
        public C3948a mo17358a(int i) {
            this.f12518c = i;
            return this;
        }

        /* renamed from: b */
        public C3948a mo17361b(boolean z) {
            this.f12516a = z;
            return this;
        }

        /* renamed from: c */
        public C3948a mo17362c(boolean z) {
            this.f12517b = z;
            return this;
        }

        @Deprecated
        /* renamed from: a */
        public C3948a mo17359a(boolean z) {
            this.f12518c = z ? 3 : 1;
            return this;
        }

        /* renamed from: a */
        public CredentialPickerConfig mo17360a() {
            return new CredentialPickerConfig(this);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.gms.auth.api.credentials.CredentialPickerConfig$b */
    public @interface C3949b {

        /* renamed from: m */
        public static final int f12519m = 1;

        /* renamed from: n */
        public static final int f12520n = 2;

        /* renamed from: o */
        public static final int f12521o = 3;
    }

    /* JADX WARNING: type inference failed for: r3v1 */
    /* JADX WARNING: type inference failed for: r3v2, types: [boolean] */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r3v4, types: [int] */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r3v1
      assigns: [?[boolean, int, float, short, byte, char], ?[int, float, short, byte, char], ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]]
      uses: [boolean, int]
      mth insns count: 17
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 3 */
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    CredentialPickerConfig(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e(mo18387id = 1000) int r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e(mo18387id = 1) boolean r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e(mo18387id = 2) boolean r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e(mo18387id = 3) boolean r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e(mo18387id = 4) int r6) {
        /*
            r1 = this;
            r1.<init>()
            r1.f12514a = r2
            r1.f12515b = r3
            r1.f12511N = r4
            r3 = 1
            r4 = 3
            r0 = 2
            if (r2 >= r0) goto L_0x0016
            r1.f12512O = r5
            if (r5 == 0) goto L_0x0013
            r3 = 3
        L_0x0013:
            r1.f12513P = r3
            return
        L_0x0016:
            if (r6 != r4) goto L_0x0019
            goto L_0x001a
        L_0x0019:
            r3 = 0
        L_0x001a:
            r1.f12512O = r3
            r1.f12513P = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.credentials.CredentialPickerConfig.<init>(int, boolean, boolean, boolean, int):void");
    }

    @Deprecated
    /* renamed from: N */
    public final boolean mo17354N() {
        return this.f12513P == 3;
    }

    /* renamed from: O */
    public final boolean mo17355O() {
        return this.f12515b;
    }

    /* renamed from: P */
    public final boolean mo17356P() {
        return this.f12511N;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18984a(parcel, 1, mo17355O());
        C4399a.m18984a(parcel, 2, mo17356P());
        C4399a.m18984a(parcel, 3, mo17354N());
        C4399a.m18964a(parcel, 4, this.f12513P);
        C4399a.m18964a(parcel, 1000, this.f12514a);
        C4399a.m18959a(parcel, a);
    }

    private CredentialPickerConfig(C3948a aVar) {
        this(2, aVar.f12516a, aVar.f12517b, false, aVar.f12518c);
    }
}
