package proxy.service;

/**
 * 抽象主题角色
 */
public interface Searcher {
    String search(String userName, String keyWord);
}
