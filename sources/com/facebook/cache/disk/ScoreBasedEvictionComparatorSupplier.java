package com.facebook.cache.disk;

import com.facebook.cache.disk.DiskStorage.Entry;
import com.facebook.common.internal.VisibleForTesting;

public class ScoreBasedEvictionComparatorSupplier implements EntryEvictionComparatorSupplier {
    private final float mAgeWeight;
    private final float mSizeWeight;

    public ScoreBasedEvictionComparatorSupplier(float f, float f2) {
        this.mAgeWeight = f;
        this.mSizeWeight = f2;
    }

    /* access modifiers changed from: 0000 */
    @VisibleForTesting
    public float calculateScore(Entry entry, long j) {
        return (this.mAgeWeight * ((float) (j - entry.getTimestamp()))) + (this.mSizeWeight * ((float) entry.getSize()));
    }

    public EntryEvictionComparator get() {
        return new EntryEvictionComparator() {
            long now = System.currentTimeMillis();

            public int compare(Entry entry, Entry entry2) {
                float calculateScore = ScoreBasedEvictionComparatorSupplier.this.calculateScore(entry, this.now);
                float calculateScore2 = ScoreBasedEvictionComparatorSupplier.this.calculateScore(entry2, this.now);
                if (calculateScore < calculateScore2) {
                    return 1;
                }
                return calculateScore2 == calculateScore ? 0 : -1;
            }
        };
    }
}
