package com.lqm.home.po;

public class Village {
    private Integer id;

    private String villageIcon;

    private String title;

    private String villageDesc;

    private Integer attentionNum;

    private Integer postNum;

    private String province;

    private String city;

    private String district;

    private String createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVillageIcon() {
        return villageIcon;
    }

    public void setVillageIcon(String villageIcon) {
        this.villageIcon = villageIcon == null ? null : villageIcon.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getVillageDesc() {
        return villageDesc;
    }

    public void setVillageDesc(String villageDesc) {
        this.villageDesc = villageDesc == null ? null : villageDesc.trim();
    }

    public Integer getAttentionNum() {
        return attentionNum;
    }

    public void setAttentionNum(Integer attentionNum) {
        this.attentionNum = attentionNum;
    }

    public Integer getPostNum() {
        return postNum;
    }

    public void setPostNum(Integer postNum) {
        this.postNum = postNum;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }
}