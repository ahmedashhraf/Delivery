package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.C0213q;
import androidx.appcompat.C0238R;
import androidx.core.p034l.C0955c0;
import androidx.core.widget.C1125p;

/* renamed from: androidx.appcompat.widget.l */
/* compiled from: AppCompatImageButton */
public class C0522l extends ImageButton implements C0955c0, C1125p {

    /* renamed from: a */
    private final C0489e f2079a;

    /* renamed from: b */
    private final C0529m f2080b;

    public C0522l(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0489e eVar = this.f2079a;
        if (eVar != null) {
            eVar.mo2526a();
        }
        C0529m mVar = this.f2080b;
        if (mVar != null) {
            mVar.mo2792a();
        }
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    @C0195i0
    public ColorStateList getSupportBackgroundTintList() {
        C0489e eVar = this.f2079a;
        if (eVar != null) {
            return eVar.mo2532b();
        }
        return null;
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    @C0195i0
    public Mode getSupportBackgroundTintMode() {
        C0489e eVar = this.f2079a;
        if (eVar != null) {
            return eVar.mo2534c();
        }
        return null;
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    @C0195i0
    public ColorStateList getSupportImageTintList() {
        C0529m mVar = this.f2080b;
        if (mVar != null) {
            return mVar.mo2797b();
        }
        return null;
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    @C0195i0
    public Mode getSupportImageTintMode() {
        C0529m mVar = this.f2080b;
        if (mVar != null) {
            return mVar.mo2799c();
        }
        return null;
    }

    public boolean hasOverlappingRendering() {
        return this.f2080b.mo2800d() && super.hasOverlappingRendering();
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0489e eVar = this.f2079a;
        if (eVar != null) {
            eVar.mo2530a(drawable);
        }
    }

    public void setBackgroundResource(@C0213q int i) {
        super.setBackgroundResource(i);
        C0489e eVar = this.f2079a;
        if (eVar != null) {
            eVar.mo2527a(i);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0529m mVar = this.f2080b;
        if (mVar != null) {
            mVar.mo2792a();
        }
    }

    public void setImageDrawable(@C0195i0 Drawable drawable) {
        super.setImageDrawable(drawable);
        C0529m mVar = this.f2080b;
        if (mVar != null) {
            mVar.mo2792a();
        }
    }

    public void setImageResource(@C0213q int i) {
        this.f2080b.mo2793a(i);
    }

    public void setImageURI(@C0195i0 Uri uri) {
        super.setImageURI(uri);
        C0529m mVar = this.f2080b;
        if (mVar != null) {
            mVar.mo2792a();
        }
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@C0195i0 ColorStateList colorStateList) {
        C0489e eVar = this.f2079a;
        if (eVar != null) {
            eVar.mo2533b(colorStateList);
        }
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@C0195i0 Mode mode) {
        C0489e eVar = this.f2079a;
        if (eVar != null) {
            eVar.mo2529a(mode);
        }
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    public void setSupportImageTintList(@C0195i0 ColorStateList colorStateList) {
        C0529m mVar = this.f2080b;
        if (mVar != null) {
            mVar.mo2798b(colorStateList);
        }
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    public void setSupportImageTintMode(@C0195i0 Mode mode) {
        C0529m mVar = this.f2080b;
        if (mVar != null) {
            mVar.mo2795a(mode);
        }
    }

    public C0522l(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0238R.attr.imageButtonStyle);
    }

    public C0522l(Context context, AttributeSet attributeSet, int i) {
        super(C0543q0.m2895b(context), attributeSet, i);
        this.f2079a = new C0489e(this);
        this.f2079a.mo2531a(attributeSet, i);
        this.f2080b = new C0529m(this);
        this.f2080b.mo2796a(attributeSet, i);
    }
}
