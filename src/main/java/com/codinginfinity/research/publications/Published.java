package com.codinginfinity.research.publications;

import java.util.Date;

/**
 * A class indicating that a publication has been published (ie it has a Published LifeCycleState)
 *
 * @author Gian Paolo Buffo
 */

public class Published extends LifeCycleState {
    private BibTexEntry bibTexEntry;
    private Date publicationDate;
}
