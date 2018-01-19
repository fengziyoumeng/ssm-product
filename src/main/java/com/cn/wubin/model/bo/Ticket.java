package com.cn.wubin.model.bo;

import java.io.Serializable;
import java.util.Date;

public class Ticket implements Serializable {

	private static final long serialVersionUID = -7876943226130377978L;
	private String ticketId;   		//session_id
	private String loginName;  		//目前注册号就是手机号

	//业务相关
	private String userId;
	private Date registTime;   		//注册时间
	private Long channeId;      		//渠道编码
	private String invitationCode;  //邀请编码
	private String registerClient;  //注册平台
	private String level; 				//等级
	private String loginPwd;		//登录密码
	private String trade_pwd;       //交易密码

	//权限相关
	private Date lastAccessTime;    //最近访问时间
	private int status;   			//1: 可以正常访问 2:被屏蔽 （在后台管理要同时变更redis和数据中的用户状态）
	private int platformType;    //登录时平台类型   1：ios、2：android、3：h5、4：pc


	//微信相关
	private String openId;     		//openid
	private String nickname;   		//微信昵称
	private String headimgurl; 		//用户头像

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public String getTicketId() {
		return ticketId;
	}

	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Date getRegistTime() {
		return registTime;
	}

	public void setRegistTime(Date registTime) {
		this.registTime = registTime;
	}

	public Long getChanneId() {
		return channeId;
	}

	public void setChanneId(Long channeId) {
		this.channeId = channeId;
	}

	public String getInvitationCode() {
		return invitationCode;
	}

	public void setInvitationCode(String invitationCode) {
		this.invitationCode = invitationCode;
	}

	public String getRegisterClient() {
		return registerClient;
	}

	public void setRegisterClient(String registerClient) {
		this.registerClient = registerClient;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getLoginPwd() {
		return loginPwd;
	}

	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}

	public String getTrade_pwd() {
		return trade_pwd;
	}

	public void setTrade_pwd(String trade_pwd) {
		this.trade_pwd = trade_pwd;
	}

	public Date getLastAccessTime() {
		return lastAccessTime;
	}

	public void setLastAccessTime(Date lastAccessTime) {
		this.lastAccessTime = lastAccessTime;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getPlatformType() {
		return platformType;
	}

	public void setPlatformType(int platformType) {
		this.platformType = platformType;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getHeadimgurl() {
		return headimgurl;
	}

	public void setHeadimgurl(String headimgurl) {
		this.headimgurl = headimgurl;
	}

	@Override
	public String toString() {
		return "Ticket{" +
				"ticketId='" + ticketId + '\'' +
				", loginName='" + loginName + '\'' +
				", userId='" + userId + '\'' +
				", registTime=" + registTime +
				", channeId=" + channeId +
				", invitationCode='" + invitationCode + '\'' +
				", registerClient='" + registerClient + '\'' +
				", level='" + level + '\'' +
				", loginPwd='" + loginPwd + '\'' +
				", trade_pwd='" + trade_pwd + '\'' +
				", lastAccessTime=" + lastAccessTime +
				", status=" + status +
				", platformType=" + platformType +
				", openId='" + openId + '\'' +
				", nickname='" + nickname + '\'' +
				", headimgurl='" + headimgurl + '\'' +
				'}';
	}
}
