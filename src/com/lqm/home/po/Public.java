package com.lqm.home.po;

public class Public {
    private Integer id;

    private String publickey;

    private String name;

    private String icon;

    private String publicdesc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPublickey() {
        return publickey;
    }

    public void setPublickey(String publickey) {
        this.publickey = publickey == null ? null : publickey.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public String getPublicdesc() {
        return publicdesc;
    }

    public void setPublicdesc(String publicdesc) {
        this.publicdesc = publicdesc == null ? null : publicdesc.trim();
    }
}