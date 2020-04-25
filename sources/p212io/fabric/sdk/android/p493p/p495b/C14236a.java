package p212io.fabric.sdk.android.p493p.p495b;

import java.util.Collections;
import java.util.Map;
import java.util.regex.Pattern;
import p212io.fabric.sdk.android.C14225i;
import p212io.fabric.sdk.android.services.network.C14387c;
import p212io.fabric.sdk.android.services.network.C14388d;
import p212io.fabric.sdk.android.services.network.HttpRequest;

/* renamed from: io.fabric.sdk.android.p.b.a */
/* compiled from: AbstractSpiCall */
public abstract class C14236a {
    public static final String ACCEPT_JSON_VALUE = "application/json";
    public static final String ANDROID_CLIENT_TYPE = "android";
    public static final String CLS_ANDROID_SDK_DEVELOPER_TOKEN = "470fa2b4ae81cd56ecbcda9735803434cec591fa";
    public static final String CRASHLYTICS_USER_AGENT = "Crashlytics Android SDK/";
    public static final int DEFAULT_TIMEOUT = 10000;
    public static final String HEADER_ACCEPT = "Accept";
    public static final String HEADER_API_KEY = "X-CRASHLYTICS-API-KEY";
    public static final String HEADER_CLIENT_TYPE = "X-CRASHLYTICS-API-CLIENT-TYPE";
    public static final String HEADER_CLIENT_VERSION = "X-CRASHLYTICS-API-CLIENT-VERSION";
    public static final String HEADER_DEVELOPER_TOKEN = "X-CRASHLYTICS-DEVELOPER-TOKEN";
    public static final String HEADER_REQUEST_ID = "X-REQUEST-ID";
    public static final String HEADER_USER_AGENT = "User-Agent";
    private static final Pattern PROTOCOL_AND_HOST_PATTERN = Pattern.compile("http(s?)://[^\\/]+", 2);
    protected final C14225i kit;
    private final C14387c method;
    private final String protocolAndHostOverride;
    private final C14388d requestFactory;
    private final String url;

    public C14236a(C14225i iVar, String str, String str2, C14388d dVar, C14387c cVar) {
        if (str2 == null) {
            throw new IllegalArgumentException("url must not be null.");
        } else if (dVar != null) {
            this.kit = iVar;
            this.protocolAndHostOverride = str;
            this.url = overrideProtocolAndHost(str2);
            this.requestFactory = dVar;
            this.method = cVar;
        } else {
            throw new IllegalArgumentException("requestFactory must not be null.");
        }
    }

    private String overrideProtocolAndHost(String str) {
        return !C14248i.m61832c(this.protocolAndHostOverride) ? PROTOCOL_AND_HOST_PATTERN.matcher(str).replaceFirst(this.protocolAndHostOverride) : str;
    }

    /* access modifiers changed from: protected */
    public HttpRequest getHttpRequest() {
        return getHttpRequest(Collections.emptyMap());
    }

    /* access modifiers changed from: protected */
    public String getUrl() {
        return this.url;
    }

    /* access modifiers changed from: protected */
    public HttpRequest getHttpRequest(Map<String, String> map) {
        HttpRequest c = this.requestFactory.mo45501a(this.method, getUrl(), map).mo45445d(false).mo45437c((int) DEFAULT_TIMEOUT);
        StringBuilder sb = new StringBuilder();
        sb.append(CRASHLYTICS_USER_AGENT);
        sb.append(this.kit.getVersion());
        return c.mo45444d("User-Agent", sb.toString()).mo45444d(HEADER_DEVELOPER_TOKEN, "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }
}
