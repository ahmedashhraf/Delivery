package com.google.android.play.core.internal;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;

/* renamed from: com.google.android.play.core.internal.j0 */
public final class C7140j0 {

    /* renamed from: a */
    private static final C5742h f20242a = new C5742h("PhoneskyVerificationUtils");

    /* renamed from: a */
    public static boolean m34361a(Context context) {
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
            if (signatureArr == null || signatureArr.length == 0) {
                f20242a.mo23046c("Phonesky package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
                return false;
            }
            for (Signature byteArray : signatureArr) {
                String a = C5732a0.m25201a(byteArray.toByteArray());
                if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(a) || "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(a)) {
                    return true;
                }
            }
            return false;
        } catch (NameNotFoundException unused) {
        }
    }
}
