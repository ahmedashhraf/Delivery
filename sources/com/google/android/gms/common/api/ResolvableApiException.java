package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender.SendIntentException;
import androidx.annotation.C0193h0;

public class ResolvableApiException extends ApiException {
    public ResolvableApiException(@C0193h0 Status status) {
        super(status);
    }

    /* renamed from: a */
    public void mo17604a(Activity activity, int i) throws SendIntentException {
        this.f12775a.mo17618a(activity, i);
    }

    /* renamed from: e */
    public PendingIntent mo17605e() {
        return this.f12775a.mo17611N();
    }
}
