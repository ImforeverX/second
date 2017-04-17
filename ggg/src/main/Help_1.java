package com.example.lining.ggg;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Help_1 {
    public static void main(String[] args) {

        readtext();
    }
    public static void readtext(){
        FileReader fr = null;
        BufferedReader br = null;
        FileWriter fw = null;
        BufferedWriter bufw = null;

        try {
            fr = new FileReader("D:lining2(1).mp4");
            br = new BufferedReader(fr);

            String str2 =null;
            Pattern p = Pattern.compile("1999-01-01 00:00:00");
            StringBuilder sb = new StringBuilder();
            while((str2=br.readLine())!=null){
                Matcher m = p.matcher(str2);
                if(m.find()==true){
                    Date d = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    String s = sdf.format(d);
                    str2 = str2.replaceAll("1999-01-01 00:00:00", s);
                    sb.append(str2).append("\r\n");

							/*bufw.write(str2);
							bufw.flush();
							bufw.newLine();*/
                }
                else{
                    sb.append(str2).append("\r\n");
							/*bufw.write(str2);
							bufw.flush();
							bufw.newLine();*/
                }
            }
            String s3 = sb.toString();
            fw = new FileWriter("D:lining2(first).mp4");
            bufw = new BufferedWriter(fw);
            bufw.write(s3);
            bufw.flush();

        } catch (Exception e) {

            e.printStackTrace();
        }
        finally{
            if(bufw!=null){
                try {
                    bufw.close();

                } catch (IOException e) {

                    e.printStackTrace();
                }

            }
            if(br!=null){
                try {
                    br.close();
                } catch (IOException e) {

                    e.printStackTrace();
                }
            }
        }
    }
}