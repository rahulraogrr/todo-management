package net.guides.todo.core.db.dialect;

import java.sql.Types;
import org.hibernate.dialect.PostgreSQL95Dialect;

public class CustomPostgreSQLDialect extends PostgreSQL95Dialect {
	
	public CustomPostgreSQLDialect() {
		super();
		this.registerColumnType(Types.JAVA_OBJECT, "jsonb");
	}
	
}