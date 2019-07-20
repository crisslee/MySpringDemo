#说明
这个demo提供了最最最基本的spring+springMVC+mybatis+marven的BS框架

本demo可以分为三个部分，
- SpringMVC框架，他的目的是实现网页与数据库之间沟通的桥梁，
- 由mybatis与mysql组成的数据库框架，其中mysql只提供数据库增删查改，mybatis则用来持久化数据库连接，并且解除传统java后台的数据库硬编码问题，详细内容可以阅读
[mybaits动态sql语句学习](http://limingnihao.itype.com/blog/782190)
- [semantic ui前端框架](http://semantic-ui.com)，负责整体的前端绘制，布局，与交互（前端真的是个超级深坑，实在不行就搞个html随便写一写算了）

###项目结构
- pom.xml文件用来配置本项目的依赖，以及确定项目版本号等
- src/main 项目所有的代码文件夹
- src/main/controller 用来控制页面跳转，具体可参考controller文件夹中的disc文件
- src/main/mapper 用来从数据库中获取信息，具体可参考mapper文件夹中的disc
- src/main/model 由于本项目唯一的功能就是获取用户信息，于是model文件夹的目的就是创建用户model，用来与数据库内容进行交互，model的结构与数据库中用户表的结构一致
- src/main/service 用来作为controller与mapper之间沟通的桥梁
- src/main/Resource/mapper 使用xml文件，让mybatis完成他解除硬编码的功能，实现src/main/mapper中的getAllUsers（）方法（所谓硬编码就是把sql语句直接写到java中，这样会导致每次修改sql语句，都要重新编译一遍代码，非常不方便，mybatis可以把sql语句写到xml文件，修改SQL语句不会对java代码造成影响，可以实现热修改）
- src/main/Resource/config 一些配置文件，其中需要修改的只有jdbc.properties
- src/main/webapp/ 网页前端文件。这个我真的没法在这段时间搞懂，没法写注释
###使用方法
1. 下载代码
2. 使用idea导入 现有maver项目，maven会自动下载所依赖的jar包
3. 将doc文件夹的sql脚本部署到mysql中，修改'jdbc.properties'中的mysql节点的url，user，password
4. 运行代码就可以了

###idea，mysql配置方法
1. [IntelliJ IDEA（2018）安装详解](https://blog.csdn.net/newabcc/article/details/80601933)
2. [超详细MySQL安装及基本使用教程](https://blog.csdn.net/bobo553443/article/details/81383194)
3. [java安装教程及环境配置](https://www.cnblogs.com/Yuuki-/p/8068254.html)

###后记
上周需求有点多，没什么时间搞这个，你们这个比赛也没有一个具体的实现内容，这个demo肯定是满足不了你们比赛的，不过至少不至于干坐4个小时，如果有什么问题可以找我。

