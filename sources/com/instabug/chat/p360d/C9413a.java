package com.instabug.chat.p360d;

import android.content.Context;
import android.net.Uri;
import com.instabug.chat.model.Attachment;
import com.instabug.chat.p361ui.C9456b;
import com.instabug.library.screenshot.ExtraScreenshotHelper;
import com.instabug.library.screenshot.ExtraScreenshotHelper.OnCaptureListener;
import com.instabug.library.util.InstabugSDKLogger;
import java.lang.ref.WeakReference;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.chat.d.a */
/* compiled from: ScreenshotHelper */
public class C9413a implements OnCaptureListener {

    /* renamed from: d */
    private static C9413a f24909d;

    /* renamed from: e */
    private static transient /* synthetic */ boolean[] f24910e;

    /* renamed from: a */
    private WeakReference<Context> f24911a;

    /* renamed from: b */
    private ExtraScreenshotHelper f24912b = new ExtraScreenshotHelper();

    /* renamed from: c */
    private String f24913c;

    private C9413a() {
        boolean[] b = m44012b();
        b[0] = true;
        b[1] = true;
    }

    /* renamed from: a */
    public static C9413a m44009a() {
        boolean[] b = m44012b();
        if (f24909d != null) {
            b[2] = true;
        } else {
            b[3] = true;
            f24909d = new C9413a();
            b[4] = true;
        }
        C9413a aVar = f24909d;
        b[5] = true;
        return aVar;
    }

    /* renamed from: b */
    private static /* synthetic */ boolean[] m44012b() {
        boolean[] zArr = f24910e;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-1212972098597142413L, "com/instabug/chat/screenshot/ScreenshotHelper", 23);
        f24910e = a;
        return a;
    }

    public void onExtraScreenshotCaptured(Uri uri) {
        boolean[] b = m44012b();
        StringBuilder sb = new StringBuilder();
        sb.append("Uri: ");
        sb.append(uri);
        InstabugSDKLogger.m46626v(C9413a.class, sb.toString());
        b[9] = true;
        this.f24912b.release();
        WeakReference<Context> weakReference = this.f24911a;
        if (weakReference == null) {
            b[10] = true;
        } else {
            b[11] = true;
            Context context = (Context) weakReference.get();
            if (context == null) {
                b[12] = true;
            } else {
                String str = this.f24913c;
                b[13] = true;
                Attachment a = m44010a(uri);
                b[14] = true;
                m44011a(context, str, a);
                b[15] = true;
            }
        }
        b[16] = true;
    }

    /* renamed from: a */
    public void mo33858a(Context context, String str) {
        boolean[] b = m44012b();
        this.f24911a = new WeakReference<>(context);
        this.f24913c = str;
        b[6] = true;
        this.f24912b.init(this);
        b[7] = true;
    }

    /* renamed from: a */
    private void m44011a(Context context, String str, Attachment attachment) {
        boolean[] b = m44012b();
        context.startActivity(C9456b.m44299a(context, str, attachment));
        b[17] = true;
    }

    /* renamed from: a */
    private Attachment m44010a(Uri uri) {
        boolean[] b = m44012b();
        Attachment attachment = new Attachment();
        b[18] = true;
        attachment.setState("offline");
        b[19] = true;
        Attachment type = attachment.setType("image");
        b[20] = true;
        Attachment localPath = type.setLocalPath(uri.getPath());
        b[21] = true;
        localPath.setName(uri.getLastPathSegment());
        b[22] = true;
        return attachment;
    }
}
