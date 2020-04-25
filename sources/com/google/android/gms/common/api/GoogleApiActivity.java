package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.os.Bundle;
import com.facebook.internal.NativeProtocol;
import com.google.android.gms.common.C4279e;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.internal.C4137i;
import com.google.android.gms.common.util.C4476d0;
import org.jcodec.codecs.common.biari.MQEncoder;

@KeepName
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public class GoogleApiActivity extends Activity implements OnCancelListener {
    @C4476d0

    /* renamed from: a */
    private int f12777a = 0;

    /* renamed from: a */
    public static PendingIntent m17528a(Context context, PendingIntent pendingIntent, int i) {
        return PendingIntent.getActivity(context, 0, m17529a(context, pendingIntent, i, true), MQEncoder.CARRY_MASK);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f12777a = 0;
            setResult(i2, intent);
            if (booleanExtra) {
                C4137i a = C4137i.m17841a((Context) this);
                if (i2 == -1) {
                    a.mo17857c();
                } else if (i2 == 0) {
                    a.mo17848a(new ConnectionResult(13, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i == 2) {
            this.f12777a = 0;
            setResult(i2, intent);
        }
        finish();
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.f12777a = 0;
        setResult(0);
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f12777a = bundle.getInt("resolution");
        }
        if (this.f12777a != 1) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                finish();
                return;
            }
            PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
            Integer num = (Integer) extras.get(NativeProtocol.BRIDGE_ARG_ERROR_CODE);
            if (pendingIntent == null && num == null) {
                finish();
            } else if (pendingIntent != null) {
                try {
                    startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                    this.f12777a = 1;
                } catch (SendIntentException unused) {
                    finish();
                }
            } else {
                C4279e.m18476a().mo18110b(this, num.intValue(), 2, this);
                this.f12777a = 1;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f12777a);
        super.onSaveInstanceState(bundle);
    }

    /* renamed from: a */
    public static Intent m17529a(Context context, PendingIntent pendingIntent, int i, boolean z) {
        Intent intent = new Intent(context, GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent);
        intent.putExtra("failing_client_id", i);
        intent.putExtra("notify_manager", z);
        return intent;
    }
}
