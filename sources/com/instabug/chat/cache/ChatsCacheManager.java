package com.instabug.chat.cache;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import com.facebook.appevents.AppEventsConstants;
import com.instabug.chat.model.Attachment;
import com.instabug.chat.model.Chat;
import com.instabug.chat.model.Chat.C9416b;
import com.instabug.chat.model.Chat.ChatState;
import com.instabug.chat.model.Message;
import com.instabug.chat.model.Message.C9418a;
import com.instabug.chat.model.Message.MessageState;
import com.instabug.library.internal.storage.DiskUtils;
import com.instabug.library.internal.storage.cache.AssetsCacheManager;
import com.instabug.library.internal.storage.cache.C9840b;
import com.instabug.library.internal.storage.cache.CacheManager;
import com.instabug.library.internal.storage.cache.CacheManager.KeyExtractor;
import com.instabug.library.internal.storage.cache.InMemoryCache;
import com.instabug.library.model.AssetEntity;
import com.instabug.library.model.AssetEntity.AssetType;
import com.instabug.library.util.InstabugSDKLogger;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.jcodec.codecs.mjpeg.JpegConst;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class ChatsCacheManager {
    private static transient /* synthetic */ boolean[] $jacocoData = null;
    public static final String CHATS_DISK_CACHE_FILE_NAME = "/chats.cache";
    public static final String CHATS_DISK_CACHE_KEY = "chats_disk_cache";
    public static final String CHATS_MEMORY_CACHE_KEY = "chats_memory_cache";

    /* renamed from: com.instabug.chat.cache.ChatsCacheManager$a */
    static class C9405a extends KeyExtractor<String, Chat> {

        /* renamed from: a */
        private static transient /* synthetic */ boolean[] f24900a;

        C9405a() {
            m43994a()[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m43994a() {
            boolean[] zArr = f24900a;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(6778632555514370518L, "com/instabug/chat/cache/ChatsCacheManager$1", 3);
            f24900a = a;
            return a;
        }

        /* renamed from: a */
        public String mo33846a(Chat chat) {
            boolean[] a = m43994a();
            String id = chat.getId();
            a[1] = true;
            return id;
        }

        public /* synthetic */ Object extractKey(Object obj) {
            boolean[] a = m43994a();
            String a2 = mo33846a((Chat) obj);
            a[2] = true;
            return a2;
        }
    }

    /* renamed from: com.instabug.chat.cache.ChatsCacheManager$b */
    static class C9406b extends KeyExtractor<String, Chat> {

        /* renamed from: a */
        private static transient /* synthetic */ boolean[] f24901a;

        C9406b() {
            m43996a()[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m43996a() {
            boolean[] zArr = f24901a;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-4220940290409242508L, "com/instabug/chat/cache/ChatsCacheManager$2", 3);
            f24901a = a;
            return a;
        }

        /* renamed from: a */
        public String mo33848a(Chat chat) {
            boolean[] a = m43996a();
            String id = chat.getId();
            a[1] = true;
            return id;
        }

        public /* synthetic */ Object extractKey(Object obj) {
            boolean[] a = m43996a();
            String a2 = mo33848a((Chat) obj);
            a[2] = true;
            return a2;
        }
    }

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-1596950080254296232L, "com/instabug/chat/cache/ChatsCacheManager", JpegConst.APP7);
        $jacocoData = a;
        return a;
    }

    public ChatsCacheManager() {
        $jacocoInit()[0] = true;
    }

    public static Chat addOfflineChat(Context context) {
        boolean[] $jacocoInit = $jacocoInit();
        Chat a = new C9416b().mo33899a(context);
        $jacocoInit[28] = true;
        InMemoryCache cache = getCache();
        if (cache == null) {
            $jacocoInit[29] = true;
        } else {
            $jacocoInit[30] = true;
            cache.put(a.getId(), a);
            $jacocoInit[31] = true;
        }
        $jacocoInit[32] = true;
        return a;
    }

    public static void cleanupChats() {
        boolean[] $jacocoInit = $jacocoInit();
        InstabugSDKLogger.m46626v(ChatsCacheManager.class, "cleanupChats");
        $jacocoInit[215] = true;
        InMemoryCache cache = getCache();
        if (cache == null) {
            $jacocoInit[216] = true;
        } else {
            $jacocoInit[217] = true;
            List<Chat> values = cache.getValues();
            $jacocoInit[218] = true;
            ArrayList<Chat> arrayList = new ArrayList<>();
            $jacocoInit[219] = true;
            $jacocoInit[220] = true;
            for (Chat chat : values) {
                $jacocoInit[221] = true;
                if (chat.mo33885d() != ChatState.WAITING_ATTACHMENT_MESSAGE) {
                    $jacocoInit[222] = true;
                } else {
                    $jacocoInit[223] = true;
                    arrayList.add(chat);
                    $jacocoInit[224] = true;
                }
                $jacocoInit[225] = true;
            }
            $jacocoInit[226] = true;
            for (Chat chat2 : arrayList) {
                $jacocoInit[228] = true;
                cache.delete(chat2.getId());
                $jacocoInit[229] = true;
            }
            $jacocoInit[227] = true;
        }
        saveCacheToDisk();
        $jacocoInit[230] = true;
    }

    public static InMemoryCache<String, Chat> getCache() throws IllegalArgumentException {
        Class<ChatsCacheManager> cls = ChatsCacheManager.class;
        boolean[] $jacocoInit = $jacocoInit();
        CacheManager instance = CacheManager.getInstance();
        String str = CHATS_MEMORY_CACHE_KEY;
        if (instance.cacheExists(str)) {
            $jacocoInit[1] = true;
        } else {
            $jacocoInit[2] = true;
            StringBuilder sb = new StringBuilder();
            sb.append("In-memory cache not found, loading it from disk ");
            $jacocoInit[3] = true;
            sb.append(CacheManager.getInstance().getCache(str));
            String sb2 = sb.toString();
            $jacocoInit[4] = true;
            InstabugSDKLogger.m46622d(cls, sb2);
            $jacocoInit[5] = true;
            CacheManager.getInstance().migrateCache(CHATS_DISK_CACHE_KEY, str, (KeyExtractor<K, V>) new C9405a<K,V>());
            $jacocoInit[6] = true;
            C9840b cache = CacheManager.getInstance().getCache(str);
            if (cache == null) {
                $jacocoInit[7] = true;
            } else {
                $jacocoInit[8] = true;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("In-memory cache restored from disk, ");
                $jacocoInit[9] = true;
                sb3.append(cache.getValues().size());
                sb3.append(" elements restored");
                String sb4 = sb3.toString();
                $jacocoInit[10] = true;
                InstabugSDKLogger.m46622d(cls, sb4);
                $jacocoInit[11] = true;
            }
        }
        InstabugSDKLogger.m46622d(cls, "In-memory cache found");
        $jacocoInit[12] = true;
        CacheManager instance2 = CacheManager.getInstance();
        $jacocoInit[13] = true;
        InMemoryCache<String, Chat> inMemoryCache = (InMemoryCache) instance2.getCache(str);
        $jacocoInit[14] = true;
        return inMemoryCache;
    }

    @C0195i0
    public static Chat getChat(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        InMemoryCache cache = getCache();
        if (cache == null) {
            $jacocoInit[33] = true;
        } else {
            $jacocoInit[34] = true;
            List<Chat> values = cache.getValues();
            $jacocoInit[35] = true;
            $jacocoInit[36] = true;
            for (Chat chat : values) {
                $jacocoInit[38] = true;
                if (chat.getId().equals(str)) {
                    $jacocoInit[39] = true;
                    return chat;
                }
                $jacocoInit[40] = true;
            }
            $jacocoInit[37] = true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("No chat with id: ");
        sb.append(str);
        sb.append(" found, returning null");
        InstabugSDKLogger.m46623e(ChatsCacheManager.class, sb.toString());
        $jacocoInit[41] = true;
        return null;
    }

    public static long getLastMessageMessagedAt() {
        boolean[] $jacocoInit = $jacocoInit();
        ArrayList arrayList = new ArrayList();
        $jacocoInit[165] = true;
        InMemoryCache cache = getCache();
        if (cache == null) {
            $jacocoInit[166] = true;
        } else {
            $jacocoInit[167] = true;
            List<Chat> values = cache.getValues();
            $jacocoInit[168] = true;
            $jacocoInit[169] = true;
            for (Chat chat : values) {
                $jacocoInit[171] = true;
                Iterator it = chat.mo33883a().iterator();
                $jacocoInit[172] = true;
                while (it.hasNext()) {
                    Message message = (Message) it.next();
                    $jacocoInit[173] = true;
                    if (message.mo33925k() != MessageState.SYNCED) {
                        $jacocoInit[174] = true;
                    } else {
                        $jacocoInit[175] = true;
                        arrayList.add(message);
                        $jacocoInit[176] = true;
                    }
                    $jacocoInit[177] = true;
                }
                $jacocoInit[178] = true;
            }
            $jacocoInit[170] = true;
        }
        Collections.sort(arrayList, new C9418a());
        $jacocoInit[179] = true;
        int size = arrayList.size() - 1;
        $jacocoInit[180] = true;
        while (size >= 0) {
            $jacocoInit[181] = true;
            Message message2 = (Message) arrayList.get(size);
            $jacocoInit[182] = true;
            if (!message2.mo33908a().equals(AppEventsConstants.EVENT_PARAM_VALUE_NO)) {
                $jacocoInit[183] = true;
                long h = message2.mo33921h();
                $jacocoInit[184] = true;
                return h;
            }
            size--;
            $jacocoInit[185] = true;
        }
        $jacocoInit[186] = true;
        return 0;
    }

    public static List<Message> getNotSentMessages() {
        boolean[] $jacocoInit = $jacocoInit();
        ArrayList arrayList = new ArrayList();
        $jacocoInit[196] = true;
        InMemoryCache cache = getCache();
        if (cache == null) {
            $jacocoInit[197] = true;
        } else {
            $jacocoInit[198] = true;
            List<Chat> values = cache.getValues();
            $jacocoInit[199] = true;
            $jacocoInit[200] = true;
            for (Chat chat : values) {
                $jacocoInit[202] = true;
                Iterator it = chat.mo33883a().iterator();
                $jacocoInit[203] = true;
                while (it.hasNext()) {
                    Message message = (Message) it.next();
                    $jacocoInit[204] = true;
                    if (message.mo33925k() == MessageState.SENT) {
                        $jacocoInit[205] = true;
                    } else {
                        $jacocoInit[206] = true;
                        if (message.mo33925k() != MessageState.READY_TO_BE_SENT) {
                            $jacocoInit[207] = true;
                            $jacocoInit[210] = true;
                        } else {
                            $jacocoInit[208] = true;
                        }
                    }
                    arrayList.add(message);
                    $jacocoInit[209] = true;
                    $jacocoInit[210] = true;
                }
                $jacocoInit[211] = true;
            }
            $jacocoInit[201] = true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("not sent messages count: ");
        $jacocoInit[212] = true;
        sb.append(arrayList.size());
        String sb2 = sb.toString();
        $jacocoInit[213] = true;
        InstabugSDKLogger.m46626v(ChatsCacheManager.class, sb2);
        $jacocoInit[214] = true;
        return arrayList;
    }

    public static List<Chat> getOfflineChats() {
        boolean[] $jacocoInit = $jacocoInit();
        ArrayList arrayList = new ArrayList();
        $jacocoInit[54] = true;
        InMemoryCache cache = getCache();
        if (cache == null) {
            $jacocoInit[55] = true;
        } else {
            $jacocoInit[56] = true;
            List<Chat> values = cache.getValues();
            $jacocoInit[57] = true;
            $jacocoInit[58] = true;
            for (Chat chat : values) {
                $jacocoInit[60] = true;
                StringBuilder sb = new StringBuilder();
                sb.append("chat state: ");
                sb.append(chat.mo33885d());
                sb.append(", messages count: ");
                $jacocoInit[61] = true;
                sb.append(chat.mo33883a().size());
                String sb2 = sb.toString();
                $jacocoInit[62] = true;
                InstabugSDKLogger.m46626v(ChatsCacheManager.class, sb2);
                $jacocoInit[63] = true;
                if (chat.mo33885d().equals(ChatState.READY_TO_BE_SENT)) {
                    $jacocoInit[64] = true;
                } else {
                    $jacocoInit[65] = true;
                    if (!chat.mo33885d().equals(ChatState.LOGS_READY_TO_BE_UPLOADED)) {
                        $jacocoInit[66] = true;
                        $jacocoInit[72] = true;
                    } else {
                        $jacocoInit[67] = true;
                    }
                }
                $jacocoInit[68] = true;
                if (chat.mo33883a().size() <= 0) {
                    $jacocoInit[69] = true;
                } else {
                    $jacocoInit[70] = true;
                    arrayList.add(chat);
                    $jacocoInit[71] = true;
                }
                $jacocoInit[72] = true;
            }
            $jacocoInit[59] = true;
        }
        $jacocoInit[73] = true;
        return arrayList;
    }

    public static List<Message> getOfflineMessages() {
        boolean[] $jacocoInit = $jacocoInit();
        ArrayList arrayList = new ArrayList();
        $jacocoInit[145] = true;
        InMemoryCache cache = getCache();
        if (cache == null) {
            $jacocoInit[146] = true;
        } else {
            $jacocoInit[147] = true;
            List<Chat> values = cache.getValues();
            $jacocoInit[148] = true;
            $jacocoInit[149] = true;
            for (Chat chat : values) {
                $jacocoInit[151] = true;
                if (!chat.mo33885d().equals(ChatState.SENT)) {
                    $jacocoInit[152] = true;
                } else {
                    $jacocoInit[153] = true;
                    Iterator it = chat.mo33883a().iterator();
                    $jacocoInit[154] = true;
                    while (it.hasNext()) {
                        Message message = (Message) it.next();
                        $jacocoInit[156] = true;
                        if (message.mo33925k().equals(MessageState.READY_TO_BE_SENT)) {
                            $jacocoInit[157] = true;
                        } else {
                            $jacocoInit[158] = true;
                            if (!message.mo33925k().equals(MessageState.SENT)) {
                                $jacocoInit[159] = true;
                                $jacocoInit[162] = true;
                            } else {
                                $jacocoInit[160] = true;
                            }
                        }
                        arrayList.add(message);
                        $jacocoInit[161] = true;
                        $jacocoInit[162] = true;
                    }
                    $jacocoInit[155] = true;
                }
                $jacocoInit[163] = true;
            }
            $jacocoInit[150] = true;
        }
        $jacocoInit[164] = true;
        return arrayList;
    }

    public static int getTotalMessagesCount() {
        boolean[] $jacocoInit = $jacocoInit();
        $jacocoInit[131] = true;
        InMemoryCache cache = getCache();
        int i = 0;
        if (cache == null) {
            $jacocoInit[132] = true;
        } else {
            $jacocoInit[133] = true;
            List<Chat> values = cache.getValues();
            $jacocoInit[134] = true;
            $jacocoInit[135] = true;
            for (Chat chat : values) {
                $jacocoInit[137] = true;
                Iterator it = chat.mo33883a().iterator();
                $jacocoInit[138] = true;
                while (it.hasNext()) {
                    Message message = (Message) it.next();
                    $jacocoInit[139] = true;
                    if (!message.mo33925k().equals(MessageState.SYNCED)) {
                        $jacocoInit[140] = true;
                    } else {
                        i++;
                        $jacocoInit[141] = true;
                    }
                    $jacocoInit[142] = true;
                }
                $jacocoInit[143] = true;
            }
            $jacocoInit[136] = true;
        }
        $jacocoInit[144] = true;
        return i;
    }

    public static int getUnreadCount() {
        boolean[] $jacocoInit = $jacocoInit();
        $jacocoInit[187] = true;
        InMemoryCache cache = getCache();
        int i = 0;
        if (cache == null) {
            $jacocoInit[188] = true;
        } else {
            $jacocoInit[189] = true;
            List<Chat> values = cache.getValues();
            $jacocoInit[190] = true;
            $jacocoInit[191] = true;
            for (Chat chat : values) {
                $jacocoInit[193] = true;
                i += chat.mo33886e();
                $jacocoInit[194] = true;
            }
            $jacocoInit[192] = true;
        }
        $jacocoInit[195] = true;
        return i;
    }

    public static List<Chat> getValidChats() {
        boolean[] $jacocoInit = $jacocoInit();
        ArrayList arrayList = new ArrayList();
        $jacocoInit[42] = true;
        InMemoryCache cache = getCache();
        if (cache == null) {
            $jacocoInit[43] = true;
        } else {
            $jacocoInit[44] = true;
            List<Chat> values = cache.getValues();
            $jacocoInit[45] = true;
            $jacocoInit[46] = true;
            for (Chat chat : values) {
                $jacocoInit[48] = true;
                if (chat.mo33883a().size() <= 0) {
                    $jacocoInit[49] = true;
                } else {
                    $jacocoInit[50] = true;
                    arrayList.add(chat);
                    $jacocoInit[51] = true;
                }
                $jacocoInit[52] = true;
            }
            $jacocoInit[47] = true;
        }
        $jacocoInit[53] = true;
        return arrayList;
    }

    public static void saveCacheToDisk() throws IllegalArgumentException {
        boolean[] $jacocoInit = $jacocoInit();
        C9840b cache = CacheManager.getInstance().getCache(CHATS_MEMORY_CACHE_KEY);
        $jacocoInit[15] = true;
        C9840b cache2 = CacheManager.getInstance().getCache(CHATS_DISK_CACHE_KEY);
        if (cache == null) {
            $jacocoInit[16] = true;
        } else if (cache2 == null) {
            $jacocoInit[17] = true;
        } else {
            $jacocoInit[18] = true;
            CacheManager instance = CacheManager.getInstance();
            C9406b bVar = new C9406b();
            $jacocoInit[19] = true;
            instance.migrateCache(cache, cache2, (KeyExtractor<K, V>) bVar);
            $jacocoInit[20] = true;
        }
        if (cache2 == null) {
            $jacocoInit[21] = true;
        } else {
            $jacocoInit[22] = true;
            StringBuilder sb = new StringBuilder();
            sb.append("In-memory cache had been persisted on-disk, ");
            $jacocoInit[23] = true;
            List values = cache2.getValues();
            $jacocoInit[24] = true;
            sb.append(values.size());
            sb.append(" elements saved");
            String sb2 = sb.toString();
            $jacocoInit[25] = true;
            InstabugSDKLogger.m46622d(ChatsCacheManager.class, sb2);
            $jacocoInit[26] = true;
        }
        $jacocoInit[27] = true;
    }

    public static void updateLocalMessageWithSyncedMessage(@C0193h0 Context context, @C0193h0 Message message) throws IOException {
        AssetEntity assetEntity;
        Class<ChatsCacheManager> cls = ChatsCacheManager.class;
        boolean[] $jacocoInit = $jacocoInit();
        InMemoryCache cache = getCache();
        if (cache == null) {
            $jacocoInit[74] = true;
        } else {
            $jacocoInit[75] = true;
            Chat chat = (Chat) cache.get(message.mo33914d());
            $jacocoInit[76] = true;
            ArrayList a = chat.mo33883a();
            $jacocoInit[77] = true;
            $jacocoInit[78] = true;
            int i = 0;
            while (true) {
                if (i >= a.size()) {
                    $jacocoInit[79] = true;
                    break;
                }
                $jacocoInit[80] = true;
                if (!((Message) a.get(i)).mo33908a().equals(message.mo33908a())) {
                    $jacocoInit[81] = true;
                } else {
                    $jacocoInit[82] = true;
                    if (!((Message) a.get(i)).mo33925k().equals(MessageState.READY_TO_BE_SYNCED)) {
                        $jacocoInit[83] = true;
                    } else {
                        $jacocoInit[84] = true;
                        int size = ((Message) a.get(i)).mo33926l().size();
                        $jacocoInit[85] = true;
                        if (size != message.mo33926l().size()) {
                            $jacocoInit[86] = true;
                        } else {
                            $jacocoInit[87] = true;
                            $jacocoInit[88] = true;
                            int i2 = 0;
                            while (i2 < ((Message) a.get(i)).mo33926l().size()) {
                                $jacocoInit[89] = true;
                                String type = ((Attachment) message.mo33926l().get(i2)).getType();
                                char c = 65535;
                                int hashCode = type.hashCode();
                                if (hashCode != 93166550) {
                                    if (hashCode != 100313435) {
                                        if (hashCode != 112202875) {
                                            $jacocoInit[90] = true;
                                        } else if (!type.equals("video")) {
                                            $jacocoInit[95] = true;
                                        } else {
                                            $jacocoInit[96] = true;
                                            c = 2;
                                        }
                                    } else if (!type.equals("image")) {
                                        $jacocoInit[91] = true;
                                    } else {
                                        $jacocoInit[92] = true;
                                        c = 0;
                                    }
                                } else if (!type.equals("audio")) {
                                    $jacocoInit[93] = true;
                                } else {
                                    $jacocoInit[94] = true;
                                    c = 1;
                                }
                                if (c == 0) {
                                    $jacocoInit[97] = true;
                                    Attachment attachment = (Attachment) message.mo33926l().get(i2);
                                    $jacocoInit[98] = true;
                                    String url = attachment.getUrl();
                                    AssetType assetType = AssetType.IMAGE;
                                    $jacocoInit[99] = true;
                                    assetEntity = AssetsCacheManager.createEmptyEntity(context, url, assetType);
                                    $jacocoInit[100] = true;
                                } else if (c == 1) {
                                    $jacocoInit[101] = true;
                                    Attachment attachment2 = (Attachment) message.mo33926l().get(i2);
                                    $jacocoInit[102] = true;
                                    String url2 = attachment2.getUrl();
                                    AssetType assetType2 = AssetType.AUDIO;
                                    $jacocoInit[103] = true;
                                    assetEntity = AssetsCacheManager.createEmptyEntity(context, url2, assetType2);
                                    $jacocoInit[104] = true;
                                } else if (c != 2) {
                                    $jacocoInit[109] = true;
                                    Attachment attachment3 = (Attachment) message.mo33926l().get(i2);
                                    $jacocoInit[110] = true;
                                    String url3 = attachment3.getUrl();
                                    AssetType assetType3 = AssetType.IMAGE;
                                    $jacocoInit[111] = true;
                                    assetEntity = AssetsCacheManager.createEmptyEntity(context, url3, assetType3);
                                    $jacocoInit[112] = true;
                                } else {
                                    $jacocoInit[105] = true;
                                    Attachment attachment4 = (Attachment) message.mo33926l().get(i2);
                                    $jacocoInit[106] = true;
                                    String url4 = attachment4.getUrl();
                                    AssetType assetType4 = AssetType.VIDEO;
                                    $jacocoInit[107] = true;
                                    assetEntity = AssetsCacheManager.createEmptyEntity(context, url4, assetType4);
                                    $jacocoInit[108] = true;
                                }
                                Attachment attachment5 = (Attachment) ((Message) a.get(i)).mo33926l().get(i2);
                                $jacocoInit[113] = true;
                                File file = new File(attachment5.getLocalPath());
                                $jacocoInit[114] = true;
                                Uri fromFile = Uri.fromFile(file);
                                $jacocoInit[115] = true;
                                File file2 = assetEntity.getFile();
                                $jacocoInit[116] = true;
                                DiskUtils.copyFromUriIntoFile(context, fromFile, file2);
                                $jacocoInit[117] = true;
                                AssetsCacheManager.addAssetEntity(assetEntity);
                                $jacocoInit[118] = true;
                                boolean delete = file.delete();
                                $jacocoInit[119] = true;
                                StringBuilder sb = new StringBuilder();
                                sb.append("local attachment file deleted: ");
                                sb.append(delete);
                                InstabugSDKLogger.m46626v(cls, sb.toString());
                                i2++;
                                $jacocoInit[120] = true;
                            }
                            chat.mo33883a().set(i, message);
                            $jacocoInit[121] = true;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("messages number: ");
                            $jacocoInit[122] = true;
                            sb2.append(chat.mo33883a().size());
                            String sb3 = sb2.toString();
                            $jacocoInit[123] = true;
                            InstabugSDKLogger.m46626v(cls, sb3);
                            $jacocoInit[124] = true;
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("messages: ");
                            $jacocoInit[125] = true;
                            sb4.append(chat.mo33883a().get(i));
                            String sb5 = sb4.toString();
                            $jacocoInit[126] = true;
                            InstabugSDKLogger.m46626v(cls, sb5);
                            $jacocoInit[127] = true;
                            cache.put(chat.getId(), chat);
                            $jacocoInit[128] = true;
                        }
                    }
                }
                i++;
                $jacocoInit[129] = true;
            }
        }
        $jacocoInit[130] = true;
    }
}
