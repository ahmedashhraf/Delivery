package com.instabug.bug.extendedbugreport;

import android.content.Context;
import com.instabug.bug.C9231R;
import com.instabug.bug.model.C9277a;
import com.instabug.library.util.LocaleUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class ExtendedBugReport {
    private static transient /* synthetic */ boolean[] $jacocoData = null;
    private static final String ID_ACTUAL_RESULT = "actual_result";
    private static final String ID_EXPECTED_RESULT = "expected_result";
    private static final String ID_REPRO_STEPS = "repro_steps";

    public enum State {
        DISABLED,
        ENABLED_WITH_REQUIRED_FIELDS,
        ENABLED_WITH_OPTIONAL_FIELDS;

        static {
            boolean[] $jacocoInit;
            $jacocoInit[5] = true;
        }
    }

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-6743347920521683082L, "com/instabug/bug/extendedbugreport/ExtendedBugReport", 14);
        $jacocoData = a;
        return a;
    }

    public ExtendedBugReport() {
        $jacocoInit()[0] = true;
    }

    public static List<C9277a> getFields(Context context, State state) {
        boolean[] $jacocoInit = $jacocoInit();
        if (state == State.ENABLED_WITH_REQUIRED_FIELDS) {
            $jacocoInit[1] = true;
            List<C9277a> fields = getFields(context, true);
            $jacocoInit[2] = true;
            return fields;
        }
        List<C9277a> fields2 = getFields(context, false);
        $jacocoInit[3] = true;
        return fields2;
    }

    private static List<C9277a> getFields(Context context, boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        ArrayList arrayList = new ArrayList();
        int i = C9231R.string.instabug_str_steps_to_reproduce;
        $jacocoInit[4] = true;
        String string = context.getString(i);
        Locale locale = Locale.ENGLISH;
        int i2 = C9231R.string.instabug_str_steps_to_reproduce;
        $jacocoInit[5] = true;
        C9277a aVar = new C9277a(string, LocaleUtils.getLocaleStringResource(locale, i2, context), z, ID_REPRO_STEPS);
        $jacocoInit[6] = true;
        arrayList.add(aVar);
        int i3 = C9231R.string.instabug_str_actual_results;
        $jacocoInit[7] = true;
        String string2 = context.getString(i3);
        Locale locale2 = Locale.ENGLISH;
        int i4 = C9231R.string.instabug_str_actual_results;
        $jacocoInit[8] = true;
        C9277a aVar2 = new C9277a(string2, LocaleUtils.getLocaleStringResource(locale2, i4, context), z, ID_ACTUAL_RESULT);
        $jacocoInit[9] = true;
        arrayList.add(aVar2);
        int i5 = C9231R.string.instabug_str_expected_results;
        $jacocoInit[10] = true;
        String string3 = context.getString(i5);
        Locale locale3 = Locale.ENGLISH;
        int i6 = C9231R.string.instabug_str_expected_results;
        $jacocoInit[11] = true;
        C9277a aVar3 = new C9277a(string3, LocaleUtils.getLocaleStringResource(locale3, i6, context), z, ID_EXPECTED_RESULT);
        $jacocoInit[12] = true;
        arrayList.add(aVar3);
        $jacocoInit[13] = true;
        return arrayList;
    }
}
