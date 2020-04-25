package com.pusher.client.connection;

/* renamed from: com.pusher.client.connection.c */
/* compiled from: ConnectionStateChange */
public class C12019c {

    /* renamed from: a */
    private final ConnectionState f34630a;

    /* renamed from: b */
    private final ConnectionState f34631b;

    public C12019c(ConnectionState connectionState, ConnectionState connectionState2) {
        if (connectionState != connectionState2) {
            this.f34630a = connectionState;
            this.f34631b = connectionState2;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Attempted to create an connection state update where both previous and current state are: ");
        sb.append(connectionState2);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public ConnectionState mo41138a() {
        return this.f34631b;
    }

    /* renamed from: b */
    public ConnectionState mo41139b() {
        return this.f34630a;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C12019c)) {
            return false;
        }
        C12019c cVar = (C12019c) obj;
        if (this.f34631b == cVar.f34631b && this.f34630a == cVar.f34630a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f34630a.hashCode() + this.f34631b.hashCode();
    }
}
