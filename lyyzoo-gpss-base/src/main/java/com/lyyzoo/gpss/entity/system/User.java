package com.lyyzoo.gpss.entity.system;

import com.lcxframework.data.entity.BaseEntity;
import com.lcxframework.util.Dates;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.Date;

/**
 * 系统用户
 * <p>
 *
 * @author bojiangzhou
 * @date 2017-04-01
 */
@Data
@Entity
@Table(name = "lz_sys_user")
public class User extends BaseEntity {

    /**
     * 锁定
     */
    public static interface IsLocked {
        /**
         * 未锁定
         */
        public static final int NO  = 0;
        /**
         * 已锁定
         */
        public static final int YES = 1;
    }

    /**
     * 用户账号
     */
    private String  account;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
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

    public Integer getIsLocked() {
        return isLocked;
    }

    public void setIsLocked(Integer isLocked) {
        this.isLocked = isLocked;
    }

    public Date getLockTime() {
        return lockTime;
    }

    public void setLockTime(Date lockTime) {
        this.lockTime = lockTime;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    /**
     * 用户密码
     */
    private String  password;
    /**
     * 用户角色Id
     */
    private Long    roleId;
    /**
     * 角色名称
     */
    private String  roleName;
    /**
     * 员工ID
     */
    private Long    employeeId;
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
    /**
     * 是否锁定 <br/>
     * 0 未锁定 <br/>
     * 1 锁定 <br/>
     */
    private Integer isLocked;
    /**
     * 锁定时间
     */
    @DateTimeFormat(pattern = Dates.FORMAT_DATETIME)
    private Date    lockTime;

    //////////////////// 冗余字段 ////////////////////

    @Transient
    private String  employeeName;
    @Transient
    private String  employeeCode;


    @Transient
    public String getEmployeeName() {
        return employeeName;
    }
    @Transient
    public String getEmployeeCode() {
        return employeeCode;
    }
}
