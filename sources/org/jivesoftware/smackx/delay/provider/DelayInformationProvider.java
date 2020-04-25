package org.jivesoftware.smackx.delay.provider;

import java.text.ParseException;
import java.util.Date;
import p205i.p486d.p487a.C14051a;

public class DelayInformationProvider extends AbstractDelayInformationProvider {
    public static final DelayInformationProvider INSTANCE = new DelayInformationProvider();

    /* access modifiers changed from: protected */
    public Date parseDate(String str) throws ParseException {
        return C14051a.m60632f(str);
    }
}
