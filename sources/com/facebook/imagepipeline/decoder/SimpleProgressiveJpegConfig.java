package com.facebook.imagepipeline.decoder;

import com.facebook.common.internal.Preconditions;
import com.facebook.imagepipeline.image.ImmutableQualityInfo;
import com.facebook.imagepipeline.image.QualityInfo;
import java.util.Collections;
import java.util.List;

public class SimpleProgressiveJpegConfig implements ProgressiveJpegConfig {
    private final DynamicValueConfig mDynamicValueConfig;

    private static class DefaultDynamicValueConfig implements DynamicValueConfig {
        private DefaultDynamicValueConfig() {
        }

        public int getGoodEnoughScanNumber() {
            return 0;
        }

        public List<Integer> getScansToDecode() {
            return Collections.EMPTY_LIST;
        }
    }

    public interface DynamicValueConfig {
        int getGoodEnoughScanNumber();

        List<Integer> getScansToDecode();
    }

    public SimpleProgressiveJpegConfig() {
        this(new DefaultDynamicValueConfig());
    }

    public int getNextScanNumberToDecode(int i) {
        List scansToDecode = this.mDynamicValueConfig.getScansToDecode();
        if (scansToDecode == null || scansToDecode.isEmpty()) {
            return i + 1;
        }
        for (int i2 = 0; i2 < scansToDecode.size(); i2++) {
            if (((Integer) scansToDecode.get(i2)).intValue() > i) {
                return ((Integer) scansToDecode.get(i2)).intValue();
            }
        }
        return Integer.MAX_VALUE;
    }

    public QualityInfo getQualityInfo(int i) {
        return ImmutableQualityInfo.m15822of(i, i >= this.mDynamicValueConfig.getGoodEnoughScanNumber(), false);
    }

    public SimpleProgressiveJpegConfig(DynamicValueConfig dynamicValueConfig) {
        this.mDynamicValueConfig = (DynamicValueConfig) Preconditions.checkNotNull(dynamicValueConfig);
    }
}
