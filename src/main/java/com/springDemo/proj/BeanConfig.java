/**
 * 
 */
package com.springDemo.proj;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;


/**
 * The Class BeanConfig.
 *
 * @author ARUP
 */
@Configuration
@ComponentScan(basePackages={"com.springDemo.proj"})
public class BeanConfig {

	/**
	 * Data source.
	 *
	 * @return the basic data source
	 */
	@Bean
	public BasicDataSource dataSource(){
		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName("org.postgresql.Driver");
		ds.setUrl("jdbc:postgresql://localhost:5432/postgres");
		ds.setUsername("postgres");
		ds.setPassword("admin");
		ds.setInitialSize(2);
		return ds;
	}
	
	/**
	 * Jdbc template.
	 *
	 * @param dataSource the data source
	 * @return the jdbc template
	 */
	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource){
		return new JdbcTemplate(dataSource);
	}
	
}
