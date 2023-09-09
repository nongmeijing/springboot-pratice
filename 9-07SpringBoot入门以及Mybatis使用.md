### SpringBoot

创建SpringBoot的project两种方式：

- SpringBoot快速生成project-->https://start.spring.io/
- idea创建project

SpringBoot程序中，必须要用@SpringBootApplication来标识启动类Spring Boot配置文件用yml去写会好一点，可读性较高

可以存在多个yml文件，可以迅速切换环境，格式格式：

application-{profile}.yml，例如格式： application-dev.yml、application-prod.yml

![image-20230907202240466](C:\Users\19877\AppData\Roaming\Typora\typora-user-images\image-20230907202240466.png)

切换环境具体操作如下：

第一步：

![image-20230907202339442](C:\Users\19877\AppData\Roaming\Typora\typora-user-images\image-20230907202339442.png)

第二步：

![image-20230907202419276](C:\Users\19877\AppData\Roaming\Typora\typora-user-images\image-20230907202419276.png)

项目需要符合DDD框架，示例如下：

![image-20230907202648397](C:\Users\19877\AppData\Roaming\Typora\typora-user-images\image-20230907202648397.png)



#### SpringBoot注解

- @SpringBootApplication

表明启动类

- @Controller

用于定义控制器类，@Controller加在类上面的注解，使得类里面的每个方法都返回一个试图页面

- RestController

用于定义控制器类，@RestController加在类上面的注解，使得类里面的每个方法都将json/xml返回数据加返回到前台页面中

- @RequestMapping

提供路由信息，负责URL到Controller中的具体函数的映射

- EnableAutoConfiguration

SpringBoot自动配置

- @ComponentScan

表示将该类自动发现扫描组件

- @Service
- @Mapper
- @Import
- @Autowired

[SpringBoot注解最全详解(整合超详细版本)_VV-酱的博客-CSDN博客](https://blog.csdn.net/weixin_40753536/article/details/81285046)

激活jrebel

https://blog.csdn.net/lianghecai52171314/article/details/105637251

### Mybatis

使用free mybatis plugin

- 连接数据库

![image-20230907204450138](C:\Users\19877\AppData\Roaming\Typora\typora-user-images\image-20230907204450138.png)

- 选择要生成的表格，右键出菜单，选择mybatis-generator

![image-20230907204618979](C:\Users\19877\AppData\Roaming\Typora\typora-user-images\image-20230907204618979.png)

- 填写相关信息

![image-20230907204813534](C:\Users\19877\AppData\Roaming\Typora\typora-user-images\image-20230907204813534.png)

- 最后点击ok即可自动生成相关文件

#### mybatis查询

- 一对一查询

```xml
<resultMap id="BaseResultMap" type="com.example.springbootdemo.domain.entity.Student">
    <id column="Sno" jdbcType="VARCHAR" property="sno" />
    <result column="Sname" jdbcType="VARCHAR" property="sname" />
    <result column="Ssex" jdbcType="VARCHAR" property="ssex" />
    <result column="Sbirthday" jdbcType="DATE" property="sbirthday" />
    <result column="Sclass" jdbcType="VARCHAR" property="sclass" />
 </resultMap>

<select id="allStudent"  resultMap="BaseResultMap">
    select
    <include refid="Base_Column_List" />
    from student
  </select>
```

- 一对多查询

相当于建立试图，在原本的实体类中新增加需要的属性，或者新建一个实体类，相当于试图，在写一个resultMap，进行查询

例如学生成绩：

创建新的resultMap：

```xml
<resultMap id="Student_Score" type="com.example.springbootdemo.domain.entity.Student_Score">
    <association property="student" javaType="com.example.springbootdemo.domain.entity.Student">
      <id column="Sno" jdbcType="VARCHAR" property="sno" />
      <result column="Sname" jdbcType="VARCHAR" property="sname" />
      <result column="Ssex" jdbcType="VARCHAR" property="ssex" />
      <result column="Sbirthday" jdbcType="DATE" property="sbirthday" />
      <result column="Sclass" jdbcType="VARCHAR" property="sclass" />
    </association>
    <association property="score" javaType="com.example.springbootdemo.domain.entity.Score">
      <id column="Sno" jdbcType="VARCHAR" property="sno" />
      <id column="Cno" jdbcType="VARCHAR" property="cno" />
      <result column="Degree" jdbcType="DECIMAL" property="degree" />
    </association>
  </resultMap>
```

如果需要的是一个对象，则使用association，如果需要的是集合，则使用collection

查询结果，使用新建的resultMap：

```xml
<select id="getStudent" resultMap="Student_Score">
    select *
    from score left join student on score.sno=student.sno
</select>
```

- 批量插入

使用foreach标签

```xml
<insert id="insertStudentsBranch"  >
	INSERT INTO student(<include refid="Base_Column_List" />)
	VALUES
	<foreach collection ="studentList" item="student" separator ="," >
  	(#{student.sno}, #{student.sname}, #{student.ssex},#{student.sbirthday},#{student.sclass})
	</foreach >
</insert>
```

- 

