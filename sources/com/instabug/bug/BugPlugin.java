package com.instabug.bug;

import android.content.Context;
import com.instabug.bug.settings.C9291a;
import com.instabug.library.core.plugin.Plugin;
import com.instabug.library.core.plugin.PluginPromptOption;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p195e.p196a.p447u0.C12314c;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class BugPlugin extends Plugin {
    private static transient /* synthetic */ boolean[] $jacocoData;
    private C12314c coreEventsDisposable;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(2021029349885420026L, "com/instabug/bug/BugPlugin", 12);
        $jacocoData = a;
        return a;
    }

    public BugPlugin() {
        $jacocoInit()[0] = true;
    }

    private void subscribeOnCoreEvents() {
        boolean[] $jacocoInit = $jacocoInit();
        WeakReference<Context> weakReference = this.contextWeakReference;
        $jacocoInit[4] = true;
        Context context = (Context) weakReference.get();
        $jacocoInit[5] = true;
        this.coreEventsDisposable = C9238a.m43167a(C9238a.m43175b(context));
        $jacocoInit[6] = true;
    }

    private void unSubscribeFromCoreEvents() {
        boolean[] $jacocoInit = $jacocoInit();
        C9238a.m43174a(this.coreEventsDisposable);
        $jacocoInit[10] = true;
    }

    public long getLastActivityTime() {
        boolean[] $jacocoInit = $jacocoInit();
        long j = C9291a.m43476r().mo33617j();
        $jacocoInit[11] = true;
        return j;
    }

    public ArrayList<PluginPromptOption> getPromptOptions() {
        boolean[] $jacocoInit = $jacocoInit();
        ArrayList<PluginPromptOption> c = C9238a.m43180c((Context) this.contextWeakReference.get());
        $jacocoInit[7] = true;
        return c;
    }

    public void init(Context context) {
        boolean[] $jacocoInit = $jacocoInit();
        super.init(context);
        $jacocoInit[1] = true;
        C9238a.m43171a(context);
        $jacocoInit[2] = true;
        subscribeOnCoreEvents();
        $jacocoInit[3] = true;
    }

    public void release() {
        boolean[] $jacocoInit = $jacocoInit();
        C9238a.m43168a();
        $jacocoInit[8] = true;
        unSubscribeFromCoreEvents();
        $jacocoInit[9] = true;
    }
}
