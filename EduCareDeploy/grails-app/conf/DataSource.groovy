dataSource {
	pooled = true
	driverClassName = "com.mysql.jdbc.Driver"
	dialect = "org.hibernate.dialect.MySQL5InnoDBDialect"
	username="root"
	password="mysqlserver123"
}
hibernate {
	cache.use_second_level_cache = true
	cache.use_query_cache = false
	//cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory' // Hibernate 3
	cache.region.factory_class = 'org.hibernate.cache.ehcache.EhCacheRegionFactory' // Hibernate 4
	singleSession = true // configure OSIV singleSession mode
	flush.mode = 'manual' // OSIV session flush mode outside of transactional context
}

// environment specific settings
environments {
	development {
		dataSource {
			dbCreate = "update" // one of 'create', 'create-drop', 'update', 'validate', ''
			url = "jdbc:mysql://localhost:3306/school1?useUnicode=yes&characterEncoding=UTF-8"
			//url = "jdbc:mysql://localhost:3306/rg_prod?useUnicode=yes&characterEncoding=UTF-8"
			//url = "jdbc:mysql://localhost:3306/vidya_prod?useUnicode=yes&characterEncoding=UTF-8"
			username = "root"
			password = "mysql123"//For Rg DB And myschool//POn~!9kTPd]L// dbCreate = "update" // one of 'create', 'create-drop', 'update', 'validate', ''
			//password = "mysqlserver123"//For VidyaShree DB
			// url = "jdbc:h2:mem:devDb;MVCC=TRUE;LOCK_TIMEOUT=10000;DB_CLOSE_ON_EXIT=FALSE"
		}
	}
	test {
		dataSource {
			pooled = true
			driverClassName = "com.mysql.jdbc.Driver"
			dialect = org.hibernate.dialect.MySQL5InnoDBDialect
			dbCreate = "update"
			url = "jdbc:mysql://localhost:3306/MYschool2?useUnicode=yes&characterEncoding=UTF-8"
			//url = "jdbc:mysql://localhost:3306/rg_prod?useUnicode=yes&characterEncoding=UTF-8"
			//url = "jdbc:mysql://localhost:3306/vidya_prod?useUnicode=yes&characterEncoding=UTF-8"
			username = "root"
			password = "mysqlserver123"//for Rg DB And myschool
			//password = "mysqlserver123"//For VidyaShree DB

			properties {
				// See http://grails.org/doc/latest/guide/conf.html#dataSource for documentation
				jmxEnabled = true
				initialSize = 5
				maxActive = 50
				minIdle = 5
				maxIdle = 25
				maxWait = 10000
				maxAge = 10 * 60000
				timeBetweenEvictionRunsMillis = 5000
				minEvictableIdleTimeMillis = 60000
				validationQuery = "SELECT 1"
				validationQueryTimeout = 3
				validationInterval = 15000
				testOnBorrow = true
				testWhileIdle = true
				testOnReturn = false
				jdbcInterceptors = "ConnectionState"
				defaultTransactionIsolation = java.sql.Connection.TRANSACTION_READ_COMMITTED
				dbProperties {
					// Mysql specific driver properties
					// http://dev.mysql.com/doc/connector-j/en/connector-j-reference-configuration-properties.html
					// let Tomcat JDBC Pool handle reconnecting
					autoReconnect=true
					// truncation behaviour
					jdbcCompliantTruncation=false
					// mysql 0-date conversion
					zeroDateTimeBehavior='convertToNull'
					// Tomcat JDBC Pool's StatementCache is used instead, so disable mysql driver's cache
					cachePrepStmts=false
					cacheCallableStmts=false
					// Tomcat JDBC Pool's StatementFinalizer keeps track
					dontTrackOpenResources=true
					// performance optimization: reduce number of SQLExceptions thrown in mysql driver code
					holdResultsOpenOverStatementClose=true
					// enable MySQL query cache - using server prep stmts will disable query caching
					useServerPrepStmts=false
					// metadata caching
					cacheServerConfiguration=true
					cacheResultSetMetadata=true
					metadataCacheSize=100
					// timeouts for TCP/IP
					connectTimeout=15000
					socketTimeout=120000
					// timer tuning (disable)
					maintainTimeStats=false
					enableQueryTimeouts=false
					// misc tuning
					noDatetimeStringSync=true
				}
			}

		}
	}
	production {
		dataSource {
			pooled = true
			dbCreate = "update" // one of 'create', 'create-drop', 'update', 'validate', ''
			//url = "jdbc:mysql://localhost:3306/myschool?useUnicode=yes&characterEncoding=UTF-8"
			url = "jdbc:mysql://db:3306/educare_prod?useUnicode=yes&characterEncoding=UTF-8"
			//url = "jdbc:mysql://localhost:3306/vidya_prod?useUnicode=yes&characterEncoding=UTF-8"
			username = "educare"
			password = "EducareHitpL_2019"//For Rg Db And myschool//"MysqlserverhitpL123"//old:mysql123
			//password = "mysqlserver123"//For VidyaShree DB
			// dbCreate = "update"
			// url = "jdbc:h2:prodDb;MVCC=TRUE;LOCK_TIMEOUT=10000;DB_CLOSE_ON_EXIT=FALSE"
			properties {
				// See http://grails.org/doc/latest/guide/conf.html#dataSource for documentation
				jmxEnabled = true
				initialSize = 5
				maxActive = 50
				minIdle = 5
				maxIdle = 25
				maxWait = 10000
				maxAge = 10 * 60000
				timeBetweenEvictionRunsMillis = 5000
				minEvictableIdleTimeMillis = 60000
				validationQuery = "SELECT 1"
				validationQueryTimeout = 3
				validationInterval = 15000
				testOnBorrow = true
				testWhileIdle = true
				testOnReturn = false
				jdbcInterceptors = "ConnectionState"
				defaultTransactionIsolation = java.sql.Connection.TRANSACTION_READ_COMMITTED
				dbProperties {
					// Mysql specific driver properties
					// http://dev.mysql.com/doc/connector-j/en/connector-j-reference-configuration-properties.html
					// let Tomcat JDBC Pool handle reconnecting
					autoReconnect=true
					// truncation behaviour
					jdbcCompliantTruncation=false
					// mysql 0-date conversion
					zeroDateTimeBehavior='convertToNull'
					// Tomcat JDBC Pool's StatementCache is used instead, so disable mysql driver's cache
					cachePrepStmts=false
					cacheCallableStmts=false
					// Tomcat JDBC Pool's StatementFinalizer keeps track
					dontTrackOpenResources=true
					// performance optimization: reduce number of SQLExceptions thrown in mysql driver code
					holdResultsOpenOverStatementClose=true
					// enable MySQL query cache - using server prep stmts will disable query caching
					useServerPrepStmts=false
					// metadata caching
					cacheServerConfiguration=true
					cacheResultSetMetadata=true
					metadataCacheSize=100
					// timeouts for TCP/IP
					connectTimeout=15000
					socketTimeout=120000
					// timer tuning (disable)
					maintainTimeStats=false
					enableQueryTimeouts=false
					// misc tuning
					noDatetimeStringSync=true
				}
			}
		}
	}
}
