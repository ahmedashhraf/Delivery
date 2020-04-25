package com.instabug.chat.p361ui.p362a;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.annotation.C0195i0;
import androidx.fragment.app.Fragment;
import com.instabug.library.core.p382ui.BasePresenter;
import com.instabug.library.util.BitmapUtils;
import java.lang.ref.WeakReference;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.chat.ui.a.c */
/* compiled from: AnnotationPresenter */
class C9455c extends BasePresenter<C9452b> implements C9451a {

    /* renamed from: a */
    private static transient /* synthetic */ boolean[] f25042a;

    C9455c(C9452b bVar) {
        boolean[] d = m44295d();
        super(bVar);
        d[0] = true;
    }

    /* renamed from: d */
    private static /* synthetic */ boolean[] m44295d() {
        boolean[] zArr = f25042a;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-9205195470593501174L, "com/instabug/chat/ui/annotation/AnnotationPresenter", 10);
        f25042a = a;
        return a;
    }

    /* renamed from: a */
    public void mo34063a(@C0195i0 Bitmap bitmap, Uri uri) {
        boolean[] d = m44295d();
        WeakReference<V> weakReference = this.view;
        if (weakReference == null) {
            d[1] = true;
        } else {
            d[2] = true;
            C9452b bVar = (C9452b) weakReference.get();
            if (bVar == null) {
                d[3] = true;
            } else if (bitmap == null) {
                d[4] = true;
            } else {
                d[5] = true;
                Fragment fragment = (Fragment) bVar.getViewContext();
                d[6] = true;
                Context context = fragment.getContext();
                d[7] = true;
                BitmapUtils.saveBitmap(bitmap, uri, context, null);
                d[8] = true;
            }
        }
        d[9] = true;
    }
}
