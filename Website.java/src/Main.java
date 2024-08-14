import java.lang.*;
import java.util.*;
class Website {
    public static void main(String[] args) {
   /*     String url, protocol;
        System.out.println("enter the website name");
        Scanner scan = new Scanner(System.in);
        url = scan.nextLine();
        protocol = url.substring(0, url.indexOf(":"));
        if (protocol.equals("http"))
            System.out.println("hyper text transfer protocol");
         else if (protocol.equals("https"))
            System.out.println("hyper text transfer protocol secure");
        else if (protocol.equals("ftp"))
            System.out.println("file transfer protocol");
         else
            System.out.println("not recognise");

       String web = url.substring(url.lastIndexOf(".")+1);
        if (web.equals("com"))
            System.out.println("commercial");
         else if (web.equals("org"))
            System.out.println("organization");
        else if (web.equals("gov"))
            System.out.println("government");*/

String url,protocol,type;
Scanner scan = new Scanner(System.in);
System.out.println("enter website name");
url = scan.nextLine();
 protocol =url.substring(0,url.indexOf(":"));
 type = url.substring(url.lastIndexOf(".")+1);
 switch(protocol) {
     case "http":
         System.out.println("hyper text transfer protocol");
         break;
     case "https":
         System.out.println("hyper text transfer protocol secure");
         break;
     case "ftp":
         System.out.println("file transfer protocol");
         break;
 }
 switch (type)
 {
     case "com":
         System.out.println("commercial");
         break;
     case "gov":
         System.out.println("government");
         break;
     case "in":
         System.out.println("indian");
         break;
     case "org":
         System.out.println("organization");
         break;
 }
 }
}
