package com.facebook.cache.common;

import android.net.Uri;
import com.facebook.common.internal.Preconditions;
import java.util.List;

public class MultiCacheKey implements CacheKey {
    final List<CacheKey> mCacheKeys;

    public MultiCacheKey(List<CacheKey> list) {
        this.mCacheKeys = (List) Preconditions.checkNotNull(list);
    }

    public boolean containsUri(Uri uri) {
        for (int i = 0; i < this.mCacheKeys.size(); i++) {
            if (((CacheKey) this.mCacheKeys.get(i)).containsUri(uri)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MultiCacheKey)) {
            return false;
        }
        return this.mCacheKeys.equals(((MultiCacheKey) obj).mCacheKeys);
    }

    public List<CacheKey> getCacheKeys() {
        return this.mCacheKeys;
    }

    public String getUriString() {
        return ((CacheKey) this.mCacheKeys.get(0)).getUriString();
    }

    public int hashCode() {
        return this.mCacheKeys.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MultiCacheKey:");
        sb.append(this.mCacheKeys.toString());
        return sb.toString();
    }
}
