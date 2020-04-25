package org.jivesoftware.smackx.xroster;

import java.util.Iterator;

public interface RosterExchangeListener {
    void entriesReceived(String str, Iterator<RemoteRosterEntry> it);
}
