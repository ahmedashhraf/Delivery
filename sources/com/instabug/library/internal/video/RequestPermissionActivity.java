package com.instabug.library.internal.video;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.projection.MediaProjectionManager;
import android.os.Bundle;
import com.instabug.library._InstabugActivity;
import com.instabug.library.broadcast.C9778a;
import com.instabug.library.broadcast.C9778a.C9779a;
import com.instabug.library.settings.SettingsManager;
import p053b.p072g.p073b.C2128a;
import p205i.p471b.p472a.p473a.p474c.C13938g;

@TargetApi(21)
public class RequestPermissionActivity extends Activity implements _InstabugActivity, C9779a {

    /* renamed from: b */
    private static transient /* synthetic */ boolean[] f26109b;

    /* renamed from: a */
    private C9778a f26110a = new C9778a(this);

    public RequestPermissionActivity() {
        boolean[] a = m45892a();
        a[0] = true;
        a[1] = true;
    }

    /* renamed from: a */
    private static /* synthetic */ boolean[] m45892a() {
        boolean[] zArr = f26109b;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(1135332736849509047L, "com/instabug/library/internal/video/RequestPermissionActivity", 38);
        f26109b = a;
        return a;
    }

    /* renamed from: a */
    public void mo34831a(boolean z) {
        boolean[] a = m45892a();
        if (!z) {
            a[23] = true;
        } else {
            a[24] = true;
            finish();
            a[25] = true;
        }
        a[26] = true;
    }

    public void finish() {
        boolean[] a = m45892a();
        super.finish();
        a[21] = true;
        overridePendingTransition(0, 0);
        a[22] = true;
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        boolean[] a = m45892a();
        super.onActivityResult(i, i2, intent);
        try {
            a[8] = true;
            if (i != 2020) {
                a[9] = true;
            } else if (i2 == -1) {
                a[10] = true;
                startService(AutoScreenRecordingService.m45863a(this, i2, intent));
                a[11] = true;
            } else if (i2 != 0) {
                a[12] = true;
            } else {
                a[13] = true;
                SettingsManager.getInstance().setAutoScreenRecordingDenied(true);
                a[14] = true;
            }
        } catch (Exception e) {
            a[16] = true;
            e.printStackTrace();
            a[17] = true;
        } finally {
            finish();
            a[19] = true;
        }
        a[20] = true;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        boolean[] a = m45892a();
        super.onCreate(bundle);
        if (bundle != null) {
            a[2] = true;
        } else {
            a[3] = true;
            MediaProjectionManager mediaProjectionManager = (MediaProjectionManager) getSystemService("media_projection");
            a[4] = true;
            Intent createScreenCaptureIntent = mediaProjectionManager.createScreenCaptureIntent();
            a[5] = true;
            startActivityForResult(createScreenCaptureIntent, 2020);
            a[6] = true;
        }
        a[7] = true;
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        boolean[] a = m45892a();
        super.onPause();
        a[30] = true;
        C2128a a2 = C2128a.m11089a(getApplicationContext());
        C9778a aVar = this.f26110a;
        a[31] = true;
        a2.mo9217a((BroadcastReceiver) aVar);
        a[32] = true;
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        boolean[] a = m45892a();
        super.onResume();
        a[27] = true;
        C2128a a2 = C2128a.m11089a(getApplicationContext());
        C9778a aVar = this.f26110a;
        IntentFilter intentFilter = new IntentFilter("SDK invoked");
        a[28] = true;
        a2.mo9218a(aVar, intentFilter);
        a[29] = true;
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        boolean[] a = m45892a();
        super.onStart();
        a[33] = true;
        SettingsManager.getInstance().setRequestPermissionScreenShown(true);
        a[34] = true;
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        boolean[] a = m45892a();
        super.onStop();
        a[35] = true;
        SettingsManager.getInstance().setRequestPermissionScreenShown(false);
        a[36] = true;
        finish();
        a[37] = true;
    }
}
