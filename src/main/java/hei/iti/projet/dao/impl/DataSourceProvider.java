package hei.iti.projet.dao.impl;

import javax.sql.DataSource;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class DataSourceProvider {

	
	private static MysqlDataSource dataSource;

	public static DataSource getDataSource() {
		if (dataSource == null) {
			dataSource = new MysqlDataSource();
			dataSource.setServerName("localhost");
			dataSource.setPort(3306);
			dataSource.setDatabaseName("eauquigerme");
			dataSource.setUser("root");
			dataSource.setPassword("");
			/*dataSource.setServerName(System.getenv("OPENSHIFT_MYSQL_DB_HOST"));
			dataSource.setPort(3306);
			dataSource.setDatabaseName("paroletenue");
			dataSource.setUser(System.getenv("OPENSHIFT_MYSQL_DB_USERNAME"));
			dataSource.setPassword(System.getenv("OPENSHIFT_MYSQL_DB_PASSWORD"));*/
		}
		return dataSource;
	}
	
	
	
}