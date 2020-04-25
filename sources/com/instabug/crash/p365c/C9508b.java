package com.instabug.crash.p365c;

import android.net.Uri;
import androidx.annotation.C0195i0;
import com.instabug.library.internal.video.AutoScreenRecordingContract;
import com.instabug.library.internal.video.InternalAutoScreenRecorderHelper;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.crash.c.b */
/* compiled from: ExternalAutoScreenRecordHelper */
public class C9508b implements AutoScreenRecordingContract {

    /* renamed from: a */
    private static C9508b f25165a;

    /* renamed from: b */
    private static transient /* synthetic */ boolean[] f25166b;

    private C9508b() {
        m44516c()[4] = true;
    }

    /* renamed from: b */
    public static C9508b m44515b() {
        boolean[] c = m44516c();
        if (f25165a != null) {
            c[0] = true;
        } else {
            c[1] = true;
            f25165a = new C9508b();
            c[2] = true;
        }
        C9508b bVar = f25165a;
        c[3] = true;
        return bVar;
    }

    /* renamed from: c */
    private static /* synthetic */ boolean[] m44516c() {
        boolean[] zArr = f25166b;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-6978775966200070803L, "com/instabug/crash/screenrecording/ExternalAutoScreenRecordHelper", 10);
        f25166b = a;
        return a;
    }

    /* renamed from: a */
    public void mo34169a() {
        boolean[] c = m44516c();
        InternalAutoScreenRecorderHelper.getInstance().start();
        c[9] = true;
    }

    public void clear() {
        boolean[] c = m44516c();
        InternalAutoScreenRecorderHelper.getInstance().clear();
        c[7] = true;
    }

    public void delete() {
        boolean[] c = m44516c();
        InternalAutoScreenRecorderHelper.getInstance().delete();
        c[6] = true;
    }

    @C0195i0
    public Uri getAutoScreenRecordingFileUri() {
        boolean[] c = m44516c();
        Uri autoScreenRecordingFileUri = InternalAutoScreenRecorderHelper.getInstance().getAutoScreenRecordingFileUri();
        c[5] = true;
        return autoScreenRecordingFileUri;
    }

    public boolean isEnabled() {
        boolean[] c = m44516c();
        boolean isEnabled = InternalAutoScreenRecorderHelper.getInstance().isEnabled();
        c[8] = true;
        return isEnabled;
    }
}
