package com.search.mapping;

import com.search.dto.backend.ValueList;
import com.search.dto.frontend.SearchResult;
import ma.glasnost.orika.CustomMapper;
import ma.glasnost.orika.MappingContext;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * This {@link CustomMapper} maps a list of {@link com.search.dto.backend.Filter}s to a {@code Map<String,List<String>>},
 * by using the filter's name as key and the values from the valueList as items in the associated List.
 */
class SearchResultCustomMapper extends CustomMapper<com.search.dto.backend.SearchResult, SearchResult> {
    @Override
    public void mapAtoB(com.search.dto.backend.SearchResult source, SearchResult target, MappingContext context) {
        if (null == source.getFilters()) {
            return;
        }
        Map<String, List<String>> filterMap = new HashMap<>();
        source.getFilters()
                .forEach(filter -> filterMap.put(
                        filter.getName(),
                        filter.getValueList().stream()
                                .map(ValueList::getValue)
                                .collect(Collectors.toList())
                ));
        target.setFilters(filterMap);
    }
}
