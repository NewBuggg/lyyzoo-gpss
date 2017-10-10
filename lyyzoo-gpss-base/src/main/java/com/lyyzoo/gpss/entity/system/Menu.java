package com.lyyzoo.gpss.entity.system;

import com.lcxframework.data.entity.BaseEntity;
import com.lcxframework.util.Dates;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.Date;
import java.util.List;

/**
 * 菜单
 * <p>
 *
 * @author bojiangzhou
 * @date 2017-04-01
 */
@Data
@Entity
@Table(name = "lz_sys_menu")
public class Menu extends BaseEntity {

    public static class IsLeaf {
        /**
         * 非节点
         */
        public static Integer No  = 0;

        /**
         * 节点
         */
        public static Integer Yes = 1;
    }

    /**
     * 菜单名称
     */
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getUpId() {
        return upId;
    }

    public void setUpId(Long upId) {
        this.upId = upId;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Integer getIsLeaf() {
        return isLeaf;
    }

    public void setIsLeaf(Integer isLeaf) {
        this.isLeaf = isLeaf;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    public Date getUpdatime() {
        return updatime;
    }

    public void setUpdatime(Date updatime) {
        this.updatime = updatime;
    }

    public void setChildren(List<Menu> children) {
        this.children = children;
    }

    public boolean isLeaf() {
        return leaf;
    }

    public void setLeaf(boolean leaf) {
        this.leaf = leaf;
    }

    /**
     * 上级菜单ID（0：无上级ID）
     */
    private Long upId;
    /**
     * 菜单地址
     */
    private String path;
    /**
     * 是否叶子节点(0:不是 1：是)
     */
    private Integer isLeaf;
    /**
     * 状态(0:无效 1:有效)
     */
    private Integer state;
    /**
     * 创建人账号
     */
    private String updater;
    /**
     * 修改时间
     */
    @DateTimeFormat(pattern = Dates.FORMAT_DATETIME)
    private Date updatime;

    //////////////////// 冗余字段 ////////////////////
    @Transient
    private List<Menu> children;
    @Transient
    private boolean leaf;

    @Transient
    public List<Menu> getChildren() {
        return children;
    }
    @Transient
    public boolean getLeaf(){
        return isLeaf == IsLeaf.Yes;
    }


}
