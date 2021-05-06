public class Client {

    public static void main(String[] args) {
        NewsPublisher publisher = new NewsPublisherProxy(new RealNewsPublisher());
        System.out.println(publisher.getNews("politics"));
        System.out.println(publisher.getNews("politics"));
        System.out.println(publisher.getNews("politics"));
        System.out.println(publisher.getNews("politics"));
        System.out.println(publisher.getNews("politics"));
        System.out.println(publisher.getNews("politics"));
        System.out.println(publisher.getNews("politics"));
        System.out.println(publisher.getNews("politics"));
    }

}
