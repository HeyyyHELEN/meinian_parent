package cn.edu.hjnu;

import cn.edu.hjnu.entity.PageResult;
import cn.edu.hjnu.entity.QueryPageBean;
import cn.edu.hjnu.pojo.TravelItem;

public interface TravelItemService {
    /**
     * 新增自由行信息
     * @param travelItem
     */
    void add(TravelItem travelItem);

    /**
     * 查询自由行的分页信息
     * @param queryPageBean
     * @return
     */
    PageResult findPage(QueryPageBean queryPageBean);


    /**
     * 删除自由行信息
     * @param id
     */
    void delete(Integer id);

    /**
     * 根据自由行查询id
     * @param id
     * @return
     */
    TravelItem findById(Integer id);

    /**
     * 编辑自由行信息
     */
    void update(TravelItem travelItem);

}
