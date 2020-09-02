package model;

import java.util.Collections;

class DoIt {
    public void bifurcationOfString(String s) {
        char[] ch = s.toCharArray();
        int x = ch.length-1;

        for (int y=x;y>=0;y--)
            Integer.parseInt(String.valueOf(ch[x]));
        /*for(int i=s.length()-1;i>=0;i--){
            Integer.parseInt();
        }*/
    }
}