package com.search.mapping;

import com.search.dto.backend.Record;
import com.search.dto.backend.RecordDescriptor;
import com.search.dto.backend.SearchResponse;
import com.search.dto.frontend.ArticleId;
import com.search.dto.frontend.SearchResultArticle;
import ma.glasnost.orika.CustomMapper;
import ma.glasnost.orika.MappingContext;

import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

class SearchResultArticleCustomMapper extends CustomMapper<SearchResponse, SearchResultArticle> {

    @Override
    public void mapAtoB(SearchResponse source, SearchResultArticle target, MappingContext context) {

        List<ArticleId> articleIds = source.getSearchResult().getRecords().stream()
                .map(RecordDescriptor::getRecord)
                .map(Record::getFoundArticleIds)
                .filter(Objects::nonNull)
                .flatMap(Pattern.compile(",")::splitAsStream)
                .distinct()
                .map(ArticleId::new)
                .collect(Collectors.toList());

        target.setResultCount(articleIds.size());
        target.setRecords(articleIds);
    }
}
