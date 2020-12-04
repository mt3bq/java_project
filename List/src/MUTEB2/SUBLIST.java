package MUTEB2;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

public class SUBLIST {



        @Inject
        private List<String> urlList;

        public SUBLIST() {
            urlList = new ArrayList<>();
        }

        public void printURLs() {
            urlList.add("https://pluralsight.com/search?q=java");
            urlList.add("https://medium.com/search?q=java");
            urlList.add("https://stackoverflow.com/questions/tagged/java");
            urlList.add("https://stackoverflow.com/search?q=java+list");
            urlList.add("https://reddit.com/r/java");
            urlList.add("https://reddit.com/r/javahelp");
            urlList.sort(null);
            List<String> firstTow=urlList.subList(0,2);


        }



}
