import java.net.URI;

public class ResolvingRelativeURI {
    public static void main(String[] args)throws Exception {
        URI uri = URI.create("https://www.w3.org");
        URI relativeUri = URI.create("/WAI/WCAG22/quickref/?versions=2.1");
        URI res = uri.resolve(relativeUri);
        System.out.println("relative URI : "+res);
        
    }
}
