package com.lyyzoo.gpss.entity.purchase;

import com.lcxframework.data.entity.BaseEntity;
import com.lcxframework.util.Dates;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * 供应商
 * <p>
 *
 * @author bojiangzhou
 * @date 2017-04-06
 */
@Data
@Entity
@Table(name = "lz_purchase_supplier")
public class Supplier extends BaseEntity {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    /**
     * 供应商名称
     */

    private String name;
    /**
     * 联系人
     */
    private String linkman;
    /**
     * 联系电话
     */
    private String mobile;
    /**
     * 联系地址
     */
    private String address;
    /**
     * 描述
     */
    private String descs;
    /**
     * 状态
     */
    private Integer state;
    /**
     * 修改人账号
     */
    private String  updater;
    /**
     * 修改时间
     */
    @DateTimeFormat(pattern = Dates.FORMAT_DATETIME)
    private Date updatime;


}
