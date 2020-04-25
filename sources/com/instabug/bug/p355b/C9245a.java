package com.instabug.bug.p355b;

import android.net.Uri;
import androidx.annotation.C0195i0;
import com.instabug.library.internal.video.AutoScreenRecordingContract;
import com.instabug.library.internal.video.InternalAutoScreenRecorderHelper;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.bug.b.a */
/* compiled from: ExternalAutoScreenRecordHelper */
public class C9245a implements AutoScreenRecordingContract {

    /* renamed from: a */
    private static C9245a f24453a;

    /* renamed from: b */
    private static transient /* synthetic */ boolean[] f24454b;

    private C9245a() {
        m43208b()[4] = true;
    }

    /* renamed from: a */
    public static C9245a m43207a() {
        boolean[] b = m43208b();
        if (f24453a != null) {
            b[0] = true;
        } else {
            b[1] = true;
            f24453a = new C9245a();
            b[2] = true;
        }
        C9245a aVar = f24453a;
        b[3] = true;
        return aVar;
    }

    /* renamed from: b */
    private static /* synthetic */ boolean[] m43208b() {
        boolean[] zArr = f24454b;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(132739405015899014L, "com/instabug/bug/screenrecording/ExternalAutoScreenRecordHelper", 9);
        f24454b = a;
        return a;
    }

    public void clear() {
        boolean[] b = m43208b();
        InternalAutoScreenRecorderHelper.getInstance().clear();
        b[7] = true;
    }

    public void delete() {
        boolean[] b = m43208b();
        InternalAutoScreenRecorderHelper.getInstance().delete();
        b[6] = true;
    }

    @C0195i0
    public Uri getAutoScreenRecordingFileUri() {
        boolean[] b = m43208b();
        Uri autoScreenRecordingFileUri = InternalAutoScreenRecorderHelper.getInstance().getAutoScreenRecordingFileUri();
        b[5] = true;
        return autoScreenRecordingFileUri;
    }

    public boolean isEnabled() {
        boolean[] b = m43208b();
        boolean isEnabled = InternalAutoScreenRecorderHelper.getInstance().isEnabled();
        b[8] = true;
        return isEnabled;
    }
}
