package io.github.aviatorhub.astrolabe.model.table;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Database {

  private String name;
  private String comment;
  private List<Table> tableList;
}
