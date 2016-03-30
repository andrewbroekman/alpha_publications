
package com.codinginfinity.research.publication;

import com.codinginfinity.research.publication.defaultImpl.Period;
import com.codinginfinity.research.publication.defaultImpl.PublicationConfidenceLevel;
import com.codinginfinity.research.publication.domain.Person;
import com.codinginfinity.research.publication.domain.Publication;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gershom
 */
public interface Publications {

    public GetPublicationForPersonResponse getPublicationsForPerson(GetPublicationForPersonRequest publicationForPersonRequest);

    public GetPublicationForGroupResponse getPublicationsForGroup(GetPublicationForGroupRequest publicationForGroupRequest);

    class GetPublicationForPersonRequest extends GetPublicationForGroupRequest{
        private Person person;

        public GetPublicationForPersonRequest(Person person) {
            this.person = person;
        }
        /**
         * @return the person
         */
        public Person getPerson() {
            return person;
        }

        /**
         * @param person the person to set
         */
        public void setPerson(Person person) {
            this.person = person;
        }

    }

    class GetPublicationForPersonResponse{
        private List<Publication> publications = new ArrayList<>();

        /**
         * @return the publications
         */
        public List<Publication> getPublications() {
            return publications;
        }

        /**
         * @param publications the publications to set
         */
        public void setPublications(List<Publication> publications) {
            this.publications = publications;
        }
        public void addPublication(Publication publication){
            publications.add(publication);
        }

    }

    class GetPublicationForGroupRequest{
        private PublicationConfidenceLevel publicationConfidenceLevel;
        private Period period;

        public GetPublicationForGroupRequest() {

        }

        /**
         * @return the publicationConfidenceLevel
         */
        public PublicationConfidenceLevel getPublicationConfidenceLevel() {
            return publicationConfidenceLevel;
        }

        /**
         * @param publicationConfidenceLevel the publicationConfidenceLevel to
         * set
         */
        public void setPublicationConfidenceLevel(PublicationConfidenceLevel publicationConfidenceLevel) {
            this.publicationConfidenceLevel = publicationConfidenceLevel;
        }

        /**
         * @return the period
         */
        public Period getPeriod() {
            return period;
        }

        /**
         * @param period the period to set
         */
        public void setPeriod(Period period) {
            this.period = period;
        }
    }
    class GetPublicationForGroupResponse extends GetPublicationForPersonResponse {
    }
}
