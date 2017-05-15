package com.boombar.drjoshi.fragment.Mainfile;

/**
 * Created by User on 19-02-2017.
 */
public class DataObject {
    private String mText1;
    private String mText2;
    private int imageid;

    DataObject (String text1, String text2,int id) {
        mText1 = text1;
        mText2 = text2;
       imageid=id;
    }
    public String getmText1() {
        return mText1;
    }

    public void setmText1(String mText1) {
        this.mText1 = mText1;
    }
    public int getimageid() {
        return imageid;
    }

    public void setImageid(int imageid) {
        this.imageid = imageid;
    }
    public String getmText2() {
        return mText2;
    }

    public void setmText2(String mText2) {
        this.mText2 = mText2;
    }
}
