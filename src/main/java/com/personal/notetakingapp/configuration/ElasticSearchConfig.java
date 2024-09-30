package com.personal.notetakingapp.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.elc.ElasticsearchConfiguration;

@Configuration
public class ElasticSearchConfig extends ElasticsearchConfiguration {
    @Override
    public ClientConfiguration clientConfiguration() {
        return ClientConfiguration.builder()
                .connectedTo("localhost:9200")
                .usingSsl("2c98260073564b432d3e16c81fb9d6658f201e97cee924769db7d21ad811edb6") //add the generated sha-256 fingerprint
                .withBasicAuth("elastic", "zWTr9Wp56CsNyB6M-irY") //add your username and password
                .build();
    }
}