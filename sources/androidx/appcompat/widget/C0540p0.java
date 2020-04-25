package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.view.LayoutInflater;
import android.widget.SpinnerAdapter;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.appcompat.p011d.C0341d;

/* renamed from: androidx.appcompat.widget.p0 */
/* compiled from: ThemedSpinnerAdapter */
public interface C0540p0 extends SpinnerAdapter {

    /* renamed from: androidx.appcompat.widget.p0$a */
    /* compiled from: ThemedSpinnerAdapter */
    public static final class C0541a {

        /* renamed from: a */
        private final Context f2168a;

        /* renamed from: b */
        private final LayoutInflater f2169b;

        /* renamed from: c */
        private LayoutInflater f2170c;

        public C0541a(@C0193h0 Context context) {
            this.f2168a = context;
            this.f2169b = LayoutInflater.from(context);
        }

        /* renamed from: a */
        public void mo2837a(@C0195i0 Theme theme) {
            if (theme == null) {
                this.f2170c = null;
            } else if (theme == this.f2168a.getTheme()) {
                this.f2170c = this.f2169b;
            } else {
                this.f2170c = LayoutInflater.from(new C0341d(this.f2168a, theme));
            }
        }

        @C0195i0
        /* renamed from: b */
        public Theme mo2838b() {
            LayoutInflater layoutInflater = this.f2170c;
            if (layoutInflater == null) {
                return null;
            }
            return layoutInflater.getContext().getTheme();
        }

        @C0193h0
        /* renamed from: a */
        public LayoutInflater mo2836a() {
            LayoutInflater layoutInflater = this.f2170c;
            return layoutInflater != null ? layoutInflater : this.f2169b;
        }
    }

    @C0195i0
    Theme getDropDownViewTheme();

    void setDropDownViewTheme(@C0195i0 Theme theme);
}
