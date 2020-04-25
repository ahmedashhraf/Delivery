package androidx.appcompat.p010c;

import android.content.Context;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import java.util.Locale;

@C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.c.a */
/* compiled from: AllCapsTransformationMethod */
public class C0336a implements TransformationMethod {

    /* renamed from: a */
    private Locale f1109a;

    public C0336a(Context context) {
        this.f1109a = context.getResources().getConfiguration().locale;
    }

    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (charSequence != null) {
            return charSequence.toString().toUpperCase(this.f1109a);
        }
        return null;
    }

    public void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
    }
}
