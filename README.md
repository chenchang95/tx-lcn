# tx-lcn
官网地址：http://www.txlcn.org

分布式事务tx-lcn的初步了解

1. 需要安装Consul
2. 启动Consul
3. 启动tm
4. 启动所有tc，txlcn-tc-tcc最后启动
5. Consul控制台(127.0.0.1:8500)和tm控制台(127.0.0.1:7970)检测所有的tc是否都连接成功
6. 分布式事务入口为txlcn-tc-tcc项目的/tcc接口(127.0.0.1:12013/tcc?name=123)
