package com.baidu.ueditor.define;

import com.google.common.collect.ImmutableList;

import java.util.List;

/**
 * 类名：com.web.app.wx.common.entity.WxPnEntity
 * 创建者： 邓风森 .
 * 创建时间：2015/9/7
 */
public class WxPnEntity {
    private int id;
    private String appid;
    private String appsecret;
    private String token;
    private String serverurl;
    private String encodingaeskey;
    private Integer encodingtype;
    private String uuid;
    private String loginname;
    private String loginpassword;
    private Integer binded;
    private Integer status;
    private String roles;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getAppsecret() {
        return appsecret;
    }

    public void setAppsecret(String appsecret) {
        this.appsecret = appsecret;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getServerurl() {
        return serverurl;
    }

    public void setServerurl(String serverurl) {
        this.serverurl = serverurl;
    }

    public String getEncodingaeskey() {
        return encodingaeskey;
    }

    public void setEncodingaeskey(String encodingaeskey) {
        this.encodingaeskey = encodingaeskey;
    }

    public Integer getEncodingtype() {
        return encodingtype;
    }

    public void setEncodingtype(Integer encodingtype) {
        this.encodingtype = encodingtype;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getLoginpassword() {
        return loginpassword;
    }

    public void setLoginpassword(String loginpassword) {
        this.loginpassword = loginpassword;
    }

    public Integer getBinded() {
        return binded;
    }

    public void setBinded(Integer binded) {
        this.binded = binded;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public List<String> getRoleList() {
        // 角色列表在数据库中实际以逗号分隔字符串存储，因此返回不能修改的List.
        return ImmutableList.copyOf(roles.split(","));
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WxPnEntity that = (WxPnEntity) o;

        if (id != that.id) return false;
        if (appid != null ? !appid.equals(that.appid) : that.appid != null) return false;
        if (appsecret != null ? !appsecret.equals(that.appsecret) : that.appsecret != null) return false;
        if (token != null ? !token.equals(that.token) : that.token != null) return false;
        if (serverurl != null ? !serverurl.equals(that.serverurl) : that.serverurl != null) return false;
        if (encodingaeskey != null ? !encodingaeskey.equals(that.encodingaeskey) : that.encodingaeskey != null)
            return false;
        if (encodingtype != null ? !encodingtype.equals(that.encodingtype) : that.encodingtype != null) return false;
        if (uuid != null ? !uuid.equals(that.uuid) : that.uuid != null) return false;
        if (loginname != null ? !loginname.equals(that.loginname) : that.loginname != null) return false;
        if (loginpassword != null ? !loginpassword.equals(that.loginpassword) : that.loginpassword != null)
            return false;
        if (binded != null ? !binded.equals(that.binded) : that.binded != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (roles != null ? !roles.equals(that.roles) : that.roles != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (appid != null ? appid.hashCode() : 0);
        result = 31 * result + (appsecret != null ? appsecret.hashCode() : 0);
        result = 31 * result + (token != null ? token.hashCode() : 0);
        result = 31 * result + (serverurl != null ? serverurl.hashCode() : 0);
        result = 31 * result + (encodingaeskey != null ? encodingaeskey.hashCode() : 0);
        result = 31 * result + (encodingtype != null ? encodingtype.hashCode() : 0);
        result = 31 * result + (uuid != null ? uuid.hashCode() : 0);
        result = 31 * result + (loginname != null ? loginname.hashCode() : 0);
        result = 31 * result + (loginpassword != null ? loginpassword.hashCode() : 0);
        result = 31 * result + (binded != null ? binded.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (roles != null ? roles.hashCode() : 0);
        return result;
    }
}
