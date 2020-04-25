package org.jivesoftware.smack.parsing;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ExceptionLoggingCallback extends ParsingExceptionCallback {
    private static final Logger LOGGER = Logger.getLogger(ExceptionLoggingCallback.class.getName());

    public void handleUnparsablePacket(UnparsablePacket unparsablePacket) throws Exception {
        LOGGER.log(Level.SEVERE, "Smack message parsing exception: ", unparsablePacket.getParsingException());
        Logger logger = LOGGER;
        StringBuilder sb = new StringBuilder();
        sb.append("Unparsed content: ");
        sb.append(unparsablePacket.getContent());
        logger.severe(sb.toString());
    }
}
