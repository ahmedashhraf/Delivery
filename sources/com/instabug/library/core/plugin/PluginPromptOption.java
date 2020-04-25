package com.instabug.library.core.plugin;

import android.net.Uri;
import androidx.annotation.C0195i0;
import androidx.annotation.C0213q;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;
import p205i.p471b.p472a.p473a.p474c.C13938g;

@SuppressFBWarnings({"SE_BAD_FIELD"})
public class PluginPromptOption implements Serializable {
    private static transient /* synthetic */ boolean[] $jacocoData;
    @C0213q
    private int icon;
    private int invocationMode;
    private int notificationCount;
    private OnInvocationListener onInvocationListener;
    private int order;
    private String title;

    public interface OnInvocationListener {
        void onInvoke(Uri uri);
    }

    /* renamed from: com.instabug.library.core.plugin.PluginPromptOption$a */
    public static class C9788a implements Serializable, Comparator<PluginPromptOption> {

        /* renamed from: a */
        private static transient /* synthetic */ boolean[] f25969a;

        public C9788a() {
            m45655a()[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45655a() {
            boolean[] zArr = f25969a;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-6859343475996271342L, "com/instabug/library/core/plugin/PluginPromptOption$CustomComparator", 3);
            f25969a = a;
            return a;
        }

        /* renamed from: a */
        public int mo34904a(PluginPromptOption pluginPromptOption, PluginPromptOption pluginPromptOption2) {
            int order = pluginPromptOption.getOrder() - pluginPromptOption2.getOrder();
            m45655a()[1] = true;
            return order;
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            boolean[] a = m45655a();
            int a2 = mo34904a((PluginPromptOption) obj, (PluginPromptOption) obj2);
            a[2] = true;
            return a2;
        }
    }

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-5881758157914572505L, "com/instabug/library/core/plugin/PluginPromptOption", 25);
        $jacocoData = a;
        return a;
    }

    public PluginPromptOption() {
        $jacocoInit()[0] = true;
    }

    @C0195i0
    public static PluginPromptOption getPromptOptionByInvocationMode(int i) {
        boolean[] $jacocoInit = $jacocoInit();
        Iterator it = C9789a.m45662c().iterator();
        $jacocoInit[19] = true;
        while (it.hasNext()) {
            PluginPromptOption pluginPromptOption = (PluginPromptOption) it.next();
            $jacocoInit[20] = true;
            if (pluginPromptOption.getInvocationMode() == i) {
                $jacocoInit[21] = true;
                return pluginPromptOption;
            }
            $jacocoInit[22] = true;
        }
        $jacocoInit[23] = true;
        return null;
    }

    @C0213q
    public int getIcon() {
        boolean[] $jacocoInit = $jacocoInit();
        int i = this.icon;
        $jacocoInit[5] = true;
        return i;
    }

    public int getInvocationMode() {
        boolean[] $jacocoInit = $jacocoInit();
        int i = this.invocationMode;
        $jacocoInit[12] = true;
        return i;
    }

    public int getNotificationCount() {
        boolean[] $jacocoInit = $jacocoInit();
        int i = this.notificationCount;
        $jacocoInit[7] = true;
        return i;
    }

    public int getOrder() {
        boolean[] $jacocoInit = $jacocoInit();
        int i = this.order;
        $jacocoInit[1] = true;
        return i;
    }

    public String getTitle() {
        boolean[] $jacocoInit = $jacocoInit();
        String str = this.title;
        $jacocoInit[3] = true;
        return str;
    }

    public void invoke(Uri uri) {
        boolean[] $jacocoInit = $jacocoInit();
        OnInvocationListener onInvocationListener2 = this.onInvocationListener;
        if (onInvocationListener2 == null) {
            $jacocoInit[14] = true;
        } else {
            $jacocoInit[15] = true;
            onInvocationListener2.onInvoke(uri);
            $jacocoInit[16] = true;
        }
        $jacocoInit[17] = true;
    }

    public void setIcon(@C0213q int i) {
        boolean[] $jacocoInit = $jacocoInit();
        this.icon = i;
        $jacocoInit[6] = true;
    }

    public void setInvocationMode(int i) {
        boolean[] $jacocoInit = $jacocoInit();
        this.invocationMode = i;
        $jacocoInit[13] = true;
    }

    public void setNotificationCount(int i) {
        boolean[] $jacocoInit = $jacocoInit();
        if (i > 99) {
            this.notificationCount = 99;
            $jacocoInit[8] = true;
        } else if (i < 0) {
            this.notificationCount = 0;
            $jacocoInit[9] = true;
        } else {
            this.notificationCount = i;
            $jacocoInit[10] = true;
        }
        $jacocoInit[11] = true;
    }

    public void setOnInvocationListener(OnInvocationListener onInvocationListener2) {
        boolean[] $jacocoInit = $jacocoInit();
        this.onInvocationListener = onInvocationListener2;
        $jacocoInit[24] = true;
    }

    public void setOrder(int i) {
        boolean[] $jacocoInit = $jacocoInit();
        this.order = i;
        $jacocoInit[2] = true;
    }

    public void setTitle(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        this.title = str;
        $jacocoInit[4] = true;
    }

    public void invoke() {
        boolean[] $jacocoInit = $jacocoInit();
        invoke(null);
        $jacocoInit[18] = true;
    }
}
