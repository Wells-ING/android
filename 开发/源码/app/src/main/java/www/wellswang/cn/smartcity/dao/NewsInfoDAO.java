package www.wellswang.cn.smartcity.dao;

import java.util.ArrayList;

import www.wellswang.cn.smartcity.entity.News;

public interface NewsInfoDAO {
    ArrayList<News> getNewsByTitleLike(String keyWords);

    ArrayList<News> getNewsByContentLike(String keyWords);
}
