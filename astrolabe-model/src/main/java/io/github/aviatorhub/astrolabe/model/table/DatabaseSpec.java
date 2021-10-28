package io.github.aviatorhub.astrolabe.model.table;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DatabaseSpec {

  private String name;
  private String comment;
  private List<TableSpec> tableSpecList;
}
