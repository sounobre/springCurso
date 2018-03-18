package br.com.SpringApp.SpringApp;

import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;


@Configuration
public class DataConfiguration {

		@Bean
		public DataSource datasource() {
			DriverManagerDataSource datasource = new DriverManagerDataSource();
			datasource.setDriverClassName("com.mysql.jdbc.Driver");
			datasource.setUrl("jdbc:mysql://localhost:3306/eventosapp");
			datasource.setUsername("root");
			datasource.setPassword("123456");
			return datasource;
		}
		
		@Bean
		public JpaVendorAdapter jpaVendorAdapter() {
			HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
			adapter.setDatabase(Database.MYSQL);
			adapter.setShowSql(true);
			adapter.setGenerateDdl(true);
			adapter.setDatabasePlatform("org.hibernate.dialect.MySQLDialect");
			adapter.setPrepareConnection(true);
			return adapter;
		}
}
