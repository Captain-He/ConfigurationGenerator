## 用springboot 对Transtable 和 DataServer 程序进行重构

1. 首先是采集器的配置系统，ConfigurationGenerator

   -  用springboot 重构TransTable程序，最为数据采集服务器的配置文件生成器，主要功能是：将表格文件(*.xls、*.xlsx)+配置格式txt->配置文件（*.txt、*.sql）

   - 难点在于，组织txt 文件的方式。TransTable 程序的方式是，每修改一次txt的格式，都要修改一次代码，java Map(键值对查找匹配，每个item 都是三级映射)，如果将表格文件转换为数据库表，利用数据库的主外键来处理？会不会更合理些