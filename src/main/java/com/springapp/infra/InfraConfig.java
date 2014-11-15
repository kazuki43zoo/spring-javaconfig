package com.springapp.infra;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import javax.sql.DataSource;

@Configuration
@MapperScan(value = "com.springapp.domain.repository.todo", sqlSessionFactoryRef = "sqlSessionFactory1")
public class InfraConfig {

    @Bean(name = "sqlSessionFactory1")
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);
        sessionFactory.setConfigLocation(new ClassPathResource("/META-INF/mybatis/mybatis-config.xml"));
        return sessionFactory.getObject();
    }

}
