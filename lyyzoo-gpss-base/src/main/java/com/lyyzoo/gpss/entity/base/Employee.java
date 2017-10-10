package com.lyyzoo.gpss.entity.base;

import com.lcxframework.data.entity.BaseEntity;
import com.lcxframework.util.Dates;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * 员工
 * <p>
 *
 * @author bojiangzhou
 * @date 2017-04-04
 */
@Data
@Entity
@Table(name = "lz_base_employee")
public class Employee extends BaseEntity {

    /**
     * 员工姓名
     */
    private String name;
    /**
     * 员工编号
     */
    private String code;
    /**
     * 身份证
     */
    private String  idCard;

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

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    /**
     * 手机号码
     */
    private String  mobile;
    /**
     * 性别 <br/>
     * 1 男 <br/>
     * 2 女 <br/>
     * 0 无 <br/>
     */
    private Integer sex;
    /**
     * 出生日期
     */
    @DateTimeFormat(pattern = Dates.FORMAT_DATE)
    private Date birthday;
    /**
     * 用户地址
     */
    private String  address;
    /**
     * 用户邮箱
     */
    private String  email;
    /**
     * 员工类别名称
     */
    private String type;
    /**
     * 修改人账号
     */
    private String  updater;
    /**
     * 修改时间
     */
    @DateTimeFormat(pattern = Dates.FORMAT_DATETIME)
    private Date    updatime;
    /**
     * 账号状态
     */
    private Integer state;

}
