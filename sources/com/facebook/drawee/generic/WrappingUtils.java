package com.facebook.drawee.generic;

import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Build.VERSION;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.logging.FLog;
import com.facebook.drawee.drawable.DrawableParent;
import com.facebook.drawee.drawable.ForwardingDrawable;
import com.facebook.drawee.drawable.MatrixDrawable;
import com.facebook.drawee.drawable.Rounded;
import com.facebook.drawee.drawable.RoundedBitmapDrawable;
import com.facebook.drawee.drawable.RoundedColorDrawable;
import com.facebook.drawee.drawable.RoundedCornersDrawable;
import com.facebook.drawee.drawable.RoundedNinePatchDrawable;
import com.facebook.drawee.drawable.ScaleTypeDrawable;
import com.facebook.drawee.drawable.ScalingUtils.ScaleType;
import com.facebook.drawee.generic.RoundingParams.RoundingMethod;
import p201f.p202a.C5952h;

public class WrappingUtils {
    private static final String TAG = "WrappingUtils";
    private static final Drawable sEmptyDrawable = new ColorDrawable(0);

    private static Drawable applyLeafRounding(Drawable drawable, RoundingParams roundingParams, Resources resources) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            RoundedBitmapDrawable roundedBitmapDrawable = new RoundedBitmapDrawable(resources, bitmapDrawable.getBitmap(), bitmapDrawable.getPaint());
            applyRoundingParams(roundedBitmapDrawable, roundingParams);
            return roundedBitmapDrawable;
        } else if (drawable instanceof NinePatchDrawable) {
            RoundedNinePatchDrawable roundedNinePatchDrawable = new RoundedNinePatchDrawable((NinePatchDrawable) drawable);
            applyRoundingParams(roundedNinePatchDrawable, roundingParams);
            return roundedNinePatchDrawable;
        } else if (!(drawable instanceof ColorDrawable) || VERSION.SDK_INT < 11) {
            FLog.m15795w(TAG, "Don't know how to round that drawable: %s", drawable);
            return drawable;
        } else {
            RoundedColorDrawable fromColorDrawable = RoundedColorDrawable.fromColorDrawable((ColorDrawable) drawable);
            applyRoundingParams(fromColorDrawable, roundingParams);
            return fromColorDrawable;
        }
    }

    static void applyRoundingParams(Rounded rounded, RoundingParams roundingParams) {
        rounded.setCircle(roundingParams.getRoundAsCircle());
        rounded.setRadii(roundingParams.getCornersRadii());
        rounded.setBorder(roundingParams.getBorderColor(), roundingParams.getBorderWidth());
        rounded.setPadding(roundingParams.getPadding());
        rounded.setScaleDownInsideBorders(roundingParams.getScaleDownInsideBorders());
    }

    static DrawableParent findDrawableParentForLeaf(DrawableParent drawableParent) {
        while (true) {
            Drawable drawable = drawableParent.getDrawable();
            if (drawable == drawableParent || !(drawable instanceof DrawableParent)) {
                return drawableParent;
            }
            drawableParent = (DrawableParent) drawable;
        }
        return drawableParent;
    }

    static Drawable maybeApplyLeafRounding(@C5952h Drawable drawable, @C5952h RoundingParams roundingParams, Resources resources) {
        if (!(drawable == null || roundingParams == null || roundingParams.getRoundingMethod() != RoundingMethod.BITMAP_ONLY)) {
            if (drawable instanceof ForwardingDrawable) {
                DrawableParent findDrawableParentForLeaf = findDrawableParentForLeaf((ForwardingDrawable) drawable);
                findDrawableParentForLeaf.setDrawable(applyLeafRounding(findDrawableParentForLeaf.setDrawable(sEmptyDrawable), roundingParams, resources));
                return drawable;
            }
            drawable = applyLeafRounding(drawable, roundingParams, resources);
        }
        return drawable;
    }

    @C5952h
    static Drawable maybeWrapWithMatrix(@C5952h Drawable drawable, @C5952h Matrix matrix) {
        return (drawable == null || matrix == null) ? drawable : new MatrixDrawable(drawable, matrix);
    }

    static Drawable maybeWrapWithRoundedOverlayColor(@C5952h Drawable drawable, @C5952h RoundingParams roundingParams) {
        if (drawable == null || roundingParams == null || roundingParams.getRoundingMethod() != RoundingMethod.OVERLAY_COLOR) {
            return drawable;
        }
        RoundedCornersDrawable roundedCornersDrawable = new RoundedCornersDrawable(drawable);
        applyRoundingParams(roundedCornersDrawable, roundingParams);
        roundedCornersDrawable.setOverlayColor(roundingParams.getOverlayColor());
        return roundedCornersDrawable;
    }

    @C5952h
    static Drawable maybeWrapWithScaleType(@C5952h Drawable drawable, @C5952h ScaleType scaleType) {
        return maybeWrapWithScaleType(drawable, scaleType, null);
    }

    static void resetRoundingParams(Rounded rounded) {
        rounded.setCircle(false);
        rounded.setRadius(0.0f);
        rounded.setBorder(0, 0.0f);
        rounded.setPadding(0.0f);
        rounded.setScaleDownInsideBorders(false);
    }

    static void updateLeafRounding(DrawableParent drawableParent, @C5952h RoundingParams roundingParams, Resources resources) {
        DrawableParent findDrawableParentForLeaf = findDrawableParentForLeaf(drawableParent);
        Drawable drawable = findDrawableParentForLeaf.getDrawable();
        if (roundingParams == null || roundingParams.getRoundingMethod() != RoundingMethod.BITMAP_ONLY) {
            if (drawable instanceof Rounded) {
                resetRoundingParams((Rounded) drawable);
            }
        } else if (drawable instanceof Rounded) {
            applyRoundingParams((Rounded) drawable, roundingParams);
        } else if (drawable != null) {
            findDrawableParentForLeaf.setDrawable(sEmptyDrawable);
            findDrawableParentForLeaf.setDrawable(applyLeafRounding(drawable, roundingParams, resources));
        }
    }

    static void updateOverlayColorRounding(DrawableParent drawableParent, @C5952h RoundingParams roundingParams) {
        Drawable drawable = drawableParent.getDrawable();
        if (roundingParams == null || roundingParams.getRoundingMethod() != RoundingMethod.OVERLAY_COLOR) {
            if (drawable instanceof RoundedCornersDrawable) {
                drawableParent.setDrawable(((RoundedCornersDrawable) drawable).setCurrent(sEmptyDrawable));
                sEmptyDrawable.setCallback(null);
            }
        } else if (drawable instanceof RoundedCornersDrawable) {
            RoundedCornersDrawable roundedCornersDrawable = (RoundedCornersDrawable) drawable;
            applyRoundingParams(roundedCornersDrawable, roundingParams);
            roundedCornersDrawable.setOverlayColor(roundingParams.getOverlayColor());
        } else {
            drawableParent.setDrawable(maybeWrapWithRoundedOverlayColor(drawableParent.setDrawable(sEmptyDrawable), roundingParams));
        }
    }

    static ScaleTypeDrawable wrapChildWithScaleType(DrawableParent drawableParent, ScaleType scaleType) {
        Drawable maybeWrapWithScaleType = maybeWrapWithScaleType(drawableParent.setDrawable(sEmptyDrawable), scaleType);
        drawableParent.setDrawable(maybeWrapWithScaleType);
        Preconditions.checkNotNull(maybeWrapWithScaleType, "Parent has no child drawable!");
        return (ScaleTypeDrawable) maybeWrapWithScaleType;
    }

    @C5952h
    static Drawable maybeWrapWithScaleType(@C5952h Drawable drawable, @C5952h ScaleType scaleType, @C5952h PointF pointF) {
        if (drawable == null || scaleType == null) {
            return drawable;
        }
        ScaleTypeDrawable scaleTypeDrawable = new ScaleTypeDrawable(drawable, scaleType);
        if (pointF != null) {
            scaleTypeDrawable.setFocusPoint(pointF);
        }
        return scaleTypeDrawable;
    }
}
