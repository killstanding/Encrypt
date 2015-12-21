# Encrypt
##Web项目加密 根据服务器信息和Key生成licence, 并且校验swf和jar文件的md5


### 语言

*   JAVA


### 关键技术

* sigar  获取服务器信息
* 加密    MD5
* proguard 代码加密

### help

* maven 编码命令 ：
	mvn clean install
	mvn package

* maven导出所有jar
	
	从Maven仓库中导出jar包：进入工程pom.xml 所在的目录下，输入：

	mvn dependency:copy-dependencies  

	会导出到targed/dependency 下面
 
	可以在工程创建lib文件夹，输入以下命令：

	mvn dependency:copy-dependencies -DoutputDirectory=lib  
 
	这样jar包都会copy到工程目录下的lib里面
 
	



    

    
   
