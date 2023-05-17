package cn.edu.hjnu.service.impl;

import cn.edu.hjnu.TravelItemService;
import cn.edu.hjnu.dao.TravelItemMapper;
import cn.edu.hjnu.entity.PageResult;
import cn.edu.hjnu.entity.QueryPageBean;
import cn.edu.hjnu.pojo.TravelItem;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Service(interfaceClass = TravelItemService.class)
@Transactional
public class TravelItemServiceImpl implements TravelItemService{

    @Autowired
    private TravelItemMapper travelItemMapper;

    @Override
    public void add(TravelItem travelItem) {
        travelItemMapper.add(travelItem);
    }

    @Override
    public PageResult findPage(QueryPageBean queryPageBean) {
        //开启分页功能
        PageHelper.startPage(queryPageBean.getCurrentPage(), queryPageBean.getPageSize());
        //根据条件查询自由行信息
        Page<TravelItem> page = travelItemMapper.findTravelItemByQueryString(queryPageBean.getQueryString());
        return new PageResult(page.getTotal(), page.getResult());
    }

    @Override
    public void delete(Integer id) {
        travelItemMapper.delete(id);
    }

    @Override
    public TravelItem findById(Integer id) {
        return travelItemMapper.findById(id);
    }

    @Override
    public void update(TravelItem travelItem) {
        travelItemMapper.update(travelItem);
    }
}
