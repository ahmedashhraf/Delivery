package com.airbnb.lottie;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import androidx.annotation.C0195i0;
import androidx.annotation.C0201l0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.C0226w0;
import androidx.collection.C0642f;
import androidx.collection.C0650i;
import com.airbnb.lottie.model.Font;
import com.airbnb.lottie.model.FontCharacter;
import com.airbnb.lottie.model.Marker;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.Logger;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public class LottieComposition {
    private Rect bounds;
    private C0650i<FontCharacter> characters;
    private float endFrame;
    private Map<String, Font> fonts;
    private float frameRate;
    private boolean hasDashPattern;
    private Map<String, LottieImageAsset> images;
    private C0642f<Layer> layerMap;
    private List<Layer> layers;
    private List<Marker> markers;
    private int maskAndMatteCount = 0;
    private final PerformanceTracker performanceTracker = new PerformanceTracker();
    private Map<String, List<Layer>> precomps;
    private float startFrame;
    private final HashSet<String> warnings = new HashSet<>();

    @Deprecated
    public static class Factory {

        private static final class ListenerAdapter implements LottieListener<LottieComposition>, Cancellable {
            private boolean cancelled;
            private final OnCompositionLoadedListener listener;

            public void cancel() {
                this.cancelled = true;
            }

            private ListenerAdapter(OnCompositionLoadedListener onCompositionLoadedListener) {
                this.cancelled = false;
                this.listener = onCompositionLoadedListener;
            }

            public void onResult(LottieComposition lottieComposition) {
                if (!this.cancelled) {
                    this.listener.onCompositionLoaded(lottieComposition);
                }
            }
        }

        private Factory() {
        }

        @Deprecated
        public static Cancellable fromAssetFileName(Context context, String str, OnCompositionLoadedListener onCompositionLoadedListener) {
            ListenerAdapter listenerAdapter = new ListenerAdapter(onCompositionLoadedListener);
            LottieCompositionFactory.fromAsset(context, str).addListener(listenerAdapter);
            return listenerAdapter;
        }

        @C0226w0
        @Deprecated
        @C0195i0
        public static LottieComposition fromFileSync(Context context, String str) {
            return (LottieComposition) LottieCompositionFactory.fromAssetSync(context, str).getValue();
        }

        @Deprecated
        public static Cancellable fromInputStream(InputStream inputStream, OnCompositionLoadedListener onCompositionLoadedListener) {
            ListenerAdapter listenerAdapter = new ListenerAdapter(onCompositionLoadedListener);
            LottieCompositionFactory.fromJsonInputStream(inputStream, null).addListener(listenerAdapter);
            return listenerAdapter;
        }

        @C0226w0
        @Deprecated
        @C0195i0
        public static LottieComposition fromInputStreamSync(InputStream inputStream) {
            return (LottieComposition) LottieCompositionFactory.fromJsonInputStreamSync(inputStream, null).getValue();
        }

        @Deprecated
        public static Cancellable fromJsonReader(JsonReader jsonReader, OnCompositionLoadedListener onCompositionLoadedListener) {
            ListenerAdapter listenerAdapter = new ListenerAdapter(onCompositionLoadedListener);
            LottieCompositionFactory.fromJsonReader(jsonReader, null).addListener(listenerAdapter);
            return listenerAdapter;
        }

        @Deprecated
        public static Cancellable fromJsonString(String str, OnCompositionLoadedListener onCompositionLoadedListener) {
            ListenerAdapter listenerAdapter = new ListenerAdapter(onCompositionLoadedListener);
            LottieCompositionFactory.fromJsonString(str, null).addListener(listenerAdapter);
            return listenerAdapter;
        }

        @C0226w0
        @Deprecated
        @C0195i0
        public static LottieComposition fromJsonSync(Resources resources, JSONObject jSONObject) {
            return (LottieComposition) LottieCompositionFactory.fromJsonSync(jSONObject, null).getValue();
        }

        @Deprecated
        public static Cancellable fromRawFile(Context context, @C0201l0 int i, OnCompositionLoadedListener onCompositionLoadedListener) {
            ListenerAdapter listenerAdapter = new ListenerAdapter(onCompositionLoadedListener);
            LottieCompositionFactory.fromRawRes(context, i).addListener(listenerAdapter);
            return listenerAdapter;
        }

        @C0226w0
        @Deprecated
        @C0195i0
        public static LottieComposition fromInputStreamSync(InputStream inputStream, boolean z) {
            if (z) {
                Logger.warning("Lottie now auto-closes input stream!");
            }
            return (LottieComposition) LottieCompositionFactory.fromJsonInputStreamSync(inputStream, null).getValue();
        }

        @C0226w0
        @Deprecated
        @C0195i0
        public static LottieComposition fromJsonSync(String str) {
            return (LottieComposition) LottieCompositionFactory.fromJsonStringSync(str, null).getValue();
        }

        @C0226w0
        @C0195i0
        @Deprecated
        public static LottieComposition fromJsonSync(JsonReader jsonReader) throws IOException {
            return (LottieComposition) LottieCompositionFactory.fromJsonReaderSync(jsonReader, null).getValue();
        }
    }

    @C0207n0({C0208a.LIBRARY})
    public void addWarning(String str) {
        Logger.warning(str);
        this.warnings.add(str);
    }

    public Rect getBounds() {
        return this.bounds;
    }

    public C0650i<FontCharacter> getCharacters() {
        return this.characters;
    }

    public float getDuration() {
        return (float) ((long) ((getDurationFrames() / this.frameRate) * 1000.0f));
    }

    public float getDurationFrames() {
        return this.endFrame - this.startFrame;
    }

    @C0207n0({C0208a.LIBRARY})
    public float getEndFrame() {
        return this.endFrame;
    }

    public Map<String, Font> getFonts() {
        return this.fonts;
    }

    public float getFrameRate() {
        return this.frameRate;
    }

    public Map<String, LottieImageAsset> getImages() {
        return this.images;
    }

    public List<Layer> getLayers() {
        return this.layers;
    }

    @C0195i0
    public Marker getMarker(String str) {
        this.markers.size();
        for (int i = 0; i < this.markers.size(); i++) {
            Marker marker = (Marker) this.markers.get(i);
            if (marker.matchesName(str)) {
                return marker;
            }
        }
        return null;
    }

    public List<Marker> getMarkers() {
        return this.markers;
    }

    @C0207n0({C0208a.LIBRARY})
    public int getMaskAndMatteCount() {
        return this.maskAndMatteCount;
    }

    public PerformanceTracker getPerformanceTracker() {
        return this.performanceTracker;
    }

    @C0207n0({C0208a.LIBRARY})
    @C0195i0
    public List<Layer> getPrecomps(String str) {
        return (List) this.precomps.get(str);
    }

    @C0207n0({C0208a.LIBRARY})
    public float getStartFrame() {
        return this.startFrame;
    }

    public ArrayList<String> getWarnings() {
        HashSet<String> hashSet = this.warnings;
        return new ArrayList<>(Arrays.asList(hashSet.toArray(new String[hashSet.size()])));
    }

    @C0207n0({C0208a.LIBRARY})
    public boolean hasDashPattern() {
        return this.hasDashPattern;
    }

    public boolean hasImages() {
        return !this.images.isEmpty();
    }

    @C0207n0({C0208a.LIBRARY})
    public void incrementMatteOrMaskCount(int i) {
        this.maskAndMatteCount += i;
    }

    @C0207n0({C0208a.LIBRARY})
    public void init(Rect rect, float f, float f2, float f3, List<Layer> list, C0642f<Layer> fVar, Map<String, List<Layer>> map, Map<String, LottieImageAsset> map2, C0650i<FontCharacter> iVar, Map<String, Font> map3, List<Marker> list2) {
        this.bounds = rect;
        this.startFrame = f;
        this.endFrame = f2;
        this.frameRate = f3;
        this.layers = list;
        this.layerMap = fVar;
        this.precomps = map;
        this.images = map2;
        this.characters = iVar;
        this.fonts = map3;
        this.markers = list2;
    }

    @C0207n0({C0208a.LIBRARY})
    public Layer layerModelForId(long j) {
        return (Layer) this.layerMap.mo3283c(j);
    }

    @C0207n0({C0208a.LIBRARY})
    public void setHasDashPattern(boolean z) {
        this.hasDashPattern = z;
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.performanceTracker.setEnabled(z);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        for (Layer layer : this.layers) {
            sb.append(layer.toString("\t"));
        }
        return sb.toString();
    }
}
