/*
 * Project: credit-dsp-open
 * 
 * File Created at 2016年9月7日
 * 
 * Copyright 2016 CMCC Corporation Limited.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * ZYHY Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license.
 */
package com.test.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/***
 * 
 * @author alex
 *
 */
@Configuration
@PropertySource(value = "application.properties")
public class MyBatisConfig {

//    @Value("${spring.datasource.driver-class-name}")
//    private String driverClass;
//    @Value("${spring.datasource.url}")
//    private String jdbcUrl;
//    @Value("${spring.datasource.username}")
//    private String userName;
//    @Value("${spring.datasource.password}")
//    private String password;
//
//    @Bean
//    public DataSource getDataSource() throws Exception {
//        HikariConfig hikariConfig = new HikariConfig();
//        hikariConfig.setDriverClassName(this.driverClass);
//        hikariConfig.setJdbcUrl(this.jdbcUrl);
//        hikariConfig.setUsername(this.userName);
//        hikariConfig.setPassword(this.password);
//
//        //        hikariConfig.setMaximumPoolSize(5);
//        //        hikariConfig.setConnectionTestQuery("SELECT 1");
//        //        hikariConfig.setPoolName("springHikariCP");
//        //        hikariConfig.addDataSourceProperty("dataSource.cachePrepStmts", "true");
//        //        hikariConfig.addDataSourceProperty("dataSource.prepStmtCacheSize", "250");
//        //        hikariConfig.addDataSourceProperty("dataSource.prepStmtCacheSqlLimit", "2048");
//        //        hikariConfig.addDataSourceProperty("dataSource.useServerPrepStmts", "true");
//
//        HikariDataSource dataSource = new HikariDataSource(hikariConfig);
//        return dataSource;
//    }
//
//    @Bean(name = "sqlSessionFactory")
//    public SqlSessionFactory sqlSessionFactoryBean() throws Exception {
//        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
//        bean.setDataSource(getDataSource());
//        //添加XML目录
//        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
//        try {
//            bean.setConfigLocation(resolver.getResource("classpath:mybatis-config.xml"));
//            bean.setMapperLocations(resolver.getResources("classpath*:sqlMap/*.xml"));
//            return bean.getObject();
//        } catch (Exception e) {
//            e.printStackTrace();
//            throw new RuntimeException(e);
//        }
//    }

}

/**
 * Revision history
 * -------------------------------------------------------------------------
 * 
 * Date Author Note
 * -------------------------------------------------------------------------
 */
