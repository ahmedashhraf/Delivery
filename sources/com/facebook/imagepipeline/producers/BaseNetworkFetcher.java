package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.producers.FetchState;
import java.util.Map;
import p201f.p202a.C5952h;

public abstract class BaseNetworkFetcher<FETCH_STATE extends FetchState> implements NetworkFetcher<FETCH_STATE> {
    @C5952h
    public Map<String, String> getExtraMap(FETCH_STATE fetch_state, int i) {
        return null;
    }

    public void onFetchCompletion(FETCH_STATE fetch_state, int i) {
    }

    public boolean shouldPropagate(FETCH_STATE fetch_state) {
        return true;
    }
}
