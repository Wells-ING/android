package www.wellswang.cn.smartcity.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import www.wellswang.cn.smartcity.dao.CarouselMapInfoDAO;
import www.wellswang.cn.smartcity.entity.CarouselMap;
import www.wellswang.cn.smartcity.utils.DBUtil;

public class CarouselMapInfoDAOImpl implements CarouselMapInfoDAO {

    @Override
    public ArrayList<CarouselMap> getAllCarouseMap() {
        String selectSQL = "SELECT * FROM carousel_map";
        ArrayList<CarouselMap> carouselMaps = new ArrayList<>();
        Connection conn = null;
        Statement stm = null;
        ResultSet rs = null;
        try {
            conn = DBUtil.getConnection();
            stm = conn.createStatement();
            rs = stm.executeQuery(selectSQL);
            while(rs.next()) {
                CarouselMap currentCarouselMap = new CarouselMap();
                currentCarouselMap.setId(rs.getInt("id"));
                currentCarouselMap.setImgUrl(rs.getString("imgUrl"));
                currentCarouselMap.setType(rs.getInt("type"));
                currentCarouselMap.setCreateTime(rs.getDate("createTime"));
                currentCarouselMap.setSort(rs.getInt("sort"));
                currentCarouselMap.setDispaly(rs.getString("display"));
                carouselMaps.add(currentCarouselMap);
            }
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            DBUtil.closeConnection(stm, rs);
        }
        return carouselMaps;
    }
}
