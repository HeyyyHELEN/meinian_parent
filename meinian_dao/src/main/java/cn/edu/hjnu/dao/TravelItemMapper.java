package cn.edu.hjnu.dao;

import cn.edu.hjnu.pojo.TravelItem;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Param;

public interface TravelItemMapper {

    /**
     * 新增自由行信息
     * @param travelItem
     */
    void add(TravelItem travelItem);

    /**
     * 根据条件查询自由行信息
     * @param queryString
     * @return
     */
    Page<TravelItem> findTravelItemByQueryString(@Param("queryString") String queryString);

    /**
     * 删除自由行信息
     * @param id
     */
    void delete(@Param("id") Integer id);

    /**
     * 根据id查询自由行信息
     * @param id
     * @return
     */
    TravelItem findById(Integer id);

    /**
     *
     * @param travelItem
     */
    void update(TravelItem travelItem);
}
