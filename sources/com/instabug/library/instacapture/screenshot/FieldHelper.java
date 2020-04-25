package com.instabug.library.instacapture.screenshot;

import android.app.Activity;
import android.os.Build.VERSION;
import android.view.View;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import androidx.annotation.C0195i0;
import androidx.annotation.C0225w;
import com.instabug.library.util.InstabugSDKLogger;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class FieldHelper {
    private static transient /* synthetic */ boolean[] $jacocoData = null;
    private static final String FIELD_NAME_GLOBAL = "mGlobal";
    private static final String FIELD_NAME_PARAMS = "mParams";
    private static final String FIELD_NAME_ROOTS = "mRoots";
    private static final String FIELD_NAME_VIEW = "mView";
    private static final String FIELD_NAME_WINDOW_MANAGER = "mWindowManager";

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(5323627113005241285L, "com/instabug/library/instacapture/screenshot/FieldHelper", 46);
        $jacocoData = a;
        return a;
    }

    private FieldHelper() {
        $jacocoInit()[0] = true;
    }

    private static Field findField(String str, Class cls) throws NoSuchFieldException {
        boolean[] $jacocoInit = $jacocoInit();
        $jacocoInit[37] = true;
        Class cls2 = cls;
        while (cls2 != Object.class) {
            $jacocoInit[38] = true;
            Field[] declaredFields = cls2.getDeclaredFields();
            int length = declaredFields.length;
            int i = 0;
            $jacocoInit[39] = true;
            while (i < length) {
                Field field = declaredFields[i];
                $jacocoInit[40] = true;
                if (str.equals(field.getName())) {
                    $jacocoInit[41] = true;
                    return field;
                }
                i++;
                $jacocoInit[42] = true;
            }
            cls2 = cls2.getSuperclass();
            $jacocoInit[43] = true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Field: ");
        sb.append(str);
        sb.append(" is not found in class: ");
        $jacocoInit[44] = true;
        sb.append(cls.toString());
        NoSuchFieldException noSuchFieldException = new NoSuchFieldException(sb.toString());
        $jacocoInit[45] = true;
        throw noSuchFieldException;
    }

    private static Object getFieldValue(String str, Object obj) throws NoSuchFieldException, IllegalAccessException {
        Field field;
        boolean[] $jacocoInit = $jacocoInit();
        if (str.equals(FIELD_NAME_WINDOW_MANAGER)) {
            $jacocoInit[32] = true;
            field = findField(str, obj.getClass());
            $jacocoInit[33] = true;
        } else {
            field = obj.getClass().getDeclaredField(str);
            $jacocoInit[34] = true;
        }
        field.setAccessible(true);
        $jacocoInit[35] = true;
        Object obj2 = field.get(obj);
        $jacocoInit[36] = true;
        return obj2;
    }

    public static List<RootViewInfo> getRootViews(Activity activity, @C0225w @C0195i0 int[] iArr) {
        Object obj;
        Object[] objArr;
        LayoutParams[] layoutParamsArr;
        boolean z;
        int[] iArr2 = iArr;
        Class<FieldHelper> cls = FieldHelper.class;
        boolean[] $jacocoInit = $jacocoInit();
        ArrayList arrayList = new ArrayList();
        try {
            $jacocoInit[1] = true;
            char c = 17;
            if (VERSION.SDK_INT >= 17) {
                $jacocoInit[2] = true;
                obj = getFieldValue(FIELD_NAME_GLOBAL, activity.getWindowManager());
                $jacocoInit[3] = true;
            } else {
                String str = FIELD_NAME_WINDOW_MANAGER;
                $jacocoInit[4] = true;
                WindowManager windowManager = activity.getWindowManager();
                $jacocoInit[5] = true;
                obj = getFieldValue(str, windowManager);
                $jacocoInit[6] = true;
            }
            Object fieldValue = getFieldValue(FIELD_NAME_ROOTS, obj);
            $jacocoInit[7] = true;
            Object fieldValue2 = getFieldValue(FIELD_NAME_PARAMS, obj);
            if (VERSION.SDK_INT >= 19) {
                $jacocoInit[10] = true;
                objArr = ((List) fieldValue).toArray();
                List list = (List) fieldValue2;
                $jacocoInit[11] = true;
                layoutParamsArr = (LayoutParams[]) list.toArray(new LayoutParams[list.size()]);
                $jacocoInit[12] = true;
            } else {
                objArr = (Object[]) fieldValue;
                layoutParamsArr = (LayoutParams[]) fieldValue2;
                $jacocoInit[13] = true;
            }
            LayoutParams[] layoutParamsArr2 = layoutParamsArr;
            $jacocoInit[14] = true;
            int i = 0;
            while (i < objArr.length) {
                try {
                    $jacocoInit[15] = true;
                    View view = (View) getFieldValue(FIELD_NAME_VIEW, objArr[i]);
                    if (iArr2 == null) {
                        $jacocoInit[16] = true;
                        z = false;
                    } else {
                        int length = iArr2.length;
                        $jacocoInit[c] = true;
                        int i2 = 0;
                        z = false;
                        while (i2 < length) {
                            int i3 = iArr2[i2];
                            $jacocoInit[19] = true;
                            if (i3 != view.getId()) {
                                $jacocoInit[20] = true;
                            } else {
                                $jacocoInit[21] = true;
                                z = true;
                            }
                            i2++;
                            $jacocoInit[22] = true;
                        }
                        $jacocoInit[18] = true;
                    }
                    if (view.getVisibility() != 0) {
                        $jacocoInit[23] = true;
                    } else if (z) {
                        $jacocoInit[24] = true;
                    } else {
                        $jacocoInit[25] = true;
                        arrayList.add(new RootViewInfo(view, layoutParamsArr2[i]));
                        $jacocoInit[26] = true;
                    }
                    $jacocoInit[27] = true;
                } catch (Exception e) {
                    $jacocoInit[28] = true;
                    InstabugSDKLogger.m46624e(cls, "Screenshot capturing failed in one of the viewRoots", e);
                    $jacocoInit[29] = true;
                }
                i++;
                $jacocoInit[30] = true;
                c = 17;
            }
            $jacocoInit[31] = true;
            return arrayList;
        } catch (Exception e2) {
            $jacocoInit[8] = true;
            InstabugSDKLogger.m46624e(cls, "Can't fine one of (WindowManager, rootObjects, paramsObject) field name so screenshot capturing failed", e2);
            $jacocoInit[9] = true;
            return arrayList;
        }
    }
}
