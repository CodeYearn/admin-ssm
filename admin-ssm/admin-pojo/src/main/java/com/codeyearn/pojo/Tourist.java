package com.codeyearn.pojo;

/**
 * @Author CaiYu
 * @Data 2019/5/7 19:08
 * @CurrentGoal 月薪过万, 再挑战年薪20万！
 */
public class Tourist {

    private Integer touristID;
    private String touristName;
    private String touristSex;
    private String touristPhone;

    private Integer touristCredentialsType;
    private String touristCredentialsTypeString;  //游客身份类型字符串表示

    private String touristCredentialsNumber;

    private Integer touristType;
    private String touristTypeString;  //游客类型字符串表示

    public Tourist() {
    }

    public Integer getTouristID() {
        return touristID;
    }

    public void setTouristID(Integer touristID) {
        this.touristID = touristID;
    }

    public String getTouristName() {
        return touristName;
    }

    public void setTouristName(String touristName) {
        this.touristName = touristName;
    }

    public String getTouristSex() {
        return touristSex;
    }

    public void setTouristSex(String touristSex) {
        this.touristSex = touristSex;
    }

    public String getTouristPhone() {
        return touristPhone;
    }

    public void setTouristPhone(String touristPhone) {
        this.touristPhone = touristPhone;
    }

    public Integer getTouristCredentialsType() {
        return touristCredentialsType;
    }

    public void setTouristCredentialsType(Integer touristCredentialsType) {
        this.touristCredentialsType = touristCredentialsType;
    }

    public String getTouristCredentialsTypeString() {
        if (this.touristCredentialsType != null){
            if (this.touristCredentialsType == 0){
                this.touristCredentialsTypeString = "身份证";
            }else if (this.touristCredentialsType == 1){
                this.touristCredentialsTypeString = "护照";
            }else if (this.touristCredentialsType == 2){
                this.touristCredentialsTypeString = "军官证";
            }else{
                this.touristCredentialsTypeString = "其它";
            }
        }
        return touristCredentialsTypeString;
    }

    public void setTouristCredentialsTypeString(String touristCredentialsTypeString) {
        this.touristCredentialsTypeString = touristCredentialsTypeString;
    }

    public String getTouristCredentialsNumber() {
        return touristCredentialsNumber;
    }

    public void setTouristCredentialsNumber(String touristCredentialsNumber) {
        this.touristCredentialsNumber = touristCredentialsNumber;
    }

    public Integer getTouristType() {
        return touristType;
    }

    public void setTouristType(Integer touristType) {
        this.touristType = touristType;
    }

    public String getTouristTypeString() {
        if (this.touristType != null){
            if (this.touristType == 0){
                this.touristTypeString = "儿童";
            }else if (this.touristType ==1){
                this.touristTypeString = "成人";
            }else{
                this.touristTypeString = "其它";
            }
        }
        return touristTypeString;
    }

    public void setTouristTypeString(String touristTypeString) {
        this.touristTypeString = touristTypeString;
    }

    @Override
    public String toString() {
        return "Tourist{" +
                "touristID=" + touristID +
                ", touristName='" + touristName + '\'' +
                ", touristSex='" + touristSex + '\'' +
                ", touristPhone='" + touristPhone + '\'' +
                ", touristCredentialsType=" + touristCredentialsType +
                ", touristCredentialsTypeString='" + touristCredentialsTypeString + '\'' +
                ", touristCredentialsNumber='" + touristCredentialsNumber + '\'' +
                ", touristType=" + touristType +
                ", touristTypeString='" + touristTypeString + '\'' +
                '}';
    }
}
