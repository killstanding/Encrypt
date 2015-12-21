package com.jerry.validate;


/**
 * Created by Jerry on 15/12/15.
 */
public interface IValidate {
    /**
     * 根据前台传过来的key，返回项目绑定设备的唯一验证编码
     * @param orKey 厂家key
     * @return 唯一验证编码
     */
    String getProjectLicence(String orKey) throws Exception;
}
