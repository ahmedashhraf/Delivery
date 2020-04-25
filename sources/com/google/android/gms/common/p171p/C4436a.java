package com.google.android.gms.common.p171p;

import android.database.AbstractWindowedCursor;
import android.database.CrossProcessCursor;
import android.database.Cursor;
import android.database.CursorWindow;
import android.database.CursorWrapper;
import com.google.android.gms.common.annotation.C4056a;

@C4056a
/* renamed from: com.google.android.gms.common.p.a */
public class C4436a extends CursorWrapper implements CrossProcessCursor {

    /* renamed from: a */
    private AbstractWindowedCursor f13603a;

    @C4056a
    public C4436a(Cursor cursor) {
        super(cursor);
        for (int i = 0; i < 10 && (cursor instanceof CursorWrapper); i++) {
            cursor = ((CursorWrapper) cursor).getWrappedCursor();
        }
        if (!(cursor instanceof AbstractWindowedCursor)) {
            String str = "Unknown type: ";
            String valueOf = String.valueOf(cursor.getClass().getName());
            throw new IllegalArgumentException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
        this.f13603a = (AbstractWindowedCursor) cursor;
    }

    @C4056a
    /* renamed from: a */
    public void mo18439a(CursorWindow cursorWindow) {
        this.f13603a.setWindow(cursorWindow);
    }

    @C4056a
    public void fillWindow(int i, CursorWindow cursorWindow) {
        this.f13603a.fillWindow(i, cursorWindow);
    }

    @C4056a
    public CursorWindow getWindow() {
        return this.f13603a.getWindow();
    }

    public /* synthetic */ Cursor getWrappedCursor() {
        return this.f13603a;
    }

    public boolean onMove(int i, int i2) {
        return this.f13603a.onMove(i, i2);
    }
}
