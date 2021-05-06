import java.util.ArrayList;
import java.util.List;

public class NewsPublisher {

    private List<NewsReceiver> newsReceivers = new ArrayList<>();

    public void subscribe(NewsReceiver newsReceiver) {
        this.newsReceivers.add(newsReceiver);
    }

    public void unsubscribe(NewsReceiver newsReceiver) {
        this.newsReceivers.remove(newsReceiver);
    }

    public void publishBreakingNews(String news) {
        for(NewsReceiver newsReceiver : newsReceivers) {
            newsReceiver.receiveBreakingNews(news);
        }
    }

}
