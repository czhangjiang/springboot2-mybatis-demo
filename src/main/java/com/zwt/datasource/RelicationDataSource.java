package com.zwt.datasource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class RelicationDataSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        return DataSourceHolder.get();
    }
}
