package com.facebook.internal;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.p013a.C0591c;
import androidx.browser.p013a.C0591c.C0592a;
import com.facebook.FacebookSdk;
import p076c.p112d.p148d.p150g.C6637f;

public class CustomTab {
    private Uri uri;

    public CustomTab(String str, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        String dialogAuthority = ServerProtocol.getDialogAuthority();
        StringBuilder sb = new StringBuilder();
        sb.append(FacebookSdk.getGraphApiVersion());
        sb.append("/");
        sb.append(ServerProtocol.DIALOG_PATH);
        sb.append(str);
        this.uri = Utility.buildUri(dialogAuthority, sb.toString(), bundle);
    }

    public void openCustomTab(Activity activity, String str) {
        C0591c b = new C0592a().mo3046b();
        b.f2365a.setPackage(str);
        b.f2365a.addFlags(C6637f.f18605b);
        b.mo3032a(activity, this.uri);
    }
}
