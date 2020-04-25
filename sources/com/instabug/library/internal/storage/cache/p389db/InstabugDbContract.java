package com.instabug.library.internal.storage.cache.p389db;

import android.provider.BaseColumns;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.internal.storage.cache.db.InstabugDbContract */
public class InstabugDbContract {
    private static transient /* synthetic */ boolean[] $jacocoData = null;
    private static final String COMMA_SEP = ",";
    private static final String INTEGER_TYPE = " INTEGER";
    private static final String TEXT_TYPE = " TEXT";

    /* renamed from: com.instabug.library.internal.storage.cache.db.InstabugDbContract$AttachmentEntry */
    public static class AttachmentEntry implements BaseColumns {
        private static transient /* synthetic */ boolean[] $jacocoData = null;
        public static final String COLUMN_ATTACHMENT_STATE = "attachment_state";
        public static final String COLUMN_DURATION = "duration";
        public static final String COLUMN_LOCALE_PATH = "local_path";
        public static final String COLUMN_NAME = "name";
        public static final String COLUMN_REPORT_ID = "report_id";
        public static final String COLUMN_TYPE = "type";
        public static final String COLUMN_URL = "url";
        public static final String COLUMN_VIDEO_ENCODED = "video_encoded";
        public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS attachments ( _id INTEGER PRIMARY KEY, name TEXT, local_path TEXT, url TEXT, type TEXT, attachment_state TEXT, video_encoded INTEGER, duration TEXT, report_id TEXT )";
        public static final String DROP_TABLE = "DROP TABLE IF EXISTS attachments";
        public static final String TABLE_NAME = "attachments";

        private static /* synthetic */ boolean[] $jacocoInit() {
            boolean[] zArr = $jacocoData;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-4956307407267723597L, "com/instabug/library/internal/storage/cache/db/InstabugDbContract$AttachmentEntry", 1);
            $jacocoData = a;
            return a;
        }

        public AttachmentEntry() {
            $jacocoInit()[0] = true;
        }
    }

    /* renamed from: com.instabug.library.internal.storage.cache.db.InstabugDbContract$BugEntry */
    public static class BugEntry implements BaseColumns {
        private static transient /* synthetic */ boolean[] $jacocoData = null;
        public static final String COLUMN_BUG_STATE = "bug_state";
        public static final String COLUMN_CATEGORIES_LIST = "categories_list";
        public static final String COLUMN_ID = "id";
        public static final String COLUMN_MESSAGE = "message";
        public static final String COLUMN_STATE = "state";
        public static final String COLUMN_TEMPORARY_SERVER_TOKEN = "temporary_server_token";
        public static final String COLUMN_TYPE = "type";
        public static final String COLUMN_VIEW_HIERARCHY = "view_hierarchy";
        public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS bugs_table ( id TEXT,temporary_server_token TEXT,type TEXT,message TEXT,state TEXT,bug_state TEXT,view_hierarchy TEXT,categories_list TEXT )";
        public static final String DROP_TABLE = "DROP TABLE IF EXISTS bugs_table";
        public static final String TABLE_NAME = "bugs_table";

        private static /* synthetic */ boolean[] $jacocoInit() {
            boolean[] zArr = $jacocoData;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(9071473867069731161L, "com/instabug/library/internal/storage/cache/db/InstabugDbContract$BugEntry", 1);
            $jacocoData = a;
            return a;
        }

        public BugEntry() {
            $jacocoInit()[0] = true;
        }
    }

    /* renamed from: com.instabug.library.internal.storage.cache.db.InstabugDbContract$CrashEntry */
    public static class CrashEntry implements BaseColumns {
        private static transient /* synthetic */ boolean[] $jacocoData = null;
        public static final String COLUMN_CRASH_MESSAGE = "crash_message";
        public static final String COLUMN_CRASH_STATE = "crash_state";
        public static final String COLUMN_HANDLED = "handled";
        public static final String COLUMN_ID = "crash_id";
        public static final String COLUMN_STATE = "state";
        public static final String COLUMN_TEMPORARY_SERVER_TOKEN = "temporary_server_token";
        public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS crashes_table ( crash_id TEXT, temporary_server_token TEXT, crash_message TEXT, crash_state TEXT, state TEXT, handled INTEGER )";
        public static final String DROP_TABLE = "DROP TABLE IF EXISTS crashes_table";
        public static final String TABLE_NAME = "crashes_table";

        private static /* synthetic */ boolean[] $jacocoInit() {
            boolean[] zArr = $jacocoData;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-4455620163532804145L, "com/instabug/library/internal/storage/cache/db/InstabugDbContract$CrashEntry", 1);
            $jacocoData = a;
            return a;
        }

        public CrashEntry() {
            $jacocoInit()[0] = true;
        }
    }

    /* renamed from: com.instabug.library.internal.storage.cache.db.InstabugDbContract$FeatureRequestEntry */
    public static class FeatureRequestEntry implements BaseColumns {
        private static transient /* synthetic */ boolean[] $jacocoData = null;
        public static final String COLUMN_COLOR_CODE = "color_code";
        public static final String COLUMN_COMMENTS_COUNT = "comments_count";
        public static final String COLUMN_CREATOR_NAME = "creator_name";
        public static final String COLUMN_DATE = "date";
        public static final String COLUMN_DESCRIPTION = "description";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_IS_LIKED = "liked";
        public static final String COLUMN_LIKES_COUNT = "likes_count";
        public static final String COLUMN_STATUS = "status";
        public static final String COLUMN_TITLE = "title";
        public static final String COLUMN_VOTE_UPDATED = "ib_user_vote_status";
        public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS feature_requests_table ( _id INTEGER PRIMARY KEY,title TEXT,description TEXT,status TEXT,likes_count INTEGER,comments_count INTEGER,liked INTEGER,date INTEGER,color_code TEXT,creator_name TEXT,ib_user_vote_status TEXT )";
        public static final String DROP_TABLE = "DROP TABLE IF EXISTS feature_requests_table";
        public static final String TABLE_NAME = "feature_requests_table";

        private static /* synthetic */ boolean[] $jacocoInit() {
            boolean[] zArr = $jacocoData;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-2658569903564309713L, "com/instabug/library/internal/storage/cache/db/InstabugDbContract$FeatureRequestEntry", 1);
            $jacocoData = a;
            return a;
        }

        public FeatureRequestEntry() {
            $jacocoInit()[0] = true;
        }
    }

    /* renamed from: com.instabug.library.internal.storage.cache.db.InstabugDbContract$InstabugLogEntry */
    public static class InstabugLogEntry implements BaseColumns {
        private static transient /* synthetic */ boolean[] $jacocoData = null;
        public static final String COLUMN_LOG_DATE = "log_date";
        public static final String COLUMN_LOG_LEVEL = "log_level";
        public static final String COLUMN_LOG_MESSAGE = "log_message";
        public static final String DELETE_ALL_EXCEPT_THE_LATEST_1000_ENTRY = "DELETE FROM instabug_logs WHERE log_date IN (SELECT log_date FROM instabug_logs ORDER BY log_date DESC LIMIT -1 OFFSET 1000)";
        public static final String DELETE_THE_OLDEST_INSERTED_ENTRY = "DELETE FROM instabug_logs WHERE log_date = (SELECT MAX(log_date) FROM instabug_logs);";
        public static final String DROP_QUERY_INSTABUG_LOG = "DROP TABLE IF EXISTS instabug_logs";
        public static final int INSTABUG_LOG_LIMIT = 1000;
        public static final String SELECT_LIMITED_INSTABUG_LOG = "SELECT * FROM instabug_logs ORDER  BY log_date DESC LIMIT 1000";
        public static final String SQL_CREATE_INSTABUG_LOGS = "CREATE TABLE IF NOT EXISTS instabug_logs (log_message TEXT,log_level TEXT,log_date TEXT )";
        public static final String TABLE_NAME = "instabug_logs";
        public static final String TRIM_INSTABUG_LOG_SQL_QUERY = "DELETE FROM instabug_logs WHERE log_date NOT IN ( SELECT log_date FROM instabug_logs WHERE log_date ORDER BY log_date DESC LIMIT 1000 )";

        private static /* synthetic */ boolean[] $jacocoInit() {
            boolean[] zArr = $jacocoData;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-6531265521641965127L, "com/instabug/library/internal/storage/cache/db/InstabugDbContract$InstabugLogEntry", 1);
            $jacocoData = a;
            return a;
        }

        public InstabugLogEntry() {
            $jacocoInit()[0] = true;
        }
    }

    /* renamed from: com.instabug.library.internal.storage.cache.db.InstabugDbContract$NetworkLogEntry */
    public static class NetworkLogEntry implements BaseColumns {
        private static transient /* synthetic */ boolean[] $jacocoData = null;
        public static final String COLUMN_DATE = "date";
        public static final String COLUMN_HEADERS = "headers";
        public static final String COLUMN_METHOD = "method";
        public static final String COLUMN_NETWORK_TIME = "response_time";
        public static final String COLUMN_REQUEST = "request";
        public static final String COLUMN_RESPONSE = "response";
        public static final String COLUMN_RESPONSE_CODE = "status";
        public static final String COLUMN_RESPONSE_HEADERS = "response_headers";
        public static final String COLUMN_URL = "url";
        public static final String DELETE_ALL_EXCEPT_THE_LATEST_100_ENTRY = "DELETE FROM network_logs WHERE date IN (SELECT date FROM network_logs ORDER BY date DESC LIMIT -1 OFFSET 100)";
        public static final int NETWORK_LOG_LIMIT = 100;
        public static final String SQL_CREATE_NETWORK_LOGS = "CREATE TABLE network_logs (_id INTEGER PRIMARY KEY,url TEXT,request TEXT,method TEXT,response TEXT,status INTEGER,headers TEXT,response_headers TEXT,date TEXT,response_time INTEGER )";
        public static final String SQL_DELETE_ENTRIES = "DROP TABLE IF EXISTS network_logs";
        public static final String TABLE_NAME = "network_logs";

        private static /* synthetic */ boolean[] $jacocoInit() {
            boolean[] zArr = $jacocoData;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(1402419230737224827L, "com/instabug/library/internal/storage/cache/db/InstabugDbContract$NetworkLogEntry", 1);
            $jacocoData = a;
            return a;
        }

        public NetworkLogEntry() {
            $jacocoInit()[0] = true;
        }
    }

    /* renamed from: com.instabug.library.internal.storage.cache.db.InstabugDbContract$SDKApiEntry */
    public static class SDKApiEntry implements BaseColumns {
        private static transient /* synthetic */ boolean[] $jacocoData = null;
        public static final String COLUMN_API_NAME = "api_name";
        public static final String COLUMN_COUNT = "count";
        public static final String COLUMN_IS_DEPRECATED = "is_deprecated";
        public static final String COLUMN_PARAMETERS = "parameters";
        public static final String COLUMN_TIME_STAMP = "time_stamp";
        public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS sdk_api ( time_stamp TEXT, api_name TEXT, count INTEGER, is_deprecated TEXT, parameters TEXT )";
        public static final String DROP_TABLE = "DROP TABLE IF EXISTS sdk_api";
        public static final String TABLE_NAME = "sdk_api";

        private static /* synthetic */ boolean[] $jacocoInit() {
            boolean[] zArr = $jacocoData;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-3667083674696740349L, "com/instabug/library/internal/storage/cache/db/InstabugDbContract$SDKApiEntry", 1);
            $jacocoData = a;
            return a;
        }

        public SDKApiEntry() {
            $jacocoInit()[0] = true;
        }
    }

    /* renamed from: com.instabug.library.internal.storage.cache.db.InstabugDbContract$SDKEventEntry */
    public static class SDKEventEntry implements BaseColumns {
        private static transient /* synthetic */ boolean[] $jacocoData = null;
        public static final String COLUMN_EVENT_IDENTIFIER = "event_identifier";
        public static final String COLUMN_EXTRA_ATTRIBUTES = "extra_attributes";
        public static final String COLUMN_TIME_STAMP = "time_stamp";
        public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS sdk_event ( event_identifier TEXT,time_stamp TEXT,extra_attributes TEXT )";
        public static final String DROP_TABLE = "DROP TABLE IF EXISTS sdk_event";
        public static final String TABLE_NAME = "sdk_event";

        private static /* synthetic */ boolean[] $jacocoInit() {
            boolean[] zArr = $jacocoData;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-4167481134024470224L, "com/instabug/library/internal/storage/cache/db/InstabugDbContract$SDKEventEntry", 1);
            $jacocoData = a;
            return a;
        }

        public SDKEventEntry() {
            $jacocoInit()[0] = true;
        }
    }

    /* renamed from: com.instabug.library.internal.storage.cache.db.InstabugDbContract$SessionEntry */
    public static class SessionEntry implements BaseColumns {
        private static transient /* synthetic */ boolean[] $jacocoData = null;
        public static final String COLUMN_DURATION = "duration";
        public static final String COLUMN_ID = "session_id";
        public static final String COLUMN_STARTED_AT = "started_at";
        public static final String COLUMN_USER_ATTRIBUTES = "user_events";
        public static final String COLUMN_USER_EMAIL = "user_email";
        public static final String COLUMN_USER_EVENTS = "user_attributes";
        public static final String COLUMN_USER_NAME = "user_name";
        public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS session_table ( session_id INTEGER, started_at INTEGER, duration INTEGER, user_events TEXT, user_attributes TEXT, user_email TEXT, user_name TEXT )";
        public static final String DROP_TABLE = "DROP TABLE IF EXISTS session_table";
        public static final String TABLE_NAME = "session_table";

        private static /* synthetic */ boolean[] $jacocoInit() {
            boolean[] zArr = $jacocoData;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-7317281364887781633L, "com/instabug/library/internal/storage/cache/db/InstabugDbContract$SessionEntry", 1);
            $jacocoData = a;
            return a;
        }

        public SessionEntry() {
            $jacocoInit()[0] = true;
        }
    }

    /* renamed from: com.instabug.library.internal.storage.cache.db.InstabugDbContract$UserEventEntry */
    public static class UserEventEntry implements BaseColumns {
        private static transient /* synthetic */ boolean[] $jacocoData = null;
        public static final String COLUMN_EVENT_IDENTIFIER = "event_identifier";
        public static final String COLUMN_EVENT_LOGGING_COUNT = "event_logging_count";
        public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS user_events_logs ( event_identifier TEXT,event_logging_count INTEGER )";
        public static final String DROP_TABLE = "DROP TABLE IF EXISTS user_events_logs";
        public static final String TABLE_NAME = "user_events_logs";

        private static /* synthetic */ boolean[] $jacocoInit() {
            boolean[] zArr = $jacocoData;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(4238202301889077457L, "com/instabug/library/internal/storage/cache/db/InstabugDbContract$UserEventEntry", 1);
            $jacocoData = a;
            return a;
        }

        public UserEventEntry() {
            $jacocoInit()[0] = true;
        }
    }

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(6818797269104200620L, "com/instabug/library/internal/storage/cache/db/InstabugDbContract", 1);
        $jacocoData = a;
        return a;
    }

    private InstabugDbContract() {
        $jacocoInit()[0] = true;
    }
}
