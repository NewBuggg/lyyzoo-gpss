package com.lyyzoo.gpss.entity.stock;

import com.lcxframework.data.entity.BaseEntity;
import com.lcxframework.util.Dates;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.Date;

/**
 * 库存
 * <p>
 *
 * @author bojiangzhou
 * @date 2017-04-08
 */
@Data
@Entity
@Table(name = "lz_stock")
public class Stock extends BaseEntity {

    /**
     * 商品ID
     */
    private Long goodsId;
    /**
     * 仓库ID
     */
    private Long repoId;
    /**
     * 库存量
     */
    private Integer totalCount;
    /**
     * 销售量
     */
    private Integer saleCount;
    /**
     * 上次进价
     */
    private Double buyPrice;
    /**
     * 平均进价
     */
    private Double avgBuyPrice;
    /**
     * 预设售价
     */
    private Double salePrice;
    /**
     * 库存总值
     */
    private Double totalBuyPrice;
    /**
     * 售价总值
     */
    private Double totalSalePrice;
    /**
     * 修改时间
     */
    @DateTimeFormat(pattern = Dates.FORMAT_DATETIME)
    private Date updatime;
    /**
     * 状态
     */
    private Integer state;

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public Long getRepoId() {
        return repoId;
    }

    public void setRepoId(Long repoId) {
        this.repoId = repoId;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getSaleCount() {
        return saleCount;
    }

    public void setSaleCount(Integer saleCount) {
        this.saleCount = saleCount;
    }

    public Double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(Double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public Double getAvgBuyPrice() {
        return avgBuyPrice;
    }

    public void setAvgBuyPrice(Double avgBuyPrice) {
        this.avgBuyPrice = avgBuyPrice;
    }

    public Double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }

    public Double getTotalBuyPrice() {
        return totalBuyPrice;
    }

    public void setTotalBuyPrice(Double totalBuyPrice) {
        this.totalBuyPrice = totalBuyPrice;
    }

    public Double getTotalSalePrice() {
        return totalSalePrice;
    }

    public void setTotalSalePrice(Double totalSalePrice) {
        this.totalSalePrice = totalSalePrice;
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

//////////////////// 其它字段 ////////////////////

    private String goodsName;

    private String goodsCode;

    private String goodsUnit;

    private String goodsType;

    private String goodsStandard;

    private String goodsColor;

    private String repoName;

    ////////// 库存统计 //////////
    /**
     * 商品总数
     */
    private Integer totalGoodsCount;
    /**
     * 库存总量
     */
    private Integer totalRepoCount;
    /**
     * 总销售量
     */
    private Integer totalSaleCount;
    /**
     * 库存总成本
     */
    private Double totalRepoBuyPrice;
    /**
     * 库存总值
     */
    private Double totalRepoSalePrice;


    @Transient
    public String getGoodsName() {
        return goodsName;
    }
    @Transient
    public String getGoodsCode() {
        return goodsCode;
    }
    @Transient
    public String getGoodsUnit() {
        return goodsUnit;
    }
    @Transient
    public String getGoodsType() {
        return goodsType;
    }
    @Transient
    public String getGoodsStandard() {
        return goodsStandard;
    }
    @Transient
    public String getGoodsColor() {
        return goodsColor;
    }
    @Transient
    public String getRepoName() {
        return repoName;
    }

    @Transient
    public Integer getTotalGoodsCount() {
        return totalGoodsCount;
    }
    @Transient
    public Integer getTotalRepoCount() {
        return totalRepoCount;
    }
    @Transient
    public Integer getTotalSaleCount() {
        return totalSaleCount;
    }
    @Transient
    public Double getTotalRepoBuyPrice() {
        return totalRepoBuyPrice;
    }
    @Transient
    public Double getTotalRepoSalePrice() {
        return totalRepoSalePrice;
    }
}
