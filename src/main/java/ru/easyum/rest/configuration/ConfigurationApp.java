package ru.easyum.rest.configuration;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.beans.PropertyVetoException;

@Configuration
@ComponentScan(value = "ru.easyum.rest")
@EnableWebMvc
@EnableTransactionManagement
public class ConfigurationApp {

    @Bean
    public ComboPooledDataSource dataSource() {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        try {
            dataSource.setJdbcUrl("jdbc:postgresql://localhost:5432/rest");
            dataSource.setDriverClass("org.postgresql.Driver");
            dataSource.setUser("postgres");
            dataSource.setPassword("Hhhh888*");
        } catch (PropertyVetoException e) {
//            e.setStackTrace();
        }
        return dataSource;
    }
}