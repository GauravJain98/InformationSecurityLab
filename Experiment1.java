package experiment1;

import java.util.Scanner;

public class Experiment1 {
    public static char inbound(char a){
        if(a<'a'){
            a+=26;
            return inbound(a);
        }
        if(a>'z'){
            a-=26;
            return inbound(a);
        }
        
        return a;
    }
    public static String Eadditive(char[] str,int k) {
        for(int i=0;i<str.length;i++){
            str[i]+=k;
            str[i] = inbound(str[i]);
        }
        return new String(str);
    }
    public static String Dadditive(char[] str,int k) {
        for(int i=0;i<str.length;i++){
            str[i]-=k;
            str[i] = inbound(str[i]);
        }
        return new String(str);
    }
    public static String Emultiple(char[] str,int k) {
        for(int i=0;i<str.length;i++){
            str[i]*=k;
            str[i] = inbound(str[i]);
        }
        return new String(str);
    }
    public static String Dmultiple(char[] str,int k) {
        for(int i=0;i<str.length;i++){
            str[i]/=k;
            str[i] = inbound(str[i]);
        }
        return new String(str);
    }
    public static String EmultipleMod(char[] str,int k,int g) {
        for(int i=0;i<str.length;i++){
            str[i]-='a';
            str[i]*=k;
            str[i]+=g;
            str[i] = (char) ((str[i])%26 + 'a');
            str[i] = inbound(str[i]);
        }
        return new String(str);
    }
    public static String DmultipleMod(char[] str,int k,int g) {
        for(int i=0;i<str.length;i++){
            str[i]-='a';
            str[i]-=g;            
            str[i]/=k;
            str[i] = (char) ((str[i])%26 + 'a');
            str[i] = inbound(str[i]);
        }
        return new String(str);
    }
    public static String Eauto(char[] str,int k) {
        int b;
        for(int i=0;i<str.length;i++){
            b=str[i];
            str[i]+=k;
            k=b;
            str[i] = inbound(str[i]);
        }
        return new String(str);
    }    
    public static String Eving(char[] str,char[] key) {
        int l = key.length;
        for(int i=0;i<str.length;i++){
            str[i]+=key[i%l];
            str[i] = inbound(str[i]);
        }
        return new String(str);
    }    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = 1;
        int k=2;
        int g=3;
        String pt = "dddd";//sc.nextLine();
        String ans[]=new String[7];
        String npt="Select the correct one";
        String key="this is key";
        switch(d){
            case 1: ans[0] = Eadditive(pt.toCharArray(),3); System.out.println(ans[0]);
            case 2: ans[1] = Eadditive(pt.toCharArray(),1); System.out.println(ans[1]);
            case 3: ans[2] = Eadditive(pt.toCharArray(),-1); System.out.println(ans[2]);
            case 4: ans[3] = Emultiple(pt.toCharArray(),k); System.out.println(ans[3]);
            case 5: ans[4] = EmultipleMod(pt.toCharArray(),k,g); System.out.println(ans[4]);
            case 6: ans[5] = Eauto(pt.toCharArray(),k); System.out.println(ans[5]);
            case 7: ans[6] = Eving(pt.toCharArray(),key.toCharArray()); System.out.println(ans[6]);
        }
        switch(d){
            case 1: npt = Dadditive(ans[0].toCharArray(),3); System.out.println(npt);
            case 2: npt = Dadditive(ans[1].toCharArray(),1); System.out.println(npt);
            case 3: npt = Dadditive(ans[2].toCharArray(),-1); System.out.println(npt);
            case 4: npt = Dmultiple(ans[3].toCharArray(),k); System.out.println(npt);
            case 5: npt = DmultipleMod(ans[4].toCharArray(),k,g); System.out.println(npt);
        }
    }    
}
