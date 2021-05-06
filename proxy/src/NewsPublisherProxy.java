import java.util.HashMap;
import java.util.Map;

public class NewsPublisherProxy implements NewsPublisher {

    private NewsPublisher newsPublisher;
    private Map<String, String> cache = new HashMap<>();

    public NewsPublisherProxy(NewsPublisher newsPublisher) {
        this.newsPublisher = newsPublisher;
    }

    @Override
    public String getNews(String topic) {
        System.out.println("[NewsPublisherProxy] new request");
        if(!cache.containsKey(topic)) {
            String news = newsPublisher.getNews(topic);
            cache.put(topic, news);
        }
        return cache.get(topic);
    }
}
