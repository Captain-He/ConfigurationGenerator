用springboot 对Transtable 和 DataServer 程序进行重构
首先是采集器的配置系统，ConfigurationGenerator
    --用springboot 重构TransTable程序，最为数据采集服务器的配置文件生成器，主要功能是：将表格文件(*.xls、*.xlsx)+配置格式txt->配置文件（*.txt、*.sql）
