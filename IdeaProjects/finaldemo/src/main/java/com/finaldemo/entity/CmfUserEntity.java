package com.finaldemo.entity;

import javax.persistence.*;

public class CmfUserEntity {
    private long id;
    private byte userType;
    private byte sex;
    private int birthday;
    private int lastLoginTime;
    private int score;
    private int coin;
    private int createTime;
    private byte userStatus;
    private String userLogin;
    private String userPass;
    private String userNickname;
    private String userEmail;
    private String userUrl;
    private String avatar;
    private String signature;
    private String lastLoginIp;
    private String userActivationKey;
    private String mobile;
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public byte getUserType() {
        return userType;
    }

    public void setUserType(byte userType) {
        this.userType = userType;
    }

    public byte getSex() {
        return sex;
    }

    public void setSex(byte sex) {
        this.sex = sex;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public int getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(int lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getCoin() {
        return coin;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }

    public int getCreateTime() {
        return createTime;
    }

    public void setCreateTime(int createTime) {
        this.createTime = createTime;
    }

    public byte getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(byte userStatus) {
        this.userStatus = userStatus;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserUrl() {
        return userUrl;
    }

    public void setUserUrl(String userUrl) {
        this.userUrl = userUrl;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    public String getUserActivationKey() {
        return userActivationKey;
    }

    public void setUserActivationKey(String userActivationKey) {
        this.userActivationKey = userActivationKey;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CmfUserEntity that = (CmfUserEntity) o;

        if (id != that.id) return false;
        if (userType != that.userType) return false;
        if (sex != that.sex) return false;
        if (birthday != that.birthday) return false;
        if (lastLoginTime != that.lastLoginTime) return false;
        if (score != that.score) return false;
        if (coin != that.coin) return false;
        if (createTime != that.createTime) return false;
        if (userStatus != that.userStatus) return false;
        if (userLogin != null ? !userLogin.equals(that.userLogin) : that.userLogin != null) return false;
        if (userPass != null ? !userPass.equals(that.userPass) : that.userPass != null) return false;
        if (userNickname != null ? !userNickname.equals(that.userNickname) : that.userNickname != null) return false;
        if (userEmail != null ? !userEmail.equals(that.userEmail) : that.userEmail != null) return false;
        if (userUrl != null ? !userUrl.equals(that.userUrl) : that.userUrl != null) return false;
        if (avatar != null ? !avatar.equals(that.avatar) : that.avatar != null) return false;
        if (signature != null ? !signature.equals(that.signature) : that.signature != null) return false;
        if (lastLoginIp != null ? !lastLoginIp.equals(that.lastLoginIp) : that.lastLoginIp != null) return false;
        if (userActivationKey != null ? !userActivationKey.equals(that.userActivationKey) : that.userActivationKey != null)
            return false;
        if (mobile != null ? !mobile.equals(that.mobile) : that.mobile != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) userType;
        result = 31 * result + (int) sex;
        result = 31 * result + birthday;
        result = 31 * result + lastLoginTime;
        result = 31 * result + score;
        result = 31 * result + coin;
        result = 31 * result + createTime;
        result = 31 * result + (int) userStatus;
        result = 31 * result + (userLogin != null ? userLogin.hashCode() : 0);
        result = 31 * result + (userPass != null ? userPass.hashCode() : 0);
        result = 31 * result + (userNickname != null ? userNickname.hashCode() : 0);
        result = 31 * result + (userEmail != null ? userEmail.hashCode() : 0);
        result = 31 * result + (userUrl != null ? userUrl.hashCode() : 0);
        result = 31 * result + (avatar != null ? avatar.hashCode() : 0);
        result = 31 * result + (signature != null ? signature.hashCode() : 0);
        result = 31 * result + (lastLoginIp != null ? lastLoginIp.hashCode() : 0);
        result = 31 * result + (userActivationKey != null ? userActivationKey.hashCode() : 0);
        result = 31 * result + (mobile != null ? mobile.hashCode() : 0);
        return result;
    }
}
