package com.search.mapping;

import ma.glasnost.orika.CustomConverter;
import ma.glasnost.orika.MappingContext;
import ma.glasnost.orika.metadata.Type;
import org.apache.commons.lang3.StringUtils;

/**
 * This {@link CustomConverter} transforms URLS from factfinder to match the responsive frontend's needs by replacing
 * the provided format string for PGO or PDP with the MRD format.
 */
class ModelPictureUrlConverter extends CustomConverter<String, String> {

    static final String FALLBACK_IMAGE = "//images.kkeu.de/is/image/BEG/KK_de_no-image?$pdplarge-mrd$";

    @Override
    public String convert(String source, Type<? extends String> destinationType, MappingContext mappingContext) {
        if (StringUtils.isEmpty(source)) {
            return FALLBACK_IMAGE;
        } else {
            return source.replaceFirst("((pgo|pdp)large)(-[a-z]{3})?", "$1-mrd");
        }
    }
}
