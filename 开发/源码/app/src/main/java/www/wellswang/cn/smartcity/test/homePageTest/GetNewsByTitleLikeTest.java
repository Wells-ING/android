package www.wellswang.cn.smartcity.test.homePageTest;

import java.util.ArrayList;

import www.wellswang.cn.smartcity.entity.News;
import www.wellswang.cn.smartcity.service.homePage.GetNewsEvent;

public class GetNewsByTitleLikeTest {
    public static void main(String[] args) {
        String keyWords = "台媒";
        ArrayList<News> news = new GetNewsEvent().getNewsByTitleLike(keyWords);
        for(News n : news) {
            System.out.println(n.toString());
        }
    }
}
