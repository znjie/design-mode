package proxy;

import proxy.service.Searcher;
import proxy.service.impl.ProxySearcher;
import proxy.service.impl.RealSearcher;

public class Client {
    public static void main(String[] args) {
        Searcher searcher = new ProxySearcher(new RealSearcher());
        System.out.println(searcher.search("123", "996.icu"));
        System.out.println(searcher.search("123", "996.icu"));
        System.out.println(searcher.search("123", "996.icu"));
    }
}
