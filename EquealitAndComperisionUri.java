import java.net.URI;

public class EquealitAndComperisionUri {
    public static void main(String[] args) throws Exception {
        URI uri1=new URI("https://www.w3.org/WAI/WCAG22/quickref/?versions=2.1");
        URI uri2=new URI("https://www.w3.org/WAI/WCAG22/quickref/?versions=2.1");
        if(uri1.equals(uri2)){
            System.out.println("same");

        }
         else{
            System.out.println("Uri not same ");
        }
         int result= uri1.compareTo(uri2);
         if(result==0){
            System.out.println("same Uri");
         } else{
            System.out.println("not same ");
         }
         System.out.println("string"+ uri1.toString());
         System.out.println("AsciiString"+ uri1.toASCIIString());


    }
    
}
