package androidx.core.p034l;

import android.app.Activity;
import android.os.Build.VERSION;
import android.view.DragAndDropPermissions;
import android.view.DragEvent;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;

/* renamed from: androidx.core.l.d */
/* compiled from: DragAndDropPermissionsCompat */
public final class C0956d {

    /* renamed from: a */
    private Object f4291a;

    private C0956d(Object obj) {
        this.f4291a = obj;
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    @C0195i0
    /* renamed from: a */
    public static C0956d m5387a(Activity activity, DragEvent dragEvent) {
        if (VERSION.SDK_INT >= 24) {
            DragAndDropPermissions requestDragAndDropPermissions = activity.requestDragAndDropPermissions(dragEvent);
            if (requestDragAndDropPermissions != null) {
                return new C0956d(requestDragAndDropPermissions);
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo4783a() {
        if (VERSION.SDK_INT >= 24) {
            ((DragAndDropPermissions) this.f4291a).release();
        }
    }
}
