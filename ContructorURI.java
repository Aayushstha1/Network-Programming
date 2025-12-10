import java.net.URI;

public class ContructorURI {
    public static void main(String[] args) throws Exception {

        URI uri = new URI("https://www.w3schools.com/html/html_intro.asp");
        System.out.println(uri);

        URI uri1 = URI.create("https://chatgpt.com");
        System.out.println(uri1);

        URI uri2 = URI.create("https://www.tutorialspoint.com/java/index.htm");
        System.out.println(uri2);

        URI uri3 = URI.create("https://www.w3.org/WAI/standards-guidelines/wcag/");
        System.out.println(uri3);

        URI u = new URI("https",  "user:pass", "example.com", 8080,  "/account","id=20", null);

        System.out.println(u.getScheme());
    }
}
