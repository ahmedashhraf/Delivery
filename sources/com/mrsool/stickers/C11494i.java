package com.mrsool.stickers;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import androidx.annotation.C0193h0;
import androidx.annotation.C0214q0;
import androidx.fragment.app.C1374b;
import com.google.android.material.p296f.C6845b;
import com.mrsool.C10232R;
import com.mrsool.C10787d;

/* renamed from: com.mrsool.stickers.i */
/* compiled from: BaseStickerActivity */
public abstract class C11494i extends C10787d {

    /* renamed from: com.mrsool.stickers.i$a */
    /* compiled from: BaseStickerActivity */
    public static final class C11495a extends C1374b {

        /* renamed from: a */
        private static final String f32462a = "title_id";

        /* renamed from: b */
        private static final String f32463b = "message";

        /* renamed from: a */
        public static C1374b m51868a(@C0214q0 int i, String str) {
            C11495a aVar = new C11495a();
            Bundle bundle = new Bundle();
            bundle.putInt(f32462a, i);
            bundle.putString("message", str);
            aVar.setArguments(bundle);
            return aVar;
        }

        @C0193h0
        public Dialog onCreateDialog(Bundle bundle) {
            int i = getArguments().getInt(f32462a);
            String string = getArguments().getString("message");
            C6845b bVar = new C6845b(getActivity(), C10232R.style.AlertDialogTheme);
            bVar.mo758a((CharSequence) string);
            bVar.mo760a(true);
            bVar.mo780d(17039370, (OnClickListener) new C11486a(this));
            if (i != 0) {
                bVar.mo779d(i);
            }
            return bVar.mo764a();
        }

        /* renamed from: a */
        public /* synthetic */ void mo39625a(DialogInterface dialogInterface, int i) {
            dismiss();
        }
    }

    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
