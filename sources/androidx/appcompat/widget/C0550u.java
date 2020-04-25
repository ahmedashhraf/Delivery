package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.RequiresApi;
import androidx.core.p033k.C0944i;

/* renamed from: androidx.appcompat.widget.u */
/* compiled from: AppCompatTextClassifierHelper */
final class C0550u {
    @C0193h0

    /* renamed from: a */
    private TextView f2194a;
    @C0195i0

    /* renamed from: b */
    private TextClassifier f2195b;

    C0550u(TextView textView) {
        this.f2194a = (TextView) C0944i.m5337a(textView);
    }

    @RequiresApi(api = 26)
    /* renamed from: a */
    public void mo2895a(@C0195i0 TextClassifier textClassifier) {
        this.f2195b = textClassifier;
    }

    @RequiresApi(api = 26)
    @C0193h0
    /* renamed from: a */
    public TextClassifier mo2894a() {
        TextClassifier textClassifier = this.f2195b;
        if (textClassifier == null) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) this.f2194a.getContext().getSystemService(TextClassificationManager.class);
            if (textClassificationManager != null) {
                return textClassificationManager.getTextClassifier();
            }
            textClassifier = TextClassifier.NO_OP;
        }
        return textClassifier;
    }
}
