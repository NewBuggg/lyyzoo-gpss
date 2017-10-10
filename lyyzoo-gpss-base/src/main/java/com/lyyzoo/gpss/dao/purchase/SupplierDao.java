package com.lyyzoo.gpss.dao.purchase;

import com.lcxframework.data.dao.BaseDao;
import com.lcxframework.data.domain.Page;
import com.lyyzoo.gpss.entity.purchase.Supplier;
import com.lcxframework.util.Strings;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 *
 * @author bojiangzhou
 * @date 2017-04-06
 */
@Component
public class SupplierDao extends BaseDao<Supplier> {

    public Page<Supplier> page(String name, int pageNumber, int pageSize){
        String sql = "SELECT s.* FROM lz_purchase_supplier s WHERE s.state=1 ";
        Map<String, Object> params = new HashMap<>();
        if(Strings.isNotNullOrEmpty(name)){
            sql += "AND s.name LIKE :name ";
            params.put("name", "%" + name + "%");
        }
        return pageBySql(sql, pageNumber, pageSize, params);
    }

}
