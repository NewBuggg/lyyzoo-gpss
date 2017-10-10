package com.lyyzoo.gpss.entity.base;

import com.lcxframework.data.entity.BaseEntity;
import com.lcxframework.util.Dates;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * 基础参数
 * <p>
 *
 * @author bojiangzhou
 * @date 2017-04-04
 */
@Data
@Entity
@Table(name = "lz_base_param")
public class Param extends BaseEntity {

    /**
     * 参数类别
     */
    public static interface Type {
        /**
         * 商品类别
         */
        public static final String GOODS_TYPE       = "GOODS_TYPE";
        /**
         * 规格型号
         */
        public static final String GOODS_STANDARD   = "GOODS_STANDARD";
        /**
         * 计量单位
         */
        public static final String GOODS_UNIT       = "GOODS_UNIT";
        /**
         * 品牌
         */
        public static final String BRAND            = "BRAND";
        /**
         * 材质
         */
        public static final String MATERIAL         = "MATERIAL";
        /**
         * 颜色
         */
        public static final String COLOR            = "COLOR";
        /**
         * 员工类别
         */
        public static final String EMPLOYEE_TYPE    = "EMPLOYEE_TYPE";
    }

    /**
     * 参数名称
     */
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescs() {
        return descs;
    }

    public void setDescs(String descs) {
        this.descs = descs;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }

    public Date getCreatime() {
        return creatime;
    }

    public void setCreatime(Date creatime) {
        this.creatime = creatime;
    }

    /**
     * 描述
     */
    private String descs;
    /**
     * 状态
     */
    private Integer state;
    /**
     * 参数类别
     */
    private String type;
    /**
     * 创建人账号
     */
    private String  creater;
    /**
     * 创建时间
     */
    @DateTimeFormat(pattern = Dates.FORMAT_DATETIME)
    private Date    creatime;


}
