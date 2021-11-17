package proxy.service.impl;

import lombok.Getter;
import lombok.Setter;
import proxy.service.Searcher;

/**
 * 代理主题角色
 */
@Setter
@Getter
public class ProxySearcher implements Searcher {

    public static long count = 0L;

    private RealSearcher realSearcher;

    @Override
    public String search(String userName, String keyWord) {
        String result = "";
        if (this.userCheck(userName)) {
            result = realSearcher.search(userName, keyWord);
            count();
        } else {
            result = "没有权限";
        }
        return result;
    }

    public ProxySearcher() {
    }

    public ProxySearcher(RealSearcher realSearcher) {
        this.realSearcher = realSearcher;
    }

    private void count() {
        count++;
        System.out.println("当前接口访问" + count + "次");
    }

    private boolean userCheck(String userName) {
        if ("123".equals(userName)) {
            return true;
        } else {
            return false;
        }
    }



}
