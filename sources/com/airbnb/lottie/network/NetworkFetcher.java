package com.airbnb.lottie.network;

import android.content.Context;
import androidx.annotation.C0195i0;
import androidx.annotation.C0226w0;
import androidx.core.p033k.C0938f;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieCompositionFactory;
import com.airbnb.lottie.LottieResult;
import com.airbnb.lottie.utils.Logger;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.zip.ZipInputStream;

public class NetworkFetcher {
    private final Context appContext;
    private final NetworkCache networkCache;
    private final String url;

    private NetworkFetcher(Context context, String str) {
        this.appContext = context.getApplicationContext();
        this.url = str;
        this.networkCache = new NetworkCache(this.appContext, str);
    }

    @C0226w0
    @C0195i0
    private LottieComposition fetchFromCache() {
        LottieResult lottieResult;
        C0938f fetch = this.networkCache.fetch();
        if (fetch == null) {
            return null;
        }
        FileExtension fileExtension = (FileExtension) fetch.f4243a;
        InputStream inputStream = (InputStream) fetch.f4244b;
        if (fileExtension == FileExtension.ZIP) {
            lottieResult = LottieCompositionFactory.fromZipStreamSync(new ZipInputStream(inputStream), this.url);
        } else {
            lottieResult = LottieCompositionFactory.fromJsonInputStreamSync(inputStream, this.url);
        }
        if (lottieResult.getValue() != null) {
            return (LottieComposition) lottieResult.getValue();
        }
        return null;
    }

    @C0226w0
    private LottieResult<LottieComposition> fetchFromNetwork() {
        try {
            return fetchFromNetworkInternal();
        } catch (IOException e) {
            return new LottieResult<>((Throwable) e);
        }
    }

    @C0226w0
    private LottieResult fetchFromNetworkInternal() throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("Fetching ");
        sb.append(this.url);
        Logger.debug(sb.toString());
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.url).openConnection();
        httpURLConnection.setRequestMethod("GET");
        try {
            httpURLConnection.connect();
            if (httpURLConnection.getErrorStream() == null) {
                if (httpURLConnection.getResponseCode() == 200) {
                    LottieResult resultFromConnection = getResultFromConnection(httpURLConnection);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Completed fetch from network. Success: ");
                    sb2.append(resultFromConnection.getValue() != null);
                    Logger.debug(sb2.toString());
                    httpURLConnection.disconnect();
                    return resultFromConnection;
                }
            }
            String errorFromConnection = getErrorFromConnection(httpURLConnection);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Unable to fetch ");
            sb3.append(this.url);
            sb3.append(". Failed with ");
            sb3.append(httpURLConnection.getResponseCode());
            sb3.append("\n");
            sb3.append(errorFromConnection);
            return new LottieResult((Throwable) new IllegalArgumentException(sb3.toString()));
        } catch (Exception e) {
            return new LottieResult((Throwable) e);
        } finally {
            httpURLConnection.disconnect();
        }
    }

    public static LottieResult<LottieComposition> fetchSync(Context context, String str) {
        return new NetworkFetcher(context, str).fetchSync();
    }

    private String getErrorFromConnection(HttpURLConnection httpURLConnection) throws IOException {
        httpURLConnection.getResponseCode();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                    sb.append(10);
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception e) {
                throw e;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
                throw th;
            }
        }
        bufferedReader.close();
        return sb.toString();
    }

    @C0195i0
    private LottieResult<LottieComposition> getResultFromConnection(HttpURLConnection httpURLConnection) throws IOException {
        LottieResult<LottieComposition> lottieResult;
        FileExtension fileExtension;
        String contentType = httpURLConnection.getContentType();
        String str = "application/json";
        if (contentType == null) {
            contentType = str;
        }
        char c = 65535;
        int hashCode = contentType.hashCode();
        if (hashCode != -1248325150) {
            if (hashCode == -43840953 && contentType.equals(str)) {
                c = 1;
            }
        } else if (contentType.equals("application/zip")) {
            c = 0;
        }
        if (c != 0) {
            Logger.debug("Received json response.");
            fileExtension = FileExtension.JSON;
            lottieResult = LottieCompositionFactory.fromJsonInputStreamSync(new FileInputStream(new File(this.networkCache.writeTempCacheFile(httpURLConnection.getInputStream(), fileExtension).getAbsolutePath())), this.url);
        } else {
            Logger.debug("Handling zip response.");
            fileExtension = FileExtension.ZIP;
            lottieResult = LottieCompositionFactory.fromZipStreamSync(new ZipInputStream(new FileInputStream(this.networkCache.writeTempCacheFile(httpURLConnection.getInputStream(), fileExtension))), this.url);
        }
        if (lottieResult.getValue() != null) {
            this.networkCache.renameTempFile(fileExtension);
        }
        return lottieResult;
    }

    @C0226w0
    public LottieResult<LottieComposition> fetchSync() {
        LottieComposition fetchFromCache = fetchFromCache();
        if (fetchFromCache != null) {
            return new LottieResult<>(fetchFromCache);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Animation for ");
        sb.append(this.url);
        sb.append(" not found in cache. Fetching from network.");
        Logger.debug(sb.toString());
        return fetchFromNetwork();
    }
}
