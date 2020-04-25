package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.C0213q;
import androidx.core.p034l.C0955c0;
import androidx.core.widget.C1125p;

public class AppCompatImageView extends ImageView implements C0955c0, C1125p {
    private final C0489e mBackgroundTintHelper;
    private final C0529m mImageHelper;

    public AppCompatImageView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0489e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            eVar.mo2526a();
        }
        C0529m mVar = this.mImageHelper;
        if (mVar != null) {
            mVar.mo2792a();
        }
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    @C0195i0
    public ColorStateList getSupportBackgroundTintList() {
        C0489e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            return eVar.mo2532b();
        }
        return null;
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    @C0195i0
    public Mode getSupportBackgroundTintMode() {
        C0489e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            return eVar.mo2534c();
        }
        return null;
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    @C0195i0
    public ColorStateList getSupportImageTintList() {
        C0529m mVar = this.mImageHelper;
        if (mVar != null) {
            return mVar.mo2797b();
        }
        return null;
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    @C0195i0
    public Mode getSupportImageTintMode() {
        C0529m mVar = this.mImageHelper;
        if (mVar != null) {
            return mVar.mo2799c();
        }
        return null;
    }

    public boolean hasOverlappingRendering() {
        return this.mImageHelper.mo2800d() && super.hasOverlappingRendering();
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0489e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            eVar.mo2530a(drawable);
        }
    }

    public void setBackgroundResource(@C0213q int i) {
        super.setBackgroundResource(i);
        C0489e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            eVar.mo2527a(i);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0529m mVar = this.mImageHelper;
        if (mVar != null) {
            mVar.mo2792a();
        }
    }

    public void setImageDrawable(@C0195i0 Drawable drawable) {
        super.setImageDrawable(drawable);
        C0529m mVar = this.mImageHelper;
        if (mVar != null) {
            mVar.mo2792a();
        }
    }

    public void setImageResource(@C0213q int i) {
        C0529m mVar = this.mImageHelper;
        if (mVar != null) {
            mVar.mo2793a(i);
        }
    }

    public void setImageURI(@C0195i0 Uri uri) {
        super.setImageURI(uri);
        C0529m mVar = this.mImageHelper;
        if (mVar != null) {
            mVar.mo2792a();
        }
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@C0195i0 ColorStateList colorStateList) {
        C0489e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            eVar.mo2533b(colorStateList);
        }
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@C0195i0 Mode mode) {
        C0489e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            eVar.mo2529a(mode);
        }
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    public void setSupportImageTintList(@C0195i0 ColorStateList colorStateList) {
        C0529m mVar = this.mImageHelper;
        if (mVar != null) {
            mVar.mo2798b(colorStateList);
        }
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    public void setSupportImageTintMode(@C0195i0 Mode mode) {
        C0529m mVar = this.mImageHelper;
        if (mVar != null) {
            mVar.mo2795a(mode);
        }
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet, int i) {
        super(C0543q0.m2895b(context), attributeSet, i);
        this.mBackgroundTintHelper = new C0489e(this);
        this.mBackgroundTintHelper.mo2531a(attributeSet, i);
        this.mImageHelper = new C0529m(this);
        this.mImageHelper.mo2796a(attributeSet, i);
    }
}
