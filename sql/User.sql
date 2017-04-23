create table t_user (id BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '唯一标识',user_code VARCHAR(50) NOT NULL COMMENT '用户编码',user_name VARCHAR(50) COMMENT '用户名称',telephone VARCHAR(30) COMMENT '固定电话',mobile_phone VARCHAR(30) COMMENT '手机号',email VARCHAR(30) COMMENT '电子邮件',status TINYINT(1) NOT NULL DEFAULT 0  COMMENT '状态：0-离职，1-正常',create_time DATETIME NOT NULL COMMENT '创建时间',update_time DATETIME NOT NULL COMMENT '更新时间',create_user VARCHAR(50) NOT NULL COMMENT '创建用户',update_user VARCHAR(50) NOT NULL COMMENT '更新用户',ts TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP  COMMENT '默认时间',is_delete TINYINT(1) NOT NULL DEFAULT 0  COMMENT '刪除标志',version TINYINT(4) DEFAULT 0  COMMENT '版本号',version TINYINT DEFAULT 0  COMMENT '版本号', PRIMARY KEY (id)) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户';