package org.jivesoftware.smack.util;

import java.util.ArrayList;
import java.util.List;

public class LazyStringBuilder implements Appendable, CharSequence {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private String cache;
    private final List<CharSequence> list = new ArrayList(20);

    static {
        Class<LazyStringBuilder> cls = LazyStringBuilder.class;
    }

    private void invalidateCache() {
        this.cache = null;
    }

    public char charAt(int i) {
        String str = this.cache;
        if (str != null) {
            return str.charAt(i);
        }
        for (CharSequence charSequence : this.list) {
            if (i < charSequence.length()) {
                return charSequence.charAt(i);
            }
            i -= charSequence.length();
        }
        throw new IndexOutOfBoundsException();
    }

    public int length() {
        String str = this.cache;
        if (str != null) {
            return str.length();
        }
        int i = 0;
        for (CharSequence length : this.list) {
            i += length.length();
        }
        return i;
    }

    public CharSequence subSequence(int i, int i2) {
        return toString().subSequence(i, i2);
    }

    public String toString() {
        if (this.cache == null) {
            StringBuilder sb = new StringBuilder(length());
            for (CharSequence append : this.list) {
                sb.append(append);
            }
            this.cache = sb.toString();
        }
        return this.cache;
    }

    public LazyStringBuilder append(LazyStringBuilder lazyStringBuilder) {
        this.list.addAll(lazyStringBuilder.list);
        invalidateCache();
        return this;
    }

    public LazyStringBuilder append(CharSequence charSequence) {
        this.list.add(charSequence);
        invalidateCache();
        return this;
    }

    public LazyStringBuilder append(CharSequence charSequence, int i, int i2) {
        this.list.add(charSequence.subSequence(i, i2));
        invalidateCache();
        return this;
    }

    public LazyStringBuilder append(char c) {
        this.list.add(Character.toString(c));
        invalidateCache();
        return this;
    }
}
