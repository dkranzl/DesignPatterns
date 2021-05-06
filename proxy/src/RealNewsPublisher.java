public class RealNewsPublisher implements NewsPublisher {

    @Override
    public String getNews(String topic) {
        System.out.println("[RealNewsPublisher] new request");
        return "Kaya is the new president.";
    }

}
