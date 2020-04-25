package androidx.databinding.p040f0;

import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.cardview.widget.CardView;
import androidx.databinding.C1179d;
import androidx.databinding.C1267g;
import androidx.databinding.C1268h;

@C0207n0({C0208a.LIBRARY})
@C1268h({@C1267g(attribute = "cardCornerRadius", method = "setRadius", type = CardView.class), @C1267g(attribute = "cardMaxElevation", method = "setMaxCardElevation", type = CardView.class), @C1267g(attribute = "cardPreventCornerOverlap", method = "setPreventCornerOverlap", type = CardView.class), @C1267g(attribute = "cardUseCompatPadding", method = "setUseCompatPadding", type = CardView.class)})
/* renamed from: androidx.databinding.f0.h */
/* compiled from: CardViewBindingAdapter */
public class C1215h {
    @C1179d({"contentPadding"})
    /* renamed from: a */
    public static void m6786a(CardView cardView, int i) {
        cardView.mo3108a(i, i, i, i);
    }

    @C1179d({"contentPaddingBottom"})
    /* renamed from: b */
    public static void m6787b(CardView cardView, int i) {
        cardView.mo3108a(cardView.getContentPaddingLeft(), cardView.getContentPaddingTop(), cardView.getContentPaddingRight(), i);
    }

    @C1179d({"contentPaddingLeft"})
    /* renamed from: c */
    public static void m6788c(CardView cardView, int i) {
        cardView.mo3108a(i, cardView.getContentPaddingTop(), cardView.getContentPaddingRight(), cardView.getContentPaddingBottom());
    }

    @C1179d({"contentPaddingRight"})
    /* renamed from: d */
    public static void m6789d(CardView cardView, int i) {
        cardView.mo3108a(cardView.getContentPaddingLeft(), cardView.getContentPaddingTop(), i, cardView.getContentPaddingBottom());
    }

    @C1179d({"contentPaddingTop"})
    /* renamed from: e */
    public static void m6790e(CardView cardView, int i) {
        cardView.mo3108a(cardView.getContentPaddingLeft(), i, cardView.getContentPaddingRight(), cardView.getContentPaddingBottom());
    }
}
