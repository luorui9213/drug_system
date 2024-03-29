package com.luorui.drug_system.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.luorui.drug_system.common.DateUtil;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 罗锐
 * @date 2023/4/27
 * 收到退货
 */
@Data
@TableName(value = "returngoods")
public class ReturnGoods implements Serializable {
    /*主键*/
    //@TableField(value = "id")
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
    /*药品名称*/
    private String dname;
    /*数量*/
    private Integer count;
    /*退货原因*/
    private String reason;
    /*总金额*/
    private Float total;
    /*操作时间*/
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date operatetime;

    /*操作时间转换成年月日*/
    public String getOperatetimeStr(){
        return DateUtil.dateConvert(operatetime);
    }
}
