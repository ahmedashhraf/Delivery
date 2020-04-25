package com.instabug.library.core.plugin;

import android.content.Context;
import androidx.annotation.C0194i;
import androidx.annotation.C0195i0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public abstract class Plugin {
    private static transient /* synthetic */ boolean[] $jacocoData = null;
    public static final int STATE_BACKGROUND = 0;
    public static final int STATE_FOREGROUND = 1;
    public static final int STATE_PROCESSING_ATTACHMENT = 2;
    protected WeakReference<Context> contextWeakReference;
    protected int state = 0;

    @Retention(RetentionPolicy.SOURCE)
    public @interface PluginState {
    }

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-1952428521179894833L, "com/instabug/library/core/plugin/Plugin", 13);
        $jacocoData = a;
        return a;
    }

    public Plugin() {
        boolean[] $jacocoInit = $jacocoInit();
        $jacocoInit[0] = true;
    }

    @C0195i0
    public Context getAppContext() {
        boolean[] $jacocoInit = $jacocoInit();
        WeakReference<Context> weakReference = this.contextWeakReference;
        if (weakReference == null) {
            $jacocoInit[5] = true;
            return null;
        }
        Context context = (Context) weakReference.get();
        $jacocoInit[6] = true;
        return context;
    }

    public abstract long getLastActivityTime();

    public ArrayList<PluginPromptOption> getPromptOptions() {
        $jacocoInit()[2] = true;
        return null;
    }

    public int getState() {
        boolean[] $jacocoInit = $jacocoInit();
        int i = this.state;
        $jacocoInit[4] = true;
        return i;
    }

    @C0194i
    public void init(Context context) {
        boolean[] $jacocoInit = $jacocoInit();
        this.contextWeakReference = new WeakReference<>(context);
        $jacocoInit[1] = true;
    }

    public void invoke(PluginPromptOption pluginPromptOption) {
        $jacocoInit()[12] = true;
    }

    public boolean isAppContextAvailable() {
        boolean z;
        boolean[] $jacocoInit = $jacocoInit();
        WeakReference<Context> weakReference = this.contextWeakReference;
        if (weakReference == null) {
            $jacocoInit[7] = true;
        } else if (weakReference.get() == null) {
            $jacocoInit[8] = true;
        } else {
            $jacocoInit[9] = true;
            z = true;
            $jacocoInit[11] = true;
            return z;
        }
        z = false;
        $jacocoInit[10] = true;
        $jacocoInit[11] = true;
        return z;
    }

    public abstract void release();

    public void setState(int i) {
        boolean[] $jacocoInit = $jacocoInit();
        this.state = i;
        $jacocoInit[3] = true;
    }
}
