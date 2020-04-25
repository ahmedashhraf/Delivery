package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.appcompat.C0238R;

/* renamed from: androidx.appcompat.widget.s */
/* compiled from: AppCompatSeekBar */
public class C0546s extends SeekBar {

    /* renamed from: a */
    private final C0548t f2183a;

    public C0546s(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f2183a.mo2858b();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f2183a.mo2862f();
    }

    /* access modifiers changed from: protected */
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f2183a.mo2855a(canvas);
    }

    public C0546s(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0238R.attr.seekBarStyle);
    }

    public C0546s(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2183a = new C0548t(this);
        this.f2183a.mo2833a(attributeSet, i);
    }
}
