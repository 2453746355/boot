package com.jy.boot01.mapper.book;

import com.jy.boot01.entity.book.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface BookMapper {

    @Delete(" delete from t_books " +
            " where t_id = #{bookID} ")
    void deleteBookByID(Book book);
    @Insert(" insert into t_books " +
            " (t_name,t_author,t_price,t_type,t_tag,t_date,t_home) " +
            " values(#{bookName},#{bookAuthor},#{bookPrice},#{bookType} " +
            " ,#{bookTags},str_to_date(#{bookDateStr},'%Y-%m-%d'),#{bookHome}) ")
    void insertBook(Book book);
    @Select(" <script>" +
            " select t_id bookID, t_name bookName,t_author bookAuthor, " +
            " t_price bookPrice, t_type bookType, " +
            " t_tag bookTags, date_format(t_date, '%Y-%m-%d') bookDateStr, " +
            " t_home bookHome from t_books" +
            " where 1 = 1" +
            " <if test='null != bookName and \"\" != bookName'>" +
            " and t_name like concat('%', #{bookName}, '%')" +
            " </if>" +
            " <if test='0 &lt; bookHome'>" +
            " and t_home = #{bookHome}" +
            " </if>" +
            " </script>" )

    List<Book> selectBookList(Book book);

    void updateBookByID(Book book);

    @Select(" select t_id bookID, t_name bookName,t_author bookAuthor, " +
            " t_price bookPrice, t_type bookType, " +
            " t_tag bookTags, date_format(t_date, '%Y-%m-%d') bookDateStr, " +
            " t_home bookHome " +
            " from t_books " +
            " where t_id = #{bookID} ")
    Book selectBookInfoByID(Book book);


    @Update(" update t_books " +
            " set t_name = #{bookName}, " +
            " t_author = #{bookAuthor}, " +
            " t_price = #{bookPrice}, " +
            " t_type = #{bookType}, " +
            " t_tag = #{bookTags}, " +
            " t_date = str_to_date(#{bookDateStr}, '%Y-%m-%d'), " +
            " t_home = #{bookHome} " +
            " where t_id = #{bookID} ")
    void updateBookInfoByID(Book book);
}
