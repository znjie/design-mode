package proxy.service.impl;

import proxy.service.Searcher;

/**
 * 真实主题角色
 */
public class RealSearcher implements Searcher {
    @Override
    public String search(String userName, String keyWord) {
        return "查询结果为：" + keyWord;
    }
}
