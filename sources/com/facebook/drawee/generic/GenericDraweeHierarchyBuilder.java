package com.facebook.drawee.generic;

import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import com.facebook.common.internal.Preconditions;
import com.facebook.drawee.drawable.ScalingUtils.ScaleType;
import java.util.Arrays;
import java.util.List;
import p201f.p202a.C5952h;

public class GenericDraweeHierarchyBuilder {
    public static final ScaleType DEFAULT_ACTUAL_IMAGE_SCALE_TYPE = ScaleType.CENTER_CROP;
    public static final int DEFAULT_FADE_DURATION = 300;
    public static final ScaleType DEFAULT_SCALE_TYPE = ScaleType.CENTER_INSIDE;
    private ColorFilter mActualImageColorFilter;
    private PointF mActualImageFocusPoint;
    private Matrix mActualImageMatrix;
    private ScaleType mActualImageScaleType;
    private Drawable mBackground;
    private float mDesiredAspectRatio;
    private int mFadeDuration;
    private Drawable mFailureImage;
    private ScaleType mFailureImageScaleType;
    private List<Drawable> mOverlays;
    private Drawable mPlaceholderImage;
    @C5952h
    private ScaleType mPlaceholderImageScaleType;
    private Drawable mPressedStateOverlay;
    private Drawable mProgressBarImage;
    private ScaleType mProgressBarImageScaleType;
    private Resources mResources;
    private Drawable mRetryImage;
    private ScaleType mRetryImageScaleType;
    private RoundingParams mRoundingParams;

    public GenericDraweeHierarchyBuilder(Resources resources) {
        this.mResources = resources;
        init();
    }

    private void init() {
        this.mFadeDuration = 300;
        this.mDesiredAspectRatio = 0.0f;
        this.mPlaceholderImage = null;
        ScaleType scaleType = DEFAULT_SCALE_TYPE;
        this.mPlaceholderImageScaleType = scaleType;
        this.mRetryImage = null;
        this.mRetryImageScaleType = scaleType;
        this.mFailureImage = null;
        this.mFailureImageScaleType = scaleType;
        this.mProgressBarImage = null;
        this.mProgressBarImageScaleType = scaleType;
        this.mActualImageScaleType = DEFAULT_ACTUAL_IMAGE_SCALE_TYPE;
        this.mActualImageMatrix = null;
        this.mActualImageFocusPoint = null;
        this.mActualImageColorFilter = null;
        this.mBackground = null;
        this.mOverlays = null;
        this.mPressedStateOverlay = null;
        this.mRoundingParams = null;
    }

    public static GenericDraweeHierarchyBuilder newInstance(Resources resources) {
        return new GenericDraweeHierarchyBuilder(resources);
    }

    private void validate() {
        List<Drawable> list = this.mOverlays;
        if (list != null) {
            for (Drawable checkNotNull : list) {
                Preconditions.checkNotNull(checkNotNull);
            }
        }
    }

    public GenericDraweeHierarchy build() {
        validate();
        return new GenericDraweeHierarchy(this);
    }

    @C5952h
    public ColorFilter getActualImageColorFilter() {
        return this.mActualImageColorFilter;
    }

    @C5952h
    public PointF getActualImageFocusPoint() {
        return this.mActualImageFocusPoint;
    }

    @C5952h
    public ScaleType getActualImageScaleType() {
        return this.mActualImageScaleType;
    }

    @C5952h
    public Drawable getBackground() {
        return this.mBackground;
    }

    public float getDesiredAspectRatio() {
        return this.mDesiredAspectRatio;
    }

    public int getFadeDuration() {
        return this.mFadeDuration;
    }

    @C5952h
    public Drawable getFailureImage() {
        return this.mFailureImage;
    }

    @C5952h
    public ScaleType getFailureImageScaleType() {
        return this.mFailureImageScaleType;
    }

    @C5952h
    public List<Drawable> getOverlays() {
        return this.mOverlays;
    }

    @C5952h
    public Drawable getPlaceholderImage() {
        return this.mPlaceholderImage;
    }

    @C5952h
    public ScaleType getPlaceholderImageScaleType() {
        return this.mPlaceholderImageScaleType;
    }

    @C5952h
    public Drawable getPressedStateOverlay() {
        return this.mPressedStateOverlay;
    }

    @C5952h
    public Drawable getProgressBarImage() {
        return this.mProgressBarImage;
    }

    @C5952h
    public ScaleType getProgressBarImageScaleType() {
        return this.mProgressBarImageScaleType;
    }

    public Resources getResources() {
        return this.mResources;
    }

    @C5952h
    public Drawable getRetryImage() {
        return this.mRetryImage;
    }

    @C5952h
    public ScaleType getRetryImageScaleType() {
        return this.mRetryImageScaleType;
    }

    @C5952h
    public RoundingParams getRoundingParams() {
        return this.mRoundingParams;
    }

    public GenericDraweeHierarchyBuilder reset() {
        init();
        return this;
    }

    public GenericDraweeHierarchyBuilder setActualImageColorFilter(@C5952h ColorFilter colorFilter) {
        this.mActualImageColorFilter = colorFilter;
        return this;
    }

    public GenericDraweeHierarchyBuilder setActualImageFocusPoint(@C5952h PointF pointF) {
        this.mActualImageFocusPoint = pointF;
        return this;
    }

    public GenericDraweeHierarchyBuilder setActualImageScaleType(@C5952h ScaleType scaleType) {
        this.mActualImageScaleType = scaleType;
        this.mActualImageMatrix = null;
        return this;
    }

    public GenericDraweeHierarchyBuilder setBackground(@C5952h Drawable drawable) {
        this.mBackground = drawable;
        return this;
    }

    public GenericDraweeHierarchyBuilder setDesiredAspectRatio(float f) {
        this.mDesiredAspectRatio = f;
        return this;
    }

    public GenericDraweeHierarchyBuilder setFadeDuration(int i) {
        this.mFadeDuration = i;
        return this;
    }

    public GenericDraweeHierarchyBuilder setFailureImage(@C5952h Drawable drawable) {
        this.mFailureImage = drawable;
        return this;
    }

    public GenericDraweeHierarchyBuilder setFailureImageScaleType(@C5952h ScaleType scaleType) {
        this.mFailureImageScaleType = scaleType;
        return this;
    }

    public GenericDraweeHierarchyBuilder setOverlay(@C5952h Drawable drawable) {
        if (drawable == null) {
            this.mOverlays = null;
        } else {
            this.mOverlays = Arrays.asList(new Drawable[]{drawable});
        }
        return this;
    }

    public GenericDraweeHierarchyBuilder setOverlays(@C5952h List<Drawable> list) {
        this.mOverlays = list;
        return this;
    }

    public GenericDraweeHierarchyBuilder setPlaceholderImage(@C5952h Drawable drawable) {
        this.mPlaceholderImage = drawable;
        return this;
    }

    public GenericDraweeHierarchyBuilder setPlaceholderImageScaleType(@C5952h ScaleType scaleType) {
        this.mPlaceholderImageScaleType = scaleType;
        return this;
    }

    public GenericDraweeHierarchyBuilder setPressedStateOverlay(@C5952h Drawable drawable) {
        if (drawable == null) {
            this.mPressedStateOverlay = null;
        } else {
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{16842919}, drawable);
            this.mPressedStateOverlay = stateListDrawable;
        }
        return this;
    }

    public GenericDraweeHierarchyBuilder setProgressBarImage(@C5952h Drawable drawable) {
        this.mProgressBarImage = drawable;
        return this;
    }

    public GenericDraweeHierarchyBuilder setProgressBarImageScaleType(@C5952h ScaleType scaleType) {
        this.mProgressBarImageScaleType = scaleType;
        return this;
    }

    public GenericDraweeHierarchyBuilder setRetryImage(@C5952h Drawable drawable) {
        this.mRetryImage = drawable;
        return this;
    }

    public GenericDraweeHierarchyBuilder setRetryImageScaleType(@C5952h ScaleType scaleType) {
        this.mRetryImageScaleType = scaleType;
        return this;
    }

    public GenericDraweeHierarchyBuilder setRoundingParams(@C5952h RoundingParams roundingParams) {
        this.mRoundingParams = roundingParams;
        return this;
    }

    public GenericDraweeHierarchyBuilder setFailureImage(int i) {
        this.mFailureImage = this.mResources.getDrawable(i);
        return this;
    }

    public GenericDraweeHierarchyBuilder setPlaceholderImage(int i) {
        this.mPlaceholderImage = this.mResources.getDrawable(i);
        return this;
    }

    public GenericDraweeHierarchyBuilder setProgressBarImage(int i) {
        this.mProgressBarImage = this.mResources.getDrawable(i);
        return this;
    }

    public GenericDraweeHierarchyBuilder setRetryImage(int i) {
        this.mRetryImage = this.mResources.getDrawable(i);
        return this;
    }

    public GenericDraweeHierarchyBuilder setFailureImage(Drawable drawable, @C5952h ScaleType scaleType) {
        this.mFailureImage = drawable;
        this.mFailureImageScaleType = scaleType;
        return this;
    }

    public GenericDraweeHierarchyBuilder setPlaceholderImage(Drawable drawable, @C5952h ScaleType scaleType) {
        this.mPlaceholderImage = drawable;
        this.mPlaceholderImageScaleType = scaleType;
        return this;
    }

    public GenericDraweeHierarchyBuilder setProgressBarImage(Drawable drawable, @C5952h ScaleType scaleType) {
        this.mProgressBarImage = drawable;
        this.mProgressBarImageScaleType = scaleType;
        return this;
    }

    public GenericDraweeHierarchyBuilder setRetryImage(Drawable drawable, @C5952h ScaleType scaleType) {
        this.mRetryImage = drawable;
        this.mRetryImageScaleType = scaleType;
        return this;
    }

    public GenericDraweeHierarchyBuilder setFailureImage(int i, @C5952h ScaleType scaleType) {
        this.mFailureImage = this.mResources.getDrawable(i);
        this.mFailureImageScaleType = scaleType;
        return this;
    }

    public GenericDraweeHierarchyBuilder setPlaceholderImage(int i, @C5952h ScaleType scaleType) {
        this.mPlaceholderImage = this.mResources.getDrawable(i);
        this.mPlaceholderImageScaleType = scaleType;
        return this;
    }

    public GenericDraweeHierarchyBuilder setProgressBarImage(int i, @C5952h ScaleType scaleType) {
        this.mProgressBarImage = this.mResources.getDrawable(i);
        this.mProgressBarImageScaleType = scaleType;
        return this;
    }

    public GenericDraweeHierarchyBuilder setRetryImage(int i, @C5952h ScaleType scaleType) {
        this.mRetryImage = this.mResources.getDrawable(i);
        this.mRetryImageScaleType = scaleType;
        return this;
    }
}
