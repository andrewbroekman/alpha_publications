package com.codinginfinity.research.publications;

import java.util.Date;

/**
 * A class representing the current state of a publication.
 *
 * @author Gian Paolo Buffo
 */

public class PublicationState {
    private PublicationTarget publicationTarget;
    private PublicationDetails publicationDetails;
    private Date date;
    private LifeCycleState lifeCycleState;
    private String reason;
    // todo add PublicationType. PublicationType related classes can be in their own folder, since there are so many
    private PublicationType publicationType;
}
