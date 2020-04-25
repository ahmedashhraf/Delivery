package com.facebook.imagepipeline.image;

public class ImmutableQualityInfo implements QualityInfo {
    public static final QualityInfo FULL_QUALITY = m15822of(Integer.MAX_VALUE, true, true);
    boolean mIsOfFullQuality;
    boolean mIsOfGoodEnoughQuality;
    int mQuality;

    private ImmutableQualityInfo(int i, boolean z, boolean z2) {
        this.mQuality = i;
        this.mIsOfGoodEnoughQuality = z;
        this.mIsOfFullQuality = z2;
    }

    /* renamed from: of */
    public static QualityInfo m15822of(int i, boolean z, boolean z2) {
        return new ImmutableQualityInfo(i, z, z2);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableQualityInfo)) {
            return false;
        }
        ImmutableQualityInfo immutableQualityInfo = (ImmutableQualityInfo) obj;
        if (!(this.mQuality == immutableQualityInfo.mQuality && this.mIsOfGoodEnoughQuality == immutableQualityInfo.mIsOfGoodEnoughQuality && this.mIsOfFullQuality == immutableQualityInfo.mIsOfFullQuality)) {
            z = false;
        }
        return z;
    }

    public int getQuality() {
        return this.mQuality;
    }

    public int hashCode() {
        int i = 0;
        int i2 = this.mQuality ^ (this.mIsOfGoodEnoughQuality ? 4194304 : 0);
        if (this.mIsOfFullQuality) {
            i = 8388608;
        }
        return i2 ^ i;
    }

    public boolean isOfFullQuality() {
        return this.mIsOfFullQuality;
    }

    public boolean isOfGoodEnoughQuality() {
        return this.mIsOfGoodEnoughQuality;
    }
}
