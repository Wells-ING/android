package www.wellswang.cn.smartcity.service.homePage;

import java.util.ArrayList;

import www.wellswang.cn.smartcity.dao.impl.NewsInfoDAOImpl;
import www.wellswang.cn.smartcity.entity.News;

public class GetNewsEvent {
    public ArrayList<News> getNewsByTitleLike(String keyWords) {
        return new NewsInfoDAOImpl().getNewsByTitleLike(keyWords);
    }
    public ArrayList<News> getNewsByContentLike(String keyWords) {
        return new NewsInfoDAOImpl().getNewsByContentLike(keyWords);
    }
}
