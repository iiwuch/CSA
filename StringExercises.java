public class StringExercises {
    
    public static String scroll(String word){
        int end = word.length();
        word = word.substring(1, end) + word.substring(0,1);
        return word;
    }

    public static String convertName(String name){
        String last = name.substring(0, name.indexOf(","));
        String first = name.substring(name.indexOf(",")+1);
        last = last.trim();
        first = first.trim();
        return first + " " + last;
    }

    public static String negative(String n){
        n = n.replace("0","2");
        n = n.replace("1","3");
        n = n.replace("2","1");
        n = n.replace("3","0");
        return n;
    }

    public static String convertDate(String dateA){
        String dateE;
        dateE = dateA.substring(3,6) + dateA.substring(0,3) + dateA.substring(6,10);
        return dateE;
    }

    public static String convertDate2(String dateA){
        int month = dateA.indexOf("/");
        int day = dateA.indexOf("/", month +1);
        String day1 = dateA.substring(month+1,day);
        String month1 = dateA.substring(0,month);
        String year1 = dateA.substring(day+1);
        if(day1.length()==1) day1 = "0" + day1;
        if(month1.length()==1) month1 = "0" + month1;
        return " " + day1 + "-" + month1 + "-" + year1;
    }

    public static boolean startsWith(String s, String prefix){
        return (s.indexOf(prefix) == 0);
    }

    public static boolean endsWith(String s, String suffix){
        int lsuffix = suffix.length();
        int ls = s.length();
        return (s.lastIndexOf(suffix) == ls-lsuffix);
    }

    public static String removeTag(String string, String tag){
        
        int tag1 = string.indexOf("<" + tag + ">");
        int tag2 = string.indexOf("</" + tag + ">", tag1 + 1);
        if (tag1 == -1 || tag2 == -1 || tag2 < tag1) {
            return string;
        }
        return string.substring(tag1 + tag.length() + 2, tag2);
    }
    public static void main(String[] args) {
        System.out.println(scroll("Hello World"));
        System.out.println(scroll("happy"));
        System.out.println(scroll("h"));
        System.out.println(convertName(" Reubenstein, Lori Renee "));
        System.out.println(convertName("Biden,Joe"));
        System.out.println(convertName("the Clown, Bozo"));
        System.out.println(negative("0010111001"));
        System.out.println(negative("11111111"));
        System.out.println("04/20/2014 becomes " + convertDate("04/20/2014"));
        System.out.println("04/20/2014 becomes" + convertDate2("04/20/2014"));
        System.out.println("4/20/2014 becomes" + convertDate2("4/20/2014"));
        System.out.println("04/2/2014 becomes" + convertDate2("04/2/2014"));
        System.out.println("4/2/2014 becomes" + convertDate2("4/2/2014"));
        System.out.println("\nstartsWith");
        System.out.println(startsWith("architecture", "arch"));
        System.out.println(startsWith("architecture", "a"));
        System.out.println(startsWith("arch", "architecture"));
        System.out.println(startsWith("architecture", "rch"));
        System.out.println(startsWith("architecture", "architecture"));
        System.out.println("\nendsWith");
        System.out.println(endsWith("astronomy", "nomy"));
        System.out.println(endsWith("astronomy", "y"));
        System.out.println(endsWith("astronomy", "nom"));
        System.out.println(endsWith("nomy", "astronomy"));
        System.out.println(endsWith("astronomy", "astronomy"));
        System.out.println("\nremoveTag");
        System.out.println(removeTag("<b>Hello World</b>", "b"));
        System.out.println(removeTag("<b>Hello World</b>", "head"));
        System.out.println(removeTag("Hello World</b>", "b"));
        System.out.println(removeTag("<b>Hello World", "b"));
        System.out.println(removeTag("</img>Hello World<img>", "img"));
        System.out.println(removeTag("Happy Birthday <b>Hello World</b>", "b"));
        System.out.println(removeTag("<title>Hello World</title> Happy Birthday","title"));
        System.out.println(removeTag("Happy <b>Hello World</b> Birthday", "b"));
    }
}
