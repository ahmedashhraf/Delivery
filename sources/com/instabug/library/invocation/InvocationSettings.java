package com.instabug.library.invocation;

import com.instabug.library.invocation.p390a.C9882a;
import com.instabug.library.invocation.p390a.C9883b;
import com.instabug.library.invocation.p390a.C9883b.C9889e;
import com.instabug.library.invocation.p390a.C9906e;
import com.instabug.library.invocation.util.InstabugFloatingButtonEdge;
import com.instabug.library.invocation.util.InstabugVideoRecordingButtonPosition;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.Iterator;
import java.util.List;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class InvocationSettings {
    private static transient /* synthetic */ boolean[] $jacocoData = null;
    public static final int SHAKE_DEFAULT_THRESHOLD = 650;
    private int defaultInvocationMode = 0;
    private final boolean[] enabledPromptOptions = new boolean[5];
    private C9889e floatingButtonParams;
    private int shakeThreshold = SHAKE_DEFAULT_THRESHOLD;
    private InstabugVideoRecordingButtonPosition videoRecordingButtonPosition = InstabugVideoRecordingButtonPosition.BOTTOM_RIGHT;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(8139545620234412410L, "com/instabug/library/invocation/InvocationSettings", 32);
        $jacocoData = a;
        return a;
    }

    InvocationSettings() {
        boolean[] $jacocoInit = $jacocoInit();
        $jacocoInit[0] = true;
        this.floatingButtonParams = new C9889e();
        $jacocoInit[1] = true;
    }

    public void disabledPromptOption(int i) {
        boolean[] $jacocoInit = $jacocoInit();
        this.enabledPromptOptions[i] = false;
        $jacocoInit[28] = true;
    }

    public void enabledPromptOption(int i) {
        boolean[] $jacocoInit = $jacocoInit();
        this.enabledPromptOptions[i] = true;
        $jacocoInit[27] = true;
    }

    public int getDefaultInvocationMode() {
        boolean[] $jacocoInit = $jacocoInit();
        int i = this.defaultInvocationMode;
        $jacocoInit[2] = true;
        return i;
    }

    @SuppressFBWarnings({"EI_EXPOSE_REP"})
    public boolean[] getEnabledPromptOptions() {
        boolean[] $jacocoInit = $jacocoInit();
        boolean[] zArr = this.enabledPromptOptions;
        $jacocoInit[29] = true;
        return zArr;
    }

    public C9889e getFloatingButtonParams() {
        boolean[] $jacocoInit = $jacocoInit();
        C9889e eVar = this.floatingButtonParams;
        $jacocoInit[14] = true;
        return eVar;
    }

    /* access modifiers changed from: 0000 */
    public int getShakeThreshold() {
        boolean[] $jacocoInit = $jacocoInit();
        int i = this.shakeThreshold;
        $jacocoInit[26] = true;
        return i;
    }

    public InstabugVideoRecordingButtonPosition getVideoRecordingButtonPosition() {
        boolean[] $jacocoInit = $jacocoInit();
        InstabugVideoRecordingButtonPosition instabugVideoRecordingButtonPosition = this.videoRecordingButtonPosition;
        $jacocoInit[30] = true;
        return instabugVideoRecordingButtonPosition;
    }

    public void resetDefaultInvocationMode() {
        boolean[] $jacocoInit = $jacocoInit();
        this.defaultInvocationMode = 0;
        $jacocoInit[4] = true;
    }

    public void setDefaultInvocationMode(int i) {
        boolean[] $jacocoInit = $jacocoInit();
        this.defaultInvocationMode = i;
        $jacocoInit[3] = true;
    }

    public void setFloatingButtonEdge(InstabugFloatingButtonEdge instabugFloatingButtonEdge) {
        boolean[] $jacocoInit = $jacocoInit();
        this.floatingButtonParams.f26265a = instabugFloatingButtonEdge;
        $jacocoInit[5] = true;
        if (InvocationManager.getInstance().getCurrentInvokers() == null) {
            $jacocoInit[6] = true;
        } else {
            $jacocoInit[7] = true;
            Iterator it = InvocationManager.getInstance().getCurrentInvokers().iterator();
            if (!it.hasNext()) {
                $jacocoInit[8] = true;
            } else {
                C9882a aVar = (C9882a) it.next();
                if (!(aVar instanceof C9883b)) {
                    $jacocoInit[9] = true;
                } else {
                    $jacocoInit[10] = true;
                    ((C9883b) aVar).mo35186a();
                    $jacocoInit[11] = true;
                }
            }
        }
        $jacocoInit[12] = true;
    }

    public void setFloatingButtonOffsetFromTop(int i) {
        boolean[] $jacocoInit = $jacocoInit();
        this.floatingButtonParams.f26266b = i;
        $jacocoInit[13] = true;
    }

    public void setShakingThreshold(int i) {
        boolean[] $jacocoInit = $jacocoInit();
        if (i <= 0) {
            $jacocoInit[15] = true;
        } else {
            this.shakeThreshold = i;
            $jacocoInit[16] = true;
            List<C9882a> currentInvokers = InvocationManager.getInstance().getCurrentInvokers();
            if (currentInvokers == null) {
                $jacocoInit[17] = true;
            } else {
                $jacocoInit[18] = true;
                $jacocoInit[19] = true;
                for (C9882a aVar : currentInvokers) {
                    if (!(aVar instanceof C9906e)) {
                        $jacocoInit[21] = true;
                    } else {
                        $jacocoInit[22] = true;
                        ((C9906e) aVar).mo35217a(i);
                        $jacocoInit[23] = true;
                    }
                    $jacocoInit[24] = true;
                }
                $jacocoInit[20] = true;
            }
        }
        $jacocoInit[25] = true;
    }

    public void setVideoRecordingButtonPosition(InstabugVideoRecordingButtonPosition instabugVideoRecordingButtonPosition) {
        boolean[] $jacocoInit = $jacocoInit();
        this.videoRecordingButtonPosition = instabugVideoRecordingButtonPosition;
        $jacocoInit[31] = true;
    }
}
