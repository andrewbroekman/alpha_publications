
package com.codinginfinity.research.publications;

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
