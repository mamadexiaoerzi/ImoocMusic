# ImoocMusic
https://www.imooc.com/u/3330348/courses?sort=publish<p>
不仅能学到自定义控件、第三方框架、Realm数据库等知识点，最终还能完成一个炫酷的音乐APP。 

# 项目基本流程
* 立项
* 原型确认
* 设计图确认
* 代码开发
* 测试-修改
* 上线

# 代码开发流程
* 构建UI，编写执行逻辑
* 数据对接

# 使用的第三方库
* RecyclerView
* CircleImageView
* AndroidUtilCode
* Glide
* Glide-Transformations
* Realm

# 项目构建
* .gradle			-项目的自动化构建工具
* .idea				-项目开发所使用到的环境，当前电脑的AS开发环境，不同的电脑、AS版本、gradle版本，对应的.idea文件夹下的内容有所不同
* app				-开发项目所有的代码和资源文件<p>
	﹂libs			-主要用于存放jar包，也可以放一些arr文件<p>
	﹂src			-主要存放代码：java文件、资源文件、配置文件等<p>
	﹂build.gradle	-当前module上gradle的编译文件，只对当前module生效，里面是当前module的一些基础配置：SDK版本号、第三方库等<p>
* gradle			-gradle目录文件，如gradle-wrapper.properties就是gradle的属性文件，可以配置gradle的版本号和下载地址	
* .gitignore		-git仓库默认的忽略文件，使用git仓库时，不想上传的内容在此处配置
* build.gradle		-配置了所有module的通用配置信息，对整个project生效
* local.properties	-当前电脑的SDK地址
* settings.gradle	-当前project引入的module，gradle在初始化时会优先加载这个文件
