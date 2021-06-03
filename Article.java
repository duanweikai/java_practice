package model;

import com.fasterxml.jackson.annotation.JsonInclude;

public class Article {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer id;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer authorId;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String authorName;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String authorAvatar;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String title;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String contentBrief;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer viewCount;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer likeCount;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer commentCount;
}
