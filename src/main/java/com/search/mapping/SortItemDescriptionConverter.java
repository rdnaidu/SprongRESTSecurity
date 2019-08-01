package com.search.mapping;

import com.google.common.base.CaseFormat;
import ma.glasnost.orika.CustomConverter;
import ma.glasnost.orika.MappingContext;
import ma.glasnost.orika.metadata.Type;

/**
 * This {@link CustomConverter} converts strings from lowerCamelCase to lower_underscore_format.
 */
class SortItemDescriptionConverter extends CustomConverter<String, String> {
    @Override
    public String convert(String source, Type destinationType, MappingContext mappingContext) {
        String[] split = source.split("\\.");
        if (split.length != 2) {
            return source;
        }
        String snakified = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, split[1]);

        return split[0] + "." + snakified;
    }
}
