package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.C4056a;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.p313a.C8617a;
import com.google.firebase.components.C8641e;
import com.google.firebase.components.C8650i;
import com.google.firebase.components.C8659o;
import com.google.firebase.p192p.C8763f;
import com.google.firebase.p314i.C8674d;
import java.util.Arrays;
import java.util.List;

@C4056a
@Keep
/* compiled from: com.google.android.gms:play-services-measurement-api@@17.1.0 */
public class AnalyticsConnectorRegistrar implements C8650i {
    @SuppressLint({"MissingPermission"})
    @Keep
    @C4056a
    public List<C8641e<?>> getComponents() {
        return Arrays.asList(new C8641e[]{C8641e.m40631a(C8617a.class).mo32002a(C8659o.m40696c(FirebaseApp.class)).mo32002a(C8659o.m40696c(Context.class)).mo32002a(C8659o.m40696c(C8674d.class)).mo32001a(C8629b.f22646a).mo32005c().mo32004b(), C8763f.m41064a("fire-analytics", "17.1.0")});
    }
}
