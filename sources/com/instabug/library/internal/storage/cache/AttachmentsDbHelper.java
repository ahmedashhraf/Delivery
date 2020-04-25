package com.instabug.library.internal.storage.cache;

import android.content.ContentValues;
import android.database.Cursor;
import com.instabug.library.internal.storage.cache.p389db.DatabaseManager;
import com.instabug.library.internal.storage.cache.p389db.InstabugDbContract.AttachmentEntry;
import com.instabug.library.internal.storage.cache.p389db.InstabugDbContract.FeatureRequestEntry;
import com.instabug.library.internal.storage.cache.p389db.SQLiteDatabaseWrapper;
import com.instabug.library.model.Attachment;
import com.instabug.library.model.Attachment.AttachmentState;
import com.instabug.library.model.Attachment.Type;
import java.util.ArrayList;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class AttachmentsDbHelper {
    private static transient /* synthetic */ boolean[] $jacocoData;
    private static final String[] ATTACHMENT_COLUMN = {"attachments._id", "name", AttachmentEntry.COLUMN_LOCALE_PATH, "url", "type", AttachmentEntry.COLUMN_ATTACHMENT_STATE, AttachmentEntry.COLUMN_VIDEO_ENCODED, "duration", AttachmentEntry.COLUMN_REPORT_ID};

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-6095999418841921059L, "com/instabug/library/internal/storage/cache/AttachmentsDbHelper", 122);
        $jacocoData = a;
        return a;
    }

    static {
        boolean[] $jacocoInit = $jacocoInit();
        $jacocoInit[121] = true;
    }

    public AttachmentsDbHelper() {
        $jacocoInit()[0] = true;
    }

    public static synchronized void delete(long j) {
        synchronized (AttachmentsDbHelper.class) {
            boolean[] $jacocoInit = $jacocoInit();
            SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
            $jacocoInit[97] = true;
            openDatabase.beginTransaction();
            try {
                $jacocoInit[98] = true;
                String str = AttachmentEntry.TABLE_NAME;
                StringBuilder sb = new StringBuilder();
                sb.append("_id=");
                sb.append(j);
                openDatabase.delete(str, sb.toString(), null);
                $jacocoInit[99] = true;
                openDatabase.setTransactionSuccessful();
                $jacocoInit[100] = true;
            } finally {
                openDatabase.endTransaction();
                $jacocoInit['f'] = true;
                openDatabase.close();
                $jacocoInit['g'] = true;
            }
        }
    }

    public static synchronized void deleteAll() {
        synchronized (AttachmentsDbHelper.class) {
            boolean[] $jacocoInit = $jacocoInit();
            SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
            $jacocoInit[113] = true;
            openDatabase.beginTransaction();
            try {
                $jacocoInit[114] = true;
                openDatabase.delete(AttachmentEntry.TABLE_NAME, null, null);
                $jacocoInit[115] = true;
                openDatabase.setTransactionSuccessful();
                $jacocoInit[116] = true;
            } finally {
                openDatabase.endTransaction();
                $jacocoInit['v'] = true;
                openDatabase.close();
                $jacocoInit['w'] = true;
            }
        }
    }

    public static synchronized long insert(Attachment attachment, String str) {
        long insert;
        synchronized (AttachmentsDbHelper.class) {
            boolean[] $jacocoInit = $jacocoInit();
            SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
            $jacocoInit[1] = true;
            openDatabase.beginTransaction();
            try {
                $jacocoInit[2] = true;
                ContentValues contentValues = new ContentValues();
                $jacocoInit[3] = true;
                contentValues.put("url", attachment.getUrl());
                $jacocoInit[4] = true;
                contentValues.put(AttachmentEntry.COLUMN_ATTACHMENT_STATE, attachment.getAttachmentState().name());
                $jacocoInit[5] = true;
                contentValues.put("duration", attachment.getDuration());
                $jacocoInit[6] = true;
                contentValues.put(AttachmentEntry.COLUMN_LOCALE_PATH, attachment.getLocalPath());
                $jacocoInit[7] = true;
                contentValues.put("name", attachment.getName());
                $jacocoInit[8] = true;
                contentValues.put("type", attachment.getType().name());
                $jacocoInit[9] = true;
                contentValues.put(AttachmentEntry.COLUMN_VIDEO_ENCODED, Boolean.valueOf(attachment.isVideoEncoded()));
                $jacocoInit[10] = true;
                contentValues.put(AttachmentEntry.COLUMN_REPORT_ID, str);
                $jacocoInit[11] = true;
                insert = openDatabase.insert(AttachmentEntry.TABLE_NAME, null, contentValues);
                $jacocoInit[12] = true;
                openDatabase.setTransactionSuccessful();
                $jacocoInit[13] = true;
            } finally {
                openDatabase.endTransaction();
                $jacocoInit[16] = true;
                openDatabase.close();
                $jacocoInit[17] = true;
            }
        }
        return insert;
    }

    public static ArrayList<Attachment> retrieve(String str, SQLiteDatabaseWrapper sQLiteDatabaseWrapper) {
        boolean z;
        boolean[] $jacocoInit = $jacocoInit();
        String str2 = "name";
        String str3 = AttachmentEntry.COLUMN_LOCALE_PATH;
        String str4 = "url";
        String str5 = "type";
        String str6 = AttachmentEntry.COLUMN_ATTACHMENT_STATE;
        String str7 = AttachmentEntry.COLUMN_VIDEO_ENCODED;
        String str8 = "duration";
        String[] strArr = {"attachments._id", str2, str3, str4, str5, str6, str7, str8, AttachmentEntry.COLUMN_REPORT_ID};
        String[] strArr2 = {str};
        $jacocoInit[18] = true;
        String str9 = str8;
        String str10 = str7;
        String str11 = str6;
        Cursor query = sQLiteDatabaseWrapper.query(AttachmentEntry.TABLE_NAME, strArr, "report_id=?", strArr2, null, null, null, null);
        $jacocoInit[19] = true;
        ArrayList<Attachment> arrayList = new ArrayList<>();
        $jacocoInit[20] = true;
        if (!query.moveToFirst()) {
            $jacocoInit[21] = true;
        } else {
            $jacocoInit[22] = true;
            while (true) {
                Attachment attachment = new Attachment();
                $jacocoInit[23] = true;
                int columnIndex = query.getColumnIndex(FeatureRequestEntry.COLUMN_ID);
                $jacocoInit[24] = true;
                attachment.setId((long) query.getInt(columnIndex));
                $jacocoInit[25] = true;
                int columnIndex2 = query.getColumnIndex(str2);
                $jacocoInit[26] = true;
                attachment.setName(query.getString(columnIndex2));
                $jacocoInit[27] = true;
                String str12 = str11;
                int columnIndex3 = query.getColumnIndex(str12);
                $jacocoInit[28] = true;
                attachment.setAttachmentState((AttachmentState) Enum.valueOf(AttachmentState.class, query.getString(columnIndex3)));
                $jacocoInit[29] = true;
                int columnIndex4 = query.getColumnIndex(str9);
                $jacocoInit[30] = true;
                attachment.setDuration(query.getString(columnIndex4));
                $jacocoInit[31] = true;
                int columnIndex5 = query.getColumnIndex(str4);
                $jacocoInit[32] = true;
                attachment.setUrl(query.getString(columnIndex5));
                $jacocoInit[33] = true;
                int columnIndex6 = query.getColumnIndex(str3);
                $jacocoInit[34] = true;
                attachment.setLocalPath(query.getString(columnIndex6));
                $jacocoInit[35] = true;
                String str13 = str10;
                int columnIndex7 = query.getColumnIndex(str13);
                $jacocoInit[36] = true;
                if (query.getInt(columnIndex7) != 0) {
                    $jacocoInit[37] = true;
                    z = true;
                } else {
                    $jacocoInit[38] = true;
                    z = false;
                }
                attachment.setVideoEncoded(z);
                $jacocoInit[39] = true;
                int columnIndex8 = query.getColumnIndex(str5);
                $jacocoInit[40] = true;
                attachment.setType((Type) Enum.valueOf(Type.class, query.getString(columnIndex8)));
                $jacocoInit[41] = true;
                arrayList.add(attachment);
                $jacocoInit[42] = true;
                if (!query.moveToNext()) {
                    break;
                }
                $jacocoInit[43] = true;
                str11 = str12;
                str10 = str13;
            }
            $jacocoInit[44] = true;
        }
        query.close();
        $jacocoInit[45] = true;
        return arrayList;
    }

    public static synchronized void update(long j, ContentValues contentValues) {
        synchronized (AttachmentsDbHelper.class) {
            boolean[] $jacocoInit = $jacocoInit();
            SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
            $jacocoInit[81] = true;
            openDatabase.beginTransaction();
            try {
                $jacocoInit[82] = true;
                String str = AttachmentEntry.TABLE_NAME;
                StringBuilder sb = new StringBuilder();
                sb.append("_id=");
                sb.append(j);
                openDatabase.update(str, contentValues, sb.toString(), null);
                $jacocoInit[83] = true;
                openDatabase.setTransactionSuccessful();
                $jacocoInit[84] = true;
            } finally {
                openDatabase.endTransaction();
                $jacocoInit['V'] = true;
                openDatabase.close();
                $jacocoInit['W'] = true;
            }
        }
    }

    public static synchronized void delete(String str, String str2) {
        synchronized (AttachmentsDbHelper.class) {
            boolean[] $jacocoInit = $jacocoInit();
            SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
            $jacocoInit[105] = true;
            openDatabase.beginTransaction();
            try {
                $jacocoInit[106] = true;
                String str3 = AttachmentEntry.TABLE_NAME;
                StringBuilder sb = new StringBuilder();
                sb.append("name='");
                sb.append(str);
                sb.append("' and ");
                sb.append(AttachmentEntry.COLUMN_REPORT_ID);
                sb.append("='");
                sb.append(str2);
                sb.append("'");
                openDatabase.delete(str3, sb.toString(), null);
                $jacocoInit[107] = true;
                openDatabase.setTransactionSuccessful();
                $jacocoInit[108] = true;
            } finally {
                openDatabase.endTransaction();
                $jacocoInit['n'] = true;
                openDatabase.close();
                $jacocoInit['o'] = true;
            }
        }
    }

    public static synchronized void update(String str, String str2, ContentValues contentValues) {
        synchronized (AttachmentsDbHelper.class) {
            boolean[] $jacocoInit = $jacocoInit();
            SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
            $jacocoInit[89] = true;
            openDatabase.beginTransaction();
            try {
                $jacocoInit[90] = true;
                String str3 = AttachmentEntry.TABLE_NAME;
                StringBuilder sb = new StringBuilder();
                sb.append("name='");
                sb.append(str);
                sb.append("' and ");
                sb.append(AttachmentEntry.COLUMN_REPORT_ID);
                sb.append("='");
                sb.append(str2);
                sb.append("'");
                openDatabase.update(str3, contentValues, sb.toString(), null);
                $jacocoInit[91] = true;
                openDatabase.setTransactionSuccessful();
                $jacocoInit[92] = true;
            } finally {
                openDatabase.endTransaction();
                $jacocoInit['^'] = true;
                openDatabase.close();
                $jacocoInit['_'] = true;
            }
        }
    }

    public static ArrayList<Attachment> retrieve(String str) {
        boolean z;
        boolean[] $jacocoInit = $jacocoInit();
        SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
        $jacocoInit[46] = true;
        openDatabase.beginTransaction();
        try {
            $jacocoInit[47] = true;
            String[] strArr = {str};
            $jacocoInit[48] = true;
            Cursor query = openDatabase.query(AttachmentEntry.TABLE_NAME, ATTACHMENT_COLUMN, "report_id=?", strArr, null, null, null, null);
            $jacocoInit[49] = true;
            ArrayList<Attachment> arrayList = new ArrayList<>();
            $jacocoInit[50] = true;
            if (!query.moveToFirst()) {
                $jacocoInit[51] = true;
            } else {
                $jacocoInit[52] = true;
                while (true) {
                    Attachment attachment = new Attachment();
                    $jacocoInit[53] = true;
                    int columnIndex = query.getColumnIndex(FeatureRequestEntry.COLUMN_ID);
                    $jacocoInit[54] = true;
                    attachment.setId((long) query.getInt(columnIndex));
                    $jacocoInit[55] = true;
                    int columnIndex2 = query.getColumnIndex("name");
                    $jacocoInit[56] = true;
                    attachment.setName(query.getString(columnIndex2));
                    $jacocoInit[57] = true;
                    int columnIndex3 = query.getColumnIndex(AttachmentEntry.COLUMN_ATTACHMENT_STATE);
                    $jacocoInit[58] = true;
                    attachment.setAttachmentState((AttachmentState) Enum.valueOf(AttachmentState.class, query.getString(columnIndex3)));
                    $jacocoInit[59] = true;
                    int columnIndex4 = query.getColumnIndex("duration");
                    $jacocoInit[60] = true;
                    attachment.setDuration(query.getString(columnIndex4));
                    $jacocoInit[61] = true;
                    int columnIndex5 = query.getColumnIndex("url");
                    $jacocoInit[62] = true;
                    attachment.setUrl(query.getString(columnIndex5));
                    $jacocoInit[63] = true;
                    int columnIndex6 = query.getColumnIndex(AttachmentEntry.COLUMN_LOCALE_PATH);
                    $jacocoInit[64] = true;
                    attachment.setLocalPath(query.getString(columnIndex6));
                    $jacocoInit[65] = true;
                    int columnIndex7 = query.getColumnIndex(AttachmentEntry.COLUMN_VIDEO_ENCODED);
                    $jacocoInit[66] = true;
                    if (query.getInt(columnIndex7) != 0) {
                        $jacocoInit[67] = true;
                        z = true;
                    } else {
                        $jacocoInit[68] = true;
                        z = false;
                    }
                    attachment.setVideoEncoded(z);
                    $jacocoInit[69] = true;
                    int columnIndex8 = query.getColumnIndex("type");
                    $jacocoInit[70] = true;
                    attachment.setType((Type) Enum.valueOf(Type.class, query.getString(columnIndex8)));
                    $jacocoInit[71] = true;
                    arrayList.add(attachment);
                    $jacocoInit[72] = true;
                    if (!query.moveToNext()) {
                        break;
                    }
                    $jacocoInit[73] = true;
                }
                $jacocoInit[74] = true;
            }
            query.close();
            $jacocoInit[75] = true;
            openDatabase.setTransactionSuccessful();
            $jacocoInit[76] = true;
            return arrayList;
        } finally {
            openDatabase.endTransaction();
            $jacocoInit['O'] = true;
            openDatabase.close();
            $jacocoInit['P'] = true;
        }
    }
}
