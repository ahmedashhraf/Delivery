package androidx.appcompat.view.menu;

import android.graphics.drawable.Drawable;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;

@C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.view.menu.o */
/* compiled from: MenuView */
public interface C0388o {

    /* renamed from: androidx.appcompat.view.menu.o$a */
    /* compiled from: MenuView */
    public interface C0389a {
        /* renamed from: a */
        void mo1387a(C0375j jVar, int i);

        /* renamed from: a */
        void mo1388a(boolean z, char c);

        /* renamed from: a */
        boolean mo1389a();

        /* renamed from: b */
        boolean mo1390b();

        C0375j getItemData();

        void setCheckable(boolean z);

        void setChecked(boolean z);

        void setEnabled(boolean z);

        void setIcon(Drawable drawable);

        void setTitle(CharSequence charSequence);
    }

    /* renamed from: a */
    void mo1411a(C0370g gVar);

    int getWindowAnimations();
}
