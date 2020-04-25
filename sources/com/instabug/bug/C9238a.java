package com.instabug.bug;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0224v0;
import com.instabug.bug.OnSdkDismissedCallback.DismissType;
import com.instabug.bug.model.Bug;
import com.instabug.bug.model.Bug.BugState;
import com.instabug.bug.model.C9278b;
import com.instabug.bug.model.ReportCategory;
import com.instabug.bug.p355b.C9245a;
import com.instabug.bug.p356h.p357b.C9260a;
import com.instabug.bug.settings.AttachmentsTypesParams;
import com.instabug.bug.settings.C9291a;
import com.instabug.library.Feature;
import com.instabug.library.Instabug;
import com.instabug.library.InstabugCustomTextPlaceHolder.Key;
import com.instabug.library.OnSdkDismissCallback;
import com.instabug.library.OnSdkDismissCallback.ReportType;
import com.instabug.library.core.InitialScreenshotHelper;
import com.instabug.library.core.InitialScreenshotHelper.InitialScreenshotCapturingListener;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEvent;
import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEventSubscriber;
import com.instabug.library.core.plugin.PluginPromptOption;
import com.instabug.library.core.plugin.PluginPromptOption.OnInvocationListener;
import com.instabug.library.internal.storage.DiskUtils;
import com.instabug.library.internal.storage.cache.AttachmentsDbHelper;
import com.instabug.library.internal.storage.cache.p389db.DatabaseManager;
import com.instabug.library.internal.storage.cache.p389db.InstabugDbContract.BugEntry;
import com.instabug.library.internal.storage.cache.p389db.SQLiteDatabaseWrapper;
import com.instabug.library.internal.storage.executor.ReadOperationExecutor;
import com.instabug.library.internal.storage.operation.ReadStateFromFileDiskOperation;
import com.instabug.library.invocation.invocationdialog.InstabugDialogActivity;
import com.instabug.library.model.Attachment;
import com.instabug.library.model.Attachment.Type;
import com.instabug.library.model.State;
import com.instabug.library.tracking.InstabugInternalTrackingDelegate;
import com.instabug.library.util.InstabugMemoryUtils;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.LocaleUtils;
import com.instabug.library.util.PlaceHolderUtils;
import com.mrsool.utils.C11644i;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12331g;
import p205i.p471b.p472a.p473a.p474c.C13938g;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

/* renamed from: com.instabug.bug.a */
/* compiled from: BugPluginWrapper */
public class C9238a {

    /* renamed from: a */
    private static transient /* synthetic */ boolean[] f24440a;

    /* renamed from: com.instabug.bug.a$a */
    /* compiled from: BugPluginWrapper */
    static class C9239a implements C12331g<SDKCoreEvent> {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f24441b;

        /* renamed from: a */
        final /* synthetic */ Context f24442a;

        C9239a(Context context) {
            boolean[] a = m43195a();
            this.f24442a = context;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m43195a() {
            boolean[] zArr = f24441b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(8040379601146833810L, "com/instabug/bug/BugPluginWrapper$1", 3);
            f24441b = a;
            return a;
        }

        /* renamed from: a */
        public void mo33409a(SDKCoreEvent sDKCoreEvent) {
            boolean[] a = m43195a();
            C9253e.m43240a(this.f24442a, sDKCoreEvent);
            a[1] = true;
        }

        /* renamed from: c */
        public /* synthetic */ void mo33410c(Object obj) throws Exception {
            boolean[] a = m43195a();
            mo33409a((SDKCoreEvent) obj);
            a[2] = true;
        }
    }

    /* renamed from: com.instabug.bug.a$b */
    /* compiled from: BugPluginWrapper */
    static class C9240b implements OnInvocationListener {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f24443b;

        /* renamed from: a */
        final /* synthetic */ Context f24444a;

        C9240b(Context context) {
            boolean[] a = m43198a();
            this.f24444a = context;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m43198a() {
            boolean[] zArr = f24443b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-6896292226011293932L, "com/instabug/bug/BugPluginWrapper$2", 2);
            f24443b = a;
            return a;
        }

        public void onInvoke(Uri uri) {
            boolean[] a = m43198a();
            C9238a.m43172a(this.f24444a, uri);
            a[1] = true;
        }
    }

    /* renamed from: com.instabug.bug.a$c */
    /* compiled from: BugPluginWrapper */
    static class C9241c implements OnInvocationListener {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f24445b;

        /* renamed from: a */
        final /* synthetic */ Context f24446a;

        C9241c(Context context) {
            boolean[] a = m43199a();
            this.f24446a = context;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m43199a() {
            boolean[] zArr = f24445b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(6369177164418056860L, "com/instabug/bug/BugPluginWrapper$3", 2);
            f24445b = a;
            return a;
        }

        public void onInvoke(Uri uri) {
            boolean[] a = m43199a();
            C9238a.m43178b(this.f24446a, uri);
            a[1] = true;
        }
    }

    /* renamed from: com.instabug.bug.a$d */
    /* compiled from: BugPluginWrapper */
    static class C9242d implements InitialScreenshotCapturingListener {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f24447b;

        /* renamed from: a */
        final /* synthetic */ int f24448a;

        C9242d(int i) {
            boolean[] a = m43200a();
            this.f24448a = i;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m43200a() {
            boolean[] zArr = f24447b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-4899675178127403920L, "com/instabug/bug/BugPluginWrapper$4", 6);
            f24447b = a;
            return a;
        }

        public void onScreenshotCapturedSuccessfully(Uri uri) {
            boolean[] a = m43200a();
            C9238a.m43170a(this.f24448a, uri);
            a[1] = true;
        }

        public void onScreenshotCapturingFailed(Throwable th) {
            boolean[] a = m43200a();
            StringBuilder sb = new StringBuilder();
            sb.append("initial screenshot capturing got error: ");
            a[2] = true;
            sb.append(th.getMessage());
            sb.append(", time in MS: ");
            a[3] = true;
            sb.append(System.currentTimeMillis());
            String sb2 = sb.toString();
            a[4] = true;
            InstabugSDKLogger.m46624e(this, sb2, th);
            a[5] = true;
        }
    }

    /* renamed from: com.instabug.bug.a$e */
    /* compiled from: BugPluginWrapper */
    static /* synthetic */ class C9243e {

        /* renamed from: a */
        static final /* synthetic */ int[] f24449a = new int[DismissType.values().length];

        /* renamed from: b */
        static final /* synthetic */ int[] f24450b = new int[C9278b.values().length];

        /* renamed from: c */
        private static transient /* synthetic */ boolean[] f24451c;

        /* JADX WARNING: Can't wrap try/catch for region: R(2:4|5) */
        /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
            r0[4] = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
            r0[6] = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:?, code lost:
            r0[2] = true;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0020 */
        static {
            /*
                boolean[] r0 = m43201a()
                com.instabug.bug.model.b[] r1 = com.instabug.bug.model.C9278b.values()
                int r1 = r1.length
                int[] r1 = new int[r1]
                f24450b = r1
                r1 = 0
                r2 = 3
                r3 = 2
                r4 = 1
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0020 }
                int[] r1 = f24450b     // Catch:{ NoSuchFieldError -> 0x0020 }
                com.instabug.bug.model.b r5 = com.instabug.bug.model.C9278b.BUG     // Catch:{ NoSuchFieldError -> 0x0020 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0020 }
                r1[r5] = r4     // Catch:{ NoSuchFieldError -> 0x0020 }
                r0[r4] = r4
                goto L_0x0022
            L_0x0020:
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x002f }
            L_0x0022:
                int[] r1 = f24450b     // Catch:{ NoSuchFieldError -> 0x002f }
                com.instabug.bug.model.b r5 = com.instabug.bug.model.C9278b.FEEDBACK     // Catch:{ NoSuchFieldError -> 0x002f }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x002f }
                r1[r5] = r3     // Catch:{ NoSuchFieldError -> 0x002f }
                r0[r2] = r4
                goto L_0x0032
            L_0x002f:
                r1 = 4
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0032:
                int[] r1 = f24450b     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.instabug.bug.model.b r5 = com.instabug.bug.model.C9278b.NOT_AVAILABLE     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r1[r5] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
                r1 = 5
                r0[r1] = r4
                goto L_0x0043
            L_0x0040:
                r1 = 6
                r0[r1] = r4
            L_0x0043:
                com.instabug.bug.OnSdkDismissedCallback$DismissType[] r1 = com.instabug.bug.OnSdkDismissedCallback.DismissType.values()
                int r1 = r1.length
                int[] r1 = new int[r1]
                f24449a = r1
                r1 = 7
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x005e }
                int[] r1 = f24449a     // Catch:{ NoSuchFieldError -> 0x005e }
                com.instabug.bug.OnSdkDismissedCallback$DismissType r5 = com.instabug.bug.OnSdkDismissedCallback.DismissType.CANCEL     // Catch:{ NoSuchFieldError -> 0x005e }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x005e }
                r1[r5] = r4     // Catch:{ NoSuchFieldError -> 0x005e }
                r1 = 8
                r0[r1] = r4
                goto L_0x0062
            L_0x005e:
                r1 = 9
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0071 }
            L_0x0062:
                int[] r1 = f24449a     // Catch:{ NoSuchFieldError -> 0x0071 }
                com.instabug.bug.OnSdkDismissedCallback$DismissType r5 = com.instabug.bug.OnSdkDismissedCallback.DismissType.SUBMIT     // Catch:{ NoSuchFieldError -> 0x0071 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0071 }
                r1[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0071 }
                r1 = 10
                r0[r1] = r4
                goto L_0x0075
            L_0x0071:
                r1 = 11
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0075:
                int[] r1 = f24449a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.instabug.bug.OnSdkDismissedCallback$DismissType r3 = com.instabug.bug.OnSdkDismissedCallback.DismissType.ADD_ATTACHMENT     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r1[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
                r1 = 12
                r0[r1] = r4
                goto L_0x0088
            L_0x0084:
                r1 = 13
                r0[r1] = r4
            L_0x0088:
                r1 = 14
                r0[r1] = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instabug.bug.C9238a.C9243e.<clinit>():void");
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m43201a() {
            boolean[] zArr = f24451c;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(936935406372738497L, "com/instabug/bug/BugPluginWrapper$5", 15);
            f24451c = a;
            return a;
        }
    }

    /* renamed from: com.instabug.bug.a$f */
    /* compiled from: BugReportsDbHelper */
    public class C9244f {

        /* renamed from: a */
        private static transient /* synthetic */ boolean[] f24452a;

        public C9244f() {
            m43206a()[0] = true;
        }

        /* renamed from: a */
        public static synchronized long m43202a(Bug bug) throws JSONException {
            long insert;
            synchronized (C9244f.class) {
                boolean[] a = m43206a();
                SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
                a[1] = true;
                openDatabase.beginTransaction();
                try {
                    a[2] = true;
                    ContentValues contentValues = new ContentValues();
                    a[3] = true;
                    contentValues.put("id", bug.getId());
                    a[4] = true;
                    contentValues.put("message", bug.mo33517f());
                    a[5] = true;
                    contentValues.put(BugEntry.COLUMN_BUG_STATE, bug.mo33522h().name());
                    a[6] = true;
                    contentValues.put("temporary_server_token", bug.mo33505a());
                    a[7] = true;
                    contentValues.put("type", bug.mo33514e().name());
                    a[8] = true;
                    contentValues.put(BugEntry.COLUMN_CATEGORIES_LIST, bug.mo33525j().toString());
                    a[9] = true;
                    contentValues.put(BugEntry.COLUMN_VIEW_HIERARCHY, bug.mo33524i());
                    a[10] = true;
                    contentValues.put("state", bug.getState().getUri().toString());
                    a[11] = true;
                    a[12] = true;
                    for (Attachment attachment : bug.mo33519g()) {
                        a[13] = true;
                        long insert2 = AttachmentsDbHelper.insert(attachment, bug.getId());
                        if (insert2 == -1) {
                            a[14] = true;
                        } else {
                            a[15] = true;
                            attachment.setId(insert2);
                            a[16] = true;
                        }
                        a[17] = true;
                    }
                    insert = openDatabase.insert(BugEntry.TABLE_NAME, null, contentValues);
                    a[18] = true;
                    openDatabase.setTransactionSuccessful();
                    a[19] = true;
                } finally {
                    openDatabase.endTransaction();
                    a[22] = true;
                    openDatabase.close();
                    a[23] = true;
                }
            }
            return insert;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m43206a() {
            boolean[] zArr = f24452a;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(282665837151273305L, "com/instabug/bug/cache/BugReportsDbHelper", 100);
            f24452a = a;
            return a;
        }

        /* renamed from: a */
        public static List<Bug> m43203a(Context context) throws JSONException {
            Class<C9244f> cls = C9244f.class;
            boolean[] a = m43206a();
            SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
            a[24] = true;
            ArrayList arrayList = new ArrayList();
            Cursor cursor = null;
            try {
                a[25] = true;
                Cursor query = openDatabase.query(BugEntry.TABLE_NAME, null, null, null, null, null, null, null);
                a[26] = true;
                if (!query.moveToFirst()) {
                    a[27] = true;
                } else {
                    a[28] = true;
                    while (true) {
                        Bug bug = new Bug();
                        a[29] = true;
                        int columnIndex = query.getColumnIndex("id");
                        a[30] = true;
                        bug.mo33508b(query.getString(columnIndex));
                        a[31] = true;
                        int columnIndex2 = query.getColumnIndex("message");
                        a[32] = true;
                        bug.mo33513e(query.getString(columnIndex2));
                        a[33] = true;
                        int columnIndex3 = query.getColumnIndex(BugEntry.COLUMN_BUG_STATE);
                        a[34] = true;
                        bug.mo33499a((BugState) Enum.valueOf(BugState.class, query.getString(columnIndex3)));
                        a[35] = true;
                        int columnIndex4 = query.getColumnIndex("temporary_server_token");
                        a[36] = true;
                        bug.mo33510c(query.getString(columnIndex4));
                        a[37] = true;
                        int columnIndex5 = query.getColumnIndex("type");
                        a[38] = true;
                        bug.mo33501a((C9278b) Enum.valueOf(C9278b.class, query.getString(columnIndex5)));
                        a[39] = true;
                        int columnIndex6 = query.getColumnIndex(BugEntry.COLUMN_CATEGORIES_LIST);
                        a[40] = true;
                        bug.mo33507a(new JSONArray(query.getString(columnIndex6)));
                        a[41] = true;
                        int columnIndex7 = query.getColumnIndex(BugEntry.COLUMN_VIEW_HIERARCHY);
                        a[42] = true;
                        bug.mo33516f(query.getString(columnIndex7));
                        a[43] = true;
                        int columnIndex8 = query.getColumnIndex("state");
                        a[44] = true;
                        State state = new State();
                        a[45] = true;
                        Uri parse = Uri.parse(query.getString(columnIndex8));
                        a[46] = true;
                        state.setUri(parse);
                        a[47] = true;
                        DiskUtils with = DiskUtils.with(context);
                        ReadStateFromFileDiskOperation readStateFromFileDiskOperation = new ReadStateFromFileDiskOperation(parse);
                        a[48] = true;
                        ReadOperationExecutor readOperation = with.readOperation(readStateFromFileDiskOperation);
                        a[49] = true;
                        String execute = readOperation.execute();
                        a[50] = true;
                        state.fromJson(execute);
                        a[51] = true;
                        bug.mo33502a(state);
                        a[52] = true;
                        bug.mo33503a((List<Attachment>) AttachmentsDbHelper.retrieve(bug.getId(), openDatabase));
                        a[53] = true;
                        arrayList.add(bug);
                        a[54] = true;
                        if (!query.moveToNext()) {
                            break;
                        }
                        a[55] = true;
                    }
                    a[56] = true;
                }
                if (query == null) {
                    a[57] = true;
                } else {
                    a[58] = true;
                    query.close();
                    a[59] = true;
                }
                openDatabase.close();
                a[60] = true;
            } catch (IOException e) {
                a[61] = true;
                InstabugSDKLogger.m46624e(cls, e.getClass().getSimpleName(), e);
                if (cursor == null) {
                    a[62] = true;
                } else {
                    a[63] = true;
                    cursor.close();
                    a[64] = true;
                }
                openDatabase.close();
                a[65] = true;
            } catch (JSONException e2) {
                a[66] = true;
                InstabugSDKLogger.m46624e(cls, e2.getClass().getSimpleName(), e2);
                if (cursor == null) {
                    a[67] = true;
                } else {
                    a[68] = true;
                    cursor.close();
                    a[69] = true;
                }
                openDatabase.close();
                a[70] = true;
            } catch (Throwable th) {
                if (cursor == null) {
                    a[71] = true;
                } else {
                    a[72] = true;
                    cursor.close();
                    a[73] = true;
                }
                openDatabase.close();
                a[74] = true;
                throw th;
            }
            a[75] = true;
            return arrayList;
        }

        /* renamed from: a */
        public static synchronized void m43205a(String str, ContentValues contentValues) {
            synchronized (C9244f.class) {
                boolean[] a = m43206a();
                SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
                a[76] = true;
                openDatabase.beginTransaction();
                try {
                    a[77] = true;
                    String str2 = BugEntry.TABLE_NAME;
                    StringBuilder sb = new StringBuilder();
                    sb.append("id=");
                    sb.append(str);
                    openDatabase.update(str2, contentValues, sb.toString(), null);
                    a[78] = true;
                    openDatabase.setTransactionSuccessful();
                    a[79] = true;
                } finally {
                    openDatabase.endTransaction();
                    a['Q'] = true;
                    openDatabase.close();
                    a['R'] = true;
                }
            }
        }

        /* renamed from: a */
        public static synchronized void m43204a(String str) {
            synchronized (C9244f.class) {
                boolean[] a = m43206a();
                SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
                a[84] = true;
                openDatabase.beginTransaction();
                try {
                    a[85] = true;
                    String str2 = BugEntry.TABLE_NAME;
                    StringBuilder sb = new StringBuilder();
                    sb.append("id=");
                    sb.append(str);
                    openDatabase.delete(str2, sb.toString(), null);
                    a[86] = true;
                    openDatabase.setTransactionSuccessful();
                    a[87] = true;
                } finally {
                    openDatabase.endTransaction();
                    a['Y'] = true;
                    openDatabase.close();
                    a['Z'] = true;
                }
            }
        }
    }

    public C9238a() {
        m43193h()[0] = true;
    }

    /* renamed from: a */
    static /* synthetic */ void m43170a(int i, Uri uri) {
        boolean[] h = m43193h();
        m43177b(i, uri);
        h[131] = true;
    }

    /* renamed from: b */
    static /* synthetic */ void m43178b(Context context, Uri uri) {
        boolean[] h = m43193h();
        m43181c(context, uri);
        h[130] = true;
    }

    /* renamed from: c */
    static ArrayList<PluginPromptOption> m43180c(Context context) {
        boolean[] h = m43193h();
        ArrayList<PluginPromptOption> arrayList = new ArrayList<>();
        h[4] = true;
        arrayList.add(m43183d(context));
        h[5] = true;
        arrayList.add(m43186e(context));
        h[6] = true;
        return arrayList;
    }

    @C0224v0
    /* renamed from: d */
    static PluginPromptOption m43183d(Context context) {
        boolean[] h = m43193h();
        PluginPromptOption pluginPromptOption = new PluginPromptOption();
        h[7] = true;
        pluginPromptOption.setOrder(1);
        h[8] = true;
        pluginPromptOption.setInvocationMode(1);
        h[9] = true;
        pluginPromptOption.setIcon(C9231R.C9234drawable.ib_core_ic_report_bug);
        h[10] = true;
        pluginPromptOption.setTitle(m43192h(context));
        h[11] = true;
        pluginPromptOption.setOnInvocationListener(new C9240b(context));
        h[12] = true;
        return pluginPromptOption;
    }

    @C0224v0
    /* renamed from: e */
    static PluginPromptOption m43186e(Context context) {
        boolean[] h = m43193h();
        PluginPromptOption pluginPromptOption = new PluginPromptOption();
        h[13] = true;
        pluginPromptOption.setOrder(2);
        h[14] = true;
        pluginPromptOption.setInvocationMode(2);
        h[15] = true;
        pluginPromptOption.setIcon(C9231R.C9234drawable.ib_core_ic_suggest_improvment);
        h[16] = true;
        pluginPromptOption.setTitle(m43194i(context));
        h[17] = true;
        pluginPromptOption.setOnInvocationListener(new C9241c(context));
        h[18] = true;
        return pluginPromptOption;
    }

    /* renamed from: f */
    private static void m43188f() {
        boolean[] h = m43193h();
        if (InstabugCore.getOnSdkInvokedCallback() == null) {
            h[57] = true;
        } else {
            h[58] = true;
            InstabugCore.getOnSdkInvokedCallback().onSdkInvoked();
            h[59] = true;
        }
        h[60] = true;
    }

    /* renamed from: g */
    private static void m43190g() {
        boolean[] h = m43193h();
        if (C9254f.m43255h().mo33434c() == null) {
            h[82] = true;
        } else {
            h[83] = true;
            if (!C9254f.m43255h().mo33434c().mo33528m()) {
                h[84] = true;
            } else {
                h[85] = true;
                if (InstabugMemoryUtils.isLowMemory()) {
                    h[86] = true;
                } else {
                    h[87] = true;
                    Activity targetActivity = InstabugInternalTrackingDelegate.getInstance().getTargetActivity();
                    h[88] = true;
                    C9260a.m43291a(targetActivity);
                    h[89] = true;
                }
            }
        }
        h[90] = true;
    }

    @C0193h0
    /* renamed from: h */
    private static String m43192h(Context context) {
        boolean[] h = m43193h();
        Key key = Key.REPORT_BUG;
        h[93] = true;
        String localeStringResource = LocaleUtils.getLocaleStringResource(Instabug.getLocale(context), C9231R.string.instabug_str_bug_header, context);
        h[94] = true;
        String placeHolder = PlaceHolderUtils.getPlaceHolder(key, localeStringResource);
        h[95] = true;
        return placeHolder;
    }

    /* renamed from: h */
    private static /* synthetic */ boolean[] m43193h() {
        boolean[] zArr = f24440a;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-7888544678776235701L, "com/instabug/bug/BugPluginWrapper", C13959t.f40847U1);
        f24440a = a;
        return a;
    }

    @C0193h0
    /* renamed from: i */
    private static String m43194i(Context context) {
        boolean[] h = m43193h();
        Key key = Key.REPORT_FEEDBACK;
        h[96] = true;
        String localeStringResource = LocaleUtils.getLocaleStringResource(Instabug.getLocale(context), C9231R.string.instabug_str_feedback_header, context);
        h[97] = true;
        String placeHolder = PlaceHolderUtils.getPlaceHolder(key, localeStringResource);
        h[98] = true;
        return placeHolder;
    }

    /* renamed from: a */
    static /* synthetic */ void m43172a(Context context, Uri uri) {
        boolean[] h = m43193h();
        m43185d(context, uri);
        h[129] = true;
    }

    /* renamed from: b */
    static C12331g<SDKCoreEvent> m43175b(Context context) {
        boolean[] h = m43193h();
        C9239a aVar = new C9239a(context);
        h[3] = true;
        return aVar;
    }

    /* renamed from: a */
    public static void m43171a(Context context) {
        boolean[] h = m43193h();
        C9291a.m43475a(context);
        h[1] = true;
    }

    /* renamed from: b */
    private static void m43177b(int i, Uri uri) {
        boolean[] h = m43193h();
        BugPlugin bugPlugin = (BugPlugin) InstabugCore.getXPlugin(BugPlugin.class);
        if (bugPlugin == null) {
            h[23] = true;
        } else if (i == 1) {
            m43185d(bugPlugin.getAppContext(), uri);
            h[25] = true;
        } else if (i != 2) {
            h[24] = true;
        } else {
            m43181c(bugPlugin.getAppContext(), uri);
            h[26] = true;
        }
        h[27] = true;
    }

    /* renamed from: f */
    private static void m43189f(Context context) {
        boolean[] h = m43193h();
        context.startActivity(C9249c.m43227a(context));
        h[91] = true;
    }

    /* renamed from: a */
    static C12314c m43167a(C12331g<SDKCoreEvent> gVar) {
        boolean[] h = m43193h();
        C12314c subscribe = SDKCoreEventSubscriber.subscribe(gVar);
        h[2] = true;
        return subscribe;
    }

    /* renamed from: c */
    private static void m43181c(Context context, Uri uri) {
        boolean[] h = m43193h();
        m43188f();
        h[29] = true;
        InstabugSDKLogger.m46622d(C9238a.class, "Handle invocation request new feedback");
        h[30] = true;
        m43173a(uri);
        h[31] = true;
        Bug c = C9254f.m43255h().mo33434c();
        Locale locale = new Locale(C11644i.f33183R5);
        int i = C9231R.string.instabug_str_feedback_header;
        h[32] = true;
        c.mo33520g(LocaleUtils.getLocaleStringResource(locale, i, context));
        h[33] = true;
        m43190g();
        h[34] = true;
        if (ReportCategory.hasSubCategories(C9278b.FEEDBACK)) {
            h[35] = true;
            C9257g a = C9257g.m43277a();
            h[36] = true;
            String i2 = m43194i(context);
            C9278b bVar = C9278b.FEEDBACK;
            h[37] = true;
            a.mo33446a(context, i2, uri, bVar);
            h[38] = true;
        } else {
            Intent intent = InstabugDialogActivity.getIntent(context, null, null, null, true);
            h[39] = true;
            context.startActivity(intent);
            h[40] = true;
            m43191g(context);
            h[41] = true;
        }
        h[42] = true;
    }

    /* renamed from: a */
    private static void m43169a(int i) {
        boolean[] h = m43193h();
        if (C9291a.m43476r().mo33607c().isShouldTakesInitialScreenshot()) {
            h[19] = true;
            m43176b(i);
            h[20] = true;
        } else {
            m43177b(i, (Uri) null);
            h[21] = true;
        }
        h[22] = true;
    }

    /* renamed from: g */
    private static void m43191g(Context context) {
        boolean[] h = m43193h();
        context.startActivity(C9249c.m43230b(context));
        h[92] = true;
    }

    /* renamed from: d */
    private static void m43185d(Context context, Uri uri) {
        boolean[] h = m43193h();
        m43188f();
        h[43] = true;
        InstabugSDKLogger.m46622d(C9238a.class, "Handle invocation request new bug");
        h[44] = true;
        m43173a(uri);
        h[45] = true;
        Bug c = C9254f.m43255h().mo33434c();
        Locale locale = new Locale(C11644i.f33183R5);
        int i = C9231R.string.instabug_str_bug_header;
        h[46] = true;
        c.mo33520g(LocaleUtils.getLocaleStringResource(locale, i, context));
        h[47] = true;
        m43190g();
        h[48] = true;
        if (ReportCategory.hasSubCategories(C9278b.BUG)) {
            h[49] = true;
            C9257g a = C9257g.m43277a();
            h[50] = true;
            String h2 = m43192h(context);
            C9278b bVar = C9278b.BUG;
            h[51] = true;
            a.mo33446a(context, h2, uri, bVar);
            h[52] = true;
        } else {
            Intent intent = InstabugDialogActivity.getIntent(context, null, null, null, true);
            h[53] = true;
            context.startActivity(intent);
            h[54] = true;
            m43189f(context);
            h[55] = true;
        }
        h[56] = true;
    }

    /* renamed from: e */
    static void m43187e() {
        boolean[] h = m43193h();
        if (!m43179b()) {
            h[119] = true;
        } else {
            h[120] = true;
            m43169a(1);
            h[121] = true;
        }
        h[122] = true;
    }

    /* renamed from: a */
    private static void m43173a(@C0195i0 Uri uri) {
        boolean[] h = m43193h();
        BugPlugin bugPlugin = (BugPlugin) InstabugCore.getXPlugin(BugPlugin.class);
        if (bugPlugin == null) {
            h[61] = true;
        } else {
            h[62] = true;
            C9254f.m43255h().mo33426a(bugPlugin.getAppContext());
            h[63] = true;
        }
        if (uri == null) {
            h[64] = true;
        } else {
            h[65] = true;
            AttachmentsTypesParams c = C9291a.m43476r().mo33607c();
            h[66] = true;
            if (!c.isShouldTakesInitialScreenshot()) {
                h[67] = true;
            } else {
                h[68] = true;
                Bug c2 = C9254f.m43255h().mo33434c();
                h[69] = true;
                c2.mo33512d(uri.getPath());
                h[70] = true;
            }
        }
        if (!C9245a.m43207a().isEnabled()) {
            h[71] = true;
        } else {
            h[72] = true;
            Uri autoScreenRecordingFileUri = C9245a.m43207a().getAutoScreenRecordingFileUri();
            h[73] = true;
            C9245a.m43207a().clear();
            if (autoScreenRecordingFileUri == null) {
                h[74] = true;
            } else {
                h[75] = true;
                Attachment attachment = new Attachment();
                h[76] = true;
                attachment.setName(autoScreenRecordingFileUri.getLastPathSegment());
                h[77] = true;
                attachment.setLocalPath(autoScreenRecordingFileUri.getPath());
                h[78] = true;
                attachment.setType(Type.AUTO_SCREEN_RECORDING);
                h[79] = true;
                C9254f.m43255h().mo33434c().mo33519g().add(attachment);
                h[80] = true;
            }
        }
        h[81] = true;
    }

    /* renamed from: b */
    private static void m43176b(int i) {
        boolean[] h = m43193h();
        InitialScreenshotHelper.captureScreenshot(new C9242d(i));
        h[28] = true;
    }

    /* renamed from: b */
    public static boolean m43179b() {
        boolean z;
        boolean[] h = m43193h();
        BugPlugin bugPlugin = (BugPlugin) InstabugCore.getXPlugin(BugPlugin.class);
        h[105] = true;
        if (bugPlugin == null) {
            h[106] = true;
        } else if (!bugPlugin.isAppContextAvailable()) {
            h[107] = true;
        } else if (!m43182c()) {
            h[108] = true;
        } else {
            h[109] = true;
            z = true;
            h[111] = true;
            return z;
        }
        z = false;
        h[110] = true;
        h[111] = true;
        return z;
    }

    @C0224v0
    /* renamed from: c */
    static boolean m43182c() {
        boolean z;
        boolean[] h = m43193h();
        if (InstabugCore.getFeatureState(Feature.INSTABUG) == Feature.State.ENABLED) {
            h[112] = true;
            z = true;
        } else {
            z = false;
            h[113] = true;
        }
        h[114] = true;
        return z;
    }

    /* renamed from: d */
    static void m43184d() {
        boolean[] h = m43193h();
        if (!m43179b()) {
            h[115] = true;
        } else {
            h[116] = true;
            m43169a(2);
            h[117] = true;
        }
        h[118] = true;
    }

    /* renamed from: a */
    static void m43174a(C12314c cVar) {
        boolean[] h = m43193h();
        if (cVar == null) {
            h[99] = true;
        } else if (cVar.mo41878d()) {
            h[100] = true;
        } else {
            h[101] = true;
            cVar.dispose();
            h[102] = true;
        }
        h[103] = true;
    }

    /* renamed from: a */
    public static void m43168a() {
        m43193h()[104] = true;
    }

    /* renamed from: a */
    public static OnSdkDismissCallback.DismissType m43165a(DismissType dismissType) {
        boolean[] h = m43193h();
        int i = C9243e.f24449a[dismissType.ordinal()];
        if (i == 2) {
            OnSdkDismissCallback.DismissType dismissType2 = OnSdkDismissCallback.DismissType.SUBMIT;
            h[124] = true;
            return dismissType2;
        } else if (i != 3) {
            OnSdkDismissCallback.DismissType dismissType3 = OnSdkDismissCallback.DismissType.CANCEL;
            h[123] = true;
            return dismissType3;
        } else {
            OnSdkDismissCallback.DismissType dismissType4 = OnSdkDismissCallback.DismissType.ADD_ATTACHMENT;
            h[125] = true;
            return dismissType4;
        }
    }

    /* renamed from: a */
    public static ReportType m43166a(C9278b bVar) {
        boolean[] h = m43193h();
        int i = C9243e.f24450b[bVar.ordinal()];
        if (i == 2) {
            ReportType reportType = ReportType.FEEDBACK;
            h[127] = true;
            return reportType;
        } else if (i != 3) {
            ReportType reportType2 = ReportType.BUG;
            h[126] = true;
            return reportType2;
        } else {
            ReportType reportType3 = ReportType.OTHER;
            h[128] = true;
            return reportType3;
        }
    }
}
