package io.github.aviatorhub.astrolabe.core;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import io.github.aviatorhub.astrolabe.model.datasource.DataSourceSpec;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.sql.DataSource;

public class DataSourceManager {

  private static final Map<String, DataSource> dataSourceMap = new ConcurrentHashMap<>();

  public static DataSource dataSource(final DataSourceSpec spec) {
    return dataSourceMap.computeIfAbsent(spec.getIdentify(),
        key -> new HikariDataSource(config(spec)));
  }

  private static HikariConfig config(DataSourceSpec spec) {
    HikariConfig config = new HikariConfig();
    config.setJdbcUrl(spec.getAddress());
    config.setUsername(spec.getUser());
    config.setPassword(spec.getPasswd());
    config.setMaximumPoolSize(spec.getMaxPoolSize());
    return config;
  }
}
