package com.google.android.gms.common.stats;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.util.C4476d0;
import com.google.android.gms.common.util.C4477e;
import java.util.Collections;
import java.util.List;

@C4056a
/* renamed from: com.google.android.gms.common.stats.a */
public class C4462a {

    /* renamed from: e */
    private static final Object f13688e = new Object();

    /* renamed from: f */
    private static volatile C4462a f13689f = null;
    @C4476d0

    /* renamed from: g */
    private static boolean f13690g = false;

    /* renamed from: a */
    private final List<String> f13691a;

    /* renamed from: b */
    private final List<String> f13692b;

    /* renamed from: c */
    private final List<String> f13693c;

    /* renamed from: d */
    private final List<String> f13694d;

    private C4462a() {
        List<String> list = Collections.EMPTY_LIST;
        this.f13691a = list;
        this.f13692b = list;
        this.f13693c = list;
        this.f13694d = list;
    }

    @C4056a
    /* renamed from: a */
    public static C4462a m19276a() {
        if (f13689f == null) {
            synchronized (f13688e) {
                if (f13689f == null) {
                    f13689f = new C4462a();
                }
            }
        }
        return f13689f;
    }

    /* renamed from: a */
    public final boolean mo18552a(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i) {
        boolean z;
        ComponentName component = intent.getComponent();
        if (component == null) {
            z = false;
        } else {
            z = C4477e.m19327c(context, component.getPackageName());
        }
        if (z) {
            return false;
        }
        return context.bindService(intent, serviceConnection, i);
    }

    @C4056a
    /* renamed from: a */
    public boolean mo18551a(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        return mo18552a(context, context.getClass().getName(), intent, serviceConnection, i);
    }

    @C4056a
    @SuppressLint({"UntrackedBindService"})
    /* renamed from: a */
    public void mo18550a(Context context, ServiceConnection serviceConnection) {
        context.unbindService(serviceConnection);
    }
}
