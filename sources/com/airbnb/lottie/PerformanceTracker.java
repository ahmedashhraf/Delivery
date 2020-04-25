package com.airbnb.lottie;

import androidx.collection.C0637b;
import androidx.core.p033k.C0938f;
import com.airbnb.lottie.utils.MeanCalculator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PerformanceTracker {
    private boolean enabled = false;
    private final Comparator<C0938f<String, Float>> floatComparator = new Comparator<C0938f<String, Float>>() {
        public int compare(C0938f<String, Float> fVar, C0938f<String, Float> fVar2) {
            float floatValue = ((Float) fVar.f4244b).floatValue();
            float floatValue2 = ((Float) fVar2.f4244b).floatValue();
            if (floatValue2 > floatValue) {
                return 1;
            }
            return floatValue > floatValue2 ? -1 : 0;
        }
    };
    private final Set<FrameListener> frameListeners = new C0637b();
    private final Map<String, MeanCalculator> layerRenderTimes = new HashMap();

    public interface FrameListener {
        void onFrameRendered(float f);
    }

    public void addFrameListener(FrameListener frameListener) {
        this.frameListeners.add(frameListener);
    }

    public void clearRenderTimes() {
        this.layerRenderTimes.clear();
    }

    public List<C0938f<String, Float>> getSortedRenderTimes() {
        if (!this.enabled) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(this.layerRenderTimes.size());
        for (Entry entry : this.layerRenderTimes.entrySet()) {
            arrayList.add(new C0938f(entry.getKey(), Float.valueOf(((MeanCalculator) entry.getValue()).getMean())));
        }
        Collections.sort(arrayList, this.floatComparator);
        return arrayList;
    }

    public void logRenderTimes() {
        if (this.enabled) {
            List sortedRenderTimes = getSortedRenderTimes();
            for (int i = 0; i < sortedRenderTimes.size(); i++) {
                C0938f fVar = (C0938f) sortedRenderTimes.get(i);
                String.format("\t\t%30s:%.2f", new Object[]{fVar.f4243a, fVar.f4244b});
            }
        }
    }

    public void recordRenderTime(String str, float f) {
        if (this.enabled) {
            MeanCalculator meanCalculator = (MeanCalculator) this.layerRenderTimes.get(str);
            if (meanCalculator == null) {
                meanCalculator = new MeanCalculator();
                this.layerRenderTimes.put(str, meanCalculator);
            }
            meanCalculator.add(f);
            if (str.equals("__container")) {
                for (FrameListener onFrameRendered : this.frameListeners) {
                    onFrameRendered.onFrameRendered(f);
                }
            }
        }
    }

    public void removeFrameListener(FrameListener frameListener) {
        this.frameListeners.remove(frameListener);
    }

    /* access modifiers changed from: 0000 */
    public void setEnabled(boolean z) {
        this.enabled = z;
    }
}
