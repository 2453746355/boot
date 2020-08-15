package com.jy.boot01.entity.book;


import com.jy.boot01.common.util.PageUtil;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class Book extends PageUtil implements Serializable {

    private int bookID;

    private String bookName;

    private String bookAuthor;

    private String bookPrice;

    private int bookType;

    private String bookTags;

    private String bookDateStr;

    private String startDateStr;

    private String endDateStr;

    private int bookHome;
}
