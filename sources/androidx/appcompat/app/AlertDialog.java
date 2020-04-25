package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.content.DialogInterface.OnMultiChoiceClickListener;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Message;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.annotation.C0186e;
import androidx.annotation.C0188f;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.C0213q;
import androidx.annotation.C0214q0;
import androidx.annotation.C0216r0;
import androidx.appcompat.C0238R;
import androidx.appcompat.app.AlertController.C0249f;

public class AlertDialog extends C0299g implements DialogInterface {
    static final int LAYOUT_HINT_NONE = 0;
    static final int LAYOUT_HINT_SIDE = 1;
    final AlertController mAlert;

    /* renamed from: androidx.appcompat.app.AlertDialog$a */
    public static class C0257a {

        /* renamed from: a */
        private final C0249f f762a;

        /* renamed from: b */
        private final int f763b;

        public C0257a(@C0193h0 Context context) {
            this(context, AlertDialog.resolveDialogTheme(context, 0));
        }

        /* renamed from: a */
        public C0257a mo753a(@C0195i0 View view) {
            this.f762a.f728g = view;
            return this;
        }

        @C0193h0
        /* renamed from: b */
        public Context mo765b() {
            return this.f762a.f722a;
        }

        /* renamed from: c */
        public C0257a mo773c(@C0214q0 int i) {
            C0249f fVar = this.f762a;
            fVar.f729h = fVar.f722a.getText(i);
            return this;
        }

        /* renamed from: d */
        public C0257a mo779d(@C0214q0 int i) {
            C0249f fVar = this.f762a;
            fVar.f727f = fVar.f722a.getText(i);
            return this;
        }

        /* renamed from: e */
        public C0257a mo782e(int i) {
            C0249f fVar = this.f762a;
            fVar.f747z = null;
            fVar.f746y = i;
            fVar.f709E = false;
            return this;
        }

        public C0257a(@C0193h0 Context context, @C0216r0 int i) {
            this.f762a = new C0249f(new ContextThemeWrapper(context, AlertDialog.resolveDialogTheme(context, i)));
            this.f763b = i;
        }

        /* renamed from: a */
        public C0257a mo758a(@C0195i0 CharSequence charSequence) {
            this.f762a.f729h = charSequence;
            return this;
        }

        /* renamed from: b */
        public C0257a mo770b(@C0195i0 CharSequence charSequence) {
            this.f762a.f727f = charSequence;
            return this;
        }

        /* renamed from: c */
        public C0257a mo776c(CharSequence charSequence, OnClickListener onClickListener) {
            C0249f fVar = this.f762a;
            fVar.f730i = charSequence;
            fVar.f732k = onClickListener;
            return this;
        }

        /* renamed from: d */
        public C0257a mo780d(@C0214q0 int i, OnClickListener onClickListener) {
            C0249f fVar = this.f762a;
            fVar.f730i = fVar.f722a.getText(i);
            this.f762a.f732k = onClickListener;
            return this;
        }

        /* renamed from: a */
        public C0257a mo742a(@C0213q int i) {
            this.f762a.f724c = i;
            return this;
        }

        /* renamed from: b */
        public C0257a mo766b(@C0188f int i) {
            TypedValue typedValue = new TypedValue();
            this.f762a.f722a.getTheme().resolveAttribute(i, typedValue, true);
            this.f762a.f724c = typedValue.resourceId;
            return this;
        }

        /* renamed from: a */
        public C0257a mo752a(@C0195i0 Drawable drawable) {
            this.f762a.f725d = drawable;
            return this;
        }

        /* renamed from: c */
        public C0257a mo774c(@C0214q0 int i, OnClickListener onClickListener) {
            C0249f fVar = this.f762a;
            fVar.f736o = fVar.f722a.getText(i);
            this.f762a.f738q = onClickListener;
            return this;
        }

        /* renamed from: d */
        public C0257a mo781d(Drawable drawable) {
            this.f762a.f731j = drawable;
            return this;
        }

        /* renamed from: a */
        public C0257a mo759a(CharSequence charSequence, OnClickListener onClickListener) {
            C0249f fVar = this.f762a;
            fVar.f733l = charSequence;
            fVar.f735n = onClickListener;
            return this;
        }

        /* renamed from: b */
        public C0257a mo767b(@C0214q0 int i, OnClickListener onClickListener) {
            C0249f fVar = this.f762a;
            fVar.f733l = fVar.f722a.getText(i);
            this.f762a.f735n = onClickListener;
            return this;
        }

        /* renamed from: c */
        public C0257a mo775c(Drawable drawable) {
            this.f762a.f737p = drawable;
            return this;
        }

        /* renamed from: a */
        public C0257a mo760a(boolean z) {
            this.f762a.f739r = z;
            return this;
        }

        @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
        /* renamed from: c */
        public C0257a mo777c(boolean z) {
            this.f762a.f721Q = z;
            return this;
        }

        /* renamed from: a */
        public C0257a mo746a(OnCancelListener onCancelListener) {
            this.f762a.f740s = onCancelListener;
            return this;
        }

        /* renamed from: b */
        public C0257a mo768b(Drawable drawable) {
            this.f762a.f734m = drawable;
            return this;
        }

        /* renamed from: c */
        public AlertDialog mo778c() {
            AlertDialog a = mo764a();
            a.show();
            return a;
        }

        /* renamed from: a */
        public C0257a mo747a(OnDismissListener onDismissListener) {
            this.f762a.f741t = onDismissListener;
            return this;
        }

        /* renamed from: b */
        public C0257a mo771b(CharSequence charSequence, OnClickListener onClickListener) {
            C0249f fVar = this.f762a;
            fVar.f736o = charSequence;
            fVar.f738q = onClickListener;
            return this;
        }

        /* renamed from: a */
        public C0257a mo748a(OnKeyListener onKeyListener) {
            this.f762a.f742u = onKeyListener;
            return this;
        }

        /* renamed from: a */
        public C0257a mo744a(@C0186e int i, OnClickListener onClickListener) {
            C0249f fVar = this.f762a;
            fVar.f743v = fVar.f722a.getResources().getTextArray(i);
            this.f762a.f745x = onClickListener;
            return this;
        }

        /* renamed from: b */
        public C0257a mo769b(View view) {
            C0249f fVar = this.f762a;
            fVar.f747z = view;
            fVar.f746y = 0;
            fVar.f709E = false;
            return this;
        }

        /* renamed from: a */
        public C0257a mo762a(CharSequence[] charSequenceArr, OnClickListener onClickListener) {
            C0249f fVar = this.f762a;
            fVar.f743v = charSequenceArr;
            fVar.f745x = onClickListener;
            return this;
        }

        @Deprecated
        /* renamed from: b */
        public C0257a mo772b(boolean z) {
            this.f762a.f718N = z;
            return this;
        }

        /* renamed from: a */
        public C0257a mo757a(ListAdapter listAdapter, OnClickListener onClickListener) {
            C0249f fVar = this.f762a;
            fVar.f744w = listAdapter;
            fVar.f745x = onClickListener;
            return this;
        }

        /* renamed from: a */
        public C0257a mo750a(Cursor cursor, OnClickListener onClickListener, String str) {
            C0249f fVar = this.f762a;
            fVar.f715K = cursor;
            fVar.f716L = str;
            fVar.f745x = onClickListener;
            return this;
        }

        /* renamed from: a */
        public C0257a mo745a(@C0186e int i, boolean[] zArr, OnMultiChoiceClickListener onMultiChoiceClickListener) {
            C0249f fVar = this.f762a;
            fVar.f743v = fVar.f722a.getResources().getTextArray(i);
            C0249f fVar2 = this.f762a;
            fVar2.f714J = onMultiChoiceClickListener;
            fVar2.f710F = zArr;
            fVar2.f711G = true;
            return this;
        }

        /* renamed from: a */
        public C0257a mo763a(CharSequence[] charSequenceArr, boolean[] zArr, OnMultiChoiceClickListener onMultiChoiceClickListener) {
            C0249f fVar = this.f762a;
            fVar.f743v = charSequenceArr;
            fVar.f714J = onMultiChoiceClickListener;
            fVar.f710F = zArr;
            fVar.f711G = true;
            return this;
        }

        /* renamed from: a */
        public C0257a mo751a(Cursor cursor, String str, String str2, OnMultiChoiceClickListener onMultiChoiceClickListener) {
            C0249f fVar = this.f762a;
            fVar.f715K = cursor;
            fVar.f714J = onMultiChoiceClickListener;
            fVar.f717M = str;
            fVar.f716L = str2;
            fVar.f711G = true;
            return this;
        }

        /* renamed from: a */
        public C0257a mo743a(@C0186e int i, int i2, OnClickListener onClickListener) {
            C0249f fVar = this.f762a;
            fVar.f743v = fVar.f722a.getResources().getTextArray(i);
            C0249f fVar2 = this.f762a;
            fVar2.f745x = onClickListener;
            fVar2.f713I = i2;
            fVar2.f712H = true;
            return this;
        }

        /* renamed from: a */
        public C0257a mo749a(Cursor cursor, int i, String str, OnClickListener onClickListener) {
            C0249f fVar = this.f762a;
            fVar.f715K = cursor;
            fVar.f745x = onClickListener;
            fVar.f713I = i;
            fVar.f716L = str;
            fVar.f712H = true;
            return this;
        }

        /* renamed from: a */
        public C0257a mo761a(CharSequence[] charSequenceArr, int i, OnClickListener onClickListener) {
            C0249f fVar = this.f762a;
            fVar.f743v = charSequenceArr;
            fVar.f745x = onClickListener;
            fVar.f713I = i;
            fVar.f712H = true;
            return this;
        }

        /* renamed from: a */
        public C0257a mo756a(ListAdapter listAdapter, int i, OnClickListener onClickListener) {
            C0249f fVar = this.f762a;
            fVar.f744w = listAdapter;
            fVar.f745x = onClickListener;
            fVar.f713I = i;
            fVar.f712H = true;
            return this;
        }

        /* renamed from: a */
        public C0257a mo755a(OnItemSelectedListener onItemSelectedListener) {
            this.f762a.f719O = onItemSelectedListener;
            return this;
        }

        @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
        @Deprecated
        /* renamed from: a */
        public C0257a mo754a(View view, int i, int i2, int i3, int i4) {
            C0249f fVar = this.f762a;
            fVar.f747z = view;
            fVar.f746y = 0;
            fVar.f709E = true;
            fVar.f705A = i;
            fVar.f706B = i2;
            fVar.f707C = i3;
            fVar.f708D = i4;
            return this;
        }

        @C0193h0
        /* renamed from: a */
        public AlertDialog mo764a() {
            AlertDialog alertDialog = new AlertDialog(this.f762a.f722a, this.f763b);
            this.f762a.mo715a(alertDialog.mAlert);
            alertDialog.setCancelable(this.f762a.f739r);
            if (this.f762a.f739r) {
                alertDialog.setCanceledOnTouchOutside(true);
            }
            alertDialog.setOnCancelListener(this.f762a.f740s);
            alertDialog.setOnDismissListener(this.f762a.f741t);
            OnKeyListener onKeyListener = this.f762a.f742u;
            if (onKeyListener != null) {
                alertDialog.setOnKeyListener(onKeyListener);
            }
            return alertDialog;
        }
    }

    protected AlertDialog(@C0193h0 Context context) {
        this(context, 0);
    }

    static int resolveDialogTheme(@C0193h0 Context context, @C0216r0 int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0238R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public Button getButton(int i) {
        return this.mAlert.mo692a(i);
    }

    public ListView getListView() {
        return this.mAlert.mo693a();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mAlert.mo701b();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.mAlert.mo699a(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.mAlert.mo704b(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public void setButton(int i, CharSequence charSequence, Message message) {
        this.mAlert.mo694a(i, charSequence, (OnClickListener) null, message, (Drawable) null);
    }

    /* access modifiers changed from: 0000 */
    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    public void setButtonPanelLayoutHint(int i) {
        this.mAlert.mo705c(i);
    }

    public void setCustomTitle(View view) {
        this.mAlert.mo696a(view);
    }

    public void setIcon(int i) {
        this.mAlert.mo706d(i);
    }

    public void setIconAttribute(int i) {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(i, typedValue, true);
        this.mAlert.mo706d(typedValue.resourceId);
    }

    public void setMessage(CharSequence charSequence) {
        this.mAlert.mo698a(charSequence);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.mAlert.mo703b(charSequence);
    }

    public void setView(View view) {
        this.mAlert.mo702b(view);
    }

    protected AlertDialog(@C0193h0 Context context, @C0216r0 int i) {
        super(context, resolveDialogTheme(context, i));
        this.mAlert = new AlertController(getContext(), this, getWindow());
    }

    public void setButton(int i, CharSequence charSequence, OnClickListener onClickListener) {
        this.mAlert.mo694a(i, charSequence, onClickListener, (Message) null, (Drawable) null);
    }

    public void setIcon(Drawable drawable) {
        this.mAlert.mo695a(drawable);
    }

    public void setView(View view, int i, int i2, int i3, int i4) {
        this.mAlert.mo697a(view, i, i2, i3, i4);
    }

    public void setButton(int i, CharSequence charSequence, Drawable drawable, OnClickListener onClickListener) {
        this.mAlert.mo694a(i, charSequence, onClickListener, (Message) null, drawable);
    }

    protected AlertDialog(@C0193h0 Context context, boolean z, @C0195i0 OnCancelListener onCancelListener) {
        this(context, 0);
        setCancelable(z);
        setOnCancelListener(onCancelListener);
    }
}
