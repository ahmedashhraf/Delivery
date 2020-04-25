package org.jivesoftware.smackx.workgroup.agent;

import com.mrsool.utils.C11644i;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import org.jivesoftware.smackx.workgroup.QueueUser;

public class WorkgroupQueue {
    private int averageWaitTime = -1;
    private int currentChats = 0;
    private int maxChats = 0;
    private String name;
    private Date oldestEntry = null;
    private Status status = Status.CLOSED;
    private Set<QueueUser> users = Collections.emptySet();

    public static class Status {
        public static final Status ACTIVE = new Status("active");
        public static final Status CLOSED = new Status(C11644i.f33433v3);
        public static final Status OPEN = new Status("open");
        private String value;

        private Status(String str) {
            this.value = str;
        }

        public static Status fromString(String str) {
            if (str == null) {
                return null;
            }
            String lowerCase = str.toLowerCase(Locale.US);
            if (OPEN.toString().equals(lowerCase)) {
                return OPEN;
            }
            if (ACTIVE.toString().equals(lowerCase)) {
                return ACTIVE;
            }
            if (CLOSED.toString().equals(lowerCase)) {
                return CLOSED;
            }
            return null;
        }

        public String toString() {
            return this.value;
        }
    }

    WorkgroupQueue(String str) {
        this.name = str;
    }

    public int getAverageWaitTime() {
        return this.averageWaitTime;
    }

    public int getCurrentChats() {
        return this.currentChats;
    }

    public int getMaxChats() {
        return this.maxChats;
    }

    public String getName() {
        return this.name;
    }

    public Date getOldestEntry() {
        return this.oldestEntry;
    }

    public Status getStatus() {
        return this.status;
    }

    public int getUserCount() {
        Set<QueueUser> set = this.users;
        if (set == null) {
            return 0;
        }
        return set.size();
    }

    public Iterator<QueueUser> getUsers() {
        Set<QueueUser> set = this.users;
        if (set == null) {
            return new HashSet().iterator();
        }
        return Collections.unmodifiableSet(set).iterator();
    }

    /* access modifiers changed from: 0000 */
    public void setAverageWaitTime(int i) {
        this.averageWaitTime = i;
    }

    /* access modifiers changed from: 0000 */
    public void setCurrentChats(int i) {
        this.currentChats = i;
    }

    /* access modifiers changed from: 0000 */
    public void setMaxChats(int i) {
        this.maxChats = i;
    }

    /* access modifiers changed from: 0000 */
    public void setOldestEntry(Date date) {
        this.oldestEntry = date;
    }

    /* access modifiers changed from: 0000 */
    public void setStatus(Status status2) {
        this.status = status2;
    }

    /* access modifiers changed from: 0000 */
    public void setUsers(Set<QueueUser> set) {
        this.users = set;
    }
}
