package com.saurabhshcs.tinyurl.document;

import lombok.Builder;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Builder
@Document
public class TinyURL {

    private Integer id;
    private String url;
    private String originalUrl;
}
