package com.hgsil.wwymusicplayer.beans;

import java.util.List;

/**
 * Created by Administrator on 2017/8/20 0020.
 */

public class User {

    /**
     * loginType : 1
     * clientId : e2e62c2e5626fe5619c53869433f7dd96f579d2a7440c824f413ed2ca1b52a516ca529d18b7d51a647b1428987176f33
     * effectTime : 2147483647
     * code : 200
     * account : {"id":115069362,"userName":"1_13452315058","type":1,"status":0,"whitelistAuthority":0,"createTime":1450544529745,"salt":"[B@9059dc","tokenVersion":0,"ban":0,"baoyueVersion":1,"donateVersion":0,"vipType":0,"viptypeVersion":0,"anonimousUser":false}
     * profile : {"accountStatus":0,"userId":115069362,"nickname":"Hgsil","remarkName":null,"province":500000,"city":500105,"birthday":-2209017600000,"gender":0,"vipType":0,"expertTags":null,"experts":{},"avatarImgId":3445869447800024,"backgroundImgId":1413971966371360,"userType":0,"authStatus":0,"mutual":false,"defaultAvatar":false,"avatarUrl":"http://p1.music.126.net/Qz3gJlgj2Bc1wgXXmHHNjg==/3445869447800024.jpg","avatarImgIdStr":"3445869447800024","backgroundImgIdStr":"1413971966371360","description":"","backgroundUrl":"http://p1.music.126.net/yqSj-ww-VpGu35CMuqOWMA==/1413971966371360.jpg","detailDescription":"","djStatus":0,"followed":false,"signature":"","authority":0}
     * bindings : [{"userId":115069362,"tokenJsonStr":"{\"cellphone\":\"13452315058\",\"hasPassword\":true}","expired":false,"expiresIn":2147483647,"refreshTime":1450544529,"url":"","id":54835045,"type":1}]
     */

    private int loginType;
    private String clientId;
    private int effectTime;
    private int code;
    private AccountBean account;
    private ProfileBean profile;
    private List<BindingsBean> bindings;

    public int getLoginType() {
        return loginType;
    }

    public void setLoginType(int loginType) {
        this.loginType = loginType;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public int getEffectTime() {
        return effectTime;
    }

    public void setEffectTime(int effectTime) {
        this.effectTime = effectTime;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public AccountBean getAccount() {
        return account;
    }

    public void setAccount(AccountBean account) {
        this.account = account;
    }

    public ProfileBean getProfile() {
        return profile;
    }

    public void setProfile(ProfileBean profile) {
        this.profile = profile;
    }

    public List<BindingsBean> getBindings() {
        return bindings;
    }

    public void setBindings(List<BindingsBean> bindings) {
        this.bindings = bindings;
    }

    public static class AccountBean {
        /**
         * id : 115069362
         * userName : 1_13452315058
         * type : 1
         * status : 0
         * whitelistAuthority : 0
         * createTime : 1450544529745
         * salt : [B@9059dc
         * tokenVersion : 0
         * ban : 0
         * baoyueVersion : 1
         * donateVersion : 0
         * vipType : 0
         * viptypeVersion : 0
         * anonimousUser : false
         */

        private int id;
        private String userName;
        private int type;
        private int status;
        private int whitelistAuthority;
        private long createTime;
        private String salt;
        private int tokenVersion;
        private int ban;
        private int baoyueVersion;
        private int donateVersion;
        private int vipType;
        private int viptypeVersion;
        private boolean anonimousUser;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public int getWhitelistAuthority() {
            return whitelistAuthority;
        }

        public void setWhitelistAuthority(int whitelistAuthority) {
            this.whitelistAuthority = whitelistAuthority;
        }

        public long getCreateTime() {
            return createTime;
        }

        public void setCreateTime(long createTime) {
            this.createTime = createTime;
        }

        public String getSalt() {
            return salt;
        }

        public void setSalt(String salt) {
            this.salt = salt;
        }

        public int getTokenVersion() {
            return tokenVersion;
        }

        public void setTokenVersion(int tokenVersion) {
            this.tokenVersion = tokenVersion;
        }

        public int getBan() {
            return ban;
        }

        public void setBan(int ban) {
            this.ban = ban;
        }

        public int getBaoyueVersion() {
            return baoyueVersion;
        }

        public void setBaoyueVersion(int baoyueVersion) {
            this.baoyueVersion = baoyueVersion;
        }

        public int getDonateVersion() {
            return donateVersion;
        }

        public void setDonateVersion(int donateVersion) {
            this.donateVersion = donateVersion;
        }

        public int getVipType() {
            return vipType;
        }

        public void setVipType(int vipType) {
            this.vipType = vipType;
        }

        public int getViptypeVersion() {
            return viptypeVersion;
        }

        public void setViptypeVersion(int viptypeVersion) {
            this.viptypeVersion = viptypeVersion;
        }

        public boolean isAnonimousUser() {
            return anonimousUser;
        }

        public void setAnonimousUser(boolean anonimousUser) {
            this.anonimousUser = anonimousUser;
        }
    }

    public static class ProfileBean {
        /**
         * accountStatus : 0
         * userId : 115069362
         * nickname : Hgsil
         * remarkName : null
         * province : 500000
         * city : 500105
         * birthday : -2209017600000
         * gender : 0
         * vipType : 0
         * expertTags : null
         * experts : {}
         * avatarImgId : 3445869447800024
         * backgroundImgId : 1413971966371360
         * userType : 0
         * authStatus : 0
         * mutual : false
         * defaultAvatar : false
         * avatarUrl : http://p1.music.126.net/Qz3gJlgj2Bc1wgXXmHHNjg==/3445869447800024.jpg
         * avatarImgIdStr : 3445869447800024
         * backgroundImgIdStr : 1413971966371360
         * description :
         * backgroundUrl : http://p1.music.126.net/yqSj-ww-VpGu35CMuqOWMA==/1413971966371360.jpg
         * detailDescription :
         * djStatus : 0
         * followed : false
         * signature :
         * authority : 0
         */

        private int accountStatus;
        private int userId;
        private String nickname;
        private Object remarkName;
        private int province;
        private int city;
        private long birthday;
        private int gender;
        private int vipType;
        private Object expertTags;
        private ExpertsBean experts;
        private long avatarImgId;
        private long backgroundImgId;
        private int userType;
        private int authStatus;
        private boolean mutual;
        private boolean defaultAvatar;
        private String avatarUrl;
        private String avatarImgIdStr;
        private String backgroundImgIdStr;
        private String description;
        private String backgroundUrl;
        private String detailDescription;
        private int djStatus;
        private boolean followed;
        private String signature;
        private int authority;

        public int getAccountStatus() {
            return accountStatus;
        }

        public void setAccountStatus(int accountStatus) {
            this.accountStatus = accountStatus;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public Object getRemarkName() {
            return remarkName;
        }

        public void setRemarkName(Object remarkName) {
            this.remarkName = remarkName;
        }

        public int getProvince() {
            return province;
        }

        public void setProvince(int province) {
            this.province = province;
        }

        public int getCity() {
            return city;
        }

        public void setCity(int city) {
            this.city = city;
        }

        public long getBirthday() {
            return birthday;
        }

        public void setBirthday(long birthday) {
            this.birthday = birthday;
        }

        public int getGender() {
            return gender;
        }

        public void setGender(int gender) {
            this.gender = gender;
        }

        public int getVipType() {
            return vipType;
        }

        public void setVipType(int vipType) {
            this.vipType = vipType;
        }

        public Object getExpertTags() {
            return expertTags;
        }

        public void setExpertTags(Object expertTags) {
            this.expertTags = expertTags;
        }

        public ExpertsBean getExperts() {
            return experts;
        }

        public void setExperts(ExpertsBean experts) {
            this.experts = experts;
        }

        public long getAvatarImgId() {
            return avatarImgId;
        }

        public void setAvatarImgId(long avatarImgId) {
            this.avatarImgId = avatarImgId;
        }

        public long getBackgroundImgId() {
            return backgroundImgId;
        }

        public void setBackgroundImgId(long backgroundImgId) {
            this.backgroundImgId = backgroundImgId;
        }

        public int getUserType() {
            return userType;
        }

        public void setUserType(int userType) {
            this.userType = userType;
        }

        public int getAuthStatus() {
            return authStatus;
        }

        public void setAuthStatus(int authStatus) {
            this.authStatus = authStatus;
        }

        public boolean isMutual() {
            return mutual;
        }

        public void setMutual(boolean mutual) {
            this.mutual = mutual;
        }

        public boolean isDefaultAvatar() {
            return defaultAvatar;
        }

        public void setDefaultAvatar(boolean defaultAvatar) {
            this.defaultAvatar = defaultAvatar;
        }

        public String getAvatarUrl() {
            return avatarUrl;
        }

        public void setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
        }

        public String getAvatarImgIdStr() {
            return avatarImgIdStr;
        }

        public void setAvatarImgIdStr(String avatarImgIdStr) {
            this.avatarImgIdStr = avatarImgIdStr;
        }

        public String getBackgroundImgIdStr() {
            return backgroundImgIdStr;
        }

        public void setBackgroundImgIdStr(String backgroundImgIdStr) {
            this.backgroundImgIdStr = backgroundImgIdStr;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getBackgroundUrl() {
            return backgroundUrl;
        }

        public void setBackgroundUrl(String backgroundUrl) {
            this.backgroundUrl = backgroundUrl;
        }

        public String getDetailDescription() {
            return detailDescription;
        }

        public void setDetailDescription(String detailDescription) {
            this.detailDescription = detailDescription;
        }

        public int getDjStatus() {
            return djStatus;
        }

        public void setDjStatus(int djStatus) {
            this.djStatus = djStatus;
        }

        public boolean isFollowed() {
            return followed;
        }

        public void setFollowed(boolean followed) {
            this.followed = followed;
        }

        public String getSignature() {
            return signature;
        }

        public void setSignature(String signature) {
            this.signature = signature;
        }

        public int getAuthority() {
            return authority;
        }

        public void setAuthority(int authority) {
            this.authority = authority;
        }

        public static class ExpertsBean {
        }
    }

    public static class BindingsBean {
        /**
         * userId : 115069362
         * tokenJsonStr : {"cellphone":"13452315058","hasPassword":true}
         * expired : false
         * expiresIn : 2147483647
         * refreshTime : 1450544529
         * url :
         * id : 54835045
         * type : 1
         */

        private int userId;
        private String tokenJsonStr;
        private boolean expired;
        private int expiresIn;
        private int refreshTime;
        private String url;
        private int id;
        private int type;

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public String getTokenJsonStr() {
            return tokenJsonStr;
        }

        public void setTokenJsonStr(String tokenJsonStr) {
            this.tokenJsonStr = tokenJsonStr;
        }

        public boolean isExpired() {
            return expired;
        }

        public void setExpired(boolean expired) {
            this.expired = expired;
        }

        public int getExpiresIn() {
            return expiresIn;
        }

        public void setExpiresIn(int expiresIn) {
            this.expiresIn = expiresIn;
        }

        public int getRefreshTime() {
            return refreshTime;
        }

        public void setRefreshTime(int refreshTime) {
            this.refreshTime = refreshTime;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }
    }
}
