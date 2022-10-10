package com.hbnu.array.day1004.Sort;

/**
 * @author Luanhao
 * @date 2022年10月04日 11:27
 */
public class DefaultString {
    private String oldstr;
    private String newstr;

    public DefaultString() {
    }

    public DefaultString(String oldstr, String newstr) {
        this.oldstr = oldstr;
        this.newstr = newstr;
    }

    public String getOldstr() {
        return oldstr;
    }

    public void setOldstr(String oldstr) {
        this.oldstr = oldstr;
    }

    public String getNewstr() {
        return newstr;
    }

    public void setNewstr(String newstr) {
        this.newstr = newstr;
    }

    public void sort() {
        String temp;

        if (oldstr.compareTo(newstr) > 0) {
            temp = this.oldstr;
            this.oldstr = this.newstr;
            this.newstr = temp;
        }
    }
}
