package com.codinginfinity.research.publications;

import java.net.URL;

/**
 * A class showing the intended target of the publication.
 *
 * @author Gian Paolo Buffo
 * @author Gershom Maluleke
 */

public class PublicationTarget {
    private String name;
    private URL webSite;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the webSite
     */
    public URL getWebSite() {
        return webSite;
    }

    /**
     * @param webSite the webSite to set
     */
    public void setWebSite(URL webSite) {
        this.webSite = webSite;
    }
}
