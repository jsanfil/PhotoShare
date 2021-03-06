package com.jsanfil.photoshare.persistence;

import com.jsanfil.photoshare.model.Photo;
import com.jsanfil.photoshare.model.PhotoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PhotoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table photos
     *
     * @mbggenerated Thu Oct 04 21:39:42 PDT 2012
     */
    int countByExample(PhotoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table photos
     *
     * @mbggenerated Thu Oct 04 21:39:42 PDT 2012
     */
    int deleteByExample(PhotoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table photos
     *
     * @mbggenerated Thu Oct 04 21:39:42 PDT 2012
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table photos
     *
     * @mbggenerated Thu Oct 04 21:39:42 PDT 2012
     */
    int insert(Photo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table photos
     *
     * @mbggenerated Thu Oct 04 21:39:42 PDT 2012
     */
    int insertSelective(Photo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table photos
     *
     * @mbggenerated Thu Oct 04 21:39:42 PDT 2012
     */
    List<Photo> selectByExample(PhotoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table photos
     *
     * @mbggenerated Thu Oct 04 21:39:42 PDT 2012
     */
    Photo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table photos
     *
     * @mbggenerated Thu Oct 04 21:39:42 PDT 2012
     */
    int updateByExampleSelective(@Param("record") Photo record, @Param("example") PhotoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table photos
     *
     * @mbggenerated Thu Oct 04 21:39:42 PDT 2012
     */
    int updateByExample(@Param("record") Photo record, @Param("example") PhotoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table photos
     *
     * @mbggenerated Thu Oct 04 21:39:42 PDT 2012
     */
    int updateByPrimaryKeySelective(Photo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table photos
     *
     * @mbggenerated Thu Oct 04 21:39:42 PDT 2012
     */
    int updateByPrimaryKey(Photo record);
    
    List<Photo> selectAll();
}