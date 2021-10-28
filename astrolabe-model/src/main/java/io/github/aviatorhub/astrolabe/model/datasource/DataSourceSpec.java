package io.github.aviatorhub.astrolabe.model.datasource;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public abstract class DataSourceSpec {

  // 数据源标志符
  private String identify;
  // 数据库连接信息
  private String address;
  private String database;
  private String user;
  private String passwd;
  // 连接池配置
  private Integer maxPoolSize;

  abstract String jdbcUrl();
  abstract String driver();
}
