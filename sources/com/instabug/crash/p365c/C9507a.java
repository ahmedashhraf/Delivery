package com.instabug.crash.p365c;

import android.net.Uri;
import com.instabug.crash.models.Crash;
import com.instabug.crash.models.Crash.CrashState;
import com.instabug.library.model.Attachment;
import com.instabug.library.model.Attachment.Type;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.crash.c.a */
/* compiled from: AutoScreenRecordingUtils */
public class C9507a {

    /* renamed from: a */
    private static transient /* synthetic */ boolean[] f25164a;

    /* renamed from: a */
    public static void m44512a(Crash crash) {
        boolean[] a = m44514a();
        Uri autoScreenRecordingFileUri = C9508b.m44515b().getAutoScreenRecordingFileUri();
        if (autoScreenRecordingFileUri == null) {
            a[1] = true;
        } else {
            a[2] = true;
            m44513a(crash, autoScreenRecordingFileUri);
            a[3] = true;
        }
        C9508b.m44515b().clear();
        a[4] = true;
    }

    /* renamed from: a */
    private static /* synthetic */ boolean[] m44514a() {
        boolean[] zArr = f25164a;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-4370220506140384855L, "com/instabug/crash/screenrecording/AutoScreenRecordingUtils", 11);
        f25164a = a;
        return a;
    }

    /* renamed from: a */
    public static void m44513a(Crash crash, Uri uri) {
        boolean[] a = m44514a();
        Attachment attachment = new Attachment();
        a[5] = true;
        attachment.setName(uri.getLastPathSegment());
        a[6] = true;
        attachment.setLocalPath(uri.getPath());
        a[7] = true;
        attachment.setType(Type.AUTO_SCREEN_RECORDING);
        a[8] = true;
        crash.mo34186d().add(attachment);
        a[9] = true;
        crash.mo34176a(CrashState.WAITING_FOR_SCREEN_RECORDING_TO_BE_TRIMMED);
        a[10] = true;
    }
}
