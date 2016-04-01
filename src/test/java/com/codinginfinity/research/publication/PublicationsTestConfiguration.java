
package com.codinginfinity.research.publication;

import com.codinginfinity.research.publication.mocking.PublicationsMock;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 *
 * @author gershom
 */
@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class PublicationsTestConfiguration {
    @Bean
    public Publications publicationsMock() {
        return new PublicationsMock();
    } 
}
