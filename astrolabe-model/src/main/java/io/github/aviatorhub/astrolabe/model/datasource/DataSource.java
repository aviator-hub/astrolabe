package io.github.aviatorhub.astrolabe.model.datasource;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class DataSource {

  private String identify;
  private String address;
  private String user;
  private String passwd;
  private Integer coreConn;
  private Integer maxConn;
}
