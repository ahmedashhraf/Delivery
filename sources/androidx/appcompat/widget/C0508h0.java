package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.transition.Transition;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.annotation.C0193h0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.appcompat.view.menu.C0369f;
import androidx.appcompat.view.menu.C0370g;
import androidx.appcompat.view.menu.C0375j;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

@C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.widget.h0 */
/* compiled from: MenuPopupWindow */
public class C0508h0 extends C0495f0 implements C0505g0 {

    /* renamed from: G0 */
    private static final String f2038G0 = "MenuPopupWindow";

    /* renamed from: H0 */
    private static Method f2039H0;

    /* renamed from: F0 */
    private C0505g0 f2040F0;

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: androidx.appcompat.widget.h0$a */
    /* compiled from: MenuPopupWindow */
    public static class C0509a extends C0472b0 {

        /* renamed from: e0 */
        final int f2041e0;

        /* renamed from: f0 */
        final int f2042f0;

        /* renamed from: g0 */
        private C0505g0 f2043g0;

        /* renamed from: h0 */
        private MenuItem f2044h0;

        public C0509a(Context context, boolean z) {
            super(context, z);
            Configuration configuration = context.getResources().getConfiguration();
            if (VERSION.SDK_INT < 17 || 1 != configuration.getLayoutDirection()) {
                this.f2041e0 = 22;
                this.f2042f0 = 21;
                return;
            }
            this.f2041e0 = 21;
            this.f2042f0 = 22;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ int mo2473a(int i, boolean z) {
            return super.mo2473a(i, z);
        }

        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        public boolean onHoverEvent(MotionEvent motionEvent) {
            int i;
            C0369f fVar;
            if (this.f2043g0 != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    fVar = (C0369f) headerViewListAdapter.getWrappedAdapter();
                } else {
                    i = 0;
                    fVar = (C0369f) adapter;
                }
                C0375j jVar = null;
                if (motionEvent.getAction() != 10) {
                    int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
                    if (pointToPosition != -1) {
                        int i2 = pointToPosition - i;
                        if (i2 >= 0 && i2 < fVar.getCount()) {
                            jVar = fVar.getItem(i2);
                        }
                    }
                }
                MenuItem menuItem = this.f2044h0;
                if (menuItem != jVar) {
                    C0370g b = fVar.mo1543b();
                    if (menuItem != null) {
                        this.f2043g0.mo1525b(b, menuItem);
                    }
                    this.f2044h0 = jVar;
                    if (jVar != null) {
                        this.f2043g0.mo1524a(b, jVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.f2041e0) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i != this.f2042f0) {
                return super.onKeyDown(i, keyEvent);
            } else {
                setSelection(-1);
                ((C0369f) getAdapter()).mo1543b().mo1565a(false);
                return true;
            }
        }

        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(C0505g0 g0Var) {
            this.f2043g0 = g0Var;
        }

        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ int mo2472a(int i, int i2, int i3, int i4, int i5) {
            return super.mo2472a(i, i2, i3, i4, i5);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo2474a(MotionEvent motionEvent, int i) {
            return super.mo2474a(motionEvent, i);
        }

        /* renamed from: a */
        public void mo2667a() {
            setSelection(-1);
        }
    }

    static {
        try {
            if (VERSION.SDK_INT <= 28) {
                f2039H0 = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    public C0508h0(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0472b0 mo2590a(Context context, boolean z) {
        C0509a aVar = new C0509a(context, z);
        aVar.setHoverListener(this);
        return aVar;
    }

    /* renamed from: b */
    public void mo2665b(Object obj) {
        if (VERSION.SDK_INT >= 23) {
            this.f2021r0.setExitTransition((Transition) obj);
        }
    }

    /* renamed from: e */
    public void mo2666e(boolean z) {
        if (VERSION.SDK_INT <= 28) {
            Method method = f2039H0;
            if (method != null) {
                try {
                    method.invoke(this.f2021r0, new Object[]{Boolean.valueOf(z)});
                } catch (Exception unused) {
                }
            }
        } else {
            this.f2021r0.setTouchModal(z);
        }
    }

    /* renamed from: a */
    public void mo2664a(Object obj) {
        if (VERSION.SDK_INT >= 23) {
            this.f2021r0.setEnterTransition((Transition) obj);
        }
    }

    /* renamed from: b */
    public void mo1525b(@C0193h0 C0370g gVar, @C0193h0 MenuItem menuItem) {
        C0505g0 g0Var = this.f2040F0;
        if (g0Var != null) {
            g0Var.mo1525b(gVar, menuItem);
        }
    }

    /* renamed from: a */
    public void mo2663a(C0505g0 g0Var) {
        this.f2040F0 = g0Var;
    }

    /* renamed from: a */
    public void mo1524a(@C0193h0 C0370g gVar, @C0193h0 MenuItem menuItem) {
        C0505g0 g0Var = this.f2040F0;
        if (g0Var != null) {
            g0Var.mo1524a(gVar, menuItem);
        }
    }
}
