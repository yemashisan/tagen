package com.tianjian.web.dao.config;
import java.beans.PropertyVetoException;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.mchange.v2.c3p0.ComboPooledDataSource;


@Configuration
/**

*配置mybatis mapper的扫描路径
*/
/**
 * @program: property-great-unification
 * @description: 扫描路径
 * @Author: liangxiaolei
 * @Date: 2019/5/20 10:12
 */
@MapperScan("com.tianjian.web.dao.*")
public class DataSourceConfiguration {
	@Value("${spring.datasource.driver-class-name}")
	private String jdbcDriver;
	@Value("${spring.datasource.url}")
	private String jdbcUrl;
	@Value("${spring.datasource.username}")
	private String jdbcUsername;
	@Value("${spring.datasource.password}")
	private String jdbcPassword;

	/**
	 * 生成与spring-dao.xml对应的bean dataSource
	 * 
	 * @return
	 * @throws PropertyVetoException
	 */
	@Bean(name = "dataSource")
	public ComboPooledDataSource createDataSource() throws PropertyVetoException {
		// 生成datasource实例
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		// 跟配置文件一样设置以下信息
		// 驱动
		dataSource.setDriverClass(jdbcDriver);
		// 数据库连接URL
		dataSource.setJdbcUrl(jdbcUrl);
		// 设置用户名
		dataSource.setUser(jdbcUsername);
		// 设置用户密码
		dataSource.setPassword(jdbcPassword);
		// 配置c3p0连接池的私有属性
		// 连接池最大线程数
		dataSource.setMaxPoolSize(30);
		// 连接池最小线程数
		dataSource.setMinPoolSize(10);
		// 关闭连接后不自动commit
		dataSource.setAutoCommitOnClose(false);
		// 连接超时时间
		dataSource.setCheckoutTimeout(10000);
		// 连接失败重试次数
		dataSource.setAcquireRetryAttempts(2);
		return dataSource;
	}

}
