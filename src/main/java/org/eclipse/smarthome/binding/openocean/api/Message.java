package org.eclipse.smarthome.binding.openocean.api;

/**
 * General message containing only the message header.
 *
 *
 * @author Digital Concepts GmbH, T. Hennerich
 */

public class Message {

    // ===================================================================================================================================
    // Field Variables
    // ===================================================================================================================================

    private Header header = new Header();

    // ===================================================================================================================================
    // Constructor
    // ===================================================================================================================================

    public Message() {
    }

    public Message(String pContent) {
        header.setContent(pContent);
    }

    // ===================================================================================================================================
    // Getter / Setter
    // ===================================================================================================================================

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header pHeader) {
        header = pHeader;
    }
}