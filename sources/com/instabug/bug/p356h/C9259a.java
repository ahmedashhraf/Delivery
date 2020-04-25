package com.instabug.bug.p356h;

import android.content.Context;
import android.net.Uri;
import com.instabug.bug.C9249c;
import com.instabug.bug.C9254f;
import com.instabug.library.model.Attachment.Type;
import com.instabug.library.screenshot.ExtraScreenshotHelper;
import com.instabug.library.screenshot.ExtraScreenshotHelper.OnCaptureListener;
import com.instabug.library.util.InstabugSDKLogger;
import java.lang.ref.WeakReference;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.bug.h.a */
/* compiled from: ScreenshotHelper */
public class C9259a implements OnCaptureListener {

    /* renamed from: c */
    private static C9259a f24487c;

    /* renamed from: d */
    private static transient /* synthetic */ boolean[] f24488d;

    /* renamed from: a */
    private WeakReference<Context> f24489a;

    /* renamed from: b */
    private ExtraScreenshotHelper f24490b = new ExtraScreenshotHelper();

    private C9259a() {
        boolean[] b = m43288b();
        b[0] = true;
        b[1] = true;
    }

    /* renamed from: a */
    public static C9259a m43286a() {
        boolean[] b = m43288b();
        if (f24487c != null) {
            b[2] = true;
        } else {
            b[3] = true;
            f24487c = new C9259a();
            b[4] = true;
        }
        C9259a aVar = f24487c;
        b[5] = true;
        return aVar;
    }

    /* renamed from: b */
    private static /* synthetic */ boolean[] m43288b() {
        boolean[] zArr = f24488d;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(6870951924735471250L, "com/instabug/bug/screenshot/ScreenshotHelper", 18);
        f24488d = a;
        return a;
    }

    public void onExtraScreenshotCaptured(Uri uri) {
        boolean[] b = m43288b();
        StringBuilder sb = new StringBuilder();
        sb.append("Uri: ");
        sb.append(uri);
        InstabugSDKLogger.m46626v(C9259a.class, sb.toString());
        b[9] = true;
        this.f24490b.release();
        b[10] = true;
        C9254f.m43255h().mo33434c().mo33498a(uri, Type.IMAGE);
        WeakReference<Context> weakReference = this.f24489a;
        if (weakReference == null) {
            b[11] = true;
        } else {
            b[12] = true;
            Context context = (Context) weakReference.get();
            if (context == null) {
                b[13] = true;
            } else {
                b[14] = true;
                m43287a(context, uri);
                b[15] = true;
            }
        }
        b[16] = true;
    }

    /* renamed from: a */
    public void mo33450a(Context context) {
        boolean[] b = m43288b();
        this.f24489a = new WeakReference<>(context);
        b[6] = true;
        this.f24490b.init(this);
        b[7] = true;
    }

    /* renamed from: a */
    private void m43287a(Context context, Uri uri) {
        boolean[] b = m43288b();
        context.startActivity(C9249c.m43228a(context, uri));
        b[17] = true;
    }
}
