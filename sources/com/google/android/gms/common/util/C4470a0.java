package com.google.android.gms.common.util;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import com.google.android.gms.common.annotation.C4056a;
import java.io.File;

@C4056a
/* renamed from: com.google.android.gms.common.util.a0 */
public class C4470a0 {
    private C4470a0() {
    }

    @C4056a
    @Deprecated
    /* renamed from: a */
    public static void m19295a(Context context, Editor editor, String str) {
        File file = new File(context.getApplicationInfo().dataDir, "shared_prefs");
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            parentFile.setExecutable(true, false);
        }
        file.setExecutable(true, false);
        editor.commit();
        new File(file, String.valueOf(str).concat(".xml")).setReadable(true, false);
    }
}
