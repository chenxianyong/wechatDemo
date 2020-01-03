package com.example.demo.model;

import java.util.Date;

public class Attachment {
    private Long id;

    private Integer del;

    private Date createTime;

    private Long menuId;

    private String indexPicUrl;

    private String firstPicUrl;

    private String picUrl;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getDel() {
        return del;
    }

    public void setDel(Integer del) {
        this.del = del;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    public String getIndexPicUrl() {
        return indexPicUrl;
    }

    public void setIndexPicUrl(String indexPicUrl) {
        this.indexPicUrl = indexPicUrl;
    }

    public String getFirstPicUrl() {
        return firstPicUrl;
    }

    public void setFirstPicUrl(String firstPicUrl) {
        this.firstPicUrl = firstPicUrl;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }
}