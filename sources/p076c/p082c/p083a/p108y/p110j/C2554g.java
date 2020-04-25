package p076c.p082c.p083a.p108y.p110j;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import p076c.p082c.p083a.p088u.p098k.p100g.C2449b;

/* renamed from: c.c.a.y.j.g */
/* compiled from: ImageViewTargetFactory */
public class C2554g {
    /* renamed from: a */
    public <Z> C2561m<Z> mo10027a(ImageView imageView, Class<Z> cls) {
        if (C2449b.class.isAssignableFrom(cls)) {
            return new C2552e(imageView);
        }
        if (Bitmap.class.equals(cls)) {
            return new C2550c(imageView);
        }
        if (Drawable.class.isAssignableFrom(cls)) {
            return new C2551d(imageView);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unhandled class: ");
        sb.append(cls);
        sb.append(", try .as*(Class).transcode(ResourceTranscoder)");
        throw new IllegalArgumentException(sb.toString());
    }
}
