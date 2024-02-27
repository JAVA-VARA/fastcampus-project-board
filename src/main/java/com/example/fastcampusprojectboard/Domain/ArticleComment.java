package com.example.fastcampusprojectboard.Domain;

import java.time.LocalDateTime;

public class ArticleComment {
    private Long id;
    private Article article;
    private String content;

    private LocalDateTime createdAt;
    private String createdBy;
    private String modifiedAt;
    private LocalDateTime updatedBy;
}
