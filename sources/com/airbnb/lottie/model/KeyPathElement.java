package com.airbnb.lottie.model;

import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.List;

@C0207n0({C0208a.LIBRARY})
public interface KeyPathElement {
    <T> void addValueCallback(T t, @C0195i0 LottieValueCallback<T> lottieValueCallback);

    void resolveKeyPath(KeyPath keyPath, int i, List<KeyPath> list, KeyPath keyPath2);
}
