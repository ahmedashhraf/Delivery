package com.google.android.play.core.splitinstall;

import android.app.Activity;
import android.content.IntentSender.SendIntentException;
import com.google.android.play.core.tasks.C7191d;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* renamed from: com.google.android.play.core.splitinstall.b */
public interface C7158b {
    /* renamed from: a */
    C7191d<SplitInstallSessionState> mo28574a(int i);

    /* renamed from: a */
    C7191d<Integer> mo28575a(C7161d dVar);

    /* renamed from: a */
    C7191d<Void> mo28576a(List<String> list);

    /* renamed from: a */
    Set<String> mo28577a();

    /* renamed from: a */
    void mo28578a(C7164e eVar);

    /* renamed from: a */
    boolean mo28579a(SplitInstallSessionState splitInstallSessionState, Activity activity, int i) throws SendIntentException;

    /* renamed from: b */
    C7191d<List<SplitInstallSessionState>> mo28580b();

    /* renamed from: b */
    C7191d<Void> mo28581b(int i);

    /* renamed from: b */
    C7191d<Void> mo28582b(List<Locale> list);

    /* renamed from: b */
    void mo28583b(C7164e eVar);

    /* renamed from: c */
    C7191d<Void> mo28584c(List<String> list);

    /* renamed from: c */
    Set<String> mo28585c();

    /* renamed from: d */
    C7191d<Void> mo28586d(List<Locale> list);
}
