package com.google.android.play.core.missingsplits;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.play.core.internal.C7140j0;
import org.apache.http.p549j0.C15430e;

public class PlayCoreMissingSplitsActivity extends Activity implements OnClickListener {
    /* renamed from: a */
    private final String m34381a() {
        return getApplicationInfo().loadLabel(getPackageManager()).toString();
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            String packageName = getPackageName();
            StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 66);
            sb.append("market://details?id=");
            sb.append(packageName);
            sb.append("&referrer=utm_source%3Dplay.core.missingsplits");
            startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(sb.toString())).setPackage("com.android.vending"));
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Builder neutralButton = new Builder(this).setTitle("Installation failed").setCancelable(false).setNeutralButton(C15430e.f44589p, this);
        String str = "The app ";
        if (C7140j0.m34361a(this)) {
            String a = m34381a();
            StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 91);
            sb.append(str);
            sb.append(a);
            sb.append(" is missing required components and must be reinstalled from the Google Play Store.");
            neutralButton.setMessage(sb.toString()).setPositiveButton("Reinstall", this);
        } else {
            String a2 = m34381a();
            StringBuilder sb2 = new StringBuilder(String.valueOf(a2).length() + 87);
            sb2.append(str);
            sb2.append(a2);
            sb2.append(" is missing required components and must be reinstalled from an official store.");
            neutralButton.setMessage(sb2.toString());
        }
        neutralButton.create().show();
    }
}
