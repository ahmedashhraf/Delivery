package com.instabug.library.visualusersteps;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import androidx.annotation.C0193h0;
import com.instabug.library.internal.storage.AttachmentManager;
import com.instabug.library.tracking.InstabugInternalTrackingDelegate;
import com.instabug.library.util.DiskUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import p195e.p196a.C5923b0;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class VisualUserStepsHelper {
    private static transient /* synthetic */ boolean[] $jacocoData;

    /* renamed from: com.instabug.library.visualusersteps.VisualUserStepsHelper$a */
    static class C10031a implements Callable<Uri> {

        /* renamed from: N */
        private static transient /* synthetic */ boolean[] f26696N;

        /* renamed from: a */
        final /* synthetic */ Context f26697a;

        /* renamed from: b */
        final /* synthetic */ String f26698b;

        C10031a(Context context, String str) {
            boolean[] b = m46658b();
            this.f26697a = context;
            this.f26698b = str;
            b[0] = true;
        }

        /* renamed from: b */
        private static /* synthetic */ boolean[] m46658b() {
            boolean[] zArr = f26696N;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-8173500031178228438L, "com/instabug/library/visualusersteps/VisualUserStepsHelper$1", 3);
            f26696N = a;
            return a;
        }

        /* renamed from: a */
        public Uri mo36038a() {
            boolean[] b = m46658b();
            Uri access$000 = VisualUserStepsHelper.access$000(this.f26697a, this.f26698b);
            b[1] = true;
            return access$000;
        }

        public /* synthetic */ Object call() throws Exception {
            boolean[] b = m46658b();
            Uri a = mo36038a();
            b[2] = true;
            return a;
        }
    }

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(6128636737488258312L, "com/instabug/library/visualusersteps/VisualUserStepsHelper", 9);
        $jacocoData = a;
        return a;
    }

    public VisualUserStepsHelper() {
        $jacocoInit()[0] = true;
    }

    static /* synthetic */ Uri access$000(Context context, String str) {
        boolean[] $jacocoInit = $jacocoInit();
        Uri visualUserStepsFile = getVisualUserStepsFile(context, str);
        $jacocoInit[8] = true;
        return visualUserStepsFile;
    }

    static File getVisualUserStepsDirectory(Context context) {
        boolean[] $jacocoInit = $jacocoInit();
        File newDirectory = AttachmentManager.getNewDirectory(context, "usersteps");
        $jacocoInit[6] = true;
        return newDirectory;
    }

    private static Uri getVisualUserStepsFile(Context context, String str) {
        boolean[] $jacocoInit = $jacocoInit();
        InstabugInternalTrackingDelegate instance = InstabugInternalTrackingDelegate.getInstance();
        $jacocoInit[1] = true;
        Activity targetActivity = instance.getTargetActivity();
        $jacocoInit[2] = true;
        File visualUserStepsDirectory = getVisualUserStepsDirectory(targetActivity);
        $jacocoInit[3] = true;
        ArrayList listFilesInDirectory = DiskUtils.listFilesInDirectory(visualUserStepsDirectory);
        $jacocoInit[4] = true;
        StringBuilder sb = new StringBuilder();
        sb.append("usersteps_");
        sb.append(str);
        Uri zipFiles = DiskUtils.zipFiles(context, sb.toString(), listFilesInDirectory);
        $jacocoInit[5] = true;
        return zipFiles;
    }

    @C0193h0
    public static C5923b0<Uri> getVisualUserStepsFileObservable(Context context, String str) {
        boolean[] $jacocoInit = $jacocoInit();
        C5923b0<Uri> f = C5923b0.m26194f((Callable<? extends T>) new C10031a<Object>(context, str));
        $jacocoInit[7] = true;
        return f;
    }
}
