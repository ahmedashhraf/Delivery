package androidx.databinding.p040f0;

import android.annotation.TargetApi;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnClickListener;
import android.view.View.OnLayoutChangeListener;
import android.view.View.OnLongClickListener;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.databinding.C1179d;
import androidx.databinding.C1267g;
import androidx.databinding.C1268h;
import androidx.databinding.library.baseAdapters.C1277R;

@C0207n0({C0208a.LIBRARY})
@C1268h({@C1267g(attribute = "android:backgroundTint", method = "setBackgroundTintList", type = View.class), @C1267g(attribute = "android:fadeScrollbars", method = "setScrollbarFadingEnabled", type = View.class), @C1267g(attribute = "android:getOutline", method = "setOutlineProvider", type = View.class), @C1267g(attribute = "android:nextFocusForward", method = "setNextFocusForwardId", type = View.class), @C1267g(attribute = "android:nextFocusLeft", method = "setNextFocusLeftId", type = View.class), @C1267g(attribute = "android:nextFocusRight", method = "setNextFocusRightId", type = View.class), @C1267g(attribute = "android:nextFocusUp", method = "setNextFocusUpId", type = View.class), @C1267g(attribute = "android:nextFocusDown", method = "setNextFocusDownId", type = View.class), @C1267g(attribute = "android:requiresFadingEdge", method = "setVerticalFadingEdgeEnabled", type = View.class), @C1267g(attribute = "android:scrollbarDefaultDelayBeforeFade", method = "setScrollBarDefaultDelayBeforeFade", type = View.class), @C1267g(attribute = "android:scrollbarFadeDuration", method = "setScrollBarFadeDuration", type = View.class), @C1267g(attribute = "android:scrollbarSize", method = "setScrollBarSize", type = View.class), @C1267g(attribute = "android:scrollbarStyle", method = "setScrollBarStyle", type = View.class), @C1267g(attribute = "android:transformPivotX", method = "setPivotX", type = View.class), @C1267g(attribute = "android:transformPivotY", method = "setPivotY", type = View.class), @C1267g(attribute = "android:onDrag", method = "setOnDragListener", type = View.class), @C1267g(attribute = "android:onClick", method = "setOnClickListener", type = View.class), @C1267g(attribute = "android:onApplyWindowInsets", method = "setOnApplyWindowInsetsListener", type = View.class), @C1267g(attribute = "android:onCreateContextMenu", method = "setOnCreateContextMenuListener", type = View.class), @C1267g(attribute = "android:onFocusChange", method = "setOnFocusChangeListener", type = View.class), @C1267g(attribute = "android:onGenericMotion", method = "setOnGenericMotionListener", type = View.class), @C1267g(attribute = "android:onHover", method = "setOnHoverListener", type = View.class), @C1267g(attribute = "android:onKey", method = "setOnKeyListener", type = View.class), @C1267g(attribute = "android:onLongClick", method = "setOnLongClickListener", type = View.class), @C1267g(attribute = "android:onSystemUiVisibilityChange", method = "setOnSystemUiVisibilityChangeListener", type = View.class), @C1267g(attribute = "android:onTouch", method = "setOnTouchListener", type = View.class)})
/* renamed from: androidx.databinding.f0.j0 */
/* compiled from: ViewBindingAdapter */
public class C1220j0 {

    /* renamed from: a */
    public static final int f5096a = 0;

    /* renamed from: b */
    public static final int f5097b = 1;

    /* renamed from: c */
    public static final int f5098c = 2;

    /* renamed from: androidx.databinding.f0.j0$a */
    /* compiled from: ViewBindingAdapter */
    static class C1221a implements OnAttachStateChangeListener {

        /* renamed from: a */
        final /* synthetic */ C1222b f5099a;

        /* renamed from: b */
        final /* synthetic */ C1223c f5100b;

        C1221a(C1222b bVar, C1223c cVar) {
            this.f5099a = bVar;
            this.f5100b = cVar;
        }

        public void onViewAttachedToWindow(View view) {
            C1222b bVar = this.f5099a;
            if (bVar != null) {
                bVar.onViewAttachedToWindow(view);
            }
        }

        public void onViewDetachedFromWindow(View view) {
            C1223c cVar = this.f5100b;
            if (cVar != null) {
                cVar.onViewDetachedFromWindow(view);
            }
        }
    }

    @TargetApi(12)
    /* renamed from: androidx.databinding.f0.j0$b */
    /* compiled from: ViewBindingAdapter */
    public interface C1222b {
        void onViewAttachedToWindow(View view);
    }

    @TargetApi(12)
    /* renamed from: androidx.databinding.f0.j0$c */
    /* compiled from: ViewBindingAdapter */
    public interface C1223c {
        void onViewDetachedFromWindow(View view);
    }

    /* renamed from: a */
    private static int m6791a(float f) {
        int i = (int) (0.5f + f);
        if (i != 0) {
            return i;
        }
        if (f == 0.0f) {
            return 0;
        }
        return f > 0.0f ? 1 : -1;
    }

    @C1179d({"android:padding"})
    /* renamed from: a */
    public static void m6792a(View view, float f) {
        int a = m6791a(f);
        view.setPadding(a, a, a, a);
    }

    @C1179d({"android:paddingBottom"})
    /* renamed from: b */
    public static void m6799b(View view, float f) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), m6791a(f));
    }

    @C1179d({"android:paddingEnd"})
    /* renamed from: c */
    public static void m6802c(View view, float f) {
        int a = m6791a(f);
        if (VERSION.SDK_INT >= 17) {
            view.setPaddingRelative(view.getPaddingStart(), view.getPaddingTop(), a, view.getPaddingBottom());
        } else {
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), a, view.getPaddingBottom());
        }
    }

    @C1179d({"android:paddingLeft"})
    /* renamed from: d */
    public static void m6803d(View view, float f) {
        view.setPadding(m6791a(f), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
    }

    @C1179d({"android:paddingRight"})
    /* renamed from: e */
    public static void m6804e(View view, float f) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), m6791a(f), view.getPaddingBottom());
    }

    @C1179d({"android:paddingStart"})
    /* renamed from: f */
    public static void m6805f(View view, float f) {
        int a = m6791a(f);
        if (VERSION.SDK_INT >= 17) {
            view.setPaddingRelative(a, view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom());
        } else {
            view.setPadding(a, view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    @C1179d({"android:paddingTop"})
    /* renamed from: g */
    public static void m6806g(View view, float f) {
        view.setPadding(view.getPaddingLeft(), m6791a(f), view.getPaddingRight(), view.getPaddingBottom());
    }

    @C1179d({"android:requiresFadingEdge"})
    /* renamed from: a */
    public static void m6793a(View view, int i) {
        boolean z = false;
        boolean z2 = (i & 2) != 0;
        if ((i & 1) != 0) {
            z = true;
        }
        view.setVerticalFadingEdgeEnabled(z2);
        view.setHorizontalFadingEdgeEnabled(z);
    }

    @C1179d({"android:onClick", "android:clickable"})
    /* renamed from: b */
    public static void m6800b(View view, OnClickListener onClickListener, boolean z) {
        view.setOnClickListener(onClickListener);
        view.setClickable(z);
    }

    @C1179d({"android:onClickListener", "android:clickable"})
    /* renamed from: a */
    public static void m6795a(View view, OnClickListener onClickListener, boolean z) {
        view.setOnClickListener(onClickListener);
        view.setClickable(z);
    }

    @C1179d({"android:onLongClickListener", "android:longClickable"})
    /* renamed from: b */
    public static void m6801b(View view, OnLongClickListener onLongClickListener, boolean z) {
        view.setOnLongClickListener(onLongClickListener);
        view.setLongClickable(z);
    }

    @C1179d({"android:onLongClick", "android:longClickable"})
    /* renamed from: a */
    public static void m6797a(View view, OnLongClickListener onLongClickListener, boolean z) {
        view.setOnLongClickListener(onLongClickListener);
        view.setLongClickable(z);
    }

    @C1179d(requireAll = false, value = {"android:onViewDetachedFromWindow", "android:onViewAttachedToWindow"})
    /* renamed from: a */
    public static void m6798a(View view, C1223c cVar, C1222b bVar) {
        OnAttachStateChangeListener aVar = (cVar == null && bVar == null) ? null : new C1221a(bVar, cVar);
        OnAttachStateChangeListener onAttachStateChangeListener = (OnAttachStateChangeListener) C1244r.m6821a(view, aVar, C1277R.C1278id.onAttachStateChangeListener);
        if (onAttachStateChangeListener != null) {
            view.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        }
        if (aVar != null) {
            view.addOnAttachStateChangeListener(aVar);
        }
    }

    @C1179d({"android:onLayoutChange"})
    /* renamed from: a */
    public static void m6796a(View view, OnLayoutChangeListener onLayoutChangeListener, OnLayoutChangeListener onLayoutChangeListener2) {
        if (onLayoutChangeListener != null) {
            view.removeOnLayoutChangeListener(onLayoutChangeListener);
        }
        if (onLayoutChangeListener2 != null) {
            view.addOnLayoutChangeListener(onLayoutChangeListener2);
        }
    }

    @C1179d({"android:background"})
    /* renamed from: a */
    public static void m6794a(View view, Drawable drawable) {
        if (VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }
}
