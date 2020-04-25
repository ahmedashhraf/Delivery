package org.jivesoftware.smackx.workgroup.util;

import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: ModelUtil */
class ReverseListIterator<T> implements Iterator<T> {

    /* renamed from: _i */
    private ListIterator<T> f45017_i;

    ReverseListIterator(ListIterator<T> listIterator) {
        this.f45017_i = listIterator;
        while (this.f45017_i.hasNext()) {
            this.f45017_i.next();
        }
    }

    public boolean hasNext() {
        return this.f45017_i.hasPrevious();
    }

    public T next() {
        return this.f45017_i.previous();
    }

    public void remove() {
        this.f45017_i.remove();
    }
}
