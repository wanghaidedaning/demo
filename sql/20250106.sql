CREATE TABLE `sys_oper_log` (
                                `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '日志主键',
                                `title` varchar(50) DEFAULT '' COMMENT '模块标题',
                                `business_type` varchar(20) DEFAULT '0' COMMENT '业务类型（0其它 1新增 2修改 3删除）',
                                `method` varchar(100) DEFAULT '' COMMENT '方法名称',
                                `request_method` varchar(10) DEFAULT '' COMMENT '请求方式',
                                `oper_name` varchar(50) DEFAULT '' COMMENT '操作人员',
                                `oper_url` varchar(255) DEFAULT '' COMMENT '请求URL',
                                `oper_ip` varchar(128) DEFAULT '' COMMENT '主机地址',
                                `oper_param` varchar(2000) DEFAULT '' COMMENT '请求参数',
                                `json_result` varchar(2000) DEFAULT '' COMMENT '返回参数',
                                `status` int(1) DEFAULT '0' COMMENT '操作状态（1正常 0异常）',
                                `error_msg` varchar(2000) DEFAULT '' COMMENT '错误消息',
                                `oper_time` datetime DEFAULT NULL COMMENT '操作时间',
                                `execute_time` bigint(20) NOT NULL DEFAULT '0' COMMENT '执行时长(毫秒)',
                                PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=65 DEFAULT CHARSET=utf8 COMMENT='操作日志记录';