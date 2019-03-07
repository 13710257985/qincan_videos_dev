package com.qincan.service;

import com.qincan.pojo.UsersReport;
import com.qincan.pojo.Users;
import com.qincan.pojo.vo.UsersVO;

public interface UserService {
	
	/**
	 * 判断用户名是否存在
	 * @param username
	 * @return
	 */
	public boolean queryUsernameIsExist(String username);
	
	/**
	 * 保存用户
	 * @param user
	 */
	public void saveUser(Users user);
	
	/**
	 * 查询用户是否存在
	 * @param username password
	 */
	public Users queryUserForLogin(String username, String md5Str);
	
	/**
	 * 更新用户信息
	 * @param user
	 */
	public void updateUserInfo(Users user);

	/**
	 * 
	 * @Description 查询用户信息
	 */
	public Users queryUserInfo(String userId);
	/**
	 * @Description: 查询用户是否喜欢点赞视频
	 */
	public boolean isUserLikeVideo(String userId, String videoId);
	
	/**
	 * @Description: 增加用户和粉丝的关系
	 */
	public void saveUserFanRelation(String userId, String fanId);
	
	/**
	 * @Description: 删除用户和粉丝的关系
	 */
	public void deleteUserFanRelation(String userId, String fanId);
	
	/**
	 * @Description: 查询用户是否关注
	 */
	public boolean queryIfFollow(String userId, String fanId);
	
	/**
	 * @Description: 举报用户
	 */
	public void reportUser(UsersReport userReport);
}
