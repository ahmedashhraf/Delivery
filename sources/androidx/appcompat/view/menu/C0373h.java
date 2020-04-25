package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import androidx.appcompat.C0238R;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AlertDialog.C0257a;
import androidx.appcompat.view.menu.C0386n.C0387a;

/* renamed from: androidx.appcompat.view.menu.h */
/* compiled from: MenuDialogHelper */
class C0373h implements OnKeyListener, OnClickListener, OnDismissListener, C0387a {

    /* renamed from: N */
    C0367e f1364N;

    /* renamed from: O */
    private C0387a f1365O;

    /* renamed from: a */
    private C0370g f1366a;

    /* renamed from: b */
    private AlertDialog f1367b;

    public C0373h(C0370g gVar) {
        this.f1366a = gVar;
    }

    /* renamed from: a */
    public void mo1632a(IBinder iBinder) {
        C0370g gVar = this.f1366a;
        C0257a aVar = new C0257a(gVar.mo1601f());
        this.f1364N = new C0367e(aVar.mo765b(), C0238R.layout.abc_list_menu_item_layout);
        this.f1364N.mo1488a((C0387a) this);
        this.f1366a.mo1562a((C0386n) this.f1364N);
        aVar.mo757a(this.f1364N.mo1530b(), (OnClickListener) this);
        View j = gVar.mo1610j();
        if (j != null) {
            aVar.mo753a(j);
        } else {
            aVar.mo752a(gVar.mo1606h()).mo770b(gVar.mo1608i());
        }
        aVar.mo748a((OnKeyListener) this);
        this.f1367b = aVar.mo764a();
        this.f1367b.setOnDismissListener(this);
        LayoutParams attributes = this.f1367b.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f1367b.show();
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f1366a.mo1566a((MenuItem) (C0375j) this.f1364N.mo1530b().getItem(i), 0);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.f1364N.mo1486a(this.f1366a, true);
    }

    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window = this.f1367b.getWindow();
                if (window != null) {
                    View decorView = window.getDecorView();
                    if (decorView != null) {
                        DispatcherState keyDispatcherState = decorView.getKeyDispatcherState();
                        if (keyDispatcherState != null) {
                            keyDispatcherState.startTracking(keyEvent, this);
                            return true;
                        }
                    }
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled()) {
                Window window2 = this.f1367b.getWindow();
                if (window2 != null) {
                    View decorView2 = window2.getDecorView();
                    if (decorView2 != null) {
                        DispatcherState keyDispatcherState2 = decorView2.getKeyDispatcherState();
                        if (keyDispatcherState2 != null && keyDispatcherState2.isTracking(keyEvent)) {
                            this.f1366a.mo1565a(true);
                            dialogInterface.dismiss();
                            return true;
                        }
                    }
                }
            }
        }
        return this.f1366a.performShortcut(i, keyEvent, 0);
    }

    /* renamed from: a */
    public void mo1633a(C0387a aVar) {
        this.f1365O = aVar;
    }

    /* renamed from: a */
    public void mo1631a() {
        AlertDialog alertDialog = this.f1367b;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    /* renamed from: a */
    public void mo872a(C0370g gVar, boolean z) {
        if (z || gVar == this.f1366a) {
            mo1631a();
        }
        C0387a aVar = this.f1365O;
        if (aVar != null) {
            aVar.mo872a(gVar, z);
        }
    }

    /* renamed from: a */
    public boolean mo873a(C0370g gVar) {
        C0387a aVar = this.f1365O;
        if (aVar != null) {
            return aVar.mo873a(gVar);
        }
        return false;
    }
}
