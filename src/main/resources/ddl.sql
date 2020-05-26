//用户表
create table `user` (`id` int not null,
					 `crate_at` datetime not null default '0000-00-00 00:00:00',
                     `update_at` datetime not null default '0000-00-00 00:00:00',
                     `telphone` varchar(40) not null default'',
					 `password` varchar(200) not null,
                     `nick_name` varchar(40) not null,
                     `gender` int not null default 0,
                     primary key (`id`),
                     UNIQUE `telphone_unique_index` using BTREE (`telphone`)) engine=InnoDB default charset=utf8 comment '用户表';