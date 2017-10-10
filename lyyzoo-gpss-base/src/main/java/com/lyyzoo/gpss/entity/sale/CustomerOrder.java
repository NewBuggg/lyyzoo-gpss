package com.lyyzoo.gpss.entity.sale;

import com.lcxframework.data.entity.BaseEntity;
import com.lyyzoo.gpss.Applications;
import com.lcxframework.util.Dates;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.Date;

/**
 * 销售单
 * <p>
 *
 * @author bojiangzhou
 * @date 2017-04-09
 */
@Data
@Entity
@Table(name = "lz_sale_order")
public class CustomerOrder extends BaseEntity {

    public static interface Type {
        /**
         * 销售单
         */
        public static final int SALE = 1;
        /**
         * 销售退货单
         */
        public static final int SALE_REJECT = 2;
    }

    /**
     * 商品ID
     */
    private Long goodsId;

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Long getRepoId() {
        return repoId;
    }

    public void setRepoId(Long repoId) {
        this.repoId = repoId;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getDescs() {
        return descs;
    }

    public void setDescs(String descs) {
        this.descs = descs;
    }

    public Integer getCheckState() {
        return checkState;
    }

    public void setCheckState(Integer checkState) {
        this.checkState = checkState;
    }

    public String getCheckResult() {
        return checkResult;
    }

    public void setCheckResult(String checkResult) {
        this.checkResult = checkResult;
    }

    public String getCheckAccount() {
        return checkAccount;
    }

    public void setCheckAccount(String checkAccount) {
        this.checkAccount = checkAccount;
    }

    public Date getChecktime() {
        return checktime;
    }

    public void setChecktime(Date checktime) {
        this.checktime = checktime;
    }

    public Date getTaketime() {
        return taketime;
    }

    public void setTaketime(Date taketime) {
        this.taketime = taketime;
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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

    public void setGoodsUnit(String goodsUnit) {
        this.goodsUnit = goodsUnit;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    public void setGoodsBrand(String goodsBrand) {
        this.goodsBrand = goodsBrand;
    }

    public void setRepoName(String repoName) {
        this.repoName = repoName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public void setCheckStateStr(String checkStateStr) {
        this.checkStateStr = checkStateStr;
    }

    public void setCreatimeStr(String creatimeStr) {
        this.creatimeStr = creatimeStr;
    }

    public void setChecktimeStr(String checktimeStr) {
        this.checktimeStr = checktimeStr;
    }

    /**
     * 客户
     */
    private Long customerId;
    /**
     * 客户名称
     */
    private String customerName;
    /**
     * 出库仓库
     */
    private Long repoId;
    /**
     * 单号
     */
    private String orderNumber;
    /**
     * 数量
     */
    private Integer count;
    /**
     * 单价
     */
    private Double unitPrice;
    /**
     * 总价
     */
    private Double totalPrice;
    /**
     * 经办员工
     */
    private Long employeeId;
    /**
     * 备注
     */
    private String descs;
    /**
     * 审核状态
     */
    private Integer checkState;
    /**
     * 审核结果
     */
    private String checkResult;
    /**
     * 审核人
     */
    private String checkAccount;
    /**
     * 审核时间
     */
    private Date checktime;
    /**
     * 出库日期
     */
    private Date taketime;
    /**
     * 创建人账号
     */
    private String  creater;
    /**
     * 创建时间
     */
    @DateTimeFormat(pattern = Dates.FORMAT_DATETIME)
    private Date creatime;
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
     * 删除状态
     */
    private Integer state;

    /**
     * 订单类型
     * 1 : 销售单
     * 2 : 退货单
     */
    private Integer type;

    ////////////////// 其它字段 //////////////////

    private String goodsName;

    private String goodsCode;

    private String goodsUnit;

    private String goodsType;

    private String goodsBrand;

    private String repoName;

    private String employeeName;

    private String employeeCode;

    private String checkStateStr;

    private String creatimeStr;

    private String checktimeStr;

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
    public String getGoodsBrand() {
        return goodsBrand;
    }
    @Transient
    public String getRepoName() {
        return repoName;
    }
    @Transient
    public String getEmployeeName() {
        return employeeName;
    }
    @Transient
    public String getEmployeeCode() {
        return employeeCode;
    }
    @Transient
    public String getCheckStateStr() {
        switch (checkState){
            case Applications.Check.INPUT:
                checkStateStr = "录入";
                break;
            case Applications.Check.WAIT:
                checkStateStr = "等待审核";
                break;
            case Applications.Check.PASS:
                checkStateStr = "审核通过";
                break;
            case Applications.Check.FAIL:
                checkStateStr = "审核未通过";
                break;
        }

        return checkStateStr;
    }
    @Transient
    public String getCreatimeStr() {
        return creatime == null ? "" : Dates.toStringWithDateFormatDateTime(creatime);
    }
    @Transient
    public String getChecktimeStr() {
        return checktime == null ? "" : Dates.toStringWithDateFormatDateTime(checktime);
    }
}
