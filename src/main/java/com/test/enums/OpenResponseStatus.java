package com.test.enums;

/**
 * 
 * HYE00000   请求成功
 * HYE10000   请求失败
 * HYE10001   部分请求失败
 * HYE20000   系统内部服务异常
 * HYE20001   请求参数解密失败
 * HYE20002   参数格式不符合JSON规范
 * HYE20003   获取远程服务响应超时
 * HYE20004   获取远程服务响应为空
 * HYE30000   服务调用者账号不存在
 * HYE30001   服务调用者账号不合法
 * HYE40000   请求参数中的用户标识不存在
 * HYE40001   请求参数中的用户标识不合法
 * HYE40002   请求参数中的电话号码不存在
 * HYE40003   请求参数中的电话号码不合法
 * HYE40004   请求参数中的客户授权码不存在
 * HYE40005   请求参数中的客户授权码不合法
 * HYE40006   请求参数中的证件号码不存在
 * HYE40007   请求参数中的证件号码不合法
 * HYE40008   请求参数中的客户姓名不存在
 * 
 * @Type OpenResponseStatus.java
 * @Desc 通用返回码定义
 * @author 
 * @date 2016年9月20日 下午2:25:58
 * @version 
 */
public enum OpenResponseStatus {

    SUCCESS {
        @Override
        public String code() {
            return "HYE00000";
        }

        @Override
        public String message() {
            return "请求成功";
        }

    },

    FAILURE {
        @Override
        public String code() {
            return "HYE10000";
        }

        @Override
        public String message() {
            return "请求失败";
        }
    },

    //部分请求失败
    PATIAL_FAILURE {
        @Override
        public String code() {
            return "HYE10001";
        }

        @Override
        public String message() {
            return "部分请求失败";
        }
    },

    SYSTEM_INTERNAL_ERROR {

        @Override
        public String code() {
            return "HYE20000";
        }

        @Override
        public String message() {
            return "系统内部服务异常";
        }

    },

    REQUEST_DECRYPTION_FAILURE {

        @Override
        public String code() {
            return "HYE20001";
        }

        @Override
        public String message() {
            return "请求参数解密失败";
        }

    },

    ERROR_JSON_FORMAT {

        @Override
        public String code() {
            return "HYE20002";
        }

        @Override
        public String message() {
            return "参数格式不符合JSON规范";
        }

    },

    REMOTE_INVOKE_TIMEOUT {

        @Override
        public String code() {
            return "HYE20003";
        }

        @Override
        public String message() {
            return "请求远程服务超时";
        }

    },

    EMPYT_REMOTE_RESPONSE {

        @Override
        public String code() {
            return "HYE20004";
        }

        @Override
        public String message() {
            return "获取远程服务响应为空";
        }

    },

    OPENUSER_NOT_EXIST {

        @Override
        public String code() {
            return "HYE30000";
        }

        @Override
        public String message() {
            return "服务调用者账号不存在";
        }

    },

    OPENUSER_IS_INVALID {

        @Override
        public String code() {
            return "HYE30001";
        }

        @Override
        public String message() {
            return "服务调用者账号不合法";
        }

    },

    OPENID_IS_EMPTY {

        @Override
        public String code() {
            return "HYE40000";
        }

        @Override
        public String message() {
            return "请求参数中的用户标识不存在";
        }

    },

    OPENID_IS_INVALID {

        @Override
        public String code() {
            return "HYE40001";
        }

        @Override
        public String message() {
            return "请求参数中的用户标识不合法";
        }

    },

    PHONENO_IS_EMPTY {

        @Override
        public String code() {
            return "HYE40002";
        }

        @Override
        public String message() {
            return "请求参数中的电话号码不存在";
        }

    },

    PHONENO_IS_INVALID {

        @Override
        public String code() {
            return "HYE40003";
        }

        @Override
        public String message() {
            return "请求参数中的电话号码不合法";
        }

    },

    IDENTIFYCODE_IS_EMPTY {

        @Override
        public String code() {
            return "HYE40004";
        }

        @Override
        public String message() {
            return "请求参数中的客户授权码不存在";
        }

    },

    IDENTIFYCODE_IS_INVALID {

        @Override
        public String code() {
            return "HYE40005";
        }

        @Override
        public String message() {
            return "请求参数中的客户授权码不合法";
        }

    },

    CERTNO_IS_EMPTY {

        @Override
        public String code() {
            return "HYE40006";
        }

        @Override
        public String message() {
            return "请求参数中的证件号码不存在";
        }

    },

    CERTNO_IS_INVALID {

        @Override
        public String code() {
            return "HYE40007";
        }

        @Override
        public String message() {
            return "请求参数中的证件号码不合法";
        }

    },

    CUSTNAME_IS_EMPTY {

        @Override
        public String code() {
            return "HYE40008";
        }

        @Override
        public String message() {
            return "请求参数中的客户姓名不存在";
        }

    };

    public abstract String code();

    public abstract String message();

    public String desc() {
        return String.format("[ResponesCode:%s,ResponseMessage:%s]", this.code(), this.message());
    }
}

/**
 * Revision history
 * -------------------------------------------------------------------------
 * 
 * Date Author Note
 * -------------------------------------------------------------------------
 * 2016年9月20日  creat
 */
