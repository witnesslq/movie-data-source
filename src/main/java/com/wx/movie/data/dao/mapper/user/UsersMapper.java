package com.wx.movie.data.dao.mapper.user;

import com.wx.movie.data.dao.entity.user.Users;

public interface UsersMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_users
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer uid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_users
     *
     * @mbggenerated
     */
    int insert(Users record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_users
     *
     * @mbggenerated
     */
    int insertSelective(Users record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_users
     *
     * @mbggenerated
     */

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_users
     *
     * @mbggenerated
     */
    Users selectByPrimaryKey(Integer uid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_users
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Users record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_users
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Users record);
}