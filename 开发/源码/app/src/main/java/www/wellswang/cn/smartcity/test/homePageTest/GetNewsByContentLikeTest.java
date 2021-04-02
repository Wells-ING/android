package www.wellswang.cn.smartcity.test.homePageTest;

import java.util.ArrayList;

import www.wellswang.cn.smartcity.entity.News;
import www.wellswang.cn.smartcity.service.homePage.GetNewsEvent;

public class GetNewsByContentLikeTest {
    public static void main(String[] args) {
        String keyWords = "美国";
        ArrayList<News> news = new GetNewsEvent().getNewsByContentLike(keyWords);
        for(News n : news) {
            System.out.println(n.toString());
        }
    }
}
