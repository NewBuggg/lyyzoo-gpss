package com.lyyzoo.gpss.entity.base;

import com.lcxframework.data.entity.BaseEntity;
import com.lcxframework.util.Dates;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * <p>
 *
 * @author bojiangzhou
 * @date 2017-04-05
 */
@Data
@Entity
@Table(name = "lz_base_goods")
public class Goods extends BaseEntity {

    /**
     * 商品名称
     */
    private String name;
    /**
     * 商品编号
     */
    private String code;
    /**
     * 商品类别
     */
    private String type;
    /**
     * 品牌
     */
    private String brand;
    /**
     * 计量单位
     */
    private String unit;
    /**
     * 颜色
     */
    private String color;
    /**
     * 规格型号
     */
    private String standard;
    /**
     * 材质
     */
    private String material;
    /**
     * 预设进价
     */
    private String buyPrice;
    /**
     * 预设售价
     */
    private String salePrice;
    /**
     * 商品描述
     */
    private String descs;

    /**
     * 修改人账号
     */
    private String  updater;
    /**
     * 修改时间
     */
    @DateTimeFormat(pattern = Dates.FORMAT_DATETIME)
    private Date updatime;
    /**
     * 状态
     */
    private Integer state;

    /**
     * 图片 base64
     */
    private String picture;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(String buyPrice) {
        this.buyPrice = buyPrice;
    }

    public String getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(String salePrice) {
        this.salePrice = salePrice;
    }

    public String getDescs() {
        return descs;
    }

    public void setDescs(String descs) {
        this.descs = descs;
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

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
