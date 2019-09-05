package com.example.sample19_adapterview_exam;

public class CustomDTO {

    private int imgIcon;
    private  String textTitle;
    private  String textContent;

    public int getImgIcon() {
        return imgIcon;
    }

    public String getTextTitle() {
        return textTitle;
    }

    public String getTextContent() {
        return textContent;
    }

    public void setImgIcon(int imgIcon) {
        this.imgIcon = imgIcon;
    }

    public void setTextTitle(String textTitle) {
        this.textTitle = textTitle;
    }

    public void setTextContent(String textContent) {
        this.textContent = textContent;
    }

    public CustomDTO(int imgIcon, String textTitle, String textContent) {
        this.imgIcon = imgIcon;
        this.textTitle = textTitle;
        this.textContent = textContent;
    }

    @Override
    public String toString() {
        return "CustomDTO{" +
                "imgIcon=" + imgIcon +
                ", textTitle='" + textTitle + '\'' +
                ", textContent='" + textContent + '\'' +
                '}';
    }
}
