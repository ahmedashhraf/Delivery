package com.google.android.gms.auth.api;

import android.content.Context;
import android.os.Looper;
import androidx.annotation.C0195i0;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.C4003h;
import com.google.android.gms.common.api.C4059a.C4060a;
import com.google.android.gms.common.api.C4059a.C4071f;
import com.google.android.gms.common.api.C4086i.C4088b;
import com.google.android.gms.common.api.C4086i.C4089c;
import com.google.android.gms.common.internal.C4329f;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.auth.api.g */
final class C3975g extends C4060a<C4003h, GoogleSignInOptions> {
    C3975g() {
    }

    /* renamed from: a */
    public final /* synthetic */ C4071f mo10343a(Context context, Looper looper, C4329f fVar, @C0195i0 Object obj, C4088b bVar, C4089c cVar) {
        C4003h hVar = new C4003h(context, looper, fVar, (GoogleSignInOptions) obj, bVar, cVar);
        return hVar;
    }

    /* renamed from: a */
    public final /* synthetic */ List mo17424a(@C0195i0 Object obj) {
        GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
        if (googleSignInOptions == null) {
            return Collections.emptyList();
        }
        return googleSignInOptions.mo17464Q();
    }
}
