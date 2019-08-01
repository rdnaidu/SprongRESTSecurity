package com.search.mapping;

import ma.glasnost.orika.CustomConverter;
import ma.glasnost.orika.MappingContext;
import ma.glasnost.orika.metadata.Type;
import org.apache.commons.lang3.StringUtils;

/**
 * This {@link CustomConverter} sets replaces non-existing prices with the value 0.0.
 */
public class PriceConverter extends CustomConverter<String, String> {
    @Override
    public String convert(String source, Type<? extends String> destinationType, MappingContext mappingContext) {
        return StringUtils.isNotEmpty(source) ? source : "0.00";
    }
}
