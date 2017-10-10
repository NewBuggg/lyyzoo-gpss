package com.lyyzoo.gpss.dao.system;

import com.lcxframework.data.dao.BaseDao;
import com.lcxframework.data.domain.Page;
import com.lyyzoo.gpss.entity.system.Role;
import com.lcxframework.util.Strings;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 *
 * @author bojiangzhou
 * @date 2017-04-01
 */
@Component
public class RoleDao extends BaseDao<Role> {

    /**
     * 根据code查询相似
     */
    public Page<Role> page(String code, int pageNumber, int pageSize){
        String sql = "SELECT * FROM lz_sys_role WHERE state=1 ";
        Map<String, Object> params = new HashMap<>();
        if(Strings.isNotNullOrEmpty(code)){
            sql += "AND code LIKE :code ";
            params.put("code", "%" + code + "%");
        }
        return pageBySql(sql, pageNumber, pageSize, params);
    }

}
