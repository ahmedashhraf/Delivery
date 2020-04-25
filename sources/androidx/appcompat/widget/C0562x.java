package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* renamed from: androidx.appcompat.widget.x */
/* compiled from: AppCompatToggleButton */
public class C0562x extends ToggleButton {

    /* renamed from: a */
    private final C0554v f2281a;

    public C0562x(Context context) {
        this(context, null);
    }

    public C0562x(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842827);
    }

    public C0562x(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2281a = new C0554v(this);
        this.f2281a.mo2962a(attributeSet, i);
    }
}
