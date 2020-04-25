package org.jivesoftware.smack.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.jivesoftware.smack.util.Objects;

public abstract class AbstractListFilter implements StanzaFilter {
    protected final List<StanzaFilter> filters;

    protected AbstractListFilter() {
        this.filters = new ArrayList();
    }

    public void addFilter(StanzaFilter stanzaFilter) {
        Objects.requireNonNull(stanzaFilter, "Parameter must not be null.");
        this.filters.add(stanzaFilter);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(": (");
        Iterator it = this.filters.iterator();
        while (it.hasNext()) {
            sb.append(((StanzaFilter) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(")");
        return sb.toString();
    }

    protected AbstractListFilter(StanzaFilter... stanzaFilterArr) {
        String str = "Parameter must not be null.";
        Objects.requireNonNull(stanzaFilterArr, str);
        for (StanzaFilter requireNonNull : stanzaFilterArr) {
            Objects.requireNonNull(requireNonNull, str);
        }
        this.filters = new ArrayList(Arrays.asList(stanzaFilterArr));
    }
}
