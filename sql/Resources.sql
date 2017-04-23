create table t_resources (
	id bigint (20) not null auto_increment comment '唯一标识',
	parent_id bigint (20) comment '资源父节点ID',
	resource_code varchar (50) not null comment '资源编码',
	resource_name varchar (50) not null comment '资源名称',
	resource_type tinyint (1) not null default 1 comment '资源类型 1:菜单资源 2:功能资源 3:虚拟资源',
	resource_url varchar (100) comment '资源路径',
	resource_level tinyint (1) default 0 comment '资源Level',
	resource_icon varchar (50) comment '资源图标名',
	resource_order tinyint (1) default 0 comment '资源排序',
	status varchar (10) not null default 'open' comment '资源状态',
	description varchar (100) comment '资源描述',
	create_time datetime not null comment '创建时间',
	update_time datetime not null comment '更新时间',
	create_user varchar (50) not null comment '创建用户',
	update_user varchar (50) not null comment '更新用户',
	yn tinyint (1) not null default 1 comment '是否有效：1-有效，0-无效',
	ts timestamp not null default current_timestamp on update current_timestamp comment '默认时间',
	primary key (id)
) engine = innodb default charset = utf8 comment = '资源表';


insert into t_resources (id, parent_id, resource_code, resource_name, resource_url, resource_level, resource_icon, resource_order, description, create_time, update_time, create_user, update_user)
values (1, 0, 'sy','首页', null, 1, 'icon-home', 1, '首页菜单', now(), now(), '系统初始化', '系统初始化');

insert into t_resources (id, parent_id, resource_code, resource_name, resource_url, resource_level, resource_icon, resource_order, description, create_time, update_time, create_user, update_user)
values (2, 1, 'hcgl','1.缓存管理', null, 2, 'icon-config', 1, '缓存管理菜单', now(), now(), '系统初始化', '系统初始化');

insert into t_resources (id, parent_id, resource_code, resource_name, resource_url, resource_level, resource_icon, resource_order, description, create_time, update_time, create_user, update_user)
values (3, 1, 'zygl','2.资源管理', null, 2, 'icon-heart', 2, '资源管理菜单', now(), now(), '系统初始化', '系统初始化');

insert into t_resources (id, parent_id, resource_code, resource_name, resource_url, resource_level, resource_icon, resource_order, description, create_time, update_time, create_user, update_user)
values (4, 3, 'cdpz','2.1菜单配置', 'sys/menu/viewMenus', 3, 'icon-record', 1, '首页菜单', now(), now(), '系统初始化', '系统初始化');

insert into t_resources (id, parent_id, resource_code, resource_name, resource_url, resource_level, resource_icon, resource_order, description, create_time, update_time, create_user, update_user)
values (5, 3, 'yhgl','2.2用户配置', 'sys/user/viewUsers', 3, 'icon-man', 2, '首页菜单', now(), now(), '系统初始化', '系统初始化');