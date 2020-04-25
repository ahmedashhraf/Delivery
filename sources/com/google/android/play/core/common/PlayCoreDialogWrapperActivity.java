package com.google.android.play.core.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.os.Bundle;
import android.os.ResultReceiver;

public class PlayCoreDialogWrapperActivity extends Activity {

    /* renamed from: a */
    private ResultReceiver f20213a;

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        int i3;
        Bundle bundle;
        super.onActivityResult(i, i2, intent);
        if (i == 0) {
            ResultReceiver resultReceiver = this.f20213a;
            if (resultReceiver != null) {
                if (i2 == -1) {
                    i3 = 1;
                    bundle = new Bundle();
                } else if (i2 == 0) {
                    i3 = 2;
                    bundle = new Bundle();
                }
                resultReceiver.send(i3, bundle);
            }
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String str = "result_receiver";
        if (bundle == null) {
            this.f20213a = (ResultReceiver) getIntent().getParcelableExtra(str);
            try {
                startIntentSenderForResult(((PendingIntent) getIntent().getExtras().get("confirmation_intent")).getIntentSender(), 0, null, 0, 0, 0);
            } catch (SendIntentException unused) {
                ResultReceiver resultReceiver = this.f20213a;
                if (resultReceiver != null) {
                    resultReceiver.send(3, new Bundle());
                }
                finish();
            }
        } else {
            this.f20213a = (ResultReceiver) bundle.getParcelable(str);
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("result_receiver", this.f20213a);
    }
}
