package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.VisibleForTesting;

public class OrientedDrawable extends ForwardingDrawable {
    private int mExifOrientation;
    private int mRotationAngle;
    @VisibleForTesting
    final Matrix mRotationMatrix;
    private final Matrix mTempMatrix;
    private final RectF mTempRectF;

    public OrientedDrawable(Drawable drawable, int i) {
        this(drawable, i, 0);
    }

    public void draw(Canvas canvas) {
        if (this.mRotationAngle <= 0) {
            int i = this.mExifOrientation;
            if (i == 0 || i == 1) {
                super.draw(canvas);
                return;
            }
        }
        int save = canvas.save();
        canvas.concat(this.mRotationMatrix);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    public int getIntrinsicHeight() {
        int i = this.mExifOrientation;
        if (i == 5 || i == 7 || this.mRotationAngle % 180 != 0) {
            return super.getIntrinsicWidth();
        }
        return super.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        int i = this.mExifOrientation;
        if (i == 5 || i == 7 || this.mRotationAngle % 180 != 0) {
            return super.getIntrinsicHeight();
        }
        return super.getIntrinsicWidth();
    }

    public void getTransform(Matrix matrix) {
        getParentTransform(matrix);
        if (!this.mRotationMatrix.isIdentity()) {
            matrix.preConcat(this.mRotationMatrix);
        }
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable current = getCurrent();
        if (this.mRotationAngle <= 0) {
            int i = this.mExifOrientation;
            if (i == 0 || i == 1) {
                current.setBounds(rect);
                return;
            }
        }
        int i2 = this.mExifOrientation;
        if (i2 == 2) {
            this.mRotationMatrix.setScale(-1.0f, 1.0f);
        } else if (i2 == 7) {
            this.mRotationMatrix.setRotate(270.0f, (float) rect.centerX(), (float) rect.centerY());
            this.mRotationMatrix.postScale(-1.0f, 1.0f);
        } else if (i2 == 4) {
            this.mRotationMatrix.setScale(1.0f, -1.0f);
        } else if (i2 != 5) {
            this.mRotationMatrix.setRotate((float) this.mRotationAngle, (float) rect.centerX(), (float) rect.centerY());
        } else {
            this.mRotationMatrix.setRotate(270.0f, (float) rect.centerX(), (float) rect.centerY());
            this.mRotationMatrix.postScale(1.0f, -1.0f);
        }
        this.mTempMatrix.reset();
        this.mRotationMatrix.invert(this.mTempMatrix);
        this.mTempRectF.set(rect);
        this.mTempMatrix.mapRect(this.mTempRectF);
        RectF rectF = this.mTempRectF;
        current.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    public OrientedDrawable(Drawable drawable, int i, int i2) {
        super(drawable);
        this.mTempMatrix = new Matrix();
        this.mTempRectF = new RectF();
        boolean z = true;
        Preconditions.checkArgument(i % 90 == 0);
        if (i2 < 0 || i2 > 8) {
            z = false;
        }
        Preconditions.checkArgument(z);
        this.mRotationMatrix = new Matrix();
        this.mRotationAngle = i;
        this.mExifOrientation = i2;
    }
}
