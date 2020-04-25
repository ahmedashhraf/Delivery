package com.google.android.gms.internal.auth-api;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.C0195i0;
import com.google.android.gms.auth.api.C3917a.C3918a;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.internal.safeparcel.C4400b;
import org.jcodec.codecs.common.biari.MQEncoder;

/* renamed from: com.google.android.gms.internal.auth-api.o */
public final class C4564o {
    /* renamed from: a */
    public static PendingIntent m19613a(Context context, @C0195i0 C3918a aVar, HintRequest hintRequest) {
        C4300a0.m18621a(context, (Object) "context must not be null");
        C4300a0.m18621a(hintRequest, (Object) "request must not be null");
        Intent putExtra = new Intent("com.google.android.gms.auth.api.credentials.PICKER").putExtra("claimedCallingPackage", null);
        C4400b.m19022a(hintRequest, putExtra, "com.google.android.gms.credentials.HintRequest");
        return PendingIntent.getActivity(context, 2000, putExtra, MQEncoder.CARRY_MASK);
    }
}
