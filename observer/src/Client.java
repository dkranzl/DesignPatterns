public class Client implements NewsReceiver {

    public static void main(String[] args) {
        NewsPublisher newsPublisher = new NewsPublisher();
        newsPublisher.subscribe(new Client());
        newsPublisher.publishBreakingNews("Kaya is the new president.");
    }

    @Override
    public void receiveBreakingNews(String news) {
        System.out.println("News: " + news);
    }
}
