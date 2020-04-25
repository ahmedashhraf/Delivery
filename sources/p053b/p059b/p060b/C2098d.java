package p053b.p059b.p060b;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;

/* renamed from: b.b.b.d */
/* compiled from: SimpleCursorAdapter */
public class C2098d extends C2097c {
    @C0207n0({C0208a.LIBRARY_GROUP})

    /* renamed from: Z */
    protected int[] f7979Z;
    @C0207n0({C0208a.LIBRARY_GROUP})

    /* renamed from: a0 */
    protected int[] f7980a0;

    /* renamed from: b0 */
    private int f7981b0 = -1;

    /* renamed from: c0 */
    private C2099a f7982c0;

    /* renamed from: d0 */
    private C2100b f7983d0;

    /* renamed from: e0 */
    String[] f7984e0;

    /* renamed from: b.b.b.d$a */
    /* compiled from: SimpleCursorAdapter */
    public interface C2099a {
        /* renamed from: a */
        CharSequence mo9113a(Cursor cursor);
    }

    /* renamed from: b.b.b.d$b */
    /* compiled from: SimpleCursorAdapter */
    public interface C2100b {
        /* renamed from: a */
        boolean mo9114a(View view, Cursor cursor, int i);
    }

    @Deprecated
    public C2098d(Context context, int i, Cursor cursor, String[] strArr, int[] iArr) {
        super(context, i, cursor);
        this.f7980a0 = iArr;
        this.f7984e0 = strArr;
        m10869a(cursor, strArr);
    }

    /* renamed from: a */
    public void mo2817a(View view, Context context, Cursor cursor) {
        C2100b bVar = this.f7983d0;
        int[] iArr = this.f7980a0;
        int length = iArr.length;
        int[] iArr2 = this.f7979Z;
        for (int i = 0; i < length; i++) {
            View findViewById = view.findViewById(iArr[i]);
            if (findViewById != null) {
                if (!(bVar != null ? bVar.mo9114a(findViewById, cursor, iArr2[i]) : false)) {
                    String string = cursor.getString(iArr2[i]);
                    if (string == null) {
                        string = "";
                    }
                    if (findViewById instanceof TextView) {
                        mo9106a((TextView) findViewById, string);
                    } else if (findViewById instanceof ImageView) {
                        mo9105a((ImageView) findViewById, string);
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append(findViewById.getClass().getName());
                        sb.append(" is not a ");
                        sb.append(" view that can be bounds by this SimpleCursorAdapter");
                        throw new IllegalStateException(sb.toString());
                    }
                } else {
                    continue;
                }
            }
        }
    }

    /* renamed from: c */
    public void mo9109c(int i) {
        this.f7981b0 = i;
    }

    /* renamed from: d */
    public C2099a mo9110d() {
        return this.f7982c0;
    }

    /* renamed from: e */
    public int mo9111e() {
        return this.f7981b0;
    }

    /* renamed from: f */
    public C2100b mo9112f() {
        return this.f7983d0;
    }

    /* renamed from: c */
    public Cursor mo9089c(Cursor cursor) {
        m10869a(cursor, this.f7984e0);
        return super.mo9089c(cursor);
    }

    public C2098d(Context context, int i, Cursor cursor, String[] strArr, int[] iArr, int i2) {
        super(context, i, cursor, i2);
        this.f7980a0 = iArr;
        this.f7984e0 = strArr;
        m10869a(cursor, strArr);
    }

    /* renamed from: a */
    public void mo9108a(C2100b bVar) {
        this.f7983d0 = bVar;
    }

    /* renamed from: a */
    public void mo9105a(ImageView imageView, String str) {
        try {
            imageView.setImageResource(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            imageView.setImageURI(Uri.parse(str));
        }
    }

    /* renamed from: a */
    public void mo9106a(TextView textView, String str) {
        textView.setText(str);
    }

    /* renamed from: a */
    public void mo9107a(C2099a aVar) {
        this.f7982c0 = aVar;
    }

    /* renamed from: a */
    public CharSequence mo2816a(Cursor cursor) {
        C2099a aVar = this.f7982c0;
        if (aVar != null) {
            return aVar.mo9113a(cursor);
        }
        int i = this.f7981b0;
        if (i > -1) {
            return cursor.getString(i);
        }
        return super.mo2816a(cursor);
    }

    /* renamed from: a */
    private void m10869a(Cursor cursor, String[] strArr) {
        if (cursor != null) {
            int length = strArr.length;
            int[] iArr = this.f7979Z;
            if (iArr == null || iArr.length != length) {
                this.f7979Z = new int[length];
            }
            for (int i = 0; i < length; i++) {
                this.f7979Z[i] = cursor.getColumnIndexOrThrow(strArr[i]);
            }
            return;
        }
        this.f7979Z = null;
    }

    /* renamed from: a */
    public void mo9104a(Cursor cursor, String[] strArr, int[] iArr) {
        this.f7984e0 = strArr;
        this.f7980a0 = iArr;
        m10869a(cursor, this.f7984e0);
        super.mo2819b(cursor);
    }
}
