package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule.C4533a;
import com.google.android.gms.dynamite.DynamiteModule.C4533a.C4534a;
import com.google.android.gms.dynamite.DynamiteModule.C4533a.C4535b;
import com.google.android.gms.dynamite.DynamiteModule.LoadingException;

/* renamed from: com.google.android.gms.dynamite.d */
final class C4541d implements C4533a {
    C4541d() {
    }

    /* renamed from: a */
    public final C4535b mo18637a(Context context, String str, C4534a aVar) throws LoadingException {
        C4535b bVar = new C4535b();
        bVar.f13816a = aVar.mo18638a(context, str);
        bVar.f13817b = aVar.mo18639a(context, str, true);
        if (bVar.f13816a == 0 && bVar.f13817b == 0) {
            bVar.f13818c = 0;
        } else if (bVar.f13816a >= bVar.f13817b) {
            bVar.f13818c = -1;
        } else {
            bVar.f13818c = 1;
        }
        return bVar;
    }
}
