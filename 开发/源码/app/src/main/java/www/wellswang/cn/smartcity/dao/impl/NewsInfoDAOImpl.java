package www.wellswang.cn.smartcity.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import www.wellswang.cn.smartcity.dao.NewsInfoDAO;
import www.wellswang.cn.smartcity.entity.News;
import www.wellswang.cn.smartcity.entity.User;
import www.wellswang.cn.smartcity.utils.DBUtil;

public class NewsInfoDAOImpl implements NewsInfoDAO {
    @Override
    public ArrayList<News> getNewsByTitleLike(String keyWords) {
        String selectSQL = "SELECT * FROM news WHERE title like '%" + keyWords + "%'";
        ArrayList<News> news = new ArrayList<>();
        Connection conn = null;
        Statement stm = null;
        ResultSet rs = null;
        try {
            conn = DBUtil.getConnection();
            stm = conn.createStatement();
            rs = stm.executeQuery(selectSQL);
            while(rs.next()) {
                News currentNews = new News();
                currentNews.setId(rs.getInt("id"));
                currentNews.setUserId(rs.getInt("userId"));
                currentNews.setPressCategory(rs.getString("pressCategory"));
                currentNews.setTitle(rs.getString("title"));
                currentNews.setContent(rs.getString("content"));
                currentNews.setImgUrl(rs.getString("imgUrl"));
                if(rs.getInt("isRecommend") == 1) {
                    currentNews.setRecommend(true);
                } else {
                    currentNews.setRecommend(false);
                }
                currentNews.setLikeNumber(rs.getInt("likeNumber"));
                currentNews.setViewsNumber(rs.getInt("viewsNumber"));
                currentNews.setCreateBy(new User(rs.getString("createBy")));
                currentNews.setCreateTime(rs.getDate("createTime"));
                currentNews.setUpdateBy(new User(rs.getString("updateBy")));
                currentNews.setUpdateTime(rs.getDate("updateTime"));
                currentNews.setRemark(rs.getString("remark"));
                currentNews.setPressStatus(rs.getInt("pressStatus"));
                currentNews.setDelFlag(rs.getString("delFlag"));
                news.add(currentNews);
            }
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            DBUtil.closeConnection(stm, rs);
        }
        return news;
    }

    @Override
    public ArrayList<News> getNewsByContentLike(String keyWords) {
        String selectSQL = "SELECT * FROM news WHERE content like '%" + keyWords + "%'";
        ArrayList<News> news = new ArrayList<>();
        Connection conn = null;
        Statement stm = null;
        ResultSet rs = null;
        try {
            conn = DBUtil.getConnection();
            stm = conn.createStatement();
            rs = stm.executeQuery(selectSQL);
            while(rs.next()) {
                News currentNews = new News();
                currentNews.setId(rs.getInt("id"));
                currentNews.setUserId(rs.getInt("userId"));
                currentNews.setPressCategory(rs.getString("pressCategory"));
                currentNews.setTitle(rs.getString("title"));
                currentNews.setContent(rs.getString("content"));
                currentNews.setImgUrl(rs.getString("imgUrl"));
                if(rs.getInt("isRecommend") == 1) {
                    currentNews.setRecommend(true);
                } else {
                    currentNews.setRecommend(false);
                }
                currentNews.setLikeNumber(rs.getInt("likeNumber"));
                currentNews.setViewsNumber(rs.getInt("viewsNumber"));
                currentNews.setCreateBy(new User(rs.getString("createBy")));
                currentNews.setCreateTime(rs.getDate("createTime"));
                currentNews.setUpdateBy(new User(rs.getString("updateBy")));
                currentNews.setUpdateTime(rs.getDate("updateTime"));
                currentNews.setRemark(rs.getString("remark"));
                currentNews.setPressStatus(rs.getInt("pressStatus"));
                currentNews.setDelFlag(rs.getString("delFlag"));
                news.add(currentNews);
            }
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            DBUtil.closeConnection(stm, rs);
        }
        return news;
    }
}
