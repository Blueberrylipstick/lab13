package ue.edu.ucu.apps.task3;

import lombok.SneakyThrows;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class PDLReader {
    @SneakyThrows
    public void parse(String url) {
        Document doc = Jsoup.connect(url).get();
        System.out.println(doc.title());
        Elements description = doc.select("meta[name=description]");
        System.out.printf("%s\n", description.attr("content"));

        Elements title = doc.select("title");
        System.out.printf("%s\n", title.text());

        String logo = doc.select("link[rel$=icon]").attr("href");
        if (logo.startsWith("/")) {
            logo = url + logo;
        }

        System.out.printf("%s\n", logo);
    }
}