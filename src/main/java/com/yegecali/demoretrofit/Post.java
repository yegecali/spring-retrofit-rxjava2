package com.yegecali.demoretrofit;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Post {
    private Long userId;
    private Long id;
    private String title;
    private String body;
}
