package com.instabug.bug.screenshot.viewhierarchy.utilities;

import com.instabug.bug.p356h.p357b.C9270c.C9272b;
import com.instabug.library.core.eventbus.EventBus;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class ViewHierarchyInspectorEventBus extends EventBus<C9272b> {
    private static transient /* synthetic */ boolean[] $jacocoData;
    private static ViewHierarchyInspectorEventBus instance;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(8958676024913656520L, "com/instabug/bug/screenshot/viewhierarchy/utilities/ViewHierarchyInspectorEventBus", 5);
        $jacocoData = a;
        return a;
    }

    public ViewHierarchyInspectorEventBus() {
        $jacocoInit()[0] = true;
    }

    public static ViewHierarchyInspectorEventBus getInstance() {
        boolean[] $jacocoInit = $jacocoInit();
        if (instance != null) {
            $jacocoInit[1] = true;
        } else {
            $jacocoInit[2] = true;
            instance = new ViewHierarchyInspectorEventBus();
            $jacocoInit[3] = true;
        }
        ViewHierarchyInspectorEventBus viewHierarchyInspectorEventBus = instance;
        $jacocoInit[4] = true;
        return viewHierarchyInspectorEventBus;
    }
}
