package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.annotation.C0193h0;
import androidx.annotation.RequiresApi;

/* renamed from: androidx.appcompat.widget.b */
/* compiled from: ActionBarBackgroundDrawable */
class C0471b extends Drawable {

    /* renamed from: a */
    final ActionBarContainer f1870a;

    public C0471b(ActionBarContainer actionBarContainer) {
        this.f1870a = actionBarContainer;
    }

    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f1870a;
        if (actionBarContainer.f1468S) {
            Drawable drawable = actionBarContainer.f1467R;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f1465P;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f1870a;
        Drawable drawable3 = actionBarContainer2.f1466Q;
        if (drawable3 != null && actionBarContainer2.f1469T) {
            drawable3.draw(canvas);
        }
    }

    public int getOpacity() {
        return 0;
    }

    @RequiresApi(21)
    public void getOutline(@C0193h0 Outline outline) {
        ActionBarContainer actionBarContainer = this.f1870a;
        if (actionBarContainer.f1468S) {
            Drawable drawable = actionBarContainer.f1467R;
            if (drawable != null) {
                drawable.getOutline(outline);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f1465P;
        if (drawable2 != null) {
            drawable2.getOutline(outline);
        }
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
