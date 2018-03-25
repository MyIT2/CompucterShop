package com.mycompany.maven777.Config;
import com.mycompany.maven777.mappers.CompucterMappers;
import com.mycompany.maven777.mappers.DeviceMappers;
import com.mycompany.maven777.mappers.LocationMappers;
import com.mycompany.maven777.mappers.PersonalMappers;
import org.apache.commons.dbcp.BasicDataSource; 
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan; 
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.springframework.context.annotation.Bean; 
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
@Configuration
@MapperScan("patch in you mapper directory")
public class DataConfigJava 
{
    @Bean
    public BasicDataSource dataSource()
    {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.jdbs>driver");
        dataSource.setUrl("jdbs:mysql://localhost/test?useUnicode=true&characterEncoding=utf8");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        return dataSource;
    }
    @Bean 
    public DataSourceTransactionManager transactionManager() 
    { 
        return new DataSourceTransactionManager(dataSource()); 
    } 
    @Bean 
    public SqlSessionFactoryBean sqlSessionFactory() throws Exception 
    { 
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean(); 
        sessionFactory.setDataSource(dataSource()); 
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath*:mappers.xml")); 
        return sessionFactory; 
    }
    @Bean
    public MapperFactoryBean<CompucterMappers> CompucterMapper() throws Exception {
        MapperFactoryBean<CompucterMappers> factoryBean = new MapperFactoryBean<>(CompucterMappers.class);
        factoryBean.setSqlSessionFactory((SqlSessionFactory) sqlSessionFactory());
        return factoryBean;
    }
    @Bean
    public MapperFactoryBean<DeviceMappers> DeviceMapper() throws Exception {
        MapperFactoryBean<DeviceMappers> factoryBean = new MapperFactoryBean<>(DeviceMappers.class);
        factoryBean.setSqlSessionFactory((SqlSessionFactory) sqlSessionFactory());
        return factoryBean;
    }
    @Bean
    public MapperFactoryBean<LocationMappers> locationMapper() throws Exception {
        MapperFactoryBean<LocationMappers> factoryBean = new MapperFactoryBean<>(LocationMappers.class);
        factoryBean.setSqlSessionFactory((SqlSessionFactory) sqlSessionFactory());
        return factoryBean;
    }
    @Bean
    public MapperFactoryBean<PersonalMappers> PersonalMapper() throws Exception {
        MapperFactoryBean<PersonalMappers> factoryBean = new MapperFactoryBean<>(PersonalMappers.class);
        factoryBean.setSqlSessionFactory((SqlSessionFactory) sqlSessionFactory());
        return factoryBean;
    }

}
