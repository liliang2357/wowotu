package com.cy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/* 项目运行的入口
 * 1)这样的启动类的一个项目只能有一个
 * 2)此类运行时会启动项目的自动配置并扫描此类所在的包和
 * 3)中的资源然后进行加载(将类存到内存)
 * FAQ 2)如何将这个类交给spring框架进行管理
 * 3)如何跟踪这个类是否被加载了？
 */
@SpringBootApplication
public class Demo1Application {//cgsBoot01Application.class(磁盘)

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}

}
