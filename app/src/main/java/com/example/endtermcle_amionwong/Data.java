package com.example.endtermcle_amionwong;


public class Data  {

    private String matename;
    private String desc;
    private String url;

    public String getmaterialname() {
        return matename;
    }
    public void setmaterialname(String matname) {
        this.matename = matname;
    }

    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) { this.url = url; }

    @Override
    public String toString() {
        return "Data{" +
                "materialName='" + matename + '\'' +
                ", desc=" + desc +
                ", url=" + url +
                '}';
    }
}